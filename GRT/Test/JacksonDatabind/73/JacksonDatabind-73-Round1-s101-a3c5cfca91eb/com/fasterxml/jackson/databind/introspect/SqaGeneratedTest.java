package com.fasterxml.jackson.databind.introspect;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ((com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector)v0).getPropertyMap();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v4 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = "iXtems";
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v4),((java.lang.Class)v6),((java.lang.String)v7),((com.fasterxml.jackson.databind.JavaType)v8));
    ((com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector)v0)._doAddInjectable(((java.lang.Object)v1),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v3 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v4 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.PascalCaseStrategy();
    Object v5 = java.util.Map.of(((java.lang.Object)v1),((java.lang.Object)v2),((java.lang.Object)v3),((java.lang.Object)v4));
    ((com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector)v0)._removeUnwantedAccessor(((java.util.Map)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v3 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v4 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.PascalCaseStrategy();
    Object v5 = java.util.Map.of(((java.lang.Object)v1),((java.lang.Object)v2),((java.lang.Object)v3),((java.lang.Object)v4));
    Object v6 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v7 = ((java.util.Map)v5).get(((java.lang.Object)v6));
    ((com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector)v0)._removeUnwantedProperties(((java.util.Map)v5));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ((com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector)v0).getAnySetterField();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v3 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v4 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.PascalCaseStrategy();
    Object v5 = java.util.Map.of(((java.lang.Object)v1),((java.lang.Object)v2),((java.lang.Object)v3),((java.lang.Object)v4));
    Object v6 = "WRITE_CHAR_ARRAYS_AS_J^ON_ARRAYS";
    Object v7 = ((com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector)v0)._property(((java.util.Map)v5),((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v3 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v4 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.PascalCaseStrategy();
    Object v5 = java.util.Map.of(((java.lang.Object)v1),((java.lang.Object)v2),((java.lang.Object)v3),((java.lang.Object)v4));
    ((com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector)v0)._sortProperties(((java.util.Map)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v3 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v4 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.PascalCaseStrategy();
    Object v5 = java.util.Map.of(((java.lang.Object)v1),((java.lang.Object)v2),((java.lang.Object)v3),((java.lang.Object)v4));
    Object v6 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.PascalCaseStrategy();
    ((com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector)v0)._renameUsing(((java.util.Map)v5),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = null;
    ((com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector)v0).collectAll();
    Object v1 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ((com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector)v0).getJsonValueMethod();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = null;
    Object v2 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v3 = null;
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v5 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v6 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v7 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.PascalCaseStrategy();
    Object v8 = java.util.Map.of(((java.lang.Object)v4),((java.lang.Object)v5),((java.lang.Object)v6),((java.lang.Object)v7));
    Object v9 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3),((java.util.Map)v8));
    Object v10 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v11 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v12 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v1),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v2),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v9),((com.fasterxml.jackson.databind.util.RootNameLookup)v10),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v11));
    Object v13 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v14 = true;
    Object v15 = "]q";
    Object v16 = ")";
    Object v17 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = "]q";
    Object v19 = ")";
    Object v20 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v18),((java.lang.String)v19));
    Object v21 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v12),((com.fasterxml.jackson.databind.AnnotationIntrospector)v13),(((java.lang.Boolean)v14).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v17),((com.fasterxml.jackson.databind.PropertyName)v20));
    Object v22 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v23 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v24 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.PascalCaseStrategy();
    Object v25 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v27));
    Object v29 = java.util.List.of(((java.lang.Object)v22),((java.lang.Object)v23),((java.lang.Object)v24),((java.lang.Object)v25),((java.lang.Object)v26),((java.lang.Object)v28));
    ((com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector)v0)._updateCreatorProperty(((com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder)v21),((java.util.List)v29));
    Object v30 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ((com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector)v0).getAnyGetter();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v3 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v4 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.PascalCaseStrategy();
    Object v5 = java.util.Map.of(((java.lang.Object)v1),((java.lang.Object)v2),((java.lang.Object)v3),((java.lang.Object)v4));
    Object v6 = ((java.util.Map)v5).hashCode();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v8 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v9 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v7),((com.fasterxml.jackson.databind.type.TypeBindings)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = true;
    Object v13 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v15 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null};
    Object v16 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v9),((java.lang.reflect.Constructor)v13),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v14),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v15));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v19 = 13;
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v16),((com.fasterxml.jackson.databind.JavaType)v17),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v18),(((java.lang.Integer)v19).intValue()));
    ((com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector)v0)._addCreatorParam(((java.util.Map)v5),((com.fasterxml.jackson.databind.introspect.AnnotatedParameter)v20));
    Object v21 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ((com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector)v0).getObjectIdInfo();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v3 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v4 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.PascalCaseStrategy();
    Object v5 = java.util.Map.of(((java.lang.Object)v1),((java.lang.Object)v2),((java.lang.Object)v3),((java.lang.Object)v4));
    ((com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector)v0)._addMethods(((java.util.Map)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v3 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v4 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.PascalCaseStrategy();
    Object v5 = java.util.Map.of(((java.lang.Object)v1),((java.lang.Object)v2),((java.lang.Object)v3),((java.lang.Object)v4));
    ((com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector)v0)._addInjectables(((java.util.Map)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ((com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector)v0).getAnnotationIntrospector();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v3 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v4 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.PascalCaseStrategy();
    Object v5 = java.util.Map.of(((java.lang.Object)v1),((java.lang.Object)v2),((java.lang.Object)v3),((java.lang.Object)v4));
    ((com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector)v0)._renameWithWrappers(((java.util.Map)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ((com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector)v0).getType();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v3 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v4 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.PascalCaseStrategy();
    Object v5 = java.util.Map.of(((java.lang.Object)v1),((java.lang.Object)v2),((java.lang.Object)v3),((java.lang.Object)v4));
    Object v6 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.PascalCaseStrategy();
    Object v7 = ((java.util.Map)v5).containsValue(((java.lang.Object)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v9 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v10 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v8),((com.fasterxml.jackson.databind.type.TypeBindings)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = true;
    Object v14 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v16 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null};
    Object v17 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v10),((java.lang.reflect.Constructor)v14),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v15),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v20 = 13;
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v17),((com.fasterxml.jackson.databind.JavaType)v18),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v19),(((java.lang.Integer)v20).intValue()));
    ((com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector)v0)._addCreatorParam(((java.util.Map)v5),((com.fasterxml.jackson.databind.introspect.AnnotatedParameter)v21));
    Object v22 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ((com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector)v0).getAnySetterMethod();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v3 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v4 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.PascalCaseStrategy();
    Object v5 = java.util.Map.of(((java.lang.Object)v1),((java.lang.Object)v2),((java.lang.Object)v3),((java.lang.Object)v4));
    Object v6 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v7 = ((java.util.Map)v5).containsKey(((java.lang.Object)v6));
    ((com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector)v0)._removeUnwantedProperties(((java.util.Map)v5));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v3 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v4 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.PascalCaseStrategy();
    Object v5 = java.util.Map.of(((java.lang.Object)v1),((java.lang.Object)v2),((java.lang.Object)v3),((java.lang.Object)v4));
    ((com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector)v0)._renameProperties(((java.util.Map)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v3 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v4 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.PascalCaseStrategy();
    Object v5 = java.util.Map.of(((java.lang.Object)v1),((java.lang.Object)v2),((java.lang.Object)v3),((java.lang.Object)v4));
    ((com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector)v0)._addCreators(((java.util.Map)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ((com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector)v0).getInjectables();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v3 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v4 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.PascalCaseStrategy();
    Object v5 = java.util.Map.of(((java.lang.Object)v1),((java.lang.Object)v2),((java.lang.Object)v3),((java.lang.Object)v4));
    Object v6 = "string";
    Object v7 = ((com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector)v0)._property(((java.util.Map)v5),((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v4 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = true;
    Object v8 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null};
    Object v11 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v4),((java.lang.reflect.Constructor)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v9),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v10));
    Object v12 = ((com.fasterxml.jackson.databind.introspect.Annotated)v11).getRawType();
    ((com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector)v0)._doAddInjectable(((java.lang.Object)v1),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v11));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v3 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v4 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.PascalCaseStrategy();
    Object v5 = java.util.Map.of(((java.lang.Object)v1),((java.lang.Object)v2),((java.lang.Object)v3),((java.lang.Object)v4));
    Object v6 = -2;
    Object v7 = 1;
    Object v8 = -25;
    Object v9 = 0;
    Object v10 = 1;
    Object v11 = new java.util.Date((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = false;
    Object v13 = java.util.TimeZone.getDefault();
    Object v14 = com.fasterxml.jackson.databind.util.ISO8601Utils.format(((java.util.Date)v11),(((java.lang.Boolean)v12).booleanValue()),((java.util.TimeZone)v13));
    Object v15 = new java.lang.StringBuilder(((java.lang.CharSequence)v14));
    Object v16 = ((java.util.Map)v5).get(((java.lang.Object)v15));
    Object v17 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.PascalCaseStrategy();
    ((com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector)v0)._renameUsing(((java.util.Map)v5),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v17));
    Object v18 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v4 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = "iXtems";
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v4),((java.lang.Class)v6),((java.lang.String)v7),((com.fasterxml.jackson.databind.JavaType)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = ((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v9).getAnnotation(((java.lang.Class)v11));
    ((com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector)v0)._doAddInjectable(((java.lang.Object)v1),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v9));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v3 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v4 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.PascalCaseStrategy();
    Object v5 = java.util.Map.of(((java.lang.Object)v1),((java.lang.Object)v2),((java.lang.Object)v3),((java.lang.Object)v4));
    Object v6 = "inKteger";
    Object v7 = ((com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector)v0)._property(((java.util.Map)v5),((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v4 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = true;
    Object v8 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null};
    Object v11 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v4),((java.lang.reflect.Constructor)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v9),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v14 = 13;
    Object v15 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v11),((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v13),(((java.lang.Integer)v14).intValue()));
    ((com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector)v0)._doAddInjectable(((java.lang.Object)v1),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v15));
    Object v16 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v3 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v4 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.PascalCaseStrategy();
    Object v5 = java.util.Map.of(((java.lang.Object)v1),((java.lang.Object)v2),((java.lang.Object)v3),((java.lang.Object)v4));
    Object v6 = ((java.util.Map)v5).hashCode();
    ((com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector)v0)._addCreators(((java.util.Map)v5));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v6 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.PascalCaseStrategy();
    Object v7 = java.util.Map.of(((java.lang.Object)v3),((java.lang.Object)v4),((java.lang.Object)v5),((java.lang.Object)v6));
    Object v8 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2),((java.util.Map)v7));
    Object v9 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v10 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v11 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v8),((com.fasterxml.jackson.databind.util.RootNameLookup)v9),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v10));
    Object v12 = false;
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = null;
    Object v15 = "enum|";
    Object v16 = new com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector(((com.fasterxml.jackson.databind.cfg.MapperConfig)v11),(((java.lang.Boolean)v12).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v14),((java.lang.String)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v3 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v4 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.PascalCaseStrategy();
    Object v5 = java.util.Map.of(((java.lang.Object)v1),((java.lang.Object)v2),((java.lang.Object)v3),((java.lang.Object)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = ((java.util.Map)v5).getOrDefault(((java.lang.Object)v7),((java.lang.Object)v8));
    Object v10 = "~";
    Object v11 = ((com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector)v0)._property(((java.util.Map)v5),((java.lang.String)v10));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ((com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector)v0).getIgnoredPropertyNames();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v6 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.PascalCaseStrategy();
    Object v7 = java.util.Map.of(((java.lang.Object)v3),((java.lang.Object)v4),((java.lang.Object)v5),((java.lang.Object)v6));
    Object v8 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2),((java.util.Map)v7));
    Object v9 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v10 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v11 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v8),((com.fasterxml.jackson.databind.util.RootNameLookup)v9),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = ((com.fasterxml.jackson.databind.cfg.MapperConfig)v11).getDefaultPropertyIgnorals(((java.lang.Class)v13));
    Object v15 = false;
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = null;
    Object v18 = "ClaMss ";
    Object v19 = new com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector(((com.fasterxml.jackson.databind.cfg.MapperConfig)v11),(((java.lang.Boolean)v15).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v16),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v17),((java.lang.String)v18));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v3 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v4 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.PascalCaseStrategy();
    Object v5 = java.util.Map.of(((java.lang.Object)v1),((java.lang.Object)v2),((java.lang.Object)v3),((java.lang.Object)v4));
    ((com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector)v0)._addFields(((java.util.Map)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v3 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v4 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.PascalCaseStrategy();
    Object v5 = java.util.Map.of(((java.lang.Object)v1),((java.lang.Object)v2),((java.lang.Object)v3),((java.lang.Object)v4));
    Object v6 = ((java.util.Map)v5).isEmpty();
    ((com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector)v0)._renameWithWrappers(((java.util.Map)v5));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v3 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v4 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.PascalCaseStrategy();
    Object v5 = java.util.Map.of(((java.lang.Object)v1),((java.lang.Object)v2),((java.lang.Object)v3),((java.lang.Object)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v8 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v6),((com.fasterxml.jackson.databind.type.TypeBindings)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = true;
    Object v12 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v14 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null};
    Object v15 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v8),((java.lang.reflect.Constructor)v12),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v13),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v18 = 13;
    Object v19 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v15),((com.fasterxml.jackson.databind.JavaType)v16),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v17),(((java.lang.Integer)v18).intValue()));
    Object v20 = ((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v19).annotations();
    ((com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector)v0)._addCreatorParam(((java.util.Map)v5),((com.fasterxml.jackson.databind.introspect.AnnotatedParameter)v19));
    Object v21 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v3 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v4 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.PascalCaseStrategy();
    Object v5 = java.util.Map.of(((java.lang.Object)v1),((java.lang.Object)v2),((java.lang.Object)v3),((java.lang.Object)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = ((java.util.Map)v5).containsKey(((java.lang.Object)v6));
    ((com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector)v0)._addCreators(((java.util.Map)v5));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v3 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v4 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.PascalCaseStrategy();
    Object v5 = java.util.Map.of(((java.lang.Object)v1),((java.lang.Object)v2),((java.lang.Object)v3),((java.lang.Object)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v8 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v6),((com.fasterxml.jackson.databind.type.TypeBindings)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = true;
    Object v12 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v14 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null};
    Object v15 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v8),((java.lang.reflect.Constructor)v12),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v13),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v18 = 13;
    Object v19 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v15),((com.fasterxml.jackson.databind.JavaType)v16),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v17),(((java.lang.Integer)v18).intValue()));
    ((com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector)v0)._addCreatorParam(((java.util.Map)v5),((com.fasterxml.jackson.databind.introspect.AnnotatedParameter)v19));
    Object v20 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v3 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v4 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.PascalCaseStrategy();
    Object v5 = java.util.Map.of(((java.lang.Object)v1),((java.lang.Object)v2),((java.lang.Object)v3),((java.lang.Object)v4));
    Object v6 = ((java.util.Map)v5).entrySet();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v8 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v9 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v7),((com.fasterxml.jackson.databind.type.TypeBindings)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = true;
    Object v13 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v15 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null};
    Object v16 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v9),((java.lang.reflect.Constructor)v13),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v14),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v15));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v19 = 13;
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v16),((com.fasterxml.jackson.databind.JavaType)v17),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v18),(((java.lang.Integer)v19).intValue()));
    Object v21 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v22 = ((com.fasterxml.jackson.databind.introspect.Annotated)v20).getType(((com.fasterxml.jackson.databind.type.TypeBindings)v21));
    ((com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector)v0)._addCreatorParam(((java.util.Map)v5),((com.fasterxml.jackson.databind.introspect.AnnotatedParameter)v20));
    Object v23 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v6 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.PascalCaseStrategy();
    Object v7 = java.util.Map.of(((java.lang.Object)v3),((java.lang.Object)v4),((java.lang.Object)v5),((java.lang.Object)v6));
    Object v8 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2),((java.util.Map)v7));
    Object v9 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v10 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v11 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v8),((com.fasterxml.jackson.databind.util.RootNameLookup)v9),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v10));
    Object v12 = ((com.fasterxml.jackson.databind.cfg.MapperConfig)v11).getActiveView();
    Object v13 = false;
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = null;
    Object v16 = "string";
    Object v17 = new com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector(((com.fasterxml.jackson.databind.cfg.MapperConfig)v11),(((java.lang.Boolean)v13).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v14),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v15),((java.lang.String)v16));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v3 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v4 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.PascalCaseStrategy();
    Object v5 = java.util.Map.of(((java.lang.Object)v1),((java.lang.Object)v2),((java.lang.Object)v3),((java.lang.Object)v4));
    ((com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector)v0)._removeUnwantedProperties(((java.util.Map)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v3 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v4 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.PascalCaseStrategy();
    Object v5 = java.util.Map.of(((java.lang.Object)v1),((java.lang.Object)v2),((java.lang.Object)v3),((java.lang.Object)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v8 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v6),((com.fasterxml.jackson.databind.type.TypeBindings)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = true;
    Object v12 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v14 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null};
    Object v15 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v8),((java.lang.reflect.Constructor)v12),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v13),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v18 = 13;
    Object v19 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v15),((com.fasterxml.jackson.databind.JavaType)v16),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v17),(((java.lang.Integer)v18).intValue()));
    Object v20 = ((com.fasterxml.jackson.databind.introspect.AnnotatedParameter)v19).getGenericType();
    ((com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector)v0)._addCreatorParam(((java.util.Map)v5),((com.fasterxml.jackson.databind.introspect.AnnotatedParameter)v19));
    Object v21 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v3 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v4 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.PascalCaseStrategy();
    Object v5 = java.util.Map.of(((java.lang.Object)v1),((java.lang.Object)v2),((java.lang.Object)v3),((java.lang.Object)v4));
    Object v6 = ((java.util.Map)v5).values();
    ((com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector)v0)._removeUnwantedAccessor(((java.util.Map)v5));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ((com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector)v0).findPOJOBuilderClass();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v4 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = "iXtems";
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v4),((java.lang.Class)v6),((java.lang.String)v7),((com.fasterxml.jackson.databind.JavaType)v8));
    ((com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector)v0)._doAddInjectable(((java.lang.Object)v1),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v3 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v4 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.PascalCaseStrategy();
    Object v5 = java.util.Map.of(((java.lang.Object)v1),((java.lang.Object)v2),((java.lang.Object)v3),((java.lang.Object)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = ((java.util.Map)v5).get(((java.lang.Object)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v11 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v9),((com.fasterxml.jackson.databind.type.TypeBindings)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = true;
    Object v15 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v17 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null};
    Object v18 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v11),((java.lang.reflect.Constructor)v15),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v16),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v21 = 13;
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v18),((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v20),(((java.lang.Integer)v21).intValue()));
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v23));
    Object v25 = ((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v22).hasAnnotation(((java.lang.Class)v24));
    ((com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector)v0)._addCreatorParam(((java.util.Map)v5),((com.fasterxml.jackson.databind.introspect.AnnotatedParameter)v22));
    Object v26 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v3 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v4 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.PascalCaseStrategy();
    Object v5 = java.util.Map.of(((java.lang.Object)v1),((java.lang.Object)v2),((java.lang.Object)v3),((java.lang.Object)v4));
    Object v6 = "Trying to resolve a forward reference with id [";
    Object v7 = ((com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector)v0)._property(((java.util.Map)v5),((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v6 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.PascalCaseStrategy();
    Object v7 = java.util.Map.of(((java.lang.Object)v3),((java.lang.Object)v4),((java.lang.Object)v5),((java.lang.Object)v6));
    Object v8 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2),((java.util.Map)v7));
    Object v9 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v10 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v11 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v8),((com.fasterxml.jackson.databind.util.RootNameLookup)v9),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v10));
    Object v12 = false;
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = ((com.fasterxml.jackson.databind.JavaType)v13).getInterfaces();
    Object v15 = null;
    Object v16 = "";
    Object v17 = new com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector(((com.fasterxml.jackson.databind.cfg.MapperConfig)v11),(((java.lang.Boolean)v12).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v15),((java.lang.String)v16));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v3 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v4 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.PascalCaseStrategy();
    Object v5 = java.util.Map.of(((java.lang.Object)v1),((java.lang.Object)v2),((java.lang.Object)v3),((java.lang.Object)v4));
    Object v6 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v7 = ((java.util.Map)v5).containsKey(((java.lang.Object)v6));
    ((com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector)v0)._renameWithWrappers(((java.util.Map)v5));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v3 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v4 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.PascalCaseStrategy();
    Object v5 = java.util.Map.of(((java.lang.Object)v1),((java.lang.Object)v2),((java.lang.Object)v3),((java.lang.Object)v4));
    Object v6 = ((java.util.Map)v5).entrySet();
    ((com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector)v0)._addCreators(((java.util.Map)v5));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v3 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v4 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.PascalCaseStrategy();
    Object v5 = java.util.Map.of(((java.lang.Object)v1),((java.lang.Object)v2),((java.lang.Object)v3),((java.lang.Object)v4));
    Object v6 = ((java.util.Map)v5).entrySet();
    ((com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector)v0)._addMethods(((java.util.Map)v5));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v3 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v4 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.PascalCaseStrategy();
    Object v5 = java.util.Map.of(((java.lang.Object)v1),((java.lang.Object)v2),((java.lang.Object)v3),((java.lang.Object)v4));
    Object v6 = null;
    Object v7 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    ((com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector)v0)._addGetterMethod(((java.util.Map)v5),((com.fasterxml.jackson.databind.introspect.AnnotatedMethod)v6),((com.fasterxml.jackson.databind.AnnotationIntrospector)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v3 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v4 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.PascalCaseStrategy();
    Object v5 = java.util.Map.of(((java.lang.Object)v1),((java.lang.Object)v2),((java.lang.Object)v3),((java.lang.Object)v4));
    Object v6 = ((java.util.Map)v5).isEmpty();
    ((com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector)v0)._addCreators(((java.util.Map)v5));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v3 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = true;
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null};
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v3),((java.lang.reflect.Constructor)v7),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v13 = 13;
    Object v14 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v10),((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v12),(((java.lang.Integer)v13).intValue()));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v16 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v17 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v15),((com.fasterxml.jackson.databind.type.TypeBindings)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = true;
    Object v21 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null};
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v17),((java.lang.reflect.Constructor)v21),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v22),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v23));
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v26 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v27 = 13;
    Object v28 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v24),((com.fasterxml.jackson.databind.JavaType)v25),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v26),(((java.lang.Integer)v27).intValue()));
    ((com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector)v0)._doAddInjectable(((java.lang.Object)v14),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v28));
    Object v29 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v3 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v4 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.PascalCaseStrategy();
    Object v5 = java.util.Map.of(((java.lang.Object)v1),((java.lang.Object)v2),((java.lang.Object)v3),((java.lang.Object)v4));
    Object v6 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v7 = ((java.util.Map)v5).equals(((java.lang.Object)v6));
    Object v8 = "array";
    Object v9 = ((com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector)v0)._property(((java.util.Map)v5),((java.lang.String)v8));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = null;
    Object v2 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v3 = null;
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v5 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v6 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v7 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.PascalCaseStrategy();
    Object v8 = java.util.Map.of(((java.lang.Object)v4),((java.lang.Object)v5),((java.lang.Object)v6),((java.lang.Object)v7));
    Object v9 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3),((java.util.Map)v8));
    Object v10 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v11 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v12 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v1),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v2),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v9),((com.fasterxml.jackson.databind.util.RootNameLookup)v10),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v11));
    Object v13 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v14 = true;
    Object v15 = "]q";
    Object v16 = ")";
    Object v17 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = "]q";
    Object v19 = ")";
    Object v20 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v18),((java.lang.String)v19));
    Object v21 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v12),((com.fasterxml.jackson.databind.AnnotationIntrospector)v13),(((java.lang.Boolean)v14).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v17),((com.fasterxml.jackson.databind.PropertyName)v20));
    Object v22 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v23 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v24 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.PascalCaseStrategy();
    Object v25 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v27));
    Object v29 = java.util.List.of(((java.lang.Object)v22),((java.lang.Object)v23),((java.lang.Object)v24),((java.lang.Object)v25),((java.lang.Object)v26),((java.lang.Object)v28));
    Object v30 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v31 = ((java.util.List)v29).equals(((java.lang.Object)v30));
    ((com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector)v0)._updateCreatorProperty(((com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder)v21),((java.util.List)v29));
    Object v32 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v3 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v4 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.PascalCaseStrategy();
    Object v5 = java.util.Map.of(((java.lang.Object)v1),((java.lang.Object)v2),((java.lang.Object)v3),((java.lang.Object)v4));
    Object v6 = "]q";
    Object v7 = ")";
    Object v8 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = ((com.fasterxml.jackson.databind.PropertyName)v8).internSimpleName();
    Object v10 = ((com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector)v0)._property(((java.util.Map)v5),((com.fasterxml.jackson.databind.PropertyName)v8));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v3 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v4 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.PascalCaseStrategy();
    Object v5 = java.util.Map.of(((java.lang.Object)v1),((java.lang.Object)v2),((java.lang.Object)v3),((java.lang.Object)v4));
    Object v6 = ((java.util.Map)v5).size();
    ((com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector)v0)._addFields(((java.util.Map)v5));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = null;
    Object v2 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v3 = null;
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v5 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v6 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v7 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.PascalCaseStrategy();
    Object v8 = java.util.Map.of(((java.lang.Object)v4),((java.lang.Object)v5),((java.lang.Object)v6),((java.lang.Object)v7));
    Object v9 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3),((java.util.Map)v8));
    Object v10 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v11 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v12 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v1),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v2),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v9),((com.fasterxml.jackson.databind.util.RootNameLookup)v10),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v11));
    Object v13 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v14 = true;
    Object v15 = "]q";
    Object v16 = ")";
    Object v17 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = "]q";
    Object v19 = ")";
    Object v20 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v18),((java.lang.String)v19));
    Object v21 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v12),((com.fasterxml.jackson.databind.AnnotationIntrospector)v13),(((java.lang.Boolean)v14).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v17),((com.fasterxml.jackson.databind.PropertyName)v20));
    Object v22 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v23 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v24 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.PascalCaseStrategy();
    Object v25 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v27));
    Object v29 = java.util.List.of(((java.lang.Object)v22),((java.lang.Object)v23),((java.lang.Object)v24),((java.lang.Object)v25),((java.lang.Object)v26),((java.lang.Object)v28));
    Object v30 = ((java.util.List)v29).listIterator();
    ((com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector)v0)._updateCreatorProperty(((com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder)v21),((java.util.List)v29));
    Object v31 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v3 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v4 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.PascalCaseStrategy();
    Object v5 = java.util.Map.of(((java.lang.Object)v1),((java.lang.Object)v2),((java.lang.Object)v3),((java.lang.Object)v4));
    Object v6 = "aPrray";
    Object v7 = ((com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector)v0)._property(((java.util.Map)v5),((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = null;
    Object v2 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v3 = null;
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v5 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v6 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v7 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.PascalCaseStrategy();
    Object v8 = java.util.Map.of(((java.lang.Object)v4),((java.lang.Object)v5),((java.lang.Object)v6),((java.lang.Object)v7));
    Object v9 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3),((java.util.Map)v8));
    Object v10 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v11 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v12 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v1),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v2),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v9),((com.fasterxml.jackson.databind.util.RootNameLookup)v10),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v11));
    Object v13 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v14 = true;
    Object v15 = "]q";
    Object v16 = ")";
    Object v17 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = "]q";
    Object v19 = ")";
    Object v20 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v18),((java.lang.String)v19));
    Object v21 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v12),((com.fasterxml.jackson.databind.AnnotationIntrospector)v13),(((java.lang.Boolean)v14).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v17),((com.fasterxml.jackson.databind.PropertyName)v20));
    Object v22 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v23 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v24 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.PascalCaseStrategy();
    Object v25 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v27));
    Object v29 = java.util.List.of(((java.lang.Object)v22),((java.lang.Object)v23),((java.lang.Object)v24),((java.lang.Object)v25),((java.lang.Object)v26),((java.lang.Object)v28));
    Object v30 = ((java.util.List)v29).toArray();
    ((com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector)v0)._updateCreatorProperty(((com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder)v21),((java.util.List)v29));
    Object v31 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = " vs W";
    ((com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector)v0).reportProblem(((java.lang.String)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v6 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.PascalCaseStrategy();
    Object v7 = java.util.Map.of(((java.lang.Object)v3),((java.lang.Object)v4),((java.lang.Object)v5),((java.lang.Object)v6));
    Object v8 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2),((java.util.Map)v7));
    Object v9 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v10 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v11 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v8),((com.fasterxml.jackson.databind.util.RootNameLookup)v9),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = ((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v11).findMixInClassFor(((java.lang.Class)v13));
    Object v15 = true;
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v17),((com.fasterxml.jackson.databind.JavaType)v18),((com.fasterxml.jackson.databind.JavaType)v19));
    Object v21 = null;
    Object v22 = "";
    Object v23 = new com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector(((com.fasterxml.jackson.databind.cfg.MapperConfig)v11),(((java.lang.Boolean)v15).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v20),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v21),((java.lang.String)v22));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v6 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.PascalCaseStrategy();
    Object v7 = java.util.Map.of(((java.lang.Object)v3),((java.lang.Object)v4),((java.lang.Object)v5),((java.lang.Object)v6));
    Object v8 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2),((java.util.Map)v7));
    Object v9 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v10 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v11 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v8),((com.fasterxml.jackson.databind.util.RootNameLookup)v9),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v10));
    Object v12 = false;
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = null;
    Object v15 = "+";
    Object v16 = new com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector(((com.fasterxml.jackson.databind.cfg.MapperConfig)v11),(((java.lang.Boolean)v12).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v14),((java.lang.String)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v3 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v4 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.PascalCaseStrategy();
    Object v5 = java.util.Map.of(((java.lang.Object)v1),((java.lang.Object)v2),((java.lang.Object)v3),((java.lang.Object)v4));
    Object v6 = com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.noTypeInfoBuilder();
    Object v7 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v8 = ((java.util.Map)v5).getOrDefault(((java.lang.Object)v6),((java.lang.Object)v7));
    Object v9 = "";
    Object v10 = ((com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector)v0)._property(((java.util.Map)v5),((java.lang.String)v9));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v6 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.PascalCaseStrategy();
    Object v7 = java.util.Map.of(((java.lang.Object)v3),((java.lang.Object)v4),((java.lang.Object)v5),((java.lang.Object)v6));
    Object v8 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2),((java.util.Map)v7));
    Object v9 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v10 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v11 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v8),((com.fasterxml.jackson.databind.util.RootNameLookup)v9),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = ((com.fasterxml.jackson.databind.cfg.MapperConfig)v11).getDefaultPropertyFormat(((java.lang.Class)v13));
    Object v15 = true;
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v17),((com.fasterxml.jackson.databind.JavaType)v18),((com.fasterxml.jackson.databind.JavaType)v19));
    Object v21 = null;
    Object v22 = "byte:";
    Object v23 = new com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector(((com.fasterxml.jackson.databind.cfg.MapperConfig)v11),(((java.lang.Boolean)v15).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v20),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v21),((java.lang.String)v22));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v3 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v4 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.PascalCaseStrategy();
    Object v5 = java.util.Map.of(((java.lang.Object)v1),((java.lang.Object)v2),((java.lang.Object)v3),((java.lang.Object)v4));
    Object v6 = ((java.util.Map)v5).values();
    ((com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector)v0)._addInjectables(((java.util.Map)v5));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v3 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v4 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.PascalCaseStrategy();
    Object v5 = java.util.Map.of(((java.lang.Object)v1),((java.lang.Object)v2),((java.lang.Object)v3),((java.lang.Object)v4));
    Object v6 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v7 = com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.noTypeInfoBuilder();
    Object v8 = ((java.util.Map)v5).getOrDefault(((java.lang.Object)v6),((java.lang.Object)v7));
    ((com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector)v0)._removeUnwantedProperties(((java.util.Map)v5));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v6 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.PascalCaseStrategy();
    Object v7 = java.util.Map.of(((java.lang.Object)v3),((java.lang.Object)v4),((java.lang.Object)v5),((java.lang.Object)v6));
    Object v8 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2),((java.util.Map)v7));
    Object v9 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v10 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v11 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v8),((com.fasterxml.jackson.databind.util.RootNameLookup)v9),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v10));
    Object v12 = false;
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = null;
    Object v15 = "]";
    Object v16 = new com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector(((com.fasterxml.jackson.databind.cfg.MapperConfig)v11),(((java.lang.Boolean)v12).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v14),((java.lang.String)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v3 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v4 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.PascalCaseStrategy();
    Object v5 = java.util.Map.of(((java.lang.Object)v1),((java.lang.Object)v2),((java.lang.Object)v3),((java.lang.Object)v4));
    Object v6 = ((java.util.Map)v5).entrySet();
    ((com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector)v0)._renameWithWrappers(((java.util.Map)v5));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v3 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v4 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.PascalCaseStrategy();
    Object v5 = java.util.Map.of(((java.lang.Object)v1),((java.lang.Object)v2),((java.lang.Object)v3),((java.lang.Object)v4));
    Object v6 = "]";
    Object v7 = ((com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector)v0)._property(((java.util.Map)v5),((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = null;
    Object v2 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v3 = null;
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v5 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v6 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v7 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.PascalCaseStrategy();
    Object v8 = java.util.Map.of(((java.lang.Object)v4),((java.lang.Object)v5),((java.lang.Object)v6),((java.lang.Object)v7));
    Object v9 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3),((java.util.Map)v8));
    Object v10 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v11 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v12 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v1),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v2),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v9),((com.fasterxml.jackson.databind.util.RootNameLookup)v10),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v11));
    Object v13 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v14 = true;
    Object v15 = "]q";
    Object v16 = ")";
    Object v17 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = "]q";
    Object v19 = ")";
    Object v20 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v18),((java.lang.String)v19));
    Object v21 = new com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder(((com.fasterxml.jackson.databind.cfg.MapperConfig)v12),((com.fasterxml.jackson.databind.AnnotationIntrospector)v13),(((java.lang.Boolean)v14).booleanValue()),((com.fasterxml.jackson.databind.PropertyName)v17),((com.fasterxml.jackson.databind.PropertyName)v20));
    Object v22 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v23 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v24 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.PascalCaseStrategy();
    Object v25 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v27));
    Object v29 = java.util.List.of(((java.lang.Object)v22),((java.lang.Object)v23),((java.lang.Object)v24),((java.lang.Object)v25),((java.lang.Object)v26),((java.lang.Object)v28));
    Object v30 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v31 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v32 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.PascalCaseStrategy();
    Object v33 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v34 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v35 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v36 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v35));
    Object v37 = java.util.List.of(((java.lang.Object)v30),((java.lang.Object)v31),((java.lang.Object)v32),((java.lang.Object)v33),((java.lang.Object)v34),((java.lang.Object)v36));
    Object v38 = ((java.util.List)v29).containsAll(((java.util.Collection)v37));
    ((com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector)v0)._updateCreatorProperty(((com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder)v21),((java.util.List)v29));
    Object v39 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v6 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.PascalCaseStrategy();
    Object v7 = java.util.Map.of(((java.lang.Object)v3),((java.lang.Object)v4),((java.lang.Object)v5),((java.lang.Object)v6));
    Object v8 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2),((java.util.Map)v7));
    Object v9 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v10 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v11 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v8),((com.fasterxml.jackson.databind.util.RootNameLookup)v9),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v10));
    Object v12 = false;
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = null;
    Object v15 = "AnnotationIntroypector returned Class ";
    Object v16 = new com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector(((com.fasterxml.jackson.databind.cfg.MapperConfig)v11),(((java.lang.Boolean)v12).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v14),((java.lang.String)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v3 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v4 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.PascalCaseStrategy();
    Object v5 = java.util.Map.of(((java.lang.Object)v1),((java.lang.Object)v2),((java.lang.Object)v3),((java.lang.Object)v4));
    Object v6 = ")";
    Object v7 = ((com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector)v0)._property(((java.util.Map)v5),((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v3 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v4 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.PascalCaseStrategy();
    Object v5 = java.util.Map.of(((java.lang.Object)v1),((java.lang.Object)v2),((java.lang.Object)v3),((java.lang.Object)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v7 = ((java.util.Map)v5).equals(((java.lang.Object)v6));
    ((com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector)v0)._sortProperties(((java.util.Map)v5));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v6 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.PascalCaseStrategy();
    Object v7 = java.util.Map.of(((java.lang.Object)v3),((java.lang.Object)v4),((java.lang.Object)v5),((java.lang.Object)v6));
    Object v8 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2),((java.util.Map)v7));
    Object v9 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v10 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v11 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v8),((com.fasterxml.jackson.databind.util.RootNameLookup)v9),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v10));
    Object v12 = true;
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = null;
    Object v15 = "strig";
    Object v16 = new com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector(((com.fasterxml.jackson.databind.cfg.MapperConfig)v11),(((java.lang.Boolean)v12).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v14),((java.lang.String)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v3 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v4 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.PascalCaseStrategy();
    Object v5 = java.util.Map.of(((java.lang.Object)v1),((java.lang.Object)v2),((java.lang.Object)v3),((java.lang.Object)v4));
    Object v6 = ((java.util.Map)v5).entrySet();
    ((com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector)v0)._renameProperties(((java.util.Map)v5));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v3 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v4 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.PascalCaseStrategy();
    Object v5 = java.util.Map.of(((java.lang.Object)v1),((java.lang.Object)v2),((java.lang.Object)v3),((java.lang.Object)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v8 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v6),((com.fasterxml.jackson.databind.type.TypeBindings)v7));
    Object v9 = ((java.util.Map)v5).containsKey(((java.lang.Object)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v11 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v12 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v10),((com.fasterxml.jackson.databind.type.TypeBindings)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = true;
    Object v16 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v18 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null};
    Object v19 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v12),((java.lang.reflect.Constructor)v16),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v17),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v22 = 13;
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v19),((com.fasterxml.jackson.databind.JavaType)v20),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v21),(((java.lang.Integer)v22).intValue()));
    ((com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector)v0)._addCreatorParam(((java.util.Map)v5),((com.fasterxml.jackson.databind.introspect.AnnotatedParameter)v23));
    Object v24 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v3 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v4 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.PascalCaseStrategy();
    Object v5 = java.util.Map.of(((java.lang.Object)v1),((java.lang.Object)v2),((java.lang.Object)v3),((java.lang.Object)v4));
    Object v6 = "";
    Object v7 = ((com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector)v0)._property(((java.util.Map)v5),((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v3 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v4 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.PascalCaseStrategy();
    Object v5 = java.util.Map.of(((java.lang.Object)v1),((java.lang.Object)v2),((java.lang.Object)v3),((java.lang.Object)v4));
    Object v6 = java.util.TimeZone.getDefault();
    Object v7 = ((java.util.Map)v5).equals(((java.lang.Object)v6));
    ((com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector)v0)._removeUnwantedProperties(((java.util.Map)v5));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v3 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v4 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.PascalCaseStrategy();
    Object v5 = java.util.Map.of(((java.lang.Object)v1),((java.lang.Object)v2),((java.lang.Object)v3),((java.lang.Object)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = ((java.util.Map)v5).containsKey(((java.lang.Object)v6));
    ((com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector)v0)._addMethods(((java.util.Map)v5));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ((com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector)v0).collect();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v6 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.PascalCaseStrategy();
    Object v7 = java.util.Map.of(((java.lang.Object)v3),((java.lang.Object)v4),((java.lang.Object)v5),((java.lang.Object)v6));
    Object v8 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2),((java.util.Map)v7));
    Object v9 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v10 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v11 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v8),((com.fasterxml.jackson.databind.util.RootNameLookup)v9),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = ((com.fasterxml.jackson.databind.cfg.MapperConfig)v11).getDefaultPropertyFormat(((java.lang.Class)v13));
    Object v15 = true;
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = null;
    Object v18 = "array";
    Object v19 = new com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector(((com.fasterxml.jackson.databind.cfg.MapperConfig)v11),(((java.lang.Boolean)v15).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v16),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v17),((java.lang.String)v18));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v4 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = "iXtems";
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v4),((java.lang.Class)v6),((java.lang.String)v7),((com.fasterxml.jackson.databind.JavaType)v8));
    ((com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector)v0)._doAddInjectable(((java.lang.Object)v1),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v3 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v4 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.PascalCaseStrategy();
    Object v5 = java.util.Map.of(((java.lang.Object)v1),((java.lang.Object)v2),((java.lang.Object)v3),((java.lang.Object)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v8 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v6),((com.fasterxml.jackson.databind.type.TypeBindings)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = true;
    Object v12 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v14 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null};
    Object v15 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v8),((java.lang.reflect.Constructor)v12),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v13),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v18 = 13;
    Object v19 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v15),((com.fasterxml.jackson.databind.JavaType)v16),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v17),(((java.lang.Integer)v18).intValue()));
    Object v20 = ((java.util.Map)v5).get(((java.lang.Object)v19));
    Object v21 = "";
    Object v22 = ((com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector)v0)._property(((java.util.Map)v5),((java.lang.String)v21));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v3 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v4 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.PascalCaseStrategy();
    Object v5 = java.util.Map.of(((java.lang.Object)v1),((java.lang.Object)v2),((java.lang.Object)v3),((java.lang.Object)v4));
    Object v6 = ((java.util.Map)v5).isEmpty();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v8 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v9 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v7),((com.fasterxml.jackson.databind.type.TypeBindings)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = true;
    Object v13 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v15 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null};
    Object v16 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v9),((java.lang.reflect.Constructor)v13),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v14),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v15));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v19 = 13;
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v16),((com.fasterxml.jackson.databind.JavaType)v17),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v18),(((java.lang.Integer)v19).intValue()));
    ((com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector)v0)._addCreatorParam(((java.util.Map)v5),((com.fasterxml.jackson.databind.introspect.AnnotatedParameter)v20));
    Object v21 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v4 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = true;
    Object v8 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null};
    Object v11 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v4),((java.lang.reflect.Constructor)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v9),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v14 = 13;
    Object v15 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v11),((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v13),(((java.lang.Integer)v14).intValue()));
    ((com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector)v0)._doAddInjectable(((java.lang.Object)v1),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v15));
    Object v16 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v3 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v4 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.PascalCaseStrategy();
    Object v5 = java.util.Map.of(((java.lang.Object)v1),((java.lang.Object)v2),((java.lang.Object)v3),((java.lang.Object)v4));
    Object v6 = "]q";
    Object v7 = ")";
    Object v8 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = ((com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector)v0)._property(((java.util.Map)v5),((com.fasterxml.jackson.databind.PropertyName)v8));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v2 = null;
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v6 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.PascalCaseStrategy();
    Object v7 = java.util.Map.of(((java.lang.Object)v3),((java.lang.Object)v4),((java.lang.Object)v5),((java.lang.Object)v6));
    Object v8 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v2),((java.util.Map)v7));
    Object v9 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v10 = new com.fasterxml.jackson.databind.cfg.ConfigOverrides();
    Object v11 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v0),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v1),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v8),((com.fasterxml.jackson.databind.util.RootNameLookup)v9),((com.fasterxml.jackson.databind.cfg.ConfigOverrides)v10));
    Object v12 = true;
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = null;
    Object v15 = "Failed to narrow value type of %s with concrete-type annotation (value %s), from '%s': %s";
    Object v16 = new com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector(((com.fasterxml.jackson.databind.cfg.MapperConfig)v11),(((java.lang.Boolean)v12).booleanValue()),((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v14),((java.lang.String)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v3 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v4 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.PascalCaseStrategy();
    Object v5 = java.util.Map.of(((java.lang.Object)v1),((java.lang.Object)v2),((java.lang.Object)v3),((java.lang.Object)v4));
    Object v6 = ((java.util.Map)v5).entrySet();
    ((com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector)v0)._addInjectables(((java.util.Map)v5));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v3 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v4 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.PascalCaseStrategy();
    Object v5 = java.util.Map.of(((java.lang.Object)v1),((java.lang.Object)v2),((java.lang.Object)v3),((java.lang.Object)v4));
    Object v6 = ((java.util.Map)v5).entrySet();
    ((com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector)v0)._removeUnwantedProperties(((java.util.Map)v5));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v3 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v4 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.PascalCaseStrategy();
    Object v5 = java.util.Map.of(((java.lang.Object)v1),((java.lang.Object)v2),((java.lang.Object)v3),((java.lang.Object)v4));
    Object v6 = ((java.util.Map)v5).size();
    Object v7 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.PascalCaseStrategy();
    ((com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector)v0)._renameUsing(((java.util.Map)v5),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v3 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v4 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.PascalCaseStrategy();
    Object v5 = java.util.Map.of(((java.lang.Object)v1),((java.lang.Object)v2),((java.lang.Object)v3),((java.lang.Object)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = ((java.util.Map)v5).equals(((java.lang.Object)v6));
    Object v8 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.PascalCaseStrategy();
    ((com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector)v0)._renameUsing(((java.util.Map)v5),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v3 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v4 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.PascalCaseStrategy();
    Object v5 = java.util.Map.of(((java.lang.Object)v1),((java.lang.Object)v2),((java.lang.Object)v3),((java.lang.Object)v4));
    Object v6 = ((java.util.Map)v5).size();
    ((com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector)v0)._addInjectables(((java.util.Map)v5));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v3 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v4 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.PascalCaseStrategy();
    Object v5 = java.util.Map.of(((java.lang.Object)v1),((java.lang.Object)v2),((java.lang.Object)v3),((java.lang.Object)v4));
    Object v6 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v8 = ((java.util.Map)v5).getOrDefault(((java.lang.Object)v6),((java.lang.Object)v7));
    Object v9 = "string";
    Object v10 = ((com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector)v0)._property(((java.util.Map)v5),((java.lang.String)v9));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v3 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v4 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.PascalCaseStrategy();
    Object v5 = java.util.Map.of(((java.lang.Object)v1),((java.lang.Object)v2),((java.lang.Object)v3),((java.lang.Object)v4));
    Object v6 = ((java.util.Map)v5).keySet();
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    ((com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector)v0)._addGetterMethod(((java.util.Map)v5),((com.fasterxml.jackson.databind.introspect.AnnotatedMethod)v7),((com.fasterxml.jackson.databind.AnnotationIntrospector)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = -2;
    Object v2 = 1;
    Object v3 = -25;
    Object v4 = 0;
    Object v5 = 1;
    Object v6 = new java.util.Date((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = false;
    Object v8 = java.util.TimeZone.getDefault();
    Object v9 = com.fasterxml.jackson.databind.util.ISO8601Utils.format(((java.util.Date)v6),(((java.lang.Boolean)v7).booleanValue()),((java.util.TimeZone)v8));
    Object v10 = new java.lang.StringBuilder(((java.lang.CharSequence)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v12 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v13 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v11),((com.fasterxml.jackson.databind.type.TypeBindings)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v14));
    Object v16 = "iXtems";
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v13),((java.lang.Class)v15),((java.lang.String)v16),((com.fasterxml.jackson.databind.JavaType)v17));
    ((com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector)v0)._doAddInjectable(((java.lang.Object)v10),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v18));
    Object v19 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }
}
