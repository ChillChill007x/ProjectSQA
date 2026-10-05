package com.fasterxml.jackson.databind;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v0));
    Object v2 = 1;
    Object v3 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v2).intValue()));
    Object v4 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = ((com.fasterxml.jackson.databind.SerializerProvider)v1).getUnknownTypeSerializer(((java.lang.Class)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v0));
    Object v2 = 1;
    Object v3 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v2).intValue()));
    Object v4 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v5 = ((com.fasterxml.jackson.databind.SerializerProvider)v1).findValueSerializer(((com.fasterxml.jackson.databind.JavaType)v3),((com.fasterxml.jackson.databind.BeanProperty)v4));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v0));
    Object v2 = 1;
    Object v3 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v2).intValue()));
    Object v4 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v6 = ((com.fasterxml.jackson.databind.BeanProperty)v5).isRequired();
    Object v7 = ((com.fasterxml.jackson.databind.SerializerProvider)v1).findPrimaryPropertySerializer(((java.lang.Class)v4),((com.fasterxml.jackson.databind.BeanProperty)v5));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v2));
    Object v4 = 1;
    Object v5 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v4).intValue()));
    Object v6 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v5));
    Object v7 = ((com.fasterxml.jackson.databind.SerializerProvider)v3).getUnknownTypeSerializer(((java.lang.Class)v6));
    Object v8 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v9 = ((com.fasterxml.jackson.databind.SerializerProvider)v1).handlePrimaryContextualization(((com.fasterxml.jackson.databind.JsonSerializer)v7),((com.fasterxml.jackson.databind.BeanProperty)v8));
    Object v10 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v11 = ((com.fasterxml.jackson.databind.SerializerProvider)v1).includeFilterSuppressNulls(((java.lang.Object)v10));
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v0));
    Object v2 = 1;
    Object v3 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v2).intValue()));
    Object v4 = ((com.fasterxml.jackson.databind.JavaType)v3).getSuperClass();
    Object v5 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v6 = ((com.fasterxml.jackson.databind.SerializerProvider)v1).findValueSerializer(((com.fasterxml.jackson.databind.JavaType)v3),((com.fasterxml.jackson.databind.BeanProperty)v5));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v0));
    Object v2 = ((com.fasterxml.jackson.databind.SerializerProvider)v1).getConfig();
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v1));
    Object v3 = 1;
    Object v4 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v3).intValue()));
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v4));
    Object v6 = ((com.fasterxml.jackson.databind.SerializerProvider)v2).getUnknownTypeSerializer(((java.lang.Class)v5));
    Object v7 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v7));
    Object v9 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base(((com.fasterxml.jackson.databind.SerializerProvider)v8));
    Object v10 = 1;
    Object v11 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v10).intValue()));
    ((com.fasterxml.jackson.databind.JsonSerializer)v6).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v9),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v12 = null;
    Object v13 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v14 = ((com.fasterxml.jackson.databind.SerializerProvider)v0).handlePrimaryContextualization(((com.fasterxml.jackson.databind.JsonSerializer)v6),((com.fasterxml.jackson.databind.BeanProperty)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v0));
    Object v2 = ((com.fasterxml.jackson.databind.DatabindContext)v1).getActiveView();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v4 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v5 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v3),((com.fasterxml.jackson.databind.type.TypeBindings)v4));
    Object v6 = 1;
    Object v7 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v6).intValue()));
    Object v8 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = true;
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v13 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v5),((java.lang.reflect.Constructor)v10),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v11),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v12));
    Object v14 = com.fasterxml.jackson.databind.cfg.ContextAttributes.Impl.getEmpty();
    Object v15 = ((com.fasterxml.jackson.databind.DatabindContext)v1).converterInstance(((com.fasterxml.jackson.databind.introspect.Annotated)v13),((java.lang.Object)v14));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v2));
    Object v4 = 1;
    Object v5 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v4).intValue()));
    Object v6 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v5));
    Object v7 = ((com.fasterxml.jackson.databind.SerializerProvider)v3).getUnknownTypeSerializer(((java.lang.Class)v6));
    ((com.fasterxml.jackson.databind.SerializerProvider)v1).setNullKeySerializer(((com.fasterxml.jackson.databind.JsonSerializer)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v4 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v3));
    Object v5 = 1;
    Object v6 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v5).intValue()));
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v6));
    Object v8 = true;
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v11 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v4),((java.lang.reflect.Constructor)v9),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v10),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v14 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v13).toString();
    Object v15 = ((com.fasterxml.jackson.databind.DatabindContext)v1).objectIdGeneratorInstance(((com.fasterxml.jackson.databind.introspect.Annotated)v12),((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v13));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v0));
    Object v2 = 1;
    Object v3 = 3;
    Object v4 = 0;
    Object v5 = 1;
    Object v6 = -28;
    Object v7 = new java.util.Date((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = ((java.util.Date)v7).getDate();
    Object v9 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v10 = true;
    Object v11 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v9),(((java.lang.Boolean)v10).booleanValue()));
    ((com.fasterxml.jackson.databind.SerializerProvider)v1).defaultSerializeDateValue(((java.util.Date)v7),((com.fasterxml.jackson.core.JsonGenerator)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v0));
    Object v2 = 48L;
    Object v3 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v4 = true;
    Object v5 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v3),(((java.lang.Boolean)v4).booleanValue()));
    ((com.fasterxml.jackson.databind.SerializerProvider)v1).defaultSerializeDateValue((((java.lang.Long)v2).longValue()),((com.fasterxml.jackson.core.JsonGenerator)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v2));
    Object v4 = 1;
    Object v5 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v4).intValue()));
    Object v6 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v5));
    Object v7 = ((com.fasterxml.jackson.databind.SerializerProvider)v3).getUnknownTypeSerializer(((java.lang.Class)v6));
    Object v8 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v9 = ((com.fasterxml.jackson.databind.SerializerProvider)v1).handleSecondaryContextualization(((com.fasterxml.jackson.databind.JsonSerializer)v7),((com.fasterxml.jackson.databind.BeanProperty)v8));
    Object v10 = ((com.fasterxml.jackson.databind.SerializerProvider)v1)._dateFormat();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v0));
    Object v2 = 1;
    Object v3 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v2).intValue()));
    Object v4 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v6 = ((com.fasterxml.jackson.databind.BeanProperty)v5).getFullName();
    Object v7 = ((com.fasterxml.jackson.databind.SerializerProvider)v1).findPrimaryPropertySerializer(((java.lang.Class)v4),((com.fasterxml.jackson.databind.BeanProperty)v5));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v2));
    Object v4 = 1;
    Object v5 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v4).intValue()));
    Object v6 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v5));
    Object v7 = ((com.fasterxml.jackson.databind.SerializerProvider)v3).getUnknownTypeSerializer(((java.lang.Class)v6));
    Object v8 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v9 = ((com.fasterxml.jackson.databind.SerializerProvider)v1).handlePrimaryContextualization(((com.fasterxml.jackson.databind.JsonSerializer)v7),((com.fasterxml.jackson.databind.BeanProperty)v8));
    Object v10 = ((com.fasterxml.jackson.databind.SerializerProvider)v1).getTypeFactory();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v4 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v3));
    Object v5 = 1;
    Object v6 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v5).intValue()));
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v6));
    Object v8 = true;
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v11 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v4),((java.lang.reflect.Constructor)v9),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v10),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v14 = ((com.fasterxml.jackson.databind.DatabindContext)v1).objectIdResolverInstance(((com.fasterxml.jackson.databind.introspect.Annotated)v12),((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v13));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v0));
    Object v2 = 1;
    Object v3 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v2).intValue()));
    Object v4 = ((com.fasterxml.jackson.databind.JavaType)v3).getGenericSignature();
    Object v5 = 1;
    Object v6 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v5).intValue()));
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v6));
    Object v8 = ((com.fasterxml.jackson.databind.DatabindContext)v1).constructSpecializedType(((com.fasterxml.jackson.databind.JavaType)v3),((java.lang.Class)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v0));
    Object v2 = 1;
    Object v3 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v2).intValue()));
    Object v4 = "STRI";
    Object v5 = ((com.fasterxml.jackson.databind.DatabindContext)v1).resolveSubType(((com.fasterxml.jackson.databind.JavaType)v3),((java.lang.String)v4));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.exc.InvalidTypeIdException");
    } catch (com.fasterxml.jackson.databind.exc.InvalidTypeIdException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v3 = true;
    Object v4 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v2),(((java.lang.Boolean)v3).booleanValue()));
    ((com.fasterxml.jackson.databind.SerializerProvider)v1).defaultSerializeNull(((com.fasterxml.jackson.core.JsonGenerator)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v0));
    Object v2 = 1;
    Object v3 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v2).intValue()));
    Object v4 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = ((java.lang.Class)v4).getEnumConstants();
    Object v6 = true;
    Object v7 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v8 = ((com.fasterxml.jackson.databind.SerializerProvider)v1).findTypedValueSerializer(((java.lang.Class)v4),(((java.lang.Boolean)v6).booleanValue()),((com.fasterxml.jackson.databind.BeanProperty)v7));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v0));
    Object v2 = 1;
    Object v3 = 3;
    Object v4 = 0;
    Object v5 = 1;
    Object v6 = -28;
    Object v7 = new java.util.Date((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v9 = true;
    Object v10 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v8),(((java.lang.Boolean)v9).booleanValue()));
    ((com.fasterxml.jackson.databind.SerializerProvider)v1).defaultSerializeDateKey(((java.util.Date)v7),((com.fasterxml.jackson.core.JsonGenerator)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v2));
    Object v4 = 1;
    Object v5 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v4).intValue()));
    Object v6 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v5));
    Object v7 = ((com.fasterxml.jackson.databind.SerializerProvider)v3).getUnknownTypeSerializer(((java.lang.Class)v6));
    Object v8 = ((com.fasterxml.jackson.databind.SerializerProvider)v1).isUnknownTypeSerializer(((com.fasterxml.jackson.databind.JsonSerializer)v7));
    org.junit.Assert.assertEquals((Object)(true), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v1));
    Object v3 = 1;
    Object v4 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v3).intValue()));
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v4));
    Object v6 = ((com.fasterxml.jackson.databind.SerializerProvider)v2).getUnknownTypeSerializer(((java.lang.Class)v5));
    ((com.fasterxml.jackson.databind.SerializerProvider)v0).setDefaultKeySerializer(((com.fasterxml.jackson.databind.JsonSerializer)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v2));
    Object v4 = 1;
    Object v5 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v4).intValue()));
    Object v6 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v5));
    Object v7 = ((com.fasterxml.jackson.databind.SerializerProvider)v3).getUnknownTypeSerializer(((java.lang.Class)v6));
    ((com.fasterxml.jackson.databind.SerializerProvider)v1).setNullValueSerializer(((com.fasterxml.jackson.databind.JsonSerializer)v7));
    Object v8 = null;
    Object v9 = -46L;
    Object v10 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v11 = true;
    Object v12 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v10),(((java.lang.Boolean)v11).booleanValue()));
    ((com.fasterxml.jackson.databind.SerializerProvider)v1).defaultSerializeDateValue((((java.lang.Long)v9).longValue()),((com.fasterxml.jackson.core.JsonGenerator)v12));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v0));
    Object v2 = 1;
    Object v3 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v2).intValue()));
    Object v4 = 1;
    Object v5 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v4).intValue()));
    Object v6 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v5));
    Object v7 = ((com.fasterxml.jackson.databind.DatabindContext)v1).constructSpecializedType(((com.fasterxml.jackson.databind.JavaType)v3),((java.lang.Class)v6));
    Object v8 = 0L;
    Object v9 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v10 = true;
    Object v11 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v9),(((java.lang.Boolean)v10).booleanValue()));
    ((com.fasterxml.jackson.databind.SerializerProvider)v1).defaultSerializeDateValue((((java.lang.Long)v8).longValue()),((com.fasterxml.jackson.core.JsonGenerator)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v0));
    Object v2 = 1;
    Object v3 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v2).intValue()));
    Object v4 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = ((java.lang.reflect.Type)v4).getTypeName();
    Object v6 = ((com.fasterxml.jackson.databind.DatabindContext)v1).constructType(((java.lang.reflect.Type)v4));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v2));
    Object v4 = 1;
    Object v5 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v4).intValue()));
    Object v6 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v5));
    Object v7 = ((com.fasterxml.jackson.databind.SerializerProvider)v3).getUnknownTypeSerializer(((java.lang.Class)v6));
    Object v8 = ((com.fasterxml.jackson.databind.SerializerProvider)v1).isUnknownTypeSerializer(((com.fasterxml.jackson.databind.JsonSerializer)v7));
    Object v9 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v10 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v9));
    Object v11 = 1;
    Object v12 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v11).intValue()));
    Object v13 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v12));
    Object v14 = ((com.fasterxml.jackson.databind.SerializerProvider)v10).getUnknownTypeSerializer(((java.lang.Class)v13));
    ((com.fasterxml.jackson.databind.SerializerProvider)v1).setDefaultKeySerializer(((com.fasterxml.jackson.databind.JsonSerializer)v14));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v3));
    Object v5 = 1;
    Object v6 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v5).intValue()));
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v6));
    Object v8 = ((com.fasterxml.jackson.databind.SerializerProvider)v4).getUnknownTypeSerializer(((java.lang.Class)v7));
    Object v9 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v10 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v9));
    Object v11 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base(((com.fasterxml.jackson.databind.SerializerProvider)v10));
    Object v12 = 1;
    Object v13 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v12).intValue()));
    ((com.fasterxml.jackson.databind.JsonSerializer)v8).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v11),((com.fasterxml.jackson.databind.JavaType)v13));
    Object v14 = null;
    Object v15 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v16 = ((com.fasterxml.jackson.databind.SerializerProvider)v2).handlePrimaryContextualization(((com.fasterxml.jackson.databind.JsonSerializer)v8),((com.fasterxml.jackson.databind.BeanProperty)v15));
    ((com.fasterxml.jackson.databind.SerializerProvider)v1).setDefaultKeySerializer(((com.fasterxml.jackson.databind.JsonSerializer)v16));
    Object v17 = null;
    Object v18 = ((com.fasterxml.jackson.databind.SerializerProvider)v1).getTimeZone();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v0));
    Object v2 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v3 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v4 = true;
    Object v5 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    ((com.fasterxml.jackson.core.JsonGenerator)v5).writeEmbeddedObject(((java.lang.Object)v6));
    Object v7 = null;
    ((com.fasterxml.jackson.databind.SerializerProvider)v1).defaultSerializeValue(((java.lang.Object)v2),((com.fasterxml.jackson.core.JsonGenerator)v5));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = null;
    Object v2 = "";
    Object v3 = new java.lang.Object[]{null,null,null};
    Object v4 = ((com.fasterxml.jackson.databind.SerializerProvider)v0).reportBadTypeDefinition(((com.fasterxml.jackson.databind.BeanDescription)v1),((java.lang.String)v2),((java.lang.Object[])v3));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.exc.InvalidDefinitionException");
    } catch (com.fasterxml.jackson.databind.exc.InvalidDefinitionException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v0));
    Object v2 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v3 = ((com.fasterxml.jackson.databind.SerializerProvider)v1).includeFilterSuppressNulls(((java.lang.Object)v2));
    Object v4 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v5 = 1;
    Object v6 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v5).intValue()));
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v6));
    Object v8 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v7));
    Object v9 = ((com.fasterxml.jackson.databind.SerializerProvider)v1).findObjectId(((java.lang.Object)v4),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v8));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = 1;
    Object v4 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v3).intValue()));
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v5));
    Object v7 = ((com.fasterxml.jackson.databind.SerializerProvider)v1).findObjectId(((java.lang.Object)v2),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v6));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v4 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v3));
    Object v5 = 1;
    Object v6 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v5).intValue()));
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v6));
    Object v8 = true;
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v11 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v4),((java.lang.reflect.Constructor)v9),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v10),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v14 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v13).toString();
    Object v15 = ((com.fasterxml.jackson.databind.DatabindContext)v1).objectIdResolverInstance(((com.fasterxml.jackson.databind.introspect.Annotated)v12),((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v13));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v0));
    Object v2 = -37L;
    Object v3 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v4 = true;
    Object v5 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v3),(((java.lang.Boolean)v4).booleanValue()));
    ((com.fasterxml.jackson.databind.SerializerProvider)v1).defaultSerializeDateValue((((java.lang.Long)v2).longValue()),((com.fasterxml.jackson.core.JsonGenerator)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v0));
    Object v2 = "Could not find constructor ywith ";
    Object v3 = new java.lang.Object[]{null,null,null};
    ((com.fasterxml.jackson.databind.SerializerProvider)v1).reportMappingProblem(((java.lang.String)v2),((java.lang.Object[])v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.JsonMappingException");
    } catch (com.fasterxml.jackson.databind.JsonMappingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v3));
    Object v5 = 1;
    Object v6 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v5).intValue()));
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v6));
    Object v8 = ((com.fasterxml.jackson.databind.SerializerProvider)v4).getUnknownTypeSerializer(((java.lang.Class)v7));
    Object v9 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v10 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v9));
    Object v11 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base(((com.fasterxml.jackson.databind.SerializerProvider)v10));
    Object v12 = 1;
    Object v13 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v12).intValue()));
    ((com.fasterxml.jackson.databind.JsonSerializer)v8).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v11),((com.fasterxml.jackson.databind.JavaType)v13));
    Object v14 = null;
    Object v15 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v16 = ((com.fasterxml.jackson.databind.SerializerProvider)v2).handlePrimaryContextualization(((com.fasterxml.jackson.databind.JsonSerializer)v8),((com.fasterxml.jackson.databind.BeanProperty)v15));
    Object v17 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v18 = ((com.fasterxml.jackson.databind.SerializerProvider)v1).handleSecondaryContextualization(((com.fasterxml.jackson.databind.JsonSerializer)v16),((com.fasterxml.jackson.databind.BeanProperty)v17));
    Object v19 = 1L;
    Object v20 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v21 = true;
    Object v22 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v20),(((java.lang.Boolean)v21).booleanValue()));
    ((com.fasterxml.jackson.databind.SerializerProvider)v1).defaultSerializeDateKey((((java.lang.Long)v19).longValue()),((com.fasterxml.jackson.core.JsonGenerator)v22));
    Object v23 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v3 = ((com.fasterxml.jackson.databind.SerializerProvider)v1).includeFilterSuppressNulls(((java.lang.Object)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v5 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v6 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v4),((com.fasterxml.jackson.databind.type.TypeBindings)v5));
    Object v7 = 1;
    Object v8 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v7).intValue()));
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v8));
    Object v10 = true;
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v13 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v14 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v6),((java.lang.reflect.Constructor)v11),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v12),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v13));
    Object v15 = ((com.fasterxml.jackson.databind.introspect.Annotated)v14).isPublic();
    Object v16 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v17 = ((com.fasterxml.jackson.databind.SerializerProvider)v1).serializerInstance(((com.fasterxml.jackson.databind.introspect.Annotated)v14),((java.lang.Object)v16));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.exc.InvalidDefinitionException");
    } catch (com.fasterxml.jackson.databind.exc.InvalidDefinitionException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v2));
    Object v4 = 1;
    Object v5 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v4).intValue()));
    Object v6 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v5));
    Object v7 = ((com.fasterxml.jackson.databind.SerializerProvider)v3).getUnknownTypeSerializer(((java.lang.Class)v6));
    Object v8 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v9 = ((com.fasterxml.jackson.databind.SerializerProvider)v1).handlePrimaryContextualization(((com.fasterxml.jackson.databind.JsonSerializer)v7),((com.fasterxml.jackson.databind.BeanProperty)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v0));
    Object v2 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v3 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v4 = true;
    Object v5 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v3),(((java.lang.Boolean)v4).booleanValue()));
    ((com.fasterxml.jackson.databind.SerializerProvider)v1).defaultSerializeValue(((java.lang.Object)v2),((com.fasterxml.jackson.core.JsonGenerator)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v0));
    Object v2 = 1;
    Object v3 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v2).intValue()));
    Object v4 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = ((com.fasterxml.jackson.databind.SerializerProvider)v1).findValueSerializer(((java.lang.Class)v4));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v0));
    Object v2 = 1;
    Object v3 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v2).intValue()));
    Object v4 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = ((com.fasterxml.jackson.databind.SerializerProvider)v1).getUnknownTypeSerializer(((java.lang.Class)v4));
    Object v6 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v7 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v7));
    Object v9 = 1;
    Object v10 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = ((com.fasterxml.jackson.databind.SerializerProvider)v8).getUnknownTypeSerializer(((java.lang.Class)v11));
    Object v13 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v14 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v13));
    Object v15 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base(((com.fasterxml.jackson.databind.SerializerProvider)v14));
    Object v16 = 1;
    Object v17 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v16).intValue()));
    ((com.fasterxml.jackson.databind.JsonSerializer)v12).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v15),((com.fasterxml.jackson.databind.JavaType)v17));
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v20 = ((com.fasterxml.jackson.databind.SerializerProvider)v6).handlePrimaryContextualization(((com.fasterxml.jackson.databind.JsonSerializer)v12),((com.fasterxml.jackson.databind.BeanProperty)v19));
    Object v21 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v22 = ((com.fasterxml.jackson.databind.BeanProperty)v21).isRequired();
    Object v23 = ((com.fasterxml.jackson.databind.SerializerProvider)v1).handleSecondaryContextualization(((com.fasterxml.jackson.databind.JsonSerializer)v20),((com.fasterxml.jackson.databind.BeanProperty)v21));
    org.junit.Assert.assertNotNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v0));
    Object v2 = 1;
    Object v3 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v2).intValue()));
    Object v4 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v6 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor.Base();
    Object v7 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v7));
    ((com.fasterxml.jackson.databind.BeanProperty)v5).depositSchemaProperty(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor)v6),((com.fasterxml.jackson.databind.SerializerProvider)v8));
    Object v9 = null;
    Object v10 = ((com.fasterxml.jackson.databind.SerializerProvider)v1).findValueSerializer(((java.lang.Class)v4),((com.fasterxml.jackson.databind.BeanProperty)v5));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v2));
    Object v4 = 1;
    Object v5 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v4).intValue()));
    Object v6 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v5));
    Object v7 = ((com.fasterxml.jackson.databind.SerializerProvider)v3).getUnknownTypeSerializer(((java.lang.Class)v6));
    Object v8 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v9 = ((com.fasterxml.jackson.databind.SerializerProvider)v1).handlePrimaryContextualization(((com.fasterxml.jackson.databind.JsonSerializer)v7),((com.fasterxml.jackson.databind.BeanProperty)v8));
    Object v10 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v11 = ((com.fasterxml.jackson.databind.SerializerProvider)v1).includeFilterSuppressNulls(((java.lang.Object)v10));
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v3));
    Object v5 = 1;
    Object v6 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v5).intValue()));
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v6));
    Object v8 = ((com.fasterxml.jackson.databind.SerializerProvider)v4).getUnknownTypeSerializer(((java.lang.Class)v7));
    Object v9 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v10 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v9));
    Object v11 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base(((com.fasterxml.jackson.databind.SerializerProvider)v10));
    Object v12 = 1;
    Object v13 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v12).intValue()));
    ((com.fasterxml.jackson.databind.JsonSerializer)v8).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v11),((com.fasterxml.jackson.databind.JavaType)v13));
    Object v14 = null;
    Object v15 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v16 = ((com.fasterxml.jackson.databind.SerializerProvider)v2).handlePrimaryContextualization(((com.fasterxml.jackson.databind.JsonSerializer)v8),((com.fasterxml.jackson.databind.BeanProperty)v15));
    Object v17 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v18 = ((com.fasterxml.jackson.databind.BeanProperty)v17).getMetadata();
    Object v19 = ((com.fasterxml.jackson.databind.SerializerProvider)v1).handlePrimaryContextualization(((com.fasterxml.jackson.databind.JsonSerializer)v16),((com.fasterxml.jackson.databind.BeanProperty)v17));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v0));
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v4 = null;
    Object v5 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v6 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v7 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v2),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v3),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v4),((com.fasterxml.jackson.databind.util.RootNameLookup)v5),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v6));
    Object v8 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v9 = true;
    Object v10 = "(";
    Object v11 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v10));
    Object v12 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v7),((com.fasterxml.jackson.databind.AnnotationIntrospector)v8),(((java.lang.Boolean)v9).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v11));
    Object v13 = 1;
    Object v14 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v13).intValue()));
    Object v15 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v14));
    Object v16 = ((com.fasterxml.jackson.databind.SerializerProvider)v1).includeFilterInstance(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v12),((java.lang.Class)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v3));
    Object v5 = 1;
    Object v6 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v5).intValue()));
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v6));
    Object v8 = ((com.fasterxml.jackson.databind.SerializerProvider)v4).getUnknownTypeSerializer(((java.lang.Class)v7));
    Object v9 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v10 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v9));
    Object v11 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base(((com.fasterxml.jackson.databind.SerializerProvider)v10));
    Object v12 = 1;
    Object v13 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v12).intValue()));
    ((com.fasterxml.jackson.databind.JsonSerializer)v8).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v11),((com.fasterxml.jackson.databind.JavaType)v13));
    Object v14 = null;
    Object v15 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v16 = ((com.fasterxml.jackson.databind.SerializerProvider)v2).handlePrimaryContextualization(((com.fasterxml.jackson.databind.JsonSerializer)v8),((com.fasterxml.jackson.databind.BeanProperty)v15));
    ((com.fasterxml.jackson.databind.SerializerProvider)v1).setNullKeySerializer(((com.fasterxml.jackson.databind.JsonSerializer)v16));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v2));
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v6 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v5));
    Object v7 = 1;
    Object v8 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v7).intValue()));
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v8));
    Object v10 = ((com.fasterxml.jackson.databind.SerializerProvider)v6).getUnknownTypeSerializer(((java.lang.Class)v9));
    Object v11 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v12 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v11));
    Object v13 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base(((com.fasterxml.jackson.databind.SerializerProvider)v12));
    Object v14 = 1;
    Object v15 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v14).intValue()));
    ((com.fasterxml.jackson.databind.JsonSerializer)v10).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v13),((com.fasterxml.jackson.databind.JavaType)v15));
    Object v16 = null;
    Object v17 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v18 = ((com.fasterxml.jackson.databind.SerializerProvider)v4).handlePrimaryContextualization(((com.fasterxml.jackson.databind.JsonSerializer)v10),((com.fasterxml.jackson.databind.BeanProperty)v17));
    Object v19 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v20 = ((com.fasterxml.jackson.databind.BeanProperty)v19).getMetadata();
    Object v21 = ((com.fasterxml.jackson.databind.SerializerProvider)v3).handlePrimaryContextualization(((com.fasterxml.jackson.databind.JsonSerializer)v18),((com.fasterxml.jackson.databind.BeanProperty)v19));
    ((com.fasterxml.jackson.databind.SerializerProvider)v1).setNullKeySerializer(((com.fasterxml.jackson.databind.JsonSerializer)v21));
    Object v22 = null;
    Object v23 = 1;
    Object v24 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v23).intValue()));
    Object v25 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v24));
    Object v26 = true;
    Object v27 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v28 = ((com.fasterxml.jackson.databind.SerializerProvider)v1).findTypedValueSerializer(((java.lang.Class)v25),(((java.lang.Boolean)v26).booleanValue()),((com.fasterxml.jackson.databind.BeanProperty)v27));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v2));
    Object v4 = 1;
    Object v5 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v4).intValue()));
    Object v6 = ((com.fasterxml.jackson.databind.JavaType)v5).getGenericSignature();
    Object v7 = 1;
    Object v8 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v7).intValue()));
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v8));
    Object v10 = ((com.fasterxml.jackson.databind.DatabindContext)v3).constructSpecializedType(((com.fasterxml.jackson.databind.JavaType)v5),((java.lang.Class)v9));
    Object v11 = ((com.fasterxml.jackson.databind.SerializerProvider)v1)._createAndCacheUntypedSerializer(((com.fasterxml.jackson.databind.JavaType)v10));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v0));
    Object v2 = 0;
    Object v3 = ((com.fasterxml.jackson.databind.SerializerProvider)v1).hasSerializationFeatures((((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v0));
    Object v2 = ((com.fasterxml.jackson.databind.DatabindContext)v1).getActiveView();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v4 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v5 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v3),((com.fasterxml.jackson.databind.type.TypeBindings)v4));
    Object v6 = 1;
    Object v7 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v6).intValue()));
    Object v8 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = true;
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v13 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v5),((java.lang.reflect.Constructor)v10),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v11),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v12));
    Object v14 = 1;
    Object v15 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v14).intValue()));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v17 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.type.TypeFactory)v16));
    Object v18 = ((com.fasterxml.jackson.databind.DatabindContext)v1).converterInstance(((com.fasterxml.jackson.databind.introspect.Annotated)v13),((java.lang.Object)v17));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v0));
    Object v2 = ")";
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v4 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v5 = true;
    Object v6 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v4),(((java.lang.Boolean)v5).booleanValue()));
    ((com.fasterxml.jackson.databind.SerializerProvider)v1).defaultSerializeField(((java.lang.String)v2),((java.lang.Object)v3),((com.fasterxml.jackson.core.JsonGenerator)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v0));
    Object v2 = ((com.fasterxml.jackson.databind.DatabindContext)v1).getActiveView();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v4 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v5 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v3),((com.fasterxml.jackson.databind.type.TypeBindings)v4));
    Object v6 = 1;
    Object v7 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v6).intValue()));
    Object v8 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = true;
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v13 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v5),((java.lang.reflect.Constructor)v10),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v11),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v12));
    Object v14 = ((com.fasterxml.jackson.databind.introspect.Annotated)v13).hashCode();
    Object v15 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v16 = ((com.fasterxml.jackson.databind.DatabindContext)v1).objectIdResolverInstance(((com.fasterxml.jackson.databind.introspect.Annotated)v13),((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v0));
    Object v2 = 1;
    Object v3 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v2).intValue()));
    Object v4 = "|";
    Object v5 = ((com.fasterxml.jackson.databind.DatabindContext)v1).resolveSubType(((com.fasterxml.jackson.databind.JavaType)v3),((java.lang.String)v4));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.exc.InvalidTypeIdException");
    } catch (com.fasterxml.jackson.databind.exc.InvalidTypeIdException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v2));
    Object v4 = 1;
    Object v5 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v4).intValue()));
    Object v6 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v5));
    Object v7 = ((com.fasterxml.jackson.databind.SerializerProvider)v3).getUnknownTypeSerializer(((java.lang.Class)v6));
    ((com.fasterxml.jackson.databind.SerializerProvider)v1).setDefaultKeySerializer(((com.fasterxml.jackson.databind.JsonSerializer)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v2));
    Object v4 = 1;
    Object v5 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v4).intValue()));
    Object v6 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v5));
    Object v7 = ((com.fasterxml.jackson.databind.SerializerProvider)v3).getUnknownTypeSerializer(((java.lang.Class)v6));
    Object v8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v9 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v8));
    Object v10 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base(((com.fasterxml.jackson.databind.SerializerProvider)v9));
    Object v11 = 1;
    Object v12 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v11).intValue()));
    ((com.fasterxml.jackson.databind.JsonSerializer)v7).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v10),((com.fasterxml.jackson.databind.JavaType)v12));
    Object v13 = null;
    ((com.fasterxml.jackson.databind.SerializerProvider)v1).setNullKeySerializer(((com.fasterxml.jackson.databind.JsonSerializer)v7));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v0));
    Object v2 = 1;
    Object v3 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v2).intValue()));
    Object v4 = false;
    Object v5 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v6 = ((com.fasterxml.jackson.databind.SerializerProvider)v1).findTypedValueSerializer(((com.fasterxml.jackson.databind.JavaType)v3),(((java.lang.Boolean)v4).booleanValue()),((com.fasterxml.jackson.databind.BeanProperty)v5));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v3));
    Object v5 = 1;
    Object v6 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v5).intValue()));
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v6));
    Object v8 = ((com.fasterxml.jackson.databind.SerializerProvider)v4).getUnknownTypeSerializer(((java.lang.Class)v7));
    Object v9 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v10 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v9));
    Object v11 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base(((com.fasterxml.jackson.databind.SerializerProvider)v10));
    Object v12 = 1;
    Object v13 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v12).intValue()));
    ((com.fasterxml.jackson.databind.JsonSerializer)v8).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v11),((com.fasterxml.jackson.databind.JavaType)v13));
    Object v14 = null;
    Object v15 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v16 = ((com.fasterxml.jackson.databind.SerializerProvider)v2).handlePrimaryContextualization(((com.fasterxml.jackson.databind.JsonSerializer)v8),((com.fasterxml.jackson.databind.BeanProperty)v15));
    ((com.fasterxml.jackson.databind.SerializerProvider)v1).setNullValueSerializer(((com.fasterxml.jackson.databind.JsonSerializer)v16));
    Object v17 = null;
    Object v18 = com.fasterxml.jackson.annotation.JsonInclude.Value.empty();
    Object v19 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v20 = true;
    Object v21 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v19),(((java.lang.Boolean)v20).booleanValue()));
    ((com.fasterxml.jackson.core.JsonGenerator)v21).close();
    Object v22 = null;
    ((com.fasterxml.jackson.databind.SerializerProvider)v1).defaultSerializeValue(((java.lang.Object)v18),((com.fasterxml.jackson.core.JsonGenerator)v21));
    Object v23 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v2));
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v6 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v5));
    Object v7 = 1;
    Object v8 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v7).intValue()));
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v8));
    Object v10 = ((com.fasterxml.jackson.databind.SerializerProvider)v6).getUnknownTypeSerializer(((java.lang.Class)v9));
    Object v11 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v12 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v11));
    Object v13 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base(((com.fasterxml.jackson.databind.SerializerProvider)v12));
    Object v14 = 1;
    Object v15 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v14).intValue()));
    ((com.fasterxml.jackson.databind.JsonSerializer)v10).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v13),((com.fasterxml.jackson.databind.JavaType)v15));
    Object v16 = null;
    Object v17 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v18 = ((com.fasterxml.jackson.databind.SerializerProvider)v4).handlePrimaryContextualization(((com.fasterxml.jackson.databind.JsonSerializer)v10),((com.fasterxml.jackson.databind.BeanProperty)v17));
    Object v19 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v20 = ((com.fasterxml.jackson.databind.BeanProperty)v19).getMetadata();
    Object v21 = ((com.fasterxml.jackson.databind.SerializerProvider)v3).handlePrimaryContextualization(((com.fasterxml.jackson.databind.JsonSerializer)v18),((com.fasterxml.jackson.databind.BeanProperty)v19));
    Object v22 = ((com.fasterxml.jackson.databind.SerializerProvider)v1)._handleResolvable(((com.fasterxml.jackson.databind.JsonSerializer)v21));
    org.junit.Assert.assertNotNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v0));
    Object v2 = 1;
    Object v3 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v2).intValue()));
    Object v4 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v6 = ((com.fasterxml.jackson.databind.SerializerProvider)v1).findPrimaryPropertySerializer(((java.lang.Class)v4),((com.fasterxml.jackson.databind.BeanProperty)v5));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v0));
    Object v2 = 1;
    Object v3 = 3;
    Object v4 = 0;
    Object v5 = 1;
    Object v6 = -28;
    Object v7 = new java.util.Date((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v9 = true;
    Object v10 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v8),(((java.lang.Boolean)v9).booleanValue()));
    ((com.fasterxml.jackson.databind.SerializerProvider)v1).defaultSerializeDateValue(((java.util.Date)v7),((com.fasterxml.jackson.core.JsonGenerator)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = 1;
    Object v2 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v1).intValue()));
    Object v3 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = ((com.fasterxml.jackson.databind.SerializerProvider)v0)._createAndCacheUntypedSerializer(((java.lang.Class)v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v0));
    Object v2 = 0L;
    Object v3 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v4 = true;
    Object v5 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v3),(((java.lang.Boolean)v4).booleanValue()));
    ((com.fasterxml.jackson.core.JsonGenerator)v5).writeStartArray();
    Object v6 = null;
    ((com.fasterxml.jackson.databind.SerializerProvider)v1).defaultSerializeDateKey((((java.lang.Long)v2).longValue()),((com.fasterxml.jackson.core.JsonGenerator)v5));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v2));
    Object v4 = 1;
    Object v5 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v4).intValue()));
    Object v6 = ((com.fasterxml.jackson.databind.JavaType)v5).getGenericSignature();
    Object v7 = 1;
    Object v8 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v7).intValue()));
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v8));
    Object v10 = ((com.fasterxml.jackson.databind.DatabindContext)v3).constructSpecializedType(((com.fasterxml.jackson.databind.JavaType)v5),((java.lang.Class)v9));
    Object v11 = 1;
    Object v12 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v11).intValue()));
    Object v13 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v12));
    Object v14 = ((com.fasterxml.jackson.databind.DatabindContext)v1).constructSpecializedType(((com.fasterxml.jackson.databind.JavaType)v10),((java.lang.Class)v13));
    Object v15 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v16 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v15));
    Object v17 = 1;
    Object v18 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v17).intValue()));
    Object v19 = ((com.fasterxml.jackson.databind.JavaType)v18).getGenericSignature();
    Object v20 = 1;
    Object v21 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v20).intValue()));
    Object v22 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v21));
    Object v23 = ((com.fasterxml.jackson.databind.DatabindContext)v16).constructSpecializedType(((com.fasterxml.jackson.databind.JavaType)v18),((java.lang.Class)v22));
    Object v24 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v25 = ((com.fasterxml.jackson.databind.SerializerProvider)v1).findNullKeySerializer(((com.fasterxml.jackson.databind.JavaType)v23),((com.fasterxml.jackson.databind.BeanProperty)v24));
    org.junit.Assert.assertNotNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v0));
    Object v2 = ((com.fasterxml.jackson.databind.DatabindContext)v1).getConfig();
    Object v3 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v3));
    Object v5 = 1;
    Object v6 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v5).intValue()));
    Object v7 = ((com.fasterxml.jackson.databind.JavaType)v6).getGenericSignature();
    Object v8 = 1;
    Object v9 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v8).intValue()));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v9));
    Object v11 = ((com.fasterxml.jackson.databind.DatabindContext)v4).constructSpecializedType(((com.fasterxml.jackson.databind.JavaType)v6),((java.lang.Class)v10));
    Object v12 = 1;
    Object v13 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v12).intValue()));
    Object v14 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v13));
    Object v15 = ((com.fasterxml.jackson.databind.DatabindContext)v1).constructSpecializedType(((com.fasterxml.jackson.databind.JavaType)v11),((java.lang.Class)v14));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v0));
    Object v2 = "(";
    Object v3 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v2));
    Object v4 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v5 = ((com.fasterxml.jackson.databind.SerializerProvider)v1).setAttribute(((java.lang.Object)v3),((java.lang.Object)v4));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v0));
    Object v2 = -28L;
    Object v3 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v4 = true;
    Object v5 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v3),(((java.lang.Boolean)v4).booleanValue()));
    ((com.fasterxml.jackson.databind.SerializerProvider)v1).defaultSerializeDateValue((((java.lang.Long)v2).longValue()),((com.fasterxml.jackson.core.JsonGenerator)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v0));
    Object v2 = 1;
    Object v3 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v2).intValue()));
    Object v4 = ((com.fasterxml.jackson.databind.SerializerProvider)v1)._createAndCacheUntypedSerializer(((com.fasterxml.jackson.databind.JavaType)v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v2));
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v4));
    Object v6 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v7 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v7));
    Object v9 = 1;
    Object v10 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = ((com.fasterxml.jackson.databind.SerializerProvider)v8).getUnknownTypeSerializer(((java.lang.Class)v11));
    Object v13 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v14 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v13));
    Object v15 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base(((com.fasterxml.jackson.databind.SerializerProvider)v14));
    Object v16 = 1;
    Object v17 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v16).intValue()));
    ((com.fasterxml.jackson.databind.JsonSerializer)v12).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v15),((com.fasterxml.jackson.databind.JavaType)v17));
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v20 = ((com.fasterxml.jackson.databind.SerializerProvider)v6).handlePrimaryContextualization(((com.fasterxml.jackson.databind.JsonSerializer)v12),((com.fasterxml.jackson.databind.BeanProperty)v19));
    Object v21 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v22 = ((com.fasterxml.jackson.databind.BeanProperty)v21).getMetadata();
    Object v23 = ((com.fasterxml.jackson.databind.SerializerProvider)v5).handlePrimaryContextualization(((com.fasterxml.jackson.databind.JsonSerializer)v20),((com.fasterxml.jackson.databind.BeanProperty)v21));
    Object v24 = ((com.fasterxml.jackson.databind.SerializerProvider)v3)._handleResolvable(((com.fasterxml.jackson.databind.JsonSerializer)v23));
    Object v25 = ((com.fasterxml.jackson.databind.SerializerProvider)v1).isUnknownTypeSerializer(((com.fasterxml.jackson.databind.JsonSerializer)v24));
    Object v26 = ((com.fasterxml.jackson.databind.SerializerProvider)v1).getTypeFactory();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v0));
    Object v2 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v3 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v4 = true;
    Object v5 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v3),(((java.lang.Boolean)v4).booleanValue()));
    ((com.fasterxml.jackson.databind.SerializerProvider)v1).defaultSerializeValue(((java.lang.Object)v2),((com.fasterxml.jackson.core.JsonGenerator)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v2));
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v4));
    Object v6 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v7 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v7));
    Object v9 = 1;
    Object v10 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = ((com.fasterxml.jackson.databind.SerializerProvider)v8).getUnknownTypeSerializer(((java.lang.Class)v11));
    Object v13 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v14 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v13));
    Object v15 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base(((com.fasterxml.jackson.databind.SerializerProvider)v14));
    Object v16 = 1;
    Object v17 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v16).intValue()));
    ((com.fasterxml.jackson.databind.JsonSerializer)v12).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v15),((com.fasterxml.jackson.databind.JavaType)v17));
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v20 = ((com.fasterxml.jackson.databind.SerializerProvider)v6).handlePrimaryContextualization(((com.fasterxml.jackson.databind.JsonSerializer)v12),((com.fasterxml.jackson.databind.BeanProperty)v19));
    Object v21 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v22 = ((com.fasterxml.jackson.databind.BeanProperty)v21).getMetadata();
    Object v23 = ((com.fasterxml.jackson.databind.SerializerProvider)v5).handlePrimaryContextualization(((com.fasterxml.jackson.databind.JsonSerializer)v20),((com.fasterxml.jackson.databind.BeanProperty)v21));
    Object v24 = ((com.fasterxml.jackson.databind.SerializerProvider)v3)._handleResolvable(((com.fasterxml.jackson.databind.JsonSerializer)v23));
    Object v25 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v26 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v25));
    Object v27 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base(((com.fasterxml.jackson.databind.SerializerProvider)v26));
    Object v28 = 1;
    Object v29 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v28).intValue()));
    ((com.fasterxml.jackson.databind.JsonSerializer)v24).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v27),((com.fasterxml.jackson.databind.JavaType)v29));
    Object v30 = null;
    Object v31 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v32 = ((com.fasterxml.jackson.databind.SerializerProvider)v1).handleSecondaryContextualization(((com.fasterxml.jackson.databind.JsonSerializer)v24),((com.fasterxml.jackson.databind.BeanProperty)v31));
    org.junit.Assert.assertNotNull(v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v0));
    Object v2 = 1;
    Object v3 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v2).intValue()));
    Object v4 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = ((com.fasterxml.jackson.databind.SerializerProvider)v1).getUnknownTypeSerializer(((java.lang.Class)v4));
    Object v6 = 0L;
    Object v7 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v8 = true;
    Object v9 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v7),(((java.lang.Boolean)v8).booleanValue()));
    ((com.fasterxml.jackson.databind.SerializerProvider)v1).defaultSerializeDateValue((((java.lang.Long)v6).longValue()),((com.fasterxml.jackson.core.JsonGenerator)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v2));
    Object v4 = 1;
    Object v5 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v4).intValue()));
    Object v6 = ((com.fasterxml.jackson.databind.JavaType)v5).getGenericSignature();
    Object v7 = 1;
    Object v8 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v7).intValue()));
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v8));
    Object v10 = ((com.fasterxml.jackson.databind.DatabindContext)v3).constructSpecializedType(((com.fasterxml.jackson.databind.JavaType)v5),((java.lang.Class)v9));
    Object v11 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v12 = ((com.fasterxml.jackson.databind.SerializerProvider)v1).findPrimaryPropertySerializer(((com.fasterxml.jackson.databind.JavaType)v10),((com.fasterxml.jackson.databind.BeanProperty)v11));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v0));
    Object v2 = 1;
    Object v3 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v2).intValue()));
    Object v4 = ((com.fasterxml.jackson.databind.DatabindContext)v1).constructType(((java.lang.reflect.Type)v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = 1;
    Object v2 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v1).intValue()));
    Object v3 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = ((com.fasterxml.jackson.databind.SerializerProvider)v0).findValueSerializer(((java.lang.Class)v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v0));
    Object v2 = 1;
    Object v3 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v2).intValue()));
    Object v4 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = ((com.fasterxml.jackson.databind.SerializerProvider)v1)._createAndCacheUntypedSerializer(((java.lang.Class)v4));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v2));
    Object v4 = 1;
    Object v5 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v4).intValue()));
    Object v6 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v5));
    Object v7 = ((com.fasterxml.jackson.databind.SerializerProvider)v3).getUnknownTypeSerializer(((java.lang.Class)v6));
    Object v8 = ((com.fasterxml.jackson.databind.SerializerProvider)v1)._handleResolvable(((com.fasterxml.jackson.databind.JsonSerializer)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v4 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v3));
    Object v5 = 1;
    Object v6 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v5).intValue()));
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v6));
    Object v8 = true;
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v11 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v4),((java.lang.reflect.Constructor)v9),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v10),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v14 = ((com.fasterxml.jackson.databind.DatabindContext)v1).objectIdGeneratorInstance(((com.fasterxml.jackson.databind.introspect.Annotated)v12),((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v13));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v0));
    Object v2 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v3 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v3));
    Object v5 = 1;
    Object v6 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v5).intValue()));
    Object v7 = ((com.fasterxml.jackson.databind.JavaType)v6).getGenericSignature();
    Object v8 = 1;
    Object v9 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v8).intValue()));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v9));
    Object v11 = ((com.fasterxml.jackson.databind.DatabindContext)v4).constructSpecializedType(((com.fasterxml.jackson.databind.JavaType)v6),((java.lang.Class)v10));
    ((com.fasterxml.jackson.databind.SerializerProvider)v1)._reportIncompatibleRootType(((java.lang.Object)v2),((com.fasterxml.jackson.databind.JavaType)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.exc.InvalidDefinitionException");
    } catch (com.fasterxml.jackson.databind.exc.InvalidDefinitionException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v0));
    Object v2 = "array";
    Object v3 = new java.lang.Object[]{};
    Object v4 = ((com.fasterxml.jackson.databind.SerializerProvider)v1).mappingException(((java.lang.String)v2),((java.lang.Object[])v3));
    Object v5 = 1;
    Object v6 = 3;
    Object v7 = 0;
    Object v8 = 1;
    Object v9 = -28;
    Object v10 = new java.util.Date((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v12 = true;
    Object v13 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = 1.0F;
    ((com.fasterxml.jackson.core.JsonGenerator)v13).writeNumber((((java.lang.Float)v14).floatValue()));
    Object v15 = null;
    ((com.fasterxml.jackson.databind.SerializerProvider)v1).defaultSerializeDateKey(((java.util.Date)v10),((com.fasterxml.jackson.core.JsonGenerator)v13));
    Object v16 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = null;
    Object v2 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v5 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v6 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v1),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v2),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v3),((com.fasterxml.jackson.databind.util.RootNameLookup)v4),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v5));
    Object v7 = 12;
    Object v8 = new java.text.ParsePosition((((java.lang.Integer)v7).intValue()));
    Object v9 = ((com.fasterxml.jackson.databind.SerializerProvider)v0).setAttribute(((java.lang.Object)v6),((java.lang.Object)v8));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v1));
    Object v3 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v3));
    Object v5 = 1;
    Object v6 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v5).intValue()));
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v6));
    Object v8 = ((com.fasterxml.jackson.databind.SerializerProvider)v4).getUnknownTypeSerializer(((java.lang.Class)v7));
    Object v9 = ((com.fasterxml.jackson.databind.SerializerProvider)v2)._handleResolvable(((com.fasterxml.jackson.databind.JsonSerializer)v8));
    Object v10 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v11 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v10));
    Object v12 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base(((com.fasterxml.jackson.databind.SerializerProvider)v11));
    Object v13 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v14 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v13));
    Object v15 = ((com.fasterxml.jackson.databind.DatabindContext)v14).getConfig();
    Object v16 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v17 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v16));
    Object v18 = 1;
    Object v19 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v18).intValue()));
    Object v20 = ((com.fasterxml.jackson.databind.JavaType)v19).getGenericSignature();
    Object v21 = 1;
    Object v22 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v21).intValue()));
    Object v23 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v22));
    Object v24 = ((com.fasterxml.jackson.databind.DatabindContext)v17).constructSpecializedType(((com.fasterxml.jackson.databind.JavaType)v19),((java.lang.Class)v23));
    Object v25 = 1;
    Object v26 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v25).intValue()));
    Object v27 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v26));
    Object v28 = ((com.fasterxml.jackson.databind.DatabindContext)v14).constructSpecializedType(((com.fasterxml.jackson.databind.JavaType)v24),((java.lang.Class)v27));
    ((com.fasterxml.jackson.databind.JsonSerializer)v9).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v12),((com.fasterxml.jackson.databind.JavaType)v28));
    Object v29 = null;
    Object v30 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v31 = ((com.fasterxml.jackson.databind.SerializerProvider)v0)._handleContextualResolvable(((com.fasterxml.jackson.databind.JsonSerializer)v9),((com.fasterxml.jackson.databind.BeanProperty)v30));
    org.junit.Assert.assertNotNull(v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = 1;
    Object v2 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v1).intValue()));
    Object v3 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v2));
    Object v4 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v5 = ((com.fasterxml.jackson.databind.SerializerProvider)v0).findValueSerializer(((java.lang.Class)v3),((com.fasterxml.jackson.databind.BeanProperty)v4));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v2));
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v4));
    Object v6 = 1;
    Object v7 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v6).intValue()));
    Object v8 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = ((com.fasterxml.jackson.databind.SerializerProvider)v5).getUnknownTypeSerializer(((java.lang.Class)v8));
    Object v10 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v11 = ((com.fasterxml.jackson.databind.SerializerProvider)v3).handlePrimaryContextualization(((com.fasterxml.jackson.databind.JsonSerializer)v9),((com.fasterxml.jackson.databind.BeanProperty)v10));
    Object v12 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v13 = ((com.fasterxml.jackson.databind.SerializerProvider)v1)._handleContextualResolvable(((com.fasterxml.jackson.databind.JsonSerializer)v11),((com.fasterxml.jackson.databind.BeanProperty)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v0));
    Object v2 = 12;
    Object v3 = new java.text.ParsePosition((((java.lang.Integer)v2).intValue()));
    Object v4 = 1;
    Object v5 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v4).intValue()));
    Object v6 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v5));
    Object v7 = new com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator(((java.lang.Class)v6));
    Object v8 = ((com.fasterxml.jackson.databind.SerializerProvider)v1).findObjectId(((java.lang.Object)v3),((com.fasterxml.jackson.annotation.ObjectIdGenerator)v7));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v0));
    Object v2 = true;
    Object v3 = "integer";
    Object v4 = -39;
    Object v5 = "Byte";
    Object v6 = com.fasterxml.jackson.databind.PropertyMetadata.construct(((java.lang.Boolean)v2),((java.lang.String)v3),((java.lang.Integer)v4),((java.lang.String)v5));
    Object v7 = ((com.fasterxml.jackson.databind.SerializerProvider)v1).includeFilterSuppressNulls(((java.lang.Object)v6));
    Object v8 = "";
    Object v9 = "(";
    Object v10 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v9));
    Object v11 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v12 = true;
    Object v13 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v11),(((java.lang.Boolean)v12).booleanValue()));
    ((com.fasterxml.jackson.databind.SerializerProvider)v1).defaultSerializeField(((java.lang.String)v8),((java.lang.Object)v10),((com.fasterxml.jackson.core.JsonGenerator)v13));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v0));
    Object v2 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v3 = 1;
    Object v4 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v3).intValue()));
    ((com.fasterxml.jackson.databind.SerializerProvider)v1)._reportIncompatibleRootType(((java.lang.Object)v2),((com.fasterxml.jackson.databind.JavaType)v4));
    Object v5 = null;
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.exc.InvalidDefinitionException");
    } catch (com.fasterxml.jackson.databind.exc.InvalidDefinitionException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v2));
    Object v4 = 1;
    Object v5 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v4).intValue()));
    Object v6 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v5));
    Object v7 = ((com.fasterxml.jackson.databind.SerializerProvider)v3).getUnknownTypeSerializer(((java.lang.Class)v6));
    Object v8 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v9 = ((com.fasterxml.jackson.databind.BeanProperty)v8).getWrapperName();
    Object v10 = ((com.fasterxml.jackson.databind.SerializerProvider)v1).handleSecondaryContextualization(((com.fasterxml.jackson.databind.JsonSerializer)v7),((com.fasterxml.jackson.databind.BeanProperty)v8));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v2));
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v4));
    Object v6 = 1;
    Object v7 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v6).intValue()));
    Object v8 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = ((com.fasterxml.jackson.databind.SerializerProvider)v5).getUnknownTypeSerializer(((java.lang.Class)v8));
    Object v10 = ((com.fasterxml.jackson.databind.SerializerProvider)v3)._handleResolvable(((com.fasterxml.jackson.databind.JsonSerializer)v9));
    ((com.fasterxml.jackson.databind.SerializerProvider)v1).setDefaultKeySerializer(((com.fasterxml.jackson.databind.JsonSerializer)v10));
    Object v11 = null;
    Object v12 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v13 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v12));
    Object v14 = ((com.fasterxml.jackson.databind.DatabindContext)v13).getConfig();
    Object v15 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v16 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v15));
    Object v17 = 1;
    Object v18 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v17).intValue()));
    Object v19 = ((com.fasterxml.jackson.databind.JavaType)v18).getGenericSignature();
    Object v20 = 1;
    Object v21 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v20).intValue()));
    Object v22 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v21));
    Object v23 = ((com.fasterxml.jackson.databind.DatabindContext)v16).constructSpecializedType(((com.fasterxml.jackson.databind.JavaType)v18),((java.lang.Class)v22));
    Object v24 = 1;
    Object v25 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v24).intValue()));
    Object v26 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v25));
    Object v27 = ((com.fasterxml.jackson.databind.DatabindContext)v13).constructSpecializedType(((com.fasterxml.jackson.databind.JavaType)v23),((java.lang.Class)v26));
    Object v28 = ((com.fasterxml.jackson.databind.JavaType)v27).containedTypeCount();
    Object v29 = ((com.fasterxml.jackson.databind.SerializerProvider)v1).findValueSerializer(((com.fasterxml.jackson.databind.JavaType)v27));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v0));
    Object v2 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v3 = true;
    Object v4 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v2),(((java.lang.Boolean)v3).booleanValue()));
    ((com.fasterxml.jackson.databind.SerializerProvider)v1).defaultSerializeNull(((com.fasterxml.jackson.core.JsonGenerator)v4));
    Object v5 = null;
    Object v6 = 1;
    Object v7 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v6).intValue()));
    Object v8 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v9 = ((com.fasterxml.jackson.databind.SerializerProvider)v1).findPrimaryPropertySerializer(((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.BeanProperty)v8));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v0));
    Object v2 = 1;
    Object v3 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v2).intValue()));
    Object v4 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = ((java.lang.Class)v4).toString();
    Object v6 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v7 = ((com.fasterxml.jackson.databind.SerializerProvider)v1).findPrimaryPropertySerializer(((java.lang.Class)v4),((com.fasterxml.jackson.databind.BeanProperty)v6));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = 1;
    Object v2 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v4 = ((com.fasterxml.jackson.databind.BeanProperty)v3).getMember();
    Object v5 = ((com.fasterxml.jackson.databind.SerializerProvider)v0).findPrimaryPropertySerializer(((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.BeanProperty)v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v0));
    Object v2 = 1;
    Object v3 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v2).intValue()));
    Object v4 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = ((com.fasterxml.jackson.databind.SerializerProvider)v1)._findExplicitUntypedSerializer(((java.lang.Class)v4));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v0));
    Object v2 = 19L;
    Object v3 = new com.fasterxml.jackson.databind.ObjectMapper();
    Object v4 = true;
    Object v5 = new com.fasterxml.jackson.databind.util.TokenBuffer(((com.fasterxml.jackson.core.ObjectCodec)v3),(((java.lang.Boolean)v4).booleanValue()));
    ((com.fasterxml.jackson.databind.SerializerProvider)v1).defaultSerializeDateValue((((java.lang.Long)v2).longValue()),((com.fasterxml.jackson.core.JsonGenerator)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v2));
    Object v4 = 1;
    Object v5 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v4).intValue()));
    Object v6 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v5));
    Object v7 = ((com.fasterxml.jackson.databind.SerializerProvider)v3).getUnknownTypeSerializer(((java.lang.Class)v6));
    Object v8 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v9 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v10 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v9));
    Object v11 = 1;
    Object v12 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v11).intValue()));
    Object v13 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v12));
    Object v14 = ((com.fasterxml.jackson.databind.SerializerProvider)v10).getUnknownTypeSerializer(((java.lang.Class)v13));
    Object v15 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v16 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v15));
    Object v17 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base(((com.fasterxml.jackson.databind.SerializerProvider)v16));
    Object v18 = 1;
    Object v19 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v18).intValue()));
    ((com.fasterxml.jackson.databind.JsonSerializer)v14).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v17),((com.fasterxml.jackson.databind.JavaType)v19));
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v22 = ((com.fasterxml.jackson.databind.SerializerProvider)v8).handlePrimaryContextualization(((com.fasterxml.jackson.databind.JsonSerializer)v14),((com.fasterxml.jackson.databind.BeanProperty)v21));
    Object v23 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v24 = ((com.fasterxml.jackson.databind.BeanProperty)v23).isRequired();
    Object v25 = ((com.fasterxml.jackson.databind.SerializerProvider)v3).handleSecondaryContextualization(((com.fasterxml.jackson.databind.JsonSerializer)v22),((com.fasterxml.jackson.databind.BeanProperty)v23));
    ((com.fasterxml.jackson.databind.SerializerProvider)v1).setDefaultKeySerializer(((com.fasterxml.jackson.databind.JsonSerializer)v25));
    Object v26 = null;
    org.junit.Assert.assertNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v4 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v3));
    Object v5 = 1;
    Object v6 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v5).intValue()));
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v6));
    Object v8 = true;
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v11 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v4),((java.lang.reflect.Constructor)v9),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v10),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v11));
    Object v13 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v14 = ((com.fasterxml.jackson.databind.SerializerProvider)v1).serializerInstance(((com.fasterxml.jackson.databind.introspect.Annotated)v12),((java.lang.Object)v13));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.exc.InvalidDefinitionException");
    } catch (com.fasterxml.jackson.databind.exc.InvalidDefinitionException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v0));
    Object v2 = 1;
    Object v3 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v2).intValue()));
    Object v4 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v3));
    Object v5 = 1;
    Object v6 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v5).intValue()));
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v6));
    Object v8 = ((java.lang.Class)v4).isAssignableFrom(((java.lang.Class)v7));
    Object v9 = ((com.fasterxml.jackson.databind.SerializerProvider)v1)._findExplicitUntypedSerializer(((java.lang.Class)v4));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v2));
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v4));
    Object v6 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v7 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v6));
    Object v8 = 1;
    Object v9 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v8).intValue()));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v9));
    Object v11 = ((com.fasterxml.jackson.databind.SerializerProvider)v7).getUnknownTypeSerializer(((java.lang.Class)v10));
    Object v12 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v13 = ((com.fasterxml.jackson.databind.SerializerProvider)v5).handlePrimaryContextualization(((com.fasterxml.jackson.databind.JsonSerializer)v11),((com.fasterxml.jackson.databind.BeanProperty)v12));
    Object v14 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v15 = ((com.fasterxml.jackson.databind.SerializerProvider)v3)._handleContextualResolvable(((com.fasterxml.jackson.databind.JsonSerializer)v13),((com.fasterxml.jackson.databind.BeanProperty)v14));
    Object v16 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v17 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v16));
    Object v18 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base(((com.fasterxml.jackson.databind.SerializerProvider)v17));
    Object v19 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v20 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v19));
    Object v21 = 1;
    Object v22 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v21).intValue()));
    Object v23 = ((com.fasterxml.jackson.databind.JavaType)v22).getGenericSignature();
    Object v24 = 1;
    Object v25 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v24).intValue()));
    Object v26 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v25));
    Object v27 = ((com.fasterxml.jackson.databind.DatabindContext)v20).constructSpecializedType(((com.fasterxml.jackson.databind.JavaType)v22),((java.lang.Class)v26));
    ((com.fasterxml.jackson.databind.JsonSerializer)v15).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v18),((com.fasterxml.jackson.databind.JavaType)v27));
    Object v28 = null;
    Object v29 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v30 = ((com.fasterxml.jackson.databind.SerializerProvider)v1).handleSecondaryContextualization(((com.fasterxml.jackson.databind.JsonSerializer)v15),((com.fasterxml.jackson.databind.BeanProperty)v29));
    org.junit.Assert.assertNotNull(v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v0));
    Object v2 = com.fasterxml.jackson.annotation.JsonInclude.Value.empty();
    Object v3 = 1;
    Object v4 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v3).intValue()));
    ((com.fasterxml.jackson.databind.SerializerProvider)v1)._reportIncompatibleRootType(((java.lang.Object)v2),((com.fasterxml.jackson.databind.JavaType)v4));
    Object v5 = null;
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.exc.InvalidDefinitionException");
    } catch (com.fasterxml.jackson.databind.exc.InvalidDefinitionException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v0));
    Object v2 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v3 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v2));
    Object v4 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v5 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v6 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v5));
    Object v7 = 1;
    Object v8 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v7).intValue()));
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v8));
    Object v10 = ((com.fasterxml.jackson.databind.SerializerProvider)v6).getUnknownTypeSerializer(((java.lang.Class)v9));
    Object v11 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v12 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v11));
    Object v13 = new com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base(((com.fasterxml.jackson.databind.SerializerProvider)v12));
    Object v14 = 1;
    Object v15 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v14).intValue()));
    ((com.fasterxml.jackson.databind.JsonSerializer)v10).acceptJsonFormatVisitor(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)v13),((com.fasterxml.jackson.databind.JavaType)v15));
    Object v16 = null;
    Object v17 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v18 = ((com.fasterxml.jackson.databind.SerializerProvider)v4).handlePrimaryContextualization(((com.fasterxml.jackson.databind.JsonSerializer)v10),((com.fasterxml.jackson.databind.BeanProperty)v17));
    Object v19 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v20 = ((com.fasterxml.jackson.databind.BeanProperty)v19).getMetadata();
    Object v21 = ((com.fasterxml.jackson.databind.SerializerProvider)v3).handlePrimaryContextualization(((com.fasterxml.jackson.databind.JsonSerializer)v18),((com.fasterxml.jackson.databind.BeanProperty)v19));
    Object v22 = new com.fasterxml.jackson.databind.BeanProperty.Bogus();
    Object v23 = ((com.fasterxml.jackson.databind.SerializerProvider)v1).handleSecondaryContextualization(((com.fasterxml.jackson.databind.JsonSerializer)v21),((com.fasterxml.jackson.databind.BeanProperty)v22));
    Object v24 = 1;
    Object v25 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v24).intValue()));
    Object v26 = ((com.fasterxml.jackson.databind.JavaType)v25).isFinal();
    Object v27 = ((com.fasterxml.jackson.databind.SerializerProvider)v1).findValueSerializer(((com.fasterxml.jackson.databind.JavaType)v25));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
    Object v1 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl(((com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl)v0));
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v4 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v3));
    Object v5 = 1;
    Object v6 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v5).intValue()));
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.rawClass(((com.fasterxml.jackson.databind.JavaType)v6));
    Object v8 = true;
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v11 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{};
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v4),((java.lang.reflect.Constructor)v9),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v10),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v11));
    Object v13 = ((com.fasterxml.jackson.databind.introspect.Annotated)v12).getAnnotated();
    Object v14 = com.fasterxml.jackson.databind.introspect.ObjectIdInfo.empty();
    Object v15 = true;
    Object v16 = ((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v14).withAlwaysAsId((((java.lang.Boolean)v15).booleanValue()));
    Object v17 = ((com.fasterxml.jackson.databind.DatabindContext)v1).objectIdResolverInstance(((com.fasterxml.jackson.databind.introspect.Annotated)v12),((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v14));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }
}
