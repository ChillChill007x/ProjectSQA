package com.fasterxml.jackson.databind.deser;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = false;
    Object v2 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v2));
    Object v4 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v3),((com.fasterxml.jackson.core.ObjectCodec)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = "";
    Object v12 = ((com.fasterxml.jackson.databind.DeserializationContext)v10).mappingException(((java.lang.String)v11));
    Object v13 = 45;
    Object v14 = new java.util.HashMap((((java.lang.Integer)v13).intValue()));
    Object v15 = ((com.fasterxml.jackson.databind.deser.BeanDeserializer)v0).deserialize(((com.fasterxml.jackson.core.JsonParser)v7),((com.fasterxml.jackson.databind.DeserializationContext)v10),((java.lang.Object)v14));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new java.lang.Object[]{null};
    Object v2 = com.fasterxml.jackson.databind.util.ArrayBuilders.arrayToSet(((java.lang.Object[])v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializer(((com.fasterxml.jackson.databind.deser.BeanDeserializerBase)v0),((java.util.Set)v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.DocumentDeserializer();
    Object v1 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).getDelegatee();
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 1;
    Object v2 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerBase)v0).findProperty((((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 7;
    Object v2 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerBase)v0).findProperty((((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.DocumentDeserializer();
    Object v1 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v2 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).getNullValue(((com.fasterxml.jackson.databind.DeserializationContext)v3));
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerBase)v0).getNullAccessPattern();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.DocumentDeserializer();
    Object v1 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).getNullValue();
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v2 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v2));
    ((com.fasterxml.jackson.databind.deser.BeanDeserializerBase)v0).resolve(((com.fasterxml.jackson.databind.DeserializationContext)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.DocumentDeserializer();
    Object v1 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v0).getValueClass();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = false;
    Object v2 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v2));
    Object v4 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v3),((com.fasterxml.jackson.core.ObjectCodec)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerBase)v0).deserializeFromNumber(((com.fasterxml.jackson.core.JsonParser)v7),((com.fasterxml.jackson.databind.DeserializationContext)v10));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v2 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder(((com.fasterxml.jackson.databind.BeanDescription)v0),((com.fasterxml.jackson.databind.DeserializationContext)v3));
    Object v5 = null;
    Object v6 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v9 = new com.fasterxml.jackson.databind.type.ResolvedRecursiveType(((java.lang.Class)v7),((com.fasterxml.jackson.databind.type.TypeBindings)v8));
    Object v10 = null;
    Object v11 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v5),((com.fasterxml.jackson.databind.JavaType)v9),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v10));
    Object v12 = 1;
    Object v13 = new java.util.ArrayList((((java.lang.Integer)v12).intValue()));
    Object v14 = true;
    Object v15 = 45;
    Object v16 = new java.util.HashMap((((java.lang.Integer)v15).intValue()));
    Object v17 = com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap.construct(((java.util.Collection)v13),(((java.lang.Boolean)v14).booleanValue()),((java.util.Map)v16));
    Object v18 = 45;
    Object v19 = new java.util.HashMap((((java.lang.Integer)v18).intValue()));
    Object v20 = new java.lang.Object[]{null};
    Object v21 = com.fasterxml.jackson.databind.util.ArrayBuilders.arrayToSet(((java.lang.Object[])v20));
    Object v22 = false;
    Object v23 = false;
    Object v24 = new com.fasterxml.jackson.databind.deser.BeanDeserializer(((com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder)v4),((com.fasterxml.jackson.databind.BeanDescription)v11),((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v17),((java.util.Map)v19),((java.util.HashSet)v21),(((java.lang.Boolean)v22).booleanValue()),(((java.lang.Boolean)v23).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerBase)v0).getKnownPropertyNames();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new java.lang.Object[]{null};
    Object v2 = com.fasterxml.jackson.databind.util.ArrayBuilders.arrayToSet(((java.lang.Object[])v1));
    Object v3 = ((com.fasterxml.jackson.databind.deser.BeanDeserializer)v0).withIgnorableProperties(((java.util.Set)v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = false;
    Object v2 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v2));
    Object v4 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v3),((com.fasterxml.jackson.core.ObjectCodec)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerBase)v0).deserializeFromEmbedded(((com.fasterxml.jackson.core.JsonParser)v7),((com.fasterxml.jackson.databind.DeserializationContext)v10));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.DocumentDeserializer();
    Object v1 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.DocumentDeserializer();
    Object v2 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).replaceDelegatee(((com.fasterxml.jackson.databind.JsonDeserializer)v1));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v2 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder(((com.fasterxml.jackson.databind.BeanDescription)v0),((com.fasterxml.jackson.databind.DeserializationContext)v3));
    Object v5 = null;
    Object v6 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v9 = new com.fasterxml.jackson.databind.type.ResolvedRecursiveType(((java.lang.Class)v7),((com.fasterxml.jackson.databind.type.TypeBindings)v8));
    Object v10 = null;
    Object v11 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v5),((com.fasterxml.jackson.databind.JavaType)v9),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v10));
    Object v12 = 1;
    Object v13 = new java.util.ArrayList((((java.lang.Integer)v12).intValue()));
    Object v14 = true;
    Object v15 = 45;
    Object v16 = new java.util.HashMap((((java.lang.Integer)v15).intValue()));
    Object v17 = com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap.construct(((java.util.Collection)v13),(((java.lang.Boolean)v14).booleanValue()),((java.util.Map)v16));
    Object v18 = 45;
    Object v19 = new java.util.HashMap((((java.lang.Integer)v18).intValue()));
    Object v20 = new java.lang.Object[]{null};
    Object v21 = com.fasterxml.jackson.databind.util.ArrayBuilders.arrayToSet(((java.lang.Object[])v20));
    Object v22 = true;
    Object v23 = true;
    Object v24 = new com.fasterxml.jackson.databind.deser.BeanDeserializer(((com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder)v4),((com.fasterxml.jackson.databind.BeanDescription)v11),((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v17),((java.util.Map)v19),((java.util.HashSet)v21),(((java.lang.Boolean)v22).booleanValue()),(((java.lang.Boolean)v23).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = false;
    Object v2 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v2));
    Object v4 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v3),((com.fasterxml.jackson.core.ObjectCodec)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = ((com.fasterxml.jackson.databind.deser.BeanDeserializer)v0).deserializeFromObject(((com.fasterxml.jackson.core.JsonParser)v7),((com.fasterxml.jackson.databind.DeserializationContext)v10));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "";
    Object v2 = "UT";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.deser.BeanDeserializer)v0).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerBase)v0).properties();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerBase)v0).creatorProperties();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = false;
    Object v2 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v2));
    Object v4 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v3),((com.fasterxml.jackson.core.ObjectCodec)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    ((com.fasterxml.jackson.databind.DeserializationContext)v10).checkUnresolvedObjectId();
    Object v11 = null;
    Object v12 = ((com.fasterxml.jackson.databind.deser.BeanDeserializer)v0).deserializeWithExternalTypeId(((com.fasterxml.jackson.core.JsonParser)v7),((com.fasterxml.jackson.databind.DeserializationContext)v10));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = false;
    Object v2 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v2));
    Object v4 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v3),((com.fasterxml.jackson.core.ObjectCodec)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = ((com.fasterxml.jackson.databind.deser.BeanDeserializer)v0).deserializeWithExternalTypeId(((com.fasterxml.jackson.core.JsonParser)v7),((com.fasterxml.jackson.databind.DeserializationContext)v10));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = false;
    Object v2 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v2));
    Object v4 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v3),((com.fasterxml.jackson.core.ObjectCodec)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = 0;
    Object v12 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v13 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v12));
    Object v14 = "B";
    Object v15 = ((com.fasterxml.jackson.databind.DeserializationContext)v10).weirdNumberException(((java.lang.Number)v11),((java.lang.Class)v13),((java.lang.String)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v16));
    Object v18 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.DocumentDeserializer();
    Object v19 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v18).getValueClass();
    Object v20 = ((java.lang.Class)v19).getGenericInterfaces();
    Object v21 = ((com.fasterxml.jackson.databind.deser.BeanDeserializer)v0).deserializeWithView(((com.fasterxml.jackson.core.JsonParser)v7),((com.fasterxml.jackson.databind.DeserializationContext)v10),((java.lang.Object)v17),((java.lang.Class)v19));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.DocumentDeserializer();
    Object v1 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).getEmptyValue();
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = false;
    Object v2 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v2));
    Object v4 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v3),((com.fasterxml.jackson.core.ObjectCodec)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v12 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v11));
    Object v13 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v12));
    Object v14 = ((com.fasterxml.jackson.databind.deser.BeanDeserializer)v0).deserialize(((com.fasterxml.jackson.core.JsonParser)v7),((com.fasterxml.jackson.databind.DeserializationContext)v10),((java.lang.Object)v13));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = false;
    Object v2 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v2));
    Object v4 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v3),((com.fasterxml.jackson.core.ObjectCodec)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = ((com.fasterxml.jackson.databind.deser.BeanDeserializer)v0).deserializeUsingPropertyBasedWithUnwrapped(((com.fasterxml.jackson.core.JsonParser)v7),((com.fasterxml.jackson.databind.DeserializationContext)v10));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = false;
    Object v2 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v2));
    Object v4 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v3),((com.fasterxml.jackson.core.ObjectCodec)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v12 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v14 = new com.fasterxml.jackson.databind.type.ResolvedRecursiveType(((java.lang.Class)v12),((com.fasterxml.jackson.databind.type.TypeBindings)v13));
    Object v15 = null;
    Object v16 = "9integer";
    Object v17 = false;
    Object v18 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v19 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v21 = new com.fasterxml.jackson.databind.type.ResolvedRecursiveType(((java.lang.Class)v19),((com.fasterxml.jackson.databind.type.TypeBindings)v20));
    Object v22 = new com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v14),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v15),((java.lang.String)v16),(((java.lang.Boolean)v17).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v21));
    Object v23 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerBase)v0).deserializeWithType(((com.fasterxml.jackson.core.JsonParser)v7),((com.fasterxml.jackson.databind.DeserializationContext)v10),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v22));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = false;
    Object v2 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v2));
    Object v4 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v3),((com.fasterxml.jackson.core.ObjectCodec)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerBase)v0).deserializeFromBoolean(((com.fasterxml.jackson.core.JsonParser)v7),((com.fasterxml.jackson.databind.DeserializationContext)v10));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = false;
    Object v2 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v2));
    Object v4 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v3),((com.fasterxml.jackson.core.ObjectCodec)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = ((com.fasterxml.jackson.databind.deser.BeanDeserializer)v0).deserializeFromNull(((com.fasterxml.jackson.core.JsonParser)v7),((com.fasterxml.jackson.databind.DeserializationContext)v10));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = false;
    Object v2 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v2));
    Object v4 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v3),((com.fasterxml.jackson.core.ObjectCodec)v6));
    Object v8 = ((com.fasterxml.jackson.core.JsonParser)v7).getParsingContext();
    Object v9 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v10 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v13 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v15 = new com.fasterxml.jackson.databind.type.ResolvedRecursiveType(((java.lang.Class)v13),((com.fasterxml.jackson.databind.type.TypeBindings)v14));
    Object v16 = "Invalid delegate-creator definition for %s: value instantiator (%s=) returned true for 'canCreateUsingArrayDelegate()', but null for 'getArrayDelegateType()'";
    Object v17 = "strinD";
    Object v18 = ((com.fasterxml.jackson.databind.DeserializationContext)v11).invalidTypeIdException(((com.fasterxml.jackson.databind.JavaType)v15),((java.lang.String)v16),((java.lang.String)v17));
    Object v19 = ((com.fasterxml.jackson.databind.deser.BeanDeserializer)v0).deserializeFromNull(((com.fasterxml.jackson.core.JsonParser)v7),((com.fasterxml.jackson.databind.DeserializationContext)v11));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = false;
    Object v2 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v2));
    Object v4 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v3),((com.fasterxml.jackson.core.ObjectCodec)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = ((com.fasterxml.jackson.databind.deser.BeanDeserializer)v0).deserializeUsingPropertyBasedWithExternalTypeId(((com.fasterxml.jackson.core.JsonParser)v7),((com.fasterxml.jackson.databind.DeserializationContext)v10));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = false;
    Object v2 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v2));
    Object v4 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v3),((com.fasterxml.jackson.core.ObjectCodec)v6));
    Object v8 = -26;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v7).setFeatureMask((((java.lang.Integer)v8).intValue()));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerBase)v0).deserializeFromString(((com.fasterxml.jackson.core.JsonParser)v7),((com.fasterxml.jackson.databind.DeserializationContext)v12));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = false;
    Object v2 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v2));
    Object v4 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v3),((com.fasterxml.jackson.core.ObjectCodec)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v12 = ((com.fasterxml.jackson.databind.deser.BeanDeserializer)v0).deserialize(((com.fasterxml.jackson.core.JsonParser)v7),((com.fasterxml.jackson.databind.DeserializationContext)v10),((java.lang.Object)v11));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v2 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder(((com.fasterxml.jackson.databind.BeanDescription)v0),((com.fasterxml.jackson.databind.DeserializationContext)v3));
    Object v5 = null;
    Object v6 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v9 = new com.fasterxml.jackson.databind.type.ResolvedRecursiveType(((java.lang.Class)v7),((com.fasterxml.jackson.databind.type.TypeBindings)v8));
    Object v10 = null;
    Object v11 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v5),((com.fasterxml.jackson.databind.JavaType)v9),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v10));
    Object v12 = com.fasterxml.jackson.annotation.JsonInclude.Value.empty();
    Object v13 = ((com.fasterxml.jackson.databind.BeanDescription)v11).findPropertyInclusion(((com.fasterxml.jackson.annotation.JsonInclude.Value)v12));
    Object v14 = 1;
    Object v15 = new java.util.ArrayList((((java.lang.Integer)v14).intValue()));
    Object v16 = true;
    Object v17 = 45;
    Object v18 = new java.util.HashMap((((java.lang.Integer)v17).intValue()));
    Object v19 = com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap.construct(((java.util.Collection)v15),(((java.lang.Boolean)v16).booleanValue()),((java.util.Map)v18));
    Object v20 = 45;
    Object v21 = new java.util.HashMap((((java.lang.Integer)v20).intValue()));
    Object v22 = new java.lang.Object[]{null};
    Object v23 = com.fasterxml.jackson.databind.util.ArrayBuilders.arrayToSet(((java.lang.Object[])v22));
    Object v24 = false;
    Object v25 = true;
    Object v26 = new com.fasterxml.jackson.databind.deser.BeanDeserializer(((com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder)v4),((com.fasterxml.jackson.databind.BeanDescription)v11),((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v19),((java.util.Map)v21),((java.util.HashSet)v23),(((java.lang.Boolean)v24).booleanValue()),(((java.lang.Boolean)v25).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = false;
    Object v2 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v2));
    Object v4 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v3),((com.fasterxml.jackson.core.ObjectCodec)v6));
    Object v8 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.DocumentDeserializer();
    Object v9 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v8).getValueClass();
    Object v10 = ((com.fasterxml.jackson.core.JsonParser)v7).readValuesAs(((java.lang.Class)v9));
    Object v11 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v12 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v11));
    Object v13 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v15 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v17 = new com.fasterxml.jackson.databind.type.ResolvedRecursiveType(((java.lang.Class)v15),((com.fasterxml.jackson.databind.type.TypeBindings)v16));
    Object v18 = null;
    Object v19 = "9integer";
    Object v20 = false;
    Object v21 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v22 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v21));
    Object v23 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v24 = new com.fasterxml.jackson.databind.type.ResolvedRecursiveType(((java.lang.Class)v22),((com.fasterxml.jackson.databind.type.TypeBindings)v23));
    Object v25 = new com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v17),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v18),((java.lang.String)v19),(((java.lang.Boolean)v20).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v24));
    Object v26 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerBase)v0).deserializeWithType(((com.fasterxml.jackson.core.JsonParser)v7),((com.fasterxml.jackson.databind.DeserializationContext)v13),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v25));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = false;
    Object v2 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v2));
    Object v4 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v3),((com.fasterxml.jackson.core.ObjectCodec)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = ((com.fasterxml.jackson.databind.deser.BeanDeserializer)v0).deserializeWithUnwrapped(((com.fasterxml.jackson.core.JsonParser)v7),((com.fasterxml.jackson.databind.DeserializationContext)v10));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = false;
    Object v2 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v2));
    Object v4 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v3),((com.fasterxml.jackson.core.ObjectCodec)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = ((com.fasterxml.jackson.databind.deser.BeanDeserializer)v0).deserialize(((com.fasterxml.jackson.core.JsonParser)v7),((com.fasterxml.jackson.databind.DeserializationContext)v10));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = false;
    Object v2 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v2));
    Object v4 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v3),((com.fasterxml.jackson.core.ObjectCodec)v6));
    Object v8 = ((com.fasterxml.jackson.core.JsonParser)v7).nextBooleanValue();
    Object v9 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v10 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v10));
    Object v12 = ((com.fasterxml.jackson.databind.deser.BeanDeserializer)v0).deserializeWithUnwrapped(((com.fasterxml.jackson.core.JsonParser)v7),((com.fasterxml.jackson.databind.DeserializationContext)v11));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = false;
    Object v2 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v2));
    Object v4 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v3),((com.fasterxml.jackson.core.ObjectCodec)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = 45;
    Object v12 = new java.util.HashMap((((java.lang.Integer)v11).intValue()));
    Object v13 = ((com.fasterxml.jackson.databind.deser.BeanDeserializer)v0).deserialize(((com.fasterxml.jackson.core.JsonParser)v7),((com.fasterxml.jackson.databind.DeserializationContext)v10),((java.lang.Object)v12));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = false;
    Object v2 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v2));
    Object v4 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v3),((com.fasterxml.jackson.core.ObjectCodec)v6));
    Object v8 = ((com.fasterxml.jackson.core.JsonParser)v7).readValueAsTree();
    Object v9 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v10 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v10));
    Object v12 = 1;
    Object v13 = new java.util.ArrayList((((java.lang.Integer)v12).intValue()));
    Object v14 = ((com.fasterxml.jackson.databind.deser.BeanDeserializer)v0).deserializeWithExternalTypeId(((com.fasterxml.jackson.core.JsonParser)v7),((com.fasterxml.jackson.databind.DeserializationContext)v11),((java.lang.Object)v13));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.DocumentDeserializer();
    Object v1 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v2 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v7 = new com.fasterxml.jackson.databind.type.ResolvedRecursiveType(((java.lang.Class)v5),((com.fasterxml.jackson.databind.type.TypeBindings)v6));
    Object v8 = "INFER_CREATOR_FR";
    Object v9 = ((com.fasterxml.jackson.databind.DeserializationContext)v3).missingTypeIdException(((com.fasterxml.jackson.databind.JavaType)v7),((java.lang.String)v8));
    Object v10 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).getNullValue(((com.fasterxml.jackson.databind.DeserializationContext)v3));
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = false;
    Object v2 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v2));
    Object v4 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v3),((com.fasterxml.jackson.core.ObjectCodec)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v12 = "Cannot pass null modifier";
    Object v13 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.DocumentDeserializer();
    ((com.fasterxml.jackson.databind.DeserializationContext)v10).reportUnknownProperty(((java.lang.Object)v11),((java.lang.String)v12),((com.fasterxml.jackson.databind.JsonDeserializer)v13));
    Object v14 = null;
    Object v15 = ((com.fasterxml.jackson.databind.deser.BeanDeserializer)v0).deserializeWithUnwrapped(((com.fasterxml.jackson.core.JsonParser)v7),((com.fasterxml.jackson.databind.DeserializationContext)v10));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = false;
    Object v2 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v2));
    Object v4 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v3),((com.fasterxml.jackson.core.ObjectCodec)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerBase)v0).deserializeFromArray(((com.fasterxml.jackson.core.JsonParser)v7),((com.fasterxml.jackson.databind.DeserializationContext)v10));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = false;
    Object v2 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v2));
    Object v4 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v3),((com.fasterxml.jackson.core.ObjectCodec)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v12 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v14 = new com.fasterxml.jackson.databind.type.ResolvedRecursiveType(((java.lang.Class)v12),((com.fasterxml.jackson.databind.type.TypeBindings)v13));
    Object v15 = "string";
    Object v16 = ((com.fasterxml.jackson.databind.DeserializationContext)v10).missingTypeIdException(((com.fasterxml.jackson.databind.JavaType)v14),((java.lang.String)v15));
    Object v17 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerBase)v0).deserializeFromArray(((com.fasterxml.jackson.core.JsonParser)v7),((com.fasterxml.jackson.databind.DeserializationContext)v10));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "]";
    Object v2 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerBase)v0).findProperty(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = false;
    Object v2 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v2));
    Object v4 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v3),((com.fasterxml.jackson.core.ObjectCodec)v6));
    Object v8 = ((com.fasterxml.jackson.core.JsonParser)v7).nextFieldName();
    Object v9 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v10 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v10));
    Object v12 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerBase)v0).deserializeFromEmbedded(((com.fasterxml.jackson.core.JsonParser)v7),((com.fasterxml.jackson.databind.DeserializationContext)v11));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = false;
    Object v2 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v2));
    Object v4 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v3),((com.fasterxml.jackson.core.ObjectCodec)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v12 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v14 = new com.fasterxml.jackson.databind.type.ResolvedRecursiveType(((java.lang.Class)v12),((com.fasterxml.jackson.databind.type.TypeBindings)v13));
    Object v15 = "";
    Object v16 = ((com.fasterxml.jackson.databind.DeserializationContext)v10).missingTypeIdException(((com.fasterxml.jackson.databind.JavaType)v14),((java.lang.String)v15));
    Object v17 = ((com.fasterxml.jackson.databind.deser.BeanDeserializer)v0).deserializeUsingPropertyBasedWithExternalTypeId(((com.fasterxml.jackson.core.JsonParser)v7),((com.fasterxml.jackson.databind.DeserializationContext)v10));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.DocumentDeserializer();
    Object v1 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v2 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v2));
    Object v4 = ((com.fasterxml.jackson.databind.DeserializationContext)v3).getArrayBuilders();
    Object v5 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).getNullValue(((com.fasterxml.jackson.databind.DeserializationContext)v3));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializer(((com.fasterxml.jackson.databind.deser.BeanDeserializerBase)v0));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = false;
    Object v2 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v2));
    Object v4 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v3),((com.fasterxml.jackson.core.ObjectCodec)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.DocumentDeserializer();
    Object v12 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v11).getValueClass();
    Object v13 = ((com.fasterxml.jackson.databind.DeserializationContext)v10).endOfInputException(((java.lang.Class)v12));
    Object v14 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v15 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.DocumentDeserializer();
    Object v16 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v15).getValueClass();
    Object v17 = ((com.fasterxml.jackson.databind.deser.BeanDeserializer)v0).deserializeWithView(((com.fasterxml.jackson.core.JsonParser)v7),((com.fasterxml.jackson.databind.DeserializationContext)v10),((java.lang.Object)v14),((java.lang.Class)v16));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = false;
    Object v2 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v2));
    Object v4 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v3),((com.fasterxml.jackson.core.ObjectCodec)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = com.fasterxml.jackson.annotation.JsonInclude.Value.empty();
    Object v12 = ((com.fasterxml.jackson.databind.deser.BeanDeserializer)v0).deserialize(((com.fasterxml.jackson.core.JsonParser)v7),((com.fasterxml.jackson.databind.DeserializationContext)v10),((java.lang.Object)v11));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.DocumentDeserializer();
    Object v1 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v2 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = "";
    Object v7 = ", ";
    Object v8 = ((com.fasterxml.jackson.databind.DeserializationContext)v3).weirdKeyException(((java.lang.Class)v5),((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).getNullValue(((com.fasterxml.jackson.databind.DeserializationContext)v3));
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = false;
    Object v2 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v2));
    Object v4 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v3),((com.fasterxml.jackson.core.ObjectCodec)v6));
    Object v8 = ((com.fasterxml.jackson.core.JsonParser)v7).getCodec();
    Object v9 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v10 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v10));
    Object v12 = ((com.fasterxml.jackson.databind.deser.BeanDeserializer)v0).deserializeWithExternalTypeId(((com.fasterxml.jackson.core.JsonParser)v7),((com.fasterxml.jackson.databind.DeserializationContext)v11));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = false;
    Object v2 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v2));
    Object v4 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v3),((com.fasterxml.jackson.core.ObjectCodec)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = com.fasterxml.jackson.annotation.JsonInclude.Value.empty();
    Object v12 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v13 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v12));
    Object v14 = ((com.fasterxml.jackson.databind.deser.BeanDeserializer)v0).deserializeWithView(((com.fasterxml.jackson.core.JsonParser)v7),((com.fasterxml.jackson.databind.DeserializationContext)v10),((java.lang.Object)v11),((java.lang.Class)v13));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = false;
    Object v2 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v2));
    Object v4 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v3),((com.fasterxml.jackson.core.ObjectCodec)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v12 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v14 = new com.fasterxml.jackson.databind.type.ResolvedRecursiveType(((java.lang.Class)v12),((com.fasterxml.jackson.databind.type.TypeBindings)v13));
    Object v15 = "org.hibernate.proxy.";
    Object v16 = "NULL";
    Object v17 = ((com.fasterxml.jackson.databind.DeserializationContext)v10).unknownTypeException(((com.fasterxml.jackson.databind.JavaType)v14),((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v19 = ((com.fasterxml.jackson.databind.deser.BeanDeserializer)v0).deserializeWithExternalTypeId(((com.fasterxml.jackson.core.JsonParser)v7),((com.fasterxml.jackson.databind.DeserializationContext)v10),((java.lang.Object)v18));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = false;
    Object v2 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v2));
    Object v4 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v3),((com.fasterxml.jackson.core.ObjectCodec)v6));
    Object v8 = 0L;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v7).nextLongValue((((java.lang.Long)v8).longValue()));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = 1;
    Object v14 = new java.util.ArrayList((((java.lang.Integer)v13).intValue()));
    Object v15 = "";
    Object v16 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.DocumentDeserializer();
    ((com.fasterxml.jackson.databind.DeserializationContext)v12).reportUnknownProperty(((java.lang.Object)v14),((java.lang.String)v15),((com.fasterxml.jackson.databind.JsonDeserializer)v16));
    Object v17 = null;
    Object v18 = ((com.fasterxml.jackson.databind.deser.BeanDeserializer)v0)._deserializeUsingPropertyBased(((com.fasterxml.jackson.core.JsonParser)v7),((com.fasterxml.jackson.databind.DeserializationContext)v12));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "set";
    Object v2 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerBase)v0).findBackReference(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = false;
    Object v2 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v2));
    Object v4 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v3),((com.fasterxml.jackson.core.ObjectCodec)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v12 = ((com.fasterxml.jackson.databind.deser.BeanDeserializer)v0).deserializeWithUnwrapped(((com.fasterxml.jackson.core.JsonParser)v7),((com.fasterxml.jackson.databind.DeserializationContext)v10),((java.lang.Object)v11));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = false;
    Object v2 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v2));
    Object v4 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v3),((com.fasterxml.jackson.core.ObjectCodec)v6));
    Object v8 = 1;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v7).nextIntValue((((java.lang.Integer)v8).intValue()));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerBase)v0).deserializeFromDouble(((com.fasterxml.jackson.core.JsonParser)v7),((com.fasterxml.jackson.databind.DeserializationContext)v12));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = false;
    Object v2 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v2));
    Object v4 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v3),((com.fasterxml.jackson.core.ObjectCodec)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v12 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v14 = new com.fasterxml.jackson.databind.type.ResolvedRecursiveType(((java.lang.Class)v12),((com.fasterxml.jackson.databind.type.TypeBindings)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v16 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v15));
    Object v17 = ((com.fasterxml.jackson.databind.DatabindContext)v10).constructSpecializedType(((com.fasterxml.jackson.databind.JavaType)v14),((java.lang.Class)v16));
    Object v18 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerBase)v0).deserializeFromString(((com.fasterxml.jackson.core.JsonParser)v7),((com.fasterxml.jackson.databind.DeserializationContext)v10));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = false;
    Object v2 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v2));
    Object v4 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v3),((com.fasterxml.jackson.core.ObjectCodec)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.DocumentDeserializer();
    Object v12 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v11).getValueClass();
    Object v13 = new com.fasterxml.jackson.databind.deser.ValueInstantiator.Base(((java.lang.Class)v12));
    Object v14 = ((com.fasterxml.jackson.databind.deser.BeanDeserializer)v0).deserializeWithExternalTypeId(((com.fasterxml.jackson.core.JsonParser)v7),((com.fasterxml.jackson.databind.DeserializationContext)v10),((java.lang.Object)v13));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v2 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v2));
    Object v4 = "items";
    Object v5 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v9 = new com.fasterxml.jackson.databind.type.ResolvedRecursiveType(((java.lang.Class)v7),((com.fasterxml.jackson.databind.type.TypeBindings)v8));
    Object v10 = "items";
    Object v11 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v13 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v15 = new com.fasterxml.jackson.databind.type.ResolvedRecursiveType(((java.lang.Class)v13),((com.fasterxml.jackson.databind.type.TypeBindings)v14));
    Object v16 = null;
    Object v17 = "9integer";
    Object v18 = false;
    Object v19 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v20 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v19));
    Object v21 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v22 = new com.fasterxml.jackson.databind.type.ResolvedRecursiveType(((java.lang.Class)v20),((com.fasterxml.jackson.databind.type.TypeBindings)v21));
    Object v23 = new com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v16),((java.lang.String)v17),(((java.lang.Boolean)v18).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v22));
    Object v24 = com.fasterxml.jackson.databind.introspect.AnnotationCollector.emptyAnnotations();
    Object v25 = null;
    Object v26 = 0;
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v28 = true;
    Object v29 = "iems";
    Object v30 = 0;
    Object v31 = ")";
    Object v32 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v28).booleanValue()),((java.lang.String)v29),((java.lang.Integer)v30),((java.lang.String)v31));
    Object v33 = new com.fasterxml.jackson.databind.deser.CreatorProperty(((com.fasterxml.jackson.databind.PropertyName)v5),((com.fasterxml.jackson.databind.JavaType)v9),((com.fasterxml.jackson.databind.PropertyName)v11),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v23),((com.fasterxml.jackson.databind.util.Annotations)v24),((com.fasterxml.jackson.databind.introspect.AnnotatedParameter)v25),(((java.lang.Integer)v26).intValue()),((java.lang.Object)v27),((com.fasterxml.jackson.databind.PropertyMetadata)v32));
    Object v34 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerBase)v0).createContextual(((com.fasterxml.jackson.databind.DeserializationContext)v3),((com.fasterxml.jackson.databind.BeanProperty)v33));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = false;
    Object v2 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v2));
    Object v4 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v3),((com.fasterxml.jackson.core.ObjectCodec)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerBase)v0).deserializeFromDouble(((com.fasterxml.jackson.core.JsonParser)v7),((com.fasterxml.jackson.databind.DeserializationContext)v10));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = false;
    Object v2 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v2));
    Object v4 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v3),((com.fasterxml.jackson.core.ObjectCodec)v6));
    Object v8 = com.fasterxml.jackson.core.JsonParser.Feature.STRICT_DUPLICATE_DETECTION;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v7).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v14 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v16 = new com.fasterxml.jackson.databind.type.ResolvedRecursiveType(((java.lang.Class)v14),((com.fasterxml.jackson.databind.type.TypeBindings)v15));
    Object v17 = null;
    Object v18 = "9integer";
    Object v19 = false;
    Object v20 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v21 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v20));
    Object v22 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v23 = new com.fasterxml.jackson.databind.type.ResolvedRecursiveType(((java.lang.Class)v21),((com.fasterxml.jackson.databind.type.TypeBindings)v22));
    Object v24 = new com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v16),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v17),((java.lang.String)v18),(((java.lang.Boolean)v19).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v23));
    Object v25 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerBase)v0).deserializeWithType(((com.fasterxml.jackson.core.JsonParser)v7),((com.fasterxml.jackson.databind.DeserializationContext)v12),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v24));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = false;
    Object v2 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v2));
    Object v4 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v3),((com.fasterxml.jackson.core.ObjectCodec)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = com.fasterxml.jackson.annotation.JsonInclude.Value.empty();
    Object v12 = ((com.fasterxml.jackson.databind.deser.BeanDeserializer)v0).deserializeWithUnwrapped(((com.fasterxml.jackson.core.JsonParser)v7),((com.fasterxml.jackson.databind.DeserializationContext)v10),((java.lang.Object)v11));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = false;
    Object v2 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v2));
    Object v4 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v3),((com.fasterxml.jackson.core.ObjectCodec)v6));
    Object v8 = ((com.fasterxml.jackson.core.JsonParser)v7).currentTokenId();
    Object v9 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v10 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v13 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v15 = new com.fasterxml.jackson.databind.type.ResolvedRecursiveType(((java.lang.Class)v13),((com.fasterxml.jackson.databind.type.TypeBindings)v14));
    Object v16 = "h)";
    Object v17 = "string";
    Object v18 = ((com.fasterxml.jackson.databind.DeserializationContext)v11).invalidTypeIdException(((com.fasterxml.jackson.databind.JavaType)v15),((java.lang.String)v16),((java.lang.String)v17));
    Object v19 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerBase)v0).deserializeFromString(((com.fasterxml.jackson.core.JsonParser)v7),((com.fasterxml.jackson.databind.DeserializationContext)v11));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.DocumentDeserializer();
    Object v1 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v2 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v2));
    Object v4 = "arr y";
    Object v5 = ((com.fasterxml.jackson.databind.DeserializationContext)v3).mappingException(((java.lang.String)v4));
    Object v6 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).getNullValue(((com.fasterxml.jackson.databind.DeserializationContext)v3));
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerBase)v0).getBeanClass();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerBase)v0).handledType();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 0;
    Object v2 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerBase)v0).findProperty((((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "wlass ";
    Object v2 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerBase)v0).findProperty(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = false;
    Object v2 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v2));
    Object v4 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v3),((com.fasterxml.jackson.core.ObjectCodec)v6));
    Object v8 = ((com.fasterxml.jackson.core.JsonParser)v7).getCurrentName();
    Object v9 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v10 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v10));
    Object v12 = ((com.fasterxml.jackson.databind.DeserializationContext)v11).leaseObjectBuffer();
    Object v13 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v14 = ((com.fasterxml.jackson.databind.deser.BeanDeserializer)v0).deserialize(((com.fasterxml.jackson.core.JsonParser)v7),((com.fasterxml.jackson.databind.DeserializationContext)v11),((java.lang.Object)v13));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "";
    Object v2 = "UT";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializer(((com.fasterxml.jackson.databind.deser.BeanDeserializerBase)v0),((com.fasterxml.jackson.databind.util.NameTransformer)v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v2 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v2));
    ((com.fasterxml.jackson.databind.DeserializationContext)v3).checkUnresolvedObjectId();
    Object v4 = null;
    ((com.fasterxml.jackson.databind.deser.BeanDeserializerBase)v0).resolve(((com.fasterxml.jackson.databind.DeserializationContext)v3));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 1;
    Object v2 = new java.util.ArrayList((((java.lang.Integer)v1).intValue()));
    Object v3 = true;
    Object v4 = 45;
    Object v5 = new java.util.HashMap((((java.lang.Integer)v4).intValue()));
    Object v6 = com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap.construct(((java.util.Collection)v2),(((java.lang.Boolean)v3).booleanValue()),((java.util.Map)v5));
    Object v7 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v6).assignIndexes();
    Object v8 = ((com.fasterxml.jackson.databind.deser.BeanDeserializer)v0).withBeanProperties(((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v6));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = false;
    Object v2 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v2));
    Object v4 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v3),((com.fasterxml.jackson.core.ObjectCodec)v6));
    Object v8 = -21;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v7).nextIntValue((((java.lang.Integer)v8).intValue()));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = com.fasterxml.jackson.core.JsonToken.VALUE_STRING;
    Object v14 = ((java.lang.Enum)v13).getDeclaringClass();
    Object v15 = ((com.fasterxml.jackson.databind.deser.BeanDeserializer)v0)._deserializeOther(((com.fasterxml.jackson.core.JsonParser)v7),((com.fasterxml.jackson.databind.DeserializationContext)v12),((com.fasterxml.jackson.core.JsonToken)v13));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerBase)v0).isCachable();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = false;
    Object v2 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v2));
    Object v4 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v3),((com.fasterxml.jackson.core.ObjectCodec)v6));
    Object v8 = com.fasterxml.jackson.core.JsonParser.Feature.IGNORE_UNDEFINED;
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v7).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerBase)v0).deserializeFromString(((com.fasterxml.jackson.core.JsonParser)v7),((com.fasterxml.jackson.databind.DeserializationContext)v12));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v2 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder(((com.fasterxml.jackson.databind.BeanDescription)v0),((com.fasterxml.jackson.databind.DeserializationContext)v3));
    Object v5 = null;
    Object v6 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v9 = new com.fasterxml.jackson.databind.type.ResolvedRecursiveType(((java.lang.Class)v7),((com.fasterxml.jackson.databind.type.TypeBindings)v8));
    Object v10 = null;
    Object v11 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v5),((com.fasterxml.jackson.databind.JavaType)v9),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v10));
    Object v12 = 1;
    Object v13 = new java.util.ArrayList((((java.lang.Integer)v12).intValue()));
    Object v14 = true;
    Object v15 = 45;
    Object v16 = new java.util.HashMap((((java.lang.Integer)v15).intValue()));
    Object v17 = com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap.construct(((java.util.Collection)v13),(((java.lang.Boolean)v14).booleanValue()),((java.util.Map)v16));
    Object v18 = 45;
    Object v19 = new java.util.HashMap((((java.lang.Integer)v18).intValue()));
    Object v20 = new java.lang.Object[]{null};
    Object v21 = com.fasterxml.jackson.databind.util.ArrayBuilders.arrayToSet(((java.lang.Object[])v20));
    Object v22 = true;
    Object v23 = false;
    Object v24 = new com.fasterxml.jackson.databind.deser.BeanDeserializer(((com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder)v4),((com.fasterxml.jackson.databind.BeanDescription)v11),((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v17),((java.util.Map)v19),((java.util.HashSet)v21),(((java.lang.Boolean)v22).booleanValue()),(((java.lang.Boolean)v23).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerBase)v0).hasViews();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "arra(";
    Object v2 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerBase)v0).findProperty(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = false;
    Object v2 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v2));
    Object v4 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v3),((com.fasterxml.jackson.core.ObjectCodec)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.DocumentDeserializer();
    Object v12 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v11).getValueClass();
    Object v13 = ((com.fasterxml.jackson.databind.deser.BeanDeserializer)v0).deserializeWithUnwrapped(((com.fasterxml.jackson.core.JsonParser)v7),((com.fasterxml.jackson.databind.DeserializationContext)v10),((java.lang.Object)v12));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v2 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v2));
    Object v4 = -43.87098627151167D;
    Object v5 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v6 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v5));
    Object v7 = "]";
    Object v8 = ((com.fasterxml.jackson.databind.DeserializationContext)v3).weirdNumberException(((java.lang.Number)v4),((java.lang.Class)v6),((java.lang.String)v7));
    Object v9 = "items";
    Object v10 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v12 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v14 = new com.fasterxml.jackson.databind.type.ResolvedRecursiveType(((java.lang.Class)v12),((com.fasterxml.jackson.databind.type.TypeBindings)v13));
    Object v15 = "items";
    Object v16 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v15));
    Object v17 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v18 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v20 = new com.fasterxml.jackson.databind.type.ResolvedRecursiveType(((java.lang.Class)v18),((com.fasterxml.jackson.databind.type.TypeBindings)v19));
    Object v21 = null;
    Object v22 = "9integer";
    Object v23 = false;
    Object v24 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v25 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v24));
    Object v26 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v27 = new com.fasterxml.jackson.databind.type.ResolvedRecursiveType(((java.lang.Class)v25),((com.fasterxml.jackson.databind.type.TypeBindings)v26));
    Object v28 = new com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v20),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v21),((java.lang.String)v22),(((java.lang.Boolean)v23).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v27));
    Object v29 = com.fasterxml.jackson.databind.introspect.AnnotationCollector.emptyAnnotations();
    Object v30 = null;
    Object v31 = 0;
    Object v32 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v33 = true;
    Object v34 = "iems";
    Object v35 = 0;
    Object v36 = ")";
    Object v37 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v33).booleanValue()),((java.lang.String)v34),((java.lang.Integer)v35),((java.lang.String)v36));
    Object v38 = new com.fasterxml.jackson.databind.deser.CreatorProperty(((com.fasterxml.jackson.databind.PropertyName)v10),((com.fasterxml.jackson.databind.JavaType)v14),((com.fasterxml.jackson.databind.PropertyName)v16),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v28),((com.fasterxml.jackson.databind.util.Annotations)v29),((com.fasterxml.jackson.databind.introspect.AnnotatedParameter)v30),(((java.lang.Integer)v31).intValue()),((java.lang.Object)v32),((com.fasterxml.jackson.databind.PropertyMetadata)v37));
    Object v39 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerBase)v0).createContextual(((com.fasterxml.jackson.databind.DeserializationContext)v3),((com.fasterxml.jackson.databind.BeanProperty)v38));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = false;
    Object v2 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v2));
    Object v4 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v3),((com.fasterxml.jackson.core.ObjectCodec)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = ((com.fasterxml.jackson.databind.DeserializationContext)v10).leaseObjectBuffer();
    Object v12 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerBase)v0).deserializeFromNumber(((com.fasterxml.jackson.core.JsonParser)v7),((com.fasterxml.jackson.databind.DeserializationContext)v10));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerBase)v0).getValueInstantiator();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = false;
    Object v2 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v2));
    Object v4 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v3),((com.fasterxml.jackson.core.ObjectCodec)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerBase)v0).deserializeFromString(((com.fasterxml.jackson.core.JsonParser)v7),((com.fasterxml.jackson.databind.DeserializationContext)v10));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ((com.fasterxml.jackson.databind.deser.BeanDeserializer)v0)._creatorReturnedNullException();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = false;
    Object v2 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v2));
    Object v4 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v3),((com.fasterxml.jackson.core.ObjectCodec)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v12 = ((com.fasterxml.jackson.databind.deser.BeanDeserializer)v0).deserializeWithExternalTypeId(((com.fasterxml.jackson.core.JsonParser)v7),((com.fasterxml.jackson.databind.DeserializationContext)v10),((java.lang.Object)v11));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = false;
    Object v2 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v2));
    Object v4 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v3),((com.fasterxml.jackson.core.ObjectCodec)v6));
    ((com.fasterxml.jackson.core.JsonParser)v7).close();
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v10 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v10));
    Object v12 = ((com.fasterxml.jackson.databind.DeserializationContext)v11).getArrayBuilders();
    Object v13 = com.fasterxml.jackson.annotation.JsonInclude.Value.empty();
    Object v14 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v15 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v14));
    Object v16 = ((com.fasterxml.jackson.databind.deser.BeanDeserializer)v0).deserializeWithView(((com.fasterxml.jackson.core.JsonParser)v7),((com.fasterxml.jackson.databind.DeserializationContext)v11),((java.lang.Object)v13),((java.lang.Class)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "Invalid Object Id definition for %s: cannot find property with name '%s'";
    Object v2 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerBase)v0).hasProperty(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = false;
    Object v2 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v2));
    Object v4 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v3),((com.fasterxml.jackson.core.ObjectCodec)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = "items";
    Object v12 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v11));
    Object v13 = ((com.fasterxml.jackson.databind.deser.BeanDeserializer)v0).deserialize(((com.fasterxml.jackson.core.JsonParser)v7),((com.fasterxml.jackson.databind.DeserializationContext)v10),((java.lang.Object)v12));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v2 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder(((com.fasterxml.jackson.databind.BeanDescription)v0),((com.fasterxml.jackson.databind.DeserializationContext)v3));
    Object v5 = "items";
    Object v6 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v5));
    Object v7 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder)v4).hasProperty(((com.fasterxml.jackson.databind.PropertyName)v6));
    Object v8 = null;
    Object v9 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v12 = new com.fasterxml.jackson.databind.type.ResolvedRecursiveType(((java.lang.Class)v10),((com.fasterxml.jackson.databind.type.TypeBindings)v11));
    Object v13 = null;
    Object v14 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v8),((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v13));
    Object v15 = 1;
    Object v16 = new java.util.ArrayList((((java.lang.Integer)v15).intValue()));
    Object v17 = true;
    Object v18 = 45;
    Object v19 = new java.util.HashMap((((java.lang.Integer)v18).intValue()));
    Object v20 = com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap.construct(((java.util.Collection)v16),(((java.lang.Boolean)v17).booleanValue()),((java.util.Map)v19));
    Object v21 = ((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v20).toString();
    Object v22 = 45;
    Object v23 = new java.util.HashMap((((java.lang.Integer)v22).intValue()));
    Object v24 = new java.lang.Object[]{null};
    Object v25 = com.fasterxml.jackson.databind.util.ArrayBuilders.arrayToSet(((java.lang.Object[])v24));
    Object v26 = false;
    Object v27 = false;
    Object v28 = new com.fasterxml.jackson.databind.deser.BeanDeserializer(((com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder)v4),((com.fasterxml.jackson.databind.BeanDescription)v14),((com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap)v20),((java.util.Map)v23),((java.util.HashSet)v25),(((java.lang.Boolean)v26).booleanValue()),(((java.lang.Boolean)v27).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = false;
    Object v2 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v2));
    Object v4 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v3),((com.fasterxml.jackson.core.ObjectCodec)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = ((com.fasterxml.jackson.databind.DeserializationContext)v10).leaseObjectBuffer();
    Object v12 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerBase)v0).deserializeFromString(((com.fasterxml.jackson.core.JsonParser)v7),((com.fasterxml.jackson.databind.DeserializationContext)v10));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = false;
    Object v2 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v2));
    Object v4 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v3),((com.fasterxml.jackson.core.ObjectCodec)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = ((com.fasterxml.jackson.databind.deser.BeanDeserializer)v0)._deserializeUsingPropertyBased(((com.fasterxml.jackson.core.JsonParser)v7),((com.fasterxml.jackson.databind.DeserializationContext)v10));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = false;
    Object v2 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v2));
    Object v4 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v3),((com.fasterxml.jackson.core.ObjectCodec)v6));
    Object v8 = ((com.fasterxml.jackson.core.JsonParser)v7).version();
    Object v9 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v10 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v10));
    Object v12 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL;
    Object v13 = ((com.fasterxml.jackson.databind.deser.BeanDeserializer)v0)._deserializeOther(((com.fasterxml.jackson.core.JsonParser)v7),((com.fasterxml.jackson.databind.DeserializationContext)v11),((com.fasterxml.jackson.core.JsonToken)v12));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerBase)v0).getObjectIdReader();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = false;
    Object v2 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v2));
    Object v4 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v3),((com.fasterxml.jackson.core.ObjectCodec)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v12 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v14 = new com.fasterxml.jackson.databind.type.ResolvedRecursiveType(((java.lang.Class)v12),((com.fasterxml.jackson.databind.type.TypeBindings)v13));
    Object v15 = "-tems";
    Object v16 = "Unexpected end-of-input when binding data into %s";
    Object v17 = ((com.fasterxml.jackson.databind.DeserializationContext)v10).invalidTypeIdException(((com.fasterxml.jackson.databind.JavaType)v14),((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = ((com.fasterxml.jackson.databind.deser.BeanDeserializer)v0)._deserializeUsingPropertyBased(((com.fasterxml.jackson.core.JsonParser)v7),((com.fasterxml.jackson.databind.DeserializationContext)v10));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = false;
    Object v2 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v2));
    Object v4 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v3),((com.fasterxml.jackson.core.ObjectCodec)v6));
    Object v8 = "string";
    Object v9 = ((com.fasterxml.jackson.core.JsonParser)v7).getValueAsString(((java.lang.String)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = 0;
    Object v14 = new com.fasterxml.jackson.databind.ext.DOMDeserializer.DocumentDeserializer();
    Object v15 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v14).getValueClass();
    Object v16 = "";
    Object v17 = ((com.fasterxml.jackson.databind.DeserializationContext)v12).weirdNumberException(((java.lang.Number)v13),((java.lang.Class)v15),((java.lang.String)v16));
    Object v18 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerBase)v0).deserializeFromString(((com.fasterxml.jackson.core.JsonParser)v7),((com.fasterxml.jackson.databind.DeserializationContext)v12));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = false;
    Object v2 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v2));
    Object v4 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v3),((com.fasterxml.jackson.core.ObjectCodec)v6));
    Object v8 = "]";
    ((com.fasterxml.jackson.core.JsonParser)v7).setRequestPayloadOnError(((java.lang.String)v8));
    Object v9 = null;
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = ((com.fasterxml.jackson.databind.deser.BeanDeserializer)v0).deserializeUsingPropertyBasedWithUnwrapped(((com.fasterxml.jackson.core.JsonParser)v7),((com.fasterxml.jackson.databind.DeserializationContext)v12));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }
}
