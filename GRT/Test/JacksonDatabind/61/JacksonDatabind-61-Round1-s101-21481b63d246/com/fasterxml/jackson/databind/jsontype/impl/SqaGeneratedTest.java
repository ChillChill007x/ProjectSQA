package com.fasterxml.jackson.databind.jsontype.impl;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.noTypeInfoBuilder();
    Object v1 = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME;
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v6 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.type.TypeFactory)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = ((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v6).idFromValueAndType(((java.lang.Object)v8),((java.lang.Class)v10));
    Object v12 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v0).init(((com.fasterxml.jackson.annotation.JsonTypeInfo.Id)v1),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v6));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.noTypeInfoBuilder();
    Object v1 = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME;
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v6 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.type.TypeFactory)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = ((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v6).idFromValueAndType(((java.lang.Object)v8),((java.lang.Class)v10));
    Object v12 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v0).init(((com.fasterxml.jackson.annotation.JsonTypeInfo.Id)v1),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v6));
    Object v13 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v12).getTypeProperty();
    org.junit.Assert.assertEquals((Object)("@type"), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.noTypeInfoBuilder();
    Object v1 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
    Object v2 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v0).inclusion(((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v1));
    Object v3 = "Can not refine serialization type %s into %s; types not related";
    Object v4 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v0).typeProperty(((java.lang.String)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.noTypeInfoBuilder();
    Object v1 = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME;
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v6 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.type.TypeFactory)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = ((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v6).idFromValueAndType(((java.lang.Object)v8),((java.lang.Class)v10));
    Object v12 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v0).init(((com.fasterxml.jackson.annotation.JsonTypeInfo.Id)v1),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v6));
    Object v13 = "";
    Object v14 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v12).typeProperty(((java.lang.String)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.noTypeInfoBuilder();
    Object v1 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
    Object v2 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v0).inclusion(((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.noTypeInfoBuilder();
    Object v1 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
    Object v2 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v0).inclusion(((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v1));
    Object v3 = "Can not refine serialization type %s into %s; types not related";
    Object v4 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v0).typeProperty(((java.lang.String)v3));
    Object v5 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.WRAPPER_OBJECT;
    Object v6 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v4).inclusion(((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.noTypeInfoBuilder();
    Object v1 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
    Object v2 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v0).inclusion(((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v1));
    Object v3 = "Can not refine serialization type %s into %s; types not related";
    Object v4 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v0).typeProperty(((java.lang.String)v3));
    Object v5 = "#";
    Object v6 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v4).typeProperty(((java.lang.String)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v1 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v0).getDefaultImpl();
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.noTypeInfoBuilder();
    Object v1 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
    Object v2 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v0).inclusion(((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v1));
    Object v3 = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.MINIMAL_CLASS;
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v8 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.type.TypeFactory)v7));
    Object v9 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v10 = ((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v8).idFromValue(((java.lang.Object)v9));
    Object v11 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v2).init(((com.fasterxml.jackson.annotation.JsonTypeInfo.Id)v3),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v8));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.noTypeInfoBuilder();
    Object v1 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
    Object v2 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v0).inclusion(((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v1));
    Object v3 = "Can not refine serialization type %s into %s; types not related";
    Object v4 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v0).typeProperty(((java.lang.String)v3));
    Object v5 = "{";
    Object v6 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v4).typeProperty(((java.lang.String)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.noTypeInfoBuilder();
    Object v1 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
    Object v2 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v0).inclusion(((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v1));
    Object v3 = "Can not refine serialization type %s into %s; types not related";
    Object v4 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v0).typeProperty(((java.lang.String)v3));
    Object v5 = "{";
    Object v6 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v4).typeProperty(((java.lang.String)v5));
    Object v7 = true;
    Object v8 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v6).typeIdVisibility((((java.lang.Boolean)v7).booleanValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v0).defaultImpl(((java.lang.Class)v2));
    Object v4 = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NONE;
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v9 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.type.TypeFactory)v8));
    Object v10 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v0).init(((com.fasterxml.jackson.annotation.JsonTypeInfo.Id)v4),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v1 = "";
    Object v2 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v0).typeProperty(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.noTypeInfoBuilder();
    Object v1 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
    Object v2 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v0).inclusion(((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v1));
    Object v3 = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CUSTOM;
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v8 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.type.TypeFactory)v7));
    Object v9 = ")V";
    Object v10 = java.util.TimeZone.getTimeZone(((java.lang.String)v9));
    Object v11 = ((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v8).idFromValue(((java.lang.Object)v10));
    Object v12 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v2).init(((com.fasterxml.jackson.annotation.JsonTypeInfo.Id)v3),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v8));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.noTypeInfoBuilder();
    Object v1 = true;
    Object v2 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v0).typeIdVisibility((((java.lang.Boolean)v1).booleanValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.noTypeInfoBuilder();
    Object v1 = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME;
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v6 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.type.TypeFactory)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = ((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v6).idFromValueAndType(((java.lang.Object)v8),((java.lang.Class)v10));
    Object v12 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v0).init(((com.fasterxml.jackson.annotation.JsonTypeInfo.Id)v1),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v6));
    Object v13 = "";
    Object v14 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v12).typeProperty(((java.lang.String)v13));
    Object v15 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
    Object v16 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v14).inclusion(((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v15));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v0).defaultImpl(((java.lang.Class)v2));
    Object v4 = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NONE;
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v9 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.type.TypeFactory)v8));
    Object v10 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v0).init(((com.fasterxml.jackson.annotation.JsonTypeInfo.Id)v4),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v9));
    Object v11 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v10).isTypeIdVisible();
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.noTypeInfoBuilder();
    Object v1 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
    Object v2 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v0).inclusion(((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v1));
    Object v3 = "Can not refine serialization type %s into %s; types not related";
    Object v4 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v0).typeProperty(((java.lang.String)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v4).defaultImpl(((java.lang.Class)v6));
    Object v8 = "iBems";
    Object v9 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v4).typeProperty(((java.lang.String)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.noTypeInfoBuilder();
    Object v1 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
    Object v2 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v0).inclusion(((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v1));
    Object v3 = "Can not refine serialization type %s into %s; types not related";
    Object v4 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v0).typeProperty(((java.lang.String)v3));
    Object v5 = "{";
    Object v6 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v4).typeProperty(((java.lang.String)v5));
    Object v7 = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NONE;
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v10),((com.fasterxml.jackson.databind.type.TypeFactory)v11));
    Object v13 = ((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v12).idFromBaseType();
    Object v14 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v6).init(((com.fasterxml.jackson.annotation.JsonTypeInfo.Id)v7),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v12));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v0).defaultImpl(((java.lang.Class)v2));
    Object v4 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.WRAPPER_OBJECT;
    Object v5 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v0).inclusion(((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v1 = null;
    Object v2 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v6 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v7 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v1),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v2),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v4),((com.fasterxml.jackson.databind.util.RootNameLookup)v5),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v6));
    Object v8 = com.fasterxml.jackson.databind.MapperFeature.ALLOW_FINAL_FIELDS_AS_MUTATORS;
    Object v9 = false;
    Object v10 = ((com.fasterxml.jackson.databind.cfg.MapperConfig)v7).with(((com.fasterxml.jackson.databind.MapperFeature)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = 0;
    Object v13 = new java.util.HashSet((((java.lang.Integer)v12).intValue()));
    Object v14 = true;
    Object v15 = false;
    Object v16 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v0).idResolver(((com.fasterxml.jackson.databind.cfg.MapperConfig)v7),((com.fasterxml.jackson.databind.JavaType)v11),((java.util.Collection)v13),(((java.lang.Boolean)v14).booleanValue()),(((java.lang.Boolean)v15).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.noTypeInfoBuilder();
    Object v1 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
    Object v2 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v0).inclusion(((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v1));
    Object v3 = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NONE;
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v8 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.type.TypeFactory)v7));
    Object v9 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v2).init(((com.fasterxml.jackson.annotation.JsonTypeInfo.Id)v3),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.noTypeInfoBuilder();
    Object v1 = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME;
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v6 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.type.TypeFactory)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = ((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v6).idFromValueAndType(((java.lang.Object)v8),((java.lang.Class)v10));
    Object v12 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v0).init(((com.fasterxml.jackson.annotation.JsonTypeInfo.Id)v1),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v6));
    Object v13 = "";
    Object v14 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v12).typeProperty(((java.lang.String)v13));
    Object v15 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
    Object v16 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v14).inclusion(((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v15));
    Object v17 = null;
    Object v18 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v19 = null;
    Object v20 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v19));
    Object v21 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v22 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v23 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v17),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v18),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v20),((com.fasterxml.jackson.databind.util.RootNameLookup)v21),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v22));
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = 0;
    Object v26 = new java.util.HashSet((((java.lang.Integer)v25).intValue()));
    Object v27 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v16).buildTypeSerializer(((com.fasterxml.jackson.databind.SerializationConfig)v23),((com.fasterxml.jackson.databind.JavaType)v24),((java.util.Collection)v26));
    org.junit.Assert.assertNotNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.noTypeInfoBuilder();
    Object v1 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
    Object v2 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v0).inclusion(((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v1));
    Object v3 = "Can not refine serialization type %s into %s; types not related";
    Object v4 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v0).typeProperty(((java.lang.String)v3));
    Object v5 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.WRAPPER_OBJECT;
    Object v6 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v4).inclusion(((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v5));
    Object v7 = null;
    Object v8 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v9 = null;
    Object v10 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v9));
    Object v11 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v12 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v13 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v7),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v8),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v10),((com.fasterxml.jackson.databind.util.RootNameLookup)v11),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v14));
    Object v16 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v15));
    Object v17 = 0;
    Object v18 = new java.util.HashSet((((java.lang.Integer)v17).intValue()));
    Object v19 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v6).buildTypeSerializer(((com.fasterxml.jackson.databind.SerializationConfig)v13),((com.fasterxml.jackson.databind.JavaType)v16),((java.util.Collection)v18));
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.noTypeInfoBuilder();
    Object v1 = true;
    Object v2 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v0).typeIdVisibility((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v2).defaultImpl(((java.lang.Class)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.noTypeInfoBuilder();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v1 = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME;
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v6 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.type.TypeFactory)v5));
    Object v7 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v0).init(((com.fasterxml.jackson.annotation.JsonTypeInfo.Id)v1),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v0).defaultImpl(((java.lang.Class)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v1 = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.MINIMAL_CLASS;
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v6 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.type.TypeFactory)v5));
    Object v7 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v0).init(((com.fasterxml.jackson.annotation.JsonTypeInfo.Id)v1),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v1 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.WRAPPER_ARRAY;
    Object v2 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v0).inclusion(((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.noTypeInfoBuilder();
    Object v1 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
    Object v2 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v0).inclusion(((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v1));
    Object v3 = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NONE;
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v8 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.type.TypeFactory)v7));
    Object v9 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v2).init(((com.fasterxml.jackson.annotation.JsonTypeInfo.Id)v3),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v8));
    Object v10 = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.MINIMAL_CLASS;
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v15 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.type.TypeFactory)v14));
    Object v16 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v9).init(((com.fasterxml.jackson.annotation.JsonTypeInfo.Id)v10),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v15));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v1 = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.MINIMAL_CLASS;
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v6 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.type.TypeFactory)v5));
    Object v7 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v0).init(((com.fasterxml.jackson.annotation.JsonTypeInfo.Id)v1),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v6));
    Object v8 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v7).isTypeIdVisible();
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.noTypeInfoBuilder();
    Object v1 = true;
    Object v2 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v0).typeIdVisibility((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v2).typeIdVisibility((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v7 = null;
    Object v8 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v7));
    Object v9 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v10 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v11 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v5),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v6),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v8),((com.fasterxml.jackson.databind.util.RootNameLookup)v9),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v13));
    Object v15 = ((com.fasterxml.jackson.databind.JavaType)v14).isPrimitive();
    Object v16 = 0;
    Object v17 = new java.util.HashSet((((java.lang.Integer)v16).intValue()));
    Object v18 = true;
    Object v19 = false;
    Object v20 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v2).idResolver(((com.fasterxml.jackson.databind.cfg.MapperConfig)v11),((com.fasterxml.jackson.databind.JavaType)v14),((java.util.Collection)v17),(((java.lang.Boolean)v18).booleanValue()),(((java.lang.Boolean)v19).booleanValue()));
    org.junit.Assert.assertNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v1 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.WRAPPER_OBJECT;
    Object v2 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v0).inclusion(((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v1 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.WRAPPER_ARRAY;
    Object v2 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v0).inclusion(((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v2).defaultImpl(((java.lang.Class)v4));
    Object v6 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.EXISTING_PROPERTY;
    Object v7 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v2).inclusion(((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v1 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v0).isTypeIdVisible();
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.noTypeInfoBuilder();
    Object v1 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
    Object v2 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v0).inclusion(((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v1));
    Object v3 = "Can not refine serialization type %s into %s; types not related";
    Object v4 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v0).typeProperty(((java.lang.String)v3));
    Object v5 = "{";
    Object v6 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v4).typeProperty(((java.lang.String)v5));
    Object v7 = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CUSTOM;
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v10),((com.fasterxml.jackson.databind.type.TypeFactory)v11));
    Object v13 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v6).init(((com.fasterxml.jackson.annotation.JsonTypeInfo.Id)v7),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v12));
    Object v14 = null;
    Object v15 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v16 = null;
    Object v17 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v16));
    Object v18 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v19 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v20 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v14),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v15),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v17),((com.fasterxml.jackson.databind.util.RootNameLookup)v18),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v19));
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = new java.lang.StringBuilder();
    Object v23 = ((com.fasterxml.jackson.databind.JavaType)v21).getGenericSignature(((java.lang.StringBuilder)v22));
    Object v24 = 0;
    Object v25 = new java.util.HashSet((((java.lang.Integer)v24).intValue()));
    Object v26 = false;
    Object v27 = false;
    Object v28 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v6).idResolver(((com.fasterxml.jackson.databind.cfg.MapperConfig)v20),((com.fasterxml.jackson.databind.JavaType)v21),((java.util.Collection)v25),(((java.lang.Boolean)v26).booleanValue()),(((java.lang.Boolean)v27).booleanValue()));
    org.junit.Assert.assertNotNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v1 = null;
    Object v2 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v6 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v7 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v1),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v2),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v4),((com.fasterxml.jackson.databind.util.RootNameLookup)v5),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v9));
    Object v11 = 0;
    Object v12 = new java.util.HashSet((((java.lang.Integer)v11).intValue()));
    Object v13 = false;
    Object v14 = true;
    Object v15 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v0).idResolver(((com.fasterxml.jackson.databind.cfg.MapperConfig)v7),((com.fasterxml.jackson.databind.JavaType)v10),((java.util.Collection)v12),(((java.lang.Boolean)v13).booleanValue()),(((java.lang.Boolean)v14).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.noTypeInfoBuilder();
    Object v1 = true;
    Object v2 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v0).typeIdVisibility((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.WRAPPER_OBJECT;
    Object v4 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v2).inclusion(((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v1 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.WRAPPER_OBJECT;
    Object v2 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v0).inclusion(((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v8 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v9 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v6),((com.fasterxml.jackson.databind.util.RootNameLookup)v7),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = 0;
    Object v12 = new java.util.HashSet((((java.lang.Integer)v11).intValue()));
    Object v13 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v2).buildTypeSerializer(((com.fasterxml.jackson.databind.SerializationConfig)v9),((com.fasterxml.jackson.databind.JavaType)v10),((java.util.Collection)v12));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v1 = null;
    Object v2 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v6 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v7 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v1),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v2),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v4),((com.fasterxml.jackson.databind.util.RootNameLookup)v5),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v9));
    Object v11 = ((com.fasterxml.jackson.databind.JavaType)v10).isFinal();
    Object v12 = 0;
    Object v13 = new java.util.HashSet((((java.lang.Integer)v12).intValue()));
    Object v14 = true;
    Object v15 = true;
    Object v16 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v0).idResolver(((com.fasterxml.jackson.databind.cfg.MapperConfig)v7),((com.fasterxml.jackson.databind.JavaType)v10),((java.util.Collection)v13),(((java.lang.Boolean)v14).booleanValue()),(((java.lang.Boolean)v15).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.noTypeInfoBuilder();
    Object v1 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
    Object v2 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v0).inclusion(((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v1));
    Object v3 = "Can not refine serialization type %s into %s; types not related";
    Object v4 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v0).typeProperty(((java.lang.String)v3));
    Object v5 = "{";
    Object v6 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v4).typeProperty(((java.lang.String)v5));
    Object v7 = "";
    Object v8 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v6).typeProperty(((java.lang.String)v7));
    Object v9 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.EXISTING_PROPERTY;
    Object v10 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v6).inclusion(((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v1 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.EXTERNAL_PROPERTY;
    Object v2 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v0).inclusion(((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v1));
    Object v3 = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NONE;
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v8 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.type.TypeFactory)v7));
    Object v9 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v0).init(((com.fasterxml.jackson.annotation.JsonTypeInfo.Id)v3),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.noTypeInfoBuilder();
    Object v1 = null;
    Object v2 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v6 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v7 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v1),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v2),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v4),((com.fasterxml.jackson.databind.util.RootNameLookup)v5),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = ((com.fasterxml.jackson.databind.JavaType)v8).toString();
    Object v10 = 0;
    Object v11 = new java.util.HashSet((((java.lang.Integer)v10).intValue()));
    Object v12 = true;
    Object v13 = false;
    Object v14 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v0).idResolver(((com.fasterxml.jackson.databind.cfg.MapperConfig)v7),((com.fasterxml.jackson.databind.JavaType)v8),((java.util.Collection)v11),(((java.lang.Boolean)v12).booleanValue()),(((java.lang.Boolean)v13).booleanValue()));
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v0).defaultImpl(((java.lang.Class)v2));
    Object v4 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
    Object v5 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v0).inclusion(((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.noTypeInfoBuilder();
    Object v1 = true;
    Object v2 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v0).typeIdVisibility((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v8 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v9 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v6),((com.fasterxml.jackson.databind.util.RootNameLookup)v7),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v11));
    Object v13 = 0;
    Object v14 = new java.util.HashSet((((java.lang.Integer)v13).intValue()));
    Object v15 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v2).buildTypeDeserializer(((com.fasterxml.jackson.databind.DeserializationConfig)v9),((com.fasterxml.jackson.databind.JavaType)v12),((java.util.Collection)v14));
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.noTypeInfoBuilder();
    Object v1 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
    Object v2 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v0).inclusion(((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v1));
    Object v3 = "Can not refine serialization type %s into %s; types not related";
    Object v4 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v0).typeProperty(((java.lang.String)v3));
    Object v5 = "{";
    Object v6 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v4).typeProperty(((java.lang.String)v5));
    Object v7 = "";
    Object v8 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v6).typeProperty(((java.lang.String)v7));
    Object v9 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.EXISTING_PROPERTY;
    Object v10 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v6).inclusion(((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v9));
    Object v11 = " ms";
    Object v12 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v10).typeProperty(((java.lang.String)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.noTypeInfoBuilder();
    Object v1 = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME;
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v6 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.type.TypeFactory)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = ((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v6).idFromValueAndType(((java.lang.Object)v8),((java.lang.Class)v10));
    Object v12 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v0).init(((com.fasterxml.jackson.annotation.JsonTypeInfo.Id)v1),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v6));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v12).defaultImpl(((java.lang.Class)v14));
    Object v16 = null;
    Object v17 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v18));
    Object v20 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v21 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v22 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v16),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v17),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v19),((com.fasterxml.jackson.databind.util.RootNameLookup)v20),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v21));
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = 0;
    Object v25 = new java.util.HashSet((((java.lang.Integer)v24).intValue()));
    Object v26 = true;
    Object v27 = false;
    Object v28 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v12).idResolver(((com.fasterxml.jackson.databind.cfg.MapperConfig)v22),((com.fasterxml.jackson.databind.JavaType)v23),((java.util.Collection)v25),(((java.lang.Boolean)v26).booleanValue()),(((java.lang.Boolean)v27).booleanValue()));
    org.junit.Assert.assertNotNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.noTypeInfoBuilder();
    Object v1 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
    Object v2 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v0).inclusion(((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v1));
    Object v3 = "Can not refine serialization type %s into %s; types not related";
    Object v4 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v0).typeProperty(((java.lang.String)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v4).defaultImpl(((java.lang.Class)v6));
    Object v8 = "iBems";
    Object v9 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v4).typeProperty(((java.lang.String)v8));
    Object v10 = null;
    Object v11 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v12 = null;
    Object v13 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v12));
    Object v14 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v15 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v16 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v10),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v11),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v13),((com.fasterxml.jackson.databind.util.RootNameLookup)v14),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v15));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = 0;
    Object v19 = new java.util.HashSet((((java.lang.Integer)v18).intValue()));
    Object v20 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v9).buildTypeSerializer(((com.fasterxml.jackson.databind.SerializationConfig)v16),((com.fasterxml.jackson.databind.JavaType)v17),((java.util.Collection)v19));
    org.junit.Assert.assertNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v1 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.WRAPPER_ARRAY;
    Object v2 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v0).inclusion(((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v1));
    Object v3 = ")";
    Object v4 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v2).typeProperty(((java.lang.String)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v0).defaultImpl(((java.lang.Class)v2));
    Object v4 = null;
    Object v5 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v6 = null;
    Object v7 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v6));
    Object v8 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v9 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v10 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v4),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v5),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v7),((com.fasterxml.jackson.databind.util.RootNameLookup)v8),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = 0;
    Object v13 = new java.util.HashSet((((java.lang.Integer)v12).intValue()));
    Object v14 = ((java.util.Collection)v13).hashCode();
    Object v15 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v0).buildTypeSerializer(((com.fasterxml.jackson.databind.SerializationConfig)v10),((com.fasterxml.jackson.databind.JavaType)v11),((java.util.Collection)v13));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.noTypeInfoBuilder();
    Object v1 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
    Object v2 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v0).inclusion(((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v1));
    Object v3 = ")";
    Object v4 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v2).typeProperty(((java.lang.String)v3));
    Object v5 = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME;
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.type.TypeFactory)v9));
    Object v11 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v2).init(((com.fasterxml.jackson.annotation.JsonTypeInfo.Id)v5),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.noTypeInfoBuilder();
    Object v1 = null;
    Object v2 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v6 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v7 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v1),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v2),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v4),((com.fasterxml.jackson.databind.util.RootNameLookup)v5),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = 0;
    Object v10 = new java.util.HashSet((((java.lang.Integer)v9).intValue()));
    Object v11 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v0).buildTypeDeserializer(((com.fasterxml.jackson.databind.DeserializationConfig)v7),((com.fasterxml.jackson.databind.JavaType)v8),((java.util.Collection)v10));
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.noTypeInfoBuilder();
    Object v1 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
    Object v2 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v0).inclusion(((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v1));
    Object v3 = "Can not refine serialization type %s into %s; types not related";
    Object v4 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v0).typeProperty(((java.lang.String)v3));
    Object v5 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.WRAPPER_OBJECT;
    Object v6 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v4).inclusion(((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v5));
    Object v7 = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NONE;
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v10),((com.fasterxml.jackson.databind.type.TypeFactory)v11));
    Object v13 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v6).init(((com.fasterxml.jackson.annotation.JsonTypeInfo.Id)v7),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.noTypeInfoBuilder();
    Object v1 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
    Object v2 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v0).inclusion(((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v1));
    Object v3 = "Can not refine serialization type %s into %s; types not related";
    Object v4 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v0).typeProperty(((java.lang.String)v3));
    Object v5 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.WRAPPER_OBJECT;
    Object v6 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v4).inclusion(((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v5));
    Object v7 = null;
    Object v8 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v9 = null;
    Object v10 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v9));
    Object v11 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v12 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v13 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v7),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v8),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v10),((com.fasterxml.jackson.databind.util.RootNameLookup)v11),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = 0;
    Object v16 = new java.util.HashSet((((java.lang.Integer)v15).intValue()));
    Object v17 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v6).buildTypeDeserializer(((com.fasterxml.jackson.databind.DeserializationConfig)v13),((com.fasterxml.jackson.databind.JavaType)v14),((java.util.Collection)v16));
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v1 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.WRAPPER_ARRAY;
    Object v2 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v0).inclusion(((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v2).defaultImpl(((java.lang.Class)v4));
    Object v6 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.EXISTING_PROPERTY;
    Object v7 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v2).inclusion(((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v6));
    Object v8 = ",";
    Object v9 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v7).typeProperty(((java.lang.String)v8));
    Object v10 = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS;
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v15 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.type.TypeFactory)v14));
    Object v16 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v7).init(((com.fasterxml.jackson.annotation.JsonTypeInfo.Id)v10),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v15));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v1 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.WRAPPER_ARRAY;
    Object v2 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v0).inclusion(((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v1));
    Object v3 = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS;
    Object v4 = com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.noTypeInfoBuilder();
    Object v5 = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME;
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.type.TypeFactory)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = ((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v10).idFromValueAndType(((java.lang.Object)v12),((java.lang.Class)v14));
    Object v16 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v4).init(((com.fasterxml.jackson.annotation.JsonTypeInfo.Id)v5),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v10));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v17));
    Object v19 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v16).defaultImpl(((java.lang.Class)v18));
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v22 = null;
    Object v23 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v22));
    Object v24 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v25 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v26 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v20),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v21),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v23),((com.fasterxml.jackson.databind.util.RootNameLookup)v24),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v25));
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v28 = 0;
    Object v29 = new java.util.HashSet((((java.lang.Integer)v28).intValue()));
    Object v30 = true;
    Object v31 = false;
    Object v32 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v16).idResolver(((com.fasterxml.jackson.databind.cfg.MapperConfig)v26),((com.fasterxml.jackson.databind.JavaType)v27),((java.util.Collection)v29),(((java.lang.Boolean)v30).booleanValue()),(((java.lang.Boolean)v31).booleanValue()));
    Object v33 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v2).init(((com.fasterxml.jackson.annotation.JsonTypeInfo.Id)v3),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v32));
    org.junit.Assert.assertNotNull(v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v0).defaultImpl(((java.lang.Class)v2));
    Object v4 = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NONE;
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v9 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.type.TypeFactory)v8));
    Object v10 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v0).init(((com.fasterxml.jackson.annotation.JsonTypeInfo.Id)v4),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v9));
    Object v11 = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS;
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v16 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v14),((com.fasterxml.jackson.databind.type.TypeFactory)v15));
    Object v17 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v10).init(((com.fasterxml.jackson.annotation.JsonTypeInfo.Id)v11),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v16));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v1 = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.MINIMAL_CLASS;
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v6 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.type.TypeFactory)v5));
    Object v7 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v0).init(((com.fasterxml.jackson.annotation.JsonTypeInfo.Id)v1),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v6));
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v10 = null;
    Object v11 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v10));
    Object v12 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v13 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v14 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v8),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v9),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v11),((com.fasterxml.jackson.databind.util.RootNameLookup)v12),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = ((com.fasterxml.jackson.databind.cfg.MapperConfigBase)v14).findConfigOverride(((java.lang.Class)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = 0;
    Object v20 = new java.util.HashSet((((java.lang.Integer)v19).intValue()));
    Object v21 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v7).buildTypeSerializer(((com.fasterxml.jackson.databind.SerializationConfig)v14),((com.fasterxml.jackson.databind.JavaType)v18),((java.util.Collection)v20));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v1 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.WRAPPER_ARRAY;
    Object v2 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v0).inclusion(((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v1));
    Object v3 = ")";
    Object v4 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v2).typeProperty(((java.lang.String)v3));
    Object v5 = "";
    Object v6 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v4).typeProperty(((java.lang.String)v5));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.noTypeInfoBuilder();
    Object v1 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
    Object v2 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v0).inclusion(((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v1));
    Object v3 = "Can not refine serialization type %s into %s; types not related";
    Object v4 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v0).typeProperty(((java.lang.String)v3));
    Object v5 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.WRAPPER_OBJECT;
    Object v6 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v4).inclusion(((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v5));
    Object v7 = null;
    Object v8 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v9 = null;
    Object v10 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v9));
    Object v11 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v12 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v13 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v7),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v8),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v10),((com.fasterxml.jackson.databind.util.RootNameLookup)v11),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = 0;
    Object v16 = new java.util.HashSet((((java.lang.Integer)v15).intValue()));
    Object v17 = false;
    Object v18 = false;
    Object v19 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v6).idResolver(((com.fasterxml.jackson.databind.cfg.MapperConfig)v13),((com.fasterxml.jackson.databind.JavaType)v14),((java.util.Collection)v16),(((java.lang.Boolean)v17).booleanValue()),(((java.lang.Boolean)v18).booleanValue()));
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.noTypeInfoBuilder();
    Object v1 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
    Object v2 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v0).inclusion(((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v1));
    Object v3 = "Can not refine serialization type %s into %s; types not related";
    Object v4 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v0).typeProperty(((java.lang.String)v3));
    Object v5 = "No (native) type id found when one was expected for polymorphic type handling";
    Object v6 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v4).typeProperty(((java.lang.String)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.noTypeInfoBuilder();
    Object v1 = true;
    Object v2 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v0).typeIdVisibility((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.WRAPPER_OBJECT;
    Object v4 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v2).inclusion(((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v3));
    Object v5 = "j";
    Object v6 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v4).typeProperty(((java.lang.String)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v1 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.WRAPPER_ARRAY;
    Object v2 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v0).inclusion(((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v1));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v5));
    Object v7 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v8 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v9 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v6),((com.fasterxml.jackson.databind.util.RootNameLookup)v7),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = 0;
    Object v12 = new java.util.HashSet((((java.lang.Integer)v11).intValue()));
    Object v13 = false;
    Object v14 = true;
    Object v15 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v2).idResolver(((com.fasterxml.jackson.databind.cfg.MapperConfig)v9),((com.fasterxml.jackson.databind.JavaType)v10),((java.util.Collection)v12),(((java.lang.Boolean)v13).booleanValue()),(((java.lang.Boolean)v14).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.noTypeInfoBuilder();
    Object v1 = true;
    Object v2 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v0).typeIdVisibility((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.WRAPPER_OBJECT;
    Object v4 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v2).inclusion(((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v3));
    Object v5 = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME;
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.type.TypeFactory)v9));
    Object v11 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v4).init(((com.fasterxml.jackson.annotation.JsonTypeInfo.Id)v5),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v10));
    Object v12 = null;
    Object v13 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v14 = null;
    Object v15 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v14));
    Object v16 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v17 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v18 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v12),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v13),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v15),((com.fasterxml.jackson.databind.util.RootNameLookup)v16),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v19));
    Object v21 = ((com.fasterxml.jackson.databind.SerializationConfig)v18).getDefaultPropertyInclusion(((java.lang.Class)v20));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v22));
    Object v24 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v23));
    Object v25 = 0;
    Object v26 = new java.util.HashSet((((java.lang.Integer)v25).intValue()));
    Object v27 = 0;
    Object v28 = new java.util.HashSet((((java.lang.Integer)v27).intValue()));
    Object v29 = ((java.util.Collection)v26).containsAll(((java.util.Collection)v28));
    Object v30 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v4).buildTypeSerializer(((com.fasterxml.jackson.databind.SerializationConfig)v18),((com.fasterxml.jackson.databind.JavaType)v24),((java.util.Collection)v26));
    org.junit.Assert.assertNotNull(v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v1 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.WRAPPER_ARRAY;
    Object v2 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v0).inclusion(((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v1));
    Object v3 = ")";
    Object v4 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v2).typeProperty(((java.lang.String)v3));
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v7 = null;
    Object v8 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v7));
    Object v9 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v10 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v11 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v5),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v6),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v8),((com.fasterxml.jackson.databind.util.RootNameLookup)v9),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = ((com.fasterxml.jackson.databind.SerializationConfig)v11).getDefaultPropertyInclusion(((java.lang.Class)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = 0;
    Object v17 = new java.util.HashSet((((java.lang.Integer)v16).intValue()));
    Object v18 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v4).buildTypeSerializer(((com.fasterxml.jackson.databind.SerializationConfig)v11),((com.fasterxml.jackson.databind.JavaType)v15),((java.util.Collection)v17));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v1 = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.MINIMAL_CLASS;
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v6 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.type.TypeFactory)v5));
    Object v7 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v0).init(((com.fasterxml.jackson.annotation.JsonTypeInfo.Id)v1),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v6));
    Object v8 = "items";
    Object v9 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v7).typeProperty(((java.lang.String)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v1 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.WRAPPER_ARRAY;
    Object v2 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v0).inclusion(((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v1));
    Object v3 = ")";
    Object v4 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v2).typeProperty(((java.lang.String)v3));
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v7 = null;
    Object v8 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v7));
    Object v9 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v10 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v11 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v5),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v6),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v8),((com.fasterxml.jackson.databind.util.RootNameLookup)v9),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = 0;
    Object v14 = new java.util.HashSet((((java.lang.Integer)v13).intValue()));
    Object v15 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v4).buildTypeDeserializer(((com.fasterxml.jackson.databind.DeserializationConfig)v11),((com.fasterxml.jackson.databind.JavaType)v12),((java.util.Collection)v14));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.noTypeInfoBuilder();
    Object v1 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
    Object v2 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v0).inclusion(((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v1));
    Object v3 = "Can not refine serialization type %s into %s; types not related";
    Object v4 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v0).typeProperty(((java.lang.String)v3));
    Object v5 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.WRAPPER_OBJECT;
    Object v6 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v4).inclusion(((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v5));
    Object v7 = null;
    Object v8 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v9 = null;
    Object v10 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v9));
    Object v11 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v12 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v13 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v7),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v8),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v10),((com.fasterxml.jackson.databind.util.RootNameLookup)v11),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = ((com.fasterxml.jackson.databind.JavaType)v14).findTypeParameters(((java.lang.Class)v16));
    Object v18 = 0;
    Object v19 = new java.util.HashSet((((java.lang.Integer)v18).intValue()));
    Object v20 = true;
    Object v21 = false;
    Object v22 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v6).idResolver(((com.fasterxml.jackson.databind.cfg.MapperConfig)v13),((com.fasterxml.jackson.databind.JavaType)v14),((java.util.Collection)v19),(((java.lang.Boolean)v20).booleanValue()),(((java.lang.Boolean)v21).booleanValue()));
    org.junit.Assert.assertNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v1 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.WRAPPER_ARRAY;
    Object v2 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v0).inclusion(((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v2).defaultImpl(((java.lang.Class)v4));
    Object v6 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.EXISTING_PROPERTY;
    Object v7 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v2).inclusion(((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v6));
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v10 = null;
    Object v11 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v10));
    Object v12 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v13 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v14 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v8),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v9),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v11),((com.fasterxml.jackson.databind.util.RootNameLookup)v12),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = 0;
    Object v17 = new java.util.HashSet((((java.lang.Integer)v16).intValue()));
    Object v18 = true;
    Object v19 = true;
    Object v20 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v7).idResolver(((com.fasterxml.jackson.databind.cfg.MapperConfig)v14),((com.fasterxml.jackson.databind.JavaType)v15),((java.util.Collection)v17),(((java.lang.Boolean)v18).booleanValue()),(((java.lang.Boolean)v19).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v1 = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.MINIMAL_CLASS;
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v6 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.type.TypeFactory)v5));
    Object v7 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v0).init(((com.fasterxml.jackson.annotation.JsonTypeInfo.Id)v1),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v6));
    Object v8 = "false";
    Object v9 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v7).typeProperty(((java.lang.String)v8));
    Object v10 = null;
    Object v11 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v12 = null;
    Object v13 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v12));
    Object v14 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v15 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v16 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v10),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v11),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v13),((com.fasterxml.jackson.databind.util.RootNameLookup)v14),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v15));
    Object v17 = "Can not resolve ObjectId forward reference using property '%s' (of type %s]): Bean not yet resolved";
    Object v18 = "} to ";
    Object v19 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v17),((java.lang.String)v18));
    Object v20 = ((com.fasterxml.jackson.databind.DeserializationConfig)v16).withRootName(((com.fasterxml.jackson.databind.PropertyName)v19));
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = ((com.fasterxml.jackson.databind.JavaType)v21).withStaticTyping();
    Object v23 = 0;
    Object v24 = new java.util.HashSet((((java.lang.Integer)v23).intValue()));
    Object v25 = ((java.util.Collection)v24).parallelStream();
    Object v26 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v7).buildTypeDeserializer(((com.fasterxml.jackson.databind.DeserializationConfig)v16),((com.fasterxml.jackson.databind.JavaType)v21),((java.util.Collection)v24));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v1 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.WRAPPER_OBJECT;
    Object v2 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v0).inclusion(((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v1));
    Object v3 = true;
    Object v4 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v2).typeIdVisibility((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.EXTERNAL_PROPERTY;
    Object v6 = ((java.lang.Enum)v5).getDeclaringClass();
    Object v7 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v2).inclusion(((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v5));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.noTypeInfoBuilder();
    Object v1 = true;
    Object v2 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v0).typeIdVisibility((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CUSTOM;
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v8 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.type.TypeFactory)v7));
    Object v9 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v2).init(((com.fasterxml.jackson.annotation.JsonTypeInfo.Id)v3),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.noTypeInfoBuilder();
    Object v1 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
    Object v2 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v0).inclusion(((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v1));
    Object v3 = "Can not refine serialization type %s into %s; types not related";
    Object v4 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v0).typeProperty(((java.lang.String)v3));
    Object v5 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.WRAPPER_OBJECT;
    Object v6 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v4).inclusion(((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v5));
    Object v7 = null;
    Object v8 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v9 = null;
    Object v10 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v9));
    Object v11 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v12 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v13 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v7),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v8),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v10),((com.fasterxml.jackson.databind.util.RootNameLookup)v11),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = 0;
    Object v16 = new java.util.HashSet((((java.lang.Integer)v15).intValue()));
    Object v17 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v6).buildTypeSerializer(((com.fasterxml.jackson.databind.SerializationConfig)v13),((com.fasterxml.jackson.databind.JavaType)v14),((java.util.Collection)v16));
    Object v18 = null;
    Object v19 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v20));
    Object v22 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v23 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v24 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v18),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v19),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v21),((com.fasterxml.jackson.databind.util.RootNameLookup)v22),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v23));
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v26 = 0;
    Object v27 = new java.util.HashSet((((java.lang.Integer)v26).intValue()));
    Object v28 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v6).buildTypeSerializer(((com.fasterxml.jackson.databind.SerializationConfig)v24),((com.fasterxml.jackson.databind.JavaType)v25),((java.util.Collection)v27));
    org.junit.Assert.assertNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.noTypeInfoBuilder();
    Object v1 = true;
    Object v2 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v0).typeIdVisibility((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = ((java.lang.Class)v4).getMethods();
    Object v6 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v2).defaultImpl(((java.lang.Class)v4));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.noTypeInfoBuilder();
    Object v1 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
    Object v2 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v0).inclusion(((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v1));
    Object v3 = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NONE;
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v8 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.type.TypeFactory)v7));
    Object v9 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v2).init(((com.fasterxml.jackson.annotation.JsonTypeInfo.Id)v3),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v8));
    Object v10 = null;
    Object v11 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v12 = null;
    Object v13 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v12));
    Object v14 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v15 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v16 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v10),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v11),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v13),((com.fasterxml.jackson.databind.util.RootNameLookup)v14),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v15));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v17));
    Object v19 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v18));
    Object v20 = 0;
    Object v21 = new java.util.HashSet((((java.lang.Integer)v20).intValue()));
    ((java.util.Collection)v21).clear();
    Object v22 = null;
    Object v23 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v9).buildTypeDeserializer(((com.fasterxml.jackson.databind.DeserializationConfig)v16),((com.fasterxml.jackson.databind.JavaType)v19),((java.util.Collection)v21));
    org.junit.Assert.assertNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.noTypeInfoBuilder();
    Object v1 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
    Object v2 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v0).inclusion(((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v1));
    Object v3 = "Can not refine serialization type %s into %s; types not related";
    Object v4 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v0).typeProperty(((java.lang.String)v3));
    Object v5 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.WRAPPER_ARRAY;
    Object v6 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v4).inclusion(((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v5));
    Object v7 = null;
    Object v8 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v9 = null;
    Object v10 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v9));
    Object v11 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v12 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v13 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v7),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v8),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v10),((com.fasterxml.jackson.databind.util.RootNameLookup)v11),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v14));
    Object v16 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v15));
    Object v17 = 0;
    Object v18 = new java.util.HashSet((((java.lang.Integer)v17).intValue()));
    Object v19 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v4).buildTypeDeserializer(((com.fasterxml.jackson.databind.DeserializationConfig)v13),((com.fasterxml.jackson.databind.JavaType)v16),((java.util.Collection)v18));
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.noTypeInfoBuilder();
    Object v1 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
    Object v2 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v0).inclusion(((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v1));
    Object v3 = "Can not refine serialization type %s into %s; types not related";
    Object v4 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v0).typeProperty(((java.lang.String)v3));
    Object v5 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.WRAPPER_OBJECT;
    Object v6 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v4).inclusion(((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v6).defaultImpl(((java.lang.Class)v8));
    Object v10 = false;
    Object v11 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v6).typeIdVisibility((((java.lang.Boolean)v10).booleanValue()));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v1 = ", ";
    Object v2 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v0).typeProperty(((java.lang.String)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.noTypeInfoBuilder();
    Object v1 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
    Object v2 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v0).inclusion(((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v1));
    Object v3 = "Can not refine serialization type %s into %s; types not related";
    Object v4 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v0).typeProperty(((java.lang.String)v3));
    Object v5 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.WRAPPER_OBJECT;
    Object v6 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v4).inclusion(((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v6).defaultImpl(((java.lang.Class)v8));
    Object v10 = false;
    Object v11 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v6).typeIdVisibility((((java.lang.Boolean)v10).booleanValue()));
    Object v12 = "Can not u";
    Object v13 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v11).typeProperty(((java.lang.String)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.noTypeInfoBuilder();
    Object v1 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
    Object v2 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v0).inclusion(((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v1));
    Object v3 = "Can not refine serialization type %s into %s; types not related";
    Object v4 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v0).typeProperty(((java.lang.String)v3));
    Object v5 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.WRAPPER_OBJECT;
    Object v6 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v4).inclusion(((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v6).defaultImpl(((java.lang.Class)v8));
    Object v10 = false;
    Object v11 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v6).typeIdVisibility((((java.lang.Boolean)v10).booleanValue()));
    Object v12 = "P";
    Object v13 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v11).typeProperty(((java.lang.String)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v1 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.WRAPPER_OBJECT;
    Object v2 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v0).inclusion(((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v1));
    Object v3 = true;
    Object v4 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v2).typeIdVisibility((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.EXTERNAL_PROPERTY;
    Object v6 = ((java.lang.Enum)v5).getDeclaringClass();
    Object v7 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v2).inclusion(((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v5));
    Object v8 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.EXISTING_PROPERTY;
    Object v9 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v7).inclusion(((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.noTypeInfoBuilder();
    Object v1 = true;
    Object v2 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v0).typeIdVisibility((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.WRAPPER_OBJECT;
    Object v4 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v2).inclusion(((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v3));
    Object v5 = "j";
    Object v6 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v4).typeProperty(((java.lang.String)v5));
    Object v7 = null;
    Object v8 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v9 = null;
    Object v10 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v9));
    Object v11 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v12 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v13 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v7),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v8),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v10),((com.fasterxml.jackson.databind.util.RootNameLookup)v11),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = 0;
    Object v16 = new java.util.HashSet((((java.lang.Integer)v15).intValue()));
    Object v17 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v6).buildTypeDeserializer(((com.fasterxml.jackson.databind.DeserializationConfig)v13),((com.fasterxml.jackson.databind.JavaType)v14),((java.util.Collection)v16));
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v0).defaultImpl(((java.lang.Class)v2));
    Object v4 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
    Object v5 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v0).inclusion(((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v4));
    Object v6 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v5).getTypeProperty();
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.noTypeInfoBuilder();
    Object v1 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
    Object v2 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v0).inclusion(((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v1));
    Object v3 = "Can not refine serialization type %s into %s; types not related";
    Object v4 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v0).typeProperty(((java.lang.String)v3));
    Object v5 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.WRAPPER_OBJECT;
    Object v6 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v4).inclusion(((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v5));
    Object v7 = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NONE;
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v10),((com.fasterxml.jackson.databind.type.TypeFactory)v11));
    Object v13 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v6).init(((com.fasterxml.jackson.annotation.JsonTypeInfo.Id)v7),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v12));
    Object v14 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v13).getTypeProperty();
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v1 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.WRAPPER_OBJECT;
    Object v2 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v0).inclusion(((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v1));
    Object v3 = true;
    Object v4 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v2).typeIdVisibility((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.EXTERNAL_PROPERTY;
    Object v6 = ((java.lang.Enum)v5).getDeclaringClass();
    Object v7 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v2).inclusion(((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v5));
    Object v8 = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NONE;
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v13 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.type.TypeFactory)v12));
    Object v14 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v7).init(((com.fasterxml.jackson.annotation.JsonTypeInfo.Id)v8),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v1 = null;
    Object v2 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v6 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v7 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v1),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v2),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v4),((com.fasterxml.jackson.databind.util.RootNameLookup)v5),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v9));
    Object v11 = 0;
    Object v12 = new java.util.HashSet((((java.lang.Integer)v11).intValue()));
    Object v13 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v0).buildTypeSerializer(((com.fasterxml.jackson.databind.SerializationConfig)v7),((com.fasterxml.jackson.databind.JavaType)v10),((java.util.Collection)v12));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v1 = ", ";
    Object v2 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v0).typeProperty(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NONE;
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v8 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.type.TypeFactory)v7));
    Object v9 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v2).init(((com.fasterxml.jackson.annotation.JsonTypeInfo.Id)v3),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v1 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.WRAPPER_ARRAY;
    Object v2 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v0).inclusion(((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v2).defaultImpl(((java.lang.Class)v4));
    Object v6 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.EXISTING_PROPERTY;
    Object v7 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v2).inclusion(((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v6));
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v10 = null;
    Object v11 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v10));
    Object v12 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v13 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v14 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v8),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v9),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v11),((com.fasterxml.jackson.databind.util.RootNameLookup)v12),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = ((com.fasterxml.jackson.databind.SerializationConfig)v14).getDefaultPropertyInclusion(((java.lang.Class)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v19));
    Object v21 = ((com.fasterxml.jackson.databind.JavaType)v20).getGenericSignature();
    Object v22 = 0;
    Object v23 = new java.util.HashSet((((java.lang.Integer)v22).intValue()));
    Object v24 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v7).buildTypeSerializer(((com.fasterxml.jackson.databind.SerializationConfig)v14),((com.fasterxml.jackson.databind.JavaType)v20),((java.util.Collection)v23));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.noTypeInfoBuilder();
    Object v1 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
    Object v2 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v0).inclusion(((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v1));
    Object v3 = ": #";
    Object v4 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v2).typeProperty(((java.lang.String)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v1 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.WRAPPER_ARRAY;
    Object v2 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v0).inclusion(((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v1));
    Object v3 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.EXTERNAL_PROPERTY;
    Object v4 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v2).inclusion(((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.noTypeInfoBuilder();
    Object v1 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
    Object v2 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v0).inclusion(((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v1));
    Object v3 = "Can not refine serialization type %s into %s; types not related";
    Object v4 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v0).typeProperty(((java.lang.String)v3));
    Object v5 = "{";
    Object v6 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v4).typeProperty(((java.lang.String)v5));
    Object v7 = "";
    Object v8 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v6).typeProperty(((java.lang.String)v7));
    Object v9 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.EXISTING_PROPERTY;
    Object v10 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v6).inclusion(((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v9));
    Object v11 = null;
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v13 = null;
    Object v14 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v13));
    Object v15 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v16 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v17 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v11),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v12),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v14),((com.fasterxml.jackson.databind.util.RootNameLookup)v15),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = ((com.fasterxml.jackson.databind.JavaType)v18).toString();
    Object v20 = 0;
    Object v21 = new java.util.HashSet((((java.lang.Integer)v20).intValue()));
    Object v22 = false;
    Object v23 = true;
    Object v24 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v10).idResolver(((com.fasterxml.jackson.databind.cfg.MapperConfig)v17),((com.fasterxml.jackson.databind.JavaType)v18),((java.util.Collection)v21),(((java.lang.Boolean)v22).booleanValue()),(((java.lang.Boolean)v23).booleanValue()));
    org.junit.Assert.assertNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v1 = ", ";
    Object v2 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v0).typeProperty(((java.lang.String)v1));
    Object v3 = false;
    Object v4 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v2).typeIdVisibility((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.WRAPPER_ARRAY;
    Object v6 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v2).inclusion(((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.noTypeInfoBuilder();
    Object v1 = true;
    Object v2 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v0).typeIdVisibility((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v2).defaultImpl(((java.lang.Class)v4));
    Object v6 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.WRAPPER_ARRAY;
    Object v7 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v5).inclusion(((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.noTypeInfoBuilder();
    Object v1 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
    Object v2 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v0).inclusion(((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v1));
    Object v3 = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NONE;
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v8 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.type.TypeFactory)v7));
    Object v9 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v2).init(((com.fasterxml.jackson.annotation.JsonTypeInfo.Id)v3),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v8));
    Object v10 = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.MINIMAL_CLASS;
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v15 = new com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver(((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.type.TypeFactory)v14));
    Object v16 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v9).init(((com.fasterxml.jackson.annotation.JsonTypeInfo.Id)v10),((com.fasterxml.jackson.databind.jsontype.TypeIdResolver)v15));
    Object v17 = null;
    Object v18 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v19 = null;
    Object v20 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v19));
    Object v21 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v22 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v23 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v17),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v18),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v20),((com.fasterxml.jackson.databind.util.RootNameLookup)v21),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v22));
    Object v24 = com.fasterxml.jackson.annotation.JsonInclude.Include.USE_DEFAULTS;
    Object v25 = ((com.fasterxml.jackson.databind.SerializationConfig)v23).withSerializationInclusion(((com.fasterxml.jackson.annotation.JsonInclude.Include)v24));
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v27 = 0;
    Object v28 = new java.util.HashSet((((java.lang.Integer)v27).intValue()));
    Object v29 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v16).buildTypeSerializer(((com.fasterxml.jackson.databind.SerializationConfig)v23),((com.fasterxml.jackson.databind.JavaType)v26),((java.util.Collection)v28));
    org.junit.Assert.assertNotNull(v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v0).defaultImpl(((java.lang.Class)v2));
    Object v4 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
    Object v5 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v0).inclusion(((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v4));
    Object v6 = null;
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v8));
    Object v10 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v11 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v12 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v6),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v7),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v9),((com.fasterxml.jackson.databind.util.RootNameLookup)v10),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = 0;
    Object v15 = new java.util.HashSet((((java.lang.Integer)v14).intValue()));
    Object v16 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v5).buildTypeDeserializer(((com.fasterxml.jackson.databind.DeserializationConfig)v12),((com.fasterxml.jackson.databind.JavaType)v13),((java.util.Collection)v15));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v0).defaultImpl(((java.lang.Class)v2));
    Object v4 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
    Object v5 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v0).inclusion(((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v4));
    Object v6 = "]";
    Object v7 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v5).typeProperty(((java.lang.String)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v1 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.WRAPPER_ARRAY;
    Object v2 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v0).inclusion(((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v1));
    Object v3 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.EXTERNAL_PROPERTY;
    Object v4 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v2).inclusion(((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v3));
    Object v5 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.EXISTING_PROPERTY;
    Object v6 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v4).inclusion(((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v5));
    Object v7 = null;
    Object v8 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v9 = null;
    Object v10 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v9));
    Object v11 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v12 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v13 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v7),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v8),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v10),((com.fasterxml.jackson.databind.util.RootNameLookup)v11),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = 0;
    Object v16 = new java.util.HashSet((((java.lang.Integer)v15).intValue()));
    Object v17 = 0;
    Object v18 = new java.util.HashSet((((java.lang.Integer)v17).intValue()));
    Object v19 = ((java.util.Collection)v16).addAll(((java.util.Collection)v18));
    Object v20 = false;
    Object v21 = true;
    Object v22 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v4).idResolver(((com.fasterxml.jackson.databind.cfg.MapperConfig)v13),((com.fasterxml.jackson.databind.JavaType)v14),((java.util.Collection)v16),(((java.lang.Boolean)v20).booleanValue()),(((java.lang.Boolean)v21).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.noTypeInfoBuilder();
    Object v1 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
    Object v2 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v0).inclusion(((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v1));
    Object v3 = "Can not refine serialization type %s into %s; types not related";
    Object v4 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v0).typeProperty(((java.lang.String)v3));
    Object v5 = "No (native) type id found when one was expected for polymorphic type handling";
    Object v6 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v4).typeProperty(((java.lang.String)v5));
    Object v7 = "Can not constuct EnumMap; generic (key) type not available";
    Object v8 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v6).typeProperty(((java.lang.String)v7));
    Object v9 = null;
    Object v10 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v11 = null;
    Object v12 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v11));
    Object v13 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v14 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v15 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v9),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v10),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v12),((com.fasterxml.jackson.databind.util.RootNameLookup)v13),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v17));
    Object v19 = ((com.fasterxml.jackson.databind.JavaType)v16).findSuperType(((java.lang.Class)v18));
    Object v20 = 0;
    Object v21 = new java.util.HashSet((((java.lang.Integer)v20).intValue()));
    Object v22 = ((java.util.Collection)v21).hashCode();
    Object v23 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v6).buildTypeSerializer(((com.fasterxml.jackson.databind.SerializationConfig)v15),((com.fasterxml.jackson.databind.JavaType)v16),((java.util.Collection)v21));
    org.junit.Assert.assertNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.noTypeInfoBuilder();
    Object v1 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
    Object v2 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v0).inclusion(((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v1));
    Object v3 = "Can not refine serialization type %s into %s; types not related";
    Object v4 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v0).typeProperty(((java.lang.String)v3));
    Object v5 = com.fasterxml.jackson.annotation.JsonTypeInfo.As.WRAPPER_OBJECT;
    Object v6 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v4).inclusion(((com.fasterxml.jackson.annotation.JsonTypeInfo.As)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v6).defaultImpl(((java.lang.Class)v8));
    Object v10 = false;
    Object v11 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v6).typeIdVisibility((((java.lang.Boolean)v10).booleanValue()));
    Object v12 = null;
    Object v13 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v14 = null;
    Object v15 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v14));
    Object v16 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v17 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v18 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v12),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v13),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v15),((com.fasterxml.jackson.databind.util.RootNameLookup)v16),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v19));
    Object v21 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v20));
    Object v22 = 0;
    Object v23 = new java.util.HashSet((((java.lang.Integer)v22).intValue()));
    Object v24 = ((com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder)v11).buildTypeDeserializer(((com.fasterxml.jackson.databind.DeserializationConfig)v18),((com.fasterxml.jackson.databind.JavaType)v21),((java.util.Collection)v23));
    org.junit.Assert.assertNull(v24);
  }
}
