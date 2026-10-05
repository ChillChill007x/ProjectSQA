package com.fasterxml.jackson.databind.type;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = "string";
    Object v2 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v1));
    Object v3 = "string";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = "string";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = java.util.EnumSet.of(((java.lang.Enum)v2),((java.lang.Enum)v4),((java.lang.Enum)v6),((java.lang.Enum)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v9));
    Object v11 = new java.lang.String[]{"Can not construct SimpleType for an array (class: "};
    Object v12 = new com.fasterxml.jackson.databind.JavaType[]{null,null};
    Object v13 = java.util.Map.of();
    Object v14 = "string";
    Object v15 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v14));
    Object v16 = false;
    Object v17 = new com.fasterxml.jackson.databind.type.SimpleType(((java.lang.Class)v10),((java.lang.String[])v11),((com.fasterxml.jackson.databind.JavaType[])v12),((java.lang.Object)v13),((java.lang.Object)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = "string";
    Object v19 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v18));
    Object v20 = "string";
    Object v21 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v20));
    Object v22 = "string";
    Object v23 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v22));
    Object v24 = "string";
    Object v25 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v24));
    Object v26 = java.util.EnumSet.of(((java.lang.Enum)v19),((java.lang.Enum)v21),((java.lang.Enum)v23),((java.lang.Enum)v25));
    Object v27 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v26));
    Object v28 = new java.lang.String[]{"Can not construct SimpleType for an array (class: "};
    Object v29 = new com.fasterxml.jackson.databind.JavaType[]{null,null};
    Object v30 = java.util.Map.of();
    Object v31 = "string";
    Object v32 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v31));
    Object v33 = false;
    Object v34 = new com.fasterxml.jackson.databind.type.SimpleType(((java.lang.Class)v27),((java.lang.String[])v28),((com.fasterxml.jackson.databind.JavaType[])v29),((java.lang.Object)v30),((java.lang.Object)v32),(((java.lang.Boolean)v33).booleanValue()));
    Object v35 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).constructType(((java.lang.reflect.Type)v17),((com.fasterxml.jackson.databind.JavaType)v34));
    org.junit.Assert.assertNotNull(v35);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = "string";
    Object v2 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v1));
    Object v3 = "string";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = "string";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = java.util.EnumSet.of(((java.lang.Enum)v2),((java.lang.Enum)v4),((java.lang.Enum)v6),((java.lang.Enum)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v9));
    Object v11 = ((java.lang.Class)v10).getComponentType();
    Object v12 = "string";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v12));
    Object v14 = "string";
    Object v15 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v14));
    Object v16 = "string";
    Object v17 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v16));
    Object v18 = "string";
    Object v19 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v18));
    Object v20 = java.util.EnumSet.of(((java.lang.Enum)v13),((java.lang.Enum)v15),((java.lang.Enum)v17),((java.lang.Enum)v19));
    Object v21 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v20));
    Object v22 = new java.lang.Class[]{null,null};
    Object v23 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).constructParametrizedType(((java.lang.Class)v10),((java.lang.Class)v21),((java.lang.Class[])v22));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = "string";
    Object v2 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v1));
    Object v3 = "string";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = "string";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = java.util.EnumSet.of(((java.lang.Enum)v2),((java.lang.Enum)v4),((java.lang.Enum)v6),((java.lang.Enum)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v9));
    Object v11 = "string";
    Object v12 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v11));
    Object v13 = "string";
    Object v14 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v13));
    Object v15 = "string";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v15));
    Object v17 = "string";
    Object v18 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v17));
    Object v19 = java.util.EnumSet.of(((java.lang.Enum)v12),((java.lang.Enum)v14),((java.lang.Enum)v16),((java.lang.Enum)v18));
    Object v20 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v19));
    Object v21 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v22 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).constructSimpleType(((java.lang.Class)v10),((java.lang.Class)v20),((com.fasterxml.jackson.databind.JavaType[])v21));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = "string";
    Object v2 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v1));
    Object v3 = "string";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = "string";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = java.util.EnumSet.of(((java.lang.Enum)v2),((java.lang.Enum)v4),((java.lang.Enum)v6),((java.lang.Enum)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v9));
    Object v11 = "string";
    Object v12 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v11));
    Object v13 = "string";
    Object v14 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v13));
    Object v15 = "string";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v15));
    Object v17 = "string";
    Object v18 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v17));
    Object v19 = java.util.EnumSet.of(((java.lang.Enum)v12),((java.lang.Enum)v14),((java.lang.Enum)v16),((java.lang.Enum)v18));
    Object v20 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v19));
    Object v21 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0)._findSuperInterfaceChain(((java.lang.reflect.Type)v10),((java.lang.Class)v20));
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = "string";
    Object v2 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v1));
    Object v3 = "string";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = "string";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = java.util.EnumSet.of(((java.lang.Enum)v2),((java.lang.Enum)v4),((java.lang.Enum)v6),((java.lang.Enum)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v9));
    Object v11 = new com.fasterxml.jackson.databind.JavaType[]{null,null,null};
    Object v12 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).constructParametricType(((java.lang.Class)v10),((com.fasterxml.jackson.databind.JavaType[])v11));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = "string";
    Object v1 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v0));
    Object v2 = "string";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = "string";
    Object v5 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v4));
    Object v6 = "string";
    Object v7 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v6));
    Object v8 = java.util.EnumSet.of(((java.lang.Enum)v1),((java.lang.Enum)v3),((java.lang.Enum)v5),((java.lang.Enum)v7));
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v8));
    Object v10 = new java.lang.String[]{"Can not construct SimpleType for an array (class: "};
    Object v11 = new com.fasterxml.jackson.databind.JavaType[]{null,null};
    Object v12 = java.util.Map.of();
    Object v13 = "string";
    Object v14 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v13));
    Object v15 = false;
    Object v16 = new com.fasterxml.jackson.databind.type.SimpleType(((java.lang.Class)v9),((java.lang.String[])v10),((com.fasterxml.jackson.databind.JavaType[])v11),((java.lang.Object)v12),((java.lang.Object)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = "string";
    Object v1 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v0));
    Object v2 = "string";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = "string";
    Object v5 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v4));
    Object v6 = "string";
    Object v7 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v6));
    Object v8 = java.util.EnumSet.of(((java.lang.Enum)v1),((java.lang.Enum)v3),((java.lang.Enum)v5),((java.lang.Enum)v7));
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = "string";
    Object v2 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v1));
    Object v3 = "string";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = "string";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = java.util.EnumSet.of(((java.lang.Enum)v2),((java.lang.Enum)v4),((java.lang.Enum)v6),((java.lang.Enum)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v9));
    Object v11 = new java.lang.String[]{"Can not construct SimpleType for an array (class: "};
    Object v12 = new com.fasterxml.jackson.databind.JavaType[]{null,null};
    Object v13 = java.util.Map.of();
    Object v14 = "string";
    Object v15 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v14));
    Object v16 = false;
    Object v17 = new com.fasterxml.jackson.databind.type.SimpleType(((java.lang.Class)v10),((java.lang.String[])v11),((com.fasterxml.jackson.databind.JavaType[])v12),((java.lang.Object)v13),((java.lang.Object)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = "string";
    Object v19 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v18));
    Object v20 = "string";
    Object v21 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v20));
    Object v22 = "string";
    Object v23 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v22));
    Object v24 = "string";
    Object v25 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v24));
    Object v26 = java.util.EnumSet.of(((java.lang.Enum)v19),((java.lang.Enum)v21),((java.lang.Enum)v23),((java.lang.Enum)v25));
    Object v27 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v26));
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v27));
    Object v29 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).constructType(((java.lang.reflect.Type)v17),((java.lang.Class)v28));
    org.junit.Assert.assertNotNull(v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0)._unknownType();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = "string";
    Object v2 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v1));
    Object v3 = "string";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = "string";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = java.util.EnumSet.of(((java.lang.Enum)v2),((java.lang.Enum)v4),((java.lang.Enum)v6),((java.lang.Enum)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v9));
    Object v11 = new java.lang.String[]{"Can not construct SimpleType for an array (class: "};
    Object v12 = new com.fasterxml.jackson.databind.JavaType[]{null,null};
    Object v13 = java.util.Map.of();
    Object v14 = "string";
    Object v15 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v14));
    Object v16 = false;
    Object v17 = new com.fasterxml.jackson.databind.type.SimpleType(((java.lang.Class)v10),((java.lang.String[])v11),((com.fasterxml.jackson.databind.JavaType[])v12),((java.lang.Object)v13),((java.lang.Object)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v17));
    Object v19 = "string";
    Object v20 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v19));
    Object v21 = "string";
    Object v22 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v21));
    Object v23 = "string";
    Object v24 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v23));
    Object v25 = "string";
    Object v26 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v25));
    Object v27 = java.util.EnumSet.of(((java.lang.Enum)v20),((java.lang.Enum)v22),((java.lang.Enum)v24),((java.lang.Enum)v26));
    Object v28 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v27));
    Object v29 = ((java.lang.Class)v28).getDeclaredConstructors();
    Object v30 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0)._findSuperClassChain(((java.lang.reflect.Type)v18),((java.lang.Class)v28));
    org.junit.Assert.assertNotNull(v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = "string";
    Object v2 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v1));
    Object v3 = "string";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = "string";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = java.util.EnumSet.of(((java.lang.Enum)v2),((java.lang.Enum)v4),((java.lang.Enum)v6),((java.lang.Enum)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v9));
    Object v11 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v12 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).constructSimpleType(((java.lang.Class)v10),((com.fasterxml.jackson.databind.JavaType[])v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = "string";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = "string";
    Object v5 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v4));
    Object v6 = "string";
    Object v7 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v6));
    Object v8 = "string";
    Object v9 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v8));
    Object v10 = java.util.EnumSet.of(((java.lang.Enum)v3),((java.lang.Enum)v5),((java.lang.Enum)v7),((java.lang.Enum)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v10));
    Object v12 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v13 = ((com.fasterxml.jackson.databind.type.TypeFactory)v1).constructSimpleType(((java.lang.Class)v11),((com.fasterxml.jackson.databind.JavaType[])v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v15 = ((com.fasterxml.jackson.databind.type.TypeFactory)v14)._unknownType();
    Object v16 = ((com.fasterxml.jackson.databind.JavaType)v15).isFinal();
    Object v17 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).moreSpecificType(((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.JavaType)v15));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = "string";
    Object v2 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v1));
    Object v3 = "string";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = "string";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = java.util.EnumSet.of(((java.lang.Enum)v2),((java.lang.Enum)v4),((java.lang.Enum)v6),((java.lang.Enum)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = ((java.lang.Class)v11).getPackageName();
    Object v13 = "string";
    Object v14 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v13));
    Object v15 = "string";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v15));
    Object v17 = "string";
    Object v18 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v17));
    Object v19 = "string";
    Object v20 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v19));
    Object v21 = java.util.EnumSet.of(((java.lang.Enum)v14),((java.lang.Enum)v16),((java.lang.Enum)v18),((java.lang.Enum)v20));
    Object v22 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v21));
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v22));
    Object v24 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0)._findSuperTypeChain(((java.lang.Class)v11),((java.lang.Class)v23));
    org.junit.Assert.assertNotNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = "string";
    Object v2 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v1));
    Object v3 = "string";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = "string";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = java.util.EnumSet.of(((java.lang.Enum)v2),((java.lang.Enum)v4),((java.lang.Enum)v6),((java.lang.Enum)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v9));
    Object v11 = java.util.Map.of();
    Object v12 = "string";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v12));
    Object v14 = java.util.List.of(((java.lang.Object)v11),((java.lang.Object)v13));
    Object v15 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0)._fromParameterizedClass(((java.lang.Class)v10),((java.util.List)v14));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeFactory)v1)._unknownType();
    Object v3 = "string";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = "string";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = "string";
    Object v10 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v9));
    Object v11 = java.util.EnumSet.of(((java.lang.Enum)v4),((java.lang.Enum)v6),((java.lang.Enum)v8),((java.lang.Enum)v10));
    Object v12 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v11));
    Object v13 = new java.lang.String[]{"Can not construct SimpleType for an array (class: "};
    Object v14 = new com.fasterxml.jackson.databind.JavaType[]{null,null};
    Object v15 = java.util.Map.of();
    Object v16 = "string";
    Object v17 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v16));
    Object v18 = false;
    Object v19 = new com.fasterxml.jackson.databind.type.SimpleType(((java.lang.Class)v12),((java.lang.String[])v13),((com.fasterxml.jackson.databind.JavaType[])v14),((java.lang.Object)v15),((java.lang.Object)v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v19));
    Object v21 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).findTypeParameters(((com.fasterxml.jackson.databind.JavaType)v2),((java.lang.Class)v20));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = "string";
    Object v2 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v1));
    Object v3 = "string";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = "string";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = java.util.EnumSet.of(((java.lang.Enum)v2),((java.lang.Enum)v4),((java.lang.Enum)v6),((java.lang.Enum)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v9));
    Object v11 = "string";
    Object v12 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v11));
    Object v13 = "string";
    Object v14 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v13));
    Object v15 = "string";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v15));
    Object v17 = "string";
    Object v18 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v17));
    Object v19 = java.util.EnumSet.of(((java.lang.Enum)v12),((java.lang.Enum)v14),((java.lang.Enum)v16),((java.lang.Enum)v18));
    Object v20 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v19));
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = ((java.lang.Class)v21).getPackage();
    Object v23 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0)._findSuperInterfaceChain(((java.lang.reflect.Type)v10),((java.lang.Class)v21));
    org.junit.Assert.assertNotNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = "string";
    Object v2 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v1));
    Object v3 = "string";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = "string";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = java.util.EnumSet.of(((java.lang.Enum)v2),((java.lang.Enum)v4),((java.lang.Enum)v6),((java.lang.Enum)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = "string";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v12));
    Object v14 = "string";
    Object v15 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v14));
    Object v16 = "string";
    Object v17 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v16));
    Object v18 = "string";
    Object v19 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v18));
    Object v20 = java.util.EnumSet.of(((java.lang.Enum)v13),((java.lang.Enum)v15),((java.lang.Enum)v17),((java.lang.Enum)v19));
    Object v21 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v20));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v21));
    Object v23 = new com.fasterxml.jackson.databind.JavaType[]{null,null,null};
    Object v24 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).constructSimpleType(((java.lang.Class)v11),((java.lang.Class)v22),((com.fasterxml.jackson.databind.JavaType[])v23));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = "string";
    Object v2 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v1));
    Object v3 = "string";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = "string";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = java.util.EnumSet.of(((java.lang.Enum)v2),((java.lang.Enum)v4),((java.lang.Enum)v6),((java.lang.Enum)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v9));
    Object v11 = ">";
    Object v12 = ((java.lang.Class)v10).getResource(((java.lang.String)v11));
    Object v13 = "string";
    Object v14 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v13));
    Object v15 = "string";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v15));
    Object v17 = "string";
    Object v18 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v17));
    Object v19 = "string";
    Object v20 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v19));
    Object v21 = java.util.EnumSet.of(((java.lang.Enum)v14),((java.lang.Enum)v16),((java.lang.Enum)v18),((java.lang.Enum)v20));
    Object v22 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v21));
    Object v23 = ((java.lang.Class)v22).getAnnotations();
    Object v24 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v25 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).constructParametrizedType(((java.lang.Class)v10),((java.lang.Class)v22),((com.fasterxml.jackson.databind.JavaType[])v24));
    org.junit.Assert.assertNotNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeFactory)v1)._unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v4 = ((com.fasterxml.jackson.databind.type.TypeFactory)v3)._unknownType();
    Object v5 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).moreSpecificType(((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.JavaType)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = "string";
    Object v2 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v1));
    Object v3 = "string";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = "string";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = java.util.EnumSet.of(((java.lang.Enum)v2),((java.lang.Enum)v4),((java.lang.Enum)v6),((java.lang.Enum)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v9));
    Object v11 = "string";
    Object v12 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v11));
    Object v13 = "string";
    Object v14 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v13));
    Object v15 = "string";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v15));
    Object v17 = "string";
    Object v18 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v17));
    Object v19 = java.util.EnumSet.of(((java.lang.Enum)v12),((java.lang.Enum)v14),((java.lang.Enum)v16),((java.lang.Enum)v18));
    Object v20 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v19));
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = new java.lang.Class[]{null,null,null};
    Object v23 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).constructParametrizedType(((java.lang.Class)v10),((java.lang.Class)v21),((java.lang.Class[])v22));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeFactory)v1)._unknownType();
    Object v3 = "string";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = "string";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = "string";
    Object v10 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v9));
    Object v11 = java.util.EnumSet.of(((java.lang.Enum)v4),((java.lang.Enum)v6),((java.lang.Enum)v8),((java.lang.Enum)v10));
    Object v12 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v11));
    Object v13 = ((java.lang.Class)v12).getFields();
    Object v14 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0)._findSuperClassChain(((java.lang.reflect.Type)v2),((java.lang.Class)v12));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = "string";
    Object v2 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v1));
    Object v3 = "string";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = "string";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = java.util.EnumSet.of(((java.lang.Enum)v2),((java.lang.Enum)v4),((java.lang.Enum)v6),((java.lang.Enum)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v9));
    Object v11 = "string";
    Object v12 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v11));
    Object v13 = "string";
    Object v14 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v13));
    Object v15 = "string";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v15));
    Object v17 = "string";
    Object v18 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v17));
    Object v19 = java.util.EnumSet.of(((java.lang.Enum)v12),((java.lang.Enum)v14),((java.lang.Enum)v16),((java.lang.Enum)v18));
    Object v20 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v19));
    Object v21 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0)._findSuperTypeChain(((java.lang.Class)v10),((java.lang.Class)v20));
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = "string";
    Object v2 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v1));
    Object v3 = "string";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = "string";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = java.util.EnumSet.of(((java.lang.Enum)v2),((java.lang.Enum)v4),((java.lang.Enum)v6),((java.lang.Enum)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v9));
    Object v11 = "string";
    Object v12 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v11));
    Object v13 = "string";
    Object v14 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v13));
    Object v15 = "string";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v15));
    Object v17 = "string";
    Object v18 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v17));
    Object v19 = java.util.EnumSet.of(((java.lang.Enum)v12),((java.lang.Enum)v14),((java.lang.Enum)v16),((java.lang.Enum)v18));
    Object v20 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v19));
    Object v21 = ((java.lang.Class)v10).asSubclass(((java.lang.Class)v20));
    Object v22 = "string";
    Object v23 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v22));
    Object v24 = "string";
    Object v25 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v24));
    Object v26 = "string";
    Object v27 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v26));
    Object v28 = "string";
    Object v29 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v28));
    Object v30 = java.util.EnumSet.of(((java.lang.Enum)v23),((java.lang.Enum)v25),((java.lang.Enum)v27),((java.lang.Enum)v29));
    Object v31 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v30));
    Object v32 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v31));
    Object v33 = new java.lang.Class[]{};
    Object v34 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).constructParametrizedType(((java.lang.Class)v10),((java.lang.Class)v32),((java.lang.Class[])v33));
    org.junit.Assert.assertNotNull(v34);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = "string";
    Object v2 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v1));
    Object v3 = "string";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = "string";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = java.util.EnumSet.of(((java.lang.Enum)v2),((java.lang.Enum)v4),((java.lang.Enum)v6),((java.lang.Enum)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v9));
    Object v11 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).uncheckedSimpleType(((java.lang.Class)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = "string";
    Object v2 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v1));
    Object v3 = "string";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = "string";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = java.util.EnumSet.of(((java.lang.Enum)v2),((java.lang.Enum)v4),((java.lang.Enum)v6),((java.lang.Enum)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v13 = "string";
    Object v14 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v13));
    Object v15 = "string";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v15));
    Object v17 = "string";
    Object v18 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v17));
    Object v19 = "string";
    Object v20 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v19));
    Object v21 = java.util.EnumSet.of(((java.lang.Enum)v14),((java.lang.Enum)v16),((java.lang.Enum)v18),((java.lang.Enum)v20));
    Object v22 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v21));
    Object v23 = new java.lang.String[]{"Can not construct SimpleType for an array (class: "};
    Object v24 = new com.fasterxml.jackson.databind.JavaType[]{null,null};
    Object v25 = java.util.Map.of();
    Object v26 = "string";
    Object v27 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v26));
    Object v28 = false;
    Object v29 = new com.fasterxml.jackson.databind.type.SimpleType(((java.lang.Class)v22),((java.lang.String[])v23),((com.fasterxml.jackson.databind.JavaType[])v24),((java.lang.Object)v25),((java.lang.Object)v27),(((java.lang.Boolean)v28).booleanValue()));
    Object v30 = new com.fasterxml.jackson.databind.type.TypeBindings(((com.fasterxml.jackson.databind.type.TypeFactory)v12),((com.fasterxml.jackson.databind.JavaType)v29));
    Object v31 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0)._fromClass(((java.lang.Class)v11),((com.fasterxml.jackson.databind.type.TypeBindings)v30));
    org.junit.Assert.assertNotNull(v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = "string";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = "string";
    Object v5 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v4));
    Object v6 = "string";
    Object v7 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v6));
    Object v8 = "string";
    Object v9 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v8));
    Object v10 = java.util.EnumSet.of(((java.lang.Enum)v3),((java.lang.Enum)v5),((java.lang.Enum)v7),((java.lang.Enum)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v10));
    Object v12 = "string";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v12));
    Object v14 = "string";
    Object v15 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v14));
    Object v16 = "string";
    Object v17 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v16));
    Object v18 = "string";
    Object v19 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v18));
    Object v20 = java.util.EnumSet.of(((java.lang.Enum)v13),((java.lang.Enum)v15),((java.lang.Enum)v17),((java.lang.Enum)v19));
    Object v21 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v20));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v21));
    Object v23 = ((java.lang.Class)v22).getPackage();
    Object v24 = ((com.fasterxml.jackson.databind.type.TypeFactory)v1)._findSuperInterfaceChain(((java.lang.reflect.Type)v11),((java.lang.Class)v22));
    Object v25 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0)._hashMapSuperInterfaceChain(((com.fasterxml.jackson.databind.type.HierarchicType)v24));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = "string";
    Object v2 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v1));
    Object v3 = "string";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = "string";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = java.util.EnumSet.of(((java.lang.Enum)v2),((java.lang.Enum)v4),((java.lang.Enum)v6),((java.lang.Enum)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v9));
    Object v11 = "string";
    Object v12 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v11));
    Object v13 = "string";
    Object v14 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v13));
    Object v15 = "string";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v15));
    Object v17 = "string";
    Object v18 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v17));
    Object v19 = java.util.EnumSet.of(((java.lang.Enum)v12),((java.lang.Enum)v14),((java.lang.Enum)v16),((java.lang.Enum)v18));
    Object v20 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v19));
    Object v21 = new java.lang.String[]{"Can not construct SimpleType for an array (class: "};
    Object v22 = new com.fasterxml.jackson.databind.JavaType[]{null,null};
    Object v23 = java.util.Map.of();
    Object v24 = "string";
    Object v25 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v24));
    Object v26 = false;
    Object v27 = new com.fasterxml.jackson.databind.type.SimpleType(((java.lang.Class)v20),((java.lang.String[])v21),((com.fasterxml.jackson.databind.JavaType[])v22),((java.lang.Object)v23),((java.lang.Object)v25),(((java.lang.Boolean)v26).booleanValue()));
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v27));
    Object v29 = new com.fasterxml.jackson.databind.JavaType[]{null,null};
    Object v30 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).constructParametrizedType(((java.lang.Class)v10),((java.lang.Class)v28),((com.fasterxml.jackson.databind.JavaType[])v29));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = "string";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = "string";
    Object v5 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v4));
    Object v6 = "string";
    Object v7 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v6));
    Object v8 = "string";
    Object v9 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v8));
    Object v10 = java.util.EnumSet.of(((java.lang.Enum)v3),((java.lang.Enum)v5),((java.lang.Enum)v7),((java.lang.Enum)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v10));
    Object v12 = ((com.fasterxml.jackson.databind.type.TypeFactory)v1).uncheckedSimpleType(((java.lang.Class)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v15 = "string";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v15));
    Object v17 = "string";
    Object v18 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v17));
    Object v19 = "string";
    Object v20 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v19));
    Object v21 = "string";
    Object v22 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v21));
    Object v23 = java.util.EnumSet.of(((java.lang.Enum)v16),((java.lang.Enum)v18),((java.lang.Enum)v20),((java.lang.Enum)v22));
    Object v24 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v23));
    Object v25 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v26 = ((com.fasterxml.jackson.databind.type.TypeFactory)v14).constructSimpleType(((java.lang.Class)v24),((com.fasterxml.jackson.databind.JavaType[])v25));
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v28 = ((com.fasterxml.jackson.databind.type.TypeFactory)v27)._unknownType();
    Object v29 = ((com.fasterxml.jackson.databind.JavaType)v28).isFinal();
    Object v30 = ((com.fasterxml.jackson.databind.type.TypeFactory)v13).moreSpecificType(((com.fasterxml.jackson.databind.JavaType)v26),((com.fasterxml.jackson.databind.JavaType)v28));
    Object v31 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).moreSpecificType(((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.JavaType)v30));
    org.junit.Assert.assertNotNull(v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeFactory)v1)._unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v4 = "string";
    Object v5 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v4));
    Object v6 = "string";
    Object v7 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v6));
    Object v8 = "string";
    Object v9 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v8));
    Object v10 = "string";
    Object v11 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v10));
    Object v12 = java.util.EnumSet.of(((java.lang.Enum)v5),((java.lang.Enum)v7),((java.lang.Enum)v9),((java.lang.Enum)v11));
    Object v13 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v12));
    Object v14 = java.util.Map.of();
    Object v15 = "string";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v15));
    Object v17 = java.util.List.of(((java.lang.Object)v14),((java.lang.Object)v16));
    Object v18 = ((com.fasterxml.jackson.databind.type.TypeFactory)v3)._fromParameterizedClass(((java.lang.Class)v13),((java.util.List)v17));
    Object v19 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).constructType(((java.lang.reflect.Type)v2),((com.fasterxml.jackson.databind.JavaType)v18));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = "string";
    Object v2 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v1));
    Object v3 = "string";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = "string";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = java.util.EnumSet.of(((java.lang.Enum)v2),((java.lang.Enum)v4),((java.lang.Enum)v6),((java.lang.Enum)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v9));
    Object v11 = new java.lang.String[]{"Can not construct SimpleType for an array (class: "};
    Object v12 = new com.fasterxml.jackson.databind.JavaType[]{null,null};
    Object v13 = java.util.Map.of();
    Object v14 = "string";
    Object v15 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v14));
    Object v16 = false;
    Object v17 = new com.fasterxml.jackson.databind.type.SimpleType(((java.lang.Class)v10),((java.lang.String[])v11),((com.fasterxml.jackson.databind.JavaType[])v12),((java.lang.Object)v13),((java.lang.Object)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v17));
    Object v19 = java.util.Map.of();
    Object v20 = "string";
    Object v21 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v20));
    Object v22 = java.util.List.of(((java.lang.Object)v19),((java.lang.Object)v21));
    Object v23 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0)._fromParameterizedClass(((java.lang.Class)v18),((java.util.List)v22));
    org.junit.Assert.assertNotNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = "string";
    Object v2 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v1));
    Object v3 = "string";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = "string";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = java.util.EnumSet.of(((java.lang.Enum)v2),((java.lang.Enum)v4),((java.lang.Enum)v6),((java.lang.Enum)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v9));
    Object v11 = ((java.lang.Class)v10).getConstructors();
    Object v12 = java.util.Map.of();
    Object v13 = "string";
    Object v14 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v13));
    Object v15 = java.util.List.of(((java.lang.Object)v12),((java.lang.Object)v14));
    Object v16 = ((java.util.List)v15).hashCode();
    Object v17 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0)._fromParameterizedClass(((java.lang.Class)v10),((java.util.List)v15));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = "string";
    Object v2 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v1));
    Object v3 = "string";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = "string";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = java.util.EnumSet.of(((java.lang.Enum)v2),((java.lang.Enum)v4),((java.lang.Enum)v6),((java.lang.Enum)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v9));
    Object v11 = "string";
    Object v12 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v11));
    Object v13 = "string";
    Object v14 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v13));
    Object v15 = "string";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v15));
    Object v17 = "string";
    Object v18 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v17));
    Object v19 = java.util.EnumSet.of(((java.lang.Enum)v12),((java.lang.Enum)v14),((java.lang.Enum)v16),((java.lang.Enum)v18));
    Object v20 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v19));
    Object v21 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).findTypeParameters(((java.lang.Class)v10),((java.lang.Class)v20));
    org.junit.Assert.assertNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeFactory)v1)._unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v4 = "string";
    Object v5 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v4));
    Object v6 = "string";
    Object v7 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v6));
    Object v8 = "string";
    Object v9 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v8));
    Object v10 = "string";
    Object v11 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v10));
    Object v12 = java.util.EnumSet.of(((java.lang.Enum)v5),((java.lang.Enum)v7),((java.lang.Enum)v9),((java.lang.Enum)v11));
    Object v13 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v12));
    Object v14 = new java.lang.String[]{"Can not construct SimpleType for an array (class: "};
    Object v15 = new com.fasterxml.jackson.databind.JavaType[]{null,null};
    Object v16 = java.util.Map.of();
    Object v17 = "string";
    Object v18 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v17));
    Object v19 = false;
    Object v20 = new com.fasterxml.jackson.databind.type.SimpleType(((java.lang.Class)v13),((java.lang.String[])v14),((com.fasterxml.jackson.databind.JavaType[])v15),((java.lang.Object)v16),((java.lang.Object)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = new com.fasterxml.jackson.databind.type.TypeBindings(((com.fasterxml.jackson.databind.type.TypeFactory)v3),((com.fasterxml.jackson.databind.JavaType)v20));
    Object v22 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).constructType(((java.lang.reflect.Type)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v21));
    org.junit.Assert.assertNotNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = "string";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = "string";
    Object v5 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v4));
    Object v6 = "string";
    Object v7 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v6));
    Object v8 = "string";
    Object v9 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v8));
    Object v10 = java.util.EnumSet.of(((java.lang.Enum)v3),((java.lang.Enum)v5),((java.lang.Enum)v7),((java.lang.Enum)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v10));
    Object v12 = java.util.Map.of();
    Object v13 = "string";
    Object v14 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v13));
    Object v15 = java.util.List.of(((java.lang.Object)v12),((java.lang.Object)v14));
    Object v16 = ((com.fasterxml.jackson.databind.type.TypeFactory)v1)._fromParameterizedClass(((java.lang.Class)v11),((java.util.List)v15));
    Object v17 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).constructType(((java.lang.reflect.Type)v16));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = "string";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = "string";
    Object v5 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v4));
    Object v6 = "string";
    Object v7 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v6));
    Object v8 = "string";
    Object v9 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v8));
    Object v10 = java.util.EnumSet.of(((java.lang.Enum)v3),((java.lang.Enum)v5),((java.lang.Enum)v7),((java.lang.Enum)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v10));
    Object v12 = java.util.Map.of();
    Object v13 = "string";
    Object v14 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v13));
    Object v15 = java.util.List.of(((java.lang.Object)v12),((java.lang.Object)v14));
    Object v16 = ((com.fasterxml.jackson.databind.type.TypeFactory)v1)._fromParameterizedClass(((java.lang.Class)v11),((java.util.List)v15));
    Object v17 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).constructType(((java.lang.reflect.Type)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v17));
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = "string";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = "string";
    Object v5 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v4));
    Object v6 = "string";
    Object v7 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v6));
    Object v8 = "string";
    Object v9 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v8));
    Object v10 = java.util.EnumSet.of(((java.lang.Enum)v3),((java.lang.Enum)v5),((java.lang.Enum)v7),((java.lang.Enum)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v10));
    Object v12 = "string";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v12));
    Object v14 = "string";
    Object v15 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v14));
    Object v16 = "string";
    Object v17 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v16));
    Object v18 = "string";
    Object v19 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v18));
    Object v20 = java.util.EnumSet.of(((java.lang.Enum)v13),((java.lang.Enum)v15),((java.lang.Enum)v17),((java.lang.Enum)v19));
    Object v21 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v20));
    Object v22 = ((com.fasterxml.jackson.databind.type.TypeFactory)v1)._findSuperInterfaceChain(((java.lang.reflect.Type)v11),((java.lang.Class)v21));
    Object v23 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0)._hashMapSuperInterfaceChain(((com.fasterxml.jackson.databind.type.HierarchicType)v22));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = "string";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = "string";
    Object v5 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v4));
    Object v6 = "string";
    Object v7 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v6));
    Object v8 = "string";
    Object v9 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v8));
    Object v10 = java.util.EnumSet.of(((java.lang.Enum)v3),((java.lang.Enum)v5),((java.lang.Enum)v7),((java.lang.Enum)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = ((java.lang.Class)v12).getPackageName();
    Object v14 = "string";
    Object v15 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v14));
    Object v16 = "string";
    Object v17 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v16));
    Object v18 = "string";
    Object v19 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v18));
    Object v20 = "string";
    Object v21 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v20));
    Object v22 = java.util.EnumSet.of(((java.lang.Enum)v15),((java.lang.Enum)v17),((java.lang.Enum)v19),((java.lang.Enum)v21));
    Object v23 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v22));
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v23));
    Object v25 = ((com.fasterxml.jackson.databind.type.TypeFactory)v1)._findSuperTypeChain(((java.lang.Class)v12),((java.lang.Class)v24));
    Object v26 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0)._arrayListSuperInterfaceChain(((com.fasterxml.jackson.databind.type.HierarchicType)v25));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = "string";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = "string";
    Object v5 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v4));
    Object v6 = "string";
    Object v7 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v6));
    Object v8 = "string";
    Object v9 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v8));
    Object v10 = java.util.EnumSet.of(((java.lang.Enum)v3),((java.lang.Enum)v5),((java.lang.Enum)v7),((java.lang.Enum)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v10));
    Object v12 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v13 = ((com.fasterxml.jackson.databind.type.TypeFactory)v1).constructSimpleType(((java.lang.Class)v11),((com.fasterxml.jackson.databind.JavaType[])v12));
    Object v14 = "string";
    Object v15 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v14));
    Object v16 = "string";
    Object v17 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v16));
    Object v18 = "string";
    Object v19 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v18));
    Object v20 = "string";
    Object v21 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v20));
    Object v22 = java.util.EnumSet.of(((java.lang.Enum)v15),((java.lang.Enum)v17),((java.lang.Enum)v19),((java.lang.Enum)v21));
    Object v23 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v22));
    Object v24 = new java.lang.String[]{"Can not construct SimpleType for an array (class: "};
    Object v25 = new com.fasterxml.jackson.databind.JavaType[]{null,null};
    Object v26 = java.util.Map.of();
    Object v27 = "string";
    Object v28 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v27));
    Object v29 = false;
    Object v30 = new com.fasterxml.jackson.databind.type.SimpleType(((java.lang.Class)v23),((java.lang.String[])v24),((com.fasterxml.jackson.databind.JavaType[])v25),((java.lang.Object)v26),((java.lang.Object)v28),(((java.lang.Boolean)v29).booleanValue()));
    Object v31 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v30));
    Object v32 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).constructType(((java.lang.reflect.Type)v13),((java.lang.Class)v31));
    org.junit.Assert.assertNotNull(v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = "AnnotationIntrspector returned Converter definition of type ";
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).constructFromCanonical(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = "string";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = "string";
    Object v5 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v4));
    Object v6 = "string";
    Object v7 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v6));
    Object v8 = "string";
    Object v9 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v8));
    Object v10 = java.util.EnumSet.of(((java.lang.Enum)v3),((java.lang.Enum)v5),((java.lang.Enum)v7),((java.lang.Enum)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v10));
    Object v12 = "string";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v12));
    Object v14 = "string";
    Object v15 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v14));
    Object v16 = "string";
    Object v17 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v16));
    Object v18 = "string";
    Object v19 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v18));
    Object v20 = java.util.EnumSet.of(((java.lang.Enum)v13),((java.lang.Enum)v15),((java.lang.Enum)v17),((java.lang.Enum)v19));
    Object v21 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v20));
    Object v22 = ((com.fasterxml.jackson.databind.type.TypeFactory)v1)._findSuperTypeChain(((java.lang.Class)v11),((java.lang.Class)v21));
    Object v23 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0)._arrayListSuperInterfaceChain(((com.fasterxml.jackson.databind.type.HierarchicType)v22));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = "string";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = "string";
    Object v5 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v4));
    Object v6 = "string";
    Object v7 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v6));
    Object v8 = "string";
    Object v9 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v8));
    Object v10 = java.util.EnumSet.of(((java.lang.Enum)v3),((java.lang.Enum)v5),((java.lang.Enum)v7),((java.lang.Enum)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v10));
    Object v12 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v13 = ((com.fasterxml.jackson.databind.type.TypeFactory)v1).constructSimpleType(((java.lang.Class)v11),((com.fasterxml.jackson.databind.JavaType[])v12));
    Object v14 = "string";
    Object v15 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v14));
    Object v16 = "string";
    Object v17 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v16));
    Object v18 = "string";
    Object v19 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v18));
    Object v20 = "string";
    Object v21 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v20));
    Object v22 = java.util.EnumSet.of(((java.lang.Enum)v15),((java.lang.Enum)v17),((java.lang.Enum)v19),((java.lang.Enum)v21));
    Object v23 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v22));
    Object v24 = new java.lang.String[]{"Can not construct SimpleType for an array (class: "};
    Object v25 = new com.fasterxml.jackson.databind.JavaType[]{null,null};
    Object v26 = java.util.Map.of();
    Object v27 = "string";
    Object v28 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v27));
    Object v29 = false;
    Object v30 = new com.fasterxml.jackson.databind.type.SimpleType(((java.lang.Class)v23),((java.lang.String[])v24),((com.fasterxml.jackson.databind.JavaType[])v25),((java.lang.Object)v26),((java.lang.Object)v28),(((java.lang.Boolean)v29).booleanValue()));
    Object v31 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v30));
    Object v32 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).constructType(((java.lang.reflect.Type)v13),((java.lang.Class)v31));
    Object v33 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v32));
    org.junit.Assert.assertNotNull(v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = "string";
    Object v2 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v1));
    Object v3 = "string";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = "string";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = java.util.EnumSet.of(((java.lang.Enum)v2),((java.lang.Enum)v4),((java.lang.Enum)v6),((java.lang.Enum)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v9));
    Object v11 = "string";
    Object v12 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v11));
    Object v13 = "string";
    Object v14 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v13));
    Object v15 = "string";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v15));
    Object v17 = "string";
    Object v18 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v17));
    Object v19 = java.util.EnumSet.of(((java.lang.Enum)v12),((java.lang.Enum)v14),((java.lang.Enum)v16),((java.lang.Enum)v18));
    Object v20 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v19));
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).constructCollectionType(((java.lang.Class)v10),((java.lang.Class)v21));
    org.junit.Assert.assertNotNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = "string";
    Object v2 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v1));
    Object v3 = "string";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = "string";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = java.util.EnumSet.of(((java.lang.Enum)v2),((java.lang.Enum)v4),((java.lang.Enum)v6),((java.lang.Enum)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = "string";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v12));
    Object v14 = "string";
    Object v15 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v14));
    Object v16 = "string";
    Object v17 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v16));
    Object v18 = "string";
    Object v19 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v18));
    Object v20 = java.util.EnumSet.of(((java.lang.Enum)v13),((java.lang.Enum)v15),((java.lang.Enum)v17),((java.lang.Enum)v19));
    Object v21 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v20));
    Object v22 = ((java.lang.Class)v11).isAnnotationPresent(((java.lang.Class)v21));
    Object v23 = "string";
    Object v24 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v23));
    Object v25 = "string";
    Object v26 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v25));
    Object v27 = "string";
    Object v28 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v27));
    Object v29 = "string";
    Object v30 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v29));
    Object v31 = java.util.EnumSet.of(((java.lang.Enum)v24),((java.lang.Enum)v26),((java.lang.Enum)v28),((java.lang.Enum)v30));
    Object v32 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v31));
    Object v33 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v32));
    Object v34 = ((java.lang.Class)v33).getSuperclass();
    Object v35 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0)._findSuperTypeChain(((java.lang.Class)v11),((java.lang.Class)v33));
    org.junit.Assert.assertNotNull(v35);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = "string";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = "string";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = "string";
    Object v10 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v9));
    Object v11 = java.util.EnumSet.of(((java.lang.Enum)v4),((java.lang.Enum)v6),((java.lang.Enum)v8),((java.lang.Enum)v10));
    Object v12 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v11));
    Object v13 = java.util.Map.of();
    Object v14 = "string";
    Object v15 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v14));
    Object v16 = java.util.List.of(((java.lang.Object)v13),((java.lang.Object)v15));
    Object v17 = ((com.fasterxml.jackson.databind.type.TypeFactory)v2)._fromParameterizedClass(((java.lang.Class)v12),((java.util.List)v16));
    Object v18 = ((com.fasterxml.jackson.databind.type.TypeFactory)v1).constructType(((java.lang.reflect.Type)v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = java.util.Map.of();
    Object v21 = ((java.lang.Class)v19).isInstance(((java.lang.Object)v20));
    Object v22 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v23 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).constructParametricType(((java.lang.Class)v19),((com.fasterxml.jackson.databind.JavaType[])v22));
    org.junit.Assert.assertNotNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = "string";
    Object v2 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v1));
    Object v3 = "string";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = "string";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = java.util.EnumSet.of(((java.lang.Enum)v2),((java.lang.Enum)v4),((java.lang.Enum)v6),((java.lang.Enum)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).constructArrayType(((java.lang.Class)v11));
    Object v13 = "string";
    Object v14 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v13));
    Object v15 = "string";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v15));
    Object v17 = "string";
    Object v18 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v17));
    Object v19 = "string";
    Object v20 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v19));
    Object v21 = java.util.EnumSet.of(((java.lang.Enum)v14),((java.lang.Enum)v16),((java.lang.Enum)v18),((java.lang.Enum)v20));
    Object v22 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v21));
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v22));
    Object v24 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v25 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).constructSimpleType(((java.lang.Class)v23),((com.fasterxml.jackson.databind.JavaType[])v24));
    org.junit.Assert.assertNotNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = "string";
    Object v2 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v1));
    Object v3 = "string";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = "string";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = java.util.EnumSet.of(((java.lang.Enum)v2),((java.lang.Enum)v4),((java.lang.Enum)v6),((java.lang.Enum)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v9));
    Object v11 = ((java.lang.Class)v10).getGenericSuperclass();
    Object v12 = "string";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v12));
    Object v14 = "string";
    Object v15 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v14));
    Object v16 = "string";
    Object v17 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v16));
    Object v18 = "string";
    Object v19 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v18));
    Object v20 = java.util.EnumSet.of(((java.lang.Enum)v13),((java.lang.Enum)v15),((java.lang.Enum)v17),((java.lang.Enum)v19));
    Object v21 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v20));
    Object v22 = new java.lang.Class[]{null,null,null};
    Object v23 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).constructParametrizedType(((java.lang.Class)v10),((java.lang.Class)v21),((java.lang.Class[])v22));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = "string";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = "string";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = "string";
    Object v10 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v9));
    Object v11 = java.util.EnumSet.of(((java.lang.Enum)v4),((java.lang.Enum)v6),((java.lang.Enum)v8),((java.lang.Enum)v10));
    Object v12 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v11));
    Object v13 = java.util.Map.of();
    Object v14 = "string";
    Object v15 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v14));
    Object v16 = java.util.List.of(((java.lang.Object)v13),((java.lang.Object)v15));
    Object v17 = ((com.fasterxml.jackson.databind.type.TypeFactory)v2)._fromParameterizedClass(((java.lang.Class)v12),((java.util.List)v16));
    Object v18 = ((com.fasterxml.jackson.databind.type.TypeFactory)v1).constructType(((java.lang.reflect.Type)v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v21 = "string";
    Object v22 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v21));
    Object v23 = "string";
    Object v24 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v23));
    Object v25 = "string";
    Object v26 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v25));
    Object v27 = "string";
    Object v28 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v27));
    Object v29 = java.util.EnumSet.of(((java.lang.Enum)v22),((java.lang.Enum)v24),((java.lang.Enum)v26),((java.lang.Enum)v28));
    Object v30 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v29));
    Object v31 = new java.lang.String[]{"Can not construct SimpleType for an array (class: "};
    Object v32 = new com.fasterxml.jackson.databind.JavaType[]{null,null};
    Object v33 = java.util.Map.of();
    Object v34 = "string";
    Object v35 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v34));
    Object v36 = false;
    Object v37 = new com.fasterxml.jackson.databind.type.SimpleType(((java.lang.Class)v30),((java.lang.String[])v31),((com.fasterxml.jackson.databind.JavaType[])v32),((java.lang.Object)v33),((java.lang.Object)v35),(((java.lang.Boolean)v36).booleanValue()));
    Object v38 = new com.fasterxml.jackson.databind.type.TypeBindings(((com.fasterxml.jackson.databind.type.TypeFactory)v20),((com.fasterxml.jackson.databind.JavaType)v37));
    Object v39 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0)._fromClass(((java.lang.Class)v19),((com.fasterxml.jackson.databind.type.TypeBindings)v38));
    org.junit.Assert.assertNotNull(v39);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeFactory)v1)._unknownType();
    Object v3 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).constructType(((java.lang.reflect.Type)v2));
    Object v4 = "string";
    Object v5 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v4));
    Object v6 = "string";
    Object v7 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v6));
    Object v8 = "string";
    Object v9 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v8));
    Object v10 = "string";
    Object v11 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v10));
    Object v12 = java.util.EnumSet.of(((java.lang.Enum)v5),((java.lang.Enum)v7),((java.lang.Enum)v9),((java.lang.Enum)v11));
    Object v13 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v12));
    Object v14 = "string";
    Object v15 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v14));
    Object v16 = "string";
    Object v17 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v16));
    Object v18 = "string";
    Object v19 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v18));
    Object v20 = "string";
    Object v21 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v20));
    Object v22 = java.util.EnumSet.of(((java.lang.Enum)v15),((java.lang.Enum)v17),((java.lang.Enum)v19),((java.lang.Enum)v21));
    Object v23 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v22));
    Object v24 = "string";
    Object v25 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v24));
    Object v26 = "string";
    Object v27 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v26));
    Object v28 = "string";
    Object v29 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v28));
    Object v30 = "string";
    Object v31 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v30));
    Object v32 = java.util.EnumSet.of(((java.lang.Enum)v25),((java.lang.Enum)v27),((java.lang.Enum)v29),((java.lang.Enum)v31));
    Object v33 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v32));
    Object v34 = ((java.lang.Class)v23).isAssignableFrom(((java.lang.Class)v33));
    Object v35 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0)._findSuperInterfaceChain(((java.lang.reflect.Type)v13),((java.lang.Class)v23));
    org.junit.Assert.assertNotNull(v35);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = "string";
    Object v2 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v1));
    Object v3 = "string";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = "string";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = java.util.EnumSet.of(((java.lang.Enum)v2),((java.lang.Enum)v4),((java.lang.Enum)v6),((java.lang.Enum)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = "string";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v12));
    Object v14 = "string";
    Object v15 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v14));
    Object v16 = "string";
    Object v17 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v16));
    Object v18 = "string";
    Object v19 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v18));
    Object v20 = java.util.EnumSet.of(((java.lang.Enum)v13),((java.lang.Enum)v15),((java.lang.Enum)v17),((java.lang.Enum)v19));
    Object v21 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v20));
    Object v22 = new java.lang.String[]{"Can not construct SimpleType for an array (class: "};
    Object v23 = new com.fasterxml.jackson.databind.JavaType[]{null,null};
    Object v24 = java.util.Map.of();
    Object v25 = "string";
    Object v26 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v25));
    Object v27 = false;
    Object v28 = new com.fasterxml.jackson.databind.type.SimpleType(((java.lang.Class)v21),((java.lang.String[])v22),((com.fasterxml.jackson.databind.JavaType[])v23),((java.lang.Object)v24),((java.lang.Object)v26),(((java.lang.Boolean)v27).booleanValue()));
    Object v29 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v28));
    Object v30 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v31 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).constructParametrizedType(((java.lang.Class)v11),((java.lang.Class)v29),((com.fasterxml.jackson.databind.JavaType[])v30));
    org.junit.Assert.assertNotNull(v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = "string";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = "string";
    Object v5 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v4));
    Object v6 = "string";
    Object v7 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v6));
    Object v8 = "string";
    Object v9 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v8));
    Object v10 = java.util.EnumSet.of(((java.lang.Enum)v3),((java.lang.Enum)v5),((java.lang.Enum)v7),((java.lang.Enum)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v10));
    Object v12 = "string";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v12));
    Object v14 = "string";
    Object v15 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v14));
    Object v16 = "string";
    Object v17 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v16));
    Object v18 = "string";
    Object v19 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v18));
    Object v20 = java.util.EnumSet.of(((java.lang.Enum)v13),((java.lang.Enum)v15),((java.lang.Enum)v17),((java.lang.Enum)v19));
    Object v21 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v20));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v21));
    Object v23 = ((java.lang.Class)v22).getPackage();
    Object v24 = ((com.fasterxml.jackson.databind.type.TypeFactory)v1)._findSuperInterfaceChain(((java.lang.reflect.Type)v11),((java.lang.Class)v22));
    Object v25 = ((com.fasterxml.jackson.databind.type.HierarchicType)v24).deepCloneWithoutSubtype();
    Object v26 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0)._hashMapSuperInterfaceChain(((com.fasterxml.jackson.databind.type.HierarchicType)v24));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = "string";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = "string";
    Object v5 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v4));
    Object v6 = "string";
    Object v7 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v6));
    Object v8 = "string";
    Object v9 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v8));
    Object v10 = java.util.EnumSet.of(((java.lang.Enum)v3),((java.lang.Enum)v5),((java.lang.Enum)v7),((java.lang.Enum)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = "string";
    Object v14 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v13));
    Object v15 = "string";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v15));
    Object v17 = "string";
    Object v18 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v17));
    Object v19 = "string";
    Object v20 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v19));
    Object v21 = java.util.EnumSet.of(((java.lang.Enum)v14),((java.lang.Enum)v16),((java.lang.Enum)v18),((java.lang.Enum)v20));
    Object v22 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v21));
    Object v23 = ((java.lang.Class)v12).isAnnotationPresent(((java.lang.Class)v22));
    Object v24 = "string";
    Object v25 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v24));
    Object v26 = "string";
    Object v27 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v26));
    Object v28 = "string";
    Object v29 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v28));
    Object v30 = "string";
    Object v31 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v30));
    Object v32 = java.util.EnumSet.of(((java.lang.Enum)v25),((java.lang.Enum)v27),((java.lang.Enum)v29),((java.lang.Enum)v31));
    Object v33 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v32));
    Object v34 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v33));
    Object v35 = ((java.lang.Class)v34).getSuperclass();
    Object v36 = ((com.fasterxml.jackson.databind.type.TypeFactory)v1)._findSuperTypeChain(((java.lang.Class)v12),((java.lang.Class)v34));
    Object v37 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0)._arrayListSuperInterfaceChain(((com.fasterxml.jackson.databind.type.HierarchicType)v36));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeFactory)v1)._unknownType();
    Object v3 = "string";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = "string";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = "string";
    Object v10 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v9));
    Object v11 = java.util.EnumSet.of(((java.lang.Enum)v4),((java.lang.Enum)v6),((java.lang.Enum)v8),((java.lang.Enum)v10));
    Object v12 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v11));
    Object v13 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).constructSpecializedType(((com.fasterxml.jackson.databind.JavaType)v2),((java.lang.Class)v12));
    Object v14 = "string";
    Object v15 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v14));
    Object v16 = "string";
    Object v17 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v16));
    Object v18 = "string";
    Object v19 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v18));
    Object v20 = "string";
    Object v21 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v20));
    Object v22 = java.util.EnumSet.of(((java.lang.Enum)v15),((java.lang.Enum)v17),((java.lang.Enum)v19),((java.lang.Enum)v21));
    Object v23 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v22));
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v23));
    Object v25 = "string";
    Object v26 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v25));
    Object v27 = "string";
    Object v28 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v27));
    Object v29 = "string";
    Object v30 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v29));
    Object v31 = "string";
    Object v32 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v31));
    Object v33 = java.util.EnumSet.of(((java.lang.Enum)v26),((java.lang.Enum)v28),((java.lang.Enum)v30),((java.lang.Enum)v32));
    Object v34 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v33));
    Object v35 = ((java.lang.Class)v34).toString();
    Object v36 = new java.lang.Class[]{};
    Object v37 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).constructParametrizedType(((java.lang.Class)v24),((java.lang.Class)v34),((java.lang.Class[])v36));
    org.junit.Assert.assertNotNull(v37);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = "string";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = "string";
    Object v5 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v4));
    Object v6 = "string";
    Object v7 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v6));
    Object v8 = "string";
    Object v9 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v8));
    Object v10 = java.util.EnumSet.of(((java.lang.Enum)v3),((java.lang.Enum)v5),((java.lang.Enum)v7),((java.lang.Enum)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v10));
    Object v12 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v13 = ((com.fasterxml.jackson.databind.type.TypeFactory)v1).constructSimpleType(((java.lang.Class)v11),((com.fasterxml.jackson.databind.JavaType[])v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v16 = ((com.fasterxml.jackson.databind.type.TypeFactory)v15)._unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v18 = ((com.fasterxml.jackson.databind.type.TypeFactory)v17)._unknownType();
    Object v19 = ((com.fasterxml.jackson.databind.type.TypeFactory)v14).moreSpecificType(((com.fasterxml.jackson.databind.JavaType)v16),((com.fasterxml.jackson.databind.JavaType)v18));
    Object v20 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).moreSpecificType(((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.JavaType)v19));
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = "string";
    Object v2 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v1));
    Object v3 = "string";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = "string";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = java.util.EnumSet.of(((java.lang.Enum)v2),((java.lang.Enum)v4),((java.lang.Enum)v6),((java.lang.Enum)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v9));
    Object v11 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).constructRawCollectionLikeType(((java.lang.Class)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = "string";
    Object v2 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v1));
    Object v3 = "string";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = "string";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = java.util.EnumSet.of(((java.lang.Enum)v2),((java.lang.Enum)v4),((java.lang.Enum)v6),((java.lang.Enum)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v9));
    Object v11 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).constructRawCollectionType(((java.lang.Class)v10));
    Object v12 = "string";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v12));
    Object v14 = "string";
    Object v15 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v14));
    Object v16 = "string";
    Object v17 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v16));
    Object v18 = "string";
    Object v19 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v18));
    Object v20 = java.util.EnumSet.of(((java.lang.Enum)v13),((java.lang.Enum)v15),((java.lang.Enum)v17),((java.lang.Enum)v19));
    Object v21 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v20));
    Object v22 = "string";
    Object v23 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v22));
    Object v24 = "string";
    Object v25 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v24));
    Object v26 = "string";
    Object v27 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v26));
    Object v28 = "string";
    Object v29 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v28));
    Object v30 = java.util.EnumSet.of(((java.lang.Enum)v23),((java.lang.Enum)v25),((java.lang.Enum)v27),((java.lang.Enum)v29));
    Object v31 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v30));
    Object v32 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v31));
    Object v33 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v34 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).constructParametrizedType(((java.lang.Class)v21),((java.lang.Class)v32),((com.fasterxml.jackson.databind.JavaType[])v33));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = "string";
    Object v2 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v1));
    Object v3 = "string";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = "string";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = java.util.EnumSet.of(((java.lang.Enum)v2),((java.lang.Enum)v4),((java.lang.Enum)v6),((java.lang.Enum)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v9));
    Object v11 = new java.lang.String[]{"Can not construct SimpleType for an array (class: "};
    Object v12 = new com.fasterxml.jackson.databind.JavaType[]{null,null};
    Object v13 = java.util.Map.of();
    Object v14 = "string";
    Object v15 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v14));
    Object v16 = false;
    Object v17 = new com.fasterxml.jackson.databind.type.SimpleType(((java.lang.Class)v10),((java.lang.String[])v11),((com.fasterxml.jackson.databind.JavaType[])v12),((java.lang.Object)v13),((java.lang.Object)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v17));
    Object v19 = "string";
    Object v20 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v19));
    Object v21 = "string";
    Object v22 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v21));
    Object v23 = "string";
    Object v24 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v23));
    Object v25 = "string";
    Object v26 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v25));
    Object v27 = java.util.EnumSet.of(((java.lang.Enum)v20),((java.lang.Enum)v22),((java.lang.Enum)v24),((java.lang.Enum)v26));
    Object v28 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v27));
    Object v29 = ((java.lang.Class)v28).getPackage();
    Object v30 = new com.fasterxml.jackson.databind.JavaType[]{null,null,null};
    Object v31 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).constructParametrizedType(((java.lang.Class)v18),((java.lang.Class)v28),((com.fasterxml.jackson.databind.JavaType[])v30));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    ((com.fasterxml.jackson.databind.type.TypeFactory)v0).clearCache();
    Object v1 = null;
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = "string";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = "string";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = "string";
    Object v10 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v9));
    Object v11 = java.util.EnumSet.of(((java.lang.Enum)v4),((java.lang.Enum)v6),((java.lang.Enum)v8),((java.lang.Enum)v10));
    Object v12 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v11));
    Object v13 = new java.lang.String[]{"Can not construct SimpleType for an array (class: "};
    Object v14 = new com.fasterxml.jackson.databind.JavaType[]{null,null};
    Object v15 = java.util.Map.of();
    Object v16 = "string";
    Object v17 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v16));
    Object v18 = false;
    Object v19 = new com.fasterxml.jackson.databind.type.SimpleType(((java.lang.Class)v12),((java.lang.String[])v13),((com.fasterxml.jackson.databind.JavaType[])v14),((java.lang.Object)v15),((java.lang.Object)v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v19));
    Object v21 = java.util.Map.of();
    Object v22 = "string";
    Object v23 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v22));
    Object v24 = java.util.List.of(((java.lang.Object)v21),((java.lang.Object)v23));
    Object v25 = ((com.fasterxml.jackson.databind.type.TypeFactory)v2)._fromParameterizedClass(((java.lang.Class)v20),((java.util.List)v24));
    Object v26 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).constructType(((java.lang.reflect.Type)v25));
    org.junit.Assert.assertNotNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeFactory)v1)._unknownType();
    Object v3 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).constructType(((java.lang.reflect.Type)v2));
    Object v4 = "string";
    Object v5 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v4));
    Object v6 = "string";
    Object v7 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v6));
    Object v8 = "string";
    Object v9 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v8));
    Object v10 = "string";
    Object v11 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v10));
    Object v12 = java.util.EnumSet.of(((java.lang.Enum)v5),((java.lang.Enum)v7),((java.lang.Enum)v9),((java.lang.Enum)v11));
    Object v13 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v12));
    Object v14 = new java.lang.String[]{"Can not construct SimpleType for an array (class: "};
    Object v15 = new com.fasterxml.jackson.databind.JavaType[]{null,null};
    Object v16 = java.util.Map.of();
    Object v17 = "string";
    Object v18 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v17));
    Object v19 = false;
    Object v20 = new com.fasterxml.jackson.databind.type.SimpleType(((java.lang.Class)v13),((java.lang.String[])v14),((com.fasterxml.jackson.databind.JavaType[])v15),((java.lang.Object)v16),((java.lang.Object)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).constructArrayType(((java.lang.Class)v21));
    org.junit.Assert.assertNotNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = ((com.fasterxml.jackson.databind.type.TypeFactory)v2)._unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v5 = ((com.fasterxml.jackson.databind.type.TypeFactory)v4)._unknownType();
    Object v6 = ((com.fasterxml.jackson.databind.type.TypeFactory)v1).moreSpecificType(((com.fasterxml.jackson.databind.JavaType)v3),((com.fasterxml.jackson.databind.JavaType)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v9 = ((com.fasterxml.jackson.databind.type.TypeFactory)v8)._unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v11 = "string";
    Object v12 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v11));
    Object v13 = "string";
    Object v14 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v13));
    Object v15 = "string";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v15));
    Object v17 = "string";
    Object v18 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v17));
    Object v19 = java.util.EnumSet.of(((java.lang.Enum)v12),((java.lang.Enum)v14),((java.lang.Enum)v16),((java.lang.Enum)v18));
    Object v20 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v19));
    Object v21 = java.util.Map.of();
    Object v22 = "string";
    Object v23 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v22));
    Object v24 = java.util.List.of(((java.lang.Object)v21),((java.lang.Object)v23));
    Object v25 = ((com.fasterxml.jackson.databind.type.TypeFactory)v10)._fromParameterizedClass(((java.lang.Class)v20),((java.util.List)v24));
    Object v26 = ((com.fasterxml.jackson.databind.type.TypeFactory)v7).constructType(((java.lang.reflect.Type)v9),((com.fasterxml.jackson.databind.JavaType)v25));
    Object v27 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).moreSpecificType(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.JavaType)v26));
    org.junit.Assert.assertNotNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = "string";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = "string";
    Object v5 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v4));
    Object v6 = "string";
    Object v7 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v6));
    Object v8 = "string";
    Object v9 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v8));
    Object v10 = java.util.EnumSet.of(((java.lang.Enum)v3),((java.lang.Enum)v5),((java.lang.Enum)v7),((java.lang.Enum)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = ((com.fasterxml.jackson.databind.type.TypeFactory)v1).constructArrayType(((java.lang.Class)v12));
    Object v14 = "string";
    Object v15 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v14));
    Object v16 = "string";
    Object v17 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v16));
    Object v18 = "string";
    Object v19 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v18));
    Object v20 = "string";
    Object v21 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v20));
    Object v22 = java.util.EnumSet.of(((java.lang.Enum)v15),((java.lang.Enum)v17),((java.lang.Enum)v19),((java.lang.Enum)v21));
    Object v23 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v22));
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v23));
    Object v25 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v26 = ((com.fasterxml.jackson.databind.type.TypeFactory)v1).constructSimpleType(((java.lang.Class)v24),((com.fasterxml.jackson.databind.JavaType[])v25));
    Object v27 = "string";
    Object v28 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v27));
    Object v29 = "string";
    Object v30 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v29));
    Object v31 = "string";
    Object v32 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v31));
    Object v33 = "string";
    Object v34 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v33));
    Object v35 = java.util.EnumSet.of(((java.lang.Enum)v28),((java.lang.Enum)v30),((java.lang.Enum)v32),((java.lang.Enum)v34));
    Object v36 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v35));
    Object v37 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v36));
    Object v38 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).constructType(((java.lang.reflect.Type)v26),((java.lang.Class)v37));
    org.junit.Assert.assertNotNull(v38);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = "string";
    Object v2 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v1));
    Object v3 = "string";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = "string";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = java.util.EnumSet.of(((java.lang.Enum)v2),((java.lang.Enum)v4),((java.lang.Enum)v6),((java.lang.Enum)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v9));
    Object v11 = new java.lang.String[]{"Can not construct SimpleType for an array (class: "};
    Object v12 = new com.fasterxml.jackson.databind.JavaType[]{null,null};
    Object v13 = java.util.Map.of();
    Object v14 = "string";
    Object v15 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v14));
    Object v16 = false;
    Object v17 = new com.fasterxml.jackson.databind.type.SimpleType(((java.lang.Class)v10),((java.lang.String[])v11),((com.fasterxml.jackson.databind.JavaType[])v12),((java.lang.Object)v13),((java.lang.Object)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v17));
    Object v19 = "string";
    Object v20 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v19));
    Object v21 = "string";
    Object v22 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v21));
    Object v23 = "string";
    Object v24 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v23));
    Object v25 = "string";
    Object v26 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v25));
    Object v27 = java.util.EnumSet.of(((java.lang.Enum)v20),((java.lang.Enum)v22),((java.lang.Enum)v24),((java.lang.Enum)v26));
    Object v28 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v27));
    Object v29 = ((java.lang.Class)v28).toGenericString();
    Object v30 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).constructCollectionLikeType(((java.lang.Class)v18),((java.lang.Class)v28));
    org.junit.Assert.assertNotNull(v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeFactory)v1)._unknownType();
    Object v3 = 1;
    Object v4 = ((com.fasterxml.jackson.databind.JavaType)v2).containedTypeOrUnknown((((java.lang.Integer)v3).intValue()));
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = "string";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = "string";
    Object v10 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v9));
    Object v11 = "string";
    Object v12 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v11));
    Object v13 = java.util.EnumSet.of(((java.lang.Enum)v6),((java.lang.Enum)v8),((java.lang.Enum)v10),((java.lang.Enum)v12));
    Object v14 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v13));
    Object v15 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).constructSpecializedType(((com.fasterxml.jackson.databind.JavaType)v2),((java.lang.Class)v14));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = "string";
    Object v2 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v1));
    Object v3 = "string";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = "string";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = java.util.EnumSet.of(((java.lang.Enum)v2),((java.lang.Enum)v4),((java.lang.Enum)v6),((java.lang.Enum)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v9));
    Object v11 = new java.lang.String[]{"Can not construct SimpleType for an array (class: "};
    Object v12 = new com.fasterxml.jackson.databind.JavaType[]{null,null};
    Object v13 = java.util.Map.of();
    Object v14 = "string";
    Object v15 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v14));
    Object v16 = false;
    Object v17 = new com.fasterxml.jackson.databind.type.SimpleType(((java.lang.Class)v10),((java.lang.String[])v11),((com.fasterxml.jackson.databind.JavaType[])v12),((java.lang.Object)v13),((java.lang.Object)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v17));
    Object v19 = "string";
    Object v20 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v19));
    Object v21 = "string";
    Object v22 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v21));
    Object v23 = "string";
    Object v24 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v23));
    Object v25 = "string";
    Object v26 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v25));
    Object v27 = java.util.EnumSet.of(((java.lang.Enum)v20),((java.lang.Enum)v22),((java.lang.Enum)v24),((java.lang.Enum)v26));
    Object v28 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v27));
    Object v29 = ((java.lang.Class)v18).getAnnotation(((java.lang.Class)v28));
    Object v30 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).constructArrayType(((java.lang.Class)v18));
    org.junit.Assert.assertNotNull(v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = "string";
    Object v2 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v1));
    Object v3 = "string";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = "string";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = java.util.EnumSet.of(((java.lang.Enum)v2),((java.lang.Enum)v4),((java.lang.Enum)v6),((java.lang.Enum)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v9));
    Object v11 = new java.lang.String[]{"Can not construct SimpleType for an array (class: "};
    Object v12 = new com.fasterxml.jackson.databind.JavaType[]{null,null};
    Object v13 = java.util.Map.of();
    Object v14 = "string";
    Object v15 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v14));
    Object v16 = false;
    Object v17 = new com.fasterxml.jackson.databind.type.SimpleType(((java.lang.Class)v10),((java.lang.String[])v11),((com.fasterxml.jackson.databind.JavaType[])v12),((java.lang.Object)v13),((java.lang.Object)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v19 = "string";
    Object v20 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v19));
    Object v21 = "string";
    Object v22 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v21));
    Object v23 = "string";
    Object v24 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v23));
    Object v25 = "string";
    Object v26 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v25));
    Object v27 = java.util.EnumSet.of(((java.lang.Enum)v20),((java.lang.Enum)v22),((java.lang.Enum)v24),((java.lang.Enum)v26));
    Object v28 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v27));
    Object v29 = new java.lang.String[]{"Can not construct SimpleType for an array (class: "};
    Object v30 = new com.fasterxml.jackson.databind.JavaType[]{null,null};
    Object v31 = java.util.Map.of();
    Object v32 = "string";
    Object v33 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v32));
    Object v34 = false;
    Object v35 = new com.fasterxml.jackson.databind.type.SimpleType(((java.lang.Class)v28),((java.lang.String[])v29),((com.fasterxml.jackson.databind.JavaType[])v30),((java.lang.Object)v31),((java.lang.Object)v33),(((java.lang.Boolean)v34).booleanValue()));
    Object v36 = new com.fasterxml.jackson.databind.type.TypeBindings(((com.fasterxml.jackson.databind.type.TypeFactory)v18),((com.fasterxml.jackson.databind.JavaType)v35));
    Object v37 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0)._constructType(((java.lang.reflect.Type)v17),((com.fasterxml.jackson.databind.type.TypeBindings)v36));
    org.junit.Assert.assertNotNull(v37);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeFactory)v1)._unknownType();
    Object v3 = "string";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = "string";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = "string";
    Object v10 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v9));
    Object v11 = java.util.EnumSet.of(((java.lang.Enum)v4),((java.lang.Enum)v6),((java.lang.Enum)v8),((java.lang.Enum)v10));
    Object v12 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0)._findSuperClassChain(((java.lang.reflect.Type)v2),((java.lang.Class)v13));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = ((com.fasterxml.jackson.databind.type.TypeFactory)v2)._unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v5 = ((com.fasterxml.jackson.databind.type.TypeFactory)v4)._unknownType();
    Object v6 = ((com.fasterxml.jackson.databind.type.TypeFactory)v1).moreSpecificType(((com.fasterxml.jackson.databind.JavaType)v3),((com.fasterxml.jackson.databind.JavaType)v5));
    Object v7 = "string";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = "string";
    Object v10 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v9));
    Object v11 = "string";
    Object v12 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v11));
    Object v13 = "string";
    Object v14 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v13));
    Object v15 = java.util.EnumSet.of(((java.lang.Enum)v8),((java.lang.Enum)v10),((java.lang.Enum)v12),((java.lang.Enum)v14));
    Object v16 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v15));
    Object v17 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0)._findSuperInterfaceChain(((java.lang.reflect.Type)v6),((java.lang.Class)v16));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    ((com.fasterxml.jackson.databind.type.TypeFactory)v0).clearCache();
    Object v1 = null;
    Object v2 = "string";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = "string";
    Object v5 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v4));
    Object v6 = "string";
    Object v7 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v6));
    Object v8 = "string";
    Object v9 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v8));
    Object v10 = java.util.EnumSet.of(((java.lang.Enum)v3),((java.lang.Enum)v5),((java.lang.Enum)v7),((java.lang.Enum)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v10));
    Object v12 = new java.lang.String[]{"Can not construct SimpleType for an array (class: "};
    Object v13 = new com.fasterxml.jackson.databind.JavaType[]{null,null};
    Object v14 = java.util.Map.of();
    Object v15 = "string";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v15));
    Object v17 = false;
    Object v18 = new com.fasterxml.jackson.databind.type.SimpleType(((java.lang.Class)v11),((java.lang.String[])v12),((com.fasterxml.jackson.databind.JavaType[])v13),((java.lang.Object)v14),((java.lang.Object)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = java.util.Map.of();
    Object v21 = "string";
    Object v22 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v21));
    Object v23 = java.util.List.of(((java.lang.Object)v20),((java.lang.Object)v22));
    Object v24 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0)._fromParameterizedClass(((java.lang.Class)v19),((java.util.List)v23));
    org.junit.Assert.assertNotNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = "string";
    Object v2 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v1));
    Object v3 = "string";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = "string";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = java.util.EnumSet.of(((java.lang.Enum)v2),((java.lang.Enum)v4),((java.lang.Enum)v6),((java.lang.Enum)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).constructRawCollectionType(((java.lang.Class)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = ((com.fasterxml.jackson.databind.type.TypeFactory)v2)._unknownType();
    Object v4 = ((com.fasterxml.jackson.databind.type.TypeFactory)v1).constructType(((java.lang.reflect.Type)v3));
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = "string";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = "string";
    Object v10 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v9));
    Object v11 = "string";
    Object v12 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v11));
    Object v13 = java.util.EnumSet.of(((java.lang.Enum)v6),((java.lang.Enum)v8),((java.lang.Enum)v10),((java.lang.Enum)v12));
    Object v14 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v13));
    Object v15 = "string";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v15));
    Object v17 = "string";
    Object v18 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v17));
    Object v19 = "string";
    Object v20 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v19));
    Object v21 = "string";
    Object v22 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v21));
    Object v23 = java.util.EnumSet.of(((java.lang.Enum)v16),((java.lang.Enum)v18),((java.lang.Enum)v20),((java.lang.Enum)v22));
    Object v24 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v23));
    Object v25 = "string";
    Object v26 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v25));
    Object v27 = "string";
    Object v28 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v27));
    Object v29 = "string";
    Object v30 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v29));
    Object v31 = "string";
    Object v32 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v31));
    Object v33 = java.util.EnumSet.of(((java.lang.Enum)v26),((java.lang.Enum)v28),((java.lang.Enum)v30),((java.lang.Enum)v32));
    Object v34 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v33));
    Object v35 = ((java.lang.Class)v24).isAssignableFrom(((java.lang.Class)v34));
    Object v36 = ((com.fasterxml.jackson.databind.type.TypeFactory)v1)._findSuperInterfaceChain(((java.lang.reflect.Type)v14),((java.lang.Class)v24));
    Object v37 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0)._arrayListSuperInterfaceChain(((com.fasterxml.jackson.databind.type.HierarchicType)v36));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0)._unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = "string";
    Object v2 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v1));
    Object v3 = "string";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = "string";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = java.util.EnumSet.of(((java.lang.Enum)v2),((java.lang.Enum)v4),((java.lang.Enum)v6),((java.lang.Enum)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).constructRawCollectionType(((java.lang.Class)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v15 = ((com.fasterxml.jackson.databind.type.TypeFactory)v14)._unknownType();
    Object v16 = 1;
    Object v17 = ((com.fasterxml.jackson.databind.JavaType)v15).containedTypeOrUnknown((((java.lang.Integer)v16).intValue()));
    Object v18 = "string";
    Object v19 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v18));
    Object v20 = "string";
    Object v21 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v20));
    Object v22 = "string";
    Object v23 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v22));
    Object v24 = "string";
    Object v25 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v24));
    Object v26 = java.util.EnumSet.of(((java.lang.Enum)v19),((java.lang.Enum)v21),((java.lang.Enum)v23),((java.lang.Enum)v25));
    Object v27 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v26));
    Object v28 = ((com.fasterxml.jackson.databind.type.TypeFactory)v13).constructSpecializedType(((com.fasterxml.jackson.databind.JavaType)v15),((java.lang.Class)v27));
    Object v29 = "string";
    Object v30 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v29));
    Object v31 = "string";
    Object v32 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v31));
    Object v33 = "string";
    Object v34 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v33));
    Object v35 = "string";
    Object v36 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v35));
    Object v37 = java.util.EnumSet.of(((java.lang.Enum)v30),((java.lang.Enum)v32),((java.lang.Enum)v34),((java.lang.Enum)v36));
    Object v38 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v37));
    Object v39 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).findTypeParameters(((com.fasterxml.jackson.databind.JavaType)v28),((java.lang.Class)v38));
    org.junit.Assert.assertNull(v39);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeFactory)v1)._unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = "string";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = "string";
    Object v10 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v9));
    Object v11 = "string";
    Object v12 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v11));
    Object v13 = java.util.EnumSet.of(((java.lang.Enum)v6),((java.lang.Enum)v8),((java.lang.Enum)v10),((java.lang.Enum)v12));
    Object v14 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v13));
    Object v15 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v16 = ((com.fasterxml.jackson.databind.type.TypeFactory)v4).constructSimpleType(((java.lang.Class)v14),((com.fasterxml.jackson.databind.JavaType[])v15));
    Object v17 = "string";
    Object v18 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v17));
    Object v19 = "string";
    Object v20 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v19));
    Object v21 = "string";
    Object v22 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v21));
    Object v23 = "string";
    Object v24 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v23));
    Object v25 = java.util.EnumSet.of(((java.lang.Enum)v18),((java.lang.Enum)v20),((java.lang.Enum)v22),((java.lang.Enum)v24));
    Object v26 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v25));
    Object v27 = new java.lang.String[]{"Can not construct SimpleType for an array (class: "};
    Object v28 = new com.fasterxml.jackson.databind.JavaType[]{null,null};
    Object v29 = java.util.Map.of();
    Object v30 = "string";
    Object v31 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v30));
    Object v32 = false;
    Object v33 = new com.fasterxml.jackson.databind.type.SimpleType(((java.lang.Class)v26),((java.lang.String[])v27),((com.fasterxml.jackson.databind.JavaType[])v28),((java.lang.Object)v29),((java.lang.Object)v31),(((java.lang.Boolean)v32).booleanValue()));
    Object v34 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v33));
    Object v35 = ((com.fasterxml.jackson.databind.type.TypeFactory)v3).constructType(((java.lang.reflect.Type)v16),((java.lang.Class)v34));
    Object v36 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v35));
    Object v37 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).findTypeParameters(((com.fasterxml.jackson.databind.JavaType)v2),((java.lang.Class)v36));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeFactory)v1)._unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = "string";
    Object v5 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v4));
    Object v6 = "string";
    Object v7 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v6));
    Object v8 = "string";
    Object v9 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v8));
    Object v10 = "string";
    Object v11 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v10));
    Object v12 = java.util.EnumSet.of(((java.lang.Enum)v5),((java.lang.Enum)v7),((java.lang.Enum)v9),((java.lang.Enum)v11));
    Object v13 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v12));
    Object v14 = new java.lang.String[]{"Can not construct SimpleType for an array (class: "};
    Object v15 = new com.fasterxml.jackson.databind.JavaType[]{null,null};
    Object v16 = java.util.Map.of();
    Object v17 = "string";
    Object v18 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v17));
    Object v19 = false;
    Object v20 = new com.fasterxml.jackson.databind.type.SimpleType(((java.lang.Class)v13),((java.lang.String[])v14),((com.fasterxml.jackson.databind.JavaType[])v15),((java.lang.Object)v16),((java.lang.Object)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = new com.fasterxml.jackson.databind.JavaType[]{null,null,null};
    Object v23 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).constructParametrizedType(((java.lang.Class)v3),((java.lang.Class)v21),((com.fasterxml.jackson.databind.JavaType[])v22));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeFactory)v1)._unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).constructRawMapLikeType(((java.lang.Class)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeFactory)v1)._unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v5 = ((com.fasterxml.jackson.databind.type.TypeFactory)v4)._unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = java.util.Map.of();
    Object v8 = "string";
    Object v9 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v8));
    Object v10 = java.util.List.of(((java.lang.Object)v7),((java.lang.Object)v9));
    Object v11 = ((java.lang.Class)v6).cast(((java.lang.Object)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v13 = "string";
    Object v14 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v13));
    Object v15 = "string";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v15));
    Object v17 = "string";
    Object v18 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v17));
    Object v19 = "string";
    Object v20 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v19));
    Object v21 = java.util.EnumSet.of(((java.lang.Enum)v14),((java.lang.Enum)v16),((java.lang.Enum)v18),((java.lang.Enum)v20));
    Object v22 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v21));
    Object v23 = new java.lang.String[]{"Can not construct SimpleType for an array (class: "};
    Object v24 = new com.fasterxml.jackson.databind.JavaType[]{null,null};
    Object v25 = java.util.Map.of();
    Object v26 = "string";
    Object v27 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v26));
    Object v28 = false;
    Object v29 = new com.fasterxml.jackson.databind.type.SimpleType(((java.lang.Class)v22),((java.lang.String[])v23),((com.fasterxml.jackson.databind.JavaType[])v24),((java.lang.Object)v25),((java.lang.Object)v27),(((java.lang.Boolean)v28).booleanValue()));
    Object v30 = new com.fasterxml.jackson.databind.type.TypeBindings(((com.fasterxml.jackson.databind.type.TypeFactory)v12),((com.fasterxml.jackson.databind.JavaType)v29));
    Object v31 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).findTypeParameters(((java.lang.Class)v3),((java.lang.Class)v6),((com.fasterxml.jackson.databind.type.TypeBindings)v30));
    org.junit.Assert.assertNull(v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = "string";
    Object v2 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v1));
    Object v3 = "string";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = "string";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = java.util.EnumSet.of(((java.lang.Enum)v2),((java.lang.Enum)v4),((java.lang.Enum)v6),((java.lang.Enum)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v9));
    Object v11 = new java.lang.String[]{"Can not construct SimpleType for an array (class: "};
    Object v12 = new com.fasterxml.jackson.databind.JavaType[]{null,null};
    Object v13 = java.util.Map.of();
    Object v14 = "string";
    Object v15 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v14));
    Object v16 = false;
    Object v17 = new com.fasterxml.jackson.databind.type.SimpleType(((java.lang.Class)v10),((java.lang.String[])v11),((com.fasterxml.jackson.databind.JavaType[])v12),((java.lang.Object)v13),((java.lang.Object)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = "string";
    Object v19 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v18));
    Object v20 = "string";
    Object v21 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v20));
    Object v22 = "string";
    Object v23 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v22));
    Object v24 = "string";
    Object v25 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v24));
    Object v26 = java.util.EnumSet.of(((java.lang.Enum)v19),((java.lang.Enum)v21),((java.lang.Enum)v23),((java.lang.Enum)v25));
    Object v27 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v26));
    Object v28 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).constructSpecializedType(((com.fasterxml.jackson.databind.JavaType)v17),((java.lang.Class)v27));
    org.junit.Assert.assertNotNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeFactory)v1)._unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = java.util.Map.of();
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v6));
    Object v8 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0)._fromParameterizedClass(((java.lang.Class)v3),((java.util.List)v7));
      org.junit.Assert.fail("Expected java.lang.ArrayStoreException");
    } catch (java.lang.ArrayStoreException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeFactory)v1)._unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v5 = ((com.fasterxml.jackson.databind.type.TypeFactory)v4)._unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = ((java.lang.Class)v6).isLocalClass();
    Object v8 = new java.lang.Class[]{};
    Object v9 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).constructParametrizedType(((java.lang.Class)v3),((java.lang.Class)v6),((java.lang.Class[])v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = "string";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = "string";
    Object v5 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v4));
    Object v6 = "string";
    Object v7 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v6));
    Object v8 = "string";
    Object v9 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v8));
    Object v10 = java.util.EnumSet.of(((java.lang.Enum)v3),((java.lang.Enum)v5),((java.lang.Enum)v7),((java.lang.Enum)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = ((com.fasterxml.jackson.databind.type.TypeFactory)v1).constructRawCollectionType(((java.lang.Class)v12));
    Object v14 = "string";
    Object v15 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v14));
    Object v16 = "string";
    Object v17 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v16));
    Object v18 = "string";
    Object v19 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v18));
    Object v20 = "string";
    Object v21 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v20));
    Object v22 = java.util.EnumSet.of(((java.lang.Enum)v15),((java.lang.Enum)v17),((java.lang.Enum)v19),((java.lang.Enum)v21));
    Object v23 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v22));
    Object v24 = new java.lang.String[]{"Can not construct SimpleType for an array (class: "};
    Object v25 = new com.fasterxml.jackson.databind.JavaType[]{null,null};
    Object v26 = java.util.Map.of();
    Object v27 = "string";
    Object v28 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v27));
    Object v29 = false;
    Object v30 = new com.fasterxml.jackson.databind.type.SimpleType(((java.lang.Class)v23),((java.lang.String[])v24),((com.fasterxml.jackson.databind.JavaType[])v25),((java.lang.Object)v26),((java.lang.Object)v28),(((java.lang.Boolean)v29).booleanValue()));
    Object v31 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v30));
    Object v32 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).findTypeParameters(((com.fasterxml.jackson.databind.JavaType)v13),((java.lang.Class)v31));
    org.junit.Assert.assertNull(v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeFactory)v1)._unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = java.util.Map.of();
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = java.util.List.of(((java.lang.Object)v4),((java.lang.Object)v6));
    Object v8 = ((java.lang.Class)v3).cast(((java.lang.Object)v7));
    Object v9 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).constructRawCollectionType(((java.lang.Class)v3));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeFactory)v1)._unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = "string";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = "string";
    Object v10 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v9));
    Object v11 = "string";
    Object v12 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v11));
    Object v13 = java.util.EnumSet.of(((java.lang.Enum)v6),((java.lang.Enum)v8),((java.lang.Enum)v10),((java.lang.Enum)v12));
    Object v14 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v13));
    Object v15 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v16 = ((com.fasterxml.jackson.databind.type.TypeFactory)v4).constructSimpleType(((java.lang.Class)v14),((com.fasterxml.jackson.databind.JavaType[])v15));
    Object v17 = "string";
    Object v18 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v17));
    Object v19 = "string";
    Object v20 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v19));
    Object v21 = "string";
    Object v22 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v21));
    Object v23 = "string";
    Object v24 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v23));
    Object v25 = java.util.EnumSet.of(((java.lang.Enum)v18),((java.lang.Enum)v20),((java.lang.Enum)v22),((java.lang.Enum)v24));
    Object v26 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v25));
    Object v27 = new java.lang.String[]{"Can not construct SimpleType for an array (class: "};
    Object v28 = new com.fasterxml.jackson.databind.JavaType[]{null,null};
    Object v29 = java.util.Map.of();
    Object v30 = "string";
    Object v31 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v30));
    Object v32 = false;
    Object v33 = new com.fasterxml.jackson.databind.type.SimpleType(((java.lang.Class)v26),((java.lang.String[])v27),((com.fasterxml.jackson.databind.JavaType[])v28),((java.lang.Object)v29),((java.lang.Object)v31),(((java.lang.Boolean)v32).booleanValue()));
    Object v34 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v33));
    Object v35 = ((com.fasterxml.jackson.databind.type.TypeFactory)v3).constructType(((java.lang.reflect.Type)v16),((java.lang.Class)v34));
    Object v36 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).constructType(((java.lang.reflect.Type)v2),((com.fasterxml.jackson.databind.JavaType)v35));
    org.junit.Assert.assertNotNull(v36);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeFactory)v1)._unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = "string";
    Object v5 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v4));
    Object v6 = "string";
    Object v7 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v6));
    Object v8 = "string";
    Object v9 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v8));
    Object v10 = "string";
    Object v11 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v10));
    Object v12 = java.util.EnumSet.of(((java.lang.Enum)v5),((java.lang.Enum)v7),((java.lang.Enum)v9),((java.lang.Enum)v11));
    Object v13 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v12));
    Object v14 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).constructCollectionLikeType(((java.lang.Class)v3),((java.lang.Class)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v16 = ((com.fasterxml.jackson.databind.type.TypeFactory)v15)._unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v19 = ((com.fasterxml.jackson.databind.type.TypeFactory)v18)._unknownType();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v19));
    Object v21 = ((java.lang.Class)v20).toGenericString();
    Object v22 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0)._findSuperTypeChain(((java.lang.Class)v17),((java.lang.Class)v20));
    org.junit.Assert.assertNotNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = "string";
    Object v2 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v1));
    Object v3 = "string";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v3));
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = "string";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = java.util.EnumSet.of(((java.lang.Enum)v2),((java.lang.Enum)v4),((java.lang.Enum)v6),((java.lang.Enum)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = ((java.lang.Class)v11).getEnclosingConstructor();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v14 = ((com.fasterxml.jackson.databind.type.TypeFactory)v13)._unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v14));
    Object v16 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v17 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).constructParametrizedType(((java.lang.Class)v11),((java.lang.Class)v15),((com.fasterxml.jackson.databind.JavaType[])v16));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = ((com.fasterxml.jackson.databind.type.TypeFactory)v2)._unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = java.util.Map.of();
    Object v6 = "string";
    Object v7 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v6));
    Object v8 = java.util.List.of(((java.lang.Object)v5),((java.lang.Object)v7));
    Object v9 = ((java.lang.Class)v4).cast(((java.lang.Object)v8));
    Object v10 = ((com.fasterxml.jackson.databind.type.TypeFactory)v1).constructRawCollectionType(((java.lang.Class)v4));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v12 = ((com.fasterxml.jackson.databind.type.TypeFactory)v11)._unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = ((com.fasterxml.jackson.databind.JavaType)v10).withTypeHandler(((java.lang.Object)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v16 = ((com.fasterxml.jackson.databind.type.TypeFactory)v15)._unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).findTypeParameters(((com.fasterxml.jackson.databind.JavaType)v10),((java.lang.Class)v17));
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = "string";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = "string";
    Object v5 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v4));
    Object v6 = "string";
    Object v7 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v6));
    Object v8 = "string";
    Object v9 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v8));
    Object v10 = java.util.EnumSet.of(((java.lang.Enum)v3),((java.lang.Enum)v5),((java.lang.Enum)v7),((java.lang.Enum)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v10));
    Object v12 = java.util.Map.of();
    Object v13 = "string";
    Object v14 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v13));
    Object v15 = java.util.List.of(((java.lang.Object)v12),((java.lang.Object)v14));
    Object v16 = ((com.fasterxml.jackson.databind.type.TypeFactory)v1)._fromParameterizedClass(((java.lang.Class)v11),((java.util.List)v15));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v18 = ((com.fasterxml.jackson.databind.type.TypeFactory)v17)._unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).constructType(((java.lang.reflect.Type)v16),((java.lang.Class)v19));
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeFactory)v1)._unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v5 = "string";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v5));
    Object v7 = "string";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = "string";
    Object v10 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v9));
    Object v11 = "string";
    Object v12 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v11));
    Object v13 = java.util.EnumSet.of(((java.lang.Enum)v6),((java.lang.Enum)v8),((java.lang.Enum)v10),((java.lang.Enum)v12));
    Object v14 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v13));
    Object v15 = new java.lang.String[]{"Can not construct SimpleType for an array (class: "};
    Object v16 = new com.fasterxml.jackson.databind.JavaType[]{null,null};
    Object v17 = java.util.Map.of();
    Object v18 = "string";
    Object v19 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v18));
    Object v20 = false;
    Object v21 = new com.fasterxml.jackson.databind.type.SimpleType(((java.lang.Class)v14),((java.lang.String[])v15),((com.fasterxml.jackson.databind.JavaType[])v16),((java.lang.Object)v17),((java.lang.Object)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = new com.fasterxml.jackson.databind.type.TypeBindings(((com.fasterxml.jackson.databind.type.TypeFactory)v4),((com.fasterxml.jackson.databind.JavaType)v21));
    Object v23 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0)._constructType(((java.lang.reflect.Type)v3),((com.fasterxml.jackson.databind.type.TypeBindings)v22));
    org.junit.Assert.assertNotNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = "string";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = "string";
    Object v5 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v4));
    Object v6 = "string";
    Object v7 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v6));
    Object v8 = "string";
    Object v9 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v8));
    Object v10 = java.util.EnumSet.of(((java.lang.Enum)v3),((java.lang.Enum)v5),((java.lang.Enum)v7),((java.lang.Enum)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v10));
    Object v12 = "string";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v12));
    Object v14 = "string";
    Object v15 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v14));
    Object v16 = "string";
    Object v17 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v16));
    Object v18 = "string";
    Object v19 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v18));
    Object v20 = java.util.EnumSet.of(((java.lang.Enum)v13),((java.lang.Enum)v15),((java.lang.Enum)v17),((java.lang.Enum)v19));
    Object v21 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v20));
    Object v22 = ((com.fasterxml.jackson.databind.type.TypeFactory)v1)._findSuperTypeChain(((java.lang.Class)v11),((java.lang.Class)v21));
    Object v23 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0)._hashMapSuperInterfaceChain(((com.fasterxml.jackson.databind.type.HierarchicType)v22));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeFactory)v1)._unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).constructRawMapType(((java.lang.Class)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = "string";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = "string";
    Object v5 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v4));
    Object v6 = "string";
    Object v7 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v6));
    Object v8 = "string";
    Object v9 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v8));
    Object v10 = java.util.EnumSet.of(((java.lang.Enum)v3),((java.lang.Enum)v5),((java.lang.Enum)v7),((java.lang.Enum)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v10));
    Object v12 = "string";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v12));
    Object v14 = "string";
    Object v15 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v14));
    Object v16 = "string";
    Object v17 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v16));
    Object v18 = "string";
    Object v19 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v18));
    Object v20 = java.util.EnumSet.of(((java.lang.Enum)v13),((java.lang.Enum)v15),((java.lang.Enum)v17),((java.lang.Enum)v19));
    Object v21 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v20));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v21));
    Object v23 = ((java.lang.Class)v22).getPackage();
    Object v24 = ((com.fasterxml.jackson.databind.type.TypeFactory)v1)._findSuperInterfaceChain(((java.lang.reflect.Type)v11),((java.lang.Class)v22));
    Object v25 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0)._arrayListSuperInterfaceChain(((com.fasterxml.jackson.databind.type.HierarchicType)v24));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = "string";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = "string";
    Object v5 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v4));
    Object v6 = "string";
    Object v7 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v6));
    Object v8 = "string";
    Object v9 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v8));
    Object v10 = java.util.EnumSet.of(((java.lang.Enum)v3),((java.lang.Enum)v5),((java.lang.Enum)v7),((java.lang.Enum)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = "string";
    Object v14 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v13));
    Object v15 = "string";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v15));
    Object v17 = "string";
    Object v18 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v17));
    Object v19 = "string";
    Object v20 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v19));
    Object v21 = java.util.EnumSet.of(((java.lang.Enum)v14),((java.lang.Enum)v16),((java.lang.Enum)v18),((java.lang.Enum)v20));
    Object v22 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v21));
    Object v23 = new java.lang.String[]{"Can not construct SimpleType for an array (class: "};
    Object v24 = new com.fasterxml.jackson.databind.JavaType[]{null,null};
    Object v25 = java.util.Map.of();
    Object v26 = "string";
    Object v27 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v26));
    Object v28 = false;
    Object v29 = new com.fasterxml.jackson.databind.type.SimpleType(((java.lang.Class)v22),((java.lang.String[])v23),((com.fasterxml.jackson.databind.JavaType[])v24),((java.lang.Object)v25),((java.lang.Object)v27),(((java.lang.Boolean)v28).booleanValue()));
    Object v30 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v29));
    Object v31 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v32 = ((com.fasterxml.jackson.databind.type.TypeFactory)v1).constructParametrizedType(((java.lang.Class)v12),((java.lang.Class)v30),((com.fasterxml.jackson.databind.JavaType[])v31));
    Object v33 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).constructArrayType(((com.fasterxml.jackson.databind.JavaType)v32));
    org.junit.Assert.assertNotNull(v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeFactory)v1)._unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v5 = ((com.fasterxml.jackson.databind.type.TypeFactory)v4)._unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v8 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).constructParametrizedType(((java.lang.Class)v3),((java.lang.Class)v6),((com.fasterxml.jackson.databind.JavaType[])v7));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = "string";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v2));
    Object v4 = "string";
    Object v5 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v4));
    Object v6 = "string";
    Object v7 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v6));
    Object v8 = "string";
    Object v9 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v8));
    Object v10 = java.util.EnumSet.of(((java.lang.Enum)v3),((java.lang.Enum)v5),((java.lang.Enum)v7),((java.lang.Enum)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v10));
    Object v12 = "string";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v12));
    Object v14 = "string";
    Object v15 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v14));
    Object v16 = "string";
    Object v17 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v16));
    Object v18 = "string";
    Object v19 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v18));
    Object v20 = java.util.EnumSet.of(((java.lang.Enum)v13),((java.lang.Enum)v15),((java.lang.Enum)v17),((java.lang.Enum)v19));
    Object v21 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v20));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v21));
    Object v23 = ((com.fasterxml.jackson.databind.type.TypeFactory)v1).constructCollectionType(((java.lang.Class)v11),((java.lang.Class)v22));
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v25 = ((com.fasterxml.jackson.databind.type.TypeFactory)v24)._unknownType();
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v25));
    Object v27 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0)._findSuperInterfaceChain(((java.lang.reflect.Type)v23),((java.lang.Class)v26));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = ((com.fasterxml.jackson.databind.type.TypeFactory)v2)._unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v5 = ((com.fasterxml.jackson.databind.type.TypeFactory)v4)._unknownType();
    Object v6 = ((com.fasterxml.jackson.databind.type.TypeFactory)v1).moreSpecificType(((com.fasterxml.jackson.databind.JavaType)v3),((com.fasterxml.jackson.databind.JavaType)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v8 = "string";
    Object v9 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v8));
    Object v10 = "string";
    Object v11 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v10));
    Object v12 = "string";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v12));
    Object v14 = "string";
    Object v15 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v14));
    Object v16 = java.util.EnumSet.of(((java.lang.Enum)v9),((java.lang.Enum)v11),((java.lang.Enum)v13),((java.lang.Enum)v15));
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v16));
    Object v18 = ((com.fasterxml.jackson.databind.type.TypeFactory)v7).uncheckedSimpleType(((java.lang.Class)v17));
    Object v19 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).constructType(((java.lang.reflect.Type)v6),((com.fasterxml.jackson.databind.JavaType)v18));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = new com.fasterxml.jackson.databind.type.TypeParser(((com.fasterxml.jackson.databind.type.TypeFactory)v0));
    Object v2 = new com.fasterxml.jackson.databind.type.TypeModifier[]{};
    Object v3 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.type.TypeParser)v1),((com.fasterxml.jackson.databind.type.TypeModifier[])v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = new com.fasterxml.jackson.databind.type.TypeParser(((com.fasterxml.jackson.databind.type.TypeFactory)v0));
    Object v2 = new com.fasterxml.jackson.databind.type.TypeModifier[]{};
    Object v3 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.type.TypeParser)v1),((com.fasterxml.jackson.databind.type.TypeModifier[])v2));
    Object v4 = ((com.fasterxml.jackson.databind.type.TypeFactory)v3)._unknownType();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = new com.fasterxml.jackson.databind.type.TypeParser(((com.fasterxml.jackson.databind.type.TypeFactory)v0));
    Object v2 = new com.fasterxml.jackson.databind.type.TypeModifier[]{};
    Object v3 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.type.TypeParser)v1),((com.fasterxml.jackson.databind.type.TypeModifier[])v2));
    Object v4 = "byte";
    Object v5 = ((com.fasterxml.jackson.databind.type.TypeFactory)v3).constructFromCanonical(((java.lang.String)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = ((com.fasterxml.jackson.databind.type.TypeFactory)v6)._unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = ((com.fasterxml.jackson.databind.type.TypeFactory)v9)._unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new java.lang.Class[]{null,null};
    Object v13 = ((com.fasterxml.jackson.databind.type.TypeFactory)v3).constructParametrizedType(((java.lang.Class)v8),((java.lang.Class)v11),((java.lang.Class[])v12));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = new com.fasterxml.jackson.databind.type.TypeParser(((com.fasterxml.jackson.databind.type.TypeFactory)v0));
    Object v2 = new com.fasterxml.jackson.databind.type.TypeModifier[]{};
    Object v3 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.type.TypeParser)v1),((com.fasterxml.jackson.databind.type.TypeModifier[])v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v6 = ((com.fasterxml.jackson.databind.type.TypeFactory)v5)._unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = "string";
    Object v9 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v8));
    Object v10 = "string";
    Object v11 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v10));
    Object v12 = "string";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v12));
    Object v14 = "string";
    Object v15 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v14));
    Object v16 = java.util.EnumSet.of(((java.lang.Enum)v9),((java.lang.Enum)v11),((java.lang.Enum)v13),((java.lang.Enum)v15));
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v16));
    Object v18 = ((com.fasterxml.jackson.databind.type.TypeFactory)v4).constructCollectionLikeType(((java.lang.Class)v7),((java.lang.Class)v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v20 = ((com.fasterxml.jackson.databind.type.TypeFactory)v19)._unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v23 = ((com.fasterxml.jackson.databind.type.TypeFactory)v22)._unknownType();
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v23));
    Object v25 = ((java.lang.Class)v24).toGenericString();
    Object v26 = ((com.fasterxml.jackson.databind.type.TypeFactory)v4)._findSuperTypeChain(((java.lang.Class)v21),((java.lang.Class)v24));
    Object v27 = ((com.fasterxml.jackson.databind.type.TypeFactory)v3)._arrayListSuperInterfaceChain(((com.fasterxml.jackson.databind.type.HierarchicType)v26));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = new com.fasterxml.jackson.databind.type.TypeParser(((com.fasterxml.jackson.databind.type.TypeFactory)v0));
    Object v2 = new com.fasterxml.jackson.databind.type.TypeModifier[]{};
    Object v3 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.type.TypeParser)v1),((com.fasterxml.jackson.databind.type.TypeModifier[])v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = "string";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v7));
    Object v9 = "string";
    Object v10 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v9));
    Object v11 = "string";
    Object v12 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v11));
    Object v13 = "string";
    Object v14 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v13));
    Object v15 = java.util.EnumSet.of(((java.lang.Enum)v8),((java.lang.Enum)v10),((java.lang.Enum)v12),((java.lang.Enum)v14));
    Object v16 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v15));
    Object v17 = java.util.Map.of();
    Object v18 = "string";
    Object v19 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v18));
    Object v20 = java.util.List.of(((java.lang.Object)v17),((java.lang.Object)v19));
    Object v21 = ((com.fasterxml.jackson.databind.type.TypeFactory)v6)._fromParameterizedClass(((java.lang.Class)v16),((java.util.List)v20));
    Object v22 = ((com.fasterxml.jackson.databind.type.TypeFactory)v5).constructType(((java.lang.reflect.Type)v21));
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v22));
    Object v24 = java.util.Map.of();
    Object v25 = ((java.lang.Class)v23).isInstance(((java.lang.Object)v24));
    Object v26 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v27 = ((com.fasterxml.jackson.databind.type.TypeFactory)v4).constructParametricType(((java.lang.Class)v23),((com.fasterxml.jackson.databind.JavaType[])v26));
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v29 = ((com.fasterxml.jackson.databind.type.TypeFactory)v28)._unknownType();
    Object v30 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v29));
    Object v31 = ((com.fasterxml.jackson.databind.type.TypeFactory)v3).findTypeParameters(((com.fasterxml.jackson.databind.JavaType)v27),((java.lang.Class)v30));
    org.junit.Assert.assertNull(v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = new com.fasterxml.jackson.databind.type.TypeParser(((com.fasterxml.jackson.databind.type.TypeFactory)v0));
    Object v2 = new com.fasterxml.jackson.databind.type.TypeModifier[]{};
    Object v3 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.type.TypeParser)v1),((com.fasterxml.jackson.databind.type.TypeModifier[])v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v5 = new com.fasterxml.jackson.databind.type.TypeParser(((com.fasterxml.jackson.databind.type.TypeFactory)v4));
    Object v6 = new com.fasterxml.jackson.databind.type.TypeModifier[]{};
    Object v7 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.type.TypeParser)v5),((com.fasterxml.jackson.databind.type.TypeModifier[])v6));
    Object v8 = ((com.fasterxml.jackson.databind.type.TypeFactory)v7)._unknownType();
    Object v9 = ((com.fasterxml.jackson.databind.JavaType)v8).withStaticTyping();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v11 = ((com.fasterxml.jackson.databind.type.TypeFactory)v10)._unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = ((com.fasterxml.jackson.databind.type.TypeFactory)v3).constructSpecializedType(((com.fasterxml.jackson.databind.JavaType)v8),((java.lang.Class)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = new com.fasterxml.jackson.databind.type.TypeParser(((com.fasterxml.jackson.databind.type.TypeFactory)v0));
    Object v2 = new com.fasterxml.jackson.databind.type.TypeModifier[]{};
    Object v3 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.type.TypeParser)v1),((com.fasterxml.jackson.databind.type.TypeModifier[])v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v5 = ((com.fasterxml.jackson.databind.type.TypeFactory)v4)._unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = java.util.Map.of();
    Object v8 = "string";
    Object v9 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.forValue(((java.lang.String)v8));
    Object v10 = java.util.List.of(((java.lang.Object)v7),((java.lang.Object)v9));
    Object v11 = ((com.fasterxml.jackson.databind.type.TypeFactory)v3)._fromParameterizedClass(((java.lang.Class)v6),((java.util.List)v10));
      org.junit.Assert.fail("Expected java.lang.ArrayStoreException");
    } catch (java.lang.ArrayStoreException expected) { }
  }
}
