package com.fasterxml.jackson.databind.ser;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = "Q)";
    Object v1 = "nVumber";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v4 = false;
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v0),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.util.Annotations)v6),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = "]";
    Object v10 = "Illegal character (code 0x";
    Object v11 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = "";
    Object v13 = ((com.fasterxml.jackson.databind.util.NameTransformer)v11).reverse(((java.lang.String)v12));
    Object v14 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v8).rename(((com.fasterxml.jackson.databind.util.NameTransformer)v11));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = "Q)";
    Object v1 = "nVumber";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v4 = false;
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v0),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.util.Annotations)v6),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = "]";
    Object v10 = "Illegal character (code 0x";
    Object v11 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = "";
    Object v13 = ((com.fasterxml.jackson.databind.util.NameTransformer)v11).reverse(((java.lang.String)v12));
    Object v14 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v8).rename(((com.fasterxml.jackson.databind.util.NameTransformer)v11));
    Object v15 = "FAIL_ON_UNRESOLVED_OBJECT_IDS";
    Object v16 = com.fasterxml.jackson.databind.DeserializationFeature.valueOf(((java.lang.String)v15));
    Object v17 = "FAIL_ON_UNRESOLVED_OBJECT_IDS";
    Object v18 = com.fasterxml.jackson.databind.DeserializationFeature.valueOf(((java.lang.String)v17));
    Object v19 = java.util.EnumSet.of(((java.lang.Enum)v16),((java.lang.Enum)v18));
    Object v20 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v19));
    Object v21 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v14).getAnnotation(((java.lang.Class)v20));
    org.junit.Assert.assertNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = "Q)";
    Object v1 = "nVumber";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v4 = false;
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v0),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.util.Annotations)v6),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v10 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v11 = new com.fasterxml.jackson.databind.node.POJONode(((java.lang.Object)v10));
    Object v12 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v13 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v11),((com.fasterxml.jackson.core.ObjectCodec)v12));
    Object v14 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v13));
    Object v15 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v16 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v15));
    ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v8).serializeAsField(((java.lang.Object)v9),((com.fasterxml.jackson.core.JsonGenerator)v14),((com.fasterxml.jackson.databind.SerializerProvider)v16));
    Object v17 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = "Q)";
    Object v1 = "nVumber";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v4 = false;
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v0),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.util.Annotations)v6),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = "FAIL_ON_UNRESOLVED_OBJECT_IDS";
    Object v10 = com.fasterxml.jackson.databind.DeserializationFeature.valueOf(((java.lang.String)v9));
    Object v11 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v8).removeInternalSetting(((java.lang.Object)v10));
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = "Q)";
    Object v1 = "nVumber";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v4 = false;
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v0),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.util.Annotations)v6),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap.emptyForProperties();
    Object v10 = "FAIL_ON_UNRESOLVED_OBJECT_IDS";
    Object v11 = com.fasterxml.jackson.databind.DeserializationFeature.valueOf(((java.lang.String)v10));
    Object v12 = "FAIL_ON_UNRESOLVED_OBJECT_IDS";
    Object v13 = com.fasterxml.jackson.databind.DeserializationFeature.valueOf(((java.lang.String)v12));
    Object v14 = java.util.EnumSet.of(((java.lang.Enum)v11),((java.lang.Enum)v13));
    Object v15 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v14));
    Object v16 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v17 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v8)._findAndAddDynamic(((com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap)v9),((java.lang.Class)v15),((com.fasterxml.jackson.databind.SerializerProvider)v16));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = "Q)";
    Object v1 = "nVumber";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v4 = false;
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v0),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.util.Annotations)v6),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = "FAIL_ON_UNRESOLVED_OBJECT_IDS";
    Object v10 = com.fasterxml.jackson.databind.DeserializationFeature.valueOf(((java.lang.String)v9));
    Object v11 = "FAIL_ON_UNRESOLVED_OBJECT_IDS";
    Object v12 = com.fasterxml.jackson.databind.DeserializationFeature.valueOf(((java.lang.String)v11));
    Object v13 = java.util.EnumSet.of(((java.lang.Enum)v10),((java.lang.Enum)v12));
    Object v14 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v13));
    Object v15 = new com.fasterxml.jackson.databind.ser.std.RawSerializer(((java.lang.Class)v14));
    ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v8).assignSerializer(((com.fasterxml.jackson.databind.JsonSerializer)v15));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = "Q)";
    Object v1 = "nVumber";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v4 = false;
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v0),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.util.Annotations)v6),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v10 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v8).get(((java.lang.Object)v9));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = "Q)";
    Object v1 = "nVumber";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v4 = false;
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v0),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.util.Annotations)v6),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v10 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v8).findFormatOverrides(((com.fasterxml.jackson.databind.AnnotationIntrospector)v9));
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = "Q)";
    Object v1 = "nVumber";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v4 = false;
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v0),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.util.Annotations)v6),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v11 = new com.fasterxml.jackson.databind.node.POJONode(((java.lang.Object)v10));
    Object v12 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v13 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v11),((com.fasterxml.jackson.core.ObjectCodec)v12));
    Object v14 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v13));
    Object v15 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v16 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v15));
    ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v8).serializeAsOmittedField(((java.lang.Object)v9),((com.fasterxml.jackson.core.JsonGenerator)v14),((com.fasterxml.jackson.databind.SerializerProvider)v16));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = "Q)";
    Object v1 = "nVumber";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v4 = false;
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v0),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.util.Annotations)v6),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v8).hasSerializer();
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = "Q)";
    Object v1 = "nVumber";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v4 = false;
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v0),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.util.Annotations)v6),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = "]";
    Object v10 = "Illegal character (code 0x";
    Object v11 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = "";
    Object v13 = ((com.fasterxml.jackson.databind.util.NameTransformer)v11).reverse(((java.lang.String)v12));
    Object v14 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v8).rename(((com.fasterxml.jackson.databind.util.NameTransformer)v11));
    Object v15 = new java.util.TreeSet();
    Object v16 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v14).removeInternalSetting(((java.lang.Object)v15));
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = "Q)";
    Object v1 = "nVumber";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v4 = false;
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v0),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.util.Annotations)v6),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v10 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v11 = new com.fasterxml.jackson.databind.node.POJONode(((java.lang.Object)v10));
    Object v12 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v13 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v11),((com.fasterxml.jackson.core.ObjectCodec)v12));
    Object v14 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v13));
    Object v15 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v16 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v15));
    ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v8).serializeAsElement(((java.lang.Object)v9),((com.fasterxml.jackson.core.JsonGenerator)v14),((com.fasterxml.jackson.databind.SerializerProvider)v16));
    Object v17 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = "Q)";
    Object v1 = "nVumber";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v4 = false;
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v0),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.util.Annotations)v6),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = "nVumber";
    Object v10 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v9));
    Object v11 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v8),((com.fasterxml.jackson.databind.PropertyName)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = "Q)";
    Object v1 = "nVumber";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v4 = false;
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v0),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.util.Annotations)v6),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = "nVumber";
    Object v10 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v9));
    Object v11 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v8),((com.fasterxml.jackson.databind.PropertyName)v10));
    Object v12 = "FAIL_ON_UNRESOLVED_OBJECT_IDS";
    Object v13 = com.fasterxml.jackson.databind.DeserializationFeature.valueOf(((java.lang.String)v12));
    Object v14 = "FAIL_ON_UNRESOLVED_OBJECT_IDS";
    Object v15 = com.fasterxml.jackson.databind.DeserializationFeature.valueOf(((java.lang.String)v14));
    Object v16 = java.util.EnumSet.of(((java.lang.Enum)v13),((java.lang.Enum)v15));
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v16));
    Object v18 = ((java.lang.Class)v17).getProtectionDomain();
    Object v19 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v11).getContextAnnotation(((java.lang.Class)v17));
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = "Q)";
    Object v1 = "nVumber";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v4 = false;
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v0),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.util.Annotations)v6),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = "nVumber";
    Object v10 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v9));
    Object v11 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v8),((com.fasterxml.jackson.databind.PropertyName)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v11).getRawSerializationType();
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = "Q)";
    Object v1 = "nVumber";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v4 = false;
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v0),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.util.Annotations)v6),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = "nVumber";
    Object v10 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v9));
    Object v11 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v8),((com.fasterxml.jackson.databind.PropertyName)v10));
    Object v12 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v13 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v11).findFormatOverrides(((com.fasterxml.jackson.databind.AnnotationIntrospector)v12));
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = "Q)";
    Object v1 = "nVumber";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v4 = false;
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v0),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.util.Annotations)v6),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = "nVumber";
    Object v10 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v9));
    Object v11 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v8),((com.fasterxml.jackson.databind.PropertyName)v10));
    Object v12 = "FAIL_ON_UNRESOLVED_OBJECT_IDS";
    Object v13 = com.fasterxml.jackson.databind.DeserializationFeature.valueOf(((java.lang.String)v12));
    Object v14 = "FAIL_ON_UNRESOLVED_OBJECT_IDS";
    Object v15 = com.fasterxml.jackson.databind.DeserializationFeature.valueOf(((java.lang.String)v14));
    Object v16 = java.util.EnumSet.of(((java.lang.Enum)v13),((java.lang.Enum)v15));
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v16));
    Object v18 = new com.fasterxml.jackson.databind.ser.std.RawSerializer(((java.lang.Class)v17));
    ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v11).assignNullSerializer(((com.fasterxml.jackson.databind.JsonSerializer)v18));
    Object v19 = null;
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = "Q)";
    Object v1 = "nVumber";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v4 = false;
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v0),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.util.Annotations)v6),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = "nVumber";
    Object v10 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v9));
    Object v11 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v8),((com.fasterxml.jackson.databind.PropertyName)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v11).hasSerializer();
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = "Q)";
    Object v1 = "nVumber";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v4 = false;
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v0),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.util.Annotations)v6),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = "nVumber";
    Object v10 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v9));
    Object v11 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v8),((com.fasterxml.jackson.databind.PropertyName)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v14 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.type.TypeFactory)v13));
    Object v15 = "Q)";
    Object v16 = "nVumber";
    Object v17 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v16));
    Object v18 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v19 = false;
    Object v20 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.PropertyName)v17),((com.fasterxml.jackson.databind.AnnotationIntrospector)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v15),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v20),((com.fasterxml.jackson.databind.util.Annotations)v21),((com.fasterxml.jackson.databind.JavaType)v22));
    Object v24 = ")";
    Object v25 = new com.fasterxml.jackson.databind.jsontype.impl.AsExistingPropertyTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v14),((com.fasterxml.jackson.databind.BeanProperty)v23),((java.lang.String)v24));
    ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v11).assignTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v25));
    Object v26 = null;
    Object v27 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v11).getGenericPropertyType();
    org.junit.Assert.assertNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = "Q)";
    Object v1 = "nVumber";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v4 = false;
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v0),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.util.Annotations)v6),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = "nVumber";
    Object v10 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v9));
    Object v11 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v8),((com.fasterxml.jackson.databind.PropertyName)v10));
    Object v12 = com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap.emptyForProperties();
    Object v13 = "FAIL_ON_UNRESOLVED_OBJECT_IDS";
    Object v14 = com.fasterxml.jackson.databind.DeserializationFeature.valueOf(((java.lang.String)v13));
    Object v15 = "FAIL_ON_UNRESOLVED_OBJECT_IDS";
    Object v16 = com.fasterxml.jackson.databind.DeserializationFeature.valueOf(((java.lang.String)v15));
    Object v17 = java.util.EnumSet.of(((java.lang.Enum)v14),((java.lang.Enum)v16));
    Object v18 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v17));
    Object v19 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v20 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v19));
    Object v21 = "FAIL_ON_UNRESOLVED_OBJECT_IDS";
    Object v22 = com.fasterxml.jackson.databind.DeserializationFeature.valueOf(((java.lang.String)v21));
    Object v23 = "FAIL_ON_UNRESOLVED_OBJECT_IDS";
    Object v24 = com.fasterxml.jackson.databind.DeserializationFeature.valueOf(((java.lang.String)v23));
    Object v25 = java.util.EnumSet.of(((java.lang.Enum)v22),((java.lang.Enum)v24));
    Object v26 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v25));
    Object v27 = ((com.fasterxml.jackson.databind.SerializerProvider)v20).getUnknownTypeSerializer(((java.lang.Class)v26));
    Object v28 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v11)._findAndAddDynamic(((com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap)v12),((java.lang.Class)v18),((com.fasterxml.jackson.databind.SerializerProvider)v20));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = "Q)";
    Object v1 = "nVumber";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v4 = false;
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v0),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.util.Annotations)v6),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = "nVumber";
    Object v10 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v9));
    Object v11 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v8),((com.fasterxml.jackson.databind.PropertyName)v10));
    Object v12 = "FAIL_ON_UNRESOLVED_OBJECT_IDS";
    Object v13 = com.fasterxml.jackson.databind.DeserializationFeature.valueOf(((java.lang.String)v12));
    Object v14 = "FAIL_ON_UNRESOLVED_OBJECT_IDS";
    Object v15 = com.fasterxml.jackson.databind.DeserializationFeature.valueOf(((java.lang.String)v14));
    Object v16 = java.util.EnumSet.of(((java.lang.Enum)v13),((java.lang.Enum)v15));
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v16));
    Object v18 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v11).getAnnotation(((java.lang.Class)v17));
    Object v19 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor.Base();
    ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v11).depositSchemaProperty(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor)v19));
    Object v20 = null;
    org.junit.Assert.assertNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = "Q)";
    Object v1 = "nVumber";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v4 = false;
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v0),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.util.Annotations)v6),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = "nVumber";
    Object v10 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v9));
    Object v11 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v8),((com.fasterxml.jackson.databind.PropertyName)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v11).getGenericPropertyType();
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = "Q)";
    Object v1 = "nVumber";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v4 = false;
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v0),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.util.Annotations)v6),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = "nVumber";
    Object v10 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v9));
    Object v11 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v8),((com.fasterxml.jackson.databind.PropertyName)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v11).isRequired();
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = "Q)";
    Object v1 = "nVumber";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v4 = false;
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v0),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.util.Annotations)v6),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = "nVumber";
    Object v10 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v9));
    Object v11 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v8),((com.fasterxml.jackson.databind.PropertyName)v10));
    Object v12 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v13 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v12));
    Object v14 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v15 = new com.fasterxml.jackson.databind.node.POJONode(((java.lang.Object)v14));
    Object v16 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v17 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v15),((com.fasterxml.jackson.core.ObjectCodec)v16));
    Object v18 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v17));
    Object v19 = com.fasterxml.jackson.core.JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION;
    Object v20 = ((com.fasterxml.jackson.core.JsonGenerator)v18).enable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v19));
    Object v21 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v22 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v21));
    ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v11).serializeAsPlaceholder(((java.lang.Object)v13),((com.fasterxml.jackson.core.JsonGenerator)v18),((com.fasterxml.jackson.databind.SerializerProvider)v22));
    Object v23 = null;
    org.junit.Assert.assertNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = "Q)";
    Object v1 = "nVumber";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v4 = false;
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v0),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.util.Annotations)v6),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = "nVumber";
    Object v10 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v9));
    Object v11 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v8),((com.fasterxml.jackson.databind.PropertyName)v10));
    Object v12 = "FAIL_ON_UNRESOLVED_OBJECT_IDS";
    Object v13 = com.fasterxml.jackson.databind.DeserializationFeature.valueOf(((java.lang.String)v12));
    Object v14 = "FAIL_ON_UNRESOLVED_OBJECT_IDS";
    Object v15 = com.fasterxml.jackson.databind.DeserializationFeature.valueOf(((java.lang.String)v14));
    Object v16 = java.util.EnumSet.of(((java.lang.Enum)v13),((java.lang.Enum)v15));
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v16));
    Object v18 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v11).getContextAnnotation(((java.lang.Class)v17));
    Object v19 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v11).getGenericPropertyType();
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = "Q)";
    Object v1 = "nVumber";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v4 = false;
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v0),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.util.Annotations)v6),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = "nVumber";
    Object v10 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v9));
    Object v11 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v8),((com.fasterxml.jackson.databind.PropertyName)v10));
    Object v12 = "FAIL_ON_UNRESOLVED_OBJECT_IDS";
    Object v13 = com.fasterxml.jackson.databind.DeserializationFeature.valueOf(((java.lang.String)v12));
    Object v14 = "FAIL_ON_UNRESOLVED_OBJECT_IDS";
    Object v15 = com.fasterxml.jackson.databind.DeserializationFeature.valueOf(((java.lang.String)v14));
    Object v16 = java.util.EnumSet.of(((java.lang.Enum)v13),((java.lang.Enum)v15));
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v16));
    Object v18 = ((com.fasterxml.jackson.databind.ser.PropertyWriter)v11).findAnnotation(((java.lang.Class)v17));
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = "Q)";
    Object v1 = "nVumber";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v4 = false;
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v0),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.util.Annotations)v6),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = "nVumber";
    Object v10 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v9));
    Object v11 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v8),((com.fasterxml.jackson.databind.PropertyName)v10));
    Object v12 = true;
    Object v13 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new java.util.TreeMap();
    Object v15 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v13),((java.util.Map)v14));
    Object v16 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v11).depositSchemaProperty(((com.fasterxml.jackson.databind.node.ObjectNode)v15),((com.fasterxml.jackson.databind.SerializerProvider)v16));
    Object v17 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = "Q)";
    Object v1 = "nVumber";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v4 = false;
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v0),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.util.Annotations)v6),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = "nVumber";
    Object v10 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v9));
    Object v11 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v8),((com.fasterxml.jackson.databind.PropertyName)v10));
    Object v12 = "FAIL_ON_UNRESOLVED_OBJECT_IDS";
    Object v13 = com.fasterxml.jackson.databind.DeserializationFeature.valueOf(((java.lang.String)v12));
    Object v14 = "FAIL_ON_UNRESOLVED_OBJECT_IDS";
    Object v15 = com.fasterxml.jackson.databind.DeserializationFeature.valueOf(((java.lang.String)v14));
    Object v16 = java.util.EnumSet.of(((java.lang.Enum)v13),((java.lang.Enum)v15));
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v16));
    Object v18 = new com.fasterxml.jackson.databind.ser.std.RawSerializer(((java.lang.Class)v17));
    ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v11).assignSerializer(((com.fasterxml.jackson.databind.JsonSerializer)v18));
    Object v19 = null;
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = "Q)";
    Object v1 = "nVumber";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v4 = false;
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v0),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.util.Annotations)v6),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = "nVumber";
    Object v10 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v9));
    Object v11 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v8),((com.fasterxml.jackson.databind.PropertyName)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v11).hasNullSerializer();
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = "Q)";
    Object v1 = "nVumber";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v4 = false;
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v0),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.util.Annotations)v6),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = "nVumber";
    Object v10 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v9));
    Object v11 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v8),((com.fasterxml.jackson.databind.PropertyName)v10));
    Object v12 = "nVumber";
    Object v13 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v12));
    Object v14 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v11).getInternalSetting(((java.lang.Object)v13));
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = "Q)";
    Object v1 = "nVumber";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v4 = false;
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v0),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.util.Annotations)v6),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = "nVumber";
    Object v10 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v9));
    Object v11 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v8),((com.fasterxml.jackson.databind.PropertyName)v10));
    Object v12 = "FAIL_ON_UNRESOLVED_OBJECT_IDS";
    Object v13 = com.fasterxml.jackson.databind.DeserializationFeature.valueOf(((java.lang.String)v12));
    Object v14 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v11).get(((java.lang.Object)v13));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = "Q)";
    Object v1 = "nVumber";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v4 = false;
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v0),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.util.Annotations)v6),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = "nVumber";
    Object v10 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v9));
    Object v11 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v8),((com.fasterxml.jackson.databind.PropertyName)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v11).getWrapperName();
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = "Q)";
    Object v1 = "nVumber";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v4 = false;
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v0),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.util.Annotations)v6),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = "nVumber";
    Object v10 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v9));
    Object v11 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v8),((com.fasterxml.jackson.databind.PropertyName)v10));
    Object v12 = "nVumber";
    Object v13 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v12));
    Object v14 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v11).wouldConflictWithName(((com.fasterxml.jackson.databind.PropertyName)v13));
    org.junit.Assert.assertEquals((Object)(true), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = "Q)";
    Object v1 = "nVumber";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v4 = false;
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v0),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.util.Annotations)v6),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = "nVumber";
    Object v10 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v9));
    Object v11 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v8),((com.fasterxml.jackson.databind.PropertyName)v10));
    Object v12 = "]";
    Object v13 = "Illegal character (code 0x";
    Object v14 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v11).unwrappingWriter(((com.fasterxml.jackson.databind.util.NameTransformer)v14));
    Object v16 = true;
    Object v17 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v16).booleanValue()));
    Object v18 = new java.util.TreeMap();
    Object v19 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v17),((java.util.Map)v18));
    Object v20 = "$";
    Object v21 = ((com.fasterxml.jackson.databind.node.ObjectNode)v19).putNull(((java.lang.String)v20));
    Object v22 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v11).depositSchemaProperty(((com.fasterxml.jackson.databind.node.ObjectNode)v19),((com.fasterxml.jackson.databind.SerializerProvider)v22));
    Object v23 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = "Q)";
    Object v1 = "nVumber";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v4 = false;
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v0),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.util.Annotations)v6),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = "nVumber";
    Object v10 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v9));
    Object v11 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v8),((com.fasterxml.jackson.databind.PropertyName)v10));
    Object v12 = "nVumber";
    Object v13 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v12));
    Object v14 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v15 = new com.fasterxml.jackson.databind.node.POJONode(((java.lang.Object)v14));
    Object v16 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v17 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v15),((com.fasterxml.jackson.core.ObjectCodec)v16));
    Object v18 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v17));
    Object v19 = com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN;
    Object v20 = ((com.fasterxml.jackson.core.JsonGenerator)v18).enable(((com.fasterxml.jackson.core.JsonGenerator.Feature)v19));
    Object v21 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v11).serializeAsPlaceholder(((java.lang.Object)v13),((com.fasterxml.jackson.core.JsonGenerator)v18),((com.fasterxml.jackson.databind.SerializerProvider)v21));
    Object v22 = null;
    org.junit.Assert.assertNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = "Q)";
    Object v1 = "nVumber";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v4 = false;
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v0),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.util.Annotations)v6),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = "nVumber";
    Object v10 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v9));
    Object v11 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v8),((com.fasterxml.jackson.databind.PropertyName)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v11).getFullName();
    Object v13 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v11).getPropertyType();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = "Q)";
    Object v1 = "nVumber";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v4 = false;
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v0),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.util.Annotations)v6),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = "nVumber";
    Object v10 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v9));
    Object v11 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v8),((com.fasterxml.jackson.databind.PropertyName)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v11).willSuppressNulls();
    org.junit.Assert.assertEquals((Object)(true), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = "Q)";
    Object v1 = "nVumber";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v4 = false;
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v0),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.util.Annotations)v6),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = "nVumber";
    Object v10 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v9));
    Object v11 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v8),((com.fasterxml.jackson.databind.PropertyName)v10));
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v13 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v11).getInternalSetting(((java.lang.Object)v12));
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = "Q)";
    Object v1 = "nVumber";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v4 = false;
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v0),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.util.Annotations)v6),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = "nVumber";
    Object v10 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v9));
    Object v11 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v8),((com.fasterxml.jackson.databind.PropertyName)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v11).readResolve();
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = "Q)";
    Object v1 = "nVumber";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v4 = false;
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v0),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.util.Annotations)v6),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = "nVumber";
    Object v10 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v9));
    Object v11 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v8),((com.fasterxml.jackson.databind.PropertyName)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v11).getPropertyType();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = "Q)";
    Object v1 = "nVumber";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v4 = false;
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v0),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.util.Annotations)v6),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = "nVumber";
    Object v10 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v9));
    Object v11 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v8),((com.fasterxml.jackson.databind.PropertyName)v10));
    Object v12 = "FAIL_ON_UNRESOLVED_OBJECT_IDS";
    Object v13 = com.fasterxml.jackson.databind.DeserializationFeature.valueOf(((java.lang.String)v12));
    Object v14 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v15 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v11).setInternalSetting(((java.lang.Object)v13),((java.lang.Object)v14));
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = "Q)";
    Object v1 = "nVumber";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v4 = false;
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v0),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.util.Annotations)v6),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = "nVumber";
    Object v10 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v9));
    Object v11 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v8),((com.fasterxml.jackson.databind.PropertyName)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v11).readResolve();
    Object v13 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v12).getMember();
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = "Q)";
    Object v1 = "nVumber";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v4 = false;
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v0),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.util.Annotations)v6),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = "nVumber";
    Object v10 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v9));
    Object v11 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v8),((com.fasterxml.jackson.databind.PropertyName)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v11).readResolve();
    Object v13 = "FAIL_ON_UNRESOLVED_OBJECT_IDS";
    Object v14 = com.fasterxml.jackson.databind.DeserializationFeature.valueOf(((java.lang.String)v13));
    Object v15 = "FAIL_ON_UNRESOLVED_OBJECT_IDS";
    Object v16 = com.fasterxml.jackson.databind.DeserializationFeature.valueOf(((java.lang.String)v15));
    Object v17 = java.util.EnumSet.of(((java.lang.Enum)v14),((java.lang.Enum)v16));
    Object v18 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v17));
    Object v19 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v12).getContextAnnotation(((java.lang.Class)v18));
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = "Q)";
    Object v1 = "nVumber";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v4 = false;
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v0),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.util.Annotations)v6),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = "nVumber";
    Object v10 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v9));
    Object v11 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v8),((com.fasterxml.jackson.databind.PropertyName)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v11).readResolve();
    Object v13 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v12).hasNullSerializer();
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = "Q)";
    Object v1 = "nVumber";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v4 = false;
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v0),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.util.Annotations)v6),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = "FAIL_ON_UNRESOLVED_OBJECT_IDS";
    Object v10 = com.fasterxml.jackson.databind.DeserializationFeature.valueOf(((java.lang.String)v9));
    Object v11 = "FAIL_ON_UNRESOLVED_OBJECT_IDS";
    Object v12 = com.fasterxml.jackson.databind.DeserializationFeature.valueOf(((java.lang.String)v11));
    Object v13 = java.util.EnumSet.of(((java.lang.Enum)v10),((java.lang.Enum)v12));
    Object v14 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v13));
    Object v15 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v8).getAnnotation(((java.lang.Class)v14));
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = "Q)";
    Object v1 = "nVumber";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v4 = false;
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v0),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.util.Annotations)v6),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = "nVumber";
    Object v10 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v9));
    Object v11 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v8),((com.fasterxml.jackson.databind.PropertyName)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v11).readResolve();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v15 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.type.TypeFactory)v14));
    Object v16 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v17 = new com.fasterxml.jackson.databind.node.POJONode(((java.lang.Object)v16));
    Object v18 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v19 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v17),((com.fasterxml.jackson.core.ObjectCodec)v18));
    Object v20 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v19));
    Object v21 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v22 = "FAIL_ON_UNRESOLVED_OBJECT_IDS";
    Object v23 = com.fasterxml.jackson.databind.DeserializationFeature.valueOf(((java.lang.String)v22));
    Object v24 = "FAIL_ON_UNRESOLVED_OBJECT_IDS";
    Object v25 = com.fasterxml.jackson.databind.DeserializationFeature.valueOf(((java.lang.String)v24));
    Object v26 = java.util.EnumSet.of(((java.lang.Enum)v23),((java.lang.Enum)v25));
    Object v27 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v26));
    Object v28 = new com.fasterxml.jackson.databind.ser.std.RawSerializer(((java.lang.Class)v27));
    Object v29 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v30 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v29));
    Object v31 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base(((com.fasterxml.jackson.databind.SerializerProvider)v30));
    Object v32 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.JsonSerializer)v28).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v31),((com.fasterxml.jackson.databind.JavaType)v32));
    Object v33 = null;
    Object v34 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v12)._handleSelfReference(((java.lang.Object)v15),((com.fasterxml.jackson.core.JsonGenerator)v20),((com.fasterxml.jackson.databind.SerializerProvider)v21),((com.fasterxml.jackson.databind.JsonSerializer)v28));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = "Q)";
    Object v1 = "nVumber";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v4 = false;
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v0),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.util.Annotations)v6),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = "nVumber";
    Object v10 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v9));
    Object v11 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v8),((com.fasterxml.jackson.databind.PropertyName)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v11).readResolve();
    Object v13 = "#";
    Object v14 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v13));
    Object v15 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v12),((com.fasterxml.jackson.core.io.SerializedString)v14));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = "Q)";
    Object v1 = "nVumber";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v4 = false;
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v0),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.util.Annotations)v6),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = "nVumber";
    Object v10 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v9));
    Object v11 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v8),((com.fasterxml.jackson.databind.PropertyName)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v11).readResolve();
    Object v13 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v12).toString();
    org.junit.Assert.assertEquals((Object)("property 'nVumber' (virtual, no static serializer)"), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = "Q)";
    Object v1 = "nVumber";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v4 = false;
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v0),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.util.Annotations)v6),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = "nVumber";
    Object v10 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v9));
    Object v11 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v8),((com.fasterxml.jackson.databind.PropertyName)v10));
    Object v12 = "#";
    Object v13 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v12));
    Object v14 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v11),((com.fasterxml.jackson.core.io.SerializedString)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = "Q)";
    Object v1 = "nVumber";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v4 = false;
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v0),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.util.Annotations)v6),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = "nVumber";
    Object v10 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v9));
    Object v11 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v8),((com.fasterxml.jackson.databind.PropertyName)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v11).getGenericPropertyType();
    Object v13 = "]";
    Object v14 = "Illegal character (code 0x";
    Object v15 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v11).rename(((com.fasterxml.jackson.databind.util.NameTransformer)v15));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = "Q)";
    Object v1 = "nVumber";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v4 = false;
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v0),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.util.Annotations)v6),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = "nVumber";
    Object v10 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v9));
    Object v11 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v8),((com.fasterxml.jackson.databind.PropertyName)v10));
    Object v12 = "#";
    Object v13 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v12));
    Object v14 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v11),((com.fasterxml.jackson.core.io.SerializedString)v13));
    Object v15 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor.Base();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v14).setInternalSetting(((java.lang.Object)v15),((java.lang.Object)v16));
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = "Q)";
    Object v1 = "nVumber";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v4 = false;
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v0),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.util.Annotations)v6),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = "nVumber";
    Object v10 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v9));
    Object v11 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v8),((com.fasterxml.jackson.databind.PropertyName)v10));
    Object v12 = "#";
    Object v13 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v12));
    Object v14 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v11),((com.fasterxml.jackson.core.io.SerializedString)v13));
    Object v15 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v16 = new com.fasterxml.jackson.databind.node.POJONode(((java.lang.Object)v15));
    Object v17 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v18 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v16),((com.fasterxml.jackson.core.ObjectCodec)v17));
    Object v19 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v20 = new com.fasterxml.jackson.databind.node.POJONode(((java.lang.Object)v19));
    Object v21 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v22 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v20),((com.fasterxml.jackson.core.ObjectCodec)v21));
    Object v23 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v22));
    Object v24 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v14).serializeAsElement(((java.lang.Object)v18),((com.fasterxml.jackson.core.JsonGenerator)v23),((com.fasterxml.jackson.databind.SerializerProvider)v24));
    Object v25 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = "Q)";
    Object v1 = "nVumber";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v4 = false;
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v0),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.util.Annotations)v6),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = "nVumber";
    Object v10 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v9));
    Object v11 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v8),((com.fasterxml.jackson.databind.PropertyName)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v11).readResolve();
    Object v13 = "#";
    Object v14 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v13));
    Object v15 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v12),((com.fasterxml.jackson.core.io.SerializedString)v14));
    Object v16 = "FAIL_ON_UNRESOLVED_OBJECT_IDS";
    Object v17 = com.fasterxml.jackson.databind.DeserializationFeature.valueOf(((java.lang.String)v16));
    Object v18 = "FAIL_ON_UNRESOLVED_OBJECT_IDS";
    Object v19 = com.fasterxml.jackson.databind.DeserializationFeature.valueOf(((java.lang.String)v18));
    Object v20 = java.util.EnumSet.of(((java.lang.Enum)v17),((java.lang.Enum)v19));
    Object v21 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v20));
    Object v22 = new com.fasterxml.jackson.databind.ser.std.RawSerializer(((java.lang.Class)v21));
    ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v15).assignSerializer(((com.fasterxml.jackson.databind.JsonSerializer)v22));
    Object v23 = null;
    Object v24 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor.Base();
    ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v15).depositSchemaProperty(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor)v24));
    Object v25 = null;
    org.junit.Assert.assertNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = "Q)";
    Object v1 = "nVumber";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v4 = false;
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v0),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.util.Annotations)v6),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = "nVumber";
    Object v10 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v9));
    Object v11 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v8),((com.fasterxml.jackson.databind.PropertyName)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v11).readResolve();
    Object v13 = "#";
    Object v14 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v13));
    Object v15 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v12),((com.fasterxml.jackson.core.io.SerializedString)v14));
    Object v16 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v15).getWrapperName();
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = "Q)";
    Object v1 = "nVumber";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v4 = false;
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v0),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.util.Annotations)v6),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = "nVumber";
    Object v10 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v9));
    Object v11 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v8),((com.fasterxml.jackson.databind.PropertyName)v10));
    Object v12 = "#";
    Object v13 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v12));
    Object v14 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v11),((com.fasterxml.jackson.core.io.SerializedString)v13));
    Object v15 = "FAIL_ON_UNRESOLVED_OBJECT_IDS";
    Object v16 = com.fasterxml.jackson.databind.DeserializationFeature.valueOf(((java.lang.String)v15));
    Object v17 = "FAIL_ON_UNRESOLVED_OBJECT_IDS";
    Object v18 = com.fasterxml.jackson.databind.DeserializationFeature.valueOf(((java.lang.String)v17));
    Object v19 = java.util.EnumSet.of(((java.lang.Enum)v16),((java.lang.Enum)v18));
    Object v20 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v19));
    Object v21 = new com.fasterxml.jackson.databind.ser.std.RawSerializer(((java.lang.Class)v20));
    ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v14).assignNullSerializer(((com.fasterxml.jackson.databind.JsonSerializer)v21));
    Object v22 = null;
    org.junit.Assert.assertNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = "Q)";
    Object v1 = "nVumber";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v4 = false;
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v0),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.util.Annotations)v6),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = "nVumber";
    Object v10 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v9));
    Object v11 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v8),((com.fasterxml.jackson.databind.PropertyName)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v11).readResolve();
    Object v13 = "FAIL_ON_UNRESOLVED_OBJECT_IDS";
    Object v14 = com.fasterxml.jackson.databind.DeserializationFeature.valueOf(((java.lang.String)v13));
    Object v15 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v16 = new com.fasterxml.jackson.databind.node.POJONode(((java.lang.Object)v15));
    Object v17 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v18 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v16),((com.fasterxml.jackson.core.ObjectCodec)v17));
    Object v19 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v18));
    Object v20 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.PropertyWriter)v12).serializeAsPlaceholder(((java.lang.Object)v14),((com.fasterxml.jackson.core.JsonGenerator)v19),((com.fasterxml.jackson.databind.SerializerProvider)v20));
    Object v21 = null;
    Object v22 = "FAIL_ON_UNRESOLVED_OBJECT_IDS";
    Object v23 = com.fasterxml.jackson.databind.DeserializationFeature.valueOf(((java.lang.String)v22));
    Object v24 = "FAIL_ON_UNRESOLVED_OBJECT_IDS";
    Object v25 = com.fasterxml.jackson.databind.DeserializationFeature.valueOf(((java.lang.String)v24));
    Object v26 = java.util.EnumSet.of(((java.lang.Enum)v23),((java.lang.Enum)v25));
    Object v27 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v26));
    Object v28 = ((java.lang.Class)v27).toString();
    Object v29 = ((com.fasterxml.jackson.databind.ser.PropertyWriter)v12).findAnnotation(((java.lang.Class)v27));
    org.junit.Assert.assertNull(v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = "Q)";
    Object v1 = "nVumber";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v4 = false;
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v0),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.util.Annotations)v6),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = "nVumber";
    Object v10 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v9));
    Object v11 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v8),((com.fasterxml.jackson.databind.PropertyName)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v11).readResolve();
    Object v13 = "#";
    Object v14 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v13));
    Object v15 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v12),((com.fasterxml.jackson.core.io.SerializedString)v14));
    Object v16 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v17 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v15).findFormatOverrides(((com.fasterxml.jackson.databind.AnnotationIntrospector)v16));
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = "Q)";
    Object v1 = "nVumber";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v4 = false;
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v0),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.util.Annotations)v6),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = "nVumber";
    Object v10 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v9));
    Object v11 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v8),((com.fasterxml.jackson.databind.PropertyName)v10));
    Object v12 = "FAIL_ON_UNRESOLVED_OBJECT_IDS";
    Object v13 = com.fasterxml.jackson.databind.DeserializationFeature.valueOf(((java.lang.String)v12));
    Object v14 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v11).getInternalSetting(((java.lang.Object)v13));
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = "Q)";
    Object v1 = "nVumber";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v4 = false;
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v0),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.util.Annotations)v6),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = "nVumber";
    Object v10 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v9));
    Object v11 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v8),((com.fasterxml.jackson.databind.PropertyName)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v11).readResolve();
    Object v13 = "#";
    Object v14 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v13));
    Object v15 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v12),((com.fasterxml.jackson.core.io.SerializedString)v14));
    Object v16 = "FAIL_ON_UNRESOLVED_OBJECT_IDS";
    Object v17 = com.fasterxml.jackson.databind.DeserializationFeature.valueOf(((java.lang.String)v16));
    Object v18 = "FAIL_ON_UNRESOLVED_OBJECT_IDS";
    Object v19 = com.fasterxml.jackson.databind.DeserializationFeature.valueOf(((java.lang.String)v18));
    Object v20 = java.util.EnumSet.of(((java.lang.Enum)v17),((java.lang.Enum)v19));
    Object v21 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v22 = new com.fasterxml.jackson.databind.node.POJONode(((java.lang.Object)v21));
    Object v23 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v24 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v22),((com.fasterxml.jackson.core.ObjectCodec)v23));
    Object v25 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v24));
    Object v26 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v27 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v26));
    Object v28 = "FAIL_ON_UNRESOLVED_OBJECT_IDS";
    Object v29 = com.fasterxml.jackson.databind.DeserializationFeature.valueOf(((java.lang.String)v28));
    Object v30 = "FAIL_ON_UNRESOLVED_OBJECT_IDS";
    Object v31 = com.fasterxml.jackson.databind.DeserializationFeature.valueOf(((java.lang.String)v30));
    Object v32 = java.util.EnumSet.of(((java.lang.Enum)v29),((java.lang.Enum)v31));
    Object v33 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v32));
    Object v34 = new com.fasterxml.jackson.databind.ser.std.RawSerializer(((java.lang.Class)v33));
    Object v35 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v15)._handleSelfReference(((java.lang.Object)v20),((com.fasterxml.jackson.core.JsonGenerator)v25),((com.fasterxml.jackson.databind.SerializerProvider)v27),((com.fasterxml.jackson.databind.JsonSerializer)v34));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = "Q)";
    Object v1 = "nVumber";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v4 = false;
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v0),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.util.Annotations)v6),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = "nVumber";
    Object v10 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v9));
    Object v11 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v8),((com.fasterxml.jackson.databind.PropertyName)v10));
    Object v12 = "#";
    Object v13 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v12));
    Object v14 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v11),((com.fasterxml.jackson.core.io.SerializedString)v13));
    Object v15 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v14).hasSerializer();
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = "Q)";
    Object v1 = "nVumber";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v4 = false;
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v0),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.util.Annotations)v6),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = "nVumber";
    Object v10 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v9));
    Object v11 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v8),((com.fasterxml.jackson.databind.PropertyName)v10));
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v13 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v11).removeInternalSetting(((java.lang.Object)v12));
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = "Q)";
    Object v1 = "nVumber";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v4 = false;
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v0),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.util.Annotations)v6),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = "nVumber";
    Object v10 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v9));
    Object v11 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v8),((com.fasterxml.jackson.databind.PropertyName)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v11).readResolve();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v14 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v15 = new com.fasterxml.jackson.databind.node.POJONode(((java.lang.Object)v14));
    Object v16 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v17 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v15),((com.fasterxml.jackson.core.ObjectCodec)v16));
    Object v18 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v17));
    Object v19 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v12).serializeAsOmittedField(((java.lang.Object)v13),((com.fasterxml.jackson.core.JsonGenerator)v18),((com.fasterxml.jackson.databind.SerializerProvider)v19));
    Object v20 = null;
    org.junit.Assert.assertNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = "Q)";
    Object v1 = "nVumber";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v4 = false;
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v0),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.util.Annotations)v6),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = "nVumber";
    Object v10 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v9));
    Object v11 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v8),((com.fasterxml.jackson.databind.PropertyName)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v11).getFullName();
    Object v13 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v11).hasNullSerializer();
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = "Q)";
    Object v1 = "nVumber";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v4 = false;
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v0),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.util.Annotations)v6),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = "nVumber";
    Object v10 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v9));
    Object v11 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v8),((com.fasterxml.jackson.databind.PropertyName)v10));
    Object v12 = "FAIL_ON_UNRESOLVED_OBJECT_IDS";
    Object v13 = com.fasterxml.jackson.databind.DeserializationFeature.valueOf(((java.lang.String)v12));
    Object v14 = "FAIL_ON_UNRESOLVED_OBJECT_IDS";
    Object v15 = com.fasterxml.jackson.databind.DeserializationFeature.valueOf(((java.lang.String)v14));
    Object v16 = java.util.EnumSet.of(((java.lang.Enum)v13),((java.lang.Enum)v15));
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v16));
    Object v18 = new com.fasterxml.jackson.databind.ser.std.RawSerializer(((java.lang.Class)v17));
    ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v11).assignSerializer(((com.fasterxml.jackson.databind.JsonSerializer)v18));
    Object v19 = null;
    Object v20 = "nVumber";
    Object v21 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v20));
    Object v22 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v11).wouldConflictWithName(((com.fasterxml.jackson.databind.PropertyName)v21));
    org.junit.Assert.assertEquals((Object)(true), v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = "Q)";
    Object v1 = "nVumber";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v4 = false;
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v0),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.util.Annotations)v6),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = "nVumber";
    Object v10 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v9));
    Object v11 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v8),((com.fasterxml.jackson.databind.PropertyName)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v11).readResolve();
    Object v13 = "#";
    Object v14 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v13));
    Object v15 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v12),((com.fasterxml.jackson.core.io.SerializedString)v14));
    Object v16 = "#";
    Object v17 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v16));
    Object v18 = new byte[]{};
    Object v19 = java.nio.ByteBuffer.wrap(((byte[])v18));
    Object v20 = ((com.fasterxml.jackson.core.io.SerializedString)v17).putQuotedUTF8(((java.nio.ByteBuffer)v19));
    Object v21 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v15),((com.fasterxml.jackson.core.io.SerializedString)v17));
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = "Q)";
    Object v1 = "nVumber";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v4 = false;
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v0),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.util.Annotations)v6),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = true;
    Object v10 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = new java.util.TreeMap();
    Object v12 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v10),((java.util.Map)v11));
    Object v13 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v14 = new com.fasterxml.jackson.databind.node.POJONode(((java.lang.Object)v13));
    Object v15 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v16 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v14),((com.fasterxml.jackson.core.ObjectCodec)v15));
    Object v17 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v16));
    Object v18 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v8).serializeAsElement(((java.lang.Object)v12),((com.fasterxml.jackson.core.JsonGenerator)v17),((com.fasterxml.jackson.databind.SerializerProvider)v18));
    Object v19 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = "Q)";
    Object v1 = "nVumber";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v4 = false;
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v0),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.util.Annotations)v6),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = "nVumber";
    Object v10 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v9));
    Object v11 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v8),((com.fasterxml.jackson.databind.PropertyName)v10));
    Object v12 = "#";
    Object v13 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v12));
    Object v14 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v11),((com.fasterxml.jackson.core.io.SerializedString)v13));
    Object v15 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v16 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v14).getInternalSetting(((java.lang.Object)v15));
    Object v17 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v14).getRawSerializationType();
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = "Q)";
    Object v1 = "nVumber";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v4 = false;
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v0),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.util.Annotations)v6),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = "nVumber";
    Object v10 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v9));
    Object v11 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v8),((com.fasterxml.jackson.databind.PropertyName)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v11).readResolve();
    Object v13 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v12).getPropertyType();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = "Q)";
    Object v1 = "nVumber";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v4 = false;
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v0),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.util.Annotations)v6),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = "nVumber";
    Object v10 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v9));
    Object v11 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v8),((com.fasterxml.jackson.databind.PropertyName)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v11).readResolve();
    Object v13 = "#";
    Object v14 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v13));
    Object v15 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v12),((com.fasterxml.jackson.core.io.SerializedString)v14));
    Object v16 = "nVumber";
    Object v17 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v16));
    Object v18 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v15).wouldConflictWithName(((com.fasterxml.jackson.databind.PropertyName)v17));
    org.junit.Assert.assertEquals((Object)(false), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = "Q)";
    Object v1 = "nVumber";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v4 = false;
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v0),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.util.Annotations)v6),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = "nVumber";
    Object v10 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v9));
    Object v11 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v8),((com.fasterxml.jackson.databind.PropertyName)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v11).getGenericPropertyType();
    Object v13 = "]";
    Object v14 = "Illegal character (code 0x";
    Object v15 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v11).rename(((com.fasterxml.jackson.databind.util.NameTransformer)v15));
    Object v17 = "]";
    Object v18 = "Illegal character (code 0x";
    Object v19 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v17),((java.lang.String)v18));
    Object v20 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v16).unwrappingWriter(((com.fasterxml.jackson.databind.util.NameTransformer)v19));
    Object v21 = true;
    Object v22 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v21).booleanValue()));
    Object v23 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v16).removeInternalSetting(((java.lang.Object)v22));
    org.junit.Assert.assertNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = "Q)";
    Object v1 = "nVumber";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v4 = false;
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v0),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.util.Annotations)v6),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = "nVumber";
    Object v10 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v9));
    Object v11 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v8),((com.fasterxml.jackson.databind.PropertyName)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v11).getGenericPropertyType();
    Object v13 = "]";
    Object v14 = "Illegal character (code 0x";
    Object v15 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v11).rename(((com.fasterxml.jackson.databind.util.NameTransformer)v15));
    Object v17 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v16).isUnwrapping();
    org.junit.Assert.assertEquals((Object)(false), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = "Q)";
    Object v1 = "nVumber";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v4 = false;
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v0),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.util.Annotations)v6),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = "nVumber";
    Object v10 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v9));
    Object v11 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v8),((com.fasterxml.jackson.databind.PropertyName)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v11).readResolve();
    Object v13 = "#";
    Object v14 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v13));
    Object v15 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v12),((com.fasterxml.jackson.core.io.SerializedString)v14));
    Object v16 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor.Base();
    ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v15).depositSchemaProperty(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor)v16));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = "Q)";
    Object v1 = "nVumber";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v4 = false;
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v0),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.util.Annotations)v6),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = "nVumber";
    Object v10 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v9));
    Object v11 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v8),((com.fasterxml.jackson.databind.PropertyName)v10));
    Object v12 = "#";
    Object v13 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v12));
    Object v14 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v11),((com.fasterxml.jackson.core.io.SerializedString)v13));
    Object v15 = "nVumber";
    Object v16 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v15));
    Object v17 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v18 = new com.fasterxml.jackson.databind.node.POJONode(((java.lang.Object)v17));
    Object v19 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v20 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v18),((com.fasterxml.jackson.core.ObjectCodec)v19));
    Object v21 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v20));
    Object v22 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v23 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v22));
    Object v24 = "FAIL_ON_UNRESOLVED_OBJECT_IDS";
    Object v25 = com.fasterxml.jackson.databind.DeserializationFeature.valueOf(((java.lang.String)v24));
    Object v26 = "FAIL_ON_UNRESOLVED_OBJECT_IDS";
    Object v27 = com.fasterxml.jackson.databind.DeserializationFeature.valueOf(((java.lang.String)v26));
    Object v28 = java.util.EnumSet.of(((java.lang.Enum)v25),((java.lang.Enum)v27));
    Object v29 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v28));
    Object v30 = new com.fasterxml.jackson.databind.ser.std.RawSerializer(((java.lang.Class)v29));
    Object v31 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v14)._handleSelfReference(((java.lang.Object)v16),((com.fasterxml.jackson.core.JsonGenerator)v21),((com.fasterxml.jackson.databind.SerializerProvider)v23),((com.fasterxml.jackson.databind.JsonSerializer)v30));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = "Q)";
    Object v1 = "nVumber";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v4 = false;
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v0),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.util.Annotations)v6),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = "nVumber";
    Object v10 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v9));
    Object v11 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v8),((com.fasterxml.jackson.databind.PropertyName)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v11).readResolve();
    Object v13 = "#";
    Object v14 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v13));
    Object v15 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v12),((com.fasterxml.jackson.core.io.SerializedString)v14));
    Object v16 = "#";
    Object v17 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v16));
    Object v18 = new byte[]{};
    Object v19 = java.nio.ByteBuffer.wrap(((byte[])v18));
    Object v20 = ((com.fasterxml.jackson.core.io.SerializedString)v17).putQuotedUTF8(((java.nio.ByteBuffer)v19));
    Object v21 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v15),((com.fasterxml.jackson.core.io.SerializedString)v17));
    Object v22 = "FAIL_ON_UNRESOLVED_OBJECT_IDS";
    Object v23 = com.fasterxml.jackson.databind.DeserializationFeature.valueOf(((java.lang.String)v22));
    Object v24 = "FAIL_ON_UNRESOLVED_OBJECT_IDS";
    Object v25 = com.fasterxml.jackson.databind.DeserializationFeature.valueOf(((java.lang.String)v24));
    Object v26 = java.util.EnumSet.of(((java.lang.Enum)v23),((java.lang.Enum)v25));
    Object v27 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v26));
    Object v28 = ((com.fasterxml.jackson.databind.ser.PropertyWriter)v21).findAnnotation(((java.lang.Class)v27));
    org.junit.Assert.assertNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = "Q)";
    Object v1 = "nVumber";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v4 = false;
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v0),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.util.Annotations)v6),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = "nVumber";
    Object v10 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v9));
    Object v11 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v8),((com.fasterxml.jackson.databind.PropertyName)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v11).readResolve();
    Object v13 = "#";
    Object v14 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v13));
    Object v15 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v12),((com.fasterxml.jackson.core.io.SerializedString)v14));
    Object v16 = "#";
    Object v17 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v16));
    Object v18 = new byte[]{};
    Object v19 = java.nio.ByteBuffer.wrap(((byte[])v18));
    Object v20 = ((com.fasterxml.jackson.core.io.SerializedString)v17).putQuotedUTF8(((java.nio.ByteBuffer)v19));
    Object v21 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v15),((com.fasterxml.jackson.core.io.SerializedString)v17));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v21).setNonTrivialBaseType(((com.fasterxml.jackson.databind.JavaType)v22));
    Object v23 = null;
    Object v24 = "nVumber";
    Object v25 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v24));
    Object v26 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v21).wouldConflictWithName(((com.fasterxml.jackson.databind.PropertyName)v25));
    org.junit.Assert.assertEquals((Object)(false), v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v1 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).isUnwrapping();
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v1 = "nVumber";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0),((com.fasterxml.jackson.databind.PropertyName)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v1 = "nVumber";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0),((com.fasterxml.jackson.databind.PropertyName)v2));
    Object v4 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v3).getFullName();
    Object v5 = true;
    Object v6 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new java.util.TreeMap();
    Object v8 = new com.fasterxml.jackson.databind.node.ObjectNode(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v6),((java.util.Map)v7));
    Object v9 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v10 = "FAIL_ON_UNRESOLVED_OBJECT_IDS";
    Object v11 = com.fasterxml.jackson.databind.DeserializationFeature.valueOf(((java.lang.String)v10));
    Object v12 = "FAIL_ON_UNRESOLVED_OBJECT_IDS";
    Object v13 = com.fasterxml.jackson.databind.DeserializationFeature.valueOf(((java.lang.String)v12));
    Object v14 = java.util.EnumSet.of(((java.lang.Enum)v11),((java.lang.Enum)v13));
    Object v15 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v14));
    Object v16 = new com.fasterxml.jackson.databind.ser.std.RawSerializer(((java.lang.Class)v15));
    ((com.fasterxml.jackson.databind.SerializerProvider)v9).setDefaultKeySerializer(((com.fasterxml.jackson.databind.JsonSerializer)v16));
    Object v17 = null;
    ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v3).depositSchemaProperty(((com.fasterxml.jackson.databind.node.ObjectNode)v8),((com.fasterxml.jackson.databind.SerializerProvider)v9));
    Object v18 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = "Q)";
    Object v1 = "nVumber";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v4 = false;
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v0),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.util.Annotations)v6),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = "nVumber";
    Object v10 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v9));
    Object v11 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v8),((com.fasterxml.jackson.databind.PropertyName)v10));
    Object v12 = "]";
    Object v13 = "Illegal character (code 0x";
    Object v14 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v11).unwrappingWriter(((com.fasterxml.jackson.databind.util.NameTransformer)v14));
    Object v16 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v11).getSerializer();
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v1 = "nVumber";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0),((com.fasterxml.jackson.databind.PropertyName)v2));
    Object v4 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v3).hasSerializer();
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v1 = "nVumber";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0),((com.fasterxml.jackson.databind.PropertyName)v2));
    Object v4 = "]";
    Object v5 = "Illegal character (code 0x";
    Object v6 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v3).rename(((com.fasterxml.jackson.databind.util.NameTransformer)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v1 = "nVumber";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0),((com.fasterxml.jackson.databind.PropertyName)v2));
    Object v4 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v3).getGenericPropertyType();
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v1 = "nVumber";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = ((com.fasterxml.jackson.databind.PropertyName)v2).hashCode();
    Object v4 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).wouldConflictWithName(((com.fasterxml.jackson.databind.PropertyName)v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v1 = "FAIL_ON_UNRESOLVED_OBJECT_IDS";
    Object v2 = com.fasterxml.jackson.databind.DeserializationFeature.valueOf(((java.lang.String)v1));
    Object v3 = "FAIL_ON_UNRESOLVED_OBJECT_IDS";
    Object v4 = com.fasterxml.jackson.databind.DeserializationFeature.valueOf(((java.lang.String)v3));
    Object v5 = java.util.EnumSet.of(((java.lang.Enum)v2),((java.lang.Enum)v4));
    Object v6 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.std.RawSerializer(((java.lang.Class)v6));
    ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).assignSerializer(((com.fasterxml.jackson.databind.JsonSerializer)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v3 = new com.fasterxml.jackson.databind.node.POJONode(((java.lang.Object)v2));
    Object v4 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v5 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v3),((com.fasterxml.jackson.core.ObjectCodec)v4));
    Object v6 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v8 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v9 = new com.fasterxml.jackson.databind.node.POJONode(((java.lang.Object)v8));
    Object v10 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v11 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v9),((com.fasterxml.jackson.core.ObjectCodec)v10));
    Object v12 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v11));
    ((com.fasterxml.jackson.databind.SerializerProvider)v7).defaultSerializeNull(((com.fasterxml.jackson.core.JsonGenerator)v12));
    Object v13 = null;
    ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).serializeAsPlaceholder(((java.lang.Object)v1),((com.fasterxml.jackson.core.JsonGenerator)v6),((com.fasterxml.jackson.databind.SerializerProvider)v7));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v1 = "nVumber";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0),((com.fasterxml.jackson.databind.PropertyName)v2));
    Object v4 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v3).getGenericPropertyType();
    Object v5 = "FAIL_ON_UNRESOLVED_OBJECT_IDS";
    Object v6 = com.fasterxml.jackson.databind.DeserializationFeature.valueOf(((java.lang.String)v5));
    Object v7 = "FAIL_ON_UNRESOLVED_OBJECT_IDS";
    Object v8 = com.fasterxml.jackson.databind.DeserializationFeature.valueOf(((java.lang.String)v7));
    Object v9 = java.util.EnumSet.of(((java.lang.Enum)v6),((java.lang.Enum)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v9));
    Object v11 = new com.fasterxml.jackson.databind.ser.std.RawSerializer(((java.lang.Class)v10));
    ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v3).assignSerializer(((com.fasterxml.jackson.databind.JsonSerializer)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v1 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v2 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).get(((java.lang.Object)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = "Q)";
    Object v1 = "nVumber";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v4 = false;
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v0),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.util.Annotations)v6),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = "nVumber";
    Object v10 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v9));
    Object v11 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v8),((com.fasterxml.jackson.databind.PropertyName)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v11).readResolve();
    Object v13 = "Q)";
    Object v14 = "nVumber";
    Object v15 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v14));
    Object v16 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v17 = false;
    Object v18 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.PropertyName)v15),((com.fasterxml.jackson.databind.AnnotationIntrospector)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v13),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v18),((com.fasterxml.jackson.databind.util.Annotations)v19),((com.fasterxml.jackson.databind.JavaType)v20));
    Object v22 = "nVumber";
    Object v23 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v22));
    Object v24 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v21),((com.fasterxml.jackson.databind.PropertyName)v23));
    Object v25 = "#";
    Object v26 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v25));
    Object v27 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v24),((com.fasterxml.jackson.core.io.SerializedString)v26));
    Object v28 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v12).get(((java.lang.Object)v27));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v1 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor.Base();
    Object v2 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v3 = new com.fasterxml.jackson.databind.node.POJONode(((java.lang.Object)v2));
    Object v4 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v5 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v3),((com.fasterxml.jackson.core.ObjectCodec)v4));
    Object v6 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v8 = "FAIL_ON_UNRESOLVED_OBJECT_IDS";
    Object v9 = com.fasterxml.jackson.databind.DeserializationFeature.valueOf(((java.lang.String)v8));
    Object v10 = "FAIL_ON_UNRESOLVED_OBJECT_IDS";
    Object v11 = com.fasterxml.jackson.databind.DeserializationFeature.valueOf(((java.lang.String)v10));
    Object v12 = java.util.EnumSet.of(((java.lang.Enum)v9),((java.lang.Enum)v11));
    Object v13 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v12));
    Object v14 = new com.fasterxml.jackson.databind.ser.std.RawSerializer(((java.lang.Class)v13));
    Object v15 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0)._handleSelfReference(((java.lang.Object)v1),((com.fasterxml.jackson.core.JsonGenerator)v6),((com.fasterxml.jackson.databind.SerializerProvider)v7),((com.fasterxml.jackson.databind.JsonSerializer)v14));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v1 = "nVumber";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0),((com.fasterxml.jackson.databind.PropertyName)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v6 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.type.TypeFactory)v5));
    Object v7 = "Q)";
    Object v8 = "nVumber";
    Object v9 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v8));
    Object v10 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v11 = false;
    Object v12 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.PropertyName)v9),((com.fasterxml.jackson.databind.AnnotationIntrospector)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v7),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v12),((com.fasterxml.jackson.databind.util.Annotations)v13),((com.fasterxml.jackson.databind.JavaType)v14));
    Object v16 = ")";
    Object v17 = new com.fasterxml.jackson.databind.jsontype.impl.AsExistingPropertyTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v6),((com.fasterxml.jackson.databind.BeanProperty)v15),((java.lang.String)v16));
    ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v3).assignTypeSerializer(((com.fasterxml.jackson.databind.jsontype.TypeSerializer)v17));
    Object v18 = null;
    Object v19 = "nVumber";
    Object v20 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v19));
    Object v21 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v3).wouldConflictWithName(((com.fasterxml.jackson.databind.PropertyName)v20));
    org.junit.Assert.assertEquals((Object)(true), v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = "Q)";
    Object v1 = "nVumber";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v4 = false;
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v0),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.util.Annotations)v6),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = "nVumber";
    Object v10 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v9));
    Object v11 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v8),((com.fasterxml.jackson.databind.PropertyName)v10));
    Object v12 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v11).getGenericPropertyType();
    Object v13 = "]";
    Object v14 = "Illegal character (code 0x";
    Object v15 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v11).rename(((com.fasterxml.jackson.databind.util.NameTransformer)v15));
    Object v17 = "nVumber";
    Object v18 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v17));
    Object v19 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v16).wouldConflictWithName(((com.fasterxml.jackson.databind.PropertyName)v18));
    org.junit.Assert.assertEquals((Object)(false), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v1 = "]";
    Object v2 = "Illegal character (code 0x";
    Object v3 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = new com.fasterxml.jackson.databind.node.POJONode(((java.lang.Object)v4));
    Object v6 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v7 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v5),((com.fasterxml.jackson.core.ObjectCodec)v6));
    Object v8 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v7));
    Object v9 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v10 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v9));
    Object v11 = "FAIL_ON_UNRESOLVED_OBJECT_IDS";
    Object v12 = com.fasterxml.jackson.databind.DeserializationFeature.valueOf(((java.lang.String)v11));
    Object v13 = "FAIL_ON_UNRESOLVED_OBJECT_IDS";
    Object v14 = com.fasterxml.jackson.databind.DeserializationFeature.valueOf(((java.lang.String)v13));
    Object v15 = java.util.EnumSet.of(((java.lang.Enum)v12),((java.lang.Enum)v14));
    Object v16 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v15));
    Object v17 = new com.fasterxml.jackson.databind.ser.std.RawSerializer(((java.lang.Class)v16));
    ((com.fasterxml.jackson.databind.SerializerProvider)v10).setDefaultKeySerializer(((com.fasterxml.jackson.databind.JsonSerializer)v17));
    Object v18 = null;
    ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).serializeAsElement(((java.lang.Object)v3),((com.fasterxml.jackson.core.JsonGenerator)v8),((com.fasterxml.jackson.databind.SerializerProvider)v10));
    Object v19 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v1 = "nVumber";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0),((com.fasterxml.jackson.databind.PropertyName)v2));
    Object v4 = "FAIL_ON_UNRESOLVED_OBJECT_IDS";
    Object v5 = com.fasterxml.jackson.databind.DeserializationFeature.valueOf(((java.lang.String)v4));
    Object v6 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v3).get(((java.lang.Object)v5));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = "Q)";
    Object v1 = "nVumber";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v4 = false;
    Object v5 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.PropertyName)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter.construct(((java.lang.String)v0),((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v5),((com.fasterxml.jackson.databind.util.Annotations)v6),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = "nVumber";
    Object v10 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v9));
    Object v11 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v8),((com.fasterxml.jackson.databind.PropertyName)v10));
    Object v12 = "#";
    Object v13 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v12));
    Object v14 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v11),((com.fasterxml.jackson.core.io.SerializedString)v13));
    Object v15 = "#";
    Object v16 = new com.fasterxml.jackson.core.io.SerializedString(((java.lang.String)v15));
    Object v17 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v14).removeInternalSetting(((java.lang.Object)v16));
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v1 = "nVumber";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0),((com.fasterxml.jackson.databind.PropertyName)v2));
    Object v4 = "]";
    Object v5 = "Illegal character (code 0x";
    Object v6 = com.fasterxml.jackson.databind.util.NameTransformer.simpleTransformer(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v3).rename(((com.fasterxml.jackson.databind.util.NameTransformer)v6));
    Object v8 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v7).getRawSerializationType();
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v1 = "nVumber";
    Object v2 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0),((com.fasterxml.jackson.databind.PropertyName)v2));
    Object v4 = "FAIL_ON_UNRESOLVED_OBJECT_IDS";
    Object v5 = com.fasterxml.jackson.databind.DeserializationFeature.valueOf(((java.lang.String)v4));
    Object v6 = "FAIL_ON_UNRESOLVED_OBJECT_IDS";
    Object v7 = com.fasterxml.jackson.databind.DeserializationFeature.valueOf(((java.lang.String)v6));
    Object v8 = java.util.EnumSet.of(((java.lang.Enum)v5),((java.lang.Enum)v7));
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v8));
    Object v10 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v3).getAnnotation(((java.lang.Class)v9));
    Object v11 = "FAIL_ON_UNRESOLVED_OBJECT_IDS";
    Object v12 = com.fasterxml.jackson.databind.DeserializationFeature.valueOf(((java.lang.String)v11));
    Object v13 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v14 = new com.fasterxml.jackson.databind.node.POJONode(((java.lang.Object)v13));
    Object v15 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v16 = new com.fasterxml.jackson.databind.node.TreeTraversingParser(((com.fasterxml.jackson.databind.JsonNode)v14),((com.fasterxml.jackson.core.ObjectCodec)v15));
    Object v17 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.JsonParser)v16));
    Object v18 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v19 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v18));
    ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v3).serializeAsPlaceholder(((java.lang.Object)v12),((com.fasterxml.jackson.core.JsonGenerator)v17),((com.fasterxml.jackson.databind.SerializerProvider)v19));
    Object v20 = null;
    org.junit.Assert.assertNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v1 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).getRawSerializationType();
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v1 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).toString();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
    Object v1 = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter)v0).readResolve();
    org.junit.Assert.assertNotNull(v1);
  }
}
