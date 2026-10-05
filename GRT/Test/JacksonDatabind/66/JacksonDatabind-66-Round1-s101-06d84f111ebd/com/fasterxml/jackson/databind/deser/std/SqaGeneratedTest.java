package com.fasterxml.jackson.databind.deser.std;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = "string";
    Object v1 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v0));
    Object v2 = "string";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = "string";
    Object v5 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v4));
    Object v6 = "string";
    Object v7 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v6));
    Object v8 = java.util.EnumSet.of(((java.lang.Enum)v1),((java.lang.Enum)v3),((java.lang.Enum)v5),((java.lang.Enum)v7));
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v8));
    Object v10 = com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.forType(((java.lang.Class)v9));
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = 11;
    Object v1 = "string";
    Object v2 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v1));
    Object v3 = "string";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = "string";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = java.util.EnumSet.of(((java.lang.Enum)v2),((java.lang.Enum)v4),((java.lang.Enum)v6),((java.lang.Enum)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v9));
    Object v11 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.DocumentDeserializer();
    Object v12 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v10),((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v11));
    Object v13 = "R";
    Object v14 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v15 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v15));
    Object v17 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v12)._parse(((java.lang.String)v13),((com.fasterxml.jackson.databind.DeserializationContext)v16));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = 11;
    Object v1 = "string";
    Object v2 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v1));
    Object v3 = "string";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = "string";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = java.util.EnumSet.of(((java.lang.Enum)v2),((java.lang.Enum)v4),((java.lang.Enum)v6),((java.lang.Enum)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v9));
    Object v11 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.DocumentDeserializer();
    Object v12 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v10),((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v11));
    Object v13 = "'";
    Object v14 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v15 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v15));
    Object v17 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v12).deserializeKey(((java.lang.String)v13),((com.fasterxml.jackson.databind.DeserializationContext)v16));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = 11;
    Object v1 = "string";
    Object v2 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v1));
    Object v3 = "string";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = "string";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = java.util.EnumSet.of(((java.lang.Enum)v2),((java.lang.Enum)v4),((java.lang.Enum)v6),((java.lang.Enum)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v9));
    Object v11 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.DocumentDeserializer();
    Object v12 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v10),((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v11));
    Object v13 = "typ/";
    Object v14 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v15 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v15));
    Object v17 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v12)._parse(((java.lang.String)v13),((com.fasterxml.jackson.databind.DeserializationContext)v16));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = 11;
    Object v1 = "string";
    Object v2 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v1));
    Object v3 = "string";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = "string";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = java.util.EnumSet.of(((java.lang.Enum)v2),((java.lang.Enum)v4),((java.lang.Enum)v6),((java.lang.Enum)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v9));
    Object v11 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.DocumentDeserializer();
    Object v12 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v10),((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v11));
    Object v13 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v12).getKeyClass();
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = 11;
    Object v1 = "string";
    Object v2 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v1));
    Object v3 = "string";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = "string";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = java.util.EnumSet.of(((java.lang.Enum)v2),((java.lang.Enum)v4),((java.lang.Enum)v6),((java.lang.Enum)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v9));
    Object v11 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.DocumentDeserializer();
    Object v12 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v10),((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v11));
    Object v13 = "array8";
    Object v14 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v15 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v15));
    Object v17 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v12).deserializeKey(((java.lang.String)v13),((com.fasterxml.jackson.databind.DeserializationContext)v16));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = -8;
    Object v1 = "string";
    Object v2 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v1));
    Object v3 = "string";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = "string";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = java.util.EnumSet.of(((java.lang.Enum)v2),((java.lang.Enum)v4),((java.lang.Enum)v6),((java.lang.Enum)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = -8;
    Object v1 = "string";
    Object v2 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v1));
    Object v3 = "string";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = "string";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = java.util.EnumSet.of(((java.lang.Enum)v2),((java.lang.Enum)v4),((java.lang.Enum)v6),((java.lang.Enum)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v10));
    Object v12 = "]";
    Object v13 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v11)._parseDouble(((java.lang.String)v12));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = 11;
    Object v1 = "string";
    Object v2 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v1));
    Object v3 = "string";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = "string";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = java.util.EnumSet.of(((java.lang.Enum)v2),((java.lang.Enum)v4),((java.lang.Enum)v6),((java.lang.Enum)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v9));
    Object v11 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.DocumentDeserializer();
    Object v12 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v10),((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v11));
    Object v13 = "]";
    Object v14 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v15 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v15));
    Object v17 = "string";
    Object v18 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v17));
    Object v19 = "string";
    Object v20 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v19));
    Object v21 = "string";
    Object v22 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v21));
    Object v23 = "string";
    Object v24 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v23));
    Object v25 = java.util.EnumSet.of(((java.lang.Enum)v18),((java.lang.Enum)v20),((java.lang.Enum)v22),((java.lang.Enum)v24));
    Object v26 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v25));
    Object v27 = "?";
    Object v28 = "";
    Object v29 = ((com.fasterxml.jackson.databind.DeserializationContext)v16).weirdKeyException(((java.lang.Class)v26),((java.lang.String)v27),((java.lang.String)v28));
    Object v30 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v12)._parse(((java.lang.String)v13),((com.fasterxml.jackson.databind.DeserializationContext)v16));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = -8;
    Object v1 = "string";
    Object v2 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v1));
    Object v3 = "string";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = "string";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = java.util.EnumSet.of(((java.lang.Enum)v2),((java.lang.Enum)v4),((java.lang.Enum)v6),((java.lang.Enum)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v10));
    Object v12 = " 9to ";
    Object v13 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v14 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v14));
    ((com.fasterxml.jackson.databind.DeserializationContext)v15).checkUnresolvedObjectId();
    Object v16 = null;
    Object v17 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v11).deserializeKey(((java.lang.String)v12),((com.fasterxml.jackson.databind.DeserializationContext)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = 11;
    Object v1 = "string";
    Object v2 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v1));
    Object v3 = "string";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = "string";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = java.util.EnumSet.of(((java.lang.Enum)v2),((java.lang.Enum)v4),((java.lang.Enum)v6),((java.lang.Enum)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v9));
    Object v11 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.DocumentDeserializer();
    Object v12 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v10),((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v11));
    Object v13 = "WRITE_EMPTY_JSON_ARRAYS";
    Object v14 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v15 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v15));
    Object v17 = "string";
    Object v18 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v17));
    Object v19 = "string";
    Object v20 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v19));
    Object v21 = "string";
    Object v22 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v21));
    Object v23 = "string";
    Object v24 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v23));
    Object v25 = java.util.EnumSet.of(((java.lang.Enum)v18),((java.lang.Enum)v20),((java.lang.Enum)v22),((java.lang.Enum)v24));
    Object v26 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v25));
    Object v27 = com.fasterxml.jackson.core.JsonToken.VALUE_FALSE;
    Object v28 = ((com.fasterxml.jackson.databind.DeserializationContext)v16).mappingException(((java.lang.Class)v26),((com.fasterxml.jackson.core.JsonToken)v27));
    Object v29 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v12)._parse(((java.lang.String)v13),((com.fasterxml.jackson.databind.DeserializationContext)v16));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = -8;
    Object v1 = "string";
    Object v2 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v1));
    Object v3 = "string";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = "string";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = java.util.EnumSet.of(((java.lang.Enum)v2),((java.lang.Enum)v4),((java.lang.Enum)v6),((java.lang.Enum)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v10));
    Object v12 = "Illegal concrete-type a(nnotation for method '";
    Object v13 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v14 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v14));
    Object v16 = ((com.fasterxml.jackson.databind.DeserializationContext)v15).leaseObjectBuffer();
    Object v17 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v11)._parse(((java.lang.String)v12),((com.fasterxml.jackson.databind.DeserializationContext)v15));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = 11;
    Object v1 = "string";
    Object v2 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v1));
    Object v3 = "string";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = "string";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = java.util.EnumSet.of(((java.lang.Enum)v2),((java.lang.Enum)v4),((java.lang.Enum)v6),((java.lang.Enum)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v9));
    Object v11 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.DocumentDeserializer();
    Object v12 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v10),((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v11));
    Object v13 = "";
    Object v14 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v15 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v15));
    Object v17 = ")";
    Object v18 = "string";
    Object v19 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v18));
    Object v20 = "string";
    Object v21 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v20));
    Object v22 = "string";
    Object v23 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v22));
    Object v24 = "string";
    Object v25 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v24));
    Object v26 = java.util.EnumSet.of(((java.lang.Enum)v19),((java.lang.Enum)v21),((java.lang.Enum)v23),((java.lang.Enum)v25));
    Object v27 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v26));
    Object v28 = "V";
    Object v29 = ((com.fasterxml.jackson.databind.DeserializationContext)v16).weirdStringException(((java.lang.String)v17),((java.lang.Class)v27),((java.lang.String)v28));
    Object v30 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v12)._parse(((java.lang.String)v13),((com.fasterxml.jackson.databind.DeserializationContext)v16));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = 11;
    Object v1 = "string";
    Object v2 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v1));
    Object v3 = "string";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = "string";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = java.util.EnumSet.of(((java.lang.Enum)v2),((java.lang.Enum)v4),((java.lang.Enum)v6),((java.lang.Enum)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v9));
    Object v11 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.DocumentDeserializer();
    Object v12 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v10),((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v11));
    Object v13 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v12).getKeyClass();
    Object v14 = com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.forType(((java.lang.Class)v13));
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = -8;
    Object v1 = "string";
    Object v2 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v1));
    Object v3 = "string";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = "string";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = java.util.EnumSet.of(((java.lang.Enum)v2),((java.lang.Enum)v4),((java.lang.Enum)v6),((java.lang.Enum)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v10));
    Object v12 = "j";
    Object v13 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v14 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v14));
    Object v16 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v11)._parse(((java.lang.String)v12),((com.fasterxml.jackson.databind.DeserializationContext)v15));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = 11;
    Object v1 = "string";
    Object v2 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v1));
    Object v3 = "string";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = "string";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = java.util.EnumSet.of(((java.lang.Enum)v2),((java.lang.Enum)v4),((java.lang.Enum)v6),((java.lang.Enum)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v9));
    Object v11 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.DocumentDeserializer();
    Object v12 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v10),((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v11));
    Object v13 = " vs ";
    Object v14 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v15 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v15));
    Object v17 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v12)._parse(((java.lang.String)v13),((com.fasterxml.jackson.databind.DeserializationContext)v16));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = -8;
    Object v1 = "string";
    Object v2 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v1));
    Object v3 = "string";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = "string";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = java.util.EnumSet.of(((java.lang.Enum)v2),((java.lang.Enum)v4),((java.lang.Enum)v6),((java.lang.Enum)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v10));
    Object v12 = "nvalid delegate-creator definition for ";
    Object v13 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v14 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v14));
    Object v16 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v11)._parse(((java.lang.String)v12),((com.fasterxml.jackson.databind.DeserializationContext)v15));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = 11;
    Object v1 = "string";
    Object v2 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v1));
    Object v3 = "string";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = "string";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = java.util.EnumSet.of(((java.lang.Enum)v2),((java.lang.Enum)v4),((java.lang.Enum)v6),((java.lang.Enum)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v9));
    Object v11 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.DocumentDeserializer();
    Object v12 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v10),((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v11));
    Object v13 = "I";
    Object v14 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v15 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v15));
    Object v17 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v12)._parse(((java.lang.String)v13),((com.fasterxml.jackson.databind.DeserializationContext)v16));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = -8;
    Object v1 = "string";
    Object v2 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v1));
    Object v3 = "string";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = "string";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = java.util.EnumSet.of(((java.lang.Enum)v2),((java.lang.Enum)v4),((java.lang.Enum)v6),((java.lang.Enum)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v10));
    Object v12 = ";)";
    Object v13 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v14 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v14));
    Object v16 = "true";
    Object v17 = "string";
    Object v18 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v17));
    Object v19 = "string";
    Object v20 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v19));
    Object v21 = "string";
    Object v22 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v21));
    Object v23 = "string";
    Object v24 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v23));
    Object v25 = java.util.EnumSet.of(((java.lang.Enum)v18),((java.lang.Enum)v20),((java.lang.Enum)v22),((java.lang.Enum)v24));
    Object v26 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v25));
    Object v27 = "Can not handle managed/ack reference '";
    Object v28 = ((com.fasterxml.jackson.databind.DeserializationContext)v15).weirdStringException(((java.lang.String)v16),((java.lang.Class)v26),((java.lang.String)v27));
    Object v29 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v11).deserializeKey(((java.lang.String)v12),((com.fasterxml.jackson.databind.DeserializationContext)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = 11;
    Object v1 = "string";
    Object v2 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v1));
    Object v3 = "string";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = "string";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = java.util.EnumSet.of(((java.lang.Enum)v2),((java.lang.Enum)v4),((java.lang.Enum)v6),((java.lang.Enum)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v9));
    Object v11 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.DocumentDeserializer();
    Object v12 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v10),((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v11));
    Object v13 = "";
    Object v14 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v15 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v15));
    Object v17 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v12)._parse(((java.lang.String)v13),((com.fasterxml.jackson.databind.DeserializationContext)v16));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = -8;
    Object v1 = "string";
    Object v2 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v1));
    Object v3 = "string";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = "string";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = java.util.EnumSet.of(((java.lang.Enum)v2),((java.lang.Enum)v4),((java.lang.Enum)v6),((java.lang.Enum)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v10));
    Object v12 = "numbe";
    Object v13 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v14 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v14));
    Object v16 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v11).deserializeKey(((java.lang.String)v12),((com.fasterxml.jackson.databind.DeserializationContext)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = 11;
    Object v1 = "string";
    Object v2 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v1));
    Object v3 = "string";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = "string";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = java.util.EnumSet.of(((java.lang.Enum)v2),((java.lang.Enum)v4),((java.lang.Enum)v6),((java.lang.Enum)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v9));
    Object v11 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.DocumentDeserializer();
    Object v12 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v10),((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v11));
    Object v13 = "#te9mporary-name";
    Object v14 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v15 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v15));
    Object v17 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v12)._parse(((java.lang.String)v13),((com.fasterxml.jackson.databind.DeserializationContext)v16));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = -8;
    Object v1 = "string";
    Object v2 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v1));
    Object v3 = "string";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = "string";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = java.util.EnumSet.of(((java.lang.Enum)v2),((java.lang.Enum)v4),((java.lang.Enum)v6),((java.lang.Enum)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v10));
    Object v12 = "Overflow: numeric value (%s) out of range of int (%d -%d)";
    Object v13 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v14 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v14));
    Object v16 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v11)._parse(((java.lang.String)v12),((com.fasterxml.jackson.databind.DeserializationContext)v15));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = -8;
    Object v1 = "string";
    Object v2 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v1));
    Object v3 = "string";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = "string";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = java.util.EnumSet.of(((java.lang.Enum)v2),((java.lang.Enum)v4),((java.lang.Enum)v6),((java.lang.Enum)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v10));
    Object v12 = ")";
    Object v13 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v14 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v14));
    Object v16 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v11)._parse(((java.lang.String)v12),((com.fasterxml.jackson.databind.DeserializationContext)v15));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = 11;
    Object v1 = "string";
    Object v2 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v1));
    Object v3 = "string";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = "string";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = java.util.EnumSet.of(((java.lang.Enum)v2),((java.lang.Enum)v4),((java.lang.Enum)v6),((java.lang.Enum)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v9));
    Object v11 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.DocumentDeserializer();
    Object v12 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v10),((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v11));
    Object v13 = "]";
    Object v14 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v12)._parseDouble(((java.lang.String)v13));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = -8;
    Object v1 = "string";
    Object v2 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v1));
    Object v3 = "string";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = "string";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = java.util.EnumSet.of(((java.lang.Enum)v2),((java.lang.Enum)v4),((java.lang.Enum)v6),((java.lang.Enum)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v10));
    Object v12 = ")M";
    Object v13 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v14 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v14));
    Object v16 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v11).deserializeKey(((java.lang.String)v12),((com.fasterxml.jackson.databind.DeserializationContext)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = 0;
    Object v1 = "string";
    Object v2 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v1));
    Object v3 = "string";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = "string";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = java.util.EnumSet.of(((java.lang.Enum)v2),((java.lang.Enum)v4),((java.lang.Enum)v6),((java.lang.Enum)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v9));
    Object v11 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.DocumentDeserializer();
    Object v12 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v10),((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = -8;
    Object v1 = "string";
    Object v2 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v1));
    Object v3 = "string";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = "string";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = java.util.EnumSet.of(((java.lang.Enum)v2),((java.lang.Enum)v4),((java.lang.Enum)v6),((java.lang.Enum)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v10));
    Object v12 = "d";
    Object v13 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v14 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v14));
    Object v16 = "string";
    Object v17 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v16));
    Object v18 = "string";
    Object v19 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v18));
    Object v20 = "string";
    Object v21 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v20));
    Object v22 = "string";
    Object v23 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v22));
    Object v24 = java.util.EnumSet.of(((java.lang.Enum)v17),((java.lang.Enum)v19),((java.lang.Enum)v21),((java.lang.Enum)v23));
    Object v25 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v24));
    Object v26 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
    Object v27 = ((com.fasterxml.jackson.databind.DeserializationContext)v15).mappingException(((java.lang.Class)v25),((com.fasterxml.jackson.core.JsonToken)v26));
    Object v28 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v11).deserializeKey(((java.lang.String)v12),((com.fasterxml.jackson.databind.DeserializationContext)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = -8;
    Object v1 = "string";
    Object v2 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v1));
    Object v3 = "string";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = "string";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = java.util.EnumSet.of(((java.lang.Enum)v2),((java.lang.Enum)v4),((java.lang.Enum)v6),((java.lang.Enum)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v10));
    Object v12 = "Can not handle managed/";
    Object v13 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v14 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v14));
    Object v16 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v11).deserializeKey(((java.lang.String)v12),((com.fasterxml.jackson.databind.DeserializationContext)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = -8;
    Object v1 = "string";
    Object v2 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v1));
    Object v3 = "string";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = "string";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = java.util.EnumSet.of(((java.lang.Enum)v2),((java.lang.Enum)v4),((java.lang.Enum)v6),((java.lang.Enum)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v10));
    Object v12 = "";
    Object v13 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v11)._parseLong(((java.lang.String)v12));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = "string";
    Object v1 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v0));
    Object v2 = "string";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = "string";
    Object v5 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v4));
    Object v6 = "string";
    Object v7 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v6));
    Object v8 = java.util.EnumSet.of(((java.lang.Enum)v1),((java.lang.Enum)v3),((java.lang.Enum)v5),((java.lang.Enum)v7));
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v8));
    Object v10 = ((java.lang.Class)v9).getGenericInterfaces();
    Object v11 = com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.forType(((java.lang.Class)v9));
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = "string";
    Object v2 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v1));
    Object v3 = "string";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = "string";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = java.util.EnumSet.of(((java.lang.Enum)v2),((java.lang.Enum)v4),((java.lang.Enum)v6),((java.lang.Enum)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v9));
    Object v11 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.DocumentDeserializer();
    Object v12 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v10),((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v11));
    Object v13 = ")";
    Object v14 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v15 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v15));
    Object v17 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v12)._parse(((java.lang.String)v13),((com.fasterxml.jackson.databind.DeserializationContext)v16));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = "string";
    Object v1 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v0));
    Object v2 = "string";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = "string";
    Object v5 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v4));
    Object v6 = "string";
    Object v7 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v6));
    Object v8 = java.util.EnumSet.of(((java.lang.Enum)v1),((java.lang.Enum)v3),((java.lang.Enum)v5),((java.lang.Enum)v7));
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v8));
    Object v10 = ((java.lang.Class)v9).getMethods();
    Object v11 = com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.forType(((java.lang.Class)v9));
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = -2;
    Object v1 = "string";
    Object v2 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v1));
    Object v3 = "string";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = "string";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = java.util.EnumSet.of(((java.lang.Enum)v2),((java.lang.Enum)v4),((java.lang.Enum)v6),((java.lang.Enum)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = -2;
    Object v1 = "string";
    Object v2 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v1));
    Object v3 = "string";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = "string";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = java.util.EnumSet.of(((java.lang.Enum)v2),((java.lang.Enum)v4),((java.lang.Enum)v6),((java.lang.Enum)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v10));
    Object v12 = "value ot 'true' or 'false'";
    Object v13 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v14 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v14));
    Object v16 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v11).deserializeKey(((java.lang.String)v12),((com.fasterxml.jackson.databind.DeserializationContext)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = -8;
    Object v1 = "string";
    Object v2 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v1));
    Object v3 = "string";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = "string";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = java.util.EnumSet.of(((java.lang.Enum)v2),((java.lang.Enum)v4),((java.lang.Enum)v6),((java.lang.Enum)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v10));
    Object v12 = " -> ";
    Object v13 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v14 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v14));
    Object v16 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v11).deserializeKey(((java.lang.String)v12),((com.fasterxml.jackson.databind.DeserializationContext)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = 11;
    Object v1 = "string";
    Object v2 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v1));
    Object v3 = "string";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = "string";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = java.util.EnumSet.of(((java.lang.Enum)v2),((java.lang.Enum)v4),((java.lang.Enum)v6),((java.lang.Enum)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v9));
    Object v11 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.DocumentDeserializer();
    Object v12 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v10),((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v11));
    Object v13 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v12).getKeyClass();
    Object v14 = ((java.lang.Class)v13).isInterface();
    Object v15 = com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.forType(((java.lang.Class)v13));
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = "string";
    Object v1 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v0));
    Object v2 = "string";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = "string";
    Object v5 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v4));
    Object v6 = "string";
    Object v7 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v6));
    Object v8 = java.util.EnumSet.of(((java.lang.Enum)v1),((java.lang.Enum)v3),((java.lang.Enum)v5),((java.lang.Enum)v7));
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v8));
    Object v10 = ((java.lang.Class)v9).getDeclaredConstructors();
    Object v11 = com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.forType(((java.lang.Class)v9));
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = "string";
    Object v2 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v1));
    Object v3 = "string";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = "string";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = java.util.EnumSet.of(((java.lang.Enum)v2),((java.lang.Enum)v4),((java.lang.Enum)v6),((java.lang.Enum)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v9));
    Object v11 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.DocumentDeserializer();
    Object v12 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v10),((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v11));
    Object v13 = "; expected type JsonSerializer or Class<JsonSerializer> instead";
    Object v14 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v15 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v15));
    Object v17 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v12).deserializeKey(((java.lang.String)v13),((com.fasterxml.jackson.databind.DeserializationContext)v16));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = 11;
    Object v1 = "string";
    Object v2 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v1));
    Object v3 = "string";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = "string";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = java.util.EnumSet.of(((java.lang.Enum)v2),((java.lang.Enum)v4),((java.lang.Enum)v6),((java.lang.Enum)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v9));
    Object v11 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.DocumentDeserializer();
    Object v12 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v10),((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v11));
    Object v13 = "]";
    Object v14 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v15 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v15));
    Object v17 = "string";
    Object v18 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v17));
    Object v19 = "string";
    Object v20 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v19));
    Object v21 = "string";
    Object v22 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v21));
    Object v23 = "string";
    Object v24 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v23));
    Object v25 = java.util.EnumSet.of(((java.lang.Enum)v18),((java.lang.Enum)v20),((java.lang.Enum)v22),((java.lang.Enum)v24));
    Object v26 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v25));
    Object v27 = "set";
    Object v28 = "it?ems";
    Object v29 = ((com.fasterxml.jackson.databind.DeserializationContext)v16).weirdKeyException(((java.lang.Class)v26),((java.lang.String)v27),((java.lang.String)v28));
    Object v30 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v12).deserializeKey(((java.lang.String)v13),((com.fasterxml.jackson.databind.DeserializationContext)v16));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = -2;
    Object v1 = "string";
    Object v2 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v1));
    Object v3 = "string";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = "string";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = java.util.EnumSet.of(((java.lang.Enum)v2),((java.lang.Enum)v4),((java.lang.Enum)v6),((java.lang.Enum)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v10));
    Object v12 = "Unexpected JSON values; expected at most %d properties (in JSON Array)";
    Object v13 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v11)._parseInt(((java.lang.String)v12));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = 11;
    Object v1 = "string";
    Object v2 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v1));
    Object v3 = "string";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = "string";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = java.util.EnumSet.of(((java.lang.Enum)v2),((java.lang.Enum)v4),((java.lang.Enum)v6),((java.lang.Enum)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v9));
    Object v11 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.DocumentDeserializer();
    Object v12 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v10),((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v11));
    Object v13 = "string";
    Object v14 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v15 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v15));
    Object v17 = "string";
    Object v18 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v17));
    Object v19 = "string";
    Object v20 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v19));
    Object v21 = "string";
    Object v22 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v21));
    Object v23 = "string";
    Object v24 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v23));
    Object v25 = java.util.EnumSet.of(((java.lang.Enum)v18),((java.lang.Enum)v20),((java.lang.Enum)v22),((java.lang.Enum)v24));
    Object v26 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v25));
    Object v27 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v26));
    Object v28 = "3";
    Object v29 = ") returned true for 'canCreateUsingDelegate()', but null for 'gCetDelegateType()'";
    Object v30 = ((com.fasterxml.jackson.databind.DeserializationContext)v16).unknownTypeException(((com.fasterxml.jackson.databind.JavaType)v27),((java.lang.String)v28),((java.lang.String)v29));
    Object v31 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v12).deserializeKey(((java.lang.String)v13),((com.fasterxml.jackson.databind.DeserializationContext)v16));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = 11;
    Object v1 = "string";
    Object v2 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v1));
    Object v3 = "string";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = "string";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = java.util.EnumSet.of(((java.lang.Enum)v2),((java.lang.Enum)v4),((java.lang.Enum)v6),((java.lang.Enum)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v9));
    Object v11 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.DocumentDeserializer();
    Object v12 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v10),((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v11));
    Object v13 = "string";
    Object v14 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v15 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v15));
    Object v17 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v12)._parse(((java.lang.String)v13),((com.fasterxml.jackson.databind.DeserializationContext)v16));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = -2;
    Object v1 = "string";
    Object v2 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v1));
    Object v3 = "string";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = "string";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = java.util.EnumSet.of(((java.lang.Enum)v2),((java.lang.Enum)v4),((java.lang.Enum)v6),((java.lang.Enum)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v10));
    Object v12 = "";
    Object v13 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v14 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v14));
    Object v16 = new com.fasterxml.jackson.databind.util.ObjectBuffer();
    ((com.fasterxml.jackson.databind.DeserializationContext)v15).returnObjectBuffer(((com.fasterxml.jackson.databind.util.ObjectBuffer)v16));
    Object v17 = null;
    Object v18 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v11).deserializeKey(((java.lang.String)v12),((com.fasterxml.jackson.databind.DeserializationContext)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = 11;
    Object v1 = "string";
    Object v2 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v1));
    Object v3 = "string";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = "string";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = java.util.EnumSet.of(((java.lang.Enum)v2),((java.lang.Enum)v4),((java.lang.Enum)v6),((java.lang.Enum)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v9));
    Object v11 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.DocumentDeserializer();
    Object v12 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v10),((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v11));
    Object v13 = "arr";
    Object v14 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v15 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v15));
    Object v17 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v12)._parse(((java.lang.String)v13),((com.fasterxml.jackson.databind.DeserializationContext)v16));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = -2;
    Object v1 = "string";
    Object v2 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v1));
    Object v3 = "string";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = "string";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = java.util.EnumSet.of(((java.lang.Enum)v2),((java.lang.Enum)v4),((java.lang.Enum)v6),((java.lang.Enum)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v10));
    Object v12 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v11).getKeyClass();
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = -2;
    Object v1 = "string";
    Object v2 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v1));
    Object v3 = "string";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = "string";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = java.util.EnumSet.of(((java.lang.Enum)v2),((java.lang.Enum)v4),((java.lang.Enum)v6),((java.lang.Enum)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v10));
    Object v12 = ")";
    Object v13 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v11)._parseDouble(((java.lang.String)v12));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = 11;
    Object v1 = "string";
    Object v2 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v1));
    Object v3 = "string";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = "string";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = java.util.EnumSet.of(((java.lang.Enum)v2),((java.lang.Enum)v4),((java.lang.Enum)v6),((java.lang.Enum)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v9));
    Object v11 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.DocumentDeserializer();
    Object v12 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v10),((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v11));
    Object v13 = "no double/Double-argument constructor/factory method to deserialize from Number value (%s)";
    Object v14 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v15 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v15));
    Object v17 = "string";
    Object v18 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v17));
    Object v19 = "string";
    Object v20 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v19));
    Object v21 = "string";
    Object v22 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v21));
    Object v23 = "string";
    Object v24 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v23));
    Object v25 = java.util.EnumSet.of(((java.lang.Enum)v18),((java.lang.Enum)v20),((java.lang.Enum)v22),((java.lang.Enum)v24));
    Object v26 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v25));
    Object v27 = com.fasterxml.jackson.databind.node.BooleanNode.getTrue();
    Object v28 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v29 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v27),((com.fasterxml.jackson.core.ObjectCodec)v28));
    Object v30 = ")";
    Object v31 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.core.JsonParser)v29),((java.lang.String)v30));
    Object v32 = ((com.fasterxml.jackson.databind.DeserializationContext)v16).instantiationException(((java.lang.Class)v26),((java.lang.Throwable)v31));
    Object v33 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v12).deserializeKey(((java.lang.String)v13),((com.fasterxml.jackson.databind.DeserializationContext)v16));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = -2;
    Object v1 = "string";
    Object v2 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v1));
    Object v3 = "string";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = "string";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = java.util.EnumSet.of(((java.lang.Enum)v2),((java.lang.Enum)v4),((java.lang.Enum)v6),((java.lang.Enum)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v10));
    Object v12 = "AUTO_DETECT_CREATORS";
    Object v13 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v14 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v14));
    Object v16 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v11)._parse(((java.lang.String)v12),((com.fasterxml.jackson.databind.DeserializationContext)v15));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = "string";
    Object v2 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v1));
    Object v3 = "string";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = "string";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = java.util.EnumSet.of(((java.lang.Enum)v2),((java.lang.Enum)v4),((java.lang.Enum)v6),((java.lang.Enum)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v9));
    Object v11 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.DocumentDeserializer();
    Object v12 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v10),((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v11));
    Object v13 = "2";
    Object v14 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v15 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v15));
    Object v17 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v12)._parse(((java.lang.String)v13),((com.fasterxml.jackson.databind.DeserializationContext)v16));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = -2;
    Object v1 = "string";
    Object v2 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v1));
    Object v3 = "string";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = "string";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = java.util.EnumSet.of(((java.lang.Enum)v2),((java.lang.Enum)v4),((java.lang.Enum)v6),((java.lang.Enum)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v10));
    Object v12 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v11).getKeyClass();
    Object v13 = com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.forType(((java.lang.Class)v12));
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = "string";
    Object v2 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v1));
    Object v3 = "string";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = "string";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = java.util.EnumSet.of(((java.lang.Enum)v2),((java.lang.Enum)v4),((java.lang.Enum)v6),((java.lang.Enum)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v9));
    Object v11 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.DocumentDeserializer();
    Object v12 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v10),((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v11));
    Object v13 = "]";
    Object v14 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v15 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v15));
    Object v17 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v12)._parse(((java.lang.String)v13),((com.fasterxml.jackson.databind.DeserializationContext)v16));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = 5;
    Object v1 = -2;
    Object v2 = "string";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = "string";
    Object v5 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v4));
    Object v6 = "string";
    Object v7 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v6));
    Object v8 = "string";
    Object v9 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v8));
    Object v10 = java.util.EnumSet.of(((java.lang.Enum)v3),((java.lang.Enum)v5),((java.lang.Enum)v7),((java.lang.Enum)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v1).intValue()),((java.lang.Class)v11));
    Object v13 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v12).getKeyClass();
    Object v14 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = -2;
    Object v1 = "string";
    Object v2 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v1));
    Object v3 = "string";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = "string";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = java.util.EnumSet.of(((java.lang.Enum)v2),((java.lang.Enum)v4),((java.lang.Enum)v6),((java.lang.Enum)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v10));
    Object v12 = "it";
    Object v13 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v14 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v14));
    Object v16 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v11)._parse(((java.lang.String)v12),((com.fasterxml.jackson.databind.DeserializationContext)v15));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = "string";
    Object v2 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v1));
    Object v3 = "string";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = "string";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = java.util.EnumSet.of(((java.lang.Enum)v2),((java.lang.Enum)v4),((java.lang.Enum)v6),((java.lang.Enum)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v9));
    Object v11 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.DocumentDeserializer();
    Object v12 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v10),((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v11));
    Object v13 = "'";
    Object v14 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v12)._parseInt(((java.lang.String)v13));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = 11;
    Object v1 = "string";
    Object v2 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v1));
    Object v3 = "string";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = "string";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = java.util.EnumSet.of(((java.lang.Enum)v2),((java.lang.Enum)v4),((java.lang.Enum)v6),((java.lang.Enum)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v9));
    Object v11 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.DocumentDeserializer();
    Object v12 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v10),((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v11));
    Object v13 = ", problem: ";
    Object v14 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v12)._parseDouble(((java.lang.String)v13));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = "string";
    Object v2 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v1));
    Object v3 = "string";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = "string";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = java.util.EnumSet.of(((java.lang.Enum)v2),((java.lang.Enum)v4),((java.lang.Enum)v6),((java.lang.Enum)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v9));
    Object v11 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.DocumentDeserializer();
    Object v12 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v10),((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v11));
    Object v13 = "st";
    Object v14 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v15 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v15));
    Object v17 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v12).deserializeKey(((java.lang.String)v13),((com.fasterxml.jackson.databind.DeserializationContext)v16));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = "string";
    Object v1 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v0));
    Object v2 = "string";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = "string";
    Object v5 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v4));
    Object v6 = "string";
    Object v7 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v6));
    Object v8 = java.util.EnumSet.of(((java.lang.Enum)v1),((java.lang.Enum)v3),((java.lang.Enum)v5),((java.lang.Enum)v7));
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v8));
    Object v10 = "";
    Object v11 = ((java.lang.Class)v9).getResource(((java.lang.String)v10));
    Object v12 = com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.forType(((java.lang.Class)v9));
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = -2;
    Object v1 = "string";
    Object v2 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v1));
    Object v3 = "string";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = "string";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = java.util.EnumSet.of(((java.lang.Enum)v2),((java.lang.Enum)v4),((java.lang.Enum)v6),((java.lang.Enum)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v10));
    Object v12 = "";
    Object v13 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v14 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v14));
    Object v16 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v11)._parse(((java.lang.String)v12),((com.fasterxml.jackson.databind.DeserializationContext)v15));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = 11;
    Object v1 = "string";
    Object v2 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v1));
    Object v3 = "string";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = "string";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = java.util.EnumSet.of(((java.lang.Enum)v2),((java.lang.Enum)v4),((java.lang.Enum)v6),((java.lang.Enum)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v9));
    Object v11 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.DocumentDeserializer();
    Object v12 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v10),((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v11));
    Object v13 = "array";
    Object v14 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v15 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v15));
    Object v17 = "|";
    Object v18 = ((com.fasterxml.jackson.databind.DeserializationContext)v16).mappingException(((java.lang.String)v17));
    Object v19 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v12).deserializeKey(((java.lang.String)v13),((com.fasterxml.jackson.databind.DeserializationContext)v16));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = "string";
    Object v2 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v1));
    Object v3 = "string";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = "string";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = java.util.EnumSet.of(((java.lang.Enum)v2),((java.lang.Enum)v4),((java.lang.Enum)v6),((java.lang.Enum)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v9));
    Object v11 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.DocumentDeserializer();
    Object v12 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v10),((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v11));
    Object v13 = "string";
    Object v14 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v12)._parseDouble(((java.lang.String)v13));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = -3;
    Object v1 = -2;
    Object v2 = "string";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = "string";
    Object v5 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v4));
    Object v6 = "string";
    Object v7 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v6));
    Object v8 = "string";
    Object v9 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v8));
    Object v10 = java.util.EnumSet.of(((java.lang.Enum)v3),((java.lang.Enum)v5),((java.lang.Enum)v7),((java.lang.Enum)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v1).intValue()),((java.lang.Class)v11));
    Object v13 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v12).getKeyClass();
    Object v14 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = "string";
    Object v2 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v1));
    Object v3 = "string";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = "string";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = java.util.EnumSet.of(((java.lang.Enum)v2),((java.lang.Enum)v4),((java.lang.Enum)v6),((java.lang.Enum)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v9));
    Object v11 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.DocumentDeserializer();
    Object v12 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v10),((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v11));
    Object v13 = "#";
    Object v14 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v15 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v15));
    Object v17 = new com.fasterxml.jackson.databind.util.ObjectBuffer();
    ((com.fasterxml.jackson.databind.DeserializationContext)v16).returnObjectBuffer(((com.fasterxml.jackson.databind.util.ObjectBuffer)v17));
    Object v18 = null;
    Object v19 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v12)._parse(((java.lang.String)v13),((com.fasterxml.jackson.databind.DeserializationContext)v16));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = -2;
    Object v1 = "string";
    Object v2 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v1));
    Object v3 = "string";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = "string";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = java.util.EnumSet.of(((java.lang.Enum)v2),((java.lang.Enum)v4),((java.lang.Enum)v6),((java.lang.Enum)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v10));
    Object v12 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v11).getKeyClass();
    Object v13 = ((java.lang.Class)v12).isArray();
    Object v14 = com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.forType(((java.lang.Class)v12));
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = 11;
    Object v1 = "string";
    Object v2 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v1));
    Object v3 = "string";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = "string";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = java.util.EnumSet.of(((java.lang.Enum)v2),((java.lang.Enum)v4),((java.lang.Enum)v6),((java.lang.Enum)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v9));
    Object v11 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.DocumentDeserializer();
    Object v12 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v10),((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v11));
    Object v13 = "; actual type:";
    Object v14 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v15 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v15));
    Object v17 = "string";
    Object v18 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v17));
    Object v19 = "string";
    Object v20 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v19));
    Object v21 = "string";
    Object v22 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v21));
    Object v23 = "string";
    Object v24 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v23));
    Object v25 = java.util.EnumSet.of(((java.lang.Enum)v18),((java.lang.Enum)v20),((java.lang.Enum)v22),((java.lang.Enum)v24));
    Object v26 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v25));
    Object v27 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v26));
    Object v28 = "]%";
    Object v29 = ", not supported as ";
    Object v30 = ((com.fasterxml.jackson.databind.DeserializationContext)v16).unknownTypeIdException(((com.fasterxml.jackson.databind.JavaType)v27),((java.lang.String)v28),((java.lang.String)v29));
    Object v31 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v12).deserializeKey(((java.lang.String)v13),((com.fasterxml.jackson.databind.DeserializationContext)v16));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = -2;
    Object v1 = "string";
    Object v2 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v1));
    Object v3 = "string";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = "string";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = java.util.EnumSet.of(((java.lang.Enum)v2),((java.lang.Enum)v4),((java.lang.Enum)v6),((java.lang.Enum)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v10));
    Object v12 = "string";
    Object v13 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v14 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v14));
    Object v16 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v11).deserializeKey(((java.lang.String)v12),((com.fasterxml.jackson.databind.DeserializationContext)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = 11;
    Object v1 = "string";
    Object v2 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v1));
    Object v3 = "string";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = "string";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = java.util.EnumSet.of(((java.lang.Enum)v2),((java.lang.Enum)v4),((java.lang.Enum)v6),((java.lang.Enum)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v9));
    Object v11 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.DocumentDeserializer();
    Object v12 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v10),((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v11));
    Object v13 = "z";
    Object v14 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v15 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v15));
    Object v17 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v12).deserializeKey(((java.lang.String)v13),((com.fasterxml.jackson.databind.DeserializationContext)v16));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = -3;
    Object v1 = -2;
    Object v2 = "string";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = "string";
    Object v5 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v4));
    Object v6 = "string";
    Object v7 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v6));
    Object v8 = "string";
    Object v9 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v8));
    Object v10 = java.util.EnumSet.of(((java.lang.Enum)v3),((java.lang.Enum)v5),((java.lang.Enum)v7),((java.lang.Enum)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v1).intValue()),((java.lang.Class)v11));
    Object v13 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v12).getKeyClass();
    Object v14 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v13));
    Object v15 = "iems";
    Object v16 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v17 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v17));
    Object v19 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v14)._parse(((java.lang.String)v15),((com.fasterxml.jackson.databind.DeserializationContext)v18));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = -3;
    Object v1 = -2;
    Object v2 = "string";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = "string";
    Object v5 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v4));
    Object v6 = "string";
    Object v7 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v6));
    Object v8 = "string";
    Object v9 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v8));
    Object v10 = java.util.EnumSet.of(((java.lang.Enum)v3),((java.lang.Enum)v5),((java.lang.Enum)v7),((java.lang.Enum)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v1).intValue()),((java.lang.Class)v11));
    Object v13 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v12).getKeyClass();
    Object v14 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v13));
    Object v15 = ")";
    Object v16 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v17 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v17));
    Object v19 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v14)._parse(((java.lang.String)v15),((com.fasterxml.jackson.databind.DeserializationContext)v18));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = "string";
    Object v2 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v1));
    Object v3 = "string";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = "string";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = java.util.EnumSet.of(((java.lang.Enum)v2),((java.lang.Enum)v4),((java.lang.Enum)v6),((java.lang.Enum)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v9));
    Object v11 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.DocumentDeserializer();
    Object v12 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v10),((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v11));
    Object v13 = "B";
    Object v14 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v15 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v15));
    Object v17 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v18 = "]";
    Object v19 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.DocumentDeserializer();
    ((com.fasterxml.jackson.databind.DeserializationContext)v16).reportUnknownProperty(((java.lang.Object)v17),((java.lang.String)v18),((com.fasterxml.jackson.databind.JsonDeserializer)v19));
    Object v20 = null;
    Object v21 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v12).deserializeKey(((java.lang.String)v13),((com.fasterxml.jackson.databind.DeserializationContext)v16));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = -2;
    Object v1 = "string";
    Object v2 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v1));
    Object v3 = "string";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = "string";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = java.util.EnumSet.of(((java.lang.Enum)v2),((java.lang.Enum)v4),((java.lang.Enum)v6),((java.lang.Enum)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v10));
    Object v12 = "j";
    Object v13 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v14 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v14));
    Object v16 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v11).deserializeKey(((java.lang.String)v12),((com.fasterxml.jackson.databind.DeserializationContext)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = -2;
    Object v1 = "string";
    Object v2 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v1));
    Object v3 = "string";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = "string";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = java.util.EnumSet.of(((java.lang.Enum)v2),((java.lang.Enum)v4),((java.lang.Enum)v6),((java.lang.Enum)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v10));
    Object v12 = "]";
    Object v13 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v14 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v14));
    Object v16 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v11).deserializeKey(((java.lang.String)v12),((com.fasterxml.jackson.databind.DeserializationContext)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = -2;
    Object v1 = "string";
    Object v2 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v1));
    Object v3 = "string";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = "string";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = java.util.EnumSet.of(((java.lang.Enum)v2),((java.lang.Enum)v4),((java.lang.Enum)v6),((java.lang.Enum)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v10));
    Object v12 = "'";
    Object v13 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v14 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v14));
    Object v16 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v11).deserializeKey(((java.lang.String)v12),((com.fasterxml.jackson.databind.DeserializationContext)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = 20;
    Object v1 = -2;
    Object v2 = "string";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = "string";
    Object v5 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v4));
    Object v6 = "string";
    Object v7 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v6));
    Object v8 = "string";
    Object v9 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v8));
    Object v10 = java.util.EnumSet.of(((java.lang.Enum)v3),((java.lang.Enum)v5),((java.lang.Enum)v7),((java.lang.Enum)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v1).intValue()),((java.lang.Class)v11));
    Object v13 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v12).getKeyClass();
    Object v14 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = 20;
    Object v1 = -2;
    Object v2 = "string";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = "string";
    Object v5 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v4));
    Object v6 = "string";
    Object v7 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v6));
    Object v8 = "string";
    Object v9 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v8));
    Object v10 = java.util.EnumSet.of(((java.lang.Enum)v3),((java.lang.Enum)v5),((java.lang.Enum)v7),((java.lang.Enum)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v1).intValue()),((java.lang.Class)v11));
    Object v13 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v12).getKeyClass();
    Object v14 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v13));
    Object v15 = ")";
    Object v16 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v14)._parseInt(((java.lang.String)v15));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = -8;
    Object v1 = "string";
    Object v2 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v1));
    Object v3 = "string";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = "string";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = java.util.EnumSet.of(((java.lang.Enum)v2),((java.lang.Enum)v4),((java.lang.Enum)v6),((java.lang.Enum)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v10));
    Object v12 = "";
    Object v13 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v14 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v14));
    Object v16 = "]N";
    Object v17 = ((com.fasterxml.jackson.databind.DeserializationContext)v15).mappingException(((java.lang.String)v16));
    Object v18 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v11).deserializeKey(((java.lang.String)v12),((com.fasterxml.jackson.databind.DeserializationContext)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = 0;
    Object v1 = -2;
    Object v2 = "string";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = "string";
    Object v5 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v4));
    Object v6 = "string";
    Object v7 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v6));
    Object v8 = "string";
    Object v9 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v8));
    Object v10 = java.util.EnumSet.of(((java.lang.Enum)v3),((java.lang.Enum)v5),((java.lang.Enum)v7),((java.lang.Enum)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v1).intValue()),((java.lang.Class)v11));
    Object v13 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v12).getKeyClass();
    Object v14 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.DocumentDeserializer();
    Object v15 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v13),((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v14));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = "string";
    Object v2 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v1));
    Object v3 = "string";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = "string";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = java.util.EnumSet.of(((java.lang.Enum)v2),((java.lang.Enum)v4),((java.lang.Enum)v6),((java.lang.Enum)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v9));
    Object v11 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.DocumentDeserializer();
    Object v12 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v10),((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v11));
    Object v13 = "5";
    Object v14 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v15 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v15));
    Object v17 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v12)._parse(((java.lang.String)v13),((com.fasterxml.jackson.databind.DeserializationContext)v16));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = 11;
    Object v1 = "string";
    Object v2 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v1));
    Object v3 = "string";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = "string";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = java.util.EnumSet.of(((java.lang.Enum)v2),((java.lang.Enum)v4),((java.lang.Enum)v6),((java.lang.Enum)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v9));
    Object v11 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.DocumentDeserializer();
    Object v12 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v10),((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v11));
    Object v13 = "D";
    Object v14 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v15 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v15));
    Object v17 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v12).deserializeKey(((java.lang.String)v13),((com.fasterxml.jackson.databind.DeserializationContext)v16));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = "string";
    Object v1 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v0));
    Object v2 = "string";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = "string";
    Object v5 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v4));
    Object v6 = "string";
    Object v7 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v6));
    Object v8 = java.util.EnumSet.of(((java.lang.Enum)v1),((java.lang.Enum)v3),((java.lang.Enum)v5),((java.lang.Enum)v7));
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v8));
    Object v10 = ((java.lang.Class)v9).getProtectionDomain();
    Object v11 = com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.forType(((java.lang.Class)v9));
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = -8;
    Object v1 = "string";
    Object v2 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v1));
    Object v3 = "string";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = "string";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = java.util.EnumSet.of(((java.lang.Enum)v2),((java.lang.Enum)v4),((java.lang.Enum)v6),((java.lang.Enum)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v10));
    Object v12 = "Failed to parse @JsonSerializableSchema.schemaObjectPrLopertiesDefinition value";
    Object v13 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v14 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v14));
    Object v16 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v11).deserializeKey(((java.lang.String)v12),((com.fasterxml.jackson.databind.DeserializationContext)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = -2;
    Object v2 = "string";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = "string";
    Object v5 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v4));
    Object v6 = "string";
    Object v7 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v6));
    Object v8 = "string";
    Object v9 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v8));
    Object v10 = java.util.EnumSet.of(((java.lang.Enum)v3),((java.lang.Enum)v5),((java.lang.Enum)v7),((java.lang.Enum)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v1).intValue()),((java.lang.Class)v11));
    Object v13 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v12).getKeyClass();
    Object v14 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.DocumentDeserializer();
    Object v15 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v13),((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v14));
    Object v16 = "string";
    Object v17 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v18 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v17));
    Object v19 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v18));
    Object v20 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v15)._parse(((java.lang.String)v16),((com.fasterxml.jackson.databind.DeserializationContext)v19));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = -8;
    Object v1 = "string";
    Object v2 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v1));
    Object v3 = "string";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = "string";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = java.util.EnumSet.of(((java.lang.Enum)v2),((java.lang.Enum)v4),((java.lang.Enum)v6),((java.lang.Enum)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v10));
    Object v12 = "";
    Object v13 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v14 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v14));
    Object v16 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v11)._parse(((java.lang.String)v12),((com.fasterxml.jackson.databind.DeserializationContext)v15));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = 0;
    Object v1 = -2;
    Object v2 = "string";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = "string";
    Object v5 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v4));
    Object v6 = "string";
    Object v7 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v6));
    Object v8 = "string";
    Object v9 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v8));
    Object v10 = java.util.EnumSet.of(((java.lang.Enum)v3),((java.lang.Enum)v5),((java.lang.Enum)v7),((java.lang.Enum)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v1).intValue()),((java.lang.Class)v11));
    Object v13 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v12).getKeyClass();
    Object v14 = ((java.lang.Class)v13).getAnnotatedInterfaces();
    Object v15 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.DocumentDeserializer();
    Object v16 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v13),((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v15));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = 11;
    Object v1 = "string";
    Object v2 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v1));
    Object v3 = "string";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = "string";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = java.util.EnumSet.of(((java.lang.Enum)v2),((java.lang.Enum)v4),((java.lang.Enum)v6),((java.lang.Enum)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v9));
    Object v11 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.DocumentDeserializer();
    Object v12 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v10),((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v11));
    Object v13 = ")";
    Object v14 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v12)._parseDouble(((java.lang.String)v13));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = 20;
    Object v1 = -2;
    Object v2 = "string";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = "string";
    Object v5 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v4));
    Object v6 = "string";
    Object v7 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v6));
    Object v8 = "string";
    Object v9 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v8));
    Object v10 = java.util.EnumSet.of(((java.lang.Enum)v3),((java.lang.Enum)v5),((java.lang.Enum)v7),((java.lang.Enum)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v1).intValue()),((java.lang.Class)v11));
    Object v13 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v12).getKeyClass();
    Object v14 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v13));
    Object v15 = "' (remaining: '";
    Object v16 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v17 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v17));
    Object v19 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v14)._parse(((java.lang.String)v15),((com.fasterxml.jackson.databind.DeserializationContext)v18));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = -2;
    Object v2 = "string";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = "string";
    Object v5 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v4));
    Object v6 = "string";
    Object v7 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v6));
    Object v8 = "string";
    Object v9 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v8));
    Object v10 = java.util.EnumSet.of(((java.lang.Enum)v3),((java.lang.Enum)v5),((java.lang.Enum)v7),((java.lang.Enum)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v1).intValue()),((java.lang.Class)v11));
    Object v13 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v12).getKeyClass();
    Object v14 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.DocumentDeserializer();
    Object v15 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v13),((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v14));
    Object v16 = "st";
    Object v17 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v18 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v17));
    Object v19 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v18));
    Object v20 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v15).deserializeKey(((java.lang.String)v16),((com.fasterxml.jackson.databind.DeserializationContext)v19));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = -2;
    Object v1 = "string";
    Object v2 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v1));
    Object v3 = "string";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = "string";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = java.util.EnumSet.of(((java.lang.Enum)v2),((java.lang.Enum)v4),((java.lang.Enum)v6),((java.lang.Enum)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v10));
    Object v12 = "\"";
    Object v13 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v14 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v14));
    Object v16 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v11)._parse(((java.lang.String)v12),((com.fasterxml.jackson.databind.DeserializationContext)v15));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = -2;
    Object v1 = "string";
    Object v2 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v1));
    Object v3 = "string";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = "string";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = java.util.EnumSet.of(((java.lang.Enum)v2),((java.lang.Enum)v4),((java.lang.Enum)v6),((java.lang.Enum)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v10));
    Object v12 = "NY";
    Object v13 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v14 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v14));
    Object v16 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v11)._parse(((java.lang.String)v12),((com.fasterxml.jackson.databind.DeserializationContext)v15));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = -2;
    Object v1 = "string";
    Object v2 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v1));
    Object v3 = "string";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = "string";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = java.util.EnumSet.of(((java.lang.Enum)v2),((java.lang.Enum)v4),((java.lang.Enum)v6),((java.lang.Enum)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v10));
    Object v12 = "00.000";
    Object v13 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v14 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v14));
    Object v16 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v11).deserializeKey(((java.lang.String)v12),((com.fasterxml.jackson.databind.DeserializationContext)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = 20;
    Object v1 = -2;
    Object v2 = "string";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = "string";
    Object v5 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v4));
    Object v6 = "string";
    Object v7 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v6));
    Object v8 = "string";
    Object v9 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v8));
    Object v10 = java.util.EnumSet.of(((java.lang.Enum)v3),((java.lang.Enum)v5),((java.lang.Enum)v7),((java.lang.Enum)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v1).intValue()),((java.lang.Class)v11));
    Object v13 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v12).getKeyClass();
    Object v14 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v13));
    Object v15 = "";
    Object v16 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v17 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v17));
    Object v19 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v14).deserializeKey(((java.lang.String)v15),((com.fasterxml.jackson.databind.DeserializationContext)v18));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = "string";
    Object v2 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v1));
    Object v3 = "string";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = "string";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = java.util.EnumSet.of(((java.lang.Enum)v2),((java.lang.Enum)v4),((java.lang.Enum)v6),((java.lang.Enum)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v9));
    Object v11 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.DocumentDeserializer();
    Object v12 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v10),((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v11));
    Object v13 = "WRITE?SINGLE_ELEM_ARRAYS_UNWRAPPED";
    Object v14 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v15 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v15));
    Object v17 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v12).deserializeKey(((java.lang.String)v13),((com.fasterxml.jackson.databind.DeserializationContext)v16));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = 20;
    Object v1 = -2;
    Object v2 = "string";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = "string";
    Object v5 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v4));
    Object v6 = "string";
    Object v7 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v6));
    Object v8 = "string";
    Object v9 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v8));
    Object v10 = java.util.EnumSet.of(((java.lang.Enum)v3),((java.lang.Enum)v5),((java.lang.Enum)v7),((java.lang.Enum)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v1).intValue()),((java.lang.Class)v11));
    Object v13 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v12).getKeyClass();
    Object v14 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v13));
    Object v15 = "Class ^";
    Object v16 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v17 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v17));
    Object v19 = "List";
    Object v20 = -2;
    Object v21 = "string";
    Object v22 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v21));
    Object v23 = "string";
    Object v24 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v23));
    Object v25 = "string";
    Object v26 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v25));
    Object v27 = "string";
    Object v28 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v27));
    Object v29 = java.util.EnumSet.of(((java.lang.Enum)v22),((java.lang.Enum)v24),((java.lang.Enum)v26),((java.lang.Enum)v28));
    Object v30 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v29));
    Object v31 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v20).intValue()),((java.lang.Class)v30));
    Object v32 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v31).getKeyClass();
    Object v33 = "C";
    Object v34 = ((com.fasterxml.jackson.databind.DeserializationContext)v18).weirdStringException(((java.lang.String)v19),((java.lang.Class)v32),((java.lang.String)v33));
    Object v35 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v14)._parse(((java.lang.String)v15),((com.fasterxml.jackson.databind.DeserializationContext)v18));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = "string";
    Object v2 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v1));
    Object v3 = "string";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = "string";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = java.util.EnumSet.of(((java.lang.Enum)v2),((java.lang.Enum)v4),((java.lang.Enum)v6),((java.lang.Enum)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v9));
    Object v11 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.DocumentDeserializer();
    Object v12 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v10),((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v11));
    Object v13 = "numer";
    Object v14 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v15 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v15));
    Object v17 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v12)._parse(((java.lang.String)v13),((com.fasterxml.jackson.databind.DeserializationContext)v16));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = -8;
    Object v1 = "string";
    Object v2 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v1));
    Object v3 = "string";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = "string";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = java.util.EnumSet.of(((java.lang.Enum)v2),((java.lang.Enum)v4),((java.lang.Enum)v6),((java.lang.Enum)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v10));
    Object v12 = "i";
    Object v13 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v14 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v14));
    Object v16 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v11).deserializeKey(((java.lang.String)v12),((com.fasterxml.jackson.databind.DeserializationContext)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = -1;
    Object v1 = -2;
    Object v2 = "string";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = "string";
    Object v5 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v4));
    Object v6 = "string";
    Object v7 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v6));
    Object v8 = "string";
    Object v9 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v8));
    Object v10 = java.util.EnumSet.of(((java.lang.Enum)v3),((java.lang.Enum)v5),((java.lang.Enum)v7),((java.lang.Enum)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v1).intValue()),((java.lang.Class)v11));
    Object v13 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v12).getKeyClass();
    Object v14 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.DocumentDeserializer();
    Object v15 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v13),((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v14));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = 11;
    Object v1 = "string";
    Object v2 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v1));
    Object v3 = "string";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = "string";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = java.util.EnumSet.of(((java.lang.Enum)v2),((java.lang.Enum)v4),((java.lang.Enum)v6),((java.lang.Enum)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v9));
    Object v11 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.DocumentDeserializer();
    Object v12 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v10),((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v11));
    Object v13 = "";
    Object v14 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v15 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v15));
    Object v17 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v12).deserializeKey(((java.lang.String)v13),((com.fasterxml.jackson.databind.DeserializationContext)v16));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = -1;
    Object v1 = -2;
    Object v2 = "string";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = "string";
    Object v5 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v4));
    Object v6 = "string";
    Object v7 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v6));
    Object v8 = "string";
    Object v9 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v8));
    Object v10 = java.util.EnumSet.of(((java.lang.Enum)v3),((java.lang.Enum)v5),((java.lang.Enum)v7),((java.lang.Enum)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v1).intValue()),((java.lang.Class)v11));
    Object v13 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v12).getKeyClass();
    Object v14 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.DocumentDeserializer();
    Object v15 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v13),((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v14));
    Object v16 = "] that wasn't previously een as unresolved.";
    Object v17 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v18 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v17));
    Object v19 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v18));
    Object v20 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v15)._parse(((java.lang.String)v16),((com.fasterxml.jackson.databind.DeserializationContext)v19));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = 20;
    Object v1 = -2;
    Object v2 = "string";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = "string";
    Object v5 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v4));
    Object v6 = "string";
    Object v7 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v6));
    Object v8 = "string";
    Object v9 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v8));
    Object v10 = java.util.EnumSet.of(((java.lang.Enum)v3),((java.lang.Enum)v5),((java.lang.Enum)v7),((java.lang.Enum)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v1).intValue()),((java.lang.Class)v11));
    Object v13 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v12).getKeyClass();
    Object v14 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v13));
    Object v15 = "";
    Object v16 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v17 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v17));
    Object v19 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v14)._parse(((java.lang.String)v15),((com.fasterxml.jackson.databind.DeserializationContext)v18));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = -2;
    Object v2 = "string";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = "string";
    Object v5 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v4));
    Object v6 = "string";
    Object v7 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v6));
    Object v8 = "string";
    Object v9 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v8));
    Object v10 = java.util.EnumSet.of(((java.lang.Enum)v3),((java.lang.Enum)v5),((java.lang.Enum)v7),((java.lang.Enum)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v1).intValue()),((java.lang.Class)v11));
    Object v13 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v12).getKeyClass();
    Object v14 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.DocumentDeserializer();
    Object v15 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v0).intValue()),((java.lang.Class)v13),((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v14));
    Object v16 = "Unexpected JSON value(s); expected at most %d properties (in JSON Array)";
    Object v17 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v18 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v17));
    Object v19 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v18));
    Object v20 = ((com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer)v15).deserializeKey(((java.lang.String)v16),((com.fasterxml.jackson.databind.DeserializationContext)v19));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }
}
