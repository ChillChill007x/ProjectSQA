package com.fasterxml.jackson.databind.ser;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v4 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v2),((com.fasterxml.jackson.databind.util.RootNameLookup)v3));
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.ser.PropertyBuilder(((com.fasterxml.jackson.databind.SerializationConfig)v4),((com.fasterxml.jackson.databind.BeanDescription)v5));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).getDefaultBean();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v5 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType[])v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = false;
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v13 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v6),((java.lang.reflect.Constructor)v10),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v11),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v12));
    Object v14 = true;
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).findSerializationType(((com.fasterxml.jackson.databind.introspect.Annotated)v13),(((java.lang.Boolean)v14).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = 1;
    Object v3 = ((com.fasterxml.jackson.databind.JavaType)v1).containedTypeOrUnknown((((java.lang.Integer)v2).intValue()));
    Object v4 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).getDefaultValue(((com.fasterxml.jackson.databind.JavaType)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v1));
    Object v3 = "no double/Double-argument constructor/factory method to deserialize from Number value (%s)";
    Object v4 = true;
    Object v5 = com.fasterxml.jackson.databind.node.BooleanNode.valueOf((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v5));
    Object v7 = "[field3";
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v10 = null;
    Object v11 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v12 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v8),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v9),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v10),((com.fasterxml.jackson.databind.util.RootNameLookup)v11));
    Object v13 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v14 = false;
    Object v15 = "";
    Object v16 = "";
    Object v17 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v12),((com.fasterxml.jackson.databind.AnnotationIntrospector)v13),(((java.lang.Boolean)v14).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v19));
    Object v21 = com.fasterxml.jackson.databind.exc.InvalidFormatException.from(((com.fasterxml.jackson.core.JsonParser)v6),((java.lang.String)v7),((java.lang.Object)v18),((java.lang.Class)v20));
    Object v22 = com.fasterxml.jackson.databind.JsonMappingException.fromUnexpectedIOE(((java.io.IOException)v21));
    Object v23 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v2),((java.lang.String)v3),((java.lang.Throwable)v22));
    Object v24 = "6";
    Object v25 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v26 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0)._throwWrapped(((java.lang.Exception)v23),((java.lang.String)v24),((java.lang.Object)v25));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "Unsupported serialization shape (";
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v6 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v4),((com.fasterxml.jackson.databind.JavaType[])v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = false;
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v13 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v14 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v7),((java.lang.reflect.Constructor)v11),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v12),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).getPropertyDefaultValue(((java.lang.String)v1),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v14),((com.fasterxml.jackson.databind.JavaType)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "Can not find a deser:alizer for non-concrete Map type ";
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v6 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v4),((com.fasterxml.jackson.databind.JavaType[])v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = false;
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v13 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v14 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v7),((java.lang.reflect.Constructor)v11),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v12),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = ((com.fasterxml.jackson.databind.JavaType)v15).isThrowable();
    Object v17 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).getPropertyDefaultValue(((java.lang.String)v1),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v14),((com.fasterxml.jackson.databind.JavaType)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v5 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType[])v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = false;
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v13 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v6),((java.lang.reflect.Constructor)v10),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v11),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v12));
    Object v14 = false;
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).findSerializationType(((com.fasterxml.jackson.databind.introspect.Annotated)v13),(((java.lang.Boolean)v14).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "";
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v6 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v4),((com.fasterxml.jackson.databind.JavaType[])v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = false;
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v13 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v14 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v7),((java.lang.reflect.Constructor)v11),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v12),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).getPropertyDefaultValue(((java.lang.String)v1),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v14),((com.fasterxml.jackson.databind.JavaType)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).getDefaultValue(((com.fasterxml.jackson.databind.JavaType)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = -10;
    Object v3 = ((com.fasterxml.jackson.databind.JavaType)v1).containedTypeOrUnknown((((java.lang.Integer)v2).intValue()));
    Object v4 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).getDefaultValue(((com.fasterxml.jackson.databind.JavaType)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = com.fasterxml.jackson.databind.node.BooleanNode.valueOf((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2));
    Object v4 = "[field3";
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v7 = null;
    Object v8 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v9 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v5),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v6),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v7),((com.fasterxml.jackson.databind.util.RootNameLookup)v8));
    Object v10 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v11 = false;
    Object v12 = "";
    Object v13 = "";
    Object v14 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v9),((com.fasterxml.jackson.databind.AnnotationIntrospector)v10),(((java.lang.Boolean)v11).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = com.fasterxml.jackson.databind.exc.InvalidFormatException.from(((com.fasterxml.jackson.core.JsonParser)v3),((java.lang.String)v4),((java.lang.Object)v15),((java.lang.Class)v17));
    Object v19 = "Internal Hrror: can't find deserializer for ";
    Object v20 = true;
    Object v21 = "";
    Object v22 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v20).booleanValue()),((java.lang.String)v21));
    Object v23 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0)._throwWrapped(((java.lang.Exception)v18),((java.lang.String)v19),((java.lang.Object)v22));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "";
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v6 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v4),((com.fasterxml.jackson.databind.JavaType[])v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = false;
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v13 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v14 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v7),((java.lang.reflect.Constructor)v11),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v12),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = ((com.fasterxml.jackson.databind.JavaType)v15).getErasedSignature();
    Object v17 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).getPropertyDefaultValue(((java.lang.String)v1),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v14),((com.fasterxml.jackson.databind.JavaType)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "NON_DEFAULT";
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v6 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v4),((com.fasterxml.jackson.databind.JavaType[])v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = false;
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v13 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v14 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v7),((java.lang.reflect.Constructor)v11),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v12),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).getPropertyDefaultValue(((java.lang.String)v1),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v14),((com.fasterxml.jackson.databind.JavaType)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v1));
    Object v3 = "no double/Double-argument constructor/factory method to deserialize from Number value (%s)";
    Object v4 = true;
    Object v5 = com.fasterxml.jackson.databind.node.BooleanNode.valueOf((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v5));
    Object v7 = "[field3";
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v10 = null;
    Object v11 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v12 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v8),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v9),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v10),((com.fasterxml.jackson.databind.util.RootNameLookup)v11));
    Object v13 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v14 = false;
    Object v15 = "";
    Object v16 = "";
    Object v17 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v12),((com.fasterxml.jackson.databind.AnnotationIntrospector)v13),(((java.lang.Boolean)v14).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v19));
    Object v21 = com.fasterxml.jackson.databind.exc.InvalidFormatException.from(((com.fasterxml.jackson.core.JsonParser)v6),((java.lang.String)v7),((java.lang.Object)v18),((java.lang.Class)v20));
    Object v22 = com.fasterxml.jackson.databind.JsonMappingException.fromUnexpectedIOE(((java.io.IOException)v21));
    Object v23 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v2),((java.lang.String)v3),((java.lang.Throwable)v22));
    Object v24 = "S";
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v26 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0)._throwWrapped(((java.lang.Exception)v23),((java.lang.String)v24),((java.lang.Object)v25));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v5 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType[])v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = false;
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v13 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v6),((java.lang.reflect.Constructor)v10),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v11),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v12));
    Object v14 = false;
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = com.fasterxml.jackson.databind.util.ClassUtil.getPackageName(((java.lang.Class)v17));
    Object v19 = new java.lang.StringBuilder(((java.lang.CharSequence)v18));
    Object v20 = ((com.fasterxml.jackson.databind.JavaType)v15).getErasedSignature(((java.lang.StringBuilder)v19));
    Object v21 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).findSerializationType(((com.fasterxml.jackson.databind.introspect.Annotated)v13),(((java.lang.Boolean)v14).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "]";
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v6 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v4),((com.fasterxml.jackson.databind.JavaType[])v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = false;
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v13 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v14 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v7),((java.lang.reflect.Constructor)v11),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v12),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).getPropertyDefaultValue(((java.lang.String)v1),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v14),((com.fasterxml.jackson.databind.JavaType)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = com.fasterxml.jackson.databind.node.BooleanNode.valueOf((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2));
    Object v4 = "[field3";
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v7 = null;
    Object v8 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v9 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v5),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v6),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v7),((com.fasterxml.jackson.databind.util.RootNameLookup)v8));
    Object v10 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v11 = false;
    Object v12 = "";
    Object v13 = "";
    Object v14 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v9),((com.fasterxml.jackson.databind.AnnotationIntrospector)v10),(((java.lang.Boolean)v11).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = com.fasterxml.jackson.databind.exc.InvalidFormatException.from(((com.fasterxml.jackson.core.JsonParser)v3),((java.lang.String)v4),((java.lang.Object)v15),((java.lang.Class)v17));
    Object v19 = " ";
    Object v20 = true;
    Object v21 = "";
    Object v22 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v20).booleanValue()),((java.lang.String)v21));
    Object v23 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0)._throwWrapped(((java.lang.Exception)v18),((java.lang.String)v19),((java.lang.Object)v22));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = " ";
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v6 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v4),((com.fasterxml.jackson.databind.JavaType[])v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = false;
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v13 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v14 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v7),((java.lang.reflect.Constructor)v11),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v12),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).getPropertyDefaultValue(((java.lang.String)v1),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v14),((com.fasterxml.jackson.databind.JavaType)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "]";
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v6 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v4),((com.fasterxml.jackson.databind.JavaType[])v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = false;
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v13 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v14 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v7),((java.lang.reflect.Constructor)v11),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v12),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v13));
    Object v15 = null;
    Object v16 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v17 = null;
    Object v18 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v19 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v15),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v16),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v17),((com.fasterxml.jackson.databind.util.RootNameLookup)v18));
    Object v20 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v21 = false;
    Object v22 = "";
    Object v23 = "";
    Object v24 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v22),((java.lang.String)v23));
    Object v25 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v19),((com.fasterxml.jackson.databind.AnnotationIntrospector)v20),(((java.lang.Boolean)v21).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v24));
    Object v26 = "";
    Object v27 = "";
    Object v28 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v26),((java.lang.String)v27));
    Object v29 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder)v25),((com.fasterxml.jackson.databind.PropertyName)v28));
    Object v30 = ((com.fasterxml.jackson.databind.introspect.Annotated)v14).equals(((java.lang.Object)v29));
    Object v31 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v32 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).getPropertyDefaultValue(((java.lang.String)v1),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v14),((com.fasterxml.jackson.databind.JavaType)v31));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = " vs ";
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v6 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v4),((com.fasterxml.jackson.databind.JavaType[])v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = false;
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v13 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v14 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v7),((java.lang.reflect.Constructor)v11),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v12),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).getPropertyDefaultValue(((java.lang.String)v1),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v14),((com.fasterxml.jackson.databind.JavaType)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = com.fasterxml.jackson.databind.node.BooleanNode.valueOf((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2));
    Object v4 = "[field3";
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v7 = null;
    Object v8 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v9 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v5),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v6),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v7),((com.fasterxml.jackson.databind.util.RootNameLookup)v8));
    Object v10 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v11 = false;
    Object v12 = "";
    Object v13 = "";
    Object v14 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v9),((com.fasterxml.jackson.databind.AnnotationIntrospector)v10),(((java.lang.Boolean)v11).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = com.fasterxml.jackson.databind.exc.InvalidFormatException.from(((com.fasterxml.jackson.core.JsonParser)v3),((java.lang.String)v4),((java.lang.Object)v15),((java.lang.Class)v17));
    Object v19 = "b";
    Object v20 = com.fasterxml.jackson.annotation.JsonInclude.Value.empty();
    Object v21 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0)._throwWrapped(((java.lang.Exception)v18),((java.lang.String)v19),((java.lang.Object)v20));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v5 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType[])v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = false;
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v13 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v6),((java.lang.reflect.Constructor)v10),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v11),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v12));
    Object v14 = true;
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = ((com.fasterxml.jackson.databind.JavaType)v15).isConcrete();
    Object v17 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).findSerializationType(((com.fasterxml.jackson.databind.introspect.Annotated)v13),(((java.lang.Boolean)v14).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = ((com.fasterxml.jackson.databind.JavaType)v1).isPrimitive();
    Object v3 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).getDefaultValue(((com.fasterxml.jackson.databind.JavaType)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "' `";
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v6 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v4),((com.fasterxml.jackson.databind.JavaType[])v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = false;
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v13 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v14 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v7),((java.lang.reflect.Constructor)v11),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v12),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).getPropertyDefaultValue(((java.lang.String)v1),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v14),((com.fasterxml.jackson.databind.JavaType)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v1));
    Object v3 = "no double/Double-argument constructor/factory method to deserialize from Number value (%s)";
    Object v4 = true;
    Object v5 = com.fasterxml.jackson.databind.node.BooleanNode.valueOf((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v5));
    Object v7 = "[field3";
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v10 = null;
    Object v11 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v12 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v8),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v9),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v10),((com.fasterxml.jackson.databind.util.RootNameLookup)v11));
    Object v13 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v14 = false;
    Object v15 = "";
    Object v16 = "";
    Object v17 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v12),((com.fasterxml.jackson.databind.AnnotationIntrospector)v13),(((java.lang.Boolean)v14).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v19));
    Object v21 = com.fasterxml.jackson.databind.exc.InvalidFormatException.from(((com.fasterxml.jackson.core.JsonParser)v6),((java.lang.String)v7),((java.lang.Object)v18),((java.lang.Class)v20));
    Object v22 = com.fasterxml.jackson.databind.JsonMappingException.fromUnexpectedIOE(((java.io.IOException)v21));
    Object v23 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v2),((java.lang.String)v3),((java.lang.Throwable)v22));
    Object v24 = ")";
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v26 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0)._throwWrapped(((java.lang.Exception)v23),((java.lang.String)v24),((java.lang.Object)v25));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = com.fasterxml.jackson.databind.node.BooleanNode.valueOf((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2));
    Object v4 = "[field3";
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v7 = null;
    Object v8 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v9 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v5),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v6),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v7),((com.fasterxml.jackson.databind.util.RootNameLookup)v8));
    Object v10 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v11 = false;
    Object v12 = "";
    Object v13 = "";
    Object v14 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v9),((com.fasterxml.jackson.databind.AnnotationIntrospector)v10),(((java.lang.Boolean)v11).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = com.fasterxml.jackson.databind.exc.InvalidFormatException.from(((com.fasterxml.jackson.core.JsonParser)v3),((java.lang.String)v4),((java.lang.Object)v15),((java.lang.Class)v17));
    Object v19 = "]";
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0)._throwWrapped(((java.lang.Exception)v18),((java.lang.String)v19),((java.lang.Object)v20));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "OBJE]CT";
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v6 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v4),((com.fasterxml.jackson.databind.JavaType[])v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = false;
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v13 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v14 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v7),((java.lang.reflect.Constructor)v11),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v12),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).getPropertyDefaultValue(((java.lang.String)v1),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v14),((com.fasterxml.jackson.databind.JavaType)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).getClassAnnotations();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "Invalid delegate-creatMor definition for ";
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v6 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v4),((com.fasterxml.jackson.databind.JavaType[])v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = false;
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v13 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v14 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v7),((java.lang.reflect.Constructor)v11),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v12),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).getPropertyDefaultValue(((java.lang.String)v1),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v14),((com.fasterxml.jackson.databind.JavaType)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v1));
    Object v3 = "no double/Double-argument constructor/factory method to deserialize from Number value (%s)";
    Object v4 = true;
    Object v5 = com.fasterxml.jackson.databind.node.BooleanNode.valueOf((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v5));
    Object v7 = "[field3";
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v10 = null;
    Object v11 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v12 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v8),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v9),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v10),((com.fasterxml.jackson.databind.util.RootNameLookup)v11));
    Object v13 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v14 = false;
    Object v15 = "";
    Object v16 = "";
    Object v17 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v12),((com.fasterxml.jackson.databind.AnnotationIntrospector)v13),(((java.lang.Boolean)v14).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v19));
    Object v21 = com.fasterxml.jackson.databind.exc.InvalidFormatException.from(((com.fasterxml.jackson.core.JsonParser)v6),((java.lang.String)v7),((java.lang.Object)v18),((java.lang.Class)v20));
    Object v22 = com.fasterxml.jackson.databind.JsonMappingException.fromUnexpectedIOE(((java.io.IOException)v21));
    Object v23 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v2),((java.lang.String)v3),((java.lang.Throwable)v22));
    Object v24 = "strin4";
    Object v25 = com.fasterxml.jackson.annotation.JsonInclude.Value.empty();
    Object v26 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0)._throwWrapped(((java.lang.Exception)v23),((java.lang.String)v24),((java.lang.Object)v25));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ")";
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v6 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v4),((com.fasterxml.jackson.databind.JavaType[])v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = false;
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v13 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v14 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v7),((java.lang.reflect.Constructor)v11),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v12),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v13));
    Object v15 = new java.lang.Class[]{null,null,null};
    Object v16 = ((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v14).hasOneOf(((java.lang.Class[])v15));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).getPropertyDefaultValue(((java.lang.String)v1),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v14),((com.fasterxml.jackson.databind.JavaType)v17));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v5 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType[])v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = false;
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v13 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v6),((java.lang.reflect.Constructor)v10),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v11),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v12));
    Object v14 = true;
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = ((com.fasterxml.jackson.databind.JavaType)v15).isTypeOrSubTypeOf(((java.lang.Class)v17));
    Object v19 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).findSerializationType(((com.fasterxml.jackson.databind.introspect.Annotated)v13),(((java.lang.Boolean)v14).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "ACCEPT_EMPTY_STRIN_AS_NULL_OBJECT";
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v6 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v4),((com.fasterxml.jackson.databind.JavaType[])v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = false;
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v13 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v14 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v7),((java.lang.reflect.Constructor)v11),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v12),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = ((com.fasterxml.jackson.databind.JavaType)v15).getErasedSignature();
    Object v17 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).getPropertyDefaultValue(((java.lang.String)v1),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v14),((com.fasterxml.jackson.databind.JavaType)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JavaType)v1).isTypeOrSubTypeOf(((java.lang.Class)v3));
    Object v5 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).getDefaultValue(((com.fasterxml.jackson.databind.JavaType)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "arra";
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v6 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v4),((com.fasterxml.jackson.databind.JavaType[])v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = false;
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v13 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v14 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v7),((java.lang.reflect.Constructor)v11),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v12),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).getPropertyDefaultValue(((java.lang.String)v1),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v14),((com.fasterxml.jackson.databind.JavaType)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v5 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType[])v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = false;
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v13 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v6),((java.lang.reflect.Constructor)v10),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v11),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v12));
    Object v14 = true;
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = ((com.fasterxml.jackson.databind.JavaType)v15).getBindings();
    Object v17 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).findSerializationType(((com.fasterxml.jackson.databind.introspect.Annotated)v13),(((java.lang.Boolean)v14).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ">";
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v6 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v4),((com.fasterxml.jackson.databind.JavaType[])v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = false;
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v13 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v14 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v7),((java.lang.reflect.Constructor)v11),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v12),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = 10;
    Object v17 = ((com.fasterxml.jackson.databind.JavaType)v15).containedType((((java.lang.Integer)v16).intValue()));
    Object v18 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).getPropertyDefaultValue(((java.lang.String)v1),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v14),((com.fasterxml.jackson.databind.JavaType)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ")";
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v6 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v4),((com.fasterxml.jackson.databind.JavaType[])v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = false;
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v13 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v14 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v7),((java.lang.reflect.Constructor)v11),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v12),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).getPropertyDefaultValue(((java.lang.String)v1),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v14),((com.fasterxml.jackson.databind.JavaType)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = com.fasterxml.jackson.databind.node.BooleanNode.valueOf((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2));
    Object v4 = "[field3";
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v7 = null;
    Object v8 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v9 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v5),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v6),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v7),((com.fasterxml.jackson.databind.util.RootNameLookup)v8));
    Object v10 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v11 = false;
    Object v12 = "";
    Object v13 = "";
    Object v14 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v9),((com.fasterxml.jackson.databind.AnnotationIntrospector)v10),(((java.lang.Boolean)v11).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = com.fasterxml.jackson.databind.exc.InvalidFormatException.from(((com.fasterxml.jackson.core.JsonParser)v3),((java.lang.String)v4),((java.lang.Object)v15),((java.lang.Class)v17));
    Object v19 = "AnnotationIntrospector returned Class ";
    Object v20 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v21 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v20));
    Object v22 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0)._throwWrapped(((java.lang.Exception)v18),((java.lang.String)v19),((java.lang.Object)v21));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ":U ";
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v6 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v4),((com.fasterxml.jackson.databind.JavaType[])v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = false;
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v13 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v14 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v7),((java.lang.reflect.Constructor)v11),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v12),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).getPropertyDefaultValue(((java.lang.String)v1),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v14),((com.fasterxml.jackson.databind.JavaType)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = com.fasterxml.jackson.databind.node.BooleanNode.valueOf((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2));
    Object v4 = "[field3";
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v7 = null;
    Object v8 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v9 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v5),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v6),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v7),((com.fasterxml.jackson.databind.util.RootNameLookup)v8));
    Object v10 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v11 = false;
    Object v12 = "";
    Object v13 = "";
    Object v14 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v9),((com.fasterxml.jackson.databind.AnnotationIntrospector)v10),(((java.lang.Boolean)v11).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = com.fasterxml.jackson.databind.exc.InvalidFormatException.from(((com.fasterxml.jackson.core.JsonParser)v3),((java.lang.String)v4),((java.lang.Object)v15),((java.lang.Class)v17));
    Object v19 = "F";
    Object v20 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v21 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v20));
    Object v22 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0)._throwWrapped(((java.lang.Exception)v18),((java.lang.String)v19),((java.lang.Object)v21));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v1));
    Object v3 = "no double/Double-argument constructor/factory method to deserialize from Number value (%s)";
    Object v4 = true;
    Object v5 = com.fasterxml.jackson.databind.node.BooleanNode.valueOf((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v5));
    Object v7 = "[field3";
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v10 = null;
    Object v11 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v12 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v8),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v9),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v10),((com.fasterxml.jackson.databind.util.RootNameLookup)v11));
    Object v13 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v14 = false;
    Object v15 = "";
    Object v16 = "";
    Object v17 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v12),((com.fasterxml.jackson.databind.AnnotationIntrospector)v13),(((java.lang.Boolean)v14).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v19));
    Object v21 = com.fasterxml.jackson.databind.exc.InvalidFormatException.from(((com.fasterxml.jackson.core.JsonParser)v6),((java.lang.String)v7),((java.lang.Object)v18),((java.lang.Class)v20));
    Object v22 = com.fasterxml.jackson.databind.JsonMappingException.fromUnexpectedIOE(((java.io.IOException)v21));
    Object v23 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v2),((java.lang.String)v3),((java.lang.Throwable)v22));
    Object v24 = "4: ";
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v26 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0)._throwWrapped(((java.lang.Exception)v23),((java.lang.String)v24),((java.lang.Object)v25));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = com.fasterxml.jackson.databind.node.BooleanNode.valueOf((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2));
    Object v4 = "[field3";
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v7 = null;
    Object v8 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v9 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v5),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v6),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v7),((com.fasterxml.jackson.databind.util.RootNameLookup)v8));
    Object v10 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v11 = false;
    Object v12 = "";
    Object v13 = "";
    Object v14 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v9),((com.fasterxml.jackson.databind.AnnotationIntrospector)v10),(((java.lang.Boolean)v11).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = com.fasterxml.jackson.databind.exc.InvalidFormatException.from(((com.fasterxml.jackson.core.JsonParser)v3),((java.lang.String)v4),((java.lang.Object)v15),((java.lang.Class)v17));
    Object v19 = "o";
    Object v20 = java.nio.charset.Charset.defaultCharset();
    Object v21 = new java.io.PrintStream(((java.lang.String)v19),((java.nio.charset.Charset)v20));
    ((java.lang.Throwable)v18).printStackTrace(((java.io.PrintStream)v21));
    Object v22 = null;
    Object v23 = ")";
    Object v24 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v25 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v24));
    Object v26 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0)._throwWrapped(((java.lang.Exception)v18),((java.lang.String)v23),((java.lang.Object)v25));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "string";
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v6 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v4),((com.fasterxml.jackson.databind.JavaType[])v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = false;
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v13 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v14 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v7),((java.lang.reflect.Constructor)v11),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v12),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = 77;
    Object v17 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v16).intValue()));
    Object v18 = ((com.fasterxml.jackson.databind.JavaType)v15).withValueHandler(((java.lang.Object)v17));
    Object v19 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).getPropertyDefaultValue(((java.lang.String)v1),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v14),((com.fasterxml.jackson.databind.JavaType)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = com.fasterxml.jackson.databind.node.BooleanNode.valueOf((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2));
    Object v4 = "[field3";
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v7 = null;
    Object v8 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v9 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v5),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v6),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v7),((com.fasterxml.jackson.databind.util.RootNameLookup)v8));
    Object v10 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v11 = false;
    Object v12 = "";
    Object v13 = "";
    Object v14 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v9),((com.fasterxml.jackson.databind.AnnotationIntrospector)v10),(((java.lang.Boolean)v11).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = com.fasterxml.jackson.databind.exc.InvalidFormatException.from(((com.fasterxml.jackson.core.JsonParser)v3),((java.lang.String)v4),((java.lang.Object)v15),((java.lang.Class)v17));
    Object v19 = "";
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v21 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0)._throwWrapped(((java.lang.Exception)v18),((java.lang.String)v19),((java.lang.Object)v20));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "Can not deserialize a POJO (of type %s) from non-Array representation (token: %s): type/property designed to be serialized a?s JSON Array";
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v6 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v4),((com.fasterxml.jackson.databind.JavaType[])v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = false;
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v13 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v14 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v7),((java.lang.reflect.Constructor)v11),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v12),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).getPropertyDefaultValue(((java.lang.String)v1),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v14),((com.fasterxml.jackson.databind.JavaType)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v5 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType[])v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = false;
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v13 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v6),((java.lang.reflect.Constructor)v10),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v11),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v12));
    Object v14 = ((com.fasterxml.jackson.databind.introspect.Annotated)v13).hashCode();
    Object v15 = false;
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).findSerializationType(((com.fasterxml.jackson.databind.introspect.Annotated)v13),(((java.lang.Boolean)v15).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v16));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v5 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType[])v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = false;
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v13 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v6),((java.lang.reflect.Constructor)v10),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v11),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v12));
    Object v14 = false;
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = ((com.fasterxml.jackson.databind.JavaType)v15).findTypeParameters(((java.lang.Class)v17));
    Object v19 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).findSerializationType(((com.fasterxml.jackson.databind.introspect.Annotated)v13),(((java.lang.Boolean)v14).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = com.fasterxml.jackson.databind.node.BooleanNode.valueOf((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2));
    Object v4 = "[field3";
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v7 = null;
    Object v8 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v9 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v5),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v6),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v7),((com.fasterxml.jackson.databind.util.RootNameLookup)v8));
    Object v10 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v11 = false;
    Object v12 = "";
    Object v13 = "";
    Object v14 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v9),((com.fasterxml.jackson.databind.AnnotationIntrospector)v10),(((java.lang.Boolean)v11).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = com.fasterxml.jackson.databind.exc.InvalidFormatException.from(((com.fasterxml.jackson.core.JsonParser)v3),((java.lang.String)v4),((java.lang.Object)v15),((java.lang.Class)v17));
    Object v19 = ")";
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v22 = null;
    Object v23 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v24 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v20),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v21),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v22),((com.fasterxml.jackson.databind.util.RootNameLookup)v23));
    Object v25 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v26 = false;
    Object v27 = "";
    Object v28 = "";
    Object v29 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v27),((java.lang.String)v28));
    Object v30 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v24),((com.fasterxml.jackson.databind.AnnotationIntrospector)v25),(((java.lang.Boolean)v26).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v29));
    Object v31 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0)._throwWrapped(((java.lang.Exception)v18),((java.lang.String)v19),((java.lang.Object)v30));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = com.fasterxml.jackson.databind.node.BooleanNode.valueOf((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2));
    Object v4 = "[field3";
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v7 = null;
    Object v8 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v9 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v5),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v6),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v7),((com.fasterxml.jackson.databind.util.RootNameLookup)v8));
    Object v10 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v11 = false;
    Object v12 = "";
    Object v13 = "";
    Object v14 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v9),((com.fasterxml.jackson.databind.AnnotationIntrospector)v10),(((java.lang.Boolean)v11).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = com.fasterxml.jackson.databind.exc.InvalidFormatException.from(((com.fasterxml.jackson.core.JsonParser)v3),((java.lang.String)v4),((java.lang.Object)v15),((java.lang.Class)v17));
    Object v19 = "";
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = com.fasterxml.jackson.databind.util.ClassUtil.getPackageName(((java.lang.Class)v21));
    Object v23 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0)._throwWrapped(((java.lang.Exception)v18),((java.lang.String)v19),((java.lang.Object)v22));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "AnnotationIntrospector returned deserializer definition of type ";
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v6 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v4),((com.fasterxml.jackson.databind.JavaType[])v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = false;
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v13 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v14 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v7),((java.lang.reflect.Constructor)v11),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v12),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).getPropertyDefaultValue(((java.lang.String)v1),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v14),((com.fasterxml.jackson.databind.JavaType)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = com.fasterxml.jackson.databind.node.BooleanNode.valueOf((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2));
    Object v4 = "[field3";
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v7 = null;
    Object v8 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v9 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v5),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v6),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v7),((com.fasterxml.jackson.databind.util.RootNameLookup)v8));
    Object v10 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v11 = false;
    Object v12 = "";
    Object v13 = "";
    Object v14 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v9),((com.fasterxml.jackson.databind.AnnotationIntrospector)v10),(((java.lang.Boolean)v11).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = com.fasterxml.jackson.databind.exc.InvalidFormatException.from(((com.fasterxml.jackson.core.JsonParser)v3),((java.lang.String)v4),((java.lang.Object)v15),((java.lang.Class)v17));
    Object v19 = ((java.lang.Throwable)v18).getStackTrace();
    Object v20 = "yyyy-MM-dd'T'HH:mm:ss.SSSZ";
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v23 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v21),((com.fasterxml.jackson.databind.type.TypeFactory)v22));
    Object v24 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0)._throwWrapped(((java.lang.Exception)v18),((java.lang.String)v20),((java.lang.Object)v23));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = com.fasterxml.jackson.databind.node.BooleanNode.valueOf((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2));
    Object v4 = "[field3";
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v7 = null;
    Object v8 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v9 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v5),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v6),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v7),((com.fasterxml.jackson.databind.util.RootNameLookup)v8));
    Object v10 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v11 = false;
    Object v12 = "";
    Object v13 = "";
    Object v14 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v9),((com.fasterxml.jackson.databind.AnnotationIntrospector)v10),(((java.lang.Boolean)v11).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = com.fasterxml.jackson.databind.exc.InvalidFormatException.from(((com.fasterxml.jackson.core.JsonParser)v3),((java.lang.String)v4),((java.lang.Object)v15),((java.lang.Class)v17));
    Object v19 = ((java.lang.Throwable)v18).getStackTrace();
    Object v20 = "#";
    Object v21 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v22 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0)._throwWrapped(((java.lang.Exception)v18),((java.lang.String)v20),((java.lang.Object)v21));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "items";
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v6 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v4),((com.fasterxml.jackson.databind.JavaType[])v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = false;
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v13 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v14 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v7),((java.lang.reflect.Constructor)v11),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v12),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).getPropertyDefaultValue(((java.lang.String)v1),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v14),((com.fasterxml.jackson.databind.JavaType)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v1));
    Object v3 = "no double/Double-argument constructor/factory method to deserialize from Number value (%s)";
    Object v4 = true;
    Object v5 = com.fasterxml.jackson.databind.node.BooleanNode.valueOf((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v5));
    Object v7 = "[field3";
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v10 = null;
    Object v11 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v12 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v8),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v9),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v10),((com.fasterxml.jackson.databind.util.RootNameLookup)v11));
    Object v13 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v14 = false;
    Object v15 = "";
    Object v16 = "";
    Object v17 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v12),((com.fasterxml.jackson.databind.AnnotationIntrospector)v13),(((java.lang.Boolean)v14).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v19));
    Object v21 = com.fasterxml.jackson.databind.exc.InvalidFormatException.from(((com.fasterxml.jackson.core.JsonParser)v6),((java.lang.String)v7),((java.lang.Object)v18),((java.lang.Class)v20));
    Object v22 = com.fasterxml.jackson.databind.JsonMappingException.fromUnexpectedIOE(((java.io.IOException)v21));
    Object v23 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v2),((java.lang.String)v3),((java.lang.Throwable)v22));
    Object v24 = ":&";
    Object v25 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v26 = -3L;
    Object v27 = -4;
    Object v28 = -21;
    Object v29 = new com.fasterxml.jackson.core.JsonLocation(((java.lang.Object)v25),(((java.lang.Long)v26).longValue()),(((java.lang.Integer)v27).intValue()),(((java.lang.Integer)v28).intValue()));
    Object v30 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0)._throwWrapped(((java.lang.Exception)v23),((java.lang.String)v24),((java.lang.Object)v29));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "[NULL]";
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v6 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v4),((com.fasterxml.jackson.databind.JavaType[])v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = false;
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v13 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v14 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v7),((java.lang.reflect.Constructor)v11),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v12),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v13));
    Object v15 = -19;
    Object v16 = 15;
    Object v17 = 0;
    Object v18 = -10;
    Object v19 = 7;
    Object v20 = -6;
    Object v21 = new java.util.Date((((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()));
    Object v22 = ((com.fasterxml.jackson.databind.introspect.Annotated)v14).equals(((java.lang.Object)v21));
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = ((com.fasterxml.jackson.core.type.ResolvedType)v23).isReferenceType();
    Object v25 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).getPropertyDefaultValue(((java.lang.String)v1),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v14),((com.fasterxml.jackson.databind.JavaType)v23));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "Current token not START_OBJECT(needed to unwrap root name '%s'), but %s";
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v6 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v4),((com.fasterxml.jackson.databind.JavaType[])v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = false;
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v13 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v14 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v7),((java.lang.reflect.Constructor)v11),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v12),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).getPropertyDefaultValue(((java.lang.String)v1),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v14),((com.fasterxml.jackson.databind.JavaType)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "null";
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v6 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v4),((com.fasterxml.jackson.databind.JavaType[])v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = false;
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v13 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v14 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v7),((java.lang.reflect.Constructor)v11),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v12),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).getPropertyDefaultValue(((java.lang.String)v1),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v14),((com.fasterxml.jackson.databind.JavaType)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = com.fasterxml.jackson.databind.node.BooleanNode.valueOf((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2));
    Object v4 = "[field3";
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v7 = null;
    Object v8 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v9 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v5),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v6),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v7),((com.fasterxml.jackson.databind.util.RootNameLookup)v8));
    Object v10 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v11 = false;
    Object v12 = "";
    Object v13 = "";
    Object v14 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v9),((com.fasterxml.jackson.databind.AnnotationIntrospector)v10),(((java.lang.Boolean)v11).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = com.fasterxml.jackson.databind.exc.InvalidFormatException.from(((com.fasterxml.jackson.core.JsonParser)v3),((java.lang.String)v4),((java.lang.Object)v15),((java.lang.Class)v17));
    Object v19 = "'; inject id '";
    Object v20 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v21 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v20));
    Object v22 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0)._throwWrapped(((java.lang.Exception)v18),((java.lang.String)v19),((java.lang.Object)v21));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v5 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType[])v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = false;
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v13 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v6),((java.lang.reflect.Constructor)v10),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v11),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v12));
    Object v14 = true;
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = ((com.fasterxml.jackson.databind.JavaType)v15).toString();
    Object v17 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).findSerializationType(((com.fasterxml.jackson.databind.introspect.Annotated)v13),(((java.lang.Boolean)v14).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = "";
    Object v3 = java.util.TimeZone.getTimeZone(((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JavaType)v1).equals(((java.lang.Object)v3));
    Object v5 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).getDefaultValue(((com.fasterxml.jackson.databind.JavaType)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v5 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType[])v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = false;
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v13 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v6),((java.lang.reflect.Constructor)v10),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v11),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v12));
    Object v14 = false;
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = ((com.fasterxml.jackson.databind.JavaType)v15).getErasedSignature();
    Object v17 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).findSerializationType(((com.fasterxml.jackson.databind.introspect.Annotated)v13),(((java.lang.Boolean)v14).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ")C";
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v6 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v4),((com.fasterxml.jackson.databind.JavaType[])v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = false;
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v13 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v14 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v7),((java.lang.reflect.Constructor)v11),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v12),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v13));
    Object v15 = ((com.fasterxml.jackson.databind.introspect.Annotated)v14).getType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).getPropertyDefaultValue(((java.lang.String)v1),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v14),((com.fasterxml.jackson.databind.JavaType)v16));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "=";
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v6 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v4),((com.fasterxml.jackson.databind.JavaType[])v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = false;
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v13 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v14 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v7),((java.lang.reflect.Constructor)v11),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v12),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).getPropertyDefaultValue(((java.lang.String)v1),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v14),((com.fasterxml.jackson.databind.JavaType)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ")";
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v6 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v4),((com.fasterxml.jackson.databind.JavaType[])v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = false;
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v13 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v14 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v7),((java.lang.reflect.Constructor)v11),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v12),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v13));
    Object v15 = ((com.fasterxml.jackson.databind.introspect.Annotated)v14).getName();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).getPropertyDefaultValue(((java.lang.String)v1),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v14),((com.fasterxml.jackson.databind.JavaType)v16));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v1));
    Object v3 = "no double/Double-argument constructor/factory method to deserialize from Number value (%s)";
    Object v4 = true;
    Object v5 = com.fasterxml.jackson.databind.node.BooleanNode.valueOf((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v5));
    Object v7 = "[field3";
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v10 = null;
    Object v11 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v12 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v8),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v9),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v10),((com.fasterxml.jackson.databind.util.RootNameLookup)v11));
    Object v13 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v14 = false;
    Object v15 = "";
    Object v16 = "";
    Object v17 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v12),((com.fasterxml.jackson.databind.AnnotationIntrospector)v13),(((java.lang.Boolean)v14).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v19));
    Object v21 = com.fasterxml.jackson.databind.exc.InvalidFormatException.from(((com.fasterxml.jackson.core.JsonParser)v6),((java.lang.String)v7),((java.lang.Object)v18),((java.lang.Class)v20));
    Object v22 = com.fasterxml.jackson.databind.JsonMappingException.fromUnexpectedIOE(((java.io.IOException)v21));
    Object v23 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v2),((java.lang.String)v3),((java.lang.Throwable)v22));
    Object v24 = "type3";
    Object v25 = com.fasterxml.jackson.annotation.JsonInclude.Value.empty();
    Object v26 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0)._throwWrapped(((java.lang.Exception)v23),((java.lang.String)v24),((java.lang.Object)v25));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v5 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType[])v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = false;
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v13 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v6),((java.lang.reflect.Constructor)v10),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v11),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v14));
    Object v16 = ((com.fasterxml.jackson.databind.introspect.Annotated)v13).getAnnotation(((java.lang.Class)v15));
    Object v17 = true;
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).findSerializationType(((com.fasterxml.jackson.databind.introspect.Annotated)v13),(((java.lang.Boolean)v17).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v18));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v5 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType[])v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = false;
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v13 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v6),((java.lang.reflect.Constructor)v10),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v11),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v12));
    Object v14 = false;
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = ((com.fasterxml.jackson.databind.JavaType)v15).isThrowable();
    Object v17 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).findSerializationType(((com.fasterxml.jackson.databind.introspect.Annotated)v13),(((java.lang.Boolean)v14).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v5 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType[])v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = false;
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v13 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v6),((java.lang.reflect.Constructor)v10),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v11),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v12));
    Object v14 = false;
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = ((com.fasterxml.jackson.databind.JavaType)v15).getInterfaces();
    Object v17 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).findSerializationType(((com.fasterxml.jackson.databind.introspect.Annotated)v13),(((java.lang.Boolean)v14).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = com.fasterxml.jackson.databind.node.BooleanNode.valueOf((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2));
    Object v4 = "[field3";
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v7 = null;
    Object v8 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v9 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v5),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v6),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v7),((com.fasterxml.jackson.databind.util.RootNameLookup)v8));
    Object v10 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v11 = false;
    Object v12 = "";
    Object v13 = "";
    Object v14 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v9),((com.fasterxml.jackson.databind.AnnotationIntrospector)v10),(((java.lang.Boolean)v11).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = com.fasterxml.jackson.databind.exc.InvalidFormatException.from(((com.fasterxml.jackson.core.JsonParser)v3),((java.lang.String)v4),((java.lang.Object)v15),((java.lang.Class)v17));
    Object v19 = "";
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v22 = null;
    Object v23 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v24 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v20),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v21),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v22),((com.fasterxml.jackson.databind.util.RootNameLookup)v23));
    Object v25 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v26 = false;
    Object v27 = "";
    Object v28 = "";
    Object v29 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v27),((java.lang.String)v28));
    Object v30 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v24),((com.fasterxml.jackson.databind.AnnotationIntrospector)v25),(((java.lang.Boolean)v26).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v29));
    Object v31 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0)._throwWrapped(((java.lang.Exception)v18),((java.lang.String)v19),((java.lang.Object)v30));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ", ";
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v6 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v4),((com.fasterxml.jackson.databind.JavaType[])v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = false;
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v13 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v14 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v7),((java.lang.reflect.Constructor)v11),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v12),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = -19;
    Object v17 = 15;
    Object v18 = 0;
    Object v19 = -10;
    Object v20 = 7;
    Object v21 = -6;
    Object v22 = new java.util.Date((((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()));
    Object v23 = ((com.fasterxml.jackson.databind.JavaType)v15).withValueHandler(((java.lang.Object)v22));
    Object v24 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).getPropertyDefaultValue(((java.lang.String)v1),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v14),((com.fasterxml.jackson.databind.JavaType)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ":";
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v6 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v4),((com.fasterxml.jackson.databind.JavaType[])v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = false;
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v13 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v14 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v7),((java.lang.reflect.Constructor)v11),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v12),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = com.fasterxml.jackson.databind.util.ClassUtil.getPackageName(((java.lang.Class)v17));
    Object v19 = new java.lang.StringBuilder(((java.lang.CharSequence)v18));
    Object v20 = ((com.fasterxml.jackson.databind.JavaType)v15).getGenericSignature(((java.lang.StringBuilder)v19));
    Object v21 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).getPropertyDefaultValue(((java.lang.String)v1),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v14),((com.fasterxml.jackson.databind.JavaType)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v5 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType[])v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = false;
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v13 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v6),((java.lang.reflect.Constructor)v10),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v11),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v12));
    Object v14 = ((com.fasterxml.jackson.databind.introspect.Annotated)v13).getRawType();
    Object v15 = true;
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v17));
    Object v19 = com.fasterxml.jackson.databind.util.ClassUtil.getPackageName(((java.lang.Class)v18));
    Object v20 = new java.lang.StringBuilder(((java.lang.CharSequence)v19));
    Object v21 = ((com.fasterxml.jackson.databind.JavaType)v16).getGenericSignature(((java.lang.StringBuilder)v20));
    Object v22 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).findSerializationType(((com.fasterxml.jackson.databind.introspect.Annotated)v13),(((java.lang.Boolean)v15).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v16));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v5 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType[])v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = false;
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v13 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v6),((java.lang.reflect.Constructor)v10),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v11),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v12));
    Object v14 = false;
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = ((com.fasterxml.jackson.core.type.ResolvedType)v15).toCanonical();
    Object v17 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).findSerializationType(((com.fasterxml.jackson.databind.introspect.Annotated)v13),(((java.lang.Boolean)v14).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "@";
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v6 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v4),((com.fasterxml.jackson.databind.JavaType[])v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = false;
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v13 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v14 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v7),((java.lang.reflect.Constructor)v11),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v12),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).getPropertyDefaultValue(((java.lang.String)v1),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v14),((com.fasterxml.jackson.databind.JavaType)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = com.fasterxml.jackson.databind.node.BooleanNode.valueOf((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2));
    Object v4 = "[field3";
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v7 = null;
    Object v8 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v9 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v5),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v6),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v7),((com.fasterxml.jackson.databind.util.RootNameLookup)v8));
    Object v10 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v11 = false;
    Object v12 = "";
    Object v13 = "";
    Object v14 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v9),((com.fasterxml.jackson.databind.AnnotationIntrospector)v10),(((java.lang.Boolean)v11).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = com.fasterxml.jackson.databind.exc.InvalidFormatException.from(((com.fasterxml.jackson.core.JsonParser)v3),((java.lang.String)v4),((java.lang.Object)v15),((java.lang.Class)v17));
    Object v19 = "";
    Object v20 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v21 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v20));
    Object v22 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0)._throwWrapped(((java.lang.Exception)v18),((java.lang.String)v19),((java.lang.Object)v21));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ", encountered ";
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v6 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v4),((com.fasterxml.jackson.databind.JavaType[])v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = false;
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v13 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v14 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v7),((java.lang.reflect.Constructor)v11),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v12),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = ((com.fasterxml.jackson.databind.JavaType)v15).getInterfaces();
    Object v17 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).getPropertyDefaultValue(((java.lang.String)v1),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v14),((com.fasterxml.jackson.databind.JavaType)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = com.fasterxml.jackson.databind.node.BooleanNode.valueOf((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2));
    Object v4 = "[field3";
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v7 = null;
    Object v8 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v9 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v5),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v6),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v7),((com.fasterxml.jackson.databind.util.RootNameLookup)v8));
    Object v10 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v11 = false;
    Object v12 = "";
    Object v13 = "";
    Object v14 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v9),((com.fasterxml.jackson.databind.AnnotationIntrospector)v10),(((java.lang.Boolean)v11).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = com.fasterxml.jackson.databind.exc.InvalidFormatException.from(((com.fasterxml.jackson.core.JsonParser)v3),((java.lang.String)v4),((java.lang.Object)v15),((java.lang.Class)v17));
    Object v19 = ((java.lang.Throwable)v18).getSuppressed();
    Object v20 = "string";
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0)._throwWrapped(((java.lang.Exception)v18),((java.lang.String)v20),((java.lang.Object)v21));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "not a valfid representation";
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v6 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v4),((com.fasterxml.jackson.databind.JavaType[])v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = false;
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v13 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v14 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v7),((java.lang.reflect.Constructor)v11),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v12),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).getPropertyDefaultValue(((java.lang.String)v1),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v14),((com.fasterxml.jackson.databind.JavaType)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = com.fasterxml.jackson.databind.node.BooleanNode.valueOf((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2));
    Object v4 = "[field3";
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v7 = null;
    Object v8 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v9 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v5),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v6),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v7),((com.fasterxml.jackson.databind.util.RootNameLookup)v8));
    Object v10 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v11 = false;
    Object v12 = "";
    Object v13 = "";
    Object v14 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v9),((com.fasterxml.jackson.databind.AnnotationIntrospector)v10),(((java.lang.Boolean)v11).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = com.fasterxml.jackson.databind.exc.InvalidFormatException.from(((com.fasterxml.jackson.core.JsonParser)v3),((java.lang.String)v4),((java.lang.Object)v15),((java.lang.Class)v17));
    Object v19 = "";
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0)._throwWrapped(((java.lang.Exception)v18),((java.lang.String)v19),((java.lang.Object)v20));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = com.fasterxml.jackson.databind.node.BooleanNode.valueOf((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2));
    Object v4 = "[field3";
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v7 = null;
    Object v8 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v9 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v5),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v6),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v7),((com.fasterxml.jackson.databind.util.RootNameLookup)v8));
    Object v10 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v11 = false;
    Object v12 = "";
    Object v13 = "";
    Object v14 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v9),((com.fasterxml.jackson.databind.AnnotationIntrospector)v10),(((java.lang.Boolean)v11).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = com.fasterxml.jackson.databind.exc.InvalidFormatException.from(((com.fasterxml.jackson.core.JsonParser)v3),((java.lang.String)v4),((java.lang.Object)v15),((java.lang.Class)v17));
    Object v19 = ")";
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0)._throwWrapped(((java.lang.Exception)v18),((java.lang.String)v19),((java.lang.Object)v21));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ")";
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v6 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v4),((com.fasterxml.jackson.databind.JavaType[])v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = false;
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v13 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v14 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v7),((java.lang.reflect.Constructor)v11),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v12),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = ((com.fasterxml.jackson.databind.introspect.Annotated)v14).equals(((java.lang.Object)v15));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).getPropertyDefaultValue(((java.lang.String)v1),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v14),((com.fasterxml.jackson.databind.JavaType)v17));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "() returned value of type ";
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v6 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v4),((com.fasterxml.jackson.databind.JavaType[])v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = false;
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v13 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v14 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v7),((java.lang.reflect.Constructor)v11),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v12),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = ((com.fasterxml.jackson.databind.JavaType)v15).getBindings();
    Object v17 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).getPropertyDefaultValue(((java.lang.String)v1),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v14),((com.fasterxml.jackson.databind.JavaType)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = ((com.fasterxml.jackson.databind.JavaType)v1).hasGenericTypes();
    Object v3 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).getDefaultValue(((com.fasterxml.jackson.databind.JavaType)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v1));
    Object v3 = "no double/Double-argument constructor/factory method to deserialize from Number value (%s)";
    Object v4 = true;
    Object v5 = com.fasterxml.jackson.databind.node.BooleanNode.valueOf((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v5));
    Object v7 = "[field3";
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v10 = null;
    Object v11 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v12 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v8),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v9),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v10),((com.fasterxml.jackson.databind.util.RootNameLookup)v11));
    Object v13 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v14 = false;
    Object v15 = "";
    Object v16 = "";
    Object v17 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v12),((com.fasterxml.jackson.databind.AnnotationIntrospector)v13),(((java.lang.Boolean)v14).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v19));
    Object v21 = com.fasterxml.jackson.databind.exc.InvalidFormatException.from(((com.fasterxml.jackson.core.JsonParser)v6),((java.lang.String)v7),((java.lang.Object)v18),((java.lang.Class)v20));
    Object v22 = com.fasterxml.jackson.databind.JsonMappingException.fromUnexpectedIOE(((java.io.IOException)v21));
    Object v23 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v2),((java.lang.String)v3),((java.lang.Throwable)v22));
    Object v24 = ((java.lang.Throwable)v23).getStackTrace();
    Object v25 = "";
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v26));
    Object v28 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v27));
    Object v29 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0)._throwWrapped(((java.lang.Exception)v23),((java.lang.String)v25),((java.lang.Object)v28));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ":_";
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v6 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v4),((com.fasterxml.jackson.databind.JavaType[])v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = false;
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v13 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v14 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v7),((java.lang.reflect.Constructor)v11),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v12),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).getPropertyDefaultValue(((java.lang.String)v1),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v14),((com.fasterxml.jackson.databind.JavaType)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = com.fasterxml.jackson.databind.node.BooleanNode.valueOf((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2));
    Object v4 = "[field3";
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v7 = null;
    Object v8 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v9 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v5),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v6),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v7),((com.fasterxml.jackson.databind.util.RootNameLookup)v8));
    Object v10 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v11 = false;
    Object v12 = "";
    Object v13 = "";
    Object v14 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v9),((com.fasterxml.jackson.databind.AnnotationIntrospector)v10),(((java.lang.Boolean)v11).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = com.fasterxml.jackson.databind.exc.InvalidFormatException.from(((com.fasterxml.jackson.core.JsonParser)v3),((java.lang.String)v4),((java.lang.Object)v15),((java.lang.Class)v17));
    Object v19 = ((java.lang.Throwable)v18).fillInStackTrace();
    Object v20 = "H";
    Object v21 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v22 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0)._throwWrapped(((java.lang.Exception)v18),((java.lang.String)v20),((java.lang.Object)v21));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JavaType)v1).forcedNarrowBy(((java.lang.Class)v3));
    Object v5 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).getDefaultValue(((com.fasterxml.jackson.databind.JavaType)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "obj8ct";
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v6 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v4),((com.fasterxml.jackson.databind.JavaType[])v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = false;
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v13 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v14 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v7),((java.lang.reflect.Constructor)v11),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v12),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = ((com.fasterxml.jackson.databind.JavaType)v15).forcedNarrowBy(((java.lang.Class)v17));
    Object v19 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).getPropertyDefaultValue(((java.lang.String)v1),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v14),((com.fasterxml.jackson.databind.JavaType)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = " Cvs ";
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v6 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v4),((com.fasterxml.jackson.databind.JavaType[])v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = false;
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v13 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v14 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v7),((java.lang.reflect.Constructor)v11),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v12),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v13));
    Object v15 = ((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v14).getMember();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).getPropertyDefaultValue(((java.lang.String)v1),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v14),((com.fasterxml.jackson.databind.JavaType)v16));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v1));
    Object v3 = "no double/Double-argument constructor/factory method to deserialize from Number value (%s)";
    Object v4 = true;
    Object v5 = com.fasterxml.jackson.databind.node.BooleanNode.valueOf((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v5));
    Object v7 = "[field3";
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v10 = null;
    Object v11 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v12 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v8),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v9),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v10),((com.fasterxml.jackson.databind.util.RootNameLookup)v11));
    Object v13 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v14 = false;
    Object v15 = "";
    Object v16 = "";
    Object v17 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v12),((com.fasterxml.jackson.databind.AnnotationIntrospector)v13),(((java.lang.Boolean)v14).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v19));
    Object v21 = com.fasterxml.jackson.databind.exc.InvalidFormatException.from(((com.fasterxml.jackson.core.JsonParser)v6),((java.lang.String)v7),((java.lang.Object)v18),((java.lang.Class)v20));
    Object v22 = com.fasterxml.jackson.databind.JsonMappingException.fromUnexpectedIOE(((java.io.IOException)v21));
    Object v23 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v2),((java.lang.String)v3),((java.lang.Throwable)v22));
    Object v24 = ": class expects ";
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v26 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0)._throwWrapped(((java.lang.Exception)v23),((java.lang.String)v24),((java.lang.Object)v25));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = com.fasterxml.jackson.databind.node.BooleanNode.valueOf((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2));
    Object v4 = "[field3";
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v7 = null;
    Object v8 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v9 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v5),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v6),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v7),((com.fasterxml.jackson.databind.util.RootNameLookup)v8));
    Object v10 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v11 = false;
    Object v12 = "";
    Object v13 = "";
    Object v14 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v9),((com.fasterxml.jackson.databind.AnnotationIntrospector)v10),(((java.lang.Boolean)v11).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = com.fasterxml.jackson.databind.exc.InvalidFormatException.from(((com.fasterxml.jackson.core.JsonParser)v3),((java.lang.String)v4),((java.lang.Object)v15),((java.lang.Class)v17));
    Object v19 = "strig";
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v22 = null;
    Object v23 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v24 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v20),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v21),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v22),((com.fasterxml.jackson.databind.util.RootNameLookup)v23));
    Object v25 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v26 = false;
    Object v27 = "";
    Object v28 = "";
    Object v29 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v27),((java.lang.String)v28));
    Object v30 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v24),((com.fasterxml.jackson.databind.AnnotationIntrospector)v25),(((java.lang.Boolean)v26).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v29));
    Object v31 = "";
    Object v32 = "";
    Object v33 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v31),((java.lang.String)v32));
    Object v34 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder)v30),((com.fasterxml.jackson.databind.PropertyName)v33));
    Object v35 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0)._throwWrapped(((java.lang.Exception)v18),((java.lang.String)v19),((java.lang.Object)v34));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "falseL";
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v6 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v4),((com.fasterxml.jackson.databind.JavaType[])v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = false;
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v13 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v14 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v7),((java.lang.reflect.Constructor)v11),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v12),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v13));
    Object v15 = ((com.fasterxml.jackson.databind.introspect.Annotated)v14).hashCode();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = ((com.fasterxml.jackson.databind.JavaType)v16).getBindings();
    Object v18 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).getPropertyDefaultValue(((java.lang.String)v1),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v14),((com.fasterxml.jackson.databind.JavaType)v16));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.util.ClassUtil.getPackageName(((java.lang.Class)v3));
    Object v5 = new java.lang.StringBuilder(((java.lang.CharSequence)v4));
    Object v6 = ((com.fasterxml.jackson.databind.JavaType)v1).getErasedSignature(((java.lang.StringBuilder)v5));
    Object v7 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).getDefaultValue(((com.fasterxml.jackson.databind.JavaType)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = com.fasterxml.jackson.databind.node.BooleanNode.valueOf((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2));
    Object v4 = "[field3";
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v7 = null;
    Object v8 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v9 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v5),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v6),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v7),((com.fasterxml.jackson.databind.util.RootNameLookup)v8));
    Object v10 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v11 = false;
    Object v12 = "";
    Object v13 = "";
    Object v14 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v9),((com.fasterxml.jackson.databind.AnnotationIntrospector)v10),(((java.lang.Boolean)v11).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = com.fasterxml.jackson.databind.exc.InvalidFormatException.from(((com.fasterxml.jackson.core.JsonParser)v3),((java.lang.String)v4),((java.lang.Object)v15),((java.lang.Class)v17));
    Object v19 = "string";
    Object v20 = com.fasterxml.jackson.databind.cfg.ContextAttributes.getEmpty();
    Object v21 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0)._throwWrapped(((java.lang.Exception)v18),((java.lang.String)v19),((java.lang.Object)v20));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = com.fasterxml.jackson.databind.node.BooleanNode.valueOf((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2));
    Object v4 = "[field3";
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v7 = null;
    Object v8 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v9 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v5),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v6),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v7),((com.fasterxml.jackson.databind.util.RootNameLookup)v8));
    Object v10 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v11 = false;
    Object v12 = "";
    Object v13 = "";
    Object v14 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v9),((com.fasterxml.jackson.databind.AnnotationIntrospector)v10),(((java.lang.Boolean)v11).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = com.fasterxml.jackson.databind.exc.InvalidFormatException.from(((com.fasterxml.jackson.core.JsonParser)v3),((java.lang.String)v4),((java.lang.Object)v15),((java.lang.Class)v17));
    Object v19 = "array";
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v21));
    Object v23 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v24 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v22),((com.fasterxml.jackson.databind.JavaType[])v23));
    Object v25 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v20),((com.fasterxml.jackson.databind.type.TypeBindings)v24));
    Object v26 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0)._throwWrapped(((java.lang.Exception)v18),((java.lang.String)v19),((java.lang.Object)v25));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "artay";
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v6 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v4),((com.fasterxml.jackson.databind.JavaType[])v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = false;
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v13 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v14 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v7),((java.lang.reflect.Constructor)v11),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v12),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).getPropertyDefaultValue(((java.lang.String)v1),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v14),((com.fasterxml.jackson.databind.JavaType)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "unabe to parse key as Class";
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v6 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v4),((com.fasterxml.jackson.databind.JavaType[])v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = false;
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v13 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v14 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v7),((java.lang.reflect.Constructor)v11),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v12),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0).getPropertyDefaultValue(((java.lang.String)v1),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v14),((com.fasterxml.jackson.databind.JavaType)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v1));
    Object v3 = "no double/Double-argument constructor/factory method to deserialize from Number value (%s)";
    Object v4 = true;
    Object v5 = com.fasterxml.jackson.databind.node.BooleanNode.valueOf((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v5));
    Object v7 = "[field3";
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v10 = null;
    Object v11 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v12 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v8),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v9),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v10),((com.fasterxml.jackson.databind.util.RootNameLookup)v11));
    Object v13 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v14 = false;
    Object v15 = "";
    Object v16 = "";
    Object v17 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v12),((com.fasterxml.jackson.databind.AnnotationIntrospector)v13),(((java.lang.Boolean)v14).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v19));
    Object v21 = com.fasterxml.jackson.databind.exc.InvalidFormatException.from(((com.fasterxml.jackson.core.JsonParser)v6),((java.lang.String)v7),((java.lang.Object)v18),((java.lang.Class)v20));
    Object v22 = com.fasterxml.jackson.databind.JsonMappingException.fromUnexpectedIOE(((java.io.IOException)v21));
    Object v23 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v2),((java.lang.String)v3),((java.lang.Throwable)v22));
    Object v24 = ((java.lang.Throwable)v23).fillInStackTrace();
    Object v25 = "array";
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v26));
    Object v28 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v27));
    Object v29 = ((com.fasterxml.jackson.databind.ser.PropertyBuilder)v0)._throwWrapped(((java.lang.Exception)v23),((java.lang.String)v25),((java.lang.Object)v28));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }
}
