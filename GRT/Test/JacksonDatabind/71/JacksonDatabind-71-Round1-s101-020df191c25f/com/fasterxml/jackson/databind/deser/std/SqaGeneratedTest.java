package com.fasterxml.jackson.databind.deser.std;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.type.TypeBindings)v1),((java.lang.Object)v2),((java.lang.Object)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.forType(((java.lang.Class)v5));
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = -22;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v2),((java.lang.Object)v3),((java.lang.Object)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.DocumentDeserializer();
    Object v8 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v6),((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v7));
    Object v9 = "o";
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v15 = new java.util.concurrent.atomic.AtomicReference(((java.lang.Object)v14));
    Object v16 = ((com.fasterxml.jackson.databind.DeserializationContext)v12).hasValueDeserializerFor(((com.fasterxml.jackson.databind.JavaType)v13),((java.util.concurrent.atomic.AtomicReference)v15));
    Object v17 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v8)._parse(((java.lang.String)v9),((com.fasterxml.jackson.databind.DeserializationContext)v12));
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = -22;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v2),((java.lang.Object)v3),((java.lang.Object)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.DocumentDeserializer();
    Object v8 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v6),((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v7));
    Object v9 = "stri";
    Object v10 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v8)._parseInt(((java.lang.String)v9));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = -22;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v2),((java.lang.Object)v3),((java.lang.Object)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.DocumentDeserializer();
    Object v8 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v6),((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v7));
    Object v9 = "void";
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v8).deserializeKey(((java.lang.String)v9),((com.fasterxml.jackson.databind.DeserializationContext)v12));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.exc.InvalidFormatException");
    } catch (com.fasterxml.jackson.databind.exc.InvalidFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = -22;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v2),((java.lang.Object)v3),((java.lang.Object)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.DocumentDeserializer();
    Object v8 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v6),((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v7));
    Object v9 = "'";
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v8)._parse(((java.lang.String)v9),((com.fasterxml.jackson.databind.DeserializationContext)v12));
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = -22;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v2),((java.lang.Object)v3),((java.lang.Object)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.DocumentDeserializer();
    Object v8 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v6),((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v7));
    Object v9 = "W";
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v8)._parse(((java.lang.String)v9),((com.fasterxml.jackson.databind.DeserializationContext)v12));
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = -22;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v2),((java.lang.Object)v3),((java.lang.Object)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.DocumentDeserializer();
    Object v8 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v6),((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v7));
    Object v9 = "string";
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v8)._parse(((java.lang.String)v9),((com.fasterxml.jackson.databind.DeserializationContext)v12));
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = -22;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v2),((java.lang.Object)v3),((java.lang.Object)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.DocumentDeserializer();
    Object v8 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v6),((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v7));
    Object v9 = "items";
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.type.TypeBindings)v14),((java.lang.Object)v15),((java.lang.Object)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v17));
    Object v19 = com.fasterxml.jackson.core.JsonToken.START_ARRAY;
    Object v20 = ((com.fasterxml.jackson.databind.DeserializationContext)v12).mappingException(((java.lang.Class)v18),((com.fasterxml.jackson.core.JsonToken)v19));
    Object v21 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v8).deserializeKey(((java.lang.String)v9),((com.fasterxml.jackson.databind.DeserializationContext)v12));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.exc.InvalidFormatException");
    } catch (com.fasterxml.jackson.databind.exc.InvalidFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = -22;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v2),((java.lang.Object)v3),((java.lang.Object)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.DocumentDeserializer();
    Object v8 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v6),((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v7));
    Object v9 = " ";
    Object v10 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v8)._parseDouble(((java.lang.String)v9));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.type.TypeBindings)v1),((java.lang.Object)v2),((java.lang.Object)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = ((java.lang.Class)v5).isAnnotation();
    Object v7 = com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.forType(((java.lang.Class)v5));
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = -22;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v2),((java.lang.Object)v3),((java.lang.Object)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.DocumentDeserializer();
    Object v8 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v6),((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v7));
    Object v9 = "";
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v8).deserializeKey(((java.lang.String)v9),((com.fasterxml.jackson.databind.DeserializationContext)v12));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.exc.InvalidFormatException");
    } catch (com.fasterxml.jackson.databind.exc.InvalidFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = -22;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v2),((java.lang.Object)v3),((java.lang.Object)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.DocumentDeserializer();
    Object v8 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v6),((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v7));
    Object v9 = ":";
    Object v10 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v8)._parseInt(((java.lang.String)v9));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = -22;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v2),((java.lang.Object)v3),((java.lang.Object)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.DocumentDeserializer();
    Object v8 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v6),((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v7));
    Object v9 = "false";
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v8).deserializeKey(((java.lang.String)v9),((com.fasterxml.jackson.databind.DeserializationContext)v12));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.exc.InvalidFormatException");
    } catch (com.fasterxml.jackson.databind.exc.InvalidFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = -22;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v2),((java.lang.Object)v3),((java.lang.Object)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.DocumentDeserializer();
    Object v8 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v6),((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v7));
    Object v9 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v8).getKeyClass();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = -22;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v2),((java.lang.Object)v3),((java.lang.Object)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.DocumentDeserializer();
    Object v8 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v6),((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v7));
    Object v9 = "[";
    Object v10 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v8)._parseLong(((java.lang.String)v9));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = -22;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v2),((java.lang.Object)v3),((java.lang.Object)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.DocumentDeserializer();
    Object v8 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v6),((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v7));
    Object v9 = "can onlyconvert 1-character Strings";
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v8).deserializeKey(((java.lang.String)v9),((com.fasterxml.jackson.databind.DeserializationContext)v12));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.exc.InvalidFormatException");
    } catch (com.fasterxml.jackson.databind.exc.InvalidFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = 0;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v2),((java.lang.Object)v3),((java.lang.Object)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = -6;
    Object v1 = -22;
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v3),((java.lang.Object)v4),((java.lang.Object)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.DocumentDeserializer();
    Object v9 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v1).intValue()),((java.lang.Class)v7),((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v8));
    Object v10 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v9).getKeyClass();
    Object v11 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.DocumentDeserializer();
    Object v12 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v10),((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v2),((java.lang.Object)v3),((java.lang.Object)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v6));
    Object v8 = "ite";
    Object v9 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v7)._parseLong(((java.lang.String)v8));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = -22;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v2),((java.lang.Object)v3),((java.lang.Object)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.DocumentDeserializer();
    Object v8 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v6),((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v7));
    Object v9 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v8).getKeyClass();
    Object v10 = com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.forType(((java.lang.Class)v9));
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = -8;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v2),((java.lang.Object)v3),((java.lang.Object)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.DocumentDeserializer();
    Object v8 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v6),((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.type.TypeBindings)v1),((java.lang.Object)v2),((java.lang.Object)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = ((java.lang.Class)v5).getGenericInterfaces();
    Object v7 = com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.forType(((java.lang.Class)v5));
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = -6;
    Object v1 = -22;
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v3),((java.lang.Object)v4),((java.lang.Object)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.DocumentDeserializer();
    Object v9 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v1).intValue()),((java.lang.Class)v7),((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v8));
    Object v10 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v9).getKeyClass();
    Object v11 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.DocumentDeserializer();
    Object v12 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v10),((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v11));
    Object v13 = ")";
    Object v14 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v15 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v15));
    Object v17 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v12)._parse(((java.lang.String)v13),((com.fasterxml.jackson.databind.DeserializationContext)v16));
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = -22;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v2),((java.lang.Object)v3),((java.lang.Object)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.DocumentDeserializer();
    Object v8 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v6),((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v7));
    Object v9 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v8).getKeyClass();
    Object v10 = ((java.lang.Class)v9).getMethods();
    Object v11 = com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.forType(((java.lang.Class)v9));
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = 17;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v2),((java.lang.Object)v3),((java.lang.Object)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = -8;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v2),((java.lang.Object)v3),((java.lang.Object)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.DocumentDeserializer();
    Object v8 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v6),((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v7));
    Object v9 = "w";
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = ((com.fasterxml.jackson.databind.DeserializationContext)v12).leaseObjectBuffer();
    Object v14 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v8).deserializeKey(((java.lang.String)v9),((com.fasterxml.jackson.databind.DeserializationContext)v12));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.exc.InvalidFormatException");
    } catch (com.fasterxml.jackson.databind.exc.InvalidFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = -8;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v2),((java.lang.Object)v3),((java.lang.Object)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.DocumentDeserializer();
    Object v8 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v6),((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v7));
    Object v9 = "l";
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v8)._parse(((java.lang.String)v9),((com.fasterxml.jackson.databind.DeserializationContext)v12));
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = -6;
    Object v1 = -22;
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v3),((java.lang.Object)v4),((java.lang.Object)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.DocumentDeserializer();
    Object v9 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v1).intValue()),((java.lang.Class)v7),((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v8));
    Object v10 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v9).getKeyClass();
    Object v11 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.DocumentDeserializer();
    Object v12 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v10),((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v11));
    Object v13 = "T";
    Object v14 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v12)._parseDouble(((java.lang.String)v13));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.type.TypeBindings)v1),((java.lang.Object)v2),((java.lang.Object)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = ((java.lang.Class)v5).getDeclaredConstructors();
    Object v7 = com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.forType(((java.lang.Class)v5));
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = -6;
    Object v1 = -22;
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v3),((java.lang.Object)v4),((java.lang.Object)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.DocumentDeserializer();
    Object v9 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v1).intValue()),((java.lang.Class)v7),((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v8));
    Object v10 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v9).getKeyClass();
    Object v11 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.DocumentDeserializer();
    Object v12 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v10),((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v11));
    Object v13 = " does not define valid handledType() -- must either register with method that takes type argument  or make serializer extend 'com.fasterxml.jackson.databind.ser.std.StdSerializer'";
    Object v14 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v15 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v15));
    Object v17 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v12).deserializeKey(((java.lang.String)v13),((com.fasterxml.jackson.databind.DeserializationContext)v16));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.exc.InvalidFormatException");
    } catch (com.fasterxml.jackson.databind.exc.InvalidFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = -22;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v2),((java.lang.Object)v3),((java.lang.Object)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.DocumentDeserializer();
    Object v8 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v6),((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v7));
    Object v9 = "]";
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v15 = new java.util.concurrent.atomic.AtomicReference(((java.lang.Object)v14));
    Object v16 = ((com.fasterxml.jackson.databind.DeserializationContext)v12).hasValueDeserializerFor(((com.fasterxml.jackson.databind.JavaType)v13),((java.util.concurrent.atomic.AtomicReference)v15));
    Object v17 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v8).deserializeKey(((java.lang.String)v9),((com.fasterxml.jackson.databind.DeserializationContext)v12));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.exc.InvalidFormatException");
    } catch (com.fasterxml.jackson.databind.exc.InvalidFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = -6;
    Object v1 = -22;
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v3),((java.lang.Object)v4),((java.lang.Object)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.DocumentDeserializer();
    Object v9 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v1).intValue()),((java.lang.Class)v7),((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v8));
    Object v10 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v9).getKeyClass();
    Object v11 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.DocumentDeserializer();
    Object v12 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v10),((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v11));
    Object v13 = "arra";
    Object v14 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v15 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v15));
    Object v17 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v12)._parse(((java.lang.String)v13),((com.fasterxml.jackson.databind.DeserializationContext)v16));
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = -22;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v2),((java.lang.Object)v3),((java.lang.Object)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.DocumentDeserializer();
    Object v8 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v6),((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v7));
    Object v9 = "$";
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v8)._parse(((java.lang.String)v9),((com.fasterxml.jackson.databind.DeserializationContext)v12));
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = 17;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v2),((java.lang.Object)v3),((java.lang.Object)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v6));
    Object v8 = "[no message for ";
    Object v9 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v10 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v10));
    Object v12 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v7)._parse(((java.lang.String)v8),((com.fasterxml.jackson.databind.DeserializationContext)v11));
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = 17;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v2),((java.lang.Object)v3),((java.lang.Object)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v6));
    Object v8 = "]";
    Object v9 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v10 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v10));
    Object v12 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v7)._parse(((java.lang.String)v8),((com.fasterxml.jackson.databind.DeserializationContext)v11));
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.type.TypeBindings)v1),((java.lang.Object)v2),((java.lang.Object)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = ((java.lang.Class)v5).toGenericString();
    Object v7 = com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.forType(((java.lang.Class)v5));
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = -6;
    Object v1 = -22;
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v3),((java.lang.Object)v4),((java.lang.Object)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.DocumentDeserializer();
    Object v9 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v1).intValue()),((java.lang.Class)v7),((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v8));
    Object v10 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v9).getKeyClass();
    Object v11 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.DocumentDeserializer();
    Object v12 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v10),((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v11));
    Object v13 = "tring";
    Object v14 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v15 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v15));
    Object v17 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v12).deserializeKey(((java.lang.String)v13),((com.fasterxml.jackson.databind.DeserializationContext)v16));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.exc.InvalidFormatException");
    } catch (com.fasterxml.jackson.databind.exc.InvalidFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = 0;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v2),((java.lang.Object)v3),((java.lang.Object)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v6));
    Object v8 = "typ";
    Object v9 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v10 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v10));
    Object v12 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v7)._parse(((java.lang.String)v8),((com.fasterxml.jackson.databind.DeserializationContext)v11));
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = -8;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v2),((java.lang.Object)v3),((java.lang.Object)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.DocumentDeserializer();
    Object v8 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v6),((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v7));
    Object v9 = "' from Class '";
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v8)._parse(((java.lang.String)v9),((com.fasterxml.jackson.databind.DeserializationContext)v12));
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v2),((java.lang.Object)v3),((java.lang.Object)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v6));
    Object v8 = ")";
    Object v9 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v10 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v10));
    Object v12 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v7).deserializeKey(((java.lang.String)v8),((com.fasterxml.jackson.databind.DeserializationContext)v11));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.exc.InvalidFormatException");
    } catch (com.fasterxml.jackson.databind.exc.InvalidFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = -22;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v2),((java.lang.Object)v3),((java.lang.Object)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.DocumentDeserializer();
    Object v8 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v6),((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v7));
    Object v9 = "Internal error: entry should be a Number, but is of type ";
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v8)._parse(((java.lang.String)v9),((com.fasterxml.jackson.databind.DeserializationContext)v12));
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.type.TypeBindings)v1),((java.lang.Object)v2),((java.lang.Object)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = ((java.lang.Class)v5).isPrimitive();
    Object v7 = com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.forType(((java.lang.Class)v5));
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = 0;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v2),((java.lang.Object)v3),((java.lang.Object)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v6));
    Object v8 = "overflow, value can not be represented as 16-bit value";
    Object v9 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v10 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v10));
    Object v12 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v7)._parse(((java.lang.String)v8),((com.fasterxml.jackson.databind.DeserializationContext)v11));
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = 0;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v2),((java.lang.Object)v3),((java.lang.Object)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v6));
    Object v8 = "USE_BIG_DEC8MAL_FOR_FLOATS";
    Object v9 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v10 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v10));
    Object v12 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v7)._parse(((java.lang.String)v8),((com.fasterxml.jackson.databind.DeserializationContext)v11));
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = 17;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v2),((java.lang.Object)v3),((java.lang.Object)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v6));
    Object v8 = "items";
    Object v9 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v7)._parseInt(((java.lang.String)v8));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = -22;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v2),((java.lang.Object)v3),((java.lang.Object)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.DocumentDeserializer();
    Object v8 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v6),((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v7));
    Object v9 = "f";
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.type.TypeBindings)v14),((java.lang.Object)v15),((java.lang.Object)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v18),((com.fasterxml.jackson.databind.type.TypeBindings)v19),((java.lang.Object)v20),((java.lang.Object)v21));
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v22));
    Object v24 = ((com.fasterxml.jackson.databind.DatabindContext)v12).constructSpecializedType(((com.fasterxml.jackson.databind.JavaType)v17),((java.lang.Class)v23));
    Object v25 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v8).deserializeKey(((java.lang.String)v9),((com.fasterxml.jackson.databind.DeserializationContext)v12));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.exc.InvalidFormatException");
    } catch (com.fasterxml.jackson.databind.exc.InvalidFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = -22;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v2),((java.lang.Object)v3),((java.lang.Object)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.DocumentDeserializer();
    Object v8 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v6),((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v7));
    Object v9 = "BOOhEAN";
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v8)._parse(((java.lang.String)v9),((com.fasterxml.jackson.databind.DeserializationContext)v12));
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = -8;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v2),((java.lang.Object)v3),((java.lang.Object)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.DocumentDeserializer();
    Object v8 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v6),((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v7));
    Object v9 = "strin";
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v8).deserializeKey(((java.lang.String)v9),((com.fasterxml.jackson.databind.DeserializationContext)v12));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.exc.InvalidFormatException");
    } catch (com.fasterxml.jackson.databind.exc.InvalidFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = -8;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v2),((java.lang.Object)v3),((java.lang.Object)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.DocumentDeserializer();
    Object v8 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v6),((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v7));
    Object v9 = "numbe";
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v8).deserializeKey(((java.lang.String)v9),((com.fasterxml.jackson.databind.DeserializationContext)v12));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.exc.InvalidFormatException");
    } catch (com.fasterxml.jackson.databind.exc.InvalidFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = -6;
    Object v1 = -22;
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v3),((java.lang.Object)v4),((java.lang.Object)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.DocumentDeserializer();
    Object v9 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v1).intValue()),((java.lang.Class)v7),((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v8));
    Object v10 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v9).getKeyClass();
    Object v11 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.DocumentDeserializer();
    Object v12 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v10),((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v11));
    Object v13 = "]";
    Object v14 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v15 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v15));
    Object v17 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v12).deserializeKey(((java.lang.String)v13),((com.fasterxml.jackson.databind.DeserializationContext)v16));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.exc.InvalidFormatException");
    } catch (com.fasterxml.jackson.databind.exc.InvalidFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = 1;
    Object v1 = -22;
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v3),((java.lang.Object)v4),((java.lang.Object)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.DocumentDeserializer();
    Object v9 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v1).intValue()),((java.lang.Class)v7),((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v8));
    Object v10 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v9).getKeyClass();
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = -22;
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v3),((java.lang.Object)v4),((java.lang.Object)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.DocumentDeserializer();
    Object v9 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v1).intValue()),((java.lang.Class)v7),((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v8));
    Object v10 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v9).getKeyClass();
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v10));
    Object v12 = "any4";
    Object v13 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v11)._parseInt(((java.lang.String)v12));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = -8;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v2),((java.lang.Object)v3),((java.lang.Object)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.DocumentDeserializer();
    Object v8 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v6),((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v7));
    Object v9 = "' already h/d index (";
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v8).deserializeKey(((java.lang.String)v9),((com.fasterxml.jackson.databind.DeserializationContext)v12));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.exc.InvalidFormatException");
    } catch (com.fasterxml.jackson.databind.exc.InvalidFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = -22;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v2),((java.lang.Object)v3),((java.lang.Object)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.DocumentDeserializer();
    Object v8 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v6),((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v7));
    Object v9 = "R";
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v8)._parse(((java.lang.String)v9),((com.fasterxml.jackson.databind.DeserializationContext)v12));
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = -8;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v2),((java.lang.Object)v3),((java.lang.Object)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.DocumentDeserializer();
    Object v8 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v6),((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v7));
    Object v9 = "Invalid delegate-crea";
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.type.TypeBindings)v14),((java.lang.Object)v15),((java.lang.Object)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v17));
    Object v19 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL;
    Object v20 = ((com.fasterxml.jackson.databind.DeserializationContext)v12).mappingException(((java.lang.Class)v18),((com.fasterxml.jackson.core.JsonToken)v19));
    Object v21 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v8)._parse(((java.lang.String)v9),((com.fasterxml.jackson.databind.DeserializationContext)v12));
    org.junit.Assert.assertNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = -22;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v2),((java.lang.Object)v3),((java.lang.Object)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.DocumentDeserializer();
    Object v8 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v6),((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v7));
    Object v9 = "";
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v8)._parse(((java.lang.String)v9),((com.fasterxml.jackson.databind.DeserializationContext)v12));
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = -22;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v2),((java.lang.Object)v3),((java.lang.Object)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.DocumentDeserializer();
    Object v8 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v6),((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v7));
    Object v9 = ")";
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v8)._parse(((java.lang.String)v9),((com.fasterxml.jackson.databind.DeserializationContext)v12));
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = -22;
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v3),((java.lang.Object)v4),((java.lang.Object)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.DocumentDeserializer();
    Object v9 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v1).intValue()),((java.lang.Class)v7),((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v8));
    Object v10 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v9).getKeyClass();
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v10));
    Object v12 = "Can not pass true for 'explName' if name is null/empty";
    Object v13 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v14 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v14));
    Object v16 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v11)._parse(((java.lang.String)v12),((com.fasterxml.jackson.databind.DeserializationContext)v15));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.exc.InvalidFormatException");
    } catch (com.fasterxml.jackson.databind.exc.InvalidFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.type.TypeBindings)v1),((java.lang.Object)v2),((java.lang.Object)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = ((java.lang.Class)v5).isLocalClass();
    Object v7 = com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.forType(((java.lang.Class)v5));
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.type.TypeBindings)v1),((java.lang.Object)v2),((java.lang.Object)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = ((java.lang.Class)v5).getEnclosingMethod();
    Object v7 = com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.forType(((java.lang.Class)v5));
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = 17;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v2),((java.lang.Object)v3),((java.lang.Object)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v6));
    Object v8 = "Illegal index ";
    Object v9 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v10 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v10));
    ((com.fasterxml.jackson.databind.DeserializationContext)v11).checkUnresolvedObjectId();
    Object v12 = null;
    Object v13 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v7)._parse(((java.lang.String)v8),((com.fasterxml.jackson.databind.DeserializationContext)v11));
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = 0;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v2),((java.lang.Object)v3),((java.lang.Object)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.DocumentDeserializer();
    Object v8 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v6),((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = -22;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v2),((java.lang.Object)v3),((java.lang.Object)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.DocumentDeserializer();
    Object v8 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v6),((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v7));
    Object v9 = "nYll";
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v8).deserializeKey(((java.lang.String)v9),((com.fasterxml.jackson.databind.DeserializationContext)v12));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.exc.InvalidFormatException");
    } catch (com.fasterxml.jackson.databind.exc.InvalidFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = -22;
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v3),((java.lang.Object)v4),((java.lang.Object)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.DocumentDeserializer();
    Object v9 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v1).intValue()),((java.lang.Class)v7),((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v8));
    Object v10 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v9).getKeyClass();
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v10));
    Object v12 = "";
    Object v13 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v14 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v14));
    Object v16 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v11).deserializeKey(((java.lang.String)v12),((com.fasterxml.jackson.databind.DeserializationContext)v15));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.exc.InvalidFormatException");
    } catch (com.fasterxml.jackson.databind.exc.InvalidFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = 0;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v2),((java.lang.Object)v3),((java.lang.Object)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v6));
    Object v8 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v7).getKeyClass();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = -8;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v2),((java.lang.Object)v3),((java.lang.Object)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.DocumentDeserializer();
    Object v8 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v6),((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v7));
    Object v9 = "o'";
    Object v10 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v8)._parseDouble(((java.lang.String)v9));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = 17;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v2),((java.lang.Object)v3),((java.lang.Object)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v6));
    Object v8 = "";
    Object v9 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v10 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v10));
    Object v12 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v7).deserializeKey(((java.lang.String)v8),((com.fasterxml.jackson.databind.DeserializationContext)v11));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.exc.InvalidFormatException");
    } catch (com.fasterxml.jackson.databind.exc.InvalidFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = 0;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v2),((java.lang.Object)v3),((java.lang.Object)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v6));
    Object v8 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v7).getKeyClass();
    Object v9 = com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.forType(((java.lang.Class)v8));
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.type.TypeBindings)v1),((java.lang.Object)v2),((java.lang.Object)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.type.TypeBindings)v7),((java.lang.Object)v8),((java.lang.Object)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = ((java.lang.Class)v5).getDeclaredAnnotation(((java.lang.Class)v11));
    Object v13 = com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.forType(((java.lang.Class)v5));
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v2),((java.lang.Object)v3),((java.lang.Object)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.DocumentDeserializer();
    Object v8 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v6),((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v7));
    Object v9 = "]";
    Object v10 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v8)._parseDouble(((java.lang.String)v9));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = -22;
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v3),((java.lang.Object)v4),((java.lang.Object)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.DocumentDeserializer();
    Object v9 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v1).intValue()),((java.lang.Class)v7),((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v8));
    Object v10 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v9).getKeyClass();
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v10));
    Object v12 = "]";
    Object v13 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v14 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v14));
    Object v16 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v11)._parse(((java.lang.String)v12),((com.fasterxml.jackson.databind.DeserializationContext)v15));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.exc.InvalidFormatException");
    } catch (com.fasterxml.jackson.databind.exc.InvalidFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = 1;
    Object v1 = -22;
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v3),((java.lang.Object)v4),((java.lang.Object)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.DocumentDeserializer();
    Object v9 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v1).intValue()),((java.lang.Class)v7),((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v8));
    Object v10 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v9).getKeyClass();
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v10));
    Object v12 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v11).getKeyClass();
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v2),((java.lang.Object)v3),((java.lang.Object)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.DocumentDeserializer();
    Object v8 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v6),((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v7));
    Object v9 = "[no message for";
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v8).deserializeKey(((java.lang.String)v9),((com.fasterxml.jackson.databind.DeserializationContext)v12));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.exc.InvalidFormatException");
    } catch (com.fasterxml.jackson.databind.exc.InvalidFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v2),((java.lang.Object)v3),((java.lang.Object)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.DocumentDeserializer();
    Object v8 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v6),((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v7));
    Object v9 = "]";
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v8).deserializeKey(((java.lang.String)v9),((com.fasterxml.jackson.databind.DeserializationContext)v12));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.exc.InvalidFormatException");
    } catch (com.fasterxml.jackson.databind.exc.InvalidFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = 3;
    Object v1 = 0;
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v3),((java.lang.Object)v4),((java.lang.Object)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v1).intValue()),((java.lang.Class)v7));
    Object v9 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v8).getKeyClass();
    Object v10 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = -22;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v2),((java.lang.Object)v3),((java.lang.Object)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.DocumentDeserializer();
    Object v8 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v6),((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v7));
    Object v9 = "null";
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v8)._parse(((java.lang.String)v9),((com.fasterxml.jackson.databind.DeserializationContext)v12));
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = -22;
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v3),((java.lang.Object)v4),((java.lang.Object)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.DocumentDeserializer();
    Object v9 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v1).intValue()),((java.lang.Class)v7),((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v8));
    Object v10 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v9).getKeyClass();
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v10));
    Object v12 = ":/";
    Object v13 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v14 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v14));
    Object v16 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v11)._parse(((java.lang.String)v12),((com.fasterxml.jackson.databind.DeserializationContext)v15));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.exc.InvalidFormatException");
    } catch (com.fasterxml.jackson.databind.exc.InvalidFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = -22;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v2),((java.lang.Object)v3),((java.lang.Object)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.DocumentDeserializer();
    Object v8 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v6),((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v7));
    Object v9 = "Should have gotten ";
    Object v10 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v8)._parseDouble(((java.lang.String)v9));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = 3;
    Object v1 = 0;
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v3),((java.lang.Object)v4),((java.lang.Object)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v1).intValue()),((java.lang.Class)v7));
    Object v9 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v8).getKeyClass();
    Object v10 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v9));
    Object v11 = "Infibnite recursion (StackOverflowError)";
    Object v12 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v13 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v12));
    Object v14 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v13));
    Object v15 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v10).deserializeKey(((java.lang.String)v11),((com.fasterxml.jackson.databind.DeserializationContext)v14));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.exc.InvalidFormatException");
    } catch (com.fasterxml.jackson.databind.exc.InvalidFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = -8;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v2),((java.lang.Object)v3),((java.lang.Object)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.DocumentDeserializer();
    Object v8 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v6),((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v7));
    Object v9 = "";
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v8)._parse(((java.lang.String)v9),((com.fasterxml.jackson.databind.DeserializationContext)v12));
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v2),((java.lang.Object)v3),((java.lang.Object)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v6));
    Object v8 = "+";
    Object v9 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v10 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v10));
    Object v12 = new com.fasterxml.jackson.databind.util.ObjectBuffer();
    ((com.fasterxml.jackson.databind.DeserializationContext)v11).returnObjectBuffer(((com.fasterxml.jackson.databind.util.ObjectBuffer)v12));
    Object v13 = null;
    Object v14 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v7).deserializeKey(((java.lang.String)v8),((com.fasterxml.jackson.databind.DeserializationContext)v11));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.exc.InvalidFormatException");
    } catch (com.fasterxml.jackson.databind.exc.InvalidFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = 17;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v2),((java.lang.Object)v3),((java.lang.Object)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v6));
    Object v8 = "[fiel2d ";
    Object v9 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v10 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v10));
    Object v12 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v7).deserializeKey(((java.lang.String)v8),((com.fasterxml.jackson.databind.DeserializationContext)v11));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.exc.InvalidFormatException");
    } catch (com.fasterxml.jackson.databind.exc.InvalidFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.type.TypeBindings)v1),((java.lang.Object)v2),((java.lang.Object)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = ((java.lang.Class)v5).getDeclaringClass();
    Object v7 = com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.forType(((java.lang.Class)v5));
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = 1;
    Object v1 = -22;
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v3),((java.lang.Object)v4),((java.lang.Object)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.DocumentDeserializer();
    Object v9 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v1).intValue()),((java.lang.Class)v7),((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v8));
    Object v10 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v9).getKeyClass();
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v10));
    Object v12 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v11).getKeyClass();
    Object v13 = com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.forType(((java.lang.Class)v12));
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = 0;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v2),((java.lang.Object)v3),((java.lang.Object)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v6));
    Object v8 = "";
    Object v9 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v10 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v10));
    Object v12 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v7)._parse(((java.lang.String)v8),((com.fasterxml.jackson.databind.DeserializationContext)v11));
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = -8;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v2),((java.lang.Object)v3),((java.lang.Object)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.DocumentDeserializer();
    Object v8 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v6),((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v7));
    Object v9 = ")";
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v8).deserializeKey(((java.lang.String)v9),((com.fasterxml.jackson.databind.DeserializationContext)v12));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.exc.InvalidFormatException");
    } catch (com.fasterxml.jackson.databind.exc.InvalidFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = 20;
    Object v1 = 0;
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v3),((java.lang.Object)v4),((java.lang.Object)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v1).intValue()),((java.lang.Class)v7));
    Object v9 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v8).getKeyClass();
    Object v10 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.DocumentDeserializer();
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v9),((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = 0;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v2),((java.lang.Object)v3),((java.lang.Object)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = ((java.lang.Class)v6).getDeclaredClasses();
    Object v8 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v6));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = 3;
    Object v1 = 0;
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v3),((java.lang.Object)v4),((java.lang.Object)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v1).intValue()),((java.lang.Class)v7));
    Object v9 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v8).getKeyClass();
    Object v10 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v9));
    Object v11 = "set";
    Object v12 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v13 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v12));
    Object v14 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v13));
    Object v15 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v10)._parse(((java.lang.String)v11),((com.fasterxml.jackson.databind.DeserializationContext)v14));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = 17;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v2),((java.lang.Object)v3),((java.lang.Object)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v6));
    Object v8 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v7).getKeyClass();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = -8;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v2),((java.lang.Object)v3),((java.lang.Object)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.DocumentDeserializer();
    Object v8 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v6),((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v7));
    Object v9 = "\"";
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v8)._parse(((java.lang.String)v9),((com.fasterxml.jackson.databind.DeserializationContext)v12));
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = 17;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v2),((java.lang.Object)v3),((java.lang.Object)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v6));
    Object v8 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v7).getKeyClass();
    Object v9 = com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.forType(((java.lang.Class)v8));
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = -6;
    Object v1 = -22;
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v3),((java.lang.Object)v4),((java.lang.Object)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.DocumentDeserializer();
    Object v9 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v1).intValue()),((java.lang.Class)v7),((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v8));
    Object v10 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v9).getKeyClass();
    Object v11 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.DocumentDeserializer();
    Object v12 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v10),((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v11));
    Object v13 = "";
    Object v14 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v15 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v15));
    Object v17 = 17;
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v18),((com.fasterxml.jackson.databind.type.TypeBindings)v19),((java.lang.Object)v20),((java.lang.Object)v21));
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v22));
    Object v24 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v17).intValue()),((java.lang.Class)v23));
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v26 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v29 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v25),((com.fasterxml.jackson.databind.type.TypeBindings)v26),((java.lang.Object)v27),((java.lang.Object)v28));
    Object v30 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v29));
    Object v31 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v30));
    Object v32 = ((com.fasterxml.jackson.databind.DeserializationContext)v16).findObjectId(((java.lang.Object)v24),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v31));
    Object v33 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v12).deserializeKey(((java.lang.String)v13),((com.fasterxml.jackson.databind.DeserializationContext)v16));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.exc.InvalidFormatException");
    } catch (com.fasterxml.jackson.databind.exc.InvalidFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v2),((java.lang.Object)v3),((java.lang.Object)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.DocumentDeserializer();
    Object v8 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v6),((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v7));
    Object v9 = "Can not set virtual property '";
    Object v10 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v8)._parseInt(((java.lang.String)v9));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = 17;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v2),((java.lang.Object)v3),((java.lang.Object)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v6));
    Object v8 = "string";
    Object v9 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v10 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v10));
    Object v12 = 1;
    Object v13 = -22;
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v14),((com.fasterxml.jackson.databind.type.TypeBindings)v15),((java.lang.Object)v16),((java.lang.Object)v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.DocumentDeserializer();
    Object v21 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v13).intValue()),((java.lang.Class)v19),((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v20));
    Object v22 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v21).getKeyClass();
    Object v23 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v12).intValue()),((java.lang.Class)v22));
    Object v24 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v23).getKeyClass();
    Object v25 = new java.io.IOException();
    Object v26 = ((com.fasterxml.jackson.databind.DeserializationContext)v11).instantiationException(((java.lang.Class)v24),((java.lang.Throwable)v25));
    Object v27 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v7)._parse(((java.lang.String)v8),((com.fasterxml.jackson.databind.DeserializationContext)v11));
    org.junit.Assert.assertNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = 3;
    Object v1 = 0;
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v3),((java.lang.Object)v4),((java.lang.Object)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v1).intValue()),((java.lang.Class)v7));
    Object v9 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v8).getKeyClass();
    Object v10 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v9));
    Object v11 = "8)";
    Object v12 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v13 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v12));
    Object v14 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v13));
    Object v15 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v10).deserializeKey(((java.lang.String)v11),((com.fasterxml.jackson.databind.DeserializationContext)v14));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.exc.InvalidFormatException");
    } catch (com.fasterxml.jackson.databind.exc.InvalidFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = -6;
    Object v1 = -22;
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v3),((java.lang.Object)v4),((java.lang.Object)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.DocumentDeserializer();
    Object v9 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v1).intValue()),((java.lang.Class)v7),((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v8));
    Object v10 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v9).getKeyClass();
    Object v11 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.DocumentDeserializer();
    Object v12 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v10),((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v11));
    Object v13 = "";
    Object v14 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v15 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v15));
    Object v17 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v12)._parse(((java.lang.String)v13),((com.fasterxml.jackson.databind.DeserializationContext)v16));
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = -22;
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v3),((java.lang.Object)v4),((java.lang.Object)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.DocumentDeserializer();
    Object v9 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v1).intValue()),((java.lang.Class)v7),((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v8));
    Object v10 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v9).getKeyClass();
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v10));
    Object v12 = "items";
    Object v13 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v14 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v14));
    Object v16 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v11).deserializeKey(((java.lang.String)v12),((com.fasterxml.jackson.databind.DeserializationContext)v15));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.exc.InvalidFormatException");
    } catch (com.fasterxml.jackson.databind.exc.InvalidFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = 0;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v2),((java.lang.Object)v3),((java.lang.Object)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.DocumentDeserializer();
    Object v8 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v6),((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v7));
    Object v9 = "No9 enum constants for class ";
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v8)._parse(((java.lang.String)v9),((com.fasterxml.jackson.databind.DeserializationContext)v12));
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v2),((java.lang.Object)v3),((java.lang.Object)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = ((java.lang.Class)v6).getDeclaredClasses();
    Object v8 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v6));
    Object v9 = "ull";
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v8).deserializeKey(((java.lang.String)v9),((com.fasterxml.jackson.databind.DeserializationContext)v12));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.exc.InvalidFormatException");
    } catch (com.fasterxml.jackson.databind.exc.InvalidFormatException expected) { }
  }
}
