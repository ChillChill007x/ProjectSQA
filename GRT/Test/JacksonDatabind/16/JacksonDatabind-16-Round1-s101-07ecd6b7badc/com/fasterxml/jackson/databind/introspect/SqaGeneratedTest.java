package com.fasterxml.jackson.databind.introspect;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v1 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v2 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v0),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v1 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v2 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v1),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v2));
    Object v4 = "array";
    Object v5 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v4));
    Object v6 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v5));
    Object v7 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v3).get(((java.lang.Class)v6));
    Object v8 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v0),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v3));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v1 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v0).toString();
    org.junit.Assert.assertEquals((Object)("[null]"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v1 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v2 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v1),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v2));
    Object v4 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v0),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v1 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v2 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v0),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v1));
    Object v3 = "array";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v4));
    Object v6 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v2).get(((java.lang.Class)v5));
    Object v7 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v2).annotations();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v1 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v2 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v1),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v2));
    Object v4 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v0),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v3));
    Object v5 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v4).annotations();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v1 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v2 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v1),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v2));
    Object v4 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v0),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v3));
    Object v5 = "array";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v6));
    Object v8 = "array";
    Object v9 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v9));
    Object v11 = ((java.lang.Class)v7).isAssignableFrom(((java.lang.Class)v10));
    Object v12 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v4).get(((java.lang.Class)v7));
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v1 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v2 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v1),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v2));
    Object v4 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v0),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v3));
    Object v5 = "array";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v6));
    Object v8 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v4).get(((java.lang.Class)v7));
    Object v9 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v4).size();
    org.junit.Assert.assertEquals((Object)(0), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v1 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v2 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v1),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v2));
    Object v4 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v0),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v3));
    Object v5 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v8 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v6),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v7));
    Object v9 = "array";
    Object v10 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v10));
    Object v12 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8).get(((java.lang.Class)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v5),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8));
    Object v14 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v4),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v1 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v2 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v1),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v2));
    Object v4 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v0),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v3));
    Object v5 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v4).size();
    org.junit.Assert.assertEquals((Object)(0), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v1 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v2 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v0),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v1));
    Object v3 = "array";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v4));
    Object v6 = " known pLroperties: ";
    Object v7 = ((java.lang.Class)v5).getResource(((java.lang.String)v6));
    Object v8 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v2).get(((java.lang.Class)v5));
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v1 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v0).annotations();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v1 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v2 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v1),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v2));
    Object v4 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v0),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v3));
    Object v5 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v4).annotations();
    Object v6 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v4).size();
    org.junit.Assert.assertEquals((Object)(0), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v1 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v2 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v1),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v2));
    Object v4 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v0),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v3));
    Object v5 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v4).toString();
    Object v6 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v4).annotations();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v1 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v2 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v1),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v2));
    Object v4 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v0),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v3));
    Object v5 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v4).annotations();
    Object v6 = "array";
    Object v7 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v6));
    Object v8 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v7));
    Object v9 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v4).get(((java.lang.Class)v8));
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v1 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v2 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v0),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v1));
    Object v3 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v2).toString();
    org.junit.Assert.assertEquals((Object)("[null]"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v1 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v2 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v1),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v2));
    Object v4 = "array";
    Object v5 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v4));
    Object v6 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v5));
    Object v7 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v3).get(((java.lang.Class)v6));
    Object v8 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v0),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v3));
    Object v9 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8).annotations();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v1 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v2 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v0),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v1));
    Object v3 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v2).size();
    org.junit.Assert.assertEquals((Object)(0), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v1 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v2 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v1),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v2));
    Object v4 = "array";
    Object v5 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v4));
    Object v6 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v5));
    Object v7 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v3).get(((java.lang.Class)v6));
    Object v8 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v0),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v3));
    Object v9 = "array";
    Object v10 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v10));
    Object v12 = ">";
    Object v13 = ((java.lang.Class)v11).getResource(((java.lang.String)v12));
    Object v14 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8).get(((java.lang.Class)v11));
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v1 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v2 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v1),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v2));
    Object v4 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v0),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v3));
    Object v5 = "array";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v6));
    Object v8 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v4).get(((java.lang.Class)v7));
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v1 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v2 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v1),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v2));
    Object v4 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v0),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v3));
    Object v5 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v8 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v6),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v7));
    Object v9 = "array";
    Object v10 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v10));
    Object v12 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8).get(((java.lang.Class)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v5),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8));
    Object v14 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v4),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v13));
    Object v15 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v16 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v17 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v18 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v16),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v17));
    Object v19 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v15),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v18));
    Object v20 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v19).toString();
    Object v21 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v14),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v19));
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v1 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v2 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v1),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v2));
    Object v4 = "array";
    Object v5 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v4));
    Object v6 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v5));
    Object v7 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v3).get(((java.lang.Class)v6));
    Object v8 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v0),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v3));
    Object v9 = "array";
    Object v10 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v10));
    Object v12 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8).get(((java.lang.Class)v11));
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v1 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v2 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v0),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v1));
    Object v3 = "array";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v4));
    Object v6 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v2).get(((java.lang.Class)v5));
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v1 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v2 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v1),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v2));
    Object v4 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v0),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v3));
    Object v5 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v5),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v6));
    Object v8 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v4),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v1 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v2 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v1),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v2));
    Object v4 = "array";
    Object v5 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v4));
    Object v6 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v5));
    Object v7 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v3).get(((java.lang.Class)v6));
    Object v8 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v0),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v3));
    Object v9 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8).size();
    org.junit.Assert.assertEquals((Object)(0), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v1 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v2 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v1),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v2));
    Object v4 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v3).toString();
    Object v5 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v0),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v3));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v1 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v2 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v1),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v2));
    Object v4 = "array";
    Object v5 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v4));
    Object v6 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v5));
    Object v7 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v3).get(((java.lang.Class)v6));
    Object v8 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v0),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v3));
    Object v9 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8).toString();
    org.junit.Assert.assertEquals((Object)("[null]"), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v1 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v2 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v1),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v2));
    Object v4 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v0),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v3));
    Object v5 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v5),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v6));
    Object v8 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v4),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v7));
    Object v9 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8).annotations();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v1 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v2 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v1),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v2));
    Object v4 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v0),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v3));
    Object v5 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v8 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v6),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v7));
    Object v9 = "array";
    Object v10 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v10));
    Object v12 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8).get(((java.lang.Class)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v5),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8));
    Object v14 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v4),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v13));
    Object v15 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v16 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v17 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v18 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v16),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v17));
    Object v19 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v15),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v18));
    Object v20 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v19).toString();
    Object v21 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v14),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v19));
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v25 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v23),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v24));
    Object v26 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v22),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v25));
    Object v27 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v26).toString();
    Object v28 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v21),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v26));
    org.junit.Assert.assertNotNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v1 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v2 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v1),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v2));
    Object v4 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v0),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v3));
    Object v5 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v8 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v6),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v7));
    Object v9 = "array";
    Object v10 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v10));
    Object v12 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8).get(((java.lang.Class)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v5),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8));
    Object v14 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v4),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v13));
    Object v15 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v16 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v17 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v18 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v16),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v17));
    Object v19 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v15),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v18));
    Object v20 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v19).toString();
    Object v21 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v14),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v19));
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v25 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v23),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v24));
    Object v26 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v22),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v25));
    Object v27 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v26).toString();
    Object v28 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v21),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v26));
    Object v29 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v28).toString();
    org.junit.Assert.assertEquals((Object)("[null]"), v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v1 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v2 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v1),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v2));
    Object v4 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v0),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v3));
    Object v5 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v8 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v6),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v7));
    Object v9 = "array";
    Object v10 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v10));
    Object v12 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8).get(((java.lang.Class)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v5),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8));
    Object v14 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v4),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v13));
    Object v15 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v16 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v17 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v18 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v16),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v17));
    Object v19 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v15),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v18));
    Object v20 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v19).toString();
    Object v21 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v14),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v19));
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v25 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v23),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v24));
    Object v26 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v22),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v25));
    Object v27 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v26).toString();
    Object v28 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v21),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v26));
    Object v29 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v28).size();
    org.junit.Assert.assertEquals((Object)(0), v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v1 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v2 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v1),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v2));
    Object v4 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v3).toString();
    Object v5 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v0),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v3));
    Object v6 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v5).annotations();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v1 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v2 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v1),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v2));
    Object v4 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v0),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v3));
    Object v5 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v5),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v6));
    Object v8 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v4),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v7));
    Object v9 = "array";
    Object v10 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v10));
    Object v12 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8).get(((java.lang.Class)v11));
    Object v13 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8).annotations();
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v1 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v2 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v1),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v2));
    Object v4 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v0),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v3));
    Object v5 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v8 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v6),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v7));
    Object v9 = "array";
    Object v10 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v10));
    Object v12 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8).get(((java.lang.Class)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v5),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8));
    Object v14 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v4),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v13));
    Object v15 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v16 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v17 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v18 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v16),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v17));
    Object v19 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v15),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v18));
    Object v20 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v19).toString();
    Object v21 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v14),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v19));
    Object v22 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v21).annotations();
    org.junit.Assert.assertNotNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v1 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v2 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v1),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v2));
    Object v4 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v0),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v3));
    Object v5 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v5),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v6));
    Object v8 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v4),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v7));
    Object v9 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8).size();
    org.junit.Assert.assertEquals((Object)(0), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v1 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v2 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v3 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v4 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v2),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v3));
    Object v5 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v4).toString();
    Object v6 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v1),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v4));
    Object v7 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v6).toString();
    Object v8 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v0),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v6));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v1 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v2 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v1),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v2));
    Object v4 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v0),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v3));
    Object v5 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v8 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v6),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v7));
    Object v9 = "array";
    Object v10 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v10));
    Object v12 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8).get(((java.lang.Class)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v5),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8));
    Object v14 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v4),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v13));
    Object v15 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v14).annotations();
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v1 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v2 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v0),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v1));
    Object v3 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v4 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v5 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v3),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v4));
    Object v6 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v2),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v1 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v2 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v0),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v1));
    Object v3 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v4 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v5 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v3),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v4));
    Object v6 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v2),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v5));
    Object v7 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v6).annotations();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v1 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v2 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v0),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v1));
    Object v3 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v4 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v5 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v3),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v4));
    Object v6 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v2),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v5));
    Object v7 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v6).toString();
    Object v8 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v6).toString();
    org.junit.Assert.assertEquals((Object)("[null]"), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v1 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v2 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v1),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v2));
    Object v4 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v0),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v3));
    Object v5 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v8 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v6),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v7));
    Object v9 = "array";
    Object v10 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v10));
    Object v12 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8).get(((java.lang.Class)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v5),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8));
    Object v14 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v4),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v13));
    Object v15 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v16 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v17 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v18 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v16),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v17));
    Object v19 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v15),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v18));
    Object v20 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v19).toString();
    Object v21 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v14),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v19));
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v25 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v23),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v24));
    Object v26 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v22),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v25));
    Object v27 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v26).toString();
    Object v28 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v21),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v26));
    Object v29 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v28).annotations();
    org.junit.Assert.assertNotNull(v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v1 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v2 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v1),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v2));
    Object v4 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v0),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v3));
    Object v5 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v8 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v6),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v7));
    Object v9 = "array";
    Object v10 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v10));
    Object v12 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8).get(((java.lang.Class)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v5),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8));
    Object v14 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v4),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v13));
    Object v15 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v14).toString();
    org.junit.Assert.assertEquals((Object)("[null]"), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v1 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v2 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v0),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v1));
    Object v3 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v4 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v5 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v3),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v4));
    Object v6 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v2),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v5));
    Object v7 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v6).size();
    org.junit.Assert.assertEquals((Object)(0), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v1 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v2 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v0),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v1));
    Object v3 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v4 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v5 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v6 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v4),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v5));
    Object v7 = "array";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v8));
    Object v10 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v6).get(((java.lang.Class)v9));
    Object v11 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v3),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v6));
    Object v12 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v11).toString();
    Object v13 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v2),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v11));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v1 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v2 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v0),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v1));
    Object v3 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v2).toString();
    Object v4 = null;
    Object v5 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v2).addIfNotPresent(((java.lang.annotation.Annotation)v4));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v1 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v2 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v3 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v4 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v2),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v3));
    Object v5 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v4).toString();
    Object v6 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v1),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v4));
    Object v7 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v6).toString();
    Object v8 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v0),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v6));
    Object v9 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8).size();
    org.junit.Assert.assertEquals((Object)(0), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v1 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v2 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v1),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v2));
    Object v4 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v0),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v3));
    Object v5 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v5),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v6));
    Object v8 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v4),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v7));
    Object v9 = "array";
    Object v10 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v10));
    Object v12 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8).get(((java.lang.Class)v11));
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v1 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v2 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v1),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v2));
    Object v4 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v0),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v3));
    Object v5 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v5),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v6));
    Object v8 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v4),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v7));
    Object v9 = "array";
    Object v10 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v10));
    Object v12 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8).get(((java.lang.Class)v11));
    Object v13 = "array";
    Object v14 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v13));
    Object v15 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v14));
    Object v16 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8).get(((java.lang.Class)v15));
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v1 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v2 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v1),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v2));
    Object v4 = "array";
    Object v5 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v4));
    Object v6 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v5));
    Object v7 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v3).get(((java.lang.Class)v6));
    Object v8 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v0),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v3));
    Object v9 = "array";
    Object v10 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v10));
    Object v12 = "array";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v12));
    Object v14 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v13));
    Object v15 = ((java.lang.Class)v11).getDeclaredAnnotation(((java.lang.Class)v14));
    Object v16 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8).get(((java.lang.Class)v11));
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v1 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v2 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v1),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v2));
    Object v4 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v0),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v3));
    Object v5 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v5),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v6));
    Object v8 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v4),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v7));
    Object v9 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8).annotations();
    Object v10 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8).size();
    org.junit.Assert.assertEquals((Object)(0), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v1 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v2 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v0),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v1));
    Object v3 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v4 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v5 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v3),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v4));
    Object v6 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v2),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v5));
    Object v7 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v6).toString();
    org.junit.Assert.assertEquals((Object)("[null]"), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v1 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v2 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v0),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v1));
    Object v3 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v4 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v5 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v3),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v4));
    Object v6 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v2),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v11 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v9),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v10));
    Object v12 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v11).toString();
    Object v13 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v11));
    Object v14 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v13).toString();
    Object v15 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v7),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v13));
    Object v16 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v6),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v15));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v1 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v2 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v1),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v2));
    Object v4 = "array";
    Object v5 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v4));
    Object v6 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v5));
    Object v7 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v3).get(((java.lang.Class)v6));
    Object v8 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v0),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v3));
    Object v9 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8).annotations();
    Object v10 = "array";
    Object v11 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v10));
    Object v12 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v11));
    Object v13 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8).get(((java.lang.Class)v12));
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v1 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v2 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v1),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v2));
    Object v4 = "array";
    Object v5 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v4));
    Object v6 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v5));
    Object v7 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v3).get(((java.lang.Class)v6));
    Object v8 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v0),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v3));
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v11 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v9),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v10));
    Object v12 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v1 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v2 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v1),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v2));
    Object v4 = "array";
    Object v5 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v4));
    Object v6 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v5));
    Object v7 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v3).get(((java.lang.Class)v6));
    Object v8 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v0),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v3));
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v11 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v9),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v10));
    Object v12 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v11));
    Object v13 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v12).toString();
    org.junit.Assert.assertEquals((Object)("[null]"), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v1 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v2 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v1),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v2));
    Object v4 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v0),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v3));
    Object v5 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v5),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v6));
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v10 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v9));
    Object v11 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v7),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v10));
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v13 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v14 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v15 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v16 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v14),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v15));
    Object v17 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v16).toString();
    Object v18 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v13),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v16));
    Object v19 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v18).toString();
    Object v20 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v12),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v18));
    Object v21 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v11),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v20));
    Object v22 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v4),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v21));
    org.junit.Assert.assertNotNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v1 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v2 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v1),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v2));
    Object v4 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v0),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v3));
    Object v5 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v7),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8));
    Object v10 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v9).toString();
    Object v11 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v6),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v9));
    Object v12 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v11).toString();
    Object v13 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v5),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v11));
    Object v14 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v4),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v1 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v2 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v1),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v2));
    Object v4 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v0),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v3));
    Object v5 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v8 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v6),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v7));
    Object v9 = "array";
    Object v10 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v10));
    Object v12 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8).get(((java.lang.Class)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v5),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8));
    Object v14 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v4),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v13));
    Object v15 = "array";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v15));
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v16));
    Object v18 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v14).get(((java.lang.Class)v17));
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v1 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v2 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v1),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v2));
    Object v4 = "array";
    Object v5 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v4));
    Object v6 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v5));
    Object v7 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v3).get(((java.lang.Class)v6));
    Object v8 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v0),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v3));
    Object v9 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8).annotations();
    Object v10 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8).annotations();
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v1 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v2 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v0),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v1));
    Object v3 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v4 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v5 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v6 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v4),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v5));
    Object v7 = "array";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v8));
    Object v10 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v6).get(((java.lang.Class)v9));
    Object v11 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v3),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v6));
    Object v12 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v11).toString();
    Object v13 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v2),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v11));
    Object v14 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v15 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v16 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v14),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v15));
    Object v17 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v18 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v19 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v17),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v18));
    Object v20 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v16),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v19));
    Object v21 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v13),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v20));
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v1 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v2 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v1),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v2));
    Object v4 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v0),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v3));
    Object v5 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v4).toString();
    org.junit.Assert.assertEquals((Object)("[null]"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v1 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v2 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v1),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v2));
    Object v4 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v0),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v3));
    Object v5 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v5),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v6));
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v10 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v9));
    Object v11 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v7),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v10));
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v13 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v14 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v15 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v16 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v14),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v15));
    Object v17 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v16).toString();
    Object v18 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v13),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v16));
    Object v19 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v18).toString();
    Object v20 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v12),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v18));
    Object v21 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v11),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v20));
    Object v22 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v4),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v21));
    Object v23 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v22).size();
    org.junit.Assert.assertEquals((Object)(0), v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v1 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v2 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v1),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v2));
    Object v4 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v0),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v3));
    Object v5 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v5),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v6));
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v10 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v9));
    Object v11 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v7),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v10));
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v13 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v14 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v15 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v16 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v14),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v15));
    Object v17 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v16).toString();
    Object v18 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v13),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v16));
    Object v19 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v18).toString();
    Object v20 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v12),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v18));
    Object v21 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v11),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v20));
    Object v22 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v4),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v21));
    Object v23 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v22).toString();
    org.junit.Assert.assertEquals((Object)("[null]"), v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v1 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v2 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v1),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v2));
    Object v4 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v0),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v3));
    Object v5 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v8 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v6),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v7));
    Object v9 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v5),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8));
    Object v10 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v4),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v1 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v2 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v1),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v2));
    Object v4 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v0),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v3));
    Object v5 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v7),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8));
    Object v10 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v9).toString();
    Object v11 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v6),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v9));
    Object v12 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v11).toString();
    Object v13 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v5),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v11));
    Object v14 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v4),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v13));
    Object v15 = "array";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v15));
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v16));
    Object v18 = ((java.lang.Class)v17).getSigners();
    Object v19 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v14).get(((java.lang.Class)v17));
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v1 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v2 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v0),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v1));
    Object v3 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v4 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v5 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v3),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v4));
    Object v6 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v2),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v11 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v9),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v10));
    Object v12 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v11).toString();
    Object v13 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v11));
    Object v14 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v13).toString();
    Object v15 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v7),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v13));
    Object v16 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v6),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v15));
    Object v17 = "array";
    Object v18 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v17));
    Object v19 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v18));
    Object v20 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v16).get(((java.lang.Class)v19));
    org.junit.Assert.assertNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v1 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v2 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v0),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v1));
    Object v3 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v4 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v5 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v3),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v4));
    Object v6 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v2),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v11 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v9),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v10));
    Object v12 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v11).toString();
    Object v13 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v11));
    Object v14 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v13).toString();
    Object v15 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v7),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v13));
    Object v16 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v6),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v15));
    Object v17 = "array";
    Object v18 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v17));
    Object v19 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v18));
    Object v20 = ((java.lang.Class)v19).getName();
    Object v21 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v16).get(((java.lang.Class)v19));
    org.junit.Assert.assertNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v1 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v2 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v1),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v2));
    Object v4 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v0),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v3));
    Object v5 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v7),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8));
    Object v10 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v9).toString();
    Object v11 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v6),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v9));
    Object v12 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v11).toString();
    Object v13 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v5),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v11));
    Object v14 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v4),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v13));
    Object v15 = "array";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v15));
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v16));
    Object v18 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v14).get(((java.lang.Class)v17));
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v1 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v2 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v1),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v2));
    Object v4 = "array";
    Object v5 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v4));
    Object v6 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v5));
    Object v7 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v3).get(((java.lang.Class)v6));
    Object v8 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v0),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v3));
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v11 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v9),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v10));
    Object v12 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v11));
    Object v13 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v12).annotations();
    Object v14 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v12).toString();
    org.junit.Assert.assertEquals((Object)("[null]"), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v1 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v0).size();
    org.junit.Assert.assertEquals((Object)(0), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v1 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v2 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v1),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v2));
    Object v4 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v0),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v3));
    Object v5 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v7),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8));
    Object v10 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v9).toString();
    Object v11 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v6),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v9));
    Object v12 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v11).toString();
    Object v13 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v5),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v11));
    Object v14 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v4),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v13));
    Object v15 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v14).size();
    org.junit.Assert.assertEquals((Object)(0), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v1 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v2 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v1),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v2));
    Object v4 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v0),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v3));
    Object v5 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v7),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8));
    Object v10 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v9).toString();
    Object v11 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v6),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v9));
    Object v12 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v11).toString();
    Object v13 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v5),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v11));
    Object v14 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v4),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v13));
    Object v15 = "array";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v15));
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v16));
    Object v18 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v14).get(((java.lang.Class)v17));
    Object v19 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v14).toString();
    org.junit.Assert.assertEquals((Object)("[null]"), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v1 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v2 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v1),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v2));
    Object v4 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v0),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v3));
    Object v5 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v5),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v6));
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v10 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v9));
    Object v11 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v7),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v10));
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v13 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v14 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v15 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v16 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v14),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v15));
    Object v17 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v16).toString();
    Object v18 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v13),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v16));
    Object v19 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v18).toString();
    Object v20 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v12),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v18));
    Object v21 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v11),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v20));
    Object v22 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v4),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v21));
    Object v23 = null;
    Object v24 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v22)._add(((java.lang.annotation.Annotation)v23));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v1 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v2 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v0),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v1));
    Object v3 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v4 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v5 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v3),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v4));
    Object v6 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v2),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v11 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v9),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v10));
    Object v12 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v11).toString();
    Object v13 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v11));
    Object v14 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v13).toString();
    Object v15 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v7),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v13));
    Object v16 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v6),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v15));
    Object v17 = "array";
    Object v18 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v17));
    Object v19 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v18));
    Object v20 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v16).get(((java.lang.Class)v19));
    Object v21 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v16).annotations();
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v1 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v2 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v0),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v1));
    Object v3 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v4 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v5 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v3),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v4));
    Object v6 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v2),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v5));
    Object v7 = "array";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v8));
    Object v10 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v6).get(((java.lang.Class)v9));
    Object v11 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v6).toString();
    org.junit.Assert.assertEquals((Object)("[null]"), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v1 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v2 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v0),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v1));
    Object v3 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v4 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v5 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v3),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v4));
    Object v6 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v2),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v11 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v9),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v10));
    Object v12 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v11).toString();
    Object v13 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v11));
    Object v14 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v13).toString();
    Object v15 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v7),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v13));
    Object v16 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v6),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v15));
    Object v17 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v16).annotations();
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v1 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v2 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v1),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v2));
    Object v4 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v0),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v3));
    Object v5 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v8 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v6),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v7));
    Object v9 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v5),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8));
    Object v10 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v4),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v9));
    Object v11 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v13 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v14 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v12),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v13));
    Object v15 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v11),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v14));
    Object v16 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v10),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v15));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v1 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v2 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v0),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v1));
    Object v3 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v4 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v5 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v3),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v4));
    Object v6 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v2),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v11 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v9),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v10));
    Object v12 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v11).toString();
    Object v13 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v11));
    Object v14 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v13).toString();
    Object v15 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v7),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v13));
    Object v16 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v6),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v15));
    Object v17 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v16).toString();
    Object v18 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v16).toString();
    org.junit.Assert.assertEquals((Object)("[null]"), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v1 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v2 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v1),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v2));
    Object v4 = "array";
    Object v5 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v4));
    Object v6 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v5));
    Object v7 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v3).get(((java.lang.Class)v6));
    Object v8 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v0),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v3));
    Object v9 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8).annotations();
    Object v10 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8).toString();
    org.junit.Assert.assertEquals((Object)("[null]"), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v1 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v2 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v1),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v2));
    Object v4 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v0),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v3));
    Object v5 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v8 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v6),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v7));
    Object v9 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v5),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8));
    Object v10 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v4),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v9));
    Object v11 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v13 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v14 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v12),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v13));
    Object v15 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v11),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v14));
    Object v16 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v10),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v15));
    Object v17 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v16).toString();
    org.junit.Assert.assertEquals((Object)("[null]"), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v1 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v2 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v0),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v1));
    Object v3 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v4 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v5 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v3),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v4));
    Object v6 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v2),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v5));
    Object v7 = "array";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v8));
    Object v10 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v6).get(((java.lang.Class)v9));
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v1 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v2 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v0),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v1));
    Object v3 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v4 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v5 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v3),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v4));
    Object v6 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v2),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v11 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v9),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v10));
    Object v12 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v11).toString();
    Object v13 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v11));
    Object v14 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v13).toString();
    Object v15 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v7),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v13));
    Object v16 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v6),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v15));
    Object v17 = "array";
    Object v18 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v17));
    Object v19 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v18));
    Object v20 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v16).get(((java.lang.Class)v19));
    Object v21 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v16).size();
    org.junit.Assert.assertEquals((Object)(0), v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v1 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v2 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v1),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v2));
    Object v4 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v0),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v3));
    Object v5 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v7),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8));
    Object v10 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v9).toString();
    Object v11 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v6),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v9));
    Object v12 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v11).toString();
    Object v13 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v5),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v11));
    Object v14 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v4),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v13));
    Object v15 = "array";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v15));
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v16));
    Object v18 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v14).get(((java.lang.Class)v17));
    Object v19 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v14).annotations();
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v1 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v2 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v0),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v1));
    Object v3 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v4 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v5 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v6 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v4),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v5));
    Object v7 = "array";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v8));
    Object v10 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v6).get(((java.lang.Class)v9));
    Object v11 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v3),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v6));
    Object v12 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v11).toString();
    Object v13 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v2),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v11));
    Object v14 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v13).annotations();
    Object v15 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v13).annotations();
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v1 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v2 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v1),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v2));
    Object v4 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v0),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v3));
    Object v5 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v7),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8));
    Object v10 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v9).toString();
    Object v11 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v6),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v9));
    Object v12 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v11).toString();
    Object v13 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v5),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v11));
    Object v14 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v4),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v13));
    Object v15 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v16 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v17 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v15),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v16));
    Object v18 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v19 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v20 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v18),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v19));
    Object v21 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v17),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v20));
    Object v22 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v21).toString();
    Object v23 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v14),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v21));
    org.junit.Assert.assertNotNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v1 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v2 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v1),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v2));
    Object v4 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v0),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v3));
    Object v5 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v8 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v6),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v7));
    Object v9 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v5),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8));
    Object v10 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v4),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v9));
    Object v11 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v13 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v14 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v12),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v13));
    Object v15 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v11),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v14));
    Object v16 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v15).toString();
    Object v17 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v10),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v15));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v1 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v2 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v0),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v1));
    Object v3 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v4 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v5 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v3),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v4));
    Object v6 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v2),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v11 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v9),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v10));
    Object v12 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v11).toString();
    Object v13 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v11));
    Object v14 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v13).toString();
    Object v15 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v7),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v13));
    Object v16 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v6),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v15));
    Object v17 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v16).toString();
    org.junit.Assert.assertEquals((Object)("[null]"), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v1 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v2 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v1),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v2));
    Object v4 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v0),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v3));
    Object v5 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v7),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8));
    Object v10 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v9).toString();
    Object v11 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v6),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v9));
    Object v12 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v11).toString();
    Object v13 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v5),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v11));
    Object v14 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v4),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v13));
    Object v15 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v14).annotations();
    Object v16 = "array";
    Object v17 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v16));
    Object v18 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v17));
    Object v19 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v14).get(((java.lang.Class)v18));
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v1 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v2 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v0),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v1));
    Object v3 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v4 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v5 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v3),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v4));
    Object v6 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v2),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v11 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v9),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v10));
    Object v12 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v11).toString();
    Object v13 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v11));
    Object v14 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v13).toString();
    Object v15 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v7),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v13));
    Object v16 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v6),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v15));
    Object v17 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v16).size();
    org.junit.Assert.assertEquals((Object)(0), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v1 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v2 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v1),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v2));
    Object v4 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v0),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v3));
    Object v5 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v5),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v6));
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v10 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v9));
    Object v11 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v7),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v10));
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v13 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v14 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v15 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v16 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v14),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v15));
    Object v17 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v16).toString();
    Object v18 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v13),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v16));
    Object v19 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v18).toString();
    Object v20 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v12),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v18));
    Object v21 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v11),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v20));
    Object v22 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v4),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v21));
    Object v23 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v22).toString();
    Object v24 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v22).annotations();
    org.junit.Assert.assertNotNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v1 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v2 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v1),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v2));
    Object v4 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v0),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v3));
    Object v5 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v8 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v6),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v7));
    Object v9 = "array";
    Object v10 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v10));
    Object v12 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8).get(((java.lang.Class)v11));
    Object v13 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v5),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8));
    Object v14 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v4),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v13));
    Object v15 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v16 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v17 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v18 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v16),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v17));
    Object v19 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v15),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v18));
    Object v20 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v19).toString();
    Object v21 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v14),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v19));
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v25 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v23),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v24));
    Object v26 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v22),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v25));
    Object v27 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v26).toString();
    Object v28 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v21),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v26));
    Object v29 = "array";
    Object v30 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v29));
    Object v31 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v30));
    Object v32 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v28).get(((java.lang.Class)v31));
    org.junit.Assert.assertNull(v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v1 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v2 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v1),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v2));
    Object v4 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v0),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v3));
    Object v5 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v8 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v6),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v7));
    Object v9 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v5),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8));
    Object v10 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v4),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v9));
    Object v11 = "array";
    Object v12 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v11));
    Object v13 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v12));
    Object v14 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v10).get(((java.lang.Class)v13));
    Object v15 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v16 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v17 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v18 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v16),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v17));
    Object v19 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v15),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v18));
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v23 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v21),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v22));
    Object v24 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v20),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v23));
    Object v25 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v19),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v24));
    Object v26 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v27 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v28 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v29 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v27),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v28));
    Object v30 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v26),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v29));
    Object v31 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v25),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v30));
    Object v32 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v10),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v31));
    org.junit.Assert.assertNotNull(v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v1 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v2 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v1),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v2));
    Object v4 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v0),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v3));
    Object v5 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v8 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v6),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v7));
    Object v9 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v5),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8));
    Object v10 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v4),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v9));
    Object v11 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v13 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v14 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v12),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v13));
    Object v15 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v11),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v14));
    Object v16 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v15).toString();
    Object v17 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v10),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v15));
    Object v18 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v17).size();
    org.junit.Assert.assertEquals((Object)(0), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v1 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v2 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v1),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v2));
    Object v4 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v0),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v3));
    Object v5 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v8 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v6),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v7));
    Object v9 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v5),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8));
    Object v10 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v4),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v9));
    Object v11 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v10).toString();
    org.junit.Assert.assertEquals((Object)("[null]"), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v1 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v2 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v1),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v2));
    Object v4 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v0),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v3));
    Object v5 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v8 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v6),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v7));
    Object v9 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v5),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8));
    Object v10 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v4),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v9));
    Object v11 = "array";
    Object v12 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v11));
    Object v13 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v12));
    Object v14 = ((java.lang.Class)v13).getEnumConstants();
    Object v15 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v10).get(((java.lang.Class)v13));
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v1 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v2 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v0),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v1));
    Object v3 = "array";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v4));
    Object v6 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v2).get(((java.lang.Class)v5));
    Object v7 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v2).size();
    org.junit.Assert.assertEquals((Object)(0), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v1 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v2 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v0),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v1));
    Object v3 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v4 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v5 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v6 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v4),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v5));
    Object v7 = "array";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.lang.Enum)v8));
    Object v10 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v6).get(((java.lang.Class)v9));
    Object v11 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v3),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v6));
    Object v12 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v11).toString();
    Object v13 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v2),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v11));
    Object v14 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v15 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v16 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v14),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v15));
    Object v17 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v18 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v19 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v17),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v18));
    Object v20 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v16),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v19));
    Object v21 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v13),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v20));
    Object v22 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v21).annotations();
    org.junit.Assert.assertNotNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v1 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v2 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v1),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v2));
    Object v4 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v0),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v3));
    Object v5 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v7),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8));
    Object v10 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v9).toString();
    Object v11 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v6),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v9));
    Object v12 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v11).toString();
    Object v13 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v5),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v11));
    Object v14 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v4),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v13));
    Object v15 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v16 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v17 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v15),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v16));
    Object v18 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v19 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v20 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v18),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v19));
    Object v21 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v17),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v20));
    Object v22 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v21).toString();
    Object v23 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v14),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v21));
    Object v24 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v23).annotations();
    org.junit.Assert.assertNotNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v1 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v2 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v1),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v2));
    Object v4 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v0),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v3));
    Object v5 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v6 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v7 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v8 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v6),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v7));
    Object v9 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v5),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8));
    Object v10 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v4),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v9));
    Object v11 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v13 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v14 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v12),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v13));
    Object v15 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v11),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v14));
    Object v16 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v15).toString();
    Object v17 = com.fasterxml.jackson.databind.introspect.AnnotationMap.merge(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v10),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v15));
    Object v18 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v17).annotations();
    org.junit.Assert.assertNotNull(v18);
  }
}
