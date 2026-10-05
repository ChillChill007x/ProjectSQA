package com.fasterxml.jackson.databind.deser;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v7));
    Object v9 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v10 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v9));
    Object v11 = com.fasterxml.jackson.core.JsonToken.END_OBJECT;
    Object v12 = "2";
    Object v13 = ((com.fasterxml.jackson.databind.DeserializationContext)v8).wrongTokenException(((com.fasterxml.jackson.core.JsonParser)v10),((com.fasterxml.jackson.core.JsonToken)v11),((java.lang.String)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = null;
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v16),((com.fasterxml.jackson.databind.JavaType)v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v19));
    Object v21 = null;
    Object v22 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v20),((com.fasterxml.jackson.databind.cfg.MapperConfig)v21));
    Object v23 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v15),((com.fasterxml.jackson.databind.JavaType)v18),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v22));
    Object v24 = ((com.fasterxml.jackson.databind.BeanDescription)v23).findAnySetter();
    Object v25 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).findDefaultDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v8),((com.fasterxml.jackson.databind.JavaType)v14),((com.fasterxml.jackson.databind.BeanDescription)v23));
    org.junit.Assert.assertNotNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers();
    Object v3 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = "string";
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = "declaring";
    Object v11 = ((com.fasterxml.jackson.databind.DeserializationContext)v6).weirdStringException(((java.lang.String)v7),((java.lang.Class)v9),((java.lang.String)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.JavaType)v13));
    Object v15 = null;
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v16),((com.fasterxml.jackson.databind.JavaType)v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v19));
    Object v21 = null;
    Object v22 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v20),((com.fasterxml.jackson.databind.cfg.MapperConfig)v21));
    Object v23 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v15),((com.fasterxml.jackson.databind.JavaType)v18),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v22));
    Object v24 = ((com.fasterxml.jackson.databind.BeanDescription)v23).findBackReferenceProperties();
    Object v25 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v1).createReferenceDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v6),((com.fasterxml.jackson.databind.type.ReferenceType)v14),((com.fasterxml.jackson.databind.BeanDescription)v23));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v6 = new com.fasterxml.jackson.databind.ext.CoreXMLDeserializers();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).withAdditionalDeserializers(((com.fasterxml.jackson.databind.deser.Deserializers)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = ((com.fasterxml.jackson.databind.DeserializationContext)v10).leaseObjectBuffer();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v16 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v14),((com.fasterxml.jackson.databind.JavaType[])v15));
    Object v17 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.type.TypeBindings)v16));
    Object v18 = ((com.fasterxml.jackson.databind.type.ArrayType)v17).hasGenericTypes();
    Object v19 = null;
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v20),((com.fasterxml.jackson.databind.JavaType)v21));
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v23));
    Object v25 = null;
    Object v26 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v24),((com.fasterxml.jackson.databind.cfg.MapperConfig)v25));
    Object v27 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v19),((com.fasterxml.jackson.databind.JavaType)v22),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v26));
    Object v28 = ((com.fasterxml.jackson.databind.BeanDescription)v27).findAnySetter();
    Object v29 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).createArrayDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v10),((com.fasterxml.jackson.databind.type.ArrayType)v17),((com.fasterxml.jackson.databind.BeanDescription)v27));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v14 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v12),((com.fasterxml.jackson.databind.JavaType[])v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.JavaType)v16));
    Object v18 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.JavaType)v20));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v10),((com.fasterxml.jackson.databind.type.TypeBindings)v14),((com.fasterxml.jackson.databind.JavaType)v17),((com.fasterxml.jackson.databind.JavaType[])v18),((com.fasterxml.jackson.databind.JavaType)v21),((com.fasterxml.jackson.databind.JavaType)v22));
    Object v24 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).createKeyDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v8),((com.fasterxml.jackson.databind.JavaType)v23));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v7));
    Object v9 = "Property '";
    Object v10 = new java.lang.Object[]{null};
    Object v11 = ((com.fasterxml.jackson.databind.DeserializationContext)v8).mappingException(((java.lang.String)v9),((java.lang.Object[])v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = null;
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v14),((com.fasterxml.jackson.databind.JavaType)v15));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v17));
    Object v19 = null;
    Object v20 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v18),((com.fasterxml.jackson.databind.cfg.MapperConfig)v19));
    Object v21 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v13),((com.fasterxml.jackson.databind.JavaType)v16),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v20));
    Object v22 = ((com.fasterxml.jackson.databind.BeanDescription)v21).findAnySetter();
    ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v5).checkIllegalTypes(((com.fasterxml.jackson.databind.DeserializationContext)v8),((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.BeanDescription)v21));
    Object v23 = null;
    org.junit.Assert.assertNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v6 = new com.fasterxml.jackson.databind.ext.CoreXMLDeserializers();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).withAdditionalDeserializers(((com.fasterxml.jackson.databind.deser.Deserializers)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = new com.fasterxml.jackson.databind.util.ObjectBuffer();
    ((com.fasterxml.jackson.databind.DeserializationContext)v10).returnObjectBuffer(((com.fasterxml.jackson.databind.util.ObjectBuffer)v11));
    Object v12 = null;
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v18 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v16),((com.fasterxml.jackson.databind.JavaType[])v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.JavaType)v20));
    Object v22 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v23),((com.fasterxml.jackson.databind.JavaType)v24));
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v27 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v14),((com.fasterxml.jackson.databind.type.TypeBindings)v18),((com.fasterxml.jackson.databind.JavaType)v21),((com.fasterxml.jackson.databind.JavaType[])v22),((com.fasterxml.jackson.databind.JavaType)v25),((com.fasterxml.jackson.databind.JavaType)v26));
    Object v28 = null;
    Object v29 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v30 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v31 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v29),((com.fasterxml.jackson.databind.JavaType)v30));
    Object v32 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v33 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v32));
    Object v34 = null;
    Object v35 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v33),((com.fasterxml.jackson.databind.cfg.MapperConfig)v34));
    Object v36 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v28),((com.fasterxml.jackson.databind.JavaType)v31),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v35));
    Object v37 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).createMapDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v10),((com.fasterxml.jackson.databind.type.MapType)v27),((com.fasterxml.jackson.databind.BeanDescription)v36));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v14 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v12),((com.fasterxml.jackson.databind.JavaType[])v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.JavaType)v16));
    Object v18 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.JavaType)v20));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v10),((com.fasterxml.jackson.databind.type.TypeBindings)v14),((com.fasterxml.jackson.databind.JavaType)v17),((com.fasterxml.jackson.databind.JavaType[])v18),((com.fasterxml.jackson.databind.JavaType)v21),((com.fasterxml.jackson.databind.JavaType)v22));
    Object v24 = null;
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v27 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v25),((com.fasterxml.jackson.databind.JavaType)v26));
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v29 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v28));
    Object v30 = null;
    Object v31 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v29),((com.fasterxml.jackson.databind.cfg.MapperConfig)v30));
    Object v32 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v24),((com.fasterxml.jackson.databind.JavaType)v27),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v31));
    ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v5).checkIllegalTypes(((com.fasterxml.jackson.databind.DeserializationContext)v8),((com.fasterxml.jackson.databind.JavaType)v23),((com.fasterxml.jackson.databind.BeanDescription)v32));
    Object v33 = null;
    org.junit.Assert.assertNull(v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.CollectionType.construct(((java.lang.Class)v10),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).createKeyDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v8),((com.fasterxml.jackson.databind.JavaType)v12));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v7));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v10),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = null;
    Object v16 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v14),((com.fasterxml.jackson.databind.cfg.MapperConfig)v15));
    Object v17 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v9),((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v16));
    Object v18 = null;
    Object v19 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v20 = true;
    Object v21 = "";
    Object v22 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v21));
    Object v23 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v18),((com.fasterxml.jackson.databind.AnnotationIntrospector)v19),(((java.lang.Boolean)v20).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v22));
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v24));
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v27 = com.fasterxml.jackson.databind.type.CollectionType.construct(((java.lang.Class)v25),((com.fasterxml.jackson.databind.JavaType)v26));
    Object v28 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v5).constructSettableProperty(((com.fasterxml.jackson.databind.DeserializationContext)v8),((com.fasterxml.jackson.databind.BeanDescription)v17),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v23),((com.fasterxml.jackson.databind.JavaType)v27));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.JavaType)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = null;
    Object v13 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v11),((com.fasterxml.jackson.databind.cfg.MapperConfig)v12));
    Object v14 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v6),((com.fasterxml.jackson.databind.JavaType)v9),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v13));
    Object v15 = ((com.fasterxml.jackson.databind.BeanDescription)v14).findProperties();
    Object v16 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v1).materializeAbstractType(((com.fasterxml.jackson.databind.DeserializationContext)v4),((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.BeanDescription)v14));
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v3));
    Object v5 = null;
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = null;
    Object v12 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v10),((com.fasterxml.jackson.databind.cfg.MapperConfig)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v5),((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v12));
    Object v14 = ((com.fasterxml.jackson.databind.BeanDescription)v13).findPOJOBuilderConfig();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = null;
    Object v18 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v16),((com.fasterxml.jackson.databind.cfg.MapperConfig)v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v19));
    Object v21 = "strVing";
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v22),((com.fasterxml.jackson.databind.JavaType)v23));
    Object v25 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v18),((java.lang.Class)v20),((java.lang.String)v21),((com.fasterxml.jackson.databind.JavaType)v24));
    Object v26 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v1).constructAnySetter(((com.fasterxml.jackson.databind.DeserializationContext)v4),((com.fasterxml.jackson.databind.BeanDescription)v13),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v25));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.CollectionType.construct(((java.lang.Class)v10),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = null;
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v14),((com.fasterxml.jackson.databind.JavaType)v15));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v17));
    Object v19 = null;
    Object v20 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v18),((com.fasterxml.jackson.databind.cfg.MapperConfig)v19));
    Object v21 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v13),((com.fasterxml.jackson.databind.JavaType)v16),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v20));
    Object v22 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v5).createBeanDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v8),((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.BeanDescription)v21));
    Object v23 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v24 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v23));
    Object v25 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v24));
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v27 = null;
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v29 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v30 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v28),((com.fasterxml.jackson.databind.JavaType)v29));
    Object v31 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v32 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v31));
    Object v33 = null;
    Object v34 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v32),((com.fasterxml.jackson.databind.cfg.MapperConfig)v33));
    Object v35 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v27),((com.fasterxml.jackson.databind.JavaType)v30),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v34));
    Object v36 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v5).buildBeanDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v25),((com.fasterxml.jackson.databind.JavaType)v26),((com.fasterxml.jackson.databind.BeanDescription)v35));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v5).isPotentialBeanType(((java.lang.Class)v7));
    org.junit.Assert.assertEquals((Object)(true), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = null;
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.JavaType)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v14));
    Object v16 = null;
    Object v17 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v15),((com.fasterxml.jackson.databind.cfg.MapperConfig)v16));
    Object v18 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v10),((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v17));
    Object v19 = ((com.fasterxml.jackson.databind.BeanDescription)v18).bindingsForBeanType();
    Object v20 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v5).findStdDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v8),((com.fasterxml.jackson.databind.JavaType)v9),((com.fasterxml.jackson.databind.BeanDescription)v18));
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v6 = new com.fasterxml.jackson.databind.ext.CoreXMLDeserializers();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).withAdditionalDeserializers(((com.fasterxml.jackson.databind.deser.Deserializers)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v9),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = null;
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.JavaType)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = null;
    Object v19 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v17),((com.fasterxml.jackson.databind.cfg.MapperConfig)v18));
    Object v20 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v12),((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v19));
    Object v21 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).createReferenceDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v8),((com.fasterxml.jackson.databind.type.ReferenceType)v11),((com.fasterxml.jackson.databind.BeanDescription)v20));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v6 = new com.fasterxml.jackson.databind.ext.CoreXMLDeserializers();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).withAdditionalDeserializers(((com.fasterxml.jackson.databind.deser.Deserializers)v6));
    Object v8 = new com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver();
    Object v9 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).withAbstractTypeResolver(((com.fasterxml.jackson.databind.AbstractTypeResolver)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.CollectionType.construct(((java.lang.Class)v14),((com.fasterxml.jackson.databind.JavaType)v15));
    Object v17 = null;
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v18),((com.fasterxml.jackson.databind.JavaType)v19));
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v21));
    Object v23 = null;
    Object v24 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v22),((com.fasterxml.jackson.databind.cfg.MapperConfig)v23));
    Object v25 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v17),((com.fasterxml.jackson.databind.JavaType)v20),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v24));
    Object v26 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).createCollectionDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v12),((com.fasterxml.jackson.databind.type.CollectionType)v16),((com.fasterxml.jackson.databind.BeanDescription)v25));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v7));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v10),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = null;
    Object v16 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v14),((com.fasterxml.jackson.databind.cfg.MapperConfig)v15));
    Object v17 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v9),((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v16));
    Object v18 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).findValueInstantiator(((com.fasterxml.jackson.databind.DeserializationContext)v8),((com.fasterxml.jackson.databind.BeanDescription)v17));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = "";
    Object v12 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v11));
    Object v13 = ") returned true fo 'canCreateUsingDelegate()', but null for 'getDelegateType()'";
    Object v14 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.DateDeserializer();
    ((com.fasterxml.jackson.databind.DeserializationContext)v10).reportUnknownProperty(((java.lang.Object)v12),((java.lang.String)v13),((com.fasterxml.jackson.databind.JsonDeserializer)v14));
    Object v15 = null;
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.CollectionType.construct(((java.lang.Class)v17),((com.fasterxml.jackson.databind.JavaType)v18));
    Object v20 = null;
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v21),((com.fasterxml.jackson.databind.JavaType)v22));
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v24));
    Object v26 = null;
    Object v27 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v25),((com.fasterxml.jackson.databind.cfg.MapperConfig)v26));
    Object v28 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v20),((com.fasterxml.jackson.databind.JavaType)v23),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v27));
    Object v29 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).createCollectionLikeDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v10),((com.fasterxml.jackson.databind.type.CollectionLikeType)v19),((com.fasterxml.jackson.databind.BeanDescription)v28));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v6 = new com.fasterxml.jackson.databind.ext.CoreXMLDeserializers();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).withAdditionalDeserializers(((com.fasterxml.jackson.databind.deser.Deserializers)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = null;
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.JavaType)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = null;
    Object v18 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v16),((com.fasterxml.jackson.databind.cfg.MapperConfig)v17));
    Object v19 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v11),((com.fasterxml.jackson.databind.JavaType)v14),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v18));
    Object v20 = ((com.fasterxml.jackson.databind.BeanDescription)v19).findPOJOBuilder();
    Object v21 = null;
    Object v22 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v23 = true;
    Object v24 = "";
    Object v25 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v24));
    Object v26 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v21),((com.fasterxml.jackson.databind.AnnotationIntrospector)v22),(((java.lang.Boolean)v23).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v25));
    Object v27 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v7).constructSetterlessProperty(((com.fasterxml.jackson.databind.DeserializationContext)v10),((com.fasterxml.jackson.databind.BeanDescription)v19),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v26));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.JavaType)v12));
    Object v14 = "X";
    Object v15 = "Property '";
    Object v16 = ((com.fasterxml.jackson.databind.DeserializationContext)v10).unknownTypeIdException(((com.fasterxml.jackson.databind.JavaType)v13),((java.lang.String)v14),((java.lang.String)v15));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v21 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v19),((com.fasterxml.jackson.databind.JavaType[])v20));
    Object v22 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v17),((com.fasterxml.jackson.databind.type.TypeBindings)v21));
    Object v23 = null;
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v26 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v24),((com.fasterxml.jackson.databind.JavaType)v25));
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v27));
    Object v29 = null;
    Object v30 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v28),((com.fasterxml.jackson.databind.cfg.MapperConfig)v29));
    Object v31 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v23),((com.fasterxml.jackson.databind.JavaType)v26),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v30));
    Object v32 = ((com.fasterxml.jackson.databind.BeanDescription)v31).findPOJOBuilderConfig();
    Object v33 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v7).createBeanDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v10),((com.fasterxml.jackson.databind.JavaType)v22),((com.fasterxml.jackson.databind.BeanDescription)v31));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = null;
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.JavaType)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = null;
    Object v19 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v17),((com.fasterxml.jackson.databind.cfg.MapperConfig)v18));
    Object v20 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v12),((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v19));
    Object v21 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v7).createBeanDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v10),((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.BeanDescription)v20));
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = null;
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.JavaType)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = null;
    Object v19 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v17),((com.fasterxml.jackson.databind.cfg.MapperConfig)v18));
    Object v20 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v12),((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v19));
    Object v21 = ((com.fasterxml.jackson.databind.BeanDescription)v20).findPOJOBuilderConfig();
    Object v22 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v7).buildBuilderBasedDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v10),((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.BeanDescription)v20));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = null;
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.JavaType)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v14));
    Object v16 = null;
    Object v17 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v15),((com.fasterxml.jackson.databind.cfg.MapperConfig)v16));
    Object v18 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v10),((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v17));
    Object v19 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v5).materializeAbstractType(((com.fasterxml.jackson.databind.DeserializationContext)v8),((com.fasterxml.jackson.databind.JavaType)v9),((com.fasterxml.jackson.databind.BeanDescription)v18));
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v16 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v14),((com.fasterxml.jackson.databind.JavaType[])v15));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v17),((com.fasterxml.jackson.databind.JavaType)v18));
    Object v20 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v21),((com.fasterxml.jackson.databind.JavaType)v22));
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v12),((com.fasterxml.jackson.databind.type.TypeBindings)v16),((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.JavaType[])v20),((com.fasterxml.jackson.databind.JavaType)v23),((com.fasterxml.jackson.databind.JavaType)v24));
    Object v26 = "U";
    Object v27 = "Can not find a deserializer or non-concrete Collection type ";
    Object v28 = ((com.fasterxml.jackson.databind.DeserializationContext)v10).unknownTypeIdException(((com.fasterxml.jackson.databind.JavaType)v25),((java.lang.String)v26),((java.lang.String)v27));
    Object v29 = null;
    Object v30 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v31 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v32 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v30),((com.fasterxml.jackson.databind.JavaType)v31));
    Object v33 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v34 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v33));
    Object v35 = null;
    Object v36 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v34),((com.fasterxml.jackson.databind.cfg.MapperConfig)v35));
    Object v37 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v29),((com.fasterxml.jackson.databind.JavaType)v32),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v36));
    Object v38 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).findValueInstantiator(((com.fasterxml.jackson.databind.DeserializationContext)v10),((com.fasterxml.jackson.databind.BeanDescription)v37));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v6 = new com.fasterxml.jackson.databind.ext.CoreXMLDeserializers();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).withAdditionalDeserializers(((com.fasterxml.jackson.databind.deser.Deserializers)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = null;
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.JavaType)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = null;
    Object v18 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v16),((com.fasterxml.jackson.databind.cfg.MapperConfig)v17));
    Object v19 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v11),((com.fasterxml.jackson.databind.JavaType)v14),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v18));
    Object v20 = ((com.fasterxml.jackson.databind.BeanDescription)v19).getClassInfo();
    Object v21 = null;
    ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v7).addBeanProps(((com.fasterxml.jackson.databind.DeserializationContext)v10),((com.fasterxml.jackson.databind.BeanDescription)v19),((com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder)v21));
    Object v22 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v16 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v14),((com.fasterxml.jackson.databind.JavaType[])v15));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v17),((com.fasterxml.jackson.databind.JavaType)v18));
    Object v20 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v21),((com.fasterxml.jackson.databind.JavaType)v22));
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v12),((com.fasterxml.jackson.databind.type.TypeBindings)v16),((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.JavaType[])v20),((com.fasterxml.jackson.databind.JavaType)v23),((com.fasterxml.jackson.databind.JavaType)v24));
    Object v26 = null;
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v29 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v27),((com.fasterxml.jackson.databind.JavaType)v28));
    Object v30 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v31 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v30));
    Object v32 = null;
    Object v33 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v31),((com.fasterxml.jackson.databind.cfg.MapperConfig)v32));
    Object v34 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v26),((com.fasterxml.jackson.databind.JavaType)v29),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v33));
    Object v35 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).createMapLikeDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v10),((com.fasterxml.jackson.databind.type.MapLikeType)v25),((com.fasterxml.jackson.databind.BeanDescription)v34));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = "integer";
    Object v14 = ((com.fasterxml.jackson.databind.DeserializationContext)v10).instantiationException(((java.lang.Class)v12),((java.lang.String)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v19 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v17),((com.fasterxml.jackson.databind.JavaType[])v18));
    Object v20 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.type.TypeBindings)v19));
    Object v21 = null;
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v22),((com.fasterxml.jackson.databind.JavaType)v23));
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v25));
    Object v27 = null;
    Object v28 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v26),((com.fasterxml.jackson.databind.cfg.MapperConfig)v27));
    Object v29 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v21),((com.fasterxml.jackson.databind.JavaType)v24),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v28));
    Object v30 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).createArrayDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v10),((com.fasterxml.jackson.databind.type.ArrayType)v20),((com.fasterxml.jackson.databind.BeanDescription)v29));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = ")";
    Object v14 = "not a valid representation";
    Object v15 = ((com.fasterxml.jackson.databind.DeserializationContext)v10).weirdKeyException(((java.lang.Class)v12),((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.CollectionType.construct(((java.lang.Class)v17),((com.fasterxml.jackson.databind.JavaType)v18));
    Object v20 = null;
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v21),((com.fasterxml.jackson.databind.JavaType)v22));
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v24));
    Object v26 = null;
    Object v27 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v25),((com.fasterxml.jackson.databind.cfg.MapperConfig)v26));
    Object v28 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v20),((com.fasterxml.jackson.databind.JavaType)v23),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v27));
    Object v29 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v7).buildThrowableDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v10),((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.BeanDescription)v28));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v6 = new com.fasterxml.jackson.databind.ext.CoreXMLDeserializers();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).withAdditionalDeserializers(((com.fasterxml.jackson.databind.deser.Deserializers)v6));
    Object v8 = new com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver();
    Object v9 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).withAbstractTypeResolver(((com.fasterxml.jackson.databind.AbstractTypeResolver)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = null;
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.JavaType)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = null;
    Object v21 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v19),((com.fasterxml.jackson.databind.cfg.MapperConfig)v20));
    Object v22 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v14),((com.fasterxml.jackson.databind.JavaType)v17),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v21));
    Object v23 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v7).buildThrowableDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v12),((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.BeanDescription)v22));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = null;
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.CollectionType.construct(((java.lang.Class)v10),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = null;
    Object v16 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v14),((com.fasterxml.jackson.databind.cfg.MapperConfig)v15));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v17));
    Object v19 = "strVing";
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v20),((com.fasterxml.jackson.databind.JavaType)v21));
    Object v23 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v16),((java.lang.Class)v18),((java.lang.String)v19),((com.fasterxml.jackson.databind.JavaType)v22));
    Object v24 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).findPropertyTypeDeserializer(((com.fasterxml.jackson.databind.DeserializationConfig)v8),((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v23));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.CollectionType.construct(((java.lang.Class)v12),((com.fasterxml.jackson.databind.JavaType)v13));
    Object v15 = null;
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v16),((com.fasterxml.jackson.databind.JavaType)v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v19));
    Object v21 = null;
    Object v22 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v20),((com.fasterxml.jackson.databind.cfg.MapperConfig)v21));
    Object v23 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v15),((com.fasterxml.jackson.databind.JavaType)v18),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v22));
    Object v24 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).createCollectionDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v10),((com.fasterxml.jackson.databind.type.CollectionType)v14),((com.fasterxml.jackson.databind.BeanDescription)v23));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v6 = new com.fasterxml.jackson.databind.module.SimpleValueInstantiators();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).withValueInstantiators(((com.fasterxml.jackson.databind.deser.ValueInstantiators)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = null;
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.JavaType)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = null;
    Object v18 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v16),((com.fasterxml.jackson.databind.cfg.MapperConfig)v17));
    Object v19 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v11),((com.fasterxml.jackson.databind.JavaType)v14),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = null;
    Object v23 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v21),((com.fasterxml.jackson.databind.cfg.MapperConfig)v22));
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v24));
    Object v26 = "strVing";
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v29 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v27),((com.fasterxml.jackson.databind.JavaType)v28));
    Object v30 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v23),((java.lang.Class)v25),((java.lang.String)v26),((com.fasterxml.jackson.databind.JavaType)v29));
    Object v31 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v32 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v31));
    Object v33 = ((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v30).hasAnnotation(((java.lang.Class)v32));
    Object v34 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v7).constructAnySetter(((com.fasterxml.jackson.databind.DeserializationContext)v10),((com.fasterxml.jackson.databind.BeanDescription)v19),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v30));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v6 = new com.fasterxml.jackson.databind.module.SimpleValueInstantiators();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).withValueInstantiators(((com.fasterxml.jackson.databind.deser.ValueInstantiators)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v15 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v13),((com.fasterxml.jackson.databind.JavaType[])v14));
    Object v16 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.type.TypeBindings)v15));
    Object v17 = null;
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v18),((com.fasterxml.jackson.databind.JavaType)v19));
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v21));
    Object v23 = null;
    Object v24 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v22),((com.fasterxml.jackson.databind.cfg.MapperConfig)v23));
    Object v25 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v17),((com.fasterxml.jackson.databind.JavaType)v20),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v24));
    Object v26 = ((com.fasterxml.jackson.databind.BeanDescription)v25).getIgnoredPropertyNames();
    Object v27 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).createArrayDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v10),((com.fasterxml.jackson.databind.type.ArrayType)v16),((com.fasterxml.jackson.databind.BeanDescription)v25));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v6 = new com.fasterxml.jackson.databind.ext.CoreXMLDeserializers();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).withAdditionalDeserializers(((com.fasterxml.jackson.databind.deser.Deserializers)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = null;
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.JavaType)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = null;
    Object v19 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v17),((com.fasterxml.jackson.databind.cfg.MapperConfig)v18));
    Object v20 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v12),((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v19));
    Object v21 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v7).materializeAbstractType(((com.fasterxml.jackson.databind.DeserializationContext)v10),((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.BeanDescription)v20));
    org.junit.Assert.assertNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v7));
    Object v9 = ((com.fasterxml.jackson.databind.DeserializationContext)v8).getArrayBuilders();
    Object v10 = null;
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.JavaType)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v14));
    Object v16 = null;
    Object v17 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v15),((com.fasterxml.jackson.databind.cfg.MapperConfig)v16));
    Object v18 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v10),((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v19));
    Object v21 = null;
    Object v22 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v20),((com.fasterxml.jackson.databind.cfg.MapperConfig)v21));
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v23));
    Object v25 = "strVing";
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v28 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v26),((com.fasterxml.jackson.databind.JavaType)v27));
    Object v29 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v22),((java.lang.Class)v24),((java.lang.String)v25),((com.fasterxml.jackson.databind.JavaType)v28));
    Object v30 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v5).constructAnySetter(((com.fasterxml.jackson.databind.DeserializationContext)v8),((com.fasterxml.jackson.databind.BeanDescription)v18),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v29));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = new com.fasterxml.jackson.databind.util.ObjectBuffer();
    ((com.fasterxml.jackson.databind.DeserializationContext)v10).returnObjectBuffer(((com.fasterxml.jackson.databind.util.ObjectBuffer)v11));
    Object v12 = null;
    Object v13 = null;
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v14),((com.fasterxml.jackson.databind.JavaType)v15));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v17));
    Object v19 = null;
    Object v20 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v18),((com.fasterxml.jackson.databind.cfg.MapperConfig)v19));
    Object v21 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v13),((com.fasterxml.jackson.databind.JavaType)v16),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v20));
    Object v22 = null;
    Object v23 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v24 = true;
    Object v25 = "";
    Object v26 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v25));
    Object v27 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v22),((com.fasterxml.jackson.databind.AnnotationIntrospector)v23),(((java.lang.Boolean)v24).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v26));
    Object v28 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v7).constructSetterlessProperty(((com.fasterxml.jackson.databind.DeserializationContext)v10),((com.fasterxml.jackson.databind.BeanDescription)v21),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v27));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v7).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v6 = new com.fasterxml.jackson.databind.ext.CoreXMLDeserializers();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).withAdditionalDeserializers(((com.fasterxml.jackson.databind.deser.Deserializers)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = null;
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.JavaType)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = null;
    Object v19 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v17),((com.fasterxml.jackson.databind.cfg.MapperConfig)v18));
    Object v20 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v12),((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v19));
    Object v21 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).findDefaultDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v10),((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.BeanDescription)v20));
    Object v22 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v23 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v22));
    Object v24 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v23));
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v26 = null;
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v29 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v27),((com.fasterxml.jackson.databind.JavaType)v28));
    Object v30 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v31 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v30));
    Object v32 = null;
    Object v33 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v31),((com.fasterxml.jackson.databind.cfg.MapperConfig)v32));
    Object v34 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v26),((com.fasterxml.jackson.databind.JavaType)v29),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v33));
    ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v7).checkIllegalTypes(((com.fasterxml.jackson.databind.DeserializationContext)v24),((com.fasterxml.jackson.databind.JavaType)v25),((com.fasterxml.jackson.databind.BeanDescription)v34));
    Object v35 = null;
    org.junit.Assert.assertNull(v35);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = ((com.fasterxml.jackson.databind.JavaType)v11).getErasedSignature();
    Object v13 = null;
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v14),((com.fasterxml.jackson.databind.JavaType)v15));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v17));
    Object v19 = null;
    Object v20 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v18),((com.fasterxml.jackson.databind.cfg.MapperConfig)v19));
    Object v21 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v13),((com.fasterxml.jackson.databind.JavaType)v16),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v20));
    Object v22 = ((com.fasterxml.jackson.databind.BeanDescription)v21).findProperties();
    Object v23 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v7).findStdDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v10),((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.BeanDescription)v21));
    org.junit.Assert.assertNotNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v6 = new com.fasterxml.jackson.databind.module.SimpleValueInstantiators();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).withValueInstantiators(((com.fasterxml.jackson.databind.deser.ValueInstantiators)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v16 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v14),((com.fasterxml.jackson.databind.JavaType[])v15));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v17),((com.fasterxml.jackson.databind.JavaType)v18));
    Object v20 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v21),((com.fasterxml.jackson.databind.JavaType)v22));
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v12),((com.fasterxml.jackson.databind.type.TypeBindings)v16),((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.JavaType[])v20),((com.fasterxml.jackson.databind.JavaType)v23),((com.fasterxml.jackson.databind.JavaType)v24));
    Object v26 = ((com.fasterxml.jackson.databind.JavaType)v25).getGenericSignature();
    Object v27 = null;
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v29 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v30 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v28),((com.fasterxml.jackson.databind.JavaType)v29));
    Object v31 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v32 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v31));
    Object v33 = null;
    Object v34 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v32),((com.fasterxml.jackson.databind.cfg.MapperConfig)v33));
    Object v35 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v27),((com.fasterxml.jackson.databind.JavaType)v30),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v34));
    Object v36 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).createMapDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v10),((com.fasterxml.jackson.databind.type.MapType)v25),((com.fasterxml.jackson.databind.BeanDescription)v35));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers();
    Object v9 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v7).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = null;
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.JavaType)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = null;
    Object v21 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v19),((com.fasterxml.jackson.databind.cfg.MapperConfig)v20));
    Object v22 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v14),((com.fasterxml.jackson.databind.JavaType)v17),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v21));
    Object v23 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v9).findDefaultDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v12),((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.BeanDescription)v22));
    org.junit.Assert.assertNotNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).createKeyDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v8),((com.fasterxml.jackson.databind.JavaType)v9));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = com.fasterxml.jackson.core.JsonToken.NOT_AVAILABLE;
    Object v14 = ((com.fasterxml.jackson.databind.DeserializationContext)v10).mappingException(((java.lang.Class)v12),((com.fasterxml.jackson.core.JsonToken)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = null;
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v17),((com.fasterxml.jackson.databind.JavaType)v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = null;
    Object v23 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v21),((com.fasterxml.jackson.databind.cfg.MapperConfig)v22));
    Object v24 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v16),((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v23));
    Object v25 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).createEnumDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v10),((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.BeanDescription)v24));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v7).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = null;
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v14),((com.fasterxml.jackson.databind.JavaType)v15));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v17));
    Object v19 = null;
    Object v20 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v18),((com.fasterxml.jackson.databind.cfg.MapperConfig)v19));
    Object v21 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v13),((com.fasterxml.jackson.databind.JavaType)v16),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v20));
    Object v22 = ((com.fasterxml.jackson.databind.BeanDescription)v21).findInjectables();
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v23));
    Object v25 = null;
    Object v26 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v24),((com.fasterxml.jackson.databind.cfg.MapperConfig)v25));
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v27));
    Object v29 = "strVing";
    Object v30 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v31 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v32 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v30),((com.fasterxml.jackson.databind.JavaType)v31));
    Object v33 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v26),((java.lang.Class)v28),((java.lang.String)v29),((com.fasterxml.jackson.databind.JavaType)v32));
    Object v34 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v9).constructAnySetter(((com.fasterxml.jackson.databind.DeserializationContext)v12),((com.fasterxml.jackson.databind.BeanDescription)v21),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v33));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers();
    Object v9 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.CollectionType.construct(((java.lang.Class)v14),((com.fasterxml.jackson.databind.JavaType)v15));
    Object v17 = "5";
    Object v18 = "string";
    Object v19 = ((com.fasterxml.jackson.databind.DeserializationContext)v12).unknownTypeIdException(((com.fasterxml.jackson.databind.JavaType)v16),((java.lang.String)v17),((java.lang.String)v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.type.CollectionType.construct(((java.lang.Class)v21),((com.fasterxml.jackson.databind.JavaType)v22));
    Object v24 = null;
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v27 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v25),((com.fasterxml.jackson.databind.JavaType)v26));
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v29 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v28));
    Object v30 = null;
    Object v31 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v29),((com.fasterxml.jackson.databind.cfg.MapperConfig)v30));
    Object v32 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v24),((com.fasterxml.jackson.databind.JavaType)v27),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v31));
    Object v33 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v9).createCollectionLikeDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v12),((com.fasterxml.jackson.databind.type.CollectionLikeType)v23),((com.fasterxml.jackson.databind.BeanDescription)v32));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers();
    Object v9 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v18 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v16),((com.fasterxml.jackson.databind.JavaType[])v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.JavaType)v20));
    Object v22 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v23),((com.fasterxml.jackson.databind.JavaType)v24));
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v27 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v14),((com.fasterxml.jackson.databind.type.TypeBindings)v18),((com.fasterxml.jackson.databind.JavaType)v21),((com.fasterxml.jackson.databind.JavaType[])v22),((com.fasterxml.jackson.databind.JavaType)v25),((com.fasterxml.jackson.databind.JavaType)v26));
    Object v28 = null;
    Object v29 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v30 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v31 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v29),((com.fasterxml.jackson.databind.JavaType)v30));
    Object v32 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v33 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v32));
    Object v34 = null;
    Object v35 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v33),((com.fasterxml.jackson.databind.cfg.MapperConfig)v34));
    Object v36 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v28),((com.fasterxml.jackson.databind.JavaType)v31),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v35));
    Object v37 = ((com.fasterxml.jackson.databind.BeanDescription)v36).findProperties();
    Object v38 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v9).buildBuilderBasedDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v12),((com.fasterxml.jackson.databind.JavaType)v27),((com.fasterxml.jackson.databind.BeanDescription)v36));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v6 = new com.fasterxml.jackson.databind.module.SimpleValueInstantiators();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).withValueInstantiators(((com.fasterxml.jackson.databind.deser.ValueInstantiators)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v16 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v14),((com.fasterxml.jackson.databind.JavaType[])v15));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v17),((com.fasterxml.jackson.databind.JavaType)v18));
    Object v20 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v21),((com.fasterxml.jackson.databind.JavaType)v22));
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v12),((com.fasterxml.jackson.databind.type.TypeBindings)v16),((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.JavaType[])v20),((com.fasterxml.jackson.databind.JavaType)v23),((com.fasterxml.jackson.databind.JavaType)v24));
    Object v26 = ((com.fasterxml.jackson.databind.type.MapType)v25).toString();
    Object v27 = null;
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v29 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v30 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v28),((com.fasterxml.jackson.databind.JavaType)v29));
    Object v31 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v32 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v31));
    Object v33 = null;
    Object v34 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v32),((com.fasterxml.jackson.databind.cfg.MapperConfig)v33));
    Object v35 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v27),((com.fasterxml.jackson.databind.JavaType)v30),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v34));
    Object v36 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).createMapDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v10),((com.fasterxml.jackson.databind.type.MapType)v25),((com.fasterxml.jackson.databind.BeanDescription)v35));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v6 = new com.fasterxml.jackson.databind.ext.CoreXMLDeserializers();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).withAdditionalDeserializers(((com.fasterxml.jackson.databind.deser.Deserializers)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).createKeyDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v10),((com.fasterxml.jackson.databind.JavaType)v11));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v6 = new com.fasterxml.jackson.databind.module.SimpleValueInstantiators();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).withValueInstantiators(((com.fasterxml.jackson.databind.deser.ValueInstantiators)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v16 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v14),((com.fasterxml.jackson.databind.JavaType[])v15));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v17),((com.fasterxml.jackson.databind.JavaType)v18));
    Object v20 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v21),((com.fasterxml.jackson.databind.JavaType)v22));
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v12),((com.fasterxml.jackson.databind.type.TypeBindings)v16),((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.JavaType[])v20),((com.fasterxml.jackson.databind.JavaType)v23),((com.fasterxml.jackson.databind.JavaType)v24));
    Object v26 = null;
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v29 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v27),((com.fasterxml.jackson.databind.JavaType)v28));
    Object v30 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v31 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v30));
    Object v32 = null;
    Object v33 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v31),((com.fasterxml.jackson.databind.cfg.MapperConfig)v32));
    Object v34 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v26),((com.fasterxml.jackson.databind.JavaType)v29),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v33));
    Object v35 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).createEnumDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v10),((com.fasterxml.jackson.databind.JavaType)v25),((com.fasterxml.jackson.databind.BeanDescription)v34));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v7).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v18 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v16),((com.fasterxml.jackson.databind.JavaType[])v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.JavaType)v20));
    Object v22 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v23),((com.fasterxml.jackson.databind.JavaType)v24));
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v27 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v14),((com.fasterxml.jackson.databind.type.TypeBindings)v18),((com.fasterxml.jackson.databind.JavaType)v21),((com.fasterxml.jackson.databind.JavaType[])v22),((com.fasterxml.jackson.databind.JavaType)v25),((com.fasterxml.jackson.databind.JavaType)v26));
    Object v28 = null;
    Object v29 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v30 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v31 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v29),((com.fasterxml.jackson.databind.JavaType)v30));
    Object v32 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v33 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v32));
    Object v34 = null;
    Object v35 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v33),((com.fasterxml.jackson.databind.cfg.MapperConfig)v34));
    Object v36 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v28),((com.fasterxml.jackson.databind.JavaType)v31),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v35));
    Object v37 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v9).createBeanDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v12),((com.fasterxml.jackson.databind.JavaType)v27),((com.fasterxml.jackson.databind.BeanDescription)v36));
    org.junit.Assert.assertNotNull(v37);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v7).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v11 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v12 = com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std.defaultInstance();
    Object v13 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseWithUnderscoresStrategy();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v15 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v16 = java.text.DateFormat.getTimeInstance();
    Object v17 = null;
    Object v18 = java.util.Locale.getDefault();
    Object v19 = ")";
    Object v20 = java.util.TimeZone.getTimeZone(((java.lang.String)v19));
    Object v21 = null;
    Object v22 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v10),((com.fasterxml.jackson.databind.AnnotationIntrospector)v11),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v12),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v13),((com.fasterxml.jackson.databind.type.TypeFactory)v14),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v15),((java.text.DateFormat)v16),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v17),((java.util.Locale)v18),((java.util.TimeZone)v20),((com.fasterxml.jackson.core.Base64Variant)v21));
    Object v23 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v24 = null;
    Object v25 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v26 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v27 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v22),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v23),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v24),((com.fasterxml.jackson.databind.util.RootNameLookup)v25),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v26));
    Object v28 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseWithUnderscoresStrategy();
    Object v29 = ((com.fasterxml.jackson.databind.DeserializationConfig)v27).with(((com.fasterxml.jackson.databind.PropertyNamingStrategy)v28));
    Object v30 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v31 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v30));
    Object v32 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v33 = com.fasterxml.jackson.databind.type.CollectionType.construct(((java.lang.Class)v31),((com.fasterxml.jackson.databind.JavaType)v32));
    Object v34 = -6;
    Object v35 = ((com.fasterxml.jackson.databind.JavaType)v33).containedTypeName((((java.lang.Integer)v34).intValue()));
    Object v36 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v9).mapAbstractType(((com.fasterxml.jackson.databind.DeserializationConfig)v27),((com.fasterxml.jackson.databind.JavaType)v33));
    org.junit.Assert.assertNotNull(v36);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v6 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v7 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v8 = com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std.defaultInstance();
    Object v9 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseWithUnderscoresStrategy();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v11 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v12 = java.text.DateFormat.getTimeInstance();
    Object v13 = null;
    Object v14 = java.util.Locale.getDefault();
    Object v15 = ")";
    Object v16 = java.util.TimeZone.getTimeZone(((java.lang.String)v15));
    Object v17 = null;
    Object v18 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v6),((com.fasterxml.jackson.databind.AnnotationIntrospector)v7),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v8),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v9),((com.fasterxml.jackson.databind.type.TypeFactory)v10),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v11),((java.text.DateFormat)v12),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v13),((java.util.Locale)v14),((java.util.TimeZone)v16),((com.fasterxml.jackson.core.Base64Variant)v17));
    Object v19 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v22 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v23 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v18),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v19),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v20),((com.fasterxml.jackson.databind.util.RootNameLookup)v21),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v22));
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = null;
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v28 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v26),((com.fasterxml.jackson.databind.JavaType)v27));
    Object v29 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v30 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v29));
    Object v31 = null;
    Object v32 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v30),((com.fasterxml.jackson.databind.cfg.MapperConfig)v31));
    Object v33 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v25),((com.fasterxml.jackson.databind.JavaType)v28),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v32));
    Object v34 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).createTreeDeserializer(((com.fasterxml.jackson.databind.DeserializationConfig)v23),((com.fasterxml.jackson.databind.JavaType)v24),((com.fasterxml.jackson.databind.BeanDescription)v33));
    Object v35 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).getFactoryConfig();
    org.junit.Assert.assertNotNull(v35);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v6 = new com.fasterxml.jackson.databind.ext.CoreXMLDeserializers();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).withAdditionalDeserializers(((com.fasterxml.jackson.databind.deser.Deserializers)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v7).isPotentialBeanType(((java.lang.Class)v9));
    org.junit.Assert.assertEquals((Object)(true), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers();
    Object v9 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = ((com.fasterxml.jackson.databind.DeserializationContext)v12).getArrayBuilders();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v19 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v17),((com.fasterxml.jackson.databind.JavaType[])v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v20),((com.fasterxml.jackson.databind.JavaType)v21));
    Object v23 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v26 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v24),((com.fasterxml.jackson.databind.JavaType)v25));
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v28 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v15),((com.fasterxml.jackson.databind.type.TypeBindings)v19),((com.fasterxml.jackson.databind.JavaType)v22),((com.fasterxml.jackson.databind.JavaType[])v23),((com.fasterxml.jackson.databind.JavaType)v26),((com.fasterxml.jackson.databind.JavaType)v27));
    Object v29 = null;
    Object v30 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v31 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v32 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v30),((com.fasterxml.jackson.databind.JavaType)v31));
    Object v33 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v34 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v33));
    Object v35 = null;
    Object v36 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v34),((com.fasterxml.jackson.databind.cfg.MapperConfig)v35));
    Object v37 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v29),((com.fasterxml.jackson.databind.JavaType)v32),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v36));
    ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v9).checkIllegalTypes(((com.fasterxml.jackson.databind.DeserializationContext)v12),((com.fasterxml.jackson.databind.JavaType)v28),((com.fasterxml.jackson.databind.BeanDescription)v37));
    Object v38 = null;
    org.junit.Assert.assertNull(v38);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = null;
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.JavaType)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v14));
    Object v16 = null;
    Object v17 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v15),((com.fasterxml.jackson.databind.cfg.MapperConfig)v16));
    Object v18 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v10),((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v17));
    ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v5).checkIllegalTypes(((com.fasterxml.jackson.databind.DeserializationContext)v8),((com.fasterxml.jackson.databind.JavaType)v9),((com.fasterxml.jackson.databind.BeanDescription)v18));
    Object v19 = null;
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers();
    Object v9 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = "strig";
    Object v16 = "striOng";
    Object v17 = ((com.fasterxml.jackson.databind.DeserializationContext)v12).weirdKeyException(((java.lang.Class)v14),((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = null;
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v20),((com.fasterxml.jackson.databind.JavaType)v21));
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v23));
    Object v25 = null;
    Object v26 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v24),((com.fasterxml.jackson.databind.cfg.MapperConfig)v25));
    Object v27 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v19),((com.fasterxml.jackson.databind.JavaType)v22),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v26));
    Object v28 = ((com.fasterxml.jackson.databind.BeanDescription)v27).findAnyGetter();
    Object v29 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v9).findStdDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v12),((com.fasterxml.jackson.databind.JavaType)v18),((com.fasterxml.jackson.databind.BeanDescription)v27));
    org.junit.Assert.assertNotNull(v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = ((java.lang.reflect.Type)v9).getTypeName();
    Object v11 = null;
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.JavaType)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = null;
    Object v18 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v16),((com.fasterxml.jackson.databind.cfg.MapperConfig)v17));
    Object v19 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v11),((com.fasterxml.jackson.databind.JavaType)v14),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v5).createBuilderBasedDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v8),((com.fasterxml.jackson.databind.JavaType)v9),((com.fasterxml.jackson.databind.BeanDescription)v19),((java.lang.Class)v21));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.JavaType)v12));
    Object v14 = null;
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.JavaType)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = null;
    Object v21 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v19),((com.fasterxml.jackson.databind.cfg.MapperConfig)v20));
    Object v22 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v14),((com.fasterxml.jackson.databind.JavaType)v17),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v21));
    Object v23 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v7).buildBeanDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v10),((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.BeanDescription)v22));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v9 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v10 = com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std.defaultInstance();
    Object v11 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseWithUnderscoresStrategy();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v13 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v14 = java.text.DateFormat.getTimeInstance();
    Object v15 = null;
    Object v16 = java.util.Locale.getDefault();
    Object v17 = ")";
    Object v18 = java.util.TimeZone.getTimeZone(((java.lang.String)v17));
    Object v19 = null;
    Object v20 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v8),((com.fasterxml.jackson.databind.AnnotationIntrospector)v9),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v10),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v11),((com.fasterxml.jackson.databind.type.TypeFactory)v12),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v13),((java.text.DateFormat)v14),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v15),((java.util.Locale)v16),((java.util.TimeZone)v18),((com.fasterxml.jackson.core.Base64Variant)v19));
    Object v21 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v22 = null;
    Object v23 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v24 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v25 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v20),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v21),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v22),((com.fasterxml.jackson.databind.util.RootNameLookup)v23),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v24));
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v27));
    Object v29 = null;
    Object v30 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v28),((com.fasterxml.jackson.databind.cfg.MapperConfig)v29));
    Object v31 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v32 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v31));
    Object v33 = "strVing";
    Object v34 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v35 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v36 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v34),((com.fasterxml.jackson.databind.JavaType)v35));
    Object v37 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v30),((java.lang.Class)v32),((java.lang.String)v33),((com.fasterxml.jackson.databind.JavaType)v36));
    Object v38 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).findPropertyTypeDeserializer(((com.fasterxml.jackson.databind.DeserializationConfig)v25),((com.fasterxml.jackson.databind.JavaType)v26),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v37));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers();
    Object v9 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v18 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v16),((com.fasterxml.jackson.databind.JavaType[])v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.JavaType)v20));
    Object v22 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v23),((com.fasterxml.jackson.databind.JavaType)v24));
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v27 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v14),((com.fasterxml.jackson.databind.type.TypeBindings)v18),((com.fasterxml.jackson.databind.JavaType)v21),((com.fasterxml.jackson.databind.JavaType[])v22),((com.fasterxml.jackson.databind.JavaType)v25),((com.fasterxml.jackson.databind.JavaType)v26));
    Object v28 = null;
    Object v29 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v30 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v31 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v29),((com.fasterxml.jackson.databind.JavaType)v30));
    Object v32 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v33 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v32));
    Object v34 = null;
    Object v35 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v33),((com.fasterxml.jackson.databind.cfg.MapperConfig)v34));
    Object v36 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v28),((com.fasterxml.jackson.databind.JavaType)v31),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v35));
    Object v37 = ((com.fasterxml.jackson.databind.BeanDescription)v36).isNonStaticInnerClass();
    Object v38 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v9).createMapLikeDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v12),((com.fasterxml.jackson.databind.type.MapLikeType)v27),((com.fasterxml.jackson.databind.BeanDescription)v36));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers();
    Object v9 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = null;
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.JavaType)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = null;
    Object v21 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v19),((com.fasterxml.jackson.databind.cfg.MapperConfig)v20));
    Object v22 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v14),((com.fasterxml.jackson.databind.JavaType)v17),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v21));
    Object v23 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v9).createBeanDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v12),((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.BeanDescription)v22));
    org.junit.Assert.assertNotNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v6 = new com.fasterxml.jackson.databind.module.SimpleValueInstantiators();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).withValueInstantiators(((com.fasterxml.jackson.databind.deser.ValueInstantiators)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = null;
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.JavaType)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = null;
    Object v19 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v17),((com.fasterxml.jackson.databind.cfg.MapperConfig)v18));
    Object v20 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v12),((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v19));
    Object v21 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v7).buildThrowableDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v10),((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.BeanDescription)v20));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v6 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v7 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v8 = com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std.defaultInstance();
    Object v9 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseWithUnderscoresStrategy();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v11 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v12 = java.text.DateFormat.getTimeInstance();
    Object v13 = null;
    Object v14 = java.util.Locale.getDefault();
    Object v15 = ")";
    Object v16 = java.util.TimeZone.getTimeZone(((java.lang.String)v15));
    Object v17 = null;
    Object v18 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v6),((com.fasterxml.jackson.databind.AnnotationIntrospector)v7),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v8),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v9),((com.fasterxml.jackson.databind.type.TypeFactory)v10),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v11),((java.text.DateFormat)v12),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v13),((java.util.Locale)v14),((java.util.TimeZone)v16),((com.fasterxml.jackson.core.Base64Variant)v17));
    Object v19 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v22 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v23 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v18),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v19),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v20),((com.fasterxml.jackson.databind.util.RootNameLookup)v21),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v22));
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v24));
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v26));
    Object v28 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v29 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v27),((com.fasterxml.jackson.databind.JavaType[])v28));
    Object v30 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v31 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v32 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v30),((com.fasterxml.jackson.databind.JavaType)v31));
    Object v33 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v34 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v35 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v36 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v34),((com.fasterxml.jackson.databind.JavaType)v35));
    Object v37 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v38 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v25),((com.fasterxml.jackson.databind.type.TypeBindings)v29),((com.fasterxml.jackson.databind.JavaType)v32),((com.fasterxml.jackson.databind.JavaType[])v33),((com.fasterxml.jackson.databind.JavaType)v36),((com.fasterxml.jackson.databind.JavaType)v37));
    Object v39 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).findTypeDeserializer(((com.fasterxml.jackson.databind.DeserializationConfig)v23),((com.fasterxml.jackson.databind.JavaType)v38));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v6 = new com.fasterxml.jackson.databind.module.SimpleValueInstantiators();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).withValueInstantiators(((com.fasterxml.jackson.databind.deser.ValueInstantiators)v6));
    Object v8 = new com.fasterxml.jackson.databind.ext.CoreXMLDeserializers();
    Object v9 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).withAdditionalDeserializers(((com.fasterxml.jackson.databind.deser.Deserializers)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = "array";
    Object v14 = ((com.fasterxml.jackson.databind.DeserializationContext)v12).mappingException(((java.lang.String)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = null;
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v17),((com.fasterxml.jackson.databind.JavaType)v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = null;
    Object v23 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v21),((com.fasterxml.jackson.databind.cfg.MapperConfig)v22));
    Object v24 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v16),((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v23));
    Object v25 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v7).buildBuilderBasedDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v12),((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.BeanDescription)v24));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers();
    Object v9 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = "";
    Object v14 = new java.lang.Object[]{null,null,null};
    Object v15 = ((com.fasterxml.jackson.databind.DeserializationContext)v12).mappingException(((java.lang.String)v13),((java.lang.Object[])v14));
    Object v16 = null;
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v17),((com.fasterxml.jackson.databind.JavaType)v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = null;
    Object v23 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v21),((com.fasterxml.jackson.databind.cfg.MapperConfig)v22));
    Object v24 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v16),((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v23));
    Object v25 = null;
    Object v26 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v27 = true;
    Object v28 = "";
    Object v29 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v28));
    Object v30 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v25),((com.fasterxml.jackson.databind.AnnotationIntrospector)v26),(((java.lang.Boolean)v27).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v29));
    Object v31 = ((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v30).hasConstructorParameter();
    Object v32 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v33 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v34 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v32),((com.fasterxml.jackson.databind.JavaType)v33));
    Object v35 = 1;
    Object v36 = ((com.fasterxml.jackson.databind.JavaType)v34).containedType((((java.lang.Integer)v35).intValue()));
    Object v37 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v9).constructSettableProperty(((com.fasterxml.jackson.databind.DeserializationContext)v12),((com.fasterxml.jackson.databind.BeanDescription)v24),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v30),((com.fasterxml.jackson.databind.JavaType)v34));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v6 = new com.fasterxml.jackson.databind.module.SimpleValueInstantiators();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).withValueInstantiators(((com.fasterxml.jackson.databind.deser.ValueInstantiators)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = com.fasterxml.jackson.databind.jsonschema.JsonSchema.getDefaultSchemaNode();
    Object v12 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v11));
    Object v13 = com.fasterxml.jackson.core.JsonToken.END_ARRAY;
    Object v14 = "Can not construct SimpleType for a Map (clQass: ";
    Object v15 = ((com.fasterxml.jackson.databind.DeserializationContext)v10).wrongTokenException(((com.fasterxml.jackson.core.JsonParser)v12),((com.fasterxml.jackson.core.JsonToken)v13),((java.lang.String)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.CollectionType.construct(((java.lang.Class)v17),((com.fasterxml.jackson.databind.JavaType)v18));
    Object v20 = null;
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v21),((com.fasterxml.jackson.databind.JavaType)v22));
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v24));
    Object v26 = null;
    Object v27 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v25),((com.fasterxml.jackson.databind.cfg.MapperConfig)v26));
    Object v28 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v20),((com.fasterxml.jackson.databind.JavaType)v23),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v27));
    Object v29 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).createCollectionDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v10),((com.fasterxml.jackson.databind.type.CollectionType)v19),((com.fasterxml.jackson.databind.BeanDescription)v28));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers();
    Object v9 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = null;
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.JavaType)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = null;
    Object v21 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v19),((com.fasterxml.jackson.databind.cfg.MapperConfig)v20));
    Object v22 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v14),((com.fasterxml.jackson.databind.JavaType)v17),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v21));
    Object v23 = ((com.fasterxml.jackson.databind.BeanDescription)v22).getClassAnnotations();
    Object v24 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v9).findDefaultDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v12),((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.BeanDescription)v22));
    org.junit.Assert.assertNotNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers();
    Object v9 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.CollectionType.construct(((java.lang.Class)v14),((com.fasterxml.jackson.databind.JavaType)v15));
    Object v17 = null;
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v18),((com.fasterxml.jackson.databind.JavaType)v19));
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v21));
    Object v23 = null;
    Object v24 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v22),((com.fasterxml.jackson.databind.cfg.MapperConfig)v23));
    Object v25 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v17),((com.fasterxml.jackson.databind.JavaType)v20),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v24));
    Object v26 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v9).createCollectionLikeDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v12),((com.fasterxml.jackson.databind.type.CollectionLikeType)v16),((com.fasterxml.jackson.databind.BeanDescription)v25));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v6 = new com.fasterxml.jackson.databind.ext.CoreXMLDeserializers();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).withAdditionalDeserializers(((com.fasterxml.jackson.databind.deser.Deserializers)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.JavaType)v12));
    Object v14 = null;
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.JavaType)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = null;
    Object v21 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v19),((com.fasterxml.jackson.databind.cfg.MapperConfig)v20));
    Object v22 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v14),((com.fasterxml.jackson.databind.JavaType)v17),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v21));
    Object v23 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).findDefaultDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v10),((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.BeanDescription)v22));
    org.junit.Assert.assertNotNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers();
    Object v9 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v9).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v6 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v7 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v8 = com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std.defaultInstance();
    Object v9 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseWithUnderscoresStrategy();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v11 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v12 = java.text.DateFormat.getTimeInstance();
    Object v13 = null;
    Object v14 = java.util.Locale.getDefault();
    Object v15 = ")";
    Object v16 = java.util.TimeZone.getTimeZone(((java.lang.String)v15));
    Object v17 = null;
    Object v18 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v6),((com.fasterxml.jackson.databind.AnnotationIntrospector)v7),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v8),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v9),((com.fasterxml.jackson.databind.type.TypeFactory)v10),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v11),((java.text.DateFormat)v12),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v13),((java.util.Locale)v14),((java.util.TimeZone)v16),((com.fasterxml.jackson.core.Base64Variant)v17));
    Object v19 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v22 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v23 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v18),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v19),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v20),((com.fasterxml.jackson.databind.util.RootNameLookup)v21),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v22));
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v24));
    Object v26 = null;
    Object v27 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v25),((com.fasterxml.jackson.databind.cfg.MapperConfig)v26));
    Object v28 = new com.fasterxml.jackson.databind.util.ObjectBuffer();
    Object v29 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5)._valueInstantiatorInstance(((com.fasterxml.jackson.databind.DeserializationConfig)v23),((com.fasterxml.jackson.databind.introspect.Annotated)v27),((java.lang.Object)v28));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers();
    Object v9 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v9).isPotentialBeanType(((java.lang.Class)v11));
    org.junit.Assert.assertEquals((Object)(true), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers();
    Object v9 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v18 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v16),((com.fasterxml.jackson.databind.JavaType[])v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.JavaType)v20));
    Object v22 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v23),((com.fasterxml.jackson.databind.JavaType)v24));
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v27 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v14),((com.fasterxml.jackson.databind.type.TypeBindings)v18),((com.fasterxml.jackson.databind.JavaType)v21),((com.fasterxml.jackson.databind.JavaType[])v22),((com.fasterxml.jackson.databind.JavaType)v25),((com.fasterxml.jackson.databind.JavaType)v26));
    Object v28 = null;
    Object v29 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v30 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v31 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v29),((com.fasterxml.jackson.databind.JavaType)v30));
    Object v32 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v33 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v32));
    Object v34 = null;
    Object v35 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v33),((com.fasterxml.jackson.databind.cfg.MapperConfig)v34));
    Object v36 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v28),((com.fasterxml.jackson.databind.JavaType)v31),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v35));
    Object v37 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v9).createMapLikeDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v12),((com.fasterxml.jackson.databind.type.MapLikeType)v27),((com.fasterxml.jackson.databind.BeanDescription)v36));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v7).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers();
    Object v11 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v9).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v10));
    Object v12 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v13 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v12));
    Object v14 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = null;
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v17),((com.fasterxml.jackson.databind.JavaType)v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = null;
    Object v23 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v21),((com.fasterxml.jackson.databind.cfg.MapperConfig)v22));
    Object v24 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v16),((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v23));
    Object v25 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v9).buildBuilderBasedDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v14),((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.BeanDescription)v24));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v6 = new com.fasterxml.jackson.databind.ext.CoreXMLDeserializers();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).withAdditionalDeserializers(((com.fasterxml.jackson.databind.deser.Deserializers)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = "'X";
    Object v12 = new java.lang.Object[]{};
    Object v13 = ((com.fasterxml.jackson.databind.DeserializationContext)v10).mappingException(((java.lang.String)v11),((java.lang.Object[])v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = ((com.fasterxml.jackson.core.type.ResolvedType)v14).toCanonical();
    Object v16 = null;
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v17),((com.fasterxml.jackson.databind.JavaType)v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = null;
    Object v23 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v21),((com.fasterxml.jackson.databind.cfg.MapperConfig)v22));
    Object v24 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v16),((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v23));
    Object v25 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v7).materializeAbstractType(((com.fasterxml.jackson.databind.DeserializationContext)v10),((com.fasterxml.jackson.databind.JavaType)v14),((com.fasterxml.jackson.databind.BeanDescription)v24));
    org.junit.Assert.assertNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v16 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v14),((com.fasterxml.jackson.databind.JavaType[])v15));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v17),((com.fasterxml.jackson.databind.JavaType)v18));
    Object v20 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v21),((com.fasterxml.jackson.databind.JavaType)v22));
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v12),((com.fasterxml.jackson.databind.type.TypeBindings)v16),((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.JavaType[])v20),((com.fasterxml.jackson.databind.JavaType)v23),((com.fasterxml.jackson.databind.JavaType)v24));
    Object v26 = null;
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v29 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v27),((com.fasterxml.jackson.databind.JavaType)v28));
    Object v30 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v31 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v30));
    Object v32 = null;
    Object v33 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v31),((com.fasterxml.jackson.databind.cfg.MapperConfig)v32));
    Object v34 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v26),((com.fasterxml.jackson.databind.JavaType)v29),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v33));
    Object v35 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).createMapDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v10),((com.fasterxml.jackson.databind.type.MapType)v25),((com.fasterxml.jackson.databind.BeanDescription)v34));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers();
    Object v9 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v8));
    Object v10 = new com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver();
    Object v11 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v9).withAbstractTypeResolver(((com.fasterxml.jackson.databind.AbstractTypeResolver)v10));
    Object v12 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v13 = new com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver();
    Object v14 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v12).withAbstractTypeResolver(((com.fasterxml.jackson.databind.AbstractTypeResolver)v13));
    Object v15 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v9).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v12));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v6 = new com.fasterxml.jackson.databind.ext.CoreXMLDeserializers();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).withAdditionalDeserializers(((com.fasterxml.jackson.databind.deser.Deserializers)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v16 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v14),((com.fasterxml.jackson.databind.JavaType[])v15));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v17),((com.fasterxml.jackson.databind.JavaType)v18));
    Object v20 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v21),((com.fasterxml.jackson.databind.JavaType)v22));
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v12),((com.fasterxml.jackson.databind.type.TypeBindings)v16),((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.JavaType[])v20),((com.fasterxml.jackson.databind.JavaType)v23),((com.fasterxml.jackson.databind.JavaType)v24));
    Object v26 = null;
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v29 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v27),((com.fasterxml.jackson.databind.JavaType)v28));
    Object v30 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v31 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v30));
    Object v32 = null;
    Object v33 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v31),((com.fasterxml.jackson.databind.cfg.MapperConfig)v32));
    Object v34 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v26),((com.fasterxml.jackson.databind.JavaType)v29),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v33));
    Object v35 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).createMapLikeDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v10),((com.fasterxml.jackson.databind.type.MapLikeType)v25),((com.fasterxml.jackson.databind.BeanDescription)v34));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers();
    Object v9 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v18 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v16),((com.fasterxml.jackson.databind.JavaType[])v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.JavaType)v20));
    Object v22 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v23),((com.fasterxml.jackson.databind.JavaType)v24));
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v27 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v14),((com.fasterxml.jackson.databind.type.TypeBindings)v18),((com.fasterxml.jackson.databind.JavaType)v21),((com.fasterxml.jackson.databind.JavaType[])v22),((com.fasterxml.jackson.databind.JavaType)v25),((com.fasterxml.jackson.databind.JavaType)v26));
    Object v28 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v9).createKeyDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v12),((com.fasterxml.jackson.databind.JavaType)v27));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.ext.CoreXMLDeserializers();
    Object v9 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).withAdditionalDeserializers(((com.fasterxml.jackson.databind.deser.Deserializers)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = "G";
    Object v14 = new java.lang.Object[]{null,null};
    Object v15 = ((com.fasterxml.jackson.databind.DeserializationContext)v12).mappingException(((java.lang.String)v13),((java.lang.Object[])v14));
    Object v16 = null;
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v17),((com.fasterxml.jackson.databind.JavaType)v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = null;
    Object v23 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v21),((com.fasterxml.jackson.databind.cfg.MapperConfig)v22));
    Object v24 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v16),((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v23));
    Object v25 = null;
    Object v26 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v27 = true;
    Object v28 = "";
    Object v29 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v28));
    Object v30 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v25),((com.fasterxml.jackson.databind.AnnotationIntrospector)v26),(((java.lang.Boolean)v27).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v29));
    Object v31 = ((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v30).getMetadata();
    Object v32 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v7).constructSetterlessProperty(((com.fasterxml.jackson.databind.DeserializationContext)v12),((com.fasterxml.jackson.databind.BeanDescription)v24),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v30));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v7).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.JavaType)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = ((com.fasterxml.jackson.databind.DatabindContext)v12).constructSpecializedType(((com.fasterxml.jackson.databind.JavaType)v15),((java.lang.Class)v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = null;
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v21),((com.fasterxml.jackson.databind.JavaType)v22));
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v24));
    Object v26 = null;
    Object v27 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v25),((com.fasterxml.jackson.databind.cfg.MapperConfig)v26));
    Object v28 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v20),((com.fasterxml.jackson.databind.JavaType)v23),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v27));
    Object v29 = ((com.fasterxml.jackson.databind.BeanDescription)v28).getClassInfo();
    Object v30 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v9).createEnumDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v12),((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.BeanDescription)v28));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = "X";
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = "string";
    Object v15 = ((com.fasterxml.jackson.databind.DeserializationContext)v10).weirdStringException(((java.lang.String)v11),((java.lang.Class)v13),((java.lang.String)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.CollectionType.construct(((java.lang.Class)v17),((com.fasterxml.jackson.databind.JavaType)v18));
    Object v20 = null;
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v21),((com.fasterxml.jackson.databind.JavaType)v22));
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v24));
    Object v26 = null;
    Object v27 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v25),((com.fasterxml.jackson.databind.cfg.MapperConfig)v26));
    Object v28 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v20),((com.fasterxml.jackson.databind.JavaType)v23),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v27));
    Object v29 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).createCollectionDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v10),((com.fasterxml.jackson.databind.type.CollectionType)v19),((com.fasterxml.jackson.databind.BeanDescription)v28));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v7).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.CollectionType.construct(((java.lang.Class)v14),((com.fasterxml.jackson.databind.JavaType)v15));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v17));
    Object v19 = ((com.fasterxml.jackson.databind.type.TypeBase)v16).findSuperType(((java.lang.Class)v18));
    Object v20 = null;
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v21),((com.fasterxml.jackson.databind.JavaType)v22));
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v24));
    Object v26 = null;
    Object v27 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v25),((com.fasterxml.jackson.databind.cfg.MapperConfig)v26));
    Object v28 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v20),((com.fasterxml.jackson.databind.JavaType)v23),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v27));
    Object v29 = ((com.fasterxml.jackson.databind.BeanDescription)v28).findJsonValueMethod();
    Object v30 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v9).createCollectionDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v12),((com.fasterxml.jackson.databind.type.CollectionType)v16),((com.fasterxml.jackson.databind.BeanDescription)v28));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers();
    Object v9 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.JavaType)v14));
    Object v16 = "'<";
    Object v17 = "Can";
    Object v18 = ((com.fasterxml.jackson.databind.DeserializationContext)v12).unknownTypeException(((com.fasterxml.jackson.databind.JavaType)v15),((java.lang.String)v16),((java.lang.String)v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.JavaType)v20));
    Object v22 = null;
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v23),((com.fasterxml.jackson.databind.JavaType)v24));
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v26));
    Object v28 = null;
    Object v29 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v27),((com.fasterxml.jackson.databind.cfg.MapperConfig)v28));
    Object v30 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v22),((com.fasterxml.jackson.databind.JavaType)v25),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v29));
    Object v31 = ((com.fasterxml.jackson.databind.BeanDescription)v30).getClassInfo();
    Object v32 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v9).createReferenceDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v12),((com.fasterxml.jackson.databind.type.ReferenceType)v21),((com.fasterxml.jackson.databind.BeanDescription)v30));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers();
    Object v9 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v14));
    Object v16 = ((com.fasterxml.jackson.databind.JavaType)v13).findSuperType(((java.lang.Class)v15));
    Object v17 = null;
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v18),((com.fasterxml.jackson.databind.JavaType)v19));
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v21));
    Object v23 = null;
    Object v24 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v22),((com.fasterxml.jackson.databind.cfg.MapperConfig)v23));
    Object v25 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v17),((com.fasterxml.jackson.databind.JavaType)v20),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v24));
    Object v26 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v9).materializeAbstractType(((com.fasterxml.jackson.databind.DeserializationContext)v12),((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.BeanDescription)v25));
    org.junit.Assert.assertNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v7).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.ext.CoreXMLDeserializers();
    Object v11 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v9).withAdditionalDeserializers(((com.fasterxml.jackson.databind.deser.Deserializers)v10));
    Object v12 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v13 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v12));
    Object v14 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = null;
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v17),((com.fasterxml.jackson.databind.JavaType)v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = null;
    Object v23 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v21),((com.fasterxml.jackson.databind.cfg.MapperConfig)v22));
    Object v24 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v16),((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v23));
    Object v25 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v9).createEnumDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v14),((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.BeanDescription)v24));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers();
    Object v9 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v9).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v13 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v12));
    Object v14 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.JavaType)v16));
    Object v18 = null;
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.JavaType)v20));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v22));
    Object v24 = null;
    Object v25 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v23),((com.fasterxml.jackson.databind.cfg.MapperConfig)v24));
    Object v26 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v18),((com.fasterxml.jackson.databind.JavaType)v21),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v25));
    Object v27 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v11).createReferenceDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v14),((com.fasterxml.jackson.databind.type.ReferenceType)v17),((com.fasterxml.jackson.databind.BeanDescription)v26));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers();
    Object v9 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers();
    Object v11 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v9).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers();
    Object v9 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v9).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v13 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v12));
    Object v14 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = new java.util.concurrent.atomic.AtomicReference();
    Object v17 = ((com.fasterxml.jackson.databind.DeserializationContext)v14).hasValueDeserializerFor(((com.fasterxml.jackson.databind.JavaType)v15),((java.util.concurrent.atomic.AtomicReference)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.CollectionType.construct(((java.lang.Class)v19),((com.fasterxml.jackson.databind.JavaType)v20));
    Object v22 = null;
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v23),((com.fasterxml.jackson.databind.JavaType)v24));
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v26));
    Object v28 = null;
    Object v29 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v27),((com.fasterxml.jackson.databind.cfg.MapperConfig)v28));
    Object v30 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v22),((com.fasterxml.jackson.databind.JavaType)v25),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v29));
    Object v31 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v11).createCollectionLikeDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v14),((com.fasterxml.jackson.databind.type.CollectionLikeType)v21),((com.fasterxml.jackson.databind.BeanDescription)v30));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = null;
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.JavaType)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = null;
    Object v18 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v16),((com.fasterxml.jackson.databind.cfg.MapperConfig)v17));
    Object v19 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v11),((com.fasterxml.jackson.databind.JavaType)v14),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v18));
    Object v20 = null;
    Object v21 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v22 = true;
    Object v23 = "";
    Object v24 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v23));
    Object v25 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v20),((com.fasterxml.jackson.databind.AnnotationIntrospector)v21),(((java.lang.Boolean)v22).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v24));
    Object v26 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v5).constructSetterlessProperty(((com.fasterxml.jackson.databind.DeserializationContext)v10),((com.fasterxml.jackson.databind.BeanDescription)v19),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v25));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v6 = new com.fasterxml.jackson.databind.ext.CoreXMLDeserializers();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).withAdditionalDeserializers(((com.fasterxml.jackson.databind.deser.Deserializers)v6));
    Object v8 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v9 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.JavaType)v12));
    Object v14 = null;
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.JavaType)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = null;
    Object v21 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v19),((com.fasterxml.jackson.databind.cfg.MapperConfig)v20));
    Object v22 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v14),((com.fasterxml.jackson.databind.JavaType)v17),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v21));
    Object v23 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).createEnumDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v10),((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.BeanDescription)v22));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v5).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers();
    Object v9 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = null;
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.JavaType)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = null;
    Object v21 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v19),((com.fasterxml.jackson.databind.cfg.MapperConfig)v20));
    Object v22 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v14),((com.fasterxml.jackson.databind.JavaType)v17),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v21));
    ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v9).checkIllegalTypes(((com.fasterxml.jackson.databind.DeserializationContext)v12),((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.BeanDescription)v22));
    Object v23 = null;
    org.junit.Assert.assertNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v14 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v12),((com.fasterxml.jackson.databind.JavaType[])v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.JavaType)v16));
    Object v18 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.JavaType)v20));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v10),((com.fasterxml.jackson.databind.type.TypeBindings)v14),((com.fasterxml.jackson.databind.JavaType)v17),((com.fasterxml.jackson.databind.JavaType[])v18),((com.fasterxml.jackson.databind.JavaType)v21),((com.fasterxml.jackson.databind.JavaType)v22));
    Object v24 = ((com.fasterxml.jackson.databind.JavaType)v23).getGenericSignature();
    Object v25 = null;
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v28 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v26),((com.fasterxml.jackson.databind.JavaType)v27));
    Object v29 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v30 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v29));
    Object v31 = null;
    Object v32 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v30),((com.fasterxml.jackson.databind.cfg.MapperConfig)v31));
    Object v33 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v25),((com.fasterxml.jackson.databind.JavaType)v28),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v32));
    Object v34 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).createMapDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v8),((com.fasterxml.jackson.databind.type.MapType)v23),((com.fasterxml.jackson.databind.BeanDescription)v33));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v3 = new com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers();
    Object v4 = ((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2).withAdditionalKeyDeserializers(((com.fasterxml.jackson.databind.deser.KeyDeserializers)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.BeanDeserializerFactory)v1).withConfig(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v2));
    Object v6 = new com.fasterxml.jackson.databind.module.SimpleValueInstantiators();
    Object v7 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v5).withValueInstantiators(((com.fasterxml.jackson.databind.deser.ValueInstantiators)v6));
    Object v8 = new com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver();
    Object v9 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).withAbstractTypeResolver(((com.fasterxml.jackson.databind.AbstractTypeResolver)v8));
    Object v10 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v11 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.CollectionType.construct(((java.lang.Class)v14),((com.fasterxml.jackson.databind.JavaType)v15));
    Object v17 = null;
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = com.fasterxml.jackson.databind.type.ReferenceType.upgradeFrom(((com.fasterxml.jackson.databind.JavaType)v18),((com.fasterxml.jackson.databind.JavaType)v19));
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v21));
    Object v23 = null;
    Object v24 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v22),((com.fasterxml.jackson.databind.cfg.MapperConfig)v23));
    Object v25 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v17),((com.fasterxml.jackson.databind.JavaType)v20),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v24));
    Object v26 = ((com.fasterxml.jackson.databind.deser.BasicDeserializerFactory)v7).createCollectionDeserializer(((com.fasterxml.jackson.databind.DeserializationContext)v12),((com.fasterxml.jackson.databind.type.CollectionType)v16),((com.fasterxml.jackson.databind.BeanDescription)v25));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }
}
