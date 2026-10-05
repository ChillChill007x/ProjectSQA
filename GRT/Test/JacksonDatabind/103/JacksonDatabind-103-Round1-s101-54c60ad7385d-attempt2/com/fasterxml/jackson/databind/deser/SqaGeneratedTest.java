package com.fasterxml.jackson.databind.deser;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "' W";
    Object v2 = new java.lang.NoClassDefFoundError(((java.lang.String)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer(((java.lang.NoClassDefFoundError)v2));
    Object v4 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v0).withNullProvider(((com.fasterxml.jackson.databind.deser.NullValueProvider)v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = "d (";
    Object v1 = null;
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = true;
    Object v4 = "WRITE_ENUMS_USING_INDEX";
    Object v5 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),(((java.lang.Boolean)v3).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v8 = "' W";
    Object v9 = new java.lang.NoClassDefFoundError(((java.lang.String)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer(((java.lang.NoClassDefFoundError)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v10));
    Object v12 = "' W";
    Object v13 = new java.lang.NoClassDefFoundError(((java.lang.String)v12));
    Object v14 = new com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer(((java.lang.NoClassDefFoundError)v13));
    Object v15 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v14));
    Object v16 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v17 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v15),((com.fasterxml.jackson.databind.JavaType[])v16));
    Object v18 = new com.fasterxml.jackson.databind.type.ResolvedRecursiveType(((java.lang.Class)v11),((com.fasterxml.jackson.databind.type.TypeBindings)v17));
    Object v19 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v0),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v6),((com.fasterxml.jackson.databind.util.Annotations)v7),((com.fasterxml.jackson.databind.JavaType)v18));
    Object v20 = ((com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase)v19).isRequired();
    org.junit.Assert.assertEquals((Object)(false), v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = "d (";
    Object v1 = null;
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = true;
    Object v4 = "WRITE_ENUMS_USING_INDEX";
    Object v5 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),(((java.lang.Boolean)v3).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v8 = "' W";
    Object v9 = new java.lang.NoClassDefFoundError(((java.lang.String)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer(((java.lang.NoClassDefFoundError)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v10));
    Object v12 = "' W";
    Object v13 = new java.lang.NoClassDefFoundError(((java.lang.String)v12));
    Object v14 = new com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer(((java.lang.NoClassDefFoundError)v13));
    Object v15 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v14));
    Object v16 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v17 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v15),((com.fasterxml.jackson.databind.JavaType[])v16));
    Object v18 = new com.fasterxml.jackson.databind.type.ResolvedRecursiveType(((java.lang.Class)v11),((com.fasterxml.jackson.databind.type.TypeBindings)v17));
    Object v19 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v0),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v6),((com.fasterxml.jackson.databind.util.Annotations)v7),((com.fasterxml.jackson.databind.JavaType)v18));
    Object v20 = new java.lang.Class[]{null};
    Object v21 = com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter.constructViewBased(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v19),((java.lang.Class[])v20));
    Object v22 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v23 = ((com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase)v21).findFormatOverrides(((com.fasterxml.jackson.databind.AnnotationIntrospector)v22));
    org.junit.Assert.assertNotNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = "] (for ";
    Object v1 = null;
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = true;
    Object v4 = "WRITE_ENUMS_USING_INDEX";
    Object v5 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),(((java.lang.Boolean)v3).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v8 = "' W";
    Object v9 = new java.lang.NoClassDefFoundError(((java.lang.String)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer(((java.lang.NoClassDefFoundError)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v10));
    Object v12 = "' W";
    Object v13 = new java.lang.NoClassDefFoundError(((java.lang.String)v12));
    Object v14 = new com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer(((java.lang.NoClassDefFoundError)v13));
    Object v15 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v14));
    Object v16 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v17 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v15),((com.fasterxml.jackson.databind.JavaType[])v16));
    Object v18 = new com.fasterxml.jackson.databind.type.ResolvedRecursiveType(((java.lang.Class)v11),((com.fasterxml.jackson.databind.type.TypeBindings)v17));
    Object v19 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v0),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v6),((com.fasterxml.jackson.databind.util.Annotations)v7),((com.fasterxml.jackson.databind.JavaType)v18));
    Object v20 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v21 = ((com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase)v19).findFormatOverrides(((com.fasterxml.jackson.databind.AnnotationIntrospector)v20));
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "' W";
    Object v2 = new java.lang.NoClassDefFoundError(((java.lang.String)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer(((java.lang.NoClassDefFoundError)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = ((com.fasterxml.jackson.databind.deser.NullValueProvider)v3).getNullValue(((com.fasterxml.jackson.databind.DeserializationContext)v6));
    Object v8 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v0).withNullProvider(((com.fasterxml.jackson.databind.deser.NullValueProvider)v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = Short.valueOf((short)52);
    Object v2 = com.fasterxml.jackson.databind.node.ShortNode.valueOf((((java.lang.Short)v1).shortValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2));
    Object v4 = Short.valueOf((short)52);
    Object v5 = com.fasterxml.jackson.databind.node.ShortNode.valueOf((((java.lang.Short)v4).shortValue()));
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v5));
    Object v7 = "WRAP_ROT_VALUE";
    Object v8 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseWithUnderscoresStrategy();
    Object v9 = "' W";
    Object v10 = new java.lang.NoClassDefFoundError(((java.lang.String)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer(((java.lang.NoClassDefFoundError)v10));
    Object v12 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v11));
    Object v13 = com.fasterxml.jackson.databind.exc.InvalidFormatException.from(((com.fasterxml.jackson.core.JsonParser)v6),((java.lang.String)v7),((java.lang.Object)v8),((java.lang.Class)v12));
    Object v14 = ((java.lang.Throwable)v13).fillInStackTrace();
    Object v15 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v0)._throwAsIOE(((com.fasterxml.jackson.core.JsonParser)v3),((java.lang.Exception)v13),((java.lang.Object)v15));
    Object v16 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = Short.valueOf((short)52);
    Object v2 = com.fasterxml.jackson.databind.node.ShortNode.valueOf((((java.lang.Short)v1).shortValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2));
    Object v4 = "WRAP_ROT_VALUE";
    Object v5 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseWithUnderscoresStrategy();
    Object v6 = "' W";
    Object v7 = new java.lang.NoClassDefFoundError(((java.lang.String)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer(((java.lang.NoClassDefFoundError)v7));
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v8));
    Object v10 = com.fasterxml.jackson.databind.exc.InvalidFormatException.from(((com.fasterxml.jackson.core.JsonParser)v3),((java.lang.String)v4),((java.lang.Object)v5),((java.lang.Class)v9));
    Object v11 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v0)._throwAsIOE(((java.lang.Exception)v10));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v0).hasViews();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "IGNORE_M";
    Object v2 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v0).withSimpleName(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v0).getDeclaringClass();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = "] (for ";
    Object v1 = null;
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = true;
    Object v4 = "WRITE_ENUMS_USING_INDEX";
    Object v5 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),(((java.lang.Boolean)v3).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v8 = "' W";
    Object v9 = new java.lang.NoClassDefFoundError(((java.lang.String)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer(((java.lang.NoClassDefFoundError)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v10));
    Object v12 = "' W";
    Object v13 = new java.lang.NoClassDefFoundError(((java.lang.String)v12));
    Object v14 = new com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer(((java.lang.NoClassDefFoundError)v13));
    Object v15 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v14));
    Object v16 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v17 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v15),((com.fasterxml.jackson.databind.JavaType[])v16));
    Object v18 = new com.fasterxml.jackson.databind.type.ResolvedRecursiveType(((java.lang.Class)v11),((com.fasterxml.jackson.databind.type.TypeBindings)v17));
    Object v19 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v0),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v6),((com.fasterxml.jackson.databind.util.Annotations)v7),((com.fasterxml.jackson.databind.JavaType)v18));
    Object v20 = ((com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase)v19).getMetadata();
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = "] (for ";
    Object v1 = null;
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = true;
    Object v4 = "WRITE_ENUMS_USING_INDEX";
    Object v5 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),(((java.lang.Boolean)v3).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v8 = "' W";
    Object v9 = new java.lang.NoClassDefFoundError(((java.lang.String)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer(((java.lang.NoClassDefFoundError)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v10));
    Object v12 = "' W";
    Object v13 = new java.lang.NoClassDefFoundError(((java.lang.String)v12));
    Object v14 = new com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer(((java.lang.NoClassDefFoundError)v13));
    Object v15 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v14));
    Object v16 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v17 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v15),((com.fasterxml.jackson.databind.JavaType[])v16));
    Object v18 = new com.fasterxml.jackson.databind.type.ResolvedRecursiveType(((java.lang.Class)v11),((com.fasterxml.jackson.databind.type.TypeBindings)v17));
    Object v19 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v0),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v6),((com.fasterxml.jackson.databind.util.Annotations)v7),((com.fasterxml.jackson.databind.JavaType)v18));
    Object v20 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v21 = ((com.fasterxml.jackson.databind.AnnotationIntrospector)v20).allIntrospectors();
    Object v22 = ((com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase)v19).findFormatOverrides(((com.fasterxml.jackson.databind.AnnotationIntrospector)v20));
    org.junit.Assert.assertNotNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = "] (for ";
    Object v1 = null;
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = true;
    Object v4 = "WRITE_ENUMS_USING_INDEX";
    Object v5 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),(((java.lang.Boolean)v3).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v8 = "' W";
    Object v9 = new java.lang.NoClassDefFoundError(((java.lang.String)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer(((java.lang.NoClassDefFoundError)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v10));
    Object v12 = "' W";
    Object v13 = new java.lang.NoClassDefFoundError(((java.lang.String)v12));
    Object v14 = new com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer(((java.lang.NoClassDefFoundError)v13));
    Object v15 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v14));
    Object v16 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v17 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v15),((com.fasterxml.jackson.databind.JavaType[])v16));
    Object v18 = new com.fasterxml.jackson.databind.type.ResolvedRecursiveType(((java.lang.Class)v11),((com.fasterxml.jackson.databind.type.TypeBindings)v17));
    Object v19 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v0),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v6),((com.fasterxml.jackson.databind.util.Annotations)v7),((com.fasterxml.jackson.databind.JavaType)v18));
    Object v20 = ((com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase)v19).isRequired();
    org.junit.Assert.assertEquals((Object)(false), v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "' W";
    Object v2 = new java.lang.NoClassDefFoundError(((java.lang.String)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer(((java.lang.NoClassDefFoundError)v2));
    Object v4 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v3));
    Object v5 = ((java.lang.Class)v4).getSigners();
    Object v6 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v0).visibleInView(((java.lang.Class)v4));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = Short.valueOf((short)52);
    Object v2 = com.fasterxml.jackson.databind.node.ShortNode.valueOf((((java.lang.Short)v1).shortValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = "' W";
    Object v8 = new java.lang.NoClassDefFoundError(((java.lang.String)v7));
    Object v9 = new com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer(((java.lang.NoClassDefFoundError)v8));
    ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v0).deserializeAndSet(((com.fasterxml.jackson.core.JsonParser)v3),((com.fasterxml.jackson.databind.DeserializationContext)v6),((java.lang.Object)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = "d (";
    Object v1 = null;
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = true;
    Object v4 = "WRITE_ENUMS_USING_INDEX";
    Object v5 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),(((java.lang.Boolean)v3).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v8 = "' W";
    Object v9 = new java.lang.NoClassDefFoundError(((java.lang.String)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer(((java.lang.NoClassDefFoundError)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v10));
    Object v12 = "' W";
    Object v13 = new java.lang.NoClassDefFoundError(((java.lang.String)v12));
    Object v14 = new com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer(((java.lang.NoClassDefFoundError)v13));
    Object v15 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v14));
    Object v16 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v17 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v15),((com.fasterxml.jackson.databind.JavaType[])v16));
    Object v18 = new com.fasterxml.jackson.databind.type.ResolvedRecursiveType(((java.lang.Class)v11),((com.fasterxml.jackson.databind.type.TypeBindings)v17));
    Object v19 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v0),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v6),((com.fasterxml.jackson.databind.util.Annotations)v7),((com.fasterxml.jackson.databind.JavaType)v18));
    Object v20 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v21 = ((com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase)v19).findFormatOverrides(((com.fasterxml.jackson.databind.AnnotationIntrospector)v20));
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v0).isIgnorable();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "string";
    Object v2 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v0).withSimpleName(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "' W";
    Object v2 = new java.lang.NoClassDefFoundError(((java.lang.String)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer(((java.lang.NoClassDefFoundError)v2));
    Object v4 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v3));
    Object v5 = ((java.lang.Class)v4).getSigners();
    Object v6 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v0).getAnnotation(((java.lang.Class)v4));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = "] (for ";
    Object v1 = null;
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = true;
    Object v4 = "WRITE_ENUMS_USING_INDEX";
    Object v5 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),(((java.lang.Boolean)v3).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v8 = "' W";
    Object v9 = new java.lang.NoClassDefFoundError(((java.lang.String)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer(((java.lang.NoClassDefFoundError)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v10));
    Object v12 = "' W";
    Object v13 = new java.lang.NoClassDefFoundError(((java.lang.String)v12));
    Object v14 = new com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer(((java.lang.NoClassDefFoundError)v13));
    Object v15 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v14));
    Object v16 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v17 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v15),((com.fasterxml.jackson.databind.JavaType[])v16));
    Object v18 = new com.fasterxml.jackson.databind.type.ResolvedRecursiveType(((java.lang.Class)v11),((com.fasterxml.jackson.databind.type.TypeBindings)v17));
    Object v19 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v0),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v6),((com.fasterxml.jackson.databind.util.Annotations)v7),((com.fasterxml.jackson.databind.JavaType)v18));
    Object v20 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v21 = ((com.fasterxml.jackson.databind.AnnotationIntrospector)v20).version();
    Object v22 = ((com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase)v19).findFormatOverrides(((com.fasterxml.jackson.databind.AnnotationIntrospector)v20));
    org.junit.Assert.assertNotNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = "' W";
    Object v3 = new java.lang.NoClassDefFoundError(((java.lang.String)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer(((java.lang.NoClassDefFoundError)v3));
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v7 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v5),((com.fasterxml.jackson.databind.JavaType[])v6));
    Object v8 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v7));
    Object v9 = "' W";
    Object v10 = new java.lang.NoClassDefFoundError(((java.lang.String)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer(((java.lang.NoClassDefFoundError)v10));
    Object v12 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v11));
    Object v13 = "com.sun.rowset.JdbcRowSetImpl";
    Object v14 = "' W";
    Object v15 = new java.lang.NoClassDefFoundError(((java.lang.String)v14));
    Object v16 = new com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer(((java.lang.NoClassDefFoundError)v15));
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v16));
    Object v18 = "' W";
    Object v19 = new java.lang.NoClassDefFoundError(((java.lang.String)v18));
    Object v20 = new com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer(((java.lang.NoClassDefFoundError)v19));
    Object v21 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v20));
    Object v22 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v23 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v21),((com.fasterxml.jackson.databind.JavaType[])v22));
    Object v24 = new com.fasterxml.jackson.databind.type.ResolvedRecursiveType(((java.lang.Class)v17),((com.fasterxml.jackson.databind.type.TypeBindings)v23));
    Object v25 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v8),((java.lang.Class)v12),((java.lang.String)v13),((com.fasterxml.jackson.databind.JavaType)v24));
    Object v26 = "' W";
    Object v27 = new java.lang.NoClassDefFoundError(((java.lang.String)v26));
    Object v28 = new com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer(((java.lang.NoClassDefFoundError)v27));
    ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v0).set(((java.lang.Object)v25),((java.lang.Object)v28));
    Object v29 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = Short.valueOf((short)52);
    Object v2 = com.fasterxml.jackson.databind.node.ShortNode.valueOf((((java.lang.Short)v1).shortValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = "] (for ";
    Object v8 = null;
    Object v9 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v10 = true;
    Object v11 = "WRITE_ENUMS_USING_INDEX";
    Object v12 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v11));
    Object v13 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v8),((com.fasterxml.jackson.databind.AnnotationIntrospector)v9),(((java.lang.Boolean)v10).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v12));
    Object v14 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v15 = "' W";
    Object v16 = new java.lang.NoClassDefFoundError(((java.lang.String)v15));
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer(((java.lang.NoClassDefFoundError)v16));
    Object v18 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v17));
    Object v19 = "' W";
    Object v20 = new java.lang.NoClassDefFoundError(((java.lang.String)v19));
    Object v21 = new com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer(((java.lang.NoClassDefFoundError)v20));
    Object v22 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v21));
    Object v23 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v24 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v22),((com.fasterxml.jackson.databind.JavaType[])v23));
    Object v25 = new com.fasterxml.jackson.databind.type.ResolvedRecursiveType(((java.lang.Class)v18),((com.fasterxml.jackson.databind.type.TypeBindings)v24));
    Object v26 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v7),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v13),((com.fasterxml.jackson.databind.util.Annotations)v14),((com.fasterxml.jackson.databind.JavaType)v25));
    Object v27 = ((com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase)v26).getMetadata();
    Object v28 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v0).deserializeWith(((com.fasterxml.jackson.core.JsonParser)v3),((com.fasterxml.jackson.databind.DeserializationContext)v6),((java.lang.Object)v27));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = "] (for ";
    Object v1 = null;
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = true;
    Object v4 = "WRITE_ENUMS_USING_INDEX";
    Object v5 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),(((java.lang.Boolean)v3).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v8 = "' W";
    Object v9 = new java.lang.NoClassDefFoundError(((java.lang.String)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer(((java.lang.NoClassDefFoundError)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v10));
    Object v12 = "' W";
    Object v13 = new java.lang.NoClassDefFoundError(((java.lang.String)v12));
    Object v14 = new com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer(((java.lang.NoClassDefFoundError)v13));
    Object v15 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v14));
    Object v16 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v17 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v15),((com.fasterxml.jackson.databind.JavaType[])v16));
    Object v18 = new com.fasterxml.jackson.databind.type.ResolvedRecursiveType(((java.lang.Class)v11),((com.fasterxml.jackson.databind.type.TypeBindings)v17));
    Object v19 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v0),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v6),((com.fasterxml.jackson.databind.util.Annotations)v7),((com.fasterxml.jackson.databind.JavaType)v18));
    Object v20 = null;
    Object v21 = ((com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase)v19).findAliases(((com.fasterxml.jackson.databind.cfg.MapperConfig)v20));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "' W";
    Object v2 = new java.lang.NoClassDefFoundError(((java.lang.String)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer(((java.lang.NoClassDefFoundError)v2));
    Object v4 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v0).withValueDeserializer(((com.fasterxml.jackson.databind.JsonDeserializer)v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v1));
    Object v3 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor.Base(((com.fasterxml.jackson.databind.SerializerProvider)v2));
    Object v4 = "";
    Object v5 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v6 = "' W";
    Object v7 = new java.lang.NoClassDefFoundError(((java.lang.String)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer(((java.lang.NoClassDefFoundError)v7));
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v8));
    Object v10 = "' W";
    Object v11 = new java.lang.NoClassDefFoundError(((java.lang.String)v10));
    Object v12 = new com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer(((java.lang.NoClassDefFoundError)v11));
    Object v13 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v12));
    Object v14 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v15 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v13),((com.fasterxml.jackson.databind.JavaType[])v14));
    Object v16 = new com.fasterxml.jackson.databind.type.ResolvedRecursiveType(((java.lang.Class)v9),((com.fasterxml.jackson.databind.type.TypeBindings)v15));
    ((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor)v3).optionalProperty(((java.lang.String)v4),((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitable)v5),((com.fasterxml.jackson.databind.JavaType)v16));
    Object v17 = null;
    Object v18 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v19 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v18));
    ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v0).depositSchemaProperty(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor)v3),((com.fasterxml.jackson.databind.SerializerProvider)v19));
    Object v20 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v2 = Short.valueOf((short)52);
    Object v3 = com.fasterxml.jackson.databind.node.ShortNode.valueOf((((java.lang.Short)v2).shortValue()));
    ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v0).set(((java.lang.Object)v1),((java.lang.Object)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = "] (for ";
    Object v1 = null;
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = true;
    Object v4 = "WRITE_ENUMS_USING_INDEX";
    Object v5 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),(((java.lang.Boolean)v3).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v8 = "' W";
    Object v9 = new java.lang.NoClassDefFoundError(((java.lang.String)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer(((java.lang.NoClassDefFoundError)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v10));
    Object v12 = "' W";
    Object v13 = new java.lang.NoClassDefFoundError(((java.lang.String)v12));
    Object v14 = new com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer(((java.lang.NoClassDefFoundError)v13));
    Object v15 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v14));
    Object v16 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v17 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v15),((com.fasterxml.jackson.databind.JavaType[])v16));
    Object v18 = new com.fasterxml.jackson.databind.type.ResolvedRecursiveType(((java.lang.Class)v11),((com.fasterxml.jackson.databind.type.TypeBindings)v17));
    Object v19 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v0),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v6),((com.fasterxml.jackson.databind.util.Annotations)v7),((com.fasterxml.jackson.databind.JavaType)v18));
    Object v20 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v21 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v20));
    Object v22 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor.Base(((com.fasterxml.jackson.databind.SerializerProvider)v21));
    Object v23 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v24 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v23));
    ((com.fasterxml.jackson.databind.BeanProperty)v19).depositSchemaProperty(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor)v22),((com.fasterxml.jackson.databind.SerializerProvider)v24));
    Object v25 = null;
    Object v26 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v27 = ((com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase)v19).findFormatOverrides(((com.fasterxml.jackson.databind.AnnotationIntrospector)v26));
    org.junit.Assert.assertNotNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = null;
    ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v0).markAsIgnorable();
    Object v1 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "' W";
    Object v2 = new java.lang.NoClassDefFoundError(((java.lang.String)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer(((java.lang.NoClassDefFoundError)v2));
    Object v4 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v3));
    Object v5 = "' W";
    Object v6 = new java.lang.NoClassDefFoundError(((java.lang.String)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer(((java.lang.NoClassDefFoundError)v6));
    Object v8 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v7));
    Object v9 = ((java.lang.Class)v4).asSubclass(((java.lang.Class)v8));
    Object v10 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v0).getAnnotation(((java.lang.Class)v4));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = "] (for ";
    Object v1 = null;
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = true;
    Object v4 = "WRITE_ENUMS_USING_INDEX";
    Object v5 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),(((java.lang.Boolean)v3).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v8 = "' W";
    Object v9 = new java.lang.NoClassDefFoundError(((java.lang.String)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer(((java.lang.NoClassDefFoundError)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v10));
    Object v12 = "' W";
    Object v13 = new java.lang.NoClassDefFoundError(((java.lang.String)v12));
    Object v14 = new com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer(((java.lang.NoClassDefFoundError)v13));
    Object v15 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v14));
    Object v16 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v17 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v15),((com.fasterxml.jackson.databind.JavaType[])v16));
    Object v18 = new com.fasterxml.jackson.databind.type.ResolvedRecursiveType(((java.lang.Class)v11),((com.fasterxml.jackson.databind.type.TypeBindings)v17));
    Object v19 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v0),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v6),((com.fasterxml.jackson.databind.util.Annotations)v7),((com.fasterxml.jackson.databind.JavaType)v18));
    Object v20 = ((com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase)v19).isVirtual();
    org.junit.Assert.assertEquals((Object)(true), v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = "] (for ";
    Object v1 = null;
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = true;
    Object v4 = "WRITE_ENUMS_USING_INDEX";
    Object v5 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),(((java.lang.Boolean)v3).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v8 = "' W";
    Object v9 = new java.lang.NoClassDefFoundError(((java.lang.String)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer(((java.lang.NoClassDefFoundError)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v10));
    Object v12 = "' W";
    Object v13 = new java.lang.NoClassDefFoundError(((java.lang.String)v12));
    Object v14 = new com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer(((java.lang.NoClassDefFoundError)v13));
    Object v15 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v14));
    Object v16 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v17 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v15),((com.fasterxml.jackson.databind.JavaType[])v16));
    Object v18 = new com.fasterxml.jackson.databind.type.ResolvedRecursiveType(((java.lang.Class)v11),((com.fasterxml.jackson.databind.type.TypeBindings)v17));
    Object v19 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v0),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v6),((com.fasterxml.jackson.databind.util.Annotations)v7),((com.fasterxml.jackson.databind.JavaType)v18));
    Object v20 = "' W";
    Object v21 = new java.lang.NoClassDefFoundError(((java.lang.String)v20));
    Object v22 = new com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer(((java.lang.NoClassDefFoundError)v21));
    Object v23 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v22));
    Object v24 = ((com.fasterxml.jackson.databind.BeanProperty)v19).getContextAnnotation(((java.lang.Class)v23));
    Object v25 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v26 = ((com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase)v19).findFormatOverrides(((com.fasterxml.jackson.databind.AnnotationIntrospector)v25));
    org.junit.Assert.assertNotNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = "] (for ";
    Object v1 = null;
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = true;
    Object v4 = "WRITE_ENUMS_USING_INDEX";
    Object v5 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),(((java.lang.Boolean)v3).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v8 = "' W";
    Object v9 = new java.lang.NoClassDefFoundError(((java.lang.String)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer(((java.lang.NoClassDefFoundError)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v10));
    Object v12 = "' W";
    Object v13 = new java.lang.NoClassDefFoundError(((java.lang.String)v12));
    Object v14 = new com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer(((java.lang.NoClassDefFoundError)v13));
    Object v15 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v14));
    Object v16 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v17 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v15),((com.fasterxml.jackson.databind.JavaType[])v16));
    Object v18 = new com.fasterxml.jackson.databind.type.ResolvedRecursiveType(((java.lang.Class)v11),((com.fasterxml.jackson.databind.type.TypeBindings)v17));
    Object v19 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v0),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v6),((com.fasterxml.jackson.databind.util.Annotations)v7),((com.fasterxml.jackson.databind.JavaType)v18));
    Object v20 = ((com.fasterxml.jackson.databind.BeanProperty)v19).getFullName();
    Object v21 = ((com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase)v19).isVirtual();
    org.junit.Assert.assertEquals((Object)(true), v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v0).toString();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "WRITE_ENUMS_USING_INDEX";
    Object v2 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v1));
    Object v3 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v0).withName(((com.fasterxml.jackson.databind.PropertyName)v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = "d (";
    Object v1 = null;
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = true;
    Object v4 = "WRITE_ENUMS_USING_INDEX";
    Object v5 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),(((java.lang.Boolean)v3).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v8 = "' W";
    Object v9 = new java.lang.NoClassDefFoundError(((java.lang.String)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer(((java.lang.NoClassDefFoundError)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v10));
    Object v12 = "' W";
    Object v13 = new java.lang.NoClassDefFoundError(((java.lang.String)v12));
    Object v14 = new com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer(((java.lang.NoClassDefFoundError)v13));
    Object v15 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v14));
    Object v16 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v17 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v15),((com.fasterxml.jackson.databind.JavaType[])v16));
    Object v18 = new com.fasterxml.jackson.databind.type.ResolvedRecursiveType(((java.lang.Class)v11),((com.fasterxml.jackson.databind.type.TypeBindings)v17));
    Object v19 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v0),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v6),((com.fasterxml.jackson.databind.util.Annotations)v7),((com.fasterxml.jackson.databind.JavaType)v18));
    Object v20 = "' W";
    Object v21 = new java.lang.NoClassDefFoundError(((java.lang.String)v20));
    Object v22 = new com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer(((java.lang.NoClassDefFoundError)v21));
    Object v23 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v22));
    Object v24 = ((com.fasterxml.jackson.databind.BeanProperty)v19).getAnnotation(((java.lang.Class)v23));
    Object v25 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v26 = ((com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase)v19).findFormatOverrides(((com.fasterxml.jackson.databind.AnnotationIntrospector)v25));
    org.junit.Assert.assertNotNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new java.lang.Class[]{null};
    ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v0).setViews(((java.lang.Class[])v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = "] (for ";
    Object v1 = null;
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = true;
    Object v4 = "WRITE_ENUMS_USING_INDEX";
    Object v5 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),(((java.lang.Boolean)v3).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v8 = "' W";
    Object v9 = new java.lang.NoClassDefFoundError(((java.lang.String)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer(((java.lang.NoClassDefFoundError)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v10));
    Object v12 = "' W";
    Object v13 = new java.lang.NoClassDefFoundError(((java.lang.String)v12));
    Object v14 = new com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer(((java.lang.NoClassDefFoundError)v13));
    Object v15 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v14));
    Object v16 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v17 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v15),((com.fasterxml.jackson.databind.JavaType[])v16));
    Object v18 = new com.fasterxml.jackson.databind.type.ResolvedRecursiveType(((java.lang.Class)v11),((com.fasterxml.jackson.databind.type.TypeBindings)v17));
    Object v19 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v0),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v6),((com.fasterxml.jackson.databind.util.Annotations)v7),((com.fasterxml.jackson.databind.JavaType)v18));
    Object v20 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v21 = ((com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase)v19).findFormatOverrides(((com.fasterxml.jackson.databind.AnnotationIntrospector)v20));
    Object v22 = ((com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase)v19).getMetadata();
    org.junit.Assert.assertNotNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = "d (";
    Object v1 = null;
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = true;
    Object v4 = "WRITE_ENUMS_USING_INDEX";
    Object v5 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),(((java.lang.Boolean)v3).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v8 = "' W";
    Object v9 = new java.lang.NoClassDefFoundError(((java.lang.String)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer(((java.lang.NoClassDefFoundError)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v10));
    Object v12 = "' W";
    Object v13 = new java.lang.NoClassDefFoundError(((java.lang.String)v12));
    Object v14 = new com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer(((java.lang.NoClassDefFoundError)v13));
    Object v15 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v14));
    Object v16 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v17 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v15),((com.fasterxml.jackson.databind.JavaType[])v16));
    Object v18 = new com.fasterxml.jackson.databind.type.ResolvedRecursiveType(((java.lang.Class)v11),((com.fasterxml.jackson.databind.type.TypeBindings)v17));
    Object v19 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v0),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v6),((com.fasterxml.jackson.databind.util.Annotations)v7),((com.fasterxml.jackson.databind.JavaType)v18));
    Object v20 = new java.lang.Class[]{null};
    Object v21 = com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter.constructViewBased(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v19),((java.lang.Class[])v20));
    Object v22 = ((com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase)v21).isVirtual();
    org.junit.Assert.assertEquals((Object)(false), v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v0).getValueTypeDeserializer();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v0).setObjectIdInfo(((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v0).getWrapperName();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = "d (";
    Object v1 = null;
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = true;
    Object v4 = "WRITE_ENUMS_USING_INDEX";
    Object v5 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),(((java.lang.Boolean)v3).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v8 = "' W";
    Object v9 = new java.lang.NoClassDefFoundError(((java.lang.String)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer(((java.lang.NoClassDefFoundError)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v10));
    Object v12 = "' W";
    Object v13 = new java.lang.NoClassDefFoundError(((java.lang.String)v12));
    Object v14 = new com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer(((java.lang.NoClassDefFoundError)v13));
    Object v15 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v14));
    Object v16 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v17 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v15),((com.fasterxml.jackson.databind.JavaType[])v16));
    Object v18 = new com.fasterxml.jackson.databind.type.ResolvedRecursiveType(((java.lang.Class)v11),((com.fasterxml.jackson.databind.type.TypeBindings)v17));
    Object v19 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v0),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v6),((com.fasterxml.jackson.databind.util.Annotations)v7),((com.fasterxml.jackson.databind.JavaType)v18));
    Object v20 = new java.lang.Class[]{null};
    Object v21 = com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter.constructViewBased(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v19),((java.lang.Class[])v20));
    Object v22 = "' W";
    Object v23 = new java.lang.NoClassDefFoundError(((java.lang.String)v22));
    Object v24 = new com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer(((java.lang.NoClassDefFoundError)v23));
    Object v25 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v24));
    Object v26 = ((com.fasterxml.jackson.databind.BeanProperty)v21).getAnnotation(((java.lang.Class)v25));
    Object v27 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v28 = ((com.fasterxml.jackson.databind.AnnotationIntrospector)v27).version();
    Object v29 = ((com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase)v21).findFormatOverrides(((com.fasterxml.jackson.databind.AnnotationIntrospector)v27));
    org.junit.Assert.assertNotNull(v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "' W";
    Object v2 = new java.lang.NoClassDefFoundError(((java.lang.String)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer(((java.lang.NoClassDefFoundError)v2));
    Object v4 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v3));
    Object v5 = "' W";
    Object v6 = new java.lang.NoClassDefFoundError(((java.lang.String)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer(((java.lang.NoClassDefFoundError)v6));
    Object v8 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v7));
    Object v9 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v10 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v8),((com.fasterxml.jackson.databind.JavaType[])v9));
    Object v11 = new com.fasterxml.jackson.databind.type.ResolvedRecursiveType(((java.lang.Class)v4),((com.fasterxml.jackson.databind.type.TypeBindings)v10));
    Object v12 = null;
    Object v13 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.type.TypeFactory)v12));
    Object v14 = null;
    Object v15 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v16 = true;
    Object v17 = "WRITE_ENUMS_USING_INDEX";
    Object v18 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v17));
    Object v19 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v14),((com.fasterxml.jackson.databind.AnnotationIntrospector)v15),(((java.lang.Boolean)v16).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v18));
    ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v0).set(((java.lang.Object)v13),((java.lang.Object)v19));
    Object v20 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = Short.valueOf((short)52);
    Object v2 = com.fasterxml.jackson.databind.node.ShortNode.valueOf((((java.lang.Short)v1).shortValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = ")";
    Object v8 = "' W";
    Object v9 = new java.lang.NoClassDefFoundError(((java.lang.String)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer(((java.lang.NoClassDefFoundError)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v10));
    Object v12 = ")";
    Object v13 = ((com.fasterxml.jackson.databind.DeserializationContext)v6).weirdStringException(((java.lang.String)v7),((java.lang.Class)v11),((java.lang.String)v12));
    Object v14 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v0).deserialize(((com.fasterxml.jackson.core.JsonParser)v3),((com.fasterxml.jackson.databind.DeserializationContext)v6));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = Short.valueOf((short)52);
    Object v2 = com.fasterxml.jackson.databind.node.ShortNode.valueOf((((java.lang.Short)v1).shortValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    ((com.fasterxml.jackson.databind.DeserializationContext)v6).checkUnresolvedObjectId();
    Object v7 = null;
    Object v8 = "' W";
    Object v9 = new java.lang.NoClassDefFoundError(((java.lang.String)v8));
    ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v0).deserializeAndSet(((com.fasterxml.jackson.core.JsonParser)v3),((com.fasterxml.jackson.databind.DeserializationContext)v6),((java.lang.Object)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "' W";
    Object v2 = new java.lang.NoClassDefFoundError(((java.lang.String)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer(((java.lang.NoClassDefFoundError)v2));
    Object v4 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v3));
    Object v5 = ((java.lang.Class)v4).getSimpleName();
    Object v6 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v0).visibleInView(((java.lang.Class)v4));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new java.lang.Class[]{};
    ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v0).setViews(((java.lang.Class[])v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = "] (for ";
    Object v1 = null;
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = true;
    Object v4 = "WRITE_ENUMS_USING_INDEX";
    Object v5 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),(((java.lang.Boolean)v3).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v8 = "' W";
    Object v9 = new java.lang.NoClassDefFoundError(((java.lang.String)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer(((java.lang.NoClassDefFoundError)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v10));
    Object v12 = "' W";
    Object v13 = new java.lang.NoClassDefFoundError(((java.lang.String)v12));
    Object v14 = new com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer(((java.lang.NoClassDefFoundError)v13));
    Object v15 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v14));
    Object v16 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v17 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v15),((com.fasterxml.jackson.databind.JavaType[])v16));
    Object v18 = new com.fasterxml.jackson.databind.type.ResolvedRecursiveType(((java.lang.Class)v11),((com.fasterxml.jackson.databind.type.TypeBindings)v17));
    Object v19 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v0),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v6),((com.fasterxml.jackson.databind.util.Annotations)v7),((com.fasterxml.jackson.databind.JavaType)v18));
    Object v20 = null;
    Object v21 = "' W";
    Object v22 = new java.lang.NoClassDefFoundError(((java.lang.String)v21));
    Object v23 = new com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer(((java.lang.NoClassDefFoundError)v22));
    Object v24 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v23));
    Object v25 = ((com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase)v19).findPropertyFormat(((com.fasterxml.jackson.databind.cfg.MapperConfig)v20),((java.lang.Class)v24));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = "d (";
    Object v1 = null;
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = true;
    Object v4 = "WRITE_ENUMS_USING_INDEX";
    Object v5 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),(((java.lang.Boolean)v3).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v8 = "' W";
    Object v9 = new java.lang.NoClassDefFoundError(((java.lang.String)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer(((java.lang.NoClassDefFoundError)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v10));
    Object v12 = "' W";
    Object v13 = new java.lang.NoClassDefFoundError(((java.lang.String)v12));
    Object v14 = new com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer(((java.lang.NoClassDefFoundError)v13));
    Object v15 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v14));
    Object v16 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v17 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v15),((com.fasterxml.jackson.databind.JavaType[])v16));
    Object v18 = new com.fasterxml.jackson.databind.type.ResolvedRecursiveType(((java.lang.Class)v11),((com.fasterxml.jackson.databind.type.TypeBindings)v17));
    Object v19 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v0),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v6),((com.fasterxml.jackson.databind.util.Annotations)v7),((com.fasterxml.jackson.databind.JavaType)v18));
    Object v20 = new java.lang.Class[]{null};
    Object v21 = com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter.constructViewBased(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v19),((java.lang.Class[])v20));
    Object v22 = ((com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase)v21).getMetadata();
    org.junit.Assert.assertNotNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "";
    Object v2 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v0).withSimpleName(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = "d (";
    Object v1 = null;
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = true;
    Object v4 = "WRITE_ENUMS_USING_INDEX";
    Object v5 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),(((java.lang.Boolean)v3).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v8 = "' W";
    Object v9 = new java.lang.NoClassDefFoundError(((java.lang.String)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer(((java.lang.NoClassDefFoundError)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v10));
    Object v12 = "' W";
    Object v13 = new java.lang.NoClassDefFoundError(((java.lang.String)v12));
    Object v14 = new com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer(((java.lang.NoClassDefFoundError)v13));
    Object v15 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v14));
    Object v16 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v17 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v15),((com.fasterxml.jackson.databind.JavaType[])v16));
    Object v18 = new com.fasterxml.jackson.databind.type.ResolvedRecursiveType(((java.lang.Class)v11),((com.fasterxml.jackson.databind.type.TypeBindings)v17));
    Object v19 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v0),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v6),((com.fasterxml.jackson.databind.util.Annotations)v7),((com.fasterxml.jackson.databind.JavaType)v18));
    Object v20 = new java.lang.Class[]{null};
    Object v21 = com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter.constructViewBased(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v19),((java.lang.Class[])v20));
    Object v22 = ((com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase)v21).isRequired();
    org.junit.Assert.assertEquals((Object)(false), v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = Short.valueOf((short)52);
    Object v2 = com.fasterxml.jackson.databind.node.ShortNode.valueOf((((java.lang.Short)v1).shortValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2));
    Object v4 = "'";
    ((com.fasterxml.jackson.core.JsonParser)v3).overrideCurrentName(((java.lang.String)v4));
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v7 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v7));
    Object v9 = "' W";
    Object v10 = new java.lang.NoClassDefFoundError(((java.lang.String)v9));
    Object v11 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v0).deserializeWith(((com.fasterxml.jackson.core.JsonParser)v3),((com.fasterxml.jackson.databind.DeserializationContext)v8),((java.lang.Object)v10));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v2 = false;
    Object v3 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v1).withAlwaysAsId((((java.lang.Boolean)v2).booleanValue()));
    ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v0).setObjectIdInfo(((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v1));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v0).getValueDeserializer();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = Short.valueOf((short)52);
    Object v2 = com.fasterxml.jackson.databind.node.ShortNode.valueOf((((java.lang.Short)v1).shortValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v0).deserialize(((com.fasterxml.jackson.core.JsonParser)v3),((com.fasterxml.jackson.databind.DeserializationContext)v6));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "' W";
    Object v2 = new java.lang.NoClassDefFoundError(((java.lang.String)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer(((java.lang.NoClassDefFoundError)v2));
    Object v4 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v3));
    Object v5 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v0).visibleInView(((java.lang.Class)v4));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "<";
    Object v2 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v0).withSimpleName(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = "] (for ";
    Object v1 = null;
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = true;
    Object v4 = "WRITE_ENUMS_USING_INDEX";
    Object v5 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),(((java.lang.Boolean)v3).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v8 = "' W";
    Object v9 = new java.lang.NoClassDefFoundError(((java.lang.String)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer(((java.lang.NoClassDefFoundError)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v10));
    Object v12 = "' W";
    Object v13 = new java.lang.NoClassDefFoundError(((java.lang.String)v12));
    Object v14 = new com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer(((java.lang.NoClassDefFoundError)v13));
    Object v15 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v14));
    Object v16 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v17 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v15),((com.fasterxml.jackson.databind.JavaType[])v16));
    Object v18 = new com.fasterxml.jackson.databind.type.ResolvedRecursiveType(((java.lang.Class)v11),((com.fasterxml.jackson.databind.type.TypeBindings)v17));
    Object v19 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v0),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v6),((com.fasterxml.jackson.databind.util.Annotations)v7),((com.fasterxml.jackson.databind.JavaType)v18));
    Object v20 = ((com.fasterxml.jackson.databind.BeanProperty)v19).getMember();
    Object v21 = ((com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase)v19).isVirtual();
    org.junit.Assert.assertEquals((Object)(true), v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = "d (";
    Object v1 = null;
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = true;
    Object v4 = "WRITE_ENUMS_USING_INDEX";
    Object v5 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),(((java.lang.Boolean)v3).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v8 = "' W";
    Object v9 = new java.lang.NoClassDefFoundError(((java.lang.String)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer(((java.lang.NoClassDefFoundError)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v10));
    Object v12 = "' W";
    Object v13 = new java.lang.NoClassDefFoundError(((java.lang.String)v12));
    Object v14 = new com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer(((java.lang.NoClassDefFoundError)v13));
    Object v15 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v14));
    Object v16 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v17 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v15),((com.fasterxml.jackson.databind.JavaType[])v16));
    Object v18 = new com.fasterxml.jackson.databind.type.ResolvedRecursiveType(((java.lang.Class)v11),((com.fasterxml.jackson.databind.type.TypeBindings)v17));
    Object v19 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v0),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v6),((com.fasterxml.jackson.databind.util.Annotations)v7),((com.fasterxml.jackson.databind.JavaType)v18));
    Object v20 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v21 = ((com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase)v19).findFormatOverrides(((com.fasterxml.jackson.databind.AnnotationIntrospector)v20));
    Object v22 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v23 = ((com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase)v19).findFormatOverrides(((com.fasterxml.jackson.databind.AnnotationIntrospector)v22));
    org.junit.Assert.assertNotNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = "d (";
    Object v1 = null;
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = true;
    Object v4 = "WRITE_ENUMS_USING_INDEX";
    Object v5 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),(((java.lang.Boolean)v3).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v8 = "' W";
    Object v9 = new java.lang.NoClassDefFoundError(((java.lang.String)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer(((java.lang.NoClassDefFoundError)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v10));
    Object v12 = "' W";
    Object v13 = new java.lang.NoClassDefFoundError(((java.lang.String)v12));
    Object v14 = new com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer(((java.lang.NoClassDefFoundError)v13));
    Object v15 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v14));
    Object v16 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v17 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v15),((com.fasterxml.jackson.databind.JavaType[])v16));
    Object v18 = new com.fasterxml.jackson.databind.type.ResolvedRecursiveType(((java.lang.Class)v11),((com.fasterxml.jackson.databind.type.TypeBindings)v17));
    Object v19 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v0),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v6),((com.fasterxml.jackson.databind.util.Annotations)v7),((com.fasterxml.jackson.databind.JavaType)v18));
    Object v20 = new java.lang.Class[]{null};
    Object v21 = com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter.constructViewBased(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v19),((java.lang.Class[])v20));
    Object v22 = "' W";
    Object v23 = new java.lang.NoClassDefFoundError(((java.lang.String)v22));
    Object v24 = new com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer(((java.lang.NoClassDefFoundError)v23));
    Object v25 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v24));
    Object v26 = ((com.fasterxml.jackson.databind.BeanProperty)v21).getContextAnnotation(((java.lang.Class)v25));
    Object v27 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v28 = ((com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase)v21).findFormatOverrides(((com.fasterxml.jackson.databind.AnnotationIntrospector)v27));
    org.junit.Assert.assertNotNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v1));
    Object v3 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor.Base(((com.fasterxml.jackson.databind.SerializerProvider)v2));
    Object v4 = "] (for ";
    Object v5 = null;
    Object v6 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v7 = true;
    Object v8 = "WRITE_ENUMS_USING_INDEX";
    Object v9 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v8));
    Object v10 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v5),((com.fasterxml.jackson.databind.AnnotationIntrospector)v6),(((java.lang.Boolean)v7).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v9));
    Object v11 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v12 = "' W";
    Object v13 = new java.lang.NoClassDefFoundError(((java.lang.String)v12));
    Object v14 = new com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer(((java.lang.NoClassDefFoundError)v13));
    Object v15 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v14));
    Object v16 = "' W";
    Object v17 = new java.lang.NoClassDefFoundError(((java.lang.String)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer(((java.lang.NoClassDefFoundError)v17));
    Object v19 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v18));
    Object v20 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v21 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v19),((com.fasterxml.jackson.databind.JavaType[])v20));
    Object v22 = new com.fasterxml.jackson.databind.type.ResolvedRecursiveType(((java.lang.Class)v15),((com.fasterxml.jackson.databind.type.TypeBindings)v21));
    Object v23 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v4),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v10),((com.fasterxml.jackson.databind.util.Annotations)v11),((com.fasterxml.jackson.databind.JavaType)v22));
    ((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor)v3).optionalProperty(((com.fasterxml.jackson.databind.BeanProperty)v23));
    Object v24 = null;
    Object v25 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v26 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v25));
    ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v0).depositSchemaProperty(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor)v3),((com.fasterxml.jackson.databind.SerializerProvider)v26));
    Object v27 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new java.lang.Class[]{null,null,null};
    ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v0).setViews(((java.lang.Class[])v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v4 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v0).setAndReturn(((java.lang.Object)v2),((java.lang.Object)v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = "d (";
    Object v1 = null;
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = true;
    Object v4 = "WRITE_ENUMS_USING_INDEX";
    Object v5 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),(((java.lang.Boolean)v3).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v8 = "' W";
    Object v9 = new java.lang.NoClassDefFoundError(((java.lang.String)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer(((java.lang.NoClassDefFoundError)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v10));
    Object v12 = "' W";
    Object v13 = new java.lang.NoClassDefFoundError(((java.lang.String)v12));
    Object v14 = new com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer(((java.lang.NoClassDefFoundError)v13));
    Object v15 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v14));
    Object v16 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v17 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v15),((com.fasterxml.jackson.databind.JavaType[])v16));
    Object v18 = new com.fasterxml.jackson.databind.type.ResolvedRecursiveType(((java.lang.Class)v11),((com.fasterxml.jackson.databind.type.TypeBindings)v17));
    Object v19 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v0),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v6),((com.fasterxml.jackson.databind.util.Annotations)v7),((com.fasterxml.jackson.databind.JavaType)v18));
    Object v20 = ((com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase)v19).isVirtual();
    org.junit.Assert.assertEquals((Object)(true), v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = "d (";
    Object v1 = null;
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = true;
    Object v4 = "WRITE_ENUMS_USING_INDEX";
    Object v5 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),(((java.lang.Boolean)v3).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v8 = "' W";
    Object v9 = new java.lang.NoClassDefFoundError(((java.lang.String)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer(((java.lang.NoClassDefFoundError)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v10));
    Object v12 = "' W";
    Object v13 = new java.lang.NoClassDefFoundError(((java.lang.String)v12));
    Object v14 = new com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer(((java.lang.NoClassDefFoundError)v13));
    Object v15 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v14));
    Object v16 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v17 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v15),((com.fasterxml.jackson.databind.JavaType[])v16));
    Object v18 = new com.fasterxml.jackson.databind.type.ResolvedRecursiveType(((java.lang.Class)v11),((com.fasterxml.jackson.databind.type.TypeBindings)v17));
    Object v19 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v0),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v6),((com.fasterxml.jackson.databind.util.Annotations)v7),((com.fasterxml.jackson.databind.JavaType)v18));
    Object v20 = new java.lang.Class[]{null};
    Object v21 = com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter.constructViewBased(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v19),((java.lang.Class[])v20));
    Object v22 = null;
    Object v23 = "' W";
    Object v24 = new java.lang.NoClassDefFoundError(((java.lang.String)v23));
    Object v25 = new com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer(((java.lang.NoClassDefFoundError)v24));
    Object v26 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v25));
    Object v27 = ((com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase)v21).findPropertyInclusion(((com.fasterxml.jackson.databind.cfg.MapperConfig)v22),((java.lang.Class)v26));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer();
    Object v2 = "' W";
    Object v3 = new java.lang.NoClassDefFoundError(((java.lang.String)v2));
    Object v4 = new com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer(((java.lang.NoClassDefFoundError)v3));
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v5));
    ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v0).set(((java.lang.Object)v1),((java.lang.Object)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = "d (";
    Object v1 = null;
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = true;
    Object v4 = "WRITE_ENUMS_USING_INDEX";
    Object v5 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),(((java.lang.Boolean)v3).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v8 = "' W";
    Object v9 = new java.lang.NoClassDefFoundError(((java.lang.String)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer(((java.lang.NoClassDefFoundError)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v10));
    Object v12 = "' W";
    Object v13 = new java.lang.NoClassDefFoundError(((java.lang.String)v12));
    Object v14 = new com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer(((java.lang.NoClassDefFoundError)v13));
    Object v15 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v14));
    Object v16 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v17 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v15),((com.fasterxml.jackson.databind.JavaType[])v16));
    Object v18 = new com.fasterxml.jackson.databind.type.ResolvedRecursiveType(((java.lang.Class)v11),((com.fasterxml.jackson.databind.type.TypeBindings)v17));
    Object v19 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v0),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v6),((com.fasterxml.jackson.databind.util.Annotations)v7),((com.fasterxml.jackson.databind.JavaType)v18));
    Object v20 = new java.lang.Class[]{null};
    Object v21 = com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter.constructViewBased(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v19),((java.lang.Class[])v20));
    Object v22 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v23 = ((com.fasterxml.jackson.databind.AnnotationIntrospector)v22).allIntrospectors();
    Object v24 = ((com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase)v21).findFormatOverrides(((com.fasterxml.jackson.databind.AnnotationIntrospector)v22));
    org.junit.Assert.assertNotNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = Short.valueOf((short)52);
    Object v2 = com.fasterxml.jackson.databind.node.ShortNode.valueOf((((java.lang.Short)v1).shortValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2));
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = "d (";
    Object v8 = null;
    Object v9 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v10 = true;
    Object v11 = "WRITE_ENUMS_USING_INDEX";
    Object v12 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v11));
    Object v13 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v8),((com.fasterxml.jackson.databind.AnnotationIntrospector)v9),(((java.lang.Boolean)v10).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v12));
    Object v14 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v15 = "' W";
    Object v16 = new java.lang.NoClassDefFoundError(((java.lang.String)v15));
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer(((java.lang.NoClassDefFoundError)v16));
    Object v18 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v17));
    Object v19 = "' W";
    Object v20 = new java.lang.NoClassDefFoundError(((java.lang.String)v19));
    Object v21 = new com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer(((java.lang.NoClassDefFoundError)v20));
    Object v22 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v21));
    Object v23 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v24 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v22),((com.fasterxml.jackson.databind.JavaType[])v23));
    Object v25 = new com.fasterxml.jackson.databind.type.ResolvedRecursiveType(((java.lang.Class)v18),((com.fasterxml.jackson.databind.type.TypeBindings)v24));
    Object v26 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v7),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v13),((com.fasterxml.jackson.databind.util.Annotations)v14),((com.fasterxml.jackson.databind.JavaType)v25));
    Object v27 = "' W";
    Object v28 = new java.lang.NoClassDefFoundError(((java.lang.String)v27));
    Object v29 = new com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer(((java.lang.NoClassDefFoundError)v28));
    Object v30 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v29));
    Object v31 = ((com.fasterxml.jackson.databind.BeanProperty)v26).getAnnotation(((java.lang.Class)v30));
    Object v32 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v33 = ((com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase)v26).findFormatOverrides(((com.fasterxml.jackson.databind.AnnotationIntrospector)v32));
    Object v34 = "array";
    Object v35 = "' W";
    Object v36 = new java.lang.NoClassDefFoundError(((java.lang.String)v35));
    Object v37 = new com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer(((java.lang.NoClassDefFoundError)v36));
    ((com.fasterxml.jackson.databind.DeserializationContext)v6).reportUnknownProperty(((java.lang.Object)v33),((java.lang.String)v34),((com.fasterxml.jackson.databind.JsonDeserializer)v37));
    Object v38 = null;
    Object v39 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v0).deserialize(((com.fasterxml.jackson.core.JsonParser)v3),((com.fasterxml.jackson.databind.DeserializationContext)v6));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v0).getType();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = "] (for ";
    Object v1 = null;
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = true;
    Object v4 = "WRITE_ENUMS_USING_INDEX";
    Object v5 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),(((java.lang.Boolean)v3).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v8 = "' W";
    Object v9 = new java.lang.NoClassDefFoundError(((java.lang.String)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer(((java.lang.NoClassDefFoundError)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v10));
    Object v12 = "' W";
    Object v13 = new java.lang.NoClassDefFoundError(((java.lang.String)v12));
    Object v14 = new com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer(((java.lang.NoClassDefFoundError)v13));
    Object v15 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v14));
    Object v16 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v17 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v15),((com.fasterxml.jackson.databind.JavaType[])v16));
    Object v18 = new com.fasterxml.jackson.databind.type.ResolvedRecursiveType(((java.lang.Class)v11),((com.fasterxml.jackson.databind.type.TypeBindings)v17));
    Object v19 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v0),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v6),((com.fasterxml.jackson.databind.util.Annotations)v7),((com.fasterxml.jackson.databind.JavaType)v18));
    Object v20 = "' W";
    Object v21 = new java.lang.NoClassDefFoundError(((java.lang.String)v20));
    Object v22 = new com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer(((java.lang.NoClassDefFoundError)v21));
    Object v23 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v22));
    Object v24 = ((com.fasterxml.jackson.databind.BeanProperty)v19).getAnnotation(((java.lang.Class)v23));
    Object v25 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v26 = ((com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase)v19).findFormatOverrides(((com.fasterxml.jackson.databind.AnnotationIntrospector)v25));
    org.junit.Assert.assertNotNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = "] (for ";
    Object v1 = null;
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = true;
    Object v4 = "WRITE_ENUMS_USING_INDEX";
    Object v5 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),(((java.lang.Boolean)v3).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v8 = "' W";
    Object v9 = new java.lang.NoClassDefFoundError(((java.lang.String)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer(((java.lang.NoClassDefFoundError)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v10));
    Object v12 = "' W";
    Object v13 = new java.lang.NoClassDefFoundError(((java.lang.String)v12));
    Object v14 = new com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer(((java.lang.NoClassDefFoundError)v13));
    Object v15 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v14));
    Object v16 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v17 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v15),((com.fasterxml.jackson.databind.JavaType[])v16));
    Object v18 = new com.fasterxml.jackson.databind.type.ResolvedRecursiveType(((java.lang.Class)v11),((com.fasterxml.jackson.databind.type.TypeBindings)v17));
    Object v19 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v0),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v6),((com.fasterxml.jackson.databind.util.Annotations)v7),((com.fasterxml.jackson.databind.JavaType)v18));
    Object v20 = ((com.fasterxml.jackson.databind.BeanProperty)v19).getMember();
    Object v21 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v22 = ((com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase)v19).findFormatOverrides(((com.fasterxml.jackson.databind.AnnotationIntrospector)v21));
    org.junit.Assert.assertNotNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "subtpe to register";
    Object v2 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v0).withSimpleName(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = "] (for ";
    Object v1 = null;
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = true;
    Object v4 = "WRITE_ENUMS_USING_INDEX";
    Object v5 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),(((java.lang.Boolean)v3).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v8 = "' W";
    Object v9 = new java.lang.NoClassDefFoundError(((java.lang.String)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer(((java.lang.NoClassDefFoundError)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v10));
    Object v12 = "' W";
    Object v13 = new java.lang.NoClassDefFoundError(((java.lang.String)v12));
    Object v14 = new com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer(((java.lang.NoClassDefFoundError)v13));
    Object v15 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v14));
    Object v16 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v17 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v15),((com.fasterxml.jackson.databind.JavaType[])v16));
    Object v18 = new com.fasterxml.jackson.databind.type.ResolvedRecursiveType(((java.lang.Class)v11),((com.fasterxml.jackson.databind.type.TypeBindings)v17));
    Object v19 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v0),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v6),((com.fasterxml.jackson.databind.util.Annotations)v7),((com.fasterxml.jackson.databind.JavaType)v18));
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v22 = null;
    Object v23 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v22));
    Object v24 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v23));
    Object v25 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v26 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v27 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v20),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v21),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v24),((com.fasterxml.jackson.databind.util.RootNameLookup)v25),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v26));
    Object v28 = ((com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase)v19).findAliases(((com.fasterxml.jackson.databind.cfg.MapperConfig)v27));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "' W";
    Object v2 = new java.lang.NoClassDefFoundError(((java.lang.String)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer(((java.lang.NoClassDefFoundError)v2));
    Object v4 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v3));
    Object v5 = ((java.lang.Class)v4).getEnclosingClass();
    Object v6 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v0).getAnnotation(((java.lang.Class)v4));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = "d (";
    Object v1 = null;
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = true;
    Object v4 = "WRITE_ENUMS_USING_INDEX";
    Object v5 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),(((java.lang.Boolean)v3).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v8 = "' W";
    Object v9 = new java.lang.NoClassDefFoundError(((java.lang.String)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer(((java.lang.NoClassDefFoundError)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v10));
    Object v12 = "' W";
    Object v13 = new java.lang.NoClassDefFoundError(((java.lang.String)v12));
    Object v14 = new com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer(((java.lang.NoClassDefFoundError)v13));
    Object v15 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v14));
    Object v16 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v17 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v15),((com.fasterxml.jackson.databind.JavaType[])v16));
    Object v18 = new com.fasterxml.jackson.databind.type.ResolvedRecursiveType(((java.lang.Class)v11),((com.fasterxml.jackson.databind.type.TypeBindings)v17));
    Object v19 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v0),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v6),((com.fasterxml.jackson.databind.util.Annotations)v7),((com.fasterxml.jackson.databind.JavaType)v18));
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v22 = null;
    Object v23 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v22));
    Object v24 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v23));
    Object v25 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v26 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v27 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v20),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v21),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v24),((com.fasterxml.jackson.databind.util.RootNameLookup)v25),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v26));
    Object v28 = "' W";
    Object v29 = new java.lang.NoClassDefFoundError(((java.lang.String)v28));
    Object v30 = new com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer(((java.lang.NoClassDefFoundError)v29));
    Object v31 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v30));
    Object v32 = ((com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase)v19).findPropertyInclusion(((com.fasterxml.jackson.databind.cfg.MapperConfig)v27),((java.lang.Class)v31));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = "] (for ";
    Object v1 = null;
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = true;
    Object v4 = "WRITE_ENUMS_USING_INDEX";
    Object v5 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),(((java.lang.Boolean)v3).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v8 = "' W";
    Object v9 = new java.lang.NoClassDefFoundError(((java.lang.String)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer(((java.lang.NoClassDefFoundError)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v10));
    Object v12 = "' W";
    Object v13 = new java.lang.NoClassDefFoundError(((java.lang.String)v12));
    Object v14 = new com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer(((java.lang.NoClassDefFoundError)v13));
    Object v15 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v14));
    Object v16 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v17 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v15),((com.fasterxml.jackson.databind.JavaType[])v16));
    Object v18 = new com.fasterxml.jackson.databind.type.ResolvedRecursiveType(((java.lang.Class)v11),((com.fasterxml.jackson.databind.type.TypeBindings)v17));
    Object v19 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v0),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v6),((com.fasterxml.jackson.databind.util.Annotations)v7),((com.fasterxml.jackson.databind.JavaType)v18));
    Object v20 = "' W";
    Object v21 = new java.lang.NoClassDefFoundError(((java.lang.String)v20));
    Object v22 = new com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer(((java.lang.NoClassDefFoundError)v21));
    Object v23 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v22));
    Object v24 = ((com.fasterxml.jackson.databind.BeanProperty)v19).getAnnotation(((java.lang.Class)v23));
    Object v25 = null;
    Object v26 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v27 = null;
    Object v28 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v27));
    Object v29 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v28));
    Object v30 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v31 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v32 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v25),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v26),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v29),((com.fasterxml.jackson.databind.util.RootNameLookup)v30),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v31));
    Object v33 = "' W";
    Object v34 = new java.lang.NoClassDefFoundError(((java.lang.String)v33));
    Object v35 = new com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer(((java.lang.NoClassDefFoundError)v34));
    Object v36 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v35));
    Object v37 = ((com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase)v19).findPropertyInclusion(((com.fasterxml.jackson.databind.cfg.MapperConfig)v32),((java.lang.Class)v36));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = "d (";
    Object v1 = null;
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = true;
    Object v4 = "WRITE_ENUMS_USING_INDEX";
    Object v5 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),(((java.lang.Boolean)v3).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v8 = "' W";
    Object v9 = new java.lang.NoClassDefFoundError(((java.lang.String)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer(((java.lang.NoClassDefFoundError)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v10));
    Object v12 = "' W";
    Object v13 = new java.lang.NoClassDefFoundError(((java.lang.String)v12));
    Object v14 = new com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer(((java.lang.NoClassDefFoundError)v13));
    Object v15 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v14));
    Object v16 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v17 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v15),((com.fasterxml.jackson.databind.JavaType[])v16));
    Object v18 = new com.fasterxml.jackson.databind.type.ResolvedRecursiveType(((java.lang.Class)v11),((com.fasterxml.jackson.databind.type.TypeBindings)v17));
    Object v19 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v0),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v6),((com.fasterxml.jackson.databind.util.Annotations)v7),((com.fasterxml.jackson.databind.JavaType)v18));
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v22 = null;
    Object v23 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v22));
    Object v24 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v23));
    Object v25 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v26 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v27 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v20),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v21),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v24),((com.fasterxml.jackson.databind.util.RootNameLookup)v25),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v26));
    Object v28 = "' W";
    Object v29 = new java.lang.NoClassDefFoundError(((java.lang.String)v28));
    Object v30 = new com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer(((java.lang.NoClassDefFoundError)v29));
    Object v31 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v30));
    Object v32 = ((com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase)v19).findPropertyFormat(((com.fasterxml.jackson.databind.cfg.MapperConfig)v27),((java.lang.Class)v31));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = "] (for ";
    Object v1 = null;
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = true;
    Object v4 = "WRITE_ENUMS_USING_INDEX";
    Object v5 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),(((java.lang.Boolean)v3).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v8 = "' W";
    Object v9 = new java.lang.NoClassDefFoundError(((java.lang.String)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer(((java.lang.NoClassDefFoundError)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v10));
    Object v12 = "' W";
    Object v13 = new java.lang.NoClassDefFoundError(((java.lang.String)v12));
    Object v14 = new com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer(((java.lang.NoClassDefFoundError)v13));
    Object v15 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v14));
    Object v16 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v17 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v15),((com.fasterxml.jackson.databind.JavaType[])v16));
    Object v18 = new com.fasterxml.jackson.databind.type.ResolvedRecursiveType(((java.lang.Class)v11),((com.fasterxml.jackson.databind.type.TypeBindings)v17));
    Object v19 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v0),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v6),((com.fasterxml.jackson.databind.util.Annotations)v7),((com.fasterxml.jackson.databind.JavaType)v18));
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v22 = null;
    Object v23 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v22));
    Object v24 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v23));
    Object v25 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v26 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v27 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v20),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v21),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v24),((com.fasterxml.jackson.databind.util.RootNameLookup)v25),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v26));
    Object v28 = "' W";
    Object v29 = new java.lang.NoClassDefFoundError(((java.lang.String)v28));
    Object v30 = new com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer(((java.lang.NoClassDefFoundError)v29));
    Object v31 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v30));
    Object v32 = ((com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase)v19).findPropertyFormat(((com.fasterxml.jackson.databind.cfg.MapperConfig)v27),((java.lang.Class)v31));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 22;
    ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v0).assignIndex((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = "] (for ";
    Object v1 = null;
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = true;
    Object v4 = "WRITE_ENUMS_USING_INDEX";
    Object v5 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),(((java.lang.Boolean)v3).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v8 = "' W";
    Object v9 = new java.lang.NoClassDefFoundError(((java.lang.String)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer(((java.lang.NoClassDefFoundError)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v10));
    Object v12 = "' W";
    Object v13 = new java.lang.NoClassDefFoundError(((java.lang.String)v12));
    Object v14 = new com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer(((java.lang.NoClassDefFoundError)v13));
    Object v15 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v14));
    Object v16 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v17 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v15),((com.fasterxml.jackson.databind.JavaType[])v16));
    Object v18 = new com.fasterxml.jackson.databind.type.ResolvedRecursiveType(((java.lang.Class)v11),((com.fasterxml.jackson.databind.type.TypeBindings)v17));
    Object v19 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v0),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v6),((com.fasterxml.jackson.databind.util.Annotations)v7),((com.fasterxml.jackson.databind.JavaType)v18));
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v22 = null;
    Object v23 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v22));
    Object v24 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v23));
    Object v25 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v26 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v27 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v20),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v21),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v24),((com.fasterxml.jackson.databind.util.RootNameLookup)v25),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v26));
    Object v28 = "' W";
    Object v29 = new java.lang.NoClassDefFoundError(((java.lang.String)v28));
    Object v30 = new com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer(((java.lang.NoClassDefFoundError)v29));
    Object v31 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v30));
    Object v32 = ((com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase)v19).findPropertyInclusion(((com.fasterxml.jackson.databind.cfg.MapperConfig)v27),((java.lang.Class)v31));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = "d (";
    Object v1 = null;
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = true;
    Object v4 = "WRITE_ENUMS_USING_INDEX";
    Object v5 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),(((java.lang.Boolean)v3).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v8 = "' W";
    Object v9 = new java.lang.NoClassDefFoundError(((java.lang.String)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer(((java.lang.NoClassDefFoundError)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v10));
    Object v12 = "' W";
    Object v13 = new java.lang.NoClassDefFoundError(((java.lang.String)v12));
    Object v14 = new com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer(((java.lang.NoClassDefFoundError)v13));
    Object v15 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v14));
    Object v16 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v17 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v15),((com.fasterxml.jackson.databind.JavaType[])v16));
    Object v18 = new com.fasterxml.jackson.databind.type.ResolvedRecursiveType(((java.lang.Class)v11),((com.fasterxml.jackson.databind.type.TypeBindings)v17));
    Object v19 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v0),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v6),((com.fasterxml.jackson.databind.util.Annotations)v7),((com.fasterxml.jackson.databind.JavaType)v18));
    Object v20 = new java.lang.Class[]{null};
    Object v21 = com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter.constructViewBased(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v19),((java.lang.Class[])v20));
    Object v22 = null;
    Object v23 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v24 = null;
    Object v25 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v24));
    Object v26 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v25));
    Object v27 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v28 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v29 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v22),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v23),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v26),((com.fasterxml.jackson.databind.util.RootNameLookup)v27),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v28));
    Object v30 = "' W";
    Object v31 = new java.lang.NoClassDefFoundError(((java.lang.String)v30));
    Object v32 = new com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer(((java.lang.NoClassDefFoundError)v31));
    Object v33 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v32));
    Object v34 = ((com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase)v21).findPropertyInclusion(((com.fasterxml.jackson.databind.cfg.MapperConfig)v29),((java.lang.Class)v33));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "' W";
    Object v2 = new java.lang.NoClassDefFoundError(((java.lang.String)v1));
    Object v3 = new com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer(((java.lang.NoClassDefFoundError)v2));
    Object v4 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v3));
    Object v5 = ((java.lang.Class)v4).isEnum();
    Object v6 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v0).getAnnotation(((java.lang.Class)v4));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = "] (for ";
    Object v1 = null;
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = true;
    Object v4 = "WRITE_ENUMS_USING_INDEX";
    Object v5 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),(((java.lang.Boolean)v3).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v8 = "' W";
    Object v9 = new java.lang.NoClassDefFoundError(((java.lang.String)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer(((java.lang.NoClassDefFoundError)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v10));
    Object v12 = "' W";
    Object v13 = new java.lang.NoClassDefFoundError(((java.lang.String)v12));
    Object v14 = new com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer(((java.lang.NoClassDefFoundError)v13));
    Object v15 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v14));
    Object v16 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v17 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v15),((com.fasterxml.jackson.databind.JavaType[])v16));
    Object v18 = new com.fasterxml.jackson.databind.type.ResolvedRecursiveType(((java.lang.Class)v11),((com.fasterxml.jackson.databind.type.TypeBindings)v17));
    Object v19 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v0),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v6),((com.fasterxml.jackson.databind.util.Annotations)v7),((com.fasterxml.jackson.databind.JavaType)v18));
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v22 = null;
    Object v23 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v22));
    Object v24 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v23));
    Object v25 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v26 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v27 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v20),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v21),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v24),((com.fasterxml.jackson.databind.util.RootNameLookup)v25),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v26));
    Object v28 = "' W";
    Object v29 = new java.lang.NoClassDefFoundError(((java.lang.String)v28));
    Object v30 = new com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer(((java.lang.NoClassDefFoundError)v29));
    Object v31 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v30));
    Object v32 = ((com.fasterxml.jackson.databind.cfg.MapperConfig)v27).getDefaultPropertyFormat(((java.lang.Class)v31));
    Object v33 = "' W";
    Object v34 = new java.lang.NoClassDefFoundError(((java.lang.String)v33));
    Object v35 = new com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer(((java.lang.NoClassDefFoundError)v34));
    Object v36 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v35));
    Object v37 = ((com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase)v19).findPropertyInclusion(((com.fasterxml.jackson.databind.cfg.MapperConfig)v27),((java.lang.Class)v36));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = Short.valueOf((short)52);
    Object v2 = com.fasterxml.jackson.databind.node.ShortNode.valueOf((((java.lang.Short)v1).shortValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2));
    Object v4 = ((com.fasterxml.jackson.core.JsonParser)v3).getShortValue();
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6));
    Object v8 = "d (";
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v11 = true;
    Object v12 = "WRITE_ENUMS_USING_INDEX";
    Object v13 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v12));
    Object v14 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v9),((com.fasterxml.jackson.databind.AnnotationIntrospector)v10),(((java.lang.Boolean)v11).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v13));
    Object v15 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v16 = "' W";
    Object v17 = new java.lang.NoClassDefFoundError(((java.lang.String)v16));
    Object v18 = new com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer(((java.lang.NoClassDefFoundError)v17));
    Object v19 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v18));
    Object v20 = "' W";
    Object v21 = new java.lang.NoClassDefFoundError(((java.lang.String)v20));
    Object v22 = new com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer(((java.lang.NoClassDefFoundError)v21));
    Object v23 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v22));
    Object v24 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v25 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v23),((com.fasterxml.jackson.databind.JavaType[])v24));
    Object v26 = new com.fasterxml.jackson.databind.type.ResolvedRecursiveType(((java.lang.Class)v19),((com.fasterxml.jackson.databind.type.TypeBindings)v25));
    Object v27 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v8),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v14),((com.fasterxml.jackson.databind.util.Annotations)v15),((com.fasterxml.jackson.databind.JavaType)v26));
    Object v28 = new java.lang.Class[]{null};
    Object v29 = com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter.constructViewBased(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v27),((java.lang.Class[])v28));
    Object v30 = ((com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase)v29).isVirtual();
    Object v31 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v0).deserializeWith(((com.fasterxml.jackson.core.JsonParser)v3),((com.fasterxml.jackson.databind.DeserializationContext)v7),((java.lang.Object)v30));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = "d (";
    Object v1 = null;
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = true;
    Object v4 = "WRITE_ENUMS_USING_INDEX";
    Object v5 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),(((java.lang.Boolean)v3).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v8 = "' W";
    Object v9 = new java.lang.NoClassDefFoundError(((java.lang.String)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer(((java.lang.NoClassDefFoundError)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v10));
    Object v12 = "' W";
    Object v13 = new java.lang.NoClassDefFoundError(((java.lang.String)v12));
    Object v14 = new com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer(((java.lang.NoClassDefFoundError)v13));
    Object v15 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v14));
    Object v16 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v17 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v15),((com.fasterxml.jackson.databind.JavaType[])v16));
    Object v18 = new com.fasterxml.jackson.databind.type.ResolvedRecursiveType(((java.lang.Class)v11),((com.fasterxml.jackson.databind.type.TypeBindings)v17));
    Object v19 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v0),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v6),((com.fasterxml.jackson.databind.util.Annotations)v7),((com.fasterxml.jackson.databind.JavaType)v18));
    Object v20 = ((com.fasterxml.jackson.databind.BeanProperty)v19).getType();
    Object v21 = ((com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase)v19).isRequired();
    org.junit.Assert.assertEquals((Object)(false), v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = "d (";
    Object v1 = null;
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = true;
    Object v4 = "WRITE_ENUMS_USING_INDEX";
    Object v5 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),(((java.lang.Boolean)v3).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v8 = "' W";
    Object v9 = new java.lang.NoClassDefFoundError(((java.lang.String)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer(((java.lang.NoClassDefFoundError)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v10));
    Object v12 = "' W";
    Object v13 = new java.lang.NoClassDefFoundError(((java.lang.String)v12));
    Object v14 = new com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer(((java.lang.NoClassDefFoundError)v13));
    Object v15 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v14));
    Object v16 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v17 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v15),((com.fasterxml.jackson.databind.JavaType[])v16));
    Object v18 = new com.fasterxml.jackson.databind.type.ResolvedRecursiveType(((java.lang.Class)v11),((com.fasterxml.jackson.databind.type.TypeBindings)v17));
    Object v19 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v0),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v6),((com.fasterxml.jackson.databind.util.Annotations)v7),((com.fasterxml.jackson.databind.JavaType)v18));
    Object v20 = new java.lang.Class[]{null};
    Object v21 = com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter.constructViewBased(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v19),((java.lang.Class[])v20));
    Object v22 = null;
    Object v23 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v24 = null;
    Object v25 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v24));
    Object v26 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v25));
    Object v27 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v28 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v29 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v22),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v23),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v26),((com.fasterxml.jackson.databind.util.RootNameLookup)v27),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v28));
    Object v30 = "' W";
    Object v31 = new java.lang.NoClassDefFoundError(((java.lang.String)v30));
    Object v32 = new com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer(((java.lang.NoClassDefFoundError)v31));
    Object v33 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v32));
    Object v34 = ((com.fasterxml.jackson.databind.cfg.MapperConfig)v29).getDefaultMergeable(((java.lang.Class)v33));
    Object v35 = ((com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase)v21).findAliases(((com.fasterxml.jackson.databind.cfg.MapperConfig)v29));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = "] (for ";
    Object v1 = null;
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = true;
    Object v4 = "WRITE_ENUMS_USING_INDEX";
    Object v5 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),(((java.lang.Boolean)v3).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v8 = "' W";
    Object v9 = new java.lang.NoClassDefFoundError(((java.lang.String)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer(((java.lang.NoClassDefFoundError)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v10));
    Object v12 = "' W";
    Object v13 = new java.lang.NoClassDefFoundError(((java.lang.String)v12));
    Object v14 = new com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer(((java.lang.NoClassDefFoundError)v13));
    Object v15 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v14));
    Object v16 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v17 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v15),((com.fasterxml.jackson.databind.JavaType[])v16));
    Object v18 = new com.fasterxml.jackson.databind.type.ResolvedRecursiveType(((java.lang.Class)v11),((com.fasterxml.jackson.databind.type.TypeBindings)v17));
    Object v19 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v0),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v6),((com.fasterxml.jackson.databind.util.Annotations)v7),((com.fasterxml.jackson.databind.JavaType)v18));
    Object v20 = "' W";
    Object v21 = new java.lang.NoClassDefFoundError(((java.lang.String)v20));
    Object v22 = new com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer(((java.lang.NoClassDefFoundError)v21));
    Object v23 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v22));
    Object v24 = ((com.fasterxml.jackson.databind.BeanProperty)v19).getContextAnnotation(((java.lang.Class)v23));
    Object v25 = null;
    Object v26 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v27 = null;
    Object v28 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v27));
    Object v29 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v28));
    Object v30 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v31 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v32 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v25),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v26),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v29),((com.fasterxml.jackson.databind.util.RootNameLookup)v30),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v31));
    Object v33 = ((com.fasterxml.jackson.databind.cfg.MapperConfig)v32).getSubtypeResolver();
    Object v34 = "' W";
    Object v35 = new java.lang.NoClassDefFoundError(((java.lang.String)v34));
    Object v36 = new com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer(((java.lang.NoClassDefFoundError)v35));
    Object v37 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v36));
    Object v38 = ((com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase)v19).findPropertyFormat(((com.fasterxml.jackson.databind.cfg.MapperConfig)v32),((java.lang.Class)v37));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v0).hasValueDeserializer();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = "] (for ";
    Object v1 = null;
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = true;
    Object v4 = "WRITE_ENUMS_USING_INDEX";
    Object v5 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),(((java.lang.Boolean)v3).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v8 = "' W";
    Object v9 = new java.lang.NoClassDefFoundError(((java.lang.String)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer(((java.lang.NoClassDefFoundError)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v10));
    Object v12 = "' W";
    Object v13 = new java.lang.NoClassDefFoundError(((java.lang.String)v12));
    Object v14 = new com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer(((java.lang.NoClassDefFoundError)v13));
    Object v15 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v14));
    Object v16 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v17 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v15),((com.fasterxml.jackson.databind.JavaType[])v16));
    Object v18 = new com.fasterxml.jackson.databind.type.ResolvedRecursiveType(((java.lang.Class)v11),((com.fasterxml.jackson.databind.type.TypeBindings)v17));
    Object v19 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v0),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v6),((com.fasterxml.jackson.databind.util.Annotations)v7),((com.fasterxml.jackson.databind.JavaType)v18));
    Object v20 = ((com.fasterxml.jackson.databind.BeanProperty)v19).getWrapperName();
    Object v21 = null;
    Object v22 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v23 = null;
    Object v24 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v23));
    Object v25 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v24));
    Object v26 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v27 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v28 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v21),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v22),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v25),((com.fasterxml.jackson.databind.util.RootNameLookup)v26),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v27));
    Object v29 = ((com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase)v19).findAliases(((com.fasterxml.jackson.databind.cfg.MapperConfig)v28));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = "] (for ";
    Object v1 = null;
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = true;
    Object v4 = "WRITE_ENUMS_USING_INDEX";
    Object v5 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),(((java.lang.Boolean)v3).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v8 = "' W";
    Object v9 = new java.lang.NoClassDefFoundError(((java.lang.String)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer(((java.lang.NoClassDefFoundError)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v10));
    Object v12 = "' W";
    Object v13 = new java.lang.NoClassDefFoundError(((java.lang.String)v12));
    Object v14 = new com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer(((java.lang.NoClassDefFoundError)v13));
    Object v15 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v14));
    Object v16 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v17 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v15),((com.fasterxml.jackson.databind.JavaType[])v16));
    Object v18 = new com.fasterxml.jackson.databind.type.ResolvedRecursiveType(((java.lang.Class)v11),((com.fasterxml.jackson.databind.type.TypeBindings)v17));
    Object v19 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v0),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v6),((com.fasterxml.jackson.databind.util.Annotations)v7),((com.fasterxml.jackson.databind.JavaType)v18));
    Object v20 = ((com.fasterxml.jackson.databind.BeanProperty)v19).getFullName();
    Object v21 = null;
    Object v22 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v23 = null;
    Object v24 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v23));
    Object v25 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v24));
    Object v26 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v27 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v28 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v21),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v22),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v25),((com.fasterxml.jackson.databind.util.RootNameLookup)v26),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v27));
    Object v29 = "' W";
    Object v30 = new java.lang.NoClassDefFoundError(((java.lang.String)v29));
    Object v31 = new com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer(((java.lang.NoClassDefFoundError)v30));
    Object v32 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v31));
    Object v33 = ((com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase)v19).findPropertyInclusion(((com.fasterxml.jackson.databind.cfg.MapperConfig)v28),((java.lang.Class)v32));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = "] (for ";
    Object v1 = null;
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = true;
    Object v4 = "WRITE_ENUMS_USING_INDEX";
    Object v5 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),(((java.lang.Boolean)v3).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v8 = "' W";
    Object v9 = new java.lang.NoClassDefFoundError(((java.lang.String)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer(((java.lang.NoClassDefFoundError)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v10));
    Object v12 = "' W";
    Object v13 = new java.lang.NoClassDefFoundError(((java.lang.String)v12));
    Object v14 = new com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer(((java.lang.NoClassDefFoundError)v13));
    Object v15 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v14));
    Object v16 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v17 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v15),((com.fasterxml.jackson.databind.JavaType[])v16));
    Object v18 = new com.fasterxml.jackson.databind.type.ResolvedRecursiveType(((java.lang.Class)v11),((com.fasterxml.jackson.databind.type.TypeBindings)v17));
    Object v19 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v0),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v6),((com.fasterxml.jackson.databind.util.Annotations)v7),((com.fasterxml.jackson.databind.JavaType)v18));
    Object v20 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v21 = ((com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase)v19).findFormatOverrides(((com.fasterxml.jackson.databind.AnnotationIntrospector)v20));
    Object v22 = null;
    Object v23 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v24 = null;
    Object v25 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v24));
    Object v26 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v25));
    Object v27 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v28 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v29 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v22),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v23),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v26),((com.fasterxml.jackson.databind.util.RootNameLookup)v27),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v28));
    Object v30 = "' W";
    Object v31 = new java.lang.NoClassDefFoundError(((java.lang.String)v30));
    Object v32 = new com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer(((java.lang.NoClassDefFoundError)v31));
    Object v33 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v32));
    Object v34 = ((com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase)v19).findPropertyInclusion(((com.fasterxml.jackson.databind.cfg.MapperConfig)v29),((java.lang.Class)v33));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = "d (";
    Object v1 = null;
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = true;
    Object v4 = "WRITE_ENUMS_USING_INDEX";
    Object v5 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),(((java.lang.Boolean)v3).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v8 = "' W";
    Object v9 = new java.lang.NoClassDefFoundError(((java.lang.String)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer(((java.lang.NoClassDefFoundError)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v10));
    Object v12 = "' W";
    Object v13 = new java.lang.NoClassDefFoundError(((java.lang.String)v12));
    Object v14 = new com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer(((java.lang.NoClassDefFoundError)v13));
    Object v15 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v14));
    Object v16 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v17 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v15),((com.fasterxml.jackson.databind.JavaType[])v16));
    Object v18 = new com.fasterxml.jackson.databind.type.ResolvedRecursiveType(((java.lang.Class)v11),((com.fasterxml.jackson.databind.type.TypeBindings)v17));
    Object v19 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v0),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v6),((com.fasterxml.jackson.databind.util.Annotations)v7),((com.fasterxml.jackson.databind.JavaType)v18));
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v22 = null;
    Object v23 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v22));
    Object v24 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v23));
    Object v25 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v26 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v27 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v20),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v21),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v24),((com.fasterxml.jackson.databind.util.RootNameLookup)v25),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v26));
    Object v28 = ((com.fasterxml.jackson.databind.cfg.MapperConfig)v27).getDefaultVisibilityChecker();
    Object v29 = "' W";
    Object v30 = new java.lang.NoClassDefFoundError(((java.lang.String)v29));
    Object v31 = new com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer(((java.lang.NoClassDefFoundError)v30));
    Object v32 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v31));
    Object v33 = ((com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase)v19).findPropertyFormat(((com.fasterxml.jackson.databind.cfg.MapperConfig)v27),((java.lang.Class)v32));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = Short.valueOf((short)52);
    Object v2 = com.fasterxml.jackson.databind.node.ShortNode.valueOf((((java.lang.Short)v1).shortValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2));
    Object v4 = ((com.fasterxml.jackson.core.JsonParser)v3).hasTextCharacters();
    Object v5 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v6 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v6));
    Object v8 = "'";
    Object v9 = "' W";
    Object v10 = new java.lang.NoClassDefFoundError(((java.lang.String)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer(((java.lang.NoClassDefFoundError)v10));
    Object v12 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v11));
    Object v13 = "Cannot upgrade from an {nstance of ";
    Object v14 = ((com.fasterxml.jackson.databind.DeserializationContext)v7).weirdStringException(((java.lang.String)v8),((java.lang.Class)v12),((java.lang.String)v13));
    Object v15 = "' W";
    Object v16 = new java.lang.NoClassDefFoundError(((java.lang.String)v15));
    Object v17 = new com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer(((java.lang.NoClassDefFoundError)v16));
    Object v18 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v17));
    Object v19 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v20 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v18),((com.fasterxml.jackson.databind.JavaType[])v19));
    Object v21 = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v0).deserializeSetAndReturn(((com.fasterxml.jackson.core.JsonParser)v3),((com.fasterxml.jackson.databind.DeserializationContext)v7),((java.lang.Object)v20));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 21;
    ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v0).assignIndex((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = Short.valueOf((short)52);
    Object v2 = com.fasterxml.jackson.databind.node.ShortNode.valueOf((((java.lang.Short)v1).shortValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2));
    Object v4 = Short.valueOf((short)52);
    Object v5 = com.fasterxml.jackson.databind.node.ShortNode.valueOf((((java.lang.Short)v4).shortValue()));
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v5));
    Object v7 = "WRAP_ROT_VALUE";
    Object v8 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseWithUnderscoresStrategy();
    Object v9 = "' W";
    Object v10 = new java.lang.NoClassDefFoundError(((java.lang.String)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer(((java.lang.NoClassDefFoundError)v10));
    Object v12 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v11));
    Object v13 = com.fasterxml.jackson.databind.exc.InvalidFormatException.from(((com.fasterxml.jackson.core.JsonParser)v6),((java.lang.String)v7),((java.lang.Object)v8),((java.lang.Class)v12));
    Object v14 = null;
    Object v15 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v14));
    Object v16 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v15));
    ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v0)._throwAsIOE(((com.fasterxml.jackson.core.JsonParser)v3),((java.lang.Exception)v13),((java.lang.Object)v16));
    Object v17 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = "d (";
    Object v1 = null;
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = true;
    Object v4 = "WRITE_ENUMS_USING_INDEX";
    Object v5 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),(((java.lang.Boolean)v3).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v8 = "' W";
    Object v9 = new java.lang.NoClassDefFoundError(((java.lang.String)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer(((java.lang.NoClassDefFoundError)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v10));
    Object v12 = "' W";
    Object v13 = new java.lang.NoClassDefFoundError(((java.lang.String)v12));
    Object v14 = new com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer(((java.lang.NoClassDefFoundError)v13));
    Object v15 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v14));
    Object v16 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v17 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v15),((com.fasterxml.jackson.databind.JavaType[])v16));
    Object v18 = new com.fasterxml.jackson.databind.type.ResolvedRecursiveType(((java.lang.Class)v11),((com.fasterxml.jackson.databind.type.TypeBindings)v17));
    Object v19 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v0),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v6),((com.fasterxml.jackson.databind.util.Annotations)v7),((com.fasterxml.jackson.databind.JavaType)v18));
    Object v20 = new java.lang.Class[]{null};
    Object v21 = com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter.constructViewBased(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v19),((java.lang.Class[])v20));
    Object v22 = null;
    Object v23 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v24 = null;
    Object v25 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v24));
    Object v26 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v25));
    Object v27 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v28 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v29 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v22),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v23),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v26),((com.fasterxml.jackson.databind.util.RootNameLookup)v27),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v28));
    Object v30 = ((com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase)v21).findAliases(((com.fasterxml.jackson.databind.cfg.MapperConfig)v29));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = Short.valueOf((short)52);
    Object v2 = com.fasterxml.jackson.databind.node.ShortNode.valueOf((((java.lang.Short)v1).shortValue()));
    Object v3 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v2));
    Object v4 = Short.valueOf((short)52);
    Object v5 = com.fasterxml.jackson.databind.node.ShortNode.valueOf((((java.lang.Short)v4).shortValue()));
    Object v6 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v5));
    Object v7 = "WRAP_ROT_VALUE";
    Object v8 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseWithUnderscoresStrategy();
    Object v9 = "' W";
    Object v10 = new java.lang.NoClassDefFoundError(((java.lang.String)v9));
    Object v11 = new com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer(((java.lang.NoClassDefFoundError)v10));
    Object v12 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v11));
    Object v13 = com.fasterxml.jackson.databind.exc.InvalidFormatException.from(((com.fasterxml.jackson.core.JsonParser)v6),((java.lang.String)v7),((java.lang.Object)v8),((java.lang.Class)v12));
    Object v14 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v15 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v14));
    ((com.fasterxml.jackson.databind.deser.SettableBeanProperty)v0)._throwAsIOE(((com.fasterxml.jackson.core.JsonParser)v3),((java.lang.Exception)v13),((java.lang.Object)v15));
    Object v16 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = "d (";
    Object v1 = null;
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = true;
    Object v4 = "WRITE_ENUMS_USING_INDEX";
    Object v5 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),(((java.lang.Boolean)v3).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v8 = "' W";
    Object v9 = new java.lang.NoClassDefFoundError(((java.lang.String)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer(((java.lang.NoClassDefFoundError)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v10));
    Object v12 = "' W";
    Object v13 = new java.lang.NoClassDefFoundError(((java.lang.String)v12));
    Object v14 = new com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer(((java.lang.NoClassDefFoundError)v13));
    Object v15 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v14));
    Object v16 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v17 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v15),((com.fasterxml.jackson.databind.JavaType[])v16));
    Object v18 = new com.fasterxml.jackson.databind.type.ResolvedRecursiveType(((java.lang.Class)v11),((com.fasterxml.jackson.databind.type.TypeBindings)v17));
    Object v19 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v0),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v6),((com.fasterxml.jackson.databind.util.Annotations)v7),((com.fasterxml.jackson.databind.JavaType)v18));
    Object v20 = new java.lang.Class[]{null};
    Object v21 = com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter.constructViewBased(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v19),((java.lang.Class[])v20));
    Object v22 = null;
    Object v23 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v24 = null;
    Object v25 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v24));
    Object v26 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v25));
    Object v27 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v28 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v29 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v22),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v23),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v26),((com.fasterxml.jackson.databind.util.RootNameLookup)v27),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v28));
    Object v30 = "' W";
    Object v31 = new java.lang.NoClassDefFoundError(((java.lang.String)v30));
    Object v32 = new com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer(((java.lang.NoClassDefFoundError)v31));
    Object v33 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v32));
    Object v34 = ((java.lang.Class)v33).isArray();
    Object v35 = ((com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase)v21).findPropertyFormat(((com.fasterxml.jackson.databind.cfg.MapperConfig)v29),((java.lang.Class)v33));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = "] (for ";
    Object v1 = null;
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = true;
    Object v4 = "WRITE_ENUMS_USING_INDEX";
    Object v5 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),(((java.lang.Boolean)v3).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v8 = "' W";
    Object v9 = new java.lang.NoClassDefFoundError(((java.lang.String)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer(((java.lang.NoClassDefFoundError)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v10));
    Object v12 = "' W";
    Object v13 = new java.lang.NoClassDefFoundError(((java.lang.String)v12));
    Object v14 = new com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer(((java.lang.NoClassDefFoundError)v13));
    Object v15 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v14));
    Object v16 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v17 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v15),((com.fasterxml.jackson.databind.JavaType[])v16));
    Object v18 = new com.fasterxml.jackson.databind.type.ResolvedRecursiveType(((java.lang.Class)v11),((com.fasterxml.jackson.databind.type.TypeBindings)v17));
    Object v19 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v0),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v6),((com.fasterxml.jackson.databind.util.Annotations)v7),((com.fasterxml.jackson.databind.JavaType)v18));
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v22 = null;
    Object v23 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v22));
    Object v24 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v23));
    Object v25 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v26 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v27 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v20),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v21),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v24),((com.fasterxml.jackson.databind.util.RootNameLookup)v25),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v26));
    Object v28 = ((com.fasterxml.jackson.databind.cfg.MapperConfig)v27).getActiveView();
    Object v29 = "' W";
    Object v30 = new java.lang.NoClassDefFoundError(((java.lang.String)v29));
    Object v31 = new com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer(((java.lang.NoClassDefFoundError)v30));
    Object v32 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v31));
    Object v33 = ((com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase)v19).findPropertyFormat(((com.fasterxml.jackson.databind.cfg.MapperConfig)v27),((java.lang.Class)v32));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = "d (";
    Object v1 = null;
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = true;
    Object v4 = "WRITE_ENUMS_USING_INDEX";
    Object v5 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),(((java.lang.Boolean)v3).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v8 = "' W";
    Object v9 = new java.lang.NoClassDefFoundError(((java.lang.String)v8));
    Object v10 = new com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer(((java.lang.NoClassDefFoundError)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v10));
    Object v12 = "' W";
    Object v13 = new java.lang.NoClassDefFoundError(((java.lang.String)v12));
    Object v14 = new com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer(((java.lang.NoClassDefFoundError)v13));
    Object v15 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v14));
    Object v16 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v17 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v15),((com.fasterxml.jackson.databind.JavaType[])v16));
    Object v18 = new com.fasterxml.jackson.databind.type.ResolvedRecursiveType(((java.lang.Class)v11),((com.fasterxml.jackson.databind.type.TypeBindings)v17));
    Object v19 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v0),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v6),((com.fasterxml.jackson.databind.util.Annotations)v7),((com.fasterxml.jackson.databind.JavaType)v18));
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v22 = null;
    Object v23 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v22));
    Object v24 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v23));
    Object v25 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v26 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v27 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v20),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v21),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v24),((com.fasterxml.jackson.databind.util.RootNameLookup)v25),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v26));
    Object v28 = ((com.fasterxml.jackson.databind.cfg.MapperConfig)v27).getSubtypeResolver();
    Object v29 = "' W";
    Object v30 = new java.lang.NoClassDefFoundError(((java.lang.String)v29));
    Object v31 = new com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer(((java.lang.NoClassDefFoundError)v30));
    Object v32 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v31));
    Object v33 = ((com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase)v19).findPropertyInclusion(((com.fasterxml.jackson.databind.cfg.MapperConfig)v27),((java.lang.Class)v32));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }
}
