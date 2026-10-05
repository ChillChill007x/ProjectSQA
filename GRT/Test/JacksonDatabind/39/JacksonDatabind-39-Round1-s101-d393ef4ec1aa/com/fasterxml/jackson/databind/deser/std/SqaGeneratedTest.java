package com.fasterxml.jackson.databind.deser.std;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer();
    Object v1 = 0.0F;
    Object v2 = new com.fasterxml.jackson.databind.node.FloatNode((((java.lang.Float)v1).floatValue()));
    Object v3 = new com.fasterxml.jackson.core.JsonFactory();
    Object v4 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2),((com.fasterxml.jackson.core.ObjectCodec)v4));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v10),((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.JavaType)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v16 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v14),((com.fasterxml.jackson.databind.type.TypeFactory)v15));
    Object v17 = "Can not pass null KeyDeserializers";
    Object v18 = false;
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v19));
    Object v21 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v16),((java.lang.String)v17),(((java.lang.Boolean)v18).booleanValue()),((java.lang.Class)v20));
    Object v22 = ((com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer)v0).deserializeWithType(((com.fasterxml.jackson.core.JsonParser)v5),((com.fasterxml.jackson.databind.DeserializationContext)v8),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v21));
    org.junit.Assert.assertNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer();
    Object v1 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v2 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).getEmptyValue(((com.fasterxml.jackson.databind.DeserializationContext)v3));
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer();
    Object v1 = 0.0F;
    Object v2 = new com.fasterxml.jackson.databind.node.FloatNode((((java.lang.Float)v1).floatValue()));
    Object v3 = new com.fasterxml.jackson.core.JsonFactory();
    Object v4 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2),((com.fasterxml.jackson.core.ObjectCodec)v4));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v7));
    Object v9 = ((com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer)v0).deserialize(((com.fasterxml.jackson.core.JsonParser)v5),((com.fasterxml.jackson.databind.DeserializationContext)v8));
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer();
    Object v2 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).replaceDelegatee(((com.fasterxml.jackson.databind.JsonDeserializer)v1));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer();
    Object v1 = 0.0F;
    Object v2 = new com.fasterxml.jackson.databind.node.FloatNode((((java.lang.Float)v1).floatValue()));
    Object v3 = new com.fasterxml.jackson.core.JsonFactory();
    Object v4 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2),((com.fasterxml.jackson.core.ObjectCodec)v4));
    Object v6 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS;
    Object v7 = false;
    Object v8 = ((com.fasterxml.jackson.core.JsonParser)v5).configure(((com.fasterxml.jackson.core.JsonParser.Feature)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v10 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = ((com.fasterxml.jackson.databind.DeserializationContext)v11).endOfInputException(((java.lang.Class)v13));
    Object v15 = ((com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer)v0).deserialize(((com.fasterxml.jackson.core.JsonParser)v5),((com.fasterxml.jackson.databind.DeserializationContext)v11));
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer();
    Object v1 = 0.0F;
    Object v2 = new com.fasterxml.jackson.databind.node.FloatNode((((java.lang.Float)v1).floatValue()));
    Object v3 = new com.fasterxml.jackson.core.JsonFactory();
    Object v4 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2),((com.fasterxml.jackson.core.ObjectCodec)v4));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v10),((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.JavaType)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v16 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v14),((com.fasterxml.jackson.databind.type.TypeFactory)v15));
    Object v17 = "Can not pass null KeyDeserializers";
    Object v18 = false;
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v19));
    Object v21 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v16),((java.lang.String)v17),(((java.lang.Boolean)v18).booleanValue()),((java.lang.Class)v20));
    Object v22 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).deserializeWithType(((com.fasterxml.jackson.core.JsonParser)v5),((com.fasterxml.jackson.databind.DeserializationContext)v8),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v21));
    Object v23 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).getDelegatee();
    org.junit.Assert.assertNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer();
    Object v1 = 0.0F;
    Object v2 = new com.fasterxml.jackson.databind.node.FloatNode((((java.lang.Float)v1).floatValue()));
    Object v3 = new com.fasterxml.jackson.core.JsonFactory();
    Object v4 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2),((com.fasterxml.jackson.core.ObjectCodec)v4));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v7));
    Object v9 = ((com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer)v0).deserialize(((com.fasterxml.jackson.core.JsonParser)v5),((com.fasterxml.jackson.databind.DeserializationContext)v8));
    Object v10 = 0.0F;
    Object v11 = new com.fasterxml.jackson.databind.node.FloatNode((((java.lang.Float)v10).floatValue()));
    Object v12 = new com.fasterxml.jackson.core.JsonFactory();
    Object v13 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v12));
    Object v14 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v11),((com.fasterxml.jackson.core.ObjectCodec)v13));
    Object v15 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v16 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v15));
    Object v17 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v19),((com.fasterxml.jackson.databind.JavaType)v20),((com.fasterxml.jackson.databind.JavaType)v21));
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v25 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v23),((com.fasterxml.jackson.databind.type.TypeFactory)v24));
    Object v26 = "Can not pass null KeyDeserializers";
    Object v27 = false;
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v29 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v28));
    Object v30 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v22),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v25),((java.lang.String)v26),(((java.lang.Boolean)v27).booleanValue()),((java.lang.Class)v29));
    Object v31 = ((com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer)v0).deserializeWithType(((com.fasterxml.jackson.core.JsonParser)v14),((com.fasterxml.jackson.databind.DeserializationContext)v17),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v30));
    org.junit.Assert.assertNull(v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer();
    Object v1 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v2 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).getNullValue(((com.fasterxml.jackson.databind.DeserializationContext)v3));
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer();
    Object v1 = 0.0F;
    Object v2 = new com.fasterxml.jackson.databind.node.FloatNode((((java.lang.Float)v1).floatValue()));
    Object v3 = new com.fasterxml.jackson.core.JsonFactory();
    Object v4 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2),((com.fasterxml.jackson.core.ObjectCodec)v4));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v7));
    Object v9 = 0.0F;
    Object v10 = new com.fasterxml.jackson.databind.node.FloatNode((((java.lang.Float)v9).floatValue()));
    Object v11 = new com.fasterxml.jackson.core.JsonFactory();
    Object v12 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v11));
    Object v13 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v10),((com.fasterxml.jackson.core.ObjectCodec)v12));
    Object v14 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL;
    Object v15 = "+hah:mm";
    Object v16 = ((com.fasterxml.jackson.databind.DeserializationContext)v8).wrongTokenException(((com.fasterxml.jackson.core.JsonParser)v13),((com.fasterxml.jackson.core.JsonToken)v14),((java.lang.String)v15));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v18),((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.JavaType)v20));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v24 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v22),((com.fasterxml.jackson.databind.type.TypeFactory)v23));
    Object v25 = "Can not pass null KeyDeserializers";
    Object v26 = false;
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v27));
    Object v29 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v21),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v24),((java.lang.String)v25),(((java.lang.Boolean)v26).booleanValue()),((java.lang.Class)v28));
    Object v30 = ((com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer)v0).deserializeWithType(((com.fasterxml.jackson.core.JsonParser)v5),((com.fasterxml.jackson.databind.DeserializationContext)v8),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v29));
    org.junit.Assert.assertNull(v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer();
    Object v1 = 0.0F;
    Object v2 = new com.fasterxml.jackson.databind.node.FloatNode((((java.lang.Float)v1).floatValue()));
    Object v3 = new com.fasterxml.jackson.core.JsonFactory();
    Object v4 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2),((com.fasterxml.jackson.core.ObjectCodec)v4));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v10),((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.JavaType)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v16 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v14),((com.fasterxml.jackson.databind.type.TypeFactory)v15));
    Object v17 = "Can not pass null KeyDeserializers";
    Object v18 = false;
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v19));
    Object v21 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v16),((java.lang.String)v17),(((java.lang.Boolean)v18).booleanValue()),((java.lang.Class)v20));
    Object v22 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).deserializeWithType(((com.fasterxml.jackson.core.JsonParser)v5),((com.fasterxml.jackson.databind.DeserializationContext)v8),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v21));
    Object v23 = "boolean";
    Object v24 = "FAIL_O-N_EMPTY_BEANS";
    Object v25 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v23),((java.lang.String)v24));
    Object v26 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v25));
    org.junit.Assert.assertNotNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer();
    Object v1 = " ";
    Object v2 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).findBackReference(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer();
    Object v1 = 0.0F;
    Object v2 = new com.fasterxml.jackson.databind.node.FloatNode((((java.lang.Float)v1).floatValue()));
    Object v3 = new com.fasterxml.jackson.core.JsonFactory();
    Object v4 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2),((com.fasterxml.jackson.core.ObjectCodec)v4));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v10),((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.JavaType)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v16 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v14),((com.fasterxml.jackson.databind.type.TypeFactory)v15));
    Object v17 = "Can not pass null KeyDeserializers";
    Object v18 = false;
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v19));
    Object v21 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v16),((java.lang.String)v17),(((java.lang.Boolean)v18).booleanValue()),((java.lang.Class)v20));
    Object v22 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).deserializeWithType(((com.fasterxml.jackson.core.JsonParser)v5),((com.fasterxml.jackson.databind.DeserializationContext)v8),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v21));
    Object v23 = "boolean";
    Object v24 = "FAIL_O-N_EMPTY_BEANS";
    Object v25 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v23),((java.lang.String)v24));
    Object v26 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v25));
    Object v27 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v26).handledType();
    org.junit.Assert.assertNotNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer();
    Object v1 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).isCachable();
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer();
    Object v1 = 0.0F;
    Object v2 = new com.fasterxml.jackson.databind.node.FloatNode((((java.lang.Float)v1).floatValue()));
    Object v3 = new com.fasterxml.jackson.core.JsonFactory();
    Object v4 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2),((com.fasterxml.jackson.core.ObjectCodec)v4));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v7));
    Object v9 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).deserialize(((com.fasterxml.jackson.core.JsonParser)v5),((com.fasterxml.jackson.databind.DeserializationContext)v8));
    Object v10 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v0).getValueClass();
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer();
    Object v1 = 0.0F;
    Object v2 = new com.fasterxml.jackson.databind.node.FloatNode((((java.lang.Float)v1).floatValue()));
    Object v3 = new com.fasterxml.jackson.core.JsonFactory();
    Object v4 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2),((com.fasterxml.jackson.core.ObjectCodec)v4));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v7));
    Object v9 = 0.0F;
    Object v10 = new com.fasterxml.jackson.databind.node.FloatNode((((java.lang.Float)v9).floatValue()));
    Object v11 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).deserialize(((com.fasterxml.jackson.core.JsonParser)v5),((com.fasterxml.jackson.databind.DeserializationContext)v8),((java.lang.Object)v10));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer();
    Object v1 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v0).getValueType();
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer();
    Object v1 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).getKnownPropertyNames();
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer();
    Object v1 = 0.0F;
    Object v2 = new com.fasterxml.jackson.databind.node.FloatNode((((java.lang.Float)v1).floatValue()));
    Object v3 = new com.fasterxml.jackson.core.JsonFactory();
    Object v4 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2),((com.fasterxml.jackson.core.ObjectCodec)v4));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v10),((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.JavaType)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v16 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v14),((com.fasterxml.jackson.databind.type.TypeFactory)v15));
    Object v17 = "Can not pass null KeyDeserializers";
    Object v18 = false;
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v19));
    Object v21 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v16),((java.lang.String)v17),(((java.lang.Boolean)v18).booleanValue()),((java.lang.Class)v20));
    Object v22 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v0).deserializeWithType(((com.fasterxml.jackson.core.JsonParser)v5),((com.fasterxml.jackson.databind.DeserializationContext)v8),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v21));
    Object v23 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v0).getValueType();
    org.junit.Assert.assertNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer();
    Object v1 = 0.0F;
    Object v2 = new com.fasterxml.jackson.databind.node.FloatNode((((java.lang.Float)v1).floatValue()));
    Object v3 = new com.fasterxml.jackson.core.JsonFactory();
    Object v4 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2),((com.fasterxml.jackson.core.ObjectCodec)v4));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v7));
    Object v9 = ((com.fasterxml.jackson.databind.DeserializationContext)v8).leaseObjectBuffer();
    Object v10 = ((com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer)v0).deserialize(((com.fasterxml.jackson.core.JsonParser)v5),((com.fasterxml.jackson.databind.DeserializationContext)v8));
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer();
    Object v1 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).getEmptyValue();
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer();
    Object v1 = 0.0F;
    Object v2 = new com.fasterxml.jackson.databind.node.FloatNode((((java.lang.Float)v1).floatValue()));
    Object v3 = new com.fasterxml.jackson.core.JsonFactory();
    Object v4 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2),((com.fasterxml.jackson.core.ObjectCodec)v4));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = ") has not properly overridden method 'withAdditionalDeserializers': can not instantiate subtype with additional deserializer definition";
    Object v12 = ((com.fasterxml.jackson.databind.DeserializationContext)v8).instantiationException(((java.lang.Class)v10),((java.lang.String)v11));
    Object v13 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v14 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v14));
    Object v16 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).deserialize(((com.fasterxml.jackson.core.JsonParser)v5),((com.fasterxml.jackson.databind.DeserializationContext)v8),((java.lang.Object)v15));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer();
    Object v1 = 0.0F;
    Object v2 = new com.fasterxml.jackson.databind.node.FloatNode((((java.lang.Float)v1).floatValue()));
    Object v3 = new com.fasterxml.jackson.core.JsonFactory();
    Object v4 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2),((com.fasterxml.jackson.core.ObjectCodec)v4));
    Object v6 = ((com.fasterxml.jackson.core.JsonParser)v5).getByteValue();
    Object v7 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v8 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v7));
    Object v9 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = ((com.fasterxml.jackson.databind.DeserializationContext)v9).endOfInputException(((java.lang.Class)v11));
    Object v13 = ((com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer)v0).deserialize(((com.fasterxml.jackson.core.JsonParser)v5),((com.fasterxml.jackson.databind.DeserializationContext)v9));
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer();
    Object v1 = 0.0F;
    Object v2 = new com.fasterxml.jackson.databind.node.FloatNode((((java.lang.Float)v1).floatValue()));
    Object v3 = new com.fasterxml.jackson.core.JsonFactory();
    Object v4 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2),((com.fasterxml.jackson.core.ObjectCodec)v4));
    Object v6 = ((com.fasterxml.jackson.core.JsonParser)v5).getIntValue();
    Object v7 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v8 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v7));
    Object v9 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v8));
    Object v10 = ((com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer)v0).deserialize(((com.fasterxml.jackson.core.JsonParser)v5),((com.fasterxml.jackson.databind.DeserializationContext)v9));
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer();
    Object v1 = 0.0F;
    Object v2 = new com.fasterxml.jackson.databind.node.FloatNode((((java.lang.Float)v1).floatValue()));
    Object v3 = new com.fasterxml.jackson.core.JsonFactory();
    Object v4 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2),((com.fasterxml.jackson.core.ObjectCodec)v4));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v10),((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.JavaType)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v16 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v14),((com.fasterxml.jackson.databind.type.TypeFactory)v15));
    Object v17 = "Can not pass null KeyDeserializers";
    Object v18 = false;
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v19));
    Object v21 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v16),((java.lang.String)v17),(((java.lang.Boolean)v18).booleanValue()),((java.lang.Class)v20));
    Object v22 = ((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v21).getTypeIdResolver();
    Object v23 = ((com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer)v0).deserializeWithType(((com.fasterxml.jackson.core.JsonParser)v5),((com.fasterxml.jackson.databind.DeserializationContext)v8),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v21));
    org.junit.Assert.assertNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer();
    Object v1 = "boolean";
    Object v2 = "FAIL_O-N_EMPTY_BEANS";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer();
    Object v1 = "boolean";
    Object v2 = "FAIL_O-N_EMPTY_BEANS";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v5 = 0.0F;
    Object v6 = new com.fasterxml.jackson.databind.node.FloatNode((((java.lang.Float)v5).floatValue()));
    Object v7 = new com.fasterxml.jackson.core.JsonFactory();
    Object v8 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v7));
    Object v9 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v6),((com.fasterxml.jackson.core.ObjectCodec)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = ((com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer)v4).deserialize(((com.fasterxml.jackson.core.JsonParser)v9),((com.fasterxml.jackson.databind.DeserializationContext)v12));
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer();
    Object v1 = "boolean";
    Object v2 = "FAIL_O-N_EMPTY_BEANS";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v5 = 0.0F;
    Object v6 = new com.fasterxml.jackson.databind.node.FloatNode((((java.lang.Float)v5).floatValue()));
    Object v7 = new com.fasterxml.jackson.core.JsonFactory();
    Object v8 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v7));
    Object v9 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v6),((com.fasterxml.jackson.core.ObjectCodec)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = "G]";
    Object v16 = 0.0F;
    Object v17 = new com.fasterxml.jackson.databind.node.FloatNode((((java.lang.Float)v16).floatValue()));
    Object v18 = 16L;
    Object v19 = 1L;
    Object v20 = -13;
    Object v21 = 0;
    Object v22 = new com.fasterxml.jackson.core.JsonLocation(((java.lang.Object)v17),(((java.lang.Long)v18).longValue()),(((java.lang.Long)v19).longValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()));
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v23));
    Object v25 = ")8";
    Object v26 = new java.util.HashSet();
    Object v27 = new com.fasterxml.jackson.databind.exc.UnrecognizedPropertyException(((java.lang.String)v15),((com.fasterxml.jackson.core.JsonLocation)v22),((java.lang.Class)v24),((java.lang.String)v25),((java.util.Collection)v26));
    Object v28 = com.fasterxml.jackson.databind.JsonMappingException.fromUnexpectedIOE(((java.io.IOException)v27));
    Object v29 = ((com.fasterxml.jackson.databind.DeserializationContext)v12).instantiationException(((java.lang.Class)v14),((java.lang.Throwable)v28));
    Object v30 = ((com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer)v4).deserialize(((com.fasterxml.jackson.core.JsonParser)v9),((com.fasterxml.jackson.databind.DeserializationContext)v12));
    org.junit.Assert.assertNull(v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer();
    Object v1 = 0.0F;
    Object v2 = new com.fasterxml.jackson.databind.node.FloatNode((((java.lang.Float)v1).floatValue()));
    Object v3 = new com.fasterxml.jackson.core.JsonFactory();
    Object v4 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2),((com.fasterxml.jackson.core.ObjectCodec)v4));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v7));
    Object v9 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).deserialize(((com.fasterxml.jackson.core.JsonParser)v5),((com.fasterxml.jackson.databind.DeserializationContext)v8));
    Object v10 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).getEmptyValue();
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer();
    Object v1 = "boolean";
    Object v2 = "FAIL_O-N_EMPTY_BEANS";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v5 = 0.0F;
    Object v6 = new com.fasterxml.jackson.databind.node.FloatNode((((java.lang.Float)v5).floatValue()));
    Object v7 = new com.fasterxml.jackson.core.JsonFactory();
    Object v8 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v7));
    Object v9 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v6),((com.fasterxml.jackson.core.ObjectCodec)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v14 = ((com.fasterxml.jackson.databind.JsonDeserializer)v4).deserialize(((com.fasterxml.jackson.core.JsonParser)v9),((com.fasterxml.jackson.databind.DeserializationContext)v12),((java.lang.Object)v13));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer();
    Object v1 = "boolean";
    Object v2 = "FAIL_O-N_EMPTY_BEANS";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v5 = 0.0F;
    Object v6 = new com.fasterxml.jackson.databind.node.FloatNode((((java.lang.Float)v5).floatValue()));
    Object v7 = new com.fasterxml.jackson.core.JsonFactory();
    Object v8 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v7));
    Object v9 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v6),((com.fasterxml.jackson.core.ObjectCodec)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v14),((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.JavaType)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v20 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v18),((com.fasterxml.jackson.databind.type.TypeFactory)v19));
    Object v21 = "Can not pass null KeyDeserializers";
    Object v22 = false;
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v23));
    Object v25 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v17),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v20),((java.lang.String)v21),(((java.lang.Boolean)v22).booleanValue()),((java.lang.Class)v24));
    Object v26 = ((com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer)v4).deserializeWithType(((com.fasterxml.jackson.core.JsonParser)v9),((com.fasterxml.jackson.databind.DeserializationContext)v12),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v25));
    org.junit.Assert.assertNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer();
    Object v1 = "boolean";
    Object v2 = "FAIL_O-N_EMPTY_BEANS";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v5 = 0.0F;
    Object v6 = new com.fasterxml.jackson.databind.node.FloatNode((((java.lang.Float)v5).floatValue()));
    Object v7 = new com.fasterxml.jackson.core.JsonFactory();
    Object v8 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v7));
    Object v9 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v6),((com.fasterxml.jackson.core.ObjectCodec)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = ((com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer)v4).deserialize(((com.fasterxml.jackson.core.JsonParser)v9),((com.fasterxml.jackson.databind.DeserializationContext)v12));
    Object v14 = 0.0F;
    Object v15 = new com.fasterxml.jackson.databind.node.FloatNode((((java.lang.Float)v14).floatValue()));
    Object v16 = new com.fasterxml.jackson.core.JsonFactory();
    Object v17 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v16));
    Object v18 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v15),((com.fasterxml.jackson.core.ObjectCodec)v17));
    Object v19 = ((com.fasterxml.jackson.core.JsonParser)v18).getParsingContext();
    Object v20 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v21 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v20));
    Object v22 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v21));
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v23));
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v27 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v24),((com.fasterxml.jackson.databind.JavaType)v25),((com.fasterxml.jackson.databind.JavaType)v26));
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v29 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v30 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v28),((com.fasterxml.jackson.databind.type.TypeFactory)v29));
    Object v31 = "Can not pass null KeyDeserializers";
    Object v32 = false;
    Object v33 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v34 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v33));
    Object v35 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v27),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v30),((java.lang.String)v31),(((java.lang.Boolean)v32).booleanValue()),((java.lang.Class)v34));
    Object v36 = ((com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer)v4).deserializeWithType(((com.fasterxml.jackson.core.JsonParser)v18),((com.fasterxml.jackson.databind.DeserializationContext)v22),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v35));
    org.junit.Assert.assertNull(v36);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer();
    Object v1 = "boolean";
    Object v2 = "FAIL_O-N_EMPTY_BEANS";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v5 = 0.0F;
    Object v6 = new com.fasterxml.jackson.databind.node.FloatNode((((java.lang.Float)v5).floatValue()));
    Object v7 = new com.fasterxml.jackson.core.JsonFactory();
    Object v8 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v7));
    Object v9 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v6),((com.fasterxml.jackson.core.ObjectCodec)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v14),((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.JavaType)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v20 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v18),((com.fasterxml.jackson.databind.type.TypeFactory)v19));
    Object v21 = "Can not pass null KeyDeserializers";
    Object v22 = false;
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v23));
    Object v25 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v17),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v20),((java.lang.String)v21),(((java.lang.Boolean)v22).booleanValue()),((java.lang.Class)v24));
    Object v26 = ((com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer)v4).deserializeWithType(((com.fasterxml.jackson.core.JsonParser)v9),((com.fasterxml.jackson.databind.DeserializationContext)v12),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v25));
    Object v27 = 0.0F;
    Object v28 = new com.fasterxml.jackson.databind.node.FloatNode((((java.lang.Float)v27).floatValue()));
    Object v29 = new com.fasterxml.jackson.core.JsonFactory();
    Object v30 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v29));
    Object v31 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v28),((com.fasterxml.jackson.core.ObjectCodec)v30));
    Object v32 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v33 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v32));
    Object v34 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v33));
    Object v35 = ((com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer)v4).deserialize(((com.fasterxml.jackson.core.JsonParser)v31),((com.fasterxml.jackson.databind.DeserializationContext)v34));
    org.junit.Assert.assertNull(v35);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer();
    Object v1 = 0.0F;
    Object v2 = new com.fasterxml.jackson.databind.node.FloatNode((((java.lang.Float)v1).floatValue()));
    Object v3 = new com.fasterxml.jackson.core.JsonFactory();
    Object v4 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2),((com.fasterxml.jackson.core.ObjectCodec)v4));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v10),((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.JavaType)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v16 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v14),((com.fasterxml.jackson.databind.type.TypeFactory)v15));
    Object v17 = "Can not pass null KeyDeserializers";
    Object v18 = false;
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v19));
    Object v21 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v16),((java.lang.String)v17),(((java.lang.Boolean)v18).booleanValue()),((java.lang.Class)v20));
    Object v22 = ((com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer)v0).deserializeWithType(((com.fasterxml.jackson.core.JsonParser)v5),((com.fasterxml.jackson.databind.DeserializationContext)v8),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v21));
    Object v23 = 0.0F;
    Object v24 = new com.fasterxml.jackson.databind.node.FloatNode((((java.lang.Float)v23).floatValue()));
    Object v25 = new com.fasterxml.jackson.core.JsonFactory();
    Object v26 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v25));
    Object v27 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v24),((com.fasterxml.jackson.core.ObjectCodec)v26));
    Object v28 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v29 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v28));
    Object v30 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v29));
    Object v31 = ((com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer)v0).deserialize(((com.fasterxml.jackson.core.JsonParser)v27),((com.fasterxml.jackson.databind.DeserializationContext)v30));
    org.junit.Assert.assertNull(v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer();
    Object v1 = 0.0F;
    Object v2 = new com.fasterxml.jackson.databind.node.FloatNode((((java.lang.Float)v1).floatValue()));
    Object v3 = new com.fasterxml.jackson.core.JsonFactory();
    Object v4 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2),((com.fasterxml.jackson.core.ObjectCodec)v4));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = "G]";
    Object v12 = 0.0F;
    Object v13 = new com.fasterxml.jackson.databind.node.FloatNode((((java.lang.Float)v12).floatValue()));
    Object v14 = 16L;
    Object v15 = 1L;
    Object v16 = -13;
    Object v17 = 0;
    Object v18 = new com.fasterxml.jackson.core.JsonLocation(((java.lang.Object)v13),(((java.lang.Long)v14).longValue()),(((java.lang.Long)v15).longValue()),(((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v19));
    Object v21 = ")8";
    Object v22 = new java.util.HashSet();
    Object v23 = new com.fasterxml.jackson.databind.exc.UnrecognizedPropertyException(((java.lang.String)v11),((com.fasterxml.jackson.core.JsonLocation)v18),((java.lang.Class)v20),((java.lang.String)v21),((java.util.Collection)v22));
    Object v24 = ((com.fasterxml.jackson.databind.DeserializationContext)v8).instantiationException(((java.lang.Class)v10),((java.lang.Throwable)v23));
    Object v25 = ((com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer)v0).deserialize(((com.fasterxml.jackson.core.JsonParser)v5),((com.fasterxml.jackson.databind.DeserializationContext)v8));
    org.junit.Assert.assertNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer();
    Object v1 = "boolean";
    Object v2 = "FAIL_O-N_EMPTY_BEANS";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v5 = ((com.fasterxml.jackson.databind.JsonDeserializer)v4).getObjectIdReader();
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer();
    Object v1 = 0.0F;
    Object v2 = new com.fasterxml.jackson.databind.node.FloatNode((((java.lang.Float)v1).floatValue()));
    Object v3 = new com.fasterxml.jackson.core.JsonFactory();
    Object v4 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2),((com.fasterxml.jackson.core.ObjectCodec)v4));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v10),((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.JavaType)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v16 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v14),((com.fasterxml.jackson.databind.type.TypeFactory)v15));
    Object v17 = "Can not pass null KeyDeserializers";
    Object v18 = false;
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v19));
    Object v21 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v16),((java.lang.String)v17),(((java.lang.Boolean)v18).booleanValue()),((java.lang.Class)v20));
    Object v22 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v0).deserializeWithType(((com.fasterxml.jackson.core.JsonParser)v5),((com.fasterxml.jackson.databind.DeserializationContext)v8),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v21));
    Object v23 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v0).getValueClass();
    org.junit.Assert.assertNotNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer();
    Object v1 = "boolean";
    Object v2 = "FAIL_O-N_EMPTY_BEANS";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v5 = ((com.fasterxml.jackson.databind.JsonDeserializer)v4).isCachable();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer();
    Object v1 = "boolean";
    Object v2 = "FAIL_O-N_EMPTY_BEANS";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v5 = 0.0F;
    Object v6 = new com.fasterxml.jackson.databind.node.FloatNode((((java.lang.Float)v5).floatValue()));
    Object v7 = new com.fasterxml.jackson.core.JsonFactory();
    Object v8 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v7));
    Object v9 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v6),((com.fasterxml.jackson.core.ObjectCodec)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = new com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer();
    Object v14 = "string";
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = "stri=ng";
    Object v17 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v16));
    Object v18 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v19));
    Object v21 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v22 = null;
    Object v23 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v20),((com.fasterxml.jackson.databind.AnnotationIntrospector)v21),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v22));
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v24));
    Object v26 = false;
    Object v27 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v25),(((java.lang.Boolean)v26).booleanValue()));
    Object v28 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v29 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v30 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v23),((java.lang.reflect.Constructor)v27),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v28),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v29));
    Object v31 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v32 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v31));
    Object v33 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v34 = 6;
    Object v35 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v30),((java.lang.reflect.Type)v32),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v33),(((java.lang.Integer)v34).intValue()));
    Object v36 = false;
    Object v37 = new com.fasterxml.jackson.databind.BeanProperty.Std(((java.lang.String)v14),((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.PropertyName)v17),((com.fasterxml.jackson.databind.util.Annotations)v18),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v35),(((java.lang.Boolean)v36).booleanValue()));
    Object v38 = ((com.fasterxml.jackson.databind.DeserializationContext)v12).handlePrimaryContextualization(((com.fasterxml.jackson.databind.JsonDeserializer)v13),((com.fasterxml.jackson.databind.BeanProperty)v37));
    Object v39 = ((com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer)v4).deserialize(((com.fasterxml.jackson.core.JsonParser)v9),((com.fasterxml.jackson.databind.DeserializationContext)v12));
    org.junit.Assert.assertNull(v39);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer();
    Object v1 = ": ";
    Object v2 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).findBackReference(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer();
    Object v1 = "boolean";
    Object v2 = "FAIL_O-N_EMPTY_BEANS";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer();
    Object v6 = "boolean";
    Object v7 = "FAIL_O-N_EMPTY_BEANS";
    Object v8 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = ((com.fasterxml.jackson.databind.JsonDeserializer)v5).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v8));
    Object v10 = ((com.fasterxml.jackson.databind.JsonDeserializer)v4).replaceDelegatee(((com.fasterxml.jackson.databind.JsonDeserializer)v9));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer();
    Object v1 = "boolean";
    Object v2 = "FAIL_O-N_EMPTY_BEANS";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6));
    Object v8 = ((com.fasterxml.jackson.databind.JsonDeserializer)v4).getEmptyValue(((com.fasterxml.jackson.databind.DeserializationContext)v7));
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer();
    Object v1 = 0.0F;
    Object v2 = new com.fasterxml.jackson.databind.node.FloatNode((((java.lang.Float)v1).floatValue()));
    Object v3 = new com.fasterxml.jackson.core.JsonFactory();
    Object v4 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2),((com.fasterxml.jackson.core.ObjectCodec)v4));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v10),((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.JavaType)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v16 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v14),((com.fasterxml.jackson.databind.type.TypeFactory)v15));
    Object v17 = "Can not pass null KeyDeserializers";
    Object v18 = false;
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v19));
    Object v21 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v16),((java.lang.String)v17),(((java.lang.Boolean)v18).booleanValue()),((java.lang.Class)v20));
    Object v22 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).deserializeWithType(((com.fasterxml.jackson.core.JsonParser)v5),((com.fasterxml.jackson.databind.DeserializationContext)v8),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v21));
    Object v23 = "boolean";
    Object v24 = "FAIL_O-N_EMPTY_BEANS";
    Object v25 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v23),((java.lang.String)v24));
    Object v26 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v25));
    Object v27 = 0.0F;
    Object v28 = new com.fasterxml.jackson.databind.node.FloatNode((((java.lang.Float)v27).floatValue()));
    Object v29 = new com.fasterxml.jackson.core.JsonFactory();
    Object v30 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v29));
    Object v31 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v28),((com.fasterxml.jackson.core.ObjectCodec)v30));
    Object v32 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v33 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v32));
    Object v34 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v33));
    Object v35 = ((com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer)v26).deserialize(((com.fasterxml.jackson.core.JsonParser)v31),((com.fasterxml.jackson.databind.DeserializationContext)v34));
    org.junit.Assert.assertNull(v35);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer();
    Object v1 = "boolean";
    Object v2 = "FAIL_O-N_EMPTY_BEANS";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v5 = 0.0F;
    Object v6 = new com.fasterxml.jackson.databind.node.FloatNode((((java.lang.Float)v5).floatValue()));
    Object v7 = new com.fasterxml.jackson.core.JsonFactory();
    Object v8 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v7));
    Object v9 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v6),((com.fasterxml.jackson.core.ObjectCodec)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v14),((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.JavaType)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v20 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v18),((com.fasterxml.jackson.databind.type.TypeFactory)v19));
    Object v21 = "Can not pass null KeyDeserializers";
    Object v22 = false;
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v23));
    Object v25 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v17),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v20),((java.lang.String)v21),(((java.lang.Boolean)v22).booleanValue()),((java.lang.Class)v24));
    Object v26 = ((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v25).getDefaultImpl();
    Object v27 = ((com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer)v4).deserializeWithType(((com.fasterxml.jackson.core.JsonParser)v9),((com.fasterxml.jackson.databind.DeserializationContext)v12),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v25));
    org.junit.Assert.assertNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer();
    Object v1 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v2 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v2));
    Object v4 = ((com.fasterxml.jackson.databind.DeserializationContext)v3).leaseObjectBuffer();
    Object v5 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).getEmptyValue(((com.fasterxml.jackson.databind.DeserializationContext)v3));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer();
    Object v1 = "boolean";
    Object v2 = "FAIL_O-N_EMPTY_BEANS";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v5 = "boolean";
    Object v6 = "FAIL_O-N_EMPTY_BEANS";
    Object v7 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = ((com.fasterxml.jackson.databind.JsonDeserializer)v4).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer();
    Object v1 = "boolean";
    Object v2 = "FAIL_O-N_EMPTY_BEANS";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v5 = ((com.fasterxml.jackson.databind.JsonDeserializer)v4).getNullValue();
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer();
    Object v1 = "boolean";
    Object v2 = "FAIL_O-N_EMPTY_BEANS";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v5 = "boolean";
    Object v6 = "FAIL_O-N_EMPTY_BEANS";
    Object v7 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = ((com.fasterxml.jackson.databind.JsonDeserializer)v4).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v7));
    Object v9 = ((com.fasterxml.jackson.databind.JsonDeserializer)v8).getNullValue();
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer();
    Object v1 = "boolean";
    Object v2 = "FAIL_O-N_EMPTY_BEANS";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v5 = 0.0F;
    Object v6 = new com.fasterxml.jackson.databind.node.FloatNode((((java.lang.Float)v5).floatValue()));
    Object v7 = new com.fasterxml.jackson.core.JsonFactory();
    Object v8 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v7));
    Object v9 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v6),((com.fasterxml.jackson.core.ObjectCodec)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = ((com.fasterxml.jackson.databind.JsonDeserializer)v4).deserialize(((com.fasterxml.jackson.core.JsonParser)v9),((com.fasterxml.jackson.databind.DeserializationContext)v12));
    Object v14 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v15 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v15));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = "' value but there was more than a single value in the array";
    Object v19 = ((com.fasterxml.jackson.databind.DeserializationContext)v16).unknownTypeException(((com.fasterxml.jackson.databind.JavaType)v17),((java.lang.String)v18));
    Object v20 = ((com.fasterxml.jackson.databind.JsonDeserializer)v4).getNullValue(((com.fasterxml.jackson.databind.DeserializationContext)v16));
    org.junit.Assert.assertNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer();
    Object v1 = "boolean";
    Object v2 = "FAIL_O-N_EMPTY_BEANS";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v5 = "boolean";
    Object v6 = "FAIL_O-N_EMPTY_BEANS";
    Object v7 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = ((com.fasterxml.jackson.databind.JsonDeserializer)v4).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v7));
    Object v9 = 0.0F;
    Object v10 = new com.fasterxml.jackson.databind.node.FloatNode((((java.lang.Float)v9).floatValue()));
    Object v11 = new com.fasterxml.jackson.core.JsonFactory();
    Object v12 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v11));
    Object v13 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v10),((com.fasterxml.jackson.core.ObjectCodec)v12));
    Object v14 = ((com.fasterxml.jackson.core.JsonParser)v13).isExpectedStartObjectToken();
    Object v15 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v16 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v15));
    Object v17 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v16));
    Object v18 = ((com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer)v8).deserialize(((com.fasterxml.jackson.core.JsonParser)v13),((com.fasterxml.jackson.databind.DeserializationContext)v17));
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer();
    Object v1 = "boolean";
    Object v2 = "FAIL_O-N_EMPTY_BEANS";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v5 = "boolean";
    Object v6 = "FAIL_O-N_EMPTY_BEANS";
    Object v7 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = ((com.fasterxml.jackson.databind.JsonDeserializer)v4).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v7));
    Object v9 = 0.0F;
    Object v10 = new com.fasterxml.jackson.databind.node.FloatNode((((java.lang.Float)v9).floatValue()));
    Object v11 = new com.fasterxml.jackson.core.JsonFactory();
    Object v12 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v11));
    Object v13 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v10),((com.fasterxml.jackson.core.ObjectCodec)v12));
    Object v14 = 0;
    Object v15 = ((com.fasterxml.jackson.core.JsonParser)v13).setFeatureMask((((java.lang.Integer)v14).intValue()));
    Object v16 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v17 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v19));
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v20),((com.fasterxml.jackson.databind.JavaType)v21),((com.fasterxml.jackson.databind.JavaType)v22));
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v26 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v24),((com.fasterxml.jackson.databind.type.TypeFactory)v25));
    Object v27 = "Can not pass null KeyDeserializers";
    Object v28 = false;
    Object v29 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v30 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v29));
    Object v31 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v23),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v26),((java.lang.String)v27),(((java.lang.Boolean)v28).booleanValue()),((java.lang.Class)v30));
    Object v32 = ((com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer)v8).deserializeWithType(((com.fasterxml.jackson.core.JsonParser)v13),((com.fasterxml.jackson.databind.DeserializationContext)v18),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v31));
    org.junit.Assert.assertNull(v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer();
    Object v1 = "boolean";
    Object v2 = "FAIL_O-N_EMPTY_BEANS";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v5 = "boolean";
    Object v6 = "FAIL_O-N_EMPTY_BEANS";
    Object v7 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = ((com.fasterxml.jackson.databind.JsonDeserializer)v4).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v7));
    Object v9 = 0.0F;
    Object v10 = new com.fasterxml.jackson.databind.node.FloatNode((((java.lang.Float)v9).floatValue()));
    Object v11 = new com.fasterxml.jackson.core.JsonFactory();
    Object v12 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v11));
    Object v13 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v10),((com.fasterxml.jackson.core.ObjectCodec)v12));
    Object v14 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v15 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v15));
    Object v17 = ((com.fasterxml.jackson.databind.JsonDeserializer)v8).deserialize(((com.fasterxml.jackson.core.JsonParser)v13),((com.fasterxml.jackson.databind.DeserializationContext)v16));
    Object v18 = ((com.fasterxml.jackson.databind.JsonDeserializer)v8).isCachable();
    org.junit.Assert.assertEquals((Object)(false), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer();
    Object v1 = "boolean";
    Object v2 = "FAIL_O-N_EMPTY_BEANS";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v5 = 0.0F;
    Object v6 = new com.fasterxml.jackson.databind.node.FloatNode((((java.lang.Float)v5).floatValue()));
    Object v7 = new com.fasterxml.jackson.core.JsonFactory();
    Object v8 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v7));
    Object v9 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v6),((com.fasterxml.jackson.core.ObjectCodec)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v14),((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.JavaType)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v20 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v18),((com.fasterxml.jackson.databind.type.TypeFactory)v19));
    Object v21 = "Can not pass null KeyDeserializers";
    Object v22 = false;
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v23));
    Object v25 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v17),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v20),((java.lang.String)v21),(((java.lang.Boolean)v22).booleanValue()),((java.lang.Class)v24));
    Object v26 = ((com.fasterxml.jackson.databind.JsonDeserializer)v4).deserializeWithType(((com.fasterxml.jackson.core.JsonParser)v9),((com.fasterxml.jackson.databind.DeserializationContext)v12),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v25));
    Object v27 = new com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer();
    Object v28 = "boolean";
    Object v29 = "FAIL_O-N_EMPTY_BEANS";
    Object v30 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v28),((java.lang.String)v29));
    Object v31 = ((com.fasterxml.jackson.databind.JsonDeserializer)v27).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v30));
    Object v32 = ((com.fasterxml.jackson.databind.JsonDeserializer)v4).replaceDelegatee(((com.fasterxml.jackson.databind.JsonDeserializer)v31));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer();
    Object v1 = "boolean";
    Object v2 = "FAIL_O-N_EMPTY_BEANS";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v5 = "boolean";
    Object v6 = "FAIL_O-N_EMPTY_BEANS";
    Object v7 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = ((com.fasterxml.jackson.databind.JsonDeserializer)v4).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v7));
    Object v9 = 0.0F;
    Object v10 = new com.fasterxml.jackson.databind.node.FloatNode((((java.lang.Float)v9).floatValue()));
    Object v11 = new com.fasterxml.jackson.core.JsonFactory();
    Object v12 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v11));
    Object v13 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v10),((com.fasterxml.jackson.core.ObjectCodec)v12));
    Object v14 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v15 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v15));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v18),((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.JavaType)v20));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v24 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v22),((com.fasterxml.jackson.databind.type.TypeFactory)v23));
    Object v25 = "Can not pass null KeyDeserializers";
    Object v26 = false;
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v27));
    Object v29 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v21),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v24),((java.lang.String)v25),(((java.lang.Boolean)v26).booleanValue()),((java.lang.Class)v28));
    Object v30 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v8).deserializeWithType(((com.fasterxml.jackson.core.JsonParser)v13),((com.fasterxml.jackson.databind.DeserializationContext)v16),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v29));
    Object v31 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v8).getValueType();
    org.junit.Assert.assertNull(v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer();
    Object v1 = 0.0F;
    Object v2 = new com.fasterxml.jackson.databind.node.FloatNode((((java.lang.Float)v1).floatValue()));
    Object v3 = new com.fasterxml.jackson.core.JsonFactory();
    Object v4 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2),((com.fasterxml.jackson.core.ObjectCodec)v4));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v7));
    Object v9 = ((com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer)v0).deserialize(((com.fasterxml.jackson.core.JsonParser)v5),((com.fasterxml.jackson.databind.DeserializationContext)v8));
    Object v10 = 0.0F;
    Object v11 = new com.fasterxml.jackson.databind.node.FloatNode((((java.lang.Float)v10).floatValue()));
    Object v12 = new com.fasterxml.jackson.core.JsonFactory();
    Object v13 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v12));
    Object v14 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v11),((com.fasterxml.jackson.core.ObjectCodec)v13));
    Object v15 = ((com.fasterxml.jackson.core.JsonParser)v14).getBinaryValue();
    Object v16 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v17 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v19));
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v20),((com.fasterxml.jackson.databind.JavaType)v21),((com.fasterxml.jackson.databind.JavaType)v22));
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v26 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v24),((com.fasterxml.jackson.databind.type.TypeFactory)v25));
    Object v27 = "Can not pass null KeyDeserializers";
    Object v28 = false;
    Object v29 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v30 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v29));
    Object v31 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v23),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v26),((java.lang.String)v27),(((java.lang.Boolean)v28).booleanValue()),((java.lang.Class)v30));
    Object v32 = ((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v31).getTypeInclusion();
    Object v33 = ((com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer)v0).deserializeWithType(((com.fasterxml.jackson.core.JsonParser)v14),((com.fasterxml.jackson.databind.DeserializationContext)v18),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v31));
    org.junit.Assert.assertNull(v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer();
    Object v1 = "boolean";
    Object v2 = "FAIL_O-N_EMPTY_BEANS";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v5 = "boolean";
    Object v6 = "FAIL_O-N_EMPTY_BEANS";
    Object v7 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = ((com.fasterxml.jackson.databind.JsonDeserializer)v4).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v7));
    Object v9 = 0.0F;
    Object v10 = new com.fasterxml.jackson.databind.node.FloatNode((((java.lang.Float)v9).floatValue()));
    Object v11 = new com.fasterxml.jackson.core.JsonFactory();
    Object v12 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v11));
    Object v13 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v10),((com.fasterxml.jackson.core.ObjectCodec)v12));
    Object v14 = ((com.fasterxml.jackson.core.JsonParser)v13).getCurrentValue();
    Object v15 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v16 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v15));
    Object v17 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v19),((com.fasterxml.jackson.databind.JavaType)v20),((com.fasterxml.jackson.databind.JavaType)v21));
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v25 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v23),((com.fasterxml.jackson.databind.type.TypeFactory)v24));
    Object v26 = "Can not pass null KeyDeserializers";
    Object v27 = false;
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v29 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v28));
    Object v30 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v22),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v25),((java.lang.String)v26),(((java.lang.Boolean)v27).booleanValue()),((java.lang.Class)v29));
    Object v31 = ((com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer)v8).deserializeWithType(((com.fasterxml.jackson.core.JsonParser)v13),((com.fasterxml.jackson.databind.DeserializationContext)v17),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v30));
    org.junit.Assert.assertNull(v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer();
    Object v1 = "boolean";
    Object v2 = "FAIL_O-N_EMPTY_BEANS";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v5 = ((com.fasterxml.jackson.databind.JsonDeserializer)v4).getKnownPropertyNames();
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer();
    Object v1 = "boolean";
    Object v2 = "FAIL_O-N_EMPTY_BEANS";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v5 = 0.0F;
    Object v6 = new com.fasterxml.jackson.databind.node.FloatNode((((java.lang.Float)v5).floatValue()));
    Object v7 = new com.fasterxml.jackson.core.JsonFactory();
    Object v8 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v7));
    Object v9 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v6),((com.fasterxml.jackson.core.ObjectCodec)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = 0.0F;
    Object v14 = new com.fasterxml.jackson.databind.node.FloatNode((((java.lang.Float)v13).floatValue()));
    Object v15 = new com.fasterxml.jackson.core.JsonFactory();
    Object v16 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v15));
    Object v17 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v14),((com.fasterxml.jackson.core.ObjectCodec)v16));
    Object v18 = com.fasterxml.jackson.core.JsonToken.VALUE_FALSE;
    Object v19 = ")3: ";
    Object v20 = ((com.fasterxml.jackson.databind.DeserializationContext)v12).wrongTokenException(((com.fasterxml.jackson.core.JsonParser)v17),((com.fasterxml.jackson.core.JsonToken)v18),((java.lang.String)v19));
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v22 = ((com.fasterxml.jackson.databind.JsonDeserializer)v4).deserialize(((com.fasterxml.jackson.core.JsonParser)v9),((com.fasterxml.jackson.databind.DeserializationContext)v12),((java.lang.Object)v21));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer();
    Object v1 = "boolean";
    Object v2 = "FAIL_O-N_EMPTY_BEANS";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v5 = "boolean";
    Object v6 = "FAIL_O-N_EMPTY_BEANS";
    Object v7 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = ((com.fasterxml.jackson.databind.JsonDeserializer)v4).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v7));
    Object v9 = ((com.fasterxml.jackson.databind.JsonDeserializer)v8).isCachable();
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer();
    Object v1 = "boolean";
    Object v2 = "FAIL_O-N_EMPTY_BEANS";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v5 = "boolean";
    Object v6 = "FAIL_O-N_EMPTY_BEANS";
    Object v7 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = ((com.fasterxml.jackson.databind.JsonDeserializer)v4).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v7));
    Object v9 = 0.0F;
    Object v10 = new com.fasterxml.jackson.databind.node.FloatNode((((java.lang.Float)v9).floatValue()));
    Object v11 = new com.fasterxml.jackson.core.JsonFactory();
    Object v12 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v11));
    Object v13 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v10),((com.fasterxml.jackson.core.ObjectCodec)v12));
    Object v14 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v15 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v15));
    Object v17 = ((com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer)v8).deserialize(((com.fasterxml.jackson.core.JsonParser)v13),((com.fasterxml.jackson.databind.DeserializationContext)v16));
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer();
    Object v1 = "boolean";
    Object v2 = "FAIL_O-N_EMPTY_BEANS";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v5 = 0.0F;
    Object v6 = new com.fasterxml.jackson.databind.node.FloatNode((((java.lang.Float)v5).floatValue()));
    Object v7 = new com.fasterxml.jackson.core.JsonFactory();
    Object v8 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v7));
    Object v9 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v6),((com.fasterxml.jackson.core.ObjectCodec)v8));
    Object v10 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
    Object v11 = ((com.fasterxml.jackson.core.JsonParser)v9).disable(((com.fasterxml.jackson.core.JsonParser.Feature)v10));
    Object v12 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v13 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v12));
    Object v14 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v13));
    Object v15 = ((com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer)v4).deserialize(((com.fasterxml.jackson.core.JsonParser)v9),((com.fasterxml.jackson.databind.DeserializationContext)v14));
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer();
    Object v1 = "boolean";
    Object v2 = "FAIL_O-N_EMPTY_BEANS";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v5 = "boolean";
    Object v6 = "FAIL_O-N_EMPTY_BEANS";
    Object v7 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = ((com.fasterxml.jackson.databind.JsonDeserializer)v4).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v7));
    Object v9 = ((com.fasterxml.jackson.databind.JsonDeserializer)v8).getKnownPropertyNames();
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer();
    Object v1 = "boolean";
    Object v2 = "FAIL_O-N_EMPTY_BEANS";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v5 = "boolean";
    Object v6 = "FAIL_O-N_EMPTY_BEANS";
    Object v7 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = ((com.fasterxml.jackson.databind.JsonDeserializer)v4).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v7));
    Object v9 = 0.0F;
    Object v10 = new com.fasterxml.jackson.databind.node.FloatNode((((java.lang.Float)v9).floatValue()));
    Object v11 = new com.fasterxml.jackson.core.JsonFactory();
    Object v12 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v11));
    Object v13 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v10),((com.fasterxml.jackson.core.ObjectCodec)v12));
    Object v14 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v15 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v15));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v17));
    Object v19 = ((com.fasterxml.jackson.databind.DeserializationContext)v16).endOfInputException(((java.lang.Class)v18));
    Object v20 = ((com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer)v8).deserialize(((com.fasterxml.jackson.core.JsonParser)v13),((com.fasterxml.jackson.databind.DeserializationContext)v16));
    org.junit.Assert.assertNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer();
    Object v1 = "boolean";
    Object v2 = "FAIL_O-N_EMPTY_BEANS";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v5 = "boolean";
    Object v6 = "FAIL_O-N_EMPTY_BEANS";
    Object v7 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = ((com.fasterxml.jackson.databind.JsonDeserializer)v4).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v7));
    Object v9 = 0.0F;
    Object v10 = new com.fasterxml.jackson.databind.node.FloatNode((((java.lang.Float)v9).floatValue()));
    Object v11 = new com.fasterxml.jackson.core.JsonFactory();
    Object v12 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v11));
    Object v13 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v10),((com.fasterxml.jackson.core.ObjectCodec)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v14));
    Object v16 = ((com.fasterxml.jackson.core.JsonParser)v13).readValuesAs(((java.lang.Class)v15));
    Object v17 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v18 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v17));
    Object v19 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v21),((com.fasterxml.jackson.databind.JavaType)v22),((com.fasterxml.jackson.databind.JavaType)v23));
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v27 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v25),((com.fasterxml.jackson.databind.type.TypeFactory)v26));
    Object v28 = "Can not pass null KeyDeserializers";
    Object v29 = false;
    Object v30 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v31 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v30));
    Object v32 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v24),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v27),((java.lang.String)v28),(((java.lang.Boolean)v29).booleanValue()),((java.lang.Class)v31));
    Object v33 = ((com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer)v8).deserializeWithType(((com.fasterxml.jackson.core.JsonParser)v13),((com.fasterxml.jackson.databind.DeserializationContext)v19),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v32));
    org.junit.Assert.assertNull(v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer();
    Object v1 = "boolean";
    Object v2 = "FAIL_O-N_EMPTY_BEANS";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v5 = "boolean";
    Object v6 = "FAIL_O-N_EMPTY_BEANS";
    Object v7 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = ((com.fasterxml.jackson.databind.JsonDeserializer)v4).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v7));
    Object v9 = 0.0F;
    Object v10 = new com.fasterxml.jackson.databind.node.FloatNode((((java.lang.Float)v9).floatValue()));
    Object v11 = new com.fasterxml.jackson.core.JsonFactory();
    Object v12 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v11));
    Object v13 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v10),((com.fasterxml.jackson.core.ObjectCodec)v12));
    Object v14 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v15 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v15));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v18),((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.JavaType)v20));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v24 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v22),((com.fasterxml.jackson.databind.type.TypeFactory)v23));
    Object v25 = "Can not pass null KeyDeserializers";
    Object v26 = false;
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v27));
    Object v29 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v21),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v24),((java.lang.String)v25),(((java.lang.Boolean)v26).booleanValue()),((java.lang.Class)v28));
    Object v30 = ((com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer)v8).deserializeWithType(((com.fasterxml.jackson.core.JsonParser)v13),((com.fasterxml.jackson.databind.DeserializationContext)v16),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v29));
    org.junit.Assert.assertNull(v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer();
    Object v1 = "boolean";
    Object v2 = "FAIL_O-N_EMPTY_BEANS";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v5 = "boolean";
    Object v6 = "FAIL_O-N_EMPTY_BEANS";
    Object v7 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = ((com.fasterxml.jackson.databind.JsonDeserializer)v4).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v7));
    Object v9 = 0.0F;
    Object v10 = new com.fasterxml.jackson.databind.node.FloatNode((((java.lang.Float)v9).floatValue()));
    Object v11 = new com.fasterxml.jackson.core.JsonFactory();
    Object v12 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v11));
    Object v13 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v10),((com.fasterxml.jackson.core.ObjectCodec)v12));
    Object v14 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v15 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v15));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = "]";
    Object v19 = "F";
    Object v20 = ((com.fasterxml.jackson.databind.DeserializationContext)v16).unknownTypeException(((com.fasterxml.jackson.databind.JavaType)v17),((java.lang.String)v18),((java.lang.String)v19));
    Object v21 = ((com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer)v8).deserialize(((com.fasterxml.jackson.core.JsonParser)v13),((com.fasterxml.jackson.databind.DeserializationContext)v16));
    org.junit.Assert.assertNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer();
    Object v1 = "boolean";
    Object v2 = "FAIL_O-N_EMPTY_BEANS";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v5 = "boolean";
    Object v6 = "FAIL_O-N_EMPTY_BEANS";
    Object v7 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = ((com.fasterxml.jackson.databind.JsonDeserializer)v4).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v7));
    Object v9 = 0.0F;
    Object v10 = new com.fasterxml.jackson.databind.node.FloatNode((((java.lang.Float)v9).floatValue()));
    Object v11 = new com.fasterxml.jackson.core.JsonFactory();
    Object v12 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v11));
    Object v13 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v10),((com.fasterxml.jackson.core.ObjectCodec)v12));
    Object v14 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v15 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v15));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v18),((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.JavaType)v20));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v24 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v22),((com.fasterxml.jackson.databind.type.TypeFactory)v23));
    Object v25 = "Can not pass null KeyDeserializers";
    Object v26 = false;
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v27));
    Object v29 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v21),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v24),((java.lang.String)v25),(((java.lang.Boolean)v26).booleanValue()),((java.lang.Class)v28));
    Object v30 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v8).deserializeWithType(((com.fasterxml.jackson.core.JsonParser)v13),((com.fasterxml.jackson.databind.DeserializationContext)v16),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v29));
    Object v31 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v8).handledType();
    org.junit.Assert.assertNotNull(v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer();
    Object v1 = "boolean";
    Object v2 = "FAIL_O-N_EMPTY_BEANS";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v5 = "boolean";
    Object v6 = "FAIL_O-N_EMPTY_BEANS";
    Object v7 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = ((com.fasterxml.jackson.databind.JsonDeserializer)v4).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v7));
    Object v9 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v10 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v10));
    Object v12 = ((com.fasterxml.jackson.databind.JsonDeserializer)v8).getEmptyValue(((com.fasterxml.jackson.databind.DeserializationContext)v11));
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer();
    Object v1 = "boolean";
    Object v2 = "FAIL_O-N_EMPTY_BEANS";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v5 = 0.0F;
    Object v6 = new com.fasterxml.jackson.databind.node.FloatNode((((java.lang.Float)v5).floatValue()));
    Object v7 = new com.fasterxml.jackson.core.JsonFactory();
    Object v8 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v7));
    Object v9 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v6),((com.fasterxml.jackson.core.ObjectCodec)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = ((com.fasterxml.jackson.databind.JsonDeserializer)v4).deserialize(((com.fasterxml.jackson.core.JsonParser)v9),((com.fasterxml.jackson.databind.DeserializationContext)v12));
    Object v14 = new com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer();
    Object v15 = ((com.fasterxml.jackson.databind.JsonDeserializer)v4).replaceDelegatee(((com.fasterxml.jackson.databind.JsonDeserializer)v14));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer();
    Object v1 = "boolean";
    Object v2 = "FAIL_O-N_EMPTY_BEANS";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v5 = "boolean";
    Object v6 = "FAIL_O-N_EMPTY_BEANS";
    Object v7 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = ((com.fasterxml.jackson.databind.JsonDeserializer)v4).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v7));
    Object v9 = ((com.fasterxml.jackson.databind.JsonDeserializer)v8).getDelegatee();
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer();
    Object v1 = "boolean";
    Object v2 = "FAIL_O-N_EMPTY_BEANS";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v5 = "boolean";
    Object v6 = "FAIL_O-N_EMPTY_BEANS";
    Object v7 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = ((com.fasterxml.jackson.databind.JsonDeserializer)v4).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v7));
    Object v9 = 0.0F;
    Object v10 = new com.fasterxml.jackson.databind.node.FloatNode((((java.lang.Float)v9).floatValue()));
    Object v11 = new com.fasterxml.jackson.core.JsonFactory();
    Object v12 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v11));
    Object v13 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v10),((com.fasterxml.jackson.core.ObjectCodec)v12));
    Object v14 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v15 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v15));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v18),((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.JavaType)v20));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v24 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v22),((com.fasterxml.jackson.databind.type.TypeFactory)v23));
    Object v25 = "Can not pass null KeyDeserializers";
    Object v26 = false;
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v27));
    Object v29 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v21),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v24),((java.lang.String)v25),(((java.lang.Boolean)v26).booleanValue()),((java.lang.Class)v28));
    Object v30 = ((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v29).getDefaultImpl();
    Object v31 = ((com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer)v8).deserializeWithType(((com.fasterxml.jackson.core.JsonParser)v13),((com.fasterxml.jackson.databind.DeserializationContext)v16),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v29));
    org.junit.Assert.assertNull(v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer();
    Object v1 = 0.0F;
    Object v2 = new com.fasterxml.jackson.databind.node.FloatNode((((java.lang.Float)v1).floatValue()));
    Object v3 = new com.fasterxml.jackson.core.JsonFactory();
    Object v4 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2),((com.fasterxml.jackson.core.ObjectCodec)v4));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v7));
    Object v9 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v10 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v9));
    Object v11 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).deserialize(((com.fasterxml.jackson.core.JsonParser)v5),((com.fasterxml.jackson.databind.DeserializationContext)v8),((java.lang.Object)v10));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer();
    Object v1 = "boolean";
    Object v2 = "FAIL_O-N_EMPTY_BEANS";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v5 = "boolean";
    Object v6 = "FAIL_O-N_EMPTY_BEANS";
    Object v7 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = ((com.fasterxml.jackson.databind.JsonDeserializer)v4).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v7));
    Object v9 = 0.0F;
    Object v10 = new com.fasterxml.jackson.databind.node.FloatNode((((java.lang.Float)v9).floatValue()));
    Object v11 = new com.fasterxml.jackson.core.JsonFactory();
    Object v12 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v11));
    Object v13 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v10),((com.fasterxml.jackson.core.ObjectCodec)v12));
    Object v14 = ((com.fasterxml.jackson.core.JsonParser)v13).nextTextValue();
    Object v15 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v16 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v15));
    Object v17 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v16));
    Object v18 = ((com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer)v8).deserialize(((com.fasterxml.jackson.core.JsonParser)v13),((com.fasterxml.jackson.databind.DeserializationContext)v17));
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer();
    Object v1 = "boolean";
    Object v2 = "FAIL_O-N_EMPTY_BEANS";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v5 = "boolean";
    Object v6 = "FAIL_O-N_EMPTY_BEANS";
    Object v7 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = ((com.fasterxml.jackson.databind.JsonDeserializer)v4).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v7));
    Object v9 = ((com.fasterxml.jackson.databind.JsonDeserializer)v8).getObjectIdReader();
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer();
    Object v1 = "boolean";
    Object v2 = "FAIL_O-N_EMPTY_BEANS";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v5 = 0.0F;
    Object v6 = new com.fasterxml.jackson.databind.node.FloatNode((((java.lang.Float)v5).floatValue()));
    Object v7 = new com.fasterxml.jackson.core.JsonFactory();
    Object v8 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v7));
    Object v9 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v6),((com.fasterxml.jackson.core.ObjectCodec)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v14),((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.JavaType)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v20 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v18),((com.fasterxml.jackson.databind.type.TypeFactory)v19));
    Object v21 = "Can not pass null KeyDeserializers";
    Object v22 = false;
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v23));
    Object v25 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v17),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v20),((java.lang.String)v21),(((java.lang.Boolean)v22).booleanValue()),((java.lang.Class)v24));
    Object v26 = ((com.fasterxml.jackson.databind.JsonDeserializer)v4).deserializeWithType(((com.fasterxml.jackson.core.JsonParser)v9),((com.fasterxml.jackson.databind.DeserializationContext)v12),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v25));
    Object v27 = ((com.fasterxml.jackson.databind.JsonDeserializer)v4).getKnownPropertyNames();
    org.junit.Assert.assertNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer();
    Object v1 = 0.0F;
    Object v2 = new com.fasterxml.jackson.databind.node.FloatNode((((java.lang.Float)v1).floatValue()));
    Object v3 = new com.fasterxml.jackson.core.JsonFactory();
    Object v4 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2),((com.fasterxml.jackson.core.ObjectCodec)v4));
    ((com.fasterxml.jackson.core.JsonParser)v5).clearCurrentToken();
    Object v6 = null;
    Object v7 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v8 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v7));
    Object v9 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v11),((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.JavaType)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v17 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.type.TypeFactory)v16));
    Object v18 = "Can not pass null KeyDeserializers";
    Object v19 = false;
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v14),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v17),((java.lang.String)v18),(((java.lang.Boolean)v19).booleanValue()),((java.lang.Class)v21));
    Object v23 = ((com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer)v0).deserializeWithType(((com.fasterxml.jackson.core.JsonParser)v5),((com.fasterxml.jackson.databind.DeserializationContext)v9),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v22));
    org.junit.Assert.assertNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer();
    Object v1 = new com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer();
    Object v2 = "boolean";
    Object v3 = "FAIL_O-N_EMPTY_BEANS";
    Object v4 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = ((com.fasterxml.jackson.databind.JsonDeserializer)v1).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v4));
    Object v6 = "boolean";
    Object v7 = "FAIL_O-N_EMPTY_BEANS";
    Object v8 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = ((com.fasterxml.jackson.databind.JsonDeserializer)v5).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v8));
    Object v10 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).replaceDelegatee(((com.fasterxml.jackson.databind.JsonDeserializer)v9));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer();
    Object v1 = "boolean";
    Object v2 = "FAIL_O-N_EMPTY_BEANS";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v5 = "boolean";
    Object v6 = "FAIL_O-N_EMPTY_BEANS";
    Object v7 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = ((com.fasterxml.jackson.databind.JsonDeserializer)v4).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v7));
    Object v9 = "boolean";
    Object v10 = "FAIL_O-N_EMPTY_BEANS";
    Object v11 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = ((com.fasterxml.jackson.databind.JsonDeserializer)v8).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer();
    Object v1 = "boolean";
    Object v2 = "FAIL_O-N_EMPTY_BEANS";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v5 = "boolean";
    Object v6 = "FAIL_O-N_EMPTY_BEANS";
    Object v7 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = ((com.fasterxml.jackson.databind.JsonDeserializer)v4).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v7));
    Object v9 = 0.0F;
    Object v10 = new com.fasterxml.jackson.databind.node.FloatNode((((java.lang.Float)v9).floatValue()));
    Object v11 = new com.fasterxml.jackson.core.JsonFactory();
    Object v12 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v11));
    Object v13 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v10),((com.fasterxml.jackson.core.ObjectCodec)v12));
    Object v14 = ((com.fasterxml.jackson.core.JsonParser)v13).getTextOffset();
    Object v15 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v16 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v15));
    Object v17 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v19),((com.fasterxml.jackson.databind.JavaType)v20),((com.fasterxml.jackson.databind.JavaType)v21));
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v25 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v23),((com.fasterxml.jackson.databind.type.TypeFactory)v24));
    Object v26 = "Can not pass null KeyDeserializers";
    Object v27 = false;
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v29 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v28));
    Object v30 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v22),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v25),((java.lang.String)v26),(((java.lang.Boolean)v27).booleanValue()),((java.lang.Class)v29));
    Object v31 = ((com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer)v8).deserializeWithType(((com.fasterxml.jackson.core.JsonParser)v13),((com.fasterxml.jackson.databind.DeserializationContext)v17),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v30));
    org.junit.Assert.assertNull(v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer();
    Object v1 = "boolean";
    Object v2 = "FAIL_O-N_EMPTY_BEANS";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v5 = "boolean";
    Object v6 = "FAIL_O-N_EMPTY_BEANS";
    Object v7 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = ((com.fasterxml.jackson.databind.JsonDeserializer)v4).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v7));
    Object v9 = "boolean";
    Object v10 = "FAIL_O-N_EMPTY_BEANS";
    Object v11 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = ((com.fasterxml.jackson.databind.JsonDeserializer)v8).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v11));
    Object v13 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v14 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v14));
    Object v16 = ((com.fasterxml.jackson.databind.JsonDeserializer)v12).getNullValue(((com.fasterxml.jackson.databind.DeserializationContext)v15));
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer();
    Object v1 = "boolean";
    Object v2 = "FAIL_O-N_EMPTY_BEANS";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v5 = 0.0F;
    Object v6 = new com.fasterxml.jackson.databind.node.FloatNode((((java.lang.Float)v5).floatValue()));
    Object v7 = new com.fasterxml.jackson.core.JsonFactory();
    Object v8 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v7));
    Object v9 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v6),((com.fasterxml.jackson.core.ObjectCodec)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = new com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer();
    Object v14 = ((com.fasterxml.jackson.databind.JsonDeserializer)v13).isCachable();
    Object v15 = ((com.fasterxml.jackson.databind.JsonDeserializer)v4).deserialize(((com.fasterxml.jackson.core.JsonParser)v9),((com.fasterxml.jackson.databind.DeserializationContext)v12),((java.lang.Object)v14));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer();
    Object v1 = "boolean";
    Object v2 = "FAIL_O-N_EMPTY_BEANS";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v5 = "boolean";
    Object v6 = "FAIL_O-N_EMPTY_BEANS";
    Object v7 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = ((com.fasterxml.jackson.databind.JsonDeserializer)v4).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v7));
    Object v9 = "boolean";
    Object v10 = "FAIL_O-N_EMPTY_BEANS";
    Object v11 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = ((com.fasterxml.jackson.databind.JsonDeserializer)v8).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v11));
    Object v13 = 0.0F;
    Object v14 = new com.fasterxml.jackson.databind.node.FloatNode((((java.lang.Float)v13).floatValue()));
    Object v15 = new com.fasterxml.jackson.core.JsonFactory();
    Object v16 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v15));
    Object v17 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v14),((com.fasterxml.jackson.core.ObjectCodec)v16));
    Object v18 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v19 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v18));
    Object v20 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v19));
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v21));
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v22),((com.fasterxml.jackson.databind.JavaType)v23),((com.fasterxml.jackson.databind.JavaType)v24));
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v28 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v26),((com.fasterxml.jackson.databind.type.TypeFactory)v27));
    Object v29 = "Can not pass null KeyDeserializers";
    Object v30 = false;
    Object v31 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v32 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v31));
    Object v33 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v25),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v28),((java.lang.String)v29),(((java.lang.Boolean)v30).booleanValue()),((java.lang.Class)v32));
    Object v34 = ((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v33).getPropertyName();
    Object v35 = ((com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer)v12).deserializeWithType(((com.fasterxml.jackson.core.JsonParser)v17),((com.fasterxml.jackson.databind.DeserializationContext)v20),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v33));
    org.junit.Assert.assertNull(v35);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer();
    Object v1 = "boolean";
    Object v2 = "FAIL_O-N_EMPTY_BEANS";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v5 = "boolean";
    Object v6 = "FAIL_O-N_EMPTY_BEANS";
    Object v7 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = ((com.fasterxml.jackson.databind.JsonDeserializer)v4).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v7));
    Object v9 = 0.0F;
    Object v10 = new com.fasterxml.jackson.databind.node.FloatNode((((java.lang.Float)v9).floatValue()));
    Object v11 = new com.fasterxml.jackson.core.JsonFactory();
    Object v12 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v11));
    Object v13 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v10),((com.fasterxml.jackson.core.ObjectCodec)v12));
    Object v14 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v15 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v15));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v18),((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.JavaType)v20));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v24 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v22),((com.fasterxml.jackson.databind.type.TypeFactory)v23));
    Object v25 = "Can not pass null KeyDeserializers";
    Object v26 = false;
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v27));
    Object v29 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v21),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v24),((java.lang.String)v25),(((java.lang.Boolean)v26).booleanValue()),((java.lang.Class)v28));
    Object v30 = ((com.fasterxml.jackson.databind.JsonDeserializer)v8).deserializeWithType(((com.fasterxml.jackson.core.JsonParser)v13),((com.fasterxml.jackson.databind.DeserializationContext)v16),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v29));
    Object v31 = ((com.fasterxml.jackson.databind.JsonDeserializer)v8).getObjectIdReader();
    org.junit.Assert.assertNull(v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer();
    Object v1 = "boolean";
    Object v2 = "FAIL_O-N_EMPTY_BEANS";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v5 = "boolean";
    Object v6 = "FAIL_O-N_EMPTY_BEANS";
    Object v7 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = ((com.fasterxml.jackson.databind.JsonDeserializer)v4).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v7));
    Object v9 = "boolean";
    Object v10 = "FAIL_O-N_EMPTY_BEANS";
    Object v11 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = ((com.fasterxml.jackson.databind.JsonDeserializer)v8).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v11));
    Object v13 = 0.0F;
    Object v14 = new com.fasterxml.jackson.databind.node.FloatNode((((java.lang.Float)v13).floatValue()));
    Object v15 = new com.fasterxml.jackson.core.JsonFactory();
    Object v16 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v15));
    Object v17 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v14),((com.fasterxml.jackson.core.ObjectCodec)v16));
    Object v18 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v19 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v18));
    Object v20 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v19));
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v21));
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v22),((com.fasterxml.jackson.databind.JavaType)v23),((com.fasterxml.jackson.databind.JavaType)v24));
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v28 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v26),((com.fasterxml.jackson.databind.type.TypeFactory)v27));
    Object v29 = "Can not pass null KeyDeserializers";
    Object v30 = false;
    Object v31 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v32 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v31));
    Object v33 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v25),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v28),((java.lang.String)v29),(((java.lang.Boolean)v30).booleanValue()),((java.lang.Class)v32));
    Object v34 = ((com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer)v12).deserializeWithType(((com.fasterxml.jackson.core.JsonParser)v17),((com.fasterxml.jackson.databind.DeserializationContext)v20),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v33));
    org.junit.Assert.assertNull(v34);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer();
    Object v1 = "boolean";
    Object v2 = "FAIL_O-N_EMPTY_BEANS";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v5 = "boolean";
    Object v6 = "FAIL_O-N_EMPTY_BEANS";
    Object v7 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = ((com.fasterxml.jackson.databind.JsonDeserializer)v4).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v7));
    Object v9 = "boolean";
    Object v10 = "FAIL_O-N_EMPTY_BEANS";
    Object v11 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = ((com.fasterxml.jackson.databind.JsonDeserializer)v8).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v11));
    Object v13 = 0.0F;
    Object v14 = new com.fasterxml.jackson.databind.node.FloatNode((((java.lang.Float)v13).floatValue()));
    Object v15 = new com.fasterxml.jackson.core.JsonFactory();
    Object v16 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v15));
    Object v17 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v14),((com.fasterxml.jackson.core.ObjectCodec)v16));
    Object v18 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v19 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v18));
    Object v20 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v19));
    Object v21 = ((com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer)v12).deserialize(((com.fasterxml.jackson.core.JsonParser)v17),((com.fasterxml.jackson.databind.DeserializationContext)v20));
    org.junit.Assert.assertNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer();
    Object v1 = "boolean";
    Object v2 = "FAIL_O-N_EMPTY_BEANS";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v5 = "boolean";
    Object v6 = "FAIL_O-N_EMPTY_BEANS";
    Object v7 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = ((com.fasterxml.jackson.databind.JsonDeserializer)v4).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v7));
    Object v9 = 0.0F;
    Object v10 = new com.fasterxml.jackson.databind.node.FloatNode((((java.lang.Float)v9).floatValue()));
    Object v11 = new com.fasterxml.jackson.core.JsonFactory();
    Object v12 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v11));
    Object v13 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v10),((com.fasterxml.jackson.core.ObjectCodec)v12));
    Object v14 = ((com.fasterxml.jackson.core.JsonParser)v13).getDecimalValue();
    Object v15 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v16 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v15));
    Object v17 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v16));
    Object v18 = ((com.fasterxml.jackson.databind.DeserializationContext)v17).leaseObjectBuffer();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v19));
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v20),((com.fasterxml.jackson.databind.JavaType)v21),((com.fasterxml.jackson.databind.JavaType)v22));
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v26 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v24),((com.fasterxml.jackson.databind.type.TypeFactory)v25));
    Object v27 = "Can not pass null KeyDeserializers";
    Object v28 = false;
    Object v29 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v30 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v29));
    Object v31 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v23),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v26),((java.lang.String)v27),(((java.lang.Boolean)v28).booleanValue()),((java.lang.Class)v30));
    Object v32 = ((com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer)v8).deserializeWithType(((com.fasterxml.jackson.core.JsonParser)v13),((com.fasterxml.jackson.databind.DeserializationContext)v17),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v31));
    org.junit.Assert.assertNull(v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer();
    Object v1 = "boolean";
    Object v2 = "FAIL_O-N_EMPTY_BEANS";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v5 = "boolean";
    Object v6 = "FAIL_O-N_EMPTY_BEANS";
    Object v7 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = ((com.fasterxml.jackson.databind.JsonDeserializer)v4).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v7));
    Object v9 = "boolean";
    Object v10 = "FAIL_O-N_EMPTY_BEANS";
    Object v11 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = ((com.fasterxml.jackson.databind.JsonDeserializer)v8).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v11));
    Object v13 = ((com.fasterxml.jackson.databind.JsonDeserializer)v12).getEmptyValue();
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer();
    Object v1 = "boolean";
    Object v2 = "FAIL_O-N_EMPTY_BEANS";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v5 = "boolean";
    Object v6 = "FAIL_O-N_EMPTY_BEANS";
    Object v7 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = ((com.fasterxml.jackson.databind.JsonDeserializer)v4).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v7));
    Object v9 = ((com.fasterxml.jackson.databind.JsonDeserializer)v8).getEmptyValue();
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer();
    Object v1 = "boolean";
    Object v2 = "FAIL_O-N_EMPTY_BEANS";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v5 = "boolean";
    Object v6 = "FAIL_O-N_EMPTY_BEANS";
    Object v7 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = ((com.fasterxml.jackson.databind.JsonDeserializer)v4).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v7));
    Object v9 = "boolean";
    Object v10 = "FAIL_O-N_EMPTY_BEANS";
    Object v11 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = ((com.fasterxml.jackson.databind.JsonDeserializer)v8).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v11));
    Object v13 = "boolean";
    Object v14 = "FAIL_O-N_EMPTY_BEANS";
    Object v15 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = ((com.fasterxml.jackson.databind.JsonDeserializer)v12).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v15));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer();
    Object v1 = "boolean";
    Object v2 = "FAIL_O-N_EMPTY_BEANS";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v5 = "boolean";
    Object v6 = "FAIL_O-N_EMPTY_BEANS";
    Object v7 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = ((com.fasterxml.jackson.databind.JsonDeserializer)v4).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v7));
    Object v9 = "boolean";
    Object v10 = "FAIL_O-N_EMPTY_BEANS";
    Object v11 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = ((com.fasterxml.jackson.databind.JsonDeserializer)v8).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v11));
    Object v13 = 0.0F;
    Object v14 = new com.fasterxml.jackson.databind.node.FloatNode((((java.lang.Float)v13).floatValue()));
    Object v15 = new com.fasterxml.jackson.core.JsonFactory();
    Object v16 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v15));
    Object v17 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v14),((com.fasterxml.jackson.core.ObjectCodec)v16));
    Object v18 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v19 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v18));
    Object v20 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v19));
    ((com.fasterxml.jackson.databind.DeserializationContext)v20).checkUnresolvedObjectId();
    Object v21 = null;
    Object v22 = ((com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer)v12).deserialize(((com.fasterxml.jackson.core.JsonParser)v17),((com.fasterxml.jackson.databind.DeserializationContext)v20));
    org.junit.Assert.assertNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer();
    Object v1 = "boolean";
    Object v2 = "FAIL_O-N_EMPTY_BEANS";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v5 = "boolean";
    Object v6 = "FAIL_O-N_EMPTY_BEANS";
    Object v7 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = ((com.fasterxml.jackson.databind.JsonDeserializer)v4).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v7));
    Object v9 = "boolean";
    Object v10 = "FAIL_O-N_EMPTY_BEANS";
    Object v11 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = ((com.fasterxml.jackson.databind.JsonDeserializer)v8).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v11));
    Object v13 = "boolean";
    Object v14 = "FAIL_O-N_EMPTY_BEANS";
    Object v15 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = ((com.fasterxml.jackson.databind.JsonDeserializer)v12).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v15));
    Object v17 = ((com.fasterxml.jackson.databind.JsonDeserializer)v16).getNullValue();
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer();
    Object v1 = "boolean";
    Object v2 = "FAIL_O-N_EMPTY_BEANS";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v5 = "boolean";
    Object v6 = "FAIL_O-N_EMPTY_BEANS";
    Object v7 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = ((com.fasterxml.jackson.databind.JsonDeserializer)v4).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v7));
    Object v9 = 0.0F;
    Object v10 = new com.fasterxml.jackson.databind.node.FloatNode((((java.lang.Float)v9).floatValue()));
    Object v11 = new com.fasterxml.jackson.core.JsonFactory();
    Object v12 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v11));
    Object v13 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v10),((com.fasterxml.jackson.core.ObjectCodec)v12));
    Object v14 = ((com.fasterxml.jackson.core.JsonParser)v13).nextFieldName();
    Object v15 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v16 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v15));
    Object v17 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v16));
    Object v18 = 0.0F;
    Object v19 = new com.fasterxml.jackson.databind.node.FloatNode((((java.lang.Float)v18).floatValue()));
    Object v20 = 16L;
    Object v21 = 1L;
    Object v22 = -13;
    Object v23 = 0;
    Object v24 = new com.fasterxml.jackson.core.JsonLocation(((java.lang.Object)v19),(((java.lang.Long)v20).longValue()),(((java.lang.Long)v21).longValue()),(((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()));
    Object v25 = ((com.fasterxml.jackson.databind.JsonDeserializer)v8).deserialize(((com.fasterxml.jackson.core.JsonParser)v13),((com.fasterxml.jackson.databind.DeserializationContext)v17),((java.lang.Object)v24));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer();
    Object v1 = "boolean";
    Object v2 = "FAIL_O-N_EMPTY_BEANS";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v5 = "boolean";
    Object v6 = "FAIL_O-N_EMPTY_BEANS";
    Object v7 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = ((com.fasterxml.jackson.databind.JsonDeserializer)v4).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v7));
    Object v9 = "boolean";
    Object v10 = "FAIL_O-N_EMPTY_BEANS";
    Object v11 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = ((com.fasterxml.jackson.databind.JsonDeserializer)v8).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v11));
    Object v13 = "boolean";
    Object v14 = "FAIL_O-N_EMPTY_BEANS";
    Object v15 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = ((com.fasterxml.jackson.databind.JsonDeserializer)v12).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v15));
    Object v17 = 0.0F;
    Object v18 = new com.fasterxml.jackson.databind.node.FloatNode((((java.lang.Float)v17).floatValue()));
    Object v19 = new com.fasterxml.jackson.core.JsonFactory();
    Object v20 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v19));
    Object v21 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v18),((com.fasterxml.jackson.core.ObjectCodec)v20));
    Object v22 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v23 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v22));
    Object v24 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v23));
    Object v25 = ((com.fasterxml.jackson.databind.JsonDeserializer)v16).deserialize(((com.fasterxml.jackson.core.JsonParser)v21),((com.fasterxml.jackson.databind.DeserializationContext)v24));
    Object v26 = ((com.fasterxml.jackson.databind.JsonDeserializer)v16).getEmptyValue();
    org.junit.Assert.assertNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer();
    Object v1 = "boolean";
    Object v2 = "FAIL_O-N_EMPTY_BEANS";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v5 = "boolean";
    Object v6 = "FAIL_O-N_EMPTY_BEANS";
    Object v7 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = ((com.fasterxml.jackson.databind.JsonDeserializer)v4).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v7));
    Object v9 = 0.0F;
    Object v10 = new com.fasterxml.jackson.databind.node.FloatNode((((java.lang.Float)v9).floatValue()));
    Object v11 = new com.fasterxml.jackson.core.JsonFactory();
    Object v12 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v11));
    Object v13 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v10),((com.fasterxml.jackson.core.ObjectCodec)v12));
    Object v14 = ((com.fasterxml.jackson.core.JsonParser)v13).readValueAsTree();
    Object v15 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v16 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v15));
    Object v17 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v19),((com.fasterxml.jackson.databind.JavaType)v20),((com.fasterxml.jackson.databind.JavaType)v21));
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v25 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v23),((com.fasterxml.jackson.databind.type.TypeFactory)v24));
    Object v26 = "Can not pass null KeyDeserializers";
    Object v27 = false;
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v29 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v28));
    Object v30 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v22),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v25),((java.lang.String)v26),(((java.lang.Boolean)v27).booleanValue()),((java.lang.Class)v29));
    Object v31 = ((com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer)v8).deserializeWithType(((com.fasterxml.jackson.core.JsonParser)v13),((com.fasterxml.jackson.databind.DeserializationContext)v17),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v30));
    org.junit.Assert.assertNull(v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer();
    Object v1 = "boolean";
    Object v2 = "FAIL_O-N_EMPTY_BEANS";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v4).handledType();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer();
    Object v1 = "boolean";
    Object v2 = "FAIL_O-N_EMPTY_BEANS";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v5 = "boolean";
    Object v6 = "FAIL_O-N_EMPTY_BEANS";
    Object v7 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = ((com.fasterxml.jackson.databind.JsonDeserializer)v4).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v7));
    Object v9 = "boolean";
    Object v10 = "FAIL_O-N_EMPTY_BEANS";
    Object v11 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = ((com.fasterxml.jackson.databind.JsonDeserializer)v8).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v11));
    Object v13 = "boolean";
    Object v14 = "FAIL_O-N_EMPTY_BEANS";
    Object v15 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = ((com.fasterxml.jackson.databind.JsonDeserializer)v12).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v15));
    Object v17 = 0.0F;
    Object v18 = new com.fasterxml.jackson.databind.node.FloatNode((((java.lang.Float)v17).floatValue()));
    Object v19 = new com.fasterxml.jackson.core.JsonFactory();
    Object v20 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v19));
    Object v21 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v18),((com.fasterxml.jackson.core.ObjectCodec)v20));
    Object v22 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v23 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v22));
    Object v24 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v23));
    Object v25 = ((com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer)v16).deserialize(((com.fasterxml.jackson.core.JsonParser)v21),((com.fasterxml.jackson.databind.DeserializationContext)v24));
    org.junit.Assert.assertNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer();
    Object v1 = "boolean";
    Object v2 = "FAIL_O-N_EMPTY_BEANS";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v5 = "boolean";
    Object v6 = "FAIL_O-N_EMPTY_BEANS";
    Object v7 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = ((com.fasterxml.jackson.databind.JsonDeserializer)v4).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v7));
    Object v9 = "yyyy-MM-dd'T'HH:mm:ss.SSvZ";
    Object v10 = ((com.fasterxml.jackson.databind.JsonDeserializer)v8).findBackReference(((java.lang.String)v9));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer();
    Object v1 = "boolean";
    Object v2 = "FAIL_O-N_EMPTY_BEANS";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v5 = "boolean";
    Object v6 = "FAIL_O-N_EMPTY_BEANS";
    Object v7 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = ((com.fasterxml.jackson.databind.JsonDeserializer)v4).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v7));
    Object v9 = 0.0F;
    Object v10 = new com.fasterxml.jackson.databind.node.FloatNode((((java.lang.Float)v9).floatValue()));
    Object v11 = new com.fasterxml.jackson.core.JsonFactory();
    Object v12 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v11));
    Object v13 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v10),((com.fasterxml.jackson.core.ObjectCodec)v12));
    Object v14 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v15 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v15));
    Object v17 = ((com.fasterxml.jackson.databind.JsonDeserializer)v8).deserialize(((com.fasterxml.jackson.core.JsonParser)v13),((com.fasterxml.jackson.databind.DeserializationContext)v16));
    Object v18 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v8).getValueType();
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer();
    Object v1 = 0.0F;
    Object v2 = new com.fasterxml.jackson.databind.node.FloatNode((((java.lang.Float)v1).floatValue()));
    Object v3 = new com.fasterxml.jackson.core.JsonFactory();
    Object v4 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v3));
    Object v5 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2),((com.fasterxml.jackson.core.ObjectCodec)v4));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = "G]";
    Object v12 = 0.0F;
    Object v13 = new com.fasterxml.jackson.databind.node.FloatNode((((java.lang.Float)v12).floatValue()));
    Object v14 = 16L;
    Object v15 = 1L;
    Object v16 = -13;
    Object v17 = 0;
    Object v18 = new com.fasterxml.jackson.core.JsonLocation(((java.lang.Object)v13),(((java.lang.Long)v14).longValue()),(((java.lang.Long)v15).longValue()),(((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v19));
    Object v21 = ")8";
    Object v22 = new java.util.HashSet();
    Object v23 = new com.fasterxml.jackson.databind.exc.UnrecognizedPropertyException(((java.lang.String)v11),((com.fasterxml.jackson.core.JsonLocation)v18),((java.lang.Class)v20),((java.lang.String)v21),((java.util.Collection)v22));
    Object v24 = com.fasterxml.jackson.databind.JsonMappingException.fromUnexpectedIOE(((java.io.IOException)v23));
    Object v25 = ((com.fasterxml.jackson.databind.DeserializationContext)v8).instantiationException(((java.lang.Class)v10),((java.lang.Throwable)v24));
    Object v26 = ((com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer)v0).deserialize(((com.fasterxml.jackson.core.JsonParser)v5),((com.fasterxml.jackson.databind.DeserializationContext)v8));
    org.junit.Assert.assertNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer();
    Object v1 = "boolean";
    Object v2 = "FAIL_O-N_EMPTY_BEANS";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonDeserializer)v0).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v3));
    Object v5 = "boolean";
    Object v6 = "FAIL_O-N_EMPTY_BEANS";
    Object v7 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = ((com.fasterxml.jackson.databind.JsonDeserializer)v4).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v7));
    Object v9 = 0.0F;
    Object v10 = new com.fasterxml.jackson.databind.node.FloatNode((((java.lang.Float)v9).floatValue()));
    Object v11 = new com.fasterxml.jackson.core.JsonFactory();
    Object v12 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v11));
    Object v13 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v10),((com.fasterxml.jackson.core.ObjectCodec)v12));
    Object v14 = ((com.fasterxml.jackson.core.JsonParser)v13).getShortValue();
    Object v15 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v16 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v15));
    Object v17 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = new com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer();
    Object v20 = "boolean";
    Object v21 = "FAIL_O-N_EMPTY_BEANS";
    Object v22 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v20),((java.lang.String)v21));
    Object v23 = ((com.fasterxml.jackson.databind.JsonDeserializer)v19).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v22));
    Object v24 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v23).handledType();
    Object v25 = ((com.fasterxml.jackson.databind.DatabindContext)v17).constructSpecializedType(((com.fasterxml.jackson.databind.JavaType)v18),((java.lang.Class)v24));
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v26));
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v29 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v30 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v27),((com.fasterxml.jackson.databind.JavaType)v28),((com.fasterxml.jackson.databind.JavaType)v29));
    Object v31 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v32 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v33 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v31),((com.fasterxml.jackson.databind.type.TypeFactory)v32));
    Object v34 = "Can not pass null KeyDeserializers";
    Object v35 = false;
    Object v36 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v37 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v36));
    Object v38 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v30),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v33),((java.lang.String)v34),(((java.lang.Boolean)v35).booleanValue()),((java.lang.Class)v37));
    Object v39 = ((com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer)v8).deserializeWithType(((com.fasterxml.jackson.core.JsonParser)v13),((com.fasterxml.jackson.databind.DeserializationContext)v17),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v38));
    org.junit.Assert.assertNull(v39);
  }
}
