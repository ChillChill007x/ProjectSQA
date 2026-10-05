package com.fasterxml.jackson.databind;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = 0;
    Object v4 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v3).intValue()));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = 0;
    Object v7 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v6).intValue()));
    Object v8 = 0;
    Object v9 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v8).intValue()));
    Object v10 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v5),((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.JavaType)v9));
    Object v11 = new java.lang.Object[]{null,null,null};
    Object v12 = com.fasterxml.jackson.databind.util.ArrayBuilders.arrayToSet(((java.lang.Object[])v11));
    Object v13 = new java.util.concurrent.atomic.AtomicReference(((java.lang.Object)v12));
    Object v14 = ((com.fasterxml.jackson.databind.DeserializationContext)v2).hasValueDeserializerFor(((com.fasterxml.jackson.databind.JavaType)v10),((java.util.concurrent.atomic.AtomicReference)v13));
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = 0;
    Object v4 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v3).intValue()));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = ((java.lang.Class)v5).isPrimitive();
    Object v7 = 10.754798909885519D;
    Object v8 = "]";
    Object v9 = new java.lang.Object[]{null};
    Object v10 = ((com.fasterxml.jackson.databind.DeserializationContext)v2).handleWeirdNumberValue(((java.lang.Class)v5),((java.lang.Number)v7),((java.lang.String)v8),((java.lang.Object[])v9));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    ((com.fasterxml.jackson.databind.DeserializationContext)v2).checkUnresolvedObjectId();
    Object v3 = null;
    Object v4 = 0;
    Object v5 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v4).intValue()));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = Byte.valueOf((byte)0);
    Object v8 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer(((java.lang.Class)v6),((java.lang.Byte)v7));
    Object v9 = ";";
    Object v10 = new java.lang.Object[]{null,null,null};
    Object v11 = ((com.fasterxml.jackson.databind.DeserializationContext)v2).reportInputMismatch(((com.fasterxml.jackson.databind.JsonDeserializer)v8),((java.lang.String)v9),((java.lang.Object[])v10));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.exc.MismatchedInputException");
    } catch (com.fasterxml.jackson.databind.exc.MismatchedInputException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v4 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v4));
    Object v6 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v7 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v7),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v10));
    Object v12 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v3),((com.fasterxml.jackson.core.ObjectCodec)v11));
    Object v13 = 0;
    Object v14 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v13).intValue()));
    Object v15 = ((com.fasterxml.jackson.databind.JavaType)v14).getInterfaces();
    Object v16 = ((com.fasterxml.jackson.databind.DeserializationContext)v2).readValue(((com.fasterxml.jackson.core.JsonParser)v12),((com.fasterxml.jackson.databind.JavaType)v14));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = ((com.fasterxml.jackson.databind.DeserializationContext)v2).getArrayBuilders();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v3 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v2));
    Object v4 = 0;
    Object v5 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v4).intValue()));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = "string";
    Object v8 = 0;
    Object v9 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v8).intValue()));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = 0;
    Object v12 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v11).intValue()));
    Object v13 = 0;
    Object v14 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v13).intValue()));
    Object v15 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v10),((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.JavaType)v14));
    Object v16 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v3),((java.lang.Class)v6),((java.lang.String)v7),((com.fasterxml.jackson.databind.JavaType)v15));
    Object v17 = 0;
    Object v18 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v17).intValue()));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = ((com.fasterxml.jackson.databind.introspect.Annotated)v16).hasAnnotation(((java.lang.Class)v19));
    Object v21 = "array";
    Object v22 = "Not a sbtype";
    Object v23 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v21),((java.lang.String)v22));
    Object v24 = 0;
    Object v25 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v24).intValue()));
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v25));
    Object v27 = 0;
    Object v28 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v27).intValue()));
    Object v29 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v28));
    Object v30 = 0;
    Object v31 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v30).intValue()));
    Object v32 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v31));
    Object v33 = new com.fasterxml.jackson.databind.introspect.ObjectIdInfo(((com.fasterxml.jackson.databind.PropertyName)v23),((java.lang.Class)v26),((java.lang.Class)v29),((java.lang.Class)v32));
    Object v34 = ((com.fasterxml.jackson.databind.DatabindContext)v0).objectIdGeneratorInstance(((com.fasterxml.jackson.databind.introspect.Annotated)v16),((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v33));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = 0;
    Object v4 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v3).intValue()));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v6 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.type.TypeFactory)v5));
    Object v7 = "AnnotationIntrospector";
    Object v8 = 0;
    Object v9 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v8).intValue()));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = Byte.valueOf((byte)0);
    Object v12 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer(((java.lang.Class)v10),((java.lang.Byte)v11));
    ((com.fasterxml.jackson.databind.DeserializationContext)v2).reportUnknownProperty(((java.lang.Object)v6),((java.lang.String)v7),((com.fasterxml.jackson.databind.JsonDeserializer)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = 0;
    Object v4 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v3).intValue()));
    Object v5 = ((com.fasterxml.jackson.databind.DeserializationContext)v2).findRootValueDeserializer(((com.fasterxml.jackson.databind.JavaType)v4));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = 0;
    Object v4 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v3).intValue()));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = 0;
    Object v7 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v6).intValue()));
    Object v8 = 0;
    Object v9 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v8).intValue()));
    Object v10 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v5),((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.JavaType)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v12 = ((com.fasterxml.jackson.databind.JavaType)v10).equals(((java.lang.Object)v11));
    Object v13 = "L";
    Object v14 = 0;
    Object v15 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v14).intValue()));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v17 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.type.TypeFactory)v16));
    Object v18 = "AnnotationIntrospector returned serializ=r definition of type ";
    Object v19 = ((com.fasterxml.jackson.databind.DeserializationContext)v2).handleUnknownTypeId(((com.fasterxml.jackson.databind.JavaType)v10),((java.lang.String)v13),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v17),((java.lang.String)v18));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = 0;
    Object v4 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v3).intValue()));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = ((com.fasterxml.jackson.databind.DeserializationContext)v2).getDefaultPropertyFormat(((java.lang.Class)v5));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = ((com.fasterxml.jackson.databind.DeserializationContext)v2).getArrayBuilders();
    Object v4 = 0;
    Object v5 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v4).intValue()));
    Object v6 = 0;
    Object v7 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v6).intValue()));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v9 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.type.TypeFactory)v8));
    Object v10 = "'";
    Object v11 = true;
    Object v12 = 0;
    Object v13 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v12).intValue()));
    Object v14 = new com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v9),((java.lang.String)v10),(((java.lang.Boolean)v11).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v13));
    Object v15 = ((com.fasterxml.jackson.databind.DeserializationContext)v2).getAttribute(((java.lang.Object)v14));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = "]H";
    Object v4 = ((com.fasterxml.jackson.databind.DeserializationContext)v2).mappingException(((java.lang.String)v3));
    Object v5 = 0;
    Object v6 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v5).intValue()));
    Object v7 = 0;
    Object v8 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v7).intValue()));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = ((com.fasterxml.jackson.databind.JavaType)v6).isTypeOrSuperTypeOf(((java.lang.Class)v9));
    Object v11 = ((com.fasterxml.jackson.databind.DeserializationContext)v2).findRootValueDeserializer(((com.fasterxml.jackson.databind.JavaType)v6));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v4 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v4));
    Object v6 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v7 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v7),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v10));
    Object v12 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v3),((com.fasterxml.jackson.core.ObjectCodec)v11));
    Object v13 = 0;
    Object v14 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v13).intValue()));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v14));
    Object v16 = ((java.lang.Class)v15).getPackageName();
    Object v17 = com.fasterxml.jackson.core.JsonToken.START_ARRAY;
    Object v18 = "7";
    Object v19 = ((com.fasterxml.jackson.databind.DeserializationContext)v2).wrongTokenException(((com.fasterxml.jackson.core.JsonParser)v12),((java.lang.Class)v15),((com.fasterxml.jackson.core.JsonToken)v17),((java.lang.String)v18));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v4 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v5 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v3),((com.fasterxml.jackson.databind.type.TypeBindings)v4));
    Object v6 = 0;
    Object v7 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v6).intValue()));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = "string";
    Object v10 = 0;
    Object v11 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v10).intValue()));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = 0;
    Object v14 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v13).intValue()));
    Object v15 = 0;
    Object v16 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v15).intValue()));
    Object v17 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v12),((com.fasterxml.jackson.databind.JavaType)v14),((com.fasterxml.jackson.databind.JavaType)v16));
    Object v18 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v5),((java.lang.Class)v8),((java.lang.String)v9),((com.fasterxml.jackson.databind.JavaType)v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v20 = ((com.fasterxml.jackson.databind.DeserializationContext)v2).deserializerInstance(((com.fasterxml.jackson.databind.introspect.Annotated)v18),((java.lang.Object)v19));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = 0;
    Object v4 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v3).intValue()));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = ((com.fasterxml.jackson.databind.DeserializationContext)v2).endOfInputException(((java.lang.Class)v5));
    Object v7 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v8 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v9 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v8));
    Object v10 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v11 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v10));
    Object v12 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v13 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v12));
    Object v14 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v13));
    Object v15 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v9),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v11),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v14));
    Object v16 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v7),((com.fasterxml.jackson.core.ObjectCodec)v15));
    Object v17 = 0;
    Object v18 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v17).intValue()));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = Byte.valueOf((byte)0);
    Object v21 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer(((java.lang.Class)v19),((java.lang.Byte)v20));
    Object v22 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v23 = "Null SerializerProvider passed for ";
    Object v24 = ((com.fasterxml.jackson.databind.DeserializationContext)v2).handleUnknownProperty(((com.fasterxml.jackson.core.JsonParser)v16),((com.fasterxml.jackson.databind.JsonDeserializer)v21),((java.lang.Object)v22),((java.lang.String)v23));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = 0;
    Object v4 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v3).intValue()));
    Object v5 = "Type-wrapped deserializer's deserializeWithType should never get called";
    Object v6 = ((com.fasterxml.jackson.databind.DeserializationContext)v2).missingTypeIdException(((com.fasterxml.jackson.databind.JavaType)v4),((java.lang.String)v5));
    Object v7 = ((com.fasterxml.jackson.databind.DeserializationContext)v2).getContextualType();
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = "array";
    Object v4 = "Not a sbtype";
    Object v5 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = 0;
    Object v7 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v6).intValue()));
    Object v8 = "array";
    Object v9 = "Not a sbtype";
    Object v10 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v12 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v13 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v11),((com.fasterxml.jackson.databind.type.TypeBindings)v12));
    Object v14 = 0;
    Object v15 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v14).intValue()));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = "string";
    Object v18 = 0;
    Object v19 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v18).intValue()));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v19));
    Object v21 = 0;
    Object v22 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v21).intValue()));
    Object v23 = 0;
    Object v24 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v23).intValue()));
    Object v25 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v20),((com.fasterxml.jackson.databind.JavaType)v22),((com.fasterxml.jackson.databind.JavaType)v24));
    Object v26 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v13),((java.lang.Class)v16),((java.lang.String)v17),((com.fasterxml.jackson.databind.JavaType)v25));
    Object v27 = false;
    Object v28 = "]";
    Object v29 = 26;
    Object v30 = "";
    Object v31 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v27).booleanValue()),((java.lang.String)v28),((java.lang.Integer)v29),((java.lang.String)v30));
    Object v32 = new com.fasterxml.jackson.databind.BeanProperty.Std(((com.fasterxml.jackson.databind.PropertyName)v5),((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.PropertyName)v10),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v26),((com.fasterxml.jackson.databind.PropertyMetadata)v31));
    Object v33 = 0;
    Object v34 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v33).intValue()));
    Object v35 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v34));
    Object v36 = ((com.fasterxml.jackson.databind.BeanProperty)v32).getContextAnnotation(((java.lang.Class)v35));
    Object v37 = "Cannot deserialize value of type %s from String %s: %s";
    Object v38 = new java.lang.Object[]{null};
    Object v39 = ((com.fasterxml.jackson.databind.DeserializationContext)v2).reportInputMismatch(((com.fasterxml.jackson.databind.BeanProperty)v32),((java.lang.String)v37),((java.lang.Object[])v38));
      org.junit.Assert.fail("Expected java.util.MissingFormatArgumentException");
    } catch (java.util.MissingFormatArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v4 = "array";
    Object v5 = "Not a sbtype";
    Object v6 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = 0;
    Object v8 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v7).intValue()));
    Object v9 = "array";
    Object v10 = "Not a sbtype";
    Object v11 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v13 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v14 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v12),((com.fasterxml.jackson.databind.type.TypeBindings)v13));
    Object v15 = 0;
    Object v16 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v15).intValue()));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = "string";
    Object v19 = 0;
    Object v20 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v19).intValue()));
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = 0;
    Object v23 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v22).intValue()));
    Object v24 = 0;
    Object v25 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v24).intValue()));
    Object v26 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v21),((com.fasterxml.jackson.databind.JavaType)v23),((com.fasterxml.jackson.databind.JavaType)v25));
    Object v27 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v14),((java.lang.Class)v17),((java.lang.String)v18),((com.fasterxml.jackson.databind.JavaType)v26));
    Object v28 = false;
    Object v29 = "]";
    Object v30 = 26;
    Object v31 = "";
    Object v32 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v28).booleanValue()),((java.lang.String)v29),((java.lang.Integer)v30),((java.lang.String)v31));
    Object v33 = new com.fasterxml.jackson.databind.BeanProperty.Std(((com.fasterxml.jackson.databind.PropertyName)v6),((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.PropertyName)v11),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v27),((com.fasterxml.jackson.databind.PropertyMetadata)v32));
    Object v34 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v35 = ((com.fasterxml.jackson.databind.DeserializationContext)v2).findInjectableValue(((java.lang.Object)v3),((com.fasterxml.jackson.databind.BeanProperty)v33),((java.lang.Object)v34));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = ((com.fasterxml.jackson.databind.DeserializationContext)v2).getDateFormat();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = "Called ";
    Object v4 = 0;
    Object v5 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v4).intValue()));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = ")";
    Object v8 = ((com.fasterxml.jackson.databind.DeserializationContext)v2).weirdStringException(((java.lang.String)v3),((java.lang.Class)v6),((java.lang.String)v7));
    Object v9 = 0;
    Object v10 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = "'H(of type ";
    Object v13 = "";
    Object v14 = new java.lang.Object[]{null,null,null};
    Object v15 = ((com.fasterxml.jackson.databind.DeserializationContext)v2).handleWeirdKey(((java.lang.Class)v11),((java.lang.String)v12),((java.lang.String)v13),((java.lang.Object[])v14));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = ((com.fasterxml.jackson.databind.DeserializationContext)v2).getContextualType();
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = 0;
    Object v4 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v3).intValue()));
    Object v5 = 0;
    Object v6 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v5).intValue()));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v8 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.type.TypeFactory)v7));
    Object v9 = "NULL";
    Object v10 = ((com.fasterxml.jackson.databind.DeserializationContext)v2).handleMissingTypeId(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v8),((java.lang.String)v9));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v3 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v2));
    Object v4 = 0;
    Object v5 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v4).intValue()));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = "string";
    Object v8 = 0;
    Object v9 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v8).intValue()));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = 0;
    Object v12 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v11).intValue()));
    Object v13 = 0;
    Object v14 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v13).intValue()));
    Object v15 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v10),((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.JavaType)v14));
    Object v16 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v3),((java.lang.Class)v6),((java.lang.String)v7),((com.fasterxml.jackson.databind.JavaType)v15));
    Object v17 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v18 = ((com.fasterxml.jackson.databind.DatabindContext)v0).converterInstance(((com.fasterxml.jackson.databind.introspect.Annotated)v16),((java.lang.Object)v17));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = ((com.fasterxml.jackson.databind.DatabindContext)v0).getConfig();
    Object v2 = 0;
    Object v3 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v2).intValue()));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = ((com.fasterxml.jackson.databind.DatabindContext)v0).constructType(((java.lang.reflect.Type)v4));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v4 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v3));
    Object v5 = 0;
    Object v6 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v5).intValue()));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = "string";
    Object v9 = 0;
    Object v10 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = 0;
    Object v13 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v12).intValue()));
    Object v14 = 0;
    Object v15 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v14).intValue()));
    Object v16 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v11),((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.JavaType)v15));
    Object v17 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v4),((java.lang.Class)v7),((java.lang.String)v8),((com.fasterxml.jackson.databind.JavaType)v16));
    Object v18 = "array";
    Object v19 = "Not a sbtype";
    Object v20 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v18),((java.lang.String)v19));
    Object v21 = 0;
    Object v22 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v21).intValue()));
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v22));
    Object v24 = 0;
    Object v25 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v24).intValue()));
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v25));
    Object v27 = 0;
    Object v28 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v27).intValue()));
    Object v29 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v28));
    Object v30 = new com.fasterxml.jackson.databind.introspect.ObjectIdInfo(((com.fasterxml.jackson.databind.PropertyName)v20),((java.lang.Class)v23),((java.lang.Class)v26),((java.lang.Class)v29));
    Object v31 = ((com.fasterxml.jackson.databind.DatabindContext)v1).objectIdResolverInstance(((com.fasterxml.jackson.databind.introspect.Annotated)v17),((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v30));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = new java.util.Date();
    Object v4 = ((com.fasterxml.jackson.databind.DeserializationContext)v2).constructCalendar(((java.util.Date)v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v4 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v3));
    Object v5 = 0;
    Object v6 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v5).intValue()));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = "string";
    Object v9 = 0;
    Object v10 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = 0;
    Object v13 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v12).intValue()));
    Object v14 = 0;
    Object v15 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v14).intValue()));
    Object v16 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v11),((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.JavaType)v15));
    Object v17 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v4),((java.lang.Class)v7),((java.lang.String)v8),((com.fasterxml.jackson.databind.JavaType)v16));
    Object v18 = ((com.fasterxml.jackson.databind.introspect.Annotated)v17).getGenericType();
    Object v19 = "array";
    Object v20 = "Not a sbtype";
    Object v21 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v19),((java.lang.String)v20));
    Object v22 = 0;
    Object v23 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v22).intValue()));
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v23));
    Object v25 = 0;
    Object v26 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v25).intValue()));
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v26));
    Object v28 = 0;
    Object v29 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v28).intValue()));
    Object v30 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v29));
    Object v31 = new com.fasterxml.jackson.databind.introspect.ObjectIdInfo(((com.fasterxml.jackson.databind.PropertyName)v21),((java.lang.Class)v24),((java.lang.Class)v27),((java.lang.Class)v30));
    Object v32 = false;
    Object v33 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v31).withAlwaysAsId((((java.lang.Boolean)v32).booleanValue()));
    Object v34 = ((com.fasterxml.jackson.databind.DatabindContext)v1).objectIdGeneratorInstance(((com.fasterxml.jackson.databind.introspect.Annotated)v17),((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v31));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v4 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v4));
    Object v6 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v7 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v7),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v10));
    Object v12 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v3),((com.fasterxml.jackson.core.ObjectCodec)v11));
    Object v13 = 0;
    Object v14 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v13).intValue()));
    Object v15 = com.fasterxml.jackson.core.JsonToken.END_OBJECT;
    Object v16 = "array";
    Object v17 = ((com.fasterxml.jackson.databind.DeserializationContext)v2).wrongTokenException(((com.fasterxml.jackson.core.JsonParser)v12),((com.fasterxml.jackson.databind.JavaType)v14),((com.fasterxml.jackson.core.JsonToken)v15),((java.lang.String)v16));
    Object v18 = 0;
    Object v19 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v18).intValue()));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v19));
    Object v21 = com.fasterxml.jackson.core.JsonToken.END_OBJECT;
    Object v22 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v23 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v24 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v23));
    Object v25 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v26 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v25));
    Object v27 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v28 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v27));
    Object v29 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v28));
    Object v30 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v24),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v26),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v29));
    Object v31 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v22),((com.fasterxml.jackson.core.ObjectCodec)v30));
    Object v32 = "Argument #%d of cons";
    Object v33 = new java.lang.Object[]{};
    Object v34 = ((com.fasterxml.jackson.databind.DeserializationContext)v2).handleUnexpectedToken(((java.lang.Class)v20),((com.fasterxml.jackson.core.JsonToken)v21),((com.fasterxml.jackson.core.JsonParser)v31),((java.lang.String)v32),((java.lang.Object[])v33));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = 0;
    Object v2 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v1).intValue()));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = 0;
    Object v5 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v4).intValue()));
    Object v6 = 0;
    Object v7 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v6).intValue()));
    Object v8 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = 0;
    Object v10 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = ((com.fasterxml.jackson.databind.DatabindContext)v0).constructSpecializedType(((com.fasterxml.jackson.databind.JavaType)v8),((java.lang.Class)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = "inkteger";
    Object v4 = new java.lang.Object[]{null,null};
    Object v5 = ((com.fasterxml.jackson.databind.DeserializationContext)v2).mappingException(((java.lang.String)v3),((java.lang.Object[])v4));
    Object v6 = ((com.fasterxml.jackson.databind.DeserializationContext)v2).getDeserializationFeatures();
    org.junit.Assert.assertEquals((Object)(0), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = com.fasterxml.jackson.databind.DeserializationFeature.READ_ENUMS_USING_TO_STRING;
    Object v4 = ((com.fasterxml.jackson.databind.DeserializationContext)v2).isEnabled(((com.fasterxml.jackson.databind.DeserializationFeature)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v4 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v4));
    Object v6 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v7 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v7),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v10));
    Object v12 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v3),((com.fasterxml.jackson.core.ObjectCodec)v11));
    Object v13 = 3;
    Object v14 = ((com.fasterxml.jackson.core.JsonParser)v12).nextIntValue((((java.lang.Integer)v13).intValue()));
    Object v15 = 0;
    Object v16 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v15).intValue()));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = Byte.valueOf((byte)0);
    Object v19 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer(((java.lang.Class)v17),((java.lang.Byte)v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v21 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v22 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v20),((com.fasterxml.jackson.databind.type.TypeBindings)v21));
    Object v23 = "[map type; cl";
    Object v24 = ((com.fasterxml.jackson.databind.DeserializationContext)v2).handleUnknownProperty(((com.fasterxml.jackson.core.JsonParser)v12),((com.fasterxml.jackson.databind.JsonDeserializer)v19),((java.lang.Object)v22),((java.lang.String)v23));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = 0;
    Object v4 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v3).intValue()));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = "Missing method (broken JDK (";
    Object v7 = "Cannot deserialize value of type %s from native value (`JsonToken.VALUE_EMBEDDED_OBJECT`) of type %s: incompatible types";
    Object v8 = new java.lang.Object[]{null};
    Object v9 = ((com.fasterxml.jackson.databind.DeserializationContext)v2).handleWeirdKey(((java.lang.Class)v5),((java.lang.String)v6),((java.lang.String)v7),((java.lang.Object[])v8));
      org.junit.Assert.fail("Expected java.util.MissingFormatArgumentException");
    } catch (java.util.MissingFormatArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = 0;
    Object v4 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v3).intValue()));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_INT;
    Object v7 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v8 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v9 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v8));
    Object v10 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v11 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v10));
    Object v12 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v13 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v12));
    Object v14 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v13));
    Object v15 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v9),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v11),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v14));
    Object v16 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v7),((com.fasterxml.jackson.core.ObjectCodec)v15));
    ((com.fasterxml.jackson.core.JsonParser)v16).close();
    Object v17 = null;
    Object v18 = ", ";
    Object v19 = new java.lang.Object[]{};
    Object v20 = ((com.fasterxml.jackson.databind.DeserializationContext)v2).handleUnexpectedToken(((java.lang.Class)v5),((com.fasterxml.jackson.core.JsonToken)v6),((com.fasterxml.jackson.core.JsonParser)v16),((java.lang.String)v18),((java.lang.Object[])v19));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = 0;
    Object v4 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v3).intValue()));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v7));
    Object v9 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v10 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v11 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v10));
    Object v12 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v13 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v12));
    Object v14 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v15 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v15));
    Object v17 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v11),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v13),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v16));
    Object v18 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v9),((com.fasterxml.jackson.core.ObjectCodec)v17));
    Object v19 = 0;
    Object v20 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v19).intValue()));
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = ((java.lang.Class)v21).getPackageName();
    Object v23 = com.fasterxml.jackson.core.JsonToken.START_ARRAY;
    Object v24 = "7";
    Object v25 = ((com.fasterxml.jackson.databind.DeserializationContext)v8).wrongTokenException(((com.fasterxml.jackson.core.JsonParser)v18),((java.lang.Class)v21),((com.fasterxml.jackson.core.JsonToken)v23),((java.lang.String)v24));
    Object v26 = ((com.fasterxml.jackson.databind.DeserializationContext)v2).instantiationException(((java.lang.Class)v5),((java.lang.Throwable)v25));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = 0;
    Object v4 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v3).intValue()));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = ((java.lang.Class)v5).getModifiers();
    Object v7 = "integer";
    Object v8 = ((com.fasterxml.jackson.databind.DeserializationContext)v2).instantiationException(((java.lang.Class)v5),((java.lang.String)v7));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = 0;
    Object v4 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v3).intValue()));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = ((java.lang.Class)v5).getDeclaredConstructors();
    Object v7 = 0;
    Object v8 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v7).intValue()));
    Object v9 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v10 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v10));
    Object v12 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v13 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v14 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v13));
    Object v15 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v16 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v15));
    Object v17 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v18 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v17));
    Object v19 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v18));
    Object v20 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v14),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v16),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v19));
    Object v21 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v12),((com.fasterxml.jackson.core.ObjectCodec)v20));
    Object v22 = 0;
    Object v23 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v22).intValue()));
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v23));
    Object v25 = ((java.lang.Class)v24).getPackageName();
    Object v26 = com.fasterxml.jackson.core.JsonToken.START_ARRAY;
    Object v27 = "7";
    Object v28 = ((com.fasterxml.jackson.databind.DeserializationContext)v11).wrongTokenException(((com.fasterxml.jackson.core.JsonParser)v21),((java.lang.Class)v24),((com.fasterxml.jackson.core.JsonToken)v26),((java.lang.String)v27));
    Object v29 = ((com.fasterxml.jackson.databind.DeserializationContext)v2).handleInstantiationProblem(((java.lang.Class)v5),((java.lang.Object)v8),((java.lang.Throwable)v28));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = 0;
    Object v4 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v3).intValue()));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = ((com.fasterxml.jackson.databind.DeserializationContext)v2)._isCompatible(((java.lang.Class)v5),((java.lang.Object)v6));
    org.junit.Assert.assertEquals((Object)(true), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = ((com.fasterxml.jackson.databind.DeserializationContext)v2).getParser();
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v3 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v2));
    Object v4 = 0;
    Object v5 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v4).intValue()));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = "string";
    Object v8 = 0;
    Object v9 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v8).intValue()));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = 0;
    Object v12 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v11).intValue()));
    Object v13 = 0;
    Object v14 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v13).intValue()));
    Object v15 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v10),((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.JavaType)v14));
    Object v16 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v3),((java.lang.Class)v6),((java.lang.String)v7),((com.fasterxml.jackson.databind.JavaType)v15));
    Object v17 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v18 = ((com.fasterxml.jackson.databind.DatabindContext)v0).converterInstance(((com.fasterxml.jackson.databind.introspect.Annotated)v16),((java.lang.Object)v17));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = 0;
    Object v4 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v3).intValue()));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = Byte.valueOf((byte)0);
    Object v7 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer(((java.lang.Class)v5),((java.lang.Byte)v6));
    Object v8 = "";
    Object v9 = new java.lang.Object[]{};
    Object v10 = ((com.fasterxml.jackson.databind.DeserializationContext)v2).reportInputMismatch(((com.fasterxml.jackson.databind.JsonDeserializer)v7),((java.lang.String)v8),((java.lang.Object[])v9));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.exc.MismatchedInputException");
    } catch (com.fasterxml.jackson.databind.exc.MismatchedInputException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = 62;
    Object v4 = ((com.fasterxml.jackson.databind.DeserializationContext)v2).hasDeserializationFeatures((((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v4 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v4));
    Object v6 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v7 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v7),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v10));
    Object v12 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v3),((com.fasterxml.jackson.core.ObjectCodec)v11));
    Object v13 = com.fasterxml.jackson.core.JsonToken.VALUE_STRING;
    Object v14 = "";
    Object v15 = new java.lang.Object[]{};
    ((com.fasterxml.jackson.databind.DeserializationContext)v2).reportWrongTokenException(((com.fasterxml.jackson.core.JsonParser)v12),((com.fasterxml.jackson.core.JsonToken)v13),((java.lang.String)v14),((java.lang.Object[])v15));
    Object v16 = null;
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.exc.MismatchedInputException");
    } catch (com.fasterxml.jackson.databind.exc.MismatchedInputException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = 68;
    Object v4 = ((com.fasterxml.jackson.databind.DeserializationContext)v2).hasDeserializationFeatures((((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = 0;
    Object v4 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v3).intValue()));
    Object v5 = new java.lang.Object[]{null,null,null};
    Object v6 = com.fasterxml.jackson.databind.util.ArrayBuilders.arrayToSet(((java.lang.Object[])v5));
    Object v7 = new java.util.concurrent.atomic.AtomicReference(((java.lang.Object)v6));
    Object v8 = ((com.fasterxml.jackson.databind.DeserializationContext)v2).hasValueDeserializerFor(((com.fasterxml.jackson.databind.JavaType)v4),((java.util.concurrent.atomic.AtomicReference)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = 0;
    Object v2 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v1).intValue()));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = 0;
    Object v5 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v4).intValue()));
    Object v6 = 0;
    Object v7 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v6).intValue()));
    Object v8 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = 0;
    Object v10 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new java.lang.Class[]{};
    Object v13 = ((java.lang.Class)v11).getDeclaredConstructor(((java.lang.Class[])v12));
    Object v14 = ((com.fasterxml.jackson.databind.DatabindContext)v0).constructSpecializedType(((com.fasterxml.jackson.databind.JavaType)v8),((java.lang.Class)v11));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = "array";
    Object v4 = "Not a sbtype";
    Object v5 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = 0;
    Object v7 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v6).intValue()));
    Object v8 = "array";
    Object v9 = "Not a sbtype";
    Object v10 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v12 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v13 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v11),((com.fasterxml.jackson.databind.type.TypeBindings)v12));
    Object v14 = 0;
    Object v15 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v14).intValue()));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = "string";
    Object v18 = 0;
    Object v19 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v18).intValue()));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v19));
    Object v21 = 0;
    Object v22 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v21).intValue()));
    Object v23 = 0;
    Object v24 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v23).intValue()));
    Object v25 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v20),((com.fasterxml.jackson.databind.JavaType)v22),((com.fasterxml.jackson.databind.JavaType)v24));
    Object v26 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v13),((java.lang.Class)v16),((java.lang.String)v17),((com.fasterxml.jackson.databind.JavaType)v25));
    Object v27 = false;
    Object v28 = "]";
    Object v29 = 26;
    Object v30 = "";
    Object v31 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v27).booleanValue()),((java.lang.String)v28),((java.lang.Integer)v29),((java.lang.String)v30));
    Object v32 = new com.fasterxml.jackson.databind.BeanProperty.Std(((com.fasterxml.jackson.databind.PropertyName)v5),((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.PropertyName)v10),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v26),((com.fasterxml.jackson.databind.PropertyMetadata)v31));
    Object v33 = "";
    Object v34 = new java.lang.Object[]{};
    Object v35 = ((com.fasterxml.jackson.databind.DeserializationContext)v2).reportInputMismatch(((com.fasterxml.jackson.databind.BeanProperty)v32),((java.lang.String)v33),((java.lang.Object[])v34));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.exc.MismatchedInputException");
    } catch (com.fasterxml.jackson.databind.exc.MismatchedInputException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v4 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v5 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v3),((com.fasterxml.jackson.databind.type.TypeBindings)v4));
    Object v6 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor.Base();
    Object v7 = ((com.fasterxml.jackson.databind.DeserializationContext)v2).setAttribute(((java.lang.Object)v5),((java.lang.Object)v6));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = 0;
    Object v4 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v3).intValue()));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = ((java.lang.Class)v5).isLocalClass();
    Object v7 = "' from Class '";
    Object v8 = "";
    Object v9 = new java.lang.Object[]{};
    Object v10 = ((com.fasterxml.jackson.databind.DeserializationContext)v2).handleWeirdStringValue(((java.lang.Class)v5),((java.lang.String)v7),((java.lang.String)v8),((java.lang.Object[])v9));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = ((com.fasterxml.jackson.databind.DeserializationContext)v2).leaseObjectBuffer();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = 0;
    Object v4 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v3).intValue()));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = 0;
    Object v7 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v6).intValue()));
    Object v8 = 0;
    Object v9 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v8).intValue()));
    Object v10 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v5),((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.JavaType)v9));
    Object v11 = "overflow,7 value cannot be represented as 16-bit value";
    Object v12 = new java.lang.Object[]{};
    Object v13 = ((com.fasterxml.jackson.databind.DeserializationContext)v2).reportInputMismatch(((com.fasterxml.jackson.databind.JavaType)v10),((java.lang.String)v11),((java.lang.Object[])v12));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.exc.MismatchedInputException");
    } catch (com.fasterxml.jackson.databind.exc.MismatchedInputException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v4 = 0;
    Object v5 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v4).intValue()));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = 0;
    Object v8 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v7).intValue()));
    Object v9 = 0;
    Object v10 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v6),((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = 0;
    Object v13 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v12).intValue()));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = new java.lang.Class[]{};
    Object v16 = ((java.lang.Class)v14).getDeclaredConstructor(((java.lang.Class[])v15));
    Object v17 = ((com.fasterxml.jackson.databind.DatabindContext)v3).constructSpecializedType(((com.fasterxml.jackson.databind.JavaType)v11),((java.lang.Class)v14));
    Object v18 = new java.lang.Object[]{null,null,null};
    Object v19 = com.fasterxml.jackson.databind.util.ArrayBuilders.arrayToSet(((java.lang.Object[])v18));
    Object v20 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v21 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v22 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v21));
    Object v23 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v24 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v23));
    Object v25 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v26 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v25));
    Object v27 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v26));
    Object v28 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v22),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v24),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v27));
    Object v29 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v20),((com.fasterxml.jackson.core.ObjectCodec)v28));
    Object v30 = ((com.fasterxml.jackson.databind.DeserializationContext)v2).handleWeirdNativeValue(((com.fasterxml.jackson.databind.JavaType)v17),((java.lang.Object)v19),((com.fasterxml.jackson.core.JsonParser)v29));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = com.fasterxml.jackson.databind.DeserializationFeature.READ_DATE_TIMESTAMPS_AS_NANOSECONDS;
    Object v4 = ((java.lang.Enum)v3).getDeclaringClass();
    Object v5 = ((com.fasterxml.jackson.databind.DeserializationContext)v2).isEnabled(((com.fasterxml.jackson.databind.DeserializationFeature)v3));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v4 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v4));
    Object v6 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v7 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v7),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v10));
    Object v12 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v3),((com.fasterxml.jackson.core.ObjectCodec)v11));
    Object v13 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
    Object v14 = "";
    Object v15 = ((com.fasterxml.jackson.databind.DeserializationContext)v2).wrongTokenException(((com.fasterxml.jackson.core.JsonParser)v12),((com.fasterxml.jackson.core.JsonToken)v13),((java.lang.String)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v17 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v18 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v16),((com.fasterxml.jackson.databind.type.TypeBindings)v17));
    Object v19 = " ";
    Object v20 = 0;
    Object v21 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v20).intValue()));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v21));
    Object v23 = Byte.valueOf((byte)0);
    Object v24 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer(((java.lang.Class)v22),((java.lang.Byte)v23));
    ((com.fasterxml.jackson.databind.DeserializationContext)v2).reportUnknownProperty(((java.lang.Object)v18),((java.lang.String)v19),((com.fasterxml.jackson.databind.JsonDeserializer)v24));
    Object v25 = null;
    org.junit.Assert.assertNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v0));
    Object v2 = 0;
    Object v3 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v2).intValue()));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = 0;
    Object v6 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v5).intValue()));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = ((java.lang.Class)v4).isNestmateOf(((java.lang.Class)v7));
    Object v9 = ")";
    Object v10 = ((com.fasterxml.jackson.databind.DatabindContext)v1).reportBadDefinition(((java.lang.Class)v4),((java.lang.String)v9));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = 0;
    Object v4 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v3).intValue()));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v8 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v7));
    Object v9 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v8));
    Object v10 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v11 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v12 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v11));
    Object v13 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v14 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v13));
    Object v15 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v16 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v15));
    Object v17 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v16));
    Object v18 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v12),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v14),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v17));
    Object v19 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v10),((com.fasterxml.jackson.core.ObjectCodec)v18));
    Object v20 = 0;
    Object v21 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v20).intValue()));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v21));
    Object v23 = ((java.lang.Class)v22).getPackageName();
    Object v24 = com.fasterxml.jackson.core.JsonToken.START_ARRAY;
    Object v25 = "7";
    Object v26 = ((com.fasterxml.jackson.databind.DeserializationContext)v9).wrongTokenException(((com.fasterxml.jackson.core.JsonParser)v19),((java.lang.Class)v22),((com.fasterxml.jackson.core.JsonToken)v24),((java.lang.String)v25));
    Object v27 = ((com.fasterxml.jackson.databind.DeserializationContext)v2).handleInstantiationProblem(((java.lang.Class)v5),((java.lang.Object)v6),((java.lang.Throwable)v26));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = 0;
    Object v2 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v1).intValue()));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = 0;
    Object v5 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v4).intValue()));
    Object v6 = 0;
    Object v7 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v6).intValue()));
    Object v8 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = ((com.fasterxml.jackson.databind.DatabindContext)v0).constructType(((java.lang.reflect.Type)v8));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v4 = 0;
    Object v5 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v4).intValue()));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = 0;
    Object v8 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v7).intValue()));
    Object v9 = 0;
    Object v10 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v6),((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = 0;
    Object v13 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v12).intValue()));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = ((com.fasterxml.jackson.databind.DatabindContext)v3).constructSpecializedType(((com.fasterxml.jackson.databind.JavaType)v11),((java.lang.Class)v14));
    Object v16 = ((com.fasterxml.jackson.databind.DeserializationContext)v2).findRootValueDeserializer(((com.fasterxml.jackson.databind.JavaType)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = 0;
    Object v4 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v3).intValue()));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = ((java.lang.Class)v5).getEnclosingConstructor();
    Object v7 = 0;
    Object v8 = "Ignored field \"%s\" (clas";
    Object v9 = new java.lang.Object[]{};
    Object v10 = ((com.fasterxml.jackson.databind.DeserializationContext)v2).handleWeirdNumberValue(((java.lang.Class)v5),((java.lang.Number)v7),((java.lang.String)v8),((java.lang.Object[])v9));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v4 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v4));
    Object v6 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v7 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v7),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v10));
    Object v12 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v3),((com.fasterxml.jackson.core.ObjectCodec)v11));
    Object v13 = 0;
    Object v14 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v13).intValue()));
    Object v15 = ((com.fasterxml.jackson.databind.DeserializationContext)v2).readValue(((com.fasterxml.jackson.core.JsonParser)v12),((com.fasterxml.jackson.databind.JavaType)v14));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = 0;
    Object v4 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v3).intValue()));
    Object v5 = "methodName";
    Object v6 = ((com.fasterxml.jackson.databind.DeserializationContext)v2).missingTypeIdException(((com.fasterxml.jackson.databind.JavaType)v4),((java.lang.String)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = com.fasterxml.jackson.databind.DeserializationFeature.ACCEPT_FLOAT_AS_INT;
    Object v4 = ((com.fasterxml.jackson.databind.DeserializationContext)v2).isEnabled(((com.fasterxml.jackson.databind.DeserializationFeature)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = 0;
    Object v4 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v3).intValue()));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = 0;
    Object v7 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v6).intValue()));
    Object v8 = 0;
    Object v9 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v8).intValue()));
    Object v10 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v5),((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.JavaType)v9));
    Object v11 = 0;
    Object v12 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v11).intValue()));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v14 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.type.TypeFactory)v13));
    Object v15 = "";
    Object v16 = false;
    Object v17 = 0;
    Object v18 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v17).intValue()));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = 0;
    Object v21 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v20).intValue()));
    Object v22 = 0;
    Object v23 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v22).intValue()));
    Object v24 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v19),((com.fasterxml.jackson.databind.JavaType)v21),((com.fasterxml.jackson.databind.JavaType)v23));
    Object v25 = new com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v10),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v14),((java.lang.String)v15),(((java.lang.Boolean)v16).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v24));
    Object v26 = 0;
    Object v27 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v26).intValue()));
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v27));
    Object v29 = ((com.fasterxml.jackson.databind.DeserializationContext)v2).weirdNativeValueException(((java.lang.Object)v25),((java.lang.Class)v28));
    Object v30 = 0;
    Object v31 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v30).intValue()));
    Object v32 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v31));
    Object v33 = "N/A";
    Object v34 = new java.lang.Object[]{};
    Object v35 = ((com.fasterxml.jackson.databind.DeserializationContext)v2).reportInputMismatch(((java.lang.Class)v32),((java.lang.String)v33),((java.lang.Object[])v34));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.exc.MismatchedInputException");
    } catch (com.fasterxml.jackson.databind.exc.MismatchedInputException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = 0;
    Object v4 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v3).intValue()));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = 1;
    Object v7 = ")";
    Object v8 = new java.lang.Object[]{null,null};
    Object v9 = ((com.fasterxml.jackson.databind.DeserializationContext)v2).handleWeirdNumberValue(((java.lang.Class)v5),((java.lang.Number)v6),((java.lang.String)v7),((java.lang.Object[])v8));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v3 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v2));
    Object v4 = 0;
    Object v5 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v4).intValue()));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = "string";
    Object v8 = 0;
    Object v9 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v8).intValue()));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = 0;
    Object v12 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v11).intValue()));
    Object v13 = 0;
    Object v14 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v13).intValue()));
    Object v15 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v10),((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.JavaType)v14));
    Object v16 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v3),((java.lang.Class)v6),((java.lang.String)v7),((com.fasterxml.jackson.databind.JavaType)v15));
    Object v17 = "array";
    Object v18 = "Not a sbtype";
    Object v19 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v17),((java.lang.String)v18));
    Object v20 = 0;
    Object v21 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v20).intValue()));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v21));
    Object v23 = 0;
    Object v24 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v23).intValue()));
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v24));
    Object v26 = 0;
    Object v27 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v26).intValue()));
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v27));
    Object v29 = new com.fasterxml.jackson.databind.introspect.ObjectIdInfo(((com.fasterxml.jackson.databind.PropertyName)v19),((java.lang.Class)v22),((java.lang.Class)v25),((java.lang.Class)v28));
    Object v30 = true;
    Object v31 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v29).withAlwaysAsId((((java.lang.Boolean)v30).booleanValue()));
    Object v32 = ((com.fasterxml.jackson.databind.DatabindContext)v0).objectIdResolverInstance(((com.fasterxml.jackson.databind.introspect.Annotated)v16),((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v29));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = 0;
    Object v4 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v3).intValue()));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = "via method ";
    Object v7 = "]";
    Object v8 = new java.lang.Object[]{null};
    Object v9 = ((com.fasterxml.jackson.databind.DeserializationContext)v2).handleWeirdStringValue(((java.lang.Class)v5),((java.lang.String)v6),((java.lang.String)v7),((java.lang.Object[])v8));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = ((com.fasterxml.jackson.databind.DeserializationContext)v2).getTimeZone();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = 0;
    Object v4 = ((com.fasterxml.jackson.databind.DeserializationContext)v2).hasSomeOfFeatures((((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = 0;
    Object v4 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v3).intValue()));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT;
    Object v7 = ((java.lang.Enum)v6).getDeclaringClass();
    Object v8 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v9 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v10 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v9));
    Object v11 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v12 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v11));
    Object v13 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v14 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v14));
    Object v16 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v10),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v12),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v15));
    Object v17 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v8),((com.fasterxml.jackson.core.ObjectCodec)v16));
    Object v18 = "rying to resolve a forward reference with id [";
    Object v19 = new java.lang.Object[]{null,null};
    Object v20 = ((com.fasterxml.jackson.databind.DeserializationContext)v2).handleUnexpectedToken(((java.lang.Class)v5),((com.fasterxml.jackson.core.JsonToken)v6),((com.fasterxml.jackson.core.JsonParser)v17),((java.lang.String)v18),((java.lang.Object[])v19));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = ((com.fasterxml.jackson.databind.DatabindContext)v0).getConfig();
    Object v2 = 0;
    Object v3 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v2).intValue()));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = 0;
    Object v6 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v5).intValue()));
    Object v7 = 0;
    Object v8 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v7).intValue()));
    Object v9 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v4),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType)v8));
    Object v10 = ((com.fasterxml.jackson.databind.DatabindContext)v0).constructType(((java.lang.reflect.Type)v9));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = 0;
    Object v4 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v3).intValue()));
    Object v5 = 0;
    Object v6 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v5).intValue()));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v8 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.type.TypeFactory)v7));
    Object v9 = ")tems";
    Object v10 = ((com.fasterxml.jackson.databind.DeserializationContext)v2).handleMissingTypeId(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v8),((java.lang.String)v9));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v4 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v4));
    Object v6 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v7 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v7),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v10));
    Object v12 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v3),((com.fasterxml.jackson.core.ObjectCodec)v11));
    Object v13 = 0;
    Object v14 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v13).intValue()));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v14));
    Object v16 = 0;
    Object v17 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v16).intValue()));
    Object v18 = 0;
    Object v19 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v18).intValue()));
    Object v20 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v15),((com.fasterxml.jackson.databind.JavaType)v17),((com.fasterxml.jackson.databind.JavaType)v19));
    Object v21 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL;
    Object v22 = "";
    Object v23 = ((com.fasterxml.jackson.databind.DeserializationContext)v2).wrongTokenException(((com.fasterxml.jackson.core.JsonParser)v12),((com.fasterxml.jackson.databind.JavaType)v20),((com.fasterxml.jackson.core.JsonToken)v21),((java.lang.String)v22));
    Object v24 = 0;
    Object v25 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v24).intValue()));
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v25));
    Object v27 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v26));
    Object v28 = "JsonNode not of type OkbjectNode (but ";
    Object v29 = 0;
    Object v30 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v29).intValue()));
    Object v31 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v30));
    Object v32 = Byte.valueOf((byte)0);
    Object v33 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer(((java.lang.Class)v31),((java.lang.Byte)v32));
    ((com.fasterxml.jackson.databind.DeserializationContext)v2).reportUnknownProperty(((java.lang.Object)v27),((java.lang.String)v28),((com.fasterxml.jackson.databind.JsonDeserializer)v33));
    Object v34 = null;
    org.junit.Assert.assertNull(v34);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = ", ";
    Object v4 = new java.lang.Object[]{null,null,null};
    Object v5 = ((com.fasterxml.jackson.databind.DeserializationContext)v2).mappingException(((java.lang.String)v3),((java.lang.Object[])v4));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v7));
    Object v9 = ((com.fasterxml.jackson.databind.DeserializationContext)v8).leaseObjectBuffer();
    ((com.fasterxml.jackson.databind.DeserializationContext)v2).returnObjectBuffer(((com.fasterxml.jackson.databind.util.ObjectBuffer)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v4 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v4));
    Object v6 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v7 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v7),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v10));
    Object v12 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v3),((com.fasterxml.jackson.core.ObjectCodec)v11));
    Object v13 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v14 = 0;
    Object v15 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v14).intValue()));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = 0;
    Object v18 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v17).intValue()));
    Object v19 = 0;
    Object v20 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v19).intValue()));
    Object v21 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v16),((com.fasterxml.jackson.databind.JavaType)v18),((com.fasterxml.jackson.databind.JavaType)v20));
    Object v22 = 0;
    Object v23 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v22).intValue()));
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v23));
    Object v25 = ((com.fasterxml.jackson.databind.DatabindContext)v13).constructSpecializedType(((com.fasterxml.jackson.databind.JavaType)v21),((java.lang.Class)v24));
    Object v26 = ((com.fasterxml.jackson.databind.DeserializationContext)v2).readValue(((com.fasterxml.jackson.core.JsonParser)v12),((com.fasterxml.jackson.databind.JavaType)v25));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = ((com.fasterxml.jackson.databind.DeserializationContext)v2).getArrayBuilders();
    Object v4 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v5 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v6 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v7));
    Object v9 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v10 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v10));
    Object v12 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v6),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v8),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v11));
    Object v13 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v4),((com.fasterxml.jackson.core.ObjectCodec)v12));
    Object v14 = "Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingDelegate()', but null forc'getDelegateType()'";
    Object v15 = com.fasterxml.jackson.databind.util.ClassUtil.backticked(((java.lang.String)v14));
    Object v16 = new com.fasterxml.jackson.core.util.RequestPayload(((java.lang.CharSequence)v15));
    ((com.fasterxml.jackson.core.JsonParser)v13).setRequestPayloadOnError(((com.fasterxml.jackson.core.util.RequestPayload)v16));
    Object v17 = null;
    Object v18 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v19 = 0;
    Object v20 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v19).intValue()));
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = 0;
    Object v23 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v22).intValue()));
    Object v24 = 0;
    Object v25 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v24).intValue()));
    Object v26 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v21),((com.fasterxml.jackson.databind.JavaType)v23),((com.fasterxml.jackson.databind.JavaType)v25));
    Object v27 = 0;
    Object v28 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v27).intValue()));
    Object v29 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v28));
    Object v30 = new java.lang.Class[]{};
    Object v31 = ((java.lang.Class)v29).getDeclaredConstructor(((java.lang.Class[])v30));
    Object v32 = ((com.fasterxml.jackson.databind.DatabindContext)v18).constructSpecializedType(((com.fasterxml.jackson.databind.JavaType)v26),((java.lang.Class)v29));
    Object v33 = com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT;
    Object v34 = "strinW";
    Object v35 = ((com.fasterxml.jackson.databind.DeserializationContext)v2).wrongTokenException(((com.fasterxml.jackson.core.JsonParser)v13),((com.fasterxml.jackson.databind.JavaType)v32),((com.fasterxml.jackson.core.JsonToken)v33),((java.lang.String)v34));
    org.junit.Assert.assertNotNull(v35);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = 1;
    Object v4 = ((com.fasterxml.jackson.databind.DeserializationContext)v2).hasSomeOfFeatures((((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v4 = 0;
    Object v5 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v4).intValue()));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = 0;
    Object v8 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v7).intValue()));
    Object v9 = 0;
    Object v10 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v6),((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = 0;
    Object v13 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v12).intValue()));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = ((com.fasterxml.jackson.databind.DatabindContext)v3).constructSpecializedType(((com.fasterxml.jackson.databind.JavaType)v11),((java.lang.Class)v14));
    Object v16 = "";
    Object v17 = "nmber";
    Object v18 = ((com.fasterxml.jackson.databind.DeserializationContext)v2).unknownTypeException(((com.fasterxml.jackson.databind.JavaType)v15),((java.lang.String)v16),((java.lang.String)v17));
    Object v19 = com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_NUMBERS_FOR_ENUMS;
    Object v20 = ((com.fasterxml.jackson.databind.DeserializationContext)v2).isEnabled(((com.fasterxml.jackson.databind.DeserializationFeature)v19));
    org.junit.Assert.assertEquals((Object)(false), v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = 0;
    Object v4 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v3).intValue()));
    Object v5 = new java.lang.Object[]{null,null,null};
    Object v6 = com.fasterxml.jackson.databind.util.ArrayBuilders.arrayToSet(((java.lang.Object[])v5));
    Object v7 = new java.util.concurrent.atomic.AtomicReference(((java.lang.Object)v6));
    Object v8 = ((com.fasterxml.jackson.databind.DeserializationContext)v2).hasValueDeserializerFor(((com.fasterxml.jackson.databind.JavaType)v4),((java.util.concurrent.atomic.AtomicReference)v7));
    Object v9 = 0;
    Object v10 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = null;
    Object v13 = 0;
    Object v14 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v13).intValue()));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v12),((java.lang.Class)v15));
    Object v17 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v18 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v19 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v18));
    Object v20 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v21 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v20));
    Object v22 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v23 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v22));
    Object v24 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v23));
    Object v25 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v19),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v21),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v24));
    Object v26 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v17),((com.fasterxml.jackson.core.ObjectCodec)v25));
    Object v27 = "[null];";
    Object v28 = new java.lang.Object[]{null,null,null};
    Object v29 = ((com.fasterxml.jackson.databind.DeserializationContext)v2).handleMissingInstantiator(((java.lang.Class)v11),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v16),((com.fasterxml.jackson.core.JsonParser)v26),((java.lang.String)v27),((java.lang.Object[])v28));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    ((com.fasterxml.jackson.databind.DeserializationContext)v2).checkUnresolvedObjectId();
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = 0;
    Object v4 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v3).intValue()));
    Object v5 = "IGNORE_DUPLICATE_MODULE_REGSTRATIONS";
    Object v6 = ((com.fasterxml.jackson.databind.DeserializationContext)v2).reportBadDefinition(((com.fasterxml.jackson.databind.JavaType)v4),((java.lang.String)v5));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.exc.InvalidDefinitionException");
    } catch (com.fasterxml.jackson.databind.exc.InvalidDefinitionException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = "[constrKuctor for ";
    Object v5 = 0;
    Object v6 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v5).intValue()));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = Byte.valueOf((byte)0);
    Object v9 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer(((java.lang.Class)v7),((java.lang.Byte)v8));
    ((com.fasterxml.jackson.databind.DeserializationContext)v2).reportUnknownProperty(((java.lang.Object)v3),((java.lang.String)v4),((com.fasterxml.jackson.databind.JsonDeserializer)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = 0;
    Object v4 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v3).intValue()));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = "]{";
    Object v7 = ((java.lang.Class)v5).getResourceAsStream(((java.lang.String)v6));
    Object v8 = null;
    Object v9 = 0;
    Object v10 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v8),((java.lang.Class)v11));
    Object v13 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v14 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v15 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v14));
    Object v16 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v17 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v16));
    Object v18 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v19 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v18));
    Object v20 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v19));
    Object v21 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v15),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v17),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v20));
    Object v22 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v13),((com.fasterxml.jackson.core.ObjectCodec)v21));
    Object v23 = "null";
    Object v24 = new java.lang.Object[]{};
    Object v25 = ((com.fasterxml.jackson.databind.DeserializationContext)v2).handleMissingInstantiator(((java.lang.Class)v5),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v12),((com.fasterxml.jackson.core.JsonParser)v22),((java.lang.String)v23),((java.lang.Object[])v24));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v4 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v3));
    Object v5 = 0;
    Object v6 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v5).intValue()));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = "string";
    Object v9 = 0;
    Object v10 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = 0;
    Object v13 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v12).intValue()));
    Object v14 = 0;
    Object v15 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v14).intValue()));
    Object v16 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v11),((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.JavaType)v15));
    Object v17 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v4),((java.lang.Class)v7),((java.lang.String)v8),((com.fasterxml.jackson.databind.JavaType)v16));
    Object v18 = "array";
    Object v19 = "Not a sbtype";
    Object v20 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v18),((java.lang.String)v19));
    Object v21 = 0;
    Object v22 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v21).intValue()));
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v22));
    Object v24 = 0;
    Object v25 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v24).intValue()));
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v25));
    Object v27 = 0;
    Object v28 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v27).intValue()));
    Object v29 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v28));
    Object v30 = new com.fasterxml.jackson.databind.introspect.ObjectIdInfo(((com.fasterxml.jackson.databind.PropertyName)v20),((java.lang.Class)v23),((java.lang.Class)v26),((java.lang.Class)v29));
    Object v31 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v30).toString();
    Object v32 = ((com.fasterxml.jackson.databind.DatabindContext)v1).objectIdGeneratorInstance(((com.fasterxml.jackson.databind.introspect.Annotated)v17),((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v30));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = 0;
    Object v4 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v3).intValue()));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = new java.lang.Object[]{null,null,null};
    Object v7 = com.fasterxml.jackson.databind.util.ArrayBuilders.arrayToSet(((java.lang.Object[])v6));
    Object v8 = ((com.fasterxml.jackson.databind.DeserializationContext)v2)._isCompatible(((java.lang.Class)v5),((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)(true), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = 0;
    Object v4 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v3).intValue()));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = null;
    Object v7 = 0;
    Object v8 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v7).intValue()));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v6),((java.lang.Class)v9));
    Object v11 = ((com.fasterxml.jackson.databind.deser.ValueInstantiator)v10).getValueTypeDesc();
    Object v12 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v13 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v14 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v13));
    Object v15 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v16 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v15));
    Object v17 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v18 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v17));
    Object v19 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v18));
    Object v20 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v14),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v16),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v19));
    Object v21 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v12),((com.fasterxml.jackson.core.ObjectCodec)v20));
    Object v22 = "string";
    Object v23 = new java.lang.Object[]{null,null,null};
    Object v24 = ((com.fasterxml.jackson.databind.DeserializationContext)v2).handleMissingInstantiator(((java.lang.Class)v5),((com.fasterxml.jackson.databind.deser.ValueInstantiator)v10),((com.fasterxml.jackson.core.JsonParser)v21),((java.lang.String)v22),((java.lang.Object[])v23));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = 0;
    Object v4 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v3).intValue()));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = ((com.fasterxml.jackson.databind.DeserializationContext)v2).constructType(((java.lang.Class)v5));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = 0;
    Object v4 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v3).intValue()));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = false;
    Object v7 = "]";
    Object v8 = 26;
    Object v9 = "";
    Object v10 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v6).booleanValue()),((java.lang.String)v7),((java.lang.Integer)v8),((java.lang.String)v9));
    Object v11 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v12 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v11));
    Object v13 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v12));
    Object v14 = 0;
    Object v15 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v14).intValue()));
    Object v16 = "methodName";
    Object v17 = ((com.fasterxml.jackson.databind.DeserializationContext)v13).missingTypeIdException(((com.fasterxml.jackson.databind.JavaType)v15),((java.lang.String)v16));
    Object v18 = ((com.fasterxml.jackson.databind.DeserializationContext)v2).handleInstantiationProblem(((java.lang.Class)v5),((java.lang.Object)v10),((java.lang.Throwable)v17));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = 0;
    Object v4 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v3).intValue()));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = 0;
    Object v7 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v6).intValue()));
    Object v8 = 0;
    Object v9 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v8).intValue()));
    Object v10 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v5),((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.JavaType)v9));
    Object v11 = "CAN_OVERRIDE_ACCESS_MODIFIERS";
    Object v12 = ((com.fasterxml.jackson.databind.DeserializationContext)v2).missingTypeIdException(((com.fasterxml.jackson.databind.JavaType)v10),((java.lang.String)v11));
    Object v13 = ((com.fasterxml.jackson.databind.DeserializationContext)v2).getParser();
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v4 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v4));
    Object v6 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v7 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v7),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v10));
    Object v12 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v3),((com.fasterxml.jackson.core.ObjectCodec)v11));
    Object v13 = 0;
    Object v14 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v13).intValue()));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v14));
    Object v16 = com.fasterxml.jackson.core.JsonToken.VALUE_FALSE;
    Object v17 = "item=s";
    Object v18 = ((com.fasterxml.jackson.databind.DeserializationContext)v2).wrongTokenException(((com.fasterxml.jackson.core.JsonParser)v12),((java.lang.Class)v15),((com.fasterxml.jackson.core.JsonToken)v16),((java.lang.String)v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v20 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v21 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v19),((com.fasterxml.jackson.databind.type.TypeBindings)v20));
    Object v22 = 0;
    Object v23 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v22).intValue()));
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v23));
    Object v25 = "string";
    Object v26 = 0;
    Object v27 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v26).intValue()));
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v27));
    Object v29 = 0;
    Object v30 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v29).intValue()));
    Object v31 = 0;
    Object v32 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v31).intValue()));
    Object v33 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v28),((com.fasterxml.jackson.databind.JavaType)v30),((com.fasterxml.jackson.databind.JavaType)v32));
    Object v34 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v21),((java.lang.Class)v24),((java.lang.String)v25),((com.fasterxml.jackson.databind.JavaType)v33));
    Object v35 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor.Base();
    Object v36 = ((com.fasterxml.jackson.databind.DeserializationContext)v2).keyDeserializerInstance(((com.fasterxml.jackson.databind.introspect.Annotated)v34),((java.lang.Object)v35));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = 0;
    Object v4 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v3).intValue()));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
    Object v7 = ((java.lang.Enum)v6).getDeclaringClass();
    Object v8 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v9 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v10 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v9));
    Object v11 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v12 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v11));
    Object v13 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v14 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v14));
    Object v16 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v10),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v12),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v15));
    Object v17 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v8),((com.fasterxml.jackson.core.ObjectCodec)v16));
    Object v18 = "a";
    Object v19 = new java.lang.Object[]{};
    Object v20 = ((com.fasterxml.jackson.databind.DeserializationContext)v2).handleUnexpectedToken(((java.lang.Class)v5),((com.fasterxml.jackson.core.JsonToken)v6),((com.fasterxml.jackson.core.JsonParser)v17),((java.lang.String)v18),((java.lang.Object[])v19));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = ((com.fasterxml.jackson.databind.DeserializationContext)v5).leaseObjectBuffer();
    ((com.fasterxml.jackson.databind.DeserializationContext)v2).returnObjectBuffer(((com.fasterxml.jackson.databind.util.ObjectBuffer)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = 0;
    Object v4 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v3).intValue()));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = 0;
    Object v7 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v6).intValue()));
    Object v8 = 0;
    Object v9 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v8).intValue()));
    Object v10 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v5),((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.JavaType)v9));
    Object v11 = new java.lang.Object[]{null,null,null};
    Object v12 = com.fasterxml.jackson.databind.util.ArrayBuilders.arrayToSet(((java.lang.Object[])v11));
    Object v13 = new java.util.concurrent.atomic.AtomicReference(((java.lang.Object)v12));
    Object v14 = com.fasterxml.jackson.databind.introspect.AnnotationCollector.emptyAnnotations();
    ((java.util.concurrent.atomic.AtomicReference)v13).lazySet(((java.lang.Object)v14));
    Object v15 = null;
    Object v16 = ((com.fasterxml.jackson.databind.DeserializationContext)v2).hasValueDeserializerFor(((com.fasterxml.jackson.databind.JavaType)v10),((java.util.concurrent.atomic.AtomicReference)v13));
    org.junit.Assert.assertEquals((Object)(false), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = ((com.fasterxml.jackson.databind.DeserializationContext)v2).getTypeFactory();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v4 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v5 = new com.fasterxml.jackson.databind.MappingJsonFactory(((com.fasterxml.jackson.databind.ObjectMapper)v4));
    Object v6 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v7 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = new com.fasterxml.jackson.databind.ObjectMapper(((com.fasterxml.jackson.core.JsonFactory)v5),((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider)v7),((com.fasterxml.jackson.databind.deser.DefaultDeserializationContext)v10));
    Object v12 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v3),((com.fasterxml.jackson.core.ObjectCodec)v11));
    Object v13 = 0;
    Object v14 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v13).intValue()));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v14));
    Object v16 = Byte.valueOf((byte)0);
    Object v17 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer(((java.lang.Class)v15),((java.lang.Byte)v16));
    Object v18 = "Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingDelegate()', but null forc'getDelegateType()'";
    Object v19 = com.fasterxml.jackson.databind.util.ClassUtil.backticked(((java.lang.String)v18));
    Object v20 = "byte";
    Object v21 = ((com.fasterxml.jackson.databind.DeserializationContext)v2).handleUnknownProperty(((com.fasterxml.jackson.core.JsonParser)v12),((com.fasterxml.jackson.databind.JsonDeserializer)v17),((java.lang.Object)v19),((java.lang.String)v20));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = 0;
    Object v4 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v3).intValue()));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = ((java.lang.Class)v5).getModifiers();
    Object v7 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL;
    Object v8 = ((java.lang.Enum)v7).getDeclaringClass();
    Object v9 = "false";
    Object v10 = new java.lang.Object[]{null,null,null};
    ((com.fasterxml.jackson.databind.DeserializationContext)v2).reportWrongTokenException(((java.lang.Class)v5),((com.fasterxml.jackson.core.JsonToken)v7),((java.lang.String)v9),((java.lang.Object[])v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v4 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v5 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v3),((com.fasterxml.jackson.databind.type.TypeBindings)v4));
    Object v6 = 0;
    Object v7 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v6).intValue()));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = "string";
    Object v10 = 0;
    Object v11 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v10).intValue()));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = 0;
    Object v14 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v13).intValue()));
    Object v15 = 0;
    Object v16 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v15).intValue()));
    Object v17 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v12),((com.fasterxml.jackson.databind.JavaType)v14),((com.fasterxml.jackson.databind.JavaType)v16));
    Object v18 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v5),((java.lang.Class)v8),((java.lang.String)v9),((com.fasterxml.jackson.databind.JavaType)v17));
    Object v19 = "array";
    Object v20 = "Not a sbtype";
    Object v21 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v19),((java.lang.String)v20));
    Object v22 = 0;
    Object v23 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v22).intValue()));
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v23));
    Object v25 = 0;
    Object v26 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v25).intValue()));
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v26));
    Object v28 = 0;
    Object v29 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v28).intValue()));
    Object v30 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v29));
    Object v31 = new com.fasterxml.jackson.databind.introspect.ObjectIdInfo(((com.fasterxml.jackson.databind.PropertyName)v21),((java.lang.Class)v24),((java.lang.Class)v27),((java.lang.Class)v30));
    Object v32 = ((com.fasterxml.jackson.databind.DatabindContext)v2).objectIdGeneratorInstance(((com.fasterxml.jackson.databind.introspect.Annotated)v18),((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v31));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = "array";
    Object v4 = "Not a sbtype";
    Object v5 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = 0;
    Object v7 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v6).intValue()));
    Object v8 = "array";
    Object v9 = "Not a sbtype";
    Object v10 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v12 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v13 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v11),((com.fasterxml.jackson.databind.type.TypeBindings)v12));
    Object v14 = 0;
    Object v15 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v14).intValue()));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = "string";
    Object v18 = 0;
    Object v19 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v18).intValue()));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v19));
    Object v21 = 0;
    Object v22 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v21).intValue()));
    Object v23 = 0;
    Object v24 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v23).intValue()));
    Object v25 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v20),((com.fasterxml.jackson.databind.JavaType)v22),((com.fasterxml.jackson.databind.JavaType)v24));
    Object v26 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v13),((java.lang.Class)v16),((java.lang.String)v17),((com.fasterxml.jackson.databind.JavaType)v25));
    Object v27 = false;
    Object v28 = "]";
    Object v29 = 26;
    Object v30 = "";
    Object v31 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v27).booleanValue()),((java.lang.String)v28),((java.lang.Integer)v29),((java.lang.String)v30));
    Object v32 = new com.fasterxml.jackson.databind.BeanProperty.Std(((com.fasterxml.jackson.databind.PropertyName)v5),((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.PropertyName)v10),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v26),((com.fasterxml.jackson.databind.PropertyMetadata)v31));
    Object v33 = "";
    Object v34 = new java.lang.Object[]{null,null};
    Object v35 = ((com.fasterxml.jackson.databind.DeserializationContext)v2).reportInputMismatch(((com.fasterxml.jackson.databind.BeanProperty)v32),((java.lang.String)v33),((java.lang.Object[])v34));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.exc.MismatchedInputException");
    } catch (com.fasterxml.jackson.databind.exc.MismatchedInputException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = ((com.fasterxml.jackson.databind.DeserializationContext)v2).leaseObjectBuffer();
    ((com.fasterxml.jackson.databind.DeserializationContext)v2).checkUnresolvedObjectId();
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = "Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingDelegate()', but null forc'getDelegateType()'";
    Object v4 = com.fasterxml.jackson.databind.util.ClassUtil.backticked(((java.lang.String)v3));
    Object v5 = "strinhg";
    Object v6 = 0;
    Object v7 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v6).intValue()));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = Byte.valueOf((byte)0);
    Object v10 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer(((java.lang.Class)v8),((java.lang.Byte)v9));
    ((com.fasterxml.jackson.databind.DeserializationContext)v2).reportUnknownProperty(((java.lang.Object)v4),((java.lang.String)v5),((com.fasterxml.jackson.databind.JsonDeserializer)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = 0;
    Object v4 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v3).intValue()));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = Byte.valueOf((byte)0);
    Object v7 = new com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer(((java.lang.Class)v5),((java.lang.Byte)v6));
    Object v8 = ((com.fasterxml.jackson.databind.DeserializationContext)v2).reportBadMerge(((com.fasterxml.jackson.databind.JsonDeserializer)v7));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }
}
