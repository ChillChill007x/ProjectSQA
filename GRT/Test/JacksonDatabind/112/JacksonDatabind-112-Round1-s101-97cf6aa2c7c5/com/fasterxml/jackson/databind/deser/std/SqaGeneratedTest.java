package com.fasterxml.jackson.databind.deser.std;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((java.lang.Class)v2));
    Object v4 = "";
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v4));
    Object v6 = "";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = "";
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v8));
    Object v10 = false;
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.NullValueProvider)v9),((java.lang.Boolean)v10));
    Object v12 = Short.valueOf((short)30);
    Object v13 = new com.fasterxml.jackson.databind.node.ShortNode((((java.lang.Short)v12).shortValue()));
    Object v14 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v15 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v13),((com.fasterxml.jackson.core.ObjectCodec)v14));
    Object v16 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v17 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v17));
    Object v19 = com.fasterxml.jackson.databind.ObjectMapper.findModules();
    Object v20 = ((com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer)v11).deserialize(((com.fasterxml.jackson.core.JsonParser)v15),((com.fasterxml.jackson.databind.DeserializationContext)v18),((java.util.Collection)v19));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((java.lang.Class)v2));
    Object v4 = "";
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v4));
    Object v6 = "";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = "";
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v8));
    Object v10 = false;
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.NullValueProvider)v9),((java.lang.Boolean)v10));
    Object v12 = ((com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase)v11).getContentType();
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((java.lang.Class)v2));
    Object v4 = "";
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v4));
    Object v6 = "";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = "";
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v8));
    Object v10 = false;
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.NullValueProvider)v9),((java.lang.Boolean)v10));
    Object v12 = "]";
    Object v13 = ((com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase)v11).findBackReference(((java.lang.String)v12));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((java.lang.Class)v2));
    Object v4 = "";
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v4));
    Object v6 = "";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = "";
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v8));
    Object v10 = false;
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.NullValueProvider)v9),((java.lang.Boolean)v10));
    Object v12 = ((com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer)v11).isCachable();
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((java.lang.Class)v2));
    Object v4 = "";
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v4));
    Object v6 = "";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = "";
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v8));
    Object v10 = false;
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.NullValueProvider)v9),((java.lang.Boolean)v10));
    Object v12 = "";
    Object v13 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v12));
    Object v14 = "";
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = true;
    Object v19 = ((com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer)v11).withResolved(((com.fasterxml.jackson.databind.JsonDeserializer)v13),((com.fasterxml.jackson.databind.JsonDeserializer)v15),((com.fasterxml.jackson.databind.deser.NullValueProvider)v17),((java.lang.Boolean)v18));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v0));
    Object v2 = "";
    Object v3 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonDeserializer)v1).replaceDelegatee(((com.fasterxml.jackson.databind.JsonDeserializer)v3));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((java.lang.Class)v2));
    Object v4 = "";
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v4));
    Object v6 = "";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = "";
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v8));
    Object v10 = false;
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.NullValueProvider)v9),((java.lang.Boolean)v10));
    Object v12 = "";
    Object v13 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v12));
    Object v14 = "";
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = true;
    Object v19 = ((com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer)v11).withResolved(((com.fasterxml.jackson.databind.JsonDeserializer)v13),((com.fasterxml.jackson.databind.JsonDeserializer)v15),((com.fasterxml.jackson.databind.deser.NullValueProvider)v17),((java.lang.Boolean)v18));
    Object v20 = ((com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase)v19).getContentDeserializer();
    Object v21 = "type";
    Object v22 = ((com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase)v19).findBackReference(((java.lang.String)v21));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((java.lang.Class)v2));
    Object v4 = "";
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v4));
    Object v6 = "";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = "";
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v8));
    Object v10 = false;
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.NullValueProvider)v9),((java.lang.Boolean)v10));
    Object v12 = "";
    Object v13 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v12));
    Object v14 = "";
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = true;
    Object v19 = ((com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer)v11).withResolved(((com.fasterxml.jackson.databind.JsonDeserializer)v13),((com.fasterxml.jackson.databind.JsonDeserializer)v15),((com.fasterxml.jackson.databind.deser.NullValueProvider)v17),((java.lang.Boolean)v18));
    Object v20 = ((com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase)v19).getValueType();
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((java.lang.Class)v2));
    Object v4 = "";
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v4));
    Object v6 = "";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = "";
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v8));
    Object v10 = false;
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.NullValueProvider)v9),((java.lang.Boolean)v10));
    Object v12 = ((com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer)v11).getValueInstantiator();
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((java.lang.Class)v2));
    Object v4 = "";
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v4));
    Object v6 = "";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = "";
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v8));
    Object v10 = false;
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.NullValueProvider)v9),((java.lang.Boolean)v10));
    Object v12 = "";
    Object v13 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v12));
    Object v14 = "";
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = true;
    Object v19 = ((com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer)v11).withResolved(((com.fasterxml.jackson.databind.JsonDeserializer)v13),((com.fasterxml.jackson.databind.JsonDeserializer)v15),((com.fasterxml.jackson.databind.deser.NullValueProvider)v17),((java.lang.Boolean)v18));
    Object v20 = Short.valueOf((short)30);
    Object v21 = new com.fasterxml.jackson.databind.node.ShortNode((((java.lang.Short)v20).shortValue()));
    Object v22 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v23 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v21),((com.fasterxml.jackson.core.ObjectCodec)v22));
    Object v24 = -13;
    Object v25 = ((com.fasterxml.jackson.core.JsonParser)v23).setFeatureMask((((java.lang.Integer)v24).intValue()));
    Object v26 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v27 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v26));
    Object v28 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v27));
    Object v29 = ((com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer)v19).deserialize(((com.fasterxml.jackson.core.JsonParser)v23),((com.fasterxml.jackson.databind.DeserializationContext)v28));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.exc.MismatchedInputException");
    } catch (com.fasterxml.jackson.databind.exc.MismatchedInputException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((java.lang.Class)v2));
    Object v4 = "";
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v4));
    Object v6 = "";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = "";
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v8));
    Object v10 = false;
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.NullValueProvider)v9),((java.lang.Boolean)v10));
    Object v12 = ((com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase)v11).getContentDeserializer();
    Object v13 = ((com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase)v11).getContentType();
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((java.lang.Class)v2));
    Object v4 = "";
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v4));
    Object v6 = "";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = "";
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v8));
    Object v10 = false;
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.NullValueProvider)v9),((java.lang.Boolean)v10));
    Object v12 = "";
    Object v13 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v12));
    Object v14 = "";
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = true;
    Object v19 = ((com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer)v11).withResolved(((com.fasterxml.jackson.databind.JsonDeserializer)v13),((com.fasterxml.jackson.databind.JsonDeserializer)v15),((com.fasterxml.jackson.databind.deser.NullValueProvider)v17),((java.lang.Boolean)v18));
    Object v20 = ((com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase)v19).getContentDeserializer();
    Object v21 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v22 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v21));
    Object v23 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v22));
    Object v24 = ((com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase)v19).getEmptyValue(((com.fasterxml.jackson.databind.DeserializationContext)v23));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.exc.InvalidDefinitionException");
    } catch (com.fasterxml.jackson.databind.exc.InvalidDefinitionException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((java.lang.Class)v2));
    Object v4 = "";
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v4));
    Object v6 = "";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = "";
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v8));
    Object v10 = false;
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.NullValueProvider)v9),((java.lang.Boolean)v10));
    Object v12 = "";
    Object v13 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v12));
    Object v14 = "";
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = true;
    Object v19 = ((com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer)v11).withResolved(((com.fasterxml.jackson.databind.JsonDeserializer)v13),((com.fasterxml.jackson.databind.JsonDeserializer)v15),((com.fasterxml.jackson.databind.deser.NullValueProvider)v17),((java.lang.Boolean)v18));
    Object v20 = Short.valueOf((short)30);
    Object v21 = new com.fasterxml.jackson.databind.node.ShortNode((((java.lang.Short)v20).shortValue()));
    Object v22 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v23 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v21),((com.fasterxml.jackson.core.ObjectCodec)v22));
    Object v24 = ((com.fasterxml.jackson.core.JsonParser)v23).version();
    Object v25 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v26 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v25));
    Object v27 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v26));
    Object v28 = com.fasterxml.jackson.databind.ObjectMapper.findModules();
    Object v29 = ((com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer)v19).deserialize(((com.fasterxml.jackson.core.JsonParser)v23),((com.fasterxml.jackson.databind.DeserializationContext)v27),((java.util.Collection)v28));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.exc.MismatchedInputException");
    } catch (com.fasterxml.jackson.databind.exc.MismatchedInputException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((java.lang.Class)v2));
    Object v4 = "";
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v4));
    Object v6 = "";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = "";
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v8));
    Object v10 = false;
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.NullValueProvider)v9),((java.lang.Boolean)v10));
    Object v12 = "";
    Object v13 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v12));
    Object v14 = "";
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = true;
    Object v19 = ((com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer)v11).withResolved(((com.fasterxml.jackson.databind.JsonDeserializer)v13),((com.fasterxml.jackson.databind.JsonDeserializer)v15),((com.fasterxml.jackson.databind.deser.NullValueProvider)v17),((java.lang.Boolean)v18));
    Object v20 = Short.valueOf((short)30);
    Object v21 = new com.fasterxml.jackson.databind.node.ShortNode((((java.lang.Short)v20).shortValue()));
    Object v22 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v23 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v21),((com.fasterxml.jackson.core.ObjectCodec)v22));
    ((com.fasterxml.jackson.core.JsonParser)v23).clearCurrentToken();
    Object v24 = null;
    Object v25 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v26 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v25));
    Object v27 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v26));
    Object v28 = com.fasterxml.jackson.databind.ObjectMapper.findModules();
    Object v29 = ((com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer)v19).deserialize(((com.fasterxml.jackson.core.JsonParser)v23),((com.fasterxml.jackson.databind.DeserializationContext)v27),((java.util.Collection)v28));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.exc.MismatchedInputException");
    } catch (com.fasterxml.jackson.databind.exc.MismatchedInputException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((java.lang.Class)v2));
    Object v4 = "";
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v4));
    Object v6 = "";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = "";
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v8));
    Object v10 = false;
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.NullValueProvider)v9),((java.lang.Boolean)v10));
    Object v12 = "";
    Object v13 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v12));
    Object v14 = "";
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = true;
    Object v19 = ((com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer)v11).withResolved(((com.fasterxml.jackson.databind.JsonDeserializer)v13),((com.fasterxml.jackson.databind.JsonDeserializer)v15),((com.fasterxml.jackson.databind.deser.NullValueProvider)v17),((java.lang.Boolean)v18));
    Object v20 = Short.valueOf((short)30);
    Object v21 = new com.fasterxml.jackson.databind.node.ShortNode((((java.lang.Short)v20).shortValue()));
    Object v22 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v23 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v21),((com.fasterxml.jackson.core.ObjectCodec)v22));
    Object v24 = ((com.fasterxml.jackson.core.JsonParser)v23).currentTokenId();
    Object v25 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v26 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v25));
    Object v27 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v26));
    Object v28 = ((com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer)v19).deserialize(((com.fasterxml.jackson.core.JsonParser)v23),((com.fasterxml.jackson.databind.DeserializationContext)v27));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.exc.MismatchedInputException");
    } catch (com.fasterxml.jackson.databind.exc.MismatchedInputException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((java.lang.Class)v2));
    Object v4 = "";
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v4));
    Object v6 = "";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = "";
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v8));
    Object v10 = false;
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.NullValueProvider)v9),((java.lang.Boolean)v10));
    Object v12 = "";
    Object v13 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v12));
    Object v14 = "";
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = true;
    Object v19 = ((com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer)v11).withResolved(((com.fasterxml.jackson.databind.JsonDeserializer)v13),((com.fasterxml.jackson.databind.JsonDeserializer)v15),((com.fasterxml.jackson.databind.deser.NullValueProvider)v17),((java.lang.Boolean)v18));
    Object v20 = ((com.fasterxml.jackson.databind.JsonDeserializer)v19).getNullValue();
    org.junit.Assert.assertNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((java.lang.Class)v2));
    Object v4 = "";
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v4));
    Object v6 = "";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = "";
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v8));
    Object v10 = false;
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.NullValueProvider)v9),((java.lang.Boolean)v10));
    Object v12 = "";
    Object v13 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v12));
    Object v14 = "";
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = true;
    Object v19 = ((com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer)v11).withResolved(((com.fasterxml.jackson.databind.JsonDeserializer)v13),((com.fasterxml.jackson.databind.JsonDeserializer)v15),((com.fasterxml.jackson.databind.deser.NullValueProvider)v17),((java.lang.Boolean)v18));
    Object v20 = "J";
    Object v21 = ((com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase)v19).findBackReference(((java.lang.String)v20));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((java.lang.Class)v2));
    Object v4 = "";
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v4));
    Object v6 = "";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = "";
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v8));
    Object v10 = false;
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.NullValueProvider)v9),((java.lang.Boolean)v10));
    Object v12 = "";
    Object v13 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v12));
    Object v14 = "";
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = true;
    Object v19 = ((com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer)v11).withResolved(((com.fasterxml.jackson.databind.JsonDeserializer)v13),((com.fasterxml.jackson.databind.JsonDeserializer)v15),((com.fasterxml.jackson.databind.deser.NullValueProvider)v17),((java.lang.Boolean)v18));
    Object v20 = ((com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer)v19).isCachable();
    org.junit.Assert.assertEquals((Object)(false), v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((java.lang.Class)v2));
    Object v4 = "";
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v4));
    Object v6 = "";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = "";
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v8));
    Object v10 = false;
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.NullValueProvider)v9),((java.lang.Boolean)v10));
    Object v12 = "";
    Object v13 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v12));
    Object v14 = "";
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = true;
    Object v19 = ((com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer)v11).withResolved(((com.fasterxml.jackson.databind.JsonDeserializer)v13),((com.fasterxml.jackson.databind.JsonDeserializer)v15),((com.fasterxml.jackson.databind.deser.NullValueProvider)v17),((java.lang.Boolean)v18));
    Object v20 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v21 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v20));
    Object v22 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v21));
    Object v23 = ((com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase)v19).getEmptyValue(((com.fasterxml.jackson.databind.DeserializationContext)v22));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.exc.InvalidDefinitionException");
    } catch (com.fasterxml.jackson.databind.exc.InvalidDefinitionException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = "";
    Object v1 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v0));
    Object v2 = ((com.fasterxml.jackson.databind.JsonDeserializer)v1).getNullValue();
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = "";
    Object v1 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v0));
    Object v2 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v1).getValueClass();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((java.lang.Class)v2));
    Object v4 = "";
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v4));
    Object v6 = "";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = "";
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v8));
    Object v10 = false;
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.NullValueProvider)v9),((java.lang.Boolean)v10));
    Object v12 = "";
    Object v13 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v12));
    Object v14 = "";
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = true;
    Object v19 = ((com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer)v11).withResolved(((com.fasterxml.jackson.databind.JsonDeserializer)v13),((com.fasterxml.jackson.databind.JsonDeserializer)v15),((com.fasterxml.jackson.databind.deser.NullValueProvider)v17),((java.lang.Boolean)v18));
    Object v20 = Short.valueOf((short)30);
    Object v21 = new com.fasterxml.jackson.databind.node.ShortNode((((java.lang.Short)v20).shortValue()));
    Object v22 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v23 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v21),((com.fasterxml.jackson.core.ObjectCodec)v22));
    Object v24 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v25 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v24));
    Object v26 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v25));
    Object v27 = com.fasterxml.jackson.databind.ObjectMapper.findModules();
    Object v28 = ((com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer)v19).deserialize(((com.fasterxml.jackson.core.JsonParser)v23),((com.fasterxml.jackson.databind.DeserializationContext)v26),((java.util.Collection)v27));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.exc.MismatchedInputException");
    } catch (com.fasterxml.jackson.databind.exc.MismatchedInputException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((java.lang.Class)v2));
    Object v4 = "";
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v4));
    Object v6 = "";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = "";
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v8));
    Object v10 = false;
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.NullValueProvider)v9),((java.lang.Boolean)v10));
    Object v12 = Short.valueOf((short)30);
    Object v13 = new com.fasterxml.jackson.databind.node.ShortNode((((java.lang.Short)v12).shortValue()));
    Object v14 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v15 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v13),((com.fasterxml.jackson.core.ObjectCodec)v14));
    Object v16 = ((com.fasterxml.jackson.core.JsonParser)v15).getParsingContext();
    Object v17 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v18 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v17));
    Object v19 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v18));
    Object v20 = com.fasterxml.jackson.databind.ObjectMapper.findModules();
    Object v21 = ((com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer)v11).deserialize(((com.fasterxml.jackson.core.JsonParser)v15),((com.fasterxml.jackson.databind.DeserializationContext)v19),((java.util.Collection)v20));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = "";
    Object v1 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v0));
    Object v2 = ((com.fasterxml.jackson.databind.JsonDeserializer)v1).getKnownPropertyNames();
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((java.lang.Class)v2));
    Object v4 = "";
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v4));
    Object v6 = "";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = "";
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v8));
    Object v10 = false;
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.NullValueProvider)v9),((java.lang.Boolean)v10));
    Object v12 = "";
    Object v13 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v12));
    Object v14 = "";
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = true;
    Object v19 = ((com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer)v11).withResolved(((com.fasterxml.jackson.databind.JsonDeserializer)v13),((com.fasterxml.jackson.databind.JsonDeserializer)v15),((com.fasterxml.jackson.databind.deser.NullValueProvider)v17),((java.lang.Boolean)v18));
    Object v20 = ((com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer)v19).getValueInstantiator();
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((java.lang.Class)v2));
    Object v4 = "";
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v4));
    Object v6 = "";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = "";
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v8));
    Object v10 = false;
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.NullValueProvider)v9),((java.lang.Boolean)v10));
    Object v12 = "";
    Object v13 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v12));
    Object v14 = "";
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = true;
    Object v19 = ((com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer)v11).withResolved(((com.fasterxml.jackson.databind.JsonDeserializer)v13),((com.fasterxml.jackson.databind.JsonDeserializer)v15),((com.fasterxml.jackson.databind.deser.NullValueProvider)v17),((java.lang.Boolean)v18));
    Object v20 = Short.valueOf((short)30);
    Object v21 = new com.fasterxml.jackson.databind.node.ShortNode((((java.lang.Short)v20).shortValue()));
    Object v22 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v23 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v21),((com.fasterxml.jackson.core.ObjectCodec)v22));
    Object v24 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v25 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v24));
    Object v26 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v25));
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v29 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v30 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v28),((com.fasterxml.jackson.databind.type.TypeFactory)v29));
    Object v31 = "i";
    Object v32 = true;
    Object v33 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v34 = new com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v27),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v30),((java.lang.String)v31),(((java.lang.Boolean)v32).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v33));
    Object v35 = ((com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer)v19).deserializeWithType(((com.fasterxml.jackson.core.JsonParser)v23),((com.fasterxml.jackson.databind.DeserializationContext)v26),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v34));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.exc.InvalidTypeIdException");
    } catch (com.fasterxml.jackson.databind.exc.InvalidTypeIdException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((java.lang.Class)v2));
    Object v4 = "";
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v4));
    Object v6 = "";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = "";
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v8));
    Object v10 = false;
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.NullValueProvider)v9),((java.lang.Boolean)v10));
    Object v12 = "";
    Object v13 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v12));
    Object v14 = "";
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = true;
    Object v19 = ((com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer)v11).withResolved(((com.fasterxml.jackson.databind.JsonDeserializer)v13),((com.fasterxml.jackson.databind.JsonDeserializer)v15),((com.fasterxml.jackson.databind.deser.NullValueProvider)v17),((java.lang.Boolean)v18));
    Object v20 = ((com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase)v19).getContentDeserializer();
    Object v21 = ")";
    Object v22 = ((com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase)v19).findBackReference(((java.lang.String)v21));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((java.lang.Class)v2));
    Object v4 = "";
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v4));
    Object v6 = "";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = "";
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v8));
    Object v10 = false;
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.NullValueProvider)v9),((java.lang.Boolean)v10));
    Object v12 = ((com.fasterxml.jackson.databind.JsonDeserializer)v11).getNullValue();
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((java.lang.Class)v2));
    Object v4 = "";
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v4));
    Object v6 = "";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = "";
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v8));
    Object v10 = false;
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.NullValueProvider)v9),((java.lang.Boolean)v10));
    Object v12 = "";
    Object v13 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v12));
    Object v14 = "";
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = true;
    Object v19 = ((com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer)v11).withResolved(((com.fasterxml.jackson.databind.JsonDeserializer)v13),((com.fasterxml.jackson.databind.JsonDeserializer)v15),((com.fasterxml.jackson.databind.deser.NullValueProvider)v17),((java.lang.Boolean)v18));
    Object v20 = ((com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer)v19).getContentDeserializer();
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((java.lang.Class)v2));
    Object v4 = "";
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v4));
    Object v6 = "";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = "";
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v8));
    Object v10 = false;
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.NullValueProvider)v9),((java.lang.Boolean)v10));
    Object v12 = "ites";
    Object v13 = ((com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase)v11).findBackReference(((java.lang.String)v12));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((java.lang.Class)v2));
    Object v4 = "";
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v4));
    Object v6 = "";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = "";
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v8));
    Object v10 = false;
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.NullValueProvider)v9),((java.lang.Boolean)v10));
    Object v12 = "";
    Object v13 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v12));
    Object v14 = "";
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = true;
    Object v19 = ((com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer)v11).withResolved(((com.fasterxml.jackson.databind.JsonDeserializer)v13),((com.fasterxml.jackson.databind.JsonDeserializer)v15),((com.fasterxml.jackson.databind.deser.NullValueProvider)v17),((java.lang.Boolean)v18));
    Object v20 = ((com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase)v19).getContentType();
    org.junit.Assert.assertNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((java.lang.Class)v2));
    Object v4 = "";
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v4));
    Object v6 = "";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = "";
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v8));
    Object v10 = false;
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.NullValueProvider)v9),((java.lang.Boolean)v10));
    Object v12 = "";
    Object v13 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v12));
    Object v14 = "";
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = true;
    Object v19 = ((com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer)v11).withResolved(((com.fasterxml.jackson.databind.JsonDeserializer)v13),((com.fasterxml.jackson.databind.JsonDeserializer)v15),((com.fasterxml.jackson.databind.deser.NullValueProvider)v17),((java.lang.Boolean)v18));
    Object v20 = "FAIL_ON_NULL_FOR_PRIMITIVES";
    Object v21 = ((com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase)v19).findBackReference(((java.lang.String)v20));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = "";
    Object v1 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v0));
    Object v2 = ((com.fasterxml.jackson.databind.JsonDeserializer)v1).getNullAccessPattern();
    org.junit.Assert.assertEquals((Object)(com.fasterxml.jackson.databind.util.AccessPattern.CONSTANT), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((java.lang.Class)v2));
    Object v4 = "";
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v4));
    Object v6 = "";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = "";
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v8));
    Object v10 = false;
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.NullValueProvider)v9),((java.lang.Boolean)v10));
    Object v12 = "";
    Object v13 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v12));
    Object v14 = "";
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = true;
    Object v19 = ((com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer)v11).withResolved(((com.fasterxml.jackson.databind.JsonDeserializer)v13),((com.fasterxml.jackson.databind.JsonDeserializer)v15),((com.fasterxml.jackson.databind.deser.NullValueProvider)v17),((java.lang.Boolean)v18));
    Object v20 = Short.valueOf((short)30);
    Object v21 = new com.fasterxml.jackson.databind.node.ShortNode((((java.lang.Short)v20).shortValue()));
    Object v22 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v23 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v21),((com.fasterxml.jackson.core.ObjectCodec)v22));
    Object v24 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v25 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v24));
    Object v26 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v25));
    Object v27 = ((com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer)v19).deserialize(((com.fasterxml.jackson.core.JsonParser)v23),((com.fasterxml.jackson.databind.DeserializationContext)v26));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.exc.MismatchedInputException");
    } catch (com.fasterxml.jackson.databind.exc.MismatchedInputException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((java.lang.Class)v2));
    Object v4 = "";
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v4));
    Object v6 = "";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = "";
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v8));
    Object v10 = false;
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.NullValueProvider)v9),((java.lang.Boolean)v10));
    Object v12 = "";
    Object v13 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v12));
    Object v14 = "";
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = true;
    Object v19 = ((com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer)v11).withResolved(((com.fasterxml.jackson.databind.JsonDeserializer)v13),((com.fasterxml.jackson.databind.JsonDeserializer)v15),((com.fasterxml.jackson.databind.deser.NullValueProvider)v17),((java.lang.Boolean)v18));
    Object v20 = "";
    Object v21 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v20));
    Object v22 = "";
    Object v23 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v22));
    Object v24 = "";
    Object v25 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v24));
    Object v26 = true;
    Object v27 = ((com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer)v19).withResolved(((com.fasterxml.jackson.databind.JsonDeserializer)v21),((com.fasterxml.jackson.databind.JsonDeserializer)v23),((com.fasterxml.jackson.databind.deser.NullValueProvider)v25),((java.lang.Boolean)v26));
    org.junit.Assert.assertNotNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((java.lang.Class)v2));
    Object v4 = "";
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v4));
    Object v6 = "";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = "";
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v8));
    Object v10 = false;
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.NullValueProvider)v9),((java.lang.Boolean)v10));
    Object v12 = "";
    Object v13 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v12));
    Object v14 = "";
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = true;
    Object v19 = ((com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer)v11).withResolved(((com.fasterxml.jackson.databind.JsonDeserializer)v13),((com.fasterxml.jackson.databind.JsonDeserializer)v15),((com.fasterxml.jackson.databind.deser.NullValueProvider)v17),((java.lang.Boolean)v18));
    Object v20 = "";
    Object v21 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v20));
    Object v22 = "";
    Object v23 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v22));
    Object v24 = "";
    Object v25 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v24));
    Object v26 = true;
    Object v27 = ((com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer)v19).withResolved(((com.fasterxml.jackson.databind.JsonDeserializer)v21),((com.fasterxml.jackson.databind.JsonDeserializer)v23),((com.fasterxml.jackson.databind.deser.NullValueProvider)v25),((java.lang.Boolean)v26));
    Object v28 = Short.valueOf((short)30);
    Object v29 = new com.fasterxml.jackson.databind.node.ShortNode((((java.lang.Short)v28).shortValue()));
    Object v30 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v31 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v29),((com.fasterxml.jackson.core.ObjectCodec)v30));
    Object v32 = new java.io.ByteArrayOutputStream();
    Object v33 = ((com.fasterxml.jackson.core.JsonParser)v31).readBinaryValue(((java.io.OutputStream)v32));
    Object v34 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v35 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v34));
    Object v36 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v35));
    Object v37 = ((com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer)v27).deserialize(((com.fasterxml.jackson.core.JsonParser)v31),((com.fasterxml.jackson.databind.DeserializationContext)v36));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.exc.MismatchedInputException");
    } catch (com.fasterxml.jackson.databind.exc.MismatchedInputException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((java.lang.Class)v2));
    Object v4 = "";
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v4));
    Object v6 = "";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = "";
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v8));
    Object v10 = false;
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.NullValueProvider)v9),((java.lang.Boolean)v10));
    Object v12 = "";
    Object v13 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v12));
    Object v14 = "";
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = true;
    Object v19 = ((com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer)v11).withResolved(((com.fasterxml.jackson.databind.JsonDeserializer)v13),((com.fasterxml.jackson.databind.JsonDeserializer)v15),((com.fasterxml.jackson.databind.deser.NullValueProvider)v17),((java.lang.Boolean)v18));
    Object v20 = "WRITE_CHAR_ARRAYS_AS_JSON_ARRAYS";
    Object v21 = ((com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase)v19).findBackReference(((java.lang.String)v20));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((java.lang.Class)v2));
    Object v4 = "";
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v4));
    Object v6 = "";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = "";
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v8));
    Object v10 = false;
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.NullValueProvider)v9),((java.lang.Boolean)v10));
    Object v12 = "";
    Object v13 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v12));
    Object v14 = "";
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = true;
    Object v19 = ((com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer)v11).withResolved(((com.fasterxml.jackson.databind.JsonDeserializer)v13),((com.fasterxml.jackson.databind.JsonDeserializer)v15),((com.fasterxml.jackson.databind.deser.NullValueProvider)v17),((java.lang.Boolean)v18));
    Object v20 = "";
    Object v21 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v20));
    Object v22 = "";
    Object v23 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v22));
    Object v24 = "";
    Object v25 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v24));
    Object v26 = true;
    Object v27 = ((com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer)v19).withResolved(((com.fasterxml.jackson.databind.JsonDeserializer)v21),((com.fasterxml.jackson.databind.JsonDeserializer)v23),((com.fasterxml.jackson.databind.deser.NullValueProvider)v25),((java.lang.Boolean)v26));
    Object v28 = ((com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase)v27).getContentType();
    org.junit.Assert.assertNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((java.lang.Class)v2));
    Object v4 = "";
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v4));
    Object v6 = "";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = "";
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v8));
    Object v10 = false;
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.NullValueProvider)v9),((java.lang.Boolean)v10));
    Object v12 = "";
    Object v13 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v12));
    Object v14 = "";
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = true;
    Object v19 = ((com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer)v11).withResolved(((com.fasterxml.jackson.databind.JsonDeserializer)v13),((com.fasterxml.jackson.databind.JsonDeserializer)v15),((com.fasterxml.jackson.databind.deser.NullValueProvider)v17),((java.lang.Boolean)v18));
    Object v20 = "";
    Object v21 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v20));
    Object v22 = "";
    Object v23 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v22));
    Object v24 = "";
    Object v25 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v24));
    Object v26 = true;
    Object v27 = ((com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer)v19).withResolved(((com.fasterxml.jackson.databind.JsonDeserializer)v21),((com.fasterxml.jackson.databind.JsonDeserializer)v23),((com.fasterxml.jackson.databind.deser.NullValueProvider)v25),((java.lang.Boolean)v26));
    Object v28 = ((com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase)v27).getEmptyAccessPattern();
    org.junit.Assert.assertEquals((Object)(com.fasterxml.jackson.databind.util.AccessPattern.DYNAMIC), v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((java.lang.Class)v2));
    Object v4 = "";
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v4));
    Object v6 = "";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = "";
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v8));
    Object v10 = false;
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.NullValueProvider)v9),((java.lang.Boolean)v10));
    Object v12 = "";
    Object v13 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v12));
    Object v14 = "";
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = true;
    Object v19 = ((com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer)v11).withResolved(((com.fasterxml.jackson.databind.JsonDeserializer)v13),((com.fasterxml.jackson.databind.JsonDeserializer)v15),((com.fasterxml.jackson.databind.deser.NullValueProvider)v17),((java.lang.Boolean)v18));
    Object v20 = "";
    Object v21 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v20));
    Object v22 = "";
    Object v23 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v22));
    Object v24 = "";
    Object v25 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v24));
    Object v26 = true;
    Object v27 = ((com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer)v19).withResolved(((com.fasterxml.jackson.databind.JsonDeserializer)v21),((com.fasterxml.jackson.databind.JsonDeserializer)v23),((com.fasterxml.jackson.databind.deser.NullValueProvider)v25),((java.lang.Boolean)v26));
    Object v28 = "string";
    Object v29 = ((com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase)v27).findBackReference(((java.lang.String)v28));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((java.lang.Class)v2));
    Object v4 = "";
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v4));
    Object v6 = "";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = "";
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v8));
    Object v10 = false;
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.NullValueProvider)v9),((java.lang.Boolean)v10));
    Object v12 = Short.valueOf((short)30);
    Object v13 = new com.fasterxml.jackson.databind.node.ShortNode((((java.lang.Short)v12).shortValue()));
    Object v14 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v15 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v13),((com.fasterxml.jackson.core.ObjectCodec)v14));
    Object v16 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v17 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v17));
    Object v19 = com.fasterxml.jackson.databind.ObjectMapper.findModules();
    Object v20 = com.fasterxml.jackson.databind.ObjectMapper.findModules();
    Object v21 = ((java.util.Collection)v19).containsAll(((java.util.Collection)v20));
    Object v22 = ((com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer)v11).deserialize(((com.fasterxml.jackson.core.JsonParser)v15),((com.fasterxml.jackson.databind.DeserializationContext)v18),((java.util.Collection)v19));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((java.lang.Class)v4));
    Object v6 = "";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = "";
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v8));
    Object v10 = "";
    Object v11 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v10));
    Object v12 = false;
    Object v13 = new com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.JsonDeserializer)v9),((com.fasterxml.jackson.databind.deser.NullValueProvider)v11),((java.lang.Boolean)v12));
    Object v14 = "";
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = "";
    Object v19 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v18));
    Object v20 = true;
    Object v21 = ((com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer)v13).withResolved(((com.fasterxml.jackson.databind.JsonDeserializer)v15),((com.fasterxml.jackson.databind.JsonDeserializer)v17),((com.fasterxml.jackson.databind.deser.NullValueProvider)v19),((java.lang.Boolean)v20));
    Object v22 = ((com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer)v21).getContentDeserializer();
    Object v23 = ((com.fasterxml.jackson.databind.JsonDeserializer)v1).replaceDelegatee(((com.fasterxml.jackson.databind.JsonDeserializer)v22));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((java.lang.Class)v2));
    Object v4 = "";
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v4));
    Object v6 = "";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = "";
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v8));
    Object v10 = false;
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.NullValueProvider)v9),((java.lang.Boolean)v10));
    Object v12 = "";
    Object v13 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v12));
    Object v14 = "";
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = true;
    Object v19 = ((com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer)v11).withResolved(((com.fasterxml.jackson.databind.JsonDeserializer)v13),((com.fasterxml.jackson.databind.JsonDeserializer)v15),((com.fasterxml.jackson.databind.deser.NullValueProvider)v17),((java.lang.Boolean)v18));
    Object v20 = "";
    Object v21 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v20));
    Object v22 = "";
    Object v23 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v22));
    Object v24 = "";
    Object v25 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v24));
    Object v26 = true;
    Object v27 = ((com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer)v19).withResolved(((com.fasterxml.jackson.databind.JsonDeserializer)v21),((com.fasterxml.jackson.databind.JsonDeserializer)v23),((com.fasterxml.jackson.databind.deser.NullValueProvider)v25),((java.lang.Boolean)v26));
    Object v28 = "7";
    Object v29 = ((com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase)v27).findBackReference(((java.lang.String)v28));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((java.lang.Class)v2));
    Object v4 = "";
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v4));
    Object v6 = "";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = "";
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v8));
    Object v10 = false;
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.NullValueProvider)v9),((java.lang.Boolean)v10));
    Object v12 = "";
    Object v13 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v12));
    Object v14 = "";
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = true;
    Object v19 = ((com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer)v11).withResolved(((com.fasterxml.jackson.databind.JsonDeserializer)v13),((com.fasterxml.jackson.databind.JsonDeserializer)v15),((com.fasterxml.jackson.databind.deser.NullValueProvider)v17),((java.lang.Boolean)v18));
    Object v20 = "";
    Object v21 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v20));
    Object v22 = "";
    Object v23 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v22));
    Object v24 = "";
    Object v25 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v24));
    Object v26 = true;
    Object v27 = ((com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer)v19).withResolved(((com.fasterxml.jackson.databind.JsonDeserializer)v21),((com.fasterxml.jackson.databind.JsonDeserializer)v23),((com.fasterxml.jackson.databind.deser.NullValueProvider)v25),((java.lang.Boolean)v26));
    Object v28 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v29 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v28));
    Object v30 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v29));
    Object v31 = ((com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase)v27).getEmptyValue(((com.fasterxml.jackson.databind.DeserializationContext)v30));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.exc.InvalidDefinitionException");
    } catch (com.fasterxml.jackson.databind.exc.InvalidDefinitionException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((java.lang.Class)v2));
    Object v4 = "";
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v4));
    Object v6 = "";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = "";
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v8));
    Object v10 = false;
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.NullValueProvider)v9),((java.lang.Boolean)v10));
    Object v12 = "";
    Object v13 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v12));
    Object v14 = "";
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = true;
    Object v19 = ((com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer)v11).withResolved(((com.fasterxml.jackson.databind.JsonDeserializer)v13),((com.fasterxml.jackson.databind.JsonDeserializer)v15),((com.fasterxml.jackson.databind.deser.NullValueProvider)v17),((java.lang.Boolean)v18));
    Object v20 = "";
    Object v21 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v20));
    Object v22 = "";
    Object v23 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v22));
    Object v24 = "";
    Object v25 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v24));
    Object v26 = true;
    Object v27 = ((com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer)v19).withResolved(((com.fasterxml.jackson.databind.JsonDeserializer)v21),((com.fasterxml.jackson.databind.JsonDeserializer)v23),((com.fasterxml.jackson.databind.deser.NullValueProvider)v25),((java.lang.Boolean)v26));
    Object v28 = Short.valueOf((short)30);
    Object v29 = new com.fasterxml.jackson.databind.node.ShortNode((((java.lang.Short)v28).shortValue()));
    Object v30 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v31 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v29),((com.fasterxml.jackson.core.ObjectCodec)v30));
    ((com.fasterxml.jackson.core.JsonParser)v31).close();
    Object v32 = null;
    Object v33 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v34 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v33));
    Object v35 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v34));
    Object v36 = ((com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer)v27).deserialize(((com.fasterxml.jackson.core.JsonParser)v31),((com.fasterxml.jackson.databind.DeserializationContext)v35));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.exc.MismatchedInputException");
    } catch (com.fasterxml.jackson.databind.exc.MismatchedInputException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((java.lang.Class)v2));
    Object v4 = "";
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v4));
    Object v6 = "";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = "";
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v8));
    Object v10 = false;
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.NullValueProvider)v9),((java.lang.Boolean)v10));
    Object v12 = "";
    Object v13 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v12));
    Object v14 = "";
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = true;
    Object v19 = ((com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer)v11).withResolved(((com.fasterxml.jackson.databind.JsonDeserializer)v13),((com.fasterxml.jackson.databind.JsonDeserializer)v15),((com.fasterxml.jackson.databind.deser.NullValueProvider)v17),((java.lang.Boolean)v18));
    Object v20 = "";
    Object v21 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v20));
    Object v22 = "";
    Object v23 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v22));
    Object v24 = "";
    Object v25 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v24));
    Object v26 = true;
    Object v27 = ((com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer)v19).withResolved(((com.fasterxml.jackson.databind.JsonDeserializer)v21),((com.fasterxml.jackson.databind.JsonDeserializer)v23),((com.fasterxml.jackson.databind.deser.NullValueProvider)v25),((java.lang.Boolean)v26));
    Object v28 = ((com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase)v27).getContentDeserializer();
    Object v29 = ((com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase)v27).getContentType();
    org.junit.Assert.assertNull(v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((java.lang.Class)v2));
    Object v4 = "";
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v4));
    Object v6 = "";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = "";
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v8));
    Object v10 = false;
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.NullValueProvider)v9),((java.lang.Boolean)v10));
    Object v12 = "";
    Object v13 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v12));
    Object v14 = "";
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = true;
    Object v19 = ((com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer)v11).withResolved(((com.fasterxml.jackson.databind.JsonDeserializer)v13),((com.fasterxml.jackson.databind.JsonDeserializer)v15),((com.fasterxml.jackson.databind.deser.NullValueProvider)v17),((java.lang.Boolean)v18));
    Object v20 = "";
    Object v21 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v20));
    Object v22 = "";
    Object v23 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v22));
    Object v24 = "";
    Object v25 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v24));
    Object v26 = true;
    Object v27 = ((com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer)v19).withResolved(((com.fasterxml.jackson.databind.JsonDeserializer)v21),((com.fasterxml.jackson.databind.JsonDeserializer)v23),((com.fasterxml.jackson.databind.deser.NullValueProvider)v25),((java.lang.Boolean)v26));
    Object v28 = ((com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer)v27).isCachable();
    org.junit.Assert.assertEquals((Object)(false), v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((java.lang.Class)v2));
    Object v4 = "";
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v4));
    Object v6 = "";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = "";
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v8));
    Object v10 = false;
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.NullValueProvider)v9),((java.lang.Boolean)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((java.lang.Class)v14));
    Object v16 = "";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = "";
    Object v19 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v18));
    Object v20 = "";
    Object v21 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v20));
    Object v22 = false;
    Object v23 = new com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v15),((com.fasterxml.jackson.databind.JsonDeserializer)v17),((com.fasterxml.jackson.databind.JsonDeserializer)v19),((com.fasterxml.jackson.databind.deser.NullValueProvider)v21),((java.lang.Boolean)v22));
    Object v24 = "";
    Object v25 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v24));
    Object v26 = "";
    Object v27 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v26));
    Object v28 = "";
    Object v29 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v28));
    Object v30 = true;
    Object v31 = ((com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer)v23).withResolved(((com.fasterxml.jackson.databind.JsonDeserializer)v25),((com.fasterxml.jackson.databind.JsonDeserializer)v27),((com.fasterxml.jackson.databind.deser.NullValueProvider)v29),((java.lang.Boolean)v30));
    Object v32 = ((com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer)v31).getContentDeserializer();
    Object v33 = "";
    Object v34 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v33));
    Object v35 = "";
    Object v36 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v35));
    Object v37 = false;
    Object v38 = ((com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer)v11).withResolved(((com.fasterxml.jackson.databind.JsonDeserializer)v32),((com.fasterxml.jackson.databind.JsonDeserializer)v34),((com.fasterxml.jackson.databind.deser.NullValueProvider)v36),((java.lang.Boolean)v37));
    org.junit.Assert.assertNotNull(v38);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((java.lang.Class)v2));
    Object v4 = "";
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v4));
    Object v6 = "";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = "";
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v8));
    Object v10 = false;
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.NullValueProvider)v9),((java.lang.Boolean)v10));
    Object v12 = ((com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase)v11).getContentDeserializer();
    Object v13 = "boolean";
    Object v14 = ((com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase)v11).findBackReference(((java.lang.String)v13));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((java.lang.Class)v2));
    Object v4 = "";
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v4));
    Object v6 = "";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = "";
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v8));
    Object v10 = false;
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.NullValueProvider)v9),((java.lang.Boolean)v10));
    Object v12 = "";
    Object v13 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v12));
    Object v14 = "";
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = true;
    Object v19 = ((com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer)v11).withResolved(((com.fasterxml.jackson.databind.JsonDeserializer)v13),((com.fasterxml.jackson.databind.JsonDeserializer)v15),((com.fasterxml.jackson.databind.deser.NullValueProvider)v17),((java.lang.Boolean)v18));
    Object v20 = null;
    Object v21 = ((com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase)v19).supportsUpdate(((com.fasterxml.jackson.databind.DeserializationConfig)v20));
    org.junit.Assert.assertEquals((Object)(true), v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((java.lang.Class)v2));
    Object v4 = "";
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v4));
    Object v6 = "";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = "";
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v8));
    Object v10 = false;
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.NullValueProvider)v9),((java.lang.Boolean)v10));
    Object v12 = "";
    Object v13 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v12));
    Object v14 = "";
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = true;
    Object v19 = ((com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer)v11).withResolved(((com.fasterxml.jackson.databind.JsonDeserializer)v13),((com.fasterxml.jackson.databind.JsonDeserializer)v15),((com.fasterxml.jackson.databind.deser.NullValueProvider)v17),((java.lang.Boolean)v18));
    Object v20 = "";
    Object v21 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v20));
    Object v22 = "";
    Object v23 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v22));
    Object v24 = "";
    Object v25 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v24));
    Object v26 = true;
    Object v27 = ((com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer)v19).withResolved(((com.fasterxml.jackson.databind.JsonDeserializer)v21),((com.fasterxml.jackson.databind.JsonDeserializer)v23),((com.fasterxml.jackson.databind.deser.NullValueProvider)v25),((java.lang.Boolean)v26));
    Object v28 = Short.valueOf((short)30);
    Object v29 = new com.fasterxml.jackson.databind.node.ShortNode((((java.lang.Short)v28).shortValue()));
    Object v30 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v31 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v29),((com.fasterxml.jackson.core.ObjectCodec)v30));
    Object v32 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v33 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v32));
    Object v34 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v33));
    Object v35 = com.fasterxml.jackson.databind.ObjectMapper.findModules();
    Object v36 = ((com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer)v27).deserialize(((com.fasterxml.jackson.core.JsonParser)v31),((com.fasterxml.jackson.databind.DeserializationContext)v34),((java.util.Collection)v35));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.exc.MismatchedInputException");
    } catch (com.fasterxml.jackson.databind.exc.MismatchedInputException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = "";
    Object v1 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v0));
    Object v2 = ((com.fasterxml.jackson.databind.JsonDeserializer)v1).getDelegatee();
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((java.lang.Class)v2));
    Object v4 = "";
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v4));
    Object v6 = "";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = "";
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v8));
    Object v10 = false;
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.NullValueProvider)v9),((java.lang.Boolean)v10));
    Object v12 = "";
    Object v13 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v12));
    Object v14 = "";
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = true;
    Object v19 = ((com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer)v11).withResolved(((com.fasterxml.jackson.databind.JsonDeserializer)v13),((com.fasterxml.jackson.databind.JsonDeserializer)v15),((com.fasterxml.jackson.databind.deser.NullValueProvider)v17),((java.lang.Boolean)v18));
    Object v20 = "";
    Object v21 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v20));
    Object v22 = "";
    Object v23 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v22));
    Object v24 = "";
    Object v25 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v24));
    Object v26 = true;
    Object v27 = ((com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer)v19).withResolved(((com.fasterxml.jackson.databind.JsonDeserializer)v21),((com.fasterxml.jackson.databind.JsonDeserializer)v23),((com.fasterxml.jackson.databind.deser.NullValueProvider)v25),((java.lang.Boolean)v26));
    Object v28 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v27).handledType();
    org.junit.Assert.assertNotNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((java.lang.Class)v2));
    Object v4 = "";
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v4));
    Object v6 = "";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = "";
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v8));
    Object v10 = false;
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.NullValueProvider)v9),((java.lang.Boolean)v10));
    Object v12 = "";
    Object v13 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v12));
    Object v14 = "";
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = true;
    Object v19 = ((com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer)v11).withResolved(((com.fasterxml.jackson.databind.JsonDeserializer)v13),((com.fasterxml.jackson.databind.JsonDeserializer)v15),((com.fasterxml.jackson.databind.deser.NullValueProvider)v17),((java.lang.Boolean)v18));
    Object v20 = ((com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer)v19).getContentDeserializer();
    Object v21 = ((com.fasterxml.jackson.databind.JsonDeserializer)v20).getNullAccessPattern();
    org.junit.Assert.assertEquals((Object)(com.fasterxml.jackson.databind.util.AccessPattern.CONSTANT), v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((java.lang.Class)v2));
    Object v4 = "";
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v4));
    Object v6 = "";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = "";
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v8));
    Object v10 = false;
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.NullValueProvider)v9),((java.lang.Boolean)v10));
    Object v12 = "";
    Object v13 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v12));
    Object v14 = "";
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = true;
    Object v19 = ((com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer)v11).withResolved(((com.fasterxml.jackson.databind.JsonDeserializer)v13),((com.fasterxml.jackson.databind.JsonDeserializer)v15),((com.fasterxml.jackson.databind.deser.NullValueProvider)v17),((java.lang.Boolean)v18));
    Object v20 = "";
    Object v21 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v20));
    Object v22 = "";
    Object v23 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v22));
    Object v24 = "";
    Object v25 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v24));
    Object v26 = true;
    Object v27 = ((com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer)v19).withResolved(((com.fasterxml.jackson.databind.JsonDeserializer)v21),((com.fasterxml.jackson.databind.JsonDeserializer)v23),((com.fasterxml.jackson.databind.deser.NullValueProvider)v25),((java.lang.Boolean)v26));
    Object v28 = Short.valueOf((short)30);
    Object v29 = new com.fasterxml.jackson.databind.node.ShortNode((((java.lang.Short)v28).shortValue()));
    Object v30 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v31 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v29),((com.fasterxml.jackson.core.ObjectCodec)v30));
    Object v32 = ((com.fasterxml.jackson.core.JsonParser)v31).getBinaryValue();
    Object v33 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v34 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v33));
    Object v35 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v34));
    Object v36 = com.fasterxml.jackson.databind.ObjectMapper.findModules();
    Object v37 = ((com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer)v27).deserialize(((com.fasterxml.jackson.core.JsonParser)v31),((com.fasterxml.jackson.databind.DeserializationContext)v35),((java.util.Collection)v36));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.exc.MismatchedInputException");
    } catch (com.fasterxml.jackson.databind.exc.MismatchedInputException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((java.lang.Class)v2));
    Object v4 = "";
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v4));
    Object v6 = "";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = "";
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v8));
    Object v10 = false;
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.NullValueProvider)v9),((java.lang.Boolean)v10));
    Object v12 = "";
    Object v13 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v12));
    Object v14 = "";
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = true;
    Object v19 = ((com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer)v11).withResolved(((com.fasterxml.jackson.databind.JsonDeserializer)v13),((com.fasterxml.jackson.databind.JsonDeserializer)v15),((com.fasterxml.jackson.databind.deser.NullValueProvider)v17),((java.lang.Boolean)v18));
    Object v20 = "";
    Object v21 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v20));
    Object v22 = "";
    Object v23 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v22));
    Object v24 = "";
    Object v25 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v24));
    Object v26 = true;
    Object v27 = ((com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer)v19).withResolved(((com.fasterxml.jackson.databind.JsonDeserializer)v21),((com.fasterxml.jackson.databind.JsonDeserializer)v23),((com.fasterxml.jackson.databind.deser.NullValueProvider)v25),((java.lang.Boolean)v26));
    Object v28 = Short.valueOf((short)30);
    Object v29 = new com.fasterxml.jackson.databind.node.ShortNode((((java.lang.Short)v28).shortValue()));
    Object v30 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v31 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v29),((com.fasterxml.jackson.core.ObjectCodec)v30));
    Object v32 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v33 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v32));
    Object v34 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v33));
    Object v35 = ((com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer)v27).deserialize(((com.fasterxml.jackson.core.JsonParser)v31),((com.fasterxml.jackson.databind.DeserializationContext)v34));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.exc.MismatchedInputException");
    } catch (com.fasterxml.jackson.databind.exc.MismatchedInputException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((java.lang.Class)v2));
    Object v4 = "";
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v4));
    Object v6 = "";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = "";
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v8));
    Object v10 = false;
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.NullValueProvider)v9),((java.lang.Boolean)v10));
    Object v12 = "";
    Object v13 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v12));
    Object v14 = "";
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = true;
    Object v19 = ((com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer)v11).withResolved(((com.fasterxml.jackson.databind.JsonDeserializer)v13),((com.fasterxml.jackson.databind.JsonDeserializer)v15),((com.fasterxml.jackson.databind.deser.NullValueProvider)v17),((java.lang.Boolean)v18));
    Object v20 = "";
    Object v21 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v20));
    Object v22 = "";
    Object v23 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v22));
    Object v24 = "";
    Object v25 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v24));
    Object v26 = true;
    Object v27 = ((com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer)v19).withResolved(((com.fasterxml.jackson.databind.JsonDeserializer)v21),((com.fasterxml.jackson.databind.JsonDeserializer)v23),((com.fasterxml.jackson.databind.deser.NullValueProvider)v25),((java.lang.Boolean)v26));
    Object v28 = Short.valueOf((short)30);
    Object v29 = new com.fasterxml.jackson.databind.node.ShortNode((((java.lang.Short)v28).shortValue()));
    Object v30 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v31 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v29),((com.fasterxml.jackson.core.ObjectCodec)v30));
    Object v32 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v33 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v32));
    Object v34 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v33));
    Object v35 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v36 = new java.util.concurrent.atomic.AtomicReference();
    Object v37 = ((com.fasterxml.jackson.databind.DeserializationContext)v34).hasValueDeserializerFor(((com.fasterxml.jackson.databind.JavaType)v35),((java.util.concurrent.atomic.AtomicReference)v36));
    Object v38 = ((com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer)v27).deserialize(((com.fasterxml.jackson.core.JsonParser)v31),((com.fasterxml.jackson.databind.DeserializationContext)v34));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.exc.MismatchedInputException");
    } catch (com.fasterxml.jackson.databind.exc.MismatchedInputException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((java.lang.Class)v2));
    Object v4 = "";
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v4));
    Object v6 = "";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = "";
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v8));
    Object v10 = false;
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.NullValueProvider)v9),((java.lang.Boolean)v10));
    Object v12 = "";
    Object v13 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v12));
    Object v14 = "";
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = true;
    Object v19 = ((com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer)v11).withResolved(((com.fasterxml.jackson.databind.JsonDeserializer)v13),((com.fasterxml.jackson.databind.JsonDeserializer)v15),((com.fasterxml.jackson.databind.deser.NullValueProvider)v17),((java.lang.Boolean)v18));
    Object v20 = "";
    Object v21 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v20));
    Object v22 = "";
    Object v23 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v22));
    Object v24 = "";
    Object v25 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v24));
    Object v26 = true;
    Object v27 = ((com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer)v19).withResolved(((com.fasterxml.jackson.databind.JsonDeserializer)v21),((com.fasterxml.jackson.databind.JsonDeserializer)v23),((com.fasterxml.jackson.databind.deser.NullValueProvider)v25),((java.lang.Boolean)v26));
    Object v28 = Short.valueOf((short)30);
    Object v29 = new com.fasterxml.jackson.databind.node.ShortNode((((java.lang.Short)v28).shortValue()));
    Object v30 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v31 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v29),((com.fasterxml.jackson.core.ObjectCodec)v30));
    Object v32 = new byte[]{Byte.valueOf((byte)-87)};
    Object v33 = "<>g";
    ((com.fasterxml.jackson.core.JsonParser)v31).setRequestPayloadOnError(((byte[])v32),((java.lang.String)v33));
    Object v34 = null;
    Object v35 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v36 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v35));
    Object v37 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v36));
    Object v38 = com.fasterxml.jackson.databind.ObjectMapper.findModules();
    Object v39 = ((com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer)v27).deserialize(((com.fasterxml.jackson.core.JsonParser)v31),((com.fasterxml.jackson.databind.DeserializationContext)v37),((java.util.Collection)v38));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.exc.MismatchedInputException");
    } catch (com.fasterxml.jackson.databind.exc.MismatchedInputException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((java.lang.Class)v2));
    Object v4 = "";
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v4));
    Object v6 = "";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = "";
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v8));
    Object v10 = false;
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.NullValueProvider)v9),((java.lang.Boolean)v10));
    Object v12 = "";
    Object v13 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v12));
    Object v14 = "";
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = true;
    Object v19 = ((com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer)v11).withResolved(((com.fasterxml.jackson.databind.JsonDeserializer)v13),((com.fasterxml.jackson.databind.JsonDeserializer)v15),((com.fasterxml.jackson.databind.deser.NullValueProvider)v17),((java.lang.Boolean)v18));
    Object v20 = "";
    Object v21 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v20));
    Object v22 = "";
    Object v23 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v22));
    Object v24 = "";
    Object v25 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v24));
    Object v26 = true;
    Object v27 = ((com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer)v19).withResolved(((com.fasterxml.jackson.databind.JsonDeserializer)v21),((com.fasterxml.jackson.databind.JsonDeserializer)v23),((com.fasterxml.jackson.databind.deser.NullValueProvider)v25),((java.lang.Boolean)v26));
    Object v28 = Short.valueOf((short)30);
    Object v29 = new com.fasterxml.jackson.databind.node.ShortNode((((java.lang.Short)v28).shortValue()));
    Object v30 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v31 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v29),((com.fasterxml.jackson.core.ObjectCodec)v30));
    Object v32 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    ((com.fasterxml.jackson.core.JsonParser)v31).setCurrentValue(((java.lang.Object)v32));
    Object v33 = null;
    Object v34 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v35 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v34));
    Object v36 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v35));
    Object v37 = com.fasterxml.jackson.databind.ObjectMapper.findModules();
    Object v38 = ((com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer)v27).deserialize(((com.fasterxml.jackson.core.JsonParser)v31),((com.fasterxml.jackson.databind.DeserializationContext)v36),((java.util.Collection)v37));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.exc.MismatchedInputException");
    } catch (com.fasterxml.jackson.databind.exc.MismatchedInputException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((java.lang.Class)v2));
    Object v4 = "";
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v4));
    Object v6 = "";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = "";
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v8));
    Object v10 = false;
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.NullValueProvider)v9),((java.lang.Boolean)v10));
    Object v12 = "";
    Object v13 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v12));
    Object v14 = "";
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = true;
    Object v19 = ((com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer)v11).withResolved(((com.fasterxml.jackson.databind.JsonDeserializer)v13),((com.fasterxml.jackson.databind.JsonDeserializer)v15),((com.fasterxml.jackson.databind.deser.NullValueProvider)v17),((java.lang.Boolean)v18));
    Object v20 = "";
    Object v21 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v20));
    Object v22 = "";
    Object v23 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v22));
    Object v24 = "";
    Object v25 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v24));
    Object v26 = true;
    Object v27 = ((com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer)v19).withResolved(((com.fasterxml.jackson.databind.JsonDeserializer)v21),((com.fasterxml.jackson.databind.JsonDeserializer)v23),((com.fasterxml.jackson.databind.deser.NullValueProvider)v25),((java.lang.Boolean)v26));
    Object v28 = "; expected Class<Converter>";
    Object v29 = ((com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase)v27).findBackReference(((java.lang.String)v28));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((java.lang.Class)v2));
    Object v4 = "";
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v4));
    Object v6 = "";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = "";
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v8));
    Object v10 = false;
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.NullValueProvider)v9),((java.lang.Boolean)v10));
    Object v12 = "";
    Object v13 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v12));
    Object v14 = "";
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = true;
    Object v19 = ((com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer)v11).withResolved(((com.fasterxml.jackson.databind.JsonDeserializer)v13),((com.fasterxml.jackson.databind.JsonDeserializer)v15),((com.fasterxml.jackson.databind.deser.NullValueProvider)v17),((java.lang.Boolean)v18));
    Object v20 = ((com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase)v19).getContentDeserializer();
    Object v21 = "-Infinity";
    Object v22 = ((com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase)v19).findBackReference(((java.lang.String)v21));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((java.lang.Class)v2));
    Object v4 = "";
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v4));
    Object v6 = "";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = "";
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v8));
    Object v10 = false;
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.NullValueProvider)v9),((java.lang.Boolean)v10));
    Object v12 = "";
    Object v13 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v12));
    Object v14 = "";
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = true;
    Object v19 = ((com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer)v11).withResolved(((com.fasterxml.jackson.databind.JsonDeserializer)v13),((com.fasterxml.jackson.databind.JsonDeserializer)v15),((com.fasterxml.jackson.databind.deser.NullValueProvider)v17),((java.lang.Boolean)v18));
    Object v20 = ((com.fasterxml.jackson.databind.JsonDeserializer)v19).getKnownPropertyNames();
    org.junit.Assert.assertNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((java.lang.Class)v2));
    Object v4 = "";
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v4));
    Object v6 = "";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = "";
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v8));
    Object v10 = false;
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.NullValueProvider)v9),((java.lang.Boolean)v10));
    Object v12 = "";
    Object v13 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v12));
    Object v14 = "";
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = true;
    Object v19 = ((com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer)v11).withResolved(((com.fasterxml.jackson.databind.JsonDeserializer)v13),((com.fasterxml.jackson.databind.JsonDeserializer)v15),((com.fasterxml.jackson.databind.deser.NullValueProvider)v17),((java.lang.Boolean)v18));
    Object v20 = "";
    Object v21 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v20));
    Object v22 = "";
    Object v23 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v22));
    Object v24 = "";
    Object v25 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v24));
    Object v26 = true;
    Object v27 = ((com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer)v19).withResolved(((com.fasterxml.jackson.databind.JsonDeserializer)v21),((com.fasterxml.jackson.databind.JsonDeserializer)v23),((com.fasterxml.jackson.databind.deser.NullValueProvider)v25),((java.lang.Boolean)v26));
    Object v28 = ((com.fasterxml.jackson.databind.JsonDeserializer)v27).getObjectIdReader();
    org.junit.Assert.assertNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((java.lang.Class)v2));
    Object v4 = "";
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v4));
    Object v6 = "";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = "";
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v8));
    Object v10 = false;
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.NullValueProvider)v9),((java.lang.Boolean)v10));
    Object v12 = "";
    Object v13 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v12));
    Object v14 = "";
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = true;
    Object v19 = ((com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer)v11).withResolved(((com.fasterxml.jackson.databind.JsonDeserializer)v13),((com.fasterxml.jackson.databind.JsonDeserializer)v15),((com.fasterxml.jackson.databind.deser.NullValueProvider)v17),((java.lang.Boolean)v18));
    Object v20 = "Cannot pass true for 'explName' if name is null/empty";
    Object v21 = ((com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase)v19).findBackReference(((java.lang.String)v20));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = "";
    Object v1 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v0));
    Object v2 = "]";
    Object v3 = "not Y valid Double value";
    Object v4 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = ((com.fasterxml.jackson.databind.JsonDeserializer)v1).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((java.lang.Class)v2));
    Object v4 = "";
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v4));
    Object v6 = "";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = "";
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v8));
    Object v10 = false;
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.NullValueProvider)v9),((java.lang.Boolean)v10));
    Object v12 = "";
    Object v13 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v12));
    Object v14 = "";
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = true;
    Object v19 = ((com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer)v11).withResolved(((com.fasterxml.jackson.databind.JsonDeserializer)v13),((com.fasterxml.jackson.databind.JsonDeserializer)v15),((com.fasterxml.jackson.databind.deser.NullValueProvider)v17),((java.lang.Boolean)v18));
    Object v20 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v21 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v20));
    Object v22 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v21));
    Object v23 = "Invalid Object Id definition for ";
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v24));
    Object v26 = "ay";
    Object v27 = ((com.fasterxml.jackson.databind.DeserializationContext)v22).weirdStringException(((java.lang.String)v23),((java.lang.Class)v25),((java.lang.String)v26));
    Object v28 = ((com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase)v19).getEmptyValue(((com.fasterxml.jackson.databind.DeserializationContext)v22));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.exc.InvalidDefinitionException");
    } catch (com.fasterxml.jackson.databind.exc.InvalidDefinitionException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((java.lang.Class)v2));
    Object v4 = "";
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v4));
    Object v6 = "";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = "";
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v8));
    Object v10 = false;
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.NullValueProvider)v9),((java.lang.Boolean)v10));
    Object v12 = "";
    Object v13 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v12));
    Object v14 = "";
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = true;
    Object v19 = ((com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer)v11).withResolved(((com.fasterxml.jackson.databind.JsonDeserializer)v13),((com.fasterxml.jackson.databind.JsonDeserializer)v15),((com.fasterxml.jackson.databind.deser.NullValueProvider)v17),((java.lang.Boolean)v18));
    Object v20 = "";
    Object v21 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v20));
    Object v22 = "]";
    Object v23 = "not Y valid Double value";
    Object v24 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v22),((java.lang.String)v23));
    Object v25 = ((com.fasterxml.jackson.databind.JsonDeserializer)v21).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v24));
    Object v26 = "";
    Object v27 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v26));
    Object v28 = "]";
    Object v29 = "not Y valid Double value";
    Object v30 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v28),((java.lang.String)v29));
    Object v31 = ((com.fasterxml.jackson.databind.JsonDeserializer)v27).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v30));
    Object v32 = "";
    Object v33 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v32));
    Object v34 = false;
    Object v35 = ((com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer)v19).withResolved(((com.fasterxml.jackson.databind.JsonDeserializer)v25),((com.fasterxml.jackson.databind.JsonDeserializer)v31),((com.fasterxml.jackson.databind.deser.NullValueProvider)v33),((java.lang.Boolean)v34));
    org.junit.Assert.assertNotNull(v35);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((java.lang.Class)v2));
    Object v4 = "";
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v4));
    Object v6 = "";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = "";
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v8));
    Object v10 = false;
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.NullValueProvider)v9),((java.lang.Boolean)v10));
    Object v12 = "";
    Object v13 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v12));
    Object v14 = "";
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = true;
    Object v19 = ((com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer)v11).withResolved(((com.fasterxml.jackson.databind.JsonDeserializer)v13),((com.fasterxml.jackson.databind.JsonDeserializer)v15),((com.fasterxml.jackson.databind.deser.NullValueProvider)v17),((java.lang.Boolean)v18));
    Object v20 = "";
    Object v21 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v20));
    Object v22 = "";
    Object v23 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v22));
    Object v24 = "";
    Object v25 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v24));
    Object v26 = true;
    Object v27 = ((com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer)v19).withResolved(((com.fasterxml.jackson.databind.JsonDeserializer)v21),((com.fasterxml.jackson.databind.JsonDeserializer)v23),((com.fasterxml.jackson.databind.deser.NullValueProvider)v25),((java.lang.Boolean)v26));
    Object v28 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v29 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v28));
    Object v30 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v29));
    Object v31 = ((com.fasterxml.jackson.databind.JsonDeserializer)v27).getNullValue(((com.fasterxml.jackson.databind.DeserializationContext)v30));
    org.junit.Assert.assertNull(v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((java.lang.Class)v2));
    Object v4 = "";
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v4));
    Object v6 = "";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = "";
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v8));
    Object v10 = false;
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.NullValueProvider)v9),((java.lang.Boolean)v10));
    Object v12 = "";
    Object v13 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v12));
    Object v14 = "";
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = true;
    Object v19 = ((com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer)v11).withResolved(((com.fasterxml.jackson.databind.JsonDeserializer)v13),((com.fasterxml.jackson.databind.JsonDeserializer)v15),((com.fasterxml.jackson.databind.deser.NullValueProvider)v17),((java.lang.Boolean)v18));
    Object v20 = Short.valueOf((short)30);
    Object v21 = new com.fasterxml.jackson.databind.node.ShortNode((((java.lang.Short)v20).shortValue()));
    Object v22 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v23 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v21),((com.fasterxml.jackson.core.ObjectCodec)v22));
    Object v24 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v25 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v24));
    Object v26 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v25));
    Object v27 = Short.valueOf((short)30);
    Object v28 = new com.fasterxml.jackson.databind.node.ShortNode((((java.lang.Short)v27).shortValue()));
    Object v29 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v30 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v28),((com.fasterxml.jackson.core.ObjectCodec)v29));
    Object v31 = com.fasterxml.jackson.core.JsonToken.END_OBJECT;
    Object v32 = "st9ing";
    Object v33 = ((com.fasterxml.jackson.databind.DeserializationContext)v26).wrongTokenException(((com.fasterxml.jackson.core.JsonParser)v30),((com.fasterxml.jackson.core.JsonToken)v31),((java.lang.String)v32));
    Object v34 = com.fasterxml.jackson.databind.ObjectMapper.findModules();
    Object v35 = ((java.util.Collection)v34).hashCode();
    Object v36 = ((com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer)v19).deserialize(((com.fasterxml.jackson.core.JsonParser)v23),((com.fasterxml.jackson.databind.DeserializationContext)v26),((java.util.Collection)v34));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.exc.MismatchedInputException");
    } catch (com.fasterxml.jackson.databind.exc.MismatchedInputException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((java.lang.Class)v2));
    Object v4 = "";
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v4));
    Object v6 = "";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = "";
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v8));
    Object v10 = false;
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.NullValueProvider)v9),((java.lang.Boolean)v10));
    Object v12 = "";
    Object v13 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v12));
    Object v14 = "";
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = true;
    Object v19 = ((com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer)v11).withResolved(((com.fasterxml.jackson.databind.JsonDeserializer)v13),((com.fasterxml.jackson.databind.JsonDeserializer)v15),((com.fasterxml.jackson.databind.deser.NullValueProvider)v17),((java.lang.Boolean)v18));
    Object v20 = "";
    Object v21 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v20));
    Object v22 = "]";
    Object v23 = "not Y valid Double value";
    Object v24 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v22),((java.lang.String)v23));
    Object v25 = ((com.fasterxml.jackson.databind.JsonDeserializer)v21).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v24));
    Object v26 = "";
    Object v27 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v26));
    Object v28 = "]";
    Object v29 = "not Y valid Double value";
    Object v30 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v28),((java.lang.String)v29));
    Object v31 = ((com.fasterxml.jackson.databind.JsonDeserializer)v27).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v30));
    Object v32 = "";
    Object v33 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v32));
    Object v34 = false;
    Object v35 = ((com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer)v19).withResolved(((com.fasterxml.jackson.databind.JsonDeserializer)v25),((com.fasterxml.jackson.databind.JsonDeserializer)v31),((com.fasterxml.jackson.databind.deser.NullValueProvider)v33),((java.lang.Boolean)v34));
    Object v36 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v37 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v36));
    Object v38 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v37));
    Object v39 = ((com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase)v35).getEmptyValue(((com.fasterxml.jackson.databind.DeserializationContext)v38));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.exc.InvalidDefinitionException");
    } catch (com.fasterxml.jackson.databind.exc.InvalidDefinitionException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((java.lang.Class)v2));
    Object v4 = "";
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v4));
    Object v6 = "";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = "";
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v8));
    Object v10 = false;
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.NullValueProvider)v9),((java.lang.Boolean)v10));
    Object v12 = "";
    Object v13 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v12));
    Object v14 = "";
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = true;
    Object v19 = ((com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer)v11).withResolved(((com.fasterxml.jackson.databind.JsonDeserializer)v13),((com.fasterxml.jackson.databind.JsonDeserializer)v15),((com.fasterxml.jackson.databind.deser.NullValueProvider)v17),((java.lang.Boolean)v18));
    Object v20 = "";
    Object v21 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v20));
    Object v22 = "]";
    Object v23 = "not Y valid Double value";
    Object v24 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v22),((java.lang.String)v23));
    Object v25 = ((com.fasterxml.jackson.databind.JsonDeserializer)v21).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v24));
    Object v26 = "";
    Object v27 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v26));
    Object v28 = "]";
    Object v29 = "not Y valid Double value";
    Object v30 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v28),((java.lang.String)v29));
    Object v31 = ((com.fasterxml.jackson.databind.JsonDeserializer)v27).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v30));
    Object v32 = "";
    Object v33 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v32));
    Object v34 = false;
    Object v35 = ((com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer)v19).withResolved(((com.fasterxml.jackson.databind.JsonDeserializer)v25),((com.fasterxml.jackson.databind.JsonDeserializer)v31),((com.fasterxml.jackson.databind.deser.NullValueProvider)v33),((java.lang.Boolean)v34));
    Object v36 = ((com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase)v35).getContentType();
    org.junit.Assert.assertNull(v36);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((java.lang.Class)v3));
    Object v5 = "";
    Object v6 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v5));
    Object v7 = "";
    Object v8 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v7));
    Object v9 = "";
    Object v10 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v9));
    Object v11 = false;
    Object v12 = new com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v4),((com.fasterxml.jackson.databind.JsonDeserializer)v6),((com.fasterxml.jackson.databind.JsonDeserializer)v8),((com.fasterxml.jackson.databind.deser.NullValueProvider)v10),((java.lang.Boolean)v11));
    Object v13 = "";
    Object v14 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v13));
    Object v15 = "";
    Object v16 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v15));
    Object v17 = "";
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v17));
    Object v19 = true;
    Object v20 = ((com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer)v12).withResolved(((com.fasterxml.jackson.databind.JsonDeserializer)v14),((com.fasterxml.jackson.databind.JsonDeserializer)v16),((com.fasterxml.jackson.databind.deser.NullValueProvider)v18),((java.lang.Boolean)v19));
    Object v21 = ((com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer)v20).getContentDeserializer();
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v23));
    Object v25 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((java.lang.Class)v24));
    Object v26 = "";
    Object v27 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v26));
    Object v28 = "";
    Object v29 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v28));
    Object v30 = "";
    Object v31 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v30));
    Object v32 = false;
    Object v33 = new com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v22),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v25),((com.fasterxml.jackson.databind.JsonDeserializer)v27),((com.fasterxml.jackson.databind.JsonDeserializer)v29),((com.fasterxml.jackson.databind.deser.NullValueProvider)v31),((java.lang.Boolean)v32));
    Object v34 = ((com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer)v33).getValueInstantiator();
    Object v35 = ((com.fasterxml.jackson.databind.deser.ValueInstantiator)v34).getValueTypeDesc();
    Object v36 = new com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.JsonDeserializer)v21),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v34));
    org.junit.Assert.assertNotNull(v36);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((java.lang.Class)v3));
    Object v5 = "";
    Object v6 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v5));
    Object v7 = "";
    Object v8 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v7));
    Object v9 = "";
    Object v10 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v9));
    Object v11 = false;
    Object v12 = new com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v4),((com.fasterxml.jackson.databind.JsonDeserializer)v6),((com.fasterxml.jackson.databind.JsonDeserializer)v8),((com.fasterxml.jackson.databind.deser.NullValueProvider)v10),((java.lang.Boolean)v11));
    Object v13 = "";
    Object v14 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v13));
    Object v15 = "";
    Object v16 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v15));
    Object v17 = "";
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v17));
    Object v19 = true;
    Object v20 = ((com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer)v12).withResolved(((com.fasterxml.jackson.databind.JsonDeserializer)v14),((com.fasterxml.jackson.databind.JsonDeserializer)v16),((com.fasterxml.jackson.databind.deser.NullValueProvider)v18),((java.lang.Boolean)v19));
    Object v21 = ((com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer)v20).getContentDeserializer();
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v23));
    Object v25 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((java.lang.Class)v24));
    Object v26 = "";
    Object v27 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v26));
    Object v28 = "";
    Object v29 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v28));
    Object v30 = "";
    Object v31 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v30));
    Object v32 = false;
    Object v33 = new com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v22),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v25),((com.fasterxml.jackson.databind.JsonDeserializer)v27),((com.fasterxml.jackson.databind.JsonDeserializer)v29),((com.fasterxml.jackson.databind.deser.NullValueProvider)v31),((java.lang.Boolean)v32));
    Object v34 = ((com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer)v33).getValueInstantiator();
    Object v35 = ((com.fasterxml.jackson.databind.deser.ValueInstantiator)v34).getValueTypeDesc();
    Object v36 = new com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.JsonDeserializer)v21),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v34));
    Object v37 = ((com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase)v36).getContentType();
    org.junit.Assert.assertNull(v37);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((java.lang.Class)v2));
    Object v4 = "";
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v4));
    Object v6 = "";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = "";
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v8));
    Object v10 = false;
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.NullValueProvider)v9),((java.lang.Boolean)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((java.lang.Class)v14));
    Object v16 = "";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = "";
    Object v19 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v18));
    Object v20 = "";
    Object v21 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v20));
    Object v22 = false;
    Object v23 = new com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v15),((com.fasterxml.jackson.databind.JsonDeserializer)v17),((com.fasterxml.jackson.databind.JsonDeserializer)v19),((com.fasterxml.jackson.databind.deser.NullValueProvider)v21),((java.lang.Boolean)v22));
    Object v24 = "";
    Object v25 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v24));
    Object v26 = "";
    Object v27 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v26));
    Object v28 = "";
    Object v29 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v28));
    Object v30 = true;
    Object v31 = ((com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer)v23).withResolved(((com.fasterxml.jackson.databind.JsonDeserializer)v25),((com.fasterxml.jackson.databind.JsonDeserializer)v27),((com.fasterxml.jackson.databind.deser.NullValueProvider)v29),((java.lang.Boolean)v30));
    Object v32 = ((com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer)v31).getContentDeserializer();
    Object v33 = "";
    Object v34 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v33));
    Object v35 = "";
    Object v36 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v35));
    Object v37 = false;
    Object v38 = ((com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer)v11).withResolved(((com.fasterxml.jackson.databind.JsonDeserializer)v32),((com.fasterxml.jackson.databind.JsonDeserializer)v34),((com.fasterxml.jackson.databind.deser.NullValueProvider)v36),((java.lang.Boolean)v37));
    Object v39 = ((com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase)v38).getContentType();
    org.junit.Assert.assertNull(v39);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((java.lang.Class)v2));
    Object v4 = "";
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v4));
    Object v6 = "";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = "";
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v8));
    Object v10 = false;
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.NullValueProvider)v9),((java.lang.Boolean)v10));
    Object v12 = "";
    Object v13 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v12));
    Object v14 = "";
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = true;
    Object v19 = ((com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer)v11).withResolved(((com.fasterxml.jackson.databind.JsonDeserializer)v13),((com.fasterxml.jackson.databind.JsonDeserializer)v15),((com.fasterxml.jackson.databind.deser.NullValueProvider)v17),((java.lang.Boolean)v18));
    Object v20 = "";
    Object v21 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v20));
    Object v22 = "";
    Object v23 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v22));
    Object v24 = "";
    Object v25 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v24));
    Object v26 = true;
    Object v27 = ((com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer)v19).withResolved(((com.fasterxml.jackson.databind.JsonDeserializer)v21),((com.fasterxml.jackson.databind.JsonDeserializer)v23),((com.fasterxml.jackson.databind.deser.NullValueProvider)v25),((java.lang.Boolean)v26));
    Object v28 = ((com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase)v27).getContentDeserializer();
    Object v29 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v30 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v29));
    Object v31 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v30));
    Object v32 = ((com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase)v27).getEmptyValue(((com.fasterxml.jackson.databind.DeserializationContext)v31));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.exc.InvalidDefinitionException");
    } catch (com.fasterxml.jackson.databind.exc.InvalidDefinitionException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((java.lang.Class)v3));
    Object v5 = "";
    Object v6 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v5));
    Object v7 = "";
    Object v8 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v7));
    Object v9 = "";
    Object v10 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v9));
    Object v11 = false;
    Object v12 = new com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v4),((com.fasterxml.jackson.databind.JsonDeserializer)v6),((com.fasterxml.jackson.databind.JsonDeserializer)v8),((com.fasterxml.jackson.databind.deser.NullValueProvider)v10),((java.lang.Boolean)v11));
    Object v13 = "";
    Object v14 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v13));
    Object v15 = "";
    Object v16 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v15));
    Object v17 = "";
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v17));
    Object v19 = true;
    Object v20 = ((com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer)v12).withResolved(((com.fasterxml.jackson.databind.JsonDeserializer)v14),((com.fasterxml.jackson.databind.JsonDeserializer)v16),((com.fasterxml.jackson.databind.deser.NullValueProvider)v18),((java.lang.Boolean)v19));
    Object v21 = ((com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer)v20).getContentDeserializer();
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v23));
    Object v25 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((java.lang.Class)v24));
    Object v26 = "";
    Object v27 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v26));
    Object v28 = "";
    Object v29 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v28));
    Object v30 = "";
    Object v31 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v30));
    Object v32 = false;
    Object v33 = new com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v22),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v25),((com.fasterxml.jackson.databind.JsonDeserializer)v27),((com.fasterxml.jackson.databind.JsonDeserializer)v29),((com.fasterxml.jackson.databind.deser.NullValueProvider)v31),((java.lang.Boolean)v32));
    Object v34 = ((com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer)v33).getValueInstantiator();
    Object v35 = ((com.fasterxml.jackson.databind.deser.ValueInstantiator)v34).getValueTypeDesc();
    Object v36 = new com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.JsonDeserializer)v21),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v34));
    Object v37 = ((com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer)v36).isCachable();
    org.junit.Assert.assertEquals((Object)(false), v37);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((java.lang.Class)v2));
    Object v4 = "";
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v4));
    Object v6 = "";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = "";
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v8));
    Object v10 = false;
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.NullValueProvider)v9),((java.lang.Boolean)v10));
    Object v12 = ((com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase)v11).getContentDeserializer();
    Object v13 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v14 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v14));
    Object v16 = ((com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase)v11).getEmptyValue(((com.fasterxml.jackson.databind.DeserializationContext)v15));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.exc.InvalidDefinitionException");
    } catch (com.fasterxml.jackson.databind.exc.InvalidDefinitionException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((java.lang.Class)v2));
    Object v4 = "";
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v4));
    Object v6 = "";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = "";
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v8));
    Object v10 = false;
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.NullValueProvider)v9),((java.lang.Boolean)v10));
    Object v12 = ((com.fasterxml.jackson.databind.JsonDeserializer)v11).getObjectIdReader();
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((java.lang.Class)v2));
    Object v4 = "";
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v4));
    Object v6 = "";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = "";
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v8));
    Object v10 = false;
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.NullValueProvider)v9),((java.lang.Boolean)v10));
    Object v12 = "";
    Object v13 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v12));
    Object v14 = "";
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = true;
    Object v19 = ((com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer)v11).withResolved(((com.fasterxml.jackson.databind.JsonDeserializer)v13),((com.fasterxml.jackson.databind.JsonDeserializer)v15),((com.fasterxml.jackson.databind.deser.NullValueProvider)v17),((java.lang.Boolean)v18));
    Object v20 = "";
    Object v21 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v20));
    Object v22 = "]";
    Object v23 = "not Y valid Double value";
    Object v24 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v22),((java.lang.String)v23));
    Object v25 = ((com.fasterxml.jackson.databind.JsonDeserializer)v21).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v24));
    Object v26 = "";
    Object v27 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v26));
    Object v28 = "]";
    Object v29 = "not Y valid Double value";
    Object v30 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v28),((java.lang.String)v29));
    Object v31 = ((com.fasterxml.jackson.databind.JsonDeserializer)v27).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v30));
    Object v32 = "";
    Object v33 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v32));
    Object v34 = false;
    Object v35 = ((com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer)v19).withResolved(((com.fasterxml.jackson.databind.JsonDeserializer)v25),((com.fasterxml.jackson.databind.JsonDeserializer)v31),((com.fasterxml.jackson.databind.deser.NullValueProvider)v33),((java.lang.Boolean)v34));
    Object v36 = "array";
    Object v37 = ((com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase)v35).findBackReference(((java.lang.String)v36));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((java.lang.Class)v2));
    Object v4 = "";
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v4));
    Object v6 = "";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = "";
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v8));
    Object v10 = false;
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.NullValueProvider)v9),((java.lang.Boolean)v10));
    Object v12 = "";
    Object v13 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v12));
    Object v14 = "";
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = true;
    Object v19 = ((com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer)v11).withResolved(((com.fasterxml.jackson.databind.JsonDeserializer)v13),((com.fasterxml.jackson.databind.JsonDeserializer)v15),((com.fasterxml.jackson.databind.deser.NullValueProvider)v17),((java.lang.Boolean)v18));
    Object v20 = "";
    Object v21 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v20));
    Object v22 = "";
    Object v23 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v22));
    Object v24 = "";
    Object v25 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v24));
    Object v26 = true;
    Object v27 = ((com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer)v19).withResolved(((com.fasterxml.jackson.databind.JsonDeserializer)v21),((com.fasterxml.jackson.databind.JsonDeserializer)v23),((com.fasterxml.jackson.databind.deser.NullValueProvider)v25),((java.lang.Boolean)v26));
    Object v28 = "";
    Object v29 = ((com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase)v27).findBackReference(((java.lang.String)v28));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((java.lang.Class)v4));
    Object v6 = "";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = "";
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v8));
    Object v10 = "";
    Object v11 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v10));
    Object v12 = false;
    Object v13 = new com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.JsonDeserializer)v9),((com.fasterxml.jackson.databind.deser.NullValueProvider)v11),((java.lang.Boolean)v12));
    Object v14 = "";
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = "";
    Object v19 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v18));
    Object v20 = true;
    Object v21 = ((com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer)v13).withResolved(((com.fasterxml.jackson.databind.JsonDeserializer)v15),((com.fasterxml.jackson.databind.JsonDeserializer)v17),((com.fasterxml.jackson.databind.deser.NullValueProvider)v19),((java.lang.Boolean)v20));
    Object v22 = ((com.fasterxml.jackson.databind.JsonDeserializer)v1).replaceDelegatee(((com.fasterxml.jackson.databind.JsonDeserializer)v21));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((java.lang.Class)v2));
    Object v4 = "";
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v4));
    Object v6 = "";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = "";
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v8));
    Object v10 = false;
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.NullValueProvider)v9),((java.lang.Boolean)v10));
    Object v12 = "";
    Object v13 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v12));
    Object v14 = "";
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = true;
    Object v19 = ((com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer)v11).withResolved(((com.fasterxml.jackson.databind.JsonDeserializer)v13),((com.fasterxml.jackson.databind.JsonDeserializer)v15),((com.fasterxml.jackson.databind.deser.NullValueProvider)v17),((java.lang.Boolean)v18));
    Object v20 = "";
    Object v21 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v20));
    Object v22 = "";
    Object v23 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v22));
    Object v24 = "";
    Object v25 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v24));
    Object v26 = true;
    Object v27 = ((com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer)v19).withResolved(((com.fasterxml.jackson.databind.JsonDeserializer)v21),((com.fasterxml.jackson.databind.JsonDeserializer)v23),((com.fasterxml.jackson.databind.deser.NullValueProvider)v25),((java.lang.Boolean)v26));
    Object v28 = "fals";
    Object v29 = ((com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase)v27).findBackReference(((java.lang.String)v28));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((java.lang.Class)v2));
    Object v4 = "";
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v4));
    Object v6 = "";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = "";
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v8));
    Object v10 = false;
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.NullValueProvider)v9),((java.lang.Boolean)v10));
    Object v12 = "";
    Object v13 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v12));
    Object v14 = "";
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = true;
    Object v19 = ((com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer)v11).withResolved(((com.fasterxml.jackson.databind.JsonDeserializer)v13),((com.fasterxml.jackson.databind.JsonDeserializer)v15),((com.fasterxml.jackson.databind.deser.NullValueProvider)v17),((java.lang.Boolean)v18));
    Object v20 = "";
    Object v21 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v20));
    Object v22 = "]";
    Object v23 = "not Y valid Double value";
    Object v24 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v22),((java.lang.String)v23));
    Object v25 = ((com.fasterxml.jackson.databind.JsonDeserializer)v21).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v24));
    Object v26 = "";
    Object v27 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v26));
    Object v28 = "]";
    Object v29 = "not Y valid Double value";
    Object v30 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v28),((java.lang.String)v29));
    Object v31 = ((com.fasterxml.jackson.databind.JsonDeserializer)v27).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v30));
    Object v32 = "";
    Object v33 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v32));
    Object v34 = false;
    Object v35 = ((com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer)v19).withResolved(((com.fasterxml.jackson.databind.JsonDeserializer)v25),((com.fasterxml.jackson.databind.JsonDeserializer)v31),((com.fasterxml.jackson.databind.deser.NullValueProvider)v33),((java.lang.Boolean)v34));
    Object v36 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v35).getValueClass();
    org.junit.Assert.assertNotNull(v36);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((java.lang.Class)v3));
    Object v5 = "";
    Object v6 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v5));
    Object v7 = "";
    Object v8 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v7));
    Object v9 = "";
    Object v10 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v9));
    Object v11 = false;
    Object v12 = new com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v4),((com.fasterxml.jackson.databind.JsonDeserializer)v6),((com.fasterxml.jackson.databind.JsonDeserializer)v8),((com.fasterxml.jackson.databind.deser.NullValueProvider)v10),((java.lang.Boolean)v11));
    Object v13 = "";
    Object v14 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v13));
    Object v15 = "";
    Object v16 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v15));
    Object v17 = "";
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v17));
    Object v19 = true;
    Object v20 = ((com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer)v12).withResolved(((com.fasterxml.jackson.databind.JsonDeserializer)v14),((com.fasterxml.jackson.databind.JsonDeserializer)v16),((com.fasterxml.jackson.databind.deser.NullValueProvider)v18),((java.lang.Boolean)v19));
    Object v21 = ((com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer)v20).getContentDeserializer();
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v23));
    Object v25 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((java.lang.Class)v24));
    Object v26 = "";
    Object v27 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v26));
    Object v28 = "";
    Object v29 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v28));
    Object v30 = "";
    Object v31 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v30));
    Object v32 = false;
    Object v33 = new com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v22),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v25),((com.fasterxml.jackson.databind.JsonDeserializer)v27),((com.fasterxml.jackson.databind.JsonDeserializer)v29),((com.fasterxml.jackson.databind.deser.NullValueProvider)v31),((java.lang.Boolean)v32));
    Object v34 = ((com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer)v33).getValueInstantiator();
    Object v35 = ((com.fasterxml.jackson.databind.deser.ValueInstantiator)v34).getValueTypeDesc();
    Object v36 = new com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.JsonDeserializer)v21),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v34));
    Object v37 = "Cannot use FormatSchema of type ";
    Object v38 = ((com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase)v36).findBackReference(((java.lang.String)v37));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = "";
    Object v1 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v0));
    Object v2 = "]";
    Object v3 = "not Y valid Double value";
    Object v4 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = ((com.fasterxml.jackson.databind.JsonDeserializer)v1).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v4));
    Object v6 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v5).handledType();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((java.lang.Class)v2));
    Object v4 = "";
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v4));
    Object v6 = "";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = "";
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v8));
    Object v10 = false;
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.NullValueProvider)v9),((java.lang.Boolean)v10));
    Object v12 = "";
    Object v13 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v12));
    Object v14 = "";
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = true;
    Object v19 = ((com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer)v11).withResolved(((com.fasterxml.jackson.databind.JsonDeserializer)v13),((com.fasterxml.jackson.databind.JsonDeserializer)v15),((com.fasterxml.jackson.databind.deser.NullValueProvider)v17),((java.lang.Boolean)v18));
    Object v20 = "";
    Object v21 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v20));
    Object v22 = "]";
    Object v23 = "not Y valid Double value";
    Object v24 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v22),((java.lang.String)v23));
    Object v25 = ((com.fasterxml.jackson.databind.JsonDeserializer)v21).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v24));
    Object v26 = "";
    Object v27 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v26));
    Object v28 = "]";
    Object v29 = "not Y valid Double value";
    Object v30 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v28),((java.lang.String)v29));
    Object v31 = ((com.fasterxml.jackson.databind.JsonDeserializer)v27).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v30));
    Object v32 = "";
    Object v33 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v32));
    Object v34 = false;
    Object v35 = ((com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer)v19).withResolved(((com.fasterxml.jackson.databind.JsonDeserializer)v25),((com.fasterxml.jackson.databind.JsonDeserializer)v31),((com.fasterxml.jackson.databind.deser.NullValueProvider)v33),((java.lang.Boolean)v34));
    Object v36 = "Unexpected JSON values; expected";
    Object v37 = ((com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase)v35).findBackReference(((java.lang.String)v36));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((java.lang.Class)v2));
    Object v4 = "";
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v4));
    Object v6 = "";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = "";
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v8));
    Object v10 = false;
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.NullValueProvider)v9),((java.lang.Boolean)v10));
    Object v12 = "";
    Object v13 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v12));
    Object v14 = "";
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = true;
    Object v19 = ((com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer)v11).withResolved(((com.fasterxml.jackson.databind.JsonDeserializer)v13),((com.fasterxml.jackson.databind.JsonDeserializer)v15),((com.fasterxml.jackson.databind.deser.NullValueProvider)v17),((java.lang.Boolean)v18));
    Object v20 = "#";
    Object v21 = ((com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase)v19).findBackReference(((java.lang.String)v20));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = "";
    Object v1 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v0));
    Object v2 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v1).handledType();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((java.lang.Class)v2));
    Object v4 = "";
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v4));
    Object v6 = "";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = "";
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v8));
    Object v10 = false;
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.NullValueProvider)v9),((java.lang.Boolean)v10));
    Object v12 = "";
    Object v13 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v12));
    Object v14 = "";
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = true;
    Object v19 = ((com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer)v11).withResolved(((com.fasterxml.jackson.databind.JsonDeserializer)v13),((com.fasterxml.jackson.databind.JsonDeserializer)v15),((com.fasterxml.jackson.databind.deser.NullValueProvider)v17),((java.lang.Boolean)v18));
    Object v20 = "";
    Object v21 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v20));
    Object v22 = "]";
    Object v23 = "not Y valid Double value";
    Object v24 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v22),((java.lang.String)v23));
    Object v25 = ((com.fasterxml.jackson.databind.JsonDeserializer)v21).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v24));
    Object v26 = "";
    Object v27 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v26));
    Object v28 = "]";
    Object v29 = "not Y valid Double value";
    Object v30 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v28),((java.lang.String)v29));
    Object v31 = ((com.fasterxml.jackson.databind.JsonDeserializer)v27).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v30));
    Object v32 = "";
    Object v33 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v32));
    Object v34 = false;
    Object v35 = ((com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer)v19).withResolved(((com.fasterxml.jackson.databind.JsonDeserializer)v25),((com.fasterxml.jackson.databind.JsonDeserializer)v31),((com.fasterxml.jackson.databind.deser.NullValueProvider)v33),((java.lang.Boolean)v34));
    Object v36 = ((com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase)v35).getContentDeserializer();
    Object v37 = ((com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase)v35).getContentType();
    org.junit.Assert.assertNull(v37);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((java.lang.Class)v3));
    Object v5 = "";
    Object v6 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v5));
    Object v7 = "";
    Object v8 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v7));
    Object v9 = "";
    Object v10 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v9));
    Object v11 = false;
    Object v12 = new com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v4),((com.fasterxml.jackson.databind.JsonDeserializer)v6),((com.fasterxml.jackson.databind.JsonDeserializer)v8),((com.fasterxml.jackson.databind.deser.NullValueProvider)v10),((java.lang.Boolean)v11));
    Object v13 = "";
    Object v14 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v13));
    Object v15 = "";
    Object v16 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v15));
    Object v17 = "";
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v17));
    Object v19 = true;
    Object v20 = ((com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer)v12).withResolved(((com.fasterxml.jackson.databind.JsonDeserializer)v14),((com.fasterxml.jackson.databind.JsonDeserializer)v16),((com.fasterxml.jackson.databind.deser.NullValueProvider)v18),((java.lang.Boolean)v19));
    Object v21 = ((com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer)v20).getContentDeserializer();
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v23));
    Object v25 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((java.lang.Class)v24));
    Object v26 = "";
    Object v27 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v26));
    Object v28 = "";
    Object v29 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v28));
    Object v30 = "";
    Object v31 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v30));
    Object v32 = false;
    Object v33 = new com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v22),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v25),((com.fasterxml.jackson.databind.JsonDeserializer)v27),((com.fasterxml.jackson.databind.JsonDeserializer)v29),((com.fasterxml.jackson.databind.deser.NullValueProvider)v31),((java.lang.Boolean)v32));
    Object v34 = ((com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer)v33).getValueInstantiator();
    Object v35 = ((com.fasterxml.jackson.databind.deser.ValueInstantiator)v34).getValueTypeDesc();
    Object v36 = new com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.JsonDeserializer)v21),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v34));
    Object v37 = ((com.fasterxml.jackson.databind.JsonDeserializer)v36).getEmptyValue();
    org.junit.Assert.assertNull(v37);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = "";
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v1));
    Object v3 = "]";
    Object v4 = "not Y valid Double value";
    Object v5 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((com.fasterxml.jackson.databind.JsonDeserializer)v2).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((java.lang.Class)v9));
    Object v11 = "";
    Object v12 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v11));
    Object v13 = "";
    Object v14 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v13));
    Object v15 = "";
    Object v16 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v15));
    Object v17 = false;
    Object v18 = new com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v10),((com.fasterxml.jackson.databind.JsonDeserializer)v12),((com.fasterxml.jackson.databind.JsonDeserializer)v14),((com.fasterxml.jackson.databind.deser.NullValueProvider)v16),((java.lang.Boolean)v17));
    Object v19 = "";
    Object v20 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v19));
    Object v21 = "";
    Object v22 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v21));
    Object v23 = "";
    Object v24 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v23));
    Object v25 = true;
    Object v26 = ((com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer)v18).withResolved(((com.fasterxml.jackson.databind.JsonDeserializer)v20),((com.fasterxml.jackson.databind.JsonDeserializer)v22),((com.fasterxml.jackson.databind.deser.NullValueProvider)v24),((java.lang.Boolean)v25));
    Object v27 = ((com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer)v26).getValueInstantiator();
    Object v28 = new com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.JsonDeserializer)v6),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v27));
    org.junit.Assert.assertNotNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((java.lang.Class)v2));
    Object v4 = "";
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v4));
    Object v6 = "";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = "";
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v8));
    Object v10 = false;
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.NullValueProvider)v9),((java.lang.Boolean)v10));
    Object v12 = "";
    Object v13 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v12));
    Object v14 = "";
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = true;
    Object v19 = ((com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer)v11).withResolved(((com.fasterxml.jackson.databind.JsonDeserializer)v13),((com.fasterxml.jackson.databind.JsonDeserializer)v15),((com.fasterxml.jackson.databind.deser.NullValueProvider)v17),((java.lang.Boolean)v18));
    Object v20 = "";
    Object v21 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v20));
    Object v22 = "";
    Object v23 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v22));
    Object v24 = "";
    Object v25 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v24));
    Object v26 = true;
    Object v27 = ((com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer)v19).withResolved(((com.fasterxml.jackson.databind.JsonDeserializer)v21),((com.fasterxml.jackson.databind.JsonDeserializer)v23),((com.fasterxml.jackson.databind.deser.NullValueProvider)v25),((java.lang.Boolean)v26));
    Object v28 = " (no erro5r message provided)";
    Object v29 = ((com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase)v27).findBackReference(((java.lang.String)v28));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = "";
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v1));
    Object v3 = "]";
    Object v4 = "not Y valid Double value";
    Object v5 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((com.fasterxml.jackson.databind.JsonDeserializer)v2).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((java.lang.Class)v9));
    Object v11 = "";
    Object v12 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v11));
    Object v13 = "";
    Object v14 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v13));
    Object v15 = "";
    Object v16 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v15));
    Object v17 = false;
    Object v18 = new com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v10),((com.fasterxml.jackson.databind.JsonDeserializer)v12),((com.fasterxml.jackson.databind.JsonDeserializer)v14),((com.fasterxml.jackson.databind.deser.NullValueProvider)v16),((java.lang.Boolean)v17));
    Object v19 = "";
    Object v20 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v19));
    Object v21 = "";
    Object v22 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v21));
    Object v23 = "";
    Object v24 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v23));
    Object v25 = true;
    Object v26 = ((com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer)v18).withResolved(((com.fasterxml.jackson.databind.JsonDeserializer)v20),((com.fasterxml.jackson.databind.JsonDeserializer)v22),((com.fasterxml.jackson.databind.deser.NullValueProvider)v24),((java.lang.Boolean)v25));
    Object v27 = ((com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer)v26).getValueInstantiator();
    Object v28 = new com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.JsonDeserializer)v6),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v27));
    Object v29 = ((com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer)v28).isCachable();
    org.junit.Assert.assertEquals((Object)(false), v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((java.lang.Class)v3));
    Object v5 = "";
    Object v6 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v5));
    Object v7 = "";
    Object v8 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v7));
    Object v9 = "";
    Object v10 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v9));
    Object v11 = false;
    Object v12 = new com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v4),((com.fasterxml.jackson.databind.JsonDeserializer)v6),((com.fasterxml.jackson.databind.JsonDeserializer)v8),((com.fasterxml.jackson.databind.deser.NullValueProvider)v10),((java.lang.Boolean)v11));
    Object v13 = "";
    Object v14 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v13));
    Object v15 = "";
    Object v16 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v15));
    Object v17 = "";
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v17));
    Object v19 = true;
    Object v20 = ((com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer)v12).withResolved(((com.fasterxml.jackson.databind.JsonDeserializer)v14),((com.fasterxml.jackson.databind.JsonDeserializer)v16),((com.fasterxml.jackson.databind.deser.NullValueProvider)v18),((java.lang.Boolean)v19));
    Object v21 = ((com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer)v20).getContentDeserializer();
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v23));
    Object v25 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((java.lang.Class)v24));
    Object v26 = "";
    Object v27 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v26));
    Object v28 = "";
    Object v29 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v28));
    Object v30 = "";
    Object v31 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v30));
    Object v32 = false;
    Object v33 = new com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v22),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v25),((com.fasterxml.jackson.databind.JsonDeserializer)v27),((com.fasterxml.jackson.databind.JsonDeserializer)v29),((com.fasterxml.jackson.databind.deser.NullValueProvider)v31),((java.lang.Boolean)v32));
    Object v34 = ((com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer)v33).getValueInstantiator();
    Object v35 = ((com.fasterxml.jackson.databind.deser.ValueInstantiator)v34).getValueTypeDesc();
    Object v36 = new com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.JsonDeserializer)v21),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v34));
    Object v37 = ((com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase)v36).getValueType();
    org.junit.Assert.assertNotNull(v37);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = "";
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v1));
    Object v3 = "]";
    Object v4 = "not Y valid Double value";
    Object v5 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((com.fasterxml.jackson.databind.JsonDeserializer)v2).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((java.lang.Class)v9));
    Object v11 = "";
    Object v12 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v11));
    Object v13 = "";
    Object v14 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v13));
    Object v15 = "";
    Object v16 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v15));
    Object v17 = false;
    Object v18 = new com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v10),((com.fasterxml.jackson.databind.JsonDeserializer)v12),((com.fasterxml.jackson.databind.JsonDeserializer)v14),((com.fasterxml.jackson.databind.deser.NullValueProvider)v16),((java.lang.Boolean)v17));
    Object v19 = "";
    Object v20 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v19));
    Object v21 = "";
    Object v22 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v21));
    Object v23 = "";
    Object v24 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v23));
    Object v25 = true;
    Object v26 = ((com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer)v18).withResolved(((com.fasterxml.jackson.databind.JsonDeserializer)v20),((com.fasterxml.jackson.databind.JsonDeserializer)v22),((com.fasterxml.jackson.databind.deser.NullValueProvider)v24),((java.lang.Boolean)v25));
    Object v27 = ((com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer)v26).getValueInstantiator();
    Object v28 = new com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.JsonDeserializer)v6),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v27));
    Object v29 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v30 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v29));
    Object v31 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v30));
    Object v32 = ((com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase)v28).getEmptyValue(((com.fasterxml.jackson.databind.DeserializationContext)v31));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.exc.InvalidDefinitionException");
    } catch (com.fasterxml.jackson.databind.exc.InvalidDefinitionException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = "";
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v1));
    Object v3 = "]";
    Object v4 = "not Y valid Double value";
    Object v5 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((com.fasterxml.jackson.databind.JsonDeserializer)v2).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((java.lang.Class)v9));
    Object v11 = "";
    Object v12 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v11));
    Object v13 = "";
    Object v14 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v13));
    Object v15 = "";
    Object v16 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v15));
    Object v17 = false;
    Object v18 = new com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v10),((com.fasterxml.jackson.databind.JsonDeserializer)v12),((com.fasterxml.jackson.databind.JsonDeserializer)v14),((com.fasterxml.jackson.databind.deser.NullValueProvider)v16),((java.lang.Boolean)v17));
    Object v19 = "";
    Object v20 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v19));
    Object v21 = "";
    Object v22 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v21));
    Object v23 = "";
    Object v24 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v23));
    Object v25 = true;
    Object v26 = ((com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer)v18).withResolved(((com.fasterxml.jackson.databind.JsonDeserializer)v20),((com.fasterxml.jackson.databind.JsonDeserializer)v22),((com.fasterxml.jackson.databind.deser.NullValueProvider)v24),((java.lang.Boolean)v25));
    Object v27 = ((com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer)v26).getValueInstantiator();
    Object v28 = new com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.JsonDeserializer)v6),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v27));
    Object v29 = ((com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase)v28).getContentDeserializer();
    Object v30 = ((com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase)v28).getContentType();
    org.junit.Assert.assertNull(v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = "";
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v1));
    Object v3 = "]";
    Object v4 = "not Y valid Double value";
    Object v5 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((com.fasterxml.jackson.databind.JsonDeserializer)v2).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((java.lang.Class)v9));
    Object v11 = "";
    Object v12 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v11));
    Object v13 = "";
    Object v14 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v13));
    Object v15 = "";
    Object v16 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v15));
    Object v17 = false;
    Object v18 = new com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v10),((com.fasterxml.jackson.databind.JsonDeserializer)v12),((com.fasterxml.jackson.databind.JsonDeserializer)v14),((com.fasterxml.jackson.databind.deser.NullValueProvider)v16),((java.lang.Boolean)v17));
    Object v19 = "";
    Object v20 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v19));
    Object v21 = "";
    Object v22 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v21));
    Object v23 = "";
    Object v24 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v23));
    Object v25 = true;
    Object v26 = ((com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer)v18).withResolved(((com.fasterxml.jackson.databind.JsonDeserializer)v20),((com.fasterxml.jackson.databind.JsonDeserializer)v22),((com.fasterxml.jackson.databind.deser.NullValueProvider)v24),((java.lang.Boolean)v25));
    Object v27 = ((com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer)v26).getValueInstantiator();
    Object v28 = new com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.JsonDeserializer)v6),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v27));
    Object v29 = ((com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase)v28).getContentType();
    org.junit.Assert.assertNull(v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((java.lang.Class)v2));
    Object v4 = "";
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v4));
    Object v6 = "";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = "";
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v8));
    Object v10 = false;
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.NullValueProvider)v9),((java.lang.Boolean)v10));
    Object v12 = "";
    Object v13 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v12));
    Object v14 = "";
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = true;
    Object v19 = ((com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer)v11).withResolved(((com.fasterxml.jackson.databind.JsonDeserializer)v13),((com.fasterxml.jackson.databind.JsonDeserializer)v15),((com.fasterxml.jackson.databind.deser.NullValueProvider)v17),((java.lang.Boolean)v18));
    Object v20 = ((com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer)v19).getContentDeserializer();
    Object v21 = ((com.fasterxml.jackson.databind.JsonDeserializer)v20).getDelegatee();
    org.junit.Assert.assertNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((java.lang.Class)v2));
    Object v4 = "";
    Object v5 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v4));
    Object v6 = "";
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v6));
    Object v8 = "";
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v8));
    Object v10 = false;
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v3),((com.fasterxml.jackson.databind.JsonDeserializer)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.NullValueProvider)v9),((java.lang.Boolean)v10));
    Object v12 = "";
    Object v13 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v12));
    Object v14 = "";
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v14));
    Object v16 = "";
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v16));
    Object v18 = true;
    Object v19 = ((com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer)v11).withResolved(((com.fasterxml.jackson.databind.JsonDeserializer)v13),((com.fasterxml.jackson.databind.JsonDeserializer)v15),((com.fasterxml.jackson.databind.deser.NullValueProvider)v17),((java.lang.Boolean)v18));
    Object v20 = "";
    Object v21 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v20));
    Object v22 = "]";
    Object v23 = "not Y valid Double value";
    Object v24 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v22),((java.lang.String)v23));
    Object v25 = ((com.fasterxml.jackson.databind.JsonDeserializer)v21).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v24));
    Object v26 = "";
    Object v27 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v26));
    Object v28 = "]";
    Object v29 = "not Y valid Double value";
    Object v30 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v28),((java.lang.String)v29));
    Object v31 = ((com.fasterxml.jackson.databind.JsonDeserializer)v27).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v30));
    Object v32 = "";
    Object v33 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v32));
    Object v34 = false;
    Object v35 = ((com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer)v19).withResolved(((com.fasterxml.jackson.databind.JsonDeserializer)v25),((com.fasterxml.jackson.databind.JsonDeserializer)v31),((com.fasterxml.jackson.databind.deser.NullValueProvider)v33),((java.lang.Boolean)v34));
    Object v36 = ((com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer)v35).isCachable();
    org.junit.Assert.assertEquals((Object)(false), v36);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = "";
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v1));
    Object v3 = "]";
    Object v4 = "not Y valid Double value";
    Object v5 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((com.fasterxml.jackson.databind.JsonDeserializer)v2).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((java.lang.Class)v9));
    Object v11 = "";
    Object v12 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v11));
    Object v13 = "";
    Object v14 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v13));
    Object v15 = "";
    Object v16 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v15));
    Object v17 = false;
    Object v18 = new com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v10),((com.fasterxml.jackson.databind.JsonDeserializer)v12),((com.fasterxml.jackson.databind.JsonDeserializer)v14),((com.fasterxml.jackson.databind.deser.NullValueProvider)v16),((java.lang.Boolean)v17));
    Object v19 = "";
    Object v20 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v19));
    Object v21 = "";
    Object v22 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v21));
    Object v23 = "";
    Object v24 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v23));
    Object v25 = true;
    Object v26 = ((com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer)v18).withResolved(((com.fasterxml.jackson.databind.JsonDeserializer)v20),((com.fasterxml.jackson.databind.JsonDeserializer)v22),((com.fasterxml.jackson.databind.deser.NullValueProvider)v24),((java.lang.Boolean)v25));
    Object v27 = ((com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer)v26).getValueInstantiator();
    Object v28 = new com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.JsonDeserializer)v6),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v27));
    Object v29 = Short.valueOf((short)30);
    Object v30 = new com.fasterxml.jackson.databind.node.ShortNode((((java.lang.Short)v29).shortValue()));
    Object v31 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v32 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v30),((com.fasterxml.jackson.core.ObjectCodec)v31));
    Object v33 = ((com.fasterxml.jackson.core.JsonParser)v32).nextTextValue();
    Object v34 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v35 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v34));
    Object v36 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v35));
    Object v37 = ((com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer)v28).deserialize(((com.fasterxml.jackson.core.JsonParser)v32),((com.fasterxml.jackson.databind.DeserializationContext)v36));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }
}
