package com.fasterxml.jackson.databind.deser.impl;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.type.TypeFactory)v1));
    Object v3 = "AnnotationIntrospector returned serializer definition of type ";
    Object v4 = null;
    Object v5 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v6 = true;
    Object v7 = "Cannot use Object Id with Builder-based deserialization (type ";
    Object v8 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v7));
    Object v9 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v4),((com.fasterxml.jackson.databind.AnnotationIntrospector)v5),(((java.lang.Boolean)v6).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v8));
    Object v10 = com.fasterxml.jackson.databind.introspect.AnnotationCollector.emptyAnnotations();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v3),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v9),((com.fasterxml.jackson.databind.util.Annotations)v10),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = ")";
    Object v14 = "false";
    Object v15 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v12),((com.fasterxml.jackson.databind.util.NameTransformer)v15));
    Object v17 = new com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v2),((com.fasterxml.jackson.databind.BeanProperty)v16));
    Object v18 = "AnnotationIntrospector returned serializer definition of type ";
    Object v19 = null;
    Object v20 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v21 = true;
    Object v22 = "Cannot use Object Id with Builder-based deserialization (type ";
    Object v23 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v22));
    Object v24 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v19),((com.fasterxml.jackson.databind.AnnotationIntrospector)v20),(((java.lang.Boolean)v21).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v23));
    Object v25 = com.fasterxml.jackson.databind.introspect.AnnotationCollector.emptyAnnotations();
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v27 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v18),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v24),((com.fasterxml.jackson.databind.util.Annotations)v25),((com.fasterxml.jackson.databind.JavaType)v26));
    Object v28 = ")";
    Object v29 = "false";
    Object v30 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v28),((java.lang.String)v29));
    Object v31 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v27),((com.fasterxml.jackson.databind.util.NameTransformer)v30));
    Object v32 = new com.fasterxml.jackson.databind.ser.std.MapProperty(((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v17),((com.fasterxml.jackson.databind.BeanProperty)v31));
    Object v33 = ((com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase)v32).isRequired();
    org.junit.Assert.assertEquals((Object)(false), v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = true;
    Object v3 = "Cannot use Object Id with Builder-based deserialization (type ";
    Object v4 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v3));
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = null;
    Object v9 = "0";
    Object v10 = true;
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.AnnotationCollector.emptyAnnotations();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v15));
    Object v17 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v18 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v16),((com.fasterxml.jackson.databind.JavaType[])v17));
    Object v19 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v14),((com.fasterxml.jackson.databind.type.TypeBindings)v18));
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotatedField(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v19),((java.lang.reflect.Field)v20),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v21));
    Object v23 = new com.fasterxml.jackson.databind.deser.impl.FieldProperty(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v12),((com.fasterxml.jackson.databind.util.Annotations)v13),((com.fasterxml.jackson.databind.introspect.AnnotatedField)v22));
    Object v24 = "Cannot use Object Id with Builder-based deserialization (type ";
    Object v25 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v24));
    Object v26 = new com.fasterxml.jackson.databind.deser.impl.FieldProperty(((com.fasterxml.jackson.databind.deser.impl.FieldProperty)v23),((com.fasterxml.jackson.databind.PropertyName)v25));
    Object v27 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v26).toString();
    Object v28 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v29 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v28));
    Object v30 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor.Base(((com.fasterxml.jackson.databind.SerializerProvider)v29));
    Object v31 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v32 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v31));
    ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v26).depositSchemaProperty(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor)v30),((com.fasterxml.jackson.databind.SerializerProvider)v32));
    Object v33 = null;
    org.junit.Assert.assertNull(v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = true;
    Object v3 = "Cannot use Object Id with Builder-based deserialization (type ";
    Object v4 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v3));
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = null;
    Object v9 = "0";
    Object v10 = true;
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.AnnotationCollector.emptyAnnotations();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v15));
    Object v17 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v18 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v16),((com.fasterxml.jackson.databind.JavaType[])v17));
    Object v19 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v14),((com.fasterxml.jackson.databind.type.TypeBindings)v18));
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotatedField(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v19),((java.lang.reflect.Field)v20),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v21));
    Object v23 = new com.fasterxml.jackson.databind.deser.impl.FieldProperty(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v12),((com.fasterxml.jackson.databind.util.Annotations)v13),((com.fasterxml.jackson.databind.introspect.AnnotatedField)v22));
    Object v24 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v23).hasViews();
    org.junit.Assert.assertEquals((Object)(false), v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = "AnnotationIntrospector returned serializer definition of type ";
    Object v1 = null;
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = true;
    Object v4 = "Cannot use Object Id with Builder-based deserialization (type ";
    Object v5 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),(((java.lang.Boolean)v3).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v5));
    Object v7 = com.fasterxml.jackson.databind.introspect.AnnotationCollector.emptyAnnotations();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v0),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v6),((com.fasterxml.jackson.databind.util.Annotations)v7),((com.fasterxml.jackson.databind.JavaType)v8));
    Object v10 = ")";
    Object v11 = "false";
    Object v12 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v9),((com.fasterxml.jackson.databind.util.NameTransformer)v12));
    Object v14 = ((com.fasterxml.jackson.databind.BeanProperty)v13).getFullName();
    Object v15 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v16 = ((com.fasterxml.jackson.databind.AnnotationIntrospector)v15).allIntrospectors();
    Object v17 = ((com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase)v13).findFormatOverrides(((com.fasterxml.jackson.databind.AnnotationIntrospector)v15));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = true;
    Object v3 = "Cannot use Object Id with Builder-based deserialization (type ";
    Object v4 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v3));
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = null;
    Object v9 = "0";
    Object v10 = true;
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.AnnotationCollector.emptyAnnotations();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v15));
    Object v17 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v18 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v16),((com.fasterxml.jackson.databind.JavaType[])v17));
    Object v19 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v14),((com.fasterxml.jackson.databind.type.TypeBindings)v18));
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotatedField(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v19),((java.lang.reflect.Field)v20),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v21));
    Object v23 = new com.fasterxml.jackson.databind.deser.impl.FieldProperty(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v12),((com.fasterxml.jackson.databind.util.Annotations)v13),((com.fasterxml.jackson.databind.introspect.AnnotatedField)v22));
    Object v24 = ")";
    Object v25 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v23).withSimpleName(((java.lang.String)v24));
    org.junit.Assert.assertNotNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = true;
    Object v3 = "Cannot use Object Id with Builder-based deserialization (type ";
    Object v4 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v3));
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = null;
    Object v9 = "0";
    Object v10 = true;
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.AnnotationCollector.emptyAnnotations();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v15));
    Object v17 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v18 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v16),((com.fasterxml.jackson.databind.JavaType[])v17));
    Object v19 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v14),((com.fasterxml.jackson.databind.type.TypeBindings)v18));
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotatedField(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v19),((java.lang.reflect.Field)v20),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v21));
    Object v23 = new com.fasterxml.jackson.databind.deser.impl.FieldProperty(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v12),((com.fasterxml.jackson.databind.util.Annotations)v13),((com.fasterxml.jackson.databind.introspect.AnnotatedField)v22));
    Object v24 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v25 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v24));
    Object v26 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor.Base(((com.fasterxml.jackson.databind.SerializerProvider)v25));
    Object v27 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v28 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v27));
    ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v23).depositSchemaProperty(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor)v26),((com.fasterxml.jackson.databind.SerializerProvider)v28));
    Object v29 = null;
    org.junit.Assert.assertNull(v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = true;
    Object v3 = "Cannot use Object Id with Builder-based deserialization (type ";
    Object v4 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v3));
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = null;
    Object v9 = "0";
    Object v10 = true;
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.AnnotationCollector.emptyAnnotations();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v15));
    Object v17 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v18 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v16),((com.fasterxml.jackson.databind.JavaType[])v17));
    Object v19 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v14),((com.fasterxml.jackson.databind.type.TypeBindings)v18));
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotatedField(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v19),((java.lang.reflect.Field)v20),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v21));
    Object v23 = new com.fasterxml.jackson.databind.deser.impl.FieldProperty(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v12),((com.fasterxml.jackson.databind.util.Annotations)v13),((com.fasterxml.jackson.databind.introspect.AnnotatedField)v22));
    Object v24 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v25 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty(((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v23),((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v24));
    Object v26 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v27 = ")";
    Object v28 = "false";
    Object v29 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v27),((java.lang.String)v28));
    Object v30 = ((com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty)v25).setAndReturn(((java.lang.Object)v26),((java.lang.Object)v29));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = true;
    Object v3 = "Cannot use Object Id with Builder-based deserialization (type ";
    Object v4 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v3));
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = null;
    Object v9 = "0";
    Object v10 = true;
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.AnnotationCollector.emptyAnnotations();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v15));
    Object v17 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v18 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v16),((com.fasterxml.jackson.databind.JavaType[])v17));
    Object v19 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v14),((com.fasterxml.jackson.databind.type.TypeBindings)v18));
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotatedField(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v19),((java.lang.reflect.Field)v20),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v21));
    Object v23 = new com.fasterxml.jackson.databind.deser.impl.FieldProperty(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v12),((com.fasterxml.jackson.databind.util.Annotations)v13),((com.fasterxml.jackson.databind.introspect.AnnotatedField)v22));
    Object v24 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v23).getWrapperName();
    org.junit.Assert.assertNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = true;
    Object v3 = "Cannot use Object Id with Builder-based deserialization (type ";
    Object v4 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v3));
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = null;
    Object v9 = "0";
    Object v10 = true;
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.AnnotationCollector.emptyAnnotations();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v15));
    Object v17 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v18 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v16),((com.fasterxml.jackson.databind.JavaType[])v17));
    Object v19 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v14),((com.fasterxml.jackson.databind.type.TypeBindings)v18));
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotatedField(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v19),((java.lang.reflect.Field)v20),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v21));
    Object v23 = new com.fasterxml.jackson.databind.deser.impl.FieldProperty(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v12),((com.fasterxml.jackson.databind.util.Annotations)v13),((com.fasterxml.jackson.databind.introspect.AnnotatedField)v22));
    Object v24 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v25 = ((com.fasterxml.jackson.databind.AnnotationIntrospector)v24).version();
    Object v26 = ((com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase)v23).findFormatOverrides(((com.fasterxml.jackson.databind.AnnotationIntrospector)v24));
    org.junit.Assert.assertNotNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = "AnnotationIntrospector returned serializer definition of type ";
    Object v1 = null;
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = true;
    Object v4 = "Cannot use Object Id with Builder-based deserialization (type ";
    Object v5 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),(((java.lang.Boolean)v3).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v5));
    Object v7 = com.fasterxml.jackson.databind.introspect.AnnotationCollector.emptyAnnotations();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v0),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v6),((com.fasterxml.jackson.databind.util.Annotations)v7),((com.fasterxml.jackson.databind.JavaType)v8));
    Object v10 = ")";
    Object v11 = "false";
    Object v12 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v9),((com.fasterxml.jackson.databind.util.NameTransformer)v12));
    Object v14 = null;
    Object v15 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v16 = null;
    Object v17 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v18 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v19 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v14),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v15),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v16),((com.fasterxml.jackson.databind.util.RootNameLookup)v17),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v18));
    Object v20 = ((com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase)v13).findAliases(((com.fasterxml.jackson.databind.cfg.MapperConfig)v19));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = true;
    Object v3 = "Cannot use Object Id with Builder-based deserialization (type ";
    Object v4 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v3));
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = null;
    Object v9 = "0";
    Object v10 = true;
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.AnnotationCollector.emptyAnnotations();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v15));
    Object v17 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v18 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v16),((com.fasterxml.jackson.databind.JavaType[])v17));
    Object v19 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v14),((com.fasterxml.jackson.databind.type.TypeBindings)v18));
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotatedField(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v19),((java.lang.reflect.Field)v20),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v21));
    Object v23 = new com.fasterxml.jackson.databind.deser.impl.FieldProperty(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v12),((com.fasterxml.jackson.databind.util.Annotations)v13),((com.fasterxml.jackson.databind.introspect.AnnotatedField)v22));
    Object v24 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v25 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty(((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v23),((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v24));
    Object v26 = "Null SerializerProvider passed for ";
    ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v25).setManagedReferenceName(((java.lang.String)v26));
    Object v27 = null;
    Object v28 = com.fasterxml.jackson.databind.node.BooleanNode.getFalse();
    Object v29 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v28));
    Object v30 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v31 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v30));
    Object v32 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v31));
    Object v33 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v25).deserialize(((com.fasterxml.jackson.core.JsonParser)v29),((com.fasterxml.jackson.databind.DeserializationContext)v32));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = true;
    Object v3 = "Cannot use Object Id with Builder-based deserialization (type ";
    Object v4 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v3));
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = null;
    Object v9 = "0";
    Object v10 = true;
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.AnnotationCollector.emptyAnnotations();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v15));
    Object v17 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v18 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v16),((com.fasterxml.jackson.databind.JavaType[])v17));
    Object v19 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v14),((com.fasterxml.jackson.databind.type.TypeBindings)v18));
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotatedField(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v19),((java.lang.reflect.Field)v20),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v21));
    Object v23 = new com.fasterxml.jackson.databind.deser.impl.FieldProperty(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v12),((com.fasterxml.jackson.databind.util.Annotations)v13),((com.fasterxml.jackson.databind.introspect.AnnotatedField)v22));
    Object v24 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v25 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty(((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v23),((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v24));
    Object v26 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v27 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v26));
    Object v28 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor.Base(((com.fasterxml.jackson.databind.SerializerProvider)v27));
    Object v29 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v30 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v29));
    ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v25).depositSchemaProperty(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor)v28),((com.fasterxml.jackson.databind.SerializerProvider)v30));
    Object v31 = null;
    Object v32 = com.fasterxml.jackson.databind.node.BooleanNode.getFalse();
    Object v33 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v32));
    Object v34 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v35 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v34));
    Object v36 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v35));
    Object v37 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v38 = ((com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty)v25).deserializeSetAndReturn(((com.fasterxml.jackson.core.JsonParser)v33),((com.fasterxml.jackson.databind.DeserializationContext)v36),((java.lang.Object)v37));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = true;
    Object v3 = "Cannot use Object Id with Builder-based deserialization (type ";
    Object v4 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v3));
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = null;
    Object v9 = "0";
    Object v10 = true;
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.AnnotationCollector.emptyAnnotations();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v15));
    Object v17 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v18 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v16),((com.fasterxml.jackson.databind.JavaType[])v17));
    Object v19 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v14),((com.fasterxml.jackson.databind.type.TypeBindings)v18));
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotatedField(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v19),((java.lang.reflect.Field)v20),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v21));
    Object v23 = new com.fasterxml.jackson.databind.deser.impl.FieldProperty(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v12),((com.fasterxml.jackson.databind.util.Annotations)v13),((com.fasterxml.jackson.databind.introspect.AnnotatedField)v22));
    Object v24 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v25 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty(((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v23),((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v24));
    Object v26 = new java.lang.Class[]{null};
    ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v25).setViews(((java.lang.Class[])v26));
    Object v27 = null;
    Object v28 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v25).hasViews();
    org.junit.Assert.assertEquals((Object)(true), v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = true;
    Object v3 = "Cannot use Object Id with Builder-based deserialization (type ";
    Object v4 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v3));
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = null;
    Object v9 = "0";
    Object v10 = true;
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.AnnotationCollector.emptyAnnotations();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v15));
    Object v17 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v18 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v16),((com.fasterxml.jackson.databind.JavaType[])v17));
    Object v19 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v14),((com.fasterxml.jackson.databind.type.TypeBindings)v18));
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotatedField(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v19),((java.lang.reflect.Field)v20),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v21));
    Object v23 = new com.fasterxml.jackson.databind.deser.impl.FieldProperty(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v12),((com.fasterxml.jackson.databind.util.Annotations)v13),((com.fasterxml.jackson.databind.introspect.AnnotatedField)v22));
    Object v24 = "Cannot use Object Id with Builder-based deserialization (type ";
    Object v25 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v24));
    Object v26 = new com.fasterxml.jackson.databind.deser.impl.FieldProperty(((com.fasterxml.jackson.databind.deser.impl.FieldProperty)v23),((com.fasterxml.jackson.databind.PropertyName)v25));
    Object v27 = com.fasterxml.jackson.databind.node.BooleanNode.getFalse();
    Object v28 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v27));
    Object v29 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v30 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v29));
    Object v31 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v30));
    Object v32 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v26).deserialize(((com.fasterxml.jackson.core.JsonParser)v28),((com.fasterxml.jackson.databind.DeserializationContext)v31));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = true;
    Object v3 = "Cannot use Object Id with Builder-based deserialization (type ";
    Object v4 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v3));
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = null;
    Object v9 = "0";
    Object v10 = true;
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.AnnotationCollector.emptyAnnotations();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v15));
    Object v17 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v18 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v16),((com.fasterxml.jackson.databind.JavaType[])v17));
    Object v19 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v14),((com.fasterxml.jackson.databind.type.TypeBindings)v18));
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotatedField(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v19),((java.lang.reflect.Field)v20),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v21));
    Object v23 = new com.fasterxml.jackson.databind.deser.impl.FieldProperty(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v12),((com.fasterxml.jackson.databind.util.Annotations)v13),((com.fasterxml.jackson.databind.introspect.AnnotatedField)v22));
    Object v24 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v25 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty(((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v23),((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v24));
    org.junit.Assert.assertNotNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = true;
    Object v3 = "Cannot use Object Id with Builder-based deserialization (type ";
    Object v4 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v3));
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = null;
    Object v9 = "0";
    Object v10 = true;
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.AnnotationCollector.emptyAnnotations();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v15));
    Object v17 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v18 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v16),((com.fasterxml.jackson.databind.JavaType[])v17));
    Object v19 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v14),((com.fasterxml.jackson.databind.type.TypeBindings)v18));
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotatedField(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v19),((java.lang.reflect.Field)v20),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v21));
    Object v23 = new com.fasterxml.jackson.databind.deser.impl.FieldProperty(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v12),((com.fasterxml.jackson.databind.util.Annotations)v13),((com.fasterxml.jackson.databind.introspect.AnnotatedField)v22));
    Object v24 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v25 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty(((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v23),((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v24));
    Object v26 = com.fasterxml.jackson.databind.node.BooleanNode.getFalse();
    Object v27 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v26));
    Object v28 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v29 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v28));
    Object v30 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v29));
    Object v31 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v25).deserialize(((com.fasterxml.jackson.core.JsonParser)v27),((com.fasterxml.jackson.databind.DeserializationContext)v30));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = true;
    Object v3 = "Cannot use Object Id with Builder-based deserialization (type ";
    Object v4 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v3));
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = null;
    Object v9 = "0";
    Object v10 = true;
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.AnnotationCollector.emptyAnnotations();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v15));
    Object v17 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v18 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v16),((com.fasterxml.jackson.databind.JavaType[])v17));
    Object v19 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v14),((com.fasterxml.jackson.databind.type.TypeBindings)v18));
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotatedField(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v19),((java.lang.reflect.Field)v20),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v21));
    Object v23 = new com.fasterxml.jackson.databind.deser.impl.FieldProperty(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v12),((com.fasterxml.jackson.databind.util.Annotations)v13),((com.fasterxml.jackson.databind.introspect.AnnotatedField)v22));
    Object v24 = "Cannot use Object Id with Builder-based deserialization (type ";
    Object v25 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v24));
    Object v26 = new com.fasterxml.jackson.databind.deser.impl.FieldProperty(((com.fasterxml.jackson.databind.deser.impl.FieldProperty)v23),((com.fasterxml.jackson.databind.PropertyName)v25));
    Object v27 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v26).hasViews();
    org.junit.Assert.assertEquals((Object)(false), v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = true;
    Object v3 = "Cannot use Object Id with Builder-based deserialization (type ";
    Object v4 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v3));
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = null;
    Object v9 = "0";
    Object v10 = true;
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.AnnotationCollector.emptyAnnotations();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v15));
    Object v17 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v18 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v16),((com.fasterxml.jackson.databind.JavaType[])v17));
    Object v19 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v14),((com.fasterxml.jackson.databind.type.TypeBindings)v18));
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotatedField(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v19),((java.lang.reflect.Field)v20),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v21));
    Object v23 = new com.fasterxml.jackson.databind.deser.impl.FieldProperty(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v12),((com.fasterxml.jackson.databind.util.Annotations)v13),((com.fasterxml.jackson.databind.introspect.AnnotatedField)v22));
    Object v24 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v25 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty(((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v23),((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v24));
    Object v26 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v25).getManagedReferenceName();
    org.junit.Assert.assertNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = true;
    Object v3 = "Cannot use Object Id with Builder-based deserialization (type ";
    Object v4 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v3));
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = null;
    Object v9 = "0";
    Object v10 = true;
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.AnnotationCollector.emptyAnnotations();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v15));
    Object v17 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v18 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v16),((com.fasterxml.jackson.databind.JavaType[])v17));
    Object v19 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v14),((com.fasterxml.jackson.databind.type.TypeBindings)v18));
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotatedField(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v19),((java.lang.reflect.Field)v20),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v21));
    Object v23 = new com.fasterxml.jackson.databind.deser.impl.FieldProperty(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v12),((com.fasterxml.jackson.databind.util.Annotations)v13),((com.fasterxml.jackson.databind.introspect.AnnotatedField)v22));
    Object v24 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v25 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty(((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v23),((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v24));
    Object v26 = ((com.fasterxml.jackson.databind.BeanProperty)v25).getMember();
    Object v27 = null;
    Object v28 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v29 = null;
    Object v30 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v31 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v32 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v27),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v28),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v29),((com.fasterxml.jackson.databind.util.RootNameLookup)v30),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v31));
    Object v33 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v34 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v33));
    Object v35 = ((com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase)v25).findPropertyFormat(((com.fasterxml.jackson.databind.cfg.MapperConfig)v32),((java.lang.Class)v34));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = true;
    Object v3 = "Cannot use Object Id with Builder-based deserialization (type ";
    Object v4 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v3));
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = null;
    Object v9 = "0";
    Object v10 = true;
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.AnnotationCollector.emptyAnnotations();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v15));
    Object v17 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v18 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v16),((com.fasterxml.jackson.databind.JavaType[])v17));
    Object v19 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v14),((com.fasterxml.jackson.databind.type.TypeBindings)v18));
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotatedField(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v19),((java.lang.reflect.Field)v20),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v21));
    Object v23 = new com.fasterxml.jackson.databind.deser.impl.FieldProperty(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v12),((com.fasterxml.jackson.databind.util.Annotations)v13),((com.fasterxml.jackson.databind.introspect.AnnotatedField)v22));
    Object v24 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v25 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty(((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v23),((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v24));
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v27 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v26));
    Object v28 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v25).getContextAnnotation(((java.lang.Class)v27));
    Object v29 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v25).hasViews();
    org.junit.Assert.assertEquals((Object)(false), v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = true;
    Object v3 = "Cannot use Object Id with Builder-based deserialization (type ";
    Object v4 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v3));
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = null;
    Object v9 = "0";
    Object v10 = true;
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.AnnotationCollector.emptyAnnotations();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v15));
    Object v17 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v18 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v16),((com.fasterxml.jackson.databind.JavaType[])v17));
    Object v19 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v14),((com.fasterxml.jackson.databind.type.TypeBindings)v18));
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotatedField(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v19),((java.lang.reflect.Field)v20),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v21));
    Object v23 = new com.fasterxml.jackson.databind.deser.impl.FieldProperty(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v12),((com.fasterxml.jackson.databind.util.Annotations)v13),((com.fasterxml.jackson.databind.introspect.AnnotatedField)v22));
    Object v24 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v25 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty(((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v23),((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v24));
    Object v26 = com.fasterxml.jackson.databind.node.BooleanNode.getFalse();
    Object v27 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v26));
    Object v28 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v29 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v28));
    Object v30 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v29));
    Object v31 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    ((com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty)v25).deserializeAndSet(((com.fasterxml.jackson.core.JsonParser)v27),((com.fasterxml.jackson.databind.DeserializationContext)v30),((java.lang.Object)v31));
    Object v32 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = true;
    Object v3 = "Cannot use Object Id with Builder-based deserialization (type ";
    Object v4 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v3));
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = null;
    Object v9 = "0";
    Object v10 = true;
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.AnnotationCollector.emptyAnnotations();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v15));
    Object v17 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v18 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v16),((com.fasterxml.jackson.databind.JavaType[])v17));
    Object v19 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v14),((com.fasterxml.jackson.databind.type.TypeBindings)v18));
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotatedField(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v19),((java.lang.reflect.Field)v20),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v21));
    Object v23 = new com.fasterxml.jackson.databind.deser.impl.FieldProperty(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v12),((com.fasterxml.jackson.databind.util.Annotations)v13),((com.fasterxml.jackson.databind.introspect.AnnotatedField)v22));
    Object v24 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v25 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty(((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v23),((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v24));
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v27 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v26));
    Object v28 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v25).visibleInView(((java.lang.Class)v27));
    org.junit.Assert.assertEquals((Object)(true), v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = true;
    Object v3 = "Cannot use Object Id with Builder-based deserialization (type ";
    Object v4 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v3));
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = null;
    Object v9 = "0";
    Object v10 = true;
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.AnnotationCollector.emptyAnnotations();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v15));
    Object v17 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v18 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v16),((com.fasterxml.jackson.databind.JavaType[])v17));
    Object v19 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v14),((com.fasterxml.jackson.databind.type.TypeBindings)v18));
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotatedField(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v19),((java.lang.reflect.Field)v20),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v21));
    Object v23 = new com.fasterxml.jackson.databind.deser.impl.FieldProperty(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v12),((com.fasterxml.jackson.databind.util.Annotations)v13),((com.fasterxml.jackson.databind.introspect.AnnotatedField)v22));
    Object v24 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v25 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty(((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v23),((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v24));
    Object v26 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v25).getValueDeserializer();
    org.junit.Assert.assertNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = true;
    Object v3 = "Cannot use Object Id with Builder-based deserialization (type ";
    Object v4 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v3));
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = null;
    Object v9 = "0";
    Object v10 = true;
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.AnnotationCollector.emptyAnnotations();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v15));
    Object v17 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v18 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v16),((com.fasterxml.jackson.databind.JavaType[])v17));
    Object v19 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v14),((com.fasterxml.jackson.databind.type.TypeBindings)v18));
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotatedField(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v19),((java.lang.reflect.Field)v20),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v21));
    Object v23 = new com.fasterxml.jackson.databind.deser.impl.FieldProperty(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v12),((com.fasterxml.jackson.databind.util.Annotations)v13),((com.fasterxml.jackson.databind.introspect.AnnotatedField)v22));
    Object v24 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v25 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty(((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v23),((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v24));
    Object v26 = new java.lang.Class[]{null,null};
    ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v25).setViews(((java.lang.Class[])v26));
    Object v27 = null;
    org.junit.Assert.assertNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = true;
    Object v3 = "Cannot use Object Id with Builder-based deserialization (type ";
    Object v4 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v3));
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = null;
    Object v9 = "0";
    Object v10 = true;
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.AnnotationCollector.emptyAnnotations();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v15));
    Object v17 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v18 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v16),((com.fasterxml.jackson.databind.JavaType[])v17));
    Object v19 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v14),((com.fasterxml.jackson.databind.type.TypeBindings)v18));
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotatedField(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v19),((java.lang.reflect.Field)v20),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v21));
    Object v23 = new com.fasterxml.jackson.databind.deser.impl.FieldProperty(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v12),((com.fasterxml.jackson.databind.util.Annotations)v13),((com.fasterxml.jackson.databind.introspect.AnnotatedField)v22));
    Object v24 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v25 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty(((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v23),((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v24));
    Object v26 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v25).hasValueDeserializer();
    org.junit.Assert.assertEquals((Object)(false), v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = true;
    Object v3 = "Cannot use Object Id with Builder-based deserialization (type ";
    Object v4 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v3));
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = null;
    Object v9 = "0";
    Object v10 = true;
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.AnnotationCollector.emptyAnnotations();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v15));
    Object v17 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v18 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v16),((com.fasterxml.jackson.databind.JavaType[])v17));
    Object v19 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v14),((com.fasterxml.jackson.databind.type.TypeBindings)v18));
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotatedField(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v19),((java.lang.reflect.Field)v20),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v21));
    Object v23 = new com.fasterxml.jackson.databind.deser.impl.FieldProperty(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v12),((com.fasterxml.jackson.databind.util.Annotations)v13),((com.fasterxml.jackson.databind.introspect.AnnotatedField)v22));
    Object v24 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v25 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty(((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v23),((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v24));
    Object v26 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v27 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v26));
    Object v28 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor.Base(((com.fasterxml.jackson.databind.SerializerProvider)v27));
    Object v29 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v30 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v29));
    ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v25).depositSchemaProperty(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor)v28),((com.fasterxml.jackson.databind.SerializerProvider)v30));
    Object v31 = null;
    Object v32 = -29;
    ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v25).assignIndex((((java.lang.Integer)v32).intValue()));
    Object v33 = null;
    org.junit.Assert.assertNull(v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = true;
    Object v3 = "Cannot use Object Id with Builder-based deserialization (type ";
    Object v4 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v3));
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = null;
    Object v9 = "0";
    Object v10 = true;
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.AnnotationCollector.emptyAnnotations();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v15));
    Object v17 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v18 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v16),((com.fasterxml.jackson.databind.JavaType[])v17));
    Object v19 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v14),((com.fasterxml.jackson.databind.type.TypeBindings)v18));
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotatedField(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v19),((java.lang.reflect.Field)v20),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v21));
    Object v23 = new com.fasterxml.jackson.databind.deser.impl.FieldProperty(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v12),((com.fasterxml.jackson.databind.util.Annotations)v13),((com.fasterxml.jackson.databind.introspect.AnnotatedField)v22));
    Object v24 = "Cannot use Object Id with Builder-based deserialization (type ";
    Object v25 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v24));
    Object v26 = new com.fasterxml.jackson.databind.deser.impl.FieldProperty(((com.fasterxml.jackson.databind.deser.impl.FieldProperty)v23),((com.fasterxml.jackson.databind.PropertyName)v25));
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v28 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v27));
    Object v29 = ((java.lang.Class)v28).isSynthetic();
    Object v30 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v26).visibleInView(((java.lang.Class)v28));
    org.junit.Assert.assertEquals((Object)(true), v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = true;
    Object v3 = "Cannot use Object Id with Builder-based deserialization (type ";
    Object v4 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v3));
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = null;
    Object v9 = "0";
    Object v10 = true;
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.AnnotationCollector.emptyAnnotations();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v15));
    Object v17 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v18 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v16),((com.fasterxml.jackson.databind.JavaType[])v17));
    Object v19 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v14),((com.fasterxml.jackson.databind.type.TypeBindings)v18));
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotatedField(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v19),((java.lang.reflect.Field)v20),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v21));
    Object v23 = new com.fasterxml.jackson.databind.deser.impl.FieldProperty(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v12),((com.fasterxml.jackson.databind.util.Annotations)v13),((com.fasterxml.jackson.databind.introspect.AnnotatedField)v22));
    Object v24 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v25 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty(((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v23),((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v24));
    Object v26 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v25).hasViews();
    org.junit.Assert.assertEquals((Object)(false), v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = true;
    Object v3 = "Cannot use Object Id with Builder-based deserialization (type ";
    Object v4 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v3));
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = null;
    Object v9 = "0";
    Object v10 = true;
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.AnnotationCollector.emptyAnnotations();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v15));
    Object v17 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v18 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v16),((com.fasterxml.jackson.databind.JavaType[])v17));
    Object v19 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v14),((com.fasterxml.jackson.databind.type.TypeBindings)v18));
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotatedField(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v19),((java.lang.reflect.Field)v20),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v21));
    Object v23 = new com.fasterxml.jackson.databind.deser.impl.FieldProperty(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v12),((com.fasterxml.jackson.databind.util.Annotations)v13),((com.fasterxml.jackson.databind.introspect.AnnotatedField)v22));
    Object v24 = ")";
    Object v25 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v23).withSimpleName(((java.lang.String)v24));
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v27 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v26));
    Object v28 = ((java.lang.Class)v27).getDeclaredAnnotations();
    Object v29 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v25).visibleInView(((java.lang.Class)v27));
    org.junit.Assert.assertEquals((Object)(true), v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = true;
    Object v3 = "Cannot use Object Id with Builder-based deserialization (type ";
    Object v4 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v3));
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = null;
    Object v9 = "0";
    Object v10 = true;
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.AnnotationCollector.emptyAnnotations();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v15));
    Object v17 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v18 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v16),((com.fasterxml.jackson.databind.JavaType[])v17));
    Object v19 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v14),((com.fasterxml.jackson.databind.type.TypeBindings)v18));
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotatedField(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v19),((java.lang.reflect.Field)v20),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v21));
    Object v23 = new com.fasterxml.jackson.databind.deser.impl.FieldProperty(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v12),((com.fasterxml.jackson.databind.util.Annotations)v13),((com.fasterxml.jackson.databind.introspect.AnnotatedField)v22));
    Object v24 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v23).getObjectIdInfo();
    org.junit.Assert.assertNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = true;
    Object v3 = "Cannot use Object Id with Builder-based deserialization (type ";
    Object v4 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v3));
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = null;
    Object v9 = "0";
    Object v10 = true;
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.AnnotationCollector.emptyAnnotations();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v15));
    Object v17 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v18 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v16),((com.fasterxml.jackson.databind.JavaType[])v17));
    Object v19 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v14),((com.fasterxml.jackson.databind.type.TypeBindings)v18));
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotatedField(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v19),((java.lang.reflect.Field)v20),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v21));
    Object v23 = new com.fasterxml.jackson.databind.deser.impl.FieldProperty(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v12),((com.fasterxml.jackson.databind.util.Annotations)v13),((com.fasterxml.jackson.databind.introspect.AnnotatedField)v22));
    Object v24 = "";
    Object v25 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v23).withSimpleName(((java.lang.String)v24));
    Object v26 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v23).getValueDeserializer();
    org.junit.Assert.assertNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = true;
    Object v3 = "Cannot use Object Id with Builder-based deserialization (type ";
    Object v4 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v3));
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = null;
    Object v9 = "0";
    Object v10 = true;
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.AnnotationCollector.emptyAnnotations();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v15));
    Object v17 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v18 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v16),((com.fasterxml.jackson.databind.JavaType[])v17));
    Object v19 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v14),((com.fasterxml.jackson.databind.type.TypeBindings)v18));
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotatedField(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v19),((java.lang.reflect.Field)v20),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v21));
    Object v23 = new com.fasterxml.jackson.databind.deser.impl.FieldProperty(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v12),((com.fasterxml.jackson.databind.util.Annotations)v13),((com.fasterxml.jackson.databind.introspect.AnnotatedField)v22));
    Object v24 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v25 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty(((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v23),((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v24));
    Object v26 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v25).hasValueTypeDeserializer();
    org.junit.Assert.assertEquals((Object)(true), v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = true;
    Object v3 = "Cannot use Object Id with Builder-based deserialization (type ";
    Object v4 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v3));
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = null;
    Object v9 = "0";
    Object v10 = true;
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.AnnotationCollector.emptyAnnotations();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v15));
    Object v17 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v18 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v16),((com.fasterxml.jackson.databind.JavaType[])v17));
    Object v19 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v14),((com.fasterxml.jackson.databind.type.TypeBindings)v18));
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotatedField(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v19),((java.lang.reflect.Field)v20),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v21));
    Object v23 = new com.fasterxml.jackson.databind.deser.impl.FieldProperty(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v12),((com.fasterxml.jackson.databind.util.Annotations)v13),((com.fasterxml.jackson.databind.introspect.AnnotatedField)v22));
    Object v24 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v25 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty(((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v23),((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v24));
    Object v26 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.DateDeserializer();
    Object v27 = ((com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty)v25).withValueDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v26));
    org.junit.Assert.assertNotNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = true;
    Object v3 = "Cannot use Object Id with Builder-based deserialization (type ";
    Object v4 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v3));
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = null;
    Object v9 = "0";
    Object v10 = true;
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.AnnotationCollector.emptyAnnotations();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v15));
    Object v17 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v18 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v16),((com.fasterxml.jackson.databind.JavaType[])v17));
    Object v19 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v14),((com.fasterxml.jackson.databind.type.TypeBindings)v18));
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotatedField(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v19),((java.lang.reflect.Field)v20),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v21));
    Object v23 = new com.fasterxml.jackson.databind.deser.impl.FieldProperty(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v12),((com.fasterxml.jackson.databind.util.Annotations)v13),((com.fasterxml.jackson.databind.introspect.AnnotatedField)v22));
    Object v24 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v25 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty(((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v23),((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v24));
    Object v26 = "Cannot use Object Id with Builder-based deserialization (type ";
    Object v27 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v26));
    Object v28 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v25).withName(((com.fasterxml.jackson.databind.PropertyName)v27));
    Object v29 = com.fasterxml.jackson.databind.node.BooleanNode.getFalse();
    Object v30 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v29));
    Object v31 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v32 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v31));
    Object v33 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v32));
    Object v34 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v25).deserialize(((com.fasterxml.jackson.core.JsonParser)v30),((com.fasterxml.jackson.databind.DeserializationContext)v33));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = "AnnotationIntrospector returned serializer definition of type ";
    Object v1 = null;
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = true;
    Object v4 = "Cannot use Object Id with Builder-based deserialization (type ";
    Object v5 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),(((java.lang.Boolean)v3).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v5));
    Object v7 = com.fasterxml.jackson.databind.introspect.AnnotationCollector.emptyAnnotations();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v0),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v6),((com.fasterxml.jackson.databind.util.Annotations)v7),((com.fasterxml.jackson.databind.JavaType)v8));
    Object v10 = null;
    Object v11 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v12 = null;
    Object v13 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v14 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v15 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v10),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v11),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v12),((com.fasterxml.jackson.databind.util.RootNameLookup)v13),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v16));
    Object v18 = ((com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase)v9).findPropertyInclusion(((com.fasterxml.jackson.databind.cfg.MapperConfig)v15),((java.lang.Class)v17));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = true;
    Object v3 = "Cannot use Object Id with Builder-based deserialization (type ";
    Object v4 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v3));
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = null;
    Object v9 = "0";
    Object v10 = true;
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.AnnotationCollector.emptyAnnotations();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v15));
    Object v17 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v18 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v16),((com.fasterxml.jackson.databind.JavaType[])v17));
    Object v19 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v14),((com.fasterxml.jackson.databind.type.TypeBindings)v18));
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotatedField(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v19),((java.lang.reflect.Field)v20),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v21));
    Object v23 = new com.fasterxml.jackson.databind.deser.impl.FieldProperty(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v12),((com.fasterxml.jackson.databind.util.Annotations)v13),((com.fasterxml.jackson.databind.introspect.AnnotatedField)v22));
    Object v24 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v25 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty(((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v23),((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v24));
    Object v26 = "Cannot use Object Id with Builder-based deserialization (type ";
    Object v27 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v26));
    Object v28 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty)v25),((com.fasterxml.jackson.databind.PropertyName)v27));
    org.junit.Assert.assertNotNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = true;
    Object v3 = "Cannot use Object Id with Builder-based deserialization (type ";
    Object v4 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v3));
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = null;
    Object v9 = "0";
    Object v10 = true;
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.AnnotationCollector.emptyAnnotations();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v15));
    Object v17 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v18 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v16),((com.fasterxml.jackson.databind.JavaType[])v17));
    Object v19 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v14),((com.fasterxml.jackson.databind.type.TypeBindings)v18));
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotatedField(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v19),((java.lang.reflect.Field)v20),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v21));
    Object v23 = new com.fasterxml.jackson.databind.deser.impl.FieldProperty(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v12),((com.fasterxml.jackson.databind.util.Annotations)v13),((com.fasterxml.jackson.databind.introspect.AnnotatedField)v22));
    Object v24 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v25 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty(((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v23),((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v24));
    Object v26 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.DateDeserializer();
    Object v27 = ((com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty)v25).withValueDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v26));
    Object v28 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v27).hasValueTypeDeserializer();
    org.junit.Assert.assertEquals((Object)(true), v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = true;
    Object v3 = "Cannot use Object Id with Builder-based deserialization (type ";
    Object v4 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v3));
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = null;
    Object v9 = "0";
    Object v10 = true;
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.AnnotationCollector.emptyAnnotations();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v15));
    Object v17 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v18 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v16),((com.fasterxml.jackson.databind.JavaType[])v17));
    Object v19 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v14),((com.fasterxml.jackson.databind.type.TypeBindings)v18));
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotatedField(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v19),((java.lang.reflect.Field)v20),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v21));
    Object v23 = new com.fasterxml.jackson.databind.deser.impl.FieldProperty(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v12),((com.fasterxml.jackson.databind.util.Annotations)v13),((com.fasterxml.jackson.databind.introspect.AnnotatedField)v22));
    Object v24 = "";
    ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v23).setManagedReferenceName(((java.lang.String)v24));
    Object v25 = null;
    org.junit.Assert.assertNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = true;
    Object v3 = "Cannot use Object Id with Builder-based deserialization (type ";
    Object v4 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v3));
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = null;
    Object v9 = "0";
    Object v10 = true;
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.AnnotationCollector.emptyAnnotations();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v15));
    Object v17 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v18 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v16),((com.fasterxml.jackson.databind.JavaType[])v17));
    Object v19 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v14),((com.fasterxml.jackson.databind.type.TypeBindings)v18));
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotatedField(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v19),((java.lang.reflect.Field)v20),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v21));
    Object v23 = new com.fasterxml.jackson.databind.deser.impl.FieldProperty(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v12),((com.fasterxml.jackson.databind.util.Annotations)v13),((com.fasterxml.jackson.databind.introspect.AnnotatedField)v22));
    Object v24 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v25 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty(((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v23),((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v24));
    Object v26 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v25).getName();
    org.junit.Assert.assertEquals((Object)("Cannot use Object Id with Builder-based deserialization (type "), v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = true;
    Object v3 = "Cannot use Object Id with Builder-based deserialization (type ";
    Object v4 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v3));
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = null;
    Object v9 = "0";
    Object v10 = true;
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.AnnotationCollector.emptyAnnotations();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v15));
    Object v17 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v18 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v16),((com.fasterxml.jackson.databind.JavaType[])v17));
    Object v19 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v14),((com.fasterxml.jackson.databind.type.TypeBindings)v18));
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotatedField(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v19),((java.lang.reflect.Field)v20),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v21));
    Object v23 = new com.fasterxml.jackson.databind.deser.impl.FieldProperty(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v12),((com.fasterxml.jackson.databind.util.Annotations)v13),((com.fasterxml.jackson.databind.introspect.AnnotatedField)v22));
    Object v24 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v25 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty(((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v23),((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v24));
    Object v26 = "Cannot use Object Id with Builder-based deserialization (type ";
    Object v27 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v26));
    Object v28 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty)v25),((com.fasterxml.jackson.databind.PropertyName)v27));
    Object v29 = ((com.fasterxml.jackson.databind.BeanProperty)v28).getName();
    Object v30 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v31 = ((com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase)v28).findFormatOverrides(((com.fasterxml.jackson.databind.AnnotationIntrospector)v30));
    org.junit.Assert.assertNotNull(v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = true;
    Object v3 = "Cannot use Object Id with Builder-based deserialization (type ";
    Object v4 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v3));
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = null;
    Object v9 = "0";
    Object v10 = true;
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.AnnotationCollector.emptyAnnotations();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v15));
    Object v17 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v18 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v16),((com.fasterxml.jackson.databind.JavaType[])v17));
    Object v19 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v14),((com.fasterxml.jackson.databind.type.TypeBindings)v18));
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotatedField(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v19),((java.lang.reflect.Field)v20),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v21));
    Object v23 = new com.fasterxml.jackson.databind.deser.impl.FieldProperty(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v12),((com.fasterxml.jackson.databind.util.Annotations)v13),((com.fasterxml.jackson.databind.introspect.AnnotatedField)v22));
    Object v24 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v25 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty(((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v23),((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v24));
    Object v26 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.DateDeserializer();
    Object v27 = ((com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty)v25).withValueDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v26));
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v29 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v28));
    Object v30 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v27).visibleInView(((java.lang.Class)v29));
    org.junit.Assert.assertEquals((Object)(true), v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = true;
    Object v3 = "Cannot use Object Id with Builder-based deserialization (type ";
    Object v4 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v3));
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = null;
    Object v9 = "0";
    Object v10 = true;
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.AnnotationCollector.emptyAnnotations();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v15));
    Object v17 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v18 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v16),((com.fasterxml.jackson.databind.JavaType[])v17));
    Object v19 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v14),((com.fasterxml.jackson.databind.type.TypeBindings)v18));
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotatedField(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v19),((java.lang.reflect.Field)v20),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v21));
    Object v23 = new com.fasterxml.jackson.databind.deser.impl.FieldProperty(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v12),((com.fasterxml.jackson.databind.util.Annotations)v13),((com.fasterxml.jackson.databind.introspect.AnnotatedField)v22));
    Object v24 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v25 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty(((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v23),((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v24));
    Object v26 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.DateDeserializer();
    Object v27 = ((com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty)v25).withValueDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v26));
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v29 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v28));
    Object v30 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v27).getContextAnnotation(((java.lang.Class)v29));
    Object v31 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v27).hasViews();
    org.junit.Assert.assertEquals((Object)(false), v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = true;
    Object v3 = "Cannot use Object Id with Builder-based deserialization (type ";
    Object v4 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v3));
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = null;
    Object v9 = "0";
    Object v10 = true;
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.AnnotationCollector.emptyAnnotations();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v15));
    Object v17 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v18 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v16),((com.fasterxml.jackson.databind.JavaType[])v17));
    Object v19 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v14),((com.fasterxml.jackson.databind.type.TypeBindings)v18));
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotatedField(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v19),((java.lang.reflect.Field)v20),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v21));
    Object v23 = new com.fasterxml.jackson.databind.deser.impl.FieldProperty(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v12),((com.fasterxml.jackson.databind.util.Annotations)v13),((com.fasterxml.jackson.databind.introspect.AnnotatedField)v22));
    Object v24 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v25 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty(((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v23),((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v24));
    Object v26 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v27 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v26));
    Object v28 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor.Base(((com.fasterxml.jackson.databind.SerializerProvider)v27));
    Object v29 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v30 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v29));
    ((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWithSerializerProvider)v28).setProvider(((com.fasterxml.jackson.databind.SerializerProvider)v30));
    Object v31 = null;
    Object v32 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v33 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v32));
    ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v25).depositSchemaProperty(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor)v28),((com.fasterxml.jackson.databind.SerializerProvider)v33));
    Object v34 = null;
    org.junit.Assert.assertNull(v34);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = true;
    Object v3 = "Cannot use Object Id with Builder-based deserialization (type ";
    Object v4 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v3));
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = null;
    Object v9 = "0";
    Object v10 = true;
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.AnnotationCollector.emptyAnnotations();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v15));
    Object v17 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v18 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v16),((com.fasterxml.jackson.databind.JavaType[])v17));
    Object v19 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v14),((com.fasterxml.jackson.databind.type.TypeBindings)v18));
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotatedField(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v19),((java.lang.reflect.Field)v20),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v21));
    Object v23 = new com.fasterxml.jackson.databind.deser.impl.FieldProperty(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v12),((com.fasterxml.jackson.databind.util.Annotations)v13),((com.fasterxml.jackson.databind.introspect.AnnotatedField)v22));
    Object v24 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v25 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty(((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v23),((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v24));
    Object v26 = ((com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty)v25).getMember();
    org.junit.Assert.assertNotNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = "AnnotationIntrospector returned serializer definition of type ";
    Object v1 = null;
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = true;
    Object v4 = "Cannot use Object Id with Builder-based deserialization (type ";
    Object v5 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),(((java.lang.Boolean)v3).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v5));
    Object v7 = com.fasterxml.jackson.databind.introspect.AnnotationCollector.emptyAnnotations();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v0),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v6),((com.fasterxml.jackson.databind.util.Annotations)v7),((com.fasterxml.jackson.databind.JavaType)v8));
    Object v10 = ")";
    Object v11 = "false";
    Object v12 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = new com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v9),((com.fasterxml.jackson.databind.util.NameTransformer)v12));
    Object v14 = null;
    Object v15 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v16 = null;
    Object v17 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v18 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v19 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v14),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v15),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v16),((com.fasterxml.jackson.databind.util.RootNameLookup)v17),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v20));
    Object v22 = ((com.fasterxml.jackson.databind.cfg.MapperConfig)v19).getDefaultPropertyFormat(((java.lang.Class)v21));
    Object v23 = ((com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase)v13).findAliases(((com.fasterxml.jackson.databind.cfg.MapperConfig)v19));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = true;
    Object v3 = "Cannot use Object Id with Builder-based deserialization (type ";
    Object v4 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v3));
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = null;
    Object v9 = "0";
    Object v10 = true;
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.AnnotationCollector.emptyAnnotations();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v15));
    Object v17 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v18 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v16),((com.fasterxml.jackson.databind.JavaType[])v17));
    Object v19 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v14),((com.fasterxml.jackson.databind.type.TypeBindings)v18));
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotatedField(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v19),((java.lang.reflect.Field)v20),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v21));
    Object v23 = new com.fasterxml.jackson.databind.deser.impl.FieldProperty(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v12),((com.fasterxml.jackson.databind.util.Annotations)v13),((com.fasterxml.jackson.databind.introspect.AnnotatedField)v22));
    Object v24 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v25 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty(((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v23),((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v24));
    Object v26 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v25).toString();
    Object v27 = ((com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty)v25).getMember();
    org.junit.Assert.assertNotNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = true;
    Object v3 = "Cannot use Object Id with Builder-based deserialization (type ";
    Object v4 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v3));
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = null;
    Object v9 = "0";
    Object v10 = true;
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.AnnotationCollector.emptyAnnotations();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v15));
    Object v17 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v18 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v16),((com.fasterxml.jackson.databind.JavaType[])v17));
    Object v19 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v14),((com.fasterxml.jackson.databind.type.TypeBindings)v18));
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotatedField(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v19),((java.lang.reflect.Field)v20),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v21));
    Object v23 = new com.fasterxml.jackson.databind.deser.impl.FieldProperty(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v12),((com.fasterxml.jackson.databind.util.Annotations)v13),((com.fasterxml.jackson.databind.introspect.AnnotatedField)v22));
    Object v24 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v25 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty(((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v23),((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v24));
    Object v26 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.DateDeserializer();
    Object v27 = ((com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty)v25).withValueDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v26));
    Object v28 = com.fasterxml.jackson.databind.node.BooleanNode.getFalse();
    Object v29 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v28));
    Object v30 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v31 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v30));
    Object v32 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v31));
    Object v33 = com.fasterxml.jackson.databind.introspect.AnnotationCollector.emptyAnnotations();
    Object v34 = ((com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty)v27).deserializeSetAndReturn(((com.fasterxml.jackson.core.JsonParser)v29),((com.fasterxml.jackson.databind.DeserializationContext)v32),((java.lang.Object)v33));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = true;
    Object v3 = "Cannot use Object Id with Builder-based deserialization (type ";
    Object v4 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v3));
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = null;
    Object v9 = "0";
    Object v10 = true;
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.AnnotationCollector.emptyAnnotations();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v15));
    Object v17 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v18 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v16),((com.fasterxml.jackson.databind.JavaType[])v17));
    Object v19 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v14),((com.fasterxml.jackson.databind.type.TypeBindings)v18));
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotatedField(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v19),((java.lang.reflect.Field)v20),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v21));
    Object v23 = new com.fasterxml.jackson.databind.deser.impl.FieldProperty(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v12),((com.fasterxml.jackson.databind.util.Annotations)v13),((com.fasterxml.jackson.databind.introspect.AnnotatedField)v22));
    Object v24 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v25 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty(((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v23),((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v24));
    Object v26 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v27 = ((com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase)v25).findFormatOverrides(((com.fasterxml.jackson.databind.AnnotationIntrospector)v26));
    org.junit.Assert.assertNotNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = true;
    Object v3 = "Cannot use Object Id with Builder-based deserialization (type ";
    Object v4 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v3));
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = null;
    Object v9 = "0";
    Object v10 = true;
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.AnnotationCollector.emptyAnnotations();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v15));
    Object v17 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v18 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v16),((com.fasterxml.jackson.databind.JavaType[])v17));
    Object v19 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v14),((com.fasterxml.jackson.databind.type.TypeBindings)v18));
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotatedField(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v19),((java.lang.reflect.Field)v20),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v21));
    Object v23 = new com.fasterxml.jackson.databind.deser.impl.FieldProperty(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v12),((com.fasterxml.jackson.databind.util.Annotations)v13),((com.fasterxml.jackson.databind.introspect.AnnotatedField)v22));
    Object v24 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v25 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty(((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v23),((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v24));
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v27 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v26));
    Object v28 = ((com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty)v25).getAnnotation(((java.lang.Class)v27));
    org.junit.Assert.assertNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = true;
    Object v3 = "Cannot use Object Id with Builder-based deserialization (type ";
    Object v4 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v3));
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = null;
    Object v9 = "0";
    Object v10 = true;
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.AnnotationCollector.emptyAnnotations();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v15));
    Object v17 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v18 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v16),((com.fasterxml.jackson.databind.JavaType[])v17));
    Object v19 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v14),((com.fasterxml.jackson.databind.type.TypeBindings)v18));
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotatedField(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v19),((java.lang.reflect.Field)v20),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v21));
    Object v23 = new com.fasterxml.jackson.databind.deser.impl.FieldProperty(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v12),((com.fasterxml.jackson.databind.util.Annotations)v13),((com.fasterxml.jackson.databind.introspect.AnnotatedField)v22));
    Object v24 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v25 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty(((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v23),((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v24));
    Object v26 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.DateDeserializer();
    Object v27 = ((com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty)v25).withValueDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v26));
    Object v28 = "[null]";
    Object v29 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v27).withSimpleName(((java.lang.String)v28));
    org.junit.Assert.assertNotNull(v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = true;
    Object v3 = "Cannot use Object Id with Builder-based deserialization (type ";
    Object v4 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v3));
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = null;
    Object v9 = "0";
    Object v10 = true;
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.AnnotationCollector.emptyAnnotations();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v15));
    Object v17 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v18 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v16),((com.fasterxml.jackson.databind.JavaType[])v17));
    Object v19 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v14),((com.fasterxml.jackson.databind.type.TypeBindings)v18));
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotatedField(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v19),((java.lang.reflect.Field)v20),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v21));
    Object v23 = new com.fasterxml.jackson.databind.deser.impl.FieldProperty(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v12),((com.fasterxml.jackson.databind.util.Annotations)v13),((com.fasterxml.jackson.databind.introspect.AnnotatedField)v22));
    Object v24 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v25 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty(((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v23),((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v24));
    Object v26 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.DateDeserializer();
    Object v27 = ((com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty)v25).withNullProvider(((com.fasterxml.jackson.databind.deser.NullValueProvider)v26));
    org.junit.Assert.assertNotNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = true;
    Object v3 = "Cannot use Object Id with Builder-based deserialization (type ";
    Object v4 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v3));
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = null;
    Object v9 = "0";
    Object v10 = true;
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.AnnotationCollector.emptyAnnotations();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v15));
    Object v17 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v18 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v16),((com.fasterxml.jackson.databind.JavaType[])v17));
    Object v19 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v14),((com.fasterxml.jackson.databind.type.TypeBindings)v18));
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotatedField(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v19),((java.lang.reflect.Field)v20),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v21));
    Object v23 = new com.fasterxml.jackson.databind.deser.impl.FieldProperty(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v12),((com.fasterxml.jackson.databind.util.Annotations)v13),((com.fasterxml.jackson.databind.introspect.AnnotatedField)v22));
    Object v24 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v25 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty(((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v23),((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v24));
    Object v26 = "Cannot use Object Id with Builder-based deserialization (type ";
    Object v27 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v26));
    Object v28 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty)v25),((com.fasterxml.jackson.databind.PropertyName)v27));
    Object v29 = com.fasterxml.jackson.databind.node.BooleanNode.getFalse();
    Object v30 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v29));
    Object v31 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v32 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v31));
    Object v33 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v32));
    Object v34 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v35 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v28).deserializeWith(((com.fasterxml.jackson.core.JsonParser)v30),((com.fasterxml.jackson.databind.DeserializationContext)v33),((java.lang.Object)v34));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.exc.InvalidDefinitionException");
    } catch (com.fasterxml.jackson.databind.exc.InvalidDefinitionException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = true;
    Object v3 = "Cannot use Object Id with Builder-based deserialization (type ";
    Object v4 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v3));
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = null;
    Object v9 = "0";
    Object v10 = true;
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.AnnotationCollector.emptyAnnotations();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v15));
    Object v17 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v18 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v16),((com.fasterxml.jackson.databind.JavaType[])v17));
    Object v19 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v14),((com.fasterxml.jackson.databind.type.TypeBindings)v18));
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotatedField(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v19),((java.lang.reflect.Field)v20),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v21));
    Object v23 = new com.fasterxml.jackson.databind.deser.impl.FieldProperty(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v12),((com.fasterxml.jackson.databind.util.Annotations)v13),((com.fasterxml.jackson.databind.introspect.AnnotatedField)v22));
    Object v24 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v25 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty(((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v23),((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v24));
    Object v26 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.DateDeserializer();
    Object v27 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v25).withNullProvider(((com.fasterxml.jackson.databind.deser.NullValueProvider)v26));
    ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v25).markAsIgnorable();
    Object v28 = null;
    org.junit.Assert.assertNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = true;
    Object v3 = "Cannot use Object Id with Builder-based deserialization (type ";
    Object v4 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v3));
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = null;
    Object v9 = "0";
    Object v10 = true;
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.AnnotationCollector.emptyAnnotations();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v15));
    Object v17 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v18 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v16),((com.fasterxml.jackson.databind.JavaType[])v17));
    Object v19 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v14),((com.fasterxml.jackson.databind.type.TypeBindings)v18));
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotatedField(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v19),((java.lang.reflect.Field)v20),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v21));
    Object v23 = new com.fasterxml.jackson.databind.deser.impl.FieldProperty(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v12),((com.fasterxml.jackson.databind.util.Annotations)v13),((com.fasterxml.jackson.databind.introspect.AnnotatedField)v22));
    Object v24 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v25 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty(((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v23),((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v24));
    Object v26 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.DateDeserializer();
    Object v27 = ((com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty)v25).withValueDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v26));
    Object v28 = "[null]";
    Object v29 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v27).withSimpleName(((java.lang.String)v28));
    Object v30 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v29).setObjectIdInfo(((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v30));
    Object v31 = null;
    Object v32 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.DateDeserializer();
    Object v33 = ((com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty)v29).withValueDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v32));
    org.junit.Assert.assertNotNull(v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = true;
    Object v3 = "Cannot use Object Id with Builder-based deserialization (type ";
    Object v4 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v3));
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = null;
    Object v9 = "0";
    Object v10 = true;
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.AnnotationCollector.emptyAnnotations();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v15));
    Object v17 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v18 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v16),((com.fasterxml.jackson.databind.JavaType[])v17));
    Object v19 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v14),((com.fasterxml.jackson.databind.type.TypeBindings)v18));
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotatedField(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v19),((java.lang.reflect.Field)v20),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v21));
    Object v23 = new com.fasterxml.jackson.databind.deser.impl.FieldProperty(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v12),((com.fasterxml.jackson.databind.util.Annotations)v13),((com.fasterxml.jackson.databind.introspect.AnnotatedField)v22));
    Object v24 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v25 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty(((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v23),((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v24));
    Object v26 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.DateDeserializer();
    Object v27 = ((com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty)v25).withNullProvider(((com.fasterxml.jackson.databind.deser.NullValueProvider)v26));
    Object v28 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v27).getValueTypeDeserializer();
    org.junit.Assert.assertNotNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = true;
    Object v3 = "Cannot use Object Id with Builder-based deserialization (type ";
    Object v4 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v3));
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = null;
    Object v9 = "0";
    Object v10 = true;
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.AnnotationCollector.emptyAnnotations();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v15));
    Object v17 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v18 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v16),((com.fasterxml.jackson.databind.JavaType[])v17));
    Object v19 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v14),((com.fasterxml.jackson.databind.type.TypeBindings)v18));
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotatedField(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v19),((java.lang.reflect.Field)v20),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v21));
    Object v23 = new com.fasterxml.jackson.databind.deser.impl.FieldProperty(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v12),((com.fasterxml.jackson.databind.util.Annotations)v13),((com.fasterxml.jackson.databind.introspect.AnnotatedField)v22));
    Object v24 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v23).getInjectableValueId();
    org.junit.Assert.assertNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = true;
    Object v3 = "Cannot use Object Id with Builder-based deserialization (type ";
    Object v4 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v3));
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = null;
    Object v9 = "0";
    Object v10 = true;
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.AnnotationCollector.emptyAnnotations();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v15));
    Object v17 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v18 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v16),((com.fasterxml.jackson.databind.JavaType[])v17));
    Object v19 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v14),((com.fasterxml.jackson.databind.type.TypeBindings)v18));
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotatedField(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v19),((java.lang.reflect.Field)v20),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v21));
    Object v23 = new com.fasterxml.jackson.databind.deser.impl.FieldProperty(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v12),((com.fasterxml.jackson.databind.util.Annotations)v13),((com.fasterxml.jackson.databind.introspect.AnnotatedField)v22));
    Object v24 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v25 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty(((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v23),((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v24));
    Object v26 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.DateDeserializer();
    Object v27 = ((com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty)v25).withValueDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v26));
    Object v28 = com.fasterxml.jackson.databind.node.BooleanNode.getFalse();
    Object v29 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v28));
    Object v30 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v31 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v30));
    Object v32 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v31));
    Object v33 = "true";
    Object v34 = ((com.fasterxml.jackson.databind.DeserializationContext)v32).mappingException(((java.lang.String)v33));
    Object v35 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v36 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v35));
    Object v37 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor.Base(((com.fasterxml.jackson.databind.SerializerProvider)v36));
    Object v38 = ((com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty)v27).deserializeSetAndReturn(((com.fasterxml.jackson.core.JsonParser)v29),((com.fasterxml.jackson.databind.DeserializationContext)v32),((java.lang.Object)v37));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = true;
    Object v3 = "Cannot use Object Id with Builder-based deserialization (type ";
    Object v4 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v3));
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = null;
    Object v9 = "0";
    Object v10 = true;
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.AnnotationCollector.emptyAnnotations();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v15));
    Object v17 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v18 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v16),((com.fasterxml.jackson.databind.JavaType[])v17));
    Object v19 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v14),((com.fasterxml.jackson.databind.type.TypeBindings)v18));
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotatedField(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v19),((java.lang.reflect.Field)v20),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v21));
    Object v23 = new com.fasterxml.jackson.databind.deser.impl.FieldProperty(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v12),((com.fasterxml.jackson.databind.util.Annotations)v13),((com.fasterxml.jackson.databind.introspect.AnnotatedField)v22));
    Object v24 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v25 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty(((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v23),((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v24));
    Object v26 = "Cannot use Object Id with Builder-based deserialization (type ";
    Object v27 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v26));
    Object v28 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty)v25),((com.fasterxml.jackson.databind.PropertyName)v27));
    Object v29 = com.fasterxml.jackson.databind.node.BooleanNode.getFalse();
    Object v30 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v29));
    Object v31 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v32 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v31));
    Object v33 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v32));
    Object v34 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v35 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v34));
    Object v36 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v28).deserializeWith(((com.fasterxml.jackson.core.JsonParser)v30),((com.fasterxml.jackson.databind.DeserializationContext)v33),((java.lang.Object)v35));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.exc.InvalidDefinitionException");
    } catch (com.fasterxml.jackson.databind.exc.InvalidDefinitionException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = true;
    Object v3 = "Cannot use Object Id with Builder-based deserialization (type ";
    Object v4 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v3));
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = null;
    Object v9 = "0";
    Object v10 = true;
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.AnnotationCollector.emptyAnnotations();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v15));
    Object v17 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v18 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v16),((com.fasterxml.jackson.databind.JavaType[])v17));
    Object v19 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v14),((com.fasterxml.jackson.databind.type.TypeBindings)v18));
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotatedField(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v19),((java.lang.reflect.Field)v20),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v21));
    Object v23 = new com.fasterxml.jackson.databind.deser.impl.FieldProperty(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v12),((com.fasterxml.jackson.databind.util.Annotations)v13),((com.fasterxml.jackson.databind.introspect.AnnotatedField)v22));
    Object v24 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v25 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty(((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v23),((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v24));
    Object v26 = com.fasterxml.jackson.databind.node.BooleanNode.getFalse();
    Object v27 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v26));
    Object v28 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v29 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v28));
    Object v30 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v29));
    Object v31 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v32 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v25).deserializeWith(((com.fasterxml.jackson.core.JsonParser)v27),((com.fasterxml.jackson.databind.DeserializationContext)v30),((java.lang.Object)v31));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.exc.InvalidDefinitionException");
    } catch (com.fasterxml.jackson.databind.exc.InvalidDefinitionException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = true;
    Object v3 = "Cannot use Object Id with Builder-based deserialization (type ";
    Object v4 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v3));
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = null;
    Object v9 = "0";
    Object v10 = true;
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.AnnotationCollector.emptyAnnotations();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v15));
    Object v17 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v18 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v16),((com.fasterxml.jackson.databind.JavaType[])v17));
    Object v19 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v14),((com.fasterxml.jackson.databind.type.TypeBindings)v18));
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotatedField(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v19),((java.lang.reflect.Field)v20),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v21));
    Object v23 = new com.fasterxml.jackson.databind.deser.impl.FieldProperty(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v12),((com.fasterxml.jackson.databind.util.Annotations)v13),((com.fasterxml.jackson.databind.introspect.AnnotatedField)v22));
    Object v24 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v25 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty(((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v23),((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v24));
    Object v26 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v27 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v26));
    Object v28 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor.Base(((com.fasterxml.jackson.databind.SerializerProvider)v27));
    Object v29 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v30 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v29));
    ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v25).depositSchemaProperty(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor)v28),((com.fasterxml.jackson.databind.SerializerProvider)v30));
    Object v31 = null;
    Object v32 = new java.lang.Class[]{null,null,null};
    ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v25).setViews(((java.lang.Class[])v32));
    Object v33 = null;
    org.junit.Assert.assertNull(v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = true;
    Object v3 = "Cannot use Object Id with Builder-based deserialization (type ";
    Object v4 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v3));
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = null;
    Object v9 = "0";
    Object v10 = true;
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.AnnotationCollector.emptyAnnotations();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v15));
    Object v17 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v18 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v16),((com.fasterxml.jackson.databind.JavaType[])v17));
    Object v19 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v14),((com.fasterxml.jackson.databind.type.TypeBindings)v18));
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotatedField(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v19),((java.lang.reflect.Field)v20),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v21));
    Object v23 = new com.fasterxml.jackson.databind.deser.impl.FieldProperty(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v12),((com.fasterxml.jackson.databind.util.Annotations)v13),((com.fasterxml.jackson.databind.introspect.AnnotatedField)v22));
    Object v24 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v25 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v24));
    Object v26 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor.Base(((com.fasterxml.jackson.databind.SerializerProvider)v25));
    Object v27 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v28 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v27));
    ((com.fasterxml.jackson.databind.BeanProperty)v23).depositSchemaProperty(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor)v26),((com.fasterxml.jackson.databind.SerializerProvider)v28));
    Object v29 = null;
    Object v30 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v31 = ((com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase)v23).findFormatOverrides(((com.fasterxml.jackson.databind.AnnotationIntrospector)v30));
    org.junit.Assert.assertNotNull(v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = true;
    Object v3 = "Cannot use Object Id with Builder-based deserialization (type ";
    Object v4 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v3));
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = null;
    Object v9 = "0";
    Object v10 = true;
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.AnnotationCollector.emptyAnnotations();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v15));
    Object v17 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v18 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v16),((com.fasterxml.jackson.databind.JavaType[])v17));
    Object v19 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v14),((com.fasterxml.jackson.databind.type.TypeBindings)v18));
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotatedField(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v19),((java.lang.reflect.Field)v20),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v21));
    Object v23 = new com.fasterxml.jackson.databind.deser.impl.FieldProperty(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v12),((com.fasterxml.jackson.databind.util.Annotations)v13),((com.fasterxml.jackson.databind.introspect.AnnotatedField)v22));
    Object v24 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v25 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty(((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v23),((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v24));
    Object v26 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.DateDeserializer();
    Object v27 = ((com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty)v25).withValueDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v26));
    Object v28 = "[null]";
    Object v29 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v27).withSimpleName(((java.lang.String)v28));
    Object v30 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v31 = ((com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase)v29).findFormatOverrides(((com.fasterxml.jackson.databind.AnnotationIntrospector)v30));
    org.junit.Assert.assertNotNull(v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = true;
    Object v3 = "Cannot use Object Id with Builder-based deserialization (type ";
    Object v4 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v3));
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = null;
    Object v9 = "0";
    Object v10 = true;
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.AnnotationCollector.emptyAnnotations();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v15));
    Object v17 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v18 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v16),((com.fasterxml.jackson.databind.JavaType[])v17));
    Object v19 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v14),((com.fasterxml.jackson.databind.type.TypeBindings)v18));
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotatedField(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v19),((java.lang.reflect.Field)v20),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v21));
    Object v23 = new com.fasterxml.jackson.databind.deser.impl.FieldProperty(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v12),((com.fasterxml.jackson.databind.util.Annotations)v13),((com.fasterxml.jackson.databind.introspect.AnnotatedField)v22));
    Object v24 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v23).hasValueDeserializer();
    org.junit.Assert.assertEquals((Object)(false), v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = true;
    Object v3 = "Cannot use Object Id with Builder-based deserialization (type ";
    Object v4 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v3));
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = null;
    Object v9 = "0";
    Object v10 = true;
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.AnnotationCollector.emptyAnnotations();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v15));
    Object v17 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v18 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v16),((com.fasterxml.jackson.databind.JavaType[])v17));
    Object v19 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v14),((com.fasterxml.jackson.databind.type.TypeBindings)v18));
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotatedField(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v19),((java.lang.reflect.Field)v20),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v21));
    Object v23 = new com.fasterxml.jackson.databind.deser.impl.FieldProperty(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v12),((com.fasterxml.jackson.databind.util.Annotations)v13),((com.fasterxml.jackson.databind.introspect.AnnotatedField)v22));
    Object v24 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v25 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty(((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v23),((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v24));
    Object v26 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.DateDeserializer();
    Object v27 = ((com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty)v25).withNullProvider(((com.fasterxml.jackson.databind.deser.NullValueProvider)v26));
    Object v28 = com.fasterxml.jackson.databind.node.BooleanNode.getFalse();
    Object v29 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v28));
    Object v30 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v31 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v30));
    Object v32 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v31));
    Object v33 = com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY;
    Object v34 = com.fasterxml.jackson.annotation.JsonInclude.Include.NON_ABSENT;
    Object v35 = com.fasterxml.jackson.annotation.JsonInclude.Value.construct(((com.fasterxml.jackson.annotation.JsonInclude.Include)v33),((com.fasterxml.jackson.annotation.JsonInclude.Include)v34));
    Object v36 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v27).deserializeWith(((com.fasterxml.jackson.core.JsonParser)v29),((com.fasterxml.jackson.databind.DeserializationContext)v32),((java.lang.Object)v35));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.exc.InvalidDefinitionException");
    } catch (com.fasterxml.jackson.databind.exc.InvalidDefinitionException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = true;
    Object v3 = "Cannot use Object Id with Builder-based deserialization (type ";
    Object v4 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v3));
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = null;
    Object v9 = "0";
    Object v10 = true;
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.AnnotationCollector.emptyAnnotations();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v15));
    Object v17 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v18 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v16),((com.fasterxml.jackson.databind.JavaType[])v17));
    Object v19 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v14),((com.fasterxml.jackson.databind.type.TypeBindings)v18));
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotatedField(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v19),((java.lang.reflect.Field)v20),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v21));
    Object v23 = new com.fasterxml.jackson.databind.deser.impl.FieldProperty(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v12),((com.fasterxml.jackson.databind.util.Annotations)v13),((com.fasterxml.jackson.databind.introspect.AnnotatedField)v22));
    Object v24 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v25 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty(((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v23),((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v24));
    Object v26 = com.fasterxml.jackson.databind.node.BooleanNode.getFalse();
    Object v27 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v26));
    Object v28 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)60),Byte.valueOf((byte)1)};
    Object v29 = "Failed to setValue() with method ";
    ((com.fasterxml.jackson.core.JsonParser)v27).setRequestPayloadOnError(((byte[])v28),((java.lang.String)v29));
    Object v30 = null;
    Object v31 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v32 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v31));
    Object v33 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v32));
    Object v34 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v35 = ((com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty)v25).deserializeSetAndReturn(((com.fasterxml.jackson.core.JsonParser)v27),((com.fasterxml.jackson.databind.DeserializationContext)v33),((java.lang.Object)v34));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = true;
    Object v3 = "Cannot use Object Id with Builder-based deserialization (type ";
    Object v4 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v3));
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = null;
    Object v9 = "0";
    Object v10 = true;
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.AnnotationCollector.emptyAnnotations();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v15));
    Object v17 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v18 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v16),((com.fasterxml.jackson.databind.JavaType[])v17));
    Object v19 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v14),((com.fasterxml.jackson.databind.type.TypeBindings)v18));
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotatedField(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v19),((java.lang.reflect.Field)v20),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v21));
    Object v23 = new com.fasterxml.jackson.databind.deser.impl.FieldProperty(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v12),((com.fasterxml.jackson.databind.util.Annotations)v13),((com.fasterxml.jackson.databind.introspect.AnnotatedField)v22));
    Object v24 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v25 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty(((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v23),((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v24));
    Object v26 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v25).isIgnorable();
    org.junit.Assert.assertEquals((Object)(false), v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = true;
    Object v3 = "Cannot use Object Id with Builder-based deserialization (type ";
    Object v4 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v3));
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = null;
    Object v9 = "0";
    Object v10 = true;
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.AnnotationCollector.emptyAnnotations();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v15));
    Object v17 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v18 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v16),((com.fasterxml.jackson.databind.JavaType[])v17));
    Object v19 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v14),((com.fasterxml.jackson.databind.type.TypeBindings)v18));
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotatedField(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v19),((java.lang.reflect.Field)v20),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v21));
    Object v23 = new com.fasterxml.jackson.databind.deser.impl.FieldProperty(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v12),((com.fasterxml.jackson.databind.util.Annotations)v13),((com.fasterxml.jackson.databind.introspect.AnnotatedField)v22));
    Object v24 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v25 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty(((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v23),((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v24));
    Object v26 = "Cannot use Object Id with Builder-based deserialization (type ";
    Object v27 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v26));
    Object v28 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty)v25),((com.fasterxml.jackson.databind.PropertyName)v27));
    Object v29 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v30 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v29));
    Object v31 = ((com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty)v28).getAnnotation(((java.lang.Class)v30));
    org.junit.Assert.assertNull(v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = true;
    Object v3 = "Cannot use Object Id with Builder-based deserialization (type ";
    Object v4 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v3));
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = null;
    Object v9 = "0";
    Object v10 = true;
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.AnnotationCollector.emptyAnnotations();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v15));
    Object v17 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v18 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v16),((com.fasterxml.jackson.databind.JavaType[])v17));
    Object v19 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v14),((com.fasterxml.jackson.databind.type.TypeBindings)v18));
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotatedField(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v19),((java.lang.reflect.Field)v20),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v21));
    Object v23 = new com.fasterxml.jackson.databind.deser.impl.FieldProperty(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v12),((com.fasterxml.jackson.databind.util.Annotations)v13),((com.fasterxml.jackson.databind.introspect.AnnotatedField)v22));
    Object v24 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v25 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty(((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v23),((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v24));
    Object v26 = "Cannot use Object Id with Builder-based deserialization (type ";
    Object v27 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v26));
    Object v28 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty)v25),((com.fasterxml.jackson.databind.PropertyName)v27));
    Object v29 = "array";
    ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v28).setManagedReferenceName(((java.lang.String)v29));
    Object v30 = null;
    Object v31 = "Cannot use Object Id with Builder-based deserialization (type ";
    Object v32 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v31));
    Object v33 = ((com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty)v28).withName(((com.fasterxml.jackson.databind.PropertyName)v32));
    org.junit.Assert.assertNotNull(v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = true;
    Object v3 = "Cannot use Object Id with Builder-based deserialization (type ";
    Object v4 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v3));
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = null;
    Object v9 = "0";
    Object v10 = true;
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.AnnotationCollector.emptyAnnotations();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v15));
    Object v17 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v18 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v16),((com.fasterxml.jackson.databind.JavaType[])v17));
    Object v19 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v14),((com.fasterxml.jackson.databind.type.TypeBindings)v18));
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotatedField(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v19),((java.lang.reflect.Field)v20),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v21));
    Object v23 = new com.fasterxml.jackson.databind.deser.impl.FieldProperty(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v12),((com.fasterxml.jackson.databind.util.Annotations)v13),((com.fasterxml.jackson.databind.introspect.AnnotatedField)v22));
    Object v24 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v25 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty(((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v23),((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v24));
    Object v26 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.DateDeserializer();
    Object v27 = ((com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty)v25).withNullProvider(((com.fasterxml.jackson.databind.deser.NullValueProvider)v26));
    Object v28 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v29 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v28));
    Object v30 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor.Base(((com.fasterxml.jackson.databind.SerializerProvider)v29));
    Object v31 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v32 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v31));
    Object v33 = new com.fasterxml.jackson.databind.ser.std.StdArraySerializers.DoubleArraySerializer();
    ((com.fasterxml.jackson.databind.SerializerProvider)v32).setNullValueSerializer(((com.fasterxml.jackson.databind.JsonSerializer)v33));
    Object v34 = null;
    ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v27).depositSchemaProperty(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor)v30),((com.fasterxml.jackson.databind.SerializerProvider)v32));
    Object v35 = null;
    org.junit.Assert.assertNull(v35);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = true;
    Object v3 = "Cannot use Object Id with Builder-based deserialization (type ";
    Object v4 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v3));
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = null;
    Object v9 = "0";
    Object v10 = true;
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.AnnotationCollector.emptyAnnotations();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v15));
    Object v17 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v18 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v16),((com.fasterxml.jackson.databind.JavaType[])v17));
    Object v19 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v14),((com.fasterxml.jackson.databind.type.TypeBindings)v18));
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotatedField(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v19),((java.lang.reflect.Field)v20),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v21));
    Object v23 = new com.fasterxml.jackson.databind.deser.impl.FieldProperty(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v12),((com.fasterxml.jackson.databind.util.Annotations)v13),((com.fasterxml.jackson.databind.introspect.AnnotatedField)v22));
    Object v24 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v25 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty(((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v23),((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v24));
    Object v26 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.DateDeserializer();
    Object v27 = ((com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty)v25).withNullProvider(((com.fasterxml.jackson.databind.deser.NullValueProvider)v26));
    Object v28 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v27).hasValueTypeDeserializer();
    org.junit.Assert.assertEquals((Object)(true), v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = true;
    Object v3 = "Cannot use Object Id with Builder-based deserialization (type ";
    Object v4 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v3));
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = null;
    Object v9 = "0";
    Object v10 = true;
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.AnnotationCollector.emptyAnnotations();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v15));
    Object v17 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v18 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v16),((com.fasterxml.jackson.databind.JavaType[])v17));
    Object v19 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v14),((com.fasterxml.jackson.databind.type.TypeBindings)v18));
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotatedField(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v19),((java.lang.reflect.Field)v20),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v21));
    Object v23 = new com.fasterxml.jackson.databind.deser.impl.FieldProperty(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v12),((com.fasterxml.jackson.databind.util.Annotations)v13),((com.fasterxml.jackson.databind.introspect.AnnotatedField)v22));
    Object v24 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v25 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty(((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v23),((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v24));
    Object v26 = "Cannot use Object Id with Builder-based deserialization (type ";
    Object v27 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v26));
    Object v28 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty)v25),((com.fasterxml.jackson.databind.PropertyName)v27));
    Object v29 = "array";
    ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v28).setManagedReferenceName(((java.lang.String)v29));
    Object v30 = null;
    Object v31 = "Cannot use Object Id with Builder-based deserialization (type ";
    Object v32 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v31));
    Object v33 = ((com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty)v28).withName(((com.fasterxml.jackson.databind.PropertyName)v32));
    Object v34 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v35 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v34));
    Object v36 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v33).getAnnotation(((java.lang.Class)v35));
    Object v37 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v33).getValueDeserializer();
    org.junit.Assert.assertNull(v37);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = true;
    Object v3 = "Cannot use Object Id with Builder-based deserialization (type ";
    Object v4 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v3));
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = null;
    Object v9 = "0";
    Object v10 = true;
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.AnnotationCollector.emptyAnnotations();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v15));
    Object v17 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v18 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v16),((com.fasterxml.jackson.databind.JavaType[])v17));
    Object v19 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v14),((com.fasterxml.jackson.databind.type.TypeBindings)v18));
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotatedField(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v19),((java.lang.reflect.Field)v20),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v21));
    Object v23 = new com.fasterxml.jackson.databind.deser.impl.FieldProperty(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v12),((com.fasterxml.jackson.databind.util.Annotations)v13),((com.fasterxml.jackson.databind.introspect.AnnotatedField)v22));
    Object v24 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v25 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty(((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v23),((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v24));
    Object v26 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v25).getType();
    org.junit.Assert.assertNotNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = true;
    Object v3 = "Cannot use Object Id with Builder-based deserialization (type ";
    Object v4 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v3));
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = null;
    Object v9 = "0";
    Object v10 = true;
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.AnnotationCollector.emptyAnnotations();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v15));
    Object v17 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v18 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v16),((com.fasterxml.jackson.databind.JavaType[])v17));
    Object v19 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v14),((com.fasterxml.jackson.databind.type.TypeBindings)v18));
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotatedField(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v19),((java.lang.reflect.Field)v20),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v21));
    Object v23 = new com.fasterxml.jackson.databind.deser.impl.FieldProperty(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v12),((com.fasterxml.jackson.databind.util.Annotations)v13),((com.fasterxml.jackson.databind.introspect.AnnotatedField)v22));
    Object v24 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v25 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty(((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v23),((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v24));
    Object v26 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v25).toString();
    org.junit.Assert.assertEquals((Object)("[property 'Cannot use Object Id with Builder-based deserialization (type ']"), v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = true;
    Object v3 = "Cannot use Object Id with Builder-based deserialization (type ";
    Object v4 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v3));
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = null;
    Object v9 = "0";
    Object v10 = true;
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.AnnotationCollector.emptyAnnotations();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v15));
    Object v17 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v18 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v16),((com.fasterxml.jackson.databind.JavaType[])v17));
    Object v19 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v14),((com.fasterxml.jackson.databind.type.TypeBindings)v18));
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotatedField(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v19),((java.lang.reflect.Field)v20),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v21));
    Object v23 = new com.fasterxml.jackson.databind.deser.impl.FieldProperty(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v12),((com.fasterxml.jackson.databind.util.Annotations)v13),((com.fasterxml.jackson.databind.introspect.AnnotatedField)v22));
    Object v24 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v25 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty(((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v23),((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v24));
    Object v26 = "Cannot use Object Id with Builder-based deserialization (type ";
    Object v27 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v26));
    Object v28 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty)v25),((com.fasterxml.jackson.databind.PropertyName)v27));
    Object v29 = "banySetter]";
    Object v30 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v28).withSimpleName(((java.lang.String)v29));
    Object v31 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v28).hasViews();
    org.junit.Assert.assertEquals((Object)(false), v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = true;
    Object v3 = "Cannot use Object Id with Builder-based deserialization (type ";
    Object v4 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v3));
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = null;
    Object v9 = "0";
    Object v10 = true;
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.AnnotationCollector.emptyAnnotations();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v15));
    Object v17 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v18 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v16),((com.fasterxml.jackson.databind.JavaType[])v17));
    Object v19 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v14),((com.fasterxml.jackson.databind.type.TypeBindings)v18));
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotatedField(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v19),((java.lang.reflect.Field)v20),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v21));
    Object v23 = new com.fasterxml.jackson.databind.deser.impl.FieldProperty(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v12),((com.fasterxml.jackson.databind.util.Annotations)v13),((com.fasterxml.jackson.databind.introspect.AnnotatedField)v22));
    Object v24 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v25 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty(((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v23),((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v24));
    Object v26 = "Cannot use Object Id with Builder-based deserialization (type ";
    Object v27 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v26));
    Object v28 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty)v25),((com.fasterxml.jackson.databind.PropertyName)v27));
    Object v29 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v28).hasValueDeserializer();
    org.junit.Assert.assertEquals((Object)(false), v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = true;
    Object v3 = "Cannot use Object Id with Builder-based deserialization (type ";
    Object v4 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v3));
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = null;
    Object v9 = "0";
    Object v10 = true;
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.AnnotationCollector.emptyAnnotations();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v15));
    Object v17 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v18 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v16),((com.fasterxml.jackson.databind.JavaType[])v17));
    Object v19 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v14),((com.fasterxml.jackson.databind.type.TypeBindings)v18));
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotatedField(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v19),((java.lang.reflect.Field)v20),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v21));
    Object v23 = new com.fasterxml.jackson.databind.deser.impl.FieldProperty(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v12),((com.fasterxml.jackson.databind.util.Annotations)v13),((com.fasterxml.jackson.databind.introspect.AnnotatedField)v22));
    Object v24 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v25 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty(((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v23),((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v24));
    Object v26 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.DateDeserializer();
    Object v27 = ((com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty)v25).withValueDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v26));
    Object v28 = "[null]";
    Object v29 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v27).withSimpleName(((java.lang.String)v28));
    Object v30 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v29).getValueDeserializer();
    org.junit.Assert.assertNotNull(v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = true;
    Object v3 = "Cannot use Object Id with Builder-based deserialization (type ";
    Object v4 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v3));
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = null;
    Object v9 = "0";
    Object v10 = true;
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.AnnotationCollector.emptyAnnotations();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v15));
    Object v17 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v18 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v16),((com.fasterxml.jackson.databind.JavaType[])v17));
    Object v19 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v14),((com.fasterxml.jackson.databind.type.TypeBindings)v18));
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotatedField(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v19),((java.lang.reflect.Field)v20),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v21));
    Object v23 = new com.fasterxml.jackson.databind.deser.impl.FieldProperty(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v12),((com.fasterxml.jackson.databind.util.Annotations)v13),((com.fasterxml.jackson.databind.introspect.AnnotatedField)v22));
    Object v24 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v25 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty(((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v23),((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v24));
    Object v26 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.DateDeserializer();
    Object v27 = ((com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty)v25).withValueDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v26));
    Object v28 = "[null]";
    Object v29 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v27).withSimpleName(((java.lang.String)v28));
    Object v30 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v29).setObjectIdInfo(((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v30));
    Object v31 = null;
    Object v32 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.DateDeserializer();
    Object v33 = ((com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty)v29).withValueDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v32));
    Object v34 = 0;
    ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v33).assignIndex((((java.lang.Integer)v34).intValue()));
    Object v35 = null;
    org.junit.Assert.assertNull(v35);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = true;
    Object v3 = "Cannot use Object Id with Builder-based deserialization (type ";
    Object v4 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v3));
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = null;
    Object v9 = "0";
    Object v10 = true;
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.AnnotationCollector.emptyAnnotations();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v15));
    Object v17 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v18 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v16),((com.fasterxml.jackson.databind.JavaType[])v17));
    Object v19 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v14),((com.fasterxml.jackson.databind.type.TypeBindings)v18));
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotatedField(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v19),((java.lang.reflect.Field)v20),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v21));
    Object v23 = new com.fasterxml.jackson.databind.deser.impl.FieldProperty(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v12),((com.fasterxml.jackson.databind.util.Annotations)v13),((com.fasterxml.jackson.databind.introspect.AnnotatedField)v22));
    Object v24 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v25 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty(((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v23),((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v24));
    Object v26 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.DateDeserializer();
    Object v27 = ((com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty)v25).withValueDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v26));
    Object v28 = "[null]";
    Object v29 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v27).withSimpleName(((java.lang.String)v28));
    Object v30 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v31 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty(((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v29),((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v30));
    org.junit.Assert.assertNotNull(v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = true;
    Object v3 = "Cannot use Object Id with Builder-based deserialization (type ";
    Object v4 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v3));
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = null;
    Object v9 = "0";
    Object v10 = true;
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.AnnotationCollector.emptyAnnotations();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v15));
    Object v17 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v18 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v16),((com.fasterxml.jackson.databind.JavaType[])v17));
    Object v19 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v14),((com.fasterxml.jackson.databind.type.TypeBindings)v18));
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotatedField(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v19),((java.lang.reflect.Field)v20),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v21));
    Object v23 = new com.fasterxml.jackson.databind.deser.impl.FieldProperty(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v12),((com.fasterxml.jackson.databind.util.Annotations)v13),((com.fasterxml.jackson.databind.introspect.AnnotatedField)v22));
    Object v24 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v25 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty(((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v23),((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v24));
    Object v26 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.DateDeserializer();
    Object v27 = ((com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty)v25).withValueDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v26));
    Object v28 = "[null]";
    Object v29 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v27).withSimpleName(((java.lang.String)v28));
    Object v30 = new java.lang.Class[]{null,null};
    ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v29).setViews(((java.lang.Class[])v30));
    Object v31 = null;
    org.junit.Assert.assertNull(v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = true;
    Object v3 = "Cannot use Object Id with Builder-based deserialization (type ";
    Object v4 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v3));
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = null;
    Object v9 = "0";
    Object v10 = true;
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.AnnotationCollector.emptyAnnotations();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v15));
    Object v17 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v18 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v16),((com.fasterxml.jackson.databind.JavaType[])v17));
    Object v19 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v14),((com.fasterxml.jackson.databind.type.TypeBindings)v18));
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotatedField(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v19),((java.lang.reflect.Field)v20),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v21));
    Object v23 = new com.fasterxml.jackson.databind.deser.impl.FieldProperty(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v12),((com.fasterxml.jackson.databind.util.Annotations)v13),((com.fasterxml.jackson.databind.introspect.AnnotatedField)v22));
    Object v24 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v25 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty(((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v23),((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v24));
    Object v26 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.DateDeserializer();
    Object v27 = ((com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty)v25).withValueDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v26));
    Object v28 = "[null]";
    Object v29 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v27).withSimpleName(((java.lang.String)v28));
    Object v30 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v29).setObjectIdInfo(((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v30));
    Object v31 = null;
    Object v32 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.DateDeserializer();
    Object v33 = ((com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty)v29).withValueDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v32));
    Object v34 = "";
    Object v35 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v33).withSimpleName(((java.lang.String)v34));
    org.junit.Assert.assertNotNull(v35);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = true;
    Object v3 = "Cannot use Object Id with Builder-based deserialization (type ";
    Object v4 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v3));
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = null;
    Object v9 = "0";
    Object v10 = true;
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.AnnotationCollector.emptyAnnotations();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v15));
    Object v17 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v18 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v16),((com.fasterxml.jackson.databind.JavaType[])v17));
    Object v19 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v14),((com.fasterxml.jackson.databind.type.TypeBindings)v18));
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotatedField(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v19),((java.lang.reflect.Field)v20),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v21));
    Object v23 = new com.fasterxml.jackson.databind.deser.impl.FieldProperty(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v12),((com.fasterxml.jackson.databind.util.Annotations)v13),((com.fasterxml.jackson.databind.introspect.AnnotatedField)v22));
    Object v24 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v25 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty(((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v23),((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v24));
    Object v26 = "Cannot use Object Id with Builder-based deserialization (type ";
    Object v27 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v26));
    Object v28 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty)v25),((com.fasterxml.jackson.databind.PropertyName)v27));
    Object v29 = com.fasterxml.jackson.databind.node.BooleanNode.getFalse();
    Object v30 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v29));
    Object v31 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v32 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v31));
    Object v33 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v32));
    Object v34 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v35 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v34));
    Object v36 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor.Base(((com.fasterxml.jackson.databind.SerializerProvider)v35));
    Object v37 = ((com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty)v28).deserializeSetAndReturn(((com.fasterxml.jackson.core.JsonParser)v30),((com.fasterxml.jackson.databind.DeserializationContext)v33),((java.lang.Object)v36));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = true;
    Object v3 = "Cannot use Object Id with Builder-based deserialization (type ";
    Object v4 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v3));
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = null;
    Object v9 = "0";
    Object v10 = true;
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.AnnotationCollector.emptyAnnotations();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v15));
    Object v17 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v18 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v16),((com.fasterxml.jackson.databind.JavaType[])v17));
    Object v19 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v14),((com.fasterxml.jackson.databind.type.TypeBindings)v18));
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotatedField(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v19),((java.lang.reflect.Field)v20),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v21));
    Object v23 = new com.fasterxml.jackson.databind.deser.impl.FieldProperty(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v12),((com.fasterxml.jackson.databind.util.Annotations)v13),((com.fasterxml.jackson.databind.introspect.AnnotatedField)v22));
    Object v24 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v25 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty(((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v23),((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v24));
    Object v26 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.DateDeserializer();
    Object v27 = ((com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty)v25).withValueDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v26));
    Object v28 = "";
    Object v29 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v27).withSimpleName(((java.lang.String)v28));
    org.junit.Assert.assertNotNull(v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = true;
    Object v3 = "Cannot use Object Id with Builder-based deserialization (type ";
    Object v4 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v3));
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = null;
    Object v9 = "0";
    Object v10 = true;
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.AnnotationCollector.emptyAnnotations();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v15));
    Object v17 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v18 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v16),((com.fasterxml.jackson.databind.JavaType[])v17));
    Object v19 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v14),((com.fasterxml.jackson.databind.type.TypeBindings)v18));
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotatedField(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v19),((java.lang.reflect.Field)v20),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v21));
    Object v23 = new com.fasterxml.jackson.databind.deser.impl.FieldProperty(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v12),((com.fasterxml.jackson.databind.util.Annotations)v13),((com.fasterxml.jackson.databind.introspect.AnnotatedField)v22));
    Object v24 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v25 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty(((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v23),((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v24));
    Object v26 = "";
    Object v27 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v25).withSimpleName(((java.lang.String)v26));
    Object v28 = "";
    Object v29 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v25).withSimpleName(((java.lang.String)v28));
    org.junit.Assert.assertNotNull(v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = true;
    Object v3 = "Cannot use Object Id with Builder-based deserialization (type ";
    Object v4 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v3));
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = null;
    Object v9 = "0";
    Object v10 = true;
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.AnnotationCollector.emptyAnnotations();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v15));
    Object v17 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v18 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v16),((com.fasterxml.jackson.databind.JavaType[])v17));
    Object v19 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v14),((com.fasterxml.jackson.databind.type.TypeBindings)v18));
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotatedField(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v19),((java.lang.reflect.Field)v20),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v21));
    Object v23 = new com.fasterxml.jackson.databind.deser.impl.FieldProperty(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v12),((com.fasterxml.jackson.databind.util.Annotations)v13),((com.fasterxml.jackson.databind.introspect.AnnotatedField)v22));
    Object v24 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v25 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty(((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v23),((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v24));
    Object v26 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.DateDeserializer();
    Object v27 = ((com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty)v25).withValueDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v26));
    Object v28 = ((com.fasterxml.jackson.databind.BeanProperty)v27).getFullName();
    Object v29 = null;
    Object v30 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v31 = null;
    Object v32 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v33 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v34 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v29),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v30),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v31),((com.fasterxml.jackson.databind.util.RootNameLookup)v32),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v33));
    Object v35 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v36 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v35));
    Object v37 = ((java.lang.Class)v36).getClasses();
    Object v38 = ((com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase)v27).findPropertyFormat(((com.fasterxml.jackson.databind.cfg.MapperConfig)v34),((java.lang.Class)v36));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = true;
    Object v3 = "Cannot use Object Id with Builder-based deserialization (type ";
    Object v4 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v3));
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = null;
    Object v9 = "0";
    Object v10 = true;
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.AnnotationCollector.emptyAnnotations();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v15));
    Object v17 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v18 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v16),((com.fasterxml.jackson.databind.JavaType[])v17));
    Object v19 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v14),((com.fasterxml.jackson.databind.type.TypeBindings)v18));
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotatedField(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v19),((java.lang.reflect.Field)v20),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v21));
    Object v23 = new com.fasterxml.jackson.databind.deser.impl.FieldProperty(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v12),((com.fasterxml.jackson.databind.util.Annotations)v13),((com.fasterxml.jackson.databind.introspect.AnnotatedField)v22));
    Object v24 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v25 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty(((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v23),((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v24));
    Object v26 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.DateDeserializer();
    Object v27 = ((com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty)v25).withValueDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v26));
    Object v28 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.DateDeserializer();
    Object v29 = ((com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty)v27).withNullProvider(((com.fasterxml.jackson.databind.deser.NullValueProvider)v28));
    org.junit.Assert.assertNotNull(v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = true;
    Object v3 = "Cannot use Object Id with Builder-based deserialization (type ";
    Object v4 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v3));
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = null;
    Object v9 = "0";
    Object v10 = true;
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.AnnotationCollector.emptyAnnotations();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v15));
    Object v17 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v18 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v16),((com.fasterxml.jackson.databind.JavaType[])v17));
    Object v19 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v14),((com.fasterxml.jackson.databind.type.TypeBindings)v18));
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotatedField(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v19),((java.lang.reflect.Field)v20),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v21));
    Object v23 = new com.fasterxml.jackson.databind.deser.impl.FieldProperty(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v12),((com.fasterxml.jackson.databind.util.Annotations)v13),((com.fasterxml.jackson.databind.introspect.AnnotatedField)v22));
    Object v24 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v25 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty(((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v23),((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v24));
    Object v26 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.DateDeserializer();
    Object v27 = ((com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty)v25).withNullProvider(((com.fasterxml.jackson.databind.deser.NullValueProvider)v26));
    Object v28 = ((com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase)v27).isVirtual();
    org.junit.Assert.assertEquals((Object)(false), v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = true;
    Object v3 = "Cannot use Object Id with Builder-based deserialization (type ";
    Object v4 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v3));
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = null;
    Object v9 = "0";
    Object v10 = true;
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.AnnotationCollector.emptyAnnotations();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v15));
    Object v17 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v18 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v16),((com.fasterxml.jackson.databind.JavaType[])v17));
    Object v19 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v14),((com.fasterxml.jackson.databind.type.TypeBindings)v18));
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotatedField(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v19),((java.lang.reflect.Field)v20),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v21));
    Object v23 = new com.fasterxml.jackson.databind.deser.impl.FieldProperty(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v12),((com.fasterxml.jackson.databind.util.Annotations)v13),((com.fasterxml.jackson.databind.introspect.AnnotatedField)v22));
    Object v24 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v25 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty(((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v23),((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v24));
    Object v26 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.DateDeserializer();
    Object v27 = ((com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty)v25).withValueDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v26));
    Object v28 = "[null]";
    Object v29 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v27).withSimpleName(((java.lang.String)v28));
    Object v30 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v31 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty(((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v29),((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v30));
    Object v32 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v31).hasValueDeserializer();
    org.junit.Assert.assertEquals((Object)(true), v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = true;
    Object v3 = "Cannot use Object Id with Builder-based deserialization (type ";
    Object v4 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v3));
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = null;
    Object v9 = "0";
    Object v10 = true;
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.AnnotationCollector.emptyAnnotations();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v15));
    Object v17 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v18 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v16),((com.fasterxml.jackson.databind.JavaType[])v17));
    Object v19 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v14),((com.fasterxml.jackson.databind.type.TypeBindings)v18));
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotatedField(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v19),((java.lang.reflect.Field)v20),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v21));
    Object v23 = new com.fasterxml.jackson.databind.deser.impl.FieldProperty(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v12),((com.fasterxml.jackson.databind.util.Annotations)v13),((com.fasterxml.jackson.databind.introspect.AnnotatedField)v22));
    Object v24 = 0;
    ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v23).assignIndex((((java.lang.Integer)v24).intValue()));
    Object v25 = null;
    org.junit.Assert.assertNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = true;
    Object v3 = "Cannot use Object Id with Builder-based deserialization (type ";
    Object v4 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v3));
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = null;
    Object v9 = "0";
    Object v10 = true;
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.AnnotationCollector.emptyAnnotations();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v15));
    Object v17 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v18 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v16),((com.fasterxml.jackson.databind.JavaType[])v17));
    Object v19 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v14),((com.fasterxml.jackson.databind.type.TypeBindings)v18));
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotatedField(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v19),((java.lang.reflect.Field)v20),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v21));
    Object v23 = new com.fasterxml.jackson.databind.deser.impl.FieldProperty(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v12),((com.fasterxml.jackson.databind.util.Annotations)v13),((com.fasterxml.jackson.databind.introspect.AnnotatedField)v22));
    Object v24 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v25 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty(((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v23),((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v24));
    Object v26 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.DateDeserializer();
    Object v27 = ((com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty)v25).withValueDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v26));
    Object v28 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.DateDeserializer();
    Object v29 = ((com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty)v27).withNullProvider(((com.fasterxml.jackson.databind.deser.NullValueProvider)v28));
    Object v30 = "Cannot use Object Id with Builder-based deserialization (type ";
    Object v31 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v30));
    Object v32 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty)v29),((com.fasterxml.jackson.databind.PropertyName)v31));
    org.junit.Assert.assertNotNull(v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = true;
    Object v3 = "Cannot use Object Id with Builder-based deserialization (type ";
    Object v4 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v3));
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = null;
    Object v9 = "0";
    Object v10 = true;
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.AnnotationCollector.emptyAnnotations();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v15));
    Object v17 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v18 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v16),((com.fasterxml.jackson.databind.JavaType[])v17));
    Object v19 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v14),((com.fasterxml.jackson.databind.type.TypeBindings)v18));
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotatedField(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v19),((java.lang.reflect.Field)v20),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v21));
    Object v23 = new com.fasterxml.jackson.databind.deser.impl.FieldProperty(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v12),((com.fasterxml.jackson.databind.util.Annotations)v13),((com.fasterxml.jackson.databind.introspect.AnnotatedField)v22));
    Object v24 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v25 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty(((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v23),((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v24));
    Object v26 = "Cannot use Object Id with Builder-based deserialization (type ";
    Object v27 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v26));
    Object v28 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty)v25),((com.fasterxml.jackson.databind.PropertyName)v27));
    Object v29 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v28).setObjectIdInfo(((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v29));
    Object v30 = null;
    Object v31 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v28).getWrapperName();
    org.junit.Assert.assertNull(v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = true;
    Object v3 = "Cannot use Object Id with Builder-based deserialization (type ";
    Object v4 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v3));
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = null;
    Object v9 = "0";
    Object v10 = true;
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.AnnotationCollector.emptyAnnotations();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v15));
    Object v17 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v18 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v16),((com.fasterxml.jackson.databind.JavaType[])v17));
    Object v19 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v14),((com.fasterxml.jackson.databind.type.TypeBindings)v18));
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotatedField(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v19),((java.lang.reflect.Field)v20),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v21));
    Object v23 = new com.fasterxml.jackson.databind.deser.impl.FieldProperty(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v12),((com.fasterxml.jackson.databind.util.Annotations)v13),((com.fasterxml.jackson.databind.introspect.AnnotatedField)v22));
    Object v24 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v25 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty(((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v23),((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v24));
    Object v26 = "g";
    ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v25).setManagedReferenceName(((java.lang.String)v26));
    Object v27 = null;
    Object v28 = "Cannot use Object Id with Builder-based deserialization (type ";
    Object v29 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v28));
    Object v30 = ((com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty)v25).withName(((com.fasterxml.jackson.databind.PropertyName)v29));
    org.junit.Assert.assertNotNull(v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = true;
    Object v3 = "Cannot use Object Id with Builder-based deserialization (type ";
    Object v4 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v3));
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = null;
    Object v9 = "0";
    Object v10 = true;
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.AnnotationCollector.emptyAnnotations();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v15));
    Object v17 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v18 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v16),((com.fasterxml.jackson.databind.JavaType[])v17));
    Object v19 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v14),((com.fasterxml.jackson.databind.type.TypeBindings)v18));
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotatedField(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v19),((java.lang.reflect.Field)v20),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v21));
    Object v23 = new com.fasterxml.jackson.databind.deser.impl.FieldProperty(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v12),((com.fasterxml.jackson.databind.util.Annotations)v13),((com.fasterxml.jackson.databind.introspect.AnnotatedField)v22));
    Object v24 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v25 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty(((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v23),((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v24));
    Object v26 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.DateDeserializer();
    Object v27 = ((com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty)v25).withNullProvider(((com.fasterxml.jackson.databind.deser.NullValueProvider)v26));
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v29 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v28));
    Object v30 = ">";
    Object v31 = ((java.lang.Class)v29).getResourceAsStream(((java.lang.String)v30));
    Object v32 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v27).visibleInView(((java.lang.Class)v29));
    org.junit.Assert.assertEquals((Object)(true), v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = true;
    Object v3 = "Cannot use Object Id with Builder-based deserialization (type ";
    Object v4 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v3));
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = null;
    Object v9 = "0";
    Object v10 = true;
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.AnnotationCollector.emptyAnnotations();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v15));
    Object v17 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v18 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v16),((com.fasterxml.jackson.databind.JavaType[])v17));
    Object v19 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v14),((com.fasterxml.jackson.databind.type.TypeBindings)v18));
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotatedField(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v19),((java.lang.reflect.Field)v20),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v21));
    Object v23 = new com.fasterxml.jackson.databind.deser.impl.FieldProperty(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v12),((com.fasterxml.jackson.databind.util.Annotations)v13),((com.fasterxml.jackson.databind.introspect.AnnotatedField)v22));
    Object v24 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v25 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty(((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v23),((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v24));
    Object v26 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.DateDeserializer();
    Object v27 = ((com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty)v25).withValueDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v26));
    Object v28 = "";
    Object v29 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v27).withSimpleName(((java.lang.String)v28));
    Object v30 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.DateDeserializer();
    Object v31 = ((com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty)v29).withValueDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v30));
    org.junit.Assert.assertNotNull(v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = true;
    Object v3 = "Cannot use Object Id with Builder-based deserialization (type ";
    Object v4 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v3));
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = null;
    Object v9 = "0";
    Object v10 = true;
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.AnnotationCollector.emptyAnnotations();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v15));
    Object v17 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v18 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v16),((com.fasterxml.jackson.databind.JavaType[])v17));
    Object v19 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v14),((com.fasterxml.jackson.databind.type.TypeBindings)v18));
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotatedField(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v19),((java.lang.reflect.Field)v20),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v21));
    Object v23 = new com.fasterxml.jackson.databind.deser.impl.FieldProperty(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v12),((com.fasterxml.jackson.databind.util.Annotations)v13),((com.fasterxml.jackson.databind.introspect.AnnotatedField)v22));
    Object v24 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v25 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty(((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v23),((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v24));
    Object v26 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.DateDeserializer();
    Object v27 = ((com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty)v25).withValueDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v26));
    Object v28 = "";
    Object v29 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v27).withSimpleName(((java.lang.String)v28));
    Object v30 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v31 = ((com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase)v29).findFormatOverrides(((com.fasterxml.jackson.databind.AnnotationIntrospector)v30));
    org.junit.Assert.assertNotNull(v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = true;
    Object v3 = "Cannot use Object Id with Builder-based deserialization (type ";
    Object v4 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v3));
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = null;
    Object v9 = "0";
    Object v10 = true;
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.AnnotationCollector.emptyAnnotations();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v15));
    Object v17 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v18 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v16),((com.fasterxml.jackson.databind.JavaType[])v17));
    Object v19 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v14),((com.fasterxml.jackson.databind.type.TypeBindings)v18));
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotatedField(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v19),((java.lang.reflect.Field)v20),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v21));
    Object v23 = new com.fasterxml.jackson.databind.deser.impl.FieldProperty(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v12),((com.fasterxml.jackson.databind.util.Annotations)v13),((com.fasterxml.jackson.databind.introspect.AnnotatedField)v22));
    Object v24 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v25 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty(((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v23),((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v24));
    Object v26 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.DateDeserializer();
    Object v27 = ((com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty)v25).withValueDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v26));
    Object v28 = "[null]";
    Object v29 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v27).withSimpleName(((java.lang.String)v28));
    Object v30 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v31 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty(((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v29),((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v30));
    Object v32 = new java.lang.Class[]{};
    ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v31).setViews(((java.lang.Class[])v32));
    Object v33 = null;
    Object v34 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v31).hasViews();
    org.junit.Assert.assertEquals((Object)(true), v34);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = true;
    Object v3 = "Cannot use Object Id with Builder-based deserialization (type ";
    Object v4 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v3));
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = null;
    Object v9 = "0";
    Object v10 = true;
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.AnnotationCollector.emptyAnnotations();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v15));
    Object v17 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v18 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v16),((com.fasterxml.jackson.databind.JavaType[])v17));
    Object v19 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v14),((com.fasterxml.jackson.databind.type.TypeBindings)v18));
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotatedField(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v19),((java.lang.reflect.Field)v20),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v21));
    Object v23 = new com.fasterxml.jackson.databind.deser.impl.FieldProperty(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v12),((com.fasterxml.jackson.databind.util.Annotations)v13),((com.fasterxml.jackson.databind.introspect.AnnotatedField)v22));
    Object v24 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v25 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty(((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v23),((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v24));
    Object v26 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.DateDeserializer();
    Object v27 = ((com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty)v25).withValueDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v26));
    Object v28 = "[null]";
    Object v29 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v27).withSimpleName(((java.lang.String)v28));
    Object v30 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.DateDeserializer();
    Object v31 = ((com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty)v29).withValueDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v30));
    org.junit.Assert.assertNotNull(v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = true;
    Object v3 = "Cannot use Object Id with Builder-based deserialization (type ";
    Object v4 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v3));
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = null;
    Object v9 = "0";
    Object v10 = true;
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.AnnotationCollector.emptyAnnotations();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v15));
    Object v17 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v18 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v16),((com.fasterxml.jackson.databind.JavaType[])v17));
    Object v19 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v14),((com.fasterxml.jackson.databind.type.TypeBindings)v18));
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotatedField(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v19),((java.lang.reflect.Field)v20),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v21));
    Object v23 = new com.fasterxml.jackson.databind.deser.impl.FieldProperty(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v12),((com.fasterxml.jackson.databind.util.Annotations)v13),((com.fasterxml.jackson.databind.introspect.AnnotatedField)v22));
    Object v24 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v25 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty(((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v23),((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v24));
    Object v26 = "";
    Object v27 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v25).withSimpleName(((java.lang.String)v26));
    Object v28 = "";
    Object v29 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v25).withSimpleName(((java.lang.String)v28));
    Object v30 = 1;
    ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v29).assignIndex((((java.lang.Integer)v30).intValue()));
    Object v31 = null;
    Object v32 = com.fasterxml.jackson.databind.node.BooleanNode.getFalse();
    Object v33 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v32));
    Object v34 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v35 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v34));
    Object v36 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v35));
    Object v37 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v38 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v29).deserializeWith(((com.fasterxml.jackson.core.JsonParser)v33),((com.fasterxml.jackson.databind.DeserializationContext)v36),((java.lang.Object)v37));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.exc.InvalidDefinitionException");
    } catch (com.fasterxml.jackson.databind.exc.InvalidDefinitionException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = true;
    Object v3 = "Cannot use Object Id with Builder-based deserialization (type ";
    Object v4 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v3));
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = null;
    Object v9 = "0";
    Object v10 = true;
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.AnnotationCollector.emptyAnnotations();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v15));
    Object v17 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v18 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v16),((com.fasterxml.jackson.databind.JavaType[])v17));
    Object v19 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v14),((com.fasterxml.jackson.databind.type.TypeBindings)v18));
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotatedField(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v19),((java.lang.reflect.Field)v20),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v21));
    Object v23 = new com.fasterxml.jackson.databind.deser.impl.FieldProperty(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v12),((com.fasterxml.jackson.databind.util.Annotations)v13),((com.fasterxml.jackson.databind.introspect.AnnotatedField)v22));
    Object v24 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v25 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty(((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v23),((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v24));
    Object v26 = "Cannot use Object Id with Builder-based deserialization (type ";
    Object v27 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v26));
    Object v28 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty(((com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty)v25),((com.fasterxml.jackson.databind.PropertyName)v27));
    Object v29 = "array";
    ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v28).setManagedReferenceName(((java.lang.String)v29));
    Object v30 = null;
    Object v31 = "Cannot use Object Id with Builder-based deserialization (type ";
    Object v32 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v31));
    Object v33 = ((com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty)v28).withName(((com.fasterxml.jackson.databind.PropertyName)v32));
    Object v34 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v33).toString();
    Object v35 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.DateDeserializer();
    Object v36 = ((com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty)v33).withValueDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v35));
    org.junit.Assert.assertNotNull(v36);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = true;
    Object v3 = "Cannot use Object Id with Builder-based deserialization (type ";
    Object v4 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v3));
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = null;
    Object v9 = "0";
    Object v10 = true;
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.AnnotationCollector.emptyAnnotations();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v15));
    Object v17 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v18 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v16),((com.fasterxml.jackson.databind.JavaType[])v17));
    Object v19 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v14),((com.fasterxml.jackson.databind.type.TypeBindings)v18));
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotatedField(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v19),((java.lang.reflect.Field)v20),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v21));
    Object v23 = new com.fasterxml.jackson.databind.deser.impl.FieldProperty(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v12),((com.fasterxml.jackson.databind.util.Annotations)v13),((com.fasterxml.jackson.databind.introspect.AnnotatedField)v22));
    Object v24 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v25 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty(((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v23),((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v24));
    Object v26 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.DateDeserializer();
    Object v27 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v25).withNullProvider(((com.fasterxml.jackson.databind.deser.NullValueProvider)v26));
    Object v28 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v29 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty(((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v25),((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v28));
    org.junit.Assert.assertNotNull(v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = true;
    Object v3 = "Cannot use Object Id with Builder-based deserialization (type ";
    Object v4 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v3));
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),(((java.lang.Boolean)v2).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = null;
    Object v9 = "0";
    Object v10 = true;
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer(((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v8),((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.AnnotationCollector.emptyAnnotations();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v15));
    Object v17 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v18 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v16),((com.fasterxml.jackson.databind.JavaType[])v17));
    Object v19 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v14),((com.fasterxml.jackson.databind.type.TypeBindings)v18));
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotatedField(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v19),((java.lang.reflect.Field)v20),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v21));
    Object v23 = new com.fasterxml.jackson.databind.deser.impl.FieldProperty(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.jsontype.TypeDeserializer)v12),((com.fasterxml.jackson.databind.util.Annotations)v13),((com.fasterxml.jackson.databind.introspect.AnnotatedField)v22));
    Object v24 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v25 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty(((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v23),((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v24));
    Object v26 = new com.fasterxml.jackson.databind.deser.std.DateDeserializers.DateDeserializer();
    Object v27 = ((com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty)v25).withValueDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v26));
    Object v28 = "[null]";
    Object v29 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v27).withSimpleName(((java.lang.String)v28));
    Object v30 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v29).setObjectIdInfo(((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v30));
    Object v31 = null;
    org.junit.Assert.assertNull(v31);
  }
}
