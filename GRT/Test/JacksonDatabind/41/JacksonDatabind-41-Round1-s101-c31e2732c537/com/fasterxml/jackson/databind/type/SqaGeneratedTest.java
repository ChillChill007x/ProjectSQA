package com.fasterxml.jackson.databind.type;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = "NUMBER";
    Object v2 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v1));
    Object v3 = "NUMBER";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v3));
    Object v5 = java.util.EnumSet.of(((java.lang.Enum)v2),((java.lang.Enum)v4));
    Object v6 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v5));
    Object v7 = "NUMBER";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v7));
    Object v9 = "NUMBER";
    Object v10 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v9));
    Object v11 = java.util.EnumSet.of(((java.lang.Enum)v8),((java.lang.Enum)v10));
    Object v12 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v11));
    Object v13 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v12));
    Object v14 = "NUMBER";
    Object v15 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v14));
    Object v16 = "NUMBER";
    Object v17 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v16));
    Object v18 = java.util.EnumSet.of(((java.lang.Enum)v15),((java.lang.Enum)v17));
    Object v19 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v18));
    Object v20 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v19));
    Object v21 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v6),((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.JavaType)v20));
    Object v22 = ((java.lang.reflect.Type)v21).getTypeName();
    Object v23 = "NUMBER";
    Object v24 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v23));
    Object v25 = "NUMBER";
    Object v26 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v25));
    Object v27 = java.util.EnumSet.of(((java.lang.Enum)v24),((java.lang.Enum)v26));
    Object v28 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v27));
    Object v29 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).constructType(((java.lang.reflect.Type)v21),((java.lang.Class)v28));
    org.junit.Assert.assertNotNull(v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    ((com.fasterxml.jackson.databind.type.TypeFactory)v0).clearCache();
    Object v1 = null;
    Object v2 = "NUMBER";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v2));
    Object v4 = "NUMBER";
    Object v5 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v4));
    Object v6 = java.util.EnumSet.of(((java.lang.Enum)v3),((java.lang.Enum)v5));
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v6));
    Object v8 = "NUMBER";
    Object v9 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v8));
    Object v10 = "NUMBER";
    Object v11 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v10));
    Object v12 = java.util.EnumSet.of(((java.lang.Enum)v9),((java.lang.Enum)v11));
    Object v13 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v12));
    Object v14 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v13));
    Object v15 = "NUMBER";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v15));
    Object v17 = "NUMBER";
    Object v18 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v17));
    Object v19 = java.util.EnumSet.of(((java.lang.Enum)v16),((java.lang.Enum)v18));
    Object v20 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v19));
    Object v21 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v20));
    Object v22 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v7),((com.fasterxml.jackson.databind.JavaType)v14),((com.fasterxml.jackson.databind.JavaType)v21));
    Object v23 = "NUMBER";
    Object v24 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v23));
    Object v25 = "NUMBER";
    Object v26 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v25));
    Object v27 = java.util.EnumSet.of(((java.lang.Enum)v24),((java.lang.Enum)v26));
    Object v28 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v27));
    Object v29 = ((java.lang.Class)v28).getTypeParameters();
    Object v30 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).findTypeParameters(((com.fasterxml.jackson.databind.JavaType)v22),((java.lang.Class)v28));
    org.junit.Assert.assertNotNull(v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = "NUMBER";
    Object v2 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v1));
    Object v3 = "NUMBER";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v3));
    Object v5 = java.util.EnumSet.of(((java.lang.Enum)v2),((java.lang.Enum)v4));
    Object v6 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v5));
    Object v7 = new com.fasterxml.jackson.databind.type.ClassStack(((java.lang.Class)v6));
    Object v8 = "NUMBER";
    Object v9 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v8));
    Object v10 = "NUMBER";
    Object v11 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v10));
    Object v12 = java.util.EnumSet.of(((java.lang.Enum)v9),((java.lang.Enum)v11));
    Object v13 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v12));
    Object v14 = "NUMBER";
    Object v15 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v14));
    Object v16 = ((java.lang.Class)v13).cast(((java.lang.Object)v15));
    Object v17 = "NUMBER";
    Object v18 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v17));
    Object v19 = "NUMBER";
    Object v20 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v19));
    Object v21 = java.util.EnumSet.of(((java.lang.Enum)v18),((java.lang.Enum)v20));
    Object v22 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v21));
    Object v23 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v24 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v22),((com.fasterxml.jackson.databind.JavaType[])v23));
    Object v25 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0)._fromClass(((com.fasterxml.jackson.databind.type.ClassStack)v7),((java.lang.Class)v13),((com.fasterxml.jackson.databind.type.TypeBindings)v24));
    org.junit.Assert.assertNotNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = "NUMBER";
    Object v2 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v1));
    Object v3 = "NUMBER";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v3));
    Object v5 = java.util.EnumSet.of(((java.lang.Enum)v2),((java.lang.Enum)v4));
    Object v6 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v5));
    Object v7 = "NUMBER";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v7));
    Object v9 = "NUMBER";
    Object v10 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v9));
    Object v11 = java.util.EnumSet.of(((java.lang.Enum)v8),((java.lang.Enum)v10));
    Object v12 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v11));
    Object v13 = "NUMBER";
    Object v14 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v13));
    Object v15 = "NUMBER";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v15));
    Object v17 = java.util.EnumSet.of(((java.lang.Enum)v14),((java.lang.Enum)v16));
    Object v18 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v17));
    Object v19 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).constructMapLikeType(((java.lang.Class)v6),((java.lang.Class)v12),((java.lang.Class)v18));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = null;
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).withModifier(((com.fasterxml.jackson.databind.type.TypeModifier)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = "NUMBER";
    Object v1 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v0));
    Object v2 = "NUMBER";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v2));
    Object v4 = java.util.EnumSet.of(((java.lang.Enum)v1),((java.lang.Enum)v3));
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v4));
    Object v6 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = null;
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).withModifier(((com.fasterxml.jackson.databind.type.TypeModifier)v1));
    Object v3 = "NUMBER";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v3));
    Object v5 = "NUMBER";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v5));
    Object v7 = java.util.EnumSet.of(((java.lang.Enum)v4),((java.lang.Enum)v6));
    Object v8 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v7));
    Object v9 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = ((java.lang.reflect.Type)v10).getTypeName();
    Object v12 = "NUMBER";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v12));
    Object v14 = "NUMBER";
    Object v15 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v14));
    Object v16 = java.util.EnumSet.of(((java.lang.Enum)v13),((java.lang.Enum)v15));
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v16));
    Object v18 = ((com.fasterxml.jackson.databind.type.TypeFactory)v2).constructType(((java.lang.reflect.Type)v10),((java.lang.Class)v17));
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = null;
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).withModifier(((com.fasterxml.jackson.databind.type.TypeModifier)v1));
    Object v3 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v4 = ((com.fasterxml.jackson.databind.type.TypeFactory)v2).withClassLoader(((java.lang.ClassLoader)v3));
    Object v5 = "NUMBER";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v5));
    Object v7 = "NUMBER";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v7));
    Object v9 = java.util.EnumSet.of(((java.lang.Enum)v6),((java.lang.Enum)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v9));
    Object v11 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v10));
    Object v12 = "NUMBER";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v12));
    Object v14 = "NUMBER";
    Object v15 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v14));
    Object v16 = java.util.EnumSet.of(((java.lang.Enum)v13),((java.lang.Enum)v15));
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v16));
    Object v18 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = ((java.lang.Class)v19).getNestHost();
    Object v21 = ((com.fasterxml.jackson.databind.type.TypeFactory)v2).constructSpecializedType(((com.fasterxml.jackson.databind.JavaType)v11),((java.lang.Class)v19));
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = null;
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).withModifier(((com.fasterxml.jackson.databind.type.TypeModifier)v1));
    Object v3 = "NUMBER";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v3));
    Object v5 = "NUMBER";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v5));
    Object v7 = java.util.EnumSet.of(((java.lang.Enum)v4),((java.lang.Enum)v6));
    Object v8 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v7));
    Object v9 = "NUMBER";
    Object v10 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v9));
    Object v11 = "NUMBER";
    Object v12 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v11));
    Object v13 = java.util.EnumSet.of(((java.lang.Enum)v10),((java.lang.Enum)v12));
    Object v14 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v13));
    Object v15 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v14));
    Object v16 = ((com.fasterxml.jackson.databind.type.TypeFactory)v2).constructCollectionLikeType(((java.lang.Class)v8),((com.fasterxml.jackson.databind.JavaType)v15));
    Object v17 = "NUMBER";
    Object v18 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v17));
    Object v19 = "NUMBER";
    Object v20 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v19));
    Object v21 = java.util.EnumSet.of(((java.lang.Enum)v18),((java.lang.Enum)v20));
    Object v22 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v21));
    Object v23 = new com.fasterxml.jackson.databind.type.ClassStack(((java.lang.Class)v22));
    Object v24 = "NUMBER";
    Object v25 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v24));
    Object v26 = "NUMBER";
    Object v27 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v26));
    Object v28 = java.util.EnumSet.of(((java.lang.Enum)v25),((java.lang.Enum)v27));
    Object v29 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v28));
    Object v30 = ((java.lang.Class)v29).getAnnotations();
    Object v31 = "NUMBER";
    Object v32 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v31));
    Object v33 = "NUMBER";
    Object v34 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v33));
    Object v35 = java.util.EnumSet.of(((java.lang.Enum)v32),((java.lang.Enum)v34));
    Object v36 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v35));
    Object v37 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v38 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v36),((com.fasterxml.jackson.databind.JavaType[])v37));
    Object v39 = ((com.fasterxml.jackson.databind.type.TypeFactory)v2)._resolveSuperClass(((com.fasterxml.jackson.databind.type.ClassStack)v23),((java.lang.Class)v29),((com.fasterxml.jackson.databind.type.TypeBindings)v38));
    org.junit.Assert.assertNotNull(v39);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = null;
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).withModifier(((com.fasterxml.jackson.databind.type.TypeModifier)v1));
    Object v3 = "NUMBER";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v3));
    Object v5 = "NUMBER";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v5));
    Object v7 = java.util.EnumSet.of(((java.lang.Enum)v4),((java.lang.Enum)v6));
    Object v8 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v7));
    Object v9 = ((com.fasterxml.jackson.databind.type.TypeFactory)v2).constructRawMapLikeType(((java.lang.Class)v8));
    Object v10 = "NUMBER";
    Object v11 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v10));
    Object v12 = "NUMBER";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v12));
    Object v14 = java.util.EnumSet.of(((java.lang.Enum)v11),((java.lang.Enum)v13));
    Object v15 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v14));
    Object v16 = new com.fasterxml.jackson.databind.type.ClassStack(((java.lang.Class)v15));
    Object v17 = "NUMBER";
    Object v18 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v17));
    Object v19 = "NUMBER";
    Object v20 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v19));
    Object v21 = java.util.EnumSet.of(((java.lang.Enum)v18),((java.lang.Enum)v20));
    Object v22 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v21));
    Object v23 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v22));
    Object v24 = "NUMBER";
    Object v25 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v24));
    Object v26 = "NUMBER";
    Object v27 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v26));
    Object v28 = java.util.EnumSet.of(((java.lang.Enum)v25),((java.lang.Enum)v27));
    Object v29 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v28));
    Object v30 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v31 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v29),((com.fasterxml.jackson.databind.JavaType[])v30));
    Object v32 = ((com.fasterxml.jackson.databind.type.TypeBindings)v31).toString();
    Object v33 = ((com.fasterxml.jackson.databind.type.TypeFactory)v2)._fromAny(((com.fasterxml.jackson.databind.type.ClassStack)v16),((java.lang.reflect.Type)v23),((com.fasterxml.jackson.databind.type.TypeBindings)v31));
    org.junit.Assert.assertNotNull(v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = "NUMBER";
    Object v1 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v0));
    Object v2 = "NUMBER";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v2));
    Object v4 = java.util.EnumSet.of(((java.lang.Enum)v1),((java.lang.Enum)v3));
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = null;
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).withModifier(((com.fasterxml.jackson.databind.type.TypeModifier)v1));
    Object v3 = "NUMBER";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v3));
    Object v5 = "NUMBER";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v5));
    Object v7 = java.util.EnumSet.of(((java.lang.Enum)v4),((java.lang.Enum)v6));
    Object v8 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = ((java.lang.Class)v9).getCanonicalName();
    Object v11 = ((com.fasterxml.jackson.databind.type.TypeFactory)v2).uncheckedSimpleType(((java.lang.Class)v9));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = null;
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).withModifier(((com.fasterxml.jackson.databind.type.TypeModifier)v1));
    Object v3 = "NUMBER";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v3));
    Object v5 = "NUMBER";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v5));
    Object v7 = java.util.EnumSet.of(((java.lang.Enum)v4),((java.lang.Enum)v6));
    Object v8 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v7));
    Object v9 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v8));
    Object v10 = "NUMBER";
    Object v11 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v10));
    Object v12 = "NUMBER";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v12));
    Object v14 = java.util.EnumSet.of(((java.lang.Enum)v11),((java.lang.Enum)v13));
    Object v15 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v14));
    Object v16 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v15));
    Object v17 = ((com.fasterxml.jackson.databind.type.TypeFactory)v2).moreSpecificType(((com.fasterxml.jackson.databind.JavaType)v9),((com.fasterxml.jackson.databind.JavaType)v16));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = null;
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).withModifier(((com.fasterxml.jackson.databind.type.TypeModifier)v1));
    Object v3 = "NUMBER";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v3));
    Object v5 = "NUMBER";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v5));
    Object v7 = java.util.EnumSet.of(((java.lang.Enum)v4),((java.lang.Enum)v6));
    Object v8 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v7));
    Object v9 = "NUMBER";
    Object v10 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v9));
    Object v11 = "NUMBER";
    Object v12 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v11));
    Object v13 = java.util.EnumSet.of(((java.lang.Enum)v10),((java.lang.Enum)v12));
    Object v14 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v13));
    Object v15 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v16 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v14),((com.fasterxml.jackson.databind.JavaType[])v15));
    Object v17 = "NUMBER";
    Object v18 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v17));
    Object v19 = "NUMBER";
    Object v20 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v19));
    Object v21 = java.util.EnumSet.of(((java.lang.Enum)v18),((java.lang.Enum)v20));
    Object v22 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v21));
    Object v23 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v22));
    Object v24 = ((com.fasterxml.jackson.databind.JavaType)v23).getSuperClass();
    Object v25 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v26 = ((com.fasterxml.jackson.databind.type.TypeFactory)v2)._constructSimple(((java.lang.Class)v8),((com.fasterxml.jackson.databind.type.TypeBindings)v16),((com.fasterxml.jackson.databind.JavaType)v23),((com.fasterxml.jackson.databind.JavaType[])v25));
    org.junit.Assert.assertNotNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = null;
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).withModifier(((com.fasterxml.jackson.databind.type.TypeModifier)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v4 = null;
    Object v5 = ((com.fasterxml.jackson.databind.type.TypeFactory)v3).withModifier(((com.fasterxml.jackson.databind.type.TypeModifier)v4));
    Object v6 = "NUMBER";
    Object v7 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v6));
    Object v8 = "NUMBER";
    Object v9 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v8));
    Object v10 = java.util.EnumSet.of(((java.lang.Enum)v7),((java.lang.Enum)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = ((java.lang.Class)v12).getCanonicalName();
    Object v14 = ((com.fasterxml.jackson.databind.type.TypeFactory)v5).uncheckedSimpleType(((java.lang.Class)v12));
    Object v15 = "NUMBER";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v15));
    Object v17 = "NUMBER";
    Object v18 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v17));
    Object v19 = java.util.EnumSet.of(((java.lang.Enum)v16),((java.lang.Enum)v18));
    Object v20 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v19));
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = ((com.fasterxml.jackson.databind.type.TypeFactory)v2).constructType(((java.lang.reflect.Type)v14),((java.lang.Class)v21));
    org.junit.Assert.assertNotNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = "NUMBER";
    Object v2 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v1));
    Object v3 = "NUMBER";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v3));
    Object v5 = java.util.EnumSet.of(((java.lang.Enum)v2),((java.lang.Enum)v4));
    Object v6 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v5));
    Object v7 = new java.lang.Class[]{null};
    Object v8 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).constructParametricType(((java.lang.Class)v6),((java.lang.Class[])v7));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = null;
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).withModifier(((com.fasterxml.jackson.databind.type.TypeModifier)v1));
    Object v3 = "NUMBER";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v3));
    Object v5 = "NUMBER";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v5));
    Object v7 = java.util.EnumSet.of(((java.lang.Enum)v4),((java.lang.Enum)v6));
    Object v8 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v7));
    Object v9 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v8));
    Object v10 = "NUMBER";
    Object v11 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v10));
    Object v12 = "NUMBER";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v12));
    Object v14 = java.util.EnumSet.of(((java.lang.Enum)v11),((java.lang.Enum)v13));
    Object v15 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v14));
    Object v16 = ((com.fasterxml.jackson.databind.type.TypeFactory)v2).constructType(((java.lang.reflect.Type)v9),((java.lang.Class)v15));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = null;
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).withModifier(((com.fasterxml.jackson.databind.type.TypeModifier)v1));
    Object v3 = "NUMBER";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v3));
    Object v5 = "NUMBER";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v5));
    Object v7 = java.util.EnumSet.of(((java.lang.Enum)v4),((java.lang.Enum)v6));
    Object v8 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = ((com.fasterxml.jackson.databind.type.TypeFactory)v2)._findWellKnownSimple(((java.lang.Class)v9));
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = null;
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).withModifier(((com.fasterxml.jackson.databind.type.TypeModifier)v1));
    Object v3 = "NUMBER";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v3));
    Object v5 = "NUMBER";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v5));
    Object v7 = java.util.EnumSet.of(((java.lang.Enum)v4),((java.lang.Enum)v6));
    Object v8 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v7));
    Object v9 = "NUMBER";
    Object v10 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v9));
    Object v11 = "NUMBER";
    Object v12 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v11));
    Object v13 = java.util.EnumSet.of(((java.lang.Enum)v10),((java.lang.Enum)v12));
    Object v14 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v13));
    Object v15 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v16 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v14),((com.fasterxml.jackson.databind.JavaType[])v15));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v18 = null;
    Object v19 = ((com.fasterxml.jackson.databind.type.TypeFactory)v17).withModifier(((com.fasterxml.jackson.databind.type.TypeModifier)v18));
    Object v20 = "NUMBER";
    Object v21 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v20));
    Object v22 = "NUMBER";
    Object v23 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v22));
    Object v24 = java.util.EnumSet.of(((java.lang.Enum)v21),((java.lang.Enum)v23));
    Object v25 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v24));
    Object v26 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v25));
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v26));
    Object v28 = ((java.lang.reflect.Type)v27).getTypeName();
    Object v29 = "NUMBER";
    Object v30 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v29));
    Object v31 = "NUMBER";
    Object v32 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v31));
    Object v33 = java.util.EnumSet.of(((java.lang.Enum)v30),((java.lang.Enum)v32));
    Object v34 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v33));
    Object v35 = ((com.fasterxml.jackson.databind.type.TypeFactory)v19).constructType(((java.lang.reflect.Type)v27),((java.lang.Class)v34));
    Object v36 = new com.fasterxml.jackson.databind.JavaType[]{null,null,null};
    Object v37 = ((com.fasterxml.jackson.databind.type.TypeFactory)v2)._constructSimple(((java.lang.Class)v8),((com.fasterxml.jackson.databind.type.TypeBindings)v16),((com.fasterxml.jackson.databind.JavaType)v35),((com.fasterxml.jackson.databind.JavaType[])v36));
    org.junit.Assert.assertNotNull(v37);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = null;
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).withModifier(((com.fasterxml.jackson.databind.type.TypeModifier)v1));
    Object v3 = "NUMBER";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v3));
    Object v5 = "NUMBER";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v5));
    Object v7 = java.util.EnumSet.of(((java.lang.Enum)v4),((java.lang.Enum)v6));
    Object v8 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = ((java.lang.Class)v9).getGenericSuperclass();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v12 = "NUMBER";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v12));
    Object v14 = "NUMBER";
    Object v15 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v14));
    Object v16 = java.util.EnumSet.of(((java.lang.Enum)v13),((java.lang.Enum)v15));
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v16));
    Object v18 = "NUMBER";
    Object v19 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v18));
    Object v20 = "NUMBER";
    Object v21 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v20));
    Object v22 = java.util.EnumSet.of(((java.lang.Enum)v19),((java.lang.Enum)v21));
    Object v23 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v22));
    Object v24 = "NUMBER";
    Object v25 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v24));
    Object v26 = "NUMBER";
    Object v27 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v26));
    Object v28 = java.util.EnumSet.of(((java.lang.Enum)v25),((java.lang.Enum)v27));
    Object v29 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v28));
    Object v30 = ((com.fasterxml.jackson.databind.type.TypeFactory)v11).constructMapLikeType(((java.lang.Class)v17),((java.lang.Class)v23),((java.lang.Class)v29));
    Object v31 = ((com.fasterxml.jackson.databind.type.TypeFactory)v2).constructCollectionLikeType(((java.lang.Class)v9),((com.fasterxml.jackson.databind.JavaType)v30));
    org.junit.Assert.assertNotNull(v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = null;
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).withModifier(((com.fasterxml.jackson.databind.type.TypeModifier)v1));
    Object v3 = "items";
    Object v4 = ((com.fasterxml.jackson.databind.type.TypeFactory)v2)._findPrimitive(((java.lang.String)v3));
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = "NUMBER";
    Object v2 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v1));
    Object v3 = "NUMBER";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v3));
    Object v5 = java.util.EnumSet.of(((java.lang.Enum)v2),((java.lang.Enum)v4));
    Object v6 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v5));
    Object v7 = "NUMBER";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v7));
    Object v9 = "NUMBER";
    Object v10 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v9));
    Object v11 = java.util.EnumSet.of(((java.lang.Enum)v8),((java.lang.Enum)v10));
    Object v12 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = "NUMBER";
    Object v15 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v14));
    Object v16 = "NUMBER";
    Object v17 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v16));
    Object v18 = java.util.EnumSet.of(((java.lang.Enum)v15),((java.lang.Enum)v17));
    Object v19 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v19));
    Object v21 = ((java.lang.Class)v20).getGenericInterfaces();
    Object v22 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).constructMapType(((java.lang.Class)v6),((java.lang.Class)v13),((java.lang.Class)v20));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = null;
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).withModifier(((com.fasterxml.jackson.databind.type.TypeModifier)v1));
    Object v3 = "NUMBER";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v3));
    Object v5 = "NUMBER";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v5));
    Object v7 = java.util.EnumSet.of(((java.lang.Enum)v4),((java.lang.Enum)v6));
    Object v8 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = "NUMBER";
    Object v11 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v10));
    Object v12 = "NUMBER";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v12));
    Object v14 = java.util.EnumSet.of(((java.lang.Enum)v11),((java.lang.Enum)v13));
    Object v15 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v14));
    Object v16 = ((java.lang.Class)v15).isPrimitive();
    Object v17 = ((com.fasterxml.jackson.databind.type.TypeFactory)v2).findTypeParameters(((java.lang.Class)v9),((java.lang.Class)v15));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).withClassLoader(((java.lang.ClassLoader)v1));
    Object v3 = "NUMBER";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v3));
    Object v5 = "NUMBER";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v5));
    Object v7 = java.util.EnumSet.of(((java.lang.Enum)v4),((java.lang.Enum)v6));
    Object v8 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v7));
    Object v9 = new com.fasterxml.jackson.databind.type.ClassStack(((java.lang.Class)v8));
    Object v10 = "NUMBER";
    Object v11 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v10));
    Object v12 = "NUMBER";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v12));
    Object v14 = java.util.EnumSet.of(((java.lang.Enum)v11),((java.lang.Enum)v13));
    Object v15 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v14));
    Object v16 = "NUMBER";
    Object v17 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v16));
    Object v18 = "NUMBER";
    Object v19 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v18));
    Object v20 = java.util.EnumSet.of(((java.lang.Enum)v17),((java.lang.Enum)v19));
    Object v21 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v20));
    Object v22 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v23 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v21),((com.fasterxml.jackson.databind.JavaType[])v22));
    Object v24 = "#)";
    Object v25 = ((com.fasterxml.jackson.databind.type.TypeBindings)v23).hasUnbound(((java.lang.String)v24));
    Object v26 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0)._resolveSuperInterfaces(((com.fasterxml.jackson.databind.type.ClassStack)v9),((java.lang.Class)v15),((com.fasterxml.jackson.databind.type.TypeBindings)v23));
    org.junit.Assert.assertNotNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = null;
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).withModifier(((com.fasterxml.jackson.databind.type.TypeModifier)v1));
    Object v3 = "NUMBER";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v3));
    Object v5 = "NUMBER";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v5));
    Object v7 = java.util.EnumSet.of(((java.lang.Enum)v4),((java.lang.Enum)v6));
    Object v8 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v7));
    Object v9 = "NUMBER";
    Object v10 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v9));
    Object v11 = "NUMBER";
    Object v12 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v11));
    Object v13 = java.util.EnumSet.of(((java.lang.Enum)v10),((java.lang.Enum)v12));
    Object v14 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v13));
    Object v15 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v14));
    Object v16 = "NUMBER";
    Object v17 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v16));
    Object v18 = ((com.fasterxml.jackson.databind.JavaType)v15).equals(((java.lang.Object)v17));
    Object v19 = "NUMBER";
    Object v20 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v19));
    Object v21 = "NUMBER";
    Object v22 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v21));
    Object v23 = java.util.EnumSet.of(((java.lang.Enum)v20),((java.lang.Enum)v22));
    Object v24 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v23));
    Object v25 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v24));
    Object v26 = ((com.fasterxml.jackson.databind.JavaType)v25).isConcrete();
    Object v27 = ((com.fasterxml.jackson.databind.type.TypeFactory)v2).constructMapLikeType(((java.lang.Class)v8),((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.JavaType)v25));
    org.junit.Assert.assertNotNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = null;
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).withModifier(((com.fasterxml.jackson.databind.type.TypeModifier)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v4 = null;
    Object v5 = ((com.fasterxml.jackson.databind.type.TypeFactory)v3).withModifier(((com.fasterxml.jackson.databind.type.TypeModifier)v4));
    Object v6 = "NUMBER";
    Object v7 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v6));
    Object v8 = "NUMBER";
    Object v9 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v8));
    Object v10 = java.util.EnumSet.of(((java.lang.Enum)v7),((java.lang.Enum)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v10));
    Object v12 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = ((java.lang.reflect.Type)v13).getTypeName();
    Object v15 = "NUMBER";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v15));
    Object v17 = "NUMBER";
    Object v18 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v17));
    Object v19 = java.util.EnumSet.of(((java.lang.Enum)v16),((java.lang.Enum)v18));
    Object v20 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v19));
    Object v21 = ((com.fasterxml.jackson.databind.type.TypeFactory)v5).constructType(((java.lang.reflect.Type)v13),((java.lang.Class)v20));
    Object v22 = "NUMBER";
    Object v23 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v22));
    Object v24 = "NUMBER";
    Object v25 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v24));
    Object v26 = java.util.EnumSet.of(((java.lang.Enum)v23),((java.lang.Enum)v25));
    Object v27 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v26));
    Object v28 = ((java.lang.Class)v27).getPackage();
    Object v29 = ((com.fasterxml.jackson.databind.type.TypeFactory)v2).constructGeneralizedType(((com.fasterxml.jackson.databind.JavaType)v21),((java.lang.Class)v27));
    org.junit.Assert.assertNotNull(v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = null;
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).withModifier(((com.fasterxml.jackson.databind.type.TypeModifier)v1));
    Object v3 = "NUMBER";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v3));
    Object v5 = "NUMBER";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v5));
    Object v7 = java.util.EnumSet.of(((java.lang.Enum)v4),((java.lang.Enum)v6));
    Object v8 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v7));
    Object v9 = ((com.fasterxml.jackson.databind.type.TypeFactory)v2).constructRawMapLikeType(((java.lang.Class)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = "NUMBER";
    Object v2 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v1));
    Object v3 = "NUMBER";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v3));
    Object v5 = java.util.EnumSet.of(((java.lang.Enum)v2),((java.lang.Enum)v4));
    Object v6 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v5));
    Object v7 = new com.fasterxml.jackson.databind.type.ClassStack(((java.lang.Class)v6));
    Object v8 = "NUMBER";
    Object v9 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v8));
    Object v10 = "NUMBER";
    Object v11 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v10));
    Object v12 = java.util.EnumSet.of(((java.lang.Enum)v9),((java.lang.Enum)v11));
    Object v13 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = "NUMBER";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v15));
    Object v17 = "NUMBER";
    Object v18 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v17));
    Object v19 = java.util.EnumSet.of(((java.lang.Enum)v16),((java.lang.Enum)v18));
    Object v20 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v19));
    Object v21 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v22 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v20),((com.fasterxml.jackson.databind.JavaType[])v21));
    Object v23 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0)._fromClass(((com.fasterxml.jackson.databind.type.ClassStack)v7),((java.lang.Class)v14),((com.fasterxml.jackson.databind.type.TypeBindings)v22));
    org.junit.Assert.assertNotNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = null;
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).withModifier(((com.fasterxml.jackson.databind.type.TypeModifier)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v4 = null;
    Object v5 = ((com.fasterxml.jackson.databind.type.TypeFactory)v3).withModifier(((com.fasterxml.jackson.databind.type.TypeModifier)v4));
    Object v6 = "NUMBER";
    Object v7 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v6));
    Object v8 = "NUMBER";
    Object v9 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v8));
    Object v10 = java.util.EnumSet.of(((java.lang.Enum)v7),((java.lang.Enum)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v10));
    Object v12 = ((com.fasterxml.jackson.databind.type.TypeFactory)v5).constructRawMapLikeType(((java.lang.Class)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v14 = null;
    Object v15 = ((com.fasterxml.jackson.databind.type.TypeFactory)v13).withModifier(((com.fasterxml.jackson.databind.type.TypeModifier)v14));
    Object v16 = "NUMBER";
    Object v17 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v16));
    Object v18 = "NUMBER";
    Object v19 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v18));
    Object v20 = java.util.EnumSet.of(((java.lang.Enum)v17),((java.lang.Enum)v19));
    Object v21 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v20));
    Object v22 = ((com.fasterxml.jackson.databind.type.TypeFactory)v15).constructRawMapLikeType(((java.lang.Class)v21));
    Object v23 = ((com.fasterxml.jackson.databind.type.TypeFactory)v2).constructType(((java.lang.reflect.Type)v12),((com.fasterxml.jackson.databind.JavaType)v22));
    org.junit.Assert.assertNotNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = null;
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).withModifier(((com.fasterxml.jackson.databind.type.TypeModifier)v1));
    Object v3 = "NUMBER";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v3));
    Object v5 = "NUMBER";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v5));
    Object v7 = java.util.EnumSet.of(((java.lang.Enum)v4),((java.lang.Enum)v6));
    Object v8 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = ((com.fasterxml.jackson.databind.type.TypeFactory)v2).constructArrayType(((java.lang.Class)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = ") not numeric, can not use numeric value accessors";
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0)._findPrimitive(((java.lang.String)v1));
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = null;
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).withModifier(((com.fasterxml.jackson.databind.type.TypeModifier)v1));
    Object v3 = "NUMBER";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v3));
    Object v5 = "NUMBER";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v5));
    Object v7 = java.util.EnumSet.of(((java.lang.Enum)v4),((java.lang.Enum)v6));
    Object v8 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v7));
    Object v9 = new com.fasterxml.jackson.databind.type.ClassStack(((java.lang.Class)v8));
    Object v10 = "NUMBER";
    Object v11 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v10));
    Object v12 = "NUMBER";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v12));
    Object v14 = java.util.EnumSet.of(((java.lang.Enum)v11),((java.lang.Enum)v13));
    Object v15 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v14));
    Object v16 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v15));
    Object v17 = ((java.lang.reflect.Type)v16).getTypeName();
    Object v18 = "NUMBER";
    Object v19 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v18));
    Object v20 = "NUMBER";
    Object v21 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v20));
    Object v22 = java.util.EnumSet.of(((java.lang.Enum)v19),((java.lang.Enum)v21));
    Object v23 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v22));
    Object v24 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v25 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v23),((com.fasterxml.jackson.databind.JavaType[])v24));
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v27 = null;
    Object v28 = ((com.fasterxml.jackson.databind.type.TypeFactory)v26).withModifier(((com.fasterxml.jackson.databind.type.TypeModifier)v27));
    Object v29 = ((com.fasterxml.jackson.databind.type.TypeBindings)v25).equals(((java.lang.Object)v28));
    Object v30 = ((com.fasterxml.jackson.databind.type.TypeFactory)v2)._fromAny(((com.fasterxml.jackson.databind.type.ClassStack)v9),((java.lang.reflect.Type)v16),((com.fasterxml.jackson.databind.type.TypeBindings)v25));
    org.junit.Assert.assertNotNull(v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = null;
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).withModifier(((com.fasterxml.jackson.databind.type.TypeModifier)v1));
    Object v3 = "NUMBER";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v3));
    Object v5 = "NUMBER";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v5));
    Object v7 = java.util.EnumSet.of(((java.lang.Enum)v4),((java.lang.Enum)v6));
    Object v8 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v7));
    Object v9 = new com.fasterxml.jackson.databind.type.ClassStack(((java.lang.Class)v8));
    Object v10 = "NUMBER";
    Object v11 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v10));
    Object v12 = "NUMBER";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v12));
    Object v14 = java.util.EnumSet.of(((java.lang.Enum)v11),((java.lang.Enum)v13));
    Object v15 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v14));
    Object v16 = "NUMBER";
    Object v17 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v16));
    Object v18 = "NUMBER";
    Object v19 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v18));
    Object v20 = java.util.EnumSet.of(((java.lang.Enum)v17),((java.lang.Enum)v19));
    Object v21 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v20));
    Object v22 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v23 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v21),((com.fasterxml.jackson.databind.JavaType[])v22));
    Object v24 = ((com.fasterxml.jackson.databind.type.TypeBindings)v23).getTypeParameters();
    Object v25 = ((com.fasterxml.jackson.databind.type.TypeFactory)v2)._resolveSuperInterfaces(((com.fasterxml.jackson.databind.type.ClassStack)v9),((java.lang.Class)v15),((com.fasterxml.jackson.databind.type.TypeBindings)v23));
    org.junit.Assert.assertNotNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = null;
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).withModifier(((com.fasterxml.jackson.databind.type.TypeModifier)v1));
    Object v3 = "NUMBER";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v3));
    Object v5 = "NUMBER";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v5));
    Object v7 = java.util.EnumSet.of(((java.lang.Enum)v4),((java.lang.Enum)v6));
    Object v8 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v7));
    Object v9 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = ((com.fasterxml.jackson.databind.type.TypeFactory)v2)._findWellKnownSimple(((java.lang.Class)v10));
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = "NUMBER";
    Object v2 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v1));
    Object v3 = "NUMBER";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v3));
    Object v5 = java.util.EnumSet.of(((java.lang.Enum)v2),((java.lang.Enum)v4));
    Object v6 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v5));
    Object v7 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).constructRawCollectionLikeType(((java.lang.Class)v8));
    Object v10 = "NUMBER";
    Object v11 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v10));
    Object v12 = "NUMBER";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v12));
    Object v14 = java.util.EnumSet.of(((java.lang.Enum)v11),((java.lang.Enum)v13));
    Object v15 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v14));
    Object v16 = new com.fasterxml.jackson.databind.type.ClassStack(((java.lang.Class)v15));
    Object v17 = "NUMBER";
    Object v18 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v17));
    Object v19 = "NUMBER";
    Object v20 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v19));
    Object v21 = java.util.EnumSet.of(((java.lang.Enum)v18),((java.lang.Enum)v20));
    Object v22 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v21));
    Object v23 = "NUMBER";
    Object v24 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v23));
    Object v25 = "NUMBER";
    Object v26 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v25));
    Object v27 = java.util.EnumSet.of(((java.lang.Enum)v24),((java.lang.Enum)v26));
    Object v28 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v27));
    Object v29 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v30 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v28),((com.fasterxml.jackson.databind.JavaType[])v29));
    Object v31 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0)._resolveSuperClass(((com.fasterxml.jackson.databind.type.ClassStack)v16),((java.lang.Class)v22),((com.fasterxml.jackson.databind.type.TypeBindings)v30));
    org.junit.Assert.assertNotNull(v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = null;
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).withModifier(((com.fasterxml.jackson.databind.type.TypeModifier)v1));
    ((com.fasterxml.jackson.databind.type.TypeFactory)v2).clearCache();
    Object v3 = null;
    Object v4 = "REGEX";
    Object v5 = ((com.fasterxml.jackson.databind.type.TypeFactory)v2)._findPrimitive(((java.lang.String)v4));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = null;
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).withModifier(((com.fasterxml.jackson.databind.type.TypeModifier)v1));
    Object v3 = "set";
    Object v4 = ((com.fasterxml.jackson.databind.type.TypeFactory)v2).constructFromCanonical(((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = null;
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).withModifier(((com.fasterxml.jackson.databind.type.TypeModifier)v1));
    Object v3 = "NUMBER";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v3));
    Object v5 = "NUMBER";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v5));
    Object v7 = java.util.EnumSet.of(((java.lang.Enum)v4),((java.lang.Enum)v6));
    Object v8 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v7));
    Object v9 = ((java.lang.Class)v8).getEnumConstants();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v11 = null;
    Object v12 = ((com.fasterxml.jackson.databind.type.TypeFactory)v10).withModifier(((com.fasterxml.jackson.databind.type.TypeModifier)v11));
    Object v13 = "NUMBER";
    Object v14 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v13));
    Object v15 = "NUMBER";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v15));
    Object v17 = java.util.EnumSet.of(((java.lang.Enum)v14),((java.lang.Enum)v16));
    Object v18 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v17));
    Object v19 = ((com.fasterxml.jackson.databind.type.TypeFactory)v12).constructRawMapLikeType(((java.lang.Class)v18));
    Object v20 = ((com.fasterxml.jackson.core.type.ResolvedType)v19).toCanonical();
    Object v21 = "NUMBER";
    Object v22 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v21));
    Object v23 = "NUMBER";
    Object v24 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v23));
    Object v25 = java.util.EnumSet.of(((java.lang.Enum)v22),((java.lang.Enum)v24));
    Object v26 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v25));
    Object v27 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v26));
    Object v28 = "NUMBER";
    Object v29 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v28));
    Object v30 = "NUMBER";
    Object v31 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v30));
    Object v32 = java.util.EnumSet.of(((java.lang.Enum)v29),((java.lang.Enum)v31));
    Object v33 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v32));
    Object v34 = ((com.fasterxml.jackson.databind.JavaType)v27).equals(((java.lang.Object)v33));
    Object v35 = ((com.fasterxml.jackson.databind.type.TypeFactory)v2).constructMapLikeType(((java.lang.Class)v8),((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.JavaType)v27));
    org.junit.Assert.assertNotNull(v35);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = null;
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).withModifier(((com.fasterxml.jackson.databind.type.TypeModifier)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v4 = "NUMBER";
    Object v5 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v4));
    Object v6 = "NUMBER";
    Object v7 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v6));
    Object v8 = java.util.EnumSet.of(((java.lang.Enum)v5),((java.lang.Enum)v7));
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v8));
    Object v10 = new com.fasterxml.jackson.databind.type.ClassStack(((java.lang.Class)v9));
    Object v11 = "NUMBER";
    Object v12 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v11));
    Object v13 = "NUMBER";
    Object v14 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v13));
    Object v15 = java.util.EnumSet.of(((java.lang.Enum)v12),((java.lang.Enum)v14));
    Object v16 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v15));
    Object v17 = "NUMBER";
    Object v18 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v17));
    Object v19 = ((java.lang.Class)v16).cast(((java.lang.Object)v18));
    Object v20 = "NUMBER";
    Object v21 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v20));
    Object v22 = "NUMBER";
    Object v23 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v22));
    Object v24 = java.util.EnumSet.of(((java.lang.Enum)v21),((java.lang.Enum)v23));
    Object v25 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v24));
    Object v26 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v27 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v25),((com.fasterxml.jackson.databind.JavaType[])v26));
    Object v28 = ((com.fasterxml.jackson.databind.type.TypeFactory)v3)._fromClass(((com.fasterxml.jackson.databind.type.ClassStack)v10),((java.lang.Class)v16),((com.fasterxml.jackson.databind.type.TypeBindings)v27));
    Object v29 = "NUMBER";
    Object v30 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v29));
    Object v31 = "NUMBER";
    Object v32 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v31));
    Object v33 = java.util.EnumSet.of(((java.lang.Enum)v30),((java.lang.Enum)v32));
    Object v34 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v33));
    Object v35 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v34));
    Object v36 = ((com.fasterxml.jackson.databind.type.TypeFactory)v2).constructSpecializedType(((com.fasterxml.jackson.databind.JavaType)v28),((java.lang.Class)v35));
    org.junit.Assert.assertNotNull(v36);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = null;
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).withModifier(((com.fasterxml.jackson.databind.type.TypeModifier)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v4 = null;
    Object v5 = ((com.fasterxml.jackson.databind.type.TypeFactory)v3).withModifier(((com.fasterxml.jackson.databind.type.TypeModifier)v4));
    Object v6 = "NUMBER";
    Object v7 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v6));
    Object v8 = "NUMBER";
    Object v9 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v8));
    Object v10 = java.util.EnumSet.of(((java.lang.Enum)v7),((java.lang.Enum)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = ((com.fasterxml.jackson.databind.type.TypeFactory)v5).constructArrayType(((java.lang.Class)v12));
    Object v14 = "NUMBER";
    Object v15 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v14));
    Object v16 = "NUMBER";
    Object v17 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v16));
    Object v18 = java.util.EnumSet.of(((java.lang.Enum)v15),((java.lang.Enum)v17));
    Object v19 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v18));
    Object v20 = "NUMBER";
    Object v21 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v20));
    Object v22 = "NUMBER";
    Object v23 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v22));
    Object v24 = java.util.EnumSet.of(((java.lang.Enum)v21),((java.lang.Enum)v23));
    Object v25 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v24));
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v25));
    Object v27 = ((java.lang.Class)v19).isNestmateOf(((java.lang.Class)v26));
    Object v28 = ((com.fasterxml.jackson.databind.type.TypeFactory)v2).constructGeneralizedType(((com.fasterxml.jackson.databind.JavaType)v13),((java.lang.Class)v19));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = null;
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).withModifier(((com.fasterxml.jackson.databind.type.TypeModifier)v1));
    Object v3 = "NUMBER";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v3));
    Object v5 = "NUMBER";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v5));
    Object v7 = java.util.EnumSet.of(((java.lang.Enum)v4),((java.lang.Enum)v6));
    Object v8 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v7));
    Object v9 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v8));
    Object v10 = ((com.fasterxml.jackson.databind.type.TypeFactory)v2).constructArrayType(((com.fasterxml.jackson.databind.JavaType)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = null;
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).withModifier(((com.fasterxml.jackson.databind.type.TypeModifier)v1));
    Object v3 = "NUMBER";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v3));
    Object v5 = "NUMBER";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v5));
    Object v7 = java.util.EnumSet.of(((java.lang.Enum)v4),((java.lang.Enum)v6));
    Object v8 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = "NUMBER";
    Object v11 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v10));
    Object v12 = "NUMBER";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v12));
    Object v14 = java.util.EnumSet.of(((java.lang.Enum)v11),((java.lang.Enum)v13));
    Object v15 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v14));
    Object v16 = ((java.lang.Class)v15).getSuperclass();
    Object v17 = "NUMBER";
    Object v18 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v17));
    Object v19 = "NUMBER";
    Object v20 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v19));
    Object v21 = java.util.EnumSet.of(((java.lang.Enum)v18),((java.lang.Enum)v20));
    Object v22 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v21));
    Object v23 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v24 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v22),((com.fasterxml.jackson.databind.JavaType[])v23));
    Object v25 = ((com.fasterxml.jackson.databind.type.TypeFactory)v2).findTypeParameters(((java.lang.Class)v9),((java.lang.Class)v15),((com.fasterxml.jackson.databind.type.TypeBindings)v24));
    org.junit.Assert.assertNotNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = null;
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).withModifier(((com.fasterxml.jackson.databind.type.TypeModifier)v1));
    Object v3 = "NUMBER";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v3));
    Object v5 = "NUMBER";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v5));
    Object v7 = java.util.EnumSet.of(((java.lang.Enum)v4),((java.lang.Enum)v6));
    Object v8 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = ((com.fasterxml.jackson.databind.type.TypeFactory)v2).constructArrayType(((java.lang.Class)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = null;
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).withModifier(((com.fasterxml.jackson.databind.type.TypeModifier)v1));
    Object v3 = "NUMBER";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v3));
    Object v5 = "NUMBER";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v5));
    Object v7 = java.util.EnumSet.of(((java.lang.Enum)v4),((java.lang.Enum)v6));
    Object v8 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v7));
    Object v9 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v11 = null;
    Object v12 = ((com.fasterxml.jackson.databind.type.TypeFactory)v10).withModifier(((com.fasterxml.jackson.databind.type.TypeModifier)v11));
    Object v13 = "NUMBER";
    Object v14 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v13));
    Object v15 = "NUMBER";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v15));
    Object v17 = java.util.EnumSet.of(((java.lang.Enum)v14),((java.lang.Enum)v16));
    Object v18 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v17));
    Object v19 = "NUMBER";
    Object v20 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v19));
    Object v21 = "NUMBER";
    Object v22 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v21));
    Object v23 = java.util.EnumSet.of(((java.lang.Enum)v20),((java.lang.Enum)v22));
    Object v24 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v23));
    Object v25 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v26 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v24),((com.fasterxml.jackson.databind.JavaType[])v25));
    Object v27 = "NUMBER";
    Object v28 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v27));
    Object v29 = "NUMBER";
    Object v30 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v29));
    Object v31 = java.util.EnumSet.of(((java.lang.Enum)v28),((java.lang.Enum)v30));
    Object v32 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v31));
    Object v33 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v32));
    Object v34 = ((com.fasterxml.jackson.databind.JavaType)v33).getSuperClass();
    Object v35 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v36 = ((com.fasterxml.jackson.databind.type.TypeFactory)v12)._constructSimple(((java.lang.Class)v18),((com.fasterxml.jackson.databind.type.TypeBindings)v26),((com.fasterxml.jackson.databind.JavaType)v33),((com.fasterxml.jackson.databind.JavaType[])v35));
    Object v37 = ((com.fasterxml.jackson.databind.type.TypeFactory)v2).moreSpecificType(((com.fasterxml.jackson.databind.JavaType)v9),((com.fasterxml.jackson.databind.JavaType)v36));
    org.junit.Assert.assertNotNull(v37);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = null;
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).withModifier(((com.fasterxml.jackson.databind.type.TypeModifier)v1));
    Object v3 = "NUMBER";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v3));
    Object v5 = "NUMBER";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v5));
    Object v7 = java.util.EnumSet.of(((java.lang.Enum)v4),((java.lang.Enum)v6));
    Object v8 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = "NUMBER";
    Object v11 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v10));
    Object v12 = "NUMBER";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v12));
    Object v14 = java.util.EnumSet.of(((java.lang.Enum)v11),((java.lang.Enum)v13));
    Object v15 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = ((java.lang.Class)v9).isNestmateOf(((java.lang.Class)v16));
    Object v18 = "NUMBER";
    Object v19 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v18));
    Object v20 = "NUMBER";
    Object v21 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v20));
    Object v22 = java.util.EnumSet.of(((java.lang.Enum)v19),((java.lang.Enum)v21));
    Object v23 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v22));
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v23));
    Object v25 = "NUMBER";
    Object v26 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v25));
    Object v27 = "NUMBER";
    Object v28 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v27));
    Object v29 = java.util.EnumSet.of(((java.lang.Enum)v26),((java.lang.Enum)v28));
    Object v30 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v29));
    Object v31 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v30));
    Object v32 = ((com.fasterxml.jackson.databind.type.TypeFactory)v2).constructMapType(((java.lang.Class)v9),((java.lang.Class)v24),((java.lang.Class)v31));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = "NUMBER";
    Object v2 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v1));
    Object v3 = "NUMBER";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v3));
    Object v5 = java.util.EnumSet.of(((java.lang.Enum)v2),((java.lang.Enum)v4));
    Object v6 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v5));
    Object v7 = new com.fasterxml.jackson.databind.type.ClassStack(((java.lang.Class)v6));
    Object v8 = ((com.fasterxml.jackson.databind.type.ClassStack)v7).toString();
    Object v9 = "NUMBER";
    Object v10 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v9));
    Object v11 = "NUMBER";
    Object v12 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v11));
    Object v13 = java.util.EnumSet.of(((java.lang.Enum)v10),((java.lang.Enum)v12));
    Object v14 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v13));
    Object v15 = "NUMBER";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v15));
    Object v17 = "NUMBER";
    Object v18 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v17));
    Object v19 = java.util.EnumSet.of(((java.lang.Enum)v16),((java.lang.Enum)v18));
    Object v20 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v19));
    Object v21 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v22 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v20),((com.fasterxml.jackson.databind.JavaType[])v21));
    Object v23 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0)._resolveSuperClass(((com.fasterxml.jackson.databind.type.ClassStack)v7),((java.lang.Class)v14),((com.fasterxml.jackson.databind.type.TypeBindings)v22));
    org.junit.Assert.assertNotNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = null;
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).withModifier(((com.fasterxml.jackson.databind.type.TypeModifier)v1));
    Object v3 = "NUMBER";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v3));
    Object v5 = "NUMBER";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v5));
    Object v7 = java.util.EnumSet.of(((java.lang.Enum)v4),((java.lang.Enum)v6));
    Object v8 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = ((java.lang.Class)v9).getSuperclass();
    Object v11 = new java.lang.Class[]{};
    Object v12 = ((com.fasterxml.jackson.databind.type.TypeFactory)v2).constructParametricType(((java.lang.Class)v9),((java.lang.Class[])v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = null;
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).withModifier(((com.fasterxml.jackson.databind.type.TypeModifier)v1));
    Object v3 = "NUMBER";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v3));
    Object v5 = "NUMBER";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v5));
    Object v7 = java.util.EnumSet.of(((java.lang.Enum)v4),((java.lang.Enum)v6));
    Object v8 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = null;
    Object v11 = ((com.fasterxml.jackson.databind.type.TypeFactory)v9).withModifier(((com.fasterxml.jackson.databind.type.TypeModifier)v10));
    Object v12 = "NUMBER";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v12));
    Object v14 = "NUMBER";
    Object v15 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v14));
    Object v16 = java.util.EnumSet.of(((java.lang.Enum)v13),((java.lang.Enum)v15));
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v16));
    Object v18 = "NUMBER";
    Object v19 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v18));
    Object v20 = "NUMBER";
    Object v21 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v20));
    Object v22 = java.util.EnumSet.of(((java.lang.Enum)v19),((java.lang.Enum)v21));
    Object v23 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v22));
    Object v24 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v25 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v23),((com.fasterxml.jackson.databind.JavaType[])v24));
    Object v26 = "NUMBER";
    Object v27 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v26));
    Object v28 = "NUMBER";
    Object v29 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v28));
    Object v30 = java.util.EnumSet.of(((java.lang.Enum)v27),((java.lang.Enum)v29));
    Object v31 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v30));
    Object v32 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v31));
    Object v33 = ((com.fasterxml.jackson.databind.JavaType)v32).getSuperClass();
    Object v34 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v35 = ((com.fasterxml.jackson.databind.type.TypeFactory)v11)._constructSimple(((java.lang.Class)v17),((com.fasterxml.jackson.databind.type.TypeBindings)v25),((com.fasterxml.jackson.databind.JavaType)v32),((com.fasterxml.jackson.databind.JavaType[])v34));
    Object v36 = ((com.fasterxml.jackson.databind.type.TypeFactory)v2).constructCollectionLikeType(((java.lang.Class)v8),((com.fasterxml.jackson.databind.JavaType)v35));
    org.junit.Assert.assertNotNull(v36);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = null;
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).withModifier(((com.fasterxml.jackson.databind.type.TypeModifier)v1));
    Object v3 = "NUMBER";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v3));
    Object v5 = "NUMBER";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v5));
    Object v7 = java.util.EnumSet.of(((java.lang.Enum)v4),((java.lang.Enum)v6));
    Object v8 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = "NUMBER";
    Object v11 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v10));
    Object v12 = "NUMBER";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v12));
    Object v14 = java.util.EnumSet.of(((java.lang.Enum)v11),((java.lang.Enum)v13));
    Object v15 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v14));
    Object v16 = ((com.fasterxml.jackson.databind.type.TypeFactory)v2).constructCollectionLikeType(((java.lang.Class)v9),((java.lang.Class)v15));
    Object v17 = "NUMBER";
    Object v18 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v17));
    Object v19 = "NUMBER";
    Object v20 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v19));
    Object v21 = java.util.EnumSet.of(((java.lang.Enum)v18),((java.lang.Enum)v20));
    Object v22 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v21));
    Object v23 = ((com.fasterxml.jackson.databind.type.TypeFactory)v2)._findWellKnownSimple(((java.lang.Class)v22));
    org.junit.Assert.assertNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = null;
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).withModifier(((com.fasterxml.jackson.databind.type.TypeModifier)v1));
    Object v3 = "NUMBER";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v3));
    Object v5 = "NUMBER";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v5));
    Object v7 = java.util.EnumSet.of(((java.lang.Enum)v4),((java.lang.Enum)v6));
    Object v8 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v7));
    Object v9 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v8));
    Object v10 = "NUMBER";
    Object v11 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v10));
    Object v12 = ((com.fasterxml.jackson.databind.JavaType)v9).withTypeHandler(((java.lang.Object)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v14 = null;
    Object v15 = ((com.fasterxml.jackson.databind.type.TypeFactory)v13).withModifier(((com.fasterxml.jackson.databind.type.TypeModifier)v14));
    Object v16 = "NUMBER";
    Object v17 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v16));
    Object v18 = "NUMBER";
    Object v19 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v18));
    Object v20 = java.util.EnumSet.of(((java.lang.Enum)v17),((java.lang.Enum)v19));
    Object v21 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v20));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v21));
    Object v23 = ((java.lang.Class)v22).getCanonicalName();
    Object v24 = ((com.fasterxml.jackson.databind.type.TypeFactory)v15).uncheckedSimpleType(((java.lang.Class)v22));
    Object v25 = ((com.fasterxml.jackson.databind.JavaType)v24).toString();
    Object v26 = ((com.fasterxml.jackson.databind.type.TypeFactory)v2).moreSpecificType(((com.fasterxml.jackson.databind.JavaType)v9),((com.fasterxml.jackson.databind.JavaType)v24));
    org.junit.Assert.assertNotNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = null;
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).withModifier(((com.fasterxml.jackson.databind.type.TypeModifier)v1));
    Object v3 = "NUMBER";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v3));
    Object v5 = "NUMBER";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v5));
    Object v7 = java.util.EnumSet.of(((java.lang.Enum)v4),((java.lang.Enum)v6));
    Object v8 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v11 = null;
    Object v12 = ((com.fasterxml.jackson.databind.type.TypeFactory)v10).withModifier(((com.fasterxml.jackson.databind.type.TypeModifier)v11));
    Object v13 = "NUMBER";
    Object v14 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v13));
    Object v15 = "NUMBER";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v15));
    Object v17 = java.util.EnumSet.of(((java.lang.Enum)v14),((java.lang.Enum)v16));
    Object v18 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v17));
    Object v19 = "NUMBER";
    Object v20 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v19));
    Object v21 = "NUMBER";
    Object v22 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v21));
    Object v23 = java.util.EnumSet.of(((java.lang.Enum)v20),((java.lang.Enum)v22));
    Object v24 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v23));
    Object v25 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v26 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v24),((com.fasterxml.jackson.databind.JavaType[])v25));
    Object v27 = "NUMBER";
    Object v28 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v27));
    Object v29 = "NUMBER";
    Object v30 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v29));
    Object v31 = java.util.EnumSet.of(((java.lang.Enum)v28),((java.lang.Enum)v30));
    Object v32 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v31));
    Object v33 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v32));
    Object v34 = ((com.fasterxml.jackson.databind.JavaType)v33).getSuperClass();
    Object v35 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v36 = ((com.fasterxml.jackson.databind.type.TypeFactory)v12)._constructSimple(((java.lang.Class)v18),((com.fasterxml.jackson.databind.type.TypeBindings)v26),((com.fasterxml.jackson.databind.JavaType)v33),((com.fasterxml.jackson.databind.JavaType[])v35));
    Object v37 = ((com.fasterxml.jackson.databind.JavaType)v36).hasGenericTypes();
    Object v38 = ((com.fasterxml.jackson.databind.type.TypeFactory)v2).constructReferenceType(((java.lang.Class)v9),((com.fasterxml.jackson.databind.JavaType)v36));
    org.junit.Assert.assertNotNull(v38);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = null;
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).withModifier(((com.fasterxml.jackson.databind.type.TypeModifier)v1));
    Object v3 = "NUMBER";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v3));
    Object v5 = "NUMBER";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v5));
    Object v7 = java.util.EnumSet.of(((java.lang.Enum)v4),((java.lang.Enum)v6));
    Object v8 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v7));
    Object v9 = ((com.fasterxml.jackson.databind.type.TypeFactory)v2).uncheckedSimpleType(((java.lang.Class)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = null;
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).withModifier(((com.fasterxml.jackson.databind.type.TypeModifier)v1));
    Object v3 = "NUMBER";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v3));
    Object v5 = "NUMBER";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v5));
    Object v7 = java.util.EnumSet.of(((java.lang.Enum)v4),((java.lang.Enum)v6));
    Object v8 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = "NUMBER";
    Object v11 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v10));
    Object v12 = "NUMBER";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v12));
    Object v14 = java.util.EnumSet.of(((java.lang.Enum)v11),((java.lang.Enum)v13));
    Object v15 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v18 = ((com.fasterxml.jackson.databind.type.TypeFactory)v2).constructParametrizedType(((java.lang.Class)v9),((java.lang.Class)v16),((com.fasterxml.jackson.databind.JavaType[])v17));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = "NUMBER";
    Object v2 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v1));
    Object v3 = "NUMBER";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v3));
    Object v5 = java.util.EnumSet.of(((java.lang.Enum)v2),((java.lang.Enum)v4));
    Object v6 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v5));
    Object v7 = "NUMBER";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v7));
    Object v9 = "NUMBER";
    Object v10 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v9));
    Object v11 = java.util.EnumSet.of(((java.lang.Enum)v8),((java.lang.Enum)v10));
    Object v12 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v11));
    Object v13 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).constructCollectionType(((java.lang.Class)v6),((java.lang.Class)v12));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = null;
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).withModifier(((com.fasterxml.jackson.databind.type.TypeModifier)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v4 = null;
    Object v5 = ((com.fasterxml.jackson.databind.type.TypeFactory)v3).withModifier(((com.fasterxml.jackson.databind.type.TypeModifier)v4));
    Object v6 = "NUMBER";
    Object v7 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v6));
    Object v8 = "NUMBER";
    Object v9 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v8));
    Object v10 = java.util.EnumSet.of(((java.lang.Enum)v7),((java.lang.Enum)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = ((com.fasterxml.jackson.databind.type.TypeFactory)v5).constructArrayType(((java.lang.Class)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = "NUMBER";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v15));
    Object v17 = "NUMBER";
    Object v18 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v17));
    Object v19 = java.util.EnumSet.of(((java.lang.Enum)v16),((java.lang.Enum)v18));
    Object v20 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v19));
    Object v21 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v20));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v21));
    Object v23 = new java.lang.Class[]{null,null,null};
    Object v24 = ((com.fasterxml.jackson.databind.type.TypeFactory)v2).constructParametrizedType(((java.lang.Class)v14),((java.lang.Class)v22),((java.lang.Class[])v23));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0)._unknownType();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = "NUMBER";
    Object v2 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v1));
    Object v3 = "NUMBER";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v3));
    Object v5 = java.util.EnumSet.of(((java.lang.Enum)v2),((java.lang.Enum)v4));
    Object v6 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = "NUMBER";
    Object v9 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v8));
    Object v10 = "NUMBER";
    Object v11 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v10));
    Object v12 = java.util.EnumSet.of(((java.lang.Enum)v9),((java.lang.Enum)v11));
    Object v13 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v12));
    Object v14 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v14));
    Object v16 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).constructType(((java.lang.reflect.Type)v7),((java.lang.Class)v15));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = null;
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).withModifier(((com.fasterxml.jackson.databind.type.TypeModifier)v1));
    Object v3 = "NUMBER";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v3));
    Object v5 = "NUMBER";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v5));
    Object v7 = java.util.EnumSet.of(((java.lang.Enum)v4),((java.lang.Enum)v6));
    Object v8 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v7));
    Object v9 = new com.fasterxml.jackson.databind.type.ClassStack(((java.lang.Class)v8));
    Object v10 = "NUMBER";
    Object v11 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v10));
    Object v12 = "NUMBER";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v12));
    Object v14 = java.util.EnumSet.of(((java.lang.Enum)v11),((java.lang.Enum)v13));
    Object v15 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v14));
    Object v16 = "NUMBER";
    Object v17 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v16));
    Object v18 = "NUMBER";
    Object v19 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v18));
    Object v20 = java.util.EnumSet.of(((java.lang.Enum)v17),((java.lang.Enum)v19));
    Object v21 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v20));
    Object v22 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v23 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v21),((com.fasterxml.jackson.databind.JavaType[])v22));
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v25 = null;
    Object v26 = ((com.fasterxml.jackson.databind.type.TypeFactory)v24).withModifier(((com.fasterxml.jackson.databind.type.TypeModifier)v25));
    Object v27 = "NUMBER";
    Object v28 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v27));
    Object v29 = "NUMBER";
    Object v30 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v29));
    Object v31 = java.util.EnumSet.of(((java.lang.Enum)v28),((java.lang.Enum)v30));
    Object v32 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v31));
    Object v33 = ((com.fasterxml.jackson.databind.type.TypeFactory)v26).constructRawMapLikeType(((java.lang.Class)v32));
    Object v34 = new com.fasterxml.jackson.databind.JavaType[]{null,null};
    Object v35 = ((com.fasterxml.jackson.databind.type.TypeFactory)v2)._fromWellKnownInterface(((com.fasterxml.jackson.databind.type.ClassStack)v9),((java.lang.Class)v15),((com.fasterxml.jackson.databind.type.TypeBindings)v23),((com.fasterxml.jackson.databind.JavaType)v33),((com.fasterxml.jackson.databind.JavaType[])v34));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = "NUMBER";
    Object v2 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v1));
    Object v3 = "NUMBER";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v3));
    Object v5 = java.util.EnumSet.of(((java.lang.Enum)v2),((java.lang.Enum)v4));
    Object v6 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v5));
    Object v7 = new com.fasterxml.jackson.databind.type.ClassStack(((java.lang.Class)v6));
    Object v8 = "NUMBER";
    Object v9 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v8));
    Object v10 = "NUMBER";
    Object v11 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v10));
    Object v12 = java.util.EnumSet.of(((java.lang.Enum)v9),((java.lang.Enum)v11));
    Object v13 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v12));
    Object v14 = "NUMBER";
    Object v15 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v14));
    Object v16 = "NUMBER";
    Object v17 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v16));
    Object v18 = java.util.EnumSet.of(((java.lang.Enum)v15),((java.lang.Enum)v17));
    Object v19 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v18));
    Object v20 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v21 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v19),((com.fasterxml.jackson.databind.JavaType[])v20));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v23 = null;
    Object v24 = ((com.fasterxml.jackson.databind.type.TypeFactory)v22).withModifier(((com.fasterxml.jackson.databind.type.TypeModifier)v23));
    Object v25 = "NUMBER";
    Object v26 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v25));
    Object v27 = "NUMBER";
    Object v28 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v27));
    Object v29 = java.util.EnumSet.of(((java.lang.Enum)v26),((java.lang.Enum)v28));
    Object v30 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v29));
    Object v31 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v30));
    Object v32 = ((com.fasterxml.jackson.databind.type.TypeFactory)v24).constructArrayType(((com.fasterxml.jackson.databind.JavaType)v31));
    Object v33 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v34 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0)._fromWellKnownInterface(((com.fasterxml.jackson.databind.type.ClassStack)v7),((java.lang.Class)v13),((com.fasterxml.jackson.databind.type.TypeBindings)v21),((com.fasterxml.jackson.databind.JavaType)v32),((com.fasterxml.jackson.databind.JavaType[])v33));
    org.junit.Assert.assertNull(v34);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = null;
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).withModifier(((com.fasterxml.jackson.databind.type.TypeModifier)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v4 = ((com.fasterxml.jackson.databind.type.TypeFactory)v3)._unknownType();
    Object v5 = "NUMBER";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v5));
    Object v7 = "NUMBER";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v7));
    Object v9 = java.util.EnumSet.of(((java.lang.Enum)v6),((java.lang.Enum)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = ((com.fasterxml.jackson.databind.type.TypeFactory)v2).constructSpecializedType(((com.fasterxml.jackson.databind.JavaType)v4),((java.lang.Class)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = null;
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).withModifier(((com.fasterxml.jackson.databind.type.TypeModifier)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v4 = null;
    Object v5 = ((com.fasterxml.jackson.databind.type.TypeFactory)v3).withModifier(((com.fasterxml.jackson.databind.type.TypeModifier)v4));
    Object v6 = "NUMBER";
    Object v7 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v6));
    Object v8 = "NUMBER";
    Object v9 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v8));
    Object v10 = java.util.EnumSet.of(((java.lang.Enum)v7),((java.lang.Enum)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = ((com.fasterxml.jackson.databind.type.TypeFactory)v5).constructArrayType(((java.lang.Class)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = "NUMBER";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v15));
    Object v17 = "NUMBER";
    Object v18 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v17));
    Object v19 = java.util.EnumSet.of(((java.lang.Enum)v16),((java.lang.Enum)v18));
    Object v20 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v19));
    Object v21 = new java.lang.Class[]{null,null};
    Object v22 = ((com.fasterxml.jackson.databind.type.TypeFactory)v2).constructParametrizedType(((java.lang.Class)v14),((java.lang.Class)v20),((java.lang.Class[])v21));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = "NUMBER";
    Object v2 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v1));
    Object v3 = "NUMBER";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v3));
    Object v5 = java.util.EnumSet.of(((java.lang.Enum)v2),((java.lang.Enum)v4));
    Object v6 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v5));
    Object v7 = new com.fasterxml.jackson.databind.type.ClassStack(((java.lang.Class)v6));
    Object v8 = "NUMBER";
    Object v9 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v8));
    Object v10 = "NUMBER";
    Object v11 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v10));
    Object v12 = java.util.EnumSet.of(((java.lang.Enum)v9),((java.lang.Enum)v11));
    Object v13 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = "NUMBER";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v15));
    Object v17 = "NUMBER";
    Object v18 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v17));
    Object v19 = java.util.EnumSet.of(((java.lang.Enum)v16),((java.lang.Enum)v18));
    Object v20 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v19));
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = ((java.lang.Class)v14).isNestmateOf(((java.lang.Class)v21));
    Object v23 = "NUMBER";
    Object v24 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v23));
    Object v25 = "NUMBER";
    Object v26 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v25));
    Object v27 = java.util.EnumSet.of(((java.lang.Enum)v24),((java.lang.Enum)v26));
    Object v28 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v27));
    Object v29 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v30 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v28),((com.fasterxml.jackson.databind.JavaType[])v29));
    Object v31 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0)._fromClass(((com.fasterxml.jackson.databind.type.ClassStack)v7),((java.lang.Class)v14),((com.fasterxml.jackson.databind.type.TypeBindings)v30));
    org.junit.Assert.assertNotNull(v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = null;
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).withModifier(((com.fasterxml.jackson.databind.type.TypeModifier)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v4 = ((com.fasterxml.jackson.databind.type.TypeFactory)v3)._unknownType();
    Object v5 = ((com.fasterxml.jackson.databind.JavaType)v4).hasGenericTypes();
    Object v6 = "NUMBER";
    Object v7 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v6));
    Object v8 = "NUMBER";
    Object v9 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v8));
    Object v10 = java.util.EnumSet.of(((java.lang.Enum)v7),((java.lang.Enum)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = ((com.fasterxml.jackson.databind.type.TypeFactory)v2).constructGeneralizedType(((com.fasterxml.jackson.databind.JavaType)v4),((java.lang.Class)v12));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = null;
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).withModifier(((com.fasterxml.jackson.databind.type.TypeModifier)v1));
    Object v3 = "NUMBER";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v3));
    Object v5 = "NUMBER";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v5));
    Object v7 = java.util.EnumSet.of(((java.lang.Enum)v4),((java.lang.Enum)v6));
    Object v8 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = ((java.lang.Class)v9).getNestMembers();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v12 = null;
    Object v13 = ((com.fasterxml.jackson.databind.type.TypeFactory)v11).withModifier(((com.fasterxml.jackson.databind.type.TypeModifier)v12));
    Object v14 = "NUMBER";
    Object v15 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v14));
    Object v16 = "NUMBER";
    Object v17 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v16));
    Object v18 = java.util.EnumSet.of(((java.lang.Enum)v15),((java.lang.Enum)v17));
    Object v19 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v18));
    Object v20 = ((com.fasterxml.jackson.databind.type.TypeFactory)v13).constructRawMapLikeType(((java.lang.Class)v19));
    Object v21 = ((com.fasterxml.jackson.databind.type.TypeFactory)v2).constructCollectionLikeType(((java.lang.Class)v9),((com.fasterxml.jackson.databind.JavaType)v20));
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = null;
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).withModifier(((com.fasterxml.jackson.databind.type.TypeModifier)v1));
    Object v3 = new com.fasterxml.jackson.databind.type.TypeParser(((com.fasterxml.jackson.databind.type.TypeFactory)v2));
    Object v4 = new com.fasterxml.jackson.databind.type.TypeModifier[]{null,null,null};
    Object v5 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v6 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.type.TypeParser)v3),((com.fasterxml.jackson.databind.type.TypeModifier[])v4),((java.lang.ClassLoader)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = null;
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).withModifier(((com.fasterxml.jackson.databind.type.TypeModifier)v1));
    Object v3 = "NUMBER";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v3));
    Object v5 = "NUMBER";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v5));
    Object v7 = java.util.EnumSet.of(((java.lang.Enum)v4),((java.lang.Enum)v6));
    Object v8 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v7));
    Object v9 = new com.fasterxml.jackson.databind.type.ClassStack(((java.lang.Class)v8));
    Object v10 = "NUMBER";
    Object v11 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v10));
    Object v12 = "NUMBER";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v12));
    Object v14 = java.util.EnumSet.of(((java.lang.Enum)v11),((java.lang.Enum)v13));
    Object v15 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = ((java.lang.Class)v16).getSigners();
    Object v18 = "NUMBER";
    Object v19 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v18));
    Object v20 = "NUMBER";
    Object v21 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v20));
    Object v22 = java.util.EnumSet.of(((java.lang.Enum)v19),((java.lang.Enum)v21));
    Object v23 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v22));
    Object v24 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v25 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v23),((com.fasterxml.jackson.databind.JavaType[])v24));
    Object v26 = ((com.fasterxml.jackson.databind.type.TypeFactory)v2)._fromClass(((com.fasterxml.jackson.databind.type.ClassStack)v9),((java.lang.Class)v16),((com.fasterxml.jackson.databind.type.TypeBindings)v25));
    org.junit.Assert.assertNotNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = null;
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).withModifier(((com.fasterxml.jackson.databind.type.TypeModifier)v1));
    Object v3 = "NUMBER";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v3));
    Object v5 = "NUMBER";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v5));
    Object v7 = java.util.EnumSet.of(((java.lang.Enum)v4),((java.lang.Enum)v6));
    Object v8 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = ((java.lang.Class)v9).getNestHost();
    Object v11 = "NUMBER";
    Object v12 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v11));
    Object v13 = "NUMBER";
    Object v14 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v13));
    Object v15 = java.util.EnumSet.of(((java.lang.Enum)v12),((java.lang.Enum)v14));
    Object v16 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v15));
    Object v17 = ((com.fasterxml.jackson.databind.type.TypeFactory)v2).constructCollectionLikeType(((java.lang.Class)v9),((java.lang.Class)v16));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = null;
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).withModifier(((com.fasterxml.jackson.databind.type.TypeModifier)v1));
    Object v3 = "NUMBER";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v3));
    Object v5 = "NUMBER";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v5));
    Object v7 = java.util.EnumSet.of(((java.lang.Enum)v4),((java.lang.Enum)v6));
    Object v8 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = ((com.fasterxml.jackson.databind.type.TypeFactory)v2).constructRawMapLikeType(((java.lang.Class)v9));
    Object v11 = "Can not use FormatSchema of type ";
    Object v12 = ((com.fasterxml.jackson.databind.type.TypeFactory)v2)._findPrimitive(((java.lang.String)v11));
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = null;
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).withModifier(((com.fasterxml.jackson.databind.type.TypeModifier)v1));
    Object v3 = new com.fasterxml.jackson.databind.type.TypeParser(((com.fasterxml.jackson.databind.type.TypeFactory)v2));
    Object v4 = new com.fasterxml.jackson.databind.type.TypeModifier[]{null,null,null};
    Object v5 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v6 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.type.TypeParser)v3),((com.fasterxml.jackson.databind.type.TypeModifier[])v4),((java.lang.ClassLoader)v5));
    Object v7 = "NUMBER";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v7));
    Object v9 = "NUMBER";
    Object v10 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v9));
    Object v11 = java.util.EnumSet.of(((java.lang.Enum)v8),((java.lang.Enum)v10));
    Object v12 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = new java.lang.Class[]{null};
    Object v15 = ((com.fasterxml.jackson.databind.type.TypeFactory)v6).constructParametricType(((java.lang.Class)v13),((java.lang.Class[])v14));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = null;
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).withModifier(((com.fasterxml.jackson.databind.type.TypeModifier)v1));
    Object v3 = new com.fasterxml.jackson.databind.type.TypeParser(((com.fasterxml.jackson.databind.type.TypeFactory)v2));
    Object v4 = new com.fasterxml.jackson.databind.type.TypeModifier[]{null,null,null};
    Object v5 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v6 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.type.TypeParser)v3),((com.fasterxml.jackson.databind.type.TypeModifier[])v4),((java.lang.ClassLoader)v5));
    Object v7 = ((com.fasterxml.jackson.databind.type.TypeFactory)v6).getClassLoader();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = "NUMBER";
    Object v1 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v0));
    Object v2 = "NUMBER";
    Object v3 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v2));
    Object v4 = java.util.EnumSet.of(((java.lang.Enum)v1),((java.lang.Enum)v3));
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = ((java.lang.reflect.Type)v6).getTypeName();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = null;
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).withModifier(((com.fasterxml.jackson.databind.type.TypeModifier)v1));
    Object v3 = new com.fasterxml.jackson.databind.type.TypeParser(((com.fasterxml.jackson.databind.type.TypeFactory)v2));
    Object v4 = new com.fasterxml.jackson.databind.type.TypeModifier[]{null,null,null};
    Object v5 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v6 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.type.TypeParser)v3),((com.fasterxml.jackson.databind.type.TypeModifier[])v4),((java.lang.ClassLoader)v5));
    Object v7 = "NUMBER";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v7));
    Object v9 = "NUMBER";
    Object v10 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v9));
    Object v11 = java.util.EnumSet.of(((java.lang.Enum)v8),((java.lang.Enum)v10));
    Object v12 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = ((java.lang.reflect.Type)v13).getTypeName();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v16 = "NUMBER";
    Object v17 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v16));
    Object v18 = "NUMBER";
    Object v19 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v18));
    Object v20 = java.util.EnumSet.of(((java.lang.Enum)v17),((java.lang.Enum)v19));
    Object v21 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v20));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v21));
    Object v23 = "NUMBER";
    Object v24 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v23));
    Object v25 = "NUMBER";
    Object v26 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v25));
    Object v27 = java.util.EnumSet.of(((java.lang.Enum)v24),((java.lang.Enum)v26));
    Object v28 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v27));
    Object v29 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v30 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v28),((com.fasterxml.jackson.databind.JavaType[])v29));
    Object v31 = ((com.fasterxml.jackson.databind.type.TypeFactory)v6).findTypeParameters(((java.lang.Class)v15),((java.lang.Class)v22),((com.fasterxml.jackson.databind.type.TypeBindings)v30));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = null;
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).withModifier(((com.fasterxml.jackson.databind.type.TypeModifier)v1));
    Object v3 = "NUMBER";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v3));
    Object v5 = "NUMBER";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v5));
    Object v7 = java.util.EnumSet.of(((java.lang.Enum)v4),((java.lang.Enum)v6));
    Object v8 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = "NUMBER";
    Object v11 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v10));
    Object v12 = "NUMBER";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v12));
    Object v14 = java.util.EnumSet.of(((java.lang.Enum)v11),((java.lang.Enum)v13));
    Object v15 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = "NUMBER";
    Object v18 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v17));
    Object v19 = "NUMBER";
    Object v20 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v19));
    Object v21 = java.util.EnumSet.of(((java.lang.Enum)v18),((java.lang.Enum)v20));
    Object v22 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v21));
    Object v23 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v24 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v22),((com.fasterxml.jackson.databind.JavaType[])v23));
    Object v25 = "[nll]";
    Object v26 = ((com.fasterxml.jackson.databind.type.TypeBindings)v24).findBoundType(((java.lang.String)v25));
    Object v27 = ((com.fasterxml.jackson.databind.type.TypeFactory)v2).findTypeParameters(((java.lang.Class)v9),((java.lang.Class)v16),((com.fasterxml.jackson.databind.type.TypeBindings)v24));
    org.junit.Assert.assertNotNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = "NUMBER";
    Object v2 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v1));
    Object v3 = "NUMBER";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v3));
    Object v5 = java.util.EnumSet.of(((java.lang.Enum)v2),((java.lang.Enum)v4));
    Object v6 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v5));
    Object v7 = ((java.lang.Class)v6).getPackageName();
    Object v8 = new com.fasterxml.jackson.databind.JavaType[]{null,null};
    Object v9 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).constructSimpleType(((java.lang.Class)v6),((com.fasterxml.jackson.databind.JavaType[])v8));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0)._unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = null;
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).withModifier(((com.fasterxml.jackson.databind.type.TypeModifier)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v4 = ((com.fasterxml.jackson.databind.type.TypeFactory)v3)._unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = "NUMBER";
    Object v7 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v6));
    Object v8 = "NUMBER";
    Object v9 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v8));
    Object v10 = java.util.EnumSet.of(((java.lang.Enum)v7),((java.lang.Enum)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = ((java.lang.Class)v5).cast(((java.lang.Object)v12));
    Object v14 = "NUMBER";
    Object v15 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v14));
    Object v16 = "NUMBER";
    Object v17 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v16));
    Object v18 = java.util.EnumSet.of(((java.lang.Enum)v15),((java.lang.Enum)v17));
    Object v19 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v18));
    Object v20 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v21 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v19),((com.fasterxml.jackson.databind.JavaType[])v20));
    Object v22 = "NUMBER";
    Object v23 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v22));
    Object v24 = "NUMBER";
    Object v25 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v24));
    Object v26 = java.util.EnumSet.of(((java.lang.Enum)v23),((java.lang.Enum)v25));
    Object v27 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v26));
    Object v28 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v27));
    Object v29 = "NUMBER";
    Object v30 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v29));
    Object v31 = "NUMBER";
    Object v32 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v31));
    Object v33 = java.util.EnumSet.of(((java.lang.Enum)v30),((java.lang.Enum)v32));
    Object v34 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v33));
    Object v35 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v34));
    Object v36 = ((com.fasterxml.jackson.databind.JavaType)v28).findTypeParameters(((java.lang.Class)v35));
    Object v37 = new com.fasterxml.jackson.databind.JavaType[]{null,null};
    Object v38 = ((com.fasterxml.jackson.databind.type.TypeFactory)v2)._constructSimple(((java.lang.Class)v5),((com.fasterxml.jackson.databind.type.TypeBindings)v21),((com.fasterxml.jackson.databind.JavaType)v28),((com.fasterxml.jackson.databind.JavaType[])v37));
    org.junit.Assert.assertNotNull(v38);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = null;
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).withModifier(((com.fasterxml.jackson.databind.type.TypeModifier)v1));
    Object v3 = new com.fasterxml.jackson.databind.type.TypeParser(((com.fasterxml.jackson.databind.type.TypeFactory)v2));
    Object v4 = new com.fasterxml.jackson.databind.type.TypeModifier[]{null,null,null};
    Object v5 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v6 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.type.TypeParser)v3),((com.fasterxml.jackson.databind.type.TypeModifier[])v4),((java.lang.ClassLoader)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v8 = ((com.fasterxml.jackson.databind.type.TypeFactory)v7)._unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v11 = ((com.fasterxml.jackson.databind.type.TypeFactory)v10)._unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v13 = null;
    Object v14 = ((com.fasterxml.jackson.databind.type.TypeFactory)v12).withModifier(((com.fasterxml.jackson.databind.type.TypeModifier)v13));
    Object v15 = "NUMBER";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v15));
    Object v17 = "NUMBER";
    Object v18 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v17));
    Object v19 = java.util.EnumSet.of(((java.lang.Enum)v16),((java.lang.Enum)v18));
    Object v20 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v19));
    Object v21 = ((com.fasterxml.jackson.databind.type.TypeFactory)v14).uncheckedSimpleType(((java.lang.Class)v20));
    Object v22 = ((com.fasterxml.jackson.databind.JavaType)v21).getErasedSignature();
    Object v23 = ((com.fasterxml.jackson.databind.type.TypeFactory)v6).constructMapLikeType(((java.lang.Class)v9),((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.JavaType)v21));
    org.junit.Assert.assertNotNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = null;
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).withModifier(((com.fasterxml.jackson.databind.type.TypeModifier)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v4 = null;
    Object v5 = ((com.fasterxml.jackson.databind.type.TypeFactory)v3).withModifier(((com.fasterxml.jackson.databind.type.TypeModifier)v4));
    Object v6 = new com.fasterxml.jackson.databind.type.TypeParser(((com.fasterxml.jackson.databind.type.TypeFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.type.TypeModifier[]{null,null,null};
    Object v8 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v9 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.type.TypeParser)v6),((com.fasterxml.jackson.databind.type.TypeModifier[])v7),((java.lang.ClassLoader)v8));
    Object v10 = ((com.fasterxml.jackson.databind.type.TypeFactory)v9).getClassLoader();
    Object v11 = ((com.fasterxml.jackson.databind.type.TypeFactory)v2).withClassLoader(((java.lang.ClassLoader)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = null;
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).withModifier(((com.fasterxml.jackson.databind.type.TypeModifier)v1));
    Object v3 = new com.fasterxml.jackson.databind.type.TypeParser(((com.fasterxml.jackson.databind.type.TypeFactory)v2));
    Object v4 = new com.fasterxml.jackson.databind.type.TypeModifier[]{};
    Object v5 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.type.TypeParser)v3),((com.fasterxml.jackson.databind.type.TypeModifier[])v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = null;
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).withModifier(((com.fasterxml.jackson.databind.type.TypeModifier)v1));
    Object v3 = new com.fasterxml.jackson.databind.type.TypeParser(((com.fasterxml.jackson.databind.type.TypeFactory)v2));
    Object v4 = new com.fasterxml.jackson.databind.type.TypeModifier[]{};
    Object v5 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.type.TypeParser)v3),((com.fasterxml.jackson.databind.type.TypeModifier[])v4));
    Object v6 = "NUMBER";
    Object v7 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v6));
    Object v8 = "NUMBER";
    Object v9 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v8));
    Object v10 = java.util.EnumSet.of(((java.lang.Enum)v7),((java.lang.Enum)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = ((java.lang.reflect.Type)v12).getTypeName();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v16 = ((com.fasterxml.jackson.databind.type.TypeFactory)v15)._unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = new com.fasterxml.jackson.databind.JavaType[]{null,null,null};
    Object v19 = ((com.fasterxml.jackson.databind.type.TypeFactory)v5).constructSimpleType(((java.lang.Class)v14),((java.lang.Class)v17),((com.fasterxml.jackson.databind.JavaType[])v18));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = null;
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).withModifier(((com.fasterxml.jackson.databind.type.TypeModifier)v1));
    Object v3 = "NUMBER";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v3));
    Object v5 = "NUMBER";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v5));
    Object v7 = java.util.EnumSet.of(((java.lang.Enum)v4),((java.lang.Enum)v6));
    Object v8 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v7));
    Object v9 = new com.fasterxml.jackson.databind.type.ClassStack(((java.lang.Class)v8));
    Object v10 = "NUMBER";
    Object v11 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v10));
    Object v12 = "NUMBER";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v12));
    Object v14 = java.util.EnumSet.of(((java.lang.Enum)v11),((java.lang.Enum)v13));
    Object v15 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v14));
    Object v16 = ((com.fasterxml.jackson.databind.type.ClassStack)v9).child(((java.lang.Class)v15));
    Object v17 = "NUMBER";
    Object v18 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v17));
    Object v19 = "NUMBER";
    Object v20 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v19));
    Object v21 = java.util.EnumSet.of(((java.lang.Enum)v18),((java.lang.Enum)v20));
    Object v22 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v21));
    Object v23 = "NUMBER";
    Object v24 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v23));
    Object v25 = "NUMBER";
    Object v26 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v25));
    Object v27 = java.util.EnumSet.of(((java.lang.Enum)v24),((java.lang.Enum)v26));
    Object v28 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v27));
    Object v29 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v30 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v28),((com.fasterxml.jackson.databind.JavaType[])v29));
    Object v31 = ((com.fasterxml.jackson.databind.type.TypeFactory)v2)._resolveSuperInterfaces(((com.fasterxml.jackson.databind.type.ClassStack)v9),((java.lang.Class)v22),((com.fasterxml.jackson.databind.type.TypeBindings)v30));
    org.junit.Assert.assertNotNull(v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = null;
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).withModifier(((com.fasterxml.jackson.databind.type.TypeModifier)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v4 = null;
    Object v5 = ((com.fasterxml.jackson.databind.type.TypeFactory)v3).withModifier(((com.fasterxml.jackson.databind.type.TypeModifier)v4));
    Object v6 = "NUMBER";
    Object v7 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v6));
    Object v8 = "NUMBER";
    Object v9 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v8));
    Object v10 = java.util.EnumSet.of(((java.lang.Enum)v7),((java.lang.Enum)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v10));
    Object v12 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v11));
    Object v13 = "NUMBER";
    Object v14 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v13));
    Object v15 = "NUMBER";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v15));
    Object v17 = java.util.EnumSet.of(((java.lang.Enum)v14),((java.lang.Enum)v16));
    Object v18 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v17));
    Object v19 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v18));
    Object v20 = ((com.fasterxml.jackson.databind.type.TypeFactory)v5).moreSpecificType(((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.JavaType)v19));
    Object v21 = "NUMBER";
    Object v22 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v21));
    Object v23 = "NUMBER";
    Object v24 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v23));
    Object v25 = java.util.EnumSet.of(((java.lang.Enum)v22),((java.lang.Enum)v24));
    Object v26 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v25));
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v26));
    Object v28 = ((java.lang.reflect.Type)v27).getTypeName();
    Object v29 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v27));
    Object v30 = ((com.fasterxml.jackson.databind.type.TypeFactory)v2).findTypeParameters(((com.fasterxml.jackson.databind.JavaType)v20),((java.lang.Class)v29));
    org.junit.Assert.assertNotNull(v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = "A";
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).constructFromCanonical(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = null;
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).withModifier(((com.fasterxml.jackson.databind.type.TypeModifier)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v4 = ((com.fasterxml.jackson.databind.type.TypeFactory)v3)._unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = "NUMBER";
    Object v7 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v6));
    Object v8 = "NUMBER";
    Object v9 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v8));
    Object v10 = java.util.EnumSet.of(((java.lang.Enum)v7),((java.lang.Enum)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v10));
    Object v12 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v13 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v11),((com.fasterxml.jackson.databind.JavaType[])v12));
    Object v14 = ((com.fasterxml.jackson.databind.type.TypeFactory)v2).constructType(((java.lang.reflect.Type)v5),((com.fasterxml.jackson.databind.type.TypeBindings)v13));
    Object v15 = "NUMBER";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v15));
    Object v17 = "NUMBER";
    Object v18 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v17));
    Object v19 = java.util.EnumSet.of(((java.lang.Enum)v16),((java.lang.Enum)v18));
    Object v20 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v19));
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = ((java.lang.reflect.Type)v21).getTypeName();
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v21));
    Object v24 = ((com.fasterxml.jackson.databind.type.TypeFactory)v2).uncheckedSimpleType(((java.lang.Class)v23));
    org.junit.Assert.assertNotNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = null;
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).withModifier(((com.fasterxml.jackson.databind.type.TypeModifier)v1));
    Object v3 = new com.fasterxml.jackson.databind.type.TypeParser(((com.fasterxml.jackson.databind.type.TypeFactory)v2));
    Object v4 = new com.fasterxml.jackson.databind.type.TypeModifier[]{null,null,null};
    Object v5 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v6 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.type.TypeParser)v3),((com.fasterxml.jackson.databind.type.TypeModifier[])v4),((java.lang.ClassLoader)v5));
    Object v7 = "NUMBER";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v7));
    Object v9 = "NUMBER";
    Object v10 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v9));
    Object v11 = java.util.EnumSet.of(((java.lang.Enum)v8),((java.lang.Enum)v10));
    Object v12 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = ((java.lang.reflect.Type)v13).getTypeName();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v16 = ((com.fasterxml.jackson.databind.type.TypeFactory)v6).constructRawMapType(((java.lang.Class)v15));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = null;
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).withModifier(((com.fasterxml.jackson.databind.type.TypeModifier)v1));
    Object v3 = new com.fasterxml.jackson.databind.type.TypeParser(((com.fasterxml.jackson.databind.type.TypeFactory)v2));
    Object v4 = new com.fasterxml.jackson.databind.type.TypeModifier[]{};
    Object v5 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.type.TypeParser)v3),((com.fasterxml.jackson.databind.type.TypeModifier[])v4));
    Object v6 = "NUMBER";
    Object v7 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v6));
    Object v8 = "NUMBER";
    Object v9 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v8));
    Object v10 = java.util.EnumSet.of(((java.lang.Enum)v7),((java.lang.Enum)v9));
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v10));
    Object v12 = "NUMBER";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v12));
    Object v14 = "NUMBER";
    Object v15 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v14));
    Object v16 = java.util.EnumSet.of(((java.lang.Enum)v13),((java.lang.Enum)v15));
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v17));
    Object v19 = ((java.lang.reflect.Type)v18).getTypeName();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v22 = ((com.fasterxml.jackson.databind.type.TypeFactory)v21)._unknownType();
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v22));
    Object v24 = ((com.fasterxml.jackson.databind.type.TypeFactory)v5).constructMapType(((java.lang.Class)v11),((java.lang.Class)v20),((java.lang.Class)v23));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = null;
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).withModifier(((com.fasterxml.jackson.databind.type.TypeModifier)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v4 = null;
    Object v5 = ((com.fasterxml.jackson.databind.type.TypeFactory)v3).withModifier(((com.fasterxml.jackson.databind.type.TypeModifier)v4));
    Object v6 = new com.fasterxml.jackson.databind.type.TypeParser(((com.fasterxml.jackson.databind.type.TypeFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.type.TypeModifier[]{null,null,null};
    Object v8 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v9 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.type.TypeParser)v6),((com.fasterxml.jackson.databind.type.TypeModifier[])v7),((java.lang.ClassLoader)v8));
    Object v10 = ((com.fasterxml.jackson.databind.type.TypeFactory)v9).getClassLoader();
    Object v11 = ((com.fasterxml.jackson.databind.type.TypeFactory)v2).withClassLoader(((java.lang.ClassLoader)v10));
    Object v12 = ((com.fasterxml.jackson.databind.type.TypeFactory)v11).getClassLoader();
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = null;
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).withModifier(((com.fasterxml.jackson.databind.type.TypeModifier)v1));
    Object v3 = new com.fasterxml.jackson.databind.type.TypeParser(((com.fasterxml.jackson.databind.type.TypeFactory)v2));
    Object v4 = new com.fasterxml.jackson.databind.type.TypeModifier[]{null,null,null};
    Object v5 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v6 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.type.TypeParser)v3),((com.fasterxml.jackson.databind.type.TypeModifier[])v4),((java.lang.ClassLoader)v5));
    Object v7 = "NUMBER";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v7));
    Object v9 = "NUMBER";
    Object v10 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v9));
    Object v11 = java.util.EnumSet.of(((java.lang.Enum)v8),((java.lang.Enum)v10));
    Object v12 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v11));
    Object v13 = new com.fasterxml.jackson.databind.type.ClassStack(((java.lang.Class)v12));
    Object v14 = "NUMBER";
    Object v15 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v14));
    Object v16 = "NUMBER";
    Object v17 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v16));
    Object v18 = java.util.EnumSet.of(((java.lang.Enum)v15),((java.lang.Enum)v17));
    Object v19 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v19));
    Object v21 = ((java.lang.reflect.Type)v20).getTypeName();
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v23 = ((java.lang.reflect.Type)v22).getTypeName();
    Object v24 = "NUMBER";
    Object v25 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v24));
    Object v26 = "NUMBER";
    Object v27 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v26));
    Object v28 = java.util.EnumSet.of(((java.lang.Enum)v25),((java.lang.Enum)v27));
    Object v29 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v28));
    Object v30 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v31 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v29),((com.fasterxml.jackson.databind.JavaType[])v30));
    Object v32 = ((com.fasterxml.jackson.databind.type.TypeFactory)v6)._fromAny(((com.fasterxml.jackson.databind.type.ClassStack)v13),((java.lang.reflect.Type)v22),((com.fasterxml.jackson.databind.type.TypeBindings)v31));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = null;
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).withModifier(((com.fasterxml.jackson.databind.type.TypeModifier)v1));
    Object v3 = new com.fasterxml.jackson.databind.type.TypeParser(((com.fasterxml.jackson.databind.type.TypeFactory)v2));
    Object v4 = new com.fasterxml.jackson.databind.type.TypeModifier[]{null,null,null};
    Object v5 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v6 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.type.TypeParser)v3),((com.fasterxml.jackson.databind.type.TypeModifier[])v4),((java.lang.ClassLoader)v5));
    Object v7 = "NUMBER";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v7));
    Object v9 = "NUMBER";
    Object v10 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v9));
    Object v11 = java.util.EnumSet.of(((java.lang.Enum)v8),((java.lang.Enum)v10));
    Object v12 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v11));
    Object v13 = new com.fasterxml.jackson.databind.type.ClassStack(((java.lang.Class)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v15 = ((com.fasterxml.jackson.databind.type.TypeFactory)v14)._unknownType();
    Object v16 = "NUMBER";
    Object v17 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v16));
    Object v18 = "NUMBER";
    Object v19 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v18));
    Object v20 = java.util.EnumSet.of(((java.lang.Enum)v17),((java.lang.Enum)v19));
    Object v21 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v20));
    Object v22 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v23 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v21),((com.fasterxml.jackson.databind.JavaType[])v22));
    Object v24 = ((com.fasterxml.jackson.databind.type.TypeFactory)v6)._fromAny(((com.fasterxml.jackson.databind.type.ClassStack)v13),((java.lang.reflect.Type)v15),((com.fasterxml.jackson.databind.type.TypeBindings)v23));
    org.junit.Assert.assertNotNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeFactory)v1)._unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = ((java.lang.Class)v3).getEnclosingConstructor();
    Object v5 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).constructRawCollectionLikeType(((java.lang.Class)v3));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = null;
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).withModifier(((com.fasterxml.jackson.databind.type.TypeModifier)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v4 = null;
    Object v5 = ((com.fasterxml.jackson.databind.type.TypeFactory)v3).withModifier(((com.fasterxml.jackson.databind.type.TypeModifier)v4));
    Object v6 = new com.fasterxml.jackson.databind.type.TypeParser(((com.fasterxml.jackson.databind.type.TypeFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.type.TypeModifier[]{null,null,null};
    Object v8 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v9 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.type.TypeParser)v6),((com.fasterxml.jackson.databind.type.TypeModifier[])v7),((java.lang.ClassLoader)v8));
    Object v10 = ((com.fasterxml.jackson.databind.type.TypeFactory)v9).getClassLoader();
    Object v11 = ((com.fasterxml.jackson.databind.type.TypeFactory)v2).withClassLoader(((java.lang.ClassLoader)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v13 = ((com.fasterxml.jackson.databind.type.TypeFactory)v12)._unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v16 = ((com.fasterxml.jackson.databind.type.TypeFactory)v15)._unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = ((java.lang.Class)v17).getTypeName();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v20 = ((com.fasterxml.jackson.databind.type.TypeFactory)v19)._unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = ((com.fasterxml.jackson.databind.type.TypeFactory)v11).constructMapLikeType(((java.lang.Class)v14),((java.lang.Class)v17),((java.lang.Class)v21));
    org.junit.Assert.assertNotNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = null;
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).withModifier(((com.fasterxml.jackson.databind.type.TypeModifier)v1));
    Object v3 = new com.fasterxml.jackson.databind.type.TypeParser(((com.fasterxml.jackson.databind.type.TypeFactory)v2));
    Object v4 = new com.fasterxml.jackson.databind.type.TypeModifier[]{null,null,null};
    Object v5 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v6 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.type.TypeParser)v3),((com.fasterxml.jackson.databind.type.TypeModifier[])v4),((java.lang.ClassLoader)v5));
    Object v7 = "NUMBER";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v7));
    Object v9 = "NUMBER";
    Object v10 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v9));
    Object v11 = java.util.EnumSet.of(((java.lang.Enum)v8),((java.lang.Enum)v10));
    Object v12 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v11));
    Object v13 = new com.fasterxml.jackson.databind.type.ClassStack(((java.lang.Class)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v15 = ((com.fasterxml.jackson.databind.type.TypeFactory)v14)._unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = "NUMBER";
    Object v18 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v17));
    Object v19 = "NUMBER";
    Object v20 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v19));
    Object v21 = java.util.EnumSet.of(((java.lang.Enum)v18),((java.lang.Enum)v20));
    Object v22 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v21));
    Object v23 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v24 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v22),((com.fasterxml.jackson.databind.JavaType[])v23));
    Object v25 = ((com.fasterxml.jackson.databind.type.TypeFactory)v6)._fromClass(((com.fasterxml.jackson.databind.type.ClassStack)v13),((java.lang.Class)v16),((com.fasterxml.jackson.databind.type.TypeBindings)v24));
    org.junit.Assert.assertNotNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = null;
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).withModifier(((com.fasterxml.jackson.databind.type.TypeModifier)v1));
    Object v3 = "NUMBER";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v3));
    Object v5 = "NUMBER";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v5));
    Object v7 = java.util.EnumSet.of(((java.lang.Enum)v4),((java.lang.Enum)v6));
    Object v8 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = ((java.lang.reflect.Type)v9).getTypeName();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v13 = null;
    Object v14 = ((com.fasterxml.jackson.databind.type.TypeFactory)v12).withModifier(((com.fasterxml.jackson.databind.type.TypeModifier)v13));
    Object v15 = "NUMBER";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v15));
    Object v17 = "NUMBER";
    Object v18 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v17));
    Object v19 = java.util.EnumSet.of(((java.lang.Enum)v16),((java.lang.Enum)v18));
    Object v20 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v19));
    Object v21 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v20));
    Object v22 = "NUMBER";
    Object v23 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v22));
    Object v24 = ((com.fasterxml.jackson.databind.JavaType)v21).withTypeHandler(((java.lang.Object)v23));
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v26 = null;
    Object v27 = ((com.fasterxml.jackson.databind.type.TypeFactory)v25).withModifier(((com.fasterxml.jackson.databind.type.TypeModifier)v26));
    Object v28 = "NUMBER";
    Object v29 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v28));
    Object v30 = "NUMBER";
    Object v31 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v30));
    Object v32 = java.util.EnumSet.of(((java.lang.Enum)v29),((java.lang.Enum)v31));
    Object v33 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v32));
    Object v34 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v33));
    Object v35 = ((java.lang.Class)v34).getCanonicalName();
    Object v36 = ((com.fasterxml.jackson.databind.type.TypeFactory)v27).uncheckedSimpleType(((java.lang.Class)v34));
    Object v37 = ((com.fasterxml.jackson.databind.JavaType)v36).toString();
    Object v38 = ((com.fasterxml.jackson.databind.type.TypeFactory)v14).moreSpecificType(((com.fasterxml.jackson.databind.JavaType)v21),((com.fasterxml.jackson.databind.JavaType)v36));
    Object v39 = ((com.fasterxml.jackson.databind.type.TypeFactory)v2).constructCollectionLikeType(((java.lang.Class)v11),((com.fasterxml.jackson.databind.JavaType)v38));
    org.junit.Assert.assertNotNull(v39);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = null;
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).withModifier(((com.fasterxml.jackson.databind.type.TypeModifier)v1));
    Object v3 = new com.fasterxml.jackson.databind.type.TypeParser(((com.fasterxml.jackson.databind.type.TypeFactory)v2));
    Object v4 = new com.fasterxml.jackson.databind.type.TypeModifier[]{null,null,null};
    Object v5 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v6 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.type.TypeParser)v3),((com.fasterxml.jackson.databind.type.TypeModifier[])v4),((java.lang.ClassLoader)v5));
    Object v7 = "false";
    Object v8 = ((com.fasterxml.jackson.databind.type.TypeFactory)v6)._findPrimitive(((java.lang.String)v7));
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = null;
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).withModifier(((com.fasterxml.jackson.databind.type.TypeModifier)v1));
    Object v3 = new com.fasterxml.jackson.databind.type.TypeParser(((com.fasterxml.jackson.databind.type.TypeFactory)v2));
    Object v4 = new com.fasterxml.jackson.databind.type.TypeModifier[]{null,null,null};
    Object v5 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v6 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.type.TypeParser)v3),((com.fasterxml.jackson.databind.type.TypeModifier[])v4),((java.lang.ClassLoader)v5));
    Object v7 = "NUMBER";
    Object v8 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v7));
    Object v9 = "NUMBER";
    Object v10 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v9));
    Object v11 = java.util.EnumSet.of(((java.lang.Enum)v8),((java.lang.Enum)v10));
    Object v12 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v11));
    Object v13 = "NUMBER";
    Object v14 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v13));
    Object v15 = "NUMBER";
    Object v16 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v15));
    Object v17 = java.util.EnumSet.of(((java.lang.Enum)v14),((java.lang.Enum)v16));
    Object v18 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v17));
    Object v19 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v20 = com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(((java.lang.Class)v18),((com.fasterxml.jackson.databind.JavaType[])v19));
    Object v21 = ")";
    Object v22 = ((com.fasterxml.jackson.databind.type.TypeBindings)v20).hasUnbound(((java.lang.String)v21));
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v25 = ((com.fasterxml.jackson.databind.type.TypeFactory)v24)._unknownType();
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v25));
    Object v27 = ((java.lang.Class)v26).getEnclosingConstructor();
    Object v28 = ((com.fasterxml.jackson.databind.type.TypeFactory)v23).constructRawCollectionLikeType(((java.lang.Class)v26));
    Object v29 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v30 = ((com.fasterxml.jackson.databind.type.TypeFactory)v6)._constructSimple(((java.lang.Class)v12),((com.fasterxml.jackson.databind.type.TypeBindings)v20),((com.fasterxml.jackson.databind.JavaType)v28),((com.fasterxml.jackson.databind.JavaType[])v29));
    org.junit.Assert.assertNotNull(v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = null;
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).withModifier(((com.fasterxml.jackson.databind.type.TypeModifier)v1));
    Object v3 = "NUMBER";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v3));
    Object v5 = "NUMBER";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v5));
    Object v7 = java.util.EnumSet.of(((java.lang.Enum)v4),((java.lang.Enum)v6));
    Object v8 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v7));
    Object v9 = "NUMBER";
    Object v10 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v9));
    Object v11 = "NUMBER";
    Object v12 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v11));
    Object v13 = java.util.EnumSet.of(((java.lang.Enum)v10),((java.lang.Enum)v12));
    Object v14 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v13));
    Object v15 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v14));
    Object v16 = "NUMBER";
    Object v17 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v16));
    Object v18 = "NUMBER";
    Object v19 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v18));
    Object v20 = java.util.EnumSet.of(((java.lang.Enum)v17),((java.lang.Enum)v19));
    Object v21 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v20));
    Object v22 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v21));
    Object v23 = com.fasterxml.jackson.databind.type.MapLikeType.construct(((java.lang.Class)v8),((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.JavaType)v22));
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v25 = ((com.fasterxml.jackson.databind.type.TypeFactory)v24)._unknownType();
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v25));
    Object v27 = ((com.fasterxml.jackson.databind.type.TypeFactory)v2).findTypeParameters(((com.fasterxml.jackson.databind.JavaType)v23),((java.lang.Class)v26));
    org.junit.Assert.assertNotNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = null;
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).withModifier(((com.fasterxml.jackson.databind.type.TypeModifier)v1));
    Object v3 = new com.fasterxml.jackson.databind.type.TypeParser(((com.fasterxml.jackson.databind.type.TypeFactory)v2));
    Object v4 = new com.fasterxml.jackson.databind.type.TypeModifier[]{null,null,null};
    Object v5 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v6 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.type.TypeParser)v3),((com.fasterxml.jackson.databind.type.TypeModifier[])v4),((java.lang.ClassLoader)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v8 = ((com.fasterxml.jackson.databind.type.TypeFactory)v7)._unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = "NUMBER";
    Object v11 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v10));
    Object v12 = "NUMBER";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v12));
    Object v14 = java.util.EnumSet.of(((java.lang.Enum)v11),((java.lang.Enum)v13));
    Object v15 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v14));
    Object v16 = ((com.fasterxml.jackson.databind.type.TypeFactory)v6).findTypeParameters(((java.lang.Class)v9),((java.lang.Class)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = null;
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).withModifier(((com.fasterxml.jackson.databind.type.TypeModifier)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v4 = null;
    Object v5 = ((com.fasterxml.jackson.databind.type.TypeFactory)v3).withModifier(((com.fasterxml.jackson.databind.type.TypeModifier)v4));
    Object v6 = new com.fasterxml.jackson.databind.type.TypeParser(((com.fasterxml.jackson.databind.type.TypeFactory)v5));
    Object v7 = new com.fasterxml.jackson.databind.type.TypeModifier[]{null,null,null};
    Object v8 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v9 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.type.TypeParser)v6),((com.fasterxml.jackson.databind.type.TypeModifier[])v7),((java.lang.ClassLoader)v8));
    Object v10 = ((com.fasterxml.jackson.databind.type.TypeFactory)v9).getClassLoader();
    Object v11 = ((com.fasterxml.jackson.databind.type.TypeFactory)v2).withClassLoader(((java.lang.ClassLoader)v10));
    Object v12 = "NUMBER";
    Object v13 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v12));
    Object v14 = "NUMBER";
    Object v15 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v14));
    Object v16 = java.util.EnumSet.of(((java.lang.Enum)v13),((java.lang.Enum)v15));
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v17));
    Object v19 = ((java.lang.reflect.Type)v18).getTypeName();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v22 = ((com.fasterxml.jackson.databind.type.TypeFactory)v21)._unknownType();
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v22));
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v25 = ((com.fasterxml.jackson.databind.type.TypeFactory)v24)._unknownType();
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v25));
    Object v27 = ((com.fasterxml.jackson.databind.type.TypeFactory)v11).constructMapType(((java.lang.Class)v20),((java.lang.Class)v23),((java.lang.Class)v26));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = null;
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).withModifier(((com.fasterxml.jackson.databind.type.TypeModifier)v1));
    Object v3 = "NUMBER";
    Object v4 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v3));
    Object v5 = "NUMBER";
    Object v6 = com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes.valueOf(((java.lang.String)v5));
    Object v7 = java.util.EnumSet.of(((java.lang.Enum)v4),((java.lang.Enum)v6));
    Object v8 = com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(((java.util.EnumSet)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v11 = ((com.fasterxml.jackson.databind.type.TypeFactory)v10)._unknownType();
    Object v12 = ((com.fasterxml.jackson.databind.type.TypeFactory)v2).constructType(((java.lang.reflect.Type)v9),((com.fasterxml.jackson.databind.JavaType)v11));
    org.junit.Assert.assertNotNull(v12);
  }
}
