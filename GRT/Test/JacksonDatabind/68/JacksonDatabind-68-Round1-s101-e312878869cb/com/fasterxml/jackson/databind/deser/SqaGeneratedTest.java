package com.fasterxml.jackson.databind.deser;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.StringDeserializer();
    Object v1 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v0).getValueClass();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.StringDeserializer();
    Object v1 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v2 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl)v3),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).getNullValue(((com.fasterxml.jackson.databind.DeserializationContext)v6));
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.StringDeserializer();
    Object v1 = 0.0D;
    Object v2 = com.fasterxml.jackson.databind.node.DoubleNode.valueOf((((java.lang.Double)v1).doubleValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v8 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v7));
    Object v9 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl)v6),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v8));
    Object v10 = ((com.fasterxml.jackson.databind.DeserializationContext)v9).getArrayBuilders();
    Object v11 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).deserialize(((com.fasterxml.jackson.core.JsonParser)v3),((com.fasterxml.jackson.databind.DeserializationContext)v9));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "&]";
    Object v2 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerBase)v0).findProperty(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 0.0D;
    Object v2 = com.fasterxml.jackson.databind.node.DoubleNode.valueOf((((java.lang.Double)v1).doubleValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v8 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v7));
    Object v9 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl)v6),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v8));
    Object v10 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerBase)v0).deserializeFromObjectId(((com.fasterxml.jackson.core.JsonParser)v3),((com.fasterxml.jackson.databind.DeserializationContext)v9));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v2 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v2));
    Object v4 = "sting";
    Object v5 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = "sting";
    Object v8 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = null;
    Object v11 = ",";
    Object v12 = false;
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v9),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v10),((java.lang.String)v11),(((java.lang.Boolean)v12).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v13));
    Object v15 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v16 = null;
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v19 = 0;
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v16),((com.fasterxml.jackson.databind.JavaType)v17),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v18),(((java.lang.Integer)v19).intValue()));
    Object v21 = -12;
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v22));
    Object v24 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v25 = com.fasterxml.jackson.databind.type.TypeBindings.create(((java.lang.Class)v23),((com.fasterxml.jackson.databind.JavaType[])v24));
    Object v26 = true;
    Object v27 = ": ";
    Object v28 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v26).booleanValue()),((java.lang.String)v27));
    Object v29 = new com.fasterxml.jackson.databind.deser.CreatorProperty(((com.fasterxml.jackson.databind.PropertyName)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.PropertyName)v8),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v14),((com.fasterxml.jackson.databind.util.Annotations)v15),((com.fasterxml.jackson.databind.introspect.AnnotatedParameter)v20),(((java.lang.Integer)v21).intValue()),((java.lang.Object)v25),((com.fasterxml.jackson.databind.PropertyMetadata)v28));
    Object v30 = new com.fasterxml.jackson.databind.deser.std.StringDeserializer();
    Object v31 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v30).getValueClass();
    Object v32 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v29).getAnnotation(((java.lang.Class)v31));
    Object v33 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerBase)v0)._resolvedObjectIdProperty(((com.fasterxml.jackson.databind.DeserializationContext)v3),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v29));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.StringDeserializer();
    Object v1 = 0.0D;
    Object v2 = com.fasterxml.jackson.databind.node.DoubleNode.valueOf((((java.lang.Double)v1).doubleValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v8 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v7));
    Object v9 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl)v6),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v13 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v12));
    Object v14 = ")";
    Object v15 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.core.JsonGenerator)v13),((java.lang.String)v14));
    Object v16 = ((com.fasterxml.jackson.databind.DeserializationContext)v9).instantiationException(((java.lang.Class)v11),((java.lang.Throwable)v15));
    Object v17 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).deserialize(((com.fasterxml.jackson.core.JsonParser)v3),((com.fasterxml.jackson.databind.DeserializationContext)v9));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v2 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl)v3),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = "sting";
    Object v8 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = "sting";
    Object v11 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = null;
    Object v14 = ",";
    Object v15 = false;
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v13),((java.lang.String)v14),(((java.lang.Boolean)v15).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v16));
    Object v18 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v19 = null;
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v22 = 0;
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v19),((com.fasterxml.jackson.databind.JavaType)v20),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v21),(((java.lang.Integer)v22).intValue()));
    Object v24 = -12;
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v25));
    Object v27 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v28 = com.fasterxml.jackson.databind.type.TypeBindings.create(((java.lang.Class)v26),((com.fasterxml.jackson.databind.JavaType[])v27));
    Object v29 = true;
    Object v30 = ": ";
    Object v31 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v29).booleanValue()),((java.lang.String)v30));
    Object v32 = new com.fasterxml.jackson.databind.deser.CreatorProperty(((com.fasterxml.jackson.databind.PropertyName)v8),((com.fasterxml.jackson.databind.JavaType)v9),((com.fasterxml.jackson.databind.PropertyName)v11),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v17),((com.fasterxml.jackson.databind.util.Annotations)v18),((com.fasterxml.jackson.databind.introspect.AnnotatedParameter)v23),(((java.lang.Integer)v24).intValue()),((java.lang.Object)v28),((com.fasterxml.jackson.databind.PropertyMetadata)v31));
    Object v33 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v34 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor.Base(((com.fasterxml.jackson.databind.SerializerProvider)v33));
    Object v35 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.BeanProperty)v32).depositSchemaProperty(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor)v34),((com.fasterxml.jackson.databind.SerializerProvider)v35));
    Object v36 = null;
    Object v37 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerBase)v0).createContextual(((com.fasterxml.jackson.databind.DeserializationContext)v6),((com.fasterxml.jackson.databind.BeanProperty)v32));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.StringDeserializer();
    Object v1 = 0.0D;
    Object v2 = com.fasterxml.jackson.databind.node.DoubleNode.valueOf((((java.lang.Double)v1).doubleValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2));
    Object v4 = ((com.fasterxml.jackson.core.JsonParser)v3).hasTextCharacters();
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl)v7),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).deserialize(((com.fasterxml.jackson.core.JsonParser)v3),((com.fasterxml.jackson.databind.DeserializationContext)v10));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.StringDeserializer();
    Object v1 = 0.0D;
    Object v2 = com.fasterxml.jackson.databind.node.DoubleNode.valueOf((((java.lang.Double)v1).doubleValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).deserialize(((com.fasterxml.jackson.core.JsonParser)v3),((com.fasterxml.jackson.databind.DeserializationContext)v6));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.StringDeserializer();
    Object v1 = 0.0D;
    Object v2 = com.fasterxml.jackson.databind.node.DoubleNode.valueOf((((java.lang.Double)v1).doubleValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v8 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v7));
    Object v9 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl)v6),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v8));
    ((com.fasterxml.jackson.databind.DeserializationContext)v9).checkUnresolvedObjectId();
    Object v10 = null;
    Object v11 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).deserialize(((com.fasterxml.jackson.core.JsonParser)v3),((com.fasterxml.jackson.databind.DeserializationContext)v9));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.StringDeserializer();
    Object v1 = 0.0D;
    Object v2 = com.fasterxml.jackson.databind.node.DoubleNode.valueOf((((java.lang.Double)v1).doubleValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2));
    Object v4 = ((com.fasterxml.jackson.core.JsonParser)v3).currentToken();
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6));
    Object v8 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).deserialize(((com.fasterxml.jackson.core.JsonParser)v3),((com.fasterxml.jackson.databind.DeserializationContext)v7));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.StringDeserializer();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.StringDeserializer();
    Object v2 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).replaceDelegatee(((com.fasterxml.jackson.databind.JsonDeserializer)v1));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.StringDeserializer();
    Object v1 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).getEmptyValue();
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerBase)v0).getKnownPropertyNames();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = "sting";
    Object v3 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.std.StringDeserializer();
    Object v8 = "sting";
    Object v9 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = "sting";
    Object v12 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = null;
    Object v15 = ",";
    Object v16 = false;
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v14),((java.lang.String)v15),(((java.lang.Boolean)v16).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v17));
    Object v19 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v20 = null;
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v23 = 0;
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v20),((com.fasterxml.jackson.databind.JavaType)v21),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v22),(((java.lang.Integer)v23).intValue()));
    Object v25 = -12;
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v26));
    Object v28 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v29 = com.fasterxml.jackson.databind.type.TypeBindings.create(((java.lang.Class)v27),((com.fasterxml.jackson.databind.JavaType[])v28));
    Object v30 = true;
    Object v31 = ": ";
    Object v32 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v30).booleanValue()),((java.lang.String)v31));
    Object v33 = new com.fasterxml.jackson.databind.deser.CreatorProperty(((com.fasterxml.jackson.databind.PropertyName)v9),((com.fasterxml.jackson.databind.JavaType)v10),((com.fasterxml.jackson.databind.PropertyName)v12),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v18),((com.fasterxml.jackson.databind.util.Annotations)v19),((com.fasterxml.jackson.databind.introspect.AnnotatedParameter)v24),(((java.lang.Integer)v25).intValue()),((java.lang.Object)v29),((com.fasterxml.jackson.databind.PropertyMetadata)v32));
    Object v34 = com.fasterxml.jackson.databind.deser.impl.ObjectIdReader.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.PropertyName)v3),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v6),((com.fasterxml.jackson.databind.JsonDeserializer)v7),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v33));
    Object v35 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerBase)v0).withObjectIdReader(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)v34));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerBase)v0).properties();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerBase)v0).creatorProperties();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "'";
    Object v2 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerBase)v0).findBackReference(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.StringDeserializer();
    Object v1 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).getDelegatee();
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerBase)v0).handledType();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.StringDeserializer();
    Object v1 = 0.0D;
    Object v2 = com.fasterxml.jackson.databind.node.DoubleNode.valueOf((((java.lang.Double)v1).doubleValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v8 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).deserialize(((com.fasterxml.jackson.core.JsonParser)v3),((com.fasterxml.jackson.databind.DeserializationContext)v6),((java.lang.Object)v7));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.StringDeserializer();
    Object v1 = 0.0D;
    Object v2 = com.fasterxml.jackson.databind.node.DoubleNode.valueOf((((java.lang.Double)v1).doubleValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v8 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v7));
    Object v9 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl)v6),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).deserialize(((com.fasterxml.jackson.core.JsonParser)v3),((com.fasterxml.jackson.databind.DeserializationContext)v9),((java.lang.Object)v10));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.StringDeserializer();
    Object v1 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v2 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).getEmptyValue(((com.fasterxml.jackson.databind.DeserializationContext)v3));
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 0.0D;
    Object v2 = com.fasterxml.jackson.databind.node.DoubleNode.valueOf((((java.lang.Double)v1).doubleValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v8 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v7));
    Object v9 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl)v6),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v8));
    Object v10 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerBase)v0).deserializeFromDouble(((com.fasterxml.jackson.core.JsonParser)v3),((com.fasterxml.jackson.databind.DeserializationContext)v9));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.StringDeserializer();
    Object v1 = 0.0D;
    Object v2 = com.fasterxml.jackson.databind.node.DoubleNode.valueOf((((java.lang.Double)v1).doubleValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v8 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v7));
    Object v9 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl)v6),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v8));
    Object v10 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).deserialize(((com.fasterxml.jackson.core.JsonParser)v3),((com.fasterxml.jackson.databind.DeserializationContext)v9));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.StringDeserializer();
    Object v1 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).getNullValue();
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 0.0D;
    Object v2 = com.fasterxml.jackson.databind.node.DoubleNode.valueOf((((java.lang.Double)v1).doubleValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerBase)v0).deserializeFromDouble(((com.fasterxml.jackson.core.JsonParser)v3),((com.fasterxml.jackson.databind.DeserializationContext)v6));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 0.0D;
    Object v2 = com.fasterxml.jackson.databind.node.DoubleNode.valueOf((((java.lang.Double)v1).doubleValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2));
    Object v4 = 1;
    Object v5 = ((com.fasterxml.jackson.core.JsonParser)v3).nextIntValue((((java.lang.Integer)v4).intValue()));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v7));
    Object v9 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerBase)v0).deserializeFromArray(((com.fasterxml.jackson.core.JsonParser)v3),((com.fasterxml.jackson.databind.DeserializationContext)v8));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 0.0D;
    Object v2 = com.fasterxml.jackson.databind.node.DoubleNode.valueOf((((java.lang.Double)v1).doubleValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v8 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v7));
    Object v9 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl)v6),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.std.StringDeserializer();
    Object v11 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v10).getValueClass();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v15 = com.fasterxml.jackson.databind.type.TypeBindings.create(((java.lang.Class)v13),((com.fasterxml.jackson.databind.JavaType[])v14));
    Object v16 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerBase)v0)._handleTypedObjectId(((com.fasterxml.jackson.core.JsonParser)v3),((com.fasterxml.jackson.databind.DeserializationContext)v9),((java.lang.Object)v11),((java.lang.Object)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v2 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl)v3),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = "sting";
    Object v8 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = "sting";
    Object v11 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = null;
    Object v14 = ",";
    Object v15 = false;
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v13),((java.lang.String)v14),(((java.lang.Boolean)v15).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v16));
    Object v18 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v19 = null;
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v22 = 0;
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v19),((com.fasterxml.jackson.databind.JavaType)v20),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v21),(((java.lang.Integer)v22).intValue()));
    Object v24 = -12;
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v25));
    Object v27 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v28 = com.fasterxml.jackson.databind.type.TypeBindings.create(((java.lang.Class)v26),((com.fasterxml.jackson.databind.JavaType[])v27));
    Object v29 = true;
    Object v30 = ": ";
    Object v31 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v29).booleanValue()),((java.lang.String)v30));
    Object v32 = new com.fasterxml.jackson.databind.deser.CreatorProperty(((com.fasterxml.jackson.databind.PropertyName)v8),((com.fasterxml.jackson.databind.JavaType)v9),((com.fasterxml.jackson.databind.PropertyName)v11),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v17),((com.fasterxml.jackson.databind.util.Annotations)v18),((com.fasterxml.jackson.databind.introspect.AnnotatedParameter)v23),(((java.lang.Integer)v24).intValue()),((java.lang.Object)v28),((com.fasterxml.jackson.databind.PropertyMetadata)v31));
    Object v33 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerBase)v0)._resolvedObjectIdProperty(((com.fasterxml.jackson.databind.DeserializationContext)v6),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v32));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "tye";
    Object v2 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerBase)v0).hasProperty(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 0.0D;
    Object v2 = com.fasterxml.jackson.databind.node.DoubleNode.valueOf((((java.lang.Double)v1).doubleValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v8 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v7));
    Object v9 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl)v6),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v8));
    Object v10 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerBase)v0).deserializeFromArray(((com.fasterxml.jackson.core.JsonParser)v3),((com.fasterxml.jackson.databind.DeserializationContext)v9));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 0.0D;
    Object v2 = com.fasterxml.jackson.databind.node.DoubleNode.valueOf((((java.lang.Double)v1).doubleValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2));
    Object v4 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)7)};
    Object v5 = "No enum constants for class ";
    Object v6 = new com.fasterxml.jackson.core.util.RequestPayload(((byte[])v4),((java.lang.String)v5));
    ((com.fasterxml.jackson.core.JsonParser)v3).setRequestPayloadOnError(((com.fasterxml.jackson.core.util.RequestPayload)v6));
    Object v7 = null;
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerBase)v0).deserializeFromObjectId(((com.fasterxml.jackson.core.JsonParser)v3),((com.fasterxml.jackson.databind.DeserializationContext)v10));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 0.0D;
    Object v2 = com.fasterxml.jackson.databind.node.DoubleNode.valueOf((((java.lang.Double)v1).doubleValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = null;
    Object v9 = ",";
    Object v10 = false;
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerBase)v0).deserializeWithType(((com.fasterxml.jackson.core.JsonParser)v3),((com.fasterxml.jackson.databind.DeserializationContext)v6),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v12));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 0.0D;
    Object v2 = com.fasterxml.jackson.databind.node.DoubleNode.valueOf((((java.lang.Double)v1).doubleValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v8 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v7));
    Object v9 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl)v6),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v11 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v12 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v11));
    Object v13 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerBase)v0).handlePolymorphic(((com.fasterxml.jackson.core.JsonParser)v3),((com.fasterxml.jackson.databind.DeserializationContext)v9),((java.lang.Object)v10),((com.fasterxml.jackson.databind.util.TokenBuffer)v12));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 0;
    Object v2 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerBase)v0).findProperty((((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 27;
    Object v2 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerBase)v0).findProperty((((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerBase)v0).isCachable();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v2 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl)v3),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = "sting";
    Object v8 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = "sting";
    Object v11 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = null;
    Object v14 = ",";
    Object v15 = false;
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v13),((java.lang.String)v14),(((java.lang.Boolean)v15).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v16));
    Object v18 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v19 = null;
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v22 = 0;
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v19),((com.fasterxml.jackson.databind.JavaType)v20),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v21),(((java.lang.Integer)v22).intValue()));
    Object v24 = -12;
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v25));
    Object v27 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v28 = com.fasterxml.jackson.databind.type.TypeBindings.create(((java.lang.Class)v26),((com.fasterxml.jackson.databind.JavaType[])v27));
    Object v29 = true;
    Object v30 = ": ";
    Object v31 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v29).booleanValue()),((java.lang.String)v30));
    Object v32 = new com.fasterxml.jackson.databind.deser.CreatorProperty(((com.fasterxml.jackson.databind.PropertyName)v8),((com.fasterxml.jackson.databind.JavaType)v9),((com.fasterxml.jackson.databind.PropertyName)v11),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v17),((com.fasterxml.jackson.databind.util.Annotations)v18),((com.fasterxml.jackson.databind.introspect.AnnotatedParameter)v23),(((java.lang.Integer)v24).intValue()),((java.lang.Object)v28),((com.fasterxml.jackson.databind.PropertyMetadata)v31));
    Object v33 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerBase)v0)._resolveUnwrappedProperty(((com.fasterxml.jackson.databind.DeserializationContext)v6),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v32));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 0.0D;
    Object v2 = com.fasterxml.jackson.databind.node.DoubleNode.valueOf((((java.lang.Double)v1).doubleValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v8 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v7));
    Object v9 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl)v6),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v8));
    Object v10 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerBase)v0).deserializeFromObject(((com.fasterxml.jackson.core.JsonParser)v3),((com.fasterxml.jackson.databind.DeserializationContext)v9));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "string";
    Object v2 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerBase)v0).findProperty(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v2 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl)v3),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    ((com.fasterxml.jackson.databind.deser.BeanDeserializerBase)v0).resolve(((com.fasterxml.jackson.databind.DeserializationContext)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.StringDeserializer();
    Object v1 = 0.0D;
    Object v2 = com.fasterxml.jackson.databind.node.DoubleNode.valueOf((((java.lang.Double)v1).doubleValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v8 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v7));
    Object v9 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl)v6),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = ((com.fasterxml.jackson.databind.DatabindContext)v9).constructSpecializedType(((com.fasterxml.jackson.databind.JavaType)v10),((java.lang.Class)v12));
    Object v14 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)7)};
    Object v15 = "No enum constants for class ";
    Object v16 = new com.fasterxml.jackson.core.util.RequestPayload(((byte[])v14),((java.lang.String)v15));
    Object v17 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).deserialize(((com.fasterxml.jackson.core.JsonParser)v3),((com.fasterxml.jackson.databind.DeserializationContext)v9),((java.lang.Object)v16));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "com.fasterxml.jackson.databind.ext.CoreXMLSerializers";
    Object v2 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerBase)v0).findBackReference(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 0.0D;
    Object v2 = com.fasterxml.jackson.databind.node.DoubleNode.valueOf((((java.lang.Double)v1).doubleValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v8 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v7));
    Object v9 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl)v6),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v11 = "'";
    ((com.fasterxml.jackson.databind.deser.BeanDeserializerBase)v0).handleUnknownProperty(((com.fasterxml.jackson.core.JsonParser)v3),((com.fasterxml.jackson.databind.DeserializationContext)v9),((java.lang.Object)v10),((java.lang.String)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v2 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl)v3),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v8 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v9 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v8));
    Object v10 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerBase)v0)._findSubclassDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v6),((java.lang.Object)v7),((com.fasterxml.jackson.databind.util.TokenBuffer)v9));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.ser.std.StdJdkSerializers.all();
    Object v2 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerBase)v0).withIgnorableProperties(((java.util.Set)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v2 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl)v3),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = "sting";
    Object v8 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = "sting";
    Object v11 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = null;
    Object v14 = ",";
    Object v15 = false;
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v13),((java.lang.String)v14),(((java.lang.Boolean)v15).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v16));
    Object v18 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v19 = null;
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v22 = 0;
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v19),((com.fasterxml.jackson.databind.JavaType)v20),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v21),(((java.lang.Integer)v22).intValue()));
    Object v24 = -12;
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v25));
    Object v27 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v28 = com.fasterxml.jackson.databind.type.TypeBindings.create(((java.lang.Class)v26),((com.fasterxml.jackson.databind.JavaType[])v27));
    Object v29 = true;
    Object v30 = ": ";
    Object v31 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v29).booleanValue()),((java.lang.String)v30));
    Object v32 = new com.fasterxml.jackson.databind.deser.CreatorProperty(((com.fasterxml.jackson.databind.PropertyName)v8),((com.fasterxml.jackson.databind.JavaType)v9),((com.fasterxml.jackson.databind.PropertyName)v11),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v17),((com.fasterxml.jackson.databind.util.Annotations)v18),((com.fasterxml.jackson.databind.introspect.AnnotatedParameter)v23),(((java.lang.Integer)v24).intValue()),((java.lang.Object)v28),((com.fasterxml.jackson.databind.PropertyMetadata)v31));
    Object v33 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerBase)v0).createContextual(((com.fasterxml.jackson.databind.DeserializationContext)v6),((com.fasterxml.jackson.databind.BeanProperty)v32));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v2 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl)v3),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = "sting";
    Object v8 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = "sting";
    Object v11 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = null;
    Object v14 = ",";
    Object v15 = false;
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v13),((java.lang.String)v14),(((java.lang.Boolean)v15).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v16));
    Object v18 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v19 = null;
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v22 = 0;
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v19),((com.fasterxml.jackson.databind.JavaType)v20),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v21),(((java.lang.Integer)v22).intValue()));
    Object v24 = -12;
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v25));
    Object v27 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v28 = com.fasterxml.jackson.databind.type.TypeBindings.create(((java.lang.Class)v26),((com.fasterxml.jackson.databind.JavaType[])v27));
    Object v29 = true;
    Object v30 = ": ";
    Object v31 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v29).booleanValue()),((java.lang.String)v30));
    Object v32 = new com.fasterxml.jackson.databind.deser.CreatorProperty(((com.fasterxml.jackson.databind.PropertyName)v8),((com.fasterxml.jackson.databind.JavaType)v9),((com.fasterxml.jackson.databind.PropertyName)v11),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v17),((com.fasterxml.jackson.databind.util.Annotations)v18),((com.fasterxml.jackson.databind.introspect.AnnotatedParameter)v23),(((java.lang.Integer)v24).intValue()),((java.lang.Object)v28),((com.fasterxml.jackson.databind.PropertyMetadata)v31));
    Object v33 = "sting";
    Object v34 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v33));
    Object v35 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v32).withName(((com.fasterxml.jackson.databind.PropertyName)v34));
    Object v36 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerBase)v0)._resolveUnwrappedProperty(((com.fasterxml.jackson.databind.DeserializationContext)v6),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v32));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 0.0D;
    Object v2 = com.fasterxml.jackson.databind.node.DoubleNode.valueOf((((java.lang.Double)v1).doubleValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v8 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v7));
    Object v9 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl)v6),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = "items";
    Object v13 = "boolean";
    Object v14 = ((com.fasterxml.jackson.databind.DeserializationContext)v9).weirdKeyException(((java.lang.Class)v11),((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerBase)v0).deserializeFromObjectUsingNonDefault(((com.fasterxml.jackson.core.JsonParser)v3),((com.fasterxml.jackson.databind.DeserializationContext)v9));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "'";
    Object v2 = "over";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerBase)v0).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v2 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v1));
    Object v3 = ")";
    Object v4 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.core.JsonGenerator)v2),((java.lang.String)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl)v7),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerBase)v0).wrapInstantiationProblem(((java.lang.Throwable)v4),((com.fasterxml.jackson.databind.DeserializationContext)v10));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.StringDeserializer();
    Object v1 = 0.0D;
    Object v2 = com.fasterxml.jackson.databind.node.DoubleNode.valueOf((((java.lang.Double)v1).doubleValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2));
    Object v4 = ((com.fasterxml.jackson.core.JsonParser)v3).getCurrentLocation();
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl)v7),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).deserialize(((com.fasterxml.jackson.core.JsonParser)v3),((com.fasterxml.jackson.databind.DeserializationContext)v10));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.StringDeserializer();
    Object v1 = 0.0D;
    Object v2 = com.fasterxml.jackson.databind.node.DoubleNode.valueOf((((java.lang.Double)v1).doubleValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v8 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v7));
    Object v9 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl)v6),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v11 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).deserialize(((com.fasterxml.jackson.core.JsonParser)v3),((com.fasterxml.jackson.databind.DeserializationContext)v9),((java.lang.Object)v10));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 0.0D;
    Object v2 = com.fasterxml.jackson.databind.node.DoubleNode.valueOf((((java.lang.Double)v1).doubleValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v8 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v7));
    Object v9 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl)v6),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = "strin";
    Object v13 = ((com.fasterxml.jackson.databind.DeserializationContext)v9).instantiationException(((java.lang.Class)v11),((java.lang.String)v12));
    Object v14 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerBase)v0).deserializeFromDouble(((com.fasterxml.jackson.core.JsonParser)v3),((com.fasterxml.jackson.databind.DeserializationContext)v9));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 0.0D;
    Object v2 = com.fasterxml.jackson.databind.node.DoubleNode.valueOf((((java.lang.Double)v1).doubleValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v8 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v7));
    Object v9 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl)v6),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v8));
    Object v10 = java.util.Map.of();
    Object v11 = "value not one of declared Enum instance names: %s";
    ((com.fasterxml.jackson.databind.deser.BeanDeserializerBase)v0).handleUnknownVanilla(((com.fasterxml.jackson.core.JsonParser)v3),((com.fasterxml.jackson.databind.DeserializationContext)v9),((java.lang.Object)v10),((java.lang.String)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "i";
    Object v2 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerBase)v0).findProperty(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 0.0D;
    Object v2 = com.fasterxml.jackson.databind.node.DoubleNode.valueOf((((java.lang.Double)v1).doubleValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v8 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v7));
    Object v9 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl)v6),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v8));
    Object v10 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerBase)v0).deserializeFromObjectUsingNonDefault(((com.fasterxml.jackson.core.JsonParser)v3),((com.fasterxml.jackson.databind.DeserializationContext)v9));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.ser.std.StdJdkSerializers.all();
    Object v2 = new java.lang.Object[]{null,null};
    Object v3 = com.fasterxml.jackson.databind.util.ArrayBuilders.setAndArray(((java.util.Set)v1),((java.lang.Object[])v2));
    Object v4 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerBase)v0).withIgnorableProperties(((java.util.Set)v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v2 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v2));
    Object v4 = "sting";
    Object v5 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = "sting";
    Object v8 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = null;
    Object v11 = ",";
    Object v12 = false;
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v9),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v10),((java.lang.String)v11),(((java.lang.Boolean)v12).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v13));
    Object v15 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v16 = null;
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v19 = 0;
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v16),((com.fasterxml.jackson.databind.JavaType)v17),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v18),(((java.lang.Integer)v19).intValue()));
    Object v21 = -12;
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v22));
    Object v24 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v25 = com.fasterxml.jackson.databind.type.TypeBindings.create(((java.lang.Class)v23),((com.fasterxml.jackson.databind.JavaType[])v24));
    Object v26 = true;
    Object v27 = ": ";
    Object v28 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v26).booleanValue()),((java.lang.String)v27));
    Object v29 = new com.fasterxml.jackson.databind.deser.CreatorProperty(((com.fasterxml.jackson.databind.PropertyName)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.PropertyName)v8),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v14),((com.fasterxml.jackson.databind.util.Annotations)v15),((com.fasterxml.jackson.databind.introspect.AnnotatedParameter)v20),(((java.lang.Integer)v21).intValue()),((java.lang.Object)v25),((com.fasterxml.jackson.databind.PropertyMetadata)v28));
    Object v30 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerBase)v0)._resolvedObjectIdProperty(((com.fasterxml.jackson.databind.DeserializationContext)v3),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v29));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
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
  public void test62() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerBase)v0).asArrayDeserializer();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 0.0D;
    Object v2 = com.fasterxml.jackson.databind.node.DoubleNode.valueOf((((java.lang.Double)v1).doubleValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v8 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v7));
    Object v9 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl)v6),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v8));
    Object v10 = new com.fasterxml.jackson.databind.util.ObjectBuffer();
    ((com.fasterxml.jackson.databind.DeserializationContext)v9).returnObjectBuffer(((com.fasterxml.jackson.databind.util.ObjectBuffer)v10));
    Object v11 = null;
    Object v12 = null;
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = null;
    Object v15 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v12),((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v14));
    Object v16 = "Can not parse date \"%s\": while it seems to fit format '%s', parsing fails (leniency? %s)";
    ((com.fasterxml.jackson.databind.deser.BeanDeserializerBase)v0).handleUnknownProperty(((com.fasterxml.jackson.core.JsonParser)v3),((com.fasterxml.jackson.databind.DeserializationContext)v9),((java.lang.Object)v15),((java.lang.String)v16));
    Object v17 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 0.0D;
    Object v2 = com.fasterxml.jackson.databind.node.DoubleNode.valueOf((((java.lang.Double)v1).doubleValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v8 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v7));
    Object v9 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl)v6),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.std.StringDeserializer();
    Object v11 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v10).getValueClass();
    Object v12 = false;
    Object v13 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = "ajrray";
    ((com.fasterxml.jackson.databind.deser.BeanDeserializerBase)v0).handleUnknownVanilla(((com.fasterxml.jackson.core.JsonParser)v3),((com.fasterxml.jackson.databind.DeserializationContext)v9),((java.lang.Object)v13),((java.lang.String)v14));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.StringDeserializer();
    Object v1 = 0.0D;
    Object v2 = com.fasterxml.jackson.databind.node.DoubleNode.valueOf((((java.lang.Double)v1).doubleValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2));
    Object v4 = ((com.fasterxml.jackson.core.JsonParser)v3).currentTokenId();
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6));
    Object v8 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).deserialize(((com.fasterxml.jackson.core.JsonParser)v3),((com.fasterxml.jackson.databind.DeserializationContext)v7));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 0.0D;
    Object v2 = com.fasterxml.jackson.databind.node.DoubleNode.valueOf((((java.lang.Double)v1).doubleValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2));
    Object v4 = ((com.fasterxml.jackson.core.JsonParser)v3).getBinaryValue();
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl)v7),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerBase)v0).deserializeFromArray(((com.fasterxml.jackson.core.JsonParser)v3),((com.fasterxml.jackson.databind.DeserializationContext)v10));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.StringDeserializer();
    Object v1 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v2 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl)v3),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).getEmptyValue(((com.fasterxml.jackson.databind.DeserializationContext)v6));
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "integer";
    Object v2 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerBase)v0).findBackReference(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.StringDeserializer();
    Object v1 = 0.0D;
    Object v2 = com.fasterxml.jackson.databind.node.DoubleNode.valueOf((((java.lang.Double)v1).doubleValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2));
    Object v4 = ((com.fasterxml.jackson.core.JsonParser)v3).hasCurrentToken();
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl)v7),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).deserialize(((com.fasterxml.jackson.core.JsonParser)v3),((com.fasterxml.jackson.databind.DeserializationContext)v10));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v2 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v2));
    Object v4 = "sting";
    Object v5 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = "sting";
    Object v8 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = null;
    Object v11 = ",";
    Object v12 = false;
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v9),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v10),((java.lang.String)v11),(((java.lang.Boolean)v12).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v13));
    Object v15 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v16 = null;
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v19 = 0;
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v16),((com.fasterxml.jackson.databind.JavaType)v17),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v18),(((java.lang.Integer)v19).intValue()));
    Object v21 = -12;
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v22));
    Object v24 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v25 = com.fasterxml.jackson.databind.type.TypeBindings.create(((java.lang.Class)v23),((com.fasterxml.jackson.databind.JavaType[])v24));
    Object v26 = true;
    Object v27 = ": ";
    Object v28 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v26).booleanValue()),((java.lang.String)v27));
    Object v29 = new com.fasterxml.jackson.databind.deser.CreatorProperty(((com.fasterxml.jackson.databind.PropertyName)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.PropertyName)v8),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v14),((com.fasterxml.jackson.databind.util.Annotations)v15),((com.fasterxml.jackson.databind.introspect.AnnotatedParameter)v20),(((java.lang.Integer)v21).intValue()),((java.lang.Object)v25),((com.fasterxml.jackson.databind.PropertyMetadata)v28));
    Object v30 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerBase)v0).createContextual(((com.fasterxml.jackson.databind.DeserializationContext)v3),((com.fasterxml.jackson.databind.BeanProperty)v29));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 0.0D;
    Object v2 = com.fasterxml.jackson.databind.node.DoubleNode.valueOf((((java.lang.Double)v1).doubleValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerBase)v0).deserializeFromObjectId(((com.fasterxml.jackson.core.JsonParser)v3),((com.fasterxml.jackson.databind.DeserializationContext)v6));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v2 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v2));
    Object v4 = "sting";
    Object v5 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = "sting";
    Object v8 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = null;
    Object v11 = ",";
    Object v12 = false;
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v9),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v10),((java.lang.String)v11),(((java.lang.Boolean)v12).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v13));
    Object v15 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v16 = null;
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v19 = 0;
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v16),((com.fasterxml.jackson.databind.JavaType)v17),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v18),(((java.lang.Integer)v19).intValue()));
    Object v21 = -12;
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v22));
    Object v24 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v25 = com.fasterxml.jackson.databind.type.TypeBindings.create(((java.lang.Class)v23),((com.fasterxml.jackson.databind.JavaType[])v24));
    Object v26 = true;
    Object v27 = ": ";
    Object v28 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v26).booleanValue()),((java.lang.String)v27));
    Object v29 = new com.fasterxml.jackson.databind.deser.CreatorProperty(((com.fasterxml.jackson.databind.PropertyName)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.PropertyName)v8),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v14),((com.fasterxml.jackson.databind.util.Annotations)v15),((com.fasterxml.jackson.databind.introspect.AnnotatedParameter)v20),(((java.lang.Integer)v21).intValue()),((java.lang.Object)v25),((com.fasterxml.jackson.databind.PropertyMetadata)v28));
    Object v30 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerBase)v0)._resolveManagedReferenceProperty(((com.fasterxml.jackson.databind.DeserializationContext)v3),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v29));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 0.0D;
    Object v2 = com.fasterxml.jackson.databind.node.DoubleNode.valueOf((((java.lang.Double)v1).doubleValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v8 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v7));
    Object v9 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl)v6),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.std.StringDeserializer();
    Object v11 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v12 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v11));
    Object v13 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerBase)v0).handlePolymorphic(((com.fasterxml.jackson.core.JsonParser)v3),((com.fasterxml.jackson.databind.DeserializationContext)v9),((java.lang.Object)v10),((com.fasterxml.jackson.databind.util.TokenBuffer)v12));
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
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl)v3),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.std.StringDeserializer();
    Object v8 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v9 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v8));
    Object v10 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerBase)v0)._findSubclassDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v6),((java.lang.Object)v7),((com.fasterxml.jackson.databind.util.TokenBuffer)v9));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 0.0D;
    Object v2 = com.fasterxml.jackson.databind.node.DoubleNode.valueOf((((java.lang.Double)v1).doubleValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2));
    Object v4 = ((com.fasterxml.jackson.core.JsonParser)v3).getBigIntegerValue();
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl)v7),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerBase)v0).deserializeFromObject(((com.fasterxml.jackson.core.JsonParser)v3),((com.fasterxml.jackson.databind.DeserializationContext)v10));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.StringDeserializer();
    Object v1 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v2 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl)v3),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.ObjectBuffer();
    ((com.fasterxml.jackson.databind.DeserializationContext)v6).returnObjectBuffer(((com.fasterxml.jackson.databind.util.ObjectBuffer)v7));
    Object v8 = null;
    Object v9 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).getNullValue(((com.fasterxml.jackson.databind.DeserializationContext)v6));
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 0.0D;
    Object v2 = com.fasterxml.jackson.databind.node.DoubleNode.valueOf((((java.lang.Double)v1).doubleValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v8 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v7));
    Object v9 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl)v6),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v8));
    Object v10 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerBase)v0).deserializeFromBoolean(((com.fasterxml.jackson.core.JsonParser)v3),((com.fasterxml.jackson.databind.DeserializationContext)v9));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 0.0D;
    Object v2 = com.fasterxml.jackson.databind.node.DoubleNode.valueOf((((java.lang.Double)v1).doubleValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v8 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v7));
    Object v9 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl)v6),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v8));
    Object v10 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerBase)v0).deserializeFromString(((com.fasterxml.jackson.core.JsonParser)v3),((com.fasterxml.jackson.databind.DeserializationContext)v9));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.StringDeserializer();
    Object v1 = 0.0D;
    Object v2 = com.fasterxml.jackson.databind.node.DoubleNode.valueOf((((java.lang.Double)v1).doubleValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2));
    Object v4 = 6;
    Object v5 = ((com.fasterxml.jackson.core.JsonParser)v3).nextIntValue((((java.lang.Integer)v4).intValue()));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v7));
    Object v9 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v10 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl)v8),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v10));
    Object v12 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).deserialize(((com.fasterxml.jackson.core.JsonParser)v3),((com.fasterxml.jackson.databind.DeserializationContext)v11));
    org.junit.Assert.assertEquals((Object)("0.0"), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v2 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl)v3),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    ((com.fasterxml.jackson.databind.deser.BeanDeserializerBase)v0).injectValues(((com.fasterxml.jackson.databind.DeserializationContext)v6),((java.lang.Object)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 0.0D;
    Object v2 = com.fasterxml.jackson.databind.node.DoubleNode.valueOf((((java.lang.Double)v1).doubleValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v8 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v7));
    Object v9 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl)v6),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.std.StringDeserializer();
    Object v11 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v10).getValueClass();
    Object v12 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL;
    Object v13 = ((com.fasterxml.jackson.databind.DeserializationContext)v9).mappingException(((java.lang.Class)v11),((com.fasterxml.jackson.core.JsonToken)v12));
    Object v14 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerBase)v0).deserializeFromDouble(((com.fasterxml.jackson.core.JsonParser)v3),((com.fasterxml.jackson.databind.DeserializationContext)v9));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 0.0D;
    Object v2 = com.fasterxml.jackson.databind.node.DoubleNode.valueOf((((java.lang.Double)v1).doubleValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v8 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v7));
    Object v9 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl)v6),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v8));
    ((com.fasterxml.jackson.databind.DeserializationContext)v9).checkUnresolvedObjectId();
    Object v10 = null;
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = null;
    Object v13 = ",";
    Object v14 = false;
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v12),((java.lang.String)v13),(((java.lang.Boolean)v14).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v15));
    Object v17 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerBase)v0).deserializeWithType(((com.fasterxml.jackson.core.JsonParser)v3),((com.fasterxml.jackson.databind.DeserializationContext)v9),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v16));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 0.0D;
    Object v2 = com.fasterxml.jackson.databind.node.DoubleNode.valueOf((((java.lang.Double)v1).doubleValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v8 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v7));
    Object v9 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl)v6),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v8));
    Object v10 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)7)};
    Object v11 = "No enum constants for class ";
    Object v12 = new com.fasterxml.jackson.core.util.RequestPayload(((byte[])v10),((java.lang.String)v11));
    Object v13 = "Invalid delegate-creator definition for ";
    ((com.fasterxml.jackson.databind.deser.BeanDeserializerBase)v0).handleIgnoredProperty(((com.fasterxml.jackson.core.JsonParser)v3),((com.fasterxml.jackson.databind.DeserializationContext)v9),((java.lang.Object)v12),((java.lang.String)v13));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.StringDeserializer();
    Object v1 = 0.0D;
    Object v2 = com.fasterxml.jackson.databind.node.DoubleNode.valueOf((((java.lang.Double)v1).doubleValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v8 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v7));
    Object v9 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl)v6),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = ((com.fasterxml.jackson.databind.DatabindContext)v9).constructSpecializedType(((com.fasterxml.jackson.databind.JavaType)v10),((java.lang.Class)v12));
    Object v14 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).deserialize(((com.fasterxml.jackson.core.JsonParser)v3),((com.fasterxml.jackson.databind.DeserializationContext)v9));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v2 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v2));
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v6 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerBase)v0).handleUnknownProperties(((com.fasterxml.jackson.databind.DeserializationContext)v3),((java.lang.Object)v4),((com.fasterxml.jackson.databind.util.TokenBuffer)v6));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.StringDeserializer();
    Object v1 = 0.0D;
    Object v2 = com.fasterxml.jackson.databind.node.DoubleNode.valueOf((((java.lang.Double)v1).doubleValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2));
    Object v4 = ((com.fasterxml.jackson.core.JsonParser)v3).nextValue();
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl)v7),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).deserialize(((com.fasterxml.jackson.core.JsonParser)v3),((com.fasterxml.jackson.databind.DeserializationContext)v10));
    org.junit.Assert.assertEquals((Object)("0.0"), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 0.0D;
    Object v2 = com.fasterxml.jackson.databind.node.DoubleNode.valueOf((((java.lang.Double)v1).doubleValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2));
    Object v4 = ((com.fasterxml.jackson.core.JsonParser)v3).getTokenLocation();
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl)v7),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerBase)v0).deserializeFromObject(((com.fasterxml.jackson.core.JsonParser)v3),((com.fasterxml.jackson.databind.DeserializationContext)v10));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.StringDeserializer();
    Object v1 = 0.0D;
    Object v2 = com.fasterxml.jackson.databind.node.DoubleNode.valueOf((((java.lang.Double)v1).doubleValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2));
    Object v4 = ((com.fasterxml.jackson.core.JsonParser)v3).getCurrentName();
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6));
    Object v8 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).deserialize(((com.fasterxml.jackson.core.JsonParser)v3),((com.fasterxml.jackson.databind.DeserializationContext)v7));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v2 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl)v3),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.std.StringDeserializer();
    ((com.fasterxml.jackson.databind.deser.BeanDeserializerBase)v0).injectValues(((com.fasterxml.jackson.databind.DeserializationContext)v6),((java.lang.Object)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.StringDeserializer();
    Object v1 = 0.0D;
    Object v2 = com.fasterxml.jackson.databind.node.DoubleNode.valueOf((((java.lang.Double)v1).doubleValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v8 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v7));
    Object v9 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl)v6),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = "' fr";
    Object v12 = "";
    Object v13 = ((com.fasterxml.jackson.databind.DeserializationContext)v9).unknownTypeException(((com.fasterxml.jackson.databind.JavaType)v10),((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).deserialize(((com.fasterxml.jackson.core.JsonParser)v3),((com.fasterxml.jackson.databind.DeserializationContext)v9));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v2 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v2));
    Object v4 = "sting";
    Object v5 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = "sting";
    Object v8 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = null;
    Object v11 = ",";
    Object v12 = false;
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v9),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v10),((java.lang.String)v11),(((java.lang.Boolean)v12).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v13));
    Object v15 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v16 = null;
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v19 = 0;
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v16),((com.fasterxml.jackson.databind.JavaType)v17),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v18),(((java.lang.Integer)v19).intValue()));
    Object v21 = -12;
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v22));
    Object v24 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v25 = com.fasterxml.jackson.databind.type.TypeBindings.create(((java.lang.Class)v23),((com.fasterxml.jackson.databind.JavaType[])v24));
    Object v26 = true;
    Object v27 = ": ";
    Object v28 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v26).booleanValue()),((java.lang.String)v27));
    Object v29 = new com.fasterxml.jackson.databind.deser.CreatorProperty(((com.fasterxml.jackson.databind.PropertyName)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.PropertyName)v8),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v14),((com.fasterxml.jackson.databind.util.Annotations)v15),((com.fasterxml.jackson.databind.introspect.AnnotatedParameter)v20),(((java.lang.Integer)v21).intValue()),((java.lang.Object)v25),((com.fasterxml.jackson.databind.PropertyMetadata)v28));
    Object v30 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v31 = ((com.fasterxml.jackson.databind.BeanProperty)v29).findFormatOverrides(((com.fasterxml.jackson.databind.AnnotationIntrospector)v30));
    Object v32 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerBase)v0).createContextual(((com.fasterxml.jackson.databind.DeserializationContext)v3),((com.fasterxml.jackson.databind.BeanProperty)v29));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 0.0D;
    Object v2 = com.fasterxml.jackson.databind.node.DoubleNode.valueOf((((java.lang.Double)v1).doubleValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v8 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v7));
    Object v9 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl)v6),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = "Could not find method '";
    ((com.fasterxml.jackson.databind.deser.BeanDeserializerBase)v0).handleUnknownProperty(((com.fasterxml.jackson.core.JsonParser)v3),((com.fasterxml.jackson.databind.DeserializationContext)v9),((java.lang.Object)v12),((java.lang.String)v13));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.StringDeserializer();
    Object v1 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v2 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl)v3),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    ((com.fasterxml.jackson.databind.DeserializationContext)v6).checkUnresolvedObjectId();
    Object v7 = null;
    Object v8 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).getNullValue(((com.fasterxml.jackson.databind.DeserializationContext)v6));
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.StringDeserializer();
    Object v1 = 0.0D;
    Object v2 = com.fasterxml.jackson.databind.node.DoubleNode.valueOf((((java.lang.Double)v1).doubleValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v8 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v7));
    Object v9 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl)v6),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.std.StringDeserializer();
    Object v11 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v10).getValueClass();
    Object v12 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v13 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v12));
    Object v14 = ")";
    Object v15 = com.fasterxml.jackson.databind.JsonMappingException.from(((com.fasterxml.jackson.core.JsonGenerator)v13),((java.lang.String)v14));
    Object v16 = ((com.fasterxml.jackson.databind.DeserializationContext)v9).instantiationException(((java.lang.Class)v11),((java.lang.Throwable)v15));
    Object v17 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).deserialize(((com.fasterxml.jackson.core.JsonParser)v3),((com.fasterxml.jackson.databind.DeserializationContext)v9));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 0.0D;
    Object v2 = com.fasterxml.jackson.databind.node.DoubleNode.valueOf((((java.lang.Double)v1).doubleValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v8 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v7));
    Object v9 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl)v6),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v8));
    Object v10 = new com.fasterxml.jackson.databind.util.ObjectBuffer();
    Object v11 = "s%ring";
    ((com.fasterxml.jackson.databind.deser.BeanDeserializerBase)v0).handleUnknownVanilla(((com.fasterxml.jackson.core.JsonParser)v3),((com.fasterxml.jackson.databind.DeserializationContext)v9),((java.lang.Object)v10),((java.lang.String)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = -12;
    Object v2 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerBase)v0).findProperty((((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.StringDeserializer();
    Object v1 = 0.0D;
    Object v2 = com.fasterxml.jackson.databind.node.DoubleNode.valueOf((((java.lang.Double)v1).doubleValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2));
    Object v4 = ((com.fasterxml.jackson.core.JsonParser)v3).version();
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl)v7),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).deserialize(((com.fasterxml.jackson.core.JsonParser)v3),((com.fasterxml.jackson.databind.DeserializationContext)v10));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 0.0D;
    Object v2 = com.fasterxml.jackson.databind.node.DoubleNode.valueOf((((java.lang.Double)v1).doubleValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.std.StringDeserializer();
    Object v8 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v7).getValueClass();
    Object v9 = false;
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = ")W";
    Object v12 = new com.fasterxml.jackson.databind.deser.std.StringDeserializer();
    ((com.fasterxml.jackson.databind.DeserializationContext)v6).reportUnknownProperty(((java.lang.Object)v10),((java.lang.String)v11),((com.fasterxml.jackson.databind.JsonDeserializer)v12));
    Object v13 = null;
    Object v14 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerBase)v0).deserializeFromDouble(((com.fasterxml.jackson.core.JsonParser)v3),((com.fasterxml.jackson.databind.DeserializationContext)v6));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v2 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl)v3),((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = "sting";
    Object v8 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = "sting";
    Object v11 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = null;
    Object v14 = ",";
    Object v15 = false;
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v13),((java.lang.String)v14),(((java.lang.Boolean)v15).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v16));
    Object v18 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v19 = null;
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v22 = 0;
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v19),((com.fasterxml.jackson.databind.JavaType)v20),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v21),(((java.lang.Integer)v22).intValue()));
    Object v24 = -12;
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v25));
    Object v27 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v28 = com.fasterxml.jackson.databind.type.TypeBindings.create(((java.lang.Class)v26),((com.fasterxml.jackson.databind.JavaType[])v27));
    Object v29 = true;
    Object v30 = ": ";
    Object v31 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v29).booleanValue()),((java.lang.String)v30));
    Object v32 = new com.fasterxml.jackson.databind.deser.CreatorProperty(((com.fasterxml.jackson.databind.PropertyName)v8),((com.fasterxml.jackson.databind.JavaType)v9),((com.fasterxml.jackson.databind.PropertyName)v11),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v17),((com.fasterxml.jackson.databind.util.Annotations)v18),((com.fasterxml.jackson.databind.introspect.AnnotatedParameter)v23),(((java.lang.Integer)v24).intValue()),((java.lang.Object)v28),((com.fasterxml.jackson.databind.PropertyMetadata)v31));
    Object v33 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerBase)v0).findConvertingDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v6),((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v32));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }
}
