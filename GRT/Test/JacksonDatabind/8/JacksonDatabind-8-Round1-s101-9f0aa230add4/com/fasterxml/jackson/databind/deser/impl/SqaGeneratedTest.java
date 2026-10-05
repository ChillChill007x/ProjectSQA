package com.fasterxml.jackson.databind.deser.impl;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ((com.fasterxml.jackson.databind.deser.impl.CreatorCollector)v0).hasDefaultCreator();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = false;
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector(((com.fasterxml.jackson.databind.BeanDescription)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = 1;
    Object v6 = new java.util.HashMap((((java.lang.Integer)v5).intValue()));
    Object v7 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((java.util.Map)v6));
    Object v8 = ((com.fasterxml.jackson.databind.deser.impl.CreatorCollector)v2).constructValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v7));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = null;
    Object v1 = false;
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector(((com.fasterxml.jackson.databind.BeanDescription)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = ((com.fasterxml.jackson.databind.deser.impl.CreatorCollector)v2).hasDefaultCreator();
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = null;
    Object v1 = false;
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector(((com.fasterxml.jackson.databind.BeanDescription)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = null;
    ((com.fasterxml.jackson.databind.deser.impl.CreatorCollector)v2).setDefaultCreator(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = false;
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector(((com.fasterxml.jackson.databind.BeanDescription)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = null;
    Object v4 = false;
    Object v5 = new com.fasterxml.jackson.databind.deser.CreatorProperty[]{null,null,null};
    ((com.fasterxml.jackson.databind.deser.impl.CreatorCollector)v2).addPropertyCreator(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v3),(((java.lang.Boolean)v4).booleanValue()),((com.fasterxml.jackson.databind.deser.CreatorProperty[])v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = null;
    Object v1 = false;
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector(((com.fasterxml.jackson.databind.BeanDescription)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = null;
    Object v4 = 0;
    Object v5 = false;
    ((com.fasterxml.jackson.databind.deser.impl.CreatorCollector)v2).verifyNonDup(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = null;
    Object v1 = false;
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector(((com.fasterxml.jackson.databind.BeanDescription)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = null;
    Object v4 = true;
    ((com.fasterxml.jackson.databind.deser.impl.CreatorCollector)v2).addDoubleCreator(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v5 = null;
    Object v6 = ((com.fasterxml.jackson.databind.deser.impl.CreatorCollector)v2).hasDefaultCreator();
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = null;
    Object v1 = false;
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector(((com.fasterxml.jackson.databind.BeanDescription)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = null;
    Object v4 = true;
    Object v5 = new com.fasterxml.jackson.databind.deser.CreatorProperty[]{null};
    ((com.fasterxml.jackson.databind.deser.impl.CreatorCollector)v2).addDelegatingCreator(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v3),(((java.lang.Boolean)v4).booleanValue()),((com.fasterxml.jackson.databind.deser.CreatorProperty[])v5));
    Object v6 = null;
    Object v7 = ((com.fasterxml.jackson.databind.deser.impl.CreatorCollector)v2).hasDefaultCreator();
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = false;
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector(((com.fasterxml.jackson.databind.BeanDescription)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = 1;
    Object v6 = new java.util.HashMap((((java.lang.Integer)v5).intValue()));
    Object v7 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((java.util.Map)v6));
    Object v8 = "boolean";
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.findClass(((java.lang.String)v8));
    Object v10 = "boolean";
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findClass(((java.lang.String)v10));
    Object v12 = ((com.fasterxml.jackson.databind.cfg.MapperConfigBase)v7).withAttribute(((java.lang.Object)v9),((java.lang.Object)v11));
    Object v13 = ((com.fasterxml.jackson.databind.deser.impl.CreatorCollector)v2).constructValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v7));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = false;
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector(((com.fasterxml.jackson.databind.BeanDescription)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = 1;
    Object v6 = new java.util.HashMap((((java.lang.Integer)v5).intValue()));
    Object v7 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((java.util.Map)v6));
    Object v8 = "string";
    Object v9 = ((com.fasterxml.jackson.databind.DeserializationConfig)v7).withRootName(((java.lang.String)v8));
    Object v10 = ((com.fasterxml.jackson.databind.deser.impl.CreatorCollector)v2).constructValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v7));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = false;
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector(((com.fasterxml.jackson.databind.BeanDescription)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = 1;
    Object v6 = new java.util.HashMap((((java.lang.Integer)v5).intValue()));
    Object v7 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((java.util.Map)v6));
    Object v8 = "itoems";
    Object v9 = ((com.fasterxml.jackson.databind.cfg.MapperConfig)v7).compileString(((java.lang.String)v8));
    Object v10 = ((com.fasterxml.jackson.databind.deser.impl.CreatorCollector)v2).constructValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v7));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = null;
    Object v1 = false;
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector(((com.fasterxml.jackson.databind.BeanDescription)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = null;
    Object v4 = "boolean";
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.findClass(((java.lang.String)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = 1;
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v3),((java.lang.reflect.Type)v5),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v6),(((java.lang.Integer)v7).intValue()));
    ((com.fasterxml.jackson.databind.deser.impl.CreatorCollector)v2).addIncompeteParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedParameter)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = false;
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector(((com.fasterxml.jackson.databind.BeanDescription)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = null;
    Object v4 = true;
    Object v5 = new com.fasterxml.jackson.databind.deser.CreatorProperty[]{};
    ((com.fasterxml.jackson.databind.deser.impl.CreatorCollector)v2).addPropertyCreator(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v3),(((java.lang.Boolean)v4).booleanValue()),((com.fasterxml.jackson.databind.deser.CreatorProperty[])v5));
    Object v6 = null;
    Object v7 = null;
    Object v8 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v9 = 1;
    Object v10 = new java.util.HashMap((((java.lang.Integer)v9).intValue()));
    Object v11 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v7),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v8),((java.util.Map)v10));
    Object v12 = ((com.fasterxml.jackson.databind.deser.impl.CreatorCollector)v2).constructValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v11));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = null;
    Object v1 = false;
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector(((com.fasterxml.jackson.databind.BeanDescription)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = null;
    Object v4 = "boolean";
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.findClass(((java.lang.String)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = 1;
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v3),((java.lang.reflect.Type)v5),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v6),(((java.lang.Integer)v7).intValue()));
    ((com.fasterxml.jackson.databind.deser.impl.CreatorCollector)v2).addIncompeteParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedParameter)v8));
    Object v9 = null;
    Object v10 = null;
    Object v11 = "boolean";
    Object v12 = com.fasterxml.jackson.databind.util.ClassUtil.findClass(((java.lang.String)v11));
    Object v13 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v14 = 1;
    Object v15 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v10),((java.lang.reflect.Type)v12),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v13),(((java.lang.Integer)v14).intValue()));
    ((com.fasterxml.jackson.databind.deser.impl.CreatorCollector)v2).addIncompeteParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedParameter)v15));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = null;
    Object v1 = false;
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector(((com.fasterxml.jackson.databind.BeanDescription)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = null;
    Object v4 = false;
    Object v5 = new com.fasterxml.jackson.databind.deser.CreatorProperty[]{null};
    ((com.fasterxml.jackson.databind.deser.impl.CreatorCollector)v2).addDelegatingCreator(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v3),(((java.lang.Boolean)v4).booleanValue()),((com.fasterxml.jackson.databind.deser.CreatorProperty[])v5));
    Object v6 = null;
    Object v7 = null;
    Object v8 = "boolean";
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.findClass(((java.lang.String)v8));
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v11 = 1;
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v7),((java.lang.reflect.Type)v9),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v10),(((java.lang.Integer)v11).intValue()));
    ((com.fasterxml.jackson.databind.deser.impl.CreatorCollector)v2).addIncompeteParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedParameter)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = false;
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector(((com.fasterxml.jackson.databind.BeanDescription)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = null;
    ((com.fasterxml.jackson.databind.deser.impl.CreatorCollector)v2).addStringCreator(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v3));
    Object v4 = null;
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v7 = 1;
    Object v8 = new java.util.HashMap((((java.lang.Integer)v7).intValue()));
    Object v9 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v5),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v6),((java.util.Map)v8));
    Object v10 = ((com.fasterxml.jackson.databind.deser.impl.CreatorCollector)v2).constructValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v9));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = false;
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector(((com.fasterxml.jackson.databind.BeanDescription)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = 1;
    Object v6 = new java.util.HashMap((((java.lang.Integer)v5).intValue()));
    Object v7 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((java.util.Map)v6));
    Object v8 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS;
    Object v9 = ((com.fasterxml.jackson.databind.DeserializationConfig)v7).without(((com.fasterxml.jackson.core.JsonParser.Feature)v8));
    Object v10 = ((com.fasterxml.jackson.databind.deser.impl.CreatorCollector)v2).constructValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v7));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = null;
    Object v1 = false;
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector(((com.fasterxml.jackson.databind.BeanDescription)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = null;
    Object v4 = "boolean";
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.findClass(((java.lang.String)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = 1;
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v3),((java.lang.reflect.Type)v5),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v6),(((java.lang.Integer)v7).intValue()));
    ((com.fasterxml.jackson.databind.deser.impl.CreatorCollector)v2).addIncompeteParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedParameter)v8));
    Object v9 = null;
    Object v10 = ((com.fasterxml.jackson.databind.deser.impl.CreatorCollector)v2).hasDefaultCreator();
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = null;
    Object v1 = false;
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector(((com.fasterxml.jackson.databind.BeanDescription)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = null;
    Object v4 = "boolean";
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.findClass(((java.lang.String)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = 1;
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v3),((java.lang.reflect.Type)v5),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = ((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v8).annotations();
    ((com.fasterxml.jackson.databind.deser.impl.CreatorCollector)v2).addIncompeteParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedParameter)v8));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = false;
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector(((com.fasterxml.jackson.databind.BeanDescription)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = null;
    Object v4 = "boolean";
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.findClass(((java.lang.String)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = 1;
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v3),((java.lang.reflect.Type)v5),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v6),(((java.lang.Integer)v7).intValue()));
    ((com.fasterxml.jackson.databind.deser.impl.CreatorCollector)v2).addIncompeteParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedParameter)v8));
    Object v9 = null;
    Object v10 = null;
    Object v11 = 10;
    Object v12 = false;
    ((com.fasterxml.jackson.databind.deser.impl.CreatorCollector)v2).verifyNonDup(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v10),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = null;
    Object v1 = false;
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector(((com.fasterxml.jackson.databind.BeanDescription)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = null;
    Object v4 = "boolean";
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.findClass(((java.lang.String)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = 1;
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v3),((java.lang.reflect.Type)v5),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v6),(((java.lang.Integer)v7).intValue()));
    ((com.fasterxml.jackson.databind.deser.impl.CreatorCollector)v2).addIncompeteParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedParameter)v8));
    Object v9 = null;
    Object v10 = null;
    Object v11 = true;
    Object v12 = new com.fasterxml.jackson.databind.deser.CreatorProperty[]{};
    ((com.fasterxml.jackson.databind.deser.impl.CreatorCollector)v2).addPropertyCreator(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v10),(((java.lang.Boolean)v11).booleanValue()),((com.fasterxml.jackson.databind.deser.CreatorProperty[])v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = false;
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector(((com.fasterxml.jackson.databind.BeanDescription)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = null;
    Object v4 = "boolean";
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.findClass(((java.lang.String)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = 1;
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v3),((java.lang.reflect.Type)v5),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v6),(((java.lang.Integer)v7).intValue()));
    ((com.fasterxml.jackson.databind.deser.impl.CreatorCollector)v2).addIncompeteParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedParameter)v8));
    Object v9 = null;
    Object v10 = null;
    Object v11 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v12 = 1;
    Object v13 = new java.util.HashMap((((java.lang.Integer)v12).intValue()));
    Object v14 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v10),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v11),((java.util.Map)v13));
    Object v15 = ((com.fasterxml.jackson.databind.deser.impl.CreatorCollector)v2).constructValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v14));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = null;
    Object v1 = false;
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector(((com.fasterxml.jackson.databind.BeanDescription)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = null;
    ((com.fasterxml.jackson.databind.deser.impl.CreatorCollector)v2).addBooleanCreator(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v3));
    Object v4 = null;
    Object v5 = ((com.fasterxml.jackson.databind.deser.impl.CreatorCollector)v2).hasDefaultCreator();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = null;
    Object v1 = false;
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector(((com.fasterxml.jackson.databind.BeanDescription)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = null;
    Object v4 = false;
    Object v5 = new com.fasterxml.jackson.databind.deser.CreatorProperty[]{};
    ((com.fasterxml.jackson.databind.deser.impl.CreatorCollector)v2).addDelegatingCreator(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v3),(((java.lang.Boolean)v4).booleanValue()),((com.fasterxml.jackson.databind.deser.CreatorProperty[])v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = null;
    Object v1 = false;
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector(((com.fasterxml.jackson.databind.BeanDescription)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = null;
    Object v4 = false;
    ((com.fasterxml.jackson.databind.deser.impl.CreatorCollector)v2).addIntCreator(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = false;
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector(((com.fasterxml.jackson.databind.BeanDescription)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = 1;
    Object v6 = new java.util.HashMap((((java.lang.Integer)v5).intValue()));
    Object v7 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((java.util.Map)v6));
    Object v8 = com.fasterxml.jackson.databind.DeserializationFeature.WRAP_EXCEPTIONS;
    Object v9 = new com.fasterxml.jackson.databind.DeserializationFeature[]{};
    Object v10 = ((com.fasterxml.jackson.databind.DeserializationConfig)v7).with(((com.fasterxml.jackson.databind.DeserializationFeature)v8),((com.fasterxml.jackson.databind.DeserializationFeature[])v9));
    Object v11 = ((com.fasterxml.jackson.databind.deser.impl.CreatorCollector)v2).constructValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v7));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = null;
    Object v1 = false;
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector(((com.fasterxml.jackson.databind.BeanDescription)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = null;
    Object v4 = true;
    Object v5 = new com.fasterxml.jackson.databind.deser.CreatorProperty[]{null,null,null};
    ((com.fasterxml.jackson.databind.deser.impl.CreatorCollector)v2).addDelegatingCreator(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v3),(((java.lang.Boolean)v4).booleanValue()),((com.fasterxml.jackson.databind.deser.CreatorProperty[])v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = false;
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector(((com.fasterxml.jackson.databind.BeanDescription)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = null;
    Object v4 = 74;
    Object v5 = true;
    ((com.fasterxml.jackson.databind.deser.impl.CreatorCollector)v2).verifyNonDup(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = false;
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector(((com.fasterxml.jackson.databind.BeanDescription)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = null;
    Object v4 = "boolean";
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.findClass(((java.lang.String)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = 1;
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v3),((java.lang.reflect.Type)v5),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v6),(((java.lang.Integer)v7).intValue()));
    ((com.fasterxml.jackson.databind.deser.impl.CreatorCollector)v2).addIncompeteParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedParameter)v8));
    Object v9 = null;
    Object v10 = null;
    Object v11 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v12 = 1;
    Object v13 = new java.util.HashMap((((java.lang.Integer)v12).intValue()));
    Object v14 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v10),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v11),((java.util.Map)v13));
    Object v15 = ((com.fasterxml.jackson.databind.cfg.MapperConfigBase)v14).mixInCount();
    Object v16 = ((com.fasterxml.jackson.databind.deser.impl.CreatorCollector)v2).constructValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v14));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = false;
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector(((com.fasterxml.jackson.databind.BeanDescription)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = 1;
    Object v6 = new java.util.HashMap((((java.lang.Integer)v5).intValue()));
    Object v7 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((java.util.Map)v6));
    Object v8 = ((com.fasterxml.jackson.databind.DeserializationConfig)v7).withNoProblemHandlers();
    Object v9 = ((com.fasterxml.jackson.databind.deser.impl.CreatorCollector)v2).constructValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v7));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = null;
    Object v1 = false;
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector(((com.fasterxml.jackson.databind.BeanDescription)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = null;
    Object v4 = true;
    ((com.fasterxml.jackson.databind.deser.impl.CreatorCollector)v2).addLongCreator(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = null;
    Object v1 = false;
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector(((com.fasterxml.jackson.databind.BeanDescription)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = null;
    Object v4 = "boolean";
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.findClass(((java.lang.String)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = 1;
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v3),((java.lang.reflect.Type)v5),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v10 = ((com.fasterxml.jackson.databind.introspect.AnnotatedParameter)v8).equals(((java.lang.Object)v9));
    ((com.fasterxml.jackson.databind.deser.impl.CreatorCollector)v2).addIncompeteParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedParameter)v8));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = false;
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector(((com.fasterxml.jackson.databind.BeanDescription)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = 1;
    Object v6 = new java.util.HashMap((((java.lang.Integer)v5).intValue()));
    Object v7 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((java.util.Map)v6));
    Object v8 = "boolean";
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.findClass(((java.lang.String)v8));
    Object v10 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v11 = ((com.fasterxml.jackson.databind.cfg.MapperConfigBase)v7).withAttribute(((java.lang.Object)v9),((java.lang.Object)v10));
    Object v12 = ((com.fasterxml.jackson.databind.deser.impl.CreatorCollector)v2).constructValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v7));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = null;
    Object v1 = false;
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector(((com.fasterxml.jackson.databind.BeanDescription)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = null;
    ((com.fasterxml.jackson.databind.deser.impl.CreatorCollector)v2).addStringCreator(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = false;
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector(((com.fasterxml.jackson.databind.BeanDescription)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = null;
    Object v4 = "boolean";
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.findClass(((java.lang.String)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = 1;
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v3),((java.lang.reflect.Type)v5),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v6),(((java.lang.Integer)v7).intValue()));
    ((com.fasterxml.jackson.databind.deser.impl.CreatorCollector)v2).addIncompeteParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedParameter)v8));
    Object v9 = null;
    Object v10 = null;
    Object v11 = true;
    Object v12 = new com.fasterxml.jackson.databind.deser.CreatorProperty[]{null,null};
    ((com.fasterxml.jackson.databind.deser.impl.CreatorCollector)v2).addPropertyCreator(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v10),(((java.lang.Boolean)v11).booleanValue()),((com.fasterxml.jackson.databind.deser.CreatorProperty[])v12));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = null;
    Object v1 = false;
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector(((com.fasterxml.jackson.databind.BeanDescription)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = null;
    ((com.fasterxml.jackson.databind.deser.impl.CreatorCollector)v2).addBooleanCreator(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = false;
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector(((com.fasterxml.jackson.databind.BeanDescription)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = 1;
    Object v6 = new java.util.HashMap((((java.lang.Integer)v5).intValue()));
    Object v7 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((java.util.Map)v6));
    Object v8 = null;
    Object v9 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v10 = 1;
    Object v11 = new java.util.HashMap((((java.lang.Integer)v10).intValue()));
    Object v12 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v8),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v9),((java.util.Map)v11));
    Object v13 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v14 = ((com.fasterxml.jackson.databind.cfg.MapperConfigBase)v7).withAttribute(((java.lang.Object)v12),((java.lang.Object)v13));
    Object v15 = ((com.fasterxml.jackson.databind.deser.impl.CreatorCollector)v2).constructValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v7));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = null;
    Object v1 = false;
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector(((com.fasterxml.jackson.databind.BeanDescription)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = null;
    Object v4 = "boolean";
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.findClass(((java.lang.String)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = 1;
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v3),((java.lang.reflect.Type)v5),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v6),(((java.lang.Integer)v7).intValue()));
    ((com.fasterxml.jackson.databind.deser.impl.CreatorCollector)v2).addIncompeteParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedParameter)v8));
    Object v9 = null;
    Object v10 = null;
    Object v11 = "boolean";
    Object v12 = com.fasterxml.jackson.databind.util.ClassUtil.findClass(((java.lang.String)v11));
    Object v13 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v14 = 1;
    Object v15 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v10),((java.lang.reflect.Type)v12),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v13),(((java.lang.Integer)v14).intValue()));
    Object v16 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v17 = ((com.fasterxml.jackson.databind.introspect.AnnotatedParameter)v15).equals(((java.lang.Object)v16));
    ((com.fasterxml.jackson.databind.deser.impl.CreatorCollector)v2).addIncompeteParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedParameter)v15));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = null;
    Object v1 = false;
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector(((com.fasterxml.jackson.databind.BeanDescription)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.deser.CreatorProperty[]{null};
    ((com.fasterxml.jackson.databind.deser.impl.CreatorCollector)v2).addDelegatingCreator(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v3),((com.fasterxml.jackson.databind.deser.CreatorProperty[])v4));
    Object v5 = null;
    Object v6 = ((com.fasterxml.jackson.databind.deser.impl.CreatorCollector)v2).hasDefaultCreator();
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = null;
    Object v1 = false;
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector(((com.fasterxml.jackson.databind.BeanDescription)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = null;
    Object v4 = true;
    Object v5 = new com.fasterxml.jackson.databind.deser.CreatorProperty[]{null};
    ((com.fasterxml.jackson.databind.deser.impl.CreatorCollector)v2).addDelegatingCreator(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v3),(((java.lang.Boolean)v4).booleanValue()),((com.fasterxml.jackson.databind.deser.CreatorProperty[])v5));
    Object v6 = null;
    Object v7 = null;
    Object v8 = true;
    Object v9 = new com.fasterxml.jackson.databind.deser.CreatorProperty[]{null,null};
    ((com.fasterxml.jackson.databind.deser.impl.CreatorCollector)v2).addDelegatingCreator(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v7),(((java.lang.Boolean)v8).booleanValue()),((com.fasterxml.jackson.databind.deser.CreatorProperty[])v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = null;
    Object v1 = false;
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector(((com.fasterxml.jackson.databind.BeanDescription)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = null;
    Object v4 = "boolean";
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.findClass(((java.lang.String)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = 1;
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v3),((java.lang.reflect.Type)v5),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = "boolean";
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findClass(((java.lang.String)v9));
    Object v11 = ((com.fasterxml.jackson.databind.introspect.Annotated)v8).hasAnnotation(((java.lang.Class)v10));
    ((com.fasterxml.jackson.databind.deser.impl.CreatorCollector)v2).addIncompeteParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedParameter)v8));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = null;
    Object v1 = false;
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector(((com.fasterxml.jackson.databind.BeanDescription)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = null;
    Object v4 = "boolean";
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.findClass(((java.lang.String)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = 1;
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v3),((java.lang.reflect.Type)v5),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = ((com.fasterxml.jackson.databind.introspect.AnnotatedParameter)v8).getRawType();
    ((com.fasterxml.jackson.databind.deser.impl.CreatorCollector)v2).addIncompeteParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedParameter)v8));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = false;
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector(((com.fasterxml.jackson.databind.BeanDescription)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = 1;
    Object v6 = new java.util.HashMap((((java.lang.Integer)v5).intValue()));
    Object v7 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((java.util.Map)v6));
    Object v8 = " for format ";
    Object v9 = ((com.fasterxml.jackson.databind.DeserializationConfig)v7).withRootName(((java.lang.String)v8));
    Object v10 = ((com.fasterxml.jackson.databind.deser.impl.CreatorCollector)v2).constructValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v7));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = null;
    Object v1 = false;
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector(((com.fasterxml.jackson.databind.BeanDescription)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = null;
    ((com.fasterxml.jackson.databind.deser.impl.CreatorCollector)v2).addBooleanCreator(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v3));
    Object v4 = null;
    Object v5 = null;
    Object v6 = "boolean";
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findClass(((java.lang.String)v6));
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = 1;
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v5),((java.lang.reflect.Type)v7),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8),(((java.lang.Integer)v9).intValue()));
    ((com.fasterxml.jackson.databind.deser.impl.CreatorCollector)v2).addIncompeteParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedParameter)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = null;
    Object v1 = false;
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector(((com.fasterxml.jackson.databind.BeanDescription)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = null;
    ((com.fasterxml.jackson.databind.deser.impl.CreatorCollector)v2).addDoubleCreator(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v3));
    Object v4 = null;
    Object v5 = ((com.fasterxml.jackson.databind.deser.impl.CreatorCollector)v2).hasDefaultCreator();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = null;
    Object v1 = false;
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector(((com.fasterxml.jackson.databind.BeanDescription)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = null;
    Object v4 = false;
    Object v5 = new com.fasterxml.jackson.databind.deser.CreatorProperty[]{null,null,null};
    ((com.fasterxml.jackson.databind.deser.impl.CreatorCollector)v2).addDelegatingCreator(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v3),(((java.lang.Boolean)v4).booleanValue()),((com.fasterxml.jackson.databind.deser.CreatorProperty[])v5));
    Object v6 = null;
    Object v7 = ((com.fasterxml.jackson.databind.deser.impl.CreatorCollector)v2).hasDefaultCreator();
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = false;
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector(((com.fasterxml.jackson.databind.BeanDescription)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = null;
    Object v4 = "boolean";
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.findClass(((java.lang.String)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = 1;
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v3),((java.lang.reflect.Type)v5),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v6),(((java.lang.Integer)v7).intValue()));
    ((com.fasterxml.jackson.databind.deser.impl.CreatorCollector)v2).addIncompeteParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedParameter)v8));
    Object v9 = null;
    Object v10 = null;
    Object v11 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v12 = 1;
    Object v13 = new java.util.HashMap((((java.lang.Integer)v12).intValue()));
    Object v14 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v10),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v11),((java.util.Map)v13));
    Object v15 = ":P";
    Object v16 = ((com.fasterxml.jackson.databind.cfg.MapperConfig)v14).compileString(((java.lang.String)v15));
    Object v17 = ((com.fasterxml.jackson.databind.deser.impl.CreatorCollector)v2).constructValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v14));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = false;
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector(((com.fasterxml.jackson.databind.BeanDescription)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = null;
    Object v4 = true;
    Object v5 = new com.fasterxml.jackson.databind.deser.CreatorProperty[]{null,null,null};
    ((com.fasterxml.jackson.databind.deser.impl.CreatorCollector)v2).addPropertyCreator(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v3),(((java.lang.Boolean)v4).booleanValue()),((com.fasterxml.jackson.databind.deser.CreatorProperty[])v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = false;
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector(((com.fasterxml.jackson.databind.BeanDescription)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = 1;
    Object v6 = new java.util.HashMap((((java.lang.Integer)v5).intValue()));
    Object v7 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((java.util.Map)v6));
    Object v8 = com.fasterxml.jackson.core.JsonParser.Feature.STRICT_DUPLICATE_DETECTION;
    Object v9 = ((com.fasterxml.jackson.databind.DeserializationConfig)v7).with(((com.fasterxml.jackson.core.JsonParser.Feature)v8));
    Object v10 = ((com.fasterxml.jackson.databind.deser.impl.CreatorCollector)v2).constructValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v7));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = false;
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector(((com.fasterxml.jackson.databind.BeanDescription)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = null;
    Object v4 = false;
    ((com.fasterxml.jackson.databind.deser.impl.CreatorCollector)v2).addStringCreator(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v5 = null;
    Object v6 = null;
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v8 = 1;
    Object v9 = new java.util.HashMap((((java.lang.Integer)v8).intValue()));
    Object v10 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v6),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v7),((java.util.Map)v9));
    Object v11 = ((com.fasterxml.jackson.databind.deser.impl.CreatorCollector)v2).constructValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v10));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = null;
    Object v1 = false;
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector(((com.fasterxml.jackson.databind.BeanDescription)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = null;
    ((com.fasterxml.jackson.databind.deser.impl.CreatorCollector)v2).addIntCreator(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v3));
    Object v4 = null;
    Object v5 = ((com.fasterxml.jackson.databind.deser.impl.CreatorCollector)v2).hasDefaultCreator();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = null;
    Object v1 = false;
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector(((com.fasterxml.jackson.databind.BeanDescription)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = null;
    ((com.fasterxml.jackson.databind.deser.impl.CreatorCollector)v2).addDoubleCreator(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = null;
    Object v1 = false;
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector(((com.fasterxml.jackson.databind.BeanDescription)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = null;
    ((com.fasterxml.jackson.databind.deser.impl.CreatorCollector)v2).addLongCreator(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v3));
    Object v4 = null;
    Object v5 = ((com.fasterxml.jackson.databind.deser.impl.CreatorCollector)v2).hasDefaultCreator();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = null;
    Object v1 = false;
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector(((com.fasterxml.jackson.databind.BeanDescription)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = null;
    Object v4 = false;
    ((com.fasterxml.jackson.databind.deser.impl.CreatorCollector)v2).addDoubleCreator(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v5 = null;
    Object v6 = ((com.fasterxml.jackson.databind.deser.impl.CreatorCollector)v2).hasDefaultCreator();
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = null;
    Object v1 = false;
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector(((com.fasterxml.jackson.databind.BeanDescription)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.deser.CreatorProperty[]{};
    ((com.fasterxml.jackson.databind.deser.impl.CreatorCollector)v2).addDelegatingCreator(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v3),((com.fasterxml.jackson.databind.deser.CreatorProperty[])v4));
    Object v5 = null;
    Object v6 = ((com.fasterxml.jackson.databind.deser.impl.CreatorCollector)v2).hasDefaultCreator();
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = false;
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector(((com.fasterxml.jackson.databind.BeanDescription)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = 1;
    Object v6 = new java.util.HashMap((((java.lang.Integer)v5).intValue()));
    Object v7 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((java.util.Map)v6));
    Object v8 = com.fasterxml.jackson.databind.cfg.ContextAttributes.Impl.getEmpty();
    Object v9 = ((com.fasterxml.jackson.databind.DeserializationConfig)v7).with(((com.fasterxml.jackson.databind.cfg.ContextAttributes)v8));
    Object v10 = ((com.fasterxml.jackson.databind.deser.impl.CreatorCollector)v2).constructValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v7));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = false;
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector(((com.fasterxml.jackson.databind.BeanDescription)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = 1;
    Object v6 = new java.util.HashMap((((java.lang.Integer)v5).intValue()));
    Object v7 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((java.util.Map)v6));
    Object v8 = 1;
    Object v9 = new java.util.HashMap((((java.lang.Integer)v8).intValue()));
    Object v10 = ((com.fasterxml.jackson.databind.cfg.MapperConfigBase)v7).withAttributes(((java.util.Map)v9));
    Object v11 = ((com.fasterxml.jackson.databind.deser.impl.CreatorCollector)v2).constructValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v7));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = null;
    Object v1 = false;
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector(((com.fasterxml.jackson.databind.BeanDescription)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = null;
    ((com.fasterxml.jackson.databind.deser.impl.CreatorCollector)v2).setDefaultCreator(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v3));
    Object v4 = null;
    Object v5 = ((com.fasterxml.jackson.databind.deser.impl.CreatorCollector)v2).hasDefaultCreator();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = false;
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector(((com.fasterxml.jackson.databind.BeanDescription)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = null;
    Object v4 = false;
    ((com.fasterxml.jackson.databind.deser.impl.CreatorCollector)v2).addDoubleCreator(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v5 = null;
    Object v6 = null;
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v8 = 1;
    Object v9 = new java.util.HashMap((((java.lang.Integer)v8).intValue()));
    Object v10 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v6),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v7),((java.util.Map)v9));
    Object v11 = ((com.fasterxml.jackson.databind.deser.impl.CreatorCollector)v2).constructValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v10));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = false;
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector(((com.fasterxml.jackson.databind.BeanDescription)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = 1;
    Object v6 = new java.util.HashMap((((java.lang.Integer)v5).intValue()));
    Object v7 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((java.util.Map)v6));
    Object v8 = com.fasterxml.jackson.databind.DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS;
    Object v9 = ((com.fasterxml.jackson.databind.DeserializationConfig)v7).without(((com.fasterxml.jackson.databind.DeserializationFeature)v8));
    Object v10 = ((com.fasterxml.jackson.databind.deser.impl.CreatorCollector)v2).constructValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v7));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = null;
    Object v1 = false;
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector(((com.fasterxml.jackson.databind.BeanDescription)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = null;
    Object v4 = "boolean";
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.findClass(((java.lang.String)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = 1;
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v3),((java.lang.reflect.Type)v5),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = "boolean";
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findClass(((java.lang.String)v9));
    Object v11 = ((com.fasterxml.jackson.databind.introspect.AnnotatedParameter)v8).getAnnotation(((java.lang.Class)v10));
    ((com.fasterxml.jackson.databind.deser.impl.CreatorCollector)v2).addIncompeteParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedParameter)v8));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = false;
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector(((com.fasterxml.jackson.databind.BeanDescription)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = null;
    ((com.fasterxml.jackson.databind.deser.impl.CreatorCollector)v2).setDefaultCreator(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v3));
    Object v4 = null;
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v7 = 1;
    Object v8 = new java.util.HashMap((((java.lang.Integer)v7).intValue()));
    Object v9 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v5),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v6),((java.util.Map)v8));
    Object v10 = ((com.fasterxml.jackson.databind.deser.impl.CreatorCollector)v2).constructValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v9));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = null;
    Object v1 = false;
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector(((com.fasterxml.jackson.databind.BeanDescription)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = null;
    ((com.fasterxml.jackson.databind.deser.impl.CreatorCollector)v2).addIntCreator(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = false;
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector(((com.fasterxml.jackson.databind.BeanDescription)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = 1;
    Object v6 = new java.util.HashMap((((java.lang.Integer)v5).intValue()));
    Object v7 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((java.util.Map)v6));
    Object v8 = com.fasterxml.jackson.databind.MapperFeature.CAN_OVERRIDE_ACCESS_MODIFIERS;
    Object v9 = false;
    Object v10 = ((com.fasterxml.jackson.databind.DeserializationConfig)v7).with(((com.fasterxml.jackson.databind.MapperFeature)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = ((com.fasterxml.jackson.databind.deser.impl.CreatorCollector)v2).constructValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v7));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = false;
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector(((com.fasterxml.jackson.databind.BeanDescription)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = 1;
    Object v6 = new java.util.HashMap((((java.lang.Integer)v5).intValue()));
    Object v7 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((java.util.Map)v6));
    Object v8 = false;
    Object v9 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v8).booleanValue()));
    Object v10 = ((com.fasterxml.jackson.databind.DeserializationConfig)v7).with(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v9));
    Object v11 = ((com.fasterxml.jackson.databind.deser.impl.CreatorCollector)v2).constructValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v7));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = null;
    Object v1 = false;
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector(((com.fasterxml.jackson.databind.BeanDescription)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = null;
    Object v4 = true;
    ((com.fasterxml.jackson.databind.deser.impl.CreatorCollector)v2).addStringCreator(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v5 = null;
    Object v6 = ((com.fasterxml.jackson.databind.deser.impl.CreatorCollector)v2).hasDefaultCreator();
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = null;
    Object v1 = false;
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector(((com.fasterxml.jackson.databind.BeanDescription)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = null;
    Object v4 = "boolean";
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.findClass(((java.lang.String)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = 1;
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v3),((java.lang.reflect.Type)v5),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v6),(((java.lang.Integer)v7).intValue()));
    ((com.fasterxml.jackson.databind.deser.impl.CreatorCollector)v2).addIncompeteParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedParameter)v8));
    Object v9 = null;
    Object v10 = null;
    Object v11 = "boolean";
    Object v12 = com.fasterxml.jackson.databind.util.ClassUtil.findClass(((java.lang.String)v11));
    Object v13 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v14 = 1;
    Object v15 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v10),((java.lang.reflect.Type)v12),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v13),(((java.lang.Integer)v14).intValue()));
    Object v16 = ((com.fasterxml.jackson.databind.introspect.AnnotatedParameter)v15).getRawType();
    ((com.fasterxml.jackson.databind.deser.impl.CreatorCollector)v2).addIncompeteParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedParameter)v15));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector(((com.fasterxml.jackson.databind.BeanDescription)v0),(((java.lang.Boolean)v1).booleanValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector(((com.fasterxml.jackson.databind.BeanDescription)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = null;
    Object v4 = "boolean";
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.findClass(((java.lang.String)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = 1;
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v3),((java.lang.reflect.Type)v5),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v6),(((java.lang.Integer)v7).intValue()));
    ((com.fasterxml.jackson.databind.deser.impl.CreatorCollector)v2).addIncompeteParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedParameter)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector(((com.fasterxml.jackson.databind.BeanDescription)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = ((com.fasterxml.jackson.databind.deser.impl.CreatorCollector)v2).hasDefaultCreator();
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector(((com.fasterxml.jackson.databind.BeanDescription)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = 1;
    Object v6 = new java.util.HashMap((((java.lang.Integer)v5).intValue()));
    Object v7 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((java.util.Map)v6));
    Object v8 = ((com.fasterxml.jackson.databind.deser.impl.CreatorCollector)v2).constructValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v7));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector(((com.fasterxml.jackson.databind.BeanDescription)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = null;
    Object v4 = "boolean";
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.findClass(((java.lang.String)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = 1;
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v3),((java.lang.reflect.Type)v5),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v6),(((java.lang.Integer)v7).intValue()));
    ((com.fasterxml.jackson.databind.deser.impl.CreatorCollector)v2).addIncompeteParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedParameter)v8));
    Object v9 = null;
    Object v10 = null;
    Object v11 = "boolean";
    Object v12 = com.fasterxml.jackson.databind.util.ClassUtil.findClass(((java.lang.String)v11));
    Object v13 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v14 = 1;
    Object v15 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v10),((java.lang.reflect.Type)v12),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v13),(((java.lang.Integer)v14).intValue()));
    ((com.fasterxml.jackson.databind.deser.impl.CreatorCollector)v2).addIncompeteParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedParameter)v15));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector(((com.fasterxml.jackson.databind.BeanDescription)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = null;
    Object v4 = "boolean";
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.findClass(((java.lang.String)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = 1;
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v3),((java.lang.reflect.Type)v5),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v6),(((java.lang.Integer)v7).intValue()));
    ((com.fasterxml.jackson.databind.deser.impl.CreatorCollector)v2).addIncompeteParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedParameter)v8));
    Object v9 = null;
    Object v10 = ((com.fasterxml.jackson.databind.deser.impl.CreatorCollector)v2).hasDefaultCreator();
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector(((com.fasterxml.jackson.databind.BeanDescription)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = null;
    Object v4 = "boolean";
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.findClass(((java.lang.String)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = 1;
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v3),((java.lang.reflect.Type)v5),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v6),(((java.lang.Integer)v7).intValue()));
    ((com.fasterxml.jackson.databind.deser.impl.CreatorCollector)v2).addIncompeteParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedParameter)v8));
    Object v9 = null;
    Object v10 = null;
    Object v11 = "boolean";
    Object v12 = com.fasterxml.jackson.databind.util.ClassUtil.findClass(((java.lang.String)v11));
    Object v13 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v14 = 1;
    Object v15 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v10),((java.lang.reflect.Type)v12),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v13),(((java.lang.Integer)v14).intValue()));
    Object v16 = "boolean";
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.findClass(((java.lang.String)v16));
    Object v18 = ((com.fasterxml.jackson.databind.introspect.AnnotatedParameter)v15).getAnnotation(((java.lang.Class)v17));
    ((com.fasterxml.jackson.databind.deser.impl.CreatorCollector)v2).addIncompeteParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedParameter)v15));
    Object v19 = null;
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector(((com.fasterxml.jackson.databind.BeanDescription)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = null;
    Object v4 = "boolean";
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.findClass(((java.lang.String)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = 1;
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v3),((java.lang.reflect.Type)v5),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = "boolean";
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findClass(((java.lang.String)v9));
    Object v11 = ((com.fasterxml.jackson.databind.introspect.AnnotatedParameter)v8).getAnnotation(((java.lang.Class)v10));
    ((com.fasterxml.jackson.databind.deser.impl.CreatorCollector)v2).addIncompeteParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedParameter)v8));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector(((com.fasterxml.jackson.databind.BeanDescription)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = 1;
    Object v6 = new java.util.HashMap((((java.lang.Integer)v5).intValue()));
    Object v7 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((java.util.Map)v6));
    Object v8 = false;
    Object v9 = new com.fasterxml.jackson.databind.node.JsonNodeFactory((((java.lang.Boolean)v8).booleanValue()));
    Object v10 = ((com.fasterxml.jackson.databind.DeserializationConfig)v7).with(((com.fasterxml.jackson.databind.node.JsonNodeFactory)v9));
    Object v11 = ((com.fasterxml.jackson.databind.deser.impl.CreatorCollector)v2).constructValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v7));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector(((com.fasterxml.jackson.databind.BeanDescription)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = null;
    Object v4 = "boolean";
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.findClass(((java.lang.String)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = 1;
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v3),((java.lang.reflect.Type)v5),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v6),(((java.lang.Integer)v7).intValue()));
    ((com.fasterxml.jackson.databind.deser.impl.CreatorCollector)v2).addIncompeteParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedParameter)v8));
    Object v9 = null;
    Object v10 = null;
    Object v11 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v12 = 1;
    Object v13 = new java.util.HashMap((((java.lang.Integer)v12).intValue()));
    Object v14 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v10),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v11),((java.util.Map)v13));
    Object v15 = ((com.fasterxml.jackson.databind.deser.impl.CreatorCollector)v2).constructValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v14));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector(((com.fasterxml.jackson.databind.BeanDescription)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = null;
    ((com.fasterxml.jackson.databind.deser.impl.CreatorCollector)v2).addStringCreator(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v3));
    Object v4 = null;
    Object v5 = null;
    Object v6 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v7 = 1;
    Object v8 = new java.util.HashMap((((java.lang.Integer)v7).intValue()));
    Object v9 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v5),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v6),((java.util.Map)v8));
    Object v10 = ((com.fasterxml.jackson.databind.DeserializationConfig)v9).withNoProblemHandlers();
    Object v11 = ((com.fasterxml.jackson.databind.deser.impl.CreatorCollector)v2).constructValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v9));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector(((com.fasterxml.jackson.databind.BeanDescription)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = 1;
    Object v6 = new java.util.HashMap((((java.lang.Integer)v5).intValue()));
    Object v7 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((java.util.Map)v6));
    Object v8 = "u";
    Object v9 = ((com.fasterxml.jackson.databind.DeserializationConfig)v7).withRootName(((java.lang.String)v8));
    Object v10 = ((com.fasterxml.jackson.databind.deser.impl.CreatorCollector)v2).constructValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v7));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector(((com.fasterxml.jackson.databind.BeanDescription)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = null;
    Object v4 = false;
    ((com.fasterxml.jackson.databind.deser.impl.CreatorCollector)v2).addStringCreator(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v5 = null;
    Object v6 = ((com.fasterxml.jackson.databind.deser.impl.CreatorCollector)v2).hasDefaultCreator();
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector(((com.fasterxml.jackson.databind.BeanDescription)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = null;
    Object v4 = false;
    ((com.fasterxml.jackson.databind.deser.impl.CreatorCollector)v2).addBooleanCreator(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v5 = null;
    Object v6 = null;
    Object v7 = 63;
    Object v8 = true;
    ((com.fasterxml.jackson.databind.deser.impl.CreatorCollector)v2).verifyNonDup(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Boolean)v8).booleanValue()));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector(((com.fasterxml.jackson.databind.BeanDescription)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = null;
    Object v4 = "boolean";
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.findClass(((java.lang.String)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = 1;
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v3),((java.lang.reflect.Type)v5),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = ((com.fasterxml.jackson.databind.introspect.AnnotatedParameter)v8).toString();
    ((com.fasterxml.jackson.databind.deser.impl.CreatorCollector)v2).addIncompeteParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedParameter)v8));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector(((com.fasterxml.jackson.databind.BeanDescription)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = null;
    Object v4 = false;
    ((com.fasterxml.jackson.databind.deser.impl.CreatorCollector)v2).addIntCreator(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v5 = null;
    Object v6 = null;
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v8 = 1;
    Object v9 = new java.util.HashMap((((java.lang.Integer)v8).intValue()));
    Object v10 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v6),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v7),((java.util.Map)v9));
    Object v11 = ((com.fasterxml.jackson.databind.deser.impl.CreatorCollector)v2).constructValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v10));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector(((com.fasterxml.jackson.databind.BeanDescription)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = null;
    Object v4 = true;
    Object v5 = new com.fasterxml.jackson.databind.deser.CreatorProperty[]{null};
    ((com.fasterxml.jackson.databind.deser.impl.CreatorCollector)v2).addPropertyCreator(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v3),(((java.lang.Boolean)v4).booleanValue()),((com.fasterxml.jackson.databind.deser.CreatorProperty[])v5));
    Object v6 = null;
    Object v7 = null;
    Object v8 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v9 = 1;
    Object v10 = new java.util.HashMap((((java.lang.Integer)v9).intValue()));
    Object v11 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v7),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v8),((java.util.Map)v10));
    Object v12 = "boolean";
    Object v13 = com.fasterxml.jackson.databind.util.ClassUtil.findClass(((java.lang.String)v12));
    Object v14 = ((com.fasterxml.jackson.databind.DeserializationConfig)v11).withView(((java.lang.Class)v13));
    Object v15 = ((com.fasterxml.jackson.databind.deser.impl.CreatorCollector)v2).constructValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v11));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector(((com.fasterxml.jackson.databind.BeanDescription)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = 1;
    Object v6 = new java.util.HashMap((((java.lang.Integer)v5).intValue()));
    Object v7 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((java.util.Map)v6));
    Object v8 = com.fasterxml.jackson.databind.DeserializationFeature.UNWRAP_ROOT_VALUE;
    Object v9 = new com.fasterxml.jackson.databind.DeserializationFeature[]{};
    Object v10 = ((com.fasterxml.jackson.databind.DeserializationConfig)v7).with(((com.fasterxml.jackson.databind.DeserializationFeature)v8),((com.fasterxml.jackson.databind.DeserializationFeature[])v9));
    Object v11 = ((com.fasterxml.jackson.databind.deser.impl.CreatorCollector)v2).constructValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v7));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector(((com.fasterxml.jackson.databind.BeanDescription)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = 1;
    Object v6 = new java.util.HashMap((((java.lang.Integer)v5).intValue()));
    Object v7 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((java.util.Map)v6));
    Object v8 = "boolean";
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.findClass(((java.lang.String)v8));
    Object v10 = ((com.fasterxml.jackson.databind.DeserializationConfig)v7).withView(((java.lang.Class)v9));
    Object v11 = ((com.fasterxml.jackson.databind.deser.impl.CreatorCollector)v2).constructValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v7));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector(((com.fasterxml.jackson.databind.BeanDescription)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = 1;
    Object v6 = new java.util.HashMap((((java.lang.Integer)v5).intValue()));
    Object v7 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((java.util.Map)v6));
    Object v8 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v9 = ((com.fasterxml.jackson.databind.DeserializationConfig)v7).with(((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v8));
    Object v10 = ((com.fasterxml.jackson.databind.deser.impl.CreatorCollector)v2).constructValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v7));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector(((com.fasterxml.jackson.databind.BeanDescription)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = null;
    Object v4 = "boolean";
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.findClass(((java.lang.String)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = 1;
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v3),((java.lang.reflect.Type)v5),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v6),(((java.lang.Integer)v7).intValue()));
    ((com.fasterxml.jackson.databind.deser.impl.CreatorCollector)v2).addIncompeteParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedParameter)v8));
    Object v9 = null;
    Object v10 = null;
    Object v11 = false;
    Object v12 = new com.fasterxml.jackson.databind.deser.CreatorProperty[]{null};
    ((com.fasterxml.jackson.databind.deser.impl.CreatorCollector)v2).addPropertyCreator(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v10),(((java.lang.Boolean)v11).booleanValue()),((com.fasterxml.jackson.databind.deser.CreatorProperty[])v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector(((com.fasterxml.jackson.databind.BeanDescription)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = null;
    Object v4 = true;
    ((com.fasterxml.jackson.databind.deser.impl.CreatorCollector)v2).addIntCreator(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v5 = null;
    Object v6 = ((com.fasterxml.jackson.databind.deser.impl.CreatorCollector)v2).hasDefaultCreator();
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector(((com.fasterxml.jackson.databind.BeanDescription)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = null;
    Object v4 = "boolean";
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.findClass(((java.lang.String)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = 1;
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v3),((java.lang.reflect.Type)v5),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = new com.fasterxml.jackson.databind.type.TypeBindings(((com.fasterxml.jackson.databind.type.TypeFactory)v9),((com.fasterxml.jackson.databind.JavaType)v10));
    Object v12 = ((com.fasterxml.jackson.databind.introspect.Annotated)v8).getType(((com.fasterxml.jackson.databind.type.TypeBindings)v11));
    ((com.fasterxml.jackson.databind.deser.impl.CreatorCollector)v2).addIncompeteParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedParameter)v8));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector(((com.fasterxml.jackson.databind.BeanDescription)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = null;
    Object v4 = "boolean";
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.findClass(((java.lang.String)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = 1;
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v3),((java.lang.reflect.Type)v5),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v6),(((java.lang.Integer)v7).intValue()));
    ((com.fasterxml.jackson.databind.deser.impl.CreatorCollector)v2).addIncompeteParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedParameter)v8));
    Object v9 = null;
    Object v10 = null;
    Object v11 = "boolean";
    Object v12 = com.fasterxml.jackson.databind.util.ClassUtil.findClass(((java.lang.String)v11));
    Object v13 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v14 = 1;
    Object v15 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v10),((java.lang.reflect.Type)v12),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v13),(((java.lang.Integer)v14).intValue()));
    Object v16 = ((com.fasterxml.jackson.databind.introspect.AnnotatedParameter)v15).toString();
    ((com.fasterxml.jackson.databind.deser.impl.CreatorCollector)v2).addIncompeteParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedParameter)v15));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector(((com.fasterxml.jackson.databind.BeanDescription)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = null;
    Object v4 = true;
    ((com.fasterxml.jackson.databind.deser.impl.CreatorCollector)v2).addStringCreator(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v5 = null;
    Object v6 = null;
    Object v7 = "boolean";
    Object v8 = com.fasterxml.jackson.databind.util.ClassUtil.findClass(((java.lang.String)v7));
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v10 = 1;
    Object v11 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v6),((java.lang.reflect.Type)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v9),(((java.lang.Integer)v10).intValue()));
    ((com.fasterxml.jackson.databind.deser.impl.CreatorCollector)v2).addIncompeteParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedParameter)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector(((com.fasterxml.jackson.databind.BeanDescription)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = 1;
    Object v6 = new java.util.HashMap((((java.lang.Integer)v5).intValue()));
    Object v7 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((java.util.Map)v6));
    Object v8 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
    Object v9 = ((com.fasterxml.jackson.databind.DeserializationConfig)v7).with(((com.fasterxml.jackson.core.JsonParser.Feature)v8));
    Object v10 = ((com.fasterxml.jackson.databind.deser.impl.CreatorCollector)v2).constructValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v7));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector(((com.fasterxml.jackson.databind.BeanDescription)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = null;
    ((com.fasterxml.jackson.databind.deser.impl.CreatorCollector)v2).addStringCreator(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v3));
    Object v4 = null;
    Object v5 = null;
    Object v6 = "boolean";
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findClass(((java.lang.String)v6));
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = 1;
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v5),((java.lang.reflect.Type)v7),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8),(((java.lang.Integer)v9).intValue()));
    ((com.fasterxml.jackson.databind.deser.impl.CreatorCollector)v2).addIncompeteParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedParameter)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector(((com.fasterxml.jackson.databind.BeanDescription)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = null;
    Object v4 = "boolean";
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.findClass(((java.lang.String)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = 1;
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v3),((java.lang.reflect.Type)v5),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = "boolean";
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findClass(((java.lang.String)v9));
    Object v11 = ((com.fasterxml.jackson.databind.introspect.Annotated)v8).hasAnnotation(((java.lang.Class)v10));
    ((com.fasterxml.jackson.databind.deser.impl.CreatorCollector)v2).addIncompeteParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedParameter)v8));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector(((com.fasterxml.jackson.databind.BeanDescription)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = null;
    Object v4 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v5 = 1;
    Object v6 = new java.util.HashMap((((java.lang.Integer)v5).intValue()));
    Object v7 = new com.fasterxml.jackson.databind.DeserializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v3),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v4),((java.util.Map)v6));
    Object v8 = com.fasterxml.jackson.databind.cfg.ContextAttributes.Impl.getEmpty();
    Object v9 = ((com.fasterxml.jackson.databind.DeserializationConfig)v7).with(((com.fasterxml.jackson.databind.cfg.ContextAttributes)v8));
    Object v10 = ((com.fasterxml.jackson.databind.deser.impl.CreatorCollector)v2).constructValueInstantiator(((com.fasterxml.jackson.databind.DeserializationConfig)v7));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector(((com.fasterxml.jackson.databind.BeanDescription)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = null;
    Object v4 = true;
    ((com.fasterxml.jackson.databind.deser.impl.CreatorCollector)v2).addIntCreator(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v5 = null;
    Object v6 = null;
    Object v7 = "boolean";
    Object v8 = com.fasterxml.jackson.databind.util.ClassUtil.findClass(((java.lang.String)v7));
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v10 = 1;
    Object v11 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v6),((java.lang.reflect.Type)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v9),(((java.lang.Integer)v10).intValue()));
    ((com.fasterxml.jackson.databind.deser.impl.CreatorCollector)v2).addIncompeteParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedParameter)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector(((com.fasterxml.jackson.databind.BeanDescription)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = null;
    Object v4 = 1;
    Object v5 = false;
    ((com.fasterxml.jackson.databind.deser.impl.CreatorCollector)v2).verifyNonDup(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector(((com.fasterxml.jackson.databind.BeanDescription)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = null;
    Object v4 = false;
    Object v5 = new com.fasterxml.jackson.databind.deser.CreatorProperty[]{null,null};
    ((com.fasterxml.jackson.databind.deser.impl.CreatorCollector)v2).addPropertyCreator(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v3),(((java.lang.Boolean)v4).booleanValue()),((com.fasterxml.jackson.databind.deser.CreatorProperty[])v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = true;
    Object v2 = new com.fasterxml.jackson.databind.deser.impl.CreatorCollector(((com.fasterxml.jackson.databind.BeanDescription)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = null;
    Object v4 = "boolean";
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.findClass(((java.lang.String)v4));
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = 1;
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v3),((java.lang.reflect.Type)v5),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v6),(((java.lang.Integer)v7).intValue()));
    ((com.fasterxml.jackson.databind.deser.impl.CreatorCollector)v2).addIncompeteParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedParameter)v8));
    Object v9 = null;
    Object v10 = null;
    Object v11 = false;
    Object v12 = new com.fasterxml.jackson.databind.deser.CreatorProperty[]{null,null,null};
    ((com.fasterxml.jackson.databind.deser.impl.CreatorCollector)v2).addPropertyCreator(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v10),(((java.lang.Boolean)v11).booleanValue()),((com.fasterxml.jackson.databind.deser.CreatorProperty[])v12));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }
}
