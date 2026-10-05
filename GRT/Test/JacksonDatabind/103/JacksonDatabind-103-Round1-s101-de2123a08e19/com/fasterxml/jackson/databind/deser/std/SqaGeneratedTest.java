package com.fasterxml.jackson.databind.deser.std;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v0),((com.fasterxml.jackson.databind.deser.NullValueProvider)v1),((java.lang.Boolean)v2));
    Object v4 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)0),Byte.valueOf((byte)0)};
    Object v5 = 31;
    Object v6 = 0;
    Object v7 = com.fasterxml.jackson.databind.node.BinaryNode.valueOf(((byte[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v7));
    Object v9 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v10 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v13 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v12),((com.fasterxml.jackson.databind.deser.NullValueProvider)v13),((java.lang.Boolean)v14));
    Object v16 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v15));
    Object v17 = ((com.fasterxml.jackson.databind.DeserializationContext)v11).endOfInputException(((java.lang.Class)v16));
    ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v3)._verifyEndArrayForSingle(((com.fasterxml.jackson.core.JsonParser)v8),((com.fasterxml.jackson.databind.DeserializationContext)v11));
    Object v18 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v0),((com.fasterxml.jackson.databind.deser.NullValueProvider)v1),((java.lang.Boolean)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v5 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v6 = true;
    Object v7 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v4),((com.fasterxml.jackson.databind.deser.NullValueProvider)v5),((java.lang.Boolean)v6));
    Object v8 = ((com.fasterxml.jackson.databind.JsonDeserializer)v3).replaceDelegatee(((com.fasterxml.jackson.databind.JsonDeserializer)v7));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v0),((com.fasterxml.jackson.databind.deser.NullValueProvider)v1),((java.lang.Boolean)v2));
    Object v4 = ")";
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6));
    Object v8 = ((com.fasterxml.jackson.databind.DeserializationContext)v7).getArrayBuilders();
    Object v9 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v3)._parseDate(((java.lang.String)v4),((com.fasterxml.jackson.databind.DeserializationContext)v7));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v1 = -13;
    Object v2 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v0)._shortOverflow((((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v0),((com.fasterxml.jackson.databind.deser.NullValueProvider)v1),((java.lang.Boolean)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v3)._verifyNullForPrimitive(((com.fasterxml.jackson.databind.DeserializationContext)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v1 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v2 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v2));
    Object v4 = false;
    Object v5 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v0)._coerceTextualNull(((com.fasterxml.jackson.databind.DeserializationContext)v3),(((java.lang.Boolean)v4).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v0),((com.fasterxml.jackson.databind.deser.NullValueProvider)v1),((java.lang.Boolean)v2));
    Object v4 = 1;
    Object v5 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v3)._shortOverflow((((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v1 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v2 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v2));
    Object v4 = false;
    Object v5 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v0)._coerceEmptyString(((com.fasterxml.jackson.databind.DeserializationContext)v3),(((java.lang.Boolean)v4).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v0),((com.fasterxml.jackson.databind.deser.NullValueProvider)v1),((java.lang.Boolean)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = "Cannot create empty instance of %s, no default Creator";
    Object v8 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v3)._parseFloatPrimitive(((com.fasterxml.jackson.databind.DeserializationContext)v6),((java.lang.String)v7));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v0),((com.fasterxml.jackson.databind.deser.NullValueProvider)v1),((java.lang.Boolean)v2));
    Object v4 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)0),Byte.valueOf((byte)0)};
    Object v5 = 31;
    Object v6 = 0;
    Object v7 = com.fasterxml.jackson.databind.node.BinaryNode.valueOf(((byte[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v7));
    Object v9 = com.fasterxml.jackson.core.JsonToken.NOT_AVAILABLE;
    Object v10 = ((com.fasterxml.jackson.core.JsonParser)v8).hasToken(((com.fasterxml.jackson.core.JsonToken)v9));
    Object v11 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v12 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v11));
    Object v13 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v12));
    Object v14 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v3)._parseBytePrimitive(((com.fasterxml.jackson.core.JsonParser)v8),((com.fasterxml.jackson.databind.DeserializationContext)v13));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v0),((com.fasterxml.jackson.databind.deser.NullValueProvider)v1),((java.lang.Boolean)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v8 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v3).findContentNullStyle(((com.fasterxml.jackson.databind.DeserializationContext)v6),((com.fasterxml.jackson.databind.BeanProperty)v7));
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v1 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)0),Byte.valueOf((byte)0)};
    Object v2 = 31;
    Object v3 = 0;
    Object v4 = com.fasterxml.jackson.databind.node.BinaryNode.valueOf(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v7));
    Object v9 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v0)._deserializeFromEmpty(((com.fasterxml.jackson.core.JsonParser)v5),((com.fasterxml.jackson.databind.DeserializationContext)v8));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v0),((com.fasterxml.jackson.databind.deser.NullValueProvider)v1),((java.lang.Boolean)v2));
    Object v4 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)0),Byte.valueOf((byte)0)};
    Object v5 = 31;
    Object v6 = 0;
    Object v7 = com.fasterxml.jackson.databind.node.BinaryNode.valueOf(((byte[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v7));
    Object v9 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v10 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v10));
    Object v12 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v3)._parseDate(((com.fasterxml.jackson.core.JsonParser)v8),((com.fasterxml.jackson.databind.DeserializationContext)v11));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v0),((com.fasterxml.jackson.databind.deser.NullValueProvider)v1),((java.lang.Boolean)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonDeserializer)v3).getObjectIdReader();
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v0),((com.fasterxml.jackson.databind.deser.NullValueProvider)v1),((java.lang.Boolean)v2));
    Object v4 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)0),Byte.valueOf((byte)0)};
    Object v5 = 31;
    Object v6 = 0;
    Object v7 = com.fasterxml.jackson.databind.node.BinaryNode.valueOf(((byte[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v7));
    Object v9 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v10 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v10));
    Object v12 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v3)._parseDoublePrimitive(((com.fasterxml.jackson.core.JsonParser)v8),((com.fasterxml.jackson.databind.DeserializationContext)v11));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v0),((com.fasterxml.jackson.databind.deser.NullValueProvider)v1),((java.lang.Boolean)v2));
    Object v4 = "virtual";
    Object v5 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v3)._isNegInf(((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = com.fasterxml.jackson.databind.deser.std.StdDeserializer.parseDouble(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v0),((com.fasterxml.jackson.databind.deser.NullValueProvider)v1),((java.lang.Boolean)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = false;
    Object v8 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v3)._coerceTextualNull(((com.fasterxml.jackson.databind.DeserializationContext)v6),(((java.lang.Boolean)v7).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v0),((com.fasterxml.jackson.databind.deser.NullValueProvider)v1),((java.lang.Boolean)v2));
    Object v4 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)0),Byte.valueOf((byte)0)};
    Object v5 = 31;
    Object v6 = 0;
    Object v7 = com.fasterxml.jackson.databind.node.BinaryNode.valueOf(((byte[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v7));
    Object v9 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v10 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v10));
    Object v12 = ((com.fasterxml.jackson.databind.JsonDeserializer)v3).deserialize(((com.fasterxml.jackson.core.JsonParser)v8),((com.fasterxml.jackson.databind.DeserializationContext)v11));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v0),((com.fasterxml.jackson.databind.deser.NullValueProvider)v1),((java.lang.Boolean)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = true;
    Object v8 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v3)._coerceTextualNull(((com.fasterxml.jackson.databind.DeserializationContext)v6),(((java.lang.Boolean)v7).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v1 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v2 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v2));
    ((com.fasterxml.jackson.databind.DeserializationContext)v3).checkUnresolvedObjectId();
    Object v4 = null;
    Object v5 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v6 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v7 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v8 = true;
    Object v9 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v6),((com.fasterxml.jackson.databind.deser.NullValueProvider)v7),((java.lang.Boolean)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v9));
    Object v11 = ((java.lang.Class)v10).getDeclaredConstructors();
    Object v12 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v0).findFormatOverrides(((com.fasterxml.jackson.databind.DeserializationContext)v3),((com.fasterxml.jackson.databind.BeanProperty)v5),((java.lang.Class)v10));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v1 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v2 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v2));
    Object v4 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v5 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v6 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v7 = true;
    Object v8 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v5),((com.fasterxml.jackson.databind.deser.NullValueProvider)v6),((java.lang.Boolean)v7));
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v8));
    Object v10 = com.fasterxml.jackson.annotation.JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY;
    Object v11 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v0).findFormatFeature(((com.fasterxml.jackson.databind.DeserializationContext)v3),((com.fasterxml.jackson.databind.BeanProperty)v4),((java.lang.Class)v9),((com.fasterxml.jackson.annotation.JsonFormat.Feature)v10));
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v0),((com.fasterxml.jackson.databind.deser.NullValueProvider)v1),((java.lang.Boolean)v2));
    Object v4 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)0),Byte.valueOf((byte)0)};
    Object v5 = 31;
    Object v6 = 0;
    Object v7 = com.fasterxml.jackson.databind.node.BinaryNode.valueOf(((byte[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v7));
    Object v9 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v10 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v10));
    Object v12 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v3)._deserializeFromArray(((com.fasterxml.jackson.core.JsonParser)v8),((com.fasterxml.jackson.databind.DeserializationContext)v11));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v0),((com.fasterxml.jackson.databind.deser.NullValueProvider)v1),((java.lang.Boolean)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v5 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v6 = true;
    Object v7 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v4),((com.fasterxml.jackson.databind.deser.NullValueProvider)v5),((java.lang.Boolean)v6));
    Object v8 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v3).isDefaultDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v7));
    org.junit.Assert.assertEquals((Object)(true), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v0),((com.fasterxml.jackson.databind.deser.NullValueProvider)v1),((java.lang.Boolean)v2));
    Object v4 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)0),Byte.valueOf((byte)0)};
    Object v5 = 31;
    Object v6 = 0;
    Object v7 = com.fasterxml.jackson.databind.node.BinaryNode.valueOf(((byte[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v7));
    Object v9 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v10 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v13 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v12),((com.fasterxml.jackson.databind.deser.NullValueProvider)v13),((java.lang.Boolean)v14));
    Object v16 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v15));
    Object v17 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v19 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v20 = true;
    Object v21 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v18),((com.fasterxml.jackson.databind.deser.NullValueProvider)v19),((java.lang.Boolean)v20));
    Object v22 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v21));
    Object v23 = ((com.fasterxml.jackson.databind.DatabindContext)v11).constructSpecializedType(((com.fasterxml.jackson.databind.JavaType)v17),((java.lang.Class)v22));
    Object v24 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v3)._parseFloatPrimitive(((com.fasterxml.jackson.core.JsonParser)v8),((com.fasterxml.jackson.databind.DeserializationContext)v11));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v2 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v3 = true;
    Object v4 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v1),((com.fasterxml.jackson.databind.deser.NullValueProvider)v2),((java.lang.Boolean)v3));
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v5));
    Object v7 = com.fasterxml.jackson.databind.deser.std.StdDeserializer._neitherNull(((java.lang.Object)v0),((java.lang.Object)v6));
    org.junit.Assert.assertEquals((Object)(true), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v0),((com.fasterxml.jackson.databind.deser.NullValueProvider)v1),((java.lang.Boolean)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)0),Byte.valueOf((byte)0)};
    Object v8 = 31;
    Object v9 = 0;
    Object v10 = com.fasterxml.jackson.databind.node.BinaryNode.valueOf(((byte[])v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v10));
    Object v12 = com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_INT;
    Object v13 = "";
    Object v14 = ((com.fasterxml.jackson.databind.DeserializationContext)v6).wrongTokenException(((com.fasterxml.jackson.core.JsonParser)v11),((com.fasterxml.jackson.core.JsonToken)v12),((java.lang.String)v13));
    Object v15 = "";
    Object v16 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v3)._parseIntPrimitive(((com.fasterxml.jackson.databind.DeserializationContext)v6),((java.lang.String)v15));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v0),((com.fasterxml.jackson.databind.deser.NullValueProvider)v1),((java.lang.Boolean)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = "string";
    Object v8 = ((com.fasterxml.jackson.databind.DeserializationContext)v6).mappingException(((java.lang.String)v7));
    Object v9 = ",typed? ";
    Object v10 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v3)._parseFloatPrimitive(((com.fasterxml.jackson.databind.DeserializationContext)v6),((java.lang.String)v9));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v0),((com.fasterxml.jackson.databind.deser.NullValueProvider)v1),((java.lang.Boolean)v2));
    Object v4 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)0),Byte.valueOf((byte)0)};
    Object v5 = 31;
    Object v6 = 0;
    Object v7 = com.fasterxml.jackson.databind.node.BinaryNode.valueOf(((byte[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v7));
    Object v9 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v10 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v10));
    Object v12 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v3)._coerceIntegral(((com.fasterxml.jackson.core.JsonParser)v8),((com.fasterxml.jackson.databind.DeserializationContext)v11));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.core.JsonParseException");
    } catch (com.fasterxml.jackson.core.JsonParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v0),((com.fasterxml.jackson.databind.deser.NullValueProvider)v1),((java.lang.Boolean)v2));
    Object v4 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)0),Byte.valueOf((byte)0)};
    Object v5 = 31;
    Object v6 = 0;
    Object v7 = com.fasterxml.jackson.databind.node.BinaryNode.valueOf(((byte[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v7));
    Object v9 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v10 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v10));
    ((com.fasterxml.jackson.databind.DeserializationContext)v11).checkUnresolvedObjectId();
    Object v12 = null;
    ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v3)._verifyEndArrayForSingle(((com.fasterxml.jackson.core.JsonParser)v8),((com.fasterxml.jackson.databind.DeserializationContext)v11));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v0),((com.fasterxml.jackson.databind.deser.NullValueProvider)v1),((java.lang.Boolean)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v8 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v9 = true;
    Object v10 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.NullValueProvider)v8),((java.lang.Boolean)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v10));
    Object v12 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v11));
    Object v13 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v14 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v15 = true;
    Object v16 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v13),((com.fasterxml.jackson.databind.deser.NullValueProvider)v14),((java.lang.Boolean)v15));
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v16));
    Object v18 = ((com.fasterxml.jackson.databind.DatabindContext)v6).constructSpecializedType(((com.fasterxml.jackson.databind.JavaType)v12),((java.lang.Class)v17));
    Object v19 = "Internal error: unknown key type ";
    ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v3)._verifyStringForScalarCoercion(((com.fasterxml.jackson.databind.DeserializationContext)v6),((java.lang.String)v19));
    Object v20 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v0),((com.fasterxml.jackson.databind.deser.NullValueProvider)v1),((java.lang.Boolean)v2));
    Object v4 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)0),Byte.valueOf((byte)0)};
    Object v5 = 31;
    Object v6 = 0;
    Object v7 = com.fasterxml.jackson.databind.node.BinaryNode.valueOf(((byte[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v7));
    Object v9 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v10 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v10));
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v13 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v14 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v15 = true;
    Object v16 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v13),((com.fasterxml.jackson.databind.deser.NullValueProvider)v14),((java.lang.Boolean)v15));
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v16));
    Object v18 = ((com.fasterxml.jackson.databind.DeserializationContext)v11).weirdNativeValueException(((java.lang.Object)v12),((java.lang.Class)v17));
    Object v19 = com.fasterxml.jackson.databind.introspect.AnnotationCollector.emptyAnnotations();
    Object v20 = "";
    ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v3).handleUnknownProperty(((com.fasterxml.jackson.core.JsonParser)v8),((com.fasterxml.jackson.databind.DeserializationContext)v11),((java.lang.Object)v19),((java.lang.String)v20));
    Object v21 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v0),((com.fasterxml.jackson.databind.deser.NullValueProvider)v1),((java.lang.Boolean)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = true;
    Object v8 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v3)._coerceNullToken(((com.fasterxml.jackson.databind.DeserializationContext)v6),(((java.lang.Boolean)v7).booleanValue()));
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v0),((com.fasterxml.jackson.databind.deser.NullValueProvider)v1),((java.lang.Boolean)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v8 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v9 = true;
    Object v10 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.NullValueProvider)v8),((java.lang.Boolean)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v10));
    Object v12 = ((com.fasterxml.jackson.databind.DeserializationContext)v6).endOfInputException(((java.lang.Class)v11));
    Object v13 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v14 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v15 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v16 = true;
    Object v17 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v14),((com.fasterxml.jackson.databind.deser.NullValueProvider)v15),((java.lang.Boolean)v16));
    Object v18 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v17));
    Object v19 = ((java.lang.Class)v18).isEnum();
    Object v20 = com.fasterxml.jackson.annotation.JsonFormat.Feature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED;
    Object v21 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v3).findFormatFeature(((com.fasterxml.jackson.databind.DeserializationContext)v6),((com.fasterxml.jackson.databind.BeanProperty)v13),((java.lang.Class)v18),((com.fasterxml.jackson.annotation.JsonFormat.Feature)v20));
    org.junit.Assert.assertNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v1 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)0),Byte.valueOf((byte)0)};
    Object v2 = 31;
    Object v3 = 0;
    Object v4 = com.fasterxml.jackson.databind.node.BinaryNode.valueOf(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v7));
    Object v9 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v0)._parseIntPrimitive(((com.fasterxml.jackson.core.JsonParser)v5),((com.fasterxml.jackson.databind.DeserializationContext)v8));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v1 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)0),Byte.valueOf((byte)0)};
    Object v2 = 31;
    Object v3 = 0;
    Object v4 = com.fasterxml.jackson.databind.node.BinaryNode.valueOf(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v7));
    ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v0).handleMissingEndArrayForSingle(((com.fasterxml.jackson.core.JsonParser)v5),((com.fasterxml.jackson.databind.DeserializationContext)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v1 = "Unrecognized Type: ";
    Object v2 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v0)._isIntNumber(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v0),((com.fasterxml.jackson.databind.deser.NullValueProvider)v1),((java.lang.Boolean)v2));
    Object v4 = "s&tring";
    Object v5 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v3)._isNegInf(((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v0),((com.fasterxml.jackson.databind.deser.NullValueProvider)v1),((java.lang.Boolean)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = "Type-wrapped deserializer's deserializeWithType should never get called";
    Object v8 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v3)._parseDoublePrimitive(((com.fasterxml.jackson.databind.DeserializationContext)v6),((java.lang.String)v7));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v1 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v2 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v2));
    Object v4 = 0;
    Object v5 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v6 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v7 = true;
    Object v8 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v5),((com.fasterxml.jackson.databind.deser.NullValueProvider)v6),((java.lang.Boolean)v7));
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v8));
    Object v10 = "Can not deerialize Singleton container from ";
    Object v11 = ((com.fasterxml.jackson.databind.DeserializationContext)v3).weirdNumberException(((java.lang.Number)v4),((java.lang.Class)v9),((java.lang.String)v10));
    Object v12 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v13 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v14 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v15 = true;
    Object v16 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v13),((com.fasterxml.jackson.databind.deser.NullValueProvider)v14),((java.lang.Boolean)v15));
    Object v17 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v0).findConvertingContentDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v3),((com.fasterxml.jackson.databind.BeanProperty)v12),((com.fasterxml.jackson.databind.JsonDeserializer)v16));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v0),((com.fasterxml.jackson.databind.deser.NullValueProvider)v1),((java.lang.Boolean)v2));
    Object v4 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)0),Byte.valueOf((byte)0)};
    Object v5 = 31;
    Object v6 = 0;
    Object v7 = com.fasterxml.jackson.databind.node.BinaryNode.valueOf(((byte[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v7));
    Object v9 = -4;
    Object v10 = ((com.fasterxml.jackson.core.JsonParser)v8).setFeatureMask((((java.lang.Integer)v9).intValue()));
    Object v11 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v12 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v11));
    Object v13 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v12));
    Object v14 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v15 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v16 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v17 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v18 = true;
    Object v19 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v16),((com.fasterxml.jackson.databind.deser.NullValueProvider)v17),((java.lang.Boolean)v18));
    Object v20 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v19));
    Object v21 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v20));
    Object v22 = ((com.fasterxml.jackson.databind.DeserializationContext)v13).handlePrimaryContextualization(((com.fasterxml.jackson.databind.JsonDeserializer)v14),((com.fasterxml.jackson.databind.BeanProperty)v15),((com.fasterxml.jackson.databind.JavaType)v21));
    Object v23 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v3)._deserializeFromArray(((com.fasterxml.jackson.core.JsonParser)v8),((com.fasterxml.jackson.databind.DeserializationContext)v13));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v0),((com.fasterxml.jackson.databind.deser.NullValueProvider)v1),((java.lang.Boolean)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = ".";
    ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v3)._verifyStringForScalarCoercion(((com.fasterxml.jackson.databind.DeserializationContext)v6),((java.lang.String)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v0),((com.fasterxml.jackson.databind.deser.NullValueProvider)v1),((java.lang.Boolean)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonDeserializer)v3).isCachable();
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v0),((com.fasterxml.jackson.databind.deser.NullValueProvider)v1),((java.lang.Boolean)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v8 = com.fasterxml.jackson.annotation.Nulls.DEFAULT;
    Object v9 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v10 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v11 = true;
    Object v12 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v9),((com.fasterxml.jackson.databind.deser.NullValueProvider)v10),((java.lang.Boolean)v11));
    Object v13 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v3)._findNullProvider(((com.fasterxml.jackson.databind.DeserializationContext)v6),((com.fasterxml.jackson.databind.BeanProperty)v7),((com.fasterxml.jackson.annotation.Nulls)v8),((com.fasterxml.jackson.databind.JsonDeserializer)v12));
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v1 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)0),Byte.valueOf((byte)0)};
    Object v2 = 31;
    Object v3 = 0;
    Object v4 = com.fasterxml.jackson.databind.node.BinaryNode.valueOf(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v7));
    Object v9 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v0)._parseString(((com.fasterxml.jackson.core.JsonParser)v5),((com.fasterxml.jackson.databind.DeserializationContext)v8));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v0),((com.fasterxml.jackson.databind.deser.NullValueProvider)v1),((java.lang.Boolean)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = "' found (for property '";
    ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v3)._verifyNullForScalarCoercion(((com.fasterxml.jackson.databind.DeserializationContext)v6),((java.lang.String)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v0),((com.fasterxml.jackson.databind.deser.NullValueProvider)v1),((java.lang.Boolean)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = "s'et";
    ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v3)._verifyNullForPrimitiveCoercion(((com.fasterxml.jackson.databind.DeserializationContext)v6),((java.lang.String)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v0),((com.fasterxml.jackson.databind.deser.NullValueProvider)v1),((java.lang.Boolean)v2));
    Object v4 = 1;
    Object v5 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v6 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v7 = true;
    Object v8 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v5),((com.fasterxml.jackson.databind.deser.NullValueProvider)v6),((java.lang.Boolean)v7));
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer((((java.lang.Integer)v4).intValue()),((java.lang.Class)v9));
    Object v11 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v3).isDefaultKeyDeserializer(((com.fasterxml.jackson.databind.KeyDeserializer)v10));
    org.junit.Assert.assertEquals((Object)(true), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v0),((com.fasterxml.jackson.databind.deser.NullValueProvider)v1),((java.lang.Boolean)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = "<,i";
    Object v8 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v3)._parseIntPrimitive(((com.fasterxml.jackson.databind.DeserializationContext)v6),((java.lang.String)v7));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v1 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)0),Byte.valueOf((byte)0)};
    Object v2 = 31;
    Object v3 = 0;
    Object v4 = com.fasterxml.jackson.databind.node.BinaryNode.valueOf(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v7));
    Object v9 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v0)._parseShortPrimitive(((com.fasterxml.jackson.core.JsonParser)v5),((com.fasterxml.jackson.databind.DeserializationContext)v8));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v0),((com.fasterxml.jackson.databind.deser.NullValueProvider)v1),((java.lang.Boolean)v2));
    Object v4 = "";
    Object v5 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v3)._isIntNumber(((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v0),((com.fasterxml.jackson.databind.deser.NullValueProvider)v1),((java.lang.Boolean)v2));
    Object v4 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)0),Byte.valueOf((byte)0)};
    Object v5 = 31;
    Object v6 = 0;
    Object v7 = com.fasterxml.jackson.databind.node.BinaryNode.valueOf(((byte[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v7));
    Object v9 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v10 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v10));
    Object v12 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v3)._parseBooleanFromInt(((com.fasterxml.jackson.core.JsonParser)v8),((com.fasterxml.jackson.databind.DeserializationContext)v11));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v0),((com.fasterxml.jackson.databind.deser.NullValueProvider)v1),((java.lang.Boolean)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v8 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v9 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v10 = true;
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v8),((com.fasterxml.jackson.databind.deser.NullValueProvider)v9),((java.lang.Boolean)v10));
    Object v12 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v3).findConvertingContentDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v6),((com.fasterxml.jackson.databind.BeanProperty)v7),((com.fasterxml.jackson.databind.JsonDeserializer)v11));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v0),((com.fasterxml.jackson.databind.deser.NullValueProvider)v1),((java.lang.Boolean)v2));
    Object v4 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)0),Byte.valueOf((byte)0)};
    Object v5 = 31;
    Object v6 = 0;
    Object v7 = com.fasterxml.jackson.databind.node.BinaryNode.valueOf(((byte[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v7));
    Object v9 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v10 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v10));
    ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v3)._verifyEndArrayForSingle(((com.fasterxml.jackson.core.JsonParser)v8),((com.fasterxml.jackson.databind.DeserializationContext)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v0),((com.fasterxml.jackson.databind.deser.NullValueProvider)v1),((java.lang.Boolean)v2));
    Object v4 = 0;
    Object v5 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v3)._nonNullNumber(((java.lang.Number)v4));
    org.junit.Assert.assertEquals((Object)(0), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v0),((com.fasterxml.jackson.databind.deser.NullValueProvider)v1),((java.lang.Boolean)v2));
    Object v4 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)0),Byte.valueOf((byte)0)};
    Object v5 = 31;
    Object v6 = 0;
    Object v7 = com.fasterxml.jackson.databind.node.BinaryNode.valueOf(((byte[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v7));
    Object v9 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v10 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v13 = ((com.fasterxml.jackson.databind.JsonDeserializer)v3).deserialize(((com.fasterxml.jackson.core.JsonParser)v8),((com.fasterxml.jackson.databind.DeserializationContext)v11),((java.lang.Object)v12));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v0),((com.fasterxml.jackson.databind.deser.NullValueProvider)v1),((java.lang.Boolean)v2));
    Object v4 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)0),Byte.valueOf((byte)0)};
    Object v5 = 31;
    Object v6 = 0;
    Object v7 = com.fasterxml.jackson.databind.node.BinaryNode.valueOf(((byte[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v7));
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v8).nextBooleanValue();
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = "J";
    Object v14 = ((com.fasterxml.jackson.databind.DeserializationContext)v12).mappingException(((java.lang.String)v13));
    Object v15 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v3)._deserializeWrappedValue(((com.fasterxml.jackson.core.JsonParser)v8),((com.fasterxml.jackson.databind.DeserializationContext)v12));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v0),((com.fasterxml.jackson.databind.deser.NullValueProvider)v1),((java.lang.Boolean)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v8 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v9 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v10 = true;
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v8),((com.fasterxml.jackson.databind.deser.NullValueProvider)v9),((java.lang.Boolean)v10));
    Object v12 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v11));
    Object v13 = ((com.fasterxml.jackson.databind.BeanProperty)v7).getContextAnnotation(((java.lang.Class)v12));
    Object v14 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v15 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v16 = true;
    Object v17 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v14),((com.fasterxml.jackson.databind.deser.NullValueProvider)v15),((java.lang.Boolean)v16));
    Object v18 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v17));
    Object v19 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v3).findFormatOverrides(((com.fasterxml.jackson.databind.DeserializationContext)v6),((com.fasterxml.jackson.databind.BeanProperty)v7),((java.lang.Class)v18));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v1 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v2 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v2));
    Object v4 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v5 = ((com.fasterxml.jackson.databind.BeanProperty)v4).getWrapperName();
    Object v6 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v0).findContentNullStyle(((com.fasterxml.jackson.databind.DeserializationContext)v3),((com.fasterxml.jackson.databind.BeanProperty)v4));
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v0),((com.fasterxml.jackson.databind.deser.NullValueProvider)v1),((java.lang.Boolean)v2));
    Object v4 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v6 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v7 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v5),((com.fasterxml.jackson.databind.type.TypeBindings)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v9 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v10 = true;
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v8),((com.fasterxml.jackson.databind.deser.NullValueProvider)v9),((java.lang.Boolean)v10));
    Object v12 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v11));
    Object v13 = "b";
    Object v14 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v15 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v16 = true;
    Object v17 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v14),((com.fasterxml.jackson.databind.deser.NullValueProvider)v15),((java.lang.Boolean)v16));
    Object v18 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v17));
    Object v19 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v18));
    Object v20 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v7),((java.lang.Class)v12),((java.lang.String)v13),((com.fasterxml.jackson.databind.JavaType)v19));
    Object v21 = com.fasterxml.jackson.databind.deser.std.StdDeserializer._neitherNull(((java.lang.Object)v4),((java.lang.Object)v20));
    org.junit.Assert.assertEquals((Object)(true), v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v0),((com.fasterxml.jackson.databind.deser.NullValueProvider)v1),((java.lang.Boolean)v2));
    Object v4 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)0),Byte.valueOf((byte)0)};
    Object v5 = 31;
    Object v6 = 0;
    Object v7 = com.fasterxml.jackson.databind.node.BinaryNode.valueOf(((byte[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v7));
    Object v9 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v10 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v10));
    Object v12 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v3)._parseBytePrimitive(((com.fasterxml.jackson.core.JsonParser)v8),((com.fasterxml.jackson.databind.DeserializationContext)v11));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v0),((com.fasterxml.jackson.databind.deser.NullValueProvider)v1),((java.lang.Boolean)v2));
    Object v4 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)0),Byte.valueOf((byte)0)};
    Object v5 = 31;
    Object v6 = 0;
    Object v7 = com.fasterxml.jackson.databind.node.BinaryNode.valueOf(((byte[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v7));
    Object v9 = com.fasterxml.jackson.core.JsonToken.VALUE_FALSE;
    Object v10 = ((com.fasterxml.jackson.core.JsonParser)v8).hasToken(((com.fasterxml.jackson.core.JsonToken)v9));
    Object v11 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v12 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v11));
    Object v13 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v12));
    Object v14 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v3)._parseIntPrimitive(((com.fasterxml.jackson.core.JsonParser)v8),((com.fasterxml.jackson.databind.DeserializationContext)v13));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v0),((com.fasterxml.jackson.databind.deser.NullValueProvider)v1),((java.lang.Boolean)v2));
    Object v4 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)0),Byte.valueOf((byte)0)};
    Object v5 = 31;
    Object v6 = 0;
    Object v7 = com.fasterxml.jackson.databind.node.BinaryNode.valueOf(((byte[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v7));
    Object v9 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v10 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v13 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v12),((com.fasterxml.jackson.databind.deser.NullValueProvider)v13),((java.lang.Boolean)v14));
    Object v16 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v15));
    Object v17 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v19 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v20 = true;
    Object v21 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v18),((com.fasterxml.jackson.databind.deser.NullValueProvider)v19),((java.lang.Boolean)v20));
    Object v22 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v21));
    Object v23 = ((com.fasterxml.jackson.databind.DatabindContext)v11).constructSpecializedType(((com.fasterxml.jackson.databind.JavaType)v17),((java.lang.Class)v22));
    Object v24 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v3)._parseString(((com.fasterxml.jackson.core.JsonParser)v8),((com.fasterxml.jackson.databind.DeserializationContext)v11));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v0),((com.fasterxml.jackson.databind.deser.NullValueProvider)v1),((java.lang.Boolean)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = ")";
    Object v8 = new java.lang.Object[]{};
    Object v9 = ((com.fasterxml.jackson.databind.DeserializationContext)v6).mappingException(((java.lang.String)v7),((java.lang.Object[])v8));
    Object v10 = "USE_BASE_TYPE_AS_DEFAUL";
    Object v11 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v3)._parseDoublePrimitive(((com.fasterxml.jackson.databind.DeserializationContext)v6),((java.lang.String)v10));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v0),((com.fasterxml.jackson.databind.deser.NullValueProvider)v1),((java.lang.Boolean)v2));
    Object v4 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v3)._coercedTypeDesc();
    org.junit.Assert.assertEquals((Object)("as content of type `java.lang.String[]`"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v1 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v2 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v2));
    Object v4 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v5 = com.fasterxml.jackson.annotation.Nulls.DEFAULT;
    Object v6 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v7 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v8 = true;
    Object v9 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v6),((com.fasterxml.jackson.databind.deser.NullValueProvider)v7),((java.lang.Boolean)v8));
    Object v10 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v0)._findNullProvider(((com.fasterxml.jackson.databind.DeserializationContext)v3),((com.fasterxml.jackson.databind.BeanProperty)v4),((com.fasterxml.jackson.annotation.Nulls)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v9));
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v0),((com.fasterxml.jackson.databind.deser.NullValueProvider)v1),((java.lang.Boolean)v2));
    Object v4 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)0),Byte.valueOf((byte)0)};
    Object v5 = 31;
    Object v6 = 0;
    Object v7 = com.fasterxml.jackson.databind.node.BinaryNode.valueOf(((byte[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v7));
    Object v9 = 12;
    Object v10 = -14;
    Object v11 = ((com.fasterxml.jackson.core.JsonParser)v8).overrideStdFeatures((((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v13 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v12));
    Object v14 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v16 = "]";
    ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v3).handleUnknownProperty(((com.fasterxml.jackson.core.JsonParser)v8),((com.fasterxml.jackson.databind.DeserializationContext)v14),((java.lang.Object)v15),((java.lang.String)v16));
    Object v17 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v0),((com.fasterxml.jackson.databind.deser.NullValueProvider)v1),((java.lang.Boolean)v2));
    Object v4 = ", ncew = ";
    Object v5 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v3)._isIntNumber(((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v0),((com.fasterxml.jackson.databind.deser.NullValueProvider)v1),((java.lang.Boolean)v2));
    Object v4 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)0),Byte.valueOf((byte)0)};
    Object v5 = 31;
    Object v6 = 0;
    Object v7 = com.fasterxml.jackson.databind.node.BinaryNode.valueOf(((byte[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v7));
    Object v9 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v10 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v13 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v12),((com.fasterxml.jackson.databind.deser.NullValueProvider)v13),((java.lang.Boolean)v14));
    Object v16 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v15));
    Object v17 = com.fasterxml.jackson.core.JsonToken.START_OBJECT;
    Object v18 = ((com.fasterxml.jackson.databind.DeserializationContext)v11).mappingException(((java.lang.Class)v16),((com.fasterxml.jackson.core.JsonToken)v17));
    Object v19 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v3)._parseShortPrimitive(((com.fasterxml.jackson.core.JsonParser)v8),((com.fasterxml.jackson.databind.DeserializationContext)v11));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v0),((com.fasterxml.jackson.databind.deser.NullValueProvider)v1),((java.lang.Boolean)v2));
    Object v4 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)0),Byte.valueOf((byte)0)};
    Object v5 = 31;
    Object v6 = 0;
    Object v7 = com.fasterxml.jackson.databind.node.BinaryNode.valueOf(((byte[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v7));
    Object v9 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v10 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v13 = ((com.fasterxml.jackson.databind.JsonDeserializer)v3).deserialize(((com.fasterxml.jackson.core.JsonParser)v8),((com.fasterxml.jackson.databind.DeserializationContext)v11),((java.lang.Object)v12));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v1 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)0),Byte.valueOf((byte)0)};
    Object v2 = 31;
    Object v3 = 0;
    Object v4 = com.fasterxml.jackson.databind.node.BinaryNode.valueOf(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v7));
    Object v9 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).deserialize(((com.fasterxml.jackson.core.JsonParser)v5),((com.fasterxml.jackson.databind.DeserializationContext)v8));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v0),((com.fasterxml.jackson.databind.deser.NullValueProvider)v1),((java.lang.Boolean)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v8 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v9 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v10 = true;
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v8),((com.fasterxml.jackson.databind.deser.NullValueProvider)v9),((java.lang.Boolean)v10));
    Object v12 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v3).findContentNullProvider(((com.fasterxml.jackson.databind.DeserializationContext)v6),((com.fasterxml.jackson.databind.BeanProperty)v7),((com.fasterxml.jackson.databind.JsonDeserializer)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v0),((com.fasterxml.jackson.databind.deser.NullValueProvider)v1),((java.lang.Boolean)v2));
    Object v4 = "I";
    Object v5 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v3)._isPosInf(((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v0),((com.fasterxml.jackson.databind.deser.NullValueProvider)v1),((java.lang.Boolean)v2));
    Object v4 = "Subtype of BeanSerializerFactory (";
    Object v5 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v3)._isPosInf(((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v0),((com.fasterxml.jackson.databind.deser.NullValueProvider)v1),((java.lang.Boolean)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v8 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v9 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v10 = true;
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v8),((com.fasterxml.jackson.databind.deser.NullValueProvider)v9),((java.lang.Boolean)v10));
    Object v12 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v3).findContentNullProvider(((com.fasterxml.jackson.databind.DeserializationContext)v6),((com.fasterxml.jackson.databind.BeanProperty)v7),((com.fasterxml.jackson.databind.JsonDeserializer)v11));
    Object v13 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)0),Byte.valueOf((byte)0)};
    Object v14 = 31;
    Object v15 = 0;
    Object v16 = com.fasterxml.jackson.databind.node.BinaryNode.valueOf(((byte[])v13),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v16));
    Object v18 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v19 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v18));
    Object v20 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v19));
    Object v21 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v12)._parseShortPrimitive(((com.fasterxml.jackson.core.JsonParser)v17),((com.fasterxml.jackson.databind.DeserializationContext)v20));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v0),((com.fasterxml.jackson.databind.deser.NullValueProvider)v1),((java.lang.Boolean)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v8 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v9 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v10 = true;
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v8),((com.fasterxml.jackson.databind.deser.NullValueProvider)v9),((java.lang.Boolean)v10));
    Object v12 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v3).findContentNullProvider(((com.fasterxml.jackson.databind.DeserializationContext)v6),((com.fasterxml.jackson.databind.BeanProperty)v7),((com.fasterxml.jackson.databind.JsonDeserializer)v11));
    Object v13 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)0),Byte.valueOf((byte)0)};
    Object v14 = 31;
    Object v15 = 0;
    Object v16 = com.fasterxml.jackson.databind.node.BinaryNode.valueOf(((byte[])v13),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v16));
    Object v18 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v19 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v18));
    Object v20 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v19));
    Object v21 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v12)._parseLongPrimitive(((com.fasterxml.jackson.core.JsonParser)v17),((com.fasterxml.jackson.databind.DeserializationContext)v20));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v0),((com.fasterxml.jackson.databind.deser.NullValueProvider)v1),((java.lang.Boolean)v2));
    Object v4 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)0),Byte.valueOf((byte)0)};
    Object v5 = 31;
    Object v6 = 0;
    Object v7 = com.fasterxml.jackson.databind.node.BinaryNode.valueOf(((byte[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v7));
    ((com.fasterxml.jackson.core.JsonParser)v8).clearCurrentToken();
    Object v9 = null;
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v3)._parseFloatPrimitive(((com.fasterxml.jackson.core.JsonParser)v8),((com.fasterxml.jackson.databind.DeserializationContext)v12));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v0),((com.fasterxml.jackson.databind.deser.NullValueProvider)v1),((java.lang.Boolean)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = "strng";
    Object v8 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v9 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v10 = true;
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v8),((com.fasterxml.jackson.databind.deser.NullValueProvider)v9),((java.lang.Boolean)v10));
    Object v12 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v11));
    Object v13 = "[%us; id-to-type=%s]";
    Object v14 = ((com.fasterxml.jackson.databind.DeserializationContext)v6).weirdStringException(((java.lang.String)v7),((java.lang.Class)v12),((java.lang.String)v13));
    Object v15 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)0),Byte.valueOf((byte)0)};
    Object v16 = 31;
    Object v17 = 0;
    Object v18 = com.fasterxml.jackson.databind.node.BinaryNode.valueOf(((byte[])v15),(((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()));
    Object v19 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v18));
    ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v3)._verifyNumberForScalarCoercion(((com.fasterxml.jackson.databind.DeserializationContext)v6),((com.fasterxml.jackson.core.JsonParser)v19));
    Object v20 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.introspect.AnnotationCollector.emptyAnnotations();
    Object v1 = com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.noTypeInfoBuilder();
    Object v2 = com.fasterxml.jackson.databind.deser.std.StdDeserializer._neitherNull(((java.lang.Object)v0),((java.lang.Object)v1));
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v0),((com.fasterxml.jackson.databind.deser.NullValueProvider)v1),((java.lang.Boolean)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = "";
    ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v3)._verifyStringForScalarCoercion(((com.fasterxml.jackson.databind.DeserializationContext)v6),((java.lang.String)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v0),((com.fasterxml.jackson.databind.deser.NullValueProvider)v1),((java.lang.Boolean)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v8 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v9 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v10 = true;
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v8),((com.fasterxml.jackson.databind.deser.NullValueProvider)v9),((java.lang.Boolean)v10));
    Object v12 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v3).findContentNullProvider(((com.fasterxml.jackson.databind.DeserializationContext)v6),((com.fasterxml.jackson.databind.BeanProperty)v7),((com.fasterxml.jackson.databind.JsonDeserializer)v11));
    Object v13 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v14 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v14));
    Object v16 = "Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingArrayDelegate()', but null for 'getArrayDelegateType()'";
    Object v17 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v12)._parseIntPrimitive(((com.fasterxml.jackson.databind.DeserializationContext)v15),((java.lang.String)v16));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v0),((com.fasterxml.jackson.databind.deser.NullValueProvider)v1),((java.lang.Boolean)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = ((com.fasterxml.jackson.databind.DeserializationContext)v6).leaseObjectBuffer();
    Object v8 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v9 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v10 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v11 = true;
    Object v12 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v9),((com.fasterxml.jackson.databind.deser.NullValueProvider)v10),((java.lang.Boolean)v11));
    Object v13 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v14 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v14));
    Object v16 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v17 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v18 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v19 = true;
    Object v20 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v17),((com.fasterxml.jackson.databind.deser.NullValueProvider)v18),((java.lang.Boolean)v19));
    Object v21 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v12).findContentNullProvider(((com.fasterxml.jackson.databind.DeserializationContext)v15),((com.fasterxml.jackson.databind.BeanProperty)v16),((com.fasterxml.jackson.databind.JsonDeserializer)v20));
    Object v22 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v3).findConvertingContentDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v6),((com.fasterxml.jackson.databind.BeanProperty)v8),((com.fasterxml.jackson.databind.JsonDeserializer)v21));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v0),((com.fasterxml.jackson.databind.deser.NullValueProvider)v1),((java.lang.Boolean)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v8 = com.fasterxml.jackson.annotation.Nulls.FAIL;
    Object v9 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v10 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v11 = true;
    Object v12 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v9),((com.fasterxml.jackson.databind.deser.NullValueProvider)v10),((java.lang.Boolean)v11));
    Object v13 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v3)._findNullProvider(((com.fasterxml.jackson.databind.DeserializationContext)v6),((com.fasterxml.jackson.databind.BeanProperty)v7),((com.fasterxml.jackson.annotation.Nulls)v8),((com.fasterxml.jackson.databind.JsonDeserializer)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v0),((com.fasterxml.jackson.databind.deser.NullValueProvider)v1),((java.lang.Boolean)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v8 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v9 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v10 = true;
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v8),((com.fasterxml.jackson.databind.deser.NullValueProvider)v9),((java.lang.Boolean)v10));
    Object v12 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v3).findContentNullProvider(((com.fasterxml.jackson.databind.DeserializationContext)v6),((com.fasterxml.jackson.databind.BeanProperty)v7),((com.fasterxml.jackson.databind.JsonDeserializer)v11));
    Object v13 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)0),Byte.valueOf((byte)0)};
    Object v14 = 31;
    Object v15 = 0;
    Object v16 = com.fasterxml.jackson.databind.node.BinaryNode.valueOf(((byte[])v13),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v16));
    Object v18 = ((com.fasterxml.jackson.core.JsonParser)v17).getTextOffset();
    Object v19 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v20 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v19));
    Object v21 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v20));
    Object v22 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v23 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v24 = true;
    Object v25 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v22),((com.fasterxml.jackson.databind.deser.NullValueProvider)v23),((java.lang.Boolean)v24));
    Object v26 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v25));
    Object v27 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v26));
    Object v28 = "";
    Object v29 = "";
    Object v30 = ((com.fasterxml.jackson.databind.DeserializationContext)v21).invalidTypeIdException(((com.fasterxml.jackson.databind.JavaType)v27),((java.lang.String)v28),((java.lang.String)v29));
    Object v31 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v12)._parseDoublePrimitive(((com.fasterxml.jackson.core.JsonParser)v17),((com.fasterxml.jackson.databind.DeserializationContext)v21));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v0),((com.fasterxml.jackson.databind.deser.NullValueProvider)v1),((java.lang.Boolean)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = "strin";
    ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v3)._verifyNullForPrimitiveCoercion(((com.fasterxml.jackson.databind.DeserializationContext)v6),((java.lang.String)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v1 = 2L;
    Object v2 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v0)._intOverflow((((java.lang.Long)v1).longValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v0),((com.fasterxml.jackson.databind.deser.NullValueProvider)v1),((java.lang.Boolean)v2));
    Object v4 = "overflow#, value cannot be represented as 8-bit value";
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6));
    Object v8 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v3)._parseDate(((java.lang.String)v4),((com.fasterxml.jackson.databind.DeserializationContext)v7));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v0),((com.fasterxml.jackson.databind.deser.NullValueProvider)v1),((java.lang.Boolean)v2));
    Object v4 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)0),Byte.valueOf((byte)0)};
    Object v5 = 31;
    Object v6 = 0;
    Object v7 = com.fasterxml.jackson.databind.node.BinaryNode.valueOf(((byte[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v7));
    Object v9 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v10 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v10));
    Object v12 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v3)._deserializeFromEmpty(((com.fasterxml.jackson.core.JsonParser)v8),((com.fasterxml.jackson.databind.DeserializationContext)v11));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v0),((com.fasterxml.jackson.databind.deser.NullValueProvider)v1),((java.lang.Boolean)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonDeserializer)v3).getKnownPropertyNames();
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v0),((com.fasterxml.jackson.databind.deser.NullValueProvider)v1),((java.lang.Boolean)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = ((com.fasterxml.jackson.databind.JsonDeserializer)v3).getNullValue(((com.fasterxml.jackson.databind.DeserializationContext)v6));
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v0),((com.fasterxml.jackson.databind.deser.NullValueProvider)v1),((java.lang.Boolean)v2));
    Object v4 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)0),Byte.valueOf((byte)0)};
    Object v5 = 31;
    Object v6 = 0;
    Object v7 = com.fasterxml.jackson.databind.node.BinaryNode.valueOf(((byte[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v7));
    Object v9 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v10 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v10));
    Object v12 = true;
    Object v13 = "]";
    Object v14 = -23;
    Object v15 = " (expected type: ";
    Object v16 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v12).booleanValue()),((java.lang.String)v13),((java.lang.Integer)v14),((java.lang.String)v15));
    Object v17 = ((com.fasterxml.jackson.databind.JsonDeserializer)v3).deserialize(((com.fasterxml.jackson.core.JsonParser)v8),((com.fasterxml.jackson.databind.DeserializationContext)v11),((java.lang.Object)v16));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v0),((com.fasterxml.jackson.databind.deser.NullValueProvider)v1),((java.lang.Boolean)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v8 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v9 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v10 = true;
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v8),((com.fasterxml.jackson.databind.deser.NullValueProvider)v9),((java.lang.Boolean)v10));
    Object v12 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v3).findContentNullProvider(((com.fasterxml.jackson.databind.DeserializationContext)v6),((com.fasterxml.jackson.databind.BeanProperty)v7),((com.fasterxml.jackson.databind.JsonDeserializer)v11));
    Object v13 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)0),Byte.valueOf((byte)0)};
    Object v14 = 31;
    Object v15 = 0;
    Object v16 = com.fasterxml.jackson.databind.node.BinaryNode.valueOf(((byte[])v13),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v16));
    Object v18 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v19 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v18));
    Object v20 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v19));
    Object v21 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v12)._deserializeWrappedValue(((com.fasterxml.jackson.core.JsonParser)v17),((com.fasterxml.jackson.databind.DeserializationContext)v20));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v0),((com.fasterxml.jackson.databind.deser.NullValueProvider)v1),((java.lang.Boolean)v2));
    Object v4 = 1;
    Object v5 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v3)._byteOverflow((((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v0),((com.fasterxml.jackson.databind.deser.NullValueProvider)v1),((java.lang.Boolean)v2));
    Object v4 = "fa;lse";
    Object v5 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v3)._isNegInf(((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v1 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v2 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v2));
    Object v4 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v5 = ((com.fasterxml.jackson.databind.BeanProperty)v4).isVirtual();
    Object v6 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v0).findContentNullStyle(((com.fasterxml.jackson.databind.DeserializationContext)v3),((com.fasterxml.jackson.databind.BeanProperty)v4));
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v0),((com.fasterxml.jackson.databind.deser.NullValueProvider)v1),((java.lang.Boolean)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v8 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v9 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v10 = true;
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v8),((com.fasterxml.jackson.databind.deser.NullValueProvider)v9),((java.lang.Boolean)v10));
    Object v12 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v3).findContentNullProvider(((com.fasterxml.jackson.databind.DeserializationContext)v6),((com.fasterxml.jackson.databind.BeanProperty)v7),((com.fasterxml.jackson.databind.JsonDeserializer)v11));
    Object v13 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)0),Byte.valueOf((byte)0)};
    Object v14 = 31;
    Object v15 = 0;
    Object v16 = com.fasterxml.jackson.databind.node.BinaryNode.valueOf(((byte[])v13),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v16));
    Object v18 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v19 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v18));
    Object v20 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v19));
    Object v21 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v22 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v23 = true;
    Object v24 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v21),((com.fasterxml.jackson.databind.deser.NullValueProvider)v22),((java.lang.Boolean)v23));
    Object v25 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v24));
    Object v26 = ")";
    ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v12).handleUnknownProperty(((com.fasterxml.jackson.core.JsonParser)v17),((com.fasterxml.jackson.databind.DeserializationContext)v20),((java.lang.Object)v25),((java.lang.String)v26));
    Object v27 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v1 = -6;
    Object v2 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v0)._shortOverflow((((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v0),((com.fasterxml.jackson.databind.deser.NullValueProvider)v1),((java.lang.Boolean)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v8 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v9 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v10 = true;
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v8),((com.fasterxml.jackson.databind.deser.NullValueProvider)v9),((java.lang.Boolean)v10));
    Object v12 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v3).findContentNullProvider(((com.fasterxml.jackson.databind.DeserializationContext)v6),((com.fasterxml.jackson.databind.BeanProperty)v7),((com.fasterxml.jackson.databind.JsonDeserializer)v11));
    Object v13 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)0),Byte.valueOf((byte)0)};
    Object v14 = 31;
    Object v15 = 0;
    Object v16 = com.fasterxml.jackson.databind.node.BinaryNode.valueOf(((byte[])v13),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v16));
    Object v18 = ((com.fasterxml.jackson.core.JsonParser)v17).currentToken();
    Object v19 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v20 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v19));
    Object v21 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v20));
    Object v22 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v12)._parseDateFromArray(((com.fasterxml.jackson.core.JsonParser)v17),((com.fasterxml.jackson.databind.DeserializationContext)v21));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v0),((com.fasterxml.jackson.databind.deser.NullValueProvider)v1),((java.lang.Boolean)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v8 = com.fasterxml.jackson.annotation.Nulls.SET;
    Object v9 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v10 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v11 = true;
    Object v12 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v9),((com.fasterxml.jackson.databind.deser.NullValueProvider)v10),((java.lang.Boolean)v11));
    Object v13 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v3)._findNullProvider(((com.fasterxml.jackson.databind.DeserializationContext)v6),((com.fasterxml.jackson.databind.BeanProperty)v7),((com.fasterxml.jackson.annotation.Nulls)v8),((com.fasterxml.jackson.databind.JsonDeserializer)v12));
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v2 = true;
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v0),((com.fasterxml.jackson.databind.deser.NullValueProvider)v1),((java.lang.Boolean)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v8 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v9 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v10 = true;
    Object v11 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v8),((com.fasterxml.jackson.databind.deser.NullValueProvider)v9),((java.lang.Boolean)v10));
    Object v12 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v3).findContentNullProvider(((com.fasterxml.jackson.databind.DeserializationContext)v6),((com.fasterxml.jackson.databind.BeanProperty)v7),((com.fasterxml.jackson.databind.JsonDeserializer)v11));
    Object v13 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v14 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v14));
    Object v16 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v17 = ((com.fasterxml.jackson.databind.BeanProperty)v16).getType();
    Object v18 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v19 = new com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.BooleanDeser();
    Object v20 = true;
    Object v21 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v18),((com.fasterxml.jackson.databind.deser.NullValueProvider)v19),((java.lang.Boolean)v20));
    Object v22 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v21));
    Object v23 = com.fasterxml.jackson.annotation.JsonFormat.Feature.ADJUST_DATES_TO_CONTEXT_TIME_ZONE;
    Object v24 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v12).findFormatFeature(((com.fasterxml.jackson.databind.DeserializationContext)v15),((com.fasterxml.jackson.databind.BeanProperty)v16),((java.lang.Class)v22),((com.fasterxml.jackson.annotation.JsonFormat.Feature)v23));
    org.junit.Assert.assertNull(v24);
  }
}
