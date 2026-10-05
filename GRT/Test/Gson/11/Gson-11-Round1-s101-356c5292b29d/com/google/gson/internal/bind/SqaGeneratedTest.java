package com.google.gson.internal.bind;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = null;
    Object v1 = new com.google.gson.Gson();
    Object v2 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v1));
    Object v3 = com.google.gson.internal.bind.TypeAdapters.newFactory(((com.google.gson.reflect.TypeToken)v0),((com.google.gson.TypeAdapter)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = null;
    Object v1 = new com.google.gson.Gson();
    Object v2 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v1));
    Object v3 = com.google.gson.internal.bind.TypeAdapters.newFactory(((java.lang.Class)v0),((com.google.gson.TypeAdapter)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = null;
    Object v1 = new com.google.gson.Gson();
    Object v2 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v1));
    Object v3 = com.google.gson.internal.bind.TypeAdapters.newTypeHierarchyFactory(((java.lang.Class)v0),((com.google.gson.TypeAdapter)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = null;
    Object v1 = new com.google.gson.Gson();
    Object v2 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v1));
    Object v3 = new com.google.gson.internal.bind.JsonTreeWriter();
    Object v4 = null;
    Object v5 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v4));
    ((com.google.gson.TypeAdapter)v2).write(((com.google.gson.stream.JsonWriter)v3),((java.lang.Object)v5));
    Object v6 = null;
    Object v7 = com.google.gson.internal.bind.TypeAdapters.newTypeHierarchyFactory(((java.lang.Class)v0),((com.google.gson.TypeAdapter)v2));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = null;
    Object v1 = new com.google.gson.Gson();
    Object v2 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v1));
    Object v3 = 0;
    Object v4 = new java.io.StringWriter((((java.lang.Integer)v3).intValue()));
    Object v5 = new com.google.gson.Gson();
    Object v6 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v5));
    ((com.google.gson.TypeAdapter)v2).toJson(((java.io.Writer)v4),((java.lang.Object)v6));
    Object v7 = null;
    Object v8 = com.google.gson.internal.bind.TypeAdapters.newTypeHierarchyFactory(((java.lang.Class)v0),((com.google.gson.TypeAdapter)v2));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = null;
    Object v1 = new com.google.gson.Gson();
    Object v2 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v1));
    Object v3 = null;
    Object v4 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v3));
    Object v5 = ((com.google.gson.TypeAdapter)v2).toJsonTree(((java.lang.Object)v4));
    Object v6 = com.google.gson.internal.bind.TypeAdapters.newTypeHierarchyFactory(((java.lang.Class)v0),((com.google.gson.TypeAdapter)v2));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = java.lang.Class.forName(((java.lang.String)v0));
    Object v2 = com.google.gson.reflect.TypeToken.get(((java.lang.Class)v1));
    Object v3 = "sun.misc.Unsafe";
    Object v4 = java.lang.Class.forName(((java.lang.String)v3));
    Object v5 = ((com.google.gson.reflect.TypeToken)v2).isAssignableFrom(((java.lang.Class)v4));
    Object v6 = new com.google.gson.Gson();
    Object v7 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v6));
    Object v8 = java.io.Reader.nullReader();
    Object v9 = new com.google.gson.stream.JsonReader(((java.io.Reader)v8));
    Object v10 = com.google.gson.internal.Streams.parse(((com.google.gson.stream.JsonReader)v9));
    Object v11 = ((com.google.gson.TypeAdapter)v7).fromJsonTree(((com.google.gson.JsonElement)v10));
    Object v12 = com.google.gson.internal.bind.TypeAdapters.newFactory(((com.google.gson.reflect.TypeToken)v2),((com.google.gson.TypeAdapter)v7));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = java.lang.Class.forName(((java.lang.String)v0));
    Object v2 = "sun.misc.Unsafe";
    Object v3 = java.lang.Class.forName(((java.lang.String)v2));
    Object v4 = new com.google.gson.Gson();
    Object v5 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v4));
    Object v6 = com.google.gson.internal.bind.TypeAdapters.newFactory(((java.lang.Class)v1),((java.lang.Class)v3),((com.google.gson.TypeAdapter)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = java.lang.Class.forName(((java.lang.String)v0));
    Object v2 = new com.google.gson.Gson();
    Object v3 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v2));
    Object v4 = java.io.Reader.nullReader();
    Object v5 = new com.google.gson.stream.JsonReader(((java.io.Reader)v4));
    Object v6 = com.google.gson.internal.Streams.parse(((com.google.gson.stream.JsonReader)v5));
    Object v7 = ((com.google.gson.TypeAdapter)v3).fromJsonTree(((com.google.gson.JsonElement)v6));
    Object v8 = com.google.gson.internal.bind.TypeAdapters.newTypeHierarchyFactory(((java.lang.Class)v1),((com.google.gson.TypeAdapter)v3));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = java.lang.Class.forName(((java.lang.String)v0));
    Object v2 = new com.google.gson.Gson();
    Object v3 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v2));
    Object v4 = new com.google.gson.internal.bind.JsonTreeWriter();
    Object v5 = null;
    Object v6 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v5));
    ((com.google.gson.TypeAdapter)v3).write(((com.google.gson.stream.JsonWriter)v4),((java.lang.Object)v6));
    Object v7 = null;
    Object v8 = com.google.gson.internal.bind.TypeAdapters.newFactory(((java.lang.Class)v1),((com.google.gson.TypeAdapter)v3));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = java.lang.Class.forName(((java.lang.String)v0));
    Object v2 = ((java.lang.Class)v1).getNestHost();
    Object v3 = "sun.misc.Unsafe";
    Object v4 = java.lang.Class.forName(((java.lang.String)v3));
    Object v5 = new com.google.gson.Gson();
    Object v6 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v5));
    Object v7 = com.google.gson.internal.bind.TypeAdapters.newFactory(((java.lang.Class)v1),((java.lang.Class)v4),((com.google.gson.TypeAdapter)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = java.lang.Class.forName(((java.lang.String)v0));
    Object v2 = new com.google.gson.Gson();
    Object v3 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v2));
    Object v4 = ((com.google.gson.TypeAdapter)v3).nullSafe();
    Object v5 = com.google.gson.internal.bind.TypeAdapters.newTypeHierarchyFactory(((java.lang.Class)v1),((com.google.gson.TypeAdapter)v3));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = java.lang.Class.forName(((java.lang.String)v0));
    Object v2 = new com.google.gson.Gson();
    Object v3 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v2));
    Object v4 = com.google.gson.internal.bind.TypeAdapters.newFactory(((java.lang.Class)v1),((com.google.gson.TypeAdapter)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = java.lang.Class.forName(((java.lang.String)v0));
    Object v2 = new com.google.gson.Gson();
    Object v3 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v2));
    Object v4 = ((com.google.gson.TypeAdapter)v3).nullSafe();
    Object v5 = com.google.gson.internal.bind.TypeAdapters.newFactory(((java.lang.Class)v1),((com.google.gson.TypeAdapter)v3));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = java.lang.Class.forName(((java.lang.String)v0));
    Object v2 = new com.google.gson.Gson();
    Object v3 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v2));
    Object v4 = "false";
    Object v5 = ((com.google.gson.TypeAdapter)v3).fromJson(((java.lang.String)v4));
    Object v6 = com.google.gson.internal.bind.TypeAdapters.newFactory(((java.lang.Class)v1),((com.google.gson.TypeAdapter)v3));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = java.lang.Class.forName(((java.lang.String)v0));
    Object v2 = ((java.lang.Class)v1).getDeclaredMethods();
    Object v3 = "sun.misc.Unsafe";
    Object v4 = java.lang.Class.forName(((java.lang.String)v3));
    Object v5 = ((java.lang.Class)v4).getAnnotatedSuperclass();
    Object v6 = new com.google.gson.Gson();
    Object v7 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v6));
    Object v8 = com.google.gson.internal.bind.TypeAdapters.newFactory(((java.lang.Class)v1),((java.lang.Class)v4),((com.google.gson.TypeAdapter)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = java.lang.Class.forName(((java.lang.String)v0));
    Object v2 = new com.google.gson.Gson();
    Object v3 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v2));
    Object v4 = com.google.gson.internal.bind.TypeAdapters.newTypeHierarchyFactory(((java.lang.Class)v1),((com.google.gson.TypeAdapter)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = java.lang.Class.forName(((java.lang.String)v0));
    Object v2 = com.google.gson.reflect.TypeToken.get(((java.lang.Class)v1));
    Object v3 = "sun.misc.Unsafe";
    Object v4 = java.lang.Class.forName(((java.lang.String)v3));
    Object v5 = new com.google.gson.Gson();
    Object v6 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v5));
    Object v7 = "false";
    Object v8 = ((com.google.gson.TypeAdapter)v6).fromJson(((java.lang.String)v7));
    Object v9 = com.google.gson.internal.bind.TypeAdapters.newFactory(((java.lang.Class)v4),((com.google.gson.TypeAdapter)v6));
    Object v10 = ((com.google.gson.reflect.TypeToken)v2).equals(((java.lang.Object)v9));
    Object v11 = new com.google.gson.Gson();
    Object v12 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v11));
    Object v13 = com.google.gson.internal.bind.TypeAdapters.newFactory(((com.google.gson.reflect.TypeToken)v2),((com.google.gson.TypeAdapter)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = java.lang.Class.forName(((java.lang.String)v0));
    Object v2 = "sun.misc.Unsafe";
    Object v3 = java.lang.Class.forName(((java.lang.String)v2));
    Object v4 = "sun.misc.Unsafe";
    Object v5 = java.lang.Class.forName(((java.lang.String)v4));
    Object v6 = ((java.lang.Class)v3).getAnnotation(((java.lang.Class)v5));
    Object v7 = new com.google.gson.Gson();
    Object v8 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v7));
    Object v9 = "null";
    Object v10 = ((com.google.gson.TypeAdapter)v8).fromJson(((java.lang.String)v9));
    Object v11 = com.google.gson.internal.bind.TypeAdapters.newFactoryForMultipleTypes(((java.lang.Class)v1),((java.lang.Class)v3),((com.google.gson.TypeAdapter)v8));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = java.lang.Class.forName(((java.lang.String)v0));
    Object v2 = com.google.gson.reflect.TypeToken.get(((java.lang.Class)v1));
    Object v3 = new com.google.gson.Gson();
    Object v4 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v3));
    Object v5 = ((com.google.gson.TypeAdapter)v4).nullSafe();
    Object v6 = com.google.gson.internal.bind.TypeAdapters.newFactory(((com.google.gson.reflect.TypeToken)v2),((com.google.gson.TypeAdapter)v4));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = java.lang.Class.forName(((java.lang.String)v0));
    Object v2 = com.google.gson.reflect.TypeToken.get(((java.lang.Class)v1));
    Object v3 = new com.google.gson.Gson();
    Object v4 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v3));
    Object v5 = com.google.gson.internal.bind.TypeAdapters.newFactory(((com.google.gson.reflect.TypeToken)v2),((com.google.gson.TypeAdapter)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = java.lang.Class.forName(((java.lang.String)v0));
    Object v2 = ((java.lang.Class)v1).getComponentType();
    Object v3 = "sun.misc.Unsafe";
    Object v4 = java.lang.Class.forName(((java.lang.String)v3));
    Object v5 = new com.google.gson.Gson();
    Object v6 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v5));
    Object v7 = com.google.gson.internal.bind.TypeAdapters.newFactory(((java.lang.Class)v1),((java.lang.Class)v4),((com.google.gson.TypeAdapter)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = java.lang.Class.forName(((java.lang.String)v0));
    Object v2 = "sun.misc.Unsafe";
    Object v3 = java.lang.Class.forName(((java.lang.String)v2));
    Object v4 = new com.google.gson.Gson();
    Object v5 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v4));
    Object v6 = java.io.Reader.nullReader();
    Object v7 = new com.google.gson.stream.JsonReader(((java.io.Reader)v6));
    Object v8 = com.google.gson.internal.Streams.parse(((com.google.gson.stream.JsonReader)v7));
    Object v9 = ((com.google.gson.TypeAdapter)v5).fromJsonTree(((com.google.gson.JsonElement)v8));
    Object v10 = com.google.gson.internal.bind.TypeAdapters.newFactoryForMultipleTypes(((java.lang.Class)v1),((java.lang.Class)v3),((com.google.gson.TypeAdapter)v5));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = java.lang.Class.forName(((java.lang.String)v0));
    Object v2 = "sun.misc.Unsafe";
    Object v3 = java.lang.Class.forName(((java.lang.String)v2));
    Object v4 = new com.google.gson.Gson();
    Object v5 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v4));
    Object v6 = com.google.gson.internal.bind.TypeAdapters.newFactoryForMultipleTypes(((java.lang.Class)v1),((java.lang.Class)v3),((com.google.gson.TypeAdapter)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = java.lang.Class.forName(((java.lang.String)v0));
    Object v2 = "sun.misc.Unsafe";
    Object v3 = java.lang.Class.forName(((java.lang.String)v2));
    Object v4 = new com.google.gson.Gson();
    Object v5 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v4));
    Object v6 = ((com.google.gson.TypeAdapter)v5).nullSafe();
    Object v7 = com.google.gson.internal.bind.TypeAdapters.newFactoryForMultipleTypes(((java.lang.Class)v1),((java.lang.Class)v3),((com.google.gson.TypeAdapter)v5));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = java.lang.Class.forName(((java.lang.String)v0));
    Object v2 = com.google.gson.reflect.TypeToken.get(((java.lang.Class)v1));
    Object v3 = ((com.google.gson.reflect.TypeToken)v2).toString();
    Object v4 = new com.google.gson.Gson();
    Object v5 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v4));
    Object v6 = com.google.gson.internal.bind.TypeAdapters.newFactory(((com.google.gson.reflect.TypeToken)v2),((com.google.gson.TypeAdapter)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = java.lang.Class.forName(((java.lang.String)v0));
    Object v2 = "sun.misc.Unsafe";
    Object v3 = java.lang.Class.forName(((java.lang.String)v2));
    Object v4 = ((java.lang.Class)v3).getNestHost();
    Object v5 = new com.google.gson.Gson();
    Object v6 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v5));
    Object v7 = com.google.gson.internal.bind.TypeAdapters.newFactoryForMultipleTypes(((java.lang.Class)v1),((java.lang.Class)v3),((com.google.gson.TypeAdapter)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = java.lang.Class.forName(((java.lang.String)v0));
    Object v2 = ((java.lang.Class)v1).getEnclosingClass();
    Object v3 = new com.google.gson.Gson();
    Object v4 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v3));
    Object v5 = com.google.gson.internal.bind.TypeAdapters.newFactory(((java.lang.Class)v1),((com.google.gson.TypeAdapter)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = java.lang.Class.forName(((java.lang.String)v0));
    Object v2 = "sun.misc.Unsafe";
    Object v3 = java.lang.Class.forName(((java.lang.String)v2));
    Object v4 = new com.google.gson.Gson();
    Object v5 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v4));
    Object v6 = java.io.Reader.nullReader();
    Object v7 = ((com.google.gson.TypeAdapter)v5).toJson(((java.lang.Object)v6));
    Object v8 = com.google.gson.internal.bind.TypeAdapters.newFactory(((java.lang.Class)v1),((java.lang.Class)v3),((com.google.gson.TypeAdapter)v5));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = java.lang.Class.forName(((java.lang.String)v0));
    Object v2 = ((java.lang.Class)v1).getInterfaces();
    Object v3 = "sun.misc.Unsafe";
    Object v4 = java.lang.Class.forName(((java.lang.String)v3));
    Object v5 = new com.google.gson.Gson();
    Object v6 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v5));
    Object v7 = com.google.gson.internal.bind.TypeAdapters.newFactory(((java.lang.Class)v1),((java.lang.Class)v4),((com.google.gson.TypeAdapter)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = java.lang.Class.forName(((java.lang.String)v0));
    Object v2 = ((java.lang.Class)v1).getProtectionDomain();
    Object v3 = "sun.misc.Unsafe";
    Object v4 = java.lang.Class.forName(((java.lang.String)v3));
    Object v5 = new com.google.gson.Gson();
    Object v6 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v5));
    Object v7 = com.google.gson.internal.bind.TypeAdapters.newFactoryForMultipleTypes(((java.lang.Class)v1),((java.lang.Class)v4),((com.google.gson.TypeAdapter)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = java.lang.Class.forName(((java.lang.String)v0));
    Object v2 = ((java.lang.Class)v1).getProtectionDomain();
    Object v3 = new com.google.gson.Gson();
    Object v4 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v3));
    Object v5 = com.google.gson.internal.bind.TypeAdapters.newTypeHierarchyFactory(((java.lang.Class)v1),((com.google.gson.TypeAdapter)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = java.lang.Class.forName(((java.lang.String)v0));
    Object v2 = com.google.gson.reflect.TypeToken.get(((java.lang.Class)v1));
    Object v3 = "sun.misc.Unsafe";
    Object v4 = java.lang.Class.forName(((java.lang.String)v3));
    Object v5 = ((com.google.gson.reflect.TypeToken)v2).isAssignableFrom(((java.lang.Class)v4));
    Object v6 = new com.google.gson.Gson();
    Object v7 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v6));
    Object v8 = com.google.gson.internal.bind.TypeAdapters.newFactory(((com.google.gson.reflect.TypeToken)v2),((com.google.gson.TypeAdapter)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = java.lang.Class.forName(((java.lang.String)v0));
    Object v2 = ((java.lang.Class)v1).getEnumConstants();
    Object v3 = "sun.misc.Unsafe";
    Object v4 = java.lang.Class.forName(((java.lang.String)v3));
    Object v5 = ((java.lang.Class)v4).getSimpleName();
    Object v6 = new com.google.gson.Gson();
    Object v7 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v6));
    Object v8 = com.google.gson.internal.bind.TypeAdapters.newFactoryForMultipleTypes(((java.lang.Class)v1),((java.lang.Class)v4),((com.google.gson.TypeAdapter)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = java.lang.Class.forName(((java.lang.String)v0));
    Object v2 = ((java.lang.Class)v1).getName();
    Object v3 = new com.google.gson.Gson();
    Object v4 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v3));
    Object v5 = com.google.gson.internal.bind.TypeAdapters.newTypeHierarchyFactory(((java.lang.Class)v1),((com.google.gson.TypeAdapter)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = java.lang.Class.forName(((java.lang.String)v0));
    Object v2 = ((java.lang.Class)v1).getGenericSuperclass();
    Object v3 = "sun.misc.Unsafe";
    Object v4 = java.lang.Class.forName(((java.lang.String)v3));
    Object v5 = new com.google.gson.Gson();
    Object v6 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v5));
    Object v7 = com.google.gson.internal.bind.TypeAdapters.newFactoryForMultipleTypes(((java.lang.Class)v1),((java.lang.Class)v4),((com.google.gson.TypeAdapter)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = java.lang.Class.forName(((java.lang.String)v0));
    Object v2 = "sun.misc.Unsafe";
    Object v3 = java.lang.Class.forName(((java.lang.String)v2));
    Object v4 = com.google.gson.reflect.TypeToken.get(((java.lang.Class)v3));
    Object v5 = ((java.lang.Class)v1).isInstance(((java.lang.Object)v4));
    Object v6 = new com.google.gson.Gson();
    Object v7 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v6));
    Object v8 = 0;
    Object v9 = new java.io.StringWriter((((java.lang.Integer)v8).intValue()));
    Object v10 = new com.google.gson.Gson();
    Object v11 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v10));
    ((com.google.gson.TypeAdapter)v7).toJson(((java.io.Writer)v9),((java.lang.Object)v11));
    Object v12 = null;
    Object v13 = com.google.gson.internal.bind.TypeAdapters.newFactory(((java.lang.Class)v1),((com.google.gson.TypeAdapter)v7));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = java.lang.Class.forName(((java.lang.String)v0));
    Object v2 = "sun.misc.Unsafe";
    Object v3 = java.lang.Class.forName(((java.lang.String)v2));
    Object v4 = new com.google.gson.Gson();
    Object v5 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v4));
    Object v6 = new com.google.gson.Gson();
    Object v7 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v6));
    Object v8 = ((com.google.gson.TypeAdapter)v5).toJson(((java.lang.Object)v7));
    Object v9 = com.google.gson.internal.bind.TypeAdapters.newFactory(((java.lang.Class)v1),((java.lang.Class)v3),((com.google.gson.TypeAdapter)v5));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = java.lang.Class.forName(((java.lang.String)v0));
    Object v2 = ((java.lang.Class)v1).getSimpleName();
    Object v3 = new com.google.gson.Gson();
    Object v4 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v3));
    Object v5 = com.google.gson.internal.bind.TypeAdapters.newTypeHierarchyFactory(((java.lang.Class)v1),((com.google.gson.TypeAdapter)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = java.lang.Class.forName(((java.lang.String)v0));
    Object v2 = "sun.misc.Unsafe";
    Object v3 = java.lang.Class.forName(((java.lang.String)v2));
    Object v4 = ((java.lang.Class)v3).isArray();
    Object v5 = new com.google.gson.Gson();
    Object v6 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v5));
    Object v7 = com.google.gson.internal.bind.TypeAdapters.newFactoryForMultipleTypes(((java.lang.Class)v1),((java.lang.Class)v3),((com.google.gson.TypeAdapter)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = java.lang.Class.forName(((java.lang.String)v0));
    Object v2 = ((java.lang.Class)v1).getName();
    Object v3 = "sun.misc.Unsafe";
    Object v4 = java.lang.Class.forName(((java.lang.String)v3));
    Object v5 = new com.google.gson.Gson();
    Object v6 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v5));
    Object v7 = com.google.gson.internal.bind.TypeAdapters.newFactoryForMultipleTypes(((java.lang.Class)v1),((java.lang.Class)v4),((com.google.gson.TypeAdapter)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = java.lang.Class.forName(((java.lang.String)v0));
    Object v2 = "sun.misc.Unsafe";
    Object v3 = java.lang.Class.forName(((java.lang.String)v2));
    Object v4 = new com.google.gson.Gson();
    Object v5 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v4));
    Object v6 = "sun.misc.Unsafe";
    Object v7 = java.lang.Class.forName(((java.lang.String)v6));
    Object v8 = ((java.lang.Class)v7).getInterfaces();
    Object v9 = "sun.misc.Unsafe";
    Object v10 = java.lang.Class.forName(((java.lang.String)v9));
    Object v11 = new com.google.gson.Gson();
    Object v12 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v11));
    Object v13 = com.google.gson.internal.bind.TypeAdapters.newFactory(((java.lang.Class)v7),((java.lang.Class)v10),((com.google.gson.TypeAdapter)v12));
    Object v14 = ((com.google.gson.TypeAdapter)v5).toJsonTree(((java.lang.Object)v13));
    Object v15 = com.google.gson.internal.bind.TypeAdapters.newFactoryForMultipleTypes(((java.lang.Class)v1),((java.lang.Class)v3),((com.google.gson.TypeAdapter)v5));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = java.lang.Class.forName(((java.lang.String)v0));
    Object v2 = "sun.misc.Unsafe";
    Object v3 = java.lang.Class.forName(((java.lang.String)v2));
    Object v4 = ((java.lang.Class)v3).getInterfaces();
    Object v5 = new com.google.gson.Gson();
    Object v6 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v5));
    Object v7 = com.google.gson.internal.bind.TypeAdapters.newFactoryForMultipleTypes(((java.lang.Class)v1),((java.lang.Class)v3),((com.google.gson.TypeAdapter)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = java.lang.Class.forName(((java.lang.String)v0));
    Object v2 = com.google.gson.reflect.TypeToken.get(((java.lang.Class)v1));
    Object v3 = ((com.google.gson.reflect.TypeToken)v2).toString();
    Object v4 = new com.google.gson.Gson();
    Object v5 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v4));
    Object v6 = java.io.Reader.nullReader();
    Object v7 = new com.google.gson.stream.JsonReader(((java.io.Reader)v6));
    Object v8 = com.google.gson.internal.Streams.parse(((com.google.gson.stream.JsonReader)v7));
    Object v9 = ((com.google.gson.TypeAdapter)v5).fromJsonTree(((com.google.gson.JsonElement)v8));
    Object v10 = com.google.gson.internal.bind.TypeAdapters.newFactory(((com.google.gson.reflect.TypeToken)v2),((com.google.gson.TypeAdapter)v5));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = java.lang.Class.forName(((java.lang.String)v0));
    Object v2 = new com.google.gson.Gson();
    Object v3 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v2));
    Object v4 = null;
    Object v5 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v4));
    Object v6 = ((com.google.gson.TypeAdapter)v3).toJsonTree(((java.lang.Object)v5));
    Object v7 = com.google.gson.internal.bind.TypeAdapters.newTypeHierarchyFactory(((java.lang.Class)v1),((com.google.gson.TypeAdapter)v3));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = java.lang.Class.forName(((java.lang.String)v0));
    Object v2 = null;
    Object v3 = new com.google.gson.Gson();
    Object v4 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v3));
    Object v5 = com.google.gson.internal.bind.TypeAdapters.newFactory(((java.lang.Class)v2),((com.google.gson.TypeAdapter)v4));
    Object v6 = ((java.lang.Class)v1).isInstance(((java.lang.Object)v5));
    Object v7 = "sun.misc.Unsafe";
    Object v8 = java.lang.Class.forName(((java.lang.String)v7));
    Object v9 = new com.google.gson.Gson();
    Object v10 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v9));
    Object v11 = com.google.gson.internal.bind.TypeAdapters.newFactoryForMultipleTypes(((java.lang.Class)v1),((java.lang.Class)v8),((com.google.gson.TypeAdapter)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = java.lang.Class.forName(((java.lang.String)v0));
    Object v2 = "sun.misc.Unsafe";
    Object v3 = java.lang.Class.forName(((java.lang.String)v2));
    Object v4 = new com.google.gson.Gson();
    Object v5 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v4));
    Object v6 = new com.google.gson.internal.bind.JsonTreeWriter();
    Object v7 = java.io.Reader.nullReader();
    Object v8 = new com.google.gson.stream.JsonReader(((java.io.Reader)v7));
    Object v9 = com.google.gson.internal.Streams.parse(((com.google.gson.stream.JsonReader)v8));
    ((com.google.gson.TypeAdapter)v5).write(((com.google.gson.stream.JsonWriter)v6),((java.lang.Object)v9));
    Object v10 = null;
    Object v11 = com.google.gson.internal.bind.TypeAdapters.newFactory(((java.lang.Class)v1),((java.lang.Class)v3),((com.google.gson.TypeAdapter)v5));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = java.lang.Class.forName(((java.lang.String)v0));
    Object v2 = ((java.lang.Class)v1).toString();
    Object v3 = "sun.misc.Unsafe";
    Object v4 = java.lang.Class.forName(((java.lang.String)v3));
    Object v5 = new com.google.gson.Gson();
    Object v6 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v5));
    Object v7 = com.google.gson.internal.bind.TypeAdapters.newFactory(((java.lang.Class)v1),((java.lang.Class)v4),((com.google.gson.TypeAdapter)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = java.lang.Class.forName(((java.lang.String)v0));
    Object v2 = ":";
    Object v3 = ((java.lang.Class)v1).getResource(((java.lang.String)v2));
    Object v4 = "sun.misc.Unsafe";
    Object v5 = java.lang.Class.forName(((java.lang.String)v4));
    Object v6 = new com.google.gson.Gson();
    Object v7 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v6));
    Object v8 = new com.google.gson.internal.bind.JsonTreeWriter();
    Object v9 = "sun.misc.Unsafe";
    Object v10 = java.lang.Class.forName(((java.lang.String)v9));
    Object v11 = "sun.misc.Unsafe";
    Object v12 = java.lang.Class.forName(((java.lang.String)v11));
    Object v13 = ((java.lang.Class)v12).isArray();
    Object v14 = new com.google.gson.Gson();
    Object v15 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v14));
    Object v16 = com.google.gson.internal.bind.TypeAdapters.newFactoryForMultipleTypes(((java.lang.Class)v10),((java.lang.Class)v12),((com.google.gson.TypeAdapter)v15));
    ((com.google.gson.TypeAdapter)v7).write(((com.google.gson.stream.JsonWriter)v8),((java.lang.Object)v16));
    Object v17 = null;
    Object v18 = com.google.gson.internal.bind.TypeAdapters.newFactoryForMultipleTypes(((java.lang.Class)v1),((java.lang.Class)v5),((com.google.gson.TypeAdapter)v7));
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = java.lang.Class.forName(((java.lang.String)v0));
    Object v2 = ((java.lang.Class)v1).getPackageName();
    Object v3 = new com.google.gson.Gson();
    Object v4 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v3));
    Object v5 = ((com.google.gson.TypeAdapter)v4).nullSafe();
    Object v6 = com.google.gson.internal.bind.TypeAdapters.newFactory(((java.lang.Class)v1),((com.google.gson.TypeAdapter)v4));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = java.lang.Class.forName(((java.lang.String)v0));
    Object v2 = new com.google.gson.Gson();
    Object v3 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v2));
    Object v4 = 0;
    Object v5 = new java.io.StringWriter((((java.lang.Integer)v4).intValue()));
    Object v6 = 0;
    Object v7 = new java.io.StringWriter((((java.lang.Integer)v6).intValue()));
    ((com.google.gson.TypeAdapter)v3).toJson(((java.io.Writer)v5),((java.lang.Object)v7));
    Object v8 = null;
    Object v9 = com.google.gson.internal.bind.TypeAdapters.newTypeHierarchyFactory(((java.lang.Class)v1),((com.google.gson.TypeAdapter)v3));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = java.lang.Class.forName(((java.lang.String)v0));
    Object v2 = "sun.misc.Unsafe";
    Object v3 = java.lang.Class.forName(((java.lang.String)v2));
    Object v4 = ((java.lang.Class)v3).getComponentType();
    Object v5 = new com.google.gson.Gson();
    Object v6 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v5));
    Object v7 = com.google.gson.internal.bind.TypeAdapters.newFactoryForMultipleTypes(((java.lang.Class)v1),((java.lang.Class)v3),((com.google.gson.TypeAdapter)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = java.lang.Class.forName(((java.lang.String)v0));
    Object v2 = com.google.gson.reflect.TypeToken.get(((java.lang.Class)v1));
    Object v3 = "sun.misc.Unsafe";
    Object v4 = java.lang.Class.forName(((java.lang.String)v3));
    Object v5 = ((java.lang.Class)v4).getProtectionDomain();
    Object v6 = "sun.misc.Unsafe";
    Object v7 = java.lang.Class.forName(((java.lang.String)v6));
    Object v8 = new com.google.gson.Gson();
    Object v9 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v8));
    Object v10 = com.google.gson.internal.bind.TypeAdapters.newFactoryForMultipleTypes(((java.lang.Class)v4),((java.lang.Class)v7),((com.google.gson.TypeAdapter)v9));
    Object v11 = ((com.google.gson.reflect.TypeToken)v2).equals(((java.lang.Object)v10));
    Object v12 = new com.google.gson.Gson();
    Object v13 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v12));
    Object v14 = com.google.gson.internal.bind.TypeAdapters.newFactory(((com.google.gson.reflect.TypeToken)v2),((com.google.gson.TypeAdapter)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = java.lang.Class.forName(((java.lang.String)v0));
    Object v2 = new com.google.gson.Gson();
    Object v3 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v2));
    Object v4 = 0;
    Object v5 = new java.io.StringWriter((((java.lang.Integer)v4).intValue()));
    Object v6 = "sun.misc.Unsafe";
    Object v7 = java.lang.Class.forName(((java.lang.String)v6));
    Object v8 = ((java.lang.Class)v7).getSimpleName();
    Object v9 = new com.google.gson.Gson();
    Object v10 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v9));
    Object v11 = com.google.gson.internal.bind.TypeAdapters.newTypeHierarchyFactory(((java.lang.Class)v7),((com.google.gson.TypeAdapter)v10));
    ((com.google.gson.TypeAdapter)v3).toJson(((java.io.Writer)v5),((java.lang.Object)v11));
    Object v12 = null;
    Object v13 = com.google.gson.internal.bind.TypeAdapters.newFactory(((java.lang.Class)v1),((com.google.gson.TypeAdapter)v3));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = java.lang.Class.forName(((java.lang.String)v0));
    Object v2 = "sun.misc.Unsafe";
    Object v3 = java.lang.Class.forName(((java.lang.String)v2));
    Object v4 = new com.google.gson.Gson();
    Object v5 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v4));
    Object v6 = 0;
    Object v7 = new java.io.StringWriter((((java.lang.Integer)v6).intValue()));
    Object v8 = "sun.misc.Unsafe";
    Object v9 = java.lang.Class.forName(((java.lang.String)v8));
    Object v10 = "sun.misc.Unsafe";
    Object v11 = java.lang.Class.forName(((java.lang.String)v10));
    Object v12 = new com.google.gson.Gson();
    Object v13 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v12));
    Object v14 = com.google.gson.internal.bind.TypeAdapters.newFactoryForMultipleTypes(((java.lang.Class)v9),((java.lang.Class)v11),((com.google.gson.TypeAdapter)v13));
    ((com.google.gson.TypeAdapter)v5).toJson(((java.io.Writer)v7),((java.lang.Object)v14));
    Object v15 = null;
    Object v16 = com.google.gson.internal.bind.TypeAdapters.newFactoryForMultipleTypes(((java.lang.Class)v1),((java.lang.Class)v3),((com.google.gson.TypeAdapter)v5));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = java.lang.Class.forName(((java.lang.String)v0));
    Object v2 = ((java.lang.Class)v1).getTypeParameters();
    Object v3 = new com.google.gson.Gson();
    Object v4 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v3));
    Object v5 = com.google.gson.internal.bind.TypeAdapters.newFactory(((java.lang.Class)v1),((com.google.gson.TypeAdapter)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = java.lang.Class.forName(((java.lang.String)v0));
    Object v2 = com.google.gson.reflect.TypeToken.get(((java.lang.Class)v1));
    Object v3 = ((com.google.gson.reflect.TypeToken)v2).toString();
    Object v4 = new com.google.gson.Gson();
    Object v5 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v4));
    Object v6 = ((com.google.gson.TypeAdapter)v5).nullSafe();
    Object v7 = com.google.gson.internal.bind.TypeAdapters.newFactory(((com.google.gson.reflect.TypeToken)v2),((com.google.gson.TypeAdapter)v5));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = java.lang.Class.forName(((java.lang.String)v0));
    Object v2 = "sun.misc.Unsafe";
    Object v3 = java.lang.Class.forName(((java.lang.String)v2));
    Object v4 = new com.google.gson.Gson();
    Object v5 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v4));
    Object v6 = java.io.Reader.nullReader();
    Object v7 = new com.google.gson.stream.JsonReader(((java.io.Reader)v6));
    Object v8 = com.google.gson.internal.Streams.parse(((com.google.gson.stream.JsonReader)v7));
    Object v9 = ((com.google.gson.TypeAdapter)v5).fromJsonTree(((com.google.gson.JsonElement)v8));
    Object v10 = com.google.gson.internal.bind.TypeAdapters.newFactory(((java.lang.Class)v1),((java.lang.Class)v3),((com.google.gson.TypeAdapter)v5));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = java.lang.Class.forName(((java.lang.String)v0));
    Object v2 = ((java.lang.Class)v1).getClasses();
    Object v3 = "sun.misc.Unsafe";
    Object v4 = java.lang.Class.forName(((java.lang.String)v3));
    Object v5 = ((java.lang.Class)v4).getProtectionDomain();
    Object v6 = new com.google.gson.Gson();
    Object v7 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v6));
    Object v8 = com.google.gson.internal.bind.TypeAdapters.newFactoryForMultipleTypes(((java.lang.Class)v1),((java.lang.Class)v4),((com.google.gson.TypeAdapter)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = java.lang.Class.forName(((java.lang.String)v0));
    Object v2 = com.google.gson.reflect.TypeToken.get(((java.lang.Class)v1));
    Object v3 = new com.google.gson.Gson();
    Object v4 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v3));
    Object v5 = java.io.Reader.nullReader();
    Object v6 = ((com.google.gson.TypeAdapter)v4).toJsonTree(((java.lang.Object)v5));
    Object v7 = com.google.gson.internal.bind.TypeAdapters.newFactory(((com.google.gson.reflect.TypeToken)v2),((com.google.gson.TypeAdapter)v4));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = java.lang.Class.forName(((java.lang.String)v0));
    Object v2 = com.google.gson.reflect.TypeToken.get(((java.lang.Class)v1));
    Object v3 = new com.google.gson.Gson();
    Object v4 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v3));
    Object v5 = java.io.Reader.nullReader();
    Object v6 = new com.google.gson.stream.JsonReader(((java.io.Reader)v5));
    Object v7 = com.google.gson.internal.Streams.parse(((com.google.gson.stream.JsonReader)v6));
    Object v8 = ((com.google.gson.TypeAdapter)v4).fromJsonTree(((com.google.gson.JsonElement)v7));
    Object v9 = com.google.gson.internal.bind.TypeAdapters.newFactory(((com.google.gson.reflect.TypeToken)v2),((com.google.gson.TypeAdapter)v4));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = java.lang.Class.forName(((java.lang.String)v0));
    Object v2 = "sun.misc.Unsafe";
    Object v3 = java.lang.Class.forName(((java.lang.String)v2));
    Object v4 = ((java.lang.Class)v1).isAnnotationPresent(((java.lang.Class)v3));
    Object v5 = "sun.misc.Unsafe";
    Object v6 = java.lang.Class.forName(((java.lang.String)v5));
    Object v7 = ((java.lang.Class)v6).getSigners();
    Object v8 = new com.google.gson.Gson();
    Object v9 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v8));
    Object v10 = ((com.google.gson.TypeAdapter)v9).nullSafe();
    Object v11 = com.google.gson.internal.bind.TypeAdapters.newFactoryForMultipleTypes(((java.lang.Class)v1),((java.lang.Class)v6),((com.google.gson.TypeAdapter)v9));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = java.lang.Class.forName(((java.lang.String)v0));
    Object v2 = "sun.misc.Unsafe";
    Object v3 = java.lang.Class.forName(((java.lang.String)v2));
    Object v4 = new com.google.gson.Gson();
    Object v5 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v4));
    Object v6 = "sun.misc.Unsafe";
    Object v7 = java.lang.Class.forName(((java.lang.String)v6));
    Object v8 = com.google.gson.reflect.TypeToken.get(((java.lang.Class)v7));
    Object v9 = "sun.misc.Unsafe";
    Object v10 = java.lang.Class.forName(((java.lang.String)v9));
    Object v11 = ((com.google.gson.reflect.TypeToken)v8).isAssignableFrom(((java.lang.Class)v10));
    Object v12 = new com.google.gson.Gson();
    Object v13 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v12));
    Object v14 = com.google.gson.internal.bind.TypeAdapters.newFactory(((com.google.gson.reflect.TypeToken)v8),((com.google.gson.TypeAdapter)v13));
    Object v15 = ((com.google.gson.TypeAdapter)v5).toJsonTree(((java.lang.Object)v14));
    Object v16 = com.google.gson.internal.bind.TypeAdapters.newFactoryForMultipleTypes(((java.lang.Class)v1),((java.lang.Class)v3),((com.google.gson.TypeAdapter)v5));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = java.lang.Class.forName(((java.lang.String)v0));
    Object v2 = "sun.misc.Unsafe";
    Object v3 = java.lang.Class.forName(((java.lang.String)v2));
    Object v4 = "sun.misc.Unsafe";
    Object v5 = java.lang.Class.forName(((java.lang.String)v4));
    Object v6 = ((java.lang.Class)v3).isAssignableFrom(((java.lang.Class)v5));
    Object v7 = new com.google.gson.Gson();
    Object v8 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v7));
    Object v9 = com.google.gson.internal.bind.TypeAdapters.newFactoryForMultipleTypes(((java.lang.Class)v1),((java.lang.Class)v3),((com.google.gson.TypeAdapter)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = java.lang.Class.forName(((java.lang.String)v0));
    Object v2 = ((java.lang.Class)v1).getComponentType();
    Object v3 = "sun.misc.Unsafe";
    Object v4 = java.lang.Class.forName(((java.lang.String)v3));
    Object v5 = new com.google.gson.Gson();
    Object v6 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v5));
    Object v7 = com.google.gson.internal.bind.TypeAdapters.newFactoryForMultipleTypes(((java.lang.Class)v1),((java.lang.Class)v4),((com.google.gson.TypeAdapter)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = java.lang.Class.forName(((java.lang.String)v0));
    Object v2 = new com.google.gson.Gson();
    Object v3 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v2));
    Object v4 = "null";
    Object v5 = ((com.google.gson.TypeAdapter)v3).fromJson(((java.lang.String)v4));
    Object v6 = com.google.gson.internal.bind.TypeAdapters.newFactory(((java.lang.Class)v1),((com.google.gson.TypeAdapter)v3));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = java.lang.Class.forName(((java.lang.String)v0));
    Object v2 = ((java.lang.Class)v1).toString();
    Object v3 = "sun.misc.Unsafe";
    Object v4 = java.lang.Class.forName(((java.lang.String)v3));
    Object v5 = ((java.lang.Class)v4).getAnnotatedSuperclass();
    Object v6 = new com.google.gson.Gson();
    Object v7 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v6));
    Object v8 = com.google.gson.internal.bind.TypeAdapters.newFactory(((java.lang.Class)v1),((java.lang.Class)v4),((com.google.gson.TypeAdapter)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = java.lang.Class.forName(((java.lang.String)v0));
    Object v2 = "sun.misc.Unsafe";
    Object v3 = java.lang.Class.forName(((java.lang.String)v2));
    Object v4 = ((java.lang.Class)v3).getPackage();
    Object v5 = new com.google.gson.Gson();
    Object v6 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v5));
    Object v7 = java.io.Reader.nullReader();
    Object v8 = new com.google.gson.stream.JsonReader(((java.io.Reader)v7));
    Object v9 = com.google.gson.internal.Streams.parse(((com.google.gson.stream.JsonReader)v8));
    Object v10 = ((com.google.gson.TypeAdapter)v6).fromJsonTree(((com.google.gson.JsonElement)v9));
    Object v11 = com.google.gson.internal.bind.TypeAdapters.newFactory(((java.lang.Class)v1),((java.lang.Class)v3),((com.google.gson.TypeAdapter)v6));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = java.lang.Class.forName(((java.lang.String)v0));
    Object v2 = "sun.misc.Unsafe";
    Object v3 = java.lang.Class.forName(((java.lang.String)v2));
    Object v4 = new com.google.gson.Gson();
    Object v5 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v4));
    Object v6 = new com.google.gson.internal.bind.JsonTreeWriter();
    Object v7 = 0;
    Object v8 = new java.io.StringWriter((((java.lang.Integer)v7).intValue()));
    ((com.google.gson.TypeAdapter)v5).write(((com.google.gson.stream.JsonWriter)v6),((java.lang.Object)v8));
    Object v9 = null;
    Object v10 = com.google.gson.internal.bind.TypeAdapters.newFactory(((java.lang.Class)v1),((java.lang.Class)v3),((com.google.gson.TypeAdapter)v5));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = java.lang.Class.forName(((java.lang.String)v0));
    Object v2 = com.google.gson.reflect.TypeToken.get(((java.lang.Class)v1));
    Object v3 = "sun.misc.Unsafe";
    Object v4 = java.lang.Class.forName(((java.lang.String)v3));
    Object v5 = ((com.google.gson.reflect.TypeToken)v2).isAssignableFrom(((java.lang.reflect.Type)v4));
    Object v6 = new com.google.gson.Gson();
    Object v7 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v6));
    Object v8 = com.google.gson.internal.bind.TypeAdapters.newFactory(((com.google.gson.reflect.TypeToken)v2),((com.google.gson.TypeAdapter)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = java.lang.Class.forName(((java.lang.String)v0));
    Object v2 = "sun.misc.Unsafe";
    Object v3 = java.lang.Class.forName(((java.lang.String)v2));
    Object v4 = ((java.lang.Class)v3).isLocalClass();
    Object v5 = new com.google.gson.Gson();
    Object v6 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v5));
    Object v7 = com.google.gson.internal.bind.TypeAdapters.newFactory(((java.lang.Class)v1),((java.lang.Class)v3),((com.google.gson.TypeAdapter)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = java.lang.Class.forName(((java.lang.String)v0));
    Object v2 = com.google.gson.reflect.TypeToken.get(((java.lang.Class)v1));
    Object v3 = new com.google.gson.Gson();
    Object v4 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v3));
    Object v5 = 0;
    Object v6 = new java.io.StringWriter((((java.lang.Integer)v5).intValue()));
    Object v7 = "sun.misc.Unsafe";
    Object v8 = java.lang.Class.forName(((java.lang.String)v7));
    Object v9 = ((java.lang.Class)v8).getNestHost();
    Object v10 = "sun.misc.Unsafe";
    Object v11 = java.lang.Class.forName(((java.lang.String)v10));
    Object v12 = new com.google.gson.Gson();
    Object v13 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v12));
    Object v14 = com.google.gson.internal.bind.TypeAdapters.newFactory(((java.lang.Class)v8),((java.lang.Class)v11),((com.google.gson.TypeAdapter)v13));
    ((com.google.gson.TypeAdapter)v4).toJson(((java.io.Writer)v6),((java.lang.Object)v14));
    Object v15 = null;
    Object v16 = com.google.gson.internal.bind.TypeAdapters.newFactory(((com.google.gson.reflect.TypeToken)v2),((com.google.gson.TypeAdapter)v4));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = java.lang.Class.forName(((java.lang.String)v0));
    Object v2 = "sun.misc.Unsafe";
    Object v3 = java.lang.Class.forName(((java.lang.String)v2));
    Object v4 = new com.google.gson.Gson();
    Object v5 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v4));
    Object v6 = new com.google.gson.internal.bind.JsonTreeWriter();
    Object v7 = "sun.misc.Unsafe";
    Object v8 = java.lang.Class.forName(((java.lang.String)v7));
    Object v9 = "sun.misc.Unsafe";
    Object v10 = java.lang.Class.forName(((java.lang.String)v9));
    Object v11 = ((java.lang.Class)v10).getComponentType();
    Object v12 = new com.google.gson.Gson();
    Object v13 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v12));
    Object v14 = com.google.gson.internal.bind.TypeAdapters.newFactoryForMultipleTypes(((java.lang.Class)v8),((java.lang.Class)v10),((com.google.gson.TypeAdapter)v13));
    ((com.google.gson.TypeAdapter)v5).write(((com.google.gson.stream.JsonWriter)v6),((java.lang.Object)v14));
    Object v15 = null;
    Object v16 = com.google.gson.internal.bind.TypeAdapters.newFactory(((java.lang.Class)v1),((java.lang.Class)v3),((com.google.gson.TypeAdapter)v5));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = java.lang.Class.forName(((java.lang.String)v0));
    Object v2 = "sun.misc.Unsafe";
    Object v3 = java.lang.Class.forName(((java.lang.String)v2));
    Object v4 = new com.google.gson.Gson();
    Object v5 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v4));
    Object v6 = 0;
    Object v7 = new java.io.StringWriter((((java.lang.Integer)v6).intValue()));
    Object v8 = "sun.misc.Unsafe";
    Object v9 = java.lang.Class.forName(((java.lang.String)v8));
    Object v10 = ((java.lang.Class)v9).getTypeParameters();
    Object v11 = new com.google.gson.Gson();
    Object v12 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v11));
    Object v13 = com.google.gson.internal.bind.TypeAdapters.newFactory(((java.lang.Class)v9),((com.google.gson.TypeAdapter)v12));
    ((com.google.gson.TypeAdapter)v5).toJson(((java.io.Writer)v7),((java.lang.Object)v13));
    Object v14 = null;
    Object v15 = com.google.gson.internal.bind.TypeAdapters.newFactory(((java.lang.Class)v1),((java.lang.Class)v3),((com.google.gson.TypeAdapter)v5));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = java.lang.Class.forName(((java.lang.String)v0));
    Object v2 = "sun.misc.Unsafe";
    Object v3 = java.lang.Class.forName(((java.lang.String)v2));
    Object v4 = new com.google.gson.Gson();
    Object v5 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v4));
    Object v6 = 0;
    Object v7 = new java.io.StringWriter((((java.lang.Integer)v6).intValue()));
    Object v8 = "sun.misc.Unsafe";
    Object v9 = java.lang.Class.forName(((java.lang.String)v8));
    Object v10 = new com.google.gson.Gson();
    Object v11 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v10));
    Object v12 = com.google.gson.internal.bind.TypeAdapters.newTypeHierarchyFactory(((java.lang.Class)v9),((com.google.gson.TypeAdapter)v11));
    ((com.google.gson.TypeAdapter)v5).toJson(((java.io.Writer)v7),((java.lang.Object)v12));
    Object v13 = null;
    Object v14 = com.google.gson.internal.bind.TypeAdapters.newFactoryForMultipleTypes(((java.lang.Class)v1),((java.lang.Class)v3),((com.google.gson.TypeAdapter)v5));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = java.lang.Class.forName(((java.lang.String)v0));
    Object v2 = com.google.gson.reflect.TypeToken.get(((java.lang.Class)v1));
    Object v3 = "sun.misc.Unsafe";
    Object v4 = java.lang.Class.forName(((java.lang.String)v3));
    Object v5 = ((com.google.gson.reflect.TypeToken)v2).equals(((java.lang.Object)v4));
    Object v6 = new com.google.gson.Gson();
    Object v7 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v6));
    Object v8 = ((com.google.gson.TypeAdapter)v7).nullSafe();
    Object v9 = com.google.gson.internal.bind.TypeAdapters.newFactory(((com.google.gson.reflect.TypeToken)v2),((com.google.gson.TypeAdapter)v7));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = java.lang.Class.forName(((java.lang.String)v0));
    Object v2 = ((java.lang.Class)v1).getCanonicalName();
    Object v3 = "sun.misc.Unsafe";
    Object v4 = java.lang.Class.forName(((java.lang.String)v3));
    Object v5 = new com.google.gson.Gson();
    Object v6 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v5));
    Object v7 = java.io.Reader.nullReader();
    Object v8 = new com.google.gson.stream.JsonReader(((java.io.Reader)v7));
    Object v9 = com.google.gson.internal.Streams.parse(((com.google.gson.stream.JsonReader)v8));
    Object v10 = ((com.google.gson.TypeAdapter)v6).fromJsonTree(((com.google.gson.JsonElement)v9));
    Object v11 = com.google.gson.internal.bind.TypeAdapters.newFactory(((java.lang.Class)v1),((java.lang.Class)v4),((com.google.gson.TypeAdapter)v6));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = java.lang.Class.forName(((java.lang.String)v0));
    Object v2 = ((java.lang.Class)v1).getModifiers();
    Object v3 = "sun.misc.Unsafe";
    Object v4 = java.lang.Class.forName(((java.lang.String)v3));
    Object v5 = new com.google.gson.Gson();
    Object v6 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v5));
    Object v7 = com.google.gson.internal.bind.TypeAdapters.newFactoryForMultipleTypes(((java.lang.Class)v1),((java.lang.Class)v4),((com.google.gson.TypeAdapter)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = java.lang.Class.forName(((java.lang.String)v0));
    Object v2 = ((java.lang.Class)v1).getMethods();
    Object v3 = "sun.misc.Unsafe";
    Object v4 = java.lang.Class.forName(((java.lang.String)v3));
    Object v5 = new com.google.gson.Gson();
    Object v6 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v5));
    Object v7 = com.google.gson.internal.bind.TypeAdapters.newFactoryForMultipleTypes(((java.lang.Class)v1),((java.lang.Class)v4),((com.google.gson.TypeAdapter)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = java.lang.Class.forName(((java.lang.String)v0));
    Object v2 = new com.google.gson.Gson();
    Object v3 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v2));
    Object v4 = java.io.Reader.nullReader();
    Object v5 = new com.google.gson.stream.JsonReader(((java.io.Reader)v4));
    Object v6 = com.google.gson.internal.Streams.parse(((com.google.gson.stream.JsonReader)v5));
    Object v7 = ((com.google.gson.TypeAdapter)v3).fromJsonTree(((com.google.gson.JsonElement)v6));
    Object v8 = com.google.gson.internal.bind.TypeAdapters.newFactory(((java.lang.Class)v1),((com.google.gson.TypeAdapter)v3));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = java.lang.Class.forName(((java.lang.String)v0));
    Object v2 = ((java.lang.Class)v1).isPrimitive();
    Object v3 = new com.google.gson.Gson();
    Object v4 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v3));
    Object v5 = new com.google.gson.internal.bind.JsonTreeWriter();
    Object v6 = "sun.misc.Unsafe";
    Object v7 = java.lang.Class.forName(((java.lang.String)v6));
    Object v8 = ((java.lang.Class)v7).getModifiers();
    Object v9 = "sun.misc.Unsafe";
    Object v10 = java.lang.Class.forName(((java.lang.String)v9));
    Object v11 = new com.google.gson.Gson();
    Object v12 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v11));
    Object v13 = com.google.gson.internal.bind.TypeAdapters.newFactoryForMultipleTypes(((java.lang.Class)v7),((java.lang.Class)v10),((com.google.gson.TypeAdapter)v12));
    ((com.google.gson.TypeAdapter)v4).write(((com.google.gson.stream.JsonWriter)v5),((java.lang.Object)v13));
    Object v14 = null;
    Object v15 = com.google.gson.internal.bind.TypeAdapters.newFactory(((java.lang.Class)v1),((com.google.gson.TypeAdapter)v4));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = java.lang.Class.forName(((java.lang.String)v0));
    Object v2 = com.google.gson.reflect.TypeToken.get(((java.lang.Class)v1));
    Object v3 = java.io.Reader.nullReader();
    Object v4 = ((com.google.gson.reflect.TypeToken)v2).equals(((java.lang.Object)v3));
    Object v5 = new com.google.gson.Gson();
    Object v6 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v5));
    Object v7 = com.google.gson.internal.bind.TypeAdapters.newFactory(((com.google.gson.reflect.TypeToken)v2),((com.google.gson.TypeAdapter)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = java.lang.Class.forName(((java.lang.String)v0));
    Object v2 = com.google.gson.reflect.TypeToken.get(((java.lang.Class)v1));
    Object v3 = new com.google.gson.Gson();
    Object v4 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v3));
    Object v5 = new com.google.gson.internal.bind.JsonTreeWriter();
    Object v6 = 0;
    Object v7 = new java.io.StringWriter((((java.lang.Integer)v6).intValue()));
    ((com.google.gson.TypeAdapter)v4).write(((com.google.gson.stream.JsonWriter)v5),((java.lang.Object)v7));
    Object v8 = null;
    Object v9 = com.google.gson.internal.bind.TypeAdapters.newFactory(((com.google.gson.reflect.TypeToken)v2),((com.google.gson.TypeAdapter)v4));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = java.lang.Class.forName(((java.lang.String)v0));
    Object v2 = "sun.misc.Unsafe";
    Object v3 = java.lang.Class.forName(((java.lang.String)v2));
    Object v4 = new com.google.gson.Gson();
    Object v5 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v4));
    Object v6 = "sun.misc.Unsafe";
    Object v7 = java.lang.Class.forName(((java.lang.String)v6));
    Object v8 = "sun.misc.Unsafe";
    Object v9 = java.lang.Class.forName(((java.lang.String)v8));
    Object v10 = new com.google.gson.Gson();
    Object v11 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v10));
    Object v12 = 0;
    Object v13 = new java.io.StringWriter((((java.lang.Integer)v12).intValue()));
    Object v14 = "sun.misc.Unsafe";
    Object v15 = java.lang.Class.forName(((java.lang.String)v14));
    Object v16 = new com.google.gson.Gson();
    Object v17 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v16));
    Object v18 = com.google.gson.internal.bind.TypeAdapters.newTypeHierarchyFactory(((java.lang.Class)v15),((com.google.gson.TypeAdapter)v17));
    ((com.google.gson.TypeAdapter)v11).toJson(((java.io.Writer)v13),((java.lang.Object)v18));
    Object v19 = null;
    Object v20 = com.google.gson.internal.bind.TypeAdapters.newFactoryForMultipleTypes(((java.lang.Class)v7),((java.lang.Class)v9),((com.google.gson.TypeAdapter)v11));
    Object v21 = ((com.google.gson.TypeAdapter)v5).toJsonTree(((java.lang.Object)v20));
    Object v22 = com.google.gson.internal.bind.TypeAdapters.newFactory(((java.lang.Class)v1),((java.lang.Class)v3),((com.google.gson.TypeAdapter)v5));
    org.junit.Assert.assertNotNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = java.lang.Class.forName(((java.lang.String)v0));
    Object v2 = "sun.misc.Unsafe";
    Object v3 = java.lang.Class.forName(((java.lang.String)v2));
    Object v4 = ((java.lang.Class)v3).getSimpleName();
    Object v5 = new com.google.gson.Gson();
    Object v6 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v5));
    Object v7 = com.google.gson.internal.bind.TypeAdapters.newFactoryForMultipleTypes(((java.lang.Class)v1),((java.lang.Class)v3),((com.google.gson.TypeAdapter)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = java.lang.Class.forName(((java.lang.String)v0));
    Object v2 = new com.google.gson.Gson();
    Object v3 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v2));
    Object v4 = 0;
    Object v5 = new java.io.StringWriter((((java.lang.Integer)v4).intValue()));
    Object v6 = "sun.misc.Unsafe";
    Object v7 = java.lang.Class.forName(((java.lang.String)v6));
    Object v8 = "sun.misc.Unsafe";
    Object v9 = java.lang.Class.forName(((java.lang.String)v8));
    Object v10 = new com.google.gson.Gson();
    Object v11 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v10));
    Object v12 = com.google.gson.internal.bind.TypeAdapters.newFactoryForMultipleTypes(((java.lang.Class)v7),((java.lang.Class)v9),((com.google.gson.TypeAdapter)v11));
    ((com.google.gson.TypeAdapter)v3).toJson(((java.io.Writer)v5),((java.lang.Object)v12));
    Object v13 = null;
    Object v14 = com.google.gson.internal.bind.TypeAdapters.newFactory(((java.lang.Class)v1),((com.google.gson.TypeAdapter)v3));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = java.lang.Class.forName(((java.lang.String)v0));
    Object v2 = new com.google.gson.Gson();
    Object v3 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v2));
    Object v4 = null;
    Object v5 = new com.google.gson.Gson();
    Object v6 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v5));
    Object v7 = com.google.gson.internal.bind.TypeAdapters.newTypeHierarchyFactory(((java.lang.Class)v4),((com.google.gson.TypeAdapter)v6));
    Object v8 = ((com.google.gson.TypeAdapter)v3).toJsonTree(((java.lang.Object)v7));
    Object v9 = com.google.gson.internal.bind.TypeAdapters.newFactory(((java.lang.Class)v1),((com.google.gson.TypeAdapter)v3));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = java.lang.Class.forName(((java.lang.String)v0));
    Object v2 = ((java.lang.Class)v1).getSuperclass();
    Object v3 = new com.google.gson.Gson();
    Object v4 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v3));
    Object v5 = new com.google.gson.internal.bind.JsonTreeWriter();
    Object v6 = "sun.misc.Unsafe";
    Object v7 = java.lang.Class.forName(((java.lang.String)v6));
    Object v8 = ((java.lang.Class)v7).getPackageName();
    Object v9 = new com.google.gson.Gson();
    Object v10 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v9));
    Object v11 = ((com.google.gson.TypeAdapter)v10).nullSafe();
    Object v12 = com.google.gson.internal.bind.TypeAdapters.newFactory(((java.lang.Class)v7),((com.google.gson.TypeAdapter)v10));
    ((com.google.gson.TypeAdapter)v4).write(((com.google.gson.stream.JsonWriter)v5),((java.lang.Object)v12));
    Object v13 = null;
    Object v14 = com.google.gson.internal.bind.TypeAdapters.newFactory(((java.lang.Class)v1),((com.google.gson.TypeAdapter)v4));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = java.lang.Class.forName(((java.lang.String)v0));
    Object v2 = ((java.lang.Class)v1).getDeclaredAnnotations();
    Object v3 = new com.google.gson.Gson();
    Object v4 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v3));
    Object v5 = new com.google.gson.internal.bind.JsonTreeWriter();
    Object v6 = "sun.misc.Unsafe";
    Object v7 = java.lang.Class.forName(((java.lang.String)v6));
    Object v8 = ((java.lang.Class)v7).getPackageName();
    Object v9 = new com.google.gson.Gson();
    Object v10 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v9));
    Object v11 = ((com.google.gson.TypeAdapter)v10).nullSafe();
    Object v12 = com.google.gson.internal.bind.TypeAdapters.newFactory(((java.lang.Class)v7),((com.google.gson.TypeAdapter)v10));
    ((com.google.gson.TypeAdapter)v4).write(((com.google.gson.stream.JsonWriter)v5),((java.lang.Object)v12));
    Object v13 = null;
    Object v14 = com.google.gson.internal.bind.TypeAdapters.newFactory(((java.lang.Class)v1),((com.google.gson.TypeAdapter)v4));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = java.lang.Class.forName(((java.lang.String)v0));
    Object v2 = ((java.lang.Class)v1).getEnclosingMethod();
    Object v3 = "sun.misc.Unsafe";
    Object v4 = java.lang.Class.forName(((java.lang.String)v3));
    Object v5 = new com.google.gson.Gson();
    Object v6 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v5));
    Object v7 = com.google.gson.internal.bind.TypeAdapters.newFactory(((java.lang.Class)v1),((java.lang.Class)v4),((com.google.gson.TypeAdapter)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = java.lang.Class.forName(((java.lang.String)v0));
    Object v2 = "sun.misc.Unsafe";
    Object v3 = java.lang.Class.forName(((java.lang.String)v2));
    Object v4 = new com.google.gson.Gson();
    Object v5 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v4));
    Object v6 = "sun.misc.Unsafe";
    Object v7 = java.lang.Class.forName(((java.lang.String)v6));
    Object v8 = ((java.lang.Class)v7).toString();
    Object v9 = "sun.misc.Unsafe";
    Object v10 = java.lang.Class.forName(((java.lang.String)v9));
    Object v11 = new com.google.gson.Gson();
    Object v12 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v11));
    Object v13 = com.google.gson.internal.bind.TypeAdapters.newFactory(((java.lang.Class)v7),((java.lang.Class)v10),((com.google.gson.TypeAdapter)v12));
    Object v14 = ((com.google.gson.TypeAdapter)v5).toJson(((java.lang.Object)v13));
    Object v15 = com.google.gson.internal.bind.TypeAdapters.newFactoryForMultipleTypes(((java.lang.Class)v1),((java.lang.Class)v3),((com.google.gson.TypeAdapter)v5));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = java.lang.Class.forName(((java.lang.String)v0));
    Object v2 = "sun.misc.Unsafe";
    Object v3 = java.lang.Class.forName(((java.lang.String)v2));
    Object v4 = new com.google.gson.Gson();
    Object v5 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v4));
    Object v6 = new com.google.gson.internal.bind.JsonTreeWriter();
    Object v7 = new com.google.gson.Gson();
    Object v8 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v7));
    ((com.google.gson.TypeAdapter)v5).write(((com.google.gson.stream.JsonWriter)v6),((java.lang.Object)v8));
    Object v9 = null;
    Object v10 = com.google.gson.internal.bind.TypeAdapters.newFactoryForMultipleTypes(((java.lang.Class)v1),((java.lang.Class)v3),((com.google.gson.TypeAdapter)v5));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = java.lang.Class.forName(((java.lang.String)v0));
    Object v2 = "sun.misc.Unsafe";
    Object v3 = java.lang.Class.forName(((java.lang.String)v2));
    Object v4 = ((java.lang.Class)v3).getDeclaredAnnotations();
    Object v5 = new com.google.gson.Gson();
    Object v6 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v5));
    Object v7 = com.google.gson.internal.bind.TypeAdapters.newFactory(((java.lang.Class)v1),((java.lang.Class)v3),((com.google.gson.TypeAdapter)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = java.lang.Class.forName(((java.lang.String)v0));
    Object v2 = com.google.gson.reflect.TypeToken.get(((java.lang.Class)v1));
    Object v3 = new com.google.gson.Gson();
    Object v4 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v3));
    Object v5 = 0;
    Object v6 = new java.io.StringWriter((((java.lang.Integer)v5).intValue()));
    Object v7 = java.io.Reader.nullReader();
    ((com.google.gson.TypeAdapter)v4).toJson(((java.io.Writer)v6),((java.lang.Object)v7));
    Object v8 = null;
    Object v9 = com.google.gson.internal.bind.TypeAdapters.newFactory(((com.google.gson.reflect.TypeToken)v2),((com.google.gson.TypeAdapter)v4));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = java.lang.Class.forName(((java.lang.String)v0));
    Object v2 = ((java.lang.Class)v1).getAnnotations();
    Object v3 = new com.google.gson.Gson();
    Object v4 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v3));
    Object v5 = new com.google.gson.Gson();
    Object v6 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v5));
    Object v7 = ((com.google.gson.TypeAdapter)v4).toJson(((java.lang.Object)v6));
    Object v8 = com.google.gson.internal.bind.TypeAdapters.newTypeHierarchyFactory(((java.lang.Class)v1),((com.google.gson.TypeAdapter)v4));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = java.lang.Class.forName(((java.lang.String)v0));
    Object v2 = com.google.gson.reflect.TypeToken.get(((java.lang.Class)v1));
    Object v3 = new com.google.gson.Gson();
    Object v4 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v3));
    Object v5 = new com.google.gson.internal.bind.JsonTreeWriter();
    Object v6 = java.io.Reader.nullReader();
    Object v7 = new com.google.gson.stream.JsonReader(((java.io.Reader)v6));
    ((com.google.gson.TypeAdapter)v4).write(((com.google.gson.stream.JsonWriter)v5),((java.lang.Object)v7));
    Object v8 = null;
    Object v9 = com.google.gson.internal.bind.TypeAdapters.newFactory(((com.google.gson.reflect.TypeToken)v2),((com.google.gson.TypeAdapter)v4));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = java.lang.Class.forName(((java.lang.String)v0));
    Object v2 = com.google.gson.reflect.TypeToken.get(((java.lang.Class)v1));
    Object v3 = new com.google.gson.Gson();
    Object v4 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v3));
    Object v5 = new com.google.gson.internal.bind.JsonTreeWriter();
    Object v6 = "sun.misc.Unsafe";
    Object v7 = java.lang.Class.forName(((java.lang.String)v6));
    Object v8 = "sun.misc.Unsafe";
    Object v9 = java.lang.Class.forName(((java.lang.String)v8));
    Object v10 = ((java.lang.Class)v9).getDeclaredAnnotations();
    Object v11 = new com.google.gson.Gson();
    Object v12 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v11));
    Object v13 = com.google.gson.internal.bind.TypeAdapters.newFactory(((java.lang.Class)v7),((java.lang.Class)v9),((com.google.gson.TypeAdapter)v12));
    ((com.google.gson.TypeAdapter)v4).write(((com.google.gson.stream.JsonWriter)v5),((java.lang.Object)v13));
    Object v14 = null;
    Object v15 = com.google.gson.internal.bind.TypeAdapters.newFactory(((com.google.gson.reflect.TypeToken)v2),((com.google.gson.TypeAdapter)v4));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = java.lang.Class.forName(((java.lang.String)v0));
    Object v2 = ((java.lang.Class)v1).getClassLoader();
    Object v3 = "sun.misc.Unsafe";
    Object v4 = java.lang.Class.forName(((java.lang.String)v3));
    Object v5 = new com.google.gson.Gson();
    Object v6 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v5));
    Object v7 = com.google.gson.internal.bind.TypeAdapters.newFactoryForMultipleTypes(((java.lang.Class)v1),((java.lang.Class)v4),((com.google.gson.TypeAdapter)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = java.lang.Class.forName(((java.lang.String)v0));
    Object v2 = ((java.lang.Class)v1).getEnclosingConstructor();
    Object v3 = new com.google.gson.Gson();
    Object v4 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v3));
    Object v5 = 0;
    Object v6 = new java.io.StringWriter((((java.lang.Integer)v5).intValue()));
    Object v7 = "sun.misc.Unsafe";
    Object v8 = java.lang.Class.forName(((java.lang.String)v7));
    Object v9 = ((java.lang.Class)v8).getClasses();
    Object v10 = "sun.misc.Unsafe";
    Object v11 = java.lang.Class.forName(((java.lang.String)v10));
    Object v12 = ((java.lang.Class)v11).getProtectionDomain();
    Object v13 = new com.google.gson.Gson();
    Object v14 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v13));
    Object v15 = com.google.gson.internal.bind.TypeAdapters.newFactoryForMultipleTypes(((java.lang.Class)v8),((java.lang.Class)v11),((com.google.gson.TypeAdapter)v14));
    ((com.google.gson.TypeAdapter)v4).toJson(((java.io.Writer)v6),((java.lang.Object)v15));
    Object v16 = null;
    Object v17 = com.google.gson.internal.bind.TypeAdapters.newFactory(((java.lang.Class)v1),((com.google.gson.TypeAdapter)v4));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = "sun.misc.Unsafe";
    Object v1 = java.lang.Class.forName(((java.lang.String)v0));
    Object v2 = "sun.misc.Unsafe";
    Object v3 = java.lang.Class.forName(((java.lang.String)v2));
    Object v4 = ((java.lang.Class)v3).getDeclaredMethods();
    Object v5 = new com.google.gson.Gson();
    Object v6 = new com.google.gson.internal.bind.ObjectTypeAdapter(((com.google.gson.Gson)v5));
    Object v7 = com.google.gson.internal.bind.TypeAdapters.newFactory(((java.lang.Class)v1),((java.lang.Class)v3),((com.google.gson.TypeAdapter)v6));
    org.junit.Assert.assertNotNull(v7);
  }
}
