package sqa.grt;

import java.net.URLClassLoader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.function.BiFunction;
import javax.tools.ToolProvider;

/** Compile and execute overload calls, including Chart's mixed primitive/reference case. */
public final class ArgumentEmissionCheck {
  public static void verify(BiFunction<Class<?>, Integer, String> argument) throws Exception {
    Class<?>[] primitive = {boolean.class, byte.class, short.class, char.class,
        int.class, long.class, float.class, double.class};
    Class<?>[] wrapper = {Boolean.class, Byte.class, Short.class, Character.class,
        Integer.class, Long.class, Float.class, Double.class};
    String[] values = {"true", "(byte)1", "(short)2", "'x'", "3", "4L", "5F", "6D"};
    StringBuilder source = new StringBuilder("public class OverloadProbe {\n");
    StringBuilder body = new StringBuilder("public static void check() { Object v0=1;\n");
    for (int i=0; i<primitive.length; i++) {
      source.append("static int pick").append(i).append("(int n, ")
          .append(primitive[i].getName()).append(" value) { return 1; }\n");
      source.append("static int pick").append(i).append("(int n, ")
          .append(wrapper[i].getCanonicalName()).append(" value) { return 2; }\n");
      int index=i+1;
      body.append("Object v").append(index).append("=").append(values[i]).append(";\n");
      body.append("if(pick").append(i).append("(").append(argument.apply(int.class,0))
          .append(",").append(argument.apply(primitive[i],index))
          .append(")!=1) throw new AssertionError(\"primitive dispatch\");\n");
      body.append("if(pick").append(i).append("(").append(argument.apply(int.class,0))
          .append(",").append(argument.apply(wrapper[i],index))
          .append(")!=2) throw new AssertionError(\"wrapper dispatch\");\n");
      body.append("v").append(index).append("=null;\n");
      body.append("if(pick").append(i).append("(").append(argument.apply(int.class,0))
          .append(",").append(argument.apply(wrapper[i],index))
          .append(")!=2) throw new AssertionError(\"null wrapper dispatch\");\n");
    }
    source.append(body).append("}\n}\n");
    Path directory=Files.createTempDirectory("grt-overload-check-");
    Path file=directory.resolve("OverloadProbe.java");
    Files.write(file,source.toString().getBytes(StandardCharsets.UTF_8));
    int status=ToolProvider.getSystemJavaCompiler().run(null,null,null,
        "--release","11","-d",directory.toString(),file.toString());
    if(status!=0) throw new AssertionError("Generated overload calls do not compile: "+file);
    try(URLClassLoader loader=new URLClassLoader(new java.net.URL[]{directory.toUri().toURL()},null)) {
      loader.loadClass("OverloadProbe").getMethod("check").invoke(null);
    }
  }
}
