package com.fasterxml.jackson.databind.deser.impl;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = true;
    Object v6 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = true;
    Object v10 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v6),((java.lang.Object)v8),((java.lang.Object)v10));
    Object v12 = new com.fasterxml.jackson.databind.node.ArrayNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v2),((java.util.List)v11));
    Object v13 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v14 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v12),((com.fasterxml.jackson.core.ObjectCodec)v13));
    Object v15 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v16 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v15));
    Object v17 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v16));
    Object v18 = 1;
    Object v19 = "]";
    Object v20 = ((com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler)v0)._deserialize(((com.fasterxml.jackson.core.JsonParser)v14),((com.fasterxml.jackson.databind.DeserializationContext)v17),(((java.lang.Integer)v18).intValue()),((java.lang.String)v19));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler(((com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler)v0));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = "string";
    Object v1 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v0));
    Object v2 = java.util.EnumSet.of(((java.lang.Enum)v1));
    Object v3 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v2));
    Object v4 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v3));
    Object v5 = com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.builder(((com.fasterxml.jackson.databind.JavaType)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = true;
    Object v6 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = true;
    Object v10 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v6),((java.lang.Object)v8),((java.lang.Object)v10));
    Object v12 = new com.fasterxml.jackson.databind.node.ArrayNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v2),((java.util.List)v11));
    Object v13 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v14 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v12),((com.fasterxml.jackson.core.ObjectCodec)v13));
    Object v15 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v16 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v15));
    Object v17 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v16));
    Object v18 = 0;
    Object v19 = "$";
    Object v20 = ((com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler)v0)._deserialize(((com.fasterxml.jackson.core.JsonParser)v14),((com.fasterxml.jackson.databind.DeserializationContext)v17),(((java.lang.Integer)v18).intValue()),((java.lang.String)v19));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = true;
    Object v6 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = true;
    Object v10 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v6),((java.lang.Object)v8),((java.lang.Object)v10));
    Object v12 = new com.fasterxml.jackson.databind.node.ArrayNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v2),((java.util.List)v11));
    Object v13 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v14 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v12),((com.fasterxml.jackson.core.ObjectCodec)v13));
    Object v15 = ((com.fasterxml.jackson.core.JsonParser)v14).getCurrentName();
    Object v16 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v17 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v17));
    Object v19 = "&)";
    Object v20 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v21 = ((com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler)v0).handlePropertyValue(((com.fasterxml.jackson.core.JsonParser)v14),((com.fasterxml.jackson.databind.DeserializationContext)v18),((java.lang.String)v19),((java.lang.Object)v20));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = true;
    Object v6 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = true;
    Object v10 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v6),((java.lang.Object)v8),((java.lang.Object)v10));
    Object v12 = new com.fasterxml.jackson.databind.node.ArrayNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v2),((java.util.List)v11));
    Object v13 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v14 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v12),((com.fasterxml.jackson.core.ObjectCodec)v13));
    Object v15 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v16 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v15));
    Object v17 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v16));
    Object v18 = "string";
    Object v19 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v18));
    Object v20 = java.util.EnumSet.of(((java.lang.Enum)v19));
    Object v21 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v20));
    Object v22 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v21));
    Object v23 = "]";
    Object v24 = ((com.fasterxml.jackson.databind.DeserializationContext)v17).missingTypeIdException(((com.fasterxml.jackson.databind.JavaType)v22),((java.lang.String)v23));
    Object v25 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v26 = ((com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler)v0).complete(((com.fasterxml.jackson.core.JsonParser)v14),((com.fasterxml.jackson.databind.DeserializationContext)v17),((java.lang.Object)v25));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = true;
    Object v6 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = true;
    Object v10 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v6),((java.lang.Object)v8),((java.lang.Object)v10));
    Object v12 = new com.fasterxml.jackson.databind.node.ArrayNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v2),((java.util.List)v11));
    Object v13 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v14 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v12),((com.fasterxml.jackson.core.ObjectCodec)v13));
    Object v15 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v16 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v15));
    Object v17 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v16));
    Object v18 = com.fasterxml.jackson.databind.introspect.AnnotationCollector.emptyAnnotations();
    Object v19 = 0;
    Object v20 = "idType ca;nnot be null";
    ((com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler)v0)._deserializeAndSet(((com.fasterxml.jackson.core.JsonParser)v14),((com.fasterxml.jackson.databind.DeserializationContext)v17),((java.lang.Object)v18),(((java.lang.Integer)v19).intValue()),((java.lang.String)v20));
    Object v21 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = true;
    Object v6 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = true;
    Object v10 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v6),((java.lang.Object)v8),((java.lang.Object)v10));
    Object v12 = new com.fasterxml.jackson.databind.node.ArrayNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v2),((java.util.List)v11));
    Object v13 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v14 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v12),((com.fasterxml.jackson.core.ObjectCodec)v13));
    Object v15 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v16 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v15));
    Object v17 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v16));
    ((com.fasterxml.jackson.databind.DeserializationContext)v17).checkUnresolvedObjectId();
    Object v18 = null;
    Object v19 = 0;
    Object v20 = "";
    Object v21 = ((com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler)v0)._deserialize(((com.fasterxml.jackson.core.JsonParser)v14),((com.fasterxml.jackson.databind.DeserializationContext)v17),(((java.lang.Integer)v19).intValue()),((java.lang.String)v20));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = true;
    Object v6 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = true;
    Object v10 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v6),((java.lang.Object)v8),((java.lang.Object)v10));
    Object v12 = new com.fasterxml.jackson.databind.node.ArrayNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v2),((java.util.List)v11));
    Object v13 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v14 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v12),((com.fasterxml.jackson.core.ObjectCodec)v13));
    Object v15 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v16 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v15));
    Object v17 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v16));
    Object v18 = "string";
    Object v19 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v18));
    Object v20 = ((com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler)v0).complete(((com.fasterxml.jackson.core.JsonParser)v14),((com.fasterxml.jackson.databind.DeserializationContext)v17),((java.lang.Object)v19));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = true;
    Object v6 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = true;
    Object v10 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v6),((java.lang.Object)v8),((java.lang.Object)v10));
    Object v12 = new com.fasterxml.jackson.databind.node.ArrayNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v2),((java.util.List)v11));
    Object v13 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v14 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v12),((com.fasterxml.jackson.core.ObjectCodec)v13));
    Object v15 = ((com.fasterxml.jackson.core.JsonParser)v14).getCurrentLocation();
    Object v16 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v17 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v17));
    Object v19 = "Internal error: unknown key type ";
    Object v20 = com.fasterxml.jackson.databind.introspect.AnnotationCollector.emptyAnnotations();
    Object v21 = ((com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler)v0).handlePropertyValue(((com.fasterxml.jackson.core.JsonParser)v14),((com.fasterxml.jackson.databind.DeserializationContext)v18),((java.lang.String)v19),((java.lang.Object)v20));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = true;
    Object v6 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = true;
    Object v10 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v6),((java.lang.Object)v8),((java.lang.Object)v10));
    Object v12 = new com.fasterxml.jackson.databind.node.ArrayNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v2),((java.util.List)v11));
    Object v13 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v14 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v12),((com.fasterxml.jackson.core.ObjectCodec)v13));
    Object v15 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v16 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v15));
    Object v17 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v16));
    Object v18 = ((com.fasterxml.jackson.databind.DeserializationContext)v17).leaseObjectBuffer();
    Object v19 = 0;
    Object v20 = "]";
    Object v21 = ((com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler)v0)._deserialize(((com.fasterxml.jackson.core.JsonParser)v14),((com.fasterxml.jackson.databind.DeserializationContext)v17),(((java.lang.Integer)v19).intValue()),((java.lang.String)v20));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = true;
    Object v6 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = true;
    Object v10 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v6),((java.lang.Object)v8),((java.lang.Object)v10));
    Object v12 = new com.fasterxml.jackson.databind.node.ArrayNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v2),((java.util.List)v11));
    Object v13 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v14 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v12),((com.fasterxml.jackson.core.ObjectCodec)v13));
    Object v15 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v16 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v15));
    Object v17 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v16));
    Object v18 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v19 = ((com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler)v0).complete(((com.fasterxml.jackson.core.JsonParser)v14),((com.fasterxml.jackson.databind.DeserializationContext)v17),((java.lang.Object)v18));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = true;
    Object v6 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = true;
    Object v10 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v6),((java.lang.Object)v8),((java.lang.Object)v10));
    Object v12 = new com.fasterxml.jackson.databind.node.ArrayNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v2),((java.util.List)v11));
    Object v13 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v14 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v12),((com.fasterxml.jackson.core.ObjectCodec)v13));
    Object v15 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v16 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v15));
    Object v17 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v16));
    Object v18 = true;
    Object v19 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v18).booleanValue()));
    Object v20 = -26;
    Object v21 = "";
    ((com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler)v0)._deserializeAndSet(((com.fasterxml.jackson.core.JsonParser)v14),((com.fasterxml.jackson.databind.DeserializationContext)v17),((java.lang.Object)v19),(((java.lang.Integer)v20).intValue()),((java.lang.String)v21));
    Object v22 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = true;
    Object v6 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = true;
    Object v10 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v6),((java.lang.Object)v8),((java.lang.Object)v10));
    Object v12 = new com.fasterxml.jackson.databind.node.ArrayNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v2),((java.util.List)v11));
    Object v13 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v14 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v12),((com.fasterxml.jackson.core.ObjectCodec)v13));
    Object v15 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v16 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v15));
    Object v17 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v16));
    Object v18 = true;
    Object v19 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v18).booleanValue()));
    Object v20 = true;
    Object v21 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v20).booleanValue()));
    Object v22 = true;
    Object v23 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v22).booleanValue()));
    Object v24 = true;
    Object v25 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v24).booleanValue()));
    Object v26 = true;
    Object v27 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v26).booleanValue()));
    Object v28 = java.util.List.of(((java.lang.Object)v21),((java.lang.Object)v23),((java.lang.Object)v25),((java.lang.Object)v27));
    Object v29 = new com.fasterxml.jackson.databind.node.ArrayNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v19),((java.util.List)v28));
    Object v30 = 23;
    Object v31 = "@";
    ((com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler)v0)._deserializeAndSet(((com.fasterxml.jackson.core.JsonParser)v14),((com.fasterxml.jackson.databind.DeserializationContext)v17),((java.lang.Object)v29),(((java.lang.Integer)v30).intValue()),((java.lang.String)v31));
    Object v32 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = "string";
    Object v1 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v0));
    Object v2 = java.util.EnumSet.of(((java.lang.Enum)v1));
    Object v3 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v2));
    Object v4 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v3));
    Object v5 = ((com.fasterxml.jackson.databind.JavaType)v4).toString();
    Object v6 = com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.builder(((com.fasterxml.jackson.databind.JavaType)v4));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = "string";
    Object v1 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v0));
    Object v2 = java.util.EnumSet.of(((java.lang.Enum)v1));
    Object v3 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v2));
    Object v4 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v3));
    Object v5 = ((com.fasterxml.jackson.databind.JavaType)v4).isPrimitive();
    Object v6 = com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.builder(((com.fasterxml.jackson.databind.JavaType)v4));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ((com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler)v0).start();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = true;
    Object v6 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = true;
    Object v10 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v6),((java.lang.Object)v8),((java.lang.Object)v10));
    Object v12 = new com.fasterxml.jackson.databind.node.ArrayNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v2),((java.util.List)v11));
    Object v13 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v14 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v12),((com.fasterxml.jackson.core.ObjectCodec)v13));
    Object v15 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v16 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v15));
    Object v17 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v16));
    Object v18 = "";
    Object v19 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v20 = ((com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler)v0).handleTypePropertyValue(((com.fasterxml.jackson.core.JsonParser)v14),((com.fasterxml.jackson.databind.DeserializationContext)v17),((java.lang.String)v18),((java.lang.Object)v19));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = true;
    Object v6 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = true;
    Object v10 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v6),((java.lang.Object)v8),((java.lang.Object)v10));
    Object v12 = new com.fasterxml.jackson.databind.node.ArrayNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v2),((java.util.List)v11));
    Object v13 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v14 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v12),((com.fasterxml.jackson.core.ObjectCodec)v13));
    Object v15 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v16 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v15));
    Object v17 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v16));
    Object v18 = 1;
    Object v19 = "2";
    Object v20 = ((com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler)v0)._deserialize(((com.fasterxml.jackson.core.JsonParser)v14),((com.fasterxml.jackson.databind.DeserializationContext)v17),(((java.lang.Integer)v18).intValue()),((java.lang.String)v19));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = true;
    Object v6 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = true;
    Object v10 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v6),((java.lang.Object)v8),((java.lang.Object)v10));
    Object v12 = new com.fasterxml.jackson.databind.node.ArrayNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v2),((java.util.List)v11));
    Object v13 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v14 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v12),((com.fasterxml.jackson.core.ObjectCodec)v13));
    Object v15 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v16 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v15));
    Object v17 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v16));
    Object v18 = true;
    Object v19 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v18).booleanValue()));
    Object v20 = -37;
    Object v21 = "n, ";
    ((com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler)v0)._deserializeAndSet(((com.fasterxml.jackson.core.JsonParser)v14),((com.fasterxml.jackson.databind.DeserializationContext)v17),((java.lang.Object)v19),(((java.lang.Integer)v20).intValue()),((java.lang.String)v21));
    Object v22 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = "string";
    Object v1 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v0));
    Object v2 = java.util.EnumSet.of(((java.lang.Enum)v1));
    Object v3 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v2));
    Object v4 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v3));
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = java.util.EnumSet.of(((java.lang.Enum)v6));
    Object v8 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v7));
    Object v9 = ((com.fasterxml.jackson.databind.JavaType)v4).forcedNarrowBy(((java.lang.Class)v8));
    Object v10 = com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.builder(((com.fasterxml.jackson.databind.JavaType)v4));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = true;
    Object v6 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = true;
    Object v10 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v6),((java.lang.Object)v8),((java.lang.Object)v10));
    Object v12 = new com.fasterxml.jackson.databind.node.ArrayNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v2),((java.util.List)v11));
    Object v13 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v14 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v12),((com.fasterxml.jackson.core.ObjectCodec)v13));
    Object v15 = ((com.fasterxml.jackson.core.JsonParser)v14).getCurrentTokenId();
    Object v16 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v17 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v17));
    Object v19 = true;
    Object v20 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v19).booleanValue()));
    Object v21 = true;
    Object v22 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v21).booleanValue()));
    Object v23 = true;
    Object v24 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v23).booleanValue()));
    Object v25 = true;
    Object v26 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v25).booleanValue()));
    Object v27 = java.util.List.of(((java.lang.Object)v20),((java.lang.Object)v22),((java.lang.Object)v24),((java.lang.Object)v26));
    Object v28 = ((com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler)v0).complete(((com.fasterxml.jackson.core.JsonParser)v14),((com.fasterxml.jackson.databind.DeserializationContext)v18),((java.lang.Object)v27));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = true;
    Object v6 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = true;
    Object v10 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v6),((java.lang.Object)v8),((java.lang.Object)v10));
    Object v12 = new com.fasterxml.jackson.databind.node.ArrayNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v2),((java.util.List)v11));
    Object v13 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v14 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v12),((com.fasterxml.jackson.core.ObjectCodec)v13));
    Object v15 = 1;
    Object v16 = ((com.fasterxml.jackson.core.JsonParser)v14).nextIntValue((((java.lang.Integer)v15).intValue()));
    Object v17 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v18 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v17));
    Object v19 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v18));
    Object v20 = -53;
    Object v21 = "elementType";
    Object v22 = ((com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler)v0)._deserialize(((com.fasterxml.jackson.core.JsonParser)v14),((com.fasterxml.jackson.databind.DeserializationContext)v19),(((java.lang.Integer)v20).intValue()),((java.lang.String)v21));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = true;
    Object v6 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = true;
    Object v10 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v6),((java.lang.Object)v8),((java.lang.Object)v10));
    Object v12 = new com.fasterxml.jackson.databind.node.ArrayNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v2),((java.util.List)v11));
    Object v13 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v14 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v12),((com.fasterxml.jackson.core.ObjectCodec)v13));
    Object v15 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v16 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v15));
    Object v17 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v16));
    Object v18 = "";
    Object v19 = ((com.fasterxml.jackson.databind.DeserializationContext)v17).mappingException(((java.lang.String)v18));
    Object v20 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v21 = -19;
    Object v22 = "-";
    ((com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler)v0)._deserializeAndSet(((com.fasterxml.jackson.core.JsonParser)v14),((com.fasterxml.jackson.databind.DeserializationContext)v17),((java.lang.Object)v20),(((java.lang.Integer)v21).intValue()),((java.lang.String)v22));
    Object v23 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = true;
    Object v6 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = true;
    Object v10 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v6),((java.lang.Object)v8),((java.lang.Object)v10));
    Object v12 = new com.fasterxml.jackson.databind.node.ArrayNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v2),((java.util.List)v11));
    Object v13 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v14 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v12),((com.fasterxml.jackson.core.ObjectCodec)v13));
    Object v15 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v16 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v15));
    Object v17 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v16));
    Object v18 = "$";
    Object v19 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v20 = ((com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler)v0).handleTypePropertyValue(((com.fasterxml.jackson.core.JsonParser)v14),((com.fasterxml.jackson.databind.DeserializationContext)v17),((java.lang.String)v18),((java.lang.Object)v19));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = true;
    Object v6 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = true;
    Object v10 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v6),((java.lang.Object)v8),((java.lang.Object)v10));
    Object v12 = new com.fasterxml.jackson.databind.node.ArrayNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v2),((java.util.List)v11));
    Object v13 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v14 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v12),((com.fasterxml.jackson.core.ObjectCodec)v13));
    Object v15 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v16 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v15));
    Object v17 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v16));
    Object v18 = 1;
    Object v19 = "Unexpected ";
    Object v20 = ((com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler)v0)._deserialize(((com.fasterxml.jackson.core.JsonParser)v14),((com.fasterxml.jackson.databind.DeserializationContext)v17),(((java.lang.Integer)v18).intValue()),((java.lang.String)v19));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = true;
    Object v6 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = true;
    Object v10 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v6),((java.lang.Object)v8),((java.lang.Object)v10));
    Object v12 = new com.fasterxml.jackson.databind.node.ArrayNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v2),((java.util.List)v11));
    Object v13 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v14 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v12),((com.fasterxml.jackson.core.ObjectCodec)v13));
    Object v15 = "overflow, value cannot be represented as 8-bit value";
    ((com.fasterxml.jackson.core.JsonParser)v14).setRequestPayloadOnError(((java.lang.String)v15));
    Object v16 = null;
    Object v17 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v18 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v17));
    Object v19 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v18));
    Object v20 = "";
    Object v21 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v22 = ((com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler)v0).handleTypePropertyValue(((com.fasterxml.jackson.core.JsonParser)v14),((com.fasterxml.jackson.databind.DeserializationContext)v19),((java.lang.String)v20),((java.lang.Object)v21));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = true;
    Object v6 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = true;
    Object v10 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v6),((java.lang.Object)v8),((java.lang.Object)v10));
    Object v12 = new com.fasterxml.jackson.databind.node.ArrayNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v2),((java.util.List)v11));
    Object v13 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v14 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v12),((com.fasterxml.jackson.core.ObjectCodec)v13));
    Object v15 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v16 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v15));
    Object v17 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v16));
    Object v18 = "string";
    Object v19 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v18));
    Object v20 = java.util.EnumSet.of(((java.lang.Enum)v19));
    Object v21 = ((com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler)v0).complete(((com.fasterxml.jackson.core.JsonParser)v14),((com.fasterxml.jackson.databind.DeserializationContext)v17),((java.lang.Object)v20));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = true;
    Object v6 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = true;
    Object v10 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v6),((java.lang.Object)v8),((java.lang.Object)v10));
    Object v12 = new com.fasterxml.jackson.databind.node.ArrayNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v2),((java.util.List)v11));
    Object v13 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v14 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v12),((com.fasterxml.jackson.core.ObjectCodec)v13));
    Object v15 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v16 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v15));
    Object v17 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v16));
    Object v18 = "string";
    Object v19 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v18));
    Object v20 = java.util.EnumSet.of(((java.lang.Enum)v19));
    Object v21 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v20));
    Object v22 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v21));
    Object v23 = -62;
    Object v24 = "Argument #";
    ((com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler)v0)._deserializeAndSet(((com.fasterxml.jackson.core.JsonParser)v14),((com.fasterxml.jackson.databind.DeserializationContext)v17),((java.lang.Object)v22),(((java.lang.Integer)v23).intValue()),((java.lang.String)v24));
    Object v25 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = true;
    Object v6 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = true;
    Object v10 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v6),((java.lang.Object)v8),((java.lang.Object)v10));
    Object v12 = new com.fasterxml.jackson.databind.node.ArrayNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v2),((java.util.List)v11));
    Object v13 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v14 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v12),((com.fasterxml.jackson.core.ObjectCodec)v13));
    Object v15 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v16 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v15));
    Object v17 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v16));
    Object v18 = "NON_DEFAULT";
    Object v19 = "string";
    Object v20 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v19));
    Object v21 = ((com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler)v0).handleTypePropertyValue(((com.fasterxml.jackson.core.JsonParser)v14),((com.fasterxml.jackson.databind.DeserializationContext)v17),((java.lang.String)v18),((java.lang.Object)v20));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = true;
    Object v6 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = true;
    Object v10 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v6),((java.lang.Object)v8),((java.lang.Object)v10));
    Object v12 = new com.fasterxml.jackson.databind.node.ArrayNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v2),((java.util.List)v11));
    Object v13 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v14 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v12),((com.fasterxml.jackson.core.ObjectCodec)v13));
    Object v15 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v16 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v15));
    Object v17 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v16));
    Object v18 = 34;
    Object v19 = ": ";
    Object v20 = ((com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler)v0)._deserialize(((com.fasterxml.jackson.core.JsonParser)v14),((com.fasterxml.jackson.databind.DeserializationContext)v17),(((java.lang.Integer)v18).intValue()),((java.lang.String)v19));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = true;
    Object v6 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = true;
    Object v10 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v6),((java.lang.Object)v8),((java.lang.Object)v10));
    Object v12 = new com.fasterxml.jackson.databind.node.ArrayNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v2),((java.util.List)v11));
    Object v13 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v14 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v12),((com.fasterxml.jackson.core.ObjectCodec)v13));
    Object v15 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v16 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v15));
    Object v17 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v16));
    Object v18 = new com.fasterxml.jackson.databind.util.ObjectBuffer();
    ((com.fasterxml.jackson.databind.DeserializationContext)v17).returnObjectBuffer(((com.fasterxml.jackson.databind.util.ObjectBuffer)v18));
    Object v19 = null;
    Object v20 = 3;
    Object v21 = "FA";
    Object v22 = ((com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler)v0)._deserialize(((com.fasterxml.jackson.core.JsonParser)v14),((com.fasterxml.jackson.databind.DeserializationContext)v17),(((java.lang.Integer)v20).intValue()),((java.lang.String)v21));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = true;
    Object v6 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = true;
    Object v10 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v6),((java.lang.Object)v8),((java.lang.Object)v10));
    Object v12 = new com.fasterxml.jackson.databind.node.ArrayNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v2),((java.util.List)v11));
    Object v13 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v14 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v12),((com.fasterxml.jackson.core.ObjectCodec)v13));
    Object v15 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v16 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v15));
    Object v17 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v16));
    Object v18 = "Multiple 'any-getters' defined (%s vs %s)";
    Object v19 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v20 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v19));
    Object v21 = ((com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler)v0).handleTypePropertyValue(((com.fasterxml.jackson.core.JsonParser)v14),((com.fasterxml.jackson.databind.DeserializationContext)v17),((java.lang.String)v18),((java.lang.Object)v20));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = true;
    Object v6 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = true;
    Object v10 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v6),((java.lang.Object)v8),((java.lang.Object)v10));
    Object v12 = new com.fasterxml.jackson.databind.node.ArrayNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v2),((java.util.List)v11));
    Object v13 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v14 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v12),((com.fasterxml.jackson.core.ObjectCodec)v13));
    Object v15 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v16 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v15));
    Object v17 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v16));
    Object v18 = "in%eger";
    Object v19 = "string";
    Object v20 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v19));
    Object v21 = ((com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler)v0).handlePropertyValue(((com.fasterxml.jackson.core.JsonParser)v14),((com.fasterxml.jackson.databind.DeserializationContext)v17),((java.lang.String)v18),((java.lang.Object)v20));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = true;
    Object v6 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = true;
    Object v10 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v6),((java.lang.Object)v8),((java.lang.Object)v10));
    Object v12 = new com.fasterxml.jackson.databind.node.ArrayNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v2),((java.util.List)v11));
    Object v13 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v14 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v12),((com.fasterxml.jackson.core.ObjectCodec)v13));
    Object v15 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v16 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v15));
    Object v17 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v16));
    Object v18 = "string";
    Object v19 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v18));
    Object v20 = java.util.EnumSet.of(((java.lang.Enum)v19));
    Object v21 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v20));
    Object v22 = 0;
    Object v23 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer(((java.lang.Class)v21),((java.lang.Integer)v22));
    Object v24 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v25 = "string";
    Object v26 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v25));
    Object v27 = java.util.EnumSet.of(((java.lang.Enum)v26));
    Object v28 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v27));
    Object v29 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v28));
    Object v30 = ((com.fasterxml.jackson.databind.DeserializationContext)v17).handlePrimaryContextualization(((com.fasterxml.jackson.databind.JsonDeserializer)v23),((com.fasterxml.jackson.databind.BeanProperty)v24),((com.fasterxml.jackson.databind.JavaType)v29));
    Object v31 = "(";
    Object v32 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v33 = ((com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler)v0).handlePropertyValue(((com.fasterxml.jackson.core.JsonParser)v14),((com.fasterxml.jackson.databind.DeserializationContext)v17),((java.lang.String)v31),((java.lang.Object)v32));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = true;
    Object v6 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = true;
    Object v10 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v6),((java.lang.Object)v8),((java.lang.Object)v10));
    Object v12 = new com.fasterxml.jackson.databind.node.ArrayNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v2),((java.util.List)v11));
    Object v13 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v14 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v12),((com.fasterxml.jackson.core.ObjectCodec)v13));
    Object v15 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v16 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v15));
    Object v17 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v16));
    Object v18 = 7;
    Object v19 = ",";
    Object v20 = ((com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler)v0)._deserialize(((com.fasterxml.jackson.core.JsonParser)v14),((com.fasterxml.jackson.databind.DeserializationContext)v17),(((java.lang.Integer)v18).intValue()),((java.lang.String)v19));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = true;
    Object v6 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = true;
    Object v10 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v6),((java.lang.Object)v8),((java.lang.Object)v10));
    Object v12 = new com.fasterxml.jackson.databind.node.ArrayNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v2),((java.util.List)v11));
    Object v13 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v14 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v12),((com.fasterxml.jackson.core.ObjectCodec)v13));
    Object v15 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v16 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v15));
    Object v17 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v16));
    Object v18 = "string";
    Object v19 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v18));
    Object v20 = java.util.EnumSet.of(((java.lang.Enum)v19));
    Object v21 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v20));
    Object v22 = 0;
    Object v23 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer(((java.lang.Class)v21),((java.lang.Integer)v22));
    Object v24 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v25 = "string";
    Object v26 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v25));
    Object v27 = java.util.EnumSet.of(((java.lang.Enum)v26));
    Object v28 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v27));
    Object v29 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v28));
    Object v30 = ((com.fasterxml.jackson.databind.DeserializationContext)v17).handlePrimaryContextualization(((com.fasterxml.jackson.databind.JsonDeserializer)v23),((com.fasterxml.jackson.databind.BeanProperty)v24),((com.fasterxml.jackson.databind.JavaType)v29));
    Object v31 = ".";
    Object v32 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v33 = ((com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler)v0).handleTypePropertyValue(((com.fasterxml.jackson.core.JsonParser)v14),((com.fasterxml.jackson.databind.DeserializationContext)v17),((java.lang.String)v31),((java.lang.Object)v32));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = true;
    Object v6 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = true;
    Object v10 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v6),((java.lang.Object)v8),((java.lang.Object)v10));
    Object v12 = new com.fasterxml.jackson.databind.node.ArrayNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v2),((java.util.List)v11));
    Object v13 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v14 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v12),((com.fasterxml.jackson.core.ObjectCodec)v13));
    Object v15 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v16 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v15));
    Object v17 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v16));
    Object v18 = 38;
    Object v19 = "Cannot construct AnnotatedMethod with null Method";
    Object v20 = ((com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler)v0)._deserialize(((com.fasterxml.jackson.core.JsonParser)v14),((com.fasterxml.jackson.databind.DeserializationContext)v17),(((java.lang.Integer)v18).intValue()),((java.lang.String)v19));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = true;
    Object v6 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = true;
    Object v10 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v6),((java.lang.Object)v8),((java.lang.Object)v10));
    Object v12 = new com.fasterxml.jackson.databind.node.ArrayNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v2),((java.util.List)v11));
    Object v13 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v14 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v12),((com.fasterxml.jackson.core.ObjectCodec)v13));
    Object v15 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v16 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v15));
    Object v17 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v16));
    Object v18 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v19 = "8";
    Object v20 = "string";
    Object v21 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v20));
    Object v22 = java.util.EnumSet.of(((java.lang.Enum)v21));
    Object v23 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v22));
    Object v24 = 0;
    Object v25 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer(((java.lang.Class)v23),((java.lang.Integer)v24));
    ((com.fasterxml.jackson.databind.DeserializationContext)v17).reportUnknownProperty(((java.lang.Object)v18),((java.lang.String)v19),((com.fasterxml.jackson.databind.JsonDeserializer)v25));
    Object v26 = null;
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v28 = 0;
    Object v29 = "fileName";
    ((com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler)v0)._deserializeAndSet(((com.fasterxml.jackson.core.JsonParser)v14),((com.fasterxml.jackson.databind.DeserializationContext)v17),((java.lang.Object)v27),(((java.lang.Integer)v28).intValue()),((java.lang.String)v29));
    Object v30 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = true;
    Object v6 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = true;
    Object v10 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v6),((java.lang.Object)v8),((java.lang.Object)v10));
    Object v12 = new com.fasterxml.jackson.databind.node.ArrayNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v2),((java.util.List)v11));
    Object v13 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v14 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v12),((com.fasterxml.jackson.core.ObjectCodec)v13));
    Object v15 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v16 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v15));
    Object v17 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v16));
    Object v18 = -14;
    Object v19 = "k')]";
    Object v20 = ((com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler)v0)._deserialize(((com.fasterxml.jackson.core.JsonParser)v14),((com.fasterxml.jackson.databind.DeserializationContext)v17),(((java.lang.Integer)v18).intValue()),((java.lang.String)v19));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = true;
    Object v6 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = true;
    Object v10 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v6),((java.lang.Object)v8),((java.lang.Object)v10));
    Object v12 = new com.fasterxml.jackson.databind.node.ArrayNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v2),((java.util.List)v11));
    Object v13 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v14 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v12),((com.fasterxml.jackson.core.ObjectCodec)v13));
    Object v15 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v16 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v15));
    Object v17 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v16));
    Object v18 = "array";
    Object v19 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v20 = ((com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler)v0).handleTypePropertyValue(((com.fasterxml.jackson.core.JsonParser)v14),((com.fasterxml.jackson.databind.DeserializationContext)v17),((java.lang.String)v18),((java.lang.Object)v19));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = true;
    Object v6 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = true;
    Object v10 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v6),((java.lang.Object)v8),((java.lang.Object)v10));
    Object v12 = new com.fasterxml.jackson.databind.node.ArrayNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v2),((java.util.List)v11));
    Object v13 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v14 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v12),((com.fasterxml.jackson.core.ObjectCodec)v13));
    Object v15 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v16 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v15));
    Object v17 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v16));
    Object v18 = "]";
    Object v19 = "string";
    Object v20 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v19));
    Object v21 = ((com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler)v0).handlePropertyValue(((com.fasterxml.jackson.core.JsonParser)v14),((com.fasterxml.jackson.databind.DeserializationContext)v17),((java.lang.String)v18),((java.lang.Object)v20));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = true;
    Object v6 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = true;
    Object v10 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v6),((java.lang.Object)v8),((java.lang.Object)v10));
    Object v12 = new com.fasterxml.jackson.databind.node.ArrayNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v2),((java.util.List)v11));
    Object v13 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v14 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v12),((com.fasterxml.jackson.core.ObjectCodec)v13));
    Object v15 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v16 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v15));
    Object v17 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v19 = "string";
    Object v20 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v19));
    Object v21 = java.util.EnumSet.of(((java.lang.Enum)v20));
    Object v22 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v21));
    Object v23 = "string";
    Object v24 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v23));
    Object v25 = java.util.EnumSet.of(((java.lang.Enum)v24));
    Object v26 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v25));
    Object v27 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v26));
    Object v28 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v22),((com.fasterxml.jackson.databind.JavaType)v27));
    Object v29 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v18),((com.fasterxml.jackson.databind.type.TypeBindings)v28));
    Object v30 = 1;
    Object v31 = "tr";
    ((com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler)v0)._deserializeAndSet(((com.fasterxml.jackson.core.JsonParser)v14),((com.fasterxml.jackson.databind.DeserializationContext)v17),((java.lang.Object)v29),(((java.lang.Integer)v30).intValue()),((java.lang.String)v31));
    Object v32 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = true;
    Object v6 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = true;
    Object v10 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v6),((java.lang.Object)v8),((java.lang.Object)v10));
    Object v12 = new com.fasterxml.jackson.databind.node.ArrayNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v2),((java.util.List)v11));
    Object v13 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v14 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v12),((com.fasterxml.jackson.core.ObjectCodec)v13));
    Object v15 = ((com.fasterxml.jackson.core.JsonParser)v14).currentName();
    Object v16 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v17 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v17));
    Object v19 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v20 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v19));
    Object v21 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v20));
    Object v22 = 0;
    Object v23 = "-";
    ((com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler)v0)._deserializeAndSet(((com.fasterxml.jackson.core.JsonParser)v14),((com.fasterxml.jackson.databind.DeserializationContext)v18),((java.lang.Object)v21),(((java.lang.Integer)v22).intValue()),((java.lang.String)v23));
    Object v24 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = true;
    Object v6 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = true;
    Object v10 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v6),((java.lang.Object)v8),((java.lang.Object)v10));
    Object v12 = new com.fasterxml.jackson.databind.node.ArrayNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v2),((java.util.List)v11));
    Object v13 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v14 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v12),((com.fasterxml.jackson.core.ObjectCodec)v13));
    Object v15 = new byte[]{Byte.valueOf((byte)1)};
    Object v16 = "integer";
    ((com.fasterxml.jackson.core.JsonParser)v14).setRequestPayloadOnError(((byte[])v15),((java.lang.String)v16));
    Object v17 = null;
    Object v18 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v19 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v18));
    Object v20 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v19));
    Object v21 = 2;
    Object v22 = "O";
    Object v23 = ((com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler)v0)._deserialize(((com.fasterxml.jackson.core.JsonParser)v14),((com.fasterxml.jackson.databind.DeserializationContext)v20),(((java.lang.Integer)v21).intValue()),((java.lang.String)v22));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = true;
    Object v6 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = true;
    Object v10 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v6),((java.lang.Object)v8),((java.lang.Object)v10));
    Object v12 = new com.fasterxml.jackson.databind.node.ArrayNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v2),((java.util.List)v11));
    Object v13 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v14 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v12),((com.fasterxml.jackson.core.ObjectCodec)v13));
    Object v15 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v16 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v15));
    Object v17 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v16));
    Object v18 = "value no one of declared Enum instance names for %s";
    Object v19 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v20 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v19));
    Object v21 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v20));
    Object v22 = ((com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler)v0).handleTypePropertyValue(((com.fasterxml.jackson.core.JsonParser)v14),((com.fasterxml.jackson.databind.DeserializationContext)v17),((java.lang.String)v18),((java.lang.Object)v21));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = true;
    Object v6 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = true;
    Object v10 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v6),((java.lang.Object)v8),((java.lang.Object)v10));
    Object v12 = new com.fasterxml.jackson.databind.node.ArrayNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v2),((java.util.List)v11));
    Object v13 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v14 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v12),((com.fasterxml.jackson.core.ObjectCodec)v13));
    Object v15 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v16 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v15));
    Object v17 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v16));
    Object v18 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v19 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v18));
    Object v20 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v19));
    Object v21 = 0;
    Object v22 = "string";
    ((com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler)v0)._deserializeAndSet(((com.fasterxml.jackson.core.JsonParser)v14),((com.fasterxml.jackson.databind.DeserializationContext)v17),((java.lang.Object)v20),(((java.lang.Integer)v21).intValue()),((java.lang.String)v22));
    Object v23 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = true;
    Object v6 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = true;
    Object v10 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v6),((java.lang.Object)v8),((java.lang.Object)v10));
    Object v12 = new com.fasterxml.jackson.databind.node.ArrayNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v2),((java.util.List)v11));
    Object v13 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v14 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v12),((com.fasterxml.jackson.core.ObjectCodec)v13));
    Object v15 = ((com.fasterxml.jackson.core.JsonParser)v14).isExpectedStartObjectToken();
    Object v16 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v17 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v17));
    Object v19 = "Unexpected JSON values; expected at most %d properties (in JSON Array)";
    Object v20 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v21 = ((com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler)v0).handleTypePropertyValue(((com.fasterxml.jackson.core.JsonParser)v14),((com.fasterxml.jackson.databind.DeserializationContext)v18),((java.lang.String)v19),((java.lang.Object)v20));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = true;
    Object v6 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = true;
    Object v10 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v6),((java.lang.Object)v8),((java.lang.Object)v10));
    Object v12 = new com.fasterxml.jackson.databind.node.ArrayNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v2),((java.util.List)v11));
    Object v13 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v14 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v12),((com.fasterxml.jackson.core.ObjectCodec)v13));
    Object v15 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v16 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v15));
    Object v17 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v16));
    Object v18 = "string";
    Object v19 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v18));
    Object v20 = 1;
    Object v21 = "";
    ((com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler)v0)._deserializeAndSet(((com.fasterxml.jackson.core.JsonParser)v14),((com.fasterxml.jackson.databind.DeserializationContext)v17),((java.lang.Object)v19),(((java.lang.Integer)v20).intValue()),((java.lang.String)v21));
    Object v22 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = true;
    Object v6 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = true;
    Object v10 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v6),((java.lang.Object)v8),((java.lang.Object)v10));
    Object v12 = new com.fasterxml.jackson.databind.node.ArrayNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v2),((java.util.List)v11));
    Object v13 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v14 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v12),((com.fasterxml.jackson.core.ObjectCodec)v13));
    Object v15 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v16 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v15));
    Object v17 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v16));
    Object v18 = "]";
    Object v19 = true;
    Object v20 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v19).booleanValue()));
    Object v21 = ((com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler)v0).handlePropertyValue(((com.fasterxml.jackson.core.JsonParser)v14),((com.fasterxml.jackson.databind.DeserializationContext)v17),((java.lang.String)v18),((java.lang.Object)v20));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = true;
    Object v6 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = true;
    Object v10 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v6),((java.lang.Object)v8),((java.lang.Object)v10));
    Object v12 = new com.fasterxml.jackson.databind.node.ArrayNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v2),((java.util.List)v11));
    Object v13 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v14 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v12),((com.fasterxml.jackson.core.ObjectCodec)v13));
    Object v15 = 63L;
    Object v16 = ((com.fasterxml.jackson.core.JsonParser)v14).nextLongValue((((java.lang.Long)v15).longValue()));
    Object v17 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v18 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v17));
    Object v19 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v18));
    Object v20 = "string";
    Object v21 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v20));
    Object v22 = java.util.EnumSet.of(((java.lang.Enum)v21));
    Object v23 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v22));
    Object v24 = 0;
    Object v25 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer(((java.lang.Class)v23),((java.lang.Integer)v24));
    Object v26 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v27 = "string";
    Object v28 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v27));
    Object v29 = java.util.EnumSet.of(((java.lang.Enum)v28));
    Object v30 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v29));
    Object v31 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v30));
    Object v32 = ((com.fasterxml.jackson.databind.DeserializationContext)v19).handleSecondaryContextualization(((com.fasterxml.jackson.databind.JsonDeserializer)v25),((com.fasterxml.jackson.databind.BeanProperty)v26),((com.fasterxml.jackson.databind.JavaType)v31));
    Object v33 = ";";
    Object v34 = java.time.Instant.now();
    Object v35 = java.time.Instant.from(((java.time.temporal.TemporalAccessor)v34));
    Object v36 = java.util.Date.from(((java.time.Instant)v35));
    Object v37 = ((com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler)v0).handlePropertyValue(((com.fasterxml.jackson.core.JsonParser)v14),((com.fasterxml.jackson.databind.DeserializationContext)v19),((java.lang.String)v33),((java.lang.Object)v36));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = true;
    Object v6 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = true;
    Object v10 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v6),((java.lang.Object)v8),((java.lang.Object)v10));
    Object v12 = new com.fasterxml.jackson.databind.node.ArrayNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v2),((java.util.List)v11));
    Object v13 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v14 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v12),((com.fasterxml.jackson.core.ObjectCodec)v13));
    Object v15 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v16 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v15));
    Object v17 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v16));
    Object v18 = 1;
    Object v19 = "')";
    Object v20 = ((com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler)v0)._deserialize(((com.fasterxml.jackson.core.JsonParser)v14),((com.fasterxml.jackson.databind.DeserializationContext)v17),(((java.lang.Integer)v18).intValue()),((java.lang.String)v19));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = "string";
    Object v1 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v0));
    Object v2 = java.util.EnumSet.of(((java.lang.Enum)v1));
    Object v3 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v2));
    Object v4 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v3));
    Object v5 = -4;
    Object v6 = ((com.fasterxml.jackson.databind.JavaType)v4).containedTypeName((((java.lang.Integer)v5).intValue()));
    Object v7 = com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.builder(((com.fasterxml.jackson.databind.JavaType)v4));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = true;
    Object v6 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = true;
    Object v10 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v6),((java.lang.Object)v8),((java.lang.Object)v10));
    Object v12 = new com.fasterxml.jackson.databind.node.ArrayNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v2),((java.util.List)v11));
    Object v13 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v14 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v12),((com.fasterxml.jackson.core.ObjectCodec)v13));
    Object v15 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v16 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v15));
    Object v17 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v16));
    Object v18 = 0;
    Object v19 = "";
    Object v20 = ((com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler)v0)._deserialize(((com.fasterxml.jackson.core.JsonParser)v14),((com.fasterxml.jackson.databind.DeserializationContext)v17),(((java.lang.Integer)v18).intValue()),((java.lang.String)v19));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = true;
    Object v6 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = true;
    Object v10 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v6),((java.lang.Object)v8),((java.lang.Object)v10));
    Object v12 = new com.fasterxml.jackson.databind.node.ArrayNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v2),((java.util.List)v11));
    Object v13 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v14 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v12),((com.fasterxml.jackson.core.ObjectCodec)v13));
    Object v15 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v16 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v15));
    Object v17 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v16));
    Object v18 = new com.fasterxml.jackson.databind.util.ObjectBuffer();
    ((com.fasterxml.jackson.databind.DeserializationContext)v17).returnObjectBuffer(((com.fasterxml.jackson.databind.util.ObjectBuffer)v18));
    Object v19 = null;
    Object v20 = 1;
    Object v21 = "not a valid Float value";
    Object v22 = ((com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler)v0)._deserialize(((com.fasterxml.jackson.core.JsonParser)v14),((com.fasterxml.jackson.databind.DeserializationContext)v17),(((java.lang.Integer)v20).intValue()),((java.lang.String)v21));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = true;
    Object v6 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = true;
    Object v10 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v6),((java.lang.Object)v8),((java.lang.Object)v10));
    Object v12 = new com.fasterxml.jackson.databind.node.ArrayNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v2),((java.util.List)v11));
    Object v13 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v14 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v12),((com.fasterxml.jackson.core.ObjectCodec)v13));
    Object v15 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v16 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v15));
    Object v17 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v16));
    Object v18 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v19 = ((com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler)v0).complete(((com.fasterxml.jackson.core.JsonParser)v14),((com.fasterxml.jackson.databind.DeserializationContext)v17),((java.lang.Object)v18));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = true;
    Object v6 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = true;
    Object v10 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v6),((java.lang.Object)v8),((java.lang.Object)v10));
    Object v12 = new com.fasterxml.jackson.databind.node.ArrayNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v2),((java.util.List)v11));
    Object v13 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v14 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v12),((com.fasterxml.jackson.core.ObjectCodec)v13));
    Object v15 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v16 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v15));
    Object v17 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v16));
    ((com.fasterxml.jackson.databind.DeserializationContext)v17).checkUnresolvedObjectId();
    Object v18 = null;
    Object v19 = 1;
    Object v20 = ")";
    Object v21 = ((com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler)v0)._deserialize(((com.fasterxml.jackson.core.JsonParser)v14),((com.fasterxml.jackson.databind.DeserializationContext)v17),(((java.lang.Integer)v19).intValue()),((java.lang.String)v20));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = true;
    Object v6 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = true;
    Object v10 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v6),((java.lang.Object)v8),((java.lang.Object)v10));
    Object v12 = new com.fasterxml.jackson.databind.node.ArrayNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v2),((java.util.List)v11));
    Object v13 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v14 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v12),((com.fasterxml.jackson.core.ObjectCodec)v13));
    Object v15 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v16 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v15));
    Object v17 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v16));
    Object v18 = 0;
    Object v19 = "]";
    Object v20 = ((com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler)v0)._deserialize(((com.fasterxml.jackson.core.JsonParser)v14),((com.fasterxml.jackson.databind.DeserializationContext)v17),(((java.lang.Integer)v18).intValue()),((java.lang.String)v19));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = true;
    Object v6 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = true;
    Object v10 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v6),((java.lang.Object)v8),((java.lang.Object)v10));
    Object v12 = new com.fasterxml.jackson.databind.node.ArrayNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v2),((java.util.List)v11));
    Object v13 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v14 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v12),((com.fasterxml.jackson.core.ObjectCodec)v13));
    Object v15 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v16 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v15));
    Object v17 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v16));
    Object v18 = 12;
    Object v19 = ": latter is not a subty";
    Object v20 = ((com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler)v0)._deserialize(((com.fasterxml.jackson.core.JsonParser)v14),((com.fasterxml.jackson.databind.DeserializationContext)v17),(((java.lang.Integer)v18).intValue()),((java.lang.String)v19));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = true;
    Object v6 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = true;
    Object v10 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v6),((java.lang.Object)v8),((java.lang.Object)v10));
    Object v12 = new com.fasterxml.jackson.databind.node.ArrayNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v2),((java.util.List)v11));
    Object v13 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v14 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v12),((com.fasterxml.jackson.core.ObjectCodec)v13));
    Object v15 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v16 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v15));
    Object v17 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v16));
    Object v18 = "integer";
    Object v19 = "string";
    Object v20 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v19));
    Object v21 = java.util.EnumSet.of(((java.lang.Enum)v20));
    Object v22 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v21));
    Object v23 = 0;
    Object v24 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer(((java.lang.Class)v22),((java.lang.Integer)v23));
    Object v25 = ((com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler)v0).handleTypePropertyValue(((com.fasterxml.jackson.core.JsonParser)v14),((com.fasterxml.jackson.databind.DeserializationContext)v17),((java.lang.String)v18),((java.lang.Object)v24));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = "string";
    Object v1 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v0));
    Object v2 = java.util.EnumSet.of(((java.lang.Enum)v1));
    Object v3 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v2));
    Object v4 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v3));
    Object v5 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v6 = ((com.fasterxml.jackson.databind.JavaType)v4).withValueHandler(((java.lang.Object)v5));
    Object v7 = com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.builder(((com.fasterxml.jackson.databind.JavaType)v4));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = true;
    Object v6 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = true;
    Object v10 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v6),((java.lang.Object)v8),((java.lang.Object)v10));
    Object v12 = new com.fasterxml.jackson.databind.node.ArrayNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v2),((java.util.List)v11));
    Object v13 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v14 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v12),((com.fasterxml.jackson.core.ObjectCodec)v13));
    Object v15 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
    Object v16 = ((com.fasterxml.jackson.core.JsonParser)v14).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v15));
    Object v17 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v18 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v17));
    Object v19 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v18));
    Object v20 = 1;
    Object v21 = ".";
    Object v22 = ((com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler)v0)._deserialize(((com.fasterxml.jackson.core.JsonParser)v14),((com.fasterxml.jackson.databind.DeserializationContext)v19),(((java.lang.Integer)v20).intValue()),((java.lang.String)v21));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = true;
    Object v6 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = true;
    Object v10 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v6),((java.lang.Object)v8),((java.lang.Object)v10));
    Object v12 = new com.fasterxml.jackson.databind.node.ArrayNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v2),((java.util.List)v11));
    Object v13 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v14 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v12),((com.fasterxml.jackson.core.ObjectCodec)v13));
    Object v15 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v16 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v15));
    Object v17 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v16));
    Object v18 = "i";
    Object v19 = true;
    Object v20 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v19).booleanValue()));
    Object v21 = true;
    Object v22 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v21).booleanValue()));
    Object v23 = true;
    Object v24 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v23).booleanValue()));
    Object v25 = true;
    Object v26 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v25).booleanValue()));
    Object v27 = java.util.List.of(((java.lang.Object)v20),((java.lang.Object)v22),((java.lang.Object)v24),((java.lang.Object)v26));
    Object v28 = ((com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler)v0).handleTypePropertyValue(((com.fasterxml.jackson.core.JsonParser)v14),((com.fasterxml.jackson.databind.DeserializationContext)v17),((java.lang.String)v18),((java.lang.Object)v27));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = true;
    Object v6 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = true;
    Object v10 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v6),((java.lang.Object)v8),((java.lang.Object)v10));
    Object v12 = new com.fasterxml.jackson.databind.node.ArrayNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v2),((java.util.List)v11));
    Object v13 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v14 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v12),((com.fasterxml.jackson.core.ObjectCodec)v13));
    Object v15 = ((com.fasterxml.jackson.core.JsonParser)v14).getCurrentName();
    Object v16 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v17 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v17));
    Object v19 = ", problem{: ";
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v21 = ((com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler)v0).handleTypePropertyValue(((com.fasterxml.jackson.core.JsonParser)v14),((com.fasterxml.jackson.databind.DeserializationContext)v18),((java.lang.String)v19),((java.lang.Object)v20));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = true;
    Object v6 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = true;
    Object v10 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v6),((java.lang.Object)v8),((java.lang.Object)v10));
    Object v12 = new com.fasterxml.jackson.databind.node.ArrayNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v2),((java.util.List)v11));
    Object v13 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v14 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v12),((com.fasterxml.jackson.core.ObjectCodec)v13));
    Object v15 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v16 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v15));
    Object v17 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v16));
    Object v18 = -73;
    Object v19 = "";
    Object v20 = ((com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler)v0)._deserialize(((com.fasterxml.jackson.core.JsonParser)v14),((com.fasterxml.jackson.databind.DeserializationContext)v17),(((java.lang.Integer)v18).intValue()),((java.lang.String)v19));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = true;
    Object v6 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = true;
    Object v10 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v6),((java.lang.Object)v8),((java.lang.Object)v10));
    Object v12 = new com.fasterxml.jackson.databind.node.ArrayNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v2),((java.util.List)v11));
    Object v13 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v14 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v12),((com.fasterxml.jackson.core.ObjectCodec)v13));
    Object v15 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v16 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v15));
    Object v17 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v16));
    Object v18 = com.fasterxml.jackson.databind.introspect.AnnotationCollector.emptyAnnotations();
    Object v19 = ((com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler)v0).complete(((com.fasterxml.jackson.core.JsonParser)v14),((com.fasterxml.jackson.databind.DeserializationContext)v17),((java.lang.Object)v18));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = true;
    Object v6 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = true;
    Object v10 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v6),((java.lang.Object)v8),((java.lang.Object)v10));
    Object v12 = new com.fasterxml.jackson.databind.node.ArrayNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v2),((java.util.List)v11));
    Object v13 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v14 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v12),((com.fasterxml.jackson.core.ObjectCodec)v13));
    Object v15 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v16 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v15));
    Object v17 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v16));
    Object v18 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v19 = "arr\\ay";
    Object v20 = "string";
    Object v21 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v20));
    Object v22 = java.util.EnumSet.of(((java.lang.Enum)v21));
    Object v23 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v22));
    Object v24 = 0;
    Object v25 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer(((java.lang.Class)v23),((java.lang.Integer)v24));
    ((com.fasterxml.jackson.databind.DeserializationContext)v17).reportUnknownProperty(((java.lang.Object)v18),((java.lang.String)v19),((com.fasterxml.jackson.databind.JsonDeserializer)v25));
    Object v26 = null;
    Object v27 = 0;
    Object v28 = "items";
    Object v29 = ((com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler)v0)._deserialize(((com.fasterxml.jackson.core.JsonParser)v14),((com.fasterxml.jackson.databind.DeserializationContext)v17),(((java.lang.Integer)v27).intValue()),((java.lang.String)v28));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = true;
    Object v6 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = true;
    Object v10 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v6),((java.lang.Object)v8),((java.lang.Object)v10));
    Object v12 = new com.fasterxml.jackson.databind.node.ArrayNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v2),((java.util.List)v11));
    Object v13 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v14 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v12),((com.fasterxml.jackson.core.ObjectCodec)v13));
    Object v15 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v16 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v15));
    Object v17 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v16));
    Object v18 = "Cannot construct instance of %s (although at least one Creator exists): %s";
    Object v19 = "string";
    Object v20 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v19));
    Object v21 = java.util.EnumSet.of(((java.lang.Enum)v20));
    Object v22 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v21));
    Object v23 = "'";
    Object v24 = ((com.fasterxml.jackson.databind.DeserializationContext)v17).weirdStringException(((java.lang.String)v18),((java.lang.Class)v22),((java.lang.String)v23));
    Object v25 = "";
    Object v26 = "string";
    Object v27 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v26));
    Object v28 = java.util.EnumSet.of(((java.lang.Enum)v27));
    Object v29 = ((com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler)v0).handlePropertyValue(((com.fasterxml.jackson.core.JsonParser)v14),((com.fasterxml.jackson.databind.DeserializationContext)v17),((java.lang.String)v25),((java.lang.Object)v28));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = true;
    Object v6 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = true;
    Object v10 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v6),((java.lang.Object)v8),((java.lang.Object)v10));
    Object v12 = new com.fasterxml.jackson.databind.node.ArrayNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v2),((java.util.List)v11));
    Object v13 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v14 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v12),((com.fasterxml.jackson.core.ObjectCodec)v13));
    Object v15 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v16 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v15));
    Object v17 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v16));
    Object v18 = "Argument #%d of constructor %s has no property name annotation; must have name when multiple-parameter constructor annotated as Creator";
    Object v19 = "string";
    Object v20 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v19));
    Object v21 = ((com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler)v0).handlePropertyValue(((com.fasterxml.jackson.core.JsonParser)v14),((com.fasterxml.jackson.databind.DeserializationContext)v17),((java.lang.String)v18),((java.lang.Object)v20));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = true;
    Object v6 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = true;
    Object v10 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v6),((java.lang.Object)v8),((java.lang.Object)v10));
    Object v12 = new com.fasterxml.jackson.databind.node.ArrayNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v2),((java.util.List)v11));
    Object v13 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v14 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v12),((com.fasterxml.jackson.core.ObjectCodec)v13));
    Object v15 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v16 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v15));
    Object v17 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v16));
    Object v18 = ", annotEations: ";
    Object v19 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v20 = ((com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler)v0).handlePropertyValue(((com.fasterxml.jackson.core.JsonParser)v14),((com.fasterxml.jackson.databind.DeserializationContext)v17),((java.lang.String)v18),((java.lang.Object)v19));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = "string";
    Object v1 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v0));
    Object v2 = java.util.EnumSet.of(((java.lang.Enum)v1));
    Object v3 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v2));
    Object v4 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v3));
    Object v5 = -18;
    Object v6 = ((com.fasterxml.jackson.databind.JavaType)v4).containedTypeName((((java.lang.Integer)v5).intValue()));
    Object v7 = com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.builder(((com.fasterxml.jackson.databind.JavaType)v4));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = true;
    Object v6 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = true;
    Object v10 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v6),((java.lang.Object)v8),((java.lang.Object)v10));
    Object v12 = new com.fasterxml.jackson.databind.node.ArrayNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v2),((java.util.List)v11));
    Object v13 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v14 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v12),((com.fasterxml.jackson.core.ObjectCodec)v13));
    Object v15 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v16 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v15));
    Object v17 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v16));
    Object v18 = true;
    Object v19 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v18).booleanValue()));
    Object v20 = true;
    Object v21 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v20).booleanValue()));
    Object v22 = true;
    Object v23 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v22).booleanValue()));
    Object v24 = true;
    Object v25 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v24).booleanValue()));
    Object v26 = true;
    Object v27 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v26).booleanValue()));
    Object v28 = java.util.List.of(((java.lang.Object)v21),((java.lang.Object)v23),((java.lang.Object)v25),((java.lang.Object)v27));
    Object v29 = new com.fasterxml.jackson.databind.node.ArrayNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v19),((java.util.List)v28));
    Object v30 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v31 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v29),((com.fasterxml.jackson.core.ObjectCodec)v30));
    Object v32 = com.fasterxml.jackson.core.JsonToken.VALUE_STRING;
    Object v33 = ")";
    Object v34 = ((com.fasterxml.jackson.databind.DeserializationContext)v17).wrongTokenException(((com.fasterxml.jackson.core.JsonParser)v31),((com.fasterxml.jackson.core.JsonToken)v32),((java.lang.String)v33));
    Object v35 = 0;
    Object v36 = "can only instantiate non-static inner class by using default, no-argument constructor";
    Object v37 = ((com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler)v0)._deserialize(((com.fasterxml.jackson.core.JsonParser)v14),((com.fasterxml.jackson.databind.DeserializationContext)v17),(((java.lang.Integer)v35).intValue()),((java.lang.String)v36));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = true;
    Object v6 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = true;
    Object v10 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v6),((java.lang.Object)v8),((java.lang.Object)v10));
    Object v12 = new com.fasterxml.jackson.databind.node.ArrayNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v2),((java.util.List)v11));
    Object v13 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v14 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v12),((com.fasterxml.jackson.core.ObjectCodec)v13));
    Object v15 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v16 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v15));
    Object v17 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v19 = ((com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler)v0).complete(((com.fasterxml.jackson.core.JsonParser)v14),((com.fasterxml.jackson.databind.DeserializationContext)v17),((java.lang.Object)v18));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = true;
    Object v6 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = true;
    Object v10 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v6),((java.lang.Object)v8),((java.lang.Object)v10));
    Object v12 = new com.fasterxml.jackson.databind.node.ArrayNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v2),((java.util.List)v11));
    Object v13 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v14 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v12),((com.fasterxml.jackson.core.ObjectCodec)v13));
    Object v15 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v16 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v15));
    Object v17 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v19 = 0;
    Object v20 = "tr";
    ((com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler)v0)._deserializeAndSet(((com.fasterxml.jackson.core.JsonParser)v14),((com.fasterxml.jackson.databind.DeserializationContext)v17),((java.lang.Object)v18),(((java.lang.Integer)v19).intValue()),((java.lang.String)v20));
    Object v21 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = "string";
    Object v1 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v0));
    Object v2 = java.util.EnumSet.of(((java.lang.Enum)v1));
    Object v3 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v2));
    Object v4 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v3));
    Object v5 = ((com.fasterxml.jackson.databind.JavaType)v4).withStaticTyping();
    Object v6 = com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.builder(((com.fasterxml.jackson.databind.JavaType)v4));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = true;
    Object v6 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = true;
    Object v10 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v6),((java.lang.Object)v8),((java.lang.Object)v10));
    Object v12 = new com.fasterxml.jackson.databind.node.ArrayNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v2),((java.util.List)v11));
    Object v13 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v14 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v12),((com.fasterxml.jackson.core.ObjectCodec)v13));
    Object v15 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v16 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v15));
    Object v17 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v16));
    Object v18 = com.fasterxml.jackson.databind.introspect.AnnotationCollector.emptyAnnotations();
    Object v19 = 16;
    Object v20 = "";
    ((com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler)v0)._deserializeAndSet(((com.fasterxml.jackson.core.JsonParser)v14),((com.fasterxml.jackson.databind.DeserializationContext)v17),((java.lang.Object)v18),(((java.lang.Integer)v19).intValue()),((java.lang.String)v20));
    Object v21 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = true;
    Object v6 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = true;
    Object v10 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v6),((java.lang.Object)v8),((java.lang.Object)v10));
    Object v12 = new com.fasterxml.jackson.databind.node.ArrayNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v2),((java.util.List)v11));
    Object v13 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v14 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v12),((com.fasterxml.jackson.core.ObjectCodec)v13));
    Object v15 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v16 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v15));
    Object v17 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v16));
    Object v18 = "string";
    Object v19 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v18));
    Object v20 = java.util.EnumSet.of(((java.lang.Enum)v19));
    Object v21 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v20));
    Object v22 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v21));
    Object v23 = "string";
    Object v24 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v23));
    Object v25 = java.util.EnumSet.of(((java.lang.Enum)v24));
    Object v26 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v25));
    Object v27 = ((com.fasterxml.jackson.databind.DatabindContext)v17).constructSpecializedType(((com.fasterxml.jackson.databind.JavaType)v22),((java.lang.Class)v26));
    Object v28 = "stri0ng";
    Object v29 = "string";
    Object v30 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v29));
    Object v31 = ((com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler)v0).handleTypePropertyValue(((com.fasterxml.jackson.core.JsonParser)v14),((com.fasterxml.jackson.databind.DeserializationContext)v17),((java.lang.String)v28),((java.lang.Object)v30));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = true;
    Object v6 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = true;
    Object v10 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v6),((java.lang.Object)v8),((java.lang.Object)v10));
    Object v12 = new com.fasterxml.jackson.databind.node.ArrayNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v2),((java.util.List)v11));
    Object v13 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v14 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v12),((com.fasterxml.jackson.core.ObjectCodec)v13));
    Object v15 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v16 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v15));
    Object v17 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v16));
    Object v18 = 1;
    Object v19 = "false";
    Object v20 = ((com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler)v0)._deserialize(((com.fasterxml.jackson.core.JsonParser)v14),((com.fasterxml.jackson.databind.DeserializationContext)v17),(((java.lang.Integer)v18).intValue()),((java.lang.String)v19));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = "string";
    Object v1 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v0));
    Object v2 = java.util.EnumSet.of(((java.lang.Enum)v1));
    Object v3 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v2));
    Object v4 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v3));
    Object v5 = "";
    Object v6 = new java.lang.StringBuilder(((java.lang.String)v5));
    Object v7 = ((com.fasterxml.jackson.databind.JavaType)v4).getErasedSignature(((java.lang.StringBuilder)v6));
    Object v8 = com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.builder(((com.fasterxml.jackson.databind.JavaType)v4));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = true;
    Object v6 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = true;
    Object v10 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v6),((java.lang.Object)v8),((java.lang.Object)v10));
    Object v12 = new com.fasterxml.jackson.databind.node.ArrayNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v2),((java.util.List)v11));
    Object v13 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v14 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v12),((com.fasterxml.jackson.core.ObjectCodec)v13));
    Object v15 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v16 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v15));
    Object v17 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v16));
    Object v18 = "array";
    Object v19 = "";
    Object v20 = new java.lang.StringBuilder(((java.lang.String)v19));
    Object v21 = ((com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler)v0).handleTypePropertyValue(((com.fasterxml.jackson.core.JsonParser)v14),((com.fasterxml.jackson.databind.DeserializationContext)v17),((java.lang.String)v18),((java.lang.Object)v20));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = true;
    Object v6 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = true;
    Object v10 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v6),((java.lang.Object)v8),((java.lang.Object)v10));
    Object v12 = new com.fasterxml.jackson.databind.node.ArrayNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v2),((java.util.List)v11));
    Object v13 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v14 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v12),((com.fasterxml.jackson.core.ObjectCodec)v13));
    Object v15 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v16 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v15));
    Object v17 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v16));
    Object v18 = true;
    Object v19 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v18).booleanValue()));
    Object v20 = true;
    Object v21 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v20).booleanValue()));
    Object v22 = true;
    Object v23 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v22).booleanValue()));
    Object v24 = true;
    Object v25 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v24).booleanValue()));
    Object v26 = true;
    Object v27 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v26).booleanValue()));
    Object v28 = java.util.List.of(((java.lang.Object)v21),((java.lang.Object)v23),((java.lang.Object)v25),((java.lang.Object)v27));
    Object v29 = new com.fasterxml.jackson.databind.node.ArrayNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v19),((java.util.List)v28));
    Object v30 = ((com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler)v0).complete(((com.fasterxml.jackson.core.JsonParser)v14),((com.fasterxml.jackson.databind.DeserializationContext)v17),((java.lang.Object)v29));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = true;
    Object v6 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = true;
    Object v10 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v6),((java.lang.Object)v8),((java.lang.Object)v10));
    Object v12 = new com.fasterxml.jackson.databind.node.ArrayNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v2),((java.util.List)v11));
    Object v13 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v14 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v12),((com.fasterxml.jackson.core.ObjectCodec)v13));
    Object v15 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v16 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v15));
    Object v17 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v16));
    Object v18 = "causi";
    Object v19 = ((com.fasterxml.jackson.databind.DeserializationContext)v17).mappingException(((java.lang.String)v18));
    Object v20 = "declaringCass";
    Object v21 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v22 = ((com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler)v0).handleTypePropertyValue(((com.fasterxml.jackson.core.JsonParser)v14),((com.fasterxml.jackson.databind.DeserializationContext)v17),((java.lang.String)v20),((java.lang.Object)v21));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = true;
    Object v6 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = true;
    Object v10 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v6),((java.lang.Object)v8),((java.lang.Object)v10));
    Object v12 = new com.fasterxml.jackson.databind.node.ArrayNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v2),((java.util.List)v11));
    Object v13 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v14 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v12),((com.fasterxml.jackson.core.ObjectCodec)v13));
    Object v15 = ((com.fasterxml.jackson.core.JsonParser)v14).nextFieldName();
    Object v16 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v17 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v17));
    Object v19 = "";
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v21 = ((com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler)v0).handlePropertyValue(((com.fasterxml.jackson.core.JsonParser)v14),((com.fasterxml.jackson.databind.DeserializationContext)v18),((java.lang.String)v19),((java.lang.Object)v20));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = true;
    Object v6 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = true;
    Object v10 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v6),((java.lang.Object)v8),((java.lang.Object)v10));
    Object v12 = new com.fasterxml.jackson.databind.node.ArrayNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v2),((java.util.List)v11));
    Object v13 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v14 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v12),((com.fasterxml.jackson.core.ObjectCodec)v13));
    Object v15 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v16 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v15));
    Object v17 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v16));
    Object v18 = "number";
    Object v19 = "string";
    Object v20 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v19));
    Object v21 = ((com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler)v0).handlePropertyValue(((com.fasterxml.jackson.core.JsonParser)v14),((com.fasterxml.jackson.databind.DeserializationContext)v17),((java.lang.String)v18),((java.lang.Object)v20));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = true;
    Object v6 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = true;
    Object v10 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v6),((java.lang.Object)v8),((java.lang.Object)v10));
    Object v12 = new com.fasterxml.jackson.databind.node.ArrayNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v2),((java.util.List)v11));
    Object v13 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v14 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v12),((com.fasterxml.jackson.core.ObjectCodec)v13));
    Object v15 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v16 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v15));
    Object v17 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v19 = 28;
    Object v20 = "]";
    ((com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler)v0)._deserializeAndSet(((com.fasterxml.jackson.core.JsonParser)v14),((com.fasterxml.jackson.databind.DeserializationContext)v17),((java.lang.Object)v18),(((java.lang.Integer)v19).intValue()),((java.lang.String)v20));
    Object v21 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = true;
    Object v6 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = true;
    Object v10 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v6),((java.lang.Object)v8),((java.lang.Object)v10));
    Object v12 = new com.fasterxml.jackson.databind.node.ArrayNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v2),((java.util.List)v11));
    Object v13 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v14 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v12),((com.fasterxml.jackson.core.ObjectCodec)v13));
    Object v15 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v16 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v15));
    Object v17 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v16));
    Object v18 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v19 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v18));
    Object v20 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v19));
    Object v21 = -7;
    Object v22 = "UTC";
    ((com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler)v0)._deserializeAndSet(((com.fasterxml.jackson.core.JsonParser)v14),((com.fasterxml.jackson.databind.DeserializationContext)v17),((java.lang.Object)v20),(((java.lang.Integer)v21).intValue()),((java.lang.String)v22));
    Object v23 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = "string";
    Object v1 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v0));
    Object v2 = java.util.EnumSet.of(((java.lang.Enum)v1));
    Object v3 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v2));
    Object v4 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v3));
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = java.util.EnumSet.of(((java.lang.Enum)v6));
    Object v8 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v7));
    Object v9 = ((com.fasterxml.jackson.databind.JavaType)v4).findSuperType(((java.lang.Class)v8));
    Object v10 = com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.builder(((com.fasterxml.jackson.databind.JavaType)v4));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = true;
    Object v6 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = true;
    Object v10 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v6),((java.lang.Object)v8),((java.lang.Object)v10));
    Object v12 = new com.fasterxml.jackson.databind.node.ArrayNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v2),((java.util.List)v11));
    Object v13 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v14 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v12),((com.fasterxml.jackson.core.ObjectCodec)v13));
    Object v15 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v16 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v15));
    Object v17 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v16));
    Object v18 = "string";
    Object v19 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v18));
    Object v20 = java.util.EnumSet.of(((java.lang.Enum)v19));
    Object v21 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v20));
    Object v22 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v21));
    Object v23 = "string";
    Object v24 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v23));
    Object v25 = java.util.EnumSet.of(((java.lang.Enum)v24));
    Object v26 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v25));
    Object v27 = ((com.fasterxml.jackson.databind.JavaType)v22).forcedNarrowBy(((java.lang.Class)v26));
    Object v28 = com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.builder(((com.fasterxml.jackson.databind.JavaType)v22));
    Object v29 = ((com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler)v0).complete(((com.fasterxml.jackson.core.JsonParser)v14),((com.fasterxml.jackson.databind.DeserializationContext)v17),((java.lang.Object)v28));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = true;
    Object v6 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = true;
    Object v10 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v6),((java.lang.Object)v8),((java.lang.Object)v10));
    Object v12 = new com.fasterxml.jackson.databind.node.ArrayNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v2),((java.util.List)v11));
    Object v13 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v14 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v12),((com.fasterxml.jackson.core.ObjectCodec)v13));
    Object v15 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v16 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v15));
    Object v17 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v16));
    Object v18 = "array";
    Object v19 = "string";
    Object v20 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v19));
    Object v21 = ((com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler)v0).handleTypePropertyValue(((com.fasterxml.jackson.core.JsonParser)v14),((com.fasterxml.jackson.databind.DeserializationContext)v17),((java.lang.String)v18),((java.lang.Object)v20));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = true;
    Object v6 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = true;
    Object v10 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v6),((java.lang.Object)v8),((java.lang.Object)v10));
    Object v12 = new com.fasterxml.jackson.databind.node.ArrayNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v2),((java.util.List)v11));
    Object v13 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v14 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v12),((com.fasterxml.jackson.core.ObjectCodec)v13));
    Object v15 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v16 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v15));
    Object v17 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v16));
    Object v18 = 1;
    Object v19 = "I";
    Object v20 = ((com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler)v0)._deserialize(((com.fasterxml.jackson.core.JsonParser)v14),((com.fasterxml.jackson.databind.DeserializationContext)v17),(((java.lang.Integer)v18).intValue()),((java.lang.String)v19));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = "string";
    Object v1 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v0));
    Object v2 = java.util.EnumSet.of(((java.lang.Enum)v1));
    Object v3 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v2));
    Object v4 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v3));
    Object v5 = ((com.fasterxml.jackson.core.type.ResolvedType)v4).toCanonical();
    Object v6 = com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.builder(((com.fasterxml.jackson.databind.JavaType)v4));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = true;
    Object v6 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = true;
    Object v10 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v6),((java.lang.Object)v8),((java.lang.Object)v10));
    Object v12 = new com.fasterxml.jackson.databind.node.ArrayNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v2),((java.util.List)v11));
    Object v13 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v14 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v12),((com.fasterxml.jackson.core.ObjectCodec)v13));
    Object v15 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v16 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v15));
    Object v17 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v16));
    Object v18 = "3";
    Object v19 = new java.lang.Object[]{null,null};
    Object v20 = ((com.fasterxml.jackson.databind.DeserializationContext)v17).mappingException(((java.lang.String)v18),((java.lang.Object[])v19));
    Object v21 = 19;
    Object v22 = "*";
    Object v23 = ((com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler)v0)._deserialize(((com.fasterxml.jackson.core.JsonParser)v14),((com.fasterxml.jackson.databind.DeserializationContext)v17),(((java.lang.Integer)v21).intValue()),((java.lang.String)v22));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = true;
    Object v6 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = true;
    Object v10 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v6),((java.lang.Object)v8),((java.lang.Object)v10));
    Object v12 = new com.fasterxml.jackson.databind.node.ArrayNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v2),((java.util.List)v11));
    Object v13 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v14 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v12),((com.fasterxml.jackson.core.ObjectCodec)v13));
    Object v15 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v16 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v15));
    Object v17 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v16));
    Object v18 = new com.fasterxml.jackson.databind.util.ObjectBuffer();
    ((com.fasterxml.jackson.databind.DeserializationContext)v17).returnObjectBuffer(((com.fasterxml.jackson.databind.util.ObjectBuffer)v18));
    Object v19 = null;
    Object v20 = "Cannot upgrade from an instance of ";
    Object v21 = java.time.Instant.now();
    Object v22 = ((com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler)v0).handlePropertyValue(((com.fasterxml.jackson.core.JsonParser)v14),((com.fasterxml.jackson.databind.DeserializationContext)v17),((java.lang.String)v20),((java.lang.Object)v21));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = true;
    Object v6 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = true;
    Object v10 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v6),((java.lang.Object)v8),((java.lang.Object)v10));
    Object v12 = new com.fasterxml.jackson.databind.node.ArrayNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v2),((java.util.List)v11));
    Object v13 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v14 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v12),((com.fasterxml.jackson.core.ObjectCodec)v13));
    Object v15 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v16 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v15));
    Object v17 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v16));
    Object v18 = "string";
    Object v19 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v18));
    Object v20 = java.util.EnumSet.of(((java.lang.Enum)v19));
    Object v21 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v20));
    Object v22 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v21));
    Object v23 = new java.util.concurrent.atomic.AtomicReference();
    Object v24 = ((com.fasterxml.jackson.databind.DeserializationContext)v17).hasValueDeserializerFor(((com.fasterxml.jackson.databind.JavaType)v22),((java.util.concurrent.atomic.AtomicReference)v23));
    Object v25 = new java.util.concurrent.atomic.AtomicReference();
    Object v26 = ((com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler)v0).complete(((com.fasterxml.jackson.core.JsonParser)v14),((com.fasterxml.jackson.databind.DeserializationContext)v17),((java.lang.Object)v25));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = true;
    Object v6 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = true;
    Object v10 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v6),((java.lang.Object)v8),((java.lang.Object)v10));
    Object v12 = new com.fasterxml.jackson.databind.node.ArrayNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v2),((java.util.List)v11));
    Object v13 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v14 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v12),((com.fasterxml.jackson.core.ObjectCodec)v13));
    Object v15 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v16 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v15));
    Object v17 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v16));
    Object v18 = "enum";
    Object v19 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v20 = ((com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler)v0).handleTypePropertyValue(((com.fasterxml.jackson.core.JsonParser)v14),((com.fasterxml.jackson.databind.DeserializationContext)v17),((java.lang.String)v18),((java.lang.Object)v19));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = true;
    Object v6 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = true;
    Object v10 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v6),((java.lang.Object)v8),((java.lang.Object)v10));
    Object v12 = new com.fasterxml.jackson.databind.node.ArrayNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v2),((java.util.List)v11));
    Object v13 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v14 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v12),((com.fasterxml.jackson.core.ObjectCodec)v13));
    Object v15 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v16 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v15));
    Object v17 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v16));
    Object v18 = "Internal error: class %s not included as super-type for %s";
    Object v19 = "string";
    Object v20 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v19));
    Object v21 = java.util.EnumSet.of(((java.lang.Enum)v20));
    Object v22 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v21));
    Object v23 = "'";
    Object v24 = ((com.fasterxml.jackson.databind.DeserializationContext)v17).weirdStringException(((java.lang.String)v18),((java.lang.Class)v22),((java.lang.String)v23));
    Object v25 = "string";
    Object v26 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v25));
    Object v27 = 41;
    Object v28 = "number";
    ((com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler)v0)._deserializeAndSet(((com.fasterxml.jackson.core.JsonParser)v14),((com.fasterxml.jackson.databind.DeserializationContext)v17),((java.lang.Object)v26),(((java.lang.Integer)v27).intValue()),((java.lang.String)v28));
    Object v29 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = true;
    Object v6 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = true;
    Object v10 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v6),((java.lang.Object)v8),((java.lang.Object)v10));
    Object v12 = new com.fasterxml.jackson.databind.node.ArrayNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v2),((java.util.List)v11));
    Object v13 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v14 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v12),((com.fasterxml.jackson.core.ObjectCodec)v13));
    Object v15 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v16 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v15));
    Object v17 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v16));
    Object v18 = "AnnotationIntrospector returned CXlass ";
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v20 = ((com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler)v0).handlePropertyValue(((com.fasterxml.jackson.core.JsonParser)v14),((com.fasterxml.jackson.databind.DeserializationContext)v17),((java.lang.String)v18),((java.lang.Object)v19));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = true;
    Object v6 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = true;
    Object v10 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v6),((java.lang.Object)v8),((java.lang.Object)v10));
    Object v12 = new com.fasterxml.jackson.databind.node.ArrayNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v2),((java.util.List)v11));
    Object v13 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v14 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v12),((com.fasterxml.jackson.core.ObjectCodec)v13));
    Object v15 = 0;
    Object v16 = ((com.fasterxml.jackson.core.JsonParser)v14).hasTokenId((((java.lang.Integer)v15).intValue()));
    Object v17 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v18 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v17));
    Object v19 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v18));
    Object v20 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v21 = 0;
    Object v22 = "Cannot upgrad? from an instance of ";
    ((com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler)v0)._deserializeAndSet(((com.fasterxml.jackson.core.JsonParser)v14),((com.fasterxml.jackson.databind.DeserializationContext)v19),((java.lang.Object)v20),(((java.lang.Integer)v21).intValue()),((java.lang.String)v22));
    Object v23 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = true;
    Object v6 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = true;
    Object v10 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v6),((java.lang.Object)v8),((java.lang.Object)v10));
    Object v12 = new com.fasterxml.jackson.databind.node.ArrayNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v2),((java.util.List)v11));
    Object v13 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v14 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v12),((com.fasterxml.jackson.core.ObjectCodec)v13));
    Object v15 = ((com.fasterxml.jackson.core.JsonParser)v14).getLastClearedToken();
    Object v16 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v17 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v17));
    Object v19 = new com.fasterxml.jackson.databind.util.ObjectBuffer();
    Object v20 = ((com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler)v0).complete(((com.fasterxml.jackson.core.JsonParser)v14),((com.fasterxml.jackson.databind.DeserializationContext)v18),((java.lang.Object)v19));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = true;
    Object v6 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = true;
    Object v10 = com.fasterxml.jackson.databind.node.JsonNodeFactory.withExactBigDecimals((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v6),((java.lang.Object)v8),((java.lang.Object)v10));
    Object v12 = new com.fasterxml.jackson.databind.node.ArrayNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v2),((java.util.List)v11));
    Object v13 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v14 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v12),((com.fasterxml.jackson.core.ObjectCodec)v13));
    Object v15 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v16 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v15));
    Object v17 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v16));
    Object v18 = "X";
    Object v19 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v20 = ((com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler)v0).handlePropertyValue(((com.fasterxml.jackson.core.JsonParser)v14),((com.fasterxml.jackson.databind.DeserializationContext)v17),((java.lang.String)v18),((java.lang.Object)v19));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }
}
