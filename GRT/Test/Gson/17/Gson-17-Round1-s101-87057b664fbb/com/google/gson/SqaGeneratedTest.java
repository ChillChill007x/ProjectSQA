package com.google.gson;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = 0;
    Object v2 = new com.google.gson.DefaultDateTypeAdapter((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = java.io.Reader.nullReader();
    Object v4 = new com.google.gson.stream.JsonReader(((java.io.Reader)v3));
    Object v5 = ((com.google.gson.DefaultDateTypeAdapter)v2).read(((com.google.gson.stream.JsonReader)v4));
      org.junit.Assert.fail("Expected java.io.EOFException");
    } catch (java.io.EOFException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = 0;
    Object v2 = new com.google.gson.DefaultDateTypeAdapter((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = java.io.Reader.nullReader();
    Object v4 = ((com.google.gson.TypeAdapter)v2).toJson(((java.lang.Object)v3));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = 0;
    Object v1 = 0;
    Object v2 = new com.google.gson.DefaultDateTypeAdapter((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = java.io.Writer.nullWriter();
    Object v4 = com.google.gson.internal.Streams.writerForAppendable(((java.lang.Appendable)v3));
    Object v5 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v4));
    Object v6 = ((com.google.gson.stream.JsonWriter)v5).beginArray();
    Object v7 = -2;
    Object v8 = 30;
    Object v9 = 0;
    Object v10 = 0;
    Object v11 = 8;
    Object v12 = 15;
    Object v13 = new java.util.Date((((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    ((com.google.gson.DefaultDateTypeAdapter)v2).write(((com.google.gson.stream.JsonWriter)v5),((java.util.Date)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = 0;
    Object v1 = 0;
    Object v2 = new com.google.gson.DefaultDateTypeAdapter((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = java.io.Writer.nullWriter();
    Object v4 = com.google.gson.internal.Streams.writerForAppendable(((java.lang.Appendable)v3));
    Object v5 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v4));
    Object v6 = " ";
    ((com.google.gson.stream.JsonWriter)v5).setIndent(((java.lang.String)v6));
    Object v7 = null;
    Object v8 = -2;
    Object v9 = 30;
    Object v10 = 0;
    Object v11 = 0;
    Object v12 = 8;
    Object v13 = 15;
    Object v14 = new java.util.Date((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    ((com.google.gson.DefaultDateTypeAdapter)v2).write(((com.google.gson.stream.JsonWriter)v5),((java.util.Date)v14));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = 0;
    Object v2 = new com.google.gson.DefaultDateTypeAdapter((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((com.google.gson.TypeAdapter)v2).nullSafe();
    Object v4 = java.io.Writer.nullWriter();
    Object v5 = com.google.gson.internal.Streams.writerForAppendable(((java.lang.Appendable)v4));
    Object v6 = ((com.google.gson.TypeAdapter)v2).toJson(((java.lang.Object)v5));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = 29;
    Object v1 = 0;
    Object v2 = new com.google.gson.DefaultDateTypeAdapter((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = 0;
    Object v2 = new com.google.gson.DefaultDateTypeAdapter((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((com.google.gson.TypeAdapter)v2).nullSafe();
    Object v4 = java.io.Reader.nullReader();
    Object v5 = new com.google.gson.stream.JsonReader(((java.io.Reader)v4));
    Object v6 = ((com.google.gson.DefaultDateTypeAdapter)v2).read(((com.google.gson.stream.JsonReader)v5));
      org.junit.Assert.fail("Expected java.io.EOFException");
    } catch (java.io.EOFException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = 0;
    Object v1 = 0;
    Object v2 = new com.google.gson.DefaultDateTypeAdapter((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = java.io.Writer.nullWriter();
    Object v4 = com.google.gson.internal.Streams.writerForAppendable(((java.lang.Appendable)v3));
    Object v5 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v4));
    Object v6 = -2;
    Object v7 = 30;
    Object v8 = 0;
    Object v9 = 0;
    Object v10 = 8;
    Object v11 = 15;
    Object v12 = new java.util.Date((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    ((com.google.gson.DefaultDateTypeAdapter)v2).write(((com.google.gson.stream.JsonWriter)v5),((java.util.Date)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = 0;
    Object v1 = 0;
    Object v2 = new com.google.gson.DefaultDateTypeAdapter((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = -2;
    Object v4 = 30;
    Object v5 = 0;
    Object v6 = 0;
    Object v7 = 8;
    Object v8 = 15;
    Object v9 = new java.util.Date((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = ((com.google.gson.TypeAdapter)v2).toJsonTree(((java.lang.Object)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = 0;
    Object v2 = new com.google.gson.DefaultDateTypeAdapter((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = false;
    Object v4 = new com.google.gson.JsonPrimitive(((java.lang.Boolean)v3));
    Object v5 = ((com.google.gson.TypeAdapter)v2).fromJsonTree(((com.google.gson.JsonElement)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = 0;
    Object v2 = new com.google.gson.DefaultDateTypeAdapter((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = java.io.Reader.nullReader();
    Object v4 = new char[]{Character.valueOf((char)1),Character.valueOf((char)0)};
    Object v5 = ((java.io.Reader)v3).read(((char[])v4));
    Object v6 = ((com.google.gson.TypeAdapter)v2).fromJson(((java.io.Reader)v3));
      org.junit.Assert.fail("Expected java.io.EOFException");
    } catch (java.io.EOFException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = 0;
    Object v1 = 0;
    Object v2 = new com.google.gson.DefaultDateTypeAdapter((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((com.google.gson.DefaultDateTypeAdapter)v2).toString();
    org.junit.Assert.assertEquals((Object)("DefaultDateTypeAdapter(SimpleDateFormat)"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = 0;
    Object v2 = new com.google.gson.DefaultDateTypeAdapter((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = "Expected name";
    Object v4 = ((com.google.gson.TypeAdapter)v2).fromJson(((java.lang.String)v3));
      org.junit.Assert.fail("Expected com.google.gson.stream.MalformedJsonException");
    } catch (com.google.gson.stream.MalformedJsonException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = 0;
    Object v2 = new com.google.gson.DefaultDateTypeAdapter((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = java.io.Reader.nullReader();
    Object v4 = ((com.google.gson.TypeAdapter)v2).fromJson(((java.io.Reader)v3));
      org.junit.Assert.fail("Expected java.io.EOFException");
    } catch (java.io.EOFException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = 0;
    Object v2 = new com.google.gson.DefaultDateTypeAdapter((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((com.google.gson.TypeAdapter)v2).nullSafe();
    Object v4 = false;
    Object v5 = new com.google.gson.JsonPrimitive(((java.lang.Boolean)v4));
    Object v6 = ((com.google.gson.TypeAdapter)v2).fromJsonTree(((com.google.gson.JsonElement)v5));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = 0;
    Object v1 = 0;
    Object v2 = new com.google.gson.DefaultDateTypeAdapter((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((com.google.gson.TypeAdapter)v2).nullSafe();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = 0;
    Object v1 = 0;
    Object v2 = new com.google.gson.DefaultDateTypeAdapter((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((com.google.gson.DefaultDateTypeAdapter)v2).toString();
    Object v4 = java.io.Writer.nullWriter();
    Object v5 = com.google.gson.internal.Streams.writerForAppendable(((java.lang.Appendable)v4));
    Object v6 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v5));
    Object v7 = -2;
    Object v8 = 30;
    Object v9 = 0;
    Object v10 = 0;
    Object v11 = 8;
    Object v12 = 15;
    Object v13 = new java.util.Date((((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    ((com.google.gson.DefaultDateTypeAdapter)v2).write(((com.google.gson.stream.JsonWriter)v6),((java.util.Date)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = 0;
    Object v2 = new com.google.gson.DefaultDateTypeAdapter((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((com.google.gson.TypeAdapter)v2).nullSafe();
    Object v4 = "JSON forbids NaN and infinitis: ";
    Object v5 = ((com.google.gson.TypeAdapter)v3).fromJson(((java.lang.String)v4));
      org.junit.Assert.fail("Expected com.google.gson.stream.MalformedJsonException");
    } catch (com.google.gson.stream.MalformedJsonException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = 0;
    Object v1 = 0;
    Object v2 = new com.google.gson.DefaultDateTypeAdapter((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((com.google.gson.TypeAdapter)v2).nullSafe();
    Object v4 = ((com.google.gson.TypeAdapter)v3).nullSafe();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = 0;
    Object v2 = new com.google.gson.DefaultDateTypeAdapter((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((com.google.gson.TypeAdapter)v2).nullSafe();
    Object v4 = ((com.google.gson.TypeAdapter)v3).nullSafe();
    Object v5 = 15;
    Object v6 = new java.text.ParsePosition((((java.lang.Integer)v5).intValue()));
    Object v7 = ((com.google.gson.TypeAdapter)v4).toJsonTree(((java.lang.Object)v6));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = 0;
    Object v1 = 0;
    Object v2 = new com.google.gson.DefaultDateTypeAdapter((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((com.google.gson.TypeAdapter)v2).nullSafe();
    Object v4 = ((com.google.gson.TypeAdapter)v3).nullSafe();
    Object v5 = ((com.google.gson.TypeAdapter)v4).nullSafe();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = 0;
    Object v1 = 0;
    Object v2 = new com.google.gson.DefaultDateTypeAdapter((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((com.google.gson.TypeAdapter)v2).nullSafe();
    Object v4 = java.io.Writer.nullWriter();
    Object v5 = com.google.gson.internal.Streams.writerForAppendable(((java.lang.Appendable)v4));
    Object v6 = -2;
    Object v7 = 30;
    Object v8 = 0;
    Object v9 = 0;
    Object v10 = 8;
    Object v11 = 15;
    Object v12 = new java.util.Date((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    ((com.google.gson.TypeAdapter)v3).toJson(((java.io.Writer)v5),((java.lang.Object)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = 0;
    Object v2 = new com.google.gson.DefaultDateTypeAdapter((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = java.io.Writer.nullWriter();
    Object v4 = com.google.gson.internal.Streams.writerForAppendable(((java.lang.Appendable)v3));
    Object v5 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v4));
    Object v6 = false;
    Object v7 = ((com.google.gson.stream.JsonWriter)v5).value(((java.lang.Boolean)v6));
    Object v8 = -2;
    Object v9 = 30;
    Object v10 = 0;
    Object v11 = 0;
    Object v12 = 8;
    Object v13 = 15;
    Object v14 = new java.util.Date((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    ((com.google.gson.DefaultDateTypeAdapter)v2).write(((com.google.gson.stream.JsonWriter)v5),((java.util.Date)v14));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = 0;
    Object v2 = new com.google.gson.DefaultDateTypeAdapter((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((com.google.gson.DefaultDateTypeAdapter)v2).toString();
    Object v4 = java.io.Writer.nullWriter();
    Object v5 = com.google.gson.internal.Streams.writerForAppendable(((java.lang.Appendable)v4));
    Object v6 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v5));
    Object v7 = ((com.google.gson.stream.JsonWriter)v6).beginObject();
    Object v8 = -2;
    Object v9 = 30;
    Object v10 = 0;
    Object v11 = 0;
    Object v12 = 8;
    Object v13 = 15;
    Object v14 = new java.util.Date((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    ((com.google.gson.DefaultDateTypeAdapter)v2).write(((com.google.gson.stream.JsonWriter)v6),((java.util.Date)v14));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = 0;
    Object v2 = new com.google.gson.DefaultDateTypeAdapter((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((com.google.gson.DefaultDateTypeAdapter)v2).toString();
    Object v4 = java.io.Reader.nullReader();
    Object v5 = new com.google.gson.stream.JsonReader(((java.io.Reader)v4));
    Object v6 = ((com.google.gson.DefaultDateTypeAdapter)v2).read(((com.google.gson.stream.JsonReader)v5));
      org.junit.Assert.fail("Expected java.io.EOFException");
    } catch (java.io.EOFException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = 0;
    Object v2 = new com.google.gson.DefaultDateTypeAdapter((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = java.io.Reader.nullReader();
    Object v4 = new com.google.gson.stream.JsonReader(((java.io.Reader)v3));
    Object v5 = true;
    ((com.google.gson.stream.JsonReader)v4).setLenient((((java.lang.Boolean)v5).booleanValue()));
    Object v6 = null;
    Object v7 = ((com.google.gson.DefaultDateTypeAdapter)v2).read(((com.google.gson.stream.JsonReader)v4));
      org.junit.Assert.fail("Expected java.io.EOFException");
    } catch (java.io.EOFException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = 0;
    Object v2 = new com.google.gson.DefaultDateTypeAdapter((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((com.google.gson.TypeAdapter)v2).nullSafe();
    Object v4 = false;
    Object v5 = new com.google.gson.JsonPrimitive(((java.lang.Boolean)v4));
    Object v6 = ((com.google.gson.TypeAdapter)v3).toJsonTree(((java.lang.Object)v5));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = 24;
    Object v1 = 1;
    Object v2 = new com.google.gson.DefaultDateTypeAdapter((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = 0;
    Object v1 = 0;
    Object v2 = new com.google.gson.DefaultDateTypeAdapter((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = java.io.Writer.nullWriter();
    Object v4 = com.google.gson.internal.Streams.writerForAppendable(((java.lang.Appendable)v3));
    Object v5 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v4));
    Object v6 = -2;
    Object v7 = 30;
    Object v8 = 0;
    Object v9 = 0;
    Object v10 = 8;
    Object v11 = 15;
    Object v12 = new java.util.Date((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = ((java.util.Date)v12).getDay();
    ((com.google.gson.DefaultDateTypeAdapter)v2).write(((com.google.gson.stream.JsonWriter)v5),((java.util.Date)v12));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = 1;
    Object v1 = 1;
    Object v2 = new com.google.gson.DefaultDateTypeAdapter((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = 1;
    Object v2 = new com.google.gson.DefaultDateTypeAdapter((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = java.io.Reader.nullReader();
    Object v4 = new com.google.gson.stream.JsonReader(((java.io.Reader)v3));
    Object v5 = ((com.google.gson.DefaultDateTypeAdapter)v2).read(((com.google.gson.stream.JsonReader)v4));
      org.junit.Assert.fail("Expected java.io.EOFException");
    } catch (java.io.EOFException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = 0;
    Object v2 = new com.google.gson.DefaultDateTypeAdapter((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((com.google.gson.TypeAdapter)v2).nullSafe();
    Object v4 = ((com.google.gson.TypeAdapter)v3).nullSafe();
    Object v5 = ((com.google.gson.TypeAdapter)v4).nullSafe();
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = com.google.gson.internal.Streams.writerForAppendable(((java.lang.Appendable)v6));
    Object v8 = java.io.Writer.nullWriter();
    Object v9 = com.google.gson.internal.Streams.writerForAppendable(((java.lang.Appendable)v8));
    ((com.google.gson.TypeAdapter)v5).toJson(((java.io.Writer)v7),((java.lang.Object)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = 1;
    Object v2 = new com.google.gson.DefaultDateTypeAdapter((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = java.io.Reader.nullReader();
    Object v4 = new com.google.gson.stream.JsonReader(((java.io.Reader)v3));
    Object v5 = true;
    ((com.google.gson.stream.JsonReader)v4).setLenient((((java.lang.Boolean)v5).booleanValue()));
    Object v6 = null;
    Object v7 = ((com.google.gson.DefaultDateTypeAdapter)v2).read(((com.google.gson.stream.JsonReader)v4));
      org.junit.Assert.fail("Expected java.io.EOFException");
    } catch (java.io.EOFException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = 1;
    Object v1 = 1;
    Object v2 = new com.google.gson.DefaultDateTypeAdapter((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = java.io.Writer.nullWriter();
    Object v4 = com.google.gson.internal.Streams.writerForAppendable(((java.lang.Appendable)v3));
    Object v5 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v4));
    Object v6 = -2;
    Object v7 = 30;
    Object v8 = 0;
    Object v9 = 0;
    Object v10 = 8;
    Object v11 = 15;
    Object v12 = new java.util.Date((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    ((com.google.gson.DefaultDateTypeAdapter)v2).write(((com.google.gson.stream.JsonWriter)v5),((java.util.Date)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = 1;
    Object v2 = new com.google.gson.DefaultDateTypeAdapter((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = false;
    Object v4 = new com.google.gson.JsonPrimitive(((java.lang.Boolean)v3));
    Object v5 = ((com.google.gson.TypeAdapter)v2).toJsonTree(((java.lang.Object)v4));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = 1;
    Object v2 = new com.google.gson.DefaultDateTypeAdapter((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = java.io.Reader.nullReader();
    Object v4 = new com.google.gson.stream.JsonReader(((java.io.Reader)v3));
    Object v5 = ((com.google.gson.stream.JsonReader)v4).toString();
    Object v6 = ((com.google.gson.DefaultDateTypeAdapter)v2).read(((com.google.gson.stream.JsonReader)v4));
      org.junit.Assert.fail("Expected java.io.EOFException");
    } catch (java.io.EOFException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = 1;
    Object v2 = new com.google.gson.DefaultDateTypeAdapter((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = java.io.Writer.nullWriter();
    Object v4 = com.google.gson.internal.Streams.writerForAppendable(((java.lang.Appendable)v3));
    Object v5 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v4));
    Object v6 = ((com.google.gson.stream.JsonWriter)v5).beginObject();
    Object v7 = -2;
    Object v8 = 30;
    Object v9 = 0;
    Object v10 = 0;
    Object v11 = 8;
    Object v12 = 15;
    Object v13 = new java.util.Date((((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    ((com.google.gson.DefaultDateTypeAdapter)v2).write(((com.google.gson.stream.JsonWriter)v5),((java.util.Date)v13));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = 1;
    Object v2 = new com.google.gson.DefaultDateTypeAdapter((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((com.google.gson.TypeAdapter)v2).nullSafe();
    Object v4 = java.io.Reader.nullReader();
    Object v5 = new com.google.gson.stream.JsonReader(((java.io.Reader)v4));
    Object v6 = ((com.google.gson.DefaultDateTypeAdapter)v2).read(((com.google.gson.stream.JsonReader)v5));
      org.junit.Assert.fail("Expected java.io.EOFException");
    } catch (java.io.EOFException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = 1;
    Object v2 = new com.google.gson.DefaultDateTypeAdapter((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((com.google.gson.DefaultDateTypeAdapter)v2).toString();
    Object v4 = java.io.Reader.nullReader();
    Object v5 = new com.google.gson.stream.JsonReader(((java.io.Reader)v4));
    Object v6 = ((com.google.gson.DefaultDateTypeAdapter)v2).read(((com.google.gson.stream.JsonReader)v5));
      org.junit.Assert.fail("Expected java.io.EOFException");
    } catch (java.io.EOFException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = 1;
    Object v2 = new com.google.gson.DefaultDateTypeAdapter((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = java.io.Writer.nullWriter();
    Object v4 = ((com.google.gson.TypeAdapter)v2).toJsonTree(((java.lang.Object)v3));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = 1;
    Object v2 = new com.google.gson.DefaultDateTypeAdapter((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((com.google.gson.TypeAdapter)v2).nullSafe();
    Object v4 = java.io.Writer.nullWriter();
    Object v5 = com.google.gson.internal.Streams.writerForAppendable(((java.lang.Appendable)v4));
    Object v6 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v5));
    Object v7 = ((com.google.gson.stream.JsonWriter)v6).nullValue();
    Object v8 = -2;
    Object v9 = 30;
    Object v10 = 0;
    Object v11 = 0;
    Object v12 = 8;
    Object v13 = 15;
    Object v14 = new java.util.Date((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    ((com.google.gson.DefaultDateTypeAdapter)v2).write(((com.google.gson.stream.JsonWriter)v6),((java.util.Date)v14));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = 1;
    Object v2 = new com.google.gson.DefaultDateTypeAdapter((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((com.google.gson.TypeAdapter)v2).nullSafe();
    Object v4 = java.io.Writer.nullWriter();
    Object v5 = com.google.gson.internal.Streams.writerForAppendable(((java.lang.Appendable)v4));
    Object v6 = null;
    Object v7 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v6));
    ((com.google.gson.TypeAdapter)v2).toJson(((java.io.Writer)v5),((java.lang.Object)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = 1;
    Object v2 = new com.google.gson.DefaultDateTypeAdapter((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = java.io.Reader.nullReader();
    Object v4 = new com.google.gson.stream.JsonReader(((java.io.Reader)v3));
    Object v5 = ((com.google.gson.stream.JsonReader)v4).getPath();
    Object v6 = ((com.google.gson.DefaultDateTypeAdapter)v2).read(((com.google.gson.stream.JsonReader)v4));
      org.junit.Assert.fail("Expected java.io.EOFException");
    } catch (java.io.EOFException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = 0;
    Object v2 = new com.google.gson.DefaultDateTypeAdapter((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((com.google.gson.TypeAdapter)v2).nullSafe();
    Object v4 = java.io.Writer.nullWriter();
    Object v5 = 0;
    Object v6 = 0;
    Object v7 = new com.google.gson.DefaultDateTypeAdapter((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = ((com.google.gson.DefaultDateTypeAdapter)v7).toString();
    Object v9 = ((java.io.Writer)v4).append(((java.lang.CharSequence)v8));
    Object v10 = 15;
    Object v11 = new java.text.ParsePosition((((java.lang.Integer)v10).intValue()));
    ((com.google.gson.TypeAdapter)v3).toJson(((java.io.Writer)v4),((java.lang.Object)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = 1;
    Object v1 = 1;
    Object v2 = new com.google.gson.DefaultDateTypeAdapter((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = java.io.Writer.nullWriter();
    Object v4 = com.google.gson.internal.Streams.writerForAppendable(((java.lang.Appendable)v3));
    Object v5 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v4));
    Object v6 = -2;
    Object v7 = 30;
    Object v8 = 0;
    Object v9 = 0;
    Object v10 = 8;
    Object v11 = 15;
    Object v12 = new java.util.Date((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    ((com.google.gson.DefaultDateTypeAdapter)v2).write(((com.google.gson.stream.JsonWriter)v5),((java.util.Date)v12));
    Object v13 = null;
    Object v14 = java.io.Writer.nullWriter();
    Object v15 = com.google.gson.internal.Streams.writerForAppendable(((java.lang.Appendable)v14));
    Object v16 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v15));
    Object v17 = -2;
    Object v18 = 30;
    Object v19 = 0;
    Object v20 = 0;
    Object v21 = 8;
    Object v22 = 15;
    Object v23 = new java.util.Date((((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()));
    Object v24 = ((java.util.Date)v23).getYear();
    ((com.google.gson.DefaultDateTypeAdapter)v2).write(((com.google.gson.stream.JsonWriter)v16),((java.util.Date)v23));
    Object v25 = null;
    org.junit.Assert.assertNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = 1;
    Object v1 = 1;
    Object v2 = new com.google.gson.DefaultDateTypeAdapter((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = java.io.Writer.nullWriter();
    Object v4 = com.google.gson.internal.Streams.writerForAppendable(((java.lang.Appendable)v3));
    Object v5 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v4));
    Object v6 = -2;
    Object v7 = 30;
    Object v8 = 0;
    Object v9 = 0;
    Object v10 = 8;
    Object v11 = 15;
    Object v12 = new java.util.Date((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    ((com.google.gson.DefaultDateTypeAdapter)v2).write(((com.google.gson.stream.JsonWriter)v5),((java.util.Date)v12));
    Object v13 = null;
    Object v14 = java.io.Writer.nullWriter();
    Object v15 = com.google.gson.internal.Streams.writerForAppendable(((java.lang.Appendable)v14));
    Object v16 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v15));
    Object v17 = -2;
    Object v18 = 30;
    Object v19 = 0;
    Object v20 = 0;
    Object v21 = 8;
    Object v22 = 15;
    Object v23 = new java.util.Date((((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()));
    ((com.google.gson.DefaultDateTypeAdapter)v2).write(((com.google.gson.stream.JsonWriter)v16),((java.util.Date)v23));
    Object v24 = null;
    org.junit.Assert.assertNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = 1;
    Object v1 = 1;
    Object v2 = new com.google.gson.DefaultDateTypeAdapter((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((com.google.gson.DefaultDateTypeAdapter)v2).toString();
    Object v4 = java.io.Writer.nullWriter();
    Object v5 = com.google.gson.internal.Streams.writerForAppendable(((java.lang.Appendable)v4));
    Object v6 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v5));
    Object v7 = -2;
    Object v8 = 30;
    Object v9 = 0;
    Object v10 = 0;
    Object v11 = 8;
    Object v12 = 15;
    Object v13 = new java.util.Date((((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    ((com.google.gson.DefaultDateTypeAdapter)v2).write(((com.google.gson.stream.JsonWriter)v6),((java.util.Date)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = 1;
    Object v1 = 1;
    Object v2 = new com.google.gson.DefaultDateTypeAdapter((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = java.io.Writer.nullWriter();
    Object v4 = com.google.gson.internal.Streams.writerForAppendable(((java.lang.Appendable)v3));
    Object v5 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v4));
    Object v6 = true;
    ((com.google.gson.stream.JsonWriter)v5).setSerializeNulls((((java.lang.Boolean)v6).booleanValue()));
    Object v7 = null;
    Object v8 = -2;
    Object v9 = 30;
    Object v10 = 0;
    Object v11 = 0;
    Object v12 = 8;
    Object v13 = 15;
    Object v14 = new java.util.Date((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = ((java.util.Date)v14).hashCode();
    ((com.google.gson.DefaultDateTypeAdapter)v2).write(((com.google.gson.stream.JsonWriter)v5),((java.util.Date)v14));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = 1;
    Object v2 = new com.google.gson.DefaultDateTypeAdapter((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = java.io.Reader.nullReader();
    Object v4 = new com.google.gson.stream.JsonReader(((java.io.Reader)v3));
    Object v5 = false;
    ((com.google.gson.stream.JsonReader)v4).setLenient((((java.lang.Boolean)v5).booleanValue()));
    Object v6 = null;
    Object v7 = ((com.google.gson.DefaultDateTypeAdapter)v2).read(((com.google.gson.stream.JsonReader)v4));
      org.junit.Assert.fail("Expected java.io.EOFException");
    } catch (java.io.EOFException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = 1;
    Object v1 = 1;
    Object v2 = new com.google.gson.DefaultDateTypeAdapter((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = java.io.Writer.nullWriter();
    Object v4 = com.google.gson.internal.Streams.writerForAppendable(((java.lang.Appendable)v3));
    Object v5 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v4));
    Object v6 = -2;
    Object v7 = 30;
    Object v8 = 0;
    Object v9 = 0;
    Object v10 = 8;
    Object v11 = 15;
    Object v12 = new java.util.Date((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = 1;
    ((java.util.Date)v12).setMinutes((((java.lang.Integer)v13).intValue()));
    Object v14 = null;
    ((com.google.gson.DefaultDateTypeAdapter)v2).write(((com.google.gson.stream.JsonWriter)v5),((java.util.Date)v12));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = 1;
    Object v2 = new com.google.gson.DefaultDateTypeAdapter((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = false;
    Object v4 = new com.google.gson.JsonPrimitive(((java.lang.Boolean)v3));
    Object v5 = ((com.google.gson.JsonElement)v4).toString();
    Object v6 = ((com.google.gson.TypeAdapter)v2).fromJsonTree(((com.google.gson.JsonElement)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = 1;
    Object v1 = 1;
    Object v2 = new com.google.gson.DefaultDateTypeAdapter((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((com.google.gson.TypeAdapter)v2).nullSafe();
    Object v4 = java.io.Writer.nullWriter();
    Object v5 = com.google.gson.internal.Streams.writerForAppendable(((java.lang.Appendable)v4));
    Object v6 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v5));
    Object v7 = -2;
    Object v8 = 30;
    Object v9 = 0;
    Object v10 = 0;
    Object v11 = 8;
    Object v12 = 15;
    Object v13 = new java.util.Date((((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    ((com.google.gson.DefaultDateTypeAdapter)v2).write(((com.google.gson.stream.JsonWriter)v6),((java.util.Date)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = 1;
    Object v2 = new com.google.gson.DefaultDateTypeAdapter((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = java.io.Writer.nullWriter();
    Object v4 = com.google.gson.internal.Streams.writerForAppendable(((java.lang.Appendable)v3));
    Object v5 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v4));
    Object v6 = "*/";
    Object v7 = ((com.google.gson.stream.JsonWriter)v5).name(((java.lang.String)v6));
    Object v8 = -2;
    Object v9 = 30;
    Object v10 = 0;
    Object v11 = 0;
    Object v12 = 8;
    Object v13 = 15;
    Object v14 = new java.util.Date((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    ((com.google.gson.DefaultDateTypeAdapter)v2).write(((com.google.gson.stream.JsonWriter)v5),((java.util.Date)v14));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = 0;
    Object v2 = new com.google.gson.DefaultDateTypeAdapter((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((com.google.gson.TypeAdapter)v2).nullSafe();
    Object v4 = "Exp";
    Object v5 = ((com.google.gson.TypeAdapter)v3).fromJson(((java.lang.String)v4));
      org.junit.Assert.fail("Expected com.google.gson.stream.MalformedJsonException");
    } catch (com.google.gson.stream.MalformedJsonException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = 0;
    Object v2 = new com.google.gson.DefaultDateTypeAdapter((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((com.google.gson.TypeAdapter)v2).nullSafe();
    Object v4 = ((com.google.gson.TypeAdapter)v3).nullSafe();
    Object v5 = "JSON must have only one top-level value.";
    Object v6 = ((com.google.gson.TypeAdapter)v4).fromJson(((java.lang.String)v5));
      org.junit.Assert.fail("Expected com.google.gson.stream.MalformedJsonException");
    } catch (com.google.gson.stream.MalformedJsonException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = 0;
    Object v2 = new com.google.gson.DefaultDateTypeAdapter((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((com.google.gson.TypeAdapter)v2).nullSafe();
    Object v4 = ((com.google.gson.TypeAdapter)v3).nullSafe();
    Object v5 = ((com.google.gson.TypeAdapter)v4).nullSafe();
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = com.google.gson.internal.Streams.writerForAppendable(((java.lang.Appendable)v6));
    Object v8 = 0;
    Object v9 = 0;
    Object v10 = new com.google.gson.DefaultDateTypeAdapter((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = ((com.google.gson.DefaultDateTypeAdapter)v10).toString();
    Object v12 = ((java.io.Writer)v7).append(((java.lang.CharSequence)v11));
    Object v13 = java.io.Writer.nullWriter();
    Object v14 = com.google.gson.internal.Streams.writerForAppendable(((java.lang.Appendable)v13));
    ((com.google.gson.TypeAdapter)v5).toJson(((java.io.Writer)v7),((java.lang.Object)v14));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = -20;
    Object v2 = new com.google.gson.DefaultDateTypeAdapter((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = 0;
    Object v2 = new com.google.gson.DefaultDateTypeAdapter((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((com.google.gson.TypeAdapter)v2).nullSafe();
    Object v4 = false;
    Object v5 = new com.google.gson.JsonPrimitive(((java.lang.Boolean)v4));
    Object v6 = ((com.google.gson.TypeAdapter)v3).fromJsonTree(((com.google.gson.JsonElement)v5));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = 1;
    Object v2 = new com.google.gson.DefaultDateTypeAdapter((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = java.io.Reader.nullReader();
    Object v4 = new com.google.gson.stream.JsonReader(((java.io.Reader)v3));
    ((com.google.gson.stream.JsonReader)v4).close();
    Object v5 = null;
    Object v6 = ((com.google.gson.DefaultDateTypeAdapter)v2).read(((com.google.gson.stream.JsonReader)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = 1;
    Object v2 = new com.google.gson.DefaultDateTypeAdapter((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = "";
    Object v4 = ((com.google.gson.TypeAdapter)v2).fromJson(((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.io.EOFException");
    } catch (java.io.EOFException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = 1;
    Object v2 = new com.google.gson.DefaultDateTypeAdapter((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = java.io.Writer.nullWriter();
    Object v4 = com.google.gson.internal.Streams.writerForAppendable(((java.lang.Appendable)v3));
    Object v5 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v4));
    Object v6 = 12L;
    Object v7 = ((com.google.gson.stream.JsonWriter)v5).value((((java.lang.Long)v6).longValue()));
    Object v8 = -2;
    Object v9 = 30;
    Object v10 = 0;
    Object v11 = 0;
    Object v12 = 8;
    Object v13 = 15;
    Object v14 = new java.util.Date((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    ((com.google.gson.DefaultDateTypeAdapter)v2).write(((com.google.gson.stream.JsonWriter)v5),((java.util.Date)v14));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = 1;
    Object v2 = new com.google.gson.DefaultDateTypeAdapter((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = java.io.Writer.nullWriter();
    Object v4 = com.google.gson.internal.Streams.writerForAppendable(((java.lang.Appendable)v3));
    Object v5 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v4));
    Object v6 = 127.33777650092239D;
    Object v7 = ((com.google.gson.stream.JsonWriter)v5).value((((java.lang.Double)v6).doubleValue()));
    Object v8 = -2;
    Object v9 = 30;
    Object v10 = 0;
    Object v11 = 0;
    Object v12 = 8;
    Object v13 = 15;
    Object v14 = new java.util.Date((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    ((com.google.gson.DefaultDateTypeAdapter)v2).write(((com.google.gson.stream.JsonWriter)v5),((java.util.Date)v14));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = 1;
    Object v2 = new com.google.gson.DefaultDateTypeAdapter((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = java.io.Writer.nullWriter();
    Object v4 = com.google.gson.internal.Streams.writerForAppendable(((java.lang.Appendable)v3));
    Object v5 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v4));
    Object v6 = "Date type must be one of ";
    Object v7 = ((com.google.gson.stream.JsonWriter)v5).value(((java.lang.String)v6));
    Object v8 = -2;
    Object v9 = 30;
    Object v10 = 0;
    Object v11 = 0;
    Object v12 = 8;
    Object v13 = 15;
    Object v14 = new java.util.Date((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    ((com.google.gson.DefaultDateTypeAdapter)v2).write(((com.google.gson.stream.JsonWriter)v5),((java.util.Date)v14));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = 1;
    Object v2 = new com.google.gson.DefaultDateTypeAdapter((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = java.io.Writer.nullWriter();
    Object v4 = com.google.gson.internal.Streams.writerForAppendable(((java.lang.Appendable)v3));
    Object v5 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v4));
    Object v6 = -2;
    Object v7 = 30;
    Object v8 = 0;
    Object v9 = 0;
    Object v10 = 8;
    Object v11 = 15;
    Object v12 = new java.util.Date((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    ((com.google.gson.DefaultDateTypeAdapter)v2).write(((com.google.gson.stream.JsonWriter)v5),((java.util.Date)v12));
    Object v13 = null;
    Object v14 = java.io.Reader.nullReader();
    Object v15 = new com.google.gson.stream.JsonReader(((java.io.Reader)v14));
    Object v16 = ((com.google.gson.DefaultDateTypeAdapter)v2).read(((com.google.gson.stream.JsonReader)v15));
      org.junit.Assert.fail("Expected java.io.EOFException");
    } catch (java.io.EOFException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = -11;
    Object v1 = -59;
    Object v2 = new com.google.gson.DefaultDateTypeAdapter((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = 1;
    Object v1 = 1;
    Object v2 = new com.google.gson.DefaultDateTypeAdapter((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((com.google.gson.TypeAdapter)v2).nullSafe();
    Object v4 = java.io.Writer.nullWriter();
    Object v5 = com.google.gson.internal.Streams.writerForAppendable(((java.lang.Appendable)v4));
    Object v6 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v5));
    Object v7 = -2;
    Object v8 = 30;
    Object v9 = 0;
    Object v10 = 0;
    Object v11 = 8;
    Object v12 = 15;
    Object v13 = new java.util.Date((((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = 7;
    ((java.util.Date)v13).setDate((((java.lang.Integer)v14).intValue()));
    Object v15 = null;
    ((com.google.gson.DefaultDateTypeAdapter)v2).write(((com.google.gson.stream.JsonWriter)v6),((java.util.Date)v13));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = java.text.DateFormat.getDateInstance();
    Object v2 = java.text.DateFormat.getDateInstance();
    Object v3 = new com.google.gson.DefaultDateTypeAdapter(((java.lang.Class)v0),((java.text.DateFormat)v1),((java.text.DateFormat)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = 1;
    Object v1 = 1;
    Object v2 = new com.google.gson.DefaultDateTypeAdapter((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = java.io.Writer.nullWriter();
    Object v4 = com.google.gson.internal.Streams.writerForAppendable(((java.lang.Appendable)v3));
    Object v5 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v4));
    Object v6 = -2;
    Object v7 = 30;
    Object v8 = 0;
    Object v9 = 0;
    Object v10 = 8;
    Object v11 = 15;
    Object v12 = new java.util.Date((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = -41;
    ((java.util.Date)v12).setMinutes((((java.lang.Integer)v13).intValue()));
    Object v14 = null;
    ((com.google.gson.DefaultDateTypeAdapter)v2).write(((com.google.gson.stream.JsonWriter)v5),((java.util.Date)v12));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = 1;
    Object v1 = 1;
    Object v2 = new com.google.gson.DefaultDateTypeAdapter((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((com.google.gson.DefaultDateTypeAdapter)v2).toString();
    org.junit.Assert.assertEquals((Object)("DefaultDateTypeAdapter(SimpleDateFormat)"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = 0;
    Object v2 = new com.google.gson.DefaultDateTypeAdapter((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((com.google.gson.TypeAdapter)v2).nullSafe();
    Object v4 = ((com.google.gson.TypeAdapter)v3).nullSafe();
    Object v5 = false;
    Object v6 = new com.google.gson.JsonPrimitive(((java.lang.Boolean)v5));
    Object v7 = ((com.google.gson.TypeAdapter)v3).toJsonTree(((java.lang.Object)v6));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = 0;
    Object v2 = new com.google.gson.DefaultDateTypeAdapter((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((com.google.gson.TypeAdapter)v2).nullSafe();
    Object v4 = ((com.google.gson.TypeAdapter)v3).nullSafe();
    Object v5 = ((com.google.gson.TypeAdapter)v4).nullSafe();
    Object v6 = null;
    Object v7 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v6));
    Object v8 = ((com.google.gson.TypeAdapter)v4).toJsonTree(((java.lang.Object)v7));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = 0;
    Object v2 = new com.google.gson.DefaultDateTypeAdapter((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((com.google.gson.TypeAdapter)v2).nullSafe();
    Object v4 = 15;
    Object v5 = new java.text.ParsePosition((((java.lang.Integer)v4).intValue()));
    Object v6 = ((com.google.gson.TypeAdapter)v3).toJson(((java.lang.Object)v5));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = 1;
    Object v2 = new com.google.gson.DefaultDateTypeAdapter((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = java.io.Reader.nullReader();
    Object v4 = ((com.google.gson.TypeAdapter)v2).fromJson(((java.io.Reader)v3));
      org.junit.Assert.fail("Expected java.io.EOFException");
    } catch (java.io.EOFException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = 0;
    Object v2 = new com.google.gson.DefaultDateTypeAdapter((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = java.io.Writer.nullWriter();
    Object v4 = com.google.gson.internal.Streams.writerForAppendable(((java.lang.Appendable)v3));
    Object v5 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v4));
    Object v6 = -2;
    Object v7 = 30;
    Object v8 = 0;
    Object v9 = 0;
    Object v10 = 8;
    Object v11 = 15;
    Object v12 = new java.util.Date((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    ((com.google.gson.DefaultDateTypeAdapter)v2).write(((com.google.gson.stream.JsonWriter)v5),((java.util.Date)v12));
    Object v13 = null;
    Object v14 = java.io.Reader.nullReader();
    Object v15 = new com.google.gson.stream.JsonReader(((java.io.Reader)v14));
    Object v16 = ((com.google.gson.stream.JsonReader)v15).getPath();
    Object v17 = ((com.google.gson.DefaultDateTypeAdapter)v2).read(((com.google.gson.stream.JsonReader)v15));
      org.junit.Assert.fail("Expected java.io.EOFException");
    } catch (java.io.EOFException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = 1;
    Object v1 = 1;
    Object v2 = new com.google.gson.DefaultDateTypeAdapter((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((com.google.gson.DefaultDateTypeAdapter)v2).toString();
    Object v4 = java.io.Writer.nullWriter();
    Object v5 = com.google.gson.internal.Streams.writerForAppendable(((java.lang.Appendable)v4));
    Object v6 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v5));
    Object v7 = -2;
    Object v8 = 30;
    Object v9 = 0;
    Object v10 = 0;
    Object v11 = 8;
    Object v12 = 15;
    Object v13 = new java.util.Date((((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = ((java.util.Date)v13).getDay();
    ((com.google.gson.DefaultDateTypeAdapter)v2).write(((com.google.gson.stream.JsonWriter)v6),((java.util.Date)v13));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = 1;
    Object v1 = 1;
    Object v2 = new com.google.gson.DefaultDateTypeAdapter((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((com.google.gson.TypeAdapter)v2).nullSafe();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = 69;
    Object v1 = 1;
    Object v2 = new com.google.gson.DefaultDateTypeAdapter((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = 0;
    Object v2 = new com.google.gson.DefaultDateTypeAdapter((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((com.google.gson.TypeAdapter)v2).nullSafe();
    Object v4 = java.io.Reader.nullReader();
    Object v5 = ((com.google.gson.TypeAdapter)v3).fromJson(((java.io.Reader)v4));
      org.junit.Assert.fail("Expected java.io.EOFException");
    } catch (java.io.EOFException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = 0;
    Object v2 = new com.google.gson.DefaultDateTypeAdapter((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((com.google.gson.TypeAdapter)v2).nullSafe();
    Object v4 = ((com.google.gson.TypeAdapter)v3).nullSafe();
    Object v5 = ((com.google.gson.TypeAdapter)v4).nullSafe();
    Object v6 = java.io.Reader.nullReader();
    Object v7 = new com.google.gson.stream.JsonReader(((java.io.Reader)v6));
    Object v8 = ((com.google.gson.TypeAdapter)v5).toJson(((java.lang.Object)v7));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = 1;
    Object v2 = new com.google.gson.DefaultDateTypeAdapter((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((com.google.gson.TypeAdapter)v2).nullSafe();
    Object v4 = " to Json";
    Object v5 = ((com.google.gson.TypeAdapter)v3).fromJson(((java.lang.String)v4));
      org.junit.Assert.fail("Expected com.google.gson.stream.MalformedJsonException");
    } catch (com.google.gson.stream.MalformedJsonException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = 1;
    Object v2 = new com.google.gson.DefaultDateTypeAdapter((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((com.google.gson.DefaultDateTypeAdapter)v2).toString();
    Object v4 = java.io.Reader.nullReader();
    Object v5 = new com.google.gson.stream.JsonReader(((java.io.Reader)v4));
    Object v6 = ((com.google.gson.stream.JsonReader)v5).getPath();
    Object v7 = ((com.google.gson.DefaultDateTypeAdapter)v2).read(((com.google.gson.stream.JsonReader)v5));
      org.junit.Assert.fail("Expected java.io.EOFException");
    } catch (java.io.EOFException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = 1;
    Object v2 = new com.google.gson.DefaultDateTypeAdapter((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = java.io.Writer.nullWriter();
    Object v4 = com.google.gson.internal.Streams.writerForAppendable(((java.lang.Appendable)v3));
    Object v5 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v4));
    Object v6 = true;
    Object v7 = ((com.google.gson.stream.JsonWriter)v5).value(((java.lang.Boolean)v6));
    Object v8 = -2;
    Object v9 = 30;
    Object v10 = 0;
    Object v11 = 0;
    Object v12 = 8;
    Object v13 = 15;
    Object v14 = new java.util.Date((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    ((com.google.gson.DefaultDateTypeAdapter)v2).write(((com.google.gson.stream.JsonWriter)v5),((java.util.Date)v14));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = 1;
    Object v2 = new com.google.gson.DefaultDateTypeAdapter((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((com.google.gson.TypeAdapter)v2).nullSafe();
    Object v4 = 15;
    Object v5 = new java.text.ParsePosition((((java.lang.Integer)v4).intValue()));
    Object v6 = ((com.google.gson.TypeAdapter)v3).toJsonTree(((java.lang.Object)v5));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = 1;
    Object v2 = new com.google.gson.DefaultDateTypeAdapter((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = java.io.Reader.nullReader();
    Object v4 = new com.google.gson.stream.JsonReader(((java.io.Reader)v3));
    Object v5 = ((com.google.gson.TypeAdapter)v2).toJsonTree(((java.lang.Object)v4));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = 1;
    Object v2 = new com.google.gson.DefaultDateTypeAdapter((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((com.google.gson.TypeAdapter)v2).nullSafe();
    Object v4 = "Y_";
    Object v5 = ((com.google.gson.TypeAdapter)v3).fromJson(((java.lang.String)v4));
      org.junit.Assert.fail("Expected com.google.gson.stream.MalformedJsonException");
    } catch (com.google.gson.stream.MalformedJsonException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = 1;
    Object v1 = 1;
    Object v2 = new com.google.gson.DefaultDateTypeAdapter((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = java.io.Writer.nullWriter();
    Object v4 = com.google.gson.internal.Streams.writerForAppendable(((java.lang.Appendable)v3));
    Object v5 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v4));
    Object v6 = -2;
    Object v7 = 30;
    Object v8 = 0;
    Object v9 = 0;
    Object v10 = 8;
    Object v11 = 15;
    Object v12 = new java.util.Date((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = ((java.util.Date)v12).getDate();
    ((com.google.gson.DefaultDateTypeAdapter)v2).write(((com.google.gson.stream.JsonWriter)v5),((java.util.Date)v12));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = 1;
    Object v1 = 1;
    Object v2 = new com.google.gson.DefaultDateTypeAdapter((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((com.google.gson.TypeAdapter)v2).nullSafe();
    Object v4 = ((com.google.gson.TypeAdapter)v3).nullSafe();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = 1;
    Object v2 = new com.google.gson.DefaultDateTypeAdapter((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((com.google.gson.TypeAdapter)v2).nullSafe();
    Object v4 = ((com.google.gson.TypeAdapter)v3).nullSafe();
    Object v5 = ((com.google.gson.TypeAdapter)v4).nullSafe();
    Object v6 = ",p";
    Object v7 = ((com.google.gson.TypeAdapter)v4).fromJson(((java.lang.String)v6));
      org.junit.Assert.fail("Expected com.google.gson.stream.MalformedJsonException");
    } catch (com.google.gson.stream.MalformedJsonException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = 1;
    Object v2 = new com.google.gson.DefaultDateTypeAdapter((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((com.google.gson.TypeAdapter)v2).nullSafe();
    Object v4 = ((com.google.gson.TypeAdapter)v3).nullSafe();
    Object v5 = java.io.Writer.nullWriter();
    Object v6 = com.google.gson.internal.Streams.writerForAppendable(((java.lang.Appendable)v5));
    Object v7 = java.io.Reader.nullReader();
    ((com.google.gson.TypeAdapter)v4).toJson(((java.io.Writer)v6),((java.lang.Object)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = 1;
    Object v1 = 0;
    Object v2 = new com.google.gson.DefaultDateTypeAdapter((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = -3;
    Object v2 = new com.google.gson.DefaultDateTypeAdapter((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = 1;
    Object v2 = new com.google.gson.DefaultDateTypeAdapter((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 1;
    Object v4 = 1;
    Object v5 = new com.google.gson.DefaultDateTypeAdapter((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((com.google.gson.TypeAdapter)v5).nullSafe();
    Object v7 = ((com.google.gson.TypeAdapter)v6).nullSafe();
    Object v8 = ((com.google.gson.TypeAdapter)v2).toJsonTree(((java.lang.Object)v7));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = 1;
    Object v2 = new com.google.gson.DefaultDateTypeAdapter((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((com.google.gson.TypeAdapter)v2).nullSafe();
    Object v4 = ((com.google.gson.TypeAdapter)v3).nullSafe();
    Object v5 = java.io.Writer.nullWriter();
    Object v6 = com.google.gson.internal.Streams.writerForAppendable(((java.lang.Appendable)v5));
    ((java.io.Writer)v6).flush();
    Object v7 = null;
    Object v8 = java.io.Writer.nullWriter();
    Object v9 = com.google.gson.internal.Streams.writerForAppendable(((java.lang.Appendable)v8));
    ((com.google.gson.TypeAdapter)v3).toJson(((java.io.Writer)v6),((java.lang.Object)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = 0;
    Object v2 = new com.google.gson.DefaultDateTypeAdapter((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((com.google.gson.TypeAdapter)v2).nullSafe();
    Object v4 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v5 = ((com.google.gson.TypeAdapter)v2).toJson(((java.lang.Object)v4));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = 0;
    Object v2 = new com.google.gson.DefaultDateTypeAdapter((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = java.io.Reader.nullReader();
    Object v4 = new com.google.gson.stream.JsonReader(((java.io.Reader)v3));
    Object v5 = ((com.google.gson.DefaultDateTypeAdapter)v2).read(((com.google.gson.stream.JsonReader)v4));
      org.junit.Assert.fail("Expected java.io.EOFException");
    } catch (java.io.EOFException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = 1;
    Object v1 = 1;
    Object v2 = new com.google.gson.DefaultDateTypeAdapter((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = java.io.Writer.nullWriter();
    Object v4 = com.google.gson.internal.Streams.writerForAppendable(((java.lang.Appendable)v3));
    Object v5 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v4));
    Object v6 = -2;
    Object v7 = 30;
    Object v8 = 0;
    Object v9 = 0;
    Object v10 = 8;
    Object v11 = 15;
    Object v12 = new java.util.Date((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = -10;
    ((java.util.Date)v12).setDate((((java.lang.Integer)v13).intValue()));
    Object v14 = null;
    ((com.google.gson.DefaultDateTypeAdapter)v2).write(((com.google.gson.stream.JsonWriter)v5),((java.util.Date)v12));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = 1;
    Object v1 = 0;
    Object v2 = new com.google.gson.DefaultDateTypeAdapter((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = java.io.Writer.nullWriter();
    Object v4 = com.google.gson.internal.Streams.writerForAppendable(((java.lang.Appendable)v3));
    Object v5 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v4));
    Object v6 = -2;
    Object v7 = 30;
    Object v8 = 0;
    Object v9 = 0;
    Object v10 = 8;
    Object v11 = 15;
    Object v12 = new java.util.Date((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    ((com.google.gson.DefaultDateTypeAdapter)v2).write(((com.google.gson.stream.JsonWriter)v5),((java.util.Date)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = 0;
    Object v2 = new com.google.gson.DefaultDateTypeAdapter((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = false;
    Object v4 = new com.google.gson.JsonPrimitive(((java.lang.Boolean)v3));
    Object v5 = ((com.google.gson.JsonElement)v4).getAsJsonPrimitive();
    Object v6 = ((com.google.gson.TypeAdapter)v2).fromJsonTree(((com.google.gson.JsonElement)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = 0;
    Object v2 = new com.google.gson.DefaultDateTypeAdapter((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((com.google.gson.TypeAdapter)v2).nullSafe();
    Object v4 = java.io.Writer.nullWriter();
    Object v5 = com.google.gson.internal.Streams.writerForAppendable(((java.lang.Appendable)v4));
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = com.google.gson.internal.Streams.writerForAppendable(((java.lang.Appendable)v6));
    Object v8 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v7));
    ((com.google.gson.TypeAdapter)v2).toJson(((java.io.Writer)v5),((java.lang.Object)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = 0;
    Object v2 = new com.google.gson.DefaultDateTypeAdapter((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = -2;
    Object v4 = 30;
    Object v5 = 0;
    Object v6 = 0;
    Object v7 = 8;
    Object v8 = 15;
    Object v9 = new java.util.Date((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = ((com.google.gson.TypeAdapter)v2).toJson(((java.lang.Object)v9));
    Object v11 = java.io.Writer.nullWriter();
    Object v12 = com.google.gson.internal.Streams.writerForAppendable(((java.lang.Appendable)v11));
    Object v13 = ((com.google.gson.TypeAdapter)v2).toJsonTree(((java.lang.Object)v12));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }
}
