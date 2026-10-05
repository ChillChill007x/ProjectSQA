package com.fasterxml.jackson.databind;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = "array";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = "array";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = "array";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = java.util.EnumSet.of(((java.lang.Enum)v4),((java.lang.Enum)v6),((java.lang.Enum)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v9));
    Object v11 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v10));
    Object v12 = ", generat}rType=";
    Object v13 = "j entries";
    Object v14 = ((com.fasterxml.jackson.databind.DatabindContext)v2).invalidTypeIdException(((com.fasterxml.jackson.databind.JavaType)v11),((java.lang.String)v12),((java.lang.String)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = ((com.fasterxml.jackson.databind.DatabindContext)v2).getActiveView();
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = "array";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = "array";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = "array";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = java.util.EnumSet.of(((java.lang.Enum)v4),((java.lang.Enum)v6),((java.lang.Enum)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v9));
    Object v11 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v10));
    Object v12 = ((java.lang.reflect.Type)v11).getTypeName();
    Object v13 = ((com.fasterxml.jackson.databind.DatabindContext)v2).constructType(((java.lang.reflect.Type)v11));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = ((com.fasterxml.jackson.databind.DatabindContext)v2).getActiveView();
    Object v4 = "array";
    Object v5 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v4));
    Object v6 = "array";
    Object v7 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v6));
    Object v8 = "array";
    Object v9 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v8));
    Object v10 = java.util.EnumSet.of(((java.lang.Enum)v5),((java.lang.Enum)v7),((java.lang.Enum)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v10));
    Object v12 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v11));
    Object v13 = "{";
    Object v14 = ((com.fasterxml.jackson.databind.DatabindContext)v2).reportBadDefinition(((com.fasterxml.jackson.databind.JavaType)v12),((java.lang.String)v13));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.exc.InvalidDefinitionException");
    } catch (com.fasterxml.jackson.databind.exc.InvalidDefinitionException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = "type";
    Object v4 = new java.lang.Object[]{null,null,null};
    Object v5 = ((com.fasterxml.jackson.databind.DatabindContext)v2)._format(((java.lang.String)v3),((java.lang.Object[])v4));
    org.junit.Assert.assertEquals((Object)("type"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = ((com.fasterxml.jackson.databind.DatabindContext)v2).getConfig();
    Object v4 = ((com.fasterxml.jackson.databind.DatabindContext)v2).getTimeZone();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = "array";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = "array";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = "array";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = java.util.EnumSet.of(((java.lang.Enum)v4),((java.lang.Enum)v6),((java.lang.Enum)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v9));
    Object v11 = ((com.fasterxml.jackson.databind.DatabindContext)v2).getDefaultPropertyFormat(((java.lang.Class)v10));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = "Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingArrayDelegate()', but null for 'getArrayDelegateType()'";
    Object v4 = ": ";
    Object v5 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = ((com.fasterxml.jackson.databind.DatabindContext)v2).setAttribute(((java.lang.Object)v5),((java.lang.Object)v6));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = "array";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = "array";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = "array";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = java.util.EnumSet.of(((java.lang.Enum)v4),((java.lang.Enum)v6),((java.lang.Enum)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v9));
    Object v11 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v10));
    Object v12 = "[TokenBuffer: ";
    Object v13 = "s6tring";
    Object v14 = ((com.fasterxml.jackson.databind.DatabindContext)v2).invalidTypeIdException(((com.fasterxml.jackson.databind.JavaType)v11),((java.lang.String)v12),((java.lang.String)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = ((com.fasterxml.jackson.databind.DatabindContext)v2).getAttribute(((java.lang.Object)v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = "7";
    Object v4 = ((com.fasterxml.jackson.databind.DatabindContext)v2)._truncate(((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)("7"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = "array";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = ((com.fasterxml.jackson.databind.DatabindContext)v2).getAttribute(((java.lang.Object)v4));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = ((com.fasterxml.jackson.databind.DatabindContext)v2).canOverrideAccessModifiers();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = ((com.fasterxml.jackson.databind.DatabindContext)v2).getActiveView();
    Object v4 = ((com.fasterxml.jackson.databind.DatabindContext)v2).getConfig();
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = "array";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = "array";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = "array";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = java.util.EnumSet.of(((java.lang.Enum)v4),((java.lang.Enum)v6),((java.lang.Enum)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v9));
    Object v11 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v10));
    Object v12 = "array";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v12));
    Object v14 = "array";
    Object v15 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v14));
    Object v16 = "array";
    Object v17 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v16));
    Object v18 = java.util.EnumSet.of(((java.lang.Enum)v13),((java.lang.Enum)v15),((java.lang.Enum)v17));
    Object v19 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v18));
    Object v20 = ((com.fasterxml.jackson.databind.DatabindContext)v2).constructSpecializedType(((com.fasterxml.jackson.databind.JavaType)v11),((java.lang.Class)v19));
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = "array";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = "array";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = "array";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = java.util.EnumSet.of(((java.lang.Enum)v4),((java.lang.Enum)v6),((java.lang.Enum)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v9));
    Object v11 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v10));
    Object v12 = "array";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v12));
    Object v14 = "array";
    Object v15 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v14));
    Object v16 = "array";
    Object v17 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v16));
    Object v18 = java.util.EnumSet.of(((java.lang.Enum)v13),((java.lang.Enum)v15),((java.lang.Enum)v17));
    Object v19 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v18));
    Object v20 = ((com.fasterxml.jackson.databind.DatabindContext)v2).constructSpecializedType(((com.fasterxml.jackson.databind.JavaType)v11),((java.lang.Class)v19));
    Object v21 = "";
    Object v22 = ((com.fasterxml.jackson.databind.DatabindContext)v2)._truncate(((java.lang.String)v21));
    org.junit.Assert.assertEquals((Object)(""), v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = "array";
    Object v7 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v6));
    Object v8 = "array";
    Object v9 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v8));
    Object v10 = "array";
    Object v11 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v10));
    Object v12 = java.util.EnumSet.of(((java.lang.Enum)v7),((java.lang.Enum)v9),((java.lang.Enum)v11));
    Object v13 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v12));
    Object v14 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v13));
    Object v15 = "array";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v15));
    Object v17 = "array";
    Object v18 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v17));
    Object v19 = "array";
    Object v20 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v19));
    Object v21 = java.util.EnumSet.of(((java.lang.Enum)v16),((java.lang.Enum)v18),((java.lang.Enum)v20));
    Object v22 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v21));
    Object v23 = ((com.fasterxml.jackson.databind.DatabindContext)v5).constructSpecializedType(((com.fasterxml.jackson.databind.JavaType)v14),((java.lang.Class)v22));
    Object v24 = "integer";
    Object v25 = ((com.fasterxml.jackson.databind.DatabindContext)v2).reportBadDefinition(((com.fasterxml.jackson.databind.JavaType)v23),((java.lang.String)v24));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.exc.InvalidDefinitionException");
    } catch (com.fasterxml.jackson.databind.exc.InvalidDefinitionException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = ((com.fasterxml.jackson.databind.DatabindContext)v2).getTypeFactory();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = "}";
    Object v4 = ((com.fasterxml.jackson.databind.DatabindContext)v2)._desc(((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)("}"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = ((com.fasterxml.jackson.databind.DatabindContext)v2).getTimeZone();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = ((com.fasterxml.jackson.databind.DatabindContext)v2).getConfig();
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v6 = ((com.fasterxml.jackson.databind.DatabindContext)v2).setAttribute(((java.lang.Object)v4),((java.lang.Object)v5));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = ((com.fasterxml.jackson.databind.DatabindContext)v2).getConfig();
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = ",";
    Object v4 = ((com.fasterxml.jackson.databind.DatabindContext)v2)._truncate(((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)(","), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = "";
    Object v4 = "items\\";
    Object v5 = ((com.fasterxml.jackson.databind.DatabindContext)v2)._colonConcat(((java.lang.String)v3),((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)(": items\\"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = " is not accessible (non-public?): not allowed to try modify access via Reflection: cannot instantiate type";
    Object v4 = new java.lang.Object[]{};
    Object v5 = ((com.fasterxml.jackson.databind.DatabindContext)v2)._format(((java.lang.String)v3),((java.lang.Object[])v4));
    org.junit.Assert.assertEquals((Object)(" is not accessible (non-public?): not allowed to try modify access via Reflection: cannot instantiate type"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = ((com.fasterxml.jackson.databind.DatabindContext)v2).getAnnotationIntrospector();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = "P";
    Object v4 = "), cannot call wth() on it";
    Object v5 = ((com.fasterxml.jackson.databind.DatabindContext)v2)._colonConcat(((java.lang.String)v3),((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)("P: ), cannot call wth() on it"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = "array";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = "array";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = "array";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = java.util.EnumSet.of(((java.lang.Enum)v4),((java.lang.Enum)v6),((java.lang.Enum)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v9));
    Object v11 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v10));
    Object v12 = "";
    Object v13 = ((com.fasterxml.jackson.databind.DatabindContext)v2).resolveSubType(((com.fasterxml.jackson.databind.JavaType)v11),((java.lang.String)v12));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.exc.InvalidTypeIdException");
    } catch (com.fasterxml.jackson.databind.exc.InvalidTypeIdException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = "array";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v6 = ((com.fasterxml.jackson.databind.DatabindContext)v2).setAttribute(((java.lang.Object)v4),((java.lang.Object)v5));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = "array";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = "array";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = "array";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = java.util.EnumSet.of(((java.lang.Enum)v4),((java.lang.Enum)v6),((java.lang.Enum)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v9));
    Object v11 = ((com.fasterxml.jackson.databind.DatabindContext)v2).constructType(((java.lang.reflect.Type)v10));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = com.fasterxml.jackson.databind.MapperFeature.USE_BASE_TYPE_AS_DEFAULT_IMPL;
    Object v4 = ((com.fasterxml.jackson.databind.DatabindContext)v2).isEnabled(((com.fasterxml.jackson.databind.MapperFeature)v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = "array";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = "array";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = "array";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = java.util.EnumSet.of(((java.lang.Enum)v4),((java.lang.Enum)v6),((java.lang.Enum)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v9));
    Object v11 = "' from CLlass '";
    Object v12 = ((java.lang.Class)v10).getResource(((java.lang.String)v11));
    Object v13 = ((com.fasterxml.jackson.databind.DatabindContext)v2).getDefaultPropertyFormat(((java.lang.Class)v10));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = " ";
    Object v4 = new java.lang.Object[]{null,null};
    Object v5 = ((com.fasterxml.jackson.databind.DatabindContext)v2)._format(((java.lang.String)v3),((java.lang.Object[])v4));
    org.junit.Assert.assertEquals((Object)(" "), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = "Invalid Object Id definition for ";
    Object v4 = ((com.fasterxml.jackson.databind.DatabindContext)v2)._quotedString(((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)("\"Invalid Object Id definition for \""), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = ((com.fasterxml.jackson.databind.DatabindContext)v2).getLocale();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = "string";
    Object v4 = ((com.fasterxml.jackson.databind.DatabindContext)v2)._desc(((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)("string"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = "array";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = "array";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = "array";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = java.util.EnumSet.of(((java.lang.Enum)v4),((java.lang.Enum)v6),((java.lang.Enum)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v9));
    Object v11 = "org.apache.commons.collections4.functors.InstantiateTransformer";
    Object v12 = ((com.fasterxml.jackson.databind.DatabindContext)v2).reportBadDefinition(((java.lang.Class)v10),((java.lang.String)v11));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = ((com.fasterxml.jackson.databind.DatabindContext)v2).getConfig();
    Object v4 = ((com.fasterxml.jackson.databind.DatabindContext)v2).getLocale();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = "\\";
    Object v4 = "string";
    Object v5 = ((com.fasterxml.jackson.databind.DatabindContext)v2)._colonConcat(((java.lang.String)v3),((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)("\\: string"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = ":]";
    Object v4 = new java.lang.Object[]{};
    Object v5 = ((com.fasterxml.jackson.databind.DatabindContext)v2)._format(((java.lang.String)v3),((java.lang.Object[])v4));
    org.junit.Assert.assertEquals((Object)(":]"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = "FAIL_ON_NULL_FOR_PRIMITIVE";
    Object v4 = ((com.fasterxml.jackson.databind.DatabindContext)v2)._desc(((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)("FAIL_ON_NULL_FOR_PRIMITIVE"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = ((com.fasterxml.jackson.databind.DatabindContext)v2).getActiveView();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v5 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v6 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v4),((com.fasterxml.jackson.databind.type.TypeBindings)v5));
    Object v7 = "array";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = "array";
    Object v10 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v9));
    Object v11 = "array";
    Object v12 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v11));
    Object v13 = java.util.EnumSet.of(((java.lang.Enum)v8),((java.lang.Enum)v10),((java.lang.Enum)v12));
    Object v14 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v13));
    Object v15 = " Sntries, got ";
    Object v16 = "array";
    Object v17 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v16));
    Object v18 = "array";
    Object v19 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v18));
    Object v20 = "array";
    Object v21 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v20));
    Object v22 = java.util.EnumSet.of(((java.lang.Enum)v17),((java.lang.Enum)v19),((java.lang.Enum)v21));
    Object v23 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v22));
    Object v24 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v23));
    Object v25 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v6),((java.lang.Class)v14),((java.lang.String)v15),((com.fasterxml.jackson.databind.JavaType)v24));
    Object v26 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v27 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v26));
    Object v28 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v27));
    Object v29 = "Invalid Object Id definition for ";
    Object v30 = ((com.fasterxml.jackson.databind.DatabindContext)v28)._quotedString(((java.lang.String)v29));
    Object v31 = ((com.fasterxml.jackson.databind.DatabindContext)v2).converterInstance(((com.fasterxml.jackson.databind.introspect.Annotated)v25),((java.lang.Object)v30));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = "array";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = "array";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = "array";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = java.util.EnumSet.of(((java.lang.Enum)v4),((java.lang.Enum)v6),((java.lang.Enum)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v9));
    Object v11 = ((java.lang.Class)v10).getComponentType();
    Object v12 = ((com.fasterxml.jackson.databind.DatabindContext)v2).getDefaultPropertyFormat(((java.lang.Class)v10));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = "array";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = "array";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = "array";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = java.util.EnumSet.of(((java.lang.Enum)v4),((java.lang.Enum)v6),((java.lang.Enum)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v9));
    Object v11 = ((java.lang.reflect.Type)v10).getTypeName();
    Object v12 = ((com.fasterxml.jackson.databind.DatabindContext)v2).constructType(((java.lang.reflect.Type)v10));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = "";
    Object v4 = ((com.fasterxml.jackson.databind.DatabindContext)v2)._truncate(((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)(""), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = ((com.fasterxml.jackson.databind.DatabindContext)v2).getActiveView();
    Object v4 = "; expected type Converter or Class<Converter> instead";
    Object v5 = ((com.fasterxml.jackson.databind.DatabindContext)v2)._quotedString(((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)("\"; expected type Converter or Class<Converter> instead\""), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = com.fasterxml.jackson.databind.MapperFeature.ALLOW_FINAL_FIELDS_AS_MUTATORS;
    Object v4 = ((com.fasterxml.jackson.databind.DatabindContext)v2).isEnabled(((com.fasterxml.jackson.databind.MapperFeature)v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = ((com.fasterxml.jackson.databind.DatabindContext)v2).getActiveView();
    Object v4 = "array";
    Object v5 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v4));
    Object v6 = "array";
    Object v7 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v6));
    Object v8 = "array";
    Object v9 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v8));
    Object v10 = java.util.EnumSet.of(((java.lang.Enum)v5),((java.lang.Enum)v7),((java.lang.Enum)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v10));
    Object v12 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v11));
    Object v13 = "Cannot use includeAs of";
    Object v14 = ((com.fasterxml.jackson.databind.DatabindContext)v2).resolveSubType(((com.fasterxml.jackson.databind.JavaType)v12),((java.lang.String)v13));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.exc.InvalidTypeIdException");
    } catch (com.fasterxml.jackson.databind.exc.InvalidTypeIdException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = "array";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = "array";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = "array";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = java.util.EnumSet.of(((java.lang.Enum)v4),((java.lang.Enum)v6),((java.lang.Enum)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v9));
    Object v11 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v10));
    Object v12 = "NON_NULL";
    Object v13 = "*";
    Object v14 = ((com.fasterxml.jackson.databind.DatabindContext)v2).invalidTypeIdException(((com.fasterxml.jackson.databind.JavaType)v11),((java.lang.String)v12),((java.lang.String)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v4 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v5 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v3),((com.fasterxml.jackson.databind.type.TypeBindings)v4));
    Object v6 = "array";
    Object v7 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v6));
    Object v8 = "array";
    Object v9 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v8));
    Object v10 = "array";
    Object v11 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v10));
    Object v12 = java.util.EnumSet.of(((java.lang.Enum)v7),((java.lang.Enum)v9),((java.lang.Enum)v11));
    Object v13 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v12));
    Object v14 = " Sntries, got ";
    Object v15 = "array";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v15));
    Object v17 = "array";
    Object v18 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v17));
    Object v19 = "array";
    Object v20 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v19));
    Object v21 = java.util.EnumSet.of(((java.lang.Enum)v16),((java.lang.Enum)v18),((java.lang.Enum)v20));
    Object v22 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v21));
    Object v23 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v22));
    Object v24 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v5),((java.lang.Class)v13),((java.lang.String)v14),((com.fasterxml.jackson.databind.JavaType)v23));
    Object v25 = "Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingArrayDelegate()', but null for 'getArrayDelegateType()'";
    Object v26 = ": ";
    Object v27 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v25),((java.lang.String)v26));
    Object v28 = ((com.fasterxml.jackson.databind.DatabindContext)v2).converterInstance(((com.fasterxml.jackson.databind.introspect.Annotated)v24),((java.lang.Object)v27));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = ((com.fasterxml.jackson.databind.DatabindContext)v2).getConfig();
    Object v4 = "array";
    Object v5 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v4));
    Object v6 = "array";
    Object v7 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v6));
    Object v8 = "array";
    Object v9 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v8));
    Object v10 = java.util.EnumSet.of(((java.lang.Enum)v5),((java.lang.Enum)v7),((java.lang.Enum)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v10));
    Object v12 = ";";
    Object v13 = ((com.fasterxml.jackson.databind.DatabindContext)v2).reportBadDefinition(((java.lang.Class)v11),((java.lang.String)v12));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = ((com.fasterxml.jackson.databind.DatabindContext)v2).getConfig();
    Object v4 = ((com.fasterxml.jackson.databind.DatabindContext)v2).canOverrideAccessModifiers();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = ((com.fasterxml.jackson.databind.DatabindContext)v2).getConfig();
    Object v4 = ((com.fasterxml.jackson.databind.DatabindContext)v2).getActiveView();
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = ",";
    Object v4 = ((com.fasterxml.jackson.databind.DatabindContext)v2)._desc(((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)(","), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = "array";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = "array";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = "array";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = java.util.EnumSet.of(((java.lang.Enum)v4),((java.lang.Enum)v6),((java.lang.Enum)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v9));
    Object v11 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v10));
    Object v12 = "UNWRAP_ROOT_VALUE";
    Object v13 = ((com.fasterxml.jackson.databind.DatabindContext)v2).reportBadDefinition(((com.fasterxml.jackson.databind.JavaType)v11),((java.lang.String)v12));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.exc.InvalidDefinitionException");
    } catch (com.fasterxml.jackson.databind.exc.InvalidDefinitionException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = "D";
    Object v4 = ((com.fasterxml.jackson.databind.DatabindContext)v2)._truncate(((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)("D"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = "array";
    Object v7 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v6));
    Object v8 = "array";
    Object v9 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v8));
    Object v10 = "array";
    Object v11 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v10));
    Object v12 = java.util.EnumSet.of(((java.lang.Enum)v7),((java.lang.Enum)v9),((java.lang.Enum)v11));
    Object v13 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v12));
    Object v14 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v13));
    Object v15 = "array";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v15));
    Object v17 = "array";
    Object v18 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v17));
    Object v19 = "array";
    Object v20 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v19));
    Object v21 = java.util.EnumSet.of(((java.lang.Enum)v16),((java.lang.Enum)v18),((java.lang.Enum)v20));
    Object v22 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v21));
    Object v23 = ((com.fasterxml.jackson.databind.DatabindContext)v5).constructSpecializedType(((com.fasterxml.jackson.databind.JavaType)v14),((java.lang.Class)v22));
    Object v24 = "array";
    Object v25 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v24));
    Object v26 = "array";
    Object v27 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v26));
    Object v28 = "array";
    Object v29 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v28));
    Object v30 = java.util.EnumSet.of(((java.lang.Enum)v25),((java.lang.Enum)v27),((java.lang.Enum)v29));
    Object v31 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v30));
    Object v32 = ((com.fasterxml.jackson.databind.DatabindContext)v2).constructSpecializedType(((com.fasterxml.jackson.databind.JavaType)v23),((java.lang.Class)v31));
    Object v33 = ((com.fasterxml.jackson.databind.DatabindContext)v2).getTimeZone();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = "P";
    Object v7 = "), cannot call wth() on it";
    Object v8 = ((com.fasterxml.jackson.databind.DatabindContext)v5)._colonConcat(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = ((com.fasterxml.jackson.databind.DatabindContext)v2).getAttribute(((java.lang.Object)v8));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = "array";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = "array";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = "array";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = java.util.EnumSet.of(((java.lang.Enum)v4),((java.lang.Enum)v6),((java.lang.Enum)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v9));
    Object v11 = ((java.lang.Class)v10).getSimpleName();
    Object v12 = ((com.fasterxml.jackson.databind.DatabindContext)v2).getDefaultPropertyFormat(((java.lang.Class)v10));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = "";
    Object v4 = ((com.fasterxml.jackson.databind.DatabindContext)v2)._quotedString(((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)("\"\""), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = ((com.fasterxml.jackson.databind.DatabindContext)v2).getActiveView();
    Object v4 = ((com.fasterxml.jackson.databind.DatabindContext)v2).getTimeZone();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = "' ";
    Object v4 = ((com.fasterxml.jackson.databind.DatabindContext)v2)._truncate(((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)("' "), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = "integer";
    Object v4 = "";
    Object v5 = ((com.fasterxml.jackson.databind.DatabindContext)v2)._colonConcat(((java.lang.String)v3),((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)("integer: "), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = "";
    Object v4 = new java.lang.Object[]{null};
    Object v5 = ((com.fasterxml.jackson.databind.DatabindContext)v2)._format(((java.lang.String)v3),((java.lang.Object[])v4));
    org.junit.Assert.assertEquals((Object)(""), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = "tring";
    Object v4 = ((com.fasterxml.jackson.databind.DatabindContext)v2)._truncate(((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)("tring"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = "array";
    Object v7 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v6));
    Object v8 = "array";
    Object v9 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v8));
    Object v10 = "array";
    Object v11 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v10));
    Object v12 = java.util.EnumSet.of(((java.lang.Enum)v7),((java.lang.Enum)v9),((java.lang.Enum)v11));
    Object v13 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v12));
    Object v14 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v13));
    Object v15 = "array";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v15));
    Object v17 = "array";
    Object v18 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v17));
    Object v19 = "array";
    Object v20 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v19));
    Object v21 = java.util.EnumSet.of(((java.lang.Enum)v16),((java.lang.Enum)v18),((java.lang.Enum)v20));
    Object v22 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v21));
    Object v23 = ((com.fasterxml.jackson.databind.DatabindContext)v5).constructSpecializedType(((com.fasterxml.jackson.databind.JavaType)v14),((java.lang.Class)v22));
    Object v24 = "array";
    Object v25 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v24));
    Object v26 = "array";
    Object v27 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v26));
    Object v28 = "array";
    Object v29 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v28));
    Object v30 = java.util.EnumSet.of(((java.lang.Enum)v25),((java.lang.Enum)v27),((java.lang.Enum)v29));
    Object v31 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v30));
    Object v32 = ((com.fasterxml.jackson.databind.DatabindContext)v2).constructSpecializedType(((com.fasterxml.jackson.databind.JavaType)v23),((java.lang.Class)v31));
    Object v33 = ((com.fasterxml.jackson.databind.DatabindContext)v2).getAnnotationIntrospector();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = com.fasterxml.jackson.databind.MapperFeature.AUTO_DETECT_CREATORS;
    Object v4 = ((com.fasterxml.jackson.databind.DatabindContext)v2).isEnabled(((com.fasterxml.jackson.databind.MapperFeature)v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = "array";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = "array";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = "array";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = java.util.EnumSet.of(((java.lang.Enum)v4),((java.lang.Enum)v6),((java.lang.Enum)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v9));
    Object v11 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v10));
    Object v12 = "array";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v12));
    Object v14 = "array";
    Object v15 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v14));
    Object v16 = "array";
    Object v17 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v16));
    Object v18 = java.util.EnumSet.of(((java.lang.Enum)v13),((java.lang.Enum)v15),((java.lang.Enum)v17));
    Object v19 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v18));
    Object v20 = ((com.fasterxml.jackson.databind.DatabindContext)v2).constructSpecializedType(((com.fasterxml.jackson.databind.JavaType)v11),((java.lang.Class)v19));
    Object v21 = ((com.fasterxml.jackson.databind.DatabindContext)v2).getAnnotationIntrospector();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = " with 2 typ";
    Object v4 = ((com.fasterxml.jackson.databind.DatabindContext)v2)._truncate(((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)(" with 2 typ"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = ((com.fasterxml.jackson.databind.DatabindContext)v2).getConfig();
    Object v4 = "array";
    Object v5 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v4));
    Object v6 = "array";
    Object v7 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v6));
    Object v8 = "array";
    Object v9 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v8));
    Object v10 = java.util.EnumSet.of(((java.lang.Enum)v5),((java.lang.Enum)v7),((java.lang.Enum)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v10));
    Object v12 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v11));
    Object v13 = "array";
    Object v14 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v13));
    Object v15 = "array";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v15));
    Object v17 = "array";
    Object v18 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v17));
    Object v19 = java.util.EnumSet.of(((java.lang.Enum)v14),((java.lang.Enum)v16),((java.lang.Enum)v18));
    Object v20 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v19));
    Object v21 = ((com.fasterxml.jackson.databind.DatabindContext)v2).constructSpecializedType(((com.fasterxml.jackson.databind.JavaType)v12),((java.lang.Class)v20));
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v4 = "Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingArrayDelegate()', but null for 'getArrayDelegateType()'";
    Object v5 = ": ";
    Object v6 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((com.fasterxml.jackson.databind.DatabindContext)v2).setAttribute(((java.lang.Object)v3),((java.lang.Object)v6));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = "array";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = "array";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = "array";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = java.util.EnumSet.of(((java.lang.Enum)v4),((java.lang.Enum)v6),((java.lang.Enum)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v9));
    Object v11 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v10));
    Object v12 = ((com.fasterxml.jackson.databind.DatabindContext)v2).constructType(((java.lang.reflect.Type)v11));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = "array";
    Object v7 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v6));
    Object v8 = "array";
    Object v9 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v8));
    Object v10 = "array";
    Object v11 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v10));
    Object v12 = java.util.EnumSet.of(((java.lang.Enum)v7),((java.lang.Enum)v9),((java.lang.Enum)v11));
    Object v13 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v12));
    Object v14 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v13));
    Object v15 = "array";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v15));
    Object v17 = "array";
    Object v18 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v17));
    Object v19 = "array";
    Object v20 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v19));
    Object v21 = java.util.EnumSet.of(((java.lang.Enum)v16),((java.lang.Enum)v18),((java.lang.Enum)v20));
    Object v22 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v21));
    Object v23 = ((com.fasterxml.jackson.databind.DatabindContext)v5).constructSpecializedType(((com.fasterxml.jackson.databind.JavaType)v14),((java.lang.Class)v22));
    Object v24 = "!";
    Object v25 = ((com.fasterxml.jackson.databind.DatabindContext)v2).resolveSubType(((com.fasterxml.jackson.databind.JavaType)v23),((java.lang.String)v24));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.exc.InvalidTypeIdException");
    } catch (com.fasterxml.jackson.databind.exc.InvalidTypeIdException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = "array";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = "array";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = "array";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = java.util.EnumSet.of(((java.lang.Enum)v4),((java.lang.Enum)v6),((java.lang.Enum)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v9));
    Object v11 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v10));
    Object v12 = "in>eger";
    Object v13 = ((com.fasterxml.jackson.databind.DatabindContext)v2).resolveSubType(((com.fasterxml.jackson.databind.JavaType)v11),((java.lang.String)v12));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.exc.InvalidTypeIdException");
    } catch (com.fasterxml.jackson.databind.exc.InvalidTypeIdException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = "array";
    Object v7 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v6));
    Object v8 = "array";
    Object v9 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v8));
    Object v10 = "array";
    Object v11 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v10));
    Object v12 = java.util.EnumSet.of(((java.lang.Enum)v7),((java.lang.Enum)v9),((java.lang.Enum)v11));
    Object v13 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v12));
    Object v14 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v13));
    Object v15 = "array";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v15));
    Object v17 = "array";
    Object v18 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v17));
    Object v19 = "array";
    Object v20 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v19));
    Object v21 = java.util.EnumSet.of(((java.lang.Enum)v16),((java.lang.Enum)v18),((java.lang.Enum)v20));
    Object v22 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v21));
    Object v23 = ((com.fasterxml.jackson.databind.DatabindContext)v5).constructSpecializedType(((com.fasterxml.jackson.databind.JavaType)v14),((java.lang.Class)v22));
    Object v24 = "array";
    Object v25 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v24));
    Object v26 = "array";
    Object v27 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v26));
    Object v28 = "array";
    Object v29 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v28));
    Object v30 = java.util.EnumSet.of(((java.lang.Enum)v25),((java.lang.Enum)v27),((java.lang.Enum)v29));
    Object v31 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v30));
    Object v32 = ((com.fasterxml.jackson.databind.DatabindContext)v2).constructSpecializedType(((com.fasterxml.jackson.databind.JavaType)v23),((java.lang.Class)v31));
    Object v33 = "";
    Object v34 = new java.lang.Object[]{};
    Object v35 = ((com.fasterxml.jackson.databind.DatabindContext)v2)._format(((java.lang.String)v33),((java.lang.Object[])v34));
    org.junit.Assert.assertEquals((Object)(""), v35);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = ((com.fasterxml.jackson.databind.DatabindContext)v2).getActiveView();
    Object v4 = "array";
    Object v5 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v4));
    Object v6 = "array";
    Object v7 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v6));
    Object v8 = "array";
    Object v9 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v8));
    Object v10 = java.util.EnumSet.of(((java.lang.Enum)v5),((java.lang.Enum)v7),((java.lang.Enum)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v10));
    Object v12 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v11));
    Object v13 = " knoZwn properties: ";
    Object v14 = "CAN_OVERRIDE_ACCESS_MODIFIERS";
    Object v15 = ((com.fasterxml.jackson.databind.DatabindContext)v2).invalidTypeIdException(((com.fasterxml.jackson.databind.JavaType)v12),((java.lang.String)v13),((java.lang.String)v14));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = ((com.fasterxml.jackson.databind.DatabindContext)v2).getActiveView();
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = "array";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = "array";
    Object v10 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v9));
    Object v11 = "array";
    Object v12 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v11));
    Object v13 = java.util.EnumSet.of(((java.lang.Enum)v8),((java.lang.Enum)v10),((java.lang.Enum)v12));
    Object v14 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v13));
    Object v15 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v14));
    Object v16 = "array";
    Object v17 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v16));
    Object v18 = "array";
    Object v19 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v18));
    Object v20 = "array";
    Object v21 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v20));
    Object v22 = java.util.EnumSet.of(((java.lang.Enum)v17),((java.lang.Enum)v19),((java.lang.Enum)v21));
    Object v23 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v22));
    Object v24 = ((com.fasterxml.jackson.databind.DatabindContext)v6).constructSpecializedType(((com.fasterxml.jackson.databind.JavaType)v15),((java.lang.Class)v23));
    Object v25 = "array";
    Object v26 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v25));
    Object v27 = "array";
    Object v28 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v27));
    Object v29 = "array";
    Object v30 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v29));
    Object v31 = java.util.EnumSet.of(((java.lang.Enum)v26),((java.lang.Enum)v28),((java.lang.Enum)v30));
    Object v32 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v31));
    Object v33 = ((com.fasterxml.jackson.databind.DatabindContext)v2).constructSpecializedType(((com.fasterxml.jackson.databind.JavaType)v24),((java.lang.Class)v32));
    org.junit.Assert.assertNotNull(v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = ((com.fasterxml.jackson.databind.DatabindContext)v5).getConfig();
    Object v7 = "array";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = "array";
    Object v10 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v9));
    Object v11 = "array";
    Object v12 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v11));
    Object v13 = java.util.EnumSet.of(((java.lang.Enum)v8),((java.lang.Enum)v10),((java.lang.Enum)v12));
    Object v14 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v13));
    Object v15 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v14));
    Object v16 = "array";
    Object v17 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v16));
    Object v18 = "array";
    Object v19 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v18));
    Object v20 = "array";
    Object v21 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v20));
    Object v22 = java.util.EnumSet.of(((java.lang.Enum)v17),((java.lang.Enum)v19),((java.lang.Enum)v21));
    Object v23 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v22));
    Object v24 = ((com.fasterxml.jackson.databind.DatabindContext)v5).constructSpecializedType(((com.fasterxml.jackson.databind.JavaType)v15),((java.lang.Class)v23));
    Object v25 = ((com.fasterxml.jackson.databind.JavaType)v24).isEnumType();
    Object v26 = "kuild";
    Object v27 = ((com.fasterxml.jackson.databind.DatabindContext)v2).resolveSubType(((com.fasterxml.jackson.databind.JavaType)v24),((java.lang.String)v26));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.exc.InvalidTypeIdException");
    } catch (com.fasterxml.jackson.databind.exc.InvalidTypeIdException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = "U";
    Object v4 = "T";
    Object v5 = ((com.fasterxml.jackson.databind.DatabindContext)v2)._colonConcat(((java.lang.String)v3),((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)("U: T"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = ((com.fasterxml.jackson.databind.DatabindContext)v2).getActiveView();
    Object v4 = "array";
    Object v5 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v4));
    Object v6 = "array";
    Object v7 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v6));
    Object v8 = "array";
    Object v9 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v8));
    Object v10 = java.util.EnumSet.of(((java.lang.Enum)v5),((java.lang.Enum)v7),((java.lang.Enum)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v10));
    Object v12 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v11));
    Object v13 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v14 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v13));
    Object v15 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v14));
    Object v16 = ":]";
    Object v17 = new java.lang.Object[]{};
    Object v18 = ((com.fasterxml.jackson.databind.DatabindContext)v15)._format(((java.lang.String)v16),((java.lang.Object[])v17));
    Object v19 = new java.lang.StringBuilder(((java.lang.CharSequence)v18));
    Object v20 = ((com.fasterxml.jackson.databind.JavaType)v12).getErasedSignature(((java.lang.StringBuilder)v19));
    Object v21 = ", ";
    Object v22 = ((com.fasterxml.jackson.databind.DatabindContext)v2).reportBadDefinition(((com.fasterxml.jackson.databind.JavaType)v12),((java.lang.String)v21));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.exc.InvalidDefinitionException");
    } catch (com.fasterxml.jackson.databind.exc.InvalidDefinitionException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = "W";
    Object v4 = ((com.fasterxml.jackson.databind.DatabindContext)v2)._desc(((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)("W"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = ((com.fasterxml.jackson.databind.DatabindContext)v5).getConfig();
    Object v7 = "array";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = "array";
    Object v10 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v9));
    Object v11 = "array";
    Object v12 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v11));
    Object v13 = java.util.EnumSet.of(((java.lang.Enum)v8),((java.lang.Enum)v10),((java.lang.Enum)v12));
    Object v14 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v13));
    Object v15 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v14));
    Object v16 = "array";
    Object v17 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v16));
    Object v18 = "array";
    Object v19 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v18));
    Object v20 = "array";
    Object v21 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v20));
    Object v22 = java.util.EnumSet.of(((java.lang.Enum)v17),((java.lang.Enum)v19),((java.lang.Enum)v21));
    Object v23 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v22));
    Object v24 = ((com.fasterxml.jackson.databind.DatabindContext)v5).constructSpecializedType(((com.fasterxml.jackson.databind.JavaType)v15),((java.lang.Class)v23));
    Object v25 = "AnnotationIntrospector returned Class ";
    Object v26 = "";
    Object v27 = ((com.fasterxml.jackson.databind.DatabindContext)v2).invalidTypeIdException(((com.fasterxml.jackson.databind.JavaType)v24),((java.lang.String)v25),((java.lang.String)v26));
    org.junit.Assert.assertNotNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = ((com.fasterxml.jackson.databind.DatabindContext)v5).getConfig();
    Object v7 = "array";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = "array";
    Object v10 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v9));
    Object v11 = "array";
    Object v12 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v11));
    Object v13 = java.util.EnumSet.of(((java.lang.Enum)v8),((java.lang.Enum)v10),((java.lang.Enum)v12));
    Object v14 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v13));
    Object v15 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v14));
    Object v16 = "array";
    Object v17 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v16));
    Object v18 = "array";
    Object v19 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v18));
    Object v20 = "array";
    Object v21 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v20));
    Object v22 = java.util.EnumSet.of(((java.lang.Enum)v17),((java.lang.Enum)v19),((java.lang.Enum)v21));
    Object v23 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v22));
    Object v24 = ((com.fasterxml.jackson.databind.DatabindContext)v5).constructSpecializedType(((com.fasterxml.jackson.databind.JavaType)v15),((java.lang.Class)v23));
    Object v25 = ((com.fasterxml.jackson.databind.JavaType)v24).getBindings();
    Object v26 = "Internal e";
    Object v27 = "&";
    Object v28 = ((com.fasterxml.jackson.databind.DatabindContext)v2).invalidTypeIdException(((com.fasterxml.jackson.databind.JavaType)v24),((java.lang.String)v26),((java.lang.String)v27));
    org.junit.Assert.assertNotNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = com.fasterxml.jackson.databind.MapperFeature.USE_ANNOTATIONS;
    Object v4 = ((com.fasterxml.jackson.databind.DatabindContext)v2).isEnabled(((com.fasterxml.jackson.databind.MapperFeature)v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = com.fasterxml.jackson.databind.MapperFeature.AUTO_DETECT_SETTERS;
    Object v4 = ((com.fasterxml.jackson.databind.DatabindContext)v2).isEnabled(((com.fasterxml.jackson.databind.MapperFeature)v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = ((com.fasterxml.jackson.databind.DatabindContext)v2).getConfig();
    Object v4 = "array";
    Object v5 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v4));
    Object v6 = "array";
    Object v7 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v6));
    Object v8 = ((com.fasterxml.jackson.databind.DatabindContext)v2).setAttribute(((java.lang.Object)v5),((java.lang.Object)v7));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = "number";
    Object v4 = ((com.fasterxml.jackson.databind.DatabindContext)v2)._truncate(((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)("number"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = ((com.fasterxml.jackson.databind.DatabindContext)v2).getConfig();
    Object v4 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v5 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v4));
    Object v6 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v5));
    Object v7 = "integer";
    Object v8 = "";
    Object v9 = ((com.fasterxml.jackson.databind.DatabindContext)v6)._colonConcat(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = ((com.fasterxml.jackson.databind.DatabindContext)v2).getAttribute(((java.lang.Object)v9));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = "h";
    Object v4 = new java.lang.Object[]{null};
    Object v5 = ((com.fasterxml.jackson.databind.DatabindContext)v2)._format(((java.lang.String)v3),((java.lang.Object[])v4));
    org.junit.Assert.assertEquals((Object)("h"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = "can only conDvert 1-character Strings";
    Object v4 = new java.lang.Object[]{null,null,null};
    Object v5 = ((com.fasterxml.jackson.databind.DatabindContext)v2)._format(((java.lang.String)v3),((java.lang.Object[])v4));
    org.junit.Assert.assertEquals((Object)("can only conDvert 1-character Strings"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v4 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v3));
    Object v5 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v4));
    Object v6 = ((com.fasterxml.jackson.databind.DatabindContext)v5).getConfig();
    Object v7 = "array";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = "array";
    Object v10 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v9));
    Object v11 = "array";
    Object v12 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v11));
    Object v13 = java.util.EnumSet.of(((java.lang.Enum)v8),((java.lang.Enum)v10),((java.lang.Enum)v12));
    Object v14 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v13));
    Object v15 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v14));
    Object v16 = "array";
    Object v17 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v16));
    Object v18 = "array";
    Object v19 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v18));
    Object v20 = "array";
    Object v21 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v20));
    Object v22 = java.util.EnumSet.of(((java.lang.Enum)v17),((java.lang.Enum)v19),((java.lang.Enum)v21));
    Object v23 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v22));
    Object v24 = ((com.fasterxml.jackson.databind.DatabindContext)v5).constructSpecializedType(((com.fasterxml.jackson.databind.JavaType)v15),((java.lang.Class)v23));
    Object v25 = "array";
    Object v26 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v25));
    Object v27 = "array";
    Object v28 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v27));
    Object v29 = "array";
    Object v30 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v29));
    Object v31 = java.util.EnumSet.of(((java.lang.Enum)v26),((java.lang.Enum)v28),((java.lang.Enum)v30));
    Object v32 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v31));
    Object v33 = ((com.fasterxml.jackson.databind.DatabindContext)v2).constructSpecializedType(((com.fasterxml.jackson.databind.JavaType)v24),((java.lang.Class)v32));
    org.junit.Assert.assertNotNull(v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = "]";
    Object v4 = new java.lang.Object[]{};
    Object v5 = ((com.fasterxml.jackson.databind.DatabindContext)v2)._format(((java.lang.String)v3),((java.lang.Object[])v4));
    org.junit.Assert.assertEquals((Object)("]"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = "array";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = "array";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = "array";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = java.util.EnumSet.of(((java.lang.Enum)v4),((java.lang.Enum)v6),((java.lang.Enum)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v9));
    Object v11 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v10));
    Object v12 = ": ";
    Object v13 = "an>";
    Object v14 = ((com.fasterxml.jackson.databind.DatabindContext)v2).invalidTypeIdException(((com.fasterxml.jackson.databind.JavaType)v11),((java.lang.String)v12),((java.lang.String)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = ((com.fasterxml.jackson.databind.DatabindContext)v2).getActiveView();
    Object v4 = ((com.fasterxml.jackson.databind.DatabindContext)v2).getTypeFactory();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = ")";
    Object v4 = ((com.fasterxml.jackson.databind.DatabindContext)v2)._quotedString(((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)("\")\""), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = com.fasterxml.jackson.databind.MapperFeature.AUTO_DETECT_IS_GETTERS;
    Object v4 = ((com.fasterxml.jackson.databind.DatabindContext)v2).isEnabled(((com.fasterxml.jackson.databind.MapperFeature)v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = ((com.fasterxml.jackson.databind.DatabindContext)v2).getActiveView();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v5 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v6 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v4),((com.fasterxml.jackson.databind.type.TypeBindings)v5));
    Object v7 = "array";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = "array";
    Object v10 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v9));
    Object v11 = "array";
    Object v12 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v11));
    Object v13 = java.util.EnumSet.of(((java.lang.Enum)v8),((java.lang.Enum)v10),((java.lang.Enum)v12));
    Object v14 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v13));
    Object v15 = " Sntries, got ";
    Object v16 = "array";
    Object v17 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v16));
    Object v18 = "array";
    Object v19 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v18));
    Object v20 = "array";
    Object v21 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v20));
    Object v22 = java.util.EnumSet.of(((java.lang.Enum)v17),((java.lang.Enum)v19),((java.lang.Enum)v21));
    Object v23 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v22));
    Object v24 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v23));
    Object v25 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v6),((java.lang.Class)v14),((java.lang.String)v15),((com.fasterxml.jackson.databind.JavaType)v24));
    Object v26 = ((com.fasterxml.jackson.databind.introspect.Annotated)v25).getGenericType();
    Object v27 = "array";
    Object v28 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v27));
    Object v29 = ((com.fasterxml.jackson.databind.DatabindContext)v2).converterInstance(((com.fasterxml.jackson.databind.introspect.Annotated)v25),((java.lang.Object)v28));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v4 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v5 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v3),((com.fasterxml.jackson.databind.type.TypeBindings)v4));
    Object v6 = "array";
    Object v7 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v6));
    Object v8 = "array";
    Object v9 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v8));
    Object v10 = "array";
    Object v11 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v10));
    Object v12 = java.util.EnumSet.of(((java.lang.Enum)v7),((java.lang.Enum)v9),((java.lang.Enum)v11));
    Object v13 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v12));
    Object v14 = " Sntries, got ";
    Object v15 = "array";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v15));
    Object v17 = "array";
    Object v18 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v17));
    Object v19 = "array";
    Object v20 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v19));
    Object v21 = java.util.EnumSet.of(((java.lang.Enum)v16),((java.lang.Enum)v18),((java.lang.Enum)v20));
    Object v22 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v21));
    Object v23 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v22));
    Object v24 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v5),((java.lang.Class)v13),((java.lang.String)v14),((com.fasterxml.jackson.databind.JavaType)v23));
    Object v25 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v26 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v25));
    Object v27 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v26));
    Object v28 = "tring";
    Object v29 = ((com.fasterxml.jackson.databind.DatabindContext)v27)._truncate(((java.lang.String)v28));
    Object v30 = ((com.fasterxml.jackson.databind.DatabindContext)v2).converterInstance(((com.fasterxml.jackson.databind.introspect.Annotated)v24),((java.lang.Object)v29));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = "array";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = "array";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = "array";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = java.util.EnumSet.of(((java.lang.Enum)v4),((java.lang.Enum)v6),((java.lang.Enum)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v9));
    Object v11 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v10));
    Object v12 = "array";
    Object v13 = ((com.fasterxml.jackson.databind.DatabindContext)v2).reportBadDefinition(((com.fasterxml.jackson.databind.JavaType)v11),((java.lang.String)v12));
      org.junit.Assert.fail("Expected com.fasterxml.jackson.databind.exc.InvalidDefinitionException");
    } catch (com.fasterxml.jackson.databind.exc.InvalidDefinitionException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig();
    Object v1 = new com.fasterxml.jackson.databind.deser.BeanDeserializerFactory(((com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig)v0));
    Object v2 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((com.fasterxml.jackson.databind.deser.DeserializerFactory)v1));
    Object v3 = ((com.fasterxml.jackson.databind.DatabindContext)v2).getConfig();
    Object v4 = ((com.fasterxml.jackson.databind.DatabindContext)v2).getConfig();
    org.junit.Assert.assertNull(v4);
  }
}
