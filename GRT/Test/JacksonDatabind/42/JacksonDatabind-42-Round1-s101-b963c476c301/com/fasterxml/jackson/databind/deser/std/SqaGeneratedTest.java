package com.fasterxml.jackson.databind.deser.std;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = new java.util.TreeSet();
    Object v2 = new java.util.TreeSet();
    Object v3 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((java.lang.Object)v1),((java.lang.Object)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.findDeserializer(((java.lang.Class)v4));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = ": ";
    Object v1 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = ((com.fasterxml.jackson.databind.JsonDeserializer)v1).getEmptyValue(((com.fasterxml.jackson.databind.DeserializationContext)v4));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = new java.util.TreeSet();
    Object v2 = new java.util.TreeSet();
    Object v3 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((java.lang.Object)v1),((java.lang.Object)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = 1;
    Object v6 = new com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.Std(((java.lang.Class)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = new byte[]{Byte.valueOf((byte)50)};
    Object v8 = new com.fasterxml.jackson.databind.node.BinaryNode(((byte[])v7));
    Object v9 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v10 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v9));
    Object v11 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v8),((com.fasterxml.jackson.core.ObjectCodec)v10));
    Object v12 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v13 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v12));
    Object v14 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v13));
    Object v15 = "";
    Object v16 = new java.lang.Object[]{};
    Object v17 = ((com.fasterxml.jackson.databind.DeserializationContext)v14).mappingException(((java.lang.String)v15),((java.lang.Object[])v16));
    Object v18 = ((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v6).deserialize(((com.fasterxml.jackson.core.JsonParser)v11),((com.fasterxml.jackson.databind.DeserializationContext)v14));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = ": ";
    Object v1 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v0));
    Object v2 = ((com.fasterxml.jackson.databind.JsonDeserializer)v1).getObjectIdReader();
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = new java.util.TreeSet();
    Object v2 = new java.util.TreeSet();
    Object v3 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((java.lang.Object)v1),((java.lang.Object)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = 1;
    Object v6 = new com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.Std(((java.lang.Class)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = ")l";
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = ((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v6)._deserialize(((java.lang.String)v7),((com.fasterxml.jackson.databind.DeserializationContext)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = new java.util.TreeSet();
    Object v2 = new java.util.TreeSet();
    Object v3 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((java.lang.Object)v1),((java.lang.Object)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = 1;
    Object v6 = new com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.Std(((java.lang.Class)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = new byte[]{Byte.valueOf((byte)50)};
    Object v8 = new com.fasterxml.jackson.databind.node.BinaryNode(((byte[])v7));
    Object v9 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v10 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v9));
    Object v11 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v8),((com.fasterxml.jackson.core.ObjectCodec)v10));
    Object v12 = ((com.fasterxml.jackson.core.JsonParser)v11).isExpectedStartObjectToken();
    Object v13 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v14 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v14));
    Object v16 = ((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v6).deserialize(((com.fasterxml.jackson.core.JsonParser)v11),((com.fasterxml.jackson.databind.DeserializationContext)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = new java.util.TreeSet();
    Object v2 = new java.util.TreeSet();
    Object v3 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((java.lang.Object)v1),((java.lang.Object)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = 1;
    Object v6 = new com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.Std(((java.lang.Class)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = "' value but there was more than a single val";
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = ((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v6)._deserialize(((java.lang.String)v7),((com.fasterxml.jackson.databind.DeserializationContext)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = new java.util.TreeSet();
    Object v2 = new java.util.TreeSet();
    Object v3 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((java.lang.Object)v1),((java.lang.Object)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = 1;
    Object v6 = new com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.Std(((java.lang.Class)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = new byte[]{Byte.valueOf((byte)50)};
    Object v8 = new com.fasterxml.jackson.databind.node.BinaryNode(((byte[])v7));
    Object v9 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v10 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v9));
    Object v11 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v8),((com.fasterxml.jackson.core.ObjectCodec)v10));
    Object v12 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v13 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v12));
    Object v14 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = new java.util.TreeSet();
    Object v17 = new java.util.TreeSet();
    Object v18 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v15),((java.lang.Object)v16),((java.lang.Object)v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = new java.util.TreeSet();
    Object v21 = new java.util.TreeSet();
    Object v22 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v19),((java.lang.Object)v20),((java.lang.Object)v21));
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v24 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v22),((com.fasterxml.jackson.databind.type.TypeFactory)v23));
    Object v25 = "int";
    Object v26 = false;
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v28 = new java.util.TreeSet();
    Object v29 = new java.util.TreeSet();
    Object v30 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v27),((java.lang.Object)v28),((java.lang.Object)v29));
    Object v31 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v30));
    Object v32 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v18),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v24),((java.lang.String)v25),(((java.lang.Boolean)v26).booleanValue()),((java.lang.Class)v31));
    Object v33 = ((com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer)v6).deserializeWithType(((com.fasterxml.jackson.core.JsonParser)v11),((com.fasterxml.jackson.databind.DeserializationContext)v14),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v32));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = ": ";
    Object v1 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v0));
    Object v2 = ((com.fasterxml.jackson.databind.JsonDeserializer)v1).getDelegatee();
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = new java.util.TreeSet();
    Object v2 = new java.util.TreeSet();
    Object v3 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((java.lang.Object)v1),((java.lang.Object)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = 1;
    Object v6 = new com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.Std(((java.lang.Class)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = "No with-args constructor for ";
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new java.util.TreeSet();
    Object v13 = new java.util.TreeSet();
    Object v14 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v11),((java.lang.Object)v12),((java.lang.Object)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v14));
    Object v16 = "G]";
    Object v17 = new java.util.TreeSet();
    Object v18 = -13L;
    Object v19 = 0L;
    Object v20 = 1;
    Object v21 = 0;
    Object v22 = new com.fasterxml.jackson.core.JsonLocation(((java.lang.Object)v17),(((java.lang.Long)v18).longValue()),(((java.lang.Long)v19).longValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()));
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = new java.util.TreeSet();
    Object v25 = new java.util.TreeSet();
    Object v26 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v23),((java.lang.Object)v24),((java.lang.Object)v25));
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v26));
    Object v28 = ")8";
    Object v29 = new java.util.TreeSet();
    Object v30 = new com.fasterxml.jackson.databind.exc.UnrecognizedPropertyException(((java.lang.String)v16),((com.fasterxml.jackson.core.JsonLocation)v22),((java.lang.Class)v27),((java.lang.String)v28),((java.util.Collection)v29));
    Object v31 = com.fasterxml.jackson.databind.JsonMappingException.fromUnexpectedIOE(((java.io.IOException)v30));
    Object v32 = ((com.fasterxml.jackson.databind.DeserializationContext)v10).instantiationException(((java.lang.Class)v15),((java.lang.Throwable)v31));
    Object v33 = ((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v6)._deserialize(((java.lang.String)v7),((com.fasterxml.jackson.databind.DeserializationContext)v10));
    org.junit.Assert.assertNotNull(v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = new java.util.TreeSet();
    Object v2 = new java.util.TreeSet();
    Object v3 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((java.lang.Object)v1),((java.lang.Object)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = ((java.lang.Class)v4).getDeclaredMethods();
    Object v6 = com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.findDeserializer(((java.lang.Class)v4));
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = new java.util.TreeSet();
    Object v2 = new java.util.TreeSet();
    Object v3 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((java.lang.Object)v1),((java.lang.Object)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = 1;
    Object v6 = new com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.Std(((java.lang.Class)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = "B";
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = ((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v6)._deserialize(((java.lang.String)v7),((com.fasterxml.jackson.databind.DeserializationContext)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = ": ";
    Object v1 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v0));
    Object v2 = new byte[]{Byte.valueOf((byte)50)};
    Object v3 = new com.fasterxml.jackson.databind.node.BinaryNode(((byte[])v2));
    Object v4 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v3),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v8 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v7));
    Object v9 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = ((com.fasterxml.jackson.databind.JsonDeserializer)v1).deserialize(((com.fasterxml.jackson.core.JsonParser)v6),((com.fasterxml.jackson.databind.DeserializationContext)v9),((java.lang.Object)v10));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = ": ";
    Object v1 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v0));
    Object v2 = ": ";
    Object v3 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JsonDeserializer)v1).replaceDelegatee(((com.fasterxml.jackson.databind.JsonDeserializer)v3));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = ": ";
    Object v1 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = ((com.fasterxml.jackson.databind.JsonDeserializer)v1).getNullValue(((com.fasterxml.jackson.databind.DeserializationContext)v4));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = new java.util.TreeSet();
    Object v2 = new java.util.TreeSet();
    Object v3 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((java.lang.Object)v1),((java.lang.Object)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = 1;
    Object v6 = new com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.Std(((java.lang.Class)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = new byte[]{Byte.valueOf((byte)50)};
    Object v8 = new com.fasterxml.jackson.databind.node.BinaryNode(((byte[])v7));
    Object v9 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v10 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v9));
    Object v11 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v8),((com.fasterxml.jackson.core.ObjectCodec)v10));
    Object v12 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v13 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v12));
    Object v14 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v13));
    Object v15 = ((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v6).deserialize(((com.fasterxml.jackson.core.JsonParser)v11),((com.fasterxml.jackson.databind.DeserializationContext)v14));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = ": ";
    Object v1 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v0));
    Object v2 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v1).getValueClass();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = new java.util.TreeSet();
    Object v2 = new java.util.TreeSet();
    Object v3 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((java.lang.Object)v1),((java.lang.Object)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = 1;
    Object v6 = new com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.Std(((java.lang.Class)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = "arrafy";
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = ": ";
    Object v12 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v11));
    Object v13 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v12).getValueClass();
    Object v14 = com.fasterxml.jackson.core.JsonToken.START_OBJECT;
    Object v15 = ((com.fasterxml.jackson.databind.DeserializationContext)v10).mappingException(((java.lang.Class)v13),((com.fasterxml.jackson.core.JsonToken)v14));
    Object v16 = ((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v6)._deserialize(((java.lang.String)v7),((com.fasterxml.jackson.databind.DeserializationContext)v10));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = new java.util.TreeSet();
    Object v2 = new java.util.TreeSet();
    Object v3 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((java.lang.Object)v1),((java.lang.Object)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = 1;
    Object v6 = new com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.Std(((java.lang.Class)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = ((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v6)._deserializeFromEmptyString();
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = new java.util.TreeSet();
    Object v2 = new java.util.TreeSet();
    Object v3 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((java.lang.Object)v1),((java.lang.Object)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = ((java.lang.Class)v4).getName();
    Object v6 = com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.findDeserializer(((java.lang.Class)v4));
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.types();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = new java.util.TreeSet();
    Object v2 = new java.util.TreeSet();
    Object v3 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((java.lang.Object)v1),((java.lang.Object)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = 1;
    Object v6 = new com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.Std(((java.lang.Class)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = "]";
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = ": ";
    Object v12 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v11));
    Object v13 = "";
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = new java.util.TreeSet();
    Object v16 = new java.util.TreeSet();
    Object v17 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v14),((java.lang.Object)v15),((java.lang.Object)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v17));
    Object v19 = 1;
    Object v20 = new com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.Std(((java.lang.Class)v18),(((java.lang.Integer)v19).intValue()));
    ((com.fasterxml.jackson.databind.DeserializationContext)v10).reportUnknownProperty(((java.lang.Object)v12),((java.lang.String)v13),((com.fasterxml.jackson.databind.JsonDeserializer)v20));
    Object v21 = null;
    Object v22 = ((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v6)._deserialize(((java.lang.String)v7),((com.fasterxml.jackson.databind.DeserializationContext)v10));
    org.junit.Assert.assertNotNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = new java.util.TreeSet();
    Object v2 = new java.util.TreeSet();
    Object v3 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((java.lang.Object)v1),((java.lang.Object)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = 1;
    Object v6 = new com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.Std(((java.lang.Class)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = ": (";
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = ((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v6)._deserialize(((java.lang.String)v7),((com.fasterxml.jackson.databind.DeserializationContext)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = ": ";
    Object v1 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v0));
    Object v2 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v1).getValueClass();
    Object v3 = com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.findDeserializer(((java.lang.Class)v2));
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = new java.util.TreeSet();
    Object v2 = new java.util.TreeSet();
    Object v3 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((java.lang.Object)v1),((java.lang.Object)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = 1;
    Object v6 = new com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.Std(((java.lang.Class)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = ((com.fasterxml.jackson.databind.JsonDeserializer)v6).getDelegatee();
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = ": ";
    Object v1 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = new java.util.TreeSet();
    Object v4 = new java.util.TreeSet();
    Object v5 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v2),((java.lang.Object)v3),((java.lang.Object)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = 1;
    Object v8 = new com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.Std(((java.lang.Class)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = ((com.fasterxml.jackson.databind.JsonDeserializer)v1).replaceDelegatee(((com.fasterxml.jackson.databind.JsonDeserializer)v8));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = new java.util.TreeSet();
    Object v2 = new java.util.TreeSet();
    Object v3 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((java.lang.Object)v1),((java.lang.Object)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = 1;
    Object v6 = new com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.Std(((java.lang.Class)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = ((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v6)._deserializeEmbedded(((java.lang.Object)v7),((com.fasterxml.jackson.databind.DeserializationContext)v10));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = new java.util.TreeSet();
    Object v2 = new java.util.TreeSet();
    Object v3 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((java.lang.Object)v1),((java.lang.Object)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = 1;
    Object v6 = new com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.Std(((java.lang.Class)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = "Invalid Object Id defihition for ";
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = ((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v6)._deserialize(((java.lang.String)v7),((com.fasterxml.jackson.databind.DeserializationContext)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = new java.util.TreeSet();
    Object v2 = new java.util.TreeSet();
    Object v3 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((java.lang.Object)v1),((java.lang.Object)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = 1;
    Object v6 = new com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.Std(((java.lang.Class)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = ((com.fasterxml.jackson.databind.JsonDeserializer)v6).getEmptyValue();
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = new java.util.TreeSet();
    Object v2 = new java.util.TreeSet();
    Object v3 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((java.lang.Object)v1),((java.lang.Object)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = 1;
    Object v6 = new com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.Std(((java.lang.Class)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = new byte[]{Byte.valueOf((byte)50)};
    Object v8 = new com.fasterxml.jackson.databind.node.BinaryNode(((byte[])v7));
    Object v9 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v10 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v9));
    Object v11 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v8),((com.fasterxml.jackson.core.ObjectCodec)v10));
    Object v12 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v13 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v12));
    Object v14 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = new java.util.TreeSet();
    Object v17 = new java.util.TreeSet();
    Object v18 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v15),((java.lang.Object)v16),((java.lang.Object)v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = 1;
    Object v21 = new com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.Std(((java.lang.Class)v19),(((java.lang.Integer)v20).intValue()));
    Object v22 = ": (";
    Object v23 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v24 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v23));
    Object v25 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v24));
    Object v26 = ((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v21)._deserialize(((java.lang.String)v22),((com.fasterxml.jackson.databind.DeserializationContext)v25));
    Object v27 = ((com.fasterxml.jackson.databind.JsonDeserializer)v6).deserialize(((com.fasterxml.jackson.core.JsonParser)v11),((com.fasterxml.jackson.databind.DeserializationContext)v14),((java.lang.Object)v26));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = ": ";
    Object v1 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v0));
    Object v2 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v1).getValueType();
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = new java.util.TreeSet();
    Object v2 = new java.util.TreeSet();
    Object v3 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((java.lang.Object)v1),((java.lang.Object)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = 1;
    Object v6 = new com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.Std(((java.lang.Class)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v6).getValueClass();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = new java.util.TreeSet();
    Object v2 = new java.util.TreeSet();
    Object v3 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((java.lang.Object)v1),((java.lang.Object)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = 1;
    Object v6 = new com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.Std(((java.lang.Class)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = "-";
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new java.util.TreeSet();
    Object v13 = new java.util.TreeSet();
    Object v14 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v11),((java.lang.Object)v12),((java.lang.Object)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v14));
    Object v16 = com.fasterxml.jackson.core.JsonToken.NOT_AVAILABLE;
    Object v17 = ((com.fasterxml.jackson.databind.DeserializationContext)v10).mappingException(((java.lang.Class)v15),((com.fasterxml.jackson.core.JsonToken)v16));
    Object v18 = ((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v6)._deserialize(((java.lang.String)v7),((com.fasterxml.jackson.databind.DeserializationContext)v10));
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = ": ";
    Object v1 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v0));
    Object v2 = ((com.fasterxml.jackson.databind.JsonDeserializer)v1).getNullValue();
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = ": ";
    Object v1 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v0));
    Object v2 = ": can not find property with name '";
    Object v3 = "se";
    Object v4 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = "arrQy";
    Object v6 = ((com.fasterxml.jackson.databind.util.NameTransformer)v4).reverse(((java.lang.String)v5));
    Object v7 = ((com.fasterxml.jackson.databind.JsonDeserializer)v1).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v4));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = ": ";
    Object v1 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v0));
    Object v2 = ((com.fasterxml.jackson.databind.JsonDeserializer)v1).getKnownPropertyNames();
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = new java.util.TreeSet();
    Object v2 = new java.util.TreeSet();
    Object v3 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((java.lang.Object)v1),((java.lang.Object)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = 1;
    Object v6 = new com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.Std(((java.lang.Class)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = ((com.fasterxml.jackson.databind.JsonDeserializer)v6).isCachable();
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = ": ";
    Object v1 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v0));
    Object v2 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v1).handledType();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = new java.util.TreeSet();
    Object v2 = new java.util.TreeSet();
    Object v3 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((java.lang.Object)v1),((java.lang.Object)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = 1;
    Object v6 = new com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.Std(((java.lang.Class)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = "st";
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new java.util.concurrent.atomic.AtomicReference();
    Object v13 = ((com.fasterxml.jackson.databind.DeserializationContext)v10).hasValueDeserializerFor(((com.fasterxml.jackson.databind.JavaType)v11),((java.util.concurrent.atomic.AtomicReference)v12));
    Object v14 = ((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v6)._deserialize(((java.lang.String)v7),((com.fasterxml.jackson.databind.DeserializationContext)v10));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = ": ";
    Object v1 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v0));
    Object v2 = ")";
    Object v3 = ((com.fasterxml.jackson.databind.JsonDeserializer)v1).findBackReference(((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = ": ";
    Object v1 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v0));
    Object v2 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v1).handledType();
    Object v3 = com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.findDeserializer(((java.lang.Class)v2));
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = new java.util.TreeSet();
    Object v2 = new java.util.TreeSet();
    Object v3 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((java.lang.Object)v1),((java.lang.Object)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = 1;
    Object v6 = new com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.Std(((java.lang.Class)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = "";
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = ((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v6)._deserialize(((java.lang.String)v7),((com.fasterxml.jackson.databind.DeserializationContext)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = new java.util.TreeSet();
    Object v2 = new java.util.TreeSet();
    Object v3 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((java.lang.Object)v1),((java.lang.Object)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = 1;
    Object v6 = new com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.Std(((java.lang.Class)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = "Failed to instantiate c&lass ";
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = ((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v6)._deserialize(((java.lang.String)v7),((com.fasterxml.jackson.databind.DeserializationContext)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = new java.util.TreeSet();
    Object v2 = new java.util.TreeSet();
    Object v3 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((java.lang.Object)v1),((java.lang.Object)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = 1;
    Object v6 = new com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.Std(((java.lang.Class)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = "Property '";
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = ((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v6)._deserialize(((java.lang.String)v7),((com.fasterxml.jackson.databind.DeserializationContext)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = new java.util.TreeSet();
    Object v2 = new java.util.TreeSet();
    Object v3 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((java.lang.Object)v1),((java.lang.Object)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = 1;
    Object v6 = new com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.Std(((java.lang.Class)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v6).getValueClass();
    Object v8 = ((java.lang.Class)v7).getPackage();
    Object v9 = com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.findDeserializer(((java.lang.Class)v7));
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = new java.util.TreeSet();
    Object v2 = new java.util.TreeSet();
    Object v3 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((java.lang.Object)v1),((java.lang.Object)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = 1;
    Object v6 = new com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.Std(((java.lang.Class)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = new byte[]{Byte.valueOf((byte)50)};
    Object v8 = new com.fasterxml.jackson.databind.node.BinaryNode(((byte[])v7));
    Object v9 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v10 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v9));
    Object v11 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v8),((com.fasterxml.jackson.core.ObjectCodec)v10));
    Object v12 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v13 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v12));
    Object v14 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v13));
    Object v15 = ": ";
    Object v16 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v15));
    Object v17 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v16).handledType();
    Object v18 = "NULL";
    Object v19 = ((com.fasterxml.jackson.databind.DeserializationContext)v14).instantiationException(((java.lang.Class)v17),((java.lang.String)v18));
    Object v20 = ((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v6).deserialize(((com.fasterxml.jackson.core.JsonParser)v11),((com.fasterxml.jackson.databind.DeserializationContext)v14));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = new java.util.TreeSet();
    Object v2 = new java.util.TreeSet();
    Object v3 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((java.lang.Object)v1),((java.lang.Object)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = 1;
    Object v6 = new com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.Std(((java.lang.Class)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = new byte[]{Byte.valueOf((byte)50)};
    Object v8 = new com.fasterxml.jackson.databind.node.BinaryNode(((byte[])v7));
    Object v9 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v10 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v9));
    Object v11 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v8),((com.fasterxml.jackson.core.ObjectCodec)v10));
    Object v12 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v13 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v12));
    Object v14 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v13));
    Object v15 = ": ";
    Object v16 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v15));
    Object v17 = ": ";
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v17));
    Object v19 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v18).handledType();
    Object v20 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v19));
    Object v21 = ((com.fasterxml.jackson.databind.DeserializationContext)v14).findObjectId(((java.lang.Object)v16),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v20));
    Object v22 = ((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v6).deserialize(((com.fasterxml.jackson.core.JsonParser)v11),((com.fasterxml.jackson.databind.DeserializationContext)v14));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = new java.util.TreeSet();
    Object v2 = new java.util.TreeSet();
    Object v3 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((java.lang.Object)v1),((java.lang.Object)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = 1;
    Object v6 = new com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.Std(((java.lang.Class)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = new byte[]{Byte.valueOf((byte)50)};
    Object v8 = new com.fasterxml.jackson.databind.node.BinaryNode(((byte[])v7));
    Object v9 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v10 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v9));
    Object v11 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v8),((com.fasterxml.jackson.core.ObjectCodec)v10));
    Object v12 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v13 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v12));
    Object v14 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = new java.util.TreeSet();
    Object v17 = new java.util.TreeSet();
    Object v18 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v15),((java.lang.Object)v16),((java.lang.Object)v17));
    Object v19 = new java.util.concurrent.atomic.AtomicReference();
    Object v20 = ((com.fasterxml.jackson.databind.DeserializationContext)v14).hasValueDeserializerFor(((com.fasterxml.jackson.databind.JavaType)v18),((java.util.concurrent.atomic.AtomicReference)v19));
    Object v21 = ((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v6).deserialize(((com.fasterxml.jackson.core.JsonParser)v11),((com.fasterxml.jackson.databind.DeserializationContext)v14));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = new java.util.TreeSet();
    Object v2 = new java.util.TreeSet();
    Object v3 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((java.lang.Object)v1),((java.lang.Object)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = ((java.lang.Class)v4).getDeclaringClass();
    Object v6 = com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.findDeserializer(((java.lang.Class)v4));
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = new java.util.TreeSet();
    Object v2 = new java.util.TreeSet();
    Object v3 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((java.lang.Object)v1),((java.lang.Object)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = 1;
    Object v6 = new com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.Std(((java.lang.Class)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = "number";
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = ((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v6)._deserialize(((java.lang.String)v7),((com.fasterxml.jackson.databind.DeserializationContext)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = new java.util.TreeSet();
    Object v2 = new java.util.TreeSet();
    Object v3 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((java.lang.Object)v1),((java.lang.Object)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = 1;
    Object v6 = new com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.Std(((java.lang.Class)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = true;
    Object v8 = "), methd '";
    Object v9 = 0;
    Object v10 = "Propedty '";
    Object v11 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v7).booleanValue()),((java.lang.String)v8),((java.lang.Integer)v9),((java.lang.String)v10));
    Object v12 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v13 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v12));
    Object v14 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = new java.util.TreeSet();
    Object v17 = new java.util.TreeSet();
    Object v18 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v15),((java.lang.Object)v16),((java.lang.Object)v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = ((com.fasterxml.jackson.databind.DeserializationContext)v14).endOfInputException(((java.lang.Class)v19));
    Object v21 = ((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v6)._deserializeEmbedded(((java.lang.Object)v11),((com.fasterxml.jackson.databind.DeserializationContext)v14));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = new java.util.TreeSet();
    Object v2 = new java.util.TreeSet();
    Object v3 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((java.lang.Object)v1),((java.lang.Object)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = ((java.lang.Class)v4).isSynthetic();
    Object v6 = com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.findDeserializer(((java.lang.Class)v4));
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = new java.util.TreeSet();
    Object v2 = new java.util.TreeSet();
    Object v3 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((java.lang.Object)v1),((java.lang.Object)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = 1;
    Object v6 = new com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.Std(((java.lang.Class)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = "FAIL_ON_INVALID_SUBTYPE";
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = ((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v6)._deserialize(((java.lang.String)v7),((com.fasterxml.jackson.databind.DeserializationContext)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = ": ";
    Object v1 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v0));
    Object v2 = ": can not find property with name '";
    Object v3 = "se";
    Object v4 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = ((com.fasterxml.jackson.databind.JsonDeserializer)v1).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = new java.util.TreeSet();
    Object v2 = new java.util.TreeSet();
    Object v3 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((java.lang.Object)v1),((java.lang.Object)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = 1;
    Object v6 = new com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.Std(((java.lang.Class)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = new byte[]{Byte.valueOf((byte)50)};
    Object v8 = new com.fasterxml.jackson.databind.node.BinaryNode(((byte[])v7));
    Object v9 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v10 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v9));
    Object v11 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v8),((com.fasterxml.jackson.core.ObjectCodec)v10));
    Object v12 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v13 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v12));
    Object v14 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v13));
    Object v15 = ((com.fasterxml.jackson.databind.DeserializationContext)v14).getArrayBuilders();
    Object v16 = ((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v6).deserialize(((com.fasterxml.jackson.core.JsonParser)v11),((com.fasterxml.jackson.databind.DeserializationContext)v14));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = new java.util.TreeSet();
    Object v2 = new java.util.TreeSet();
    Object v3 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((java.lang.Object)v1),((java.lang.Object)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = 1;
    Object v6 = new com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.Std(((java.lang.Class)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = "Unresolved forward re|erences for: ";
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = ((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v6)._deserialize(((java.lang.String)v7),((com.fasterxml.jackson.databind.DeserializationContext)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = new java.util.TreeSet();
    Object v2 = new java.util.TreeSet();
    Object v3 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((java.lang.Object)v1),((java.lang.Object)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = 1;
    Object v6 = new com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.Std(((java.lang.Class)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = "]";
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = ((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v6)._deserialize(((java.lang.String)v7),((com.fasterxml.jackson.databind.DeserializationContext)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = ": ";
    Object v1 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v0));
    Object v2 = ": can not find property with name '";
    Object v3 = "se";
    Object v4 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = ((com.fasterxml.jackson.databind.JsonDeserializer)v1).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v4));
    Object v6 = "Duplicate creator>property \"";
    Object v7 = ((com.fasterxml.jackson.databind.JsonDeserializer)v5).findBackReference(((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = new java.util.TreeSet();
    Object v2 = new java.util.TreeSet();
    Object v3 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((java.lang.Object)v1),((java.lang.Object)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = 1;
    Object v6 = new com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.Std(((java.lang.Class)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = "V";
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = ((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v6)._deserialize(((java.lang.String)v7),((com.fasterxml.jackson.databind.DeserializationContext)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = new java.util.TreeSet();
    Object v2 = new java.util.TreeSet();
    Object v3 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((java.lang.Object)v1),((java.lang.Object)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = 1;
    Object v6 = new com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.Std(((java.lang.Class)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = new byte[]{Byte.valueOf((byte)50)};
    Object v8 = new com.fasterxml.jackson.databind.node.BinaryNode(((byte[])v7));
    Object v9 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v10 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v9));
    Object v11 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v8),((com.fasterxml.jackson.core.ObjectCodec)v10));
    Object v12 = ((com.fasterxml.jackson.core.JsonParser)v11).nextToken();
    Object v13 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v14 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v14));
    Object v16 = ((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v6).deserialize(((com.fasterxml.jackson.core.JsonParser)v11),((com.fasterxml.jackson.databind.DeserializationContext)v15));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = new java.util.TreeSet();
    Object v2 = new java.util.TreeSet();
    Object v3 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((java.lang.Object)v1),((java.lang.Object)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = 1;
    Object v6 = new com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.Std(((java.lang.Class)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = new byte[]{Byte.valueOf((byte)50)};
    Object v8 = new com.fasterxml.jackson.databind.node.BinaryNode(((byte[])v7));
    Object v9 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v10 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v9));
    Object v11 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v8),((com.fasterxml.jackson.core.ObjectCodec)v10));
    Object v12 = ((com.fasterxml.jackson.core.JsonParser)v11).getValueAsString();
    Object v13 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v14 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v14));
    Object v16 = " with key-type annotationR(";
    Object v17 = new java.lang.Object[]{null,null,null};
    Object v18 = ((com.fasterxml.jackson.databind.DeserializationContext)v15).mappingException(((java.lang.String)v16),((java.lang.Object[])v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = new java.util.TreeSet();
    Object v21 = new java.util.TreeSet();
    Object v22 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v19),((java.lang.Object)v20),((java.lang.Object)v21));
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = new java.util.TreeSet();
    Object v25 = new java.util.TreeSet();
    Object v26 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v23),((java.lang.Object)v24),((java.lang.Object)v25));
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v28 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v26),((com.fasterxml.jackson.databind.type.TypeFactory)v27));
    Object v29 = "int";
    Object v30 = false;
    Object v31 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v32 = new java.util.TreeSet();
    Object v33 = new java.util.TreeSet();
    Object v34 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v31),((java.lang.Object)v32),((java.lang.Object)v33));
    Object v35 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v34));
    Object v36 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v22),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v28),((java.lang.String)v29),(((java.lang.Boolean)v30).booleanValue()),((java.lang.Class)v35));
    Object v37 = ((com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer)v6).deserializeWithType(((com.fasterxml.jackson.core.JsonParser)v11),((com.fasterxml.jackson.databind.DeserializationContext)v15),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v36));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = new java.util.TreeSet();
    Object v2 = new java.util.TreeSet();
    Object v3 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((java.lang.Object)v1),((java.lang.Object)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = 1;
    Object v6 = new com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.Std(((java.lang.Class)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v6).getValueClass();
    Object v8 = ((java.lang.Class)v7).getGenericSuperclass();
    Object v9 = com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.findDeserializer(((java.lang.Class)v7));
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = new java.util.TreeSet();
    Object v2 = new java.util.TreeSet();
    Object v3 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((java.lang.Object)v1),((java.lang.Object)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = 1;
    Object v6 = new com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.Std(((java.lang.Class)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v6).getValueClass();
    Object v8 = ((java.lang.Class)v7).isInterface();
    Object v9 = com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.findDeserializer(((java.lang.Class)v7));
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = ": ";
    Object v1 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v0));
    Object v2 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v1).handledType();
    Object v3 = ((java.lang.Class)v2).getDeclaredConstructors();
    Object v4 = com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.findDeserializer(((java.lang.Class)v2));
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = new java.util.TreeSet();
    Object v2 = new java.util.TreeSet();
    Object v3 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((java.lang.Object)v1),((java.lang.Object)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = 1;
    Object v6 = new com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.Std(((java.lang.Class)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = ", ";
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = ((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v6)._deserialize(((java.lang.String)v7),((com.fasterxml.jackson.databind.DeserializationContext)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = new java.util.TreeSet();
    Object v2 = new java.util.TreeSet();
    Object v3 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((java.lang.Object)v1),((java.lang.Object)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = 1;
    Object v6 = new com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.Std(((java.lang.Class)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = new byte[]{Byte.valueOf((byte)50)};
    Object v8 = new com.fasterxml.jackson.databind.node.BinaryNode(((byte[])v7));
    Object v9 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v10 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v9));
    Object v11 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v8),((com.fasterxml.jackson.core.ObjectCodec)v10));
    Object v12 = ((com.fasterxml.jackson.core.JsonParser)v11).getCodec();
    Object v13 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v14 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v14));
    Object v16 = ((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v6).deserialize(((com.fasterxml.jackson.core.JsonParser)v11),((com.fasterxml.jackson.databind.DeserializationContext)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = new java.util.TreeSet();
    Object v2 = new java.util.TreeSet();
    Object v3 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((java.lang.Object)v1),((java.lang.Object)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = 1;
    Object v6 = new com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.Std(((java.lang.Class)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = "T";
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = ((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v6)._deserialize(((java.lang.String)v7),((com.fasterxml.jackson.databind.DeserializationContext)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = new java.util.TreeSet();
    Object v2 = new java.util.TreeSet();
    Object v3 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((java.lang.Object)v1),((java.lang.Object)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = 1;
    Object v6 = new com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.Std(((java.lang.Class)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = new byte[]{Byte.valueOf((byte)50)};
    Object v8 = new com.fasterxml.jackson.databind.node.BinaryNode(((byte[])v7));
    Object v9 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v10 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v9));
    Object v11 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v8),((com.fasterxml.jackson.core.ObjectCodec)v10));
    Object v12 = com.fasterxml.jackson.core.JsonParser.Feature.STRICT_DUPLICATE_DETECTION;
    Object v13 = ((com.fasterxml.jackson.core.JsonParser)v11).enable(((com.fasterxml.jackson.core.JsonParser.Feature)v12));
    Object v14 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v15 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v15));
    Object v17 = ((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v6).deserialize(((com.fasterxml.jackson.core.JsonParser)v11),((com.fasterxml.jackson.databind.DeserializationContext)v16));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = new java.util.TreeSet();
    Object v2 = new java.util.TreeSet();
    Object v3 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((java.lang.Object)v1),((java.lang.Object)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = 1;
    Object v6 = new com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.Std(((java.lang.Class)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = ((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v6)._deserializeEmbedded(((java.lang.Object)v7),((com.fasterxml.jackson.databind.DeserializationContext)v10));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = new java.util.TreeSet();
    Object v2 = new java.util.TreeSet();
    Object v3 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((java.lang.Object)v1),((java.lang.Object)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = 1;
    Object v6 = new com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.Std(((java.lang.Class)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = "arr'y";
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = ((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v6)._deserialize(((java.lang.String)v7),((com.fasterxml.jackson.databind.DeserializationContext)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = ": ";
    Object v1 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v0));
    Object v2 = "' (for id type 'Id.class'): ";
    Object v3 = ((com.fasterxml.jackson.databind.JsonDeserializer)v1).findBackReference(((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = new java.util.TreeSet();
    Object v2 = new java.util.TreeSet();
    Object v3 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((java.lang.Object)v1),((java.lang.Object)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = 1;
    Object v6 = new com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.Std(((java.lang.Class)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = "array";
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new java.util.TreeSet();
    Object v13 = new java.util.TreeSet();
    Object v14 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v11),((java.lang.Object)v12),((java.lang.Object)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v14));
    Object v16 = 1;
    Object v17 = new com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.Std(((java.lang.Class)v15),(((java.lang.Integer)v16).intValue()));
    Object v18 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v17).getValueClass();
    Object v19 = "numDber";
    Object v20 = ((com.fasterxml.jackson.databind.DeserializationContext)v10).instantiationException(((java.lang.Class)v18),((java.lang.String)v19));
    Object v21 = ((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v6)._deserialize(((java.lang.String)v7),((com.fasterxml.jackson.databind.DeserializationContext)v10));
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = new java.util.TreeSet();
    Object v2 = new java.util.TreeSet();
    Object v3 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((java.lang.Object)v1),((java.lang.Object)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = 1;
    Object v6 = new com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.Std(((java.lang.Class)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = "Failed to narrow keytype ";
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = new com.fasterxml.jackson.databind.util.ObjectBuffer();
    ((com.fasterxml.jackson.databind.DeserializationContext)v10).returnObjectBuffer(((com.fasterxml.jackson.databind.util.ObjectBuffer)v11));
    Object v12 = null;
    Object v13 = ((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v6)._deserialize(((java.lang.String)v7),((com.fasterxml.jackson.databind.DeserializationContext)v10));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = new java.util.TreeSet();
    Object v2 = new java.util.TreeSet();
    Object v3 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((java.lang.Object)v1),((java.lang.Object)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = 1;
    Object v6 = new com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.Std(((java.lang.Class)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = ": ";
    Object v8 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v7));
    Object v9 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v8).handledType();
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v14 = "(): return type is not instane of java.util.Map";
    Object v15 = ": ";
    Object v16 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v15));
    ((com.fasterxml.jackson.databind.DeserializationContext)v12).reportUnknownProperty(((java.lang.Object)v13),((java.lang.String)v14),((com.fasterxml.jackson.databind.JsonDeserializer)v16));
    Object v17 = null;
    Object v18 = ((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v6)._deserializeEmbedded(((java.lang.Object)v9),((com.fasterxml.jackson.databind.DeserializationContext)v12));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = ": ";
    Object v1 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v0));
    Object v2 = ": can not find property with name '";
    Object v3 = "se";
    Object v4 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = "arrQy";
    Object v6 = ((com.fasterxml.jackson.databind.util.NameTransformer)v4).reverse(((java.lang.String)v5));
    Object v7 = ((com.fasterxml.jackson.databind.JsonDeserializer)v1).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v4));
    Object v8 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v7).getValueType();
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = new java.util.TreeSet();
    Object v2 = new java.util.TreeSet();
    Object v3 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((java.lang.Object)v1),((java.lang.Object)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = 1;
    Object v6 = new com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.Std(((java.lang.Class)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = "null";
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = ((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v6)._deserialize(((java.lang.String)v7),((com.fasterxml.jackson.databind.DeserializationContext)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = new java.util.TreeSet();
    Object v2 = new java.util.TreeSet();
    Object v3 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((java.lang.Object)v1),((java.lang.Object)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = 1;
    Object v6 = new com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.Std(((java.lang.Class)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = "";
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = new byte[]{Byte.valueOf((byte)50)};
    Object v12 = new com.fasterxml.jackson.databind.node.BinaryNode(((byte[])v11));
    Object v13 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v14 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v13));
    Object v15 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v12),((com.fasterxml.jackson.core.ObjectCodec)v14));
    Object v16 = com.fasterxml.jackson.core.JsonToken.END_ARRAY;
    Object v17 = "]";
    Object v18 = ((com.fasterxml.jackson.databind.DeserializationContext)v10).wrongTokenException(((com.fasterxml.jackson.core.JsonParser)v15),((com.fasterxml.jackson.core.JsonToken)v16),((java.lang.String)v17));
    Object v19 = ((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v6)._deserialize(((java.lang.String)v7),((com.fasterxml.jackson.databind.DeserializationContext)v10));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = ": ";
    Object v1 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v0));
    Object v2 = ": can not find property with name '";
    Object v3 = "se";
    Object v4 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = "arrQy";
    Object v6 = ((com.fasterxml.jackson.databind.util.NameTransformer)v4).reverse(((java.lang.String)v5));
    Object v7 = ((com.fasterxml.jackson.databind.JsonDeserializer)v1).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v4));
    Object v8 = "false";
    Object v9 = ((com.fasterxml.jackson.databind.JsonDeserializer)v7).findBackReference(((java.lang.String)v8));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = new java.util.TreeSet();
    Object v2 = new java.util.TreeSet();
    Object v3 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((java.lang.Object)v1),((java.lang.Object)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = 1;
    Object v6 = new com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.Std(((java.lang.Class)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = "string";
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = ((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v6)._deserialize(((java.lang.String)v7),((com.fasterxml.jackson.databind.DeserializationContext)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = ": ";
    Object v1 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v0));
    Object v2 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v1).getValueClass();
    Object v3 = ((java.lang.Class)v2).toGenericString();
    Object v4 = com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.findDeserializer(((java.lang.Class)v2));
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = ": ";
    Object v1 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v0));
    Object v2 = ": can not find property with name '";
    Object v3 = "se";
    Object v4 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = "arrQy";
    Object v6 = ((com.fasterxml.jackson.databind.util.NameTransformer)v4).reverse(((java.lang.String)v5));
    Object v7 = ((com.fasterxml.jackson.databind.JsonDeserializer)v1).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v4));
    Object v8 = ((com.fasterxml.jackson.databind.JsonDeserializer)v7).getKnownPropertyNames();
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = ": ";
    Object v1 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v0));
    Object v2 = ": can not find property with name '";
    Object v3 = "se";
    Object v4 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = "arrQy";
    Object v6 = ((com.fasterxml.jackson.databind.util.NameTransformer)v4).reverse(((java.lang.String)v5));
    Object v7 = ((com.fasterxml.jackson.databind.JsonDeserializer)v1).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v4));
    Object v8 = ": ";
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v8));
    Object v10 = ((com.fasterxml.jackson.databind.JsonDeserializer)v7).replaceDelegatee(((com.fasterxml.jackson.databind.JsonDeserializer)v9));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = new java.util.TreeSet();
    Object v2 = new java.util.TreeSet();
    Object v3 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((java.lang.Object)v1),((java.lang.Object)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = 1;
    Object v6 = new com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.Std(((java.lang.Class)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = new byte[]{Byte.valueOf((byte)50)};
    Object v8 = new com.fasterxml.jackson.databind.node.BinaryNode(((byte[])v7));
    Object v9 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v10 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v9));
    Object v11 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v8),((com.fasterxml.jackson.core.ObjectCodec)v10));
    Object v12 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v13 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v12));
    Object v14 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v13));
    Object v15 = ": ";
    Object v16 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v15));
    Object v17 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v16).handledType();
    Object v18 = "]&";
    Object v19 = ((com.fasterxml.jackson.databind.DeserializationContext)v14).instantiationException(((java.lang.Class)v17),((java.lang.String)v18));
    Object v20 = ": can not find property with name '";
    Object v21 = "se";
    Object v22 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v20),((java.lang.String)v21));
    Object v23 = ((com.fasterxml.jackson.databind.JsonDeserializer)v6).deserialize(((com.fasterxml.jackson.core.JsonParser)v11),((com.fasterxml.jackson.databind.DeserializationContext)v14),((java.lang.Object)v22));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = ": ";
    Object v1 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v0));
    Object v2 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v1).handledType();
    Object v3 = ((java.lang.Class)v2).isInterface();
    Object v4 = com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.findDeserializer(((java.lang.Class)v2));
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = new java.util.TreeSet();
    Object v2 = new java.util.TreeSet();
    Object v3 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((java.lang.Object)v1),((java.lang.Object)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = 1;
    Object v6 = new com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.Std(((java.lang.Class)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = ") returned true for 'canCreateUsingDelegate()', but null for 'getDelegateT6ype()'";
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = ((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v6)._deserialize(((java.lang.String)v7),((com.fasterxml.jackson.databind.DeserializationContext)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = new java.util.TreeSet();
    Object v2 = new java.util.TreeSet();
    Object v3 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((java.lang.Object)v1),((java.lang.Object)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = 1;
    Object v6 = new com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.Std(((java.lang.Class)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = ":";
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = ((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v6)._deserialize(((java.lang.String)v7),((com.fasterxml.jackson.databind.DeserializationContext)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = new java.util.TreeSet();
    Object v2 = new java.util.TreeSet();
    Object v3 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((java.lang.Object)v1),((java.lang.Object)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = 1;
    Object v6 = new com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.Std(((java.lang.Class)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = new java.util.TreeSet();
    Object v8 = -13L;
    Object v9 = 0L;
    Object v10 = 1;
    Object v11 = 0;
    Object v12 = new com.fasterxml.jackson.core.JsonLocation(((java.lang.Object)v7),(((java.lang.Long)v8).longValue()),(((java.lang.Long)v9).longValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v14 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v14));
    Object v16 = ((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v6)._deserializeEmbedded(((java.lang.Object)v12),((com.fasterxml.jackson.databind.DeserializationContext)v15));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = ": ";
    Object v1 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v0));
    Object v2 = ": can not find property with name '";
    Object v3 = "se";
    Object v4 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = "arrQy";
    Object v6 = ((com.fasterxml.jackson.databind.util.NameTransformer)v4).reverse(((java.lang.String)v5));
    Object v7 = ((com.fasterxml.jackson.databind.JsonDeserializer)v1).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v4));
    Object v8 = ((com.fasterxml.jackson.databind.JsonDeserializer)v7).getEmptyValue();
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = new java.util.TreeSet();
    Object v2 = new java.util.TreeSet();
    Object v3 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((java.lang.Object)v1),((java.lang.Object)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = 1;
    Object v6 = new com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.Std(((java.lang.Class)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = ((com.fasterxml.jackson.databind.JsonDeserializer)v6).getNullValue();
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = new java.util.TreeSet();
    Object v2 = new java.util.TreeSet();
    Object v3 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((java.lang.Object)v1),((java.lang.Object)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = 1;
    Object v6 = new com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.Std(((java.lang.Class)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = "";
    Object v8 = ((com.fasterxml.jackson.databind.JsonDeserializer)v6).findBackReference(((java.lang.String)v7));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = ": ";
    Object v1 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v0));
    Object v2 = ((com.fasterxml.jackson.databind.JsonDeserializer)v1).isCachable();
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = new java.util.TreeSet();
    Object v2 = new java.util.TreeSet();
    Object v3 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((java.lang.Object)v1),((java.lang.Object)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = 1;
    Object v6 = new com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.Std(((java.lang.Class)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = "Module without defined versio}";
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = ((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v6)._deserialize(((java.lang.String)v7),((com.fasterxml.jackson.databind.DeserializationContext)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = ": ";
    Object v1 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v0));
    Object v2 = ": can not find property with name '";
    Object v3 = "se";
    Object v4 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = ((com.fasterxml.jackson.databind.JsonDeserializer)v1).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v4));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v7));
    Object v9 = ((com.fasterxml.jackson.databind.JsonDeserializer)v5).getEmptyValue(((com.fasterxml.jackson.databind.DeserializationContext)v8));
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = new java.util.TreeSet();
    Object v2 = new java.util.TreeSet();
    Object v3 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((java.lang.Object)v1),((java.lang.Object)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = 1;
    Object v6 = new com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.Std(((java.lang.Class)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v6).handledType();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = new java.util.TreeSet();
    Object v2 = new java.util.TreeSet();
    Object v3 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((java.lang.Object)v1),((java.lang.Object)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = 1;
    Object v6 = new com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.Std(((java.lang.Class)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v6).getValueClass();
    Object v8 = ((java.lang.Class)v7).getDeclaredClasses();
    Object v9 = com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.findDeserializer(((java.lang.Class)v7));
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = new java.util.TreeSet();
    Object v2 = new java.util.TreeSet();
    Object v3 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((java.lang.Object)v1),((java.lang.Object)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = 1;
    Object v6 = new com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.Std(((java.lang.Class)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = new byte[]{Byte.valueOf((byte)50)};
    Object v8 = new com.fasterxml.jackson.databind.node.BinaryNode(((byte[])v7));
    Object v9 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v10 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v9));
    Object v11 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v8),((com.fasterxml.jackson.core.ObjectCodec)v10));
    Object v12 = ((com.fasterxml.jackson.core.JsonParser)v11).getValueAsString();
    Object v13 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v14 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v14));
    Object v16 = ((com.fasterxml.jackson.databind.deser.std.FromStringDeserializer)v6).deserialize(((com.fasterxml.jackson.core.JsonParser)v11),((com.fasterxml.jackson.databind.DeserializationContext)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = ": ";
    Object v1 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v0));
    Object v2 = ": can not find property with name '";
    Object v3 = "se";
    Object v4 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = ((com.fasterxml.jackson.databind.JsonDeserializer)v1).unwrappingDeserializer(((com.fasterxml.jackson.databind.util.NameTransformer)v4));
    Object v6 = ((com.fasterxml.jackson.databind.JsonDeserializer)v5).isCachable();
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = ": ";
    Object v1 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v0));
    Object v2 = new byte[]{Byte.valueOf((byte)50)};
    Object v3 = new com.fasterxml.jackson.databind.node.BinaryNode(((byte[])v2));
    Object v4 = new com.fasterxml.jackson.databind.MappingJsonFactory();
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v3),((com.fasterxml.jackson.core.ObjectCodec)v5));
    Object v7 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v8 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v7));
    Object v9 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v11 = "^)";
    Object v12 = ": ";
    Object v13 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v12));
    ((com.fasterxml.jackson.databind.DeserializationContext)v9).reportUnknownProperty(((java.lang.Object)v10),((java.lang.String)v11),((com.fasterxml.jackson.databind.JsonDeserializer)v13));
    Object v14 = null;
    Object v15 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v16 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v15));
    Object v17 = ((com.fasterxml.jackson.databind.JsonDeserializer)v1).deserialize(((com.fasterxml.jackson.core.JsonParser)v6),((com.fasterxml.jackson.databind.DeserializationContext)v9),((java.lang.Object)v16));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = new java.util.TreeSet();
    Object v2 = new java.util.TreeSet();
    Object v3 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((java.lang.Object)v1),((java.lang.Object)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = 1;
    Object v6 = new com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.Std(((java.lang.Class)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = ((com.fasterxml.jackson.databind.deser.std.StdDeserializer)v6).handledType();
    Object v8 = com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.findDeserializer(((java.lang.Class)v7));
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = ": ";
    Object v1 = new com.fasterxml.jackson.databind.deser.impl.FailingDeserializer(((java.lang.String)v0));
    Object v2 = ((com.fasterxml.jackson.databind.JsonDeserializer)v1).getEmptyValue();
    org.junit.Assert.assertNull(v2);
  }
}
