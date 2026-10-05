package com.google.gson.internal.bind;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = null;
    Object v1 = null;
    Object v2 = new com.google.gson.Gson();
    Object v3 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v2));
    Object v4 = com.google.gson.internal.bind.TypeAdapters.newFactory(((java.lang.Class)v0),((java.lang.Class)v1),((com.google.gson.TypeAdapter)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = null;
    Object v1 = new com.google.gson.Gson();
    Object v2 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v1));
    Object v3 = com.google.gson.internal.bind.TypeAdapters.newFactory(((com.google.gson.reflect.TypeToken)v0),((com.google.gson.TypeAdapter)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = null;
    Object v1 = new com.google.gson.Gson();
    Object v2 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v1));
    Object v3 = com.google.gson.internal.bind.TypeAdapters.newFactory(((java.lang.Class)v0),((com.google.gson.TypeAdapter)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = null;
    Object v1 = new com.google.gson.Gson();
    Object v2 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v1));
    Object v3 = com.google.gson.internal.bind.TypeAdapters.newTypeHierarchyFactory(((java.lang.Class)v0),((com.google.gson.TypeAdapter)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = new com.google.gson.Gson();
    Object v5 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v4));
    Object v6 = com.google.gson.internal.bind.TypeAdapters.newTypeHierarchyFactory(((java.lang.Class)v3),((com.google.gson.TypeAdapter)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = new com.google.gson.Gson();
    Object v5 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v4));
    Object v6 = com.google.gson.internal.bind.TypeAdapters.newFactory(((java.lang.Class)v3),((com.google.gson.TypeAdapter)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = ((java.lang.Class)v3).isInterface();
    Object v5 = "sun.misc.Unsafe";
    Object v6 = false;
    Object v7 = java.lang.ClassLoader.getSystemClassLoader();
    Object v8 = java.lang.Class.forName(((java.lang.String)v5),(((java.lang.Boolean)v6).booleanValue()),((java.lang.ClassLoader)v7));
    Object v9 = ((java.lang.Class)v8).getDeclaredFields();
    Object v10 = new com.google.gson.Gson();
    Object v11 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v10));
    Object v12 = com.google.gson.internal.bind.TypeAdapters.newFactory(((java.lang.Class)v3),((java.lang.Class)v8),((com.google.gson.TypeAdapter)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = new com.google.gson.Gson();
    Object v5 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v4));
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = com.google.gson.internal.Streams.writerForAppendable(((java.lang.Appendable)v6));
    Object v8 = null;
    Object v9 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v8));
    ((com.google.gson.TypeAdapter)v5).toJson(((java.io.Writer)v7),((java.lang.Object)v9));
    Object v10 = null;
    Object v11 = com.google.gson.internal.bind.TypeAdapters.newFactory(((java.lang.Class)v3),((com.google.gson.TypeAdapter)v5));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = ((java.lang.Class)v3).getAnnotations();
    Object v5 = "sun.misc.Unsafe";
    Object v6 = false;
    Object v7 = java.lang.ClassLoader.getSystemClassLoader();
    Object v8 = java.lang.Class.forName(((java.lang.String)v5),(((java.lang.Boolean)v6).booleanValue()),((java.lang.ClassLoader)v7));
    Object v9 = new com.google.gson.Gson();
    Object v10 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v9));
    Object v11 = com.google.gson.internal.bind.TypeAdapters.newFactory(((java.lang.Class)v3),((java.lang.Class)v8),((com.google.gson.TypeAdapter)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = "sun.misc.Unsafe";
    Object v5 = false;
    Object v6 = java.lang.ClassLoader.getSystemClassLoader();
    Object v7 = java.lang.Class.forName(((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()),((java.lang.ClassLoader)v6));
    Object v8 = new com.google.gson.Gson();
    Object v9 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v8));
    Object v10 = com.google.gson.internal.bind.TypeAdapters.newFactoryForMultipleTypes(((java.lang.Class)v3),((java.lang.Class)v7),((com.google.gson.TypeAdapter)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = com.google.gson.reflect.TypeToken.get(((java.lang.Class)v3));
    Object v5 = new com.google.gson.Gson();
    Object v6 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v5));
    Object v7 = java.io.Writer.nullWriter();
    Object v8 = com.google.gson.internal.Streams.writerForAppendable(((java.lang.Appendable)v7));
    Object v9 = java.io.Writer.nullWriter();
    ((com.google.gson.TypeAdapter)v6).toJson(((java.io.Writer)v8),((java.lang.Object)v9));
    Object v10 = null;
    Object v11 = com.google.gson.internal.bind.TypeAdapters.newFactory(((com.google.gson.reflect.TypeToken)v4),((com.google.gson.TypeAdapter)v6));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = "sun.misc.Unsafe";
    Object v5 = false;
    Object v6 = java.lang.ClassLoader.getSystemClassLoader();
    Object v7 = java.lang.Class.forName(((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()),((java.lang.ClassLoader)v6));
    Object v8 = ((java.lang.Class)v7).isInterface();
    Object v9 = new com.google.gson.Gson();
    Object v10 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v9));
    Object v11 = 1;
    Object v12 = new com.google.gson.JsonPrimitive(((java.lang.Number)v11));
    Object v13 = ((com.google.gson.TypeAdapter)v10).fromJsonTree(((com.google.gson.JsonElement)v12));
    Object v14 = com.google.gson.internal.bind.TypeAdapters.newFactoryForMultipleTypes(((java.lang.Class)v3),((java.lang.Class)v7),((com.google.gson.TypeAdapter)v10));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = new com.google.gson.Gson();
    Object v5 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v4));
    Object v6 = 1;
    Object v7 = new com.google.gson.JsonPrimitive(((java.lang.Number)v6));
    Object v8 = ((com.google.gson.TypeAdapter)v5).fromJsonTree(((com.google.gson.JsonElement)v7));
    Object v9 = com.google.gson.internal.bind.TypeAdapters.newTypeHierarchyFactory(((java.lang.Class)v3),((com.google.gson.TypeAdapter)v5));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = "sun.misc.Unsafe";
    Object v5 = false;
    Object v6 = java.lang.ClassLoader.getSystemClassLoader();
    Object v7 = java.lang.Class.forName(((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()),((java.lang.ClassLoader)v6));
    Object v8 = ((java.lang.Class)v3).getAnnotation(((java.lang.Class)v7));
    Object v9 = "sun.misc.Unsafe";
    Object v10 = false;
    Object v11 = java.lang.ClassLoader.getSystemClassLoader();
    Object v12 = java.lang.Class.forName(((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()),((java.lang.ClassLoader)v11));
    Object v13 = ((java.lang.Class)v12).getFields();
    Object v14 = new com.google.gson.Gson();
    Object v15 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v14));
    Object v16 = com.google.gson.internal.bind.TypeAdapters.newFactory(((java.lang.Class)v3),((java.lang.Class)v12),((com.google.gson.TypeAdapter)v15));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = com.google.gson.reflect.TypeToken.get(((java.lang.Class)v3));
    Object v5 = new com.google.gson.Gson();
    Object v6 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v5));
    Object v7 = com.google.gson.internal.bind.TypeAdapters.newFactory(((com.google.gson.reflect.TypeToken)v4),((com.google.gson.TypeAdapter)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = new com.google.gson.Gson();
    Object v5 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v4));
    Object v6 = ((com.google.gson.TypeAdapter)v5).nullSafe();
    Object v7 = com.google.gson.internal.bind.TypeAdapters.newTypeHierarchyFactory(((java.lang.Class)v3),((com.google.gson.TypeAdapter)v5));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = "Incomplete document";
    Object v5 = ((java.lang.Class)v3).getResourceAsStream(((java.lang.String)v4));
    Object v6 = "sun.misc.Unsafe";
    Object v7 = false;
    Object v8 = java.lang.ClassLoader.getSystemClassLoader();
    Object v9 = java.lang.Class.forName(((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()),((java.lang.ClassLoader)v8));
    Object v10 = new com.google.gson.Gson();
    Object v11 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v10));
    Object v12 = com.google.gson.internal.bind.TypeAdapters.newFactoryForMultipleTypes(((java.lang.Class)v3),((java.lang.Class)v9),((com.google.gson.TypeAdapter)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = ((java.lang.Class)v3).isAnonymousClass();
    Object v5 = new com.google.gson.Gson();
    Object v6 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v5));
    Object v7 = com.google.gson.internal.bind.TypeAdapters.newFactory(((java.lang.Class)v3),((com.google.gson.TypeAdapter)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = "sun.misc.Unsafe";
    Object v5 = false;
    Object v6 = java.lang.ClassLoader.getSystemClassLoader();
    Object v7 = java.lang.Class.forName(((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()),((java.lang.ClassLoader)v6));
    Object v8 = new com.google.gson.Gson();
    Object v9 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v8));
    Object v10 = new com.google.gson.Gson();
    Object v11 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v10));
    Object v12 = ((com.google.gson.TypeAdapter)v9).toJsonTree(((java.lang.Object)v11));
    Object v13 = com.google.gson.internal.bind.TypeAdapters.newFactory(((java.lang.Class)v3),((java.lang.Class)v7),((com.google.gson.TypeAdapter)v9));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = ((java.lang.Class)v3).getComponentType();
    Object v5 = new com.google.gson.Gson();
    Object v6 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v5));
    Object v7 = com.google.gson.internal.bind.TypeAdapters.newFactory(((java.lang.Class)v3),((com.google.gson.TypeAdapter)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = ((java.lang.Class)v3).getEnclosingMethod();
    Object v5 = new com.google.gson.Gson();
    Object v6 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v5));
    Object v7 = com.google.gson.internal.bind.TypeAdapters.newFactory(((java.lang.Class)v3),((com.google.gson.TypeAdapter)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = "sun.misc.Unsafe";
    Object v5 = false;
    Object v6 = java.lang.ClassLoader.getSystemClassLoader();
    Object v7 = java.lang.Class.forName(((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()),((java.lang.ClassLoader)v6));
    Object v8 = new com.google.gson.Gson();
    Object v9 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v8));
    Object v10 = java.io.Reader.nullReader();
    Object v11 = ((com.google.gson.TypeAdapter)v9).toJsonTree(((java.lang.Object)v10));
    Object v12 = com.google.gson.internal.bind.TypeAdapters.newFactory(((java.lang.Class)v3),((java.lang.Class)v7),((com.google.gson.TypeAdapter)v9));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = null;
    Object v5 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v4));
    Object v6 = ((java.lang.Class)v3).isInstance(((java.lang.Object)v5));
    Object v7 = "sun.misc.Unsafe";
    Object v8 = false;
    Object v9 = java.lang.ClassLoader.getSystemClassLoader();
    Object v10 = java.lang.Class.forName(((java.lang.String)v7),(((java.lang.Boolean)v8).booleanValue()),((java.lang.ClassLoader)v9));
    Object v11 = new com.google.gson.Gson();
    Object v12 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v11));
    Object v13 = com.google.gson.internal.bind.TypeAdapters.newFactory(((java.lang.Class)v3),((java.lang.Class)v10),((com.google.gson.TypeAdapter)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = "sun.misc.Unsafe";
    Object v5 = false;
    Object v6 = java.lang.ClassLoader.getSystemClassLoader();
    Object v7 = java.lang.Class.forName(((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()),((java.lang.ClassLoader)v6));
    Object v8 = ((java.lang.Class)v7).isArray();
    Object v9 = new com.google.gson.Gson();
    Object v10 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v9));
    Object v11 = com.google.gson.internal.bind.TypeAdapters.newFactoryForMultipleTypes(((java.lang.Class)v3),((java.lang.Class)v7),((com.google.gson.TypeAdapter)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = "sun.misc.Unsafe";
    Object v5 = false;
    Object v6 = java.lang.ClassLoader.getSystemClassLoader();
    Object v7 = java.lang.Class.forName(((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()),((java.lang.ClassLoader)v6));
    Object v8 = ((java.lang.Class)v3).isAnnotationPresent(((java.lang.Class)v7));
    Object v9 = "sun.misc.Unsafe";
    Object v10 = false;
    Object v11 = java.lang.ClassLoader.getSystemClassLoader();
    Object v12 = java.lang.Class.forName(((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()),((java.lang.ClassLoader)v11));
    Object v13 = new com.google.gson.Gson();
    Object v14 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v13));
    Object v15 = com.google.gson.internal.bind.TypeAdapters.newFactoryForMultipleTypes(((java.lang.Class)v3),((java.lang.Class)v12),((com.google.gson.TypeAdapter)v14));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = ((java.lang.Class)v3).isLocalClass();
    Object v5 = "sun.misc.Unsafe";
    Object v6 = false;
    Object v7 = java.lang.ClassLoader.getSystemClassLoader();
    Object v8 = java.lang.Class.forName(((java.lang.String)v5),(((java.lang.Boolean)v6).booleanValue()),((java.lang.ClassLoader)v7));
    Object v9 = new com.google.gson.Gson();
    Object v10 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v9));
    Object v11 = com.google.gson.internal.bind.TypeAdapters.newFactoryForMultipleTypes(((java.lang.Class)v3),((java.lang.Class)v8),((com.google.gson.TypeAdapter)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = "sun.misc.Unsafe";
    Object v5 = false;
    Object v6 = java.lang.ClassLoader.getSystemClassLoader();
    Object v7 = java.lang.Class.forName(((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()),((java.lang.ClassLoader)v6));
    Object v8 = new com.google.gson.Gson();
    Object v9 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v8));
    Object v10 = com.google.gson.internal.bind.TypeAdapters.newFactory(((java.lang.Class)v3),((java.lang.Class)v7),((com.google.gson.TypeAdapter)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = com.google.gson.reflect.TypeToken.get(((java.lang.Class)v3));
    Object v5 = new com.google.gson.Gson();
    Object v6 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v5));
    Object v7 = ((com.google.gson.TypeAdapter)v6).nullSafe();
    Object v8 = com.google.gson.internal.bind.TypeAdapters.newFactory(((com.google.gson.reflect.TypeToken)v4),((com.google.gson.TypeAdapter)v6));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = com.google.gson.reflect.TypeToken.get(((java.lang.Class)v3));
    Object v5 = "sun.misc.Unsafe";
    Object v6 = false;
    Object v7 = java.lang.ClassLoader.getSystemClassLoader();
    Object v8 = java.lang.Class.forName(((java.lang.String)v5),(((java.lang.Boolean)v6).booleanValue()),((java.lang.ClassLoader)v7));
    Object v9 = com.google.gson.reflect.TypeToken.get(((java.lang.Class)v8));
    Object v10 = ((com.google.gson.reflect.TypeToken)v4).isAssignableFrom(((com.google.gson.reflect.TypeToken)v9));
    Object v11 = new com.google.gson.Gson();
    Object v12 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v11));
    Object v13 = null;
    Object v14 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v13));
    Object v15 = ((com.google.gson.TypeAdapter)v12).toJson(((java.lang.Object)v14));
    Object v16 = com.google.gson.internal.bind.TypeAdapters.newFactory(((com.google.gson.reflect.TypeToken)v4),((com.google.gson.TypeAdapter)v12));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = com.google.gson.reflect.TypeToken.get(((java.lang.Class)v3));
    Object v5 = ((com.google.gson.reflect.TypeToken)v4).toString();
    Object v6 = new com.google.gson.Gson();
    Object v7 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v6));
    Object v8 = com.google.gson.internal.bind.TypeAdapters.newFactory(((com.google.gson.reflect.TypeToken)v4),((com.google.gson.TypeAdapter)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = ((java.lang.Class)v3).toString();
    Object v5 = new com.google.gson.Gson();
    Object v6 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v5));
    Object v7 = com.google.gson.internal.bind.TypeAdapters.newTypeHierarchyFactory(((java.lang.Class)v3),((com.google.gson.TypeAdapter)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = com.google.gson.reflect.TypeToken.get(((java.lang.Class)v3));
    Object v5 = "sun.misc.Unsafe";
    Object v6 = false;
    Object v7 = java.lang.ClassLoader.getSystemClassLoader();
    Object v8 = java.lang.Class.forName(((java.lang.String)v5),(((java.lang.Boolean)v6).booleanValue()),((java.lang.ClassLoader)v7));
    Object v9 = com.google.gson.reflect.TypeToken.get(((java.lang.Class)v8));
    Object v10 = ((com.google.gson.reflect.TypeToken)v4).isAssignableFrom(((com.google.gson.reflect.TypeToken)v9));
    Object v11 = new com.google.gson.Gson();
    Object v12 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v11));
    Object v13 = com.google.gson.internal.bind.TypeAdapters.newFactory(((com.google.gson.reflect.TypeToken)v4),((com.google.gson.TypeAdapter)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = "sun.misc.Unsafe";
    Object v5 = false;
    Object v6 = java.lang.ClassLoader.getSystemClassLoader();
    Object v7 = java.lang.Class.forName(((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()),((java.lang.ClassLoader)v6));
    Object v8 = ((java.lang.Class)v7).getDeclaredAnnotations();
    Object v9 = new com.google.gson.Gson();
    Object v10 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v9));
    Object v11 = com.google.gson.internal.bind.TypeAdapters.newFactory(((java.lang.Class)v3),((java.lang.Class)v7),((com.google.gson.TypeAdapter)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = "sun.misc.Unsafe";
    Object v5 = false;
    Object v6 = java.lang.ClassLoader.getSystemClassLoader();
    Object v7 = java.lang.Class.forName(((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()),((java.lang.ClassLoader)v6));
    Object v8 = new com.google.gson.Gson();
    Object v9 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v8));
    Object v10 = java.io.Writer.nullWriter();
    Object v11 = com.google.gson.internal.Streams.writerForAppendable(((java.lang.Appendable)v10));
    Object v12 = ((com.google.gson.TypeAdapter)v9).toJsonTree(((java.lang.Object)v11));
    Object v13 = com.google.gson.internal.bind.TypeAdapters.newFactoryForMultipleTypes(((java.lang.Class)v3),((java.lang.Class)v7),((com.google.gson.TypeAdapter)v9));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = ((java.lang.Class)v3).getGenericInterfaces();
    Object v5 = "sun.misc.Unsafe";
    Object v6 = false;
    Object v7 = java.lang.ClassLoader.getSystemClassLoader();
    Object v8 = java.lang.Class.forName(((java.lang.String)v5),(((java.lang.Boolean)v6).booleanValue()),((java.lang.ClassLoader)v7));
    Object v9 = new com.google.gson.Gson();
    Object v10 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v9));
    Object v11 = com.google.gson.internal.bind.TypeAdapters.newFactoryForMultipleTypes(((java.lang.Class)v3),((java.lang.Class)v8),((com.google.gson.TypeAdapter)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = ((java.lang.Class)v3).getPackageName();
    Object v5 = new com.google.gson.Gson();
    Object v6 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v5));
    Object v7 = com.google.gson.internal.bind.TypeAdapters.newFactory(((java.lang.Class)v3),((com.google.gson.TypeAdapter)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = new com.google.gson.Gson();
    Object v5 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v4));
    Object v6 = ((com.google.gson.TypeAdapter)v5).nullSafe();
    Object v7 = com.google.gson.internal.bind.TypeAdapters.newFactory(((java.lang.Class)v3),((com.google.gson.TypeAdapter)v5));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = "sun.misc.Unsafe";
    Object v5 = false;
    Object v6 = java.lang.ClassLoader.getSystemClassLoader();
    Object v7 = java.lang.Class.forName(((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()),((java.lang.ClassLoader)v6));
    Object v8 = ((java.lang.Class)v3).getDeclaredAnnotation(((java.lang.Class)v7));
    Object v9 = "sun.misc.Unsafe";
    Object v10 = false;
    Object v11 = java.lang.ClassLoader.getSystemClassLoader();
    Object v12 = java.lang.Class.forName(((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()),((java.lang.ClassLoader)v11));
    Object v13 = ((java.lang.Class)v12).getEnclosingClass();
    Object v14 = new com.google.gson.Gson();
    Object v15 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v14));
    Object v16 = com.google.gson.internal.bind.TypeAdapters.newFactory(((java.lang.Class)v3),((java.lang.Class)v12),((com.google.gson.TypeAdapter)v15));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = com.google.gson.reflect.TypeToken.get(((java.lang.Class)v3));
    Object v5 = "sun.misc.Unsafe";
    Object v6 = false;
    Object v7 = java.lang.ClassLoader.getSystemClassLoader();
    Object v8 = java.lang.Class.forName(((java.lang.String)v5),(((java.lang.Boolean)v6).booleanValue()),((java.lang.ClassLoader)v7));
    Object v9 = com.google.gson.reflect.TypeToken.get(((java.lang.Class)v8));
    Object v10 = ((com.google.gson.reflect.TypeToken)v4).equals(((java.lang.Object)v9));
    Object v11 = new com.google.gson.Gson();
    Object v12 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v11));
    Object v13 = com.google.gson.internal.bind.TypeAdapters.newFactory(((com.google.gson.reflect.TypeToken)v4),((com.google.gson.TypeAdapter)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = ((java.lang.Class)v3).getDeclaringClass();
    Object v5 = "sun.misc.Unsafe";
    Object v6 = false;
    Object v7 = java.lang.ClassLoader.getSystemClassLoader();
    Object v8 = java.lang.Class.forName(((java.lang.String)v5),(((java.lang.Boolean)v6).booleanValue()),((java.lang.ClassLoader)v7));
    Object v9 = new com.google.gson.Gson();
    Object v10 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v9));
    Object v11 = com.google.gson.internal.bind.TypeAdapters.newFactoryForMultipleTypes(((java.lang.Class)v3),((java.lang.Class)v8),((com.google.gson.TypeAdapter)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = ((java.lang.Class)v3).isMemberClass();
    Object v5 = new com.google.gson.Gson();
    Object v6 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v5));
    Object v7 = com.google.gson.internal.bind.TypeAdapters.newFactory(((java.lang.Class)v3),((com.google.gson.TypeAdapter)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = com.google.gson.reflect.TypeToken.get(((java.lang.Class)v3));
    Object v5 = "sun.misc.Unsafe";
    Object v6 = false;
    Object v7 = java.lang.ClassLoader.getSystemClassLoader();
    Object v8 = java.lang.Class.forName(((java.lang.String)v5),(((java.lang.Boolean)v6).booleanValue()),((java.lang.ClassLoader)v7));
    Object v9 = ((com.google.gson.reflect.TypeToken)v4).isAssignableFrom(((java.lang.Class)v8));
    Object v10 = new com.google.gson.Gson();
    Object v11 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v10));
    Object v12 = java.io.Writer.nullWriter();
    Object v13 = com.google.gson.internal.Streams.writerForAppendable(((java.lang.Appendable)v12));
    Object v14 = "sun.misc.Unsafe";
    Object v15 = false;
    Object v16 = java.lang.ClassLoader.getSystemClassLoader();
    Object v17 = java.lang.Class.forName(((java.lang.String)v14),(((java.lang.Boolean)v15).booleanValue()),((java.lang.ClassLoader)v16));
    Object v18 = com.google.gson.reflect.TypeToken.get(((java.lang.Class)v17));
    Object v19 = ((com.google.gson.reflect.TypeToken)v18).toString();
    Object v20 = new com.google.gson.Gson();
    Object v21 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v20));
    Object v22 = com.google.gson.internal.bind.TypeAdapters.newFactory(((com.google.gson.reflect.TypeToken)v18),((com.google.gson.TypeAdapter)v21));
    ((com.google.gson.TypeAdapter)v11).toJson(((java.io.Writer)v13),((java.lang.Object)v22));
    Object v23 = null;
    Object v24 = com.google.gson.internal.bind.TypeAdapters.newFactory(((com.google.gson.reflect.TypeToken)v4),((com.google.gson.TypeAdapter)v11));
    org.junit.Assert.assertNotNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = ((java.lang.Class)v3).getAnnotatedSuperclass();
    Object v5 = new com.google.gson.Gson();
    Object v6 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v5));
    Object v7 = com.google.gson.internal.bind.TypeAdapters.newTypeHierarchyFactory(((java.lang.Class)v3),((com.google.gson.TypeAdapter)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = "sun.misc.Unsafe";
    Object v5 = false;
    Object v6 = java.lang.ClassLoader.getSystemClassLoader();
    Object v7 = java.lang.Class.forName(((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()),((java.lang.ClassLoader)v6));
    Object v8 = "sun.misc.Unsafe";
    Object v9 = false;
    Object v10 = java.lang.ClassLoader.getSystemClassLoader();
    Object v11 = java.lang.Class.forName(((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),((java.lang.ClassLoader)v10));
    Object v12 = ((java.lang.Class)v7).asSubclass(((java.lang.Class)v11));
    Object v13 = new com.google.gson.Gson();
    Object v14 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v13));
    Object v15 = com.google.gson.internal.bind.TypeAdapters.newFactory(((java.lang.Class)v3),((java.lang.Class)v7),((com.google.gson.TypeAdapter)v14));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = new com.google.gson.Gson();
    Object v5 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v4));
    Object v6 = new com.google.gson.internal.bind.JsonTreeWriter();
    Object v7 = java.io.Writer.nullWriter();
    Object v8 = com.google.gson.internal.Streams.writerForAppendable(((java.lang.Appendable)v7));
    ((com.google.gson.TypeAdapter)v5).write(((com.google.gson.stream.JsonWriter)v6),((java.lang.Object)v8));
    Object v9 = null;
    Object v10 = com.google.gson.internal.bind.TypeAdapters.newFactory(((java.lang.Class)v3),((com.google.gson.TypeAdapter)v5));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = ((java.lang.Class)v3).getEnclosingClass();
    Object v5 = new com.google.gson.Gson();
    Object v6 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v5));
    Object v7 = 1;
    Object v8 = new com.google.gson.JsonPrimitive(((java.lang.Number)v7));
    Object v9 = ((com.google.gson.TypeAdapter)v6).fromJsonTree(((com.google.gson.JsonElement)v8));
    Object v10 = com.google.gson.internal.bind.TypeAdapters.newFactory(((java.lang.Class)v3),((com.google.gson.TypeAdapter)v6));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = com.google.gson.reflect.TypeToken.get(((java.lang.Class)v3));
    Object v5 = "sun.misc.Unsafe";
    Object v6 = false;
    Object v7 = java.lang.ClassLoader.getSystemClassLoader();
    Object v8 = java.lang.Class.forName(((java.lang.String)v5),(((java.lang.Boolean)v6).booleanValue()),((java.lang.ClassLoader)v7));
    Object v9 = ((com.google.gson.reflect.TypeToken)v4).isAssignableFrom(((java.lang.Class)v8));
    Object v10 = new com.google.gson.Gson();
    Object v11 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v10));
    Object v12 = com.google.gson.internal.bind.TypeAdapters.newFactory(((com.google.gson.reflect.TypeToken)v4),((com.google.gson.TypeAdapter)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = ((java.lang.Class)v3).getEnclosingConstructor();
    Object v5 = "sun.misc.Unsafe";
    Object v6 = false;
    Object v7 = java.lang.ClassLoader.getSystemClassLoader();
    Object v8 = java.lang.Class.forName(((java.lang.String)v5),(((java.lang.Boolean)v6).booleanValue()),((java.lang.ClassLoader)v7));
    Object v9 = new com.google.gson.Gson();
    Object v10 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v9));
    Object v11 = com.google.gson.internal.bind.TypeAdapters.newFactoryForMultipleTypes(((java.lang.Class)v3),((java.lang.Class)v8),((com.google.gson.TypeAdapter)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = new com.google.gson.Gson();
    Object v5 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v4));
    Object v6 = 1;
    Object v7 = new com.google.gson.JsonPrimitive(((java.lang.Number)v6));
    Object v8 = ((com.google.gson.TypeAdapter)v5).fromJsonTree(((com.google.gson.JsonElement)v7));
    Object v9 = com.google.gson.internal.bind.TypeAdapters.newFactory(((java.lang.Class)v3),((com.google.gson.TypeAdapter)v5));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = "sun.misc.Unsafe";
    Object v5 = false;
    Object v6 = java.lang.ClassLoader.getSystemClassLoader();
    Object v7 = java.lang.Class.forName(((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()),((java.lang.ClassLoader)v6));
    Object v8 = ((java.lang.Class)v7).getEnclosingConstructor();
    Object v9 = new com.google.gson.Gson();
    Object v10 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v9));
    Object v11 = com.google.gson.internal.bind.TypeAdapters.newFactoryForMultipleTypes(((java.lang.Class)v3),((java.lang.Class)v7),((com.google.gson.TypeAdapter)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = com.google.gson.reflect.TypeToken.get(((java.lang.Class)v3));
    Object v5 = new com.google.gson.Gson();
    Object v6 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v5));
    Object v7 = new com.google.gson.internal.bind.JsonTreeWriter();
    Object v8 = "sun.misc.Unsafe";
    Object v9 = false;
    Object v10 = java.lang.ClassLoader.getSystemClassLoader();
    Object v11 = java.lang.Class.forName(((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),((java.lang.ClassLoader)v10));
    Object v12 = ((java.lang.Class)v11).isMemberClass();
    Object v13 = new com.google.gson.Gson();
    Object v14 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v13));
    Object v15 = com.google.gson.internal.bind.TypeAdapters.newFactory(((java.lang.Class)v11),((com.google.gson.TypeAdapter)v14));
    ((com.google.gson.TypeAdapter)v6).write(((com.google.gson.stream.JsonWriter)v7),((java.lang.Object)v15));
    Object v16 = null;
    Object v17 = com.google.gson.internal.bind.TypeAdapters.newFactory(((com.google.gson.reflect.TypeToken)v4),((com.google.gson.TypeAdapter)v6));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = ((java.lang.Class)v3).getDeclaredFields();
    Object v5 = "sun.misc.Unsafe";
    Object v6 = false;
    Object v7 = java.lang.ClassLoader.getSystemClassLoader();
    Object v8 = java.lang.Class.forName(((java.lang.String)v5),(((java.lang.Boolean)v6).booleanValue()),((java.lang.ClassLoader)v7));
    Object v9 = null;
    Object v10 = null;
    Object v11 = new com.google.gson.Gson();
    Object v12 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v11));
    Object v13 = com.google.gson.internal.bind.TypeAdapters.newFactory(((java.lang.Class)v9),((java.lang.Class)v10),((com.google.gson.TypeAdapter)v12));
    Object v14 = ((java.lang.Class)v8).isInstance(((java.lang.Object)v13));
    Object v15 = new com.google.gson.Gson();
    Object v16 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v15));
    Object v17 = com.google.gson.internal.bind.TypeAdapters.newFactoryForMultipleTypes(((java.lang.Class)v3),((java.lang.Class)v8),((com.google.gson.TypeAdapter)v16));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = ((java.lang.Class)v3).getGenericSuperclass();
    Object v5 = "sun.misc.Unsafe";
    Object v6 = false;
    Object v7 = java.lang.ClassLoader.getSystemClassLoader();
    Object v8 = java.lang.Class.forName(((java.lang.String)v5),(((java.lang.Boolean)v6).booleanValue()),((java.lang.ClassLoader)v7));
    Object v9 = new com.google.gson.Gson();
    Object v10 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v9));
    Object v11 = com.google.gson.internal.bind.TypeAdapters.newFactory(((java.lang.Class)v3),((java.lang.Class)v8),((com.google.gson.TypeAdapter)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = ((java.lang.Class)v3).isEnum();
    Object v5 = new com.google.gson.Gson();
    Object v6 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v5));
    Object v7 = 1;
    Object v8 = new com.google.gson.JsonPrimitive(((java.lang.Number)v7));
    Object v9 = ((com.google.gson.TypeAdapter)v6).fromJsonTree(((com.google.gson.JsonElement)v8));
    Object v10 = com.google.gson.internal.bind.TypeAdapters.newFactory(((java.lang.Class)v3),((com.google.gson.TypeAdapter)v6));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = com.google.gson.reflect.TypeToken.get(((java.lang.Class)v3));
    Object v5 = new com.google.gson.Gson();
    Object v6 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v5));
    Object v7 = 1;
    Object v8 = new com.google.gson.JsonPrimitive(((java.lang.Number)v7));
    Object v9 = ((com.google.gson.TypeAdapter)v6).fromJsonTree(((com.google.gson.JsonElement)v8));
    Object v10 = com.google.gson.internal.bind.TypeAdapters.newFactory(((com.google.gson.reflect.TypeToken)v4),((com.google.gson.TypeAdapter)v6));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = "sun.misc.Unsafe";
    Object v5 = false;
    Object v6 = java.lang.ClassLoader.getSystemClassLoader();
    Object v7 = java.lang.Class.forName(((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()),((java.lang.ClassLoader)v6));
    Object v8 = new com.google.gson.Gson();
    Object v9 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v8));
    Object v10 = java.io.Writer.nullWriter();
    Object v11 = com.google.gson.internal.Streams.writerForAppendable(((java.lang.Appendable)v10));
    Object v12 = java.io.Writer.nullWriter();
    ((com.google.gson.TypeAdapter)v9).toJson(((java.io.Writer)v11),((java.lang.Object)v12));
    Object v13 = null;
    Object v14 = com.google.gson.internal.bind.TypeAdapters.newFactoryForMultipleTypes(((java.lang.Class)v3),((java.lang.Class)v7),((com.google.gson.TypeAdapter)v9));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = "sun.misc.Unsafe";
    Object v5 = false;
    Object v6 = java.lang.ClassLoader.getSystemClassLoader();
    Object v7 = java.lang.Class.forName(((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()),((java.lang.ClassLoader)v6));
    Object v8 = ((java.lang.Class)v7).getClasses();
    Object v9 = new com.google.gson.Gson();
    Object v10 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v9));
    Object v11 = com.google.gson.internal.bind.TypeAdapters.newFactoryForMultipleTypes(((java.lang.Class)v3),((java.lang.Class)v7),((com.google.gson.TypeAdapter)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = com.google.gson.reflect.TypeToken.get(((java.lang.Class)v3));
    Object v5 = 1;
    Object v6 = new com.google.gson.JsonPrimitive(((java.lang.Number)v5));
    Object v7 = ((com.google.gson.reflect.TypeToken)v4).equals(((java.lang.Object)v6));
    Object v8 = new com.google.gson.Gson();
    Object v9 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v8));
    Object v10 = com.google.gson.internal.bind.TypeAdapters.newFactory(((com.google.gson.reflect.TypeToken)v4),((com.google.gson.TypeAdapter)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = "sun.misc.Unsafe";
    Object v5 = false;
    Object v6 = java.lang.ClassLoader.getSystemClassLoader();
    Object v7 = java.lang.Class.forName(((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()),((java.lang.ClassLoader)v6));
    Object v8 = new com.google.gson.Gson();
    Object v9 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v8));
    Object v10 = 1;
    Object v11 = new com.google.gson.JsonPrimitive(((java.lang.Number)v10));
    Object v12 = ((com.google.gson.TypeAdapter)v9).fromJsonTree(((com.google.gson.JsonElement)v11));
    Object v13 = com.google.gson.internal.bind.TypeAdapters.newFactory(((java.lang.Class)v3),((java.lang.Class)v7),((com.google.gson.TypeAdapter)v9));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = new com.google.gson.Gson();
    Object v5 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v4));
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = ((com.google.gson.TypeAdapter)v5).toJsonTree(((java.lang.Object)v6));
    Object v8 = com.google.gson.internal.bind.TypeAdapters.newTypeHierarchyFactory(((java.lang.Class)v3),((com.google.gson.TypeAdapter)v5));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = "sun.misc.Unsafe";
    Object v5 = false;
    Object v6 = java.lang.ClassLoader.getSystemClassLoader();
    Object v7 = java.lang.Class.forName(((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()),((java.lang.ClassLoader)v6));
    Object v8 = ((java.lang.Class)v7).getNestMembers();
    Object v9 = new com.google.gson.Gson();
    Object v10 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v9));
    Object v11 = com.google.gson.internal.bind.TypeAdapters.newFactoryForMultipleTypes(((java.lang.Class)v3),((java.lang.Class)v7),((com.google.gson.TypeAdapter)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = com.google.gson.reflect.TypeToken.get(((java.lang.Class)v3));
    Object v5 = new com.google.gson.Gson();
    Object v6 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v5));
    Object v7 = "sun.misc.Unsafe";
    Object v8 = false;
    Object v9 = java.lang.ClassLoader.getSystemClassLoader();
    Object v10 = java.lang.Class.forName(((java.lang.String)v7),(((java.lang.Boolean)v8).booleanValue()),((java.lang.ClassLoader)v9));
    Object v11 = com.google.gson.reflect.TypeToken.get(((java.lang.Class)v10));
    Object v12 = "sun.misc.Unsafe";
    Object v13 = false;
    Object v14 = java.lang.ClassLoader.getSystemClassLoader();
    Object v15 = java.lang.Class.forName(((java.lang.String)v12),(((java.lang.Boolean)v13).booleanValue()),((java.lang.ClassLoader)v14));
    Object v16 = com.google.gson.reflect.TypeToken.get(((java.lang.Class)v15));
    Object v17 = ((com.google.gson.reflect.TypeToken)v11).isAssignableFrom(((com.google.gson.reflect.TypeToken)v16));
    Object v18 = new com.google.gson.Gson();
    Object v19 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v18));
    Object v20 = com.google.gson.internal.bind.TypeAdapters.newFactory(((com.google.gson.reflect.TypeToken)v11),((com.google.gson.TypeAdapter)v19));
    Object v21 = ((com.google.gson.TypeAdapter)v6).toJsonTree(((java.lang.Object)v20));
    Object v22 = com.google.gson.internal.bind.TypeAdapters.newFactory(((com.google.gson.reflect.TypeToken)v4),((com.google.gson.TypeAdapter)v6));
    org.junit.Assert.assertNotNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = com.google.gson.reflect.TypeToken.get(((java.lang.Class)v3));
    Object v5 = "sun.misc.Unsafe";
    Object v6 = false;
    Object v7 = java.lang.ClassLoader.getSystemClassLoader();
    Object v8 = java.lang.Class.forName(((java.lang.String)v5),(((java.lang.Boolean)v6).booleanValue()),((java.lang.ClassLoader)v7));
    Object v9 = ((com.google.gson.reflect.TypeToken)v4).isAssignableFrom(((java.lang.Class)v8));
    Object v10 = new com.google.gson.Gson();
    Object v11 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v10));
    Object v12 = new com.google.gson.Gson();
    Object v13 = ((com.google.gson.TypeAdapter)v11).toJsonTree(((java.lang.Object)v12));
    Object v14 = com.google.gson.internal.bind.TypeAdapters.newFactory(((com.google.gson.reflect.TypeToken)v4),((com.google.gson.TypeAdapter)v11));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = "sun.misc.Unsafe";
    Object v5 = false;
    Object v6 = java.lang.ClassLoader.getSystemClassLoader();
    Object v7 = java.lang.Class.forName(((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()),((java.lang.ClassLoader)v6));
    Object v8 = ((java.lang.Class)v7).isEnum();
    Object v9 = new com.google.gson.Gson();
    Object v10 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v9));
    Object v11 = com.google.gson.internal.bind.TypeAdapters.newFactoryForMultipleTypes(((java.lang.Class)v3),((java.lang.Class)v7),((com.google.gson.TypeAdapter)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = ((java.lang.Class)v3).getPackageName();
    Object v5 = "sun.misc.Unsafe";
    Object v6 = false;
    Object v7 = java.lang.ClassLoader.getSystemClassLoader();
    Object v8 = java.lang.Class.forName(((java.lang.String)v5),(((java.lang.Boolean)v6).booleanValue()),((java.lang.ClassLoader)v7));
    Object v9 = "sun.misc.Unsafe";
    Object v10 = false;
    Object v11 = java.lang.ClassLoader.getSystemClassLoader();
    Object v12 = java.lang.Class.forName(((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()),((java.lang.ClassLoader)v11));
    Object v13 = ((java.lang.Class)v8).getAnnotation(((java.lang.Class)v12));
    Object v14 = new com.google.gson.Gson();
    Object v15 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v14));
    Object v16 = com.google.gson.internal.bind.TypeAdapters.newFactoryForMultipleTypes(((java.lang.Class)v3),((java.lang.Class)v8),((com.google.gson.TypeAdapter)v15));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = ((java.lang.Class)v3).getNestMembers();
    Object v5 = "sun.misc.Unsafe";
    Object v6 = false;
    Object v7 = java.lang.ClassLoader.getSystemClassLoader();
    Object v8 = java.lang.Class.forName(((java.lang.String)v5),(((java.lang.Boolean)v6).booleanValue()),((java.lang.ClassLoader)v7));
    Object v9 = new com.google.gson.Gson();
    Object v10 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v9));
    Object v11 = "sun.misc.Unsafe";
    Object v12 = false;
    Object v13 = java.lang.ClassLoader.getSystemClassLoader();
    Object v14 = java.lang.Class.forName(((java.lang.String)v11),(((java.lang.Boolean)v12).booleanValue()),((java.lang.ClassLoader)v13));
    Object v15 = ((java.lang.Class)v14).isInterface();
    Object v16 = "sun.misc.Unsafe";
    Object v17 = false;
    Object v18 = java.lang.ClassLoader.getSystemClassLoader();
    Object v19 = java.lang.Class.forName(((java.lang.String)v16),(((java.lang.Boolean)v17).booleanValue()),((java.lang.ClassLoader)v18));
    Object v20 = ((java.lang.Class)v19).getDeclaredFields();
    Object v21 = new com.google.gson.Gson();
    Object v22 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v21));
    Object v23 = com.google.gson.internal.bind.TypeAdapters.newFactory(((java.lang.Class)v14),((java.lang.Class)v19),((com.google.gson.TypeAdapter)v22));
    Object v24 = ((com.google.gson.TypeAdapter)v10).toJsonTree(((java.lang.Object)v23));
    Object v25 = com.google.gson.internal.bind.TypeAdapters.newFactoryForMultipleTypes(((java.lang.Class)v3),((java.lang.Class)v8),((com.google.gson.TypeAdapter)v10));
    org.junit.Assert.assertNotNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = ((java.lang.Class)v3).getAnnotatedInterfaces();
    Object v5 = new com.google.gson.Gson();
    Object v6 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v5));
    Object v7 = com.google.gson.internal.bind.TypeAdapters.newFactory(((java.lang.Class)v3),((com.google.gson.TypeAdapter)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = new com.google.gson.Gson();
    Object v5 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v4));
    Object v6 = null;
    Object v7 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v6));
    Object v8 = ((com.google.gson.TypeAdapter)v5).toJson(((java.lang.Object)v7));
    Object v9 = com.google.gson.internal.bind.TypeAdapters.newFactory(((java.lang.Class)v3),((com.google.gson.TypeAdapter)v5));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = ((java.lang.Class)v3).isLocalClass();
    Object v5 = new com.google.gson.Gson();
    Object v6 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v5));
    Object v7 = com.google.gson.internal.bind.TypeAdapters.newFactory(((java.lang.Class)v3),((com.google.gson.TypeAdapter)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = new com.google.gson.Gson();
    Object v5 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v4));
    Object v6 = new com.google.gson.internal.bind.JsonTreeWriter();
    Object v7 = java.io.Writer.nullWriter();
    ((com.google.gson.TypeAdapter)v5).write(((com.google.gson.stream.JsonWriter)v6),((java.lang.Object)v7));
    Object v8 = null;
    Object v9 = com.google.gson.internal.bind.TypeAdapters.newTypeHierarchyFactory(((java.lang.Class)v3),((com.google.gson.TypeAdapter)v5));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = "sun.misc.Unsafe";
    Object v5 = false;
    Object v6 = java.lang.ClassLoader.getSystemClassLoader();
    Object v7 = java.lang.Class.forName(((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()),((java.lang.ClassLoader)v6));
    Object v8 = ((java.lang.Class)v3).isAnnotationPresent(((java.lang.Class)v7));
    Object v9 = new com.google.gson.Gson();
    Object v10 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v9));
    Object v11 = com.google.gson.internal.bind.TypeAdapters.newFactory(((java.lang.Class)v3),((com.google.gson.TypeAdapter)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = "sun.misc.Unsafe";
    Object v5 = false;
    Object v6 = java.lang.ClassLoader.getSystemClassLoader();
    Object v7 = java.lang.Class.forName(((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()),((java.lang.ClassLoader)v6));
    Object v8 = ((java.lang.Class)v3).asSubclass(((java.lang.Class)v7));
    Object v9 = "sun.misc.Unsafe";
    Object v10 = false;
    Object v11 = java.lang.ClassLoader.getSystemClassLoader();
    Object v12 = java.lang.Class.forName(((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()),((java.lang.ClassLoader)v11));
    Object v13 = new com.google.gson.Gson();
    Object v14 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v13));
    Object v15 = com.google.gson.internal.bind.TypeAdapters.newFactory(((java.lang.Class)v3),((java.lang.Class)v12),((com.google.gson.TypeAdapter)v14));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = "sun.misc.Unsafe";
    Object v5 = false;
    Object v6 = java.lang.ClassLoader.getSystemClassLoader();
    Object v7 = java.lang.Class.forName(((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()),((java.lang.ClassLoader)v6));
    Object v8 = new com.google.gson.Gson();
    Object v9 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v8));
    Object v10 = java.io.Writer.nullWriter();
    Object v11 = com.google.gson.internal.Streams.writerForAppendable(((java.lang.Appendable)v10));
    Object v12 = ((com.google.gson.TypeAdapter)v9).toJsonTree(((java.lang.Object)v11));
    Object v13 = com.google.gson.internal.bind.TypeAdapters.newFactory(((java.lang.Class)v3),((java.lang.Class)v7),((com.google.gson.TypeAdapter)v9));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = ((java.lang.Class)v3).toGenericString();
    Object v5 = new com.google.gson.Gson();
    Object v6 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v5));
    Object v7 = com.google.gson.internal.bind.TypeAdapters.newFactory(((java.lang.Class)v3),((com.google.gson.TypeAdapter)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = ((java.lang.Class)v3).getSuperclass();
    Object v5 = new com.google.gson.Gson();
    Object v6 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v5));
    Object v7 = ((com.google.gson.TypeAdapter)v6).nullSafe();
    Object v8 = com.google.gson.internal.bind.TypeAdapters.newFactory(((java.lang.Class)v3),((com.google.gson.TypeAdapter)v6));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = ((java.lang.Class)v3).getEnclosingMethod();
    Object v5 = new com.google.gson.Gson();
    Object v6 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v5));
    Object v7 = com.google.gson.internal.bind.TypeAdapters.newTypeHierarchyFactory(((java.lang.Class)v3),((com.google.gson.TypeAdapter)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = ((java.lang.Class)v3).getTypeName();
    Object v5 = new com.google.gson.Gson();
    Object v6 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v5));
    Object v7 = com.google.gson.internal.bind.TypeAdapters.newFactory(((java.lang.Class)v3),((com.google.gson.TypeAdapter)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = ((java.lang.Class)v3).isPrimitive();
    Object v5 = "sun.misc.Unsafe";
    Object v6 = false;
    Object v7 = java.lang.ClassLoader.getSystemClassLoader();
    Object v8 = java.lang.Class.forName(((java.lang.String)v5),(((java.lang.Boolean)v6).booleanValue()),((java.lang.ClassLoader)v7));
    Object v9 = new com.google.gson.Gson();
    Object v10 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v9));
    Object v11 = com.google.gson.internal.bind.TypeAdapters.newFactory(((java.lang.Class)v3),((java.lang.Class)v8),((com.google.gson.TypeAdapter)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = ((java.lang.Class)v3).getComponentType();
    Object v5 = "sun.misc.Unsafe";
    Object v6 = false;
    Object v7 = java.lang.ClassLoader.getSystemClassLoader();
    Object v8 = java.lang.Class.forName(((java.lang.String)v5),(((java.lang.Boolean)v6).booleanValue()),((java.lang.ClassLoader)v7));
    Object v9 = new com.google.gson.Gson();
    Object v10 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v9));
    Object v11 = com.google.gson.internal.bind.TypeAdapters.newFactory(((java.lang.Class)v3),((java.lang.Class)v8),((com.google.gson.TypeAdapter)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = "sun.misc.Unsafe";
    Object v5 = false;
    Object v6 = java.lang.ClassLoader.getSystemClassLoader();
    Object v7 = java.lang.Class.forName(((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()),((java.lang.ClassLoader)v6));
    Object v8 = new com.google.gson.Gson();
    Object v9 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v8));
    Object v10 = java.io.Writer.nullWriter();
    Object v11 = com.google.gson.internal.Streams.writerForAppendable(((java.lang.Appendable)v10));
    Object v12 = ((com.google.gson.TypeAdapter)v9).toJson(((java.lang.Object)v11));
    Object v13 = com.google.gson.internal.bind.TypeAdapters.newFactory(((java.lang.Class)v3),((java.lang.Class)v7),((com.google.gson.TypeAdapter)v9));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = ((java.lang.Class)v3).getEnumConstants();
    Object v5 = "sun.misc.Unsafe";
    Object v6 = false;
    Object v7 = java.lang.ClassLoader.getSystemClassLoader();
    Object v8 = java.lang.Class.forName(((java.lang.String)v5),(((java.lang.Boolean)v6).booleanValue()),((java.lang.ClassLoader)v7));
    Object v9 = "sun.misc.Unsafe";
    Object v10 = false;
    Object v11 = java.lang.ClassLoader.getSystemClassLoader();
    Object v12 = java.lang.Class.forName(((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()),((java.lang.ClassLoader)v11));
    Object v13 = ((java.lang.Class)v8).isNestmateOf(((java.lang.Class)v12));
    Object v14 = new com.google.gson.Gson();
    Object v15 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v14));
    Object v16 = java.io.Writer.nullWriter();
    Object v17 = com.google.gson.internal.Streams.writerForAppendable(((java.lang.Appendable)v16));
    Object v18 = java.io.Writer.nullWriter();
    Object v19 = com.google.gson.internal.Streams.writerForAppendable(((java.lang.Appendable)v18));
    ((com.google.gson.TypeAdapter)v15).toJson(((java.io.Writer)v17),((java.lang.Object)v19));
    Object v20 = null;
    Object v21 = com.google.gson.internal.bind.TypeAdapters.newFactoryForMultipleTypes(((java.lang.Class)v3),((java.lang.Class)v8),((com.google.gson.TypeAdapter)v15));
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = "sun.misc.Unsafe";
    Object v5 = false;
    Object v6 = java.lang.ClassLoader.getSystemClassLoader();
    Object v7 = java.lang.Class.forName(((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()),((java.lang.ClassLoader)v6));
    Object v8 = new com.google.gson.Gson();
    Object v9 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v8));
    Object v10 = "sun.misc.Unsafe";
    Object v11 = false;
    Object v12 = java.lang.ClassLoader.getSystemClassLoader();
    Object v13 = java.lang.Class.forName(((java.lang.String)v10),(((java.lang.Boolean)v11).booleanValue()),((java.lang.ClassLoader)v12));
    Object v14 = com.google.gson.reflect.TypeToken.get(((java.lang.Class)v13));
    Object v15 = "sun.misc.Unsafe";
    Object v16 = false;
    Object v17 = java.lang.ClassLoader.getSystemClassLoader();
    Object v18 = java.lang.Class.forName(((java.lang.String)v15),(((java.lang.Boolean)v16).booleanValue()),((java.lang.ClassLoader)v17));
    Object v19 = com.google.gson.reflect.TypeToken.get(((java.lang.Class)v18));
    Object v20 = ((com.google.gson.reflect.TypeToken)v14).equals(((java.lang.Object)v19));
    Object v21 = new com.google.gson.Gson();
    Object v22 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v21));
    Object v23 = com.google.gson.internal.bind.TypeAdapters.newFactory(((com.google.gson.reflect.TypeToken)v14),((com.google.gson.TypeAdapter)v22));
    Object v24 = ((com.google.gson.TypeAdapter)v9).toJsonTree(((java.lang.Object)v23));
    Object v25 = com.google.gson.internal.bind.TypeAdapters.newFactoryForMultipleTypes(((java.lang.Class)v3),((java.lang.Class)v7),((com.google.gson.TypeAdapter)v9));
    org.junit.Assert.assertNotNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = com.google.gson.reflect.TypeToken.get(((java.lang.Class)v3));
    Object v5 = "sun.misc.Unsafe";
    Object v6 = false;
    Object v7 = java.lang.ClassLoader.getSystemClassLoader();
    Object v8 = java.lang.Class.forName(((java.lang.String)v5),(((java.lang.Boolean)v6).booleanValue()),((java.lang.ClassLoader)v7));
    Object v9 = ((com.google.gson.reflect.TypeToken)v4).isAssignableFrom(((java.lang.Class)v8));
    Object v10 = new com.google.gson.Gson();
    Object v11 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v10));
    Object v12 = "sun.misc.Unsafe";
    Object v13 = false;
    Object v14 = java.lang.ClassLoader.getSystemClassLoader();
    Object v15 = java.lang.Class.forName(((java.lang.String)v12),(((java.lang.Boolean)v13).booleanValue()),((java.lang.ClassLoader)v14));
    Object v16 = ((java.lang.Class)v15).getPackageName();
    Object v17 = "sun.misc.Unsafe";
    Object v18 = false;
    Object v19 = java.lang.ClassLoader.getSystemClassLoader();
    Object v20 = java.lang.Class.forName(((java.lang.String)v17),(((java.lang.Boolean)v18).booleanValue()),((java.lang.ClassLoader)v19));
    Object v21 = "sun.misc.Unsafe";
    Object v22 = false;
    Object v23 = java.lang.ClassLoader.getSystemClassLoader();
    Object v24 = java.lang.Class.forName(((java.lang.String)v21),(((java.lang.Boolean)v22).booleanValue()),((java.lang.ClassLoader)v23));
    Object v25 = ((java.lang.Class)v20).getAnnotation(((java.lang.Class)v24));
    Object v26 = new com.google.gson.Gson();
    Object v27 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v26));
    Object v28 = com.google.gson.internal.bind.TypeAdapters.newFactoryForMultipleTypes(((java.lang.Class)v15),((java.lang.Class)v20),((com.google.gson.TypeAdapter)v27));
    Object v29 = ((com.google.gson.TypeAdapter)v11).toJson(((java.lang.Object)v28));
    Object v30 = com.google.gson.internal.bind.TypeAdapters.newFactory(((com.google.gson.reflect.TypeToken)v4),((com.google.gson.TypeAdapter)v11));
    org.junit.Assert.assertNotNull(v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = ((java.lang.Class)v3).isMemberClass();
    Object v5 = new com.google.gson.Gson();
    Object v6 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v5));
    Object v7 = com.google.gson.internal.bind.TypeAdapters.newTypeHierarchyFactory(((java.lang.Class)v3),((com.google.gson.TypeAdapter)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = ((java.lang.Class)v3).getPackageName();
    Object v5 = new com.google.gson.Gson();
    Object v6 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v5));
    Object v7 = com.google.gson.internal.bind.TypeAdapters.newTypeHierarchyFactory(((java.lang.Class)v3),((com.google.gson.TypeAdapter)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = ((java.lang.Class)v3).desiredAssertionStatus();
    Object v5 = new com.google.gson.Gson();
    Object v6 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v5));
    Object v7 = com.google.gson.internal.bind.TypeAdapters.newTypeHierarchyFactory(((java.lang.Class)v3),((com.google.gson.TypeAdapter)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = com.google.gson.reflect.TypeToken.get(((java.lang.Class)v3));
    Object v5 = new com.google.gson.Gson();
    Object v6 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v5));
    Object v7 = java.io.Writer.nullWriter();
    Object v8 = com.google.gson.internal.Streams.writerForAppendable(((java.lang.Appendable)v7));
    Object v9 = java.io.Writer.nullWriter();
    Object v10 = com.google.gson.internal.Streams.writerForAppendable(((java.lang.Appendable)v9));
    ((com.google.gson.TypeAdapter)v6).toJson(((java.io.Writer)v8),((java.lang.Object)v10));
    Object v11 = null;
    Object v12 = com.google.gson.internal.bind.TypeAdapters.newFactory(((com.google.gson.reflect.TypeToken)v4),((com.google.gson.TypeAdapter)v6));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = "sun.misc.Unsafe";
    Object v5 = false;
    Object v6 = java.lang.ClassLoader.getSystemClassLoader();
    Object v7 = java.lang.Class.forName(((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()),((java.lang.ClassLoader)v6));
    Object v8 = ((java.lang.Class)v7).getSuperclass();
    Object v9 = new com.google.gson.Gson();
    Object v10 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v9));
    Object v11 = com.google.gson.internal.bind.TypeAdapters.newFactoryForMultipleTypes(((java.lang.Class)v3),((java.lang.Class)v7),((com.google.gson.TypeAdapter)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = ((java.lang.Class)v3).getPackageName();
    Object v5 = "sun.misc.Unsafe";
    Object v6 = false;
    Object v7 = java.lang.ClassLoader.getSystemClassLoader();
    Object v8 = java.lang.Class.forName(((java.lang.String)v5),(((java.lang.Boolean)v6).booleanValue()),((java.lang.ClassLoader)v7));
    Object v9 = new com.google.gson.Gson();
    Object v10 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v9));
    Object v11 = com.google.gson.internal.bind.TypeAdapters.newFactory(((java.lang.Class)v3),((java.lang.Class)v8),((com.google.gson.TypeAdapter)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = "sun.misc.Unsafe";
    Object v5 = false;
    Object v6 = java.lang.ClassLoader.getSystemClassLoader();
    Object v7 = java.lang.Class.forName(((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()),((java.lang.ClassLoader)v6));
    Object v8 = ((java.lang.Class)v7).getName();
    Object v9 = new com.google.gson.Gson();
    Object v10 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v9));
    Object v11 = com.google.gson.internal.bind.TypeAdapters.newFactoryForMultipleTypes(((java.lang.Class)v3),((java.lang.Class)v7),((com.google.gson.TypeAdapter)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = ((java.lang.Class)v3).getCanonicalName();
    Object v5 = new com.google.gson.Gson();
    Object v6 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v5));
    Object v7 = 1;
    Object v8 = new com.google.gson.JsonPrimitive(((java.lang.Number)v7));
    Object v9 = ((com.google.gson.TypeAdapter)v6).fromJsonTree(((com.google.gson.JsonElement)v8));
    Object v10 = com.google.gson.internal.bind.TypeAdapters.newTypeHierarchyFactory(((java.lang.Class)v3),((com.google.gson.TypeAdapter)v6));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = ((java.lang.Class)v3).getAnnotatedSuperclass();
    Object v5 = new com.google.gson.Gson();
    Object v6 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v5));
    Object v7 = new com.google.gson.internal.bind.JsonTreeWriter();
    Object v8 = "sun.misc.Unsafe";
    Object v9 = false;
    Object v10 = java.lang.ClassLoader.getSystemClassLoader();
    Object v11 = java.lang.Class.forName(((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),((java.lang.ClassLoader)v10));
    Object v12 = new com.google.gson.Gson();
    Object v13 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v12));
    Object v14 = new com.google.gson.internal.bind.JsonTreeWriter();
    Object v15 = java.io.Writer.nullWriter();
    ((com.google.gson.TypeAdapter)v13).write(((com.google.gson.stream.JsonWriter)v14),((java.lang.Object)v15));
    Object v16 = null;
    Object v17 = com.google.gson.internal.bind.TypeAdapters.newTypeHierarchyFactory(((java.lang.Class)v11),((com.google.gson.TypeAdapter)v13));
    ((com.google.gson.TypeAdapter)v6).write(((com.google.gson.stream.JsonWriter)v7),((java.lang.Object)v17));
    Object v18 = null;
    Object v19 = com.google.gson.internal.bind.TypeAdapters.newTypeHierarchyFactory(((java.lang.Class)v3),((com.google.gson.TypeAdapter)v6));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = ((java.lang.Class)v3).getEnclosingConstructor();
    Object v5 = "sun.misc.Unsafe";
    Object v6 = false;
    Object v7 = java.lang.ClassLoader.getSystemClassLoader();
    Object v8 = java.lang.Class.forName(((java.lang.String)v5),(((java.lang.Boolean)v6).booleanValue()),((java.lang.ClassLoader)v7));
    Object v9 = new com.google.gson.Gson();
    Object v10 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v9));
    Object v11 = com.google.gson.internal.bind.TypeAdapters.newFactory(((java.lang.Class)v3),((java.lang.Class)v8),((com.google.gson.TypeAdapter)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = ((java.lang.Class)v3).getEnclosingMethod();
    Object v5 = new com.google.gson.Gson();
    Object v6 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v5));
    Object v7 = "sun.misc.Unsafe";
    Object v8 = false;
    Object v9 = java.lang.ClassLoader.getSystemClassLoader();
    Object v10 = java.lang.Class.forName(((java.lang.String)v7),(((java.lang.Boolean)v8).booleanValue()),((java.lang.ClassLoader)v9));
    Object v11 = ((java.lang.Class)v10).toString();
    Object v12 = new com.google.gson.Gson();
    Object v13 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v12));
    Object v14 = com.google.gson.internal.bind.TypeAdapters.newTypeHierarchyFactory(((java.lang.Class)v10),((com.google.gson.TypeAdapter)v13));
    Object v15 = ((com.google.gson.TypeAdapter)v6).toJsonTree(((java.lang.Object)v14));
    Object v16 = com.google.gson.internal.bind.TypeAdapters.newTypeHierarchyFactory(((java.lang.Class)v3),((com.google.gson.TypeAdapter)v6));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = "sun.misc.Unsafe";
    Object v5 = false;
    Object v6 = java.lang.ClassLoader.getSystemClassLoader();
    Object v7 = java.lang.Class.forName(((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()),((java.lang.ClassLoader)v6));
    Object v8 = ((java.lang.Class)v7).getDeclaredAnnotations();
    Object v9 = new com.google.gson.Gson();
    Object v10 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v9));
    Object v11 = com.google.gson.internal.bind.TypeAdapters.newFactoryForMultipleTypes(((java.lang.Class)v3),((java.lang.Class)v7),((com.google.gson.TypeAdapter)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = "sun.misc.Unsafe";
    Object v5 = false;
    Object v6 = java.lang.ClassLoader.getSystemClassLoader();
    Object v7 = java.lang.Class.forName(((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()),((java.lang.ClassLoader)v6));
    Object v8 = new com.google.gson.Gson();
    Object v9 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v8));
    Object v10 = java.io.Writer.nullWriter();
    Object v11 = com.google.gson.internal.Streams.writerForAppendable(((java.lang.Appendable)v10));
    Object v12 = "sun.misc.Unsafe";
    Object v13 = false;
    Object v14 = java.lang.ClassLoader.getSystemClassLoader();
    Object v15 = java.lang.Class.forName(((java.lang.String)v12),(((java.lang.Boolean)v13).booleanValue()),((java.lang.ClassLoader)v14));
    Object v16 = "sun.misc.Unsafe";
    Object v17 = false;
    Object v18 = java.lang.ClassLoader.getSystemClassLoader();
    Object v19 = java.lang.Class.forName(((java.lang.String)v16),(((java.lang.Boolean)v17).booleanValue()),((java.lang.ClassLoader)v18));
    Object v20 = ((java.lang.Class)v15).isAnnotationPresent(((java.lang.Class)v19));
    Object v21 = "sun.misc.Unsafe";
    Object v22 = false;
    Object v23 = java.lang.ClassLoader.getSystemClassLoader();
    Object v24 = java.lang.Class.forName(((java.lang.String)v21),(((java.lang.Boolean)v22).booleanValue()),((java.lang.ClassLoader)v23));
    Object v25 = new com.google.gson.Gson();
    Object v26 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v25));
    Object v27 = com.google.gson.internal.bind.TypeAdapters.newFactoryForMultipleTypes(((java.lang.Class)v15),((java.lang.Class)v24),((com.google.gson.TypeAdapter)v26));
    ((com.google.gson.TypeAdapter)v9).toJson(((java.io.Writer)v11),((java.lang.Object)v27));
    Object v28 = null;
    Object v29 = com.google.gson.internal.bind.TypeAdapters.newFactoryForMultipleTypes(((java.lang.Class)v3),((java.lang.Class)v7),((com.google.gson.TypeAdapter)v9));
    org.junit.Assert.assertNotNull(v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = "sun.misc.Unsafe";
    Object v5 = false;
    Object v6 = java.lang.ClassLoader.getSystemClassLoader();
    Object v7 = java.lang.Class.forName(((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()),((java.lang.ClassLoader)v6));
    Object v8 = "sun.misc.Unsafe";
    Object v9 = false;
    Object v10 = java.lang.ClassLoader.getSystemClassLoader();
    Object v11 = java.lang.Class.forName(((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()),((java.lang.ClassLoader)v10));
    Object v12 = ((java.lang.Class)v7).getDeclaredAnnotation(((java.lang.Class)v11));
    Object v13 = new com.google.gson.Gson();
    Object v14 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v13));
    Object v15 = com.google.gson.internal.bind.TypeAdapters.newFactoryForMultipleTypes(((java.lang.Class)v3),((java.lang.Class)v7),((com.google.gson.TypeAdapter)v14));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = ((java.lang.Class)v3).getNestHost();
    Object v5 = "sun.misc.Unsafe";
    Object v6 = false;
    Object v7 = java.lang.ClassLoader.getSystemClassLoader();
    Object v8 = java.lang.Class.forName(((java.lang.String)v5),(((java.lang.Boolean)v6).booleanValue()),((java.lang.ClassLoader)v7));
    Object v9 = new com.google.gson.Gson();
    Object v10 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v9));
    Object v11 = "sun.misc.Unsafe";
    Object v12 = false;
    Object v13 = java.lang.ClassLoader.getSystemClassLoader();
    Object v14 = java.lang.Class.forName(((java.lang.String)v11),(((java.lang.Boolean)v12).booleanValue()),((java.lang.ClassLoader)v13));
    Object v15 = ((java.lang.Class)v14).getPackageName();
    Object v16 = new com.google.gson.Gson();
    Object v17 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v16));
    Object v18 = com.google.gson.internal.bind.TypeAdapters.newTypeHierarchyFactory(((java.lang.Class)v14),((com.google.gson.TypeAdapter)v17));
    Object v19 = ((com.google.gson.TypeAdapter)v10).toJson(((java.lang.Object)v18));
    Object v20 = com.google.gson.internal.bind.TypeAdapters.newFactoryForMultipleTypes(((java.lang.Class)v3),((java.lang.Class)v8),((com.google.gson.TypeAdapter)v10));
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = "sun.misc.Unsafe";
    Object v5 = false;
    Object v6 = java.lang.ClassLoader.getSystemClassLoader();
    Object v7 = java.lang.Class.forName(((java.lang.String)v4),(((java.lang.Boolean)v5).booleanValue()),((java.lang.ClassLoader)v6));
    Object v8 = ((java.lang.Class)v3).getAnnotation(((java.lang.Class)v7));
    Object v9 = new com.google.gson.Gson();
    Object v10 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v9));
    Object v11 = com.google.gson.internal.bind.TypeAdapters.newTypeHierarchyFactory(((java.lang.Class)v3),((com.google.gson.TypeAdapter)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = false;
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = java.lang.Class.forName(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()),((java.lang.ClassLoader)v2));
    Object v4 = ((java.lang.Class)v3).getEnumConstants();
    Object v5 = new com.google.gson.Gson();
    Object v6 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v5));
    Object v7 = com.google.gson.internal.bind.TypeAdapters.newFactory(((java.lang.Class)v3),((com.google.gson.TypeAdapter)v6));
    org.junit.Assert.assertNotNull(v7);
  }
}
