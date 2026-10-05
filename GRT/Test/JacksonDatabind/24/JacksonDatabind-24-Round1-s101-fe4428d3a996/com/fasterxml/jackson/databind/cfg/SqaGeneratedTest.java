package com.fasterxml.jackson.databind.cfg;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v0).withTypeFactory(((com.fasterxml.jackson.databind.type.TypeFactory)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std.defaultInstance();
    Object v2 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v0).withVisibilityChecker(((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v0).withAnnotationIntrospector(((com.fasterxml.jackson.databind.AnnotationIntrospector)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v2 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v0).withClassIntrospector(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = null;
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = "): ";
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v2),((java.lang.Class)v4),((java.lang.String)v5),((java.lang.Class)v7));
    Object v9 = ((com.fasterxml.jackson.databind.AnnotationIntrospector)v1).findPropertyInclusion(((com.fasterxml.jackson.databind.introspect.Annotated)v8));
    Object v10 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v0).withAppendedAnnotationIntrospector(((com.fasterxml.jackson.databind.AnnotationIntrospector)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v0).getLocale();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 1;
    Object v2 = 0;
    Object v3 = java.text.DateFormat.getDateTimeInstance((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v0).withDateFormat(((java.text.DateFormat)v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.util.Locale.getDefault();
    Object v2 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v0).with(((java.util.Locale)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v2 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v0).withPropertyNamingStrategy(((com.fasterxml.jackson.databind.PropertyNamingStrategy)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v0).withInsertedAnnotationIntrospector(((com.fasterxml.jackson.databind.AnnotationIntrospector)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std.defaultInstance();
    Object v2 = com.fasterxml.jackson.annotation.PropertyAccessor.NONE;
    Object v3 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NON_PRIVATE;
    Object v4 = ((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v1).withVisibility(((com.fasterxml.jackson.annotation.PropertyAccessor)v2),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v3));
    Object v5 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v0).withVisibilityChecker(((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ")V";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v0).with(((java.util.TimeZone)v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std.defaultInstance();
    Object v3 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v5 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v6 = 1;
    Object v7 = 0;
    Object v8 = java.text.DateFormat.getDateTimeInstance((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = java.util.Locale.getDefault();
    Object v11 = ")V";
    Object v12 = java.util.TimeZone.getTimeZone(((java.lang.String)v11));
    Object v13 = null;
    Object v14 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v2),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v3),((com.fasterxml.jackson.databind.type.TypeFactory)v4),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v5),((java.text.DateFormat)v8),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v9),((java.util.Locale)v10),((java.util.TimeZone)v12),((com.fasterxml.jackson.core.Base64Variant)v13));
    Object v15 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v16 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v14).withAnnotationIntrospector(((com.fasterxml.jackson.databind.AnnotationIntrospector)v15));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std.defaultInstance();
    Object v3 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v5 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v6 = 1;
    Object v7 = 0;
    Object v8 = java.text.DateFormat.getDateTimeInstance((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = java.util.Locale.getDefault();
    Object v11 = ")V";
    Object v12 = java.util.TimeZone.getTimeZone(((java.lang.String)v11));
    Object v13 = null;
    Object v14 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v2),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v3),((com.fasterxml.jackson.databind.type.TypeFactory)v4),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v5),((java.text.DateFormat)v8),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v9),((java.util.Locale)v10),((java.util.TimeZone)v12),((com.fasterxml.jackson.core.Base64Variant)v13));
    Object v15 = java.util.Locale.getDefault();
    Object v16 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v17 = ((java.util.Locale)v15).equals(((java.lang.Object)v16));
    Object v18 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v14).with(((java.util.Locale)v15));
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std.defaultInstance();
    Object v3 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v5 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v6 = 1;
    Object v7 = 0;
    Object v8 = java.text.DateFormat.getDateTimeInstance((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = java.util.Locale.getDefault();
    Object v11 = ")V";
    Object v12 = java.util.TimeZone.getTimeZone(((java.lang.String)v11));
    Object v13 = null;
    Object v14 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v2),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v3),((com.fasterxml.jackson.databind.type.TypeFactory)v4),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v5),((java.text.DateFormat)v8),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v9),((java.util.Locale)v10),((java.util.TimeZone)v12),((com.fasterxml.jackson.core.Base64Variant)v13));
    Object v15 = ")V";
    Object v16 = java.util.TimeZone.getTimeZone(((java.lang.String)v15));
    Object v17 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v14).with(((java.util.TimeZone)v16));
    Object v18 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v19 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v14).withClassIntrospector(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v18));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std.defaultInstance();
    Object v3 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v5 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v6 = 1;
    Object v7 = 0;
    Object v8 = java.text.DateFormat.getDateTimeInstance((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = java.util.Locale.getDefault();
    Object v11 = ")V";
    Object v12 = java.util.TimeZone.getTimeZone(((java.lang.String)v11));
    Object v13 = null;
    Object v14 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v2),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v3),((com.fasterxml.jackson.databind.type.TypeFactory)v4),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v5),((java.text.DateFormat)v8),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v9),((java.util.Locale)v10),((java.util.TimeZone)v12),((com.fasterxml.jackson.core.Base64Variant)v13));
    Object v15 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v16 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v14).withAppendedAnnotationIntrospector(((com.fasterxml.jackson.databind.AnnotationIntrospector)v15));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std.defaultInstance();
    Object v3 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v5 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v6 = 1;
    Object v7 = 0;
    Object v8 = java.text.DateFormat.getDateTimeInstance((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = java.util.Locale.getDefault();
    Object v11 = ")V";
    Object v12 = java.util.TimeZone.getTimeZone(((java.lang.String)v11));
    Object v13 = null;
    Object v14 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v2),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v3),((com.fasterxml.jackson.databind.type.TypeFactory)v4),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v5),((java.text.DateFormat)v8),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v9),((java.util.Locale)v10),((java.util.TimeZone)v12),((com.fasterxml.jackson.core.Base64Variant)v13));
    Object v15 = com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std.defaultInstance();
    Object v16 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v14).withVisibilityChecker(((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v15));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std.defaultInstance();
    Object v3 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v5 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v6 = 1;
    Object v7 = 0;
    Object v8 = java.text.DateFormat.getDateTimeInstance((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = java.util.Locale.getDefault();
    Object v11 = ")V";
    Object v12 = java.util.TimeZone.getTimeZone(((java.lang.String)v11));
    Object v13 = null;
    Object v14 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v2),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v3),((com.fasterxml.jackson.databind.type.TypeFactory)v4),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v5),((java.text.DateFormat)v8),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v9),((java.util.Locale)v10),((java.util.TimeZone)v12),((com.fasterxml.jackson.core.Base64Variant)v13));
    Object v15 = 1;
    Object v16 = 0;
    Object v17 = java.text.DateFormat.getDateTimeInstance((((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v18 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v14).withDateFormat(((java.text.DateFormat)v17));
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std.defaultInstance();
    Object v3 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v5 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v6 = 1;
    Object v7 = 0;
    Object v8 = java.text.DateFormat.getDateTimeInstance((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = java.util.Locale.getDefault();
    Object v11 = ")V";
    Object v12 = java.util.TimeZone.getTimeZone(((java.lang.String)v11));
    Object v13 = null;
    Object v14 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v2),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v3),((com.fasterxml.jackson.databind.type.TypeFactory)v4),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v5),((java.text.DateFormat)v8),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v9),((java.util.Locale)v10),((java.util.TimeZone)v12),((com.fasterxml.jackson.core.Base64Variant)v13));
    Object v15 = 1;
    Object v16 = 0;
    Object v17 = java.text.DateFormat.getDateTimeInstance((((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v18 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v14).withDateFormat(((java.text.DateFormat)v17));
    Object v19 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v20 = "Trying to resolve a forward reference with id [";
    Object v21 = ((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v19).typeProperty(((java.lang.String)v20));
    Object v22 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v18).withTypeResolverBuilder(((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v19));
    org.junit.Assert.assertNotNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std.defaultInstance();
    Object v3 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v5 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v6 = 1;
    Object v7 = 0;
    Object v8 = java.text.DateFormat.getDateTimeInstance((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = java.util.Locale.getDefault();
    Object v11 = ")V";
    Object v12 = java.util.TimeZone.getTimeZone(((java.lang.String)v11));
    Object v13 = null;
    Object v14 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v2),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v3),((com.fasterxml.jackson.databind.type.TypeFactory)v4),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v5),((java.text.DateFormat)v8),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v9),((java.util.Locale)v10),((java.util.TimeZone)v12),((com.fasterxml.jackson.core.Base64Variant)v13));
    Object v15 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v16 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v14).withClassIntrospector(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v15));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std.defaultInstance();
    Object v3 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v5 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v6 = 1;
    Object v7 = 0;
    Object v8 = java.text.DateFormat.getDateTimeInstance((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = java.util.Locale.getDefault();
    Object v11 = ")V";
    Object v12 = java.util.TimeZone.getTimeZone(((java.lang.String)v11));
    Object v13 = null;
    Object v14 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v2),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v3),((com.fasterxml.jackson.databind.type.TypeFactory)v4),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v5),((java.text.DateFormat)v8),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v9),((java.util.Locale)v10),((java.util.TimeZone)v12),((com.fasterxml.jackson.core.Base64Variant)v13));
    Object v15 = java.util.Locale.getDefault();
    Object v16 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v17 = ((java.util.Locale)v15).equals(((java.lang.Object)v16));
    Object v18 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v14).with(((java.util.Locale)v15));
    Object v19 = com.fasterxml.jackson.annotation.PropertyAccessor.CREATOR;
    Object v20 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.DEFAULT;
    Object v21 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v18).withVisibility(((com.fasterxml.jackson.annotation.PropertyAccessor)v19),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v20));
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std.defaultInstance();
    Object v3 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v5 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v6 = 1;
    Object v7 = 0;
    Object v8 = java.text.DateFormat.getDateTimeInstance((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = java.util.Locale.getDefault();
    Object v11 = ")V";
    Object v12 = java.util.TimeZone.getTimeZone(((java.lang.String)v11));
    Object v13 = null;
    Object v14 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v2),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v3),((com.fasterxml.jackson.databind.type.TypeFactory)v4),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v5),((java.text.DateFormat)v8),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v9),((java.util.Locale)v10),((java.util.TimeZone)v12),((com.fasterxml.jackson.core.Base64Variant)v13));
    Object v15 = java.util.Locale.getDefault();
    Object v16 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v17 = ((java.util.Locale)v15).equals(((java.lang.Object)v16));
    Object v18 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v14).with(((java.util.Locale)v15));
    Object v19 = com.fasterxml.jackson.annotation.PropertyAccessor.CREATOR;
    Object v20 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.DEFAULT;
    Object v21 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v18).withVisibility(((com.fasterxml.jackson.annotation.PropertyAccessor)v19),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v20));
    Object v22 = 1;
    Object v23 = 0;
    Object v24 = java.text.DateFormat.getDateTimeInstance((((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()));
    Object v25 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v21).withDateFormat(((java.text.DateFormat)v24));
    org.junit.Assert.assertNotNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std.defaultInstance();
    Object v3 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v5 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v6 = 1;
    Object v7 = 0;
    Object v8 = java.text.DateFormat.getDateTimeInstance((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = java.util.Locale.getDefault();
    Object v11 = ")V";
    Object v12 = java.util.TimeZone.getTimeZone(((java.lang.String)v11));
    Object v13 = null;
    Object v14 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v2),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v3),((com.fasterxml.jackson.databind.type.TypeFactory)v4),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v5),((java.text.DateFormat)v8),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v9),((java.util.Locale)v10),((java.util.TimeZone)v12),((com.fasterxml.jackson.core.Base64Variant)v13));
    Object v15 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v14).getTimeZone();
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std.defaultInstance();
    Object v3 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v5 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v6 = 1;
    Object v7 = 0;
    Object v8 = java.text.DateFormat.getDateTimeInstance((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = java.util.Locale.getDefault();
    Object v11 = ")V";
    Object v12 = java.util.TimeZone.getTimeZone(((java.lang.String)v11));
    Object v13 = null;
    Object v14 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v2),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v3),((com.fasterxml.jackson.databind.type.TypeFactory)v4),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v5),((java.text.DateFormat)v8),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v9),((java.util.Locale)v10),((java.util.TimeZone)v12),((com.fasterxml.jackson.core.Base64Variant)v13));
    Object v15 = com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std.defaultInstance();
    Object v16 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v14).withVisibilityChecker(((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v15));
    Object v17 = com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std.defaultInstance();
    Object v18 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v16).withVisibilityChecker(((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v17));
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std.defaultInstance();
    Object v3 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v5 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v6 = 1;
    Object v7 = 0;
    Object v8 = java.text.DateFormat.getDateTimeInstance((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = java.util.Locale.getDefault();
    Object v11 = ")V";
    Object v12 = java.util.TimeZone.getTimeZone(((java.lang.String)v11));
    Object v13 = null;
    Object v14 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v2),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v3),((com.fasterxml.jackson.databind.type.TypeFactory)v4),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v5),((java.text.DateFormat)v8),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v9),((java.util.Locale)v10),((java.util.TimeZone)v12),((com.fasterxml.jackson.core.Base64Variant)v13));
    Object v15 = java.util.Locale.getDefault();
    Object v16 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v17 = ((java.util.Locale)v15).equals(((java.lang.Object)v16));
    Object v18 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v14).with(((java.util.Locale)v15));
    Object v19 = com.fasterxml.jackson.annotation.PropertyAccessor.CREATOR;
    Object v20 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.DEFAULT;
    Object v21 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v18).withVisibility(((com.fasterxml.jackson.annotation.PropertyAccessor)v19),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v20));
    Object v22 = java.util.Locale.getDefault();
    Object v23 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v21).with(((java.util.Locale)v22));
    org.junit.Assert.assertNotNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std.defaultInstance();
    Object v3 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v5 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v6 = 1;
    Object v7 = 0;
    Object v8 = java.text.DateFormat.getDateTimeInstance((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = java.util.Locale.getDefault();
    Object v11 = ")V";
    Object v12 = java.util.TimeZone.getTimeZone(((java.lang.String)v11));
    Object v13 = null;
    Object v14 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v2),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v3),((com.fasterxml.jackson.databind.type.TypeFactory)v4),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v5),((java.text.DateFormat)v8),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v9),((java.util.Locale)v10),((java.util.TimeZone)v12),((com.fasterxml.jackson.core.Base64Variant)v13));
    Object v15 = com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std.defaultInstance();
    Object v16 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v14).withVisibilityChecker(((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v15));
    Object v17 = com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std.defaultInstance();
    Object v18 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v16).withVisibilityChecker(((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v17));
    Object v19 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v18).getDateFormat();
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std.defaultInstance();
    Object v3 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v5 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v6 = 1;
    Object v7 = 0;
    Object v8 = java.text.DateFormat.getDateTimeInstance((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = java.util.Locale.getDefault();
    Object v11 = ")V";
    Object v12 = java.util.TimeZone.getTimeZone(((java.lang.String)v11));
    Object v13 = null;
    Object v14 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v2),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v3),((com.fasterxml.jackson.databind.type.TypeFactory)v4),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v5),((java.text.DateFormat)v8),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v9),((java.util.Locale)v10),((java.util.TimeZone)v12),((com.fasterxml.jackson.core.Base64Variant)v13));
    Object v15 = java.util.Locale.getDefault();
    Object v16 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v17 = ((java.util.Locale)v15).equals(((java.lang.Object)v16));
    Object v18 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v14).with(((java.util.Locale)v15));
    Object v19 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v20 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v18).withAnnotationIntrospector(((com.fasterxml.jackson.databind.AnnotationIntrospector)v19));
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std.defaultInstance();
    Object v3 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v5 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v6 = 1;
    Object v7 = 0;
    Object v8 = java.text.DateFormat.getDateTimeInstance((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = java.util.Locale.getDefault();
    Object v11 = ")V";
    Object v12 = java.util.TimeZone.getTimeZone(((java.lang.String)v11));
    Object v13 = null;
    Object v14 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v2),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v3),((com.fasterxml.jackson.databind.type.TypeFactory)v4),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v5),((java.text.DateFormat)v8),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v9),((java.util.Locale)v10),((java.util.TimeZone)v12),((com.fasterxml.jackson.core.Base64Variant)v13));
    Object v15 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v14).getAnnotationIntrospector();
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std.defaultInstance();
    Object v3 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v5 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v6 = 1;
    Object v7 = 0;
    Object v8 = java.text.DateFormat.getDateTimeInstance((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = java.util.Locale.getDefault();
    Object v11 = ")V";
    Object v12 = java.util.TimeZone.getTimeZone(((java.lang.String)v11));
    Object v13 = null;
    Object v14 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v2),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v3),((com.fasterxml.jackson.databind.type.TypeFactory)v4),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v5),((java.text.DateFormat)v8),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v9),((java.util.Locale)v10),((java.util.TimeZone)v12),((com.fasterxml.jackson.core.Base64Variant)v13));
    Object v15 = java.util.Locale.getDefault();
    Object v16 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v17 = ((java.util.Locale)v15).equals(((java.lang.Object)v16));
    Object v18 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v14).with(((java.util.Locale)v15));
    Object v19 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v20 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v18).withTypeResolverBuilder(((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v19));
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std.defaultInstance();
    Object v3 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v5 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v6 = 1;
    Object v7 = 0;
    Object v8 = java.text.DateFormat.getDateTimeInstance((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = java.util.Locale.getDefault();
    Object v11 = ")V";
    Object v12 = java.util.TimeZone.getTimeZone(((java.lang.String)v11));
    Object v13 = null;
    Object v14 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v2),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v3),((com.fasterxml.jackson.databind.type.TypeFactory)v4),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v5),((java.text.DateFormat)v8),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v9),((java.util.Locale)v10),((java.util.TimeZone)v12),((com.fasterxml.jackson.core.Base64Variant)v13));
    Object v15 = java.util.Locale.getDefault();
    Object v16 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v17 = ((java.util.Locale)v15).equals(((java.lang.Object)v16));
    Object v18 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v14).with(((java.util.Locale)v15));
    Object v19 = com.fasterxml.jackson.annotation.PropertyAccessor.CREATOR;
    Object v20 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.DEFAULT;
    Object v21 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v18).withVisibility(((com.fasterxml.jackson.annotation.PropertyAccessor)v19),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v20));
    Object v22 = 1;
    Object v23 = 0;
    Object v24 = java.text.DateFormat.getDateTimeInstance((((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()));
    Object v25 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v21).withDateFormat(((java.text.DateFormat)v24));
    Object v26 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v27 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v25).withPropertyNamingStrategy(((com.fasterxml.jackson.databind.PropertyNamingStrategy)v26));
    Object v28 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v29 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v25).withTypeResolverBuilder(((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v28));
    org.junit.Assert.assertNotNull(v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std.defaultInstance();
    Object v3 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v5 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v6 = 1;
    Object v7 = 0;
    Object v8 = java.text.DateFormat.getDateTimeInstance((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = java.util.Locale.getDefault();
    Object v11 = ")V";
    Object v12 = java.util.TimeZone.getTimeZone(((java.lang.String)v11));
    Object v13 = null;
    Object v14 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v2),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v3),((com.fasterxml.jackson.databind.type.TypeFactory)v4),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v5),((java.text.DateFormat)v8),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v9),((java.util.Locale)v10),((java.util.TimeZone)v12),((com.fasterxml.jackson.core.Base64Variant)v13));
    Object v15 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v14).getVisibilityChecker();
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std.defaultInstance();
    Object v3 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v5 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v6 = 1;
    Object v7 = 0;
    Object v8 = java.text.DateFormat.getDateTimeInstance((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = java.util.Locale.getDefault();
    Object v11 = ")V";
    Object v12 = java.util.TimeZone.getTimeZone(((java.lang.String)v11));
    Object v13 = null;
    Object v14 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v2),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v3),((com.fasterxml.jackson.databind.type.TypeFactory)v4),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v5),((java.text.DateFormat)v8),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v9),((java.util.Locale)v10),((java.util.TimeZone)v12),((com.fasterxml.jackson.core.Base64Variant)v13));
    Object v15 = com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std.defaultInstance();
    Object v16 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v14).withVisibilityChecker(((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v15));
    Object v17 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v18 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v19 = com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std.defaultInstance();
    Object v20 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v22 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v23 = 1;
    Object v24 = 0;
    Object v25 = java.text.DateFormat.getDateTimeInstance((((java.lang.Integer)v23).intValue()),(((java.lang.Integer)v24).intValue()));
    Object v26 = null;
    Object v27 = java.util.Locale.getDefault();
    Object v28 = ")V";
    Object v29 = java.util.TimeZone.getTimeZone(((java.lang.String)v28));
    Object v30 = null;
    Object v31 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v17),((com.fasterxml.jackson.databind.AnnotationIntrospector)v18),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v19),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v20),((com.fasterxml.jackson.databind.type.TypeFactory)v21),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v22),((java.text.DateFormat)v25),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v26),((java.util.Locale)v27),((java.util.TimeZone)v29),((com.fasterxml.jackson.core.Base64Variant)v30));
    Object v32 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v31).getVisibilityChecker();
    Object v33 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v16).withVisibilityChecker(((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v32));
    org.junit.Assert.assertNotNull(v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std.defaultInstance();
    Object v3 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v5 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v6 = 1;
    Object v7 = 0;
    Object v8 = java.text.DateFormat.getDateTimeInstance((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = java.util.Locale.getDefault();
    Object v11 = ")V";
    Object v12 = java.util.TimeZone.getTimeZone(((java.lang.String)v11));
    Object v13 = null;
    Object v14 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v2),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v3),((com.fasterxml.jackson.databind.type.TypeFactory)v4),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v5),((java.text.DateFormat)v8),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v9),((java.util.Locale)v10),((java.util.TimeZone)v12),((com.fasterxml.jackson.core.Base64Variant)v13));
    Object v15 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v16 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v14).withAnnotationIntrospector(((com.fasterxml.jackson.databind.AnnotationIntrospector)v15));
    Object v17 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v18 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v16).withClassIntrospector(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v17));
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std.defaultInstance();
    Object v3 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v5 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v6 = 1;
    Object v7 = 0;
    Object v8 = java.text.DateFormat.getDateTimeInstance((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = java.util.Locale.getDefault();
    Object v11 = ")V";
    Object v12 = java.util.TimeZone.getTimeZone(((java.lang.String)v11));
    Object v13 = null;
    Object v14 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v2),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v3),((com.fasterxml.jackson.databind.type.TypeFactory)v4),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v5),((java.text.DateFormat)v8),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v9),((java.util.Locale)v10),((java.util.TimeZone)v12),((com.fasterxml.jackson.core.Base64Variant)v13));
    Object v15 = java.util.Locale.getDefault();
    Object v16 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v17 = ((java.util.Locale)v15).equals(((java.lang.Object)v16));
    Object v18 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v14).with(((java.util.Locale)v15));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v20 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v18).withTypeFactory(((com.fasterxml.jackson.databind.type.TypeFactory)v19));
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std.defaultInstance();
    Object v3 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v5 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v6 = 1;
    Object v7 = 0;
    Object v8 = java.text.DateFormat.getDateTimeInstance((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = java.util.Locale.getDefault();
    Object v11 = ")V";
    Object v12 = java.util.TimeZone.getTimeZone(((java.lang.String)v11));
    Object v13 = null;
    Object v14 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v2),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v3),((com.fasterxml.jackson.databind.type.TypeFactory)v4),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v5),((java.text.DateFormat)v8),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v9),((java.util.Locale)v10),((java.util.TimeZone)v12),((com.fasterxml.jackson.core.Base64Variant)v13));
    Object v15 = ")V";
    Object v16 = java.util.TimeZone.getTimeZone(((java.lang.String)v15));
    Object v17 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v14).with(((java.util.TimeZone)v16));
    Object v18 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v19 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v14).withClassIntrospector(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v18));
    Object v20 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v21 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.EXISTING_PROPERTY;
    Object v22 = ((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v20).inclusion(((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v21));
    Object v23 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v19).withTypeResolverBuilder(((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v20));
    org.junit.Assert.assertNotNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std.defaultInstance();
    Object v3 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v5 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v6 = 1;
    Object v7 = 0;
    Object v8 = java.text.DateFormat.getDateTimeInstance((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = java.util.Locale.getDefault();
    Object v11 = ")V";
    Object v12 = java.util.TimeZone.getTimeZone(((java.lang.String)v11));
    Object v13 = null;
    Object v14 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v2),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v3),((com.fasterxml.jackson.databind.type.TypeFactory)v4),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v5),((java.text.DateFormat)v8),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v9),((java.util.Locale)v10),((java.util.TimeZone)v12),((com.fasterxml.jackson.core.Base64Variant)v13));
    Object v15 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v16 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v14).withClassIntrospector(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v15));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v18 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v16).withTypeFactory(((com.fasterxml.jackson.databind.type.TypeFactory)v17));
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std.defaultInstance();
    Object v3 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v5 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v6 = 1;
    Object v7 = 0;
    Object v8 = java.text.DateFormat.getDateTimeInstance((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = java.util.Locale.getDefault();
    Object v11 = ")V";
    Object v12 = java.util.TimeZone.getTimeZone(((java.lang.String)v11));
    Object v13 = null;
    Object v14 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v2),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v3),((com.fasterxml.jackson.databind.type.TypeFactory)v4),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v5),((java.text.DateFormat)v8),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v9),((java.util.Locale)v10),((java.util.TimeZone)v12),((com.fasterxml.jackson.core.Base64Variant)v13));
    Object v15 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v16 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v14).withAnnotationIntrospector(((com.fasterxml.jackson.databind.AnnotationIntrospector)v15));
    Object v17 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v18 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v16).withClassIntrospector(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v17));
    Object v19 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v20 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v18).withPropertyNamingStrategy(((com.fasterxml.jackson.databind.PropertyNamingStrategy)v19));
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std.defaultInstance();
    Object v3 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v5 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v6 = 1;
    Object v7 = 0;
    Object v8 = java.text.DateFormat.getDateTimeInstance((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = java.util.Locale.getDefault();
    Object v11 = ")V";
    Object v12 = java.util.TimeZone.getTimeZone(((java.lang.String)v11));
    Object v13 = null;
    Object v14 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v2),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v3),((com.fasterxml.jackson.databind.type.TypeFactory)v4),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v5),((java.text.DateFormat)v8),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v9),((java.util.Locale)v10),((java.util.TimeZone)v12),((com.fasterxml.jackson.core.Base64Variant)v13));
    Object v15 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v16 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v14).withAnnotationIntrospector(((com.fasterxml.jackson.databind.AnnotationIntrospector)v15));
    Object v17 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v18 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v16).withClassIntrospector(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v17));
    Object v19 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v20 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v18).withPropertyNamingStrategy(((com.fasterxml.jackson.databind.PropertyNamingStrategy)v19));
    Object v21 = com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std.defaultInstance();
    Object v22 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v20).withVisibilityChecker(((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v21));
    org.junit.Assert.assertNotNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std.defaultInstance();
    Object v3 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v5 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v6 = 1;
    Object v7 = 0;
    Object v8 = java.text.DateFormat.getDateTimeInstance((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = java.util.Locale.getDefault();
    Object v11 = ")V";
    Object v12 = java.util.TimeZone.getTimeZone(((java.lang.String)v11));
    Object v13 = null;
    Object v14 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v2),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v3),((com.fasterxml.jackson.databind.type.TypeFactory)v4),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v5),((java.text.DateFormat)v8),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v9),((java.util.Locale)v10),((java.util.TimeZone)v12),((com.fasterxml.jackson.core.Base64Variant)v13));
    Object v15 = 1;
    Object v16 = 0;
    Object v17 = java.text.DateFormat.getDateTimeInstance((((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v18 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v14).withDateFormat(((java.text.DateFormat)v17));
    Object v19 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v20 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v18).withClassIntrospector(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v19));
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std.defaultInstance();
    Object v3 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v5 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v6 = 1;
    Object v7 = 0;
    Object v8 = java.text.DateFormat.getDateTimeInstance((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = java.util.Locale.getDefault();
    Object v11 = ")V";
    Object v12 = java.util.TimeZone.getTimeZone(((java.lang.String)v11));
    Object v13 = null;
    Object v14 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v2),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v3),((com.fasterxml.jackson.databind.type.TypeFactory)v4),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v5),((java.text.DateFormat)v8),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v9),((java.util.Locale)v10),((java.util.TimeZone)v12),((com.fasterxml.jackson.core.Base64Variant)v13));
    Object v15 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v16 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v14).withAppendedAnnotationIntrospector(((com.fasterxml.jackson.databind.AnnotationIntrospector)v15));
    Object v17 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v18 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v16).withClassIntrospector(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v17));
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std.defaultInstance();
    Object v3 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v5 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v6 = 1;
    Object v7 = 0;
    Object v8 = java.text.DateFormat.getDateTimeInstance((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = java.util.Locale.getDefault();
    Object v11 = ")V";
    Object v12 = java.util.TimeZone.getTimeZone(((java.lang.String)v11));
    Object v13 = null;
    Object v14 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v2),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v3),((com.fasterxml.jackson.databind.type.TypeFactory)v4),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v5),((java.text.DateFormat)v8),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v9),((java.util.Locale)v10),((java.util.TimeZone)v12),((com.fasterxml.jackson.core.Base64Variant)v13));
    Object v15 = java.util.Locale.getDefault();
    Object v16 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v17 = ((java.util.Locale)v15).equals(((java.lang.Object)v16));
    Object v18 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v14).with(((java.util.Locale)v15));
    Object v19 = com.fasterxml.jackson.annotation.PropertyAccessor.CREATOR;
    Object v20 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.DEFAULT;
    Object v21 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v18).withVisibility(((com.fasterxml.jackson.annotation.PropertyAccessor)v19),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v20));
    Object v22 = 1;
    Object v23 = 0;
    Object v24 = java.text.DateFormat.getDateTimeInstance((((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()));
    Object v25 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v21).withDateFormat(((java.text.DateFormat)v24));
    Object v26 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v27 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v25).withAnnotationIntrospector(((com.fasterxml.jackson.databind.AnnotationIntrospector)v26));
    org.junit.Assert.assertNotNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std.defaultInstance();
    Object v3 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v5 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v6 = 1;
    Object v7 = 0;
    Object v8 = java.text.DateFormat.getDateTimeInstance((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = java.util.Locale.getDefault();
    Object v11 = ")V";
    Object v12 = java.util.TimeZone.getTimeZone(((java.lang.String)v11));
    Object v13 = null;
    Object v14 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v2),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v3),((com.fasterxml.jackson.databind.type.TypeFactory)v4),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v5),((java.text.DateFormat)v8),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v9),((java.util.Locale)v10),((java.util.TimeZone)v12),((com.fasterxml.jackson.core.Base64Variant)v13));
    Object v15 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v16 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v14).withAnnotationIntrospector(((com.fasterxml.jackson.databind.AnnotationIntrospector)v15));
    Object v17 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v18 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v16).withClassIntrospector(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v17));
    Object v19 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v20 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v18).withPropertyNamingStrategy(((com.fasterxml.jackson.databind.PropertyNamingStrategy)v19));
    Object v21 = com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std.defaultInstance();
    Object v22 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v20).withVisibilityChecker(((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v21));
    Object v23 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v24 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v22).withAppendedAnnotationIntrospector(((com.fasterxml.jackson.databind.AnnotationIntrospector)v23));
    Object v25 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v26 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v22).withClassIntrospector(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v25));
    org.junit.Assert.assertNotNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std.defaultInstance();
    Object v3 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v5 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v6 = 1;
    Object v7 = 0;
    Object v8 = java.text.DateFormat.getDateTimeInstance((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = java.util.Locale.getDefault();
    Object v11 = ")V";
    Object v12 = java.util.TimeZone.getTimeZone(((java.lang.String)v11));
    Object v13 = null;
    Object v14 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v2),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v3),((com.fasterxml.jackson.databind.type.TypeFactory)v4),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v5),((java.text.DateFormat)v8),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v9),((java.util.Locale)v10),((java.util.TimeZone)v12),((com.fasterxml.jackson.core.Base64Variant)v13));
    Object v15 = ")V";
    Object v16 = java.util.TimeZone.getTimeZone(((java.lang.String)v15));
    Object v17 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v14).with(((java.util.TimeZone)v16));
    Object v18 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v19 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v14).withClassIntrospector(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v18));
    Object v20 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v21 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.EXISTING_PROPERTY;
    Object v22 = ((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v20).inclusion(((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v21));
    Object v23 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v19).withTypeResolverBuilder(((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v20));
    Object v24 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v25 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v23).withAnnotationIntrospector(((com.fasterxml.jackson.databind.AnnotationIntrospector)v24));
    org.junit.Assert.assertNotNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std.defaultInstance();
    Object v3 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v5 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v6 = 1;
    Object v7 = 0;
    Object v8 = java.text.DateFormat.getDateTimeInstance((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = java.util.Locale.getDefault();
    Object v11 = ")V";
    Object v12 = java.util.TimeZone.getTimeZone(((java.lang.String)v11));
    Object v13 = null;
    Object v14 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v2),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v3),((com.fasterxml.jackson.databind.type.TypeFactory)v4),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v5),((java.text.DateFormat)v8),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v9),((java.util.Locale)v10),((java.util.TimeZone)v12),((com.fasterxml.jackson.core.Base64Variant)v13));
    Object v15 = java.util.Locale.getDefault();
    Object v16 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v17 = ((java.util.Locale)v15).equals(((java.lang.Object)v16));
    Object v18 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v14).with(((java.util.Locale)v15));
    Object v19 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v20 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v18).withTypeResolverBuilder(((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v19));
    Object v21 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v22 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v20).withTypeResolverBuilder(((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v21));
    org.junit.Assert.assertNotNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std.defaultInstance();
    Object v3 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v5 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v6 = 1;
    Object v7 = 0;
    Object v8 = java.text.DateFormat.getDateTimeInstance((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = java.util.Locale.getDefault();
    Object v11 = ")V";
    Object v12 = java.util.TimeZone.getTimeZone(((java.lang.String)v11));
    Object v13 = null;
    Object v14 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v2),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v3),((com.fasterxml.jackson.databind.type.TypeFactory)v4),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v5),((java.text.DateFormat)v8),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v9),((java.util.Locale)v10),((java.util.TimeZone)v12),((com.fasterxml.jackson.core.Base64Variant)v13));
    Object v15 = java.util.Locale.getDefault();
    Object v16 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v17 = ((java.util.Locale)v15).equals(((java.lang.Object)v16));
    Object v18 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v14).with(((java.util.Locale)v15));
    Object v19 = com.fasterxml.jackson.annotation.PropertyAccessor.CREATOR;
    Object v20 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.DEFAULT;
    Object v21 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v18).withVisibility(((com.fasterxml.jackson.annotation.PropertyAccessor)v19),((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v20));
    Object v22 = 1;
    Object v23 = 0;
    Object v24 = java.text.DateFormat.getDateTimeInstance((((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()));
    Object v25 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v21).withDateFormat(((java.text.DateFormat)v24));
    Object v26 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v27 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v25).withPropertyNamingStrategy(((com.fasterxml.jackson.databind.PropertyNamingStrategy)v26));
    Object v28 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v29 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v25).withTypeResolverBuilder(((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v28));
    Object v30 = 1;
    Object v31 = 0;
    Object v32 = java.text.DateFormat.getDateTimeInstance((((java.lang.Integer)v30).intValue()),(((java.lang.Integer)v31).intValue()));
    Object v33 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v29).withDateFormat(((java.text.DateFormat)v32));
    org.junit.Assert.assertNotNull(v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std.defaultInstance();
    Object v3 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v5 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v6 = 1;
    Object v7 = 0;
    Object v8 = java.text.DateFormat.getDateTimeInstance((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = java.util.Locale.getDefault();
    Object v11 = ")V";
    Object v12 = java.util.TimeZone.getTimeZone(((java.lang.String)v11));
    Object v13 = null;
    Object v14 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v2),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v3),((com.fasterxml.jackson.databind.type.TypeFactory)v4),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v5),((java.text.DateFormat)v8),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v9),((java.util.Locale)v10),((java.util.TimeZone)v12),((com.fasterxml.jackson.core.Base64Variant)v13));
    Object v15 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v16 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v14).withTypeResolverBuilder(((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v15));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std.defaultInstance();
    Object v3 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v5 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v6 = 1;
    Object v7 = 0;
    Object v8 = java.text.DateFormat.getDateTimeInstance((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = java.util.Locale.getDefault();
    Object v11 = ")V";
    Object v12 = java.util.TimeZone.getTimeZone(((java.lang.String)v11));
    Object v13 = null;
    Object v14 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v2),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v3),((com.fasterxml.jackson.databind.type.TypeFactory)v4),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v5),((java.text.DateFormat)v8),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v9),((java.util.Locale)v10),((java.util.TimeZone)v12),((com.fasterxml.jackson.core.Base64Variant)v13));
    Object v15 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v16 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v14).withAnnotationIntrospector(((com.fasterxml.jackson.databind.AnnotationIntrospector)v15));
    Object v17 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v18 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v16).withClassIntrospector(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v17));
    Object v19 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v20 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v18).withPropertyNamingStrategy(((com.fasterxml.jackson.databind.PropertyNamingStrategy)v19));
    Object v21 = com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std.defaultInstance();
    Object v22 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v20).withVisibilityChecker(((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v21));
    Object v23 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v24 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v22).withAppendedAnnotationIntrospector(((com.fasterxml.jackson.databind.AnnotationIntrospector)v23));
    Object v25 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v26 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v22).withClassIntrospector(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v25));
    Object v27 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v28 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v26).withTypeResolverBuilder(((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v27));
    org.junit.Assert.assertNotNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std.defaultInstance();
    Object v3 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v5 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v6 = 1;
    Object v7 = 0;
    Object v8 = java.text.DateFormat.getDateTimeInstance((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = java.util.Locale.getDefault();
    Object v11 = ")V";
    Object v12 = java.util.TimeZone.getTimeZone(((java.lang.String)v11));
    Object v13 = null;
    Object v14 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v2),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v3),((com.fasterxml.jackson.databind.type.TypeFactory)v4),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v5),((java.text.DateFormat)v8),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v9),((java.util.Locale)v10),((java.util.TimeZone)v12),((com.fasterxml.jackson.core.Base64Variant)v13));
    Object v15 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v16 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v14).withAnnotationIntrospector(((com.fasterxml.jackson.databind.AnnotationIntrospector)v15));
    Object v17 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v18 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v16).withClassIntrospector(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v17));
    Object v19 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v20 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v18).withPropertyNamingStrategy(((com.fasterxml.jackson.databind.PropertyNamingStrategy)v19));
    Object v21 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v22 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v20).withAppendedAnnotationIntrospector(((com.fasterxml.jackson.databind.AnnotationIntrospector)v21));
    Object v23 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v20).getHandlerInstantiator();
    org.junit.Assert.assertNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std.defaultInstance();
    Object v3 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v5 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v6 = 1;
    Object v7 = 0;
    Object v8 = java.text.DateFormat.getDateTimeInstance((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = java.util.Locale.getDefault();
    Object v11 = ")V";
    Object v12 = java.util.TimeZone.getTimeZone(((java.lang.String)v11));
    Object v13 = null;
    Object v14 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v2),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v3),((com.fasterxml.jackson.databind.type.TypeFactory)v4),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v5),((java.text.DateFormat)v8),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v9),((java.util.Locale)v10),((java.util.TimeZone)v12),((com.fasterxml.jackson.core.Base64Variant)v13));
    Object v15 = java.util.Locale.getDefault();
    Object v16 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v17 = ((java.util.Locale)v15).equals(((java.lang.Object)v16));
    Object v18 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v14).with(((java.util.Locale)v15));
    Object v19 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v20 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v18).withTypeResolverBuilder(((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v19));
    Object v21 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v22 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v20).withAnnotationIntrospector(((com.fasterxml.jackson.databind.AnnotationIntrospector)v21));
    org.junit.Assert.assertNotNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std.defaultInstance();
    Object v3 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v5 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v6 = 1;
    Object v7 = 0;
    Object v8 = java.text.DateFormat.getDateTimeInstance((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = java.util.Locale.getDefault();
    Object v11 = ")V";
    Object v12 = java.util.TimeZone.getTimeZone(((java.lang.String)v11));
    Object v13 = null;
    Object v14 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v2),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v3),((com.fasterxml.jackson.databind.type.TypeFactory)v4),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v5),((java.text.DateFormat)v8),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v9),((java.util.Locale)v10),((java.util.TimeZone)v12),((com.fasterxml.jackson.core.Base64Variant)v13));
    Object v15 = java.util.Locale.getDefault();
    Object v16 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v17 = ((java.util.Locale)v15).equals(((java.lang.Object)v16));
    Object v18 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v14).with(((java.util.Locale)v15));
    Object v19 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v20 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v18).withTypeResolverBuilder(((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v19));
    Object v21 = java.util.Locale.getDefault();
    Object v22 = ((java.util.Locale)v21).getISO3Language();
    Object v23 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v20).with(((java.util.Locale)v21));
    org.junit.Assert.assertNotNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std.defaultInstance();
    Object v3 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v5 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v6 = 1;
    Object v7 = 0;
    Object v8 = java.text.DateFormat.getDateTimeInstance((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = java.util.Locale.getDefault();
    Object v11 = ")V";
    Object v12 = java.util.TimeZone.getTimeZone(((java.lang.String)v11));
    Object v13 = null;
    Object v14 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v2),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v3),((com.fasterxml.jackson.databind.type.TypeFactory)v4),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v5),((java.text.DateFormat)v8),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v9),((java.util.Locale)v10),((java.util.TimeZone)v12),((com.fasterxml.jackson.core.Base64Variant)v13));
    Object v15 = java.util.Locale.getDefault();
    Object v16 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v17 = ((java.util.Locale)v15).equals(((java.lang.Object)v16));
    Object v18 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v14).with(((java.util.Locale)v15));
    Object v19 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v20 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v18).withTypeResolverBuilder(((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v19));
    Object v21 = java.util.Locale.getDefault();
    Object v22 = ((java.util.Locale)v21).getISO3Language();
    Object v23 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v20).with(((java.util.Locale)v21));
    Object v24 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v23).getHandlerInstantiator();
    org.junit.Assert.assertNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std.defaultInstance();
    Object v3 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v5 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v6 = 1;
    Object v7 = 0;
    Object v8 = java.text.DateFormat.getDateTimeInstance((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = java.util.Locale.getDefault();
    Object v11 = ")V";
    Object v12 = java.util.TimeZone.getTimeZone(((java.lang.String)v11));
    Object v13 = null;
    Object v14 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v2),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v3),((com.fasterxml.jackson.databind.type.TypeFactory)v4),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v5),((java.text.DateFormat)v8),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v9),((java.util.Locale)v10),((java.util.TimeZone)v12),((com.fasterxml.jackson.core.Base64Variant)v13));
    Object v15 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v16 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v14).withAnnotationIntrospector(((com.fasterxml.jackson.databind.AnnotationIntrospector)v15));
    Object v17 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v18 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v14).withAnnotationIntrospector(((com.fasterxml.jackson.databind.AnnotationIntrospector)v17));
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std.defaultInstance();
    Object v3 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v5 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v6 = 1;
    Object v7 = 0;
    Object v8 = java.text.DateFormat.getDateTimeInstance((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = java.util.Locale.getDefault();
    Object v11 = ")V";
    Object v12 = java.util.TimeZone.getTimeZone(((java.lang.String)v11));
    Object v13 = null;
    Object v14 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v2),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v3),((com.fasterxml.jackson.databind.type.TypeFactory)v4),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v5),((java.text.DateFormat)v8),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v9),((java.util.Locale)v10),((java.util.TimeZone)v12),((com.fasterxml.jackson.core.Base64Variant)v13));
    Object v15 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v16 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v14).withClassIntrospector(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v15));
    Object v17 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v18 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v19 = com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std.defaultInstance();
    Object v20 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v22 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v23 = 1;
    Object v24 = 0;
    Object v25 = java.text.DateFormat.getDateTimeInstance((((java.lang.Integer)v23).intValue()),(((java.lang.Integer)v24).intValue()));
    Object v26 = null;
    Object v27 = java.util.Locale.getDefault();
    Object v28 = ")V";
    Object v29 = java.util.TimeZone.getTimeZone(((java.lang.String)v28));
    Object v30 = null;
    Object v31 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v17),((com.fasterxml.jackson.databind.AnnotationIntrospector)v18),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v19),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v20),((com.fasterxml.jackson.databind.type.TypeFactory)v21),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v22),((java.text.DateFormat)v25),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v26),((java.util.Locale)v27),((java.util.TimeZone)v29),((com.fasterxml.jackson.core.Base64Variant)v30));
    Object v32 = com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std.defaultInstance();
    Object v33 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v31).withVisibilityChecker(((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v32));
    Object v34 = com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std.defaultInstance();
    Object v35 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v33).withVisibilityChecker(((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v34));
    Object v36 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v35).getDateFormat();
    Object v37 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v16).withDateFormat(((java.text.DateFormat)v36));
    org.junit.Assert.assertNotNull(v37);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std.defaultInstance();
    Object v3 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v5 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v6 = 1;
    Object v7 = 0;
    Object v8 = java.text.DateFormat.getDateTimeInstance((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = java.util.Locale.getDefault();
    Object v11 = ")V";
    Object v12 = java.util.TimeZone.getTimeZone(((java.lang.String)v11));
    Object v13 = null;
    Object v14 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v2),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v3),((com.fasterxml.jackson.databind.type.TypeFactory)v4),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v5),((java.text.DateFormat)v8),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v9),((java.util.Locale)v10),((java.util.TimeZone)v12),((com.fasterxml.jackson.core.Base64Variant)v13));
    Object v15 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v16 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v14).withAnnotationIntrospector(((com.fasterxml.jackson.databind.AnnotationIntrospector)v15));
    Object v17 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v18 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v16).withPropertyNamingStrategy(((com.fasterxml.jackson.databind.PropertyNamingStrategy)v17));
    Object v19 = java.util.Locale.getDefault();
    Object v20 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v16).with(((java.util.Locale)v19));
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std.defaultInstance();
    Object v3 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v5 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v6 = 1;
    Object v7 = 0;
    Object v8 = java.text.DateFormat.getDateTimeInstance((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = java.util.Locale.getDefault();
    Object v11 = ")V";
    Object v12 = java.util.TimeZone.getTimeZone(((java.lang.String)v11));
    Object v13 = null;
    Object v14 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v2),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v3),((com.fasterxml.jackson.databind.type.TypeFactory)v4),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v5),((java.text.DateFormat)v8),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v9),((java.util.Locale)v10),((java.util.TimeZone)v12),((com.fasterxml.jackson.core.Base64Variant)v13));
    Object v15 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v16 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v14).withAnnotationIntrospector(((com.fasterxml.jackson.databind.AnnotationIntrospector)v15));
    Object v17 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v18 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v16).withPropertyNamingStrategy(((com.fasterxml.jackson.databind.PropertyNamingStrategy)v17));
    Object v19 = java.util.Locale.getDefault();
    Object v20 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v16).with(((java.util.Locale)v19));
    Object v21 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v22 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v20).withInsertedAnnotationIntrospector(((com.fasterxml.jackson.databind.AnnotationIntrospector)v21));
    org.junit.Assert.assertNotNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std.defaultInstance();
    Object v3 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v5 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v6 = 1;
    Object v7 = 0;
    Object v8 = java.text.DateFormat.getDateTimeInstance((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = java.util.Locale.getDefault();
    Object v11 = ")V";
    Object v12 = java.util.TimeZone.getTimeZone(((java.lang.String)v11));
    Object v13 = null;
    Object v14 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v2),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v3),((com.fasterxml.jackson.databind.type.TypeFactory)v4),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v5),((java.text.DateFormat)v8),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v9),((java.util.Locale)v10),((java.util.TimeZone)v12),((com.fasterxml.jackson.core.Base64Variant)v13));
    Object v15 = java.util.Locale.getDefault();
    Object v16 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v17 = ((java.util.Locale)v15).equals(((java.lang.Object)v16));
    Object v18 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v14).with(((java.util.Locale)v15));
    Object v19 = java.util.Locale.getDefault();
    Object v20 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v18).with(((java.util.Locale)v19));
    Object v21 = ")V";
    Object v22 = java.util.TimeZone.getTimeZone(((java.lang.String)v21));
    Object v23 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v18).with(((java.util.TimeZone)v22));
    org.junit.Assert.assertNotNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std.defaultInstance();
    Object v3 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v5 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v6 = 1;
    Object v7 = 0;
    Object v8 = java.text.DateFormat.getDateTimeInstance((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = java.util.Locale.getDefault();
    Object v11 = ")V";
    Object v12 = java.util.TimeZone.getTimeZone(((java.lang.String)v11));
    Object v13 = null;
    Object v14 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v2),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v3),((com.fasterxml.jackson.databind.type.TypeFactory)v4),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v5),((java.text.DateFormat)v8),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v9),((java.util.Locale)v10),((java.util.TimeZone)v12),((com.fasterxml.jackson.core.Base64Variant)v13));
    Object v15 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v16 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v14).withAnnotationIntrospector(((com.fasterxml.jackson.databind.AnnotationIntrospector)v15));
    Object v17 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v18 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v16).withClassIntrospector(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v17));
    Object v19 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v20 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v18).withPropertyNamingStrategy(((com.fasterxml.jackson.databind.PropertyNamingStrategy)v19));
    Object v21 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v22 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v20).withPropertyNamingStrategy(((com.fasterxml.jackson.databind.PropertyNamingStrategy)v21));
    org.junit.Assert.assertNotNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std.defaultInstance();
    Object v3 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v5 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v6 = 1;
    Object v7 = 0;
    Object v8 = java.text.DateFormat.getDateTimeInstance((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = java.util.Locale.getDefault();
    Object v11 = ")V";
    Object v12 = java.util.TimeZone.getTimeZone(((java.lang.String)v11));
    Object v13 = null;
    Object v14 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v2),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v3),((com.fasterxml.jackson.databind.type.TypeFactory)v4),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v5),((java.text.DateFormat)v8),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v9),((java.util.Locale)v10),((java.util.TimeZone)v12),((com.fasterxml.jackson.core.Base64Variant)v13));
    Object v15 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v16 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v14).withAppendedAnnotationIntrospector(((com.fasterxml.jackson.databind.AnnotationIntrospector)v15));
    Object v17 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v18 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v16).withClassIntrospector(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v17));
    Object v19 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v20 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v18).withTypeResolverBuilder(((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v19));
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std.defaultInstance();
    Object v3 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v5 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v6 = 1;
    Object v7 = 0;
    Object v8 = java.text.DateFormat.getDateTimeInstance((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = java.util.Locale.getDefault();
    Object v11 = ")V";
    Object v12 = java.util.TimeZone.getTimeZone(((java.lang.String)v11));
    Object v13 = null;
    Object v14 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v2),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v3),((com.fasterxml.jackson.databind.type.TypeFactory)v4),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v5),((java.text.DateFormat)v8),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v9),((java.util.Locale)v10),((java.util.TimeZone)v12),((com.fasterxml.jackson.core.Base64Variant)v13));
    Object v15 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v16 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v14).withAnnotationIntrospector(((com.fasterxml.jackson.databind.AnnotationIntrospector)v15));
    Object v17 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v18 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v16).withPropertyNamingStrategy(((com.fasterxml.jackson.databind.PropertyNamingStrategy)v17));
    Object v19 = java.util.Locale.getDefault();
    Object v20 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v16).with(((java.util.Locale)v19));
    Object v21 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v22 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v20).withTypeResolverBuilder(((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v21));
    Object v23 = java.util.Locale.getDefault();
    Object v24 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v20).with(((java.util.Locale)v23));
    org.junit.Assert.assertNotNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std.defaultInstance();
    Object v3 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v5 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v6 = 1;
    Object v7 = 0;
    Object v8 = java.text.DateFormat.getDateTimeInstance((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = java.util.Locale.getDefault();
    Object v11 = ")V";
    Object v12 = java.util.TimeZone.getTimeZone(((java.lang.String)v11));
    Object v13 = null;
    Object v14 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v2),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v3),((com.fasterxml.jackson.databind.type.TypeFactory)v4),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v5),((java.text.DateFormat)v8),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v9),((java.util.Locale)v10),((java.util.TimeZone)v12),((com.fasterxml.jackson.core.Base64Variant)v13));
    Object v15 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v16 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v14).withAnnotationIntrospector(((com.fasterxml.jackson.databind.AnnotationIntrospector)v15));
    Object v17 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v18 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v16).withPropertyNamingStrategy(((com.fasterxml.jackson.databind.PropertyNamingStrategy)v17));
    Object v19 = java.util.Locale.getDefault();
    Object v20 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v16).with(((java.util.Locale)v19));
    Object v21 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v22 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v20).withTypeResolverBuilder(((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v21));
    Object v23 = java.util.Locale.getDefault();
    Object v24 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v20).with(((java.util.Locale)v23));
    Object v25 = com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std.defaultInstance();
    Object v26 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.PROTECTED_AND_PUBLIC;
    Object v27 = ((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v25).withGetterVisibility(((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v26));
    Object v28 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v24).withVisibilityChecker(((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v25));
    org.junit.Assert.assertNotNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std.defaultInstance();
    Object v3 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v5 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v6 = 1;
    Object v7 = 0;
    Object v8 = java.text.DateFormat.getDateTimeInstance((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = java.util.Locale.getDefault();
    Object v11 = ")V";
    Object v12 = java.util.TimeZone.getTimeZone(((java.lang.String)v11));
    Object v13 = null;
    Object v14 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v2),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v3),((com.fasterxml.jackson.databind.type.TypeFactory)v4),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v5),((java.text.DateFormat)v8),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v9),((java.util.Locale)v10),((java.util.TimeZone)v12),((com.fasterxml.jackson.core.Base64Variant)v13));
    Object v15 = java.util.Locale.getDefault();
    Object v16 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v17 = ((java.util.Locale)v15).equals(((java.lang.Object)v16));
    Object v18 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v14).with(((java.util.Locale)v15));
    Object v19 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v20 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v18).withTypeResolverBuilder(((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v19));
    Object v21 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v22 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v20).withAnnotationIntrospector(((com.fasterxml.jackson.databind.AnnotationIntrospector)v21));
    Object v23 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v24 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v22).withAnnotationIntrospector(((com.fasterxml.jackson.databind.AnnotationIntrospector)v23));
    Object v25 = ")V";
    Object v26 = java.util.TimeZone.getTimeZone(((java.lang.String)v25));
    Object v27 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v22).with(((java.util.TimeZone)v26));
    org.junit.Assert.assertNotNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std.defaultInstance();
    Object v3 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v5 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v6 = 1;
    Object v7 = 0;
    Object v8 = java.text.DateFormat.getDateTimeInstance((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = java.util.Locale.getDefault();
    Object v11 = ")V";
    Object v12 = java.util.TimeZone.getTimeZone(((java.lang.String)v11));
    Object v13 = null;
    Object v14 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v2),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v3),((com.fasterxml.jackson.databind.type.TypeFactory)v4),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v5),((java.text.DateFormat)v8),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v9),((java.util.Locale)v10),((java.util.TimeZone)v12),((com.fasterxml.jackson.core.Base64Variant)v13));
    Object v15 = ")V";
    Object v16 = java.util.TimeZone.getTimeZone(((java.lang.String)v15));
    Object v17 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v14).with(((java.util.TimeZone)v16));
    Object v18 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v19 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v14).withClassIntrospector(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v18));
    Object v20 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v21 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.EXISTING_PROPERTY;
    Object v22 = ((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v20).inclusion(((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v21));
    Object v23 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v19).withTypeResolverBuilder(((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v20));
    Object v24 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v25 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v23).withAnnotationIntrospector(((com.fasterxml.jackson.databind.AnnotationIntrospector)v24));
    Object v26 = java.util.Locale.getDefault();
    Object v27 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v25).with(((java.util.Locale)v26));
    org.junit.Assert.assertNotNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std.defaultInstance();
    Object v3 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v5 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v6 = 1;
    Object v7 = 0;
    Object v8 = java.text.DateFormat.getDateTimeInstance((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = java.util.Locale.getDefault();
    Object v11 = ")V";
    Object v12 = java.util.TimeZone.getTimeZone(((java.lang.String)v11));
    Object v13 = null;
    Object v14 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v2),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v3),((com.fasterxml.jackson.databind.type.TypeFactory)v4),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v5),((java.text.DateFormat)v8),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v9),((java.util.Locale)v10),((java.util.TimeZone)v12),((com.fasterxml.jackson.core.Base64Variant)v13));
    Object v15 = java.util.Locale.getDefault();
    Object v16 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v17 = ((java.util.Locale)v15).equals(((java.lang.Object)v16));
    Object v18 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v14).with(((java.util.Locale)v15));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v20 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v18).withTypeFactory(((com.fasterxml.jackson.databind.type.TypeFactory)v19));
    Object v21 = ")V";
    Object v22 = java.util.TimeZone.getTimeZone(((java.lang.String)v21));
    Object v23 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v20).with(((java.util.TimeZone)v22));
    org.junit.Assert.assertNotNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std.defaultInstance();
    Object v3 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v5 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v6 = 1;
    Object v7 = 0;
    Object v8 = java.text.DateFormat.getDateTimeInstance((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = java.util.Locale.getDefault();
    Object v11 = ")V";
    Object v12 = java.util.TimeZone.getTimeZone(((java.lang.String)v11));
    Object v13 = null;
    Object v14 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v2),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v3),((com.fasterxml.jackson.databind.type.TypeFactory)v4),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v5),((java.text.DateFormat)v8),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v9),((java.util.Locale)v10),((java.util.TimeZone)v12),((com.fasterxml.jackson.core.Base64Variant)v13));
    Object v15 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v16 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v14).withAnnotationIntrospector(((com.fasterxml.jackson.databind.AnnotationIntrospector)v15));
    Object v17 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v18 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v16).withClassIntrospector(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v17));
    Object v19 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v20 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v18).withPropertyNamingStrategy(((com.fasterxml.jackson.databind.PropertyNamingStrategy)v19));
    Object v21 = com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std.defaultInstance();
    Object v22 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v20).withVisibilityChecker(((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v21));
    Object v23 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v24 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v22).withAppendedAnnotationIntrospector(((com.fasterxml.jackson.databind.AnnotationIntrospector)v23));
    Object v25 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v26 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v22).withClassIntrospector(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v25));
    Object v27 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v28 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v26).withAnnotationIntrospector(((com.fasterxml.jackson.databind.AnnotationIntrospector)v27));
    org.junit.Assert.assertNotNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std.defaultInstance();
    Object v3 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v5 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v6 = 1;
    Object v7 = 0;
    Object v8 = java.text.DateFormat.getDateTimeInstance((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = java.util.Locale.getDefault();
    Object v11 = ")V";
    Object v12 = java.util.TimeZone.getTimeZone(((java.lang.String)v11));
    Object v13 = null;
    Object v14 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v2),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v3),((com.fasterxml.jackson.databind.type.TypeFactory)v4),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v5),((java.text.DateFormat)v8),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v9),((java.util.Locale)v10),((java.util.TimeZone)v12),((com.fasterxml.jackson.core.Base64Variant)v13));
    Object v15 = 1;
    Object v16 = 0;
    Object v17 = java.text.DateFormat.getDateTimeInstance((((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v18 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v14).withDateFormat(((java.text.DateFormat)v17));
    Object v19 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v20 = "Trying to resolve a forward reference with id [";
    Object v21 = ((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v19).typeProperty(((java.lang.String)v20));
    Object v22 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v18).withTypeResolverBuilder(((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v19));
    Object v23 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v24 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v22).withTypeResolverBuilder(((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v23));
    Object v25 = ")V";
    Object v26 = java.util.TimeZone.getTimeZone(((java.lang.String)v25));
    Object v27 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v22).with(((java.util.TimeZone)v26));
    org.junit.Assert.assertNotNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std.defaultInstance();
    Object v3 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v5 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v6 = 1;
    Object v7 = 0;
    Object v8 = java.text.DateFormat.getDateTimeInstance((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = java.util.Locale.getDefault();
    Object v11 = ")V";
    Object v12 = java.util.TimeZone.getTimeZone(((java.lang.String)v11));
    Object v13 = null;
    Object v14 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v2),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v3),((com.fasterxml.jackson.databind.type.TypeFactory)v4),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v5),((java.text.DateFormat)v8),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v9),((java.util.Locale)v10),((java.util.TimeZone)v12),((com.fasterxml.jackson.core.Base64Variant)v13));
    Object v15 = ")V";
    Object v16 = java.util.TimeZone.getTimeZone(((java.lang.String)v15));
    Object v17 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v14).with(((java.util.TimeZone)v16));
    Object v18 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v19 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v14).withClassIntrospector(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v18));
    Object v20 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v21 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.EXISTING_PROPERTY;
    Object v22 = ((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v20).inclusion(((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v21));
    Object v23 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v19).withTypeResolverBuilder(((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v20));
    Object v24 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v25 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v23).withAppendedAnnotationIntrospector(((com.fasterxml.jackson.databind.AnnotationIntrospector)v24));
    Object v26 = ")V";
    Object v27 = java.util.TimeZone.getTimeZone(((java.lang.String)v26));
    Object v28 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v23).with(((java.util.TimeZone)v27));
    org.junit.Assert.assertNotNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std.defaultInstance();
    Object v3 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v5 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v6 = 1;
    Object v7 = 0;
    Object v8 = java.text.DateFormat.getDateTimeInstance((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = java.util.Locale.getDefault();
    Object v11 = ")V";
    Object v12 = java.util.TimeZone.getTimeZone(((java.lang.String)v11));
    Object v13 = null;
    Object v14 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v2),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v3),((com.fasterxml.jackson.databind.type.TypeFactory)v4),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v5),((java.text.DateFormat)v8),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v9),((java.util.Locale)v10),((java.util.TimeZone)v12),((com.fasterxml.jackson.core.Base64Variant)v13));
    Object v15 = ")V";
    Object v16 = java.util.TimeZone.getTimeZone(((java.lang.String)v15));
    Object v17 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v14).with(((java.util.TimeZone)v16));
    Object v18 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v19 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v14).withClassIntrospector(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v18));
    Object v20 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v21 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.EXISTING_PROPERTY;
    Object v22 = ((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v20).inclusion(((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v21));
    Object v23 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v19).withTypeResolverBuilder(((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v20));
    Object v24 = java.util.Locale.getDefault();
    Object v25 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v23).with(((java.util.Locale)v24));
    org.junit.Assert.assertNotNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std.defaultInstance();
    Object v3 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v5 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v6 = 1;
    Object v7 = 0;
    Object v8 = java.text.DateFormat.getDateTimeInstance((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = java.util.Locale.getDefault();
    Object v11 = ")V";
    Object v12 = java.util.TimeZone.getTimeZone(((java.lang.String)v11));
    Object v13 = null;
    Object v14 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v2),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v3),((com.fasterxml.jackson.databind.type.TypeFactory)v4),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v5),((java.text.DateFormat)v8),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v9),((java.util.Locale)v10),((java.util.TimeZone)v12),((com.fasterxml.jackson.core.Base64Variant)v13));
    Object v15 = ")V";
    Object v16 = java.util.TimeZone.getTimeZone(((java.lang.String)v15));
    Object v17 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v14).with(((java.util.TimeZone)v16));
    Object v18 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v19 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v14).withClassIntrospector(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v18));
    Object v20 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v21 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.EXISTING_PROPERTY;
    Object v22 = ((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v20).inclusion(((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v21));
    Object v23 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v19).withTypeResolverBuilder(((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v20));
    Object v24 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v25 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v23).withAnnotationIntrospector(((com.fasterxml.jackson.databind.AnnotationIntrospector)v24));
    Object v26 = java.util.Locale.getDefault();
    Object v27 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v25).with(((java.util.Locale)v26));
    Object v28 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v29 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v27).withPropertyNamingStrategy(((com.fasterxml.jackson.databind.PropertyNamingStrategy)v28));
    org.junit.Assert.assertNotNull(v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std.defaultInstance();
    Object v3 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v5 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v6 = 1;
    Object v7 = 0;
    Object v8 = java.text.DateFormat.getDateTimeInstance((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = java.util.Locale.getDefault();
    Object v11 = ")V";
    Object v12 = java.util.TimeZone.getTimeZone(((java.lang.String)v11));
    Object v13 = null;
    Object v14 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v2),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v3),((com.fasterxml.jackson.databind.type.TypeFactory)v4),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v5),((java.text.DateFormat)v8),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v9),((java.util.Locale)v10),((java.util.TimeZone)v12),((com.fasterxml.jackson.core.Base64Variant)v13));
    Object v15 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v16 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v14).withAnnotationIntrospector(((com.fasterxml.jackson.databind.AnnotationIntrospector)v15));
    Object v17 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v18 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v16).withPropertyNamingStrategy(((com.fasterxml.jackson.databind.PropertyNamingStrategy)v17));
    Object v19 = java.util.Locale.getDefault();
    Object v20 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v16).with(((java.util.Locale)v19));
    Object v21 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v22 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v20).withClassIntrospector(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v21));
    Object v23 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v24 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v20).withPropertyNamingStrategy(((com.fasterxml.jackson.databind.PropertyNamingStrategy)v23));
    org.junit.Assert.assertNotNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std.defaultInstance();
    Object v3 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v5 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v6 = 1;
    Object v7 = 0;
    Object v8 = java.text.DateFormat.getDateTimeInstance((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = java.util.Locale.getDefault();
    Object v11 = ")V";
    Object v12 = java.util.TimeZone.getTimeZone(((java.lang.String)v11));
    Object v13 = null;
    Object v14 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v2),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v3),((com.fasterxml.jackson.databind.type.TypeFactory)v4),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v5),((java.text.DateFormat)v8),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v9),((java.util.Locale)v10),((java.util.TimeZone)v12),((com.fasterxml.jackson.core.Base64Variant)v13));
    Object v15 = java.util.Locale.getDefault();
    Object v16 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v17 = ((java.util.Locale)v15).equals(((java.lang.Object)v16));
    Object v18 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v14).with(((java.util.Locale)v15));
    Object v19 = java.util.Locale.getDefault();
    Object v20 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v18).with(((java.util.Locale)v19));
    Object v21 = ")V";
    Object v22 = java.util.TimeZone.getTimeZone(((java.lang.String)v21));
    Object v23 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v18).with(((java.util.TimeZone)v22));
    Object v24 = 1;
    Object v25 = 0;
    Object v26 = java.text.DateFormat.getDateTimeInstance((((java.lang.Integer)v24).intValue()),(((java.lang.Integer)v25).intValue()));
    Object v27 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v23).withDateFormat(((java.text.DateFormat)v26));
    org.junit.Assert.assertNotNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std.defaultInstance();
    Object v3 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v5 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v6 = 1;
    Object v7 = 0;
    Object v8 = java.text.DateFormat.getDateTimeInstance((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = java.util.Locale.getDefault();
    Object v11 = ")V";
    Object v12 = java.util.TimeZone.getTimeZone(((java.lang.String)v11));
    Object v13 = null;
    Object v14 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v2),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v3),((com.fasterxml.jackson.databind.type.TypeFactory)v4),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v5),((java.text.DateFormat)v8),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v9),((java.util.Locale)v10),((java.util.TimeZone)v12),((com.fasterxml.jackson.core.Base64Variant)v13));
    Object v15 = java.util.Locale.getDefault();
    Object v16 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v17 = ((java.util.Locale)v15).equals(((java.lang.Object)v16));
    Object v18 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v14).with(((java.util.Locale)v15));
    Object v19 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v20 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v18).withTypeResolverBuilder(((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v19));
    Object v21 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v22 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v20).withTypeResolverBuilder(((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v21));
    Object v23 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v24 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v22).withTypeResolverBuilder(((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v23));
    org.junit.Assert.assertNotNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std.defaultInstance();
    Object v3 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v5 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v6 = 1;
    Object v7 = 0;
    Object v8 = java.text.DateFormat.getDateTimeInstance((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = java.util.Locale.getDefault();
    Object v11 = ")V";
    Object v12 = java.util.TimeZone.getTimeZone(((java.lang.String)v11));
    Object v13 = null;
    Object v14 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v2),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v3),((com.fasterxml.jackson.databind.type.TypeFactory)v4),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v5),((java.text.DateFormat)v8),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v9),((java.util.Locale)v10),((java.util.TimeZone)v12),((com.fasterxml.jackson.core.Base64Variant)v13));
    Object v15 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v16 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v14).withAnnotationIntrospector(((com.fasterxml.jackson.databind.AnnotationIntrospector)v15));
    Object v17 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v18 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v14).withAnnotationIntrospector(((com.fasterxml.jackson.databind.AnnotationIntrospector)v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v20 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v18).withTypeFactory(((com.fasterxml.jackson.databind.type.TypeFactory)v19));
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std.defaultInstance();
    Object v3 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v5 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v6 = 1;
    Object v7 = 0;
    Object v8 = java.text.DateFormat.getDateTimeInstance((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = java.util.Locale.getDefault();
    Object v11 = ")V";
    Object v12 = java.util.TimeZone.getTimeZone(((java.lang.String)v11));
    Object v13 = null;
    Object v14 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v2),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v3),((com.fasterxml.jackson.databind.type.TypeFactory)v4),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v5),((java.text.DateFormat)v8),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v9),((java.util.Locale)v10),((java.util.TimeZone)v12),((com.fasterxml.jackson.core.Base64Variant)v13));
    Object v15 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v16 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v14).withAnnotationIntrospector(((com.fasterxml.jackson.databind.AnnotationIntrospector)v15));
    Object v17 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v18 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v14).withAnnotationIntrospector(((com.fasterxml.jackson.databind.AnnotationIntrospector)v17));
    Object v19 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v20 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v18).withClassIntrospector(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v19));
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std.defaultInstance();
    Object v3 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v5 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v6 = 1;
    Object v7 = 0;
    Object v8 = java.text.DateFormat.getDateTimeInstance((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = java.util.Locale.getDefault();
    Object v11 = ")V";
    Object v12 = java.util.TimeZone.getTimeZone(((java.lang.String)v11));
    Object v13 = null;
    Object v14 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v2),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v3),((com.fasterxml.jackson.databind.type.TypeFactory)v4),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v5),((java.text.DateFormat)v8),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v9),((java.util.Locale)v10),((java.util.TimeZone)v12),((com.fasterxml.jackson.core.Base64Variant)v13));
    Object v15 = ")V";
    Object v16 = java.util.TimeZone.getTimeZone(((java.lang.String)v15));
    Object v17 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v14).with(((java.util.TimeZone)v16));
    Object v18 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v19 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v14).withClassIntrospector(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v18));
    Object v20 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v21 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.EXISTING_PROPERTY;
    Object v22 = ((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v20).inclusion(((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v21));
    Object v23 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v19).withTypeResolverBuilder(((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v20));
    Object v24 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v25 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v23).withAnnotationIntrospector(((com.fasterxml.jackson.databind.AnnotationIntrospector)v24));
    Object v26 = java.util.Locale.getDefault();
    Object v27 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v25).with(((java.util.Locale)v26));
    Object v28 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v27).getBase64Variant();
    org.junit.Assert.assertNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std.defaultInstance();
    Object v3 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v5 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v6 = 1;
    Object v7 = 0;
    Object v8 = java.text.DateFormat.getDateTimeInstance((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = java.util.Locale.getDefault();
    Object v11 = ")V";
    Object v12 = java.util.TimeZone.getTimeZone(((java.lang.String)v11));
    Object v13 = null;
    Object v14 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v2),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v3),((com.fasterxml.jackson.databind.type.TypeFactory)v4),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v5),((java.text.DateFormat)v8),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v9),((java.util.Locale)v10),((java.util.TimeZone)v12),((com.fasterxml.jackson.core.Base64Variant)v13));
    Object v15 = java.util.Locale.getDefault();
    Object v16 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v17 = ((java.util.Locale)v15).equals(((java.lang.Object)v16));
    Object v18 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v14).with(((java.util.Locale)v15));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v20 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v18).withTypeFactory(((com.fasterxml.jackson.databind.type.TypeFactory)v19));
    Object v21 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v22 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v20).withAnnotationIntrospector(((com.fasterxml.jackson.databind.AnnotationIntrospector)v21));
    org.junit.Assert.assertNotNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std.defaultInstance();
    Object v3 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v5 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v6 = 1;
    Object v7 = 0;
    Object v8 = java.text.DateFormat.getDateTimeInstance((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = java.util.Locale.getDefault();
    Object v11 = ")V";
    Object v12 = java.util.TimeZone.getTimeZone(((java.lang.String)v11));
    Object v13 = null;
    Object v14 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v2),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v3),((com.fasterxml.jackson.databind.type.TypeFactory)v4),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v5),((java.text.DateFormat)v8),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v9),((java.util.Locale)v10),((java.util.TimeZone)v12),((com.fasterxml.jackson.core.Base64Variant)v13));
    Object v15 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v16 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v14).withClassIntrospector(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v15));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v18 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v16).withTypeFactory(((com.fasterxml.jackson.databind.type.TypeFactory)v17));
    Object v19 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v20 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v18).withClassIntrospector(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v19));
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std.defaultInstance();
    Object v3 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v5 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v6 = 1;
    Object v7 = 0;
    Object v8 = java.text.DateFormat.getDateTimeInstance((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = java.util.Locale.getDefault();
    Object v11 = ")V";
    Object v12 = java.util.TimeZone.getTimeZone(((java.lang.String)v11));
    Object v13 = null;
    Object v14 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v2),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v3),((com.fasterxml.jackson.databind.type.TypeFactory)v4),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v5),((java.text.DateFormat)v8),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v9),((java.util.Locale)v10),((java.util.TimeZone)v12),((com.fasterxml.jackson.core.Base64Variant)v13));
    Object v15 = com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std.defaultInstance();
    Object v16 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v14).withVisibilityChecker(((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v15));
    Object v17 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v18 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v16).withPropertyNamingStrategy(((com.fasterxml.jackson.databind.PropertyNamingStrategy)v17));
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std.defaultInstance();
    Object v3 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v5 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v6 = 1;
    Object v7 = 0;
    Object v8 = java.text.DateFormat.getDateTimeInstance((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = java.util.Locale.getDefault();
    Object v11 = ")V";
    Object v12 = java.util.TimeZone.getTimeZone(((java.lang.String)v11));
    Object v13 = null;
    Object v14 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v2),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v3),((com.fasterxml.jackson.databind.type.TypeFactory)v4),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v5),((java.text.DateFormat)v8),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v9),((java.util.Locale)v10),((java.util.TimeZone)v12),((com.fasterxml.jackson.core.Base64Variant)v13));
    Object v15 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v16 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v14).withAppendedAnnotationIntrospector(((com.fasterxml.jackson.databind.AnnotationIntrospector)v15));
    Object v17 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v18 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v16).withClassIntrospector(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v17));
    Object v19 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v20 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v18).withTypeResolverBuilder(((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v19));
    Object v21 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v22 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v20).withAnnotationIntrospector(((com.fasterxml.jackson.databind.AnnotationIntrospector)v21));
    org.junit.Assert.assertNotNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std.defaultInstance();
    Object v3 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v5 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v6 = 1;
    Object v7 = 0;
    Object v8 = java.text.DateFormat.getDateTimeInstance((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = java.util.Locale.getDefault();
    Object v11 = ")V";
    Object v12 = java.util.TimeZone.getTimeZone(((java.lang.String)v11));
    Object v13 = null;
    Object v14 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v2),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v3),((com.fasterxml.jackson.databind.type.TypeFactory)v4),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v5),((java.text.DateFormat)v8),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v9),((java.util.Locale)v10),((java.util.TimeZone)v12),((com.fasterxml.jackson.core.Base64Variant)v13));
    Object v15 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v16 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v14).withAnnotationIntrospector(((com.fasterxml.jackson.databind.AnnotationIntrospector)v15));
    Object v17 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v18 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v14).withAnnotationIntrospector(((com.fasterxml.jackson.databind.AnnotationIntrospector)v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v20 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v18).withTypeFactory(((com.fasterxml.jackson.databind.type.TypeFactory)v19));
    Object v21 = java.util.Locale.getDefault();
    Object v22 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v20).with(((java.util.Locale)v21));
    org.junit.Assert.assertNotNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std.defaultInstance();
    Object v3 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v5 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v6 = 1;
    Object v7 = 0;
    Object v8 = java.text.DateFormat.getDateTimeInstance((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = java.util.Locale.getDefault();
    Object v11 = ")V";
    Object v12 = java.util.TimeZone.getTimeZone(((java.lang.String)v11));
    Object v13 = null;
    Object v14 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v2),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v3),((com.fasterxml.jackson.databind.type.TypeFactory)v4),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v5),((java.text.DateFormat)v8),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v9),((java.util.Locale)v10),((java.util.TimeZone)v12),((com.fasterxml.jackson.core.Base64Variant)v13));
    Object v15 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v16 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v14).withAnnotationIntrospector(((com.fasterxml.jackson.databind.AnnotationIntrospector)v15));
    Object v17 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v18 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v16).withClassIntrospector(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v17));
    Object v19 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v20 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v18).withPropertyNamingStrategy(((com.fasterxml.jackson.databind.PropertyNamingStrategy)v19));
    Object v21 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v22 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v20).withClassIntrospector(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v21));
    org.junit.Assert.assertNotNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std.defaultInstance();
    Object v3 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v5 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v6 = 1;
    Object v7 = 0;
    Object v8 = java.text.DateFormat.getDateTimeInstance((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = java.util.Locale.getDefault();
    Object v11 = ")V";
    Object v12 = java.util.TimeZone.getTimeZone(((java.lang.String)v11));
    Object v13 = null;
    Object v14 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v2),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v3),((com.fasterxml.jackson.databind.type.TypeFactory)v4),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v5),((java.text.DateFormat)v8),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v9),((java.util.Locale)v10),((java.util.TimeZone)v12),((com.fasterxml.jackson.core.Base64Variant)v13));
    Object v15 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v16 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v14).withAnnotationIntrospector(((com.fasterxml.jackson.databind.AnnotationIntrospector)v15));
    Object v17 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v18 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v14).withAnnotationIntrospector(((com.fasterxml.jackson.databind.AnnotationIntrospector)v17));
    Object v19 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v20 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v18).withInsertedAnnotationIntrospector(((com.fasterxml.jackson.databind.AnnotationIntrospector)v19));
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std.defaultInstance();
    Object v3 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v5 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v6 = 1;
    Object v7 = 0;
    Object v8 = java.text.DateFormat.getDateTimeInstance((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = java.util.Locale.getDefault();
    Object v11 = ")V";
    Object v12 = java.util.TimeZone.getTimeZone(((java.lang.String)v11));
    Object v13 = null;
    Object v14 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v2),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v3),((com.fasterxml.jackson.databind.type.TypeFactory)v4),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v5),((java.text.DateFormat)v8),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v9),((java.util.Locale)v10),((java.util.TimeZone)v12),((com.fasterxml.jackson.core.Base64Variant)v13));
    Object v15 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v16 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v14).withAnnotationIntrospector(((com.fasterxml.jackson.databind.AnnotationIntrospector)v15));
    Object v17 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v18 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v16).withPropertyNamingStrategy(((com.fasterxml.jackson.databind.PropertyNamingStrategy)v17));
    Object v19 = java.util.Locale.getDefault();
    Object v20 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v16).with(((java.util.Locale)v19));
    Object v21 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v22 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v20).withClassIntrospector(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v21));
    Object v23 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v24 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v20).withPropertyNamingStrategy(((com.fasterxml.jackson.databind.PropertyNamingStrategy)v23));
    Object v25 = java.util.Locale.getDefault();
    Object v26 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v24).with(((java.util.Locale)v25));
    org.junit.Assert.assertNotNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std.defaultInstance();
    Object v3 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v5 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v6 = 1;
    Object v7 = 0;
    Object v8 = java.text.DateFormat.getDateTimeInstance((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = java.util.Locale.getDefault();
    Object v11 = ")V";
    Object v12 = java.util.TimeZone.getTimeZone(((java.lang.String)v11));
    Object v13 = null;
    Object v14 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v2),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v3),((com.fasterxml.jackson.databind.type.TypeFactory)v4),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v5),((java.text.DateFormat)v8),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v9),((java.util.Locale)v10),((java.util.TimeZone)v12),((com.fasterxml.jackson.core.Base64Variant)v13));
    Object v15 = com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std.defaultInstance();
    Object v16 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v14).withVisibilityChecker(((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v15));
    Object v17 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v18 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v16).withPropertyNamingStrategy(((com.fasterxml.jackson.databind.PropertyNamingStrategy)v17));
    Object v19 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v20 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v18).withPropertyNamingStrategy(((com.fasterxml.jackson.databind.PropertyNamingStrategy)v19));
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std.defaultInstance();
    Object v3 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v5 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v6 = 1;
    Object v7 = 0;
    Object v8 = java.text.DateFormat.getDateTimeInstance((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = java.util.Locale.getDefault();
    Object v11 = ")V";
    Object v12 = java.util.TimeZone.getTimeZone(((java.lang.String)v11));
    Object v13 = null;
    Object v14 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v2),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v3),((com.fasterxml.jackson.databind.type.TypeFactory)v4),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v5),((java.text.DateFormat)v8),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v9),((java.util.Locale)v10),((java.util.TimeZone)v12),((com.fasterxml.jackson.core.Base64Variant)v13));
    Object v15 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v16 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v14).withTypeResolverBuilder(((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v15));
    Object v17 = java.util.Locale.getDefault();
    Object v18 = ((java.util.Locale)v17).getDisplayCountry();
    Object v19 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v16).with(((java.util.Locale)v17));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std.defaultInstance();
    Object v3 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v5 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v6 = 1;
    Object v7 = 0;
    Object v8 = java.text.DateFormat.getDateTimeInstance((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = java.util.Locale.getDefault();
    Object v11 = ")V";
    Object v12 = java.util.TimeZone.getTimeZone(((java.lang.String)v11));
    Object v13 = null;
    Object v14 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v2),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v3),((com.fasterxml.jackson.databind.type.TypeFactory)v4),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v5),((java.text.DateFormat)v8),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v9),((java.util.Locale)v10),((java.util.TimeZone)v12),((com.fasterxml.jackson.core.Base64Variant)v13));
    Object v15 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v16 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v14).withAnnotationIntrospector(((com.fasterxml.jackson.databind.AnnotationIntrospector)v15));
    Object v17 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v18 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v16).withPropertyNamingStrategy(((com.fasterxml.jackson.databind.PropertyNamingStrategy)v17));
    Object v19 = java.util.Locale.getDefault();
    Object v20 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v16).with(((java.util.Locale)v19));
    Object v21 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v22 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v20).withInsertedAnnotationIntrospector(((com.fasterxml.jackson.databind.AnnotationIntrospector)v21));
    Object v23 = ")V";
    Object v24 = java.util.TimeZone.getTimeZone(((java.lang.String)v23));
    Object v25 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v22).with(((java.util.TimeZone)v24));
    Object v26 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v22).getDateFormat();
    org.junit.Assert.assertNotNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std.defaultInstance();
    Object v3 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v5 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v6 = 1;
    Object v7 = 0;
    Object v8 = java.text.DateFormat.getDateTimeInstance((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = java.util.Locale.getDefault();
    Object v11 = ")V";
    Object v12 = java.util.TimeZone.getTimeZone(((java.lang.String)v11));
    Object v13 = null;
    Object v14 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v2),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v3),((com.fasterxml.jackson.databind.type.TypeFactory)v4),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v5),((java.text.DateFormat)v8),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v9),((java.util.Locale)v10),((java.util.TimeZone)v12),((com.fasterxml.jackson.core.Base64Variant)v13));
    Object v15 = ")V";
    Object v16 = java.util.TimeZone.getTimeZone(((java.lang.String)v15));
    Object v17 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v14).with(((java.util.TimeZone)v16));
    Object v18 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v19 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v14).withClassIntrospector(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v18));
    Object v20 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v21 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.EXISTING_PROPERTY;
    Object v22 = ((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v20).inclusion(((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v21));
    Object v23 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v19).withTypeResolverBuilder(((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v20));
    Object v24 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v25 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v23).withAppendedAnnotationIntrospector(((com.fasterxml.jackson.databind.AnnotationIntrospector)v24));
    Object v26 = ")V";
    Object v27 = java.util.TimeZone.getTimeZone(((java.lang.String)v26));
    Object v28 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v23).with(((java.util.TimeZone)v27));
    Object v29 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v30 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v28).withClassIntrospector(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v29));
    org.junit.Assert.assertNotNull(v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std.defaultInstance();
    Object v3 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v5 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v6 = 1;
    Object v7 = 0;
    Object v8 = java.text.DateFormat.getDateTimeInstance((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = java.util.Locale.getDefault();
    Object v11 = ")V";
    Object v12 = java.util.TimeZone.getTimeZone(((java.lang.String)v11));
    Object v13 = null;
    Object v14 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v2),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v3),((com.fasterxml.jackson.databind.type.TypeFactory)v4),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v5),((java.text.DateFormat)v8),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v9),((java.util.Locale)v10),((java.util.TimeZone)v12),((com.fasterxml.jackson.core.Base64Variant)v13));
    Object v15 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v16 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v14).withAnnotationIntrospector(((com.fasterxml.jackson.databind.AnnotationIntrospector)v15));
    Object v17 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v18 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v16).withClassIntrospector(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v17));
    Object v19 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v20 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v18).withPropertyNamingStrategy(((com.fasterxml.jackson.databind.PropertyNamingStrategy)v19));
    Object v21 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v22 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v20).withClassIntrospector(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v21));
    Object v23 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v24 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v22).withPropertyNamingStrategy(((com.fasterxml.jackson.databind.PropertyNamingStrategy)v23));
    org.junit.Assert.assertNotNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std.defaultInstance();
    Object v3 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v5 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v6 = 1;
    Object v7 = 0;
    Object v8 = java.text.DateFormat.getDateTimeInstance((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = java.util.Locale.getDefault();
    Object v11 = ")V";
    Object v12 = java.util.TimeZone.getTimeZone(((java.lang.String)v11));
    Object v13 = null;
    Object v14 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v2),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v3),((com.fasterxml.jackson.databind.type.TypeFactory)v4),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v5),((java.text.DateFormat)v8),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v9),((java.util.Locale)v10),((java.util.TimeZone)v12),((com.fasterxml.jackson.core.Base64Variant)v13));
    Object v15 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v16 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v14).withAnnotationIntrospector(((com.fasterxml.jackson.databind.AnnotationIntrospector)v15));
    Object v17 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v18 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v16).withClassIntrospector(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v17));
    Object v19 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v20 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v18).withPropertyNamingStrategy(((com.fasterxml.jackson.databind.PropertyNamingStrategy)v19));
    Object v21 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v22 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v20).withClassIntrospector(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v21));
    Object v23 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v24 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v22).withPropertyNamingStrategy(((com.fasterxml.jackson.databind.PropertyNamingStrategy)v23));
    Object v25 = java.util.Locale.getDefault();
    Object v26 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v24).with(((java.util.Locale)v25));
    org.junit.Assert.assertNotNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std.defaultInstance();
    Object v3 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v5 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v6 = 1;
    Object v7 = 0;
    Object v8 = java.text.DateFormat.getDateTimeInstance((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = java.util.Locale.getDefault();
    Object v11 = ")V";
    Object v12 = java.util.TimeZone.getTimeZone(((java.lang.String)v11));
    Object v13 = null;
    Object v14 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v2),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v3),((com.fasterxml.jackson.databind.type.TypeFactory)v4),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v5),((java.text.DateFormat)v8),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v9),((java.util.Locale)v10),((java.util.TimeZone)v12),((com.fasterxml.jackson.core.Base64Variant)v13));
    Object v15 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v16 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v14).withAnnotationIntrospector(((com.fasterxml.jackson.databind.AnnotationIntrospector)v15));
    Object v17 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v18 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v16).withClassIntrospector(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v17));
    Object v19 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v20 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v18).withPropertyNamingStrategy(((com.fasterxml.jackson.databind.PropertyNamingStrategy)v19));
    Object v21 = com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std.defaultInstance();
    Object v22 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v20).withVisibilityChecker(((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v21));
    Object v23 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v24 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v25 = com.fasterxml.jackson.databind.ObjectMapper.findModules(((java.lang.ClassLoader)v24));
    Object v26 = ((com.fasterxml.jackson.databind.AnnotationIntrospector)v23).allIntrospectors(((java.util.Collection)v25));
    Object v27 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v22).withAnnotationIntrospector(((com.fasterxml.jackson.databind.AnnotationIntrospector)v23));
    org.junit.Assert.assertNotNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std.defaultInstance();
    Object v3 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v5 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v6 = 1;
    Object v7 = 0;
    Object v8 = java.text.DateFormat.getDateTimeInstance((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = java.util.Locale.getDefault();
    Object v11 = ")V";
    Object v12 = java.util.TimeZone.getTimeZone(((java.lang.String)v11));
    Object v13 = null;
    Object v14 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v2),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v3),((com.fasterxml.jackson.databind.type.TypeFactory)v4),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v5),((java.text.DateFormat)v8),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v9),((java.util.Locale)v10),((java.util.TimeZone)v12),((com.fasterxml.jackson.core.Base64Variant)v13));
    Object v15 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v16 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v14).withAnnotationIntrospector(((com.fasterxml.jackson.databind.AnnotationIntrospector)v15));
    Object v17 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v18 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v16).withClassIntrospector(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v17));
    Object v19 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v20 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v18).withPropertyNamingStrategy(((com.fasterxml.jackson.databind.PropertyNamingStrategy)v19));
    Object v21 = com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std.defaultInstance();
    Object v22 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v20).withVisibilityChecker(((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v21));
    Object v23 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v22).getTypeFactory();
    org.junit.Assert.assertNotNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std.defaultInstance();
    Object v3 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v5 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v6 = 1;
    Object v7 = 0;
    Object v8 = java.text.DateFormat.getDateTimeInstance((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = java.util.Locale.getDefault();
    Object v11 = ")V";
    Object v12 = java.util.TimeZone.getTimeZone(((java.lang.String)v11));
    Object v13 = null;
    Object v14 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v2),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v3),((com.fasterxml.jackson.databind.type.TypeFactory)v4),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v5),((java.text.DateFormat)v8),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v9),((java.util.Locale)v10),((java.util.TimeZone)v12),((com.fasterxml.jackson.core.Base64Variant)v13));
    Object v15 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v16 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v14).withAnnotationIntrospector(((com.fasterxml.jackson.databind.AnnotationIntrospector)v15));
    Object v17 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v18 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v16).withClassIntrospector(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v17));
    Object v19 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v20 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v18).withPropertyNamingStrategy(((com.fasterxml.jackson.databind.PropertyNamingStrategy)v19));
    Object v21 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v22 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v20).withClassIntrospector(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v21));
    Object v23 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v22).getTimeZone();
    org.junit.Assert.assertNotNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std.defaultInstance();
    Object v3 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v5 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v6 = 1;
    Object v7 = 0;
    Object v8 = java.text.DateFormat.getDateTimeInstance((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = java.util.Locale.getDefault();
    Object v11 = ")V";
    Object v12 = java.util.TimeZone.getTimeZone(((java.lang.String)v11));
    Object v13 = null;
    Object v14 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v2),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v3),((com.fasterxml.jackson.databind.type.TypeFactory)v4),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v5),((java.text.DateFormat)v8),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v9),((java.util.Locale)v10),((java.util.TimeZone)v12),((com.fasterxml.jackson.core.Base64Variant)v13));
    Object v15 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v16 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v14).withAppendedAnnotationIntrospector(((com.fasterxml.jackson.databind.AnnotationIntrospector)v15));
    Object v17 = ")V";
    Object v18 = java.util.TimeZone.getTimeZone(((java.lang.String)v17));
    Object v19 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v16).with(((java.util.TimeZone)v18));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std.defaultInstance();
    Object v3 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v5 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v6 = 1;
    Object v7 = 0;
    Object v8 = java.text.DateFormat.getDateTimeInstance((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = java.util.Locale.getDefault();
    Object v11 = ")V";
    Object v12 = java.util.TimeZone.getTimeZone(((java.lang.String)v11));
    Object v13 = null;
    Object v14 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v2),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v3),((com.fasterxml.jackson.databind.type.TypeFactory)v4),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v5),((java.text.DateFormat)v8),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v9),((java.util.Locale)v10),((java.util.TimeZone)v12),((com.fasterxml.jackson.core.Base64Variant)v13));
    Object v15 = java.util.Locale.getDefault();
    Object v16 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v17 = ((java.util.Locale)v15).equals(((java.lang.Object)v16));
    Object v18 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v14).with(((java.util.Locale)v15));
    Object v19 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v20 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v18).withTypeResolverBuilder(((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v19));
    Object v21 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v22 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v20).withAnnotationIntrospector(((com.fasterxml.jackson.databind.AnnotationIntrospector)v21));
    Object v23 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v24 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v25 = com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std.defaultInstance();
    Object v26 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v28 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v29 = 1;
    Object v30 = 0;
    Object v31 = java.text.DateFormat.getDateTimeInstance((((java.lang.Integer)v29).intValue()),(((java.lang.Integer)v30).intValue()));
    Object v32 = null;
    Object v33 = java.util.Locale.getDefault();
    Object v34 = ")V";
    Object v35 = java.util.TimeZone.getTimeZone(((java.lang.String)v34));
    Object v36 = null;
    Object v37 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v23),((com.fasterxml.jackson.databind.AnnotationIntrospector)v24),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v25),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v26),((com.fasterxml.jackson.databind.type.TypeFactory)v27),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v28),((java.text.DateFormat)v31),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v32),((java.util.Locale)v33),((java.util.TimeZone)v35),((com.fasterxml.jackson.core.Base64Variant)v36));
    Object v38 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v37).getVisibilityChecker();
    Object v39 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v22).withVisibilityChecker(((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v38));
    org.junit.Assert.assertNotNull(v39);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std.defaultInstance();
    Object v3 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v5 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v6 = 1;
    Object v7 = 0;
    Object v8 = java.text.DateFormat.getDateTimeInstance((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = java.util.Locale.getDefault();
    Object v11 = ")V";
    Object v12 = java.util.TimeZone.getTimeZone(((java.lang.String)v11));
    Object v13 = null;
    Object v14 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v2),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v3),((com.fasterxml.jackson.databind.type.TypeFactory)v4),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v5),((java.text.DateFormat)v8),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v9),((java.util.Locale)v10),((java.util.TimeZone)v12),((com.fasterxml.jackson.core.Base64Variant)v13));
    Object v15 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v16 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v14).withAppendedAnnotationIntrospector(((com.fasterxml.jackson.databind.AnnotationIntrospector)v15));
    Object v17 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v18 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v16).withClassIntrospector(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v17));
    Object v19 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v20 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v18).withTypeResolverBuilder(((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v19));
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = ((com.fasterxml.jackson.databind.type.TypeFactory)v21).moreSpecificType(((com.fasterxml.jackson.databind.JavaType)v22),((com.fasterxml.jackson.databind.JavaType)v23));
    Object v25 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v20).withTypeFactory(((com.fasterxml.jackson.databind.type.TypeFactory)v21));
    org.junit.Assert.assertNotNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std.defaultInstance();
    Object v3 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v5 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v6 = 1;
    Object v7 = 0;
    Object v8 = java.text.DateFormat.getDateTimeInstance((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = java.util.Locale.getDefault();
    Object v11 = ")V";
    Object v12 = java.util.TimeZone.getTimeZone(((java.lang.String)v11));
    Object v13 = null;
    Object v14 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v2),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v3),((com.fasterxml.jackson.databind.type.TypeFactory)v4),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v5),((java.text.DateFormat)v8),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v9),((java.util.Locale)v10),((java.util.TimeZone)v12),((com.fasterxml.jackson.core.Base64Variant)v13));
    Object v15 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v16 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v14).withAnnotationIntrospector(((com.fasterxml.jackson.databind.AnnotationIntrospector)v15));
    Object v17 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v18 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v16).withClassIntrospector(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v17));
    Object v19 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v20 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v18).withPropertyNamingStrategy(((com.fasterxml.jackson.databind.PropertyNamingStrategy)v19));
    Object v21 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v22 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v20).withClassIntrospector(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v21));
    Object v23 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v24 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v22).withPropertyNamingStrategy(((com.fasterxml.jackson.databind.PropertyNamingStrategy)v23));
    Object v25 = java.util.Locale.getDefault();
    Object v26 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v24).with(((java.util.Locale)v25));
    Object v27 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v28 = ((com.fasterxml.jackson.databind.AnnotationIntrospector)v27).allIntrospectors();
    Object v29 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v26).withAnnotationIntrospector(((com.fasterxml.jackson.databind.AnnotationIntrospector)v27));
    org.junit.Assert.assertNotNull(v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std.defaultInstance();
    Object v3 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v5 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v6 = 1;
    Object v7 = 0;
    Object v8 = java.text.DateFormat.getDateTimeInstance((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = java.util.Locale.getDefault();
    Object v11 = ")V";
    Object v12 = java.util.TimeZone.getTimeZone(((java.lang.String)v11));
    Object v13 = null;
    Object v14 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v2),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v3),((com.fasterxml.jackson.databind.type.TypeFactory)v4),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v5),((java.text.DateFormat)v8),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v9),((java.util.Locale)v10),((java.util.TimeZone)v12),((com.fasterxml.jackson.core.Base64Variant)v13));
    Object v15 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v16 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v14).withAnnotationIntrospector(((com.fasterxml.jackson.databind.AnnotationIntrospector)v15));
    Object v17 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v18 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v16).withPropertyNamingStrategy(((com.fasterxml.jackson.databind.PropertyNamingStrategy)v17));
    Object v19 = java.util.Locale.getDefault();
    Object v20 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v16).with(((java.util.Locale)v19));
    Object v21 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v22 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v20).withTypeResolverBuilder(((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v21));
    Object v23 = java.util.Locale.getDefault();
    Object v24 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v20).with(((java.util.Locale)v23));
    Object v25 = com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std.defaultInstance();
    Object v26 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.PROTECTED_AND_PUBLIC;
    Object v27 = ((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v25).withGetterVisibility(((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v26));
    Object v28 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v24).withVisibilityChecker(((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v25));
    Object v29 = ")V";
    Object v30 = java.util.TimeZone.getTimeZone(((java.lang.String)v29));
    Object v31 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v28).with(((java.util.TimeZone)v30));
    org.junit.Assert.assertNotNull(v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std.defaultInstance();
    Object v3 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v5 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v6 = 1;
    Object v7 = 0;
    Object v8 = java.text.DateFormat.getDateTimeInstance((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = java.util.Locale.getDefault();
    Object v11 = ")V";
    Object v12 = java.util.TimeZone.getTimeZone(((java.lang.String)v11));
    Object v13 = null;
    Object v14 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v2),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v3),((com.fasterxml.jackson.databind.type.TypeFactory)v4),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v5),((java.text.DateFormat)v8),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v9),((java.util.Locale)v10),((java.util.TimeZone)v12),((com.fasterxml.jackson.core.Base64Variant)v13));
    Object v15 = ")V";
    Object v16 = java.util.TimeZone.getTimeZone(((java.lang.String)v15));
    Object v17 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v14).with(((java.util.TimeZone)v16));
    Object v18 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v19 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v14).withClassIntrospector(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v18));
    Object v20 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v21 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.EXISTING_PROPERTY;
    Object v22 = ((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v20).inclusion(((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v21));
    Object v23 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v19).withTypeResolverBuilder(((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v20));
    Object v24 = java.util.Locale.getDefault();
    Object v25 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v23).with(((java.util.Locale)v24));
    Object v26 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v27 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v25).withAnnotationIntrospector(((com.fasterxml.jackson.databind.AnnotationIntrospector)v26));
    org.junit.Assert.assertNotNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std.defaultInstance();
    Object v3 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v5 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v6 = 1;
    Object v7 = 0;
    Object v8 = java.text.DateFormat.getDateTimeInstance((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = java.util.Locale.getDefault();
    Object v11 = ")V";
    Object v12 = java.util.TimeZone.getTimeZone(((java.lang.String)v11));
    Object v13 = null;
    Object v14 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v2),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v3),((com.fasterxml.jackson.databind.type.TypeFactory)v4),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v5),((java.text.DateFormat)v8),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v9),((java.util.Locale)v10),((java.util.TimeZone)v12),((com.fasterxml.jackson.core.Base64Variant)v13));
    Object v15 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v16 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v14).withAnnotationIntrospector(((com.fasterxml.jackson.databind.AnnotationIntrospector)v15));
    Object v17 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v18 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v16).withClassIntrospector(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v17));
    Object v19 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v20 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v18).withPropertyNamingStrategy(((com.fasterxml.jackson.databind.PropertyNamingStrategy)v19));
    Object v21 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v22 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v20).withClassIntrospector(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v21));
    Object v23 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v24 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v22).withPropertyNamingStrategy(((com.fasterxml.jackson.databind.PropertyNamingStrategy)v23));
    Object v25 = java.util.Locale.getDefault();
    Object v26 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v24).with(((java.util.Locale)v25));
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v28 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v26).withTypeFactory(((com.fasterxml.jackson.databind.type.TypeFactory)v27));
    org.junit.Assert.assertNotNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std.defaultInstance();
    Object v3 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v5 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v6 = 1;
    Object v7 = 0;
    Object v8 = java.text.DateFormat.getDateTimeInstance((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = java.util.Locale.getDefault();
    Object v11 = ")V";
    Object v12 = java.util.TimeZone.getTimeZone(((java.lang.String)v11));
    Object v13 = null;
    Object v14 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v2),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v3),((com.fasterxml.jackson.databind.type.TypeFactory)v4),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v5),((java.text.DateFormat)v8),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v9),((java.util.Locale)v10),((java.util.TimeZone)v12),((com.fasterxml.jackson.core.Base64Variant)v13));
    Object v15 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v16 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v14).withAnnotationIntrospector(((com.fasterxml.jackson.databind.AnnotationIntrospector)v15));
    Object v17 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v18 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v14).withAnnotationIntrospector(((com.fasterxml.jackson.databind.AnnotationIntrospector)v17));
    Object v19 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v20 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v18).withClassIntrospector(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v19));
    Object v21 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v22 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v23 = com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std.defaultInstance();
    Object v24 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v26 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v27 = 1;
    Object v28 = 0;
    Object v29 = java.text.DateFormat.getDateTimeInstance((((java.lang.Integer)v27).intValue()),(((java.lang.Integer)v28).intValue()));
    Object v30 = null;
    Object v31 = java.util.Locale.getDefault();
    Object v32 = ")V";
    Object v33 = java.util.TimeZone.getTimeZone(((java.lang.String)v32));
    Object v34 = null;
    Object v35 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v21),((com.fasterxml.jackson.databind.AnnotationIntrospector)v22),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v23),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v24),((com.fasterxml.jackson.databind.type.TypeFactory)v25),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v26),((java.text.DateFormat)v29),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v30),((java.util.Locale)v31),((java.util.TimeZone)v33),((com.fasterxml.jackson.core.Base64Variant)v34));
    Object v36 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v35).getVisibilityChecker();
    Object v37 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v20).withVisibilityChecker(((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v36));
    Object v38 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v39 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v20).withAnnotationIntrospector(((com.fasterxml.jackson.databind.AnnotationIntrospector)v38));
    org.junit.Assert.assertNotNull(v39);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std.defaultInstance();
    Object v3 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v5 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v6 = 1;
    Object v7 = 0;
    Object v8 = java.text.DateFormat.getDateTimeInstance((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = null;
    Object v10 = java.util.Locale.getDefault();
    Object v11 = ")V";
    Object v12 = java.util.TimeZone.getTimeZone(((java.lang.String)v11));
    Object v13 = null;
    Object v14 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v2),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v3),((com.fasterxml.jackson.databind.type.TypeFactory)v4),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v5),((java.text.DateFormat)v8),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v9),((java.util.Locale)v10),((java.util.TimeZone)v12),((com.fasterxml.jackson.core.Base64Variant)v13));
    Object v15 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v16 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v14).withAnnotationIntrospector(((com.fasterxml.jackson.databind.AnnotationIntrospector)v15));
    Object v17 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v18 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v14).withAnnotationIntrospector(((com.fasterxml.jackson.databind.AnnotationIntrospector)v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v20 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v18).withTypeFactory(((com.fasterxml.jackson.databind.type.TypeFactory)v19));
    Object v21 = java.util.Locale.getDefault();
    Object v22 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v20).with(((java.util.Locale)v21));
    Object v23 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy();
    Object v24 = ((com.fasterxml.jackson.databind.cfg.BaseSettings)v22).withPropertyNamingStrategy(((com.fasterxml.jackson.databind.PropertyNamingStrategy)v23));
    org.junit.Assert.assertNotNull(v24);
  }
}
