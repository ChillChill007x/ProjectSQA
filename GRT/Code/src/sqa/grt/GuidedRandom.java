package sqa.grt;

import sqa.support.SqaJson;
import java.io.*;
import java.lang.reflect.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.stream.*;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.tree.*;
import org.jacoco.core.analysis.*;
import org.jacoco.core.data.*;

/** Team implementation of the six mechanisms in Ma et al., ASE 2015.
 * This is not the authors' binary. See GRT/README.md for bounded analysis choices.
 * Pools contain replayable sequences, never objects reused across test cases.
 */
public final class GuidedRandom {
  static final Object UNKNOWN = new Object();
  final Random rng;
  final Class<?> target;
  final Path output, classRoot;
  final int maxTests, maxLength, poolLimit, depthLimit, callTimeout;
  final double pConst, sigma, alpha, decay;
  final long startedAt, deadline, coverageInterval;
  final List<Executable> methods = new ArrayList<>();
  final List<Seq> mainPool = new ArrayList<>(), secondaryPool = new ArrayList<>();
  final Map<String,Map<Object,Integer>> constants = new TreeMap<>();
  final Map<Object,Double> globalWeights = new LinkedHashMap<>();
  final Map<String,Boolean> purity = new HashMap<>();
  final Map<Class<?>,List<Executable>> factoryCache = new HashMap<>();
  final Map<Executable,Integer> successes = new LinkedHashMap<>(), selections = new LinkedHashMap<>();
  final Map<Executable,Double> weights = new LinkedHashMap<>(), initialWeights = new LinkedHashMap<>();
  final Map<String,Double> uncovered = new HashMap<>();
  final List<Map<String,Object>> weightLog = new ArrayList<>();
  final List<String> tests = new ArrayList<>();
  final Set<String> emitted = new HashSet<>(), sequenceKeys = new HashSet<>();
  final Map<String,Integer> counters = new TreeMap<>();
  final ExecutorService executor = Executors.newSingleThreadExecutor(r -> { Thread t=new Thread(r);t.setDaemon(true);return t; });
  long lastCoverage;
  boolean invocationTimedOut;

  static final class Step {
    final Executable op; final Object literal; final int[] inputs;
    Step(Object literal) { this.op=null;this.literal=literal;this.inputs=new int[0]; }
    Step(Executable op,int[] inputs) { this.op=op;this.inputs=inputs;this.literal=null; }
  }
  static final class Seq {
    final List<Step> steps = new ArrayList<>();
    int result; Class<?> runtimeType;
    long nanos=1; int uses=1;
    int calls() { return (int)steps.stream().filter(s->s.op!=null).count(); }
  }
  static final class Outcome {
    Object value; Throwable exception; long nanos;
  }

  GuidedRandom(Map<String,Object> cfg) throws Exception {
    rng=new Random(((Number)cfg.get("seed")).longValue());
    target=Class.forName((String)cfg.get("target"),false,getClass().getClassLoader());
    output=Path.of((String)cfg.get("output"));classRoot=Path.of((String)cfg.get("class_root"));
    maxTests=num(cfg,"max_tests",100);maxLength=num(cfg,"max_sequence_length",40);
    poolLimit=num(cfg,"pool_limit",1000);depthLimit=num(cfg,"detective_depth",3);
    callTimeout=num(cfg,"invocation_timeout_ms",1000);
    pConst=decimal(cfg,"p_const",.01);sigma=decimal(cfg,"sigma",30);
    alpha=decimal(cfg,"alpha",.9);decay=decimal(cfg,"p",.99);
    coverageInterval=(long)(decimal(cfg,"coverage_interval_seconds",50)*1e9);
    startedAt=System.nanoTime();deadline=startedAt+(long)(decimal(cfg,"budget_seconds",60)*1e9);
    if (!visible(target)) throw new IllegalArgumentException("Target must be publicly accessible: "+target);
    for (Constructor<?> c:target.getConstructors()) if (!Modifier.isAbstract(target.getModifiers())) methods.add(c);
    for (Method m:target.getMethods()) if (m.getDeclaringClass()!=Object.class && !m.isBridge() && !m.isSynthetic()) methods.add(m);
    methods.removeIf(m->!usable(m)); methods.sort(Comparator.comparing(GuidedRandom::key));
    if(methods.isEmpty()) throw new IllegalArgumentException("No supported public methods or constructors");
  }
  static int num(Map<String,Object> c,String k,int d){return ((Number)c.getOrDefault(k,d)).intValue();}
  static double decimal(Map<String,Object> c,String k,double d){return ((Number)c.getOrDefault(k,d)).doubleValue();}
  void count(String k){counters.merge(k,1,Integer::sum);}
  static boolean visible(Class<?> t){return t.isPrimitive() || t.isArray() && visible(t.getComponentType()) || t.getCanonicalName()!=null && Modifier.isPublic(t.getModifiers()) && (t.getEnclosingClass()==null || visible(t.getEnclosingClass()));}
  static boolean usable(Executable e){return visible(e.getDeclaringClass()) && Arrays.stream(e.getParameterTypes()).allMatch(GuidedRandom::visible) && !(e instanceof Method && !visible(((Method)e).getReturnType()));}
  static String key(Executable e){return e.getDeclaringClass().getName()+"#"+(e instanceof Method?e.getName()+org.objectweb.asm.Type.getMethodDescriptor((Method)e):"<init>"+org.objectweb.asm.Type.getConstructorDescriptor((Constructor<?>)e));}

  // Constant mining: occurrence counts are retained. Straight-line folding/propagation is
  // conservative: stack/local knowledge is discarded at control-flow joins and unknown effects.
  void mineConstants() throws IOException {
    try(Stream<Path> paths=Files.walk(classRoot)) {
      for(Path p:paths.filter(x->x.toString().endsWith(".class")).sorted().collect(Collectors.toList())) {
        ClassNode node=new ClassNode();
        try {new ClassReader(Files.readAllBytes(p)).accept(node,ClassReader.SKIP_DEBUG|ClassReader.SKIP_FRAMES);}
        catch(RuntimeException ex){count("unreadable_classes");continue;}
        Map<Object,Integer> values=new LinkedHashMap<>();
        for(FieldNode f:node.fields) addConstant(values,f.value);
        for(MethodNode m:node.methods) {
          List<Object> stack=new ArrayList<>();Map<Integer,Object> locals=new HashMap<>();
          for(AbstractInsnNode i:m.instructions) {
            int op=i.getOpcode();Object val=UNKNOWN;
            if(i instanceof LabelNode || i instanceof JumpInsnNode || i instanceof LookupSwitchInsnNode || i instanceof TableSwitchInsnNode){stack.clear();locals.clear();continue;}
            if(op<0)continue;
            if(i instanceof LdcInsnNode) val=((LdcInsnNode)i).cst;
            else if(op>=Opcodes.ICONST_M1 && op<=Opcodes.ICONST_5) val=op-Opcodes.ICONST_0;
            else if(op>=Opcodes.LCONST_0 && op<=Opcodes.LCONST_1) val=(long)(op-Opcodes.LCONST_0);
            else if(op>=Opcodes.FCONST_0 && op<=Opcodes.FCONST_2) val=(float)(op-Opcodes.FCONST_0);
            else if(op>=Opcodes.DCONST_0 && op<=Opcodes.DCONST_1) val=(double)(op-Opcodes.DCONST_0);
            else if(op==Opcodes.BIPUSH || op==Opcodes.SIPUSH) val=((IntInsnNode)i).operand;
            else if(i instanceof VarInsnNode) {
              int index=((VarInsnNode)i).var;
              if(op>=Opcodes.ILOAD && op<=Opcodes.ALOAD) stack.add(locals.getOrDefault(index,UNKNOWN));
              else if(op>=Opcodes.ISTORE && op<=Opcodes.ASTORE)locals.put(index,pop(stack));
              else stack.clear();
              continue;
            } else if(op>=Opcodes.IADD && op<=Opcodes.DREM) {
              Object b=pop(stack),a=pop(stack);val=fold(op,a,b);
            } else if(op==Opcodes.DUP){stack.add(stack.isEmpty()?UNKNOWN:stack.get(stack.size()-1));continue;}
            else {stack.clear();continue;}
            stack.add(val); addConstant(values,val);
          }
        }
        constants.put(node.name.replace('/','.'),values);
      }
    }
    Map<Object,Integer> tf=new LinkedHashMap<>(),df=new LinkedHashMap<>();
    for(Map<Object,Integer> row:constants.values()) for(Map.Entry<Object,Integer> e:row.entrySet()) {tf.merge(e.getKey(),e.getValue(),Integer::sum);df.merge(e.getKey(),1,Integer::sum);}
    double d=constants.size();
    for(Object v:tf.keySet())globalWeights.put(v,tf.get(v)*Math.log((d+1)/(d+1-df.get(v))));
    counters.put("mined_distinct_constants",tf.size());
  }
  static Object pop(List<Object>s){return s.isEmpty()?UNKNOWN:s.remove(s.size()-1);}
  static void addConstant(Map<Object,Integer> m,Object v){if(v instanceof Number || v instanceof String || v instanceof Character || v instanceof Boolean)m.merge(v,1,Integer::sum);}
  static Object fold(int op,Object a,Object b){
    if(!(a instanceof Number) || !(b instanceof Number))return UNKNOWN;
    Number x=(Number)a,y=(Number)b;int type=(op-Opcodes.IADD)%4,operation=(op-Opcodes.IADD)/4;
    try {
      if(type==0){int u=x.intValue(),v=y.intValue();switch(operation){case 0:return u+v;case 1:return u-v;case 2:return u*v;case 3:return u/v;case 4:return u%v;}}
      if(type==1){long u=x.longValue(),v=y.longValue();switch(operation){case 0:return u+v;case 1:return u-v;case 2:return u*v;case 3:return u/v;case 4:return u%v;}}
      double u=x.doubleValue(),v=y.doubleValue(),z;switch(operation){case 0:z=u+v;break;case 1:z=u-v;break;case 2:z=u*v;break;case 3:z=u/v;break;case 4:z=u%v;break;default:return UNKNOWN;}
      if(type==2)return (float)z;return z;
    }catch(ArithmeticException ex){return UNKNOWN;}
  }

  // Purity: bytecode field/array writes, monitors and native/unknown callees are impure.
  // This conservative recursive analysis replaces ReImInfer, not its implementation.
  boolean pure(Method m){return pureKey(m.getDeclaringClass(),m.getName(),org.objectweb.asm.Type.getMethodDescriptor(m),new HashSet<>());}
  boolean pureKey(Class<?> owner,String name,String desc,Set<String> seen){
    String id=owner.getName()+"#"+name+desc;if(purity.containsKey(id))return purity.get(id);
    if(!seen.add(id))return false;
    boolean result=true;
    try(InputStream in=owner.getResourceAsStream("/"+owner.getName().replace('.','/')+".class")){
      if(in==null)return false;ClassNode node=new ClassNode();new ClassReader(in).accept(node,ClassReader.SKIP_DEBUG|ClassReader.SKIP_FRAMES);
      MethodNode method=node.methods.stream().filter(x->x.name.equals(name)&&x.desc.equals(desc)).findFirst().orElse(null);
      if(method==null || (method.access&(Opcodes.ACC_NATIVE|Opcodes.ACC_ABSTRACT))!=0)return false;
      for(AbstractInsnNode i:method.instructions){
        int op=i.getOpcode();
        if(op==Opcodes.PUTFIELD || op==Opcodes.PUTSTATIC || op>=Opcodes.IASTORE && op<=Opcodes.SASTORE || op==Opcodes.MONITORENTER || i instanceof InvokeDynamicInsnNode){result=false;break;}
        if(i instanceof MethodInsnNode){MethodInsnNode call=(MethodInsnNode)i;
          Class<?> c=Class.forName(call.owner.replace('/','.'),false,owner.getClassLoader());
          if(!pureKey(c,call.name,call.desc,seen)){result=false;break;}
        }
      }
    }catch(Throwable ex){result=false;}
    seen.remove(id);purity.put(id,result);return result;
  }

  static Class<?> boxed(Class<?> t){
    if(!t.isPrimitive())return t;
    if(t==int.class)return Integer.class;if(t==long.class)return Long.class;if(t==short.class)return Short.class;
    if(t==byte.class)return Byte.class;if(t==char.class)return Character.class;if(t==float.class)return Float.class;
    if(t==double.class)return Double.class;if(t==boolean.class)return Boolean.class;return Void.class;
  }
  static boolean scalar(Class<?> t){return t.isPrimitive() || t==String.class || t==Boolean.class || t==Character.class || Number.class.isAssignableFrom(t);}
  Object coerce(Object value,Class<?> type){
    Class<?> t=boxed(type);
    if(t.isInstance(value))return value;
    if(value instanceof Number){Number n=(Number)value;
      if(t==Integer.class)return n.intValue();if(t==Long.class)return n.longValue();if(t==Short.class)return n.shortValue();
      if(t==Byte.class)return n.byteValue();if(t==Double.class)return n.doubleValue();if(t==Float.class)return n.floatValue();if(t==Character.class)return (char)n.intValue();}
    return UNKNOWN;
  }
  Seq literal(Class<?> type,Class<?> context){
    List<Object> choices=new ArrayList<>();List<Double> weights=new ArrayList<>();
    boolean local=rng.nextDouble()<pConst;
    if(local){for(Object v:constants.getOrDefault(context.getName(),Collections.emptyMap()).keySet()){Object c=coerce(v,type);if(c!=UNKNOWN){choices.add(c);weights.add(1.0);}}count("local_constant_selections");}
    if(choices.isEmpty())for(Map.Entry<Object,Double> e:globalWeights.entrySet()){Object c=coerce(e.getKey(),type);if(c!=UNKNOWN){choices.add(c);weights.add(e.getValue());}}
    Object value;
    if(!choices.isEmpty())value=choices.get(weighted(weights));
    else if(type==String.class)value="";
    else if(boxed(type)==Boolean.class)value=rng.nextBoolean();
    else {value=coerce(rng.nextInt(5)-2,type);if(value==UNKNOWN)return null;}
    if(value instanceof Number && rng.nextBoolean()){
      double v=((Number)value).doubleValue()+rng.nextGaussian()*sigma;
      value=coerce(v,type);count("primitive_fuzz");
    }else if(value instanceof String && rng.nextBoolean()){
      String s=(String)value;int pos=rng.nextInt(s.length()+1),which=rng.nextInt(4);char c=(char)(32+rng.nextInt(95));
      if(which==0 || s.isEmpty())value=s.substring(0,pos)+c+s.substring(pos);
      else if(which==1){pos=Math.min(pos,s.length()-1);value=s.substring(0,pos)+s.substring(pos+1);}
      else if(which==2){pos=Math.min(pos,s.length()-1);value=s.substring(0,pos)+c+s.substring(pos+1);}
      else value=s.substring(0,pos);count("string_fuzz");
    }
    Seq seq=new Seq();seq.steps.add(new Step(value));seq.result=0;seq.runtimeType=value==null?type:value.getClass();return seq;
  }
  int weighted(List<Double> weights){
    double total=weights.stream().mapToDouble(Double::doubleValue).sum();
    if(!(total>0)||!Double.isFinite(total))return rng.nextInt(weights.size());
    double draw=rng.nextDouble()*total;
    for(int i=0;i<weights.size();i++){draw-=weights.get(i);if(draw<=0)return i;}return weights.size()-1;
  }
  Seq chooseSequence(List<Seq> candidates){
    List<Double> ws=new ArrayList<>();for(Seq s:candidates)ws.add(1.0/(Math.max(s.nanos,1)*Math.sqrt(Math.max(s.calls(),1))));
    Seq picked=candidates.get(weighted(ws));picked.uses++;count("orienteering_selections");return picked;
  }
  List<Seq> matching(Class<?> type,List<Seq> pool){return pool.stream().filter(s->s.runtimeType!=null && boxed(type).isAssignableFrom(s.runtimeType)).collect(Collectors.toList());}
  Seq input(Class<?> type,Class<?> context,int depth,Set<Class<?>> creating,boolean allowFuzz) throws Exception {
    if(scalar(type))return literal(type,context);
    if(type.isArray()) {
      int n=rng.nextInt(4);Object array=Array.newInstance(type.getComponentType(),n);
      if(scalar(type.getComponentType()))for(int i=0;i<n;i++){
        Seq v=literal(type.getComponentType(),context);if(v!=null)Array.set(array,i,v.steps.get(0).literal);
      }
      Seq s=new Seq();s.steps.add(new Step(array));s.result=0;s.runtimeType=type;return s;
    }
    List<Seq> candidates=matching(type,mainPool);candidates.addAll(matching(type,secondaryPool));
    Seq selected=candidates.isEmpty()?detective(type,context,depth,creating):chooseSequence(candidates);
    if(selected!=null && allowFuzz && rng.nextDouble()<.2){Seq fuzzed=fuzzObject(selected,type,depth,creating);if(fuzzed!=null)return fuzzed;}
    if(selected==null && !type.isPrimitive() && rng.nextDouble()<.05){Seq s=new Seq();s.steps.add(new Step((Object)null));s.result=0;s.runtimeType=type;return s;}
    return selected;
  }
  // Detective executes constructor/factory sequences in a secondary pool on demand;
  // only type-compatible successful results are promoted to the main pool.
  Seq detective(Class<?> type,Class<?> context,int depth,Set<Class<?>> creating) throws Exception {
    if(depth>depthLimit || !creating.add(type) || expired())return null;
    try {
      if(type.isEnum()){Object[] values=type.getEnumConstants();if(values.length>0){Seq s=new Seq();s.steps.add(new Step(values[rng.nextInt(values.length)]));s.result=0;s.runtimeType=type;return s;}}
      List<Executable> factories=new ArrayList<>(factoryCache.computeIfAbsent(type,t->{
        List<Executable> found=new ArrayList<>();Set<Class<?>> sources=new LinkedHashSet<>(Arrays.asList(t,context,target));
        List<String> names=new ArrayList<>(constants.keySet());
        names.addAll(Arrays.asList("java.util.ArrayList","java.util.HashMap","java.util.HashSet","java.util.TreeMap","java.util.TreeSet","java.io.ByteArrayInputStream","java.io.ByteArrayOutputStream","java.io.StringReader","java.io.StringWriter"));
        for(String name:names)try{Class<?> c=Class.forName(name,false,target.getClassLoader());if(visible(c))sources.add(c);}catch(LinkageError|ClassNotFoundException ignored){}
        for(Class<?> source:sources){
          if(t.isAssignableFrom(source) && !source.isInterface() && !Modifier.isAbstract(source.getModifiers()))Collections.addAll(found,source.getConstructors());
          for(Method m:source.getMethods())if(Modifier.isStatic(m.getModifiers()) && t.isAssignableFrom(m.getReturnType()))found.add(m);
        }
        found.removeIf(f->!usable(f));found.sort(Comparator.comparing(GuidedRandom::key));return found;
      }));
      Collections.shuffle(factories,rng);
      for(Executable f:factories){
        Seq seq=compose(f,null,depth+1,creating,false);if(seq==null)continue;
        Outcome o=execute(seq);if(o.exception==null && o.value!=null && type.isInstance(o.value)){
          seq.runtimeType=o.value.getClass();seq.nanos=o.nanos;addPool(secondaryPool,seq);addPool(mainPool,seq);count("detective_objects");return seq;}
        if(invocationTimedOut)return null;
      }
      count("unresolved_inputs");return null;
    } finally{creating.remove(type);}
  }
  Seq fuzzObject(Seq base,Class<?> type,int depth,Set<Class<?>> creating) throws Exception {
    if(depth>=depthLimit)return null;
    List<Method> mutators=Arrays.stream(type.getMethods()).filter(m->m.getDeclaringClass()!=Object.class && !Modifier.isStatic(m.getModifiers()) && usable(m) && !pure(m)).sorted(Comparator.comparing(GuidedRandom::key)).collect(Collectors.toList());
    if(mutators.isEmpty())return null;Collections.shuffle(mutators,rng);
    for(Method m:mutators){Seq seq=compose(m,base,depth+1,creating,false);if(seq==null)continue;
      // Keep the mutated receiver as the sequence output, not the mutator's return value.
      seq.result=base.result;
      Outcome o=execute(seq);if(o.exception==null && o.value!=null){seq.runtimeType=o.value.getClass();seq.nanos=o.nanos;count("object_fuzz");return seq;}
      if(invocationTimedOut)return null;
    }return null;
  }
  static int append(Seq into,Seq from){int offset=into.steps.size();for(Step s:from.steps){if(s.op==null)into.steps.add(new Step(s.literal));else into.steps.add(new Step(s.op,Arrays.stream(s.inputs).map(x->x+offset).toArray()));}return from.result+offset;}
  Seq compose(Executable op,Seq receiver,int depth,Set<Class<?>> creating,boolean fuzz) throws Exception {
    Seq seq=new Seq();List<Integer> args=new ArrayList<>();
    if(op instanceof Method && !Modifier.isStatic(op.getModifiers())){
      Seq recv=receiver!=null?receiver:input(op.getDeclaringClass(),op.getDeclaringClass(),depth,creating,fuzz);
      if(recv==null)return null;args.add(append(seq,recv));
    }
    for(Class<?> type:op.getParameterTypes()){
      Seq arg=input(type,op.getDeclaringClass(),depth,creating,fuzz);if(arg==null)return null;args.add(append(seq,arg));
      if(seq.steps.size()>=maxLength)return null;
    }
    seq.steps.add(new Step(op,args.stream().mapToInt(Integer::intValue).toArray()));seq.result=seq.steps.size()-1;
    return seq.steps.size()<=maxLength?seq:null;
  }
  Outcome execute(Seq seq) throws Exception {
    Future<Outcome> future=executor.submit(()->{
      Outcome o=new Outcome();long start=System.nanoTime();List<Object> values=new ArrayList<>();
      try{for(Step step:seq.steps){
        if(step.op==null){values.add(step.literal);continue;}
        Object receiver=null;int offset=0;
        if(step.op instanceof Method && !Modifier.isStatic(step.op.getModifiers())){receiver=values.get(step.inputs[0]);offset=1;}
        Object[] args=new Object[step.inputs.length-offset];for(int i=0;i<args.length;i++)args[i]=values.get(step.inputs[i+offset]);
        values.add(step.op instanceof Method?((Method)step.op).invoke(receiver,args):((Constructor<?>)step.op).newInstance(args));
      }o.value=values.get(seq.result);}catch(InvocationTargetException ex){o.exception=ex.getCause();}catch(Throwable ex){o.exception=ex;}
      o.nanos=Math.max(System.nanoTime()-start,1);return o;
    });
    try{Outcome o=future.get(callTimeout,TimeUnit.MILLISECONDS);seq.nanos+=o.nanos;return o;}
    catch(TimeoutException ex){future.cancel(true);invocationTimedOut=true;count("invocation_timeouts");Outcome o=new Outcome();o.exception=ex;return o;}
  }
  void addPool(List<Seq> pool,Seq seq){
    if(seq.runtimeType==null)return;
    String fingerprint=code(seq)+"#"+seq.result;
    if(pool==mainPool && !sequenceKeys.add(fingerprint))return;
    if(pool.size()>=poolLimit)pool.remove(rng.nextInt(pool.size()));pool.add(seq);
  }
  boolean expired(){return System.nanoTime()>=deadline || invocationTimedOut;}
  void updateCoverage(boolean force) throws Exception {
    if(!force && System.nanoTime()-lastCoverage<coverageInterval)return;
    byte[] bytes=org.jacoco.agent.rt.RT.getAgent().getExecutionData(false);
    ExecutionDataStore data=new ExecutionDataStore();ExecutionDataReader reader=new ExecutionDataReader(new ByteArrayInputStream(bytes));
    reader.setExecutionDataVisitor(data);reader.setSessionInfoVisitor(x->{});while(reader.read()){}
    CoverageBuilder builder=new CoverageBuilder();Analyzer analyzer=new Analyzer(data,builder);
    Set<Class<?>> owners=methods.stream().map(Executable::getDeclaringClass).collect(Collectors.toCollection(LinkedHashSet::new));
    for(Class<?> owner:owners)try(InputStream in=owner.getResourceAsStream("/"+owner.getName().replace('.','/')+".class")){if(in!=null)analyzer.analyzeClass(in,owner.getName());}
    for(IClassCoverage c:builder.getClasses())for(IMethodCoverage m:c.getMethods()){
      ICounter b=m.getBranchCounter();uncovered.put(c.getName().replace('/','.')+"#"+m.getName()+m.getDesc(),b.getTotalCount()==0?0.0:b.getMissedRatio());
    }
    int max=successes.values().stream().mapToInt(Integer::intValue).max().orElse(0);
    Map<String,Object> snapshot=new LinkedHashMap<>();snapshot.put("elapsed_ns",System.nanoTime()-startedAt);
    Map<String,Object> details=new LinkedHashMap<>();
    for(Executable m:methods){
      double u=uncovered.getOrDefault(key(m),1.0),s=max==0?0:(double)successes.getOrDefault(m,0)/max;
      double w=alpha*u+(1-alpha)*(1-s);initialWeights.put(m,w);weights.put(m,w);selections.put(m,0);
      Map<String,Object> d=new LinkedHashMap<>();d.put("uncovered_branch_ratio",u);d.put("successful_invocations",successes.getOrDefault(m,0));d.put("weight",w);details.put(key(m),d);
    }
    snapshot.put("methods",details);weightLog.add(snapshot);lastCoverage=System.nanoTime();count("coverage_updates");
  }
  Executable selectMethod(){
    List<Double> ws=methods.stream().map(m->weights.getOrDefault(m,1.0)).collect(Collectors.toList());Executable m=methods.get(weighted(ws));
    int k=selections.merge(m,1,Integer::sum);
    double factor=Math.max((-3/Math.log(1-decay))*Math.pow(decay,k)/k,1/Math.log(methods.size()+3));
    weights.put(m,factor*initialWeights.getOrDefault(m,1.0));count("bloodhound_selections");return m;
  }
  static String typeName(Class<?> t){return t.getCanonicalName();}
  static String argument(Class<?> t,int index){return "(("+typeName(boxed(t))+")v"+index+")";}
  static String literalCode(Object v){
    if(v==null)return "null";if(v instanceof String)return SqaJson.quote((String)v);
    if(v.getClass().isArray()){
      List<String> values=new ArrayList<>();for(int i=0;i<Array.getLength(v);i++)values.add(literalCode(Array.get(v,i)));
      return "new "+typeName(v.getClass().getComponentType())+"[]{"+String.join(",",values)+"}";
    }
    if(v instanceof Character)return "Character.valueOf((char)"+(int)(Character)v+")";
    if(v instanceof Byte)return "Byte.valueOf((byte)"+v+")";if(v instanceof Short)return "Short.valueOf((short)"+v+")";
    if(v instanceof Long)return v+"L";
    if(v instanceof Float){float f=(Float)v;if(Float.isNaN(f))return "Float.NaN";if(Float.isInfinite(f))return f>0?"Float.POSITIVE_INFINITY":"Float.NEGATIVE_INFINITY";return v+"F";}
    if(v instanceof Double){double d=(Double)v;if(Double.isNaN(d))return "Double.NaN";if(Double.isInfinite(d))return d>0?"Double.POSITIVE_INFINITY":"Double.NEGATIVE_INFINITY";return v+"D";}
    if(v instanceof Enum<?>)return typeName(((Enum<?>)v).getDeclaringClass())+"."+((Enum<?>)v).name();
    if(v instanceof Class<?> && visible((Class<?>)v))return typeName((Class<?>)v)+".class";
    return String.valueOf(v);
  }
  static String code(Seq seq){
    StringBuilder out=new StringBuilder();
    for(int i=0;i<seq.steps.size();i++){
      Step s=seq.steps.get(i);String expr;
      if(s.op==null)expr=literalCode(s.literal);
      else {
        Executable op=s.op;int offset=0;String prefix;
        if(op instanceof Constructor<?>)prefix="new "+typeName(op.getDeclaringClass());
        else if(Modifier.isStatic(op.getModifiers()))prefix=typeName(op.getDeclaringClass())+"."+op.getName();
        else {prefix=argument(op.getDeclaringClass(),s.inputs[0])+"."+op.getName();offset=1;}
        List<String> args=new ArrayList<>();Class<?>[] types=op.getParameterTypes();for(int j=0;j<types.length;j++)args.add(argument(types[j],s.inputs[j+offset]));
        expr=prefix+"("+String.join(",",args)+")";
        if(op instanceof Method && ((Method)op).getReturnType()==void.class){out.append("    ").append(expr).append(";\n    Object v").append(i).append(" = null;\n");continue;}
      }
      out.append("    Object v").append(i).append(" = ").append(expr).append(";\n");
    }return out.toString();
  }
  void emit(Seq seq,Outcome result){
    if(tests.size()>=maxTests)return;
    String body=code(seq),assertion="";
    if(result.exception!=null){
      Throwable ex=result.exception;
      if(!(ex instanceof Exception) || ex instanceof ReflectiveOperationException || ex instanceof TimeoutException || !visible(ex.getClass()))return;
      body="    try {\n"+body+"      org.junit.Assert.fail(\"Expected "+ex.getClass().getName()+"\");\n    } catch ("+typeName(ex.getClass())+" expected) { }\n";
    } else {
      Object v=result.value;
      if(v==null)assertion="    org.junit.Assert.assertNull(v"+seq.result+");\n";
      else if(v instanceof String || v instanceof Number || v instanceof Boolean || v instanceof Character || v instanceof Enum<?>){
        if(!(v instanceof String) || ((String)v).length()<=1000)assertion="    org.junit.Assert.assertEquals((Object)("+literalCode(v)+"), v"+seq.result+");\n";
      }else assertion="    org.junit.Assert.assertNotNull(v"+seq.result+");\n";
      body+=assertion;
    }
    if(!emitted.add(body))return;
    tests.add("  @org.junit.Test(timeout = 4000)\n  public void test"+tests.size()+"() throws Throwable {\n"+body+"  }\n");
  }
  void generate() throws Exception {
    Files.createDirectories(output);mineConstants();updateCoverage(true);
    while(!expired() && tests.size()<maxTests){
      updateCoverage(false);Executable m=selectMethod();Seq seq=compose(m,null,0,new HashSet<>(),true);
      if(seq==null){count("skipped_no_input");continue;}
      Outcome first=execute(seq);if(invocationTimedOut)break;
      if(first.exception==null){successes.merge(m,1,Integer::sum);
        if(first.value!=null){seq.runtimeType=first.value.getClass();count("runtime_type_observations");addPool(mainPool,seq);}
      }
      // A repeated execution must agree before a regression oracle is emitted.
      Outcome second=execute(seq);if(invocationTimedOut)break;
      if(consistent(first,second))emit(seq,first);else count("unstable_sequences");
    }
    updateCoverage(true);executor.shutdownNow();
    String pkg=target.getPackageName();Path dest=output.resolve(pkg.replace('.',File.separatorChar));Files.createDirectories(dest);
    Files.writeString(dest.resolve("SqaGeneratedTest.java"),(pkg.isEmpty()?"":"package "+pkg+";\n")+"public class SqaGeneratedTest {\n"+String.join("\n",tests)+"}\n",StandardCharsets.UTF_8);
    Map<String,Object> manifest=new LinkedHashMap<>();manifest.put("implementation","team-grt-2.0");manifest.put("generated_tests",tests.size());manifest.put("counters",counters);manifest.put("invocation_timeout",invocationTimedOut);manifest.put("main_pool_size",mainPool.size());manifest.put("secondary_pool_size",secondaryPool.size());manifest.put("bloodhound_updates",weightLog);
    Files.writeString(output.resolve("generation.json"),SqaJson.write(manifest));
  }
  static boolean consistent(Outcome a,Outcome b){
    if(a.exception!=null || b.exception!=null)return a.exception!=null && b.exception!=null && a.exception.getClass()==b.exception.getClass();
    if(a.value==null || b.value==null)return a.value==b.value;
    if(scalar(a.value.getClass()) || a.value instanceof Enum<?>)return a.value.equals(b.value);
    return a.value.getClass()==b.value.getClass();
  }
  @SuppressWarnings("unchecked") public static void main(String[] args) throws Exception {
    if(args.length!=1)throw new IllegalArgumentException("Usage: GuidedRandom run-config.json");
    Map<String,Object> cfg=SqaJson.readFlat(Files.readString(Path.of(args[0])));
    GuidedRandom generator=new GuidedRandom(cfg);
    try{generator.generate();}finally{generator.executor.shutdownNow();}
  }
}
