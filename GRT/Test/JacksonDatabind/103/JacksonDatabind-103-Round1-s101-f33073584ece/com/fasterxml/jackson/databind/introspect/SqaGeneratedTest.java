package com.fasterxml.jackson.databind.introspect;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = null;
    Object v1 = 15;
    Object v2 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v1).intValue()));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = 15;
    Object v5 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v4).intValue()));
    Object v6 = 15;
    Object v7 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v6).intValue()));
    Object v8 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = 15;
    Object v10 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotatedClass(((java.lang.Class)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v12));
    Object v14 = com.fasterxml.jackson.annotation.JsonInclude.Value.empty();
    Object v15 = ((com.fasterxml.jackson.databind.introspect.BasicBeanDescription)v13).findPropertyInclusion(((com.fasterxml.jackson.annotation.JsonInclude.Value)v14));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = null;
    Object v1 = 15;
    Object v2 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v1).intValue()));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = 15;
    Object v5 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v4).intValue()));
    Object v6 = 15;
    Object v7 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v6).intValue()));
    Object v8 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = 15;
    Object v10 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotatedClass(((java.lang.Class)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v12));
    Object v14 = ((com.fasterxml.jackson.databind.introspect.BasicBeanDescription)v13).getFactoryMethods();
    Object v15 = ((com.fasterxml.jackson.databind.introspect.BasicBeanDescription)v13).findJsonValueAccessor();
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = null;
    Object v1 = 15;
    Object v2 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v1).intValue()));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = 15;
    Object v5 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v4).intValue()));
    Object v6 = 15;
    Object v7 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v6).intValue()));
    Object v8 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = 15;
    Object v10 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotatedClass(((java.lang.Class)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v12));
    Object v14 = ((com.fasterxml.jackson.databind.BeanDescription)v13).findPOJOBuilder();
    Object v15 = ((com.fasterxml.jackson.databind.BeanDescription)v13).findAnySetter();
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = null;
    Object v1 = 15;
    Object v2 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v1).intValue()));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = 15;
    Object v5 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v4).intValue()));
    Object v6 = 15;
    Object v7 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v6).intValue()));
    Object v8 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = 15;
    Object v10 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotatedClass(((java.lang.Class)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v12));
    Object v14 = new java.lang.Class[]{};
    Object v15 = ((com.fasterxml.jackson.databind.introspect.BasicBeanDescription)v13).findSingleArgConstructor(((java.lang.Class[])v14));
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = null;
    Object v1 = 15;
    Object v2 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v1).intValue()));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = 15;
    Object v5 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v4).intValue()));
    Object v6 = 15;
    Object v7 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v6).intValue()));
    Object v8 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = 15;
    Object v10 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotatedClass(((java.lang.Class)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v12));
    Object v14 = ((com.fasterxml.jackson.databind.introspect.BasicBeanDescription)v13).getIgnoredPropertyNames();
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = null;
    Object v1 = 15;
    Object v2 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v1).intValue()));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = 15;
    Object v5 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v4).intValue()));
    Object v6 = 15;
    Object v7 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v6).intValue()));
    Object v8 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = 15;
    Object v10 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotatedClass(((java.lang.Class)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v12));
    Object v14 = ((com.fasterxml.jackson.databind.introspect.BasicBeanDescription)v13).findPOJOBuilderConfig();
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = null;
    Object v1 = 15;
    Object v2 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v1).intValue()));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = 15;
    Object v5 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v4).intValue()));
    Object v6 = 15;
    Object v7 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v6).intValue()));
    Object v8 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = 15;
    Object v10 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotatedClass(((java.lang.Class)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v12));
    Object v14 = ((com.fasterxml.jackson.databind.BeanDescription)v13).findAnySetterField();
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = null;
    Object v1 = 15;
    Object v2 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v1).intValue()));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = 15;
    Object v5 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v4).intValue()));
    Object v6 = 15;
    Object v7 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v6).intValue()));
    Object v8 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = 15;
    Object v10 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotatedClass(((java.lang.Class)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v12));
    Object v14 = ((com.fasterxml.jackson.databind.introspect.BasicBeanDescription)v13)._properties();
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = null;
    Object v1 = 15;
    Object v2 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v1).intValue()));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = 15;
    Object v5 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v4).intValue()));
    Object v6 = 15;
    Object v7 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v6).intValue()));
    Object v8 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = 15;
    Object v10 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotatedClass(((java.lang.Class)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v12));
    Object v14 = ((com.fasterxml.jackson.databind.introspect.BasicBeanDescription)v13).findAnyGetter();
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = null;
    Object v1 = 15;
    Object v2 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v1).intValue()));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = 15;
    Object v5 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v4).intValue()));
    Object v6 = 15;
    Object v7 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v6).intValue()));
    Object v8 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = 15;
    Object v10 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotatedClass(((java.lang.Class)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v12));
    Object v14 = ((com.fasterxml.jackson.databind.introspect.BasicBeanDescription)v13).findJsonValueAccessor();
    Object v15 = ((com.fasterxml.jackson.databind.introspect.BasicBeanDescription)v13).findSerializationConverter();
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 15;
    Object v2 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v1).intValue()));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = 15;
    Object v5 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v4).intValue()));
    Object v6 = 15;
    Object v7 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v6).intValue()));
    Object v8 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = 15;
    Object v10 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotatedClass(((java.lang.Class)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v12));
    Object v14 = ",";
    Object v15 = com.fasterxml.jackson.annotation.JsonFormat.Shape.SCALAR;
    Object v16 = "boole]n";
    Object v17 = "";
    Object v18 = com.fasterxml.jackson.annotation.JsonFormat.Features.empty();
    Object v19 = new com.fasterxml.jackson.annotation.JsonFormat.Value(((java.lang.String)v14),((com.fasterxml.jackson.annotation.JsonFormat.Shape)v15),((java.lang.String)v16),((java.lang.String)v17),((com.fasterxml.jackson.annotation.JsonFormat.Features)v18));
    Object v20 = ((com.fasterxml.jackson.databind.introspect.BasicBeanDescription)v13).findExpectedFormat(((com.fasterxml.jackson.annotation.JsonFormat.Value)v19));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = null;
    Object v1 = 15;
    Object v2 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v1).intValue()));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = 15;
    Object v5 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v4).intValue()));
    Object v6 = 15;
    Object v7 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v6).intValue()));
    Object v8 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = 15;
    Object v10 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotatedClass(((java.lang.Class)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v12));
    Object v14 = ((com.fasterxml.jackson.databind.introspect.BasicBeanDescription)v13).findProperties();
    Object v15 = ((com.fasterxml.jackson.databind.introspect.BasicBeanDescription)v13).findSerializationConverter();
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 15;
    Object v2 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v1).intValue()));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = 15;
    Object v5 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v4).intValue()));
    Object v6 = 15;
    Object v7 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v6).intValue()));
    Object v8 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = 15;
    Object v10 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotatedClass(((java.lang.Class)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v12));
    Object v14 = 15;
    Object v15 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v14).intValue()));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = new com.fasterxml.jackson.databind.introspect.AnnotatedClass(((java.lang.Class)v16));
    Object v18 = 15;
    Object v19 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v18).intValue()));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v19));
    Object v21 = true;
    Object v22 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v23 = com.fasterxml.jackson.databind.introspect.CollectorBase._emptyAnnotationMap();
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null};
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v17),((java.lang.reflect.Constructor)v22),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v23),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v24));
    Object v26 = 15;
    Object v27 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v26).intValue()));
    Object v28 = 15;
    Object v29 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v28).intValue()));
    Object v30 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v29));
    Object v31 = new com.fasterxml.jackson.databind.introspect.AnnotatedClass(((java.lang.Class)v30));
    Object v32 = com.fasterxml.jackson.databind.introspect.CollectorBase._emptyAnnotationMap();
    Object v33 = 13;
    Object v34 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v25),((com.fasterxml.jackson.databind.JavaType)v27),((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v31),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v32),(((java.lang.Integer)v33).intValue()));
    Object v35 = ((com.fasterxml.jackson.databind.introspect.BasicBeanDescription)v13)._findCreatorPropertyName(((com.fasterxml.jackson.databind.introspect.AnnotatedParameter)v34));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = null;
    Object v1 = 15;
    Object v2 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v1).intValue()));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = 15;
    Object v5 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v4).intValue()));
    Object v6 = 15;
    Object v7 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v6).intValue()));
    Object v8 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = 15;
    Object v10 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotatedClass(((java.lang.Class)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v12));
    Object v14 = ((com.fasterxml.jackson.databind.introspect.BasicBeanDescription)v13).findInjectables();
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = null;
    Object v1 = 15;
    Object v2 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v1).intValue()));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = 15;
    Object v5 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v4).intValue()));
    Object v6 = 15;
    Object v7 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v6).intValue()));
    Object v8 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = 15;
    Object v10 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotatedClass(((java.lang.Class)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v12));
    Object v14 = ((com.fasterxml.jackson.databind.introspect.BasicBeanDescription)v13).findBackReferenceProperties();
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = null;
    Object v1 = 15;
    Object v2 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v1).intValue()));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = 15;
    Object v5 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v4).intValue()));
    Object v6 = 15;
    Object v7 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v6).intValue()));
    Object v8 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = 15;
    Object v10 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotatedClass(((java.lang.Class)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v12));
    Object v14 = false;
    Object v15 = ((com.fasterxml.jackson.databind.introspect.BasicBeanDescription)v13).instantiateBean((((java.lang.Boolean)v14).booleanValue()));
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = null;
    Object v1 = 15;
    Object v2 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v1).intValue()));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = 15;
    Object v5 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v4).intValue()));
    Object v6 = 15;
    Object v7 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v6).intValue()));
    Object v8 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = 15;
    Object v10 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotatedClass(((java.lang.Class)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v12));
    Object v14 = new java.lang.Class[]{null,null};
    Object v15 = ((com.fasterxml.jackson.databind.introspect.BasicBeanDescription)v13).findFactoryMethod(((java.lang.Class[])v14));
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = null;
    Object v1 = 15;
    Object v2 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v1).intValue()));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = 15;
    Object v5 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v4).intValue()));
    Object v6 = 15;
    Object v7 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v6).intValue()));
    Object v8 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = 15;
    Object v10 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotatedClass(((java.lang.Class)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v12));
    Object v14 = true;
    Object v15 = ((com.fasterxml.jackson.databind.introspect.BasicBeanDescription)v13).instantiateBean((((java.lang.Boolean)v14).booleanValue()));
    Object v16 = "Cannot upgrade from an instance of ";
    Object v17 = ((com.fasterxml.jackson.databind.introspect.BasicBeanDescription)v13).removeProperty(((java.lang.String)v16));
    org.junit.Assert.assertEquals((Object)(false), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = null;
    Object v1 = 15;
    Object v2 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v1).intValue()));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = 15;
    Object v5 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v4).intValue()));
    Object v6 = 15;
    Object v7 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v6).intValue()));
    Object v8 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = 15;
    Object v10 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotatedClass(((java.lang.Class)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v12));
    Object v14 = ((com.fasterxml.jackson.databind.BeanDescription)v13).getBeanClass();
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = null;
    Object v1 = 15;
    Object v2 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v1).intValue()));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = 15;
    Object v5 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v4).intValue()));
    Object v6 = 15;
    Object v7 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v6).intValue()));
    Object v8 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = 15;
    Object v10 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotatedClass(((java.lang.Class)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v12));
    Object v14 = ((com.fasterxml.jackson.databind.introspect.BasicBeanDescription)v13).findDeserializationConverter();
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = null;
    Object v1 = 15;
    Object v2 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v1).intValue()));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = 15;
    Object v5 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v4).intValue()));
    Object v6 = 15;
    Object v7 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v6).intValue()));
    Object v8 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = 15;
    Object v10 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotatedClass(((java.lang.Class)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v12));
    Object v14 = ((com.fasterxml.jackson.databind.introspect.BasicBeanDescription)v13).findInjectables();
    Object v15 = new java.lang.Class[]{};
    Object v16 = ((com.fasterxml.jackson.databind.introspect.BasicBeanDescription)v13).findFactoryMethod(((java.lang.Class[])v15));
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = null;
    Object v1 = 15;
    Object v2 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v1).intValue()));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = 15;
    Object v5 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v4).intValue()));
    Object v6 = 15;
    Object v7 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v6).intValue()));
    Object v8 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = 15;
    Object v10 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotatedClass(((java.lang.Class)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v12));
    Object v14 = ((com.fasterxml.jackson.databind.introspect.BasicBeanDescription)v13).findAnySetterAccessor();
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = null;
    Object v1 = 15;
    Object v2 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v1).intValue()));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = 15;
    Object v5 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v4).intValue()));
    Object v6 = 15;
    Object v7 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v6).intValue()));
    Object v8 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = 15;
    Object v10 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotatedClass(((java.lang.Class)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v12));
    Object v14 = new java.lang.Class[]{null,null,null};
    Object v15 = ((com.fasterxml.jackson.databind.introspect.BasicBeanDescription)v13).findSingleArgConstructor(((java.lang.Class[])v14));
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = null;
    Object v1 = 15;
    Object v2 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v1).intValue()));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = 15;
    Object v5 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v4).intValue()));
    Object v6 = 15;
    Object v7 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v6).intValue()));
    Object v8 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = 15;
    Object v10 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotatedClass(((java.lang.Class)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v12));
    Object v14 = ((com.fasterxml.jackson.databind.introspect.BasicBeanDescription)v13).getFactoryMethods();
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 15;
    Object v2 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v1).intValue()));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = 15;
    Object v5 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v4).intValue()));
    Object v6 = 15;
    Object v7 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v6).intValue()));
    Object v8 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = 15;
    Object v10 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotatedClass(((java.lang.Class)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v12));
    Object v14 = 15;
    Object v15 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v14).intValue()));
    Object v16 = ((com.fasterxml.jackson.databind.introspect.BasicBeanDescription)v13).resolveType(((java.lang.reflect.Type)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = null;
    Object v1 = 15;
    Object v2 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v1).intValue()));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = 15;
    Object v5 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v4).intValue()));
    Object v6 = 15;
    Object v7 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v6).intValue()));
    Object v8 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = 15;
    Object v10 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotatedClass(((java.lang.Class)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v12));
    Object v14 = null;
    Object v15 = 15;
    Object v16 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v15).intValue()));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = 15;
    Object v19 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v18).intValue()));
    Object v20 = 15;
    Object v21 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v20).intValue()));
    Object v22 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v17),((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.JavaType)v21));
    Object v23 = 15;
    Object v24 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v23).intValue()));
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v24));
    Object v26 = new com.fasterxml.jackson.databind.introspect.AnnotatedClass(((java.lang.Class)v25));
    Object v27 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v14),((com.fasterxml.jackson.databind.JavaType)v22),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v26));
    Object v28 = ((com.fasterxml.jackson.databind.introspect.BasicBeanDescription)v27)._properties();
    Object v29 = true;
    Object v30 = ((com.fasterxml.jackson.databind.introspect.BasicBeanDescription)v13)._findPropertyFields(((java.util.Collection)v28),(((java.lang.Boolean)v29).booleanValue()));
    org.junit.Assert.assertNotNull(v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = null;
    Object v1 = 15;
    Object v2 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v1).intValue()));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = 15;
    Object v5 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v4).intValue()));
    Object v6 = 15;
    Object v7 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v6).intValue()));
    Object v8 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = 15;
    Object v10 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotatedClass(((java.lang.Class)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v12));
    Object v14 = ((com.fasterxml.jackson.databind.introspect.BasicBeanDescription)v13).getFactoryMethods();
    Object v15 = new java.lang.Class[]{null,null};
    Object v16 = ((com.fasterxml.jackson.databind.introspect.BasicBeanDescription)v13).findSingleArgConstructor(((java.lang.Class[])v15));
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = null;
    Object v1 = 15;
    Object v2 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v1).intValue()));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = 15;
    Object v5 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v4).intValue()));
    Object v6 = 15;
    Object v7 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v6).intValue()));
    Object v8 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = 15;
    Object v10 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotatedClass(((java.lang.Class)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v12));
    Object v14 = ((com.fasterxml.jackson.databind.BeanDescription)v13).isNonStaticInnerClass();
    Object v15 = null;
    Object v16 = 15;
    Object v17 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v16).intValue()));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v17));
    Object v19 = 15;
    Object v20 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v19).intValue()));
    Object v21 = 15;
    Object v22 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v21).intValue()));
    Object v23 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v18),((com.fasterxml.jackson.databind.JavaType)v20),((com.fasterxml.jackson.databind.JavaType)v22));
    Object v24 = 15;
    Object v25 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v24).intValue()));
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v25));
    Object v27 = new com.fasterxml.jackson.databind.introspect.AnnotatedClass(((java.lang.Class)v26));
    Object v28 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v15),((com.fasterxml.jackson.databind.JavaType)v23),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v27));
    Object v29 = ((com.fasterxml.jackson.databind.introspect.BasicBeanDescription)v28).getIgnoredPropertyNames();
    Object v30 = ((java.util.Collection)v29).size();
    Object v31 = false;
    Object v32 = ((com.fasterxml.jackson.databind.introspect.BasicBeanDescription)v13)._findPropertyFields(((java.util.Collection)v29),(((java.lang.Boolean)v31).booleanValue()));
    org.junit.Assert.assertNotNull(v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = null;
    Object v1 = 15;
    Object v2 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v1).intValue()));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = 15;
    Object v5 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v4).intValue()));
    Object v6 = 15;
    Object v7 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v6).intValue()));
    Object v8 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = 15;
    Object v10 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotatedClass(((java.lang.Class)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v12));
    Object v14 = ((com.fasterxml.jackson.databind.introspect.BasicBeanDescription)v13).findBackReferences();
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = null;
    Object v1 = 15;
    Object v2 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v1).intValue()));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = 15;
    Object v5 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v4).intValue()));
    Object v6 = 15;
    Object v7 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v6).intValue()));
    Object v8 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = 15;
    Object v10 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotatedClass(((java.lang.Class)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v12));
    Object v14 = ((com.fasterxml.jackson.databind.introspect.BasicBeanDescription)v13).findSerializationConverter();
    Object v15 = ((com.fasterxml.jackson.databind.introspect.BasicBeanDescription)v13).findBackReferences();
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 15;
    Object v2 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v1).intValue()));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = 15;
    Object v5 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v4).intValue()));
    Object v6 = 15;
    Object v7 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v6).intValue()));
    Object v8 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = 15;
    Object v10 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotatedClass(((java.lang.Class)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v12));
    Object v14 = 15;
    Object v15 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v14).intValue()));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = ((com.fasterxml.jackson.databind.introspect.BasicBeanDescription)v13).resolveType(((java.lang.reflect.Type)v16));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = null;
    Object v1 = 15;
    Object v2 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v1).intValue()));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = 15;
    Object v5 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v4).intValue()));
    Object v6 = 15;
    Object v7 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v6).intValue()));
    Object v8 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = 15;
    Object v10 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotatedClass(((java.lang.Class)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v12));
    Object v14 = ")";
    Object v15 = "string";
    Object v16 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v14),((java.lang.String)v15));
    Object v17 = ((com.fasterxml.jackson.databind.introspect.BasicBeanDescription)v13).hasProperty(((com.fasterxml.jackson.databind.PropertyName)v16));
    org.junit.Assert.assertEquals((Object)(false), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 15;
    Object v2 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v1).intValue()));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = 15;
    Object v5 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v4).intValue()));
    Object v6 = 15;
    Object v7 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v6).intValue()));
    Object v8 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = 15;
    Object v10 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotatedClass(((java.lang.Class)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v12));
    Object v14 = ((com.fasterxml.jackson.databind.introspect.BasicBeanDescription)v13).findDefaultViews();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 15;
    Object v2 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v1).intValue()));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = 15;
    Object v5 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v4).intValue()));
    Object v6 = 15;
    Object v7 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v6).intValue()));
    Object v8 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = 15;
    Object v10 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotatedClass(((java.lang.Class)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v12));
    Object v14 = ((com.fasterxml.jackson.databind.introspect.BasicBeanDescription)v13).bindingsForBeanType();
    Object v15 = 15;
    Object v16 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v15).intValue()));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = new com.fasterxml.jackson.databind.introspect.AnnotatedClass(((java.lang.Class)v17));
    Object v19 = 15;
    Object v20 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v19).intValue()));
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = true;
    Object v23 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v21),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = com.fasterxml.jackson.databind.introspect.CollectorBase._emptyAnnotationMap();
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null};
    Object v26 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v18),((java.lang.reflect.Constructor)v23),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v24),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v25));
    Object v27 = 15;
    Object v28 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v27).intValue()));
    Object v29 = 15;
    Object v30 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v29).intValue()));
    Object v31 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v30));
    Object v32 = new com.fasterxml.jackson.databind.introspect.AnnotatedClass(((java.lang.Class)v31));
    Object v33 = com.fasterxml.jackson.databind.introspect.CollectorBase._emptyAnnotationMap();
    Object v34 = 13;
    Object v35 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v26),((com.fasterxml.jackson.databind.JavaType)v28),((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v32),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v33),(((java.lang.Integer)v34).intValue()));
    Object v36 = ((com.fasterxml.jackson.databind.introspect.Annotated)v35).isPublic();
    Object v37 = ((com.fasterxml.jackson.databind.introspect.BasicBeanDescription)v13)._findCreatorPropertyName(((com.fasterxml.jackson.databind.introspect.AnnotatedParameter)v35));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 15;
    Object v2 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v1).intValue()));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = 15;
    Object v5 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v4).intValue()));
    Object v6 = 15;
    Object v7 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v6).intValue()));
    Object v8 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = 15;
    Object v10 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotatedClass(((java.lang.Class)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v12));
    Object v14 = null;
    Object v15 = 15;
    Object v16 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v15).intValue()));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = 15;
    Object v19 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v18).intValue()));
    Object v20 = 15;
    Object v21 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v20).intValue()));
    Object v22 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v17),((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.JavaType)v21));
    Object v23 = 15;
    Object v24 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v23).intValue()));
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v24));
    Object v26 = new com.fasterxml.jackson.databind.introspect.AnnotatedClass(((java.lang.Class)v25));
    Object v27 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v14),((com.fasterxml.jackson.databind.JavaType)v22),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v26));
    Object v28 = ((com.fasterxml.jackson.databind.introspect.BasicBeanDescription)v13)._createConverter(((java.lang.Object)v27));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = null;
    Object v1 = 15;
    Object v2 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v1).intValue()));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = 15;
    Object v5 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v4).intValue()));
    Object v6 = 15;
    Object v7 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v6).intValue()));
    Object v8 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = 15;
    Object v10 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotatedClass(((java.lang.Class)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v12));
    Object v14 = ")";
    Object v15 = "string";
    Object v16 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v14),((java.lang.String)v15));
    Object v17 = ((com.fasterxml.jackson.databind.PropertyName)v16).hashCode();
    Object v18 = ((com.fasterxml.jackson.databind.introspect.BasicBeanDescription)v13).findProperty(((com.fasterxml.jackson.databind.PropertyName)v16));
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 15;
    Object v2 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v1).intValue()));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = 15;
    Object v5 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v4).intValue()));
    Object v6 = 15;
    Object v7 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v6).intValue()));
    Object v8 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = 15;
    Object v10 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotatedClass(((java.lang.Class)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v12));
    Object v14 = 15;
    Object v15 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v14).intValue()));
    Object v16 = ((com.fasterxml.jackson.databind.introspect.BasicBeanDescription)v13)._createConverter(((java.lang.Object)v15));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = null;
    Object v1 = 15;
    Object v2 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v1).intValue()));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = 15;
    Object v5 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v4).intValue()));
    Object v6 = 15;
    Object v7 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v6).intValue()));
    Object v8 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = 15;
    Object v10 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotatedClass(((java.lang.Class)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v12));
    Object v14 = ((com.fasterxml.jackson.databind.introspect.BasicBeanDescription)v13).findJsonValueMethod();
    Object v15 = ((com.fasterxml.jackson.databind.introspect.BasicBeanDescription)v13).findAnySetterAccessor();
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = null;
    Object v1 = 15;
    Object v2 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v1).intValue()));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = 15;
    Object v5 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v4).intValue()));
    Object v6 = 15;
    Object v7 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v6).intValue()));
    Object v8 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = 15;
    Object v10 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotatedClass(((java.lang.Class)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v12));
    Object v14 = ((com.fasterxml.jackson.databind.introspect.BasicBeanDescription)v13).findPOJOBuilder();
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = null;
    Object v1 = 15;
    Object v2 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v1).intValue()));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = 15;
    Object v5 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v4).intValue()));
    Object v6 = 15;
    Object v7 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v6).intValue()));
    Object v8 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = 15;
    Object v10 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotatedClass(((java.lang.Class)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v12));
    Object v14 = ((com.fasterxml.jackson.databind.introspect.BasicBeanDescription)v13).findBackReferences();
    Object v15 = ")";
    Object v16 = "string";
    Object v17 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = ((com.fasterxml.jackson.databind.introspect.BasicBeanDescription)v13).hasProperty(((com.fasterxml.jackson.databind.PropertyName)v17));
    org.junit.Assert.assertEquals((Object)(false), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = null;
    Object v1 = 15;
    Object v2 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v1).intValue()));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = 15;
    Object v5 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v4).intValue()));
    Object v6 = 15;
    Object v7 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v6).intValue()));
    Object v8 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = 15;
    Object v10 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotatedClass(((java.lang.Class)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v12));
    Object v14 = ((com.fasterxml.jackson.databind.introspect.BasicBeanDescription)v13).findSerializationConverter();
    Object v15 = ")";
    Object v16 = "string";
    Object v17 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = ((com.fasterxml.jackson.databind.introspect.BasicBeanDescription)v13).findProperty(((com.fasterxml.jackson.databind.PropertyName)v17));
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = null;
    Object v1 = 15;
    Object v2 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v1).intValue()));
    Object v3 = 15;
    Object v4 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v3).intValue()));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotatedClass(((java.lang.Class)v5));
    Object v7 = null;
    Object v8 = 15;
    Object v9 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v8).intValue()));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = 15;
    Object v12 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v11).intValue()));
    Object v13 = 15;
    Object v14 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v13).intValue()));
    Object v15 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v10),((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.JavaType)v14));
    Object v16 = 15;
    Object v17 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v16).intValue()));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v17));
    Object v19 = new com.fasterxml.jackson.databind.introspect.AnnotatedClass(((java.lang.Class)v18));
    Object v20 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v7),((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v19));
    Object v21 = ((com.fasterxml.jackson.databind.introspect.BasicBeanDescription)v20)._properties();
    Object v22 = new com.fasterxml.jackson.databind.introspect.BasicBeanDescription(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v6),((java.util.List)v21));
    org.junit.Assert.assertNotNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = null;
    Object v1 = 15;
    Object v2 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v1).intValue()));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = 15;
    Object v5 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v4).intValue()));
    Object v6 = 15;
    Object v7 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v6).intValue()));
    Object v8 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = 15;
    Object v10 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotatedClass(((java.lang.Class)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v12));
    Object v14 = ((com.fasterxml.jackson.databind.introspect.BasicBeanDescription)v13).findSerializationConverter();
    Object v15 = ((com.fasterxml.jackson.databind.introspect.BasicBeanDescription)v13).findJsonValueMethod();
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = null;
    Object v1 = 15;
    Object v2 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v1).intValue()));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = 15;
    Object v5 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v4).intValue()));
    Object v6 = 15;
    Object v7 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v6).intValue()));
    Object v8 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = 15;
    Object v10 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotatedClass(((java.lang.Class)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v12));
    Object v14 = null;
    Object v15 = 15;
    Object v16 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v15).intValue()));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = 15;
    Object v19 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v18).intValue()));
    Object v20 = 15;
    Object v21 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v20).intValue()));
    Object v22 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v17),((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.JavaType)v21));
    Object v23 = 15;
    Object v24 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v23).intValue()));
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v24));
    Object v26 = new com.fasterxml.jackson.databind.introspect.AnnotatedClass(((java.lang.Class)v25));
    Object v27 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v14),((com.fasterxml.jackson.databind.JavaType)v22),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v26));
    Object v28 = ((com.fasterxml.jackson.databind.introspect.BasicBeanDescription)v27).getFactoryMethods();
    Object v29 = false;
    Object v30 = ((com.fasterxml.jackson.databind.introspect.BasicBeanDescription)v13)._findPropertyFields(((java.util.Collection)v28),(((java.lang.Boolean)v29).booleanValue()));
    org.junit.Assert.assertNotNull(v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 15;
    Object v2 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v1).intValue()));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = 15;
    Object v5 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v4).intValue()));
    Object v6 = 15;
    Object v7 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v6).intValue()));
    Object v8 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = 15;
    Object v10 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotatedClass(((java.lang.Class)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v12));
    Object v14 = null;
    Object v15 = ((com.fasterxml.jackson.databind.introspect.BasicBeanDescription)v13).addProperty(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition)v14));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 15;
    Object v2 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v1).intValue()));
    Object v3 = 15;
    Object v4 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v3).intValue()));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotatedClass(((java.lang.Class)v5));
    Object v7 = null;
    Object v8 = 15;
    Object v9 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v8).intValue()));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = 15;
    Object v12 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v11).intValue()));
    Object v13 = 15;
    Object v14 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v13).intValue()));
    Object v15 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v10),((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.JavaType)v14));
    Object v16 = 15;
    Object v17 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v16).intValue()));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v17));
    Object v19 = new com.fasterxml.jackson.databind.introspect.AnnotatedClass(((java.lang.Class)v18));
    Object v20 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v7),((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v19));
    Object v21 = ((com.fasterxml.jackson.databind.introspect.BasicBeanDescription)v20)._properties();
    Object v22 = new com.fasterxml.jackson.databind.introspect.BasicBeanDescription(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v6),((java.util.List)v21));
    Object v23 = ((com.fasterxml.jackson.databind.introspect.BasicBeanDescription)v22).findDefaultViews();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = null;
    Object v1 = 15;
    Object v2 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v1).intValue()));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = 15;
    Object v5 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v4).intValue()));
    Object v6 = 15;
    Object v7 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v6).intValue()));
    Object v8 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = 15;
    Object v10 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotatedClass(((java.lang.Class)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v12));
    Object v14 = ((com.fasterxml.jackson.databind.introspect.BasicBeanDescription)v13).findClassDescription();
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = null;
    Object v1 = 15;
    Object v2 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v1).intValue()));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = 15;
    Object v5 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v4).intValue()));
    Object v6 = 15;
    Object v7 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v6).intValue()));
    Object v8 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = 15;
    Object v10 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotatedClass(((java.lang.Class)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v12));
    Object v14 = false;
    Object v15 = ((com.fasterxml.jackson.databind.introspect.BasicBeanDescription)v13).instantiateBean((((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ")";
    Object v17 = "string";
    Object v18 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v16),((java.lang.String)v17));
    Object v19 = ((com.fasterxml.jackson.databind.introspect.BasicBeanDescription)v13).findProperty(((com.fasterxml.jackson.databind.PropertyName)v18));
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = null;
    Object v1 = 15;
    Object v2 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v1).intValue()));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = 15;
    Object v5 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v4).intValue()));
    Object v6 = 15;
    Object v7 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v6).intValue()));
    Object v8 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = 15;
    Object v10 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotatedClass(((java.lang.Class)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v12));
    Object v14 = ((com.fasterxml.jackson.databind.introspect.BasicBeanDescription)v13).findJsonValueAccessor();
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = null;
    Object v1 = 15;
    Object v2 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v1).intValue()));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = 15;
    Object v5 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v4).intValue()));
    Object v6 = 15;
    Object v7 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v6).intValue()));
    Object v8 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = 15;
    Object v10 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotatedClass(((java.lang.Class)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v12));
    Object v14 = "";
    Object v15 = ((com.fasterxml.jackson.databind.introspect.BasicBeanDescription)v13).removeProperty(((java.lang.String)v14));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = null;
    Object v1 = 15;
    Object v2 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v1).intValue()));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = 15;
    Object v5 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v4).intValue()));
    Object v6 = 15;
    Object v7 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v6).intValue()));
    Object v8 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = 15;
    Object v10 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotatedClass(((java.lang.Class)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v12));
    Object v14 = new java.lang.Class[]{};
    Object v15 = ((com.fasterxml.jackson.databind.introspect.BasicBeanDescription)v13).findFactoryMethod(((java.lang.Class[])v14));
    Object v16 = com.fasterxml.jackson.annotation.JsonInclude.Value.empty();
    Object v17 = ")";
    Object v18 = "string";
    Object v19 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v17),((java.lang.String)v18));
    Object v20 = ((com.fasterxml.jackson.annotation.JsonInclude.Value)v16).equals(((java.lang.Object)v19));
    Object v21 = ((com.fasterxml.jackson.databind.introspect.BasicBeanDescription)v13).findPropertyInclusion(((com.fasterxml.jackson.annotation.JsonInclude.Value)v16));
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = null;
    Object v1 = 15;
    Object v2 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v1).intValue()));
    Object v3 = 15;
    Object v4 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v3).intValue()));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotatedClass(((java.lang.Class)v5));
    Object v7 = null;
    Object v8 = 15;
    Object v9 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v8).intValue()));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = 15;
    Object v12 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v11).intValue()));
    Object v13 = 15;
    Object v14 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v13).intValue()));
    Object v15 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v10),((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.JavaType)v14));
    Object v16 = 15;
    Object v17 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v16).intValue()));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v17));
    Object v19 = new com.fasterxml.jackson.databind.introspect.AnnotatedClass(((java.lang.Class)v18));
    Object v20 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v7),((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v19));
    Object v21 = ((com.fasterxml.jackson.databind.introspect.BasicBeanDescription)v20)._properties();
    Object v22 = new com.fasterxml.jackson.databind.introspect.BasicBeanDescription(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v6),((java.util.List)v21));
    Object v23 = ((com.fasterxml.jackson.databind.introspect.BasicBeanDescription)v22).findAnySetterAccessor();
    org.junit.Assert.assertNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = null;
    Object v1 = 15;
    Object v2 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v1).intValue()));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = 15;
    Object v5 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v4).intValue()));
    Object v6 = 15;
    Object v7 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v6).intValue()));
    Object v8 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = 15;
    Object v10 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotatedClass(((java.lang.Class)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v12));
    Object v14 = ((com.fasterxml.jackson.databind.introspect.BasicBeanDescription)v13).hasKnownClassAnnotations();
    Object v15 = ((com.fasterxml.jackson.databind.introspect.BasicBeanDescription)v13).findClassDescription();
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = null;
    Object v1 = 15;
    Object v2 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v1).intValue()));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = 15;
    Object v5 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v4).intValue()));
    Object v6 = 15;
    Object v7 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v6).intValue()));
    Object v8 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = 15;
    Object v10 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotatedClass(((java.lang.Class)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v12));
    Object v14 = new java.lang.Class[]{null};
    Object v15 = ((com.fasterxml.jackson.databind.introspect.BasicBeanDescription)v13).findSingleArgConstructor(((java.lang.Class[])v14));
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = null;
    Object v1 = 15;
    Object v2 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v1).intValue()));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = 15;
    Object v5 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v4).intValue()));
    Object v6 = 15;
    Object v7 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v6).intValue()));
    Object v8 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = 15;
    Object v10 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotatedClass(((java.lang.Class)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v12));
    Object v14 = ((com.fasterxml.jackson.databind.introspect.BasicBeanDescription)v13).findInjectables();
    Object v15 = "Cannot call setValue() Mon constructor parameter of ";
    Object v16 = ((com.fasterxml.jackson.databind.introspect.BasicBeanDescription)v13).removeProperty(((java.lang.String)v15));
    org.junit.Assert.assertEquals((Object)(false), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 15;
    Object v2 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v1).intValue()));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = 15;
    Object v5 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v4).intValue()));
    Object v6 = 15;
    Object v7 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v6).intValue()));
    Object v8 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = 15;
    Object v10 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotatedClass(((java.lang.Class)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v12));
    Object v14 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v15 = ((com.fasterxml.jackson.databind.introspect.BasicBeanDescription)v13)._createConverter(((java.lang.Object)v14));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forSerialization(((com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector)v0));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = null;
    Object v1 = 15;
    Object v2 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v1).intValue()));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = 15;
    Object v5 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v4).intValue()));
    Object v6 = 15;
    Object v7 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v6).intValue()));
    Object v8 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = 15;
    Object v10 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotatedClass(((java.lang.Class)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v12));
    Object v14 = ((com.fasterxml.jackson.databind.BeanDescription)v13).findAnySetter();
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = null;
    Object v1 = 15;
    Object v2 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v1).intValue()));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = 15;
    Object v5 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v4).intValue()));
    Object v6 = 15;
    Object v7 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v6).intValue()));
    Object v8 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = 15;
    Object v10 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotatedClass(((java.lang.Class)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v12));
    Object v14 = ((com.fasterxml.jackson.databind.introspect.BasicBeanDescription)v13).findSerializationConverter();
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = null;
    Object v1 = 15;
    Object v2 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v1).intValue()));
    Object v3 = 15;
    Object v4 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v3).intValue()));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotatedClass(((java.lang.Class)v5));
    Object v7 = null;
    Object v8 = 15;
    Object v9 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v8).intValue()));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = 15;
    Object v12 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v11).intValue()));
    Object v13 = 15;
    Object v14 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v13).intValue()));
    Object v15 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v10),((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.JavaType)v14));
    Object v16 = 15;
    Object v17 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v16).intValue()));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v17));
    Object v19 = new com.fasterxml.jackson.databind.introspect.AnnotatedClass(((java.lang.Class)v18));
    Object v20 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v7),((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v19));
    Object v21 = ((com.fasterxml.jackson.databind.introspect.BasicBeanDescription)v20)._properties();
    Object v22 = new com.fasterxml.jackson.databind.introspect.BasicBeanDescription(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v6),((java.util.List)v21));
    Object v23 = ((com.fasterxml.jackson.databind.introspect.BasicBeanDescription)v22).findJsonValueAccessor();
    Object v24 = ((com.fasterxml.jackson.databind.introspect.BasicBeanDescription)v22).getIgnoredPropertyNames();
    org.junit.Assert.assertNotNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = null;
    Object v1 = 15;
    Object v2 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v1).intValue()));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = 15;
    Object v5 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v4).intValue()));
    Object v6 = 15;
    Object v7 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v6).intValue()));
    Object v8 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = 15;
    Object v10 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotatedClass(((java.lang.Class)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v12));
    Object v14 = ((com.fasterxml.jackson.databind.introspect.BasicBeanDescription)v13).findDeserializationConverter();
    Object v15 = com.fasterxml.jackson.annotation.JsonInclude.Value.empty();
    Object v16 = ((com.fasterxml.jackson.databind.introspect.BasicBeanDescription)v13).findPropertyInclusion(((com.fasterxml.jackson.annotation.JsonInclude.Value)v15));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = null;
    Object v1 = 15;
    Object v2 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v1).intValue()));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = 15;
    Object v5 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v4).intValue()));
    Object v6 = 15;
    Object v7 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v6).intValue()));
    Object v8 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = 15;
    Object v10 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotatedClass(((java.lang.Class)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v12));
    Object v14 = ((com.fasterxml.jackson.databind.BeanDescription)v13).bindingsForBeanType();
    Object v15 = ((com.fasterxml.jackson.databind.BeanDescription)v13).getType();
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = null;
    Object v1 = 15;
    Object v2 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v1).intValue()));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = 15;
    Object v5 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v4).intValue()));
    Object v6 = 15;
    Object v7 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v6).intValue()));
    Object v8 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = 15;
    Object v10 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotatedClass(((java.lang.Class)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v12));
    Object v14 = ((com.fasterxml.jackson.databind.introspect.BasicBeanDescription)v13).hasKnownClassAnnotations();
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = null;
    Object v1 = 15;
    Object v2 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v1).intValue()));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = 15;
    Object v5 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v4).intValue()));
    Object v6 = 15;
    Object v7 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v6).intValue()));
    Object v8 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = 15;
    Object v10 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotatedClass(((java.lang.Class)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v12));
    Object v14 = new java.lang.Class[]{null};
    Object v15 = ((com.fasterxml.jackson.databind.introspect.BasicBeanDescription)v13).findSingleArgConstructor(((java.lang.Class[])v14));
    Object v16 = ((com.fasterxml.jackson.databind.introspect.BasicBeanDescription)v13).findDefaultConstructor();
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = null;
    Object v1 = 15;
    Object v2 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v1).intValue()));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = 15;
    Object v5 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v4).intValue()));
    Object v6 = 15;
    Object v7 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v6).intValue()));
    Object v8 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = 15;
    Object v10 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotatedClass(((java.lang.Class)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v12));
    Object v14 = ((com.fasterxml.jackson.databind.introspect.BasicBeanDescription)v13).getFactoryMethods();
    Object v15 = ((com.fasterxml.jackson.databind.introspect.BasicBeanDescription)v13).findSerializationConverter();
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = null;
    Object v1 = 15;
    Object v2 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v1).intValue()));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = 15;
    Object v5 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v4).intValue()));
    Object v6 = 15;
    Object v7 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v6).intValue()));
    Object v8 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = 15;
    Object v10 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotatedClass(((java.lang.Class)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v12));
    Object v14 = new java.lang.Class[]{null};
    Object v15 = ((com.fasterxml.jackson.databind.introspect.BasicBeanDescription)v13).findFactoryMethod(((java.lang.Class[])v14));
    Object v16 = new java.lang.Class[]{null,null,null};
    Object v17 = ((com.fasterxml.jackson.databind.introspect.BasicBeanDescription)v13).findSingleArgConstructor(((java.lang.Class[])v16));
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = null;
    Object v1 = 15;
    Object v2 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v1).intValue()));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = 15;
    Object v5 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v4).intValue()));
    Object v6 = 15;
    Object v7 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v6).intValue()));
    Object v8 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = 15;
    Object v10 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotatedClass(((java.lang.Class)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v12));
    Object v14 = null;
    Object v15 = 15;
    Object v16 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v15).intValue()));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = 15;
    Object v19 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v18).intValue()));
    Object v20 = 15;
    Object v21 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v20).intValue()));
    Object v22 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v17),((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.JavaType)v21));
    Object v23 = 15;
    Object v24 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v23).intValue()));
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v24));
    Object v26 = new com.fasterxml.jackson.databind.introspect.AnnotatedClass(((java.lang.Class)v25));
    Object v27 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v14),((com.fasterxml.jackson.databind.JavaType)v22),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v26));
    Object v28 = ((com.fasterxml.jackson.databind.introspect.BasicBeanDescription)v27)._properties();
    Object v29 = false;
    Object v30 = ((com.fasterxml.jackson.databind.introspect.BasicBeanDescription)v13)._findPropertyFields(((java.util.Collection)v28),(((java.lang.Boolean)v29).booleanValue()));
    org.junit.Assert.assertNotNull(v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = null;
    Object v1 = 15;
    Object v2 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v1).intValue()));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = 15;
    Object v5 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v4).intValue()));
    Object v6 = 15;
    Object v7 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v6).intValue()));
    Object v8 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = 15;
    Object v10 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotatedClass(((java.lang.Class)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v12));
    Object v14 = ((com.fasterxml.jackson.databind.introspect.BasicBeanDescription)v13).findInjectables();
    Object v15 = ((com.fasterxml.jackson.databind.introspect.BasicBeanDescription)v13).findJsonValueMethod();
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = null;
    Object v1 = 15;
    Object v2 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v1).intValue()));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = 15;
    Object v5 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v4).intValue()));
    Object v6 = 15;
    Object v7 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v6).intValue()));
    Object v8 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = 15;
    Object v10 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotatedClass(((java.lang.Class)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v12));
    Object v14 = new java.lang.Class[]{null,null,null};
    Object v15 = ((com.fasterxml.jackson.databind.introspect.BasicBeanDescription)v13).findSingleArgConstructor(((java.lang.Class[])v14));
    Object v16 = true;
    Object v17 = ((com.fasterxml.jackson.databind.introspect.BasicBeanDescription)v13).instantiateBean((((java.lang.Boolean)v16).booleanValue()));
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = null;
    Object v1 = 15;
    Object v2 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v1).intValue()));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = 15;
    Object v5 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v4).intValue()));
    Object v6 = 15;
    Object v7 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v6).intValue()));
    Object v8 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = 15;
    Object v10 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotatedClass(((java.lang.Class)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v12));
    Object v14 = null;
    Object v15 = 15;
    Object v16 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v15).intValue()));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = 15;
    Object v19 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v18).intValue()));
    Object v20 = 15;
    Object v21 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v20).intValue()));
    Object v22 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v17),((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.JavaType)v21));
    Object v23 = 15;
    Object v24 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v23).intValue()));
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v24));
    Object v26 = new com.fasterxml.jackson.databind.introspect.AnnotatedClass(((java.lang.Class)v25));
    Object v27 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v14),((com.fasterxml.jackson.databind.JavaType)v22),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v26));
    Object v28 = ((com.fasterxml.jackson.databind.introspect.BasicBeanDescription)v27).getIgnoredPropertyNames();
    Object v29 = true;
    Object v30 = ((com.fasterxml.jackson.databind.introspect.BasicBeanDescription)v13)._findPropertyFields(((java.util.Collection)v28),(((java.lang.Boolean)v29).booleanValue()));
    org.junit.Assert.assertNotNull(v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = null;
    Object v1 = 15;
    Object v2 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v1).intValue()));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = 15;
    Object v5 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v4).intValue()));
    Object v6 = 15;
    Object v7 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v6).intValue()));
    Object v8 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = 15;
    Object v10 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotatedClass(((java.lang.Class)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v12));
    Object v14 = ((com.fasterxml.jackson.databind.introspect.BasicBeanDescription)v13).findSerializationConverter();
    Object v15 = ((com.fasterxml.jackson.databind.introspect.BasicBeanDescription)v13).findJsonValueAccessor();
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 15;
    Object v2 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v1).intValue()));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = 15;
    Object v5 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v4).intValue()));
    Object v6 = 15;
    Object v7 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v6).intValue()));
    Object v8 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = 15;
    Object v10 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotatedClass(((java.lang.Class)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v12));
    Object v14 = 15;
    Object v15 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v14).intValue()));
    Object v16 = ((java.lang.reflect.Type)v15).getTypeName();
    Object v17 = ((com.fasterxml.jackson.databind.introspect.BasicBeanDescription)v13).resolveType(((java.lang.reflect.Type)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = null;
    Object v1 = 15;
    Object v2 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v1).intValue()));
    Object v3 = 15;
    Object v4 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v3).intValue()));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotatedClass(((java.lang.Class)v5));
    Object v7 = null;
    Object v8 = 15;
    Object v9 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v8).intValue()));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = 15;
    Object v12 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v11).intValue()));
    Object v13 = 15;
    Object v14 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v13).intValue()));
    Object v15 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v10),((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.JavaType)v14));
    Object v16 = 15;
    Object v17 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v16).intValue()));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v17));
    Object v19 = new com.fasterxml.jackson.databind.introspect.AnnotatedClass(((java.lang.Class)v18));
    Object v20 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v7),((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v19));
    Object v21 = ((com.fasterxml.jackson.databind.introspect.BasicBeanDescription)v20)._properties();
    Object v22 = new com.fasterxml.jackson.databind.introspect.BasicBeanDescription(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v6),((java.util.List)v21));
    Object v23 = new java.lang.Class[]{null};
    Object v24 = ((com.fasterxml.jackson.databind.introspect.BasicBeanDescription)v22).findSingleArgConstructor(((java.lang.Class[])v23));
    org.junit.Assert.assertNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = null;
    Object v1 = 15;
    Object v2 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v1).intValue()));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = 15;
    Object v5 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v4).intValue()));
    Object v6 = 15;
    Object v7 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v6).intValue()));
    Object v8 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = 15;
    Object v10 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotatedClass(((java.lang.Class)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v12));
    Object v14 = ((com.fasterxml.jackson.databind.introspect.BasicBeanDescription)v13).findJsonValueMethod();
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = null;
    Object v1 = 15;
    Object v2 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v1).intValue()));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = 15;
    Object v5 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v4).intValue()));
    Object v6 = 15;
    Object v7 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v6).intValue()));
    Object v8 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = 15;
    Object v10 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotatedClass(((java.lang.Class)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v12));
    Object v14 = ((com.fasterxml.jackson.databind.introspect.BasicBeanDescription)v13).findProperties();
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 15;
    Object v2 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v1).intValue()));
    Object v3 = 15;
    Object v4 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v3).intValue()));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotatedClass(((java.lang.Class)v5));
    Object v7 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v6).getFactoryMethods();
    Object v8 = new com.fasterxml.jackson.databind.introspect.BasicBeanDescription(((com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector)v0),((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v6));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 15;
    Object v2 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v1).intValue()));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = 15;
    Object v5 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v4).intValue()));
    Object v6 = 15;
    Object v7 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v6).intValue()));
    Object v8 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = 15;
    Object v10 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotatedClass(((java.lang.Class)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v12));
    Object v14 = null;
    Object v15 = 15;
    Object v16 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v15).intValue()));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = 15;
    Object v19 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v18).intValue()));
    Object v20 = 15;
    Object v21 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v20).intValue()));
    Object v22 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v17),((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.JavaType)v21));
    Object v23 = 15;
    Object v24 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v23).intValue()));
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v24));
    Object v26 = new com.fasterxml.jackson.databind.introspect.AnnotatedClass(((java.lang.Class)v25));
    Object v27 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v14),((com.fasterxml.jackson.databind.JavaType)v22),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v26));
    Object v28 = "";
    Object v29 = ((com.fasterxml.jackson.databind.introspect.BasicBeanDescription)v27).removeProperty(((java.lang.String)v28));
    Object v30 = ((com.fasterxml.jackson.databind.introspect.BasicBeanDescription)v13)._createConverter(((java.lang.Object)v29));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = null;
    Object v1 = 15;
    Object v2 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v1).intValue()));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = 15;
    Object v5 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v4).intValue()));
    Object v6 = 15;
    Object v7 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v6).intValue()));
    Object v8 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = 15;
    Object v10 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotatedClass(((java.lang.Class)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v12));
    Object v14 = new java.lang.Class[]{null,null,null};
    Object v15 = ((com.fasterxml.jackson.databind.introspect.BasicBeanDescription)v13).findFactoryMethod(((java.lang.Class[])v14));
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 15;
    Object v2 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v1).intValue()));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = 15;
    Object v5 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v4).intValue()));
    Object v6 = 15;
    Object v7 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v6).intValue()));
    Object v8 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = 15;
    Object v10 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotatedClass(((java.lang.Class)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v12));
    Object v14 = ")";
    Object v15 = "string";
    Object v16 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v14),((java.lang.String)v15));
    Object v17 = ((com.fasterxml.jackson.databind.introspect.BasicBeanDescription)v13)._createConverter(((java.lang.Object)v16));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 15;
    Object v2 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v1).intValue()));
    Object v3 = 15;
    Object v4 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v3).intValue()));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotatedClass(((java.lang.Class)v5));
    Object v7 = null;
    Object v8 = 15;
    Object v9 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v8).intValue()));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = 15;
    Object v12 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v11).intValue()));
    Object v13 = 15;
    Object v14 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v13).intValue()));
    Object v15 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v10),((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.JavaType)v14));
    Object v16 = 15;
    Object v17 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v16).intValue()));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v17));
    Object v19 = new com.fasterxml.jackson.databind.introspect.AnnotatedClass(((java.lang.Class)v18));
    Object v20 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v7),((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v19));
    Object v21 = ((com.fasterxml.jackson.databind.introspect.BasicBeanDescription)v20)._properties();
    Object v22 = new com.fasterxml.jackson.databind.introspect.BasicBeanDescription(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v6),((java.util.List)v21));
    Object v23 = ",";
    Object v24 = com.fasterxml.jackson.annotation.JsonFormat.Shape.SCALAR;
    Object v25 = "boole]n";
    Object v26 = "";
    Object v27 = com.fasterxml.jackson.annotation.JsonFormat.Features.empty();
    Object v28 = new com.fasterxml.jackson.annotation.JsonFormat.Value(((java.lang.String)v23),((com.fasterxml.jackson.annotation.JsonFormat.Shape)v24),((java.lang.String)v25),((java.lang.String)v26),((com.fasterxml.jackson.annotation.JsonFormat.Features)v27));
    Object v29 = ((com.fasterxml.jackson.databind.introspect.BasicBeanDescription)v22).findExpectedFormat(((com.fasterxml.jackson.annotation.JsonFormat.Value)v28));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = null;
    Object v1 = 15;
    Object v2 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v1).intValue()));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = 15;
    Object v5 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v4).intValue()));
    Object v6 = 15;
    Object v7 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v6).intValue()));
    Object v8 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = 15;
    Object v10 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotatedClass(((java.lang.Class)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v12));
    Object v14 = ((com.fasterxml.jackson.databind.BeanDescription)v13).isNonStaticInnerClass();
    Object v15 = " entries)";
    Object v16 = ((com.fasterxml.jackson.databind.introspect.BasicBeanDescription)v13).removeProperty(((java.lang.String)v15));
    org.junit.Assert.assertEquals((Object)(false), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = null;
    Object v1 = 15;
    Object v2 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v1).intValue()));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = 15;
    Object v5 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v4).intValue()));
    Object v6 = 15;
    Object v7 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v6).intValue()));
    Object v8 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = 15;
    Object v10 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotatedClass(((java.lang.Class)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v12));
    Object v14 = ((com.fasterxml.jackson.databind.introspect.BasicBeanDescription)v13).findSerializationConverter();
    Object v15 = new java.lang.Class[]{};
    Object v16 = ((com.fasterxml.jackson.databind.introspect.BasicBeanDescription)v13).findFactoryMethod(((java.lang.Class[])v15));
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = null;
    Object v1 = 15;
    Object v2 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v1).intValue()));
    Object v3 = 15;
    Object v4 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v3).intValue()));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotatedClass(((java.lang.Class)v5));
    Object v7 = null;
    Object v8 = 15;
    Object v9 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v8).intValue()));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = 15;
    Object v12 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v11).intValue()));
    Object v13 = 15;
    Object v14 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v13).intValue()));
    Object v15 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v10),((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.JavaType)v14));
    Object v16 = 15;
    Object v17 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v16).intValue()));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v17));
    Object v19 = new com.fasterxml.jackson.databind.introspect.AnnotatedClass(((java.lang.Class)v18));
    Object v20 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v7),((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v19));
    Object v21 = ((com.fasterxml.jackson.databind.introspect.BasicBeanDescription)v20)._properties();
    Object v22 = new com.fasterxml.jackson.databind.introspect.BasicBeanDescription(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v6),((java.util.List)v21));
    Object v23 = ((com.fasterxml.jackson.databind.BeanDescription)v22).findAnySetter();
    org.junit.Assert.assertNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = null;
    Object v1 = 15;
    Object v2 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v1).intValue()));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = 15;
    Object v5 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v4).intValue()));
    Object v6 = 15;
    Object v7 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v6).intValue()));
    Object v8 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = 15;
    Object v10 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotatedClass(((java.lang.Class)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v12));
    Object v14 = ")";
    Object v15 = "string";
    Object v16 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v14),((java.lang.String)v15));
    Object v17 = ((com.fasterxml.jackson.databind.introspect.BasicBeanDescription)v13).findProperty(((com.fasterxml.jackson.databind.PropertyName)v16));
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = null;
    Object v1 = 15;
    Object v2 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v1).intValue()));
    Object v3 = 15;
    Object v4 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v3).intValue()));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotatedClass(((java.lang.Class)v5));
    Object v7 = null;
    Object v8 = 15;
    Object v9 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v8).intValue()));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = 15;
    Object v12 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v11).intValue()));
    Object v13 = 15;
    Object v14 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v13).intValue()));
    Object v15 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v10),((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.JavaType)v14));
    Object v16 = 15;
    Object v17 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v16).intValue()));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v17));
    Object v19 = new com.fasterxml.jackson.databind.introspect.AnnotatedClass(((java.lang.Class)v18));
    Object v20 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v7),((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v19));
    Object v21 = ((com.fasterxml.jackson.databind.introspect.BasicBeanDescription)v20)._properties();
    Object v22 = new com.fasterxml.jackson.databind.introspect.BasicBeanDescription(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v6),((java.util.List)v21));
    Object v23 = ((com.fasterxml.jackson.databind.BeanDescription)v22).isNonStaticInnerClass();
    org.junit.Assert.assertEquals((Object)(false), v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = null;
    Object v1 = 15;
    Object v2 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v1).intValue()));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = 15;
    Object v5 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v4).intValue()));
    Object v6 = 15;
    Object v7 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v6).intValue()));
    Object v8 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = 15;
    Object v10 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotatedClass(((java.lang.Class)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v12));
    Object v14 = null;
    Object v15 = 15;
    Object v16 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v15).intValue()));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = 15;
    Object v19 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v18).intValue()));
    Object v20 = 15;
    Object v21 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v20).intValue()));
    Object v22 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v17),((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.JavaType)v21));
    Object v23 = 15;
    Object v24 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v23).intValue()));
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v24));
    Object v26 = new com.fasterxml.jackson.databind.introspect.AnnotatedClass(((java.lang.Class)v25));
    Object v27 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v14),((com.fasterxml.jackson.databind.JavaType)v22),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v26));
    Object v28 = ((com.fasterxml.jackson.databind.introspect.BasicBeanDescription)v27)._properties();
    Object v29 = false;
    Object v30 = ((com.fasterxml.jackson.databind.introspect.BasicBeanDescription)v13)._findPropertyFields(((java.util.Collection)v28),(((java.lang.Boolean)v29).booleanValue()));
    Object v31 = ((com.fasterxml.jackson.databind.introspect.BasicBeanDescription)v13).getFactoryMethods();
    org.junit.Assert.assertNotNull(v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = null;
    Object v1 = 15;
    Object v2 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v1).intValue()));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = 15;
    Object v5 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v4).intValue()));
    Object v6 = 15;
    Object v7 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v6).intValue()));
    Object v8 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = 15;
    Object v10 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotatedClass(((java.lang.Class)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v12));
    Object v14 = ((com.fasterxml.jackson.databind.introspect.BasicBeanDescription)v13).findSerializationConverter();
    Object v15 = ")";
    Object v16 = "string";
    Object v17 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = ((com.fasterxml.jackson.databind.introspect.BasicBeanDescription)v13).hasProperty(((com.fasterxml.jackson.databind.PropertyName)v17));
    org.junit.Assert.assertEquals((Object)(false), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = null;
    Object v1 = 15;
    Object v2 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v1).intValue()));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = 15;
    Object v5 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v4).intValue()));
    Object v6 = 15;
    Object v7 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v6).intValue()));
    Object v8 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = 15;
    Object v10 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotatedClass(((java.lang.Class)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v12));
    Object v14 = ((com.fasterxml.jackson.databind.BeanDescription)v13).getConstructors();
    Object v15 = ((com.fasterxml.jackson.databind.BeanDescription)v13).findAnySetter();
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = null;
    Object v1 = 15;
    Object v2 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v1).intValue()));
    Object v3 = 15;
    Object v4 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v3).intValue()));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotatedClass(((java.lang.Class)v5));
    Object v7 = null;
    Object v8 = 15;
    Object v9 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v8).intValue()));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = 15;
    Object v12 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v11).intValue()));
    Object v13 = 15;
    Object v14 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v13).intValue()));
    Object v15 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v10),((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.JavaType)v14));
    Object v16 = 15;
    Object v17 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v16).intValue()));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v17));
    Object v19 = new com.fasterxml.jackson.databind.introspect.AnnotatedClass(((java.lang.Class)v18));
    Object v20 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v7),((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v19));
    Object v21 = ((com.fasterxml.jackson.databind.introspect.BasicBeanDescription)v20)._properties();
    Object v22 = new com.fasterxml.jackson.databind.introspect.BasicBeanDescription(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v6),((java.util.List)v21));
    Object v23 = ((com.fasterxml.jackson.databind.introspect.BasicBeanDescription)v22).findPOJOBuilderConfig();
    org.junit.Assert.assertNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = null;
    Object v1 = 15;
    Object v2 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v1).intValue()));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = 15;
    Object v5 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v4).intValue()));
    Object v6 = 15;
    Object v7 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v6).intValue()));
    Object v8 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = 15;
    Object v10 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotatedClass(((java.lang.Class)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v12));
    Object v14 = ((com.fasterxml.jackson.databind.introspect.BasicBeanDescription)v13).getConstructors();
    Object v15 = ((com.fasterxml.jackson.databind.introspect.BasicBeanDescription)v13).findPOJOBuilder();
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 15;
    Object v2 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v1).intValue()));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = 15;
    Object v5 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v4).intValue()));
    Object v6 = 15;
    Object v7 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v6).intValue()));
    Object v8 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = 15;
    Object v10 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotatedClass(((java.lang.Class)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v12));
    Object v14 = null;
    Object v15 = null;
    Object v16 = 15;
    Object v17 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v16).intValue()));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v17));
    Object v19 = 15;
    Object v20 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v19).intValue()));
    Object v21 = 15;
    Object v22 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v21).intValue()));
    Object v23 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v18),((com.fasterxml.jackson.databind.JavaType)v20),((com.fasterxml.jackson.databind.JavaType)v22));
    Object v24 = 15;
    Object v25 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v24).intValue()));
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v25));
    Object v27 = new com.fasterxml.jackson.databind.introspect.AnnotatedClass(((java.lang.Class)v26));
    Object v28 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v15),((com.fasterxml.jackson.databind.JavaType)v23),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v27));
    Object v29 = ((com.fasterxml.jackson.databind.introspect.BasicBeanDescription)v28).findInjectables();
    Object v30 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v14),((java.util.Map)v29));
    Object v31 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v30));
    Object v32 = ((com.fasterxml.jackson.databind.introspect.BasicBeanDescription)v13)._createConverter(((java.lang.Object)v31));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = null;
    Object v1 = 15;
    Object v2 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v1).intValue()));
    Object v3 = 15;
    Object v4 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v3).intValue()));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotatedClass(((java.lang.Class)v5));
    Object v7 = null;
    Object v8 = 15;
    Object v9 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v8).intValue()));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = 15;
    Object v12 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v11).intValue()));
    Object v13 = 15;
    Object v14 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v13).intValue()));
    Object v15 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v10),((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.JavaType)v14));
    Object v16 = 15;
    Object v17 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v16).intValue()));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v17));
    Object v19 = new com.fasterxml.jackson.databind.introspect.AnnotatedClass(((java.lang.Class)v18));
    Object v20 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v7),((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v19));
    Object v21 = ((com.fasterxml.jackson.databind.introspect.BasicBeanDescription)v20)._properties();
    Object v22 = new com.fasterxml.jackson.databind.introspect.BasicBeanDescription(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v6),((java.util.List)v21));
    Object v23 = ((com.fasterxml.jackson.databind.introspect.BasicBeanDescription)v22).findPOJOBuilder();
    org.junit.Assert.assertNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 15;
    Object v2 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v1).intValue()));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = 15;
    Object v5 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v4).intValue()));
    Object v6 = 15;
    Object v7 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v6).intValue()));
    Object v8 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = 15;
    Object v10 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotatedClass(((java.lang.Class)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v12));
    Object v14 = ((com.fasterxml.jackson.databind.introspect.BasicBeanDescription)v13).bindingsForBeanType();
    Object v15 = ",";
    Object v16 = com.fasterxml.jackson.annotation.JsonFormat.Shape.SCALAR;
    Object v17 = "boole]n";
    Object v18 = "";
    Object v19 = com.fasterxml.jackson.annotation.JsonFormat.Features.empty();
    Object v20 = new com.fasterxml.jackson.annotation.JsonFormat.Value(((java.lang.String)v15),((com.fasterxml.jackson.annotation.JsonFormat.Shape)v16),((java.lang.String)v17),((java.lang.String)v18),((com.fasterxml.jackson.annotation.JsonFormat.Features)v19));
    Object v21 = ((com.fasterxml.jackson.databind.introspect.BasicBeanDescription)v13).findExpectedFormat(((com.fasterxml.jackson.annotation.JsonFormat.Value)v20));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = null;
    Object v1 = 15;
    Object v2 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v1).intValue()));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = 15;
    Object v5 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v4).intValue()));
    Object v6 = 15;
    Object v7 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v6).intValue()));
    Object v8 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = 15;
    Object v10 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotatedClass(((java.lang.Class)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v12));
    Object v14 = ((com.fasterxml.jackson.databind.introspect.BasicBeanDescription)v13).getFactoryMethods();
    Object v15 = "";
    Object v16 = new java.lang.Class[]{null,null};
    Object v17 = ((com.fasterxml.jackson.databind.introspect.BasicBeanDescription)v13).findMethod(((java.lang.String)v15),((java.lang.Class[])v16));
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = null;
    Object v1 = 15;
    Object v2 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v1).intValue()));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = 15;
    Object v5 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v4).intValue()));
    Object v6 = 15;
    Object v7 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v6).intValue()));
    Object v8 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = 15;
    Object v10 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotatedClass(((java.lang.Class)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v12));
    Object v14 = ((com.fasterxml.jackson.databind.introspect.BasicBeanDescription)v13).findDeserializationConverter();
    Object v15 = ((com.fasterxml.jackson.databind.introspect.BasicBeanDescription)v13).findAnySetterAccessor();
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = null;
    Object v1 = 15;
    Object v2 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v1).intValue()));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = 15;
    Object v5 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v4).intValue()));
    Object v6 = 15;
    Object v7 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v6).intValue()));
    Object v8 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = 15;
    Object v10 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotatedClass(((java.lang.Class)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v12));
    Object v14 = ")";
    Object v15 = "string";
    Object v16 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v14),((java.lang.String)v15));
    Object v17 = ((com.fasterxml.jackson.databind.introspect.BasicBeanDescription)v13).hasProperty(((com.fasterxml.jackson.databind.PropertyName)v16));
    Object v18 = com.fasterxml.jackson.annotation.JsonInclude.Value.empty();
    Object v19 = ((com.fasterxml.jackson.databind.introspect.BasicBeanDescription)v13).findPropertyInclusion(((com.fasterxml.jackson.annotation.JsonInclude.Value)v18));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 15;
    Object v2 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v1).intValue()));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = 15;
    Object v5 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v4).intValue()));
    Object v6 = 15;
    Object v7 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v6).intValue()));
    Object v8 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = 15;
    Object v10 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotatedClass(((java.lang.Class)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v12));
    Object v14 = ((com.fasterxml.jackson.databind.introspect.BasicBeanDescription)v13).findAnySetterAccessor();
    Object v15 = ((com.fasterxml.jackson.databind.introspect.BasicBeanDescription)v13).findDefaultViews();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = null;
    Object v1 = 15;
    Object v2 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v1).intValue()));
    Object v3 = 15;
    Object v4 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v3).intValue()));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotatedClass(((java.lang.Class)v5));
    Object v7 = null;
    Object v8 = 15;
    Object v9 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v8).intValue()));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = 15;
    Object v12 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v11).intValue()));
    Object v13 = 15;
    Object v14 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v13).intValue()));
    Object v15 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v10),((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.JavaType)v14));
    Object v16 = 15;
    Object v17 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v16).intValue()));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v17));
    Object v19 = new com.fasterxml.jackson.databind.introspect.AnnotatedClass(((java.lang.Class)v18));
    Object v20 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v7),((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v19));
    Object v21 = ((com.fasterxml.jackson.databind.introspect.BasicBeanDescription)v20)._properties();
    Object v22 = new com.fasterxml.jackson.databind.introspect.BasicBeanDescription(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v6),((java.util.List)v21));
    Object v23 = ((com.fasterxml.jackson.databind.introspect.BasicBeanDescription)v22).findSerializationConverter();
    org.junit.Assert.assertNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = null;
    Object v1 = 15;
    Object v2 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v1).intValue()));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = 15;
    Object v5 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v4).intValue()));
    Object v6 = 15;
    Object v7 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v6).intValue()));
    Object v8 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = 15;
    Object v10 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotatedClass(((java.lang.Class)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v12));
    Object v14 = ")";
    Object v15 = "string";
    Object v16 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v14),((java.lang.String)v15));
    Object v17 = "";
    Object v18 = ((com.fasterxml.jackson.databind.PropertyName)v16).withSimpleName(((java.lang.String)v17));
    Object v19 = ((com.fasterxml.jackson.databind.introspect.BasicBeanDescription)v13).findProperty(((com.fasterxml.jackson.databind.PropertyName)v16));
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = null;
    Object v1 = 15;
    Object v2 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v1).intValue()));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = 15;
    Object v5 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v4).intValue()));
    Object v6 = 15;
    Object v7 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v6).intValue()));
    Object v8 = com.fasterxml.jackson.databind.type.MapType.construct(((java.lang.Class)v3),((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = 15;
    Object v10 = new com.fasterxml.jackson.databind.type.PlaceholderForType((((java.lang.Integer)v9).intValue()));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotatedClass(((java.lang.Class)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.BasicBeanDescription.forOtherUse(((com.fasterxml.jackson.databind.cfg.MapperConfig)v0),((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v12));
    Object v14 = ((com.fasterxml.jackson.databind.introspect.BasicBeanDescription)v13).findDefaultConstructor();
    Object v15 = ")";
    Object v16 = "string";
    Object v17 = new com.fasterxml.jackson.databind.PropertyName(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = ((com.fasterxml.jackson.databind.introspect.BasicBeanDescription)v13).findProperty(((com.fasterxml.jackson.databind.PropertyName)v17));
    org.junit.Assert.assertNull(v18);
  }
}
