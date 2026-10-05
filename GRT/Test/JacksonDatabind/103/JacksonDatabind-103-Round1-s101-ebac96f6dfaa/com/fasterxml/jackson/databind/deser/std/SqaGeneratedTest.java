package com.fasterxml.jackson.databind.deser.std;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v0),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6));
    Object v8 = 1;
    Object v9 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v4).createFromInt(((com.fasterxml.jackson.databind.DeserializationContext)v7),(((java.lang.Integer)v8).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v0),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6));
    Object v8 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = ((com.fasterxml.jackson.databind.DeserializationContext)v7).endOfInputException(((java.lang.Class)v10));
    Object v12 = false;
    Object v13 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v4).createFromBoolean(((com.fasterxml.jackson.databind.DeserializationContext)v7),(((java.lang.Boolean)v12).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v0),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6));
    Object v8 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.PascalCaseStrategy();
    Object v9 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v4).createUsingDelegate(((com.fasterxml.jackson.databind.DeserializationContext)v7),((java.lang.Object)v8));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v0),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v4).canCreateFromObjectWith();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v0),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v4).canCreateFromDouble();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v0),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v4).canCreateUsingDelegate();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v0),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v4).canCreateFromLong();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v0),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v4).canCreateFromBoolean();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v0),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v4).canCreateFromString();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v0),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v6 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v9));
    Object v11 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v12 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = true;
    Object v15 = com.fasterxml.jackson.databind.util.ClassUtil.findSuperClasses(((java.lang.Class)v10),((java.lang.Class)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.fasterxml.jackson.databind.type.TypeBindings.create(((java.lang.Class)v8),((java.util.List)v15));
    Object v17 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v5),((com.fasterxml.jackson.databind.type.TypeBindings)v16));
    Object v18 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v19 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v19));
    Object v21 = false;
    Object v22 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null};
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v17),((java.lang.reflect.Constructor)v22),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v23),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v24));
    ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v4).configureFromDoubleCreator(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v25));
    Object v26 = null;
    Object v27 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v4).canInstantiate();
    org.junit.Assert.assertEquals((Object)(true), v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v0),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6));
    Object v8 = 0.0D;
    Object v9 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v4).createFromDouble(((com.fasterxml.jackson.databind.DeserializationContext)v7),(((java.lang.Double)v8).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v0),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6));
    Object v8 = new byte[]{};
    Object v9 = new com.fasterxml.jackson.databind.node.BinaryNode(((byte[])v8));
    Object v10 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v11 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v9),((com.fasterxml.jackson.core.ObjectCodec)v10));
    Object v12 = "&";
    Object v13 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.core.JsonParser)v11),((java.lang.String)v12));
    Object v14 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v4).wrapAsJsonMappingException(((com.fasterxml.jackson.databind.DeserializationContext)v7),((java.lang.Throwable)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v0),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6));
    Object v8 = "u]";
    Object v9 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v4).createFromString(((com.fasterxml.jackson.databind.DeserializationContext)v7),((java.lang.String)v8));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v0),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6));
    Object v8 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v8));
    Object v10 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v9));
    Object v11 = new java.util.concurrent.atomic.AtomicReference();
    Object v12 = ((com.fasterxml.jackson.databind.DeserializationContext)v7).hasValueDeserializerFor(((com.fasterxml.jackson.databind.JavaType)v10),((java.util.concurrent.atomic.AtomicReference)v11));
    Object v13 = ": cannot find property with name '";
    Object v14 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v4).createFromString(((com.fasterxml.jackson.databind.DeserializationContext)v7),((java.lang.String)v13));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v0),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v4).canCreateUsingArrayDelegate();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v0),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6));
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v9));
    Object v11 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v8),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v12).canCreateUsingArrayDelegate();
    Object v14 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v4).createUsingDelegate(((com.fasterxml.jackson.databind.DeserializationContext)v7),((java.lang.Object)v13));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v0),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6));
    Object v8 = new byte[]{};
    Object v9 = new com.fasterxml.jackson.databind.node.BinaryNode(((byte[])v8));
    Object v10 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v11 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v9),((com.fasterxml.jackson.core.ObjectCodec)v10));
    Object v12 = "&";
    Object v13 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.core.JsonParser)v11),((java.lang.String)v12));
    Object v14 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v4).unwrapAndWrapException(((com.fasterxml.jackson.databind.DeserializationContext)v7),((java.lang.Throwable)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v0),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6));
    Object v8 = 0;
    Object v9 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v4).createFromInt(((com.fasterxml.jackson.databind.DeserializationContext)v7),(((java.lang.Integer)v8).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v0),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v4).canCreateFromInt();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v0),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v6 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v9));
    Object v11 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v12 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = true;
    Object v15 = com.fasterxml.jackson.databind.util.ClassUtil.findSuperClasses(((java.lang.Class)v10),((java.lang.Class)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.fasterxml.jackson.databind.type.TypeBindings.create(((java.lang.Class)v8),((java.util.List)v15));
    Object v17 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v5),((com.fasterxml.jackson.databind.type.TypeBindings)v16));
    Object v18 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v19 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v19));
    Object v21 = false;
    Object v22 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null};
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v17),((java.lang.reflect.Constructor)v22),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v23),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v24));
    ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v4).configureFromLongCreator(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v25));
    Object v26 = null;
    Object v27 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v4).canCreateFromString();
    org.junit.Assert.assertEquals((Object)(false), v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v0),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v4).canCreateUsingDefault();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v0),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v6 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v9));
    Object v11 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v12 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = true;
    Object v15 = com.fasterxml.jackson.databind.util.ClassUtil.findSuperClasses(((java.lang.Class)v10),((java.lang.Class)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.fasterxml.jackson.databind.type.TypeBindings.create(((java.lang.Class)v8),((java.util.List)v15));
    Object v17 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v5),((com.fasterxml.jackson.databind.type.TypeBindings)v16));
    Object v18 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v19 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v19));
    Object v21 = false;
    Object v22 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null};
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v17),((java.lang.reflect.Constructor)v22),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v23),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v24));
    ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v4).configureFromStringCreator(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v25));
    Object v26 = null;
    Object v27 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v4).canCreateUsingDefault();
    org.junit.Assert.assertEquals((Object)(false), v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v0),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v6 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v9));
    Object v11 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v12 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = true;
    Object v15 = com.fasterxml.jackson.databind.util.ClassUtil.findSuperClasses(((java.lang.Class)v10),((java.lang.Class)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.fasterxml.jackson.databind.type.TypeBindings.create(((java.lang.Class)v8),((java.util.List)v15));
    Object v17 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v5),((com.fasterxml.jackson.databind.type.TypeBindings)v16));
    Object v18 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v19 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v19));
    Object v21 = false;
    Object v22 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null};
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v17),((java.lang.reflect.Constructor)v22),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v23),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v24));
    ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v4).configureFromLongCreator(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v25));
    Object v26 = null;
    Object v27 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v4).canCreateFromBoolean();
    org.junit.Assert.assertEquals((Object)(false), v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v0),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v4).getValueTypeDesc();
    org.junit.Assert.assertEquals((Object)("[simple type, class com.fasterxml.jackson.databind.introspect.BasicClassIntrospector]"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v0),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v4).canInstantiate();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v0),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6));
    Object v8 = new java.lang.Object[]{};
    Object v9 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v4).createFromObjectWith(((com.fasterxml.jackson.databind.DeserializationContext)v7),((java.lang.Object[])v8));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v0),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6));
    Object v8 = new byte[]{};
    Object v9 = new com.fasterxml.jackson.databind.node.BinaryNode(((byte[])v8));
    Object v10 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v11 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v9),((com.fasterxml.jackson.core.ObjectCodec)v10));
    Object v12 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v13 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v12));
    Object v14 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v13));
    Object v15 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL;
    Object v16 = "'";
    Object v17 = ((com.fasterxml.jackson.databind.DeserializationContext)v7).wrongTokenException(((com.fasterxml.jackson.core.JsonParser)v11),((com.fasterxml.jackson.databind.JavaType)v14),((com.fasterxml.jackson.core.JsonToken)v15),((java.lang.String)v16));
    Object v18 = 0L;
    Object v19 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v4).createFromLong(((com.fasterxml.jackson.databind.DeserializationContext)v7),(((java.lang.Long)v18).longValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v0),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6));
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v9));
    Object v11 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v8),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v14 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v14));
    Object v16 = new byte[]{};
    Object v17 = new com.fasterxml.jackson.databind.node.BinaryNode(((byte[])v16));
    Object v18 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v19 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v17),((com.fasterxml.jackson.core.ObjectCodec)v18));
    Object v20 = "&";
    Object v21 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.core.JsonParser)v19),((java.lang.String)v20));
    Object v22 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v12).unwrapAndWrapException(((com.fasterxml.jackson.databind.DeserializationContext)v15),((java.lang.Throwable)v21));
    Object v23 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v4).unwrapAndWrapException(((com.fasterxml.jackson.databind.DeserializationContext)v7),((java.lang.Throwable)v22));
    org.junit.Assert.assertNotNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v0),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v6 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v9));
    Object v11 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v12 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = true;
    Object v15 = com.fasterxml.jackson.databind.util.ClassUtil.findSuperClasses(((java.lang.Class)v10),((java.lang.Class)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.fasterxml.jackson.databind.type.TypeBindings.create(((java.lang.Class)v8),((java.util.List)v15));
    Object v17 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v5),((com.fasterxml.jackson.databind.type.TypeBindings)v16));
    Object v18 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v19 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v19));
    Object v21 = false;
    Object v22 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null};
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v17),((java.lang.reflect.Constructor)v22),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v23),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v24));
    ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v4).configureFromBooleanCreator(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v25));
    Object v26 = null;
    Object v27 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v4).canCreateFromLong();
    org.junit.Assert.assertEquals((Object)(false), v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v0),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v4).getIncompleteParameter();
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v0),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v6 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v9));
    Object v11 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v12 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = true;
    Object v15 = com.fasterxml.jackson.databind.util.ClassUtil.findSuperClasses(((java.lang.Class)v10),((java.lang.Class)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.fasterxml.jackson.databind.type.TypeBindings.create(((java.lang.Class)v8),((java.util.List)v15));
    Object v17 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v5),((com.fasterxml.jackson.databind.type.TypeBindings)v16));
    Object v18 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v19 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v19));
    Object v21 = false;
    Object v22 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null};
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v17),((java.lang.reflect.Constructor)v22),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v23),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v24));
    ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v4).configureFromDoubleCreator(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v25));
    Object v26 = null;
    Object v27 = new byte[]{};
    Object v28 = new com.fasterxml.jackson.databind.node.BinaryNode(((byte[])v27));
    Object v29 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v30 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v28),((com.fasterxml.jackson.core.ObjectCodec)v29));
    Object v31 = "&";
    Object v32 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.core.JsonParser)v30),((java.lang.String)v31));
    Object v33 = ((java.lang.Throwable)v32).getSuppressed();
    Object v34 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v4).wrapException(((java.lang.Throwable)v32));
    org.junit.Assert.assertNotNull(v34);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v0),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v4).getDefaultCreator();
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v0),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6));
    Object v8 = -8L;
    Object v9 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v4).createFromLong(((com.fasterxml.jackson.databind.DeserializationContext)v7),(((java.lang.Long)v8).longValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v0),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6));
    Object v8 = ((com.fasterxml.jackson.databind.DeserializationContext)v7).getArrayBuilders();
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v10 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v4).createUsingDelegate(((com.fasterxml.jackson.databind.DeserializationContext)v7),((java.lang.Object)v9));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v0),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6));
    Object v8 = -14L;
    Object v9 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v4).createFromLong(((com.fasterxml.jackson.databind.DeserializationContext)v7),(((java.lang.Long)v8).longValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v0),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6));
    Object v8 = 1L;
    Object v9 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v4).createFromLong(((com.fasterxml.jackson.databind.DeserializationContext)v7),(((java.lang.Long)v8).longValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v0),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6));
    Object v8 = new byte[]{};
    Object v9 = new com.fasterxml.jackson.databind.node.BinaryNode(((byte[])v8));
    Object v10 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v11 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v9),((com.fasterxml.jackson.core.ObjectCodec)v10));
    Object v12 = "&";
    Object v13 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.core.JsonParser)v11),((java.lang.String)v12));
    Object v14 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v4).rewrapCtorProblem(((com.fasterxml.jackson.databind.DeserializationContext)v7),((java.lang.Throwable)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v0),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v6 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v9));
    Object v11 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v12 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = true;
    Object v15 = com.fasterxml.jackson.databind.util.ClassUtil.findSuperClasses(((java.lang.Class)v10),((java.lang.Class)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.fasterxml.jackson.databind.type.TypeBindings.create(((java.lang.Class)v8),((java.util.List)v15));
    Object v17 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v5),((com.fasterxml.jackson.databind.type.TypeBindings)v16));
    Object v18 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v19 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v19));
    Object v21 = false;
    Object v22 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null};
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v17),((java.lang.reflect.Constructor)v22),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v23),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v24));
    ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v4).configureFromLongCreator(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v25));
    Object v26 = null;
    org.junit.Assert.assertNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v0),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v6 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v9));
    Object v11 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v12 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = true;
    Object v15 = com.fasterxml.jackson.databind.util.ClassUtil.findSuperClasses(((java.lang.Class)v10),((java.lang.Class)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.fasterxml.jackson.databind.type.TypeBindings.create(((java.lang.Class)v8),((java.util.List)v15));
    Object v17 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v5),((com.fasterxml.jackson.databind.type.TypeBindings)v16));
    Object v18 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v19 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v19));
    Object v21 = false;
    Object v22 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null};
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v17),((java.lang.reflect.Constructor)v22),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v23),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v24));
    ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v4).configureFromDoubleCreator(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v25));
    Object v26 = null;
    Object v27 = null;
    Object v28 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v4).getDelegateType(((com.fasterxml.jackson.databind.DeserializationConfig)v27));
    org.junit.Assert.assertNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v0),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6));
    Object v8 = 0L;
    Object v9 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v4).createFromLong(((com.fasterxml.jackson.databind.DeserializationContext)v7),(((java.lang.Long)v8).longValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v0),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v6));
    Object v8 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v7));
    Object v9 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v5),((com.fasterxml.jackson.databind.JavaType)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = new byte[]{};
    Object v14 = new com.fasterxml.jackson.databind.node.BinaryNode(((byte[])v13));
    Object v15 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v16 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v14),((com.fasterxml.jackson.core.ObjectCodec)v15));
    Object v17 = "&";
    Object v18 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.core.JsonParser)v16),((java.lang.String)v17));
    Object v19 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v9).rewrapCtorProblem(((com.fasterxml.jackson.databind.DeserializationContext)v12),((java.lang.Throwable)v18));
    Object v20 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v4).wrapException(((java.lang.Throwable)v19));
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v0),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6));
    Object v8 = new byte[]{};
    Object v9 = new com.fasterxml.jackson.databind.node.BinaryNode(((byte[])v8));
    Object v10 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v11 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v9),((com.fasterxml.jackson.core.ObjectCodec)v10));
    Object v12 = "&";
    Object v13 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.core.JsonParser)v11),((java.lang.String)v12));
    Object v14 = null;
    Object v15 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v16 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v15));
    Object v17 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v14),((com.fasterxml.jackson.databind.JavaType)v17));
    Object v19 = null;
    Object v20 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v21 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v20));
    Object v22 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v21));
    Object v23 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v19),((com.fasterxml.jackson.databind.JavaType)v22));
    Object v24 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v25 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v24));
    Object v26 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v25));
    Object v27 = new byte[]{};
    Object v28 = new com.fasterxml.jackson.databind.node.BinaryNode(((byte[])v27));
    Object v29 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v30 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v28),((com.fasterxml.jackson.core.ObjectCodec)v29));
    Object v31 = "&";
    Object v32 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.core.JsonParser)v30),((java.lang.String)v31));
    Object v33 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v23).rewrapCtorProblem(((com.fasterxml.jackson.databind.DeserializationContext)v26),((java.lang.Throwable)v32));
    Object v34 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v18).wrapException(((java.lang.Throwable)v33));
    ((java.lang.Throwable)v13).addSuppressed(((java.lang.Throwable)v34));
    Object v35 = null;
    Object v36 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v4).rewrapCtorProblem(((com.fasterxml.jackson.databind.DeserializationContext)v7),((java.lang.Throwable)v13));
    org.junit.Assert.assertNotNull(v36);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v0),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v6 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v9));
    Object v11 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v12 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = true;
    Object v15 = com.fasterxml.jackson.databind.util.ClassUtil.findSuperClasses(((java.lang.Class)v10),((java.lang.Class)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.fasterxml.jackson.databind.type.TypeBindings.create(((java.lang.Class)v8),((java.util.List)v15));
    Object v17 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v5),((com.fasterxml.jackson.databind.type.TypeBindings)v16));
    Object v18 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v19 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v19));
    Object v21 = false;
    Object v22 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null};
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v17),((java.lang.reflect.Constructor)v22),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v23),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v24));
    ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v4).configureFromIntCreator(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v25));
    Object v26 = null;
    Object v27 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v28 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v27));
    Object v29 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v28));
    Object v30 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v31 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v30));
    Object v32 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v31));
    Object v33 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v4).createUsingArrayDelegate(((com.fasterxml.jackson.databind.DeserializationContext)v29),((java.lang.Object)v32));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v0),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6));
    Object v8 = "Root name '%s' does not match expected ('%s') for type %s";
    Object v9 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v4).createFromString(((com.fasterxml.jackson.databind.DeserializationContext)v7),((java.lang.String)v8));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v0),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6));
    Object v8 = true;
    Object v9 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v4).createFromBoolean(((com.fasterxml.jackson.databind.DeserializationContext)v7),(((java.lang.Boolean)v8).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v0),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v6 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v9));
    Object v11 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v12 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = true;
    Object v15 = com.fasterxml.jackson.databind.util.ClassUtil.findSuperClasses(((java.lang.Class)v10),((java.lang.Class)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.fasterxml.jackson.databind.type.TypeBindings.create(((java.lang.Class)v8),((java.util.List)v15));
    Object v17 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v5),((com.fasterxml.jackson.databind.type.TypeBindings)v16));
    Object v18 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v19 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v19));
    Object v21 = false;
    Object v22 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null};
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v17),((java.lang.reflect.Constructor)v22),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v23),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v24));
    ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v4).configureFromDoubleCreator(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v25));
    Object v26 = null;
    Object v27 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v28 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v27));
    Object v29 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v28));
    Object v30 = new byte[]{};
    Object v31 = new com.fasterxml.jackson.databind.node.BinaryNode(((byte[])v30));
    Object v32 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v33 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v31),((com.fasterxml.jackson.core.ObjectCodec)v32));
    Object v34 = "&";
    Object v35 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.core.JsonParser)v33),((java.lang.String)v34));
    Object v36 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v4).wrapAsJsonMappingException(((com.fasterxml.jackson.databind.DeserializationContext)v29),((java.lang.Throwable)v35));
    org.junit.Assert.assertNotNull(v36);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v0),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6));
    Object v8 = new byte[]{};
    Object v9 = new com.fasterxml.jackson.databind.node.BinaryNode(((byte[])v8));
    Object v10 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v11 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v9),((com.fasterxml.jackson.core.ObjectCodec)v10));
    Object v12 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v13 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v12));
    Object v14 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v13));
    Object v15 = com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_INT;
    Object v16 = " entries)";
    Object v17 = ((com.fasterxml.jackson.databind.DeserializationContext)v7).wrongTokenException(((com.fasterxml.jackson.core.JsonParser)v11),((com.fasterxml.jackson.databind.JavaType)v14),((com.fasterxml.jackson.core.JsonToken)v15),((java.lang.String)v16));
    Object v18 = false;
    Object v19 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v4).createFromBoolean(((com.fasterxml.jackson.databind.DeserializationContext)v7),(((java.lang.Boolean)v18).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v0),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v6 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v9));
    Object v11 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v12 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = true;
    Object v15 = com.fasterxml.jackson.databind.util.ClassUtil.findSuperClasses(((java.lang.Class)v10),((java.lang.Class)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.fasterxml.jackson.databind.type.TypeBindings.create(((java.lang.Class)v8),((java.util.List)v15));
    Object v17 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v5),((com.fasterxml.jackson.databind.type.TypeBindings)v16));
    Object v18 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v19 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v19));
    Object v21 = false;
    Object v22 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null};
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v17),((java.lang.reflect.Constructor)v22),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v23),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v24));
    ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v4).configureFromDoubleCreator(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v25));
    Object v26 = null;
    Object v27 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v28 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v27));
    Object v29 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v28));
    Object v30 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v4).createUsingDefault(((com.fasterxml.jackson.databind.DeserializationContext)v29));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v0),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v6 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v9));
    Object v11 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v12 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = true;
    Object v15 = com.fasterxml.jackson.databind.util.ClassUtil.findSuperClasses(((java.lang.Class)v10),((java.lang.Class)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.fasterxml.jackson.databind.type.TypeBindings.create(((java.lang.Class)v8),((java.util.List)v15));
    Object v17 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v5),((com.fasterxml.jackson.databind.type.TypeBindings)v16));
    Object v18 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v19 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v19));
    Object v21 = false;
    Object v22 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null};
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v17),((java.lang.reflect.Constructor)v22),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v23),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v24));
    Object v26 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v27 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v26));
    Object v28 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v27));
    Object v29 = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[]{null,null};
    ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v4).configureFromArraySettings(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v25),((com.fasterxml.jackson.databind.JavaType)v28),((com.fasterxml.jackson.databind.deser.SettableBeanProperty[])v29));
    Object v30 = null;
    Object v31 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v4).getDelegateCreator();
    org.junit.Assert.assertNull(v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v0),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v6 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v9));
    Object v11 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v12 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = true;
    Object v15 = com.fasterxml.jackson.databind.util.ClassUtil.findSuperClasses(((java.lang.Class)v10),((java.lang.Class)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.fasterxml.jackson.databind.type.TypeBindings.create(((java.lang.Class)v8),((java.util.List)v15));
    Object v17 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v5),((com.fasterxml.jackson.databind.type.TypeBindings)v16));
    Object v18 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v19 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v19));
    Object v21 = false;
    Object v22 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null};
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v17),((java.lang.reflect.Constructor)v22),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v23),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v24));
    ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v4).configureFromBooleanCreator(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v25));
    Object v26 = null;
    Object v27 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v28 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v27));
    Object v29 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v28));
    Object v30 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v31 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v4).createUsingArrayDelegate(((com.fasterxml.jackson.databind.DeserializationContext)v29),((java.lang.Object)v30));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v0),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6));
    Object v8 = 1.0D;
    Object v9 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v4).createFromDouble(((com.fasterxml.jackson.databind.DeserializationContext)v7),(((java.lang.Double)v8).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v0),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6));
    Object v8 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v4).createUsingDefault(((com.fasterxml.jackson.databind.DeserializationContext)v7));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v0),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6));
    Object v8 = 35.37990780546598D;
    Object v9 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v4).createFromDouble(((com.fasterxml.jackson.databind.DeserializationContext)v7),(((java.lang.Double)v8).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v0),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v6 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v9));
    Object v11 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v12 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = true;
    Object v15 = com.fasterxml.jackson.databind.util.ClassUtil.findSuperClasses(((java.lang.Class)v10),((java.lang.Class)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.fasterxml.jackson.databind.type.TypeBindings.create(((java.lang.Class)v8),((java.util.List)v15));
    Object v17 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v5),((com.fasterxml.jackson.databind.type.TypeBindings)v16));
    Object v18 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v19 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v19));
    Object v21 = false;
    Object v22 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null};
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v17),((java.lang.reflect.Constructor)v22),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v23),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v24));
    Object v26 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v27 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v26));
    Object v28 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v27));
    Object v29 = ((com.fasterxml.jackson.databind.JavaType)v28).isEnumType();
    Object v30 = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[]{null,null};
    ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v4).configureFromArraySettings(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v25),((com.fasterxml.jackson.databind.JavaType)v28),((com.fasterxml.jackson.databind.deser.SettableBeanProperty[])v30));
    Object v31 = null;
    org.junit.Assert.assertNull(v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v0),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v4).getArrayDelegateCreator();
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v0),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v4).getDelegateCreator();
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v0),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6));
    Object v8 = new java.lang.Object[]{null,null,null};
    Object v9 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v4).createFromObjectWith(((com.fasterxml.jackson.databind.DeserializationContext)v7),((java.lang.Object[])v8));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v0),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6));
    Object v8 = 34.78963007445037D;
    Object v9 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = "m";
    Object v13 = ((com.fasterxml.jackson.databind.DeserializationContext)v7).weirdNumberException(((java.lang.Number)v8),((java.lang.Class)v11),((java.lang.String)v12));
    Object v14 = ")";
    Object v15 = "";
    Object v16 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v14),((java.lang.String)v15));
    Object v17 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v4).createUsingArrayDelegate(((com.fasterxml.jackson.databind.DeserializationContext)v7),((java.lang.Object)v16));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v0),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v6 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v9));
    Object v11 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v12 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = true;
    Object v15 = com.fasterxml.jackson.databind.util.ClassUtil.findSuperClasses(((java.lang.Class)v10),((java.lang.Class)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.fasterxml.jackson.databind.type.TypeBindings.create(((java.lang.Class)v8),((java.util.List)v15));
    Object v17 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v5),((com.fasterxml.jackson.databind.type.TypeBindings)v16));
    Object v18 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v19 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v19));
    Object v21 = false;
    Object v22 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null};
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v17),((java.lang.reflect.Constructor)v22),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v23),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v24));
    ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v4).configureFromStringCreator(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v25));
    Object v26 = null;
    Object v27 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v4).canCreateFromInt();
    org.junit.Assert.assertEquals((Object)(false), v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v0),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v9 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v4).createUsingArrayDelegate(((com.fasterxml.jackson.databind.DeserializationContext)v7),((java.lang.Object)v8));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v0),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v6 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v9));
    Object v11 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v12 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = true;
    Object v15 = com.fasterxml.jackson.databind.util.ClassUtil.findSuperClasses(((java.lang.Class)v10),((java.lang.Class)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.fasterxml.jackson.databind.type.TypeBindings.create(((java.lang.Class)v8),((java.util.List)v15));
    Object v17 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v5),((com.fasterxml.jackson.databind.type.TypeBindings)v16));
    Object v18 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v19 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v19));
    Object v21 = false;
    Object v22 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null};
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v17),((java.lang.reflect.Constructor)v22),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v23),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v24));
    ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v4).configureFromDoubleCreator(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v25));
    Object v26 = null;
    Object v27 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v28 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v27));
    Object v29 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v28));
    Object v30 = 1L;
    Object v31 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v4).createFromLong(((com.fasterxml.jackson.databind.DeserializationContext)v29),(((java.lang.Long)v30).longValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v0),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v4).getWithArgsCreator();
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v0),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6));
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v10 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v9));
    Object v11 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v4).createUsingArrayDelegate(((com.fasterxml.jackson.databind.DeserializationContext)v7),((java.lang.Object)v10));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v0),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6));
    Object v8 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v8));
    Object v10 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v9));
    Object v11 = "<";
    Object v12 = ((com.fasterxml.jackson.databind.DeserializationContext)v7).missingTypeIdException(((com.fasterxml.jackson.databind.JavaType)v10),((java.lang.String)v11));
    Object v13 = null;
    Object v14 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v15 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v14));
    Object v16 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v15));
    Object v17 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v13),((com.fasterxml.jackson.databind.JavaType)v16));
    Object v18 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v19 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v18));
    Object v20 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v19));
    Object v21 = new byte[]{};
    Object v22 = new com.fasterxml.jackson.databind.node.BinaryNode(((byte[])v21));
    Object v23 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v24 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v22),((com.fasterxml.jackson.core.ObjectCodec)v23));
    Object v25 = "&";
    Object v26 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.core.JsonParser)v24),((java.lang.String)v25));
    Object v27 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v17).rewrapCtorProblem(((com.fasterxml.jackson.databind.DeserializationContext)v20),((java.lang.Throwable)v26));
    Object v28 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v4).wrapAsJsonMappingException(((com.fasterxml.jackson.databind.DeserializationContext)v7),((java.lang.Throwable)v27));
    org.junit.Assert.assertNotNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v0),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v6 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v9));
    Object v11 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v12 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = true;
    Object v15 = com.fasterxml.jackson.databind.util.ClassUtil.findSuperClasses(((java.lang.Class)v10),((java.lang.Class)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.fasterxml.jackson.databind.type.TypeBindings.create(((java.lang.Class)v8),((java.util.List)v15));
    Object v17 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v5),((com.fasterxml.jackson.databind.type.TypeBindings)v16));
    Object v18 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v19 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v19));
    Object v21 = false;
    Object v22 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null};
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v17),((java.lang.reflect.Constructor)v22),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v23),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v24));
    ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v4).configureFromLongCreator(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v25));
    Object v26 = null;
    Object v27 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v4).canCreateUsingArrayDelegate();
    org.junit.Assert.assertEquals((Object)(false), v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v0),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v6 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v9));
    Object v11 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v12 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = true;
    Object v15 = com.fasterxml.jackson.databind.util.ClassUtil.findSuperClasses(((java.lang.Class)v10),((java.lang.Class)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.fasterxml.jackson.databind.type.TypeBindings.create(((java.lang.Class)v8),((java.util.List)v15));
    Object v17 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v5),((com.fasterxml.jackson.databind.type.TypeBindings)v16));
    Object v18 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v19 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v19));
    Object v21 = false;
    Object v22 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null};
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v17),((java.lang.reflect.Constructor)v22),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v23),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v24));
    Object v26 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v27 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v26));
    Object v28 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v27));
    Object v29 = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[]{null,null,null};
    ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v4).configureFromArraySettings(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v25),((com.fasterxml.jackson.databind.JavaType)v28),((com.fasterxml.jackson.databind.deser.SettableBeanProperty[])v29));
    Object v30 = null;
    Object v31 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v4).canCreateFromBoolean();
    org.junit.Assert.assertEquals((Object)(false), v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v0),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6));
    Object v8 = 2.0D;
    Object v9 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v4).createFromDouble(((com.fasterxml.jackson.databind.DeserializationContext)v7),(((java.lang.Double)v8).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v0),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v6 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v9));
    Object v11 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v12 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = true;
    Object v15 = com.fasterxml.jackson.databind.util.ClassUtil.findSuperClasses(((java.lang.Class)v10),((java.lang.Class)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.fasterxml.jackson.databind.type.TypeBindings.create(((java.lang.Class)v8),((java.util.List)v15));
    Object v17 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v5),((com.fasterxml.jackson.databind.type.TypeBindings)v16));
    Object v18 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v19 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v19));
    Object v21 = false;
    Object v22 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null};
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v17),((java.lang.reflect.Constructor)v22),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v23),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v24));
    ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v4).configureFromIntCreator(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v25));
    Object v26 = null;
    Object v27 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v4).canCreateFromBoolean();
    org.junit.Assert.assertEquals((Object)(false), v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v0),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v6 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v9));
    Object v11 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v12 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = true;
    Object v15 = com.fasterxml.jackson.databind.util.ClassUtil.findSuperClasses(((java.lang.Class)v10),((java.lang.Class)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.fasterxml.jackson.databind.type.TypeBindings.create(((java.lang.Class)v8),((java.util.List)v15));
    Object v17 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v5),((com.fasterxml.jackson.databind.type.TypeBindings)v16));
    Object v18 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v19 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v19));
    Object v21 = false;
    Object v22 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null};
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v17),((java.lang.reflect.Constructor)v22),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v23),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v24));
    ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v4).configureFromIntCreator(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v25));
    Object v26 = null;
    org.junit.Assert.assertNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v0),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6));
    Object v8 = new java.lang.Object[]{null};
    Object v9 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v4).createFromObjectWith(((com.fasterxml.jackson.databind.DeserializationContext)v7),((java.lang.Object[])v8));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v0),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.SqlDateDeserializer();
    Object v9 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v4).createUsingDelegate(((com.fasterxml.jackson.databind.DeserializationContext)v7),((java.lang.Object)v8));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v0),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6));
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v9));
    Object v11 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v8),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v12).canCreateFromBoolean();
    Object v14 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v4).createUsingArrayDelegate(((com.fasterxml.jackson.databind.DeserializationContext)v7),((java.lang.Object)v13));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v0),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v6 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v9));
    Object v11 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v12 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = true;
    Object v15 = com.fasterxml.jackson.databind.util.ClassUtil.findSuperClasses(((java.lang.Class)v10),((java.lang.Class)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.fasterxml.jackson.databind.type.TypeBindings.create(((java.lang.Class)v8),((java.util.List)v15));
    Object v17 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v5),((com.fasterxml.jackson.databind.type.TypeBindings)v16));
    Object v18 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v19 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v19));
    Object v21 = false;
    Object v22 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null};
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v17),((java.lang.reflect.Constructor)v22),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v23),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v24));
    ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v4).configureFromLongCreator(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v25));
    Object v26 = null;
    Object v27 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v28 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v27));
    Object v29 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v28));
    Object v30 = new java.lang.Object[]{null};
    Object v31 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v4).createFromObjectWith(((com.fasterxml.jackson.databind.DeserializationContext)v29),((java.lang.Object[])v30));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v0),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v6 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v9));
    Object v11 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v12 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = true;
    Object v15 = com.fasterxml.jackson.databind.util.ClassUtil.findSuperClasses(((java.lang.Class)v10),((java.lang.Class)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.fasterxml.jackson.databind.type.TypeBindings.create(((java.lang.Class)v8),((java.util.List)v15));
    Object v17 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v5),((com.fasterxml.jackson.databind.type.TypeBindings)v16));
    Object v18 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v19 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v19));
    Object v21 = false;
    Object v22 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null};
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v17),((java.lang.reflect.Constructor)v22),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v23),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v24));
    ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v4).configureFromIntCreator(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v25));
    Object v26 = null;
    Object v27 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v4).canCreateUsingDefault();
    org.junit.Assert.assertEquals((Object)(false), v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v0),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6));
    Object v8 = new java.util.concurrent.atomic.AtomicReference();
    Object v9 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v4).createUsingDelegate(((com.fasterxml.jackson.databind.DeserializationContext)v7),((java.lang.Object)v8));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v0),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v6 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v9));
    Object v11 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v12 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = true;
    Object v15 = com.fasterxml.jackson.databind.util.ClassUtil.findSuperClasses(((java.lang.Class)v10),((java.lang.Class)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.fasterxml.jackson.databind.type.TypeBindings.create(((java.lang.Class)v8),((java.util.List)v15));
    Object v17 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v5),((com.fasterxml.jackson.databind.type.TypeBindings)v16));
    Object v18 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v19 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v19));
    Object v21 = false;
    Object v22 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null};
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v17),((java.lang.reflect.Constructor)v22),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v23),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v24));
    Object v26 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v27 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v26));
    Object v28 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v27));
    Object v29 = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[]{null};
    ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v4).configureFromArraySettings(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v25),((com.fasterxml.jackson.databind.JavaType)v28),((com.fasterxml.jackson.databind.deser.SettableBeanProperty[])v29));
    Object v30 = null;
    Object v31 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v4).canCreateUsingDelegate();
    org.junit.Assert.assertEquals((Object)(false), v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v0),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v6 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v9));
    Object v11 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v12 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = true;
    Object v15 = com.fasterxml.jackson.databind.util.ClassUtil.findSuperClasses(((java.lang.Class)v10),((java.lang.Class)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.fasterxml.jackson.databind.type.TypeBindings.create(((java.lang.Class)v8),((java.util.List)v15));
    Object v17 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v5),((com.fasterxml.jackson.databind.type.TypeBindings)v16));
    Object v18 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v19 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v19));
    Object v21 = false;
    Object v22 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null};
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v17),((java.lang.reflect.Constructor)v22),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v23),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v24));
    Object v26 = ((com.fasterxml.jackson.databind.introspect.Annotated)v25).getType();
    ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v4).configureFromLongCreator(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v25));
    Object v27 = null;
    org.junit.Assert.assertNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v0),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = "ites";
    Object v12 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.SqlDateDeserializer();
    ((com.fasterxml.jackson.databind.DeserializationContext)v7).reportUnknownProperty(((java.lang.Object)v10),((java.lang.String)v11),((com.fasterxml.jackson.databind.JsonDeserializer)v12));
    Object v13 = null;
    Object v14 = new byte[]{};
    Object v15 = new com.fasterxml.jackson.databind.node.BinaryNode(((byte[])v14));
    Object v16 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v17 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v15),((com.fasterxml.jackson.core.ObjectCodec)v16));
    Object v18 = "&";
    Object v19 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.core.JsonParser)v17),((java.lang.String)v18));
    Object v20 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v4).wrapAsJsonMappingException(((com.fasterxml.jackson.databind.DeserializationContext)v7),((java.lang.Throwable)v19));
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v0),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6));
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v9));
    Object v11 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v8),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v12).canCreateUsingDefault();
    Object v14 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v4).createUsingDelegate(((com.fasterxml.jackson.databind.DeserializationContext)v7),((java.lang.Object)v13));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v0),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v6 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v9));
    Object v11 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v12 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = true;
    Object v15 = com.fasterxml.jackson.databind.util.ClassUtil.findSuperClasses(((java.lang.Class)v10),((java.lang.Class)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.fasterxml.jackson.databind.type.TypeBindings.create(((java.lang.Class)v8),((java.util.List)v15));
    Object v17 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v5),((com.fasterxml.jackson.databind.type.TypeBindings)v16));
    Object v18 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v19 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v19));
    Object v21 = false;
    Object v22 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null};
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v17),((java.lang.reflect.Constructor)v22),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v23),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v24));
    ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v4).configureFromBooleanCreator(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v25));
    Object v26 = null;
    org.junit.Assert.assertNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v0),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6));
    Object v8 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v8));
    Object v10 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v9));
    Object v11 = "Unexpected end-of-input when trying to deserialize a ";
    Object v12 = ((com.fasterxml.jackson.databind.DeserializationContext)v7).missingTypeIdException(((com.fasterxml.jackson.databind.JavaType)v10),((java.lang.String)v11));
    Object v13 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v4).createUsingDefault(((com.fasterxml.jackson.databind.DeserializationContext)v7));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v0),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6));
    Object v8 = ((com.fasterxml.jackson.databind.DeserializationContext)v7).getArrayBuilders();
    Object v9 = false;
    Object v10 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v4).createFromBoolean(((com.fasterxml.jackson.databind.DeserializationContext)v7),(((java.lang.Boolean)v9).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v0),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6));
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v9));
    Object v11 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v8),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v14 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v14));
    Object v16 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v17 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v17));
    Object v19 = "ites";
    Object v20 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.SqlDateDeserializer();
    ((com.fasterxml.jackson.databind.DeserializationContext)v15).reportUnknownProperty(((java.lang.Object)v18),((java.lang.String)v19),((com.fasterxml.jackson.databind.JsonDeserializer)v20));
    Object v21 = null;
    Object v22 = new byte[]{};
    Object v23 = new com.fasterxml.jackson.databind.node.BinaryNode(((byte[])v22));
    Object v24 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v25 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v23),((com.fasterxml.jackson.core.ObjectCodec)v24));
    Object v26 = "&";
    Object v27 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.core.JsonParser)v25),((java.lang.String)v26));
    Object v28 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v12).wrapAsJsonMappingException(((com.fasterxml.jackson.databind.DeserializationContext)v15),((java.lang.Throwable)v27));
    Object v29 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v4).rewrapCtorProblem(((com.fasterxml.jackson.databind.DeserializationContext)v7),((java.lang.Throwable)v28));
    org.junit.Assert.assertNotNull(v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v0),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v6 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v9));
    Object v11 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v12 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = true;
    Object v15 = com.fasterxml.jackson.databind.util.ClassUtil.findSuperClasses(((java.lang.Class)v10),((java.lang.Class)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.fasterxml.jackson.databind.type.TypeBindings.create(((java.lang.Class)v8),((java.util.List)v15));
    Object v17 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v5),((com.fasterxml.jackson.databind.type.TypeBindings)v16));
    Object v18 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v19 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v19));
    Object v21 = false;
    Object v22 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null};
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v17),((java.lang.reflect.Constructor)v22),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v23),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v24));
    ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v4).configureFromDoubleCreator(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v25));
    Object v26 = null;
    Object v27 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v4).canCreateFromInt();
    org.junit.Assert.assertEquals((Object)(false), v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v0),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v4).getValueClass();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v0),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v6 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v9));
    Object v11 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v12 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = true;
    Object v15 = com.fasterxml.jackson.databind.util.ClassUtil.findSuperClasses(((java.lang.Class)v10),((java.lang.Class)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.fasterxml.jackson.databind.type.TypeBindings.create(((java.lang.Class)v8),((java.util.List)v15));
    Object v17 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v5),((com.fasterxml.jackson.databind.type.TypeBindings)v16));
    Object v18 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v19 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v19));
    Object v21 = false;
    Object v22 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null};
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v17),((java.lang.reflect.Constructor)v22),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v23),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v24));
    ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v4).configureFromLongCreator(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v25));
    Object v26 = null;
    Object v27 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v28 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v27));
    Object v29 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v28));
    Object v30 = -20;
    Object v31 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v4).createFromInt(((com.fasterxml.jackson.databind.DeserializationContext)v29),(((java.lang.Integer)v30).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v0),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v6 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v9));
    Object v11 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v12 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = true;
    Object v15 = com.fasterxml.jackson.databind.util.ClassUtil.findSuperClasses(((java.lang.Class)v10),((java.lang.Class)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.fasterxml.jackson.databind.type.TypeBindings.create(((java.lang.Class)v8),((java.util.List)v15));
    Object v17 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v5),((com.fasterxml.jackson.databind.type.TypeBindings)v16));
    Object v18 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v19 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v19));
    Object v21 = false;
    Object v22 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null};
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v17),((java.lang.reflect.Constructor)v22),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v23),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v24));
    Object v26 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v27 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v26));
    Object v28 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v27));
    Object v29 = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[]{null,null};
    ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v4).configureFromArraySettings(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v25),((com.fasterxml.jackson.databind.JavaType)v28),((com.fasterxml.jackson.databind.deser.SettableBeanProperty[])v29));
    Object v30 = null;
    Object v31 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v32 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v31));
    Object v33 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v32));
    Object v34 = 18.117914698182748D;
    Object v35 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v4).createFromDouble(((com.fasterxml.jackson.databind.DeserializationContext)v33),(((java.lang.Double)v34).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v0),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v6 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v9));
    Object v11 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v12 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = true;
    Object v15 = com.fasterxml.jackson.databind.util.ClassUtil.findSuperClasses(((java.lang.Class)v10),((java.lang.Class)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.fasterxml.jackson.databind.type.TypeBindings.create(((java.lang.Class)v8),((java.util.List)v15));
    Object v17 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v5),((com.fasterxml.jackson.databind.type.TypeBindings)v16));
    Object v18 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v19 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v19));
    Object v21 = false;
    Object v22 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null};
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v17),((java.lang.reflect.Constructor)v22),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v23),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v24));
    ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v4).configureFromStringCreator(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v25));
    Object v26 = null;
    org.junit.Assert.assertNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v0),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v6 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v9));
    Object v11 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v12 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = true;
    Object v15 = com.fasterxml.jackson.databind.util.ClassUtil.findSuperClasses(((java.lang.Class)v10),((java.lang.Class)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.fasterxml.jackson.databind.type.TypeBindings.create(((java.lang.Class)v8),((java.util.List)v15));
    Object v17 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v5),((com.fasterxml.jackson.databind.type.TypeBindings)v16));
    Object v18 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v19 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v19));
    Object v21 = false;
    Object v22 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null};
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v17),((java.lang.reflect.Constructor)v22),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v23),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v24));
    ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v4).configureFromDoubleCreator(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v25));
    Object v26 = null;
    org.junit.Assert.assertNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v0),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new byte[]{};
    Object v6 = new com.fasterxml.jackson.databind.node.BinaryNode(((byte[])v5));
    Object v7 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v8 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v6),((com.fasterxml.jackson.core.ObjectCodec)v7));
    Object v9 = "&";
    Object v10 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.core.JsonParser)v8),((java.lang.String)v9));
    Object v11 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v4).wrapException(((java.lang.Throwable)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v0),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6));
    Object v8 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v8));
    Object v10 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v9));
    Object v11 = "";
    Object v12 = ((com.fasterxml.jackson.databind.DeserializationContext)v7).missingTypeIdException(((com.fasterxml.jackson.databind.JavaType)v10),((java.lang.String)v11));
    Object v13 = new byte[]{};
    Object v14 = new com.fasterxml.jackson.databind.node.BinaryNode(((byte[])v13));
    Object v15 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v16 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v14),((com.fasterxml.jackson.core.ObjectCodec)v15));
    Object v17 = "&";
    Object v18 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.core.JsonParser)v16),((java.lang.String)v17));
    Object v19 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v4).unwrapAndWrapException(((com.fasterxml.jackson.databind.DeserializationContext)v7),((java.lang.Throwable)v18));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v0),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6));
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v4).createFromBoolean(((com.fasterxml.jackson.databind.DeserializationContext)v7),(((java.lang.Boolean)v8).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v0),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v6 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v9));
    Object v11 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v12 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = true;
    Object v15 = com.fasterxml.jackson.databind.util.ClassUtil.findSuperClasses(((java.lang.Class)v10),((java.lang.Class)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.fasterxml.jackson.databind.type.TypeBindings.create(((java.lang.Class)v8),((java.util.List)v15));
    Object v17 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v5),((com.fasterxml.jackson.databind.type.TypeBindings)v16));
    Object v18 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v19 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v19));
    Object v21 = false;
    Object v22 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null};
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v17),((java.lang.reflect.Constructor)v22),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v23),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v24));
    Object v26 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v27 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v26));
    Object v28 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v27));
    Object v29 = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[]{null,null};
    ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v4).configureFromArraySettings(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v25),((com.fasterxml.jackson.databind.JavaType)v28),((com.fasterxml.jackson.databind.deser.SettableBeanProperty[])v29));
    Object v30 = null;
    Object v31 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v32 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v31));
    Object v33 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v32));
    Object v34 = 1L;
    Object v35 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v4).createFromLong(((com.fasterxml.jackson.databind.DeserializationContext)v33),(((java.lang.Long)v34).longValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v0),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v4).createUsingDelegate(((com.fasterxml.jackson.databind.DeserializationContext)v7),((java.lang.Object)v8));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v0),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6));
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v9));
    Object v11 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v8),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = new byte[]{};
    Object v14 = new com.fasterxml.jackson.databind.node.BinaryNode(((byte[])v13));
    Object v15 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v16 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v14),((com.fasterxml.jackson.core.ObjectCodec)v15));
    Object v17 = "&";
    Object v18 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.core.JsonParser)v16),((java.lang.String)v17));
    Object v19 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v12).wrapException(((java.lang.Throwable)v18));
    Object v20 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v4).rewrapCtorProblem(((com.fasterxml.jackson.databind.DeserializationContext)v7),((java.lang.Throwable)v19));
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v0),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v6 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v9));
    Object v11 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v12 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = true;
    Object v15 = com.fasterxml.jackson.databind.util.ClassUtil.findSuperClasses(((java.lang.Class)v10),((java.lang.Class)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.fasterxml.jackson.databind.type.TypeBindings.create(((java.lang.Class)v8),((java.util.List)v15));
    Object v17 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v5),((com.fasterxml.jackson.databind.type.TypeBindings)v16));
    Object v18 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v19 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v19));
    Object v21 = false;
    Object v22 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null};
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v17),((java.lang.reflect.Constructor)v22),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v23),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v24));
    ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v4).configureFromDoubleCreator(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v25));
    Object v26 = null;
    Object v27 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v4).canCreateFromString();
    org.junit.Assert.assertEquals((Object)(false), v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v0),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6));
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v9));
    Object v11 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v8),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = new byte[]{};
    Object v14 = new com.fasterxml.jackson.databind.node.BinaryNode(((byte[])v13));
    Object v15 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v16 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v14),((com.fasterxml.jackson.core.ObjectCodec)v15));
    Object v17 = "&";
    Object v18 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.core.JsonParser)v16),((java.lang.String)v17));
    Object v19 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v12).wrapException(((java.lang.Throwable)v18));
    Object v20 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v4).wrapAsJsonMappingException(((com.fasterxml.jackson.databind.DeserializationContext)v7),((java.lang.Throwable)v19));
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v0),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6));
    Object v8 = "";
    Object v9 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v4).createFromString(((com.fasterxml.jackson.databind.DeserializationContext)v7),((java.lang.String)v8));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v0),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6));
    Object v8 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v8));
    Object v10 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v9));
    Object v11 = "items";
    Object v12 = "Build method '%s' has wrong return type (%s), not compatible with POJO type (%s)";
    Object v13 = ((com.fasterxml.jackson.databind.DeserializationContext)v7).invalidTypeIdException(((com.fasterxml.jackson.databind.JavaType)v10),((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = false;
    Object v15 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v4).createFromBoolean(((com.fasterxml.jackson.databind.DeserializationContext)v7),(((java.lang.Boolean)v14).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v0),((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6));
    Object v8 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v8));
    Object v10 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v9));
    Object v11 = "array";
    Object v12 = "'!";
    Object v13 = ((com.fasterxml.jackson.databind.DeserializationContext)v7).unknownTypeException(((com.fasterxml.jackson.databind.JavaType)v10),((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = ((com.fasterxml.jackson.databind.deser.std.StdValueInstantiator)v4).createUsingDefault(((com.fasterxml.jackson.databind.DeserializationContext)v7));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }
}
