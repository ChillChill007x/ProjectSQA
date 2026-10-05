package com.fasterxml.jackson.databind.deser.impl;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = true;
    Object v1 = 1;
    Object v2 = new java.util.ArrayList((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap((((java.lang.Boolean)v0).booleanValue()),((java.util.Collection)v2));
    Object v4 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v3).iterator();
    Object v5 = false;
    Object v6 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v3).withCaseInsensitivity((((java.lang.Boolean)v5).booleanValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = true;
    Object v1 = 1;
    Object v2 = new java.util.ArrayList((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap((((java.lang.Boolean)v0).booleanValue()),((java.util.Collection)v2));
    Object v4 = ((java.lang.Iterable)v3).spliterator();
    Object v5 = "";
    Object v6 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v3).find(((java.lang.String)v5));
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = true;
    Object v1 = 1;
    Object v2 = new java.util.ArrayList((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap((((java.lang.Boolean)v0).booleanValue()),((java.util.Collection)v2));
    Object v4 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v3).iterator();
    Object v5 = false;
    Object v6 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v3).withCaseInsensitivity((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v6).withCaseInsensitivity((((java.lang.Boolean)v7).booleanValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = true;
    Object v1 = 1;
    Object v2 = new java.util.ArrayList((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap((((java.lang.Boolean)v0).booleanValue()),((java.util.Collection)v2));
    Object v4 = 1;
    Object v5 = new java.util.ArrayList((((java.lang.Integer)v4).intValue()));
    ((java.util.Collection)v5).clear();
    Object v6 = null;
    Object v7 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v3).withoutProperties(((java.util.Collection)v5));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = true;
    Object v1 = 1;
    Object v2 = new java.util.ArrayList((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap((((java.lang.Boolean)v0).booleanValue()),((java.util.Collection)v2));
    Object v4 = 1;
    Object v5 = new java.util.ArrayList((((java.lang.Integer)v4).intValue()));
    ((java.util.Collection)v5).clear();
    Object v6 = null;
    Object v7 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v3).withoutProperties(((java.util.Collection)v5));
    Object v8 = "array";
    Object v9 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v7).find(((java.lang.String)v8));
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = true;
    Object v1 = 1;
    Object v2 = new java.util.ArrayList((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap((((java.lang.Boolean)v0).booleanValue()),((java.util.Collection)v2));
    Object v4 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v3).iterator();
    Object v5 = false;
    Object v6 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v3).withCaseInsensitivity((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v6).withCaseInsensitivity((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = false;
    Object v10 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v8).withCaseInsensitivity((((java.lang.Boolean)v9).booleanValue()));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = true;
    Object v1 = 1;
    Object v2 = new java.util.ArrayList((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap((((java.lang.Boolean)v0).booleanValue()),((java.util.Collection)v2));
    Object v4 = 1;
    Object v5 = new java.util.ArrayList((((java.lang.Integer)v4).intValue()));
    ((java.util.Collection)v5).clear();
    Object v6 = null;
    Object v7 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v3).withoutProperties(((java.util.Collection)v5));
    Object v8 = true;
    Object v9 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v9));
    Object v11 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v12 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v10),((com.fasterxml.jackson.core.ObjectCodec)v11));
    Object v13 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v14 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v17 = ") has not properly overridden method 'withAdditionalSeriaKlizers': can not instantiate subtype with additional serializer definitions";
    Object v18 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v7).findDeserializeAndSet(((com.fasterxml.jackson.core.JsonParser)v12),((com.fasterxml.jackson.databind.DeserializationContext)v15),((java.lang.Object)v16),((java.lang.String)v17));
    org.junit.Assert.assertEquals((Object)(false), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = true;
    Object v1 = 1;
    Object v2 = new java.util.ArrayList((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap((((java.lang.Boolean)v0).booleanValue()),((java.util.Collection)v2));
    Object v4 = 1;
    Object v5 = new java.util.ArrayList((((java.lang.Integer)v4).intValue()));
    ((java.util.Collection)v5).clear();
    Object v6 = null;
    Object v7 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v3).withoutProperties(((java.util.Collection)v5));
    Object v8 = "";
    Object v9 = "j";
    Object v10 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v7).renameAll(((com.fasterxml.jackson.databind.util.NameTransformer)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = true;
    Object v1 = 1;
    Object v2 = new java.util.ArrayList((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap((((java.lang.Boolean)v0).booleanValue()),((java.util.Collection)v2));
    Object v4 = 1;
    Object v5 = new java.util.ArrayList((((java.lang.Integer)v4).intValue()));
    ((java.util.Collection)v5).clear();
    Object v6 = null;
    Object v7 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v3).withoutProperties(((java.util.Collection)v5));
    Object v8 = "[ChainedTransformer(";
    Object v9 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v7).find(((java.lang.String)v8));
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = true;
    Object v1 = 1;
    Object v2 = new java.util.ArrayList((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap((((java.lang.Boolean)v0).booleanValue()),((java.util.Collection)v2));
    Object v4 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v3).iterator();
    Object v5 = false;
    Object v6 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v3).withCaseInsensitivity((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v6).withCaseInsensitivity((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = 1;
    Object v10 = new java.util.ArrayList((((java.lang.Integer)v9).intValue()));
    Object v11 = ((java.util.Collection)v10).toArray();
    ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v8).init(((java.util.Collection)v10));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = true;
    Object v1 = 1;
    Object v2 = new java.util.ArrayList((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap((((java.lang.Boolean)v0).booleanValue()),((java.util.Collection)v2));
    Object v4 = 1;
    Object v5 = new java.util.ArrayList((((java.lang.Integer)v4).intValue()));
    ((java.util.Collection)v5).clear();
    Object v6 = null;
    Object v7 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v3).withoutProperties(((java.util.Collection)v5));
    Object v8 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v7).assignIndexes();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = true;
    Object v1 = 1;
    Object v2 = new java.util.ArrayList((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap((((java.lang.Boolean)v0).booleanValue()),((java.util.Collection)v2));
    Object v4 = 1;
    Object v5 = new java.util.ArrayList((((java.lang.Integer)v4).intValue()));
    ((java.util.Collection)v5).clear();
    Object v6 = null;
    Object v7 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v3).withoutProperties(((java.util.Collection)v5));
    Object v8 = "";
    Object v9 = "j";
    Object v10 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v7).renameAll(((com.fasterxml.jackson.databind.util.NameTransformer)v10));
    Object v12 = "";
    Object v13 = "j";
    Object v14 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v11).renameAll(((com.fasterxml.jackson.databind.util.NameTransformer)v14));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = true;
    Object v1 = 1;
    Object v2 = new java.util.ArrayList((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap((((java.lang.Boolean)v0).booleanValue()),((java.util.Collection)v2));
    Object v4 = 1;
    Object v5 = new java.util.ArrayList((((java.lang.Integer)v4).intValue()));
    ((java.util.Collection)v5).clear();
    Object v6 = null;
    Object v7 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v3).withoutProperties(((java.util.Collection)v5));
    Object v8 = "";
    Object v9 = "j";
    Object v10 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v7).renameAll(((com.fasterxml.jackson.databind.util.NameTransformer)v10));
    Object v12 = 0;
    Object v13 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v11).find((((java.lang.Integer)v12).intValue()));
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = true;
    Object v1 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v1));
    Object v3 = ((java.lang.Iterable)v2).spliterator();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = 1;
    Object v2 = new java.util.ArrayList((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap((((java.lang.Boolean)v0).booleanValue()),((java.util.Collection)v2));
    Object v4 = 1;
    Object v5 = new java.util.ArrayList((((java.lang.Integer)v4).intValue()));
    ((java.util.Collection)v5).clear();
    Object v6 = null;
    Object v7 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v3).withoutProperties(((java.util.Collection)v5));
    Object v8 = "";
    Object v9 = "j";
    Object v10 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v7).renameAll(((com.fasterxml.jackson.databind.util.NameTransformer)v10));
    Object v12 = "";
    Object v13 = "j";
    Object v14 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v11).renameAll(((com.fasterxml.jackson.databind.util.NameTransformer)v14));
    Object v16 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v17 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v16));
    Object v18 = "?";
    Object v19 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v17),((java.lang.String)v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v21 = "items";
    Object v22 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v23 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v22));
    Object v24 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v23));
    ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v15).wrapAndThrow(((java.lang.Throwable)v19),((java.lang.Object)v20),((java.lang.String)v21),((com.fasterxml.jackson.databind.DeserializationContext)v24));
    Object v25 = null;
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = true;
    Object v1 = 1;
    Object v2 = new java.util.ArrayList((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap((((java.lang.Boolean)v0).booleanValue()),((java.util.Collection)v2));
    Object v4 = 1;
    Object v5 = new java.util.ArrayList((((java.lang.Integer)v4).intValue()));
    ((java.util.Collection)v5).clear();
    Object v6 = null;
    Object v7 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v3).withoutProperties(((java.util.Collection)v5));
    Object v8 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v7).assignIndexes();
    Object v9 = 1;
    Object v10 = new java.util.ArrayList((((java.lang.Integer)v9).intValue()));
    ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v8).init(((java.util.Collection)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = true;
    Object v1 = 1;
    Object v2 = new java.util.ArrayList((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap((((java.lang.Boolean)v0).booleanValue()),((java.util.Collection)v2));
    Object v4 = 1;
    Object v5 = new java.util.ArrayList((((java.lang.Integer)v4).intValue()));
    ((java.util.Collection)v5).clear();
    Object v6 = null;
    Object v7 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v3).withoutProperties(((java.util.Collection)v5));
    Object v8 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v7).size();
    org.junit.Assert.assertEquals((Object)(0), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = true;
    Object v1 = 1;
    Object v2 = new java.util.ArrayList((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap((((java.lang.Boolean)v0).booleanValue()),((java.util.Collection)v2));
    Object v4 = 1;
    Object v5 = new java.util.ArrayList((((java.lang.Integer)v4).intValue()));
    ((java.util.Collection)v5).clear();
    Object v6 = null;
    Object v7 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v3).withoutProperties(((java.util.Collection)v5));
    Object v8 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v7).assignIndexes();
    Object v9 = 1;
    Object v10 = new java.util.ArrayList((((java.lang.Integer)v9).intValue()));
    Object v11 = ((java.util.Collection)v10).parallelStream();
    ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v8).init(((java.util.Collection)v10));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = true;
    Object v1 = 1;
    Object v2 = new java.util.ArrayList((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap((((java.lang.Boolean)v0).booleanValue()),((java.util.Collection)v2));
    Object v4 = 1;
    Object v5 = new java.util.ArrayList((((java.lang.Integer)v4).intValue()));
    ((java.util.Collection)v5).clear();
    Object v6 = null;
    Object v7 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v3).withoutProperties(((java.util.Collection)v5));
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v7).withCaseInsensitivity((((java.lang.Boolean)v8).booleanValue()));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = true;
    Object v1 = 1;
    Object v2 = new java.util.ArrayList((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap((((java.lang.Boolean)v0).booleanValue()),((java.util.Collection)v2));
    Object v4 = 1;
    Object v5 = new java.util.ArrayList((((java.lang.Integer)v4).intValue()));
    ((java.util.Collection)v5).clear();
    Object v6 = null;
    Object v7 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v3).withoutProperties(((java.util.Collection)v5));
    Object v8 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v7).assignIndexes();
    Object v9 = 1;
    Object v10 = new java.util.ArrayList((((java.lang.Integer)v9).intValue()));
    Object v11 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v8).withoutProperties(((java.util.Collection)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = true;
    Object v1 = 1;
    Object v2 = new java.util.ArrayList((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap((((java.lang.Boolean)v0).booleanValue()),((java.util.Collection)v2));
    Object v4 = 1;
    Object v5 = new java.util.ArrayList((((java.lang.Integer)v4).intValue()));
    ((java.util.Collection)v5).clear();
    Object v6 = null;
    Object v7 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v3).withoutProperties(((java.util.Collection)v5));
    Object v8 = "items";
    Object v9 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v7).find(((java.lang.String)v8));
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = true;
    Object v1 = 1;
    Object v2 = new java.util.ArrayList((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap((((java.lang.Boolean)v0).booleanValue()),((java.util.Collection)v2));
    Object v4 = 1;
    Object v5 = new java.util.ArrayList((((java.lang.Integer)v4).intValue()));
    ((java.util.Collection)v5).clear();
    Object v6 = null;
    Object v7 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v3).withoutProperties(((java.util.Collection)v5));
    Object v8 = 1;
    Object v9 = new java.util.ArrayList((((java.lang.Integer)v8).intValue()));
    Object v10 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v7).withoutProperties(((java.util.Collection)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = true;
    Object v1 = 1;
    Object v2 = new java.util.ArrayList((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap((((java.lang.Boolean)v0).booleanValue()),((java.util.Collection)v2));
    Object v4 = 1;
    Object v5 = new java.util.ArrayList((((java.lang.Integer)v4).intValue()));
    ((java.util.Collection)v5).clear();
    Object v6 = null;
    Object v7 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v3).withoutProperties(((java.util.Collection)v5));
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v7).withCaseInsensitivity((((java.lang.Boolean)v8).booleanValue()));
    Object v10 = ((java.lang.Iterable)v9).spliterator();
    Object v11 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v9).toString();
    org.junit.Assert.assertEquals((Object)("Properties=[]"), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = true;
    Object v1 = 1;
    Object v2 = new java.util.ArrayList((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap((((java.lang.Boolean)v0).booleanValue()),((java.util.Collection)v2));
    Object v4 = 1;
    Object v5 = new java.util.ArrayList((((java.lang.Integer)v4).intValue()));
    ((java.util.Collection)v5).clear();
    Object v6 = null;
    Object v7 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v3).withoutProperties(((java.util.Collection)v5));
    Object v8 = false;
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap(((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v7),(((java.lang.Boolean)v8).booleanValue()));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = true;
    Object v1 = 1;
    Object v2 = new java.util.ArrayList((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap((((java.lang.Boolean)v0).booleanValue()),((java.util.Collection)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = true;
    Object v1 = 1;
    Object v2 = new java.util.ArrayList((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap((((java.lang.Boolean)v0).booleanValue()),((java.util.Collection)v2));
    Object v4 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v3).iterator();
    Object v5 = false;
    Object v6 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v3).withCaseInsensitivity((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "";
    Object v8 = "j";
    Object v9 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v6).renameAll(((com.fasterxml.jackson.databind.util.NameTransformer)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = true;
    Object v1 = 1;
    Object v2 = new java.util.ArrayList((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap((((java.lang.Boolean)v0).booleanValue()),((java.util.Collection)v2));
    Object v4 = 1;
    Object v5 = new java.util.ArrayList((((java.lang.Integer)v4).intValue()));
    ((java.util.Collection)v5).clear();
    Object v6 = null;
    Object v7 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v3).withoutProperties(((java.util.Collection)v5));
    Object v8 = "";
    Object v9 = "j";
    Object v10 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v7).renameAll(((com.fasterxml.jackson.databind.util.NameTransformer)v10));
    Object v12 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v11).assignIndexes();
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = true;
    Object v1 = 1;
    Object v2 = new java.util.ArrayList((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap((((java.lang.Boolean)v0).booleanValue()),((java.util.Collection)v2));
    Object v4 = 1;
    Object v5 = new java.util.ArrayList((((java.lang.Integer)v4).intValue()));
    ((java.util.Collection)v5).clear();
    Object v6 = null;
    Object v7 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v3).withoutProperties(((java.util.Collection)v5));
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v7).withCaseInsensitivity((((java.lang.Boolean)v8).booleanValue()));
    Object v10 = "";
    Object v11 = "j";
    Object v12 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v9).renameAll(((com.fasterxml.jackson.databind.util.NameTransformer)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = true;
    Object v1 = 1;
    Object v2 = new java.util.ArrayList((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap((((java.lang.Boolean)v0).booleanValue()),((java.util.Collection)v2));
    Object v4 = 1;
    Object v5 = new java.util.ArrayList((((java.lang.Integer)v4).intValue()));
    ((java.util.Collection)v5).clear();
    Object v6 = null;
    Object v7 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v3).withoutProperties(((java.util.Collection)v5));
    Object v8 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v7).assignIndexes();
    Object v9 = 0;
    Object v10 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v8).find((((java.lang.Integer)v9).intValue()));
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = true;
    Object v1 = 1;
    Object v2 = new java.util.ArrayList((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap((((java.lang.Boolean)v0).booleanValue()),((java.util.Collection)v2));
    Object v4 = 1;
    Object v5 = new java.util.ArrayList((((java.lang.Integer)v4).intValue()));
    ((java.util.Collection)v5).clear();
    Object v6 = null;
    Object v7 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v3).withoutProperties(((java.util.Collection)v5));
    Object v8 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v7).assignIndexes();
    Object v9 = 1;
    Object v10 = new java.util.ArrayList((((java.lang.Integer)v9).intValue()));
    Object v11 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v8).withoutProperties(((java.util.Collection)v10));
    Object v12 = true;
    Object v13 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v13));
    Object v15 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v16 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v14),((com.fasterxml.jackson.core.ObjectCodec)v15));
    Object v17 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v18 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v17));
    Object v19 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v18));
    Object v20 = "";
    Object v21 = "j";
    Object v22 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v20),((java.lang.String)v21));
    Object v23 = "http://javax.xml.XMLConstant/feature/secure-processing";
    Object v24 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v11).findDeserializeAndSet(((com.fasterxml.jackson.core.JsonParser)v16),((com.fasterxml.jackson.databind.DeserializationContext)v19),((java.lang.Object)v22),((java.lang.String)v23));
    org.junit.Assert.assertEquals((Object)(false), v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = true;
    Object v1 = 1;
    Object v2 = new java.util.ArrayList((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap((((java.lang.Boolean)v0).booleanValue()),((java.util.Collection)v2));
    Object v4 = 1;
    Object v5 = new java.util.ArrayList((((java.lang.Integer)v4).intValue()));
    ((java.util.Collection)v5).clear();
    Object v6 = null;
    Object v7 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v3).withoutProperties(((java.util.Collection)v5));
    Object v8 = 1;
    Object v9 = new java.util.ArrayList((((java.lang.Integer)v8).intValue()));
    Object v10 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v7).withoutProperties(((java.util.Collection)v9));
    Object v11 = ((java.lang.Iterable)v10).spliterator();
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = true;
    Object v1 = 1;
    Object v2 = new java.util.ArrayList((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap((((java.lang.Boolean)v0).booleanValue()),((java.util.Collection)v2));
    Object v4 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v3).iterator();
    Object v5 = false;
    Object v6 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v3).withCaseInsensitivity((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v6).withCaseInsensitivity((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = false;
    Object v10 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v8).withCaseInsensitivity((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v10).toString();
    org.junit.Assert.assertEquals((Object)("Properties=[]"), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = 1;
    Object v2 = new java.util.ArrayList((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap((((java.lang.Boolean)v0).booleanValue()),((java.util.Collection)v2));
    Object v4 = 1;
    Object v5 = new java.util.ArrayList((((java.lang.Integer)v4).intValue()));
    ((java.util.Collection)v5).clear();
    Object v6 = null;
    Object v7 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v3).withoutProperties(((java.util.Collection)v5));
    Object v8 = "";
    Object v9 = "j";
    Object v10 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v7).renameAll(((com.fasterxml.jackson.databind.util.NameTransformer)v10));
    Object v12 = "";
    Object v13 = "j";
    Object v14 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v11).renameAll(((com.fasterxml.jackson.databind.util.NameTransformer)v14));
    Object v16 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v17 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v16));
    Object v18 = "?";
    Object v19 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v17),((java.lang.String)v18));
    Object v20 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.Vanilla();
    Object v21 = "]";
    Object v22 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v23 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v22));
    Object v24 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v23));
    ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v15).wrapAndThrow(((java.lang.Throwable)v19),((java.lang.Object)v20),((java.lang.String)v21),((com.fasterxml.jackson.databind.DeserializationContext)v24));
    Object v25 = null;
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = true;
    Object v1 = 1;
    Object v2 = new java.util.ArrayList((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap((((java.lang.Boolean)v0).booleanValue()),((java.util.Collection)v2));
    Object v4 = 1;
    Object v5 = new java.util.ArrayList((((java.lang.Integer)v4).intValue()));
    ((java.util.Collection)v5).clear();
    Object v6 = null;
    Object v7 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v3).withoutProperties(((java.util.Collection)v5));
    Object v8 = false;
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap(((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = -13;
    Object v11 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v9).find((((java.lang.Integer)v10).intValue()));
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = true;
    Object v1 = 1;
    Object v2 = new java.util.ArrayList((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap((((java.lang.Boolean)v0).booleanValue()),((java.util.Collection)v2));
    Object v4 = 1;
    Object v5 = new java.util.ArrayList((((java.lang.Integer)v4).intValue()));
    ((java.util.Collection)v5).clear();
    Object v6 = null;
    Object v7 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v3).withoutProperties(((java.util.Collection)v5));
    Object v8 = "";
    Object v9 = "j";
    Object v10 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v7).renameAll(((com.fasterxml.jackson.databind.util.NameTransformer)v10));
    Object v12 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v11).size();
    org.junit.Assert.assertEquals((Object)(0), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = true;
    Object v1 = 1;
    Object v2 = new java.util.ArrayList((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap((((java.lang.Boolean)v0).booleanValue()),((java.util.Collection)v2));
    Object v4 = 1;
    Object v5 = new java.util.ArrayList((((java.lang.Integer)v4).intValue()));
    ((java.util.Collection)v5).clear();
    Object v6 = null;
    Object v7 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v3).withoutProperties(((java.util.Collection)v5));
    Object v8 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v7).assignIndexes();
    Object v9 = 1;
    Object v10 = new java.util.ArrayList((((java.lang.Integer)v9).intValue()));
    Object v11 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v8).withoutProperties(((java.util.Collection)v10));
    Object v12 = 1;
    Object v13 = new java.util.ArrayList((((java.lang.Integer)v12).intValue()));
    Object v14 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v11).withoutProperties(((java.util.Collection)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = true;
    Object v1 = 1;
    Object v2 = new java.util.ArrayList((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap((((java.lang.Boolean)v0).booleanValue()),((java.util.Collection)v2));
    Object v4 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v3).iterator();
    Object v5 = false;
    Object v6 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v3).withCaseInsensitivity((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v6).withCaseInsensitivity((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v8).assignIndexes();
    Object v10 = "";
    Object v11 = "j";
    Object v12 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v8).renameAll(((com.fasterxml.jackson.databind.util.NameTransformer)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = true;
    Object v1 = 1;
    Object v2 = new java.util.ArrayList((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap((((java.lang.Boolean)v0).booleanValue()),((java.util.Collection)v2));
    Object v4 = 1;
    Object v5 = new java.util.ArrayList((((java.lang.Integer)v4).intValue()));
    ((java.util.Collection)v5).clear();
    Object v6 = null;
    Object v7 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v3).withoutProperties(((java.util.Collection)v5));
    Object v8 = "";
    Object v9 = "j";
    Object v10 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v7).renameAll(((com.fasterxml.jackson.databind.util.NameTransformer)v10));
    Object v12 = "";
    Object v13 = "j";
    Object v14 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v11).renameAll(((com.fasterxml.jackson.databind.util.NameTransformer)v14));
    Object v16 = 1;
    Object v17 = new java.util.ArrayList((((java.lang.Integer)v16).intValue()));
    Object v18 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v15).withoutProperties(((java.util.Collection)v17));
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = true;
    Object v1 = 1;
    Object v2 = new java.util.ArrayList((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap((((java.lang.Boolean)v0).booleanValue()),((java.util.Collection)v2));
    Object v4 = 1;
    Object v5 = new java.util.ArrayList((((java.lang.Integer)v4).intValue()));
    ((java.util.Collection)v5).clear();
    Object v6 = null;
    Object v7 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v3).withoutProperties(((java.util.Collection)v5));
    Object v8 = "";
    Object v9 = "j";
    Object v10 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v7).renameAll(((com.fasterxml.jackson.databind.util.NameTransformer)v10));
    Object v12 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v11).assignIndexes();
    Object v13 = 1;
    Object v14 = new java.util.ArrayList((((java.lang.Integer)v13).intValue()));
    Object v15 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v12).withoutProperties(((java.util.Collection)v14));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = true;
    Object v1 = 1;
    Object v2 = new java.util.ArrayList((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap((((java.lang.Boolean)v0).booleanValue()),((java.util.Collection)v2));
    Object v4 = 1;
    Object v5 = new java.util.ArrayList((((java.lang.Integer)v4).intValue()));
    ((java.util.Collection)v5).clear();
    Object v6 = null;
    Object v7 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v3).withoutProperties(((java.util.Collection)v5));
    Object v8 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v7).assignIndexes();
    Object v9 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v8).assignIndexes();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = true;
    Object v1 = 1;
    Object v2 = new java.util.ArrayList((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap((((java.lang.Boolean)v0).booleanValue()),((java.util.Collection)v2));
    Object v4 = 1;
    Object v5 = new java.util.ArrayList((((java.lang.Integer)v4).intValue()));
    ((java.util.Collection)v5).clear();
    Object v6 = null;
    Object v7 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v3).withoutProperties(((java.util.Collection)v5));
    Object v8 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v7).assignIndexes();
    Object v9 = 1;
    Object v10 = new java.util.ArrayList((((java.lang.Integer)v9).intValue()));
    Object v11 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v8).withoutProperties(((java.util.Collection)v10));
    Object v12 = false;
    Object v13 = new com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap(((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v11),(((java.lang.Boolean)v12).booleanValue()));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = true;
    Object v1 = 1;
    Object v2 = new java.util.ArrayList((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap((((java.lang.Boolean)v0).booleanValue()),((java.util.Collection)v2));
    Object v4 = 1;
    Object v5 = new java.util.ArrayList((((java.lang.Integer)v4).intValue()));
    ((java.util.Collection)v5).clear();
    Object v6 = null;
    Object v7 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v3).withoutProperties(((java.util.Collection)v5));
    Object v8 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v7).assignIndexes();
    Object v9 = 1;
    Object v10 = new java.util.ArrayList((((java.lang.Integer)v9).intValue()));
    Object v11 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v8).withoutProperties(((java.util.Collection)v10));
    Object v12 = 1;
    Object v13 = new java.util.ArrayList((((java.lang.Integer)v12).intValue()));
    Object v14 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v11).withoutProperties(((java.util.Collection)v13));
    Object v15 = false;
    Object v16 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v14).withCaseInsensitivity((((java.lang.Boolean)v15).booleanValue()));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = 1;
    Object v1 = new java.util.ArrayList((((java.lang.Integer)v0).intValue()));
    Object v2 = false;
    Object v3 = com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap.construct(((java.util.Collection)v1),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = true;
    Object v1 = 1;
    Object v2 = new java.util.ArrayList((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap((((java.lang.Boolean)v0).booleanValue()),((java.util.Collection)v2));
    Object v4 = 1;
    Object v5 = new java.util.ArrayList((((java.lang.Integer)v4).intValue()));
    ((java.util.Collection)v5).clear();
    Object v6 = null;
    Object v7 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v3).withoutProperties(((java.util.Collection)v5));
    Object v8 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v7).assignIndexes();
    Object v9 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v8).assignIndexes();
    Object v10 = 1;
    Object v11 = new java.util.ArrayList((((java.lang.Integer)v10).intValue()));
    ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v9).init(((java.util.Collection)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = 1;
    Object v1 = new java.util.ArrayList((((java.lang.Integer)v0).intValue()));
    Object v2 = false;
    Object v3 = com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap.construct(((java.util.Collection)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = new java.util.ArrayList((((java.lang.Integer)v4).intValue()));
    ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v3).init(((java.util.Collection)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = 1;
    Object v1 = new java.util.ArrayList((((java.lang.Integer)v0).intValue()));
    Object v2 = false;
    Object v3 = com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap.construct(((java.util.Collection)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = new java.util.ArrayList((((java.lang.Integer)v4).intValue()));
    Object v6 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v3).withoutProperties(((java.util.Collection)v5));
    Object v7 = true;
    Object v8 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v3).withCaseInsensitivity((((java.lang.Boolean)v7).booleanValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = true;
    Object v1 = 1;
    Object v2 = new java.util.ArrayList((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap((((java.lang.Boolean)v0).booleanValue()),((java.util.Collection)v2));
    Object v4 = 1;
    Object v5 = new java.util.ArrayList((((java.lang.Integer)v4).intValue()));
    ((java.util.Collection)v5).clear();
    Object v6 = null;
    Object v7 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v3).withoutProperties(((java.util.Collection)v5));
    Object v8 = "";
    Object v9 = "j";
    Object v10 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v7).renameAll(((com.fasterxml.jackson.databind.util.NameTransformer)v10));
    Object v12 = 5;
    Object v13 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v11).find((((java.lang.Integer)v12).intValue()));
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = new java.util.ArrayList((((java.lang.Integer)v0).intValue()));
    Object v2 = false;
    Object v3 = com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap.construct(((java.util.Collection)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = new java.util.ArrayList((((java.lang.Integer)v4).intValue()));
    Object v6 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v3).withoutProperties(((java.util.Collection)v5));
    Object v7 = true;
    Object v8 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v3).withCaseInsensitivity((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = null;
    ((java.lang.Iterable)v8).forEach(((java.util.function.Consumer)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = true;
    Object v1 = 1;
    Object v2 = new java.util.ArrayList((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap((((java.lang.Boolean)v0).booleanValue()),((java.util.Collection)v2));
    Object v4 = 1;
    Object v5 = new java.util.ArrayList((((java.lang.Integer)v4).intValue()));
    ((java.util.Collection)v5).clear();
    Object v6 = null;
    Object v7 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v3).withoutProperties(((java.util.Collection)v5));
    Object v8 = true;
    Object v9 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v9));
    Object v11 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v12 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v10),((com.fasterxml.jackson.core.ObjectCodec)v11));
    Object v13 = ((com.fasterxml.jackson.core.JsonParser)v12).getCurrentTokenId();
    Object v14 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v15 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v15));
    Object v17 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v18 = "REGEX";
    Object v19 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v7).findDeserializeAndSet(((com.fasterxml.jackson.core.JsonParser)v12),((com.fasterxml.jackson.databind.DeserializationContext)v16),((java.lang.Object)v17),((java.lang.String)v18));
    org.junit.Assert.assertEquals((Object)(false), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = true;
    Object v1 = 1;
    Object v2 = new java.util.ArrayList((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap((((java.lang.Boolean)v0).booleanValue()),((java.util.Collection)v2));
    Object v4 = 1;
    Object v5 = new java.util.ArrayList((((java.lang.Integer)v4).intValue()));
    ((java.util.Collection)v5).clear();
    Object v6 = null;
    Object v7 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v3).withoutProperties(((java.util.Collection)v5));
    Object v8 = "";
    Object v9 = "j";
    Object v10 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v7).renameAll(((com.fasterxml.jackson.databind.util.NameTransformer)v10));
    Object v12 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v11).assignIndexes();
    Object v13 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v12).assignIndexes();
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = true;
    Object v1 = 1;
    Object v2 = new java.util.ArrayList((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap((((java.lang.Boolean)v0).booleanValue()),((java.util.Collection)v2));
    Object v4 = 1;
    Object v5 = new java.util.ArrayList((((java.lang.Integer)v4).intValue()));
    ((java.util.Collection)v5).clear();
    Object v6 = null;
    Object v7 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v3).withoutProperties(((java.util.Collection)v5));
    Object v8 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v7).assignIndexes();
    Object v9 = 1;
    Object v10 = new java.util.ArrayList((((java.lang.Integer)v9).intValue()));
    Object v11 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v8).withoutProperties(((java.util.Collection)v10));
    Object v12 = true;
    Object v13 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v13));
    Object v15 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v16 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v14),((com.fasterxml.jackson.core.ObjectCodec)v15));
    Object v17 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v18 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v17));
    Object v19 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v18));
    Object v20 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v21 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v20));
    Object v22 = "2";
    Object v23 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v11).findDeserializeAndSet(((com.fasterxml.jackson.core.JsonParser)v16),((com.fasterxml.jackson.databind.DeserializationContext)v19),((java.lang.Object)v21),((java.lang.String)v22));
    org.junit.Assert.assertEquals((Object)(false), v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = true;
    Object v1 = 1;
    Object v2 = new java.util.ArrayList((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap((((java.lang.Boolean)v0).booleanValue()),((java.util.Collection)v2));
    Object v4 = 1;
    Object v5 = new java.util.ArrayList((((java.lang.Integer)v4).intValue()));
    ((java.util.Collection)v5).clear();
    Object v6 = null;
    Object v7 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v3).withoutProperties(((java.util.Collection)v5));
    Object v8 = "";
    Object v9 = "j";
    Object v10 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v7).renameAll(((com.fasterxml.jackson.databind.util.NameTransformer)v10));
    Object v12 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v11).assignIndexes();
    Object v13 = "4)";
    Object v14 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v12).find(((java.lang.String)v13));
    Object v15 = true;
    Object v16 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v15).booleanValue()));
    Object v17 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v16));
    Object v18 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v19 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v17),((com.fasterxml.jackson.core.ObjectCodec)v18));
    Object v20 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v21 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v20));
    Object v22 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v21));
    Object v23 = 57.84305641449442D;
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v24));
    Object v26 = "'";
    Object v27 = ((com.fasterxml.jackson.databind.DeserializationContext)v22).weirdNumberException(((java.lang.Number)v23),((java.lang.Class)v25),((java.lang.String)v26));
    Object v28 = 1;
    Object v29 = new java.util.ArrayList((((java.lang.Integer)v28).intValue()));
    Object v30 = "C";
    Object v31 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v12).findDeserializeAndSet(((com.fasterxml.jackson.core.JsonParser)v19),((com.fasterxml.jackson.databind.DeserializationContext)v22),((java.lang.Object)v29),((java.lang.String)v30));
    org.junit.Assert.assertEquals((Object)(false), v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = 1;
    Object v1 = new java.util.ArrayList((((java.lang.Integer)v0).intValue()));
    Object v2 = false;
    Object v3 = com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap.construct(((java.util.Collection)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "array";
    Object v5 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v3).find(((java.lang.String)v4));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = true;
    Object v1 = 1;
    Object v2 = new java.util.ArrayList((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap((((java.lang.Boolean)v0).booleanValue()),((java.util.Collection)v2));
    Object v4 = 1;
    Object v5 = new java.util.ArrayList((((java.lang.Integer)v4).intValue()));
    ((java.util.Collection)v5).clear();
    Object v6 = null;
    Object v7 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v3).withoutProperties(((java.util.Collection)v5));
    Object v8 = false;
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap(((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = ">5";
    Object v11 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v9).find(((java.lang.String)v10));
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = true;
    Object v1 = 1;
    Object v2 = new java.util.ArrayList((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap((((java.lang.Boolean)v0).booleanValue()),((java.util.Collection)v2));
    Object v4 = 1;
    Object v5 = new java.util.ArrayList((((java.lang.Integer)v4).intValue()));
    ((java.util.Collection)v5).clear();
    Object v6 = null;
    Object v7 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v3).withoutProperties(((java.util.Collection)v5));
    Object v8 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v7).assignIndexes();
    Object v9 = 1;
    Object v10 = new java.util.ArrayList((((java.lang.Integer)v9).intValue()));
    Object v11 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v8).withoutProperties(((java.util.Collection)v10));
    Object v12 = false;
    Object v13 = new com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap(((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = true;
    Object v15 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v13).withCaseInsensitivity((((java.lang.Boolean)v14).booleanValue()));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = true;
    Object v1 = 1;
    Object v2 = new java.util.ArrayList((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap((((java.lang.Boolean)v0).booleanValue()),((java.util.Collection)v2));
    Object v4 = 1;
    Object v5 = new java.util.ArrayList((((java.lang.Integer)v4).intValue()));
    ((java.util.Collection)v5).clear();
    Object v6 = null;
    Object v7 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v3).withoutProperties(((java.util.Collection)v5));
    Object v8 = "";
    Object v9 = "j";
    Object v10 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v7).renameAll(((com.fasterxml.jackson.databind.util.NameTransformer)v10));
    Object v12 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v11).assignIndexes();
    Object v13 = 1;
    Object v14 = new java.util.ArrayList((((java.lang.Integer)v13).intValue()));
    Object v15 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v12).withoutProperties(((java.util.Collection)v14));
    Object v16 = "-ar>s)";
    Object v17 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v15).find(((java.lang.String)v16));
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = true;
    Object v1 = 1;
    Object v2 = new java.util.ArrayList((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap((((java.lang.Boolean)v0).booleanValue()),((java.util.Collection)v2));
    Object v4 = 1;
    Object v5 = new java.util.ArrayList((((java.lang.Integer)v4).intValue()));
    ((java.util.Collection)v5).clear();
    Object v6 = null;
    Object v7 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v3).withoutProperties(((java.util.Collection)v5));
    Object v8 = "";
    Object v9 = "j";
    Object v10 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v7).renameAll(((com.fasterxml.jackson.databind.util.NameTransformer)v10));
    Object v12 = "";
    Object v13 = "j";
    Object v14 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v11).renameAll(((com.fasterxml.jackson.databind.util.NameTransformer)v14));
    Object v16 = true;
    Object v17 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v15).withCaseInsensitivity((((java.lang.Boolean)v16).booleanValue()));
    Object v18 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v15).toString();
    org.junit.Assert.assertEquals((Object)("Properties=[]"), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = 1;
    Object v1 = new java.util.ArrayList((((java.lang.Integer)v0).intValue()));
    Object v2 = false;
    Object v3 = com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap.construct(((java.util.Collection)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 1;
    Object v5 = new java.util.ArrayList((((java.lang.Integer)v4).intValue()));
    Object v6 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v3).withoutProperties(((java.util.Collection)v5));
    Object v7 = true;
    Object v8 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v3).withCaseInsensitivity((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = 1;
    Object v10 = new java.util.ArrayList((((java.lang.Integer)v9).intValue()));
    Object v11 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v8).withoutProperties(((java.util.Collection)v10));
    Object v12 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v8).toString();
    org.junit.Assert.assertEquals((Object)("Properties=[]"), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = true;
    Object v1 = 1;
    Object v2 = new java.util.ArrayList((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap((((java.lang.Boolean)v0).booleanValue()),((java.util.Collection)v2));
    Object v4 = 1;
    Object v5 = new java.util.ArrayList((((java.lang.Integer)v4).intValue()));
    ((java.util.Collection)v5).clear();
    Object v6 = null;
    Object v7 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v3).withoutProperties(((java.util.Collection)v5));
    Object v8 = "";
    Object v9 = "j";
    Object v10 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = "strinNg";
    Object v12 = ((com.fasterxml.jackson.databind.util.NameTransformer)v10).reverse(((java.lang.String)v11));
    Object v13 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v7).renameAll(((com.fasterxml.jackson.databind.util.NameTransformer)v10));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = true;
    Object v1 = 1;
    Object v2 = new java.util.ArrayList((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap((((java.lang.Boolean)v0).booleanValue()),((java.util.Collection)v2));
    Object v4 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v3).iterator();
    Object v5 = false;
    Object v6 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v3).withCaseInsensitivity((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "";
    Object v8 = "j";
    Object v9 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v6).renameAll(((com.fasterxml.jackson.databind.util.NameTransformer)v9));
    Object v11 = true;
    Object v12 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v12));
    Object v14 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v15 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v13),((com.fasterxml.jackson.core.ObjectCodec)v14));
    Object v16 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v17 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v17));
    Object v19 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v20 = "strind";
    Object v21 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v10).findDeserializeAndSet(((com.fasterxml.jackson.core.JsonParser)v15),((com.fasterxml.jackson.databind.DeserializationContext)v18),((java.lang.Object)v19),((java.lang.String)v20));
    org.junit.Assert.assertEquals((Object)(false), v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = 1;
    Object v2 = new java.util.ArrayList((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap((((java.lang.Boolean)v0).booleanValue()),((java.util.Collection)v2));
    Object v4 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v3).iterator();
    Object v5 = false;
    Object v6 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v3).withCaseInsensitivity((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v6).withCaseInsensitivity((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v10 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v9));
    Object v11 = "?";
    Object v12 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v10),((java.lang.String)v11));
    Object v13 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v14 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v14));
    Object v16 = "";
    Object v17 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v18 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v17));
    Object v19 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v18));
    ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v8).wrapAndThrow(((java.lang.Throwable)v12),((java.lang.Object)v15),((java.lang.String)v16),((com.fasterxml.jackson.databind.DeserializationContext)v19));
    Object v20 = null;
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = 1;
    Object v1 = new java.util.ArrayList((((java.lang.Integer)v0).intValue()));
    Object v2 = false;
    Object v3 = com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap.construct(((java.util.Collection)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v3).assignIndexes();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = true;
    Object v1 = 1;
    Object v2 = new java.util.ArrayList((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap((((java.lang.Boolean)v0).booleanValue()),((java.util.Collection)v2));
    Object v4 = 1;
    Object v5 = new java.util.ArrayList((((java.lang.Integer)v4).intValue()));
    ((java.util.Collection)v5).clear();
    Object v6 = null;
    Object v7 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v3).withoutProperties(((java.util.Collection)v5));
    Object v8 = "";
    Object v9 = "j";
    Object v10 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = "strinNg";
    Object v12 = ((com.fasterxml.jackson.databind.util.NameTransformer)v10).reverse(((java.lang.String)v11));
    Object v13 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v7).renameAll(((com.fasterxml.jackson.databind.util.NameTransformer)v10));
    Object v14 = "";
    Object v15 = "j";
    Object v16 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v14),((java.lang.String)v15));
    Object v17 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v13).renameAll(((com.fasterxml.jackson.databind.util.NameTransformer)v16));
    Object v18 = "";
    Object v19 = "j";
    Object v20 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v18),((java.lang.String)v19));
    Object v21 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v13).renameAll(((com.fasterxml.jackson.databind.util.NameTransformer)v20));
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = true;
    Object v1 = 1;
    Object v2 = new java.util.ArrayList((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap((((java.lang.Boolean)v0).booleanValue()),((java.util.Collection)v2));
    Object v4 = 1;
    Object v5 = new java.util.ArrayList((((java.lang.Integer)v4).intValue()));
    ((java.util.Collection)v5).clear();
    Object v6 = null;
    Object v7 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v3).withoutProperties(((java.util.Collection)v5));
    Object v8 = "";
    Object v9 = "j";
    Object v10 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = "strinNg";
    Object v12 = ((com.fasterxml.jackson.databind.util.NameTransformer)v10).reverse(((java.lang.String)v11));
    Object v13 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v7).renameAll(((com.fasterxml.jackson.databind.util.NameTransformer)v10));
    Object v14 = "";
    Object v15 = "j";
    Object v16 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v14),((java.lang.String)v15));
    Object v17 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v13).renameAll(((com.fasterxml.jackson.databind.util.NameTransformer)v16));
    Object v18 = "";
    Object v19 = "j";
    Object v20 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v18),((java.lang.String)v19));
    Object v21 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v13).renameAll(((com.fasterxml.jackson.databind.util.NameTransformer)v20));
    Object v22 = 1;
    Object v23 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v21).find((((java.lang.Integer)v22).intValue()));
    org.junit.Assert.assertNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = true;
    Object v1 = 1;
    Object v2 = new java.util.ArrayList((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap((((java.lang.Boolean)v0).booleanValue()),((java.util.Collection)v2));
    Object v4 = 1;
    Object v5 = new java.util.ArrayList((((java.lang.Integer)v4).intValue()));
    ((java.util.Collection)v5).clear();
    Object v6 = null;
    Object v7 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v3).withoutProperties(((java.util.Collection)v5));
    Object v8 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v7).assignIndexes();
    Object v9 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v8).assignIndexes();
    Object v10 = 1;
    Object v11 = new java.util.ArrayList((((java.lang.Integer)v10).intValue()));
    Object v12 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v9).withoutProperties(((java.util.Collection)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = true;
    Object v1 = 1;
    Object v2 = new java.util.ArrayList((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap((((java.lang.Boolean)v0).booleanValue()),((java.util.Collection)v2));
    Object v4 = 1;
    Object v5 = new java.util.ArrayList((((java.lang.Integer)v4).intValue()));
    ((java.util.Collection)v5).clear();
    Object v6 = null;
    Object v7 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v3).withoutProperties(((java.util.Collection)v5));
    Object v8 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v7).iterator();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = true;
    Object v1 = 1;
    Object v2 = new java.util.ArrayList((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap((((java.lang.Boolean)v0).booleanValue()),((java.util.Collection)v2));
    Object v4 = 1;
    Object v5 = new java.util.ArrayList((((java.lang.Integer)v4).intValue()));
    ((java.util.Collection)v5).clear();
    Object v6 = null;
    Object v7 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v3).withoutProperties(((java.util.Collection)v5));
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v7).withCaseInsensitivity((((java.lang.Boolean)v8).booleanValue()));
    Object v10 = -52;
    Object v11 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v9).find((((java.lang.Integer)v10).intValue()));
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = true;
    Object v1 = 1;
    Object v2 = new java.util.ArrayList((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap((((java.lang.Boolean)v0).booleanValue()),((java.util.Collection)v2));
    Object v4 = 1;
    Object v5 = new java.util.ArrayList((((java.lang.Integer)v4).intValue()));
    ((java.util.Collection)v5).clear();
    Object v6 = null;
    Object v7 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v3).withoutProperties(((java.util.Collection)v5));
    Object v8 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v7).assignIndexes();
    Object v9 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v8).assignIndexes();
    Object v10 = 1;
    Object v11 = new java.util.ArrayList((((java.lang.Integer)v10).intValue()));
    Object v12 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v9).withoutProperties(((java.util.Collection)v11));
    Object v13 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v12).toString();
    org.junit.Assert.assertEquals((Object)("Properties=[]"), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = true;
    Object v1 = 1;
    Object v2 = new java.util.ArrayList((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap((((java.lang.Boolean)v0).booleanValue()),((java.util.Collection)v2));
    Object v4 = 1;
    Object v5 = new java.util.ArrayList((((java.lang.Integer)v4).intValue()));
    ((java.util.Collection)v5).clear();
    Object v6 = null;
    Object v7 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v3).withoutProperties(((java.util.Collection)v5));
    Object v8 = "";
    Object v9 = "j";
    Object v10 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = "strinNg";
    Object v12 = ((com.fasterxml.jackson.databind.util.NameTransformer)v10).reverse(((java.lang.String)v11));
    Object v13 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v7).renameAll(((com.fasterxml.jackson.databind.util.NameTransformer)v10));
    Object v14 = 1;
    Object v15 = new java.util.ArrayList((((java.lang.Integer)v14).intValue()));
    Object v16 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v13).withoutProperties(((java.util.Collection)v15));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = true;
    Object v1 = 1;
    Object v2 = new java.util.ArrayList((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap((((java.lang.Boolean)v0).booleanValue()),((java.util.Collection)v2));
    Object v4 = 1;
    Object v5 = new java.util.ArrayList((((java.lang.Integer)v4).intValue()));
    ((java.util.Collection)v5).clear();
    Object v6 = null;
    Object v7 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v3).withoutProperties(((java.util.Collection)v5));
    Object v8 = "";
    Object v9 = "j";
    Object v10 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = "strinNg";
    Object v12 = ((com.fasterxml.jackson.databind.util.NameTransformer)v10).reverse(((java.lang.String)v11));
    Object v13 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v7).renameAll(((com.fasterxml.jackson.databind.util.NameTransformer)v10));
    Object v14 = 1;
    Object v15 = new java.util.ArrayList((((java.lang.Integer)v14).intValue()));
    Object v16 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v13).withoutProperties(((java.util.Collection)v15));
    Object v17 = 1;
    Object v18 = new java.util.ArrayList((((java.lang.Integer)v17).intValue()));
    Object v19 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v16).withoutProperties(((java.util.Collection)v18));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = 1;
    Object v1 = new java.util.ArrayList((((java.lang.Integer)v0).intValue()));
    Object v2 = true;
    Object v3 = com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap.construct(((java.util.Collection)v1),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = true;
    Object v1 = 1;
    Object v2 = new java.util.ArrayList((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap((((java.lang.Boolean)v0).booleanValue()),((java.util.Collection)v2));
    Object v4 = 1;
    Object v5 = new java.util.ArrayList((((java.lang.Integer)v4).intValue()));
    ((java.util.Collection)v5).clear();
    Object v6 = null;
    Object v7 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v3).withoutProperties(((java.util.Collection)v5));
    Object v8 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v7).assignIndexes();
    Object v9 = 1;
    Object v10 = new java.util.ArrayList((((java.lang.Integer)v9).intValue()));
    Object v11 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v8).withoutProperties(((java.util.Collection)v10));
    Object v12 = 1;
    Object v13 = new java.util.ArrayList((((java.lang.Integer)v12).intValue()));
    Object v14 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v11).withoutProperties(((java.util.Collection)v13));
    Object v15 = false;
    Object v16 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v14).withCaseInsensitivity((((java.lang.Boolean)v15).booleanValue()));
    Object v17 = "";
    Object v18 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v16).find(((java.lang.String)v17));
    Object v19 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v16).toString();
    org.junit.Assert.assertEquals((Object)("Properties=[]"), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = true;
    Object v1 = 1;
    Object v2 = new java.util.ArrayList((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap((((java.lang.Boolean)v0).booleanValue()),((java.util.Collection)v2));
    Object v4 = 1;
    Object v5 = new java.util.ArrayList((((java.lang.Integer)v4).intValue()));
    ((java.util.Collection)v5).clear();
    Object v6 = null;
    Object v7 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v3).withoutProperties(((java.util.Collection)v5));
    Object v8 = "";
    Object v9 = "j";
    Object v10 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = "strinNg";
    Object v12 = ((com.fasterxml.jackson.databind.util.NameTransformer)v10).reverse(((java.lang.String)v11));
    Object v13 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v7).renameAll(((com.fasterxml.jackson.databind.util.NameTransformer)v10));
    Object v14 = "";
    Object v15 = "j";
    Object v16 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v14),((java.lang.String)v15));
    Object v17 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v13).renameAll(((com.fasterxml.jackson.databind.util.NameTransformer)v16));
    Object v18 = "";
    Object v19 = "j";
    Object v20 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v18),((java.lang.String)v19));
    Object v21 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v13).renameAll(((com.fasterxml.jackson.databind.util.NameTransformer)v20));
    Object v22 = "";
    Object v23 = "j";
    Object v24 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v22),((java.lang.String)v23));
    Object v25 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v21).renameAll(((com.fasterxml.jackson.databind.util.NameTransformer)v24));
    org.junit.Assert.assertNotNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = true;
    Object v1 = 1;
    Object v2 = new java.util.ArrayList((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap((((java.lang.Boolean)v0).booleanValue()),((java.util.Collection)v2));
    Object v4 = 1;
    Object v5 = new java.util.ArrayList((((java.lang.Integer)v4).intValue()));
    ((java.util.Collection)v5).clear();
    Object v6 = null;
    Object v7 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v3).withoutProperties(((java.util.Collection)v5));
    Object v8 = "";
    Object v9 = "j";
    Object v10 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = "strinNg";
    Object v12 = ((com.fasterxml.jackson.databind.util.NameTransformer)v10).reverse(((java.lang.String)v11));
    Object v13 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v7).renameAll(((com.fasterxml.jackson.databind.util.NameTransformer)v10));
    Object v14 = "";
    Object v15 = "j";
    Object v16 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v14),((java.lang.String)v15));
    Object v17 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v13).renameAll(((com.fasterxml.jackson.databind.util.NameTransformer)v16));
    Object v18 = "";
    Object v19 = "j";
    Object v20 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v18),((java.lang.String)v19));
    Object v21 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v13).renameAll(((com.fasterxml.jackson.databind.util.NameTransformer)v20));
    Object v22 = true;
    Object v23 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v21).withCaseInsensitivity((((java.lang.Boolean)v22).booleanValue()));
    org.junit.Assert.assertNotNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = true;
    Object v1 = 1;
    Object v2 = new java.util.ArrayList((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap((((java.lang.Boolean)v0).booleanValue()),((java.util.Collection)v2));
    Object v4 = 1;
    Object v5 = new java.util.ArrayList((((java.lang.Integer)v4).intValue()));
    ((java.util.Collection)v5).clear();
    Object v6 = null;
    Object v7 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v3).withoutProperties(((java.util.Collection)v5));
    Object v8 = "";
    Object v9 = "j";
    Object v10 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = "strinNg";
    Object v12 = ((com.fasterxml.jackson.databind.util.NameTransformer)v10).reverse(((java.lang.String)v11));
    Object v13 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v7).renameAll(((com.fasterxml.jackson.databind.util.NameTransformer)v10));
    Object v14 = "";
    Object v15 = "j";
    Object v16 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v14),((java.lang.String)v15));
    Object v17 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v13).renameAll(((com.fasterxml.jackson.databind.util.NameTransformer)v16));
    Object v18 = "";
    Object v19 = "j";
    Object v20 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v18),((java.lang.String)v19));
    Object v21 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v13).renameAll(((com.fasterxml.jackson.databind.util.NameTransformer)v20));
    Object v22 = true;
    Object v23 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v21).withCaseInsensitivity((((java.lang.Boolean)v22).booleanValue()));
    Object v24 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v23).toString();
    Object v25 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v23).toString();
    org.junit.Assert.assertEquals((Object)("Properties=[]"), v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = 1;
    Object v2 = new java.util.ArrayList((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap((((java.lang.Boolean)v0).booleanValue()),((java.util.Collection)v2));
    Object v4 = 1;
    Object v5 = new java.util.ArrayList((((java.lang.Integer)v4).intValue()));
    ((java.util.Collection)v5).clear();
    Object v6 = null;
    Object v7 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v3).withoutProperties(((java.util.Collection)v5));
    Object v8 = "";
    Object v9 = "j";
    Object v10 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = "strinNg";
    Object v12 = ((com.fasterxml.jackson.databind.util.NameTransformer)v10).reverse(((java.lang.String)v11));
    Object v13 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v7).renameAll(((com.fasterxml.jackson.databind.util.NameTransformer)v10));
    Object v14 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v15 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v14));
    Object v16 = "?";
    Object v17 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v15),((java.lang.String)v16));
    Object v18 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v19 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v18));
    Object v20 = "?";
    Object v21 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v19),((java.lang.String)v20));
    Object v22 = ((java.lang.Throwable)v17).initCause(((java.lang.Throwable)v21));
    Object v23 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v24 = "AnnotationIntrospector returned Class ";
    Object v25 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v26 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v25));
    Object v27 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v26));
    ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v13).wrapAndThrow(((java.lang.Throwable)v17),((java.lang.Object)v23),((java.lang.String)v24),((com.fasterxml.jackson.databind.DeserializationContext)v27));
    Object v28 = null;
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = true;
    Object v1 = 1;
    Object v2 = new java.util.ArrayList((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap((((java.lang.Boolean)v0).booleanValue()),((java.util.Collection)v2));
    Object v4 = 1;
    Object v5 = new java.util.ArrayList((((java.lang.Integer)v4).intValue()));
    ((java.util.Collection)v5).clear();
    Object v6 = null;
    Object v7 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v3).withoutProperties(((java.util.Collection)v5));
    Object v8 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v7).assignIndexes();
    Object v9 = 1;
    Object v10 = new java.util.ArrayList((((java.lang.Integer)v9).intValue()));
    Object v11 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v8).withoutProperties(((java.util.Collection)v10));
    Object v12 = false;
    Object v13 = new com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap(((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = true;
    Object v15 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v13).withCaseInsensitivity((((java.lang.Boolean)v14).booleanValue()));
    Object v16 = true;
    Object v17 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v16).booleanValue()));
    Object v18 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v17));
    Object v19 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v20 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v18),((com.fasterxml.jackson.core.ObjectCodec)v19));
    Object v21 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v22 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v21));
    Object v23 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v22));
    Object v24 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v25 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v24));
    Object v26 = "";
    Object v27 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v15).findDeserializeAndSet(((com.fasterxml.jackson.core.JsonParser)v20),((com.fasterxml.jackson.databind.DeserializationContext)v23),((java.lang.Object)v25),((java.lang.String)v26));
    org.junit.Assert.assertEquals((Object)(false), v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = 1;
    Object v1 = new java.util.ArrayList((((java.lang.Integer)v0).intValue()));
    Object v2 = true;
    Object v3 = com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap.construct(((java.util.Collection)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v3).iterator();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = true;
    Object v1 = 1;
    Object v2 = new java.util.ArrayList((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap((((java.lang.Boolean)v0).booleanValue()),((java.util.Collection)v2));
    Object v4 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v3).iterator();
    Object v5 = false;
    Object v6 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v3).withCaseInsensitivity((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "A";
    Object v8 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v6).find(((java.lang.String)v7));
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = 1;
    Object v1 = new java.util.ArrayList((((java.lang.Integer)v0).intValue()));
    Object v2 = true;
    Object v3 = com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap.construct(((java.util.Collection)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = true;
    Object v5 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v8 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v6),((com.fasterxml.jackson.core.ObjectCodec)v7));
    Object v9 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v10 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v10));
    Object v12 = 1;
    Object v13 = new java.util.ArrayList((((java.lang.Integer)v12).intValue()));
    Object v14 = true;
    Object v15 = com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap.construct(((java.util.Collection)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v15).iterator();
    Object v17 = "+";
    Object v18 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v3).findDeserializeAndSet(((com.fasterxml.jackson.core.JsonParser)v8),((com.fasterxml.jackson.databind.DeserializationContext)v11),((java.lang.Object)v16),((java.lang.String)v17));
    org.junit.Assert.assertEquals((Object)(false), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = true;
    Object v1 = 1;
    Object v2 = new java.util.ArrayList((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap((((java.lang.Boolean)v0).booleanValue()),((java.util.Collection)v2));
    Object v4 = 1;
    Object v5 = new java.util.ArrayList((((java.lang.Integer)v4).intValue()));
    ((java.util.Collection)v5).clear();
    Object v6 = null;
    Object v7 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v3).withoutProperties(((java.util.Collection)v5));
    Object v8 = "";
    Object v9 = "j";
    Object v10 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = "strinNg";
    Object v12 = ((com.fasterxml.jackson.databind.util.NameTransformer)v10).reverse(((java.lang.String)v11));
    Object v13 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v7).renameAll(((com.fasterxml.jackson.databind.util.NameTransformer)v10));
    Object v14 = 1;
    Object v15 = new java.util.ArrayList((((java.lang.Integer)v14).intValue()));
    Object v16 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v13).withoutProperties(((java.util.Collection)v15));
    Object v17 = "";
    Object v18 = "j";
    Object v19 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v17),((java.lang.String)v18));
    Object v20 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v16).renameAll(((com.fasterxml.jackson.databind.util.NameTransformer)v19));
    Object v21 = "";
    Object v22 = "j";
    Object v23 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v21),((java.lang.String)v22));
    Object v24 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v16).renameAll(((com.fasterxml.jackson.databind.util.NameTransformer)v23));
    org.junit.Assert.assertNotNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = true;
    Object v1 = 1;
    Object v2 = new java.util.ArrayList((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap((((java.lang.Boolean)v0).booleanValue()),((java.util.Collection)v2));
    Object v4 = 1;
    Object v5 = new java.util.ArrayList((((java.lang.Integer)v4).intValue()));
    ((java.util.Collection)v5).clear();
    Object v6 = null;
    Object v7 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v3).withoutProperties(((java.util.Collection)v5));
    Object v8 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v7).assignIndexes();
    Object v9 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v8).assignIndexes();
    Object v10 = "";
    Object v11 = "j";
    Object v12 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = "items";
    Object v14 = ((com.fasterxml.jackson.databind.util.NameTransformer)v12).transform(((java.lang.String)v13));
    Object v15 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v9).renameAll(((com.fasterxml.jackson.databind.util.NameTransformer)v12));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = 1;
    Object v2 = new java.util.ArrayList((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap((((java.lang.Boolean)v0).booleanValue()),((java.util.Collection)v2));
    Object v4 = 1;
    Object v5 = new java.util.ArrayList((((java.lang.Integer)v4).intValue()));
    ((java.util.Collection)v5).clear();
    Object v6 = null;
    Object v7 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v3).withoutProperties(((java.util.Collection)v5));
    Object v8 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v7).assignIndexes();
    Object v9 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v8).assignIndexes();
    Object v10 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v11 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v10));
    Object v12 = "?";
    Object v13 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.databind.SerializerProvider)v11),((java.lang.String)v12));
    Object v14 = true;
    Object v15 = "]";
    Object v16 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v14).booleanValue()),((java.lang.String)v15));
    Object v17 = ",";
    Object v18 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v19 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v18));
    Object v20 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v19));
    ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v9).wrapAndThrow(((java.lang.Throwable)v13),((java.lang.Object)v16),((java.lang.String)v17),((com.fasterxml.jackson.databind.DeserializationContext)v20));
    Object v21 = null;
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = true;
    Object v1 = 1;
    Object v2 = new java.util.ArrayList((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap((((java.lang.Boolean)v0).booleanValue()),((java.util.Collection)v2));
    Object v4 = 1;
    Object v5 = new java.util.ArrayList((((java.lang.Integer)v4).intValue()));
    ((java.util.Collection)v5).clear();
    Object v6 = null;
    Object v7 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v3).withoutProperties(((java.util.Collection)v5));
    Object v8 = "";
    Object v9 = "j";
    Object v10 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v7).renameAll(((com.fasterxml.jackson.databind.util.NameTransformer)v10));
    Object v12 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v11).assignIndexes();
    Object v13 = 1;
    Object v14 = new java.util.ArrayList((((java.lang.Integer)v13).intValue()));
    Object v15 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v12).withoutProperties(((java.util.Collection)v14));
    Object v16 = "Can not upgrade from an instance of ";
    Object v17 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v15).find(((java.lang.String)v16));
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = true;
    Object v1 = 1;
    Object v2 = new java.util.ArrayList((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap((((java.lang.Boolean)v0).booleanValue()),((java.util.Collection)v2));
    Object v4 = 1;
    Object v5 = new java.util.ArrayList((((java.lang.Integer)v4).intValue()));
    ((java.util.Collection)v5).clear();
    Object v6 = null;
    Object v7 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v3).withoutProperties(((java.util.Collection)v5));
    Object v8 = "";
    Object v9 = "j";
    Object v10 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = "strinNg";
    Object v12 = ((com.fasterxml.jackson.databind.util.NameTransformer)v10).reverse(((java.lang.String)v11));
    Object v13 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v7).renameAll(((com.fasterxml.jackson.databind.util.NameTransformer)v10));
    Object v14 = 1;
    Object v15 = new java.util.ArrayList((((java.lang.Integer)v14).intValue()));
    Object v16 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v13).withoutProperties(((java.util.Collection)v15));
    Object v17 = "";
    Object v18 = "j";
    Object v19 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v17),((java.lang.String)v18));
    Object v20 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v16).renameAll(((com.fasterxml.jackson.databind.util.NameTransformer)v19));
    Object v21 = "";
    Object v22 = "j";
    Object v23 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v21),((java.lang.String)v22));
    Object v24 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v16).renameAll(((com.fasterxml.jackson.databind.util.NameTransformer)v23));
    Object v25 = 1;
    Object v26 = new java.util.ArrayList((((java.lang.Integer)v25).intValue()));
    Object v27 = ((java.util.Collection)v26).isEmpty();
    Object v28 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v24).withoutProperties(((java.util.Collection)v26));
    org.junit.Assert.assertNotNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = true;
    Object v1 = 1;
    Object v2 = new java.util.ArrayList((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap((((java.lang.Boolean)v0).booleanValue()),((java.util.Collection)v2));
    Object v4 = 1;
    Object v5 = new java.util.ArrayList((((java.lang.Integer)v4).intValue()));
    ((java.util.Collection)v5).clear();
    Object v6 = null;
    Object v7 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v3).withoutProperties(((java.util.Collection)v5));
    Object v8 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v7).assignIndexes();
    Object v9 = 1;
    Object v10 = new java.util.ArrayList((((java.lang.Integer)v9).intValue()));
    Object v11 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v8).withoutProperties(((java.util.Collection)v10));
    Object v12 = true;
    Object v13 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v13));
    Object v15 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v16 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v14),((com.fasterxml.jackson.core.ObjectCodec)v15));
    Object v17 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v18 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v17));
    Object v19 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v18));
    Object v20 = 1;
    Object v21 = new java.util.ArrayList((((java.lang.Integer)v20).intValue()));
    Object v22 = "N/r";
    Object v23 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v11).findDeserializeAndSet(((com.fasterxml.jackson.core.JsonParser)v16),((com.fasterxml.jackson.databind.DeserializationContext)v19),((java.lang.Object)v21),((java.lang.String)v22));
    org.junit.Assert.assertEquals((Object)(false), v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = 1;
    Object v1 = new java.util.ArrayList((((java.lang.Integer)v0).intValue()));
    Object v2 = false;
    Object v3 = com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap.construct(((java.util.Collection)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = true;
    Object v5 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v8 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v6),((com.fasterxml.jackson.core.ObjectCodec)v7));
    Object v9 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v10 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v10));
    Object v12 = true;
    Object v13 = 1;
    Object v14 = new java.util.ArrayList((((java.lang.Integer)v13).intValue()));
    Object v15 = new com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap((((java.lang.Boolean)v12).booleanValue()),((java.util.Collection)v14));
    Object v16 = 1;
    Object v17 = new java.util.ArrayList((((java.lang.Integer)v16).intValue()));
    ((java.util.Collection)v17).clear();
    Object v18 = null;
    Object v19 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v15).withoutProperties(((java.util.Collection)v17));
    Object v20 = "Null value for creator property '%s'; DeserializationFeature.FAIL_ON_NULL_FOR_CREATOR_PARAMETERS enabled";
    Object v21 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v3).findDeserializeAndSet(((com.fasterxml.jackson.core.JsonParser)v8),((com.fasterxml.jackson.databind.DeserializationContext)v11),((java.lang.Object)v19),((java.lang.String)v20));
    org.junit.Assert.assertEquals((Object)(false), v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = 1;
    Object v1 = new java.util.ArrayList((((java.lang.Integer)v0).intValue()));
    Object v2 = true;
    Object v3 = com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap.construct(((java.util.Collection)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "string";
    Object v5 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v3).find(((java.lang.String)v4));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = true;
    Object v1 = 1;
    Object v2 = new java.util.ArrayList((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap((((java.lang.Boolean)v0).booleanValue()),((java.util.Collection)v2));
    Object v4 = 1;
    Object v5 = new java.util.ArrayList((((java.lang.Integer)v4).intValue()));
    ((java.util.Collection)v5).clear();
    Object v6 = null;
    Object v7 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v3).withoutProperties(((java.util.Collection)v5));
    Object v8 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v7).assignIndexes();
    Object v9 = 1;
    Object v10 = new java.util.ArrayList((((java.lang.Integer)v9).intValue()));
    Object v11 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v8).withoutProperties(((java.util.Collection)v10));
    Object v12 = 1;
    Object v13 = new java.util.ArrayList((((java.lang.Integer)v12).intValue()));
    Object v14 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v11).withoutProperties(((java.util.Collection)v13));
    Object v15 = false;
    Object v16 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v14).withCaseInsensitivity((((java.lang.Boolean)v15).booleanValue()));
    Object v17 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v16).toString();
    org.junit.Assert.assertEquals((Object)("Properties=[]"), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = true;
    Object v1 = 1;
    Object v2 = new java.util.ArrayList((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap((((java.lang.Boolean)v0).booleanValue()),((java.util.Collection)v2));
    Object v4 = 1;
    Object v5 = new java.util.ArrayList((((java.lang.Integer)v4).intValue()));
    ((java.util.Collection)v5).clear();
    Object v6 = null;
    Object v7 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v3).withoutProperties(((java.util.Collection)v5));
    Object v8 = "";
    Object v9 = "j";
    Object v10 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = "strinNg";
    Object v12 = ((com.fasterxml.jackson.databind.util.NameTransformer)v10).reverse(((java.lang.String)v11));
    Object v13 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v7).renameAll(((com.fasterxml.jackson.databind.util.NameTransformer)v10));
    Object v14 = 1;
    Object v15 = new java.util.ArrayList((((java.lang.Integer)v14).intValue()));
    Object v16 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v13).withoutProperties(((java.util.Collection)v15));
    Object v17 = 1;
    Object v18 = new java.util.ArrayList((((java.lang.Integer)v17).intValue()));
    Object v19 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v16).withoutProperties(((java.util.Collection)v18));
    Object v20 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v19).assignIndexes();
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = true;
    Object v1 = 1;
    Object v2 = new java.util.ArrayList((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap((((java.lang.Boolean)v0).booleanValue()),((java.util.Collection)v2));
    Object v4 = 1;
    Object v5 = new java.util.ArrayList((((java.lang.Integer)v4).intValue()));
    ((java.util.Collection)v5).clear();
    Object v6 = null;
    Object v7 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v3).withoutProperties(((java.util.Collection)v5));
    Object v8 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v7).assignIndexes();
    Object v9 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v8).assignIndexes();
    Object v10 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v9).iterator();
    Object v11 = true;
    Object v12 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v12));
    Object v14 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v15 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v13),((com.fasterxml.jackson.core.ObjectCodec)v14));
    Object v16 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v17 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v17));
    Object v19 = true;
    Object v20 = "]";
    Object v21 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v19).booleanValue()),((java.lang.String)v20));
    Object v22 = "not a valid representation";
    Object v23 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v9).findDeserializeAndSet(((com.fasterxml.jackson.core.JsonParser)v15),((com.fasterxml.jackson.databind.DeserializationContext)v18),((java.lang.Object)v21),((java.lang.String)v22));
    org.junit.Assert.assertEquals((Object)(false), v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = true;
    Object v1 = 1;
    Object v2 = new java.util.ArrayList((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap((((java.lang.Boolean)v0).booleanValue()),((java.util.Collection)v2));
    Object v4 = 1;
    Object v5 = new java.util.ArrayList((((java.lang.Integer)v4).intValue()));
    ((java.util.Collection)v5).clear();
    Object v6 = null;
    Object v7 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v3).withoutProperties(((java.util.Collection)v5));
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v7).withCaseInsensitivity((((java.lang.Boolean)v8).booleanValue()));
    Object v10 = "";
    Object v11 = "j";
    Object v12 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v9).renameAll(((com.fasterxml.jackson.databind.util.NameTransformer)v12));
    Object v14 = "";
    Object v15 = "j";
    Object v16 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v14),((java.lang.String)v15));
    Object v17 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v13).renameAll(((com.fasterxml.jackson.databind.util.NameTransformer)v16));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = false;
    Object v1 = 1;
    Object v2 = new java.util.ArrayList((((java.lang.Integer)v1).intValue()));
    Object v3 = ((java.util.Collection)v2).size();
    Object v4 = new com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap((((java.lang.Boolean)v0).booleanValue()),((java.util.Collection)v2));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = 1;
    Object v1 = new java.util.ArrayList((((java.lang.Integer)v0).intValue()));
    Object v2 = false;
    Object v3 = com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap.construct(((java.util.Collection)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "";
    Object v5 = "j";
    Object v6 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v3).renameAll(((com.fasterxml.jackson.databind.util.NameTransformer)v6));
    Object v8 = true;
    Object v9 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v3).withCaseInsensitivity((((java.lang.Boolean)v8).booleanValue()));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = true;
    Object v1 = 1;
    Object v2 = new java.util.ArrayList((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap((((java.lang.Boolean)v0).booleanValue()),((java.util.Collection)v2));
    Object v4 = 1;
    Object v5 = new java.util.ArrayList((((java.lang.Integer)v4).intValue()));
    ((java.util.Collection)v5).clear();
    Object v6 = null;
    Object v7 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v3).withoutProperties(((java.util.Collection)v5));
    Object v8 = "";
    Object v9 = "j";
    Object v10 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = "strinNg";
    Object v12 = ((com.fasterxml.jackson.databind.util.NameTransformer)v10).reverse(((java.lang.String)v11));
    Object v13 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v7).renameAll(((com.fasterxml.jackson.databind.util.NameTransformer)v10));
    Object v14 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v13).assignIndexes();
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = 1;
    Object v1 = new java.util.ArrayList((((java.lang.Integer)v0).intValue()));
    Object v2 = false;
    Object v3 = com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap.construct(((java.util.Collection)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "Infinite recursion (StackOverflowError)";
    Object v5 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v3).find(((java.lang.String)v4));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = false;
    Object v1 = 1;
    Object v2 = new java.util.ArrayList((((java.lang.Integer)v1).intValue()));
    Object v3 = ((java.util.Collection)v2).size();
    Object v4 = new com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap((((java.lang.Boolean)v0).booleanValue()),((java.util.Collection)v2));
    Object v5 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v4).iterator();
    Object v6 = -11;
    Object v7 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v4).find((((java.lang.Integer)v6).intValue()));
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = true;
    Object v1 = 1;
    Object v2 = new java.util.ArrayList((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap((((java.lang.Boolean)v0).booleanValue()),((java.util.Collection)v2));
    Object v4 = 1;
    Object v5 = new java.util.ArrayList((((java.lang.Integer)v4).intValue()));
    ((java.util.Collection)v5).clear();
    Object v6 = null;
    Object v7 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v3).withoutProperties(((java.util.Collection)v5));
    Object v8 = "";
    Object v9 = "j";
    Object v10 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v7).renameAll(((com.fasterxml.jackson.databind.util.NameTransformer)v10));
    Object v12 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v11).assignIndexes();
    Object v13 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v12).assignIndexes();
    Object v14 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v13).getPropertiesInInsertionOrder();
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = true;
    Object v1 = 1;
    Object v2 = new java.util.ArrayList((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap((((java.lang.Boolean)v0).booleanValue()),((java.util.Collection)v2));
    Object v4 = 1;
    Object v5 = new java.util.ArrayList((((java.lang.Integer)v4).intValue()));
    ((java.util.Collection)v5).clear();
    Object v6 = null;
    Object v7 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v3).withoutProperties(((java.util.Collection)v5));
    Object v8 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v7).assignIndexes();
    Object v9 = 1;
    Object v10 = new java.util.ArrayList((((java.lang.Integer)v9).intValue()));
    Object v11 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v8).withoutProperties(((java.util.Collection)v10));
    Object v12 = 1;
    Object v13 = new java.util.ArrayList((((java.lang.Integer)v12).intValue()));
    Object v14 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v11).withoutProperties(((java.util.Collection)v13));
    Object v15 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v14).iterator();
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = true;
    Object v1 = 1;
    Object v2 = new java.util.ArrayList((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap((((java.lang.Boolean)v0).booleanValue()),((java.util.Collection)v2));
    Object v4 = 1;
    Object v5 = new java.util.ArrayList((((java.lang.Integer)v4).intValue()));
    ((java.util.Collection)v5).clear();
    Object v6 = null;
    Object v7 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v3).withoutProperties(((java.util.Collection)v5));
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v7).withCaseInsensitivity((((java.lang.Boolean)v8).booleanValue()));
    Object v10 = "";
    Object v11 = "j";
    Object v12 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v9).renameAll(((com.fasterxml.jackson.databind.util.NameTransformer)v12));
    Object v14 = "(";
    Object v15 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v13).find(((java.lang.String)v14));
    Object v16 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v13).size();
    org.junit.Assert.assertEquals((Object)(0), v16);
  }
}
