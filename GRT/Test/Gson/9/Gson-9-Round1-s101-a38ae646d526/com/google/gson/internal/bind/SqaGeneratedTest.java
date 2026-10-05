package com.google.gson.internal.bind;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new com.google.gson.internal.bind.JsonTreeWriter();
    Object v1 = "+hh:m";
    Object v2 = ((com.google.gson.internal.bind.JsonTreeWriter)v0).value(((java.lang.String)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new com.google.gson.internal.bind.JsonTreeWriter();
    Object v1 = "+hh:m";
    Object v2 = ((com.google.gson.internal.bind.JsonTreeWriter)v0).value(((java.lang.String)v1));
    Object v3 = ((com.google.gson.internal.bind.JsonTreeWriter)v2).nullValue();
    Object v4 = ((com.google.gson.internal.bind.JsonTreeWriter)v2).get();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = new com.google.gson.internal.bind.JsonTreeWriter();
    Object v1 = "+hh:m";
    Object v2 = ((com.google.gson.internal.bind.JsonTreeWriter)v0).value(((java.lang.String)v1));
    Object v3 = "inull";
    Object v4 = ((com.google.gson.internal.bind.JsonTreeWriter)v2).name(((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new com.google.gson.internal.bind.JsonTreeWriter();
    Object v1 = "+hh:m";
    Object v2 = ((com.google.gson.internal.bind.JsonTreeWriter)v0).value(((java.lang.String)v1));
    Object v3 = 1.0D;
    Object v4 = ((com.google.gson.internal.bind.JsonTreeWriter)v2).value((((java.lang.Double)v3).doubleValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = new com.google.gson.internal.bind.JsonTreeWriter();
    Object v1 = "+hh:m";
    Object v2 = ((com.google.gson.internal.bind.JsonTreeWriter)v0).value(((java.lang.String)v1));
    Object v3 = 1.0D;
    Object v4 = ((com.google.gson.internal.bind.JsonTreeWriter)v2).value((((java.lang.Double)v3).doubleValue()));
    Object v5 = ((com.google.gson.internal.bind.JsonTreeWriter)v4).endArray();
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new com.google.gson.internal.bind.JsonTreeWriter();
    Object v1 = "+hh:m";
    Object v2 = ((com.google.gson.internal.bind.JsonTreeWriter)v0).value(((java.lang.String)v1));
    ((com.google.gson.internal.bind.JsonTreeWriter)v2).close();
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new com.google.gson.internal.bind.JsonTreeWriter();
    Object v1 = "+hh:m";
    Object v2 = ((com.google.gson.internal.bind.JsonTreeWriter)v0).value(((java.lang.String)v1));
    Object v3 = 1.0D;
    Object v4 = ((com.google.gson.internal.bind.JsonTreeWriter)v2).value((((java.lang.Double)v3).doubleValue()));
    Object v5 = 1L;
    Object v6 = ((com.google.gson.internal.bind.JsonTreeWriter)v4).value((((java.lang.Long)v5).longValue()));
    Object v7 = 7.7709953250062895D;
    Object v8 = ((com.google.gson.internal.bind.JsonTreeWriter)v4).value(((java.lang.Number)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new com.google.gson.internal.bind.JsonTreeWriter();
    Object v1 = "+hh:m";
    Object v2 = ((com.google.gson.internal.bind.JsonTreeWriter)v0).value(((java.lang.String)v1));
    Object v3 = 1.0D;
    Object v4 = ((com.google.gson.internal.bind.JsonTreeWriter)v2).value((((java.lang.Double)v3).doubleValue()));
    Object v5 = ", ";
    Object v6 = ((com.google.gson.internal.bind.JsonTreeWriter)v4).value(((java.lang.String)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new com.google.gson.internal.bind.JsonTreeWriter();
    Object v1 = "+hh:m";
    Object v2 = ((com.google.gson.internal.bind.JsonTreeWriter)v0).value(((java.lang.String)v1));
    Object v3 = 1.0D;
    Object v4 = ((com.google.gson.internal.bind.JsonTreeWriter)v2).value((((java.lang.Double)v3).doubleValue()));
    Object v5 = ", ";
    Object v6 = ((com.google.gson.internal.bind.JsonTreeWriter)v4).value(((java.lang.String)v5));
    Object v7 = ((com.google.gson.stream.JsonWriter)v6).isHtmlSafe();
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new com.google.gson.internal.bind.JsonTreeWriter();
    Object v1 = "+hh:m";
    Object v2 = ((com.google.gson.internal.bind.JsonTreeWriter)v0).value(((java.lang.String)v1));
    Object v3 = 1.0D;
    Object v4 = ((com.google.gson.internal.bind.JsonTreeWriter)v2).value((((java.lang.Double)v3).doubleValue()));
    Object v5 = ", ";
    Object v6 = ((com.google.gson.internal.bind.JsonTreeWriter)v4).value(((java.lang.String)v5));
    Object v7 = -25.193819536948084D;
    Object v8 = ((com.google.gson.internal.bind.JsonTreeWriter)v6).value(((java.lang.Number)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new com.google.gson.internal.bind.JsonTreeWriter();
    Object v1 = "+hh:m";
    Object v2 = ((com.google.gson.internal.bind.JsonTreeWriter)v0).value(((java.lang.String)v1));
    Object v3 = 1.0D;
    Object v4 = ((com.google.gson.internal.bind.JsonTreeWriter)v2).value((((java.lang.Double)v3).doubleValue()));
    Object v5 = ", ";
    Object v6 = ((com.google.gson.internal.bind.JsonTreeWriter)v4).value(((java.lang.String)v5));
    Object v7 = -25.193819536948084D;
    Object v8 = ((com.google.gson.internal.bind.JsonTreeWriter)v6).value(((java.lang.Number)v7));
    Object v9 = ((com.google.gson.internal.bind.JsonTreeWriter)v8).get();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new com.google.gson.internal.bind.JsonTreeWriter();
    Object v1 = "+hh:m";
    Object v2 = ((com.google.gson.internal.bind.JsonTreeWriter)v0).value(((java.lang.String)v1));
    Object v3 = 1.0D;
    Object v4 = ((com.google.gson.internal.bind.JsonTreeWriter)v2).value((((java.lang.Double)v3).doubleValue()));
    Object v5 = ", ";
    Object v6 = ((com.google.gson.internal.bind.JsonTreeWriter)v4).value(((java.lang.String)v5));
    Object v7 = ". Forgot to register a type adapter?";
    ((com.google.gson.stream.JsonWriter)v6).setIndent(((java.lang.String)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new com.google.gson.internal.bind.JsonTreeWriter();
    Object v1 = "+hh:m";
    Object v2 = ((com.google.gson.internal.bind.JsonTreeWriter)v0).value(((java.lang.String)v1));
    Object v3 = ((com.google.gson.internal.bind.JsonTreeWriter)v2).beginArray();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = new com.google.gson.internal.bind.JsonTreeWriter();
    Object v1 = "+hh:m";
    Object v2 = ((com.google.gson.internal.bind.JsonTreeWriter)v0).value(((java.lang.String)v1));
    Object v3 = false;
    ((com.google.gson.stream.JsonWriter)v2).setHtmlSafe((((java.lang.Boolean)v3).booleanValue()));
    Object v4 = null;
    Object v5 = "hh";
    Object v6 = ((com.google.gson.internal.bind.JsonTreeWriter)v2).name(((java.lang.String)v5));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = new com.google.gson.internal.bind.JsonTreeWriter();
    Object v1 = "+hh:m";
    Object v2 = ((com.google.gson.internal.bind.JsonTreeWriter)v0).value(((java.lang.String)v1));
    Object v3 = ((com.google.gson.internal.bind.JsonTreeWriter)v2).beginArray();
    Object v4 = ((com.google.gson.internal.bind.JsonTreeWriter)v3).endObject();
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new com.google.gson.internal.bind.JsonTreeWriter();
    Object v1 = "+hh:m";
    Object v2 = ((com.google.gson.internal.bind.JsonTreeWriter)v0).value(((java.lang.String)v1));
    Object v3 = 1.0D;
    Object v4 = ((com.google.gson.internal.bind.JsonTreeWriter)v2).value((((java.lang.Double)v3).doubleValue()));
    Object v5 = false;
    Object v6 = ((com.google.gson.internal.bind.JsonTreeWriter)v4).value(((java.lang.Boolean)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = new com.google.gson.internal.bind.JsonTreeWriter();
    Object v1 = "+hh:m";
    Object v2 = ((com.google.gson.internal.bind.JsonTreeWriter)v0).value(((java.lang.String)v1));
    Object v3 = 1.0D;
    Object v4 = ((com.google.gson.internal.bind.JsonTreeWriter)v2).value((((java.lang.Double)v3).doubleValue()));
    Object v5 = 1L;
    Object v6 = ((com.google.gson.internal.bind.JsonTreeWriter)v4).value((((java.lang.Long)v5).longValue()));
    Object v7 = 7.7709953250062895D;
    Object v8 = ((com.google.gson.internal.bind.JsonTreeWriter)v4).value(((java.lang.Number)v7));
    Object v9 = ((com.google.gson.internal.bind.JsonTreeWriter)v8).endObject();
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new com.google.gson.internal.bind.JsonTreeWriter();
    Object v1 = "+hh:m";
    Object v2 = ((com.google.gson.internal.bind.JsonTreeWriter)v0).value(((java.lang.String)v1));
    Object v3 = 1.0D;
    Object v4 = ((com.google.gson.internal.bind.JsonTreeWriter)v2).value((((java.lang.Double)v3).doubleValue()));
    Object v5 = ", ";
    Object v6 = ((com.google.gson.internal.bind.JsonTreeWriter)v4).value(((java.lang.String)v5));
    Object v7 = ((com.google.gson.stream.JsonWriter)v6).isLenient();
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new com.google.gson.internal.bind.JsonTreeWriter();
    Object v1 = "+hh:m";
    Object v2 = ((com.google.gson.internal.bind.JsonTreeWriter)v0).value(((java.lang.String)v1));
    Object v3 = true;
    Object v4 = ((com.google.gson.internal.bind.JsonTreeWriter)v2).value(((java.lang.Boolean)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new com.google.gson.internal.bind.JsonTreeWriter();
    Object v1 = "+hh:m";
    Object v2 = ((com.google.gson.internal.bind.JsonTreeWriter)v0).value(((java.lang.String)v1));
    Object v3 = 1.0D;
    Object v4 = ((com.google.gson.internal.bind.JsonTreeWriter)v2).value((((java.lang.Double)v3).doubleValue()));
    Object v5 = ", ";
    Object v6 = ((com.google.gson.internal.bind.JsonTreeWriter)v4).value(((java.lang.String)v5));
    ((com.google.gson.internal.bind.JsonTreeWriter)v6).close();
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new com.google.gson.internal.bind.JsonTreeWriter();
    Object v1 = "+hh:m";
    Object v2 = ((com.google.gson.internal.bind.JsonTreeWriter)v0).value(((java.lang.String)v1));
    Object v3 = -37.028385603128356D;
    Object v4 = ((com.google.gson.internal.bind.JsonTreeWriter)v2).value(((java.lang.Number)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new com.google.gson.internal.bind.JsonTreeWriter();
    Object v1 = "+hh:m";
    Object v2 = ((com.google.gson.internal.bind.JsonTreeWriter)v0).value(((java.lang.String)v1));
    Object v3 = true;
    Object v4 = ((com.google.gson.internal.bind.JsonTreeWriter)v2).value(((java.lang.Boolean)v3));
    Object v5 = ((com.google.gson.internal.bind.JsonTreeWriter)v4).get();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new com.google.gson.internal.bind.JsonTreeWriter();
    Object v1 = "+hh:m";
    Object v2 = ((com.google.gson.internal.bind.JsonTreeWriter)v0).value(((java.lang.String)v1));
    Object v3 = ((com.google.gson.internal.bind.JsonTreeWriter)v2).get();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new com.google.gson.internal.bind.JsonTreeWriter();
    Object v1 = "+hh:m";
    Object v2 = ((com.google.gson.internal.bind.JsonTreeWriter)v0).value(((java.lang.String)v1));
    Object v3 = ((com.google.gson.internal.bind.JsonTreeWriter)v2).beginArray();
    Object v4 = ((com.google.gson.internal.bind.JsonTreeWriter)v3).endArray();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new com.google.gson.internal.bind.JsonTreeWriter();
    Object v1 = "+hh:m";
    Object v2 = ((com.google.gson.internal.bind.JsonTreeWriter)v0).value(((java.lang.String)v1));
    Object v3 = ((com.google.gson.internal.bind.JsonTreeWriter)v2).beginArray();
    Object v4 = true;
    ((com.google.gson.stream.JsonWriter)v3).setSerializeNulls((((java.lang.Boolean)v4).booleanValue()));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new com.google.gson.internal.bind.JsonTreeWriter();
    Object v1 = "+hh:m";
    Object v2 = ((com.google.gson.internal.bind.JsonTreeWriter)v0).value(((java.lang.String)v1));
    Object v3 = -37.028385603128356D;
    Object v4 = ((com.google.gson.internal.bind.JsonTreeWriter)v2).value(((java.lang.Number)v3));
    Object v5 = true;
    ((com.google.gson.stream.JsonWriter)v4).setLenient((((java.lang.Boolean)v5).booleanValue()));
    Object v6 = null;
    Object v7 = -12.224029884762126D;
    Object v8 = ((com.google.gson.internal.bind.JsonTreeWriter)v4).value(((java.lang.Number)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new com.google.gson.internal.bind.JsonTreeWriter();
    Object v1 = "+hh:m";
    Object v2 = ((com.google.gson.internal.bind.JsonTreeWriter)v0).value(((java.lang.String)v1));
    Object v3 = 1.0D;
    Object v4 = ((com.google.gson.internal.bind.JsonTreeWriter)v2).value((((java.lang.Double)v3).doubleValue()));
    Object v5 = false;
    Object v6 = ((com.google.gson.internal.bind.JsonTreeWriter)v4).value(((java.lang.Boolean)v5));
    Object v7 = 2;
    Object v8 = ((com.google.gson.internal.bind.JsonTreeWriter)v6).value(((java.lang.Number)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = new com.google.gson.internal.bind.JsonTreeWriter();
    Object v1 = "+hh:m";
    Object v2 = ((com.google.gson.internal.bind.JsonTreeWriter)v0).value(((java.lang.String)v1));
    Object v3 = 1.0D;
    Object v4 = ((com.google.gson.internal.bind.JsonTreeWriter)v2).value((((java.lang.Double)v3).doubleValue()));
    Object v5 = ", ";
    Object v6 = ((com.google.gson.internal.bind.JsonTreeWriter)v4).value(((java.lang.String)v5));
    Object v7 = -25.193819536948084D;
    Object v8 = ((com.google.gson.internal.bind.JsonTreeWriter)v6).value(((java.lang.Number)v7));
    Object v9 = ((com.google.gson.internal.bind.JsonTreeWriter)v8).endObject();
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new com.google.gson.internal.bind.JsonTreeWriter();
    Object v1 = "+hh:m";
    Object v2 = ((com.google.gson.internal.bind.JsonTreeWriter)v0).value(((java.lang.String)v1));
    Object v3 = 1.0D;
    Object v4 = ((com.google.gson.internal.bind.JsonTreeWriter)v2).value((((java.lang.Double)v3).doubleValue()));
    Object v5 = ", ";
    Object v6 = ((com.google.gson.internal.bind.JsonTreeWriter)v4).value(((java.lang.String)v5));
    Object v7 = false;
    ((com.google.gson.stream.JsonWriter)v6).setSerializeNulls((((java.lang.Boolean)v7).booleanValue()));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = new com.google.gson.internal.bind.JsonTreeWriter();
    Object v1 = "+hh:m";
    Object v2 = ((com.google.gson.internal.bind.JsonTreeWriter)v0).value(((java.lang.String)v1));
    Object v3 = 1.0D;
    Object v4 = ((com.google.gson.internal.bind.JsonTreeWriter)v2).value((((java.lang.Double)v3).doubleValue()));
    Object v5 = false;
    Object v6 = ((com.google.gson.internal.bind.JsonTreeWriter)v4).value(((java.lang.Boolean)v5));
    Object v7 = "STRI(NG";
    Object v8 = ((com.google.gson.internal.bind.JsonTreeWriter)v6).name(((java.lang.String)v7));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new com.google.gson.internal.bind.JsonTreeWriter();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new com.google.gson.internal.bind.JsonTreeWriter();
    Object v1 = "+hh:m";
    Object v2 = ((com.google.gson.internal.bind.JsonTreeWriter)v0).value(((java.lang.String)v1));
    Object v3 = 1.0D;
    Object v4 = ((com.google.gson.internal.bind.JsonTreeWriter)v2).value((((java.lang.Double)v3).doubleValue()));
    Object v5 = 1L;
    Object v6 = ((com.google.gson.internal.bind.JsonTreeWriter)v4).value((((java.lang.Long)v5).longValue()));
    Object v7 = 7.7709953250062895D;
    Object v8 = ((com.google.gson.internal.bind.JsonTreeWriter)v4).value(((java.lang.Number)v7));
    Object v9 = "null=";
    ((com.google.gson.stream.JsonWriter)v8).setIndent(((java.lang.String)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new com.google.gson.internal.bind.JsonTreeWriter();
    Object v1 = "+hh:m";
    Object v2 = ((com.google.gson.internal.bind.JsonTreeWriter)v0).value(((java.lang.String)v1));
    Object v3 = 1.0D;
    Object v4 = ((com.google.gson.internal.bind.JsonTreeWriter)v2).value((((java.lang.Double)v3).doubleValue()));
    Object v5 = ((com.google.gson.internal.bind.JsonTreeWriter)v4).nullValue();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new com.google.gson.internal.bind.JsonTreeWriter();
    Object v1 = "+hh:m";
    Object v2 = ((com.google.gson.internal.bind.JsonTreeWriter)v0).value(((java.lang.String)v1));
    Object v3 = 1.0D;
    Object v4 = ((com.google.gson.internal.bind.JsonTreeWriter)v2).value((((java.lang.Double)v3).doubleValue()));
    Object v5 = ", ";
    Object v6 = ((com.google.gson.internal.bind.JsonTreeWriter)v4).value(((java.lang.String)v5));
    Object v7 = 1L;
    Object v8 = ((com.google.gson.internal.bind.JsonTreeWriter)v6).value((((java.lang.Long)v7).longValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new com.google.gson.internal.bind.JsonTreeWriter();
    Object v1 = "+hh:m";
    Object v2 = ((com.google.gson.internal.bind.JsonTreeWriter)v0).value(((java.lang.String)v1));
    Object v3 = -37.028385603128356D;
    Object v4 = ((com.google.gson.internal.bind.JsonTreeWriter)v2).value(((java.lang.Number)v3));
    Object v5 = true;
    ((com.google.gson.stream.JsonWriter)v4).setLenient((((java.lang.Boolean)v5).booleanValue()));
    Object v6 = null;
    Object v7 = -12.224029884762126D;
    Object v8 = ((com.google.gson.internal.bind.JsonTreeWriter)v4).value(((java.lang.Number)v7));
    Object v9 = false;
    ((com.google.gson.stream.JsonWriter)v8).setHtmlSafe((((java.lang.Boolean)v9).booleanValue()));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new com.google.gson.internal.bind.JsonTreeWriter();
    Object v1 = "+hh:m";
    Object v2 = ((com.google.gson.internal.bind.JsonTreeWriter)v0).value(((java.lang.String)v1));
    Object v3 = 1.0D;
    Object v4 = ((com.google.gson.internal.bind.JsonTreeWriter)v2).value((((java.lang.Double)v3).doubleValue()));
    Object v5 = 1L;
    Object v6 = ((com.google.gson.internal.bind.JsonTreeWriter)v4).value((((java.lang.Long)v5).longValue()));
    Object v7 = 7.7709953250062895D;
    Object v8 = ((com.google.gson.internal.bind.JsonTreeWriter)v4).value(((java.lang.Number)v7));
    Object v9 = "JsonReader is cl";
    Object v10 = ((com.google.gson.internal.bind.JsonTreeWriter)v8).value(((java.lang.String)v9));
    Object v11 = false;
    Object v12 = ((com.google.gson.internal.bind.JsonTreeWriter)v8).value(((java.lang.Boolean)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new com.google.gson.internal.bind.JsonTreeWriter();
    Object v1 = "+hh:m";
    Object v2 = ((com.google.gson.internal.bind.JsonTreeWriter)v0).value(((java.lang.String)v1));
    Object v3 = 1.0D;
    Object v4 = ((com.google.gson.internal.bind.JsonTreeWriter)v2).value((((java.lang.Double)v3).doubleValue()));
    Object v5 = 1L;
    Object v6 = ((com.google.gson.internal.bind.JsonTreeWriter)v4).value((((java.lang.Long)v5).longValue()));
    Object v7 = 7.7709953250062895D;
    Object v8 = ((com.google.gson.internal.bind.JsonTreeWriter)v4).value(((java.lang.Number)v7));
    ((com.google.gson.internal.bind.JsonTreeWriter)v8).flush();
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = new com.google.gson.internal.bind.JsonTreeWriter();
    Object v1 = "+hh:m";
    Object v2 = ((com.google.gson.internal.bind.JsonTreeWriter)v0).value(((java.lang.String)v1));
    Object v3 = 1.0D;
    Object v4 = ((com.google.gson.internal.bind.JsonTreeWriter)v2).value((((java.lang.Double)v3).doubleValue()));
    Object v5 = ", ";
    Object v6 = ((com.google.gson.internal.bind.JsonTreeWriter)v4).value(((java.lang.String)v5));
    Object v7 = ((com.google.gson.internal.bind.JsonTreeWriter)v6).endObject();
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = new com.google.gson.internal.bind.JsonTreeWriter();
    Object v1 = "+hh:m";
    Object v2 = ((com.google.gson.internal.bind.JsonTreeWriter)v0).value(((java.lang.String)v1));
    Object v3 = ((com.google.gson.internal.bind.JsonTreeWriter)v2).endObject();
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new com.google.gson.internal.bind.JsonTreeWriter();
    Object v1 = "+hh:m";
    Object v2 = ((com.google.gson.internal.bind.JsonTreeWriter)v0).value(((java.lang.String)v1));
    Object v3 = -37.028385603128356D;
    Object v4 = ((com.google.gson.internal.bind.JsonTreeWriter)v2).value(((java.lang.Number)v3));
    Object v5 = true;
    ((com.google.gson.stream.JsonWriter)v4).setLenient((((java.lang.Boolean)v5).booleanValue()));
    Object v6 = null;
    Object v7 = -12.224029884762126D;
    Object v8 = ((com.google.gson.internal.bind.JsonTreeWriter)v4).value(((java.lang.Number)v7));
    Object v9 = ((com.google.gson.stream.JsonWriter)v8).beginArray();
    Object v10 = "year";
    ((com.google.gson.stream.JsonWriter)v8).setIndent(((java.lang.String)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new com.google.gson.internal.bind.JsonTreeWriter();
    Object v1 = "+hh:m";
    Object v2 = ((com.google.gson.internal.bind.JsonTreeWriter)v0).value(((java.lang.String)v1));
    Object v3 = -37.028385603128356D;
    Object v4 = ((com.google.gson.internal.bind.JsonTreeWriter)v2).value(((java.lang.Number)v3));
    Object v5 = ((com.google.gson.stream.JsonWriter)v4).getSerializeNulls();
    org.junit.Assert.assertEquals((Object)(true), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new com.google.gson.internal.bind.JsonTreeWriter();
    Object v1 = "+hh:m";
    Object v2 = ((com.google.gson.internal.bind.JsonTreeWriter)v0).value(((java.lang.String)v1));
    Object v3 = true;
    Object v4 = ((com.google.gson.internal.bind.JsonTreeWriter)v2).value(((java.lang.Boolean)v3));
    Object v5 = "ss<s";
    Object v6 = ((com.google.gson.internal.bind.JsonTreeWriter)v4).value(((java.lang.String)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = new com.google.gson.internal.bind.JsonTreeWriter();
    Object v1 = "+hh:m";
    Object v2 = ((com.google.gson.internal.bind.JsonTreeWriter)v0).value(((java.lang.String)v1));
    Object v3 = -37.028385603128356D;
    Object v4 = ((com.google.gson.internal.bind.JsonTreeWriter)v2).value(((java.lang.Number)v3));
    Object v5 = true;
    Object v6 = ((com.google.gson.internal.bind.JsonTreeWriter)v4).value(((java.lang.Boolean)v5));
    Object v7 = ((com.google.gson.internal.bind.JsonTreeWriter)v4).endArray();
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new com.google.gson.internal.bind.JsonTreeWriter();
    Object v1 = "+hh:m";
    Object v2 = ((com.google.gson.internal.bind.JsonTreeWriter)v0).value(((java.lang.String)v1));
    Object v3 = "Incomplete document";
    ((com.google.gson.stream.JsonWriter)v2).setIndent(((java.lang.String)v3));
    Object v4 = null;
    Object v5 = ((com.google.gson.internal.bind.JsonTreeWriter)v2).get();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new com.google.gson.internal.bind.JsonTreeWriter();
    Object v1 = "+hh:m";
    Object v2 = ((com.google.gson.internal.bind.JsonTreeWriter)v0).value(((java.lang.String)v1));
    Object v3 = 1.0D;
    Object v4 = ((com.google.gson.internal.bind.JsonTreeWriter)v2).value((((java.lang.Double)v3).doubleValue()));
    Object v5 = 1L;
    Object v6 = ((com.google.gson.internal.bind.JsonTreeWriter)v4).value((((java.lang.Long)v5).longValue()));
    Object v7 = 7.7709953250062895D;
    Object v8 = ((com.google.gson.internal.bind.JsonTreeWriter)v4).value(((java.lang.Number)v7));
    Object v9 = " at6line ";
    ((com.google.gson.stream.JsonWriter)v8).setIndent(((java.lang.String)v9));
    Object v10 = null;
    Object v11 = false;
    Object v12 = ((com.google.gson.internal.bind.JsonTreeWriter)v8).value(((java.lang.Boolean)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new com.google.gson.internal.bind.JsonTreeWriter();
    Object v1 = "+hh:m";
    Object v2 = ((com.google.gson.internal.bind.JsonTreeWriter)v0).value(((java.lang.String)v1));
    Object v3 = true;
    Object v4 = ((com.google.gson.internal.bind.JsonTreeWriter)v2).value(((java.lang.Boolean)v3));
    Object v5 = "ss<s";
    Object v6 = ((com.google.gson.internal.bind.JsonTreeWriter)v4).value(((java.lang.String)v5));
    Object v7 = ",adapte=";
    Object v8 = ((com.google.gson.internal.bind.JsonTreeWriter)v6).value(((java.lang.String)v7));
    Object v9 = ((com.google.gson.internal.bind.JsonTreeWriter)v6).beginArray();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new com.google.gson.internal.bind.JsonTreeWriter();
    Object v1 = "+hh:m";
    Object v2 = ((com.google.gson.internal.bind.JsonTreeWriter)v0).value(((java.lang.String)v1));
    Object v3 = -37.028385603128356D;
    Object v4 = ((com.google.gson.internal.bind.JsonTreeWriter)v2).value(((java.lang.Number)v3));
    Object v5 = ((com.google.gson.internal.bind.JsonTreeWriter)v4).beginArray();
    Object v6 = false;
    Object v7 = ((com.google.gson.internal.bind.JsonTreeWriter)v4).value(((java.lang.Boolean)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = new com.google.gson.internal.bind.JsonTreeWriter();
    Object v1 = "+hh:m";
    Object v2 = ((com.google.gson.internal.bind.JsonTreeWriter)v0).value(((java.lang.String)v1));
    Object v3 = ((com.google.gson.internal.bind.JsonTreeWriter)v2).beginArray();
    Object v4 = ((com.google.gson.internal.bind.JsonTreeWriter)v3).get();
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new com.google.gson.internal.bind.JsonTreeWriter();
    Object v1 = "+hh:m";
    Object v2 = ((com.google.gson.internal.bind.JsonTreeWriter)v0).value(((java.lang.String)v1));
    Object v3 = true;
    Object v4 = ((com.google.gson.internal.bind.JsonTreeWriter)v2).value(((java.lang.Boolean)v3));
    Object v5 = "ss<s";
    Object v6 = ((com.google.gson.internal.bind.JsonTreeWriter)v4).value(((java.lang.String)v5));
    Object v7 = ",adapte=";
    Object v8 = ((com.google.gson.internal.bind.JsonTreeWriter)v6).value(((java.lang.String)v7));
    Object v9 = ((com.google.gson.internal.bind.JsonTreeWriter)v6).beginArray();
    Object v10 = true;
    ((com.google.gson.stream.JsonWriter)v9).setSerializeNulls((((java.lang.Boolean)v10).booleanValue()));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new com.google.gson.internal.bind.JsonTreeWriter();
    Object v1 = "+hh:m";
    Object v2 = ((com.google.gson.internal.bind.JsonTreeWriter)v0).value(((java.lang.String)v1));
    Object v3 = 1.0D;
    Object v4 = ((com.google.gson.internal.bind.JsonTreeWriter)v2).value((((java.lang.Double)v3).doubleValue()));
    Object v5 = false;
    Object v6 = ((com.google.gson.internal.bind.JsonTreeWriter)v4).value(((java.lang.Boolean)v5));
    Object v7 = 2;
    Object v8 = ((com.google.gson.internal.bind.JsonTreeWriter)v6).value(((java.lang.Number)v7));
    Object v9 = ((com.google.gson.internal.bind.JsonTreeWriter)v8).beginArray();
    Object v10 = 29.066703402487395D;
    Object v11 = ((com.google.gson.internal.bind.JsonTreeWriter)v8).value((((java.lang.Double)v10).doubleValue()));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new com.google.gson.internal.bind.JsonTreeWriter();
    Object v1 = "+hh:m";
    Object v2 = ((com.google.gson.internal.bind.JsonTreeWriter)v0).value(((java.lang.String)v1));
    Object v3 = true;
    Object v4 = ((com.google.gson.internal.bind.JsonTreeWriter)v2).value(((java.lang.Boolean)v3));
    Object v5 = "";
    Object v6 = ((com.google.gson.internal.bind.JsonTreeWriter)v4).value(((java.lang.String)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new com.google.gson.internal.bind.JsonTreeWriter();
    Object v1 = "+hh:m";
    Object v2 = ((com.google.gson.internal.bind.JsonTreeWriter)v0).value(((java.lang.String)v1));
    Object v3 = 1.0D;
    Object v4 = ((com.google.gson.internal.bind.JsonTreeWriter)v2).value((((java.lang.Double)v3).doubleValue()));
    Object v5 = false;
    Object v6 = ((com.google.gson.internal.bind.JsonTreeWriter)v4).value(((java.lang.Boolean)v5));
    Object v7 = 2;
    Object v8 = ((com.google.gson.internal.bind.JsonTreeWriter)v6).value(((java.lang.Number)v7));
    Object v9 = 1.0D;
    Object v10 = ((com.google.gson.internal.bind.JsonTreeWriter)v8).value((((java.lang.Double)v9).doubleValue()));
    Object v11 = ((com.google.gson.internal.bind.JsonTreeWriter)v8).get();
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = new com.google.gson.internal.bind.JsonTreeWriter();
    Object v1 = "+hh:m";
    Object v2 = ((com.google.gson.internal.bind.JsonTreeWriter)v0).value(((java.lang.String)v1));
    Object v3 = 1.0D;
    Object v4 = ((com.google.gson.internal.bind.JsonTreeWriter)v2).value((((java.lang.Double)v3).doubleValue()));
    Object v5 = false;
    Object v6 = ((com.google.gson.internal.bind.JsonTreeWriter)v4).value(((java.lang.Boolean)v5));
    Object v7 = 2;
    Object v8 = ((com.google.gson.internal.bind.JsonTreeWriter)v6).value(((java.lang.Number)v7));
    Object v9 = ((com.google.gson.internal.bind.JsonTreeWriter)v8).beginArray();
    Object v10 = 29.066703402487395D;
    Object v11 = ((com.google.gson.internal.bind.JsonTreeWriter)v8).value((((java.lang.Double)v10).doubleValue()));
    Object v12 = "\\u003d";
    Object v13 = ((com.google.gson.internal.bind.JsonTreeWriter)v11).name(((java.lang.String)v12));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new com.google.gson.internal.bind.JsonTreeWriter();
    Object v1 = "+hh:m";
    Object v2 = ((com.google.gson.internal.bind.JsonTreeWriter)v0).value(((java.lang.String)v1));
    Object v3 = 1.0D;
    Object v4 = ((com.google.gson.internal.bind.JsonTreeWriter)v2).value((((java.lang.Double)v3).doubleValue()));
    Object v5 = ((com.google.gson.internal.bind.JsonTreeWriter)v4).nullValue();
    Object v6 = 0L;
    Object v7 = ((com.google.gson.internal.bind.JsonTreeWriter)v5).value((((java.lang.Long)v6).longValue()));
    Object v8 = 1L;
    Object v9 = ((com.google.gson.internal.bind.JsonTreeWriter)v5).value((((java.lang.Long)v8).longValue()));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new com.google.gson.internal.bind.JsonTreeWriter();
    Object v1 = "+hh:m";
    Object v2 = ((com.google.gson.internal.bind.JsonTreeWriter)v0).value(((java.lang.String)v1));
    Object v3 = -37.028385603128356D;
    Object v4 = ((com.google.gson.internal.bind.JsonTreeWriter)v2).value(((java.lang.Number)v3));
    Object v5 = 0;
    Object v6 = ((com.google.gson.stream.JsonWriter)v4).value(((java.lang.Number)v5));
    Object v7 = " to Jso";
    ((com.google.gson.stream.JsonWriter)v4).setIndent(((java.lang.String)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new com.google.gson.internal.bind.JsonTreeWriter();
    Object v1 = "+hh:m";
    Object v2 = ((com.google.gson.internal.bind.JsonTreeWriter)v0).value(((java.lang.String)v1));
    Object v3 = true;
    Object v4 = ((com.google.gson.internal.bind.JsonTreeWriter)v2).value(((java.lang.Boolean)v3));
    Object v5 = " path ";
    ((com.google.gson.stream.JsonWriter)v4).setIndent(((java.lang.String)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new com.google.gson.internal.bind.JsonTreeWriter();
    Object v1 = "+hh:m";
    Object v2 = ((com.google.gson.internal.bind.JsonTreeWriter)v0).value(((java.lang.String)v1));
    Object v3 = 1.0D;
    Object v4 = ((com.google.gson.internal.bind.JsonTreeWriter)v2).value((((java.lang.Double)v3).doubleValue()));
    Object v5 = ((com.google.gson.internal.bind.JsonTreeWriter)v4).nullValue();
    Object v6 = 0L;
    Object v7 = ((com.google.gson.internal.bind.JsonTreeWriter)v5).value((((java.lang.Long)v6).longValue()));
    Object v8 = 1L;
    Object v9 = ((com.google.gson.internal.bind.JsonTreeWriter)v5).value((((java.lang.Long)v8).longValue()));
    Object v10 = ((com.google.gson.internal.bind.JsonTreeWriter)v9).get();
    Object v11 = "pnull";
    Object v12 = ((com.google.gson.internal.bind.JsonTreeWriter)v9).value(((java.lang.String)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new com.google.gson.internal.bind.JsonTreeWriter();
    Object v1 = "+hh:m";
    Object v2 = ((com.google.gson.internal.bind.JsonTreeWriter)v0).value(((java.lang.String)v1));
    Object v3 = 1.0D;
    Object v4 = ((com.google.gson.internal.bind.JsonTreeWriter)v2).value((((java.lang.Double)v3).doubleValue()));
    Object v5 = false;
    Object v6 = ((com.google.gson.internal.bind.JsonTreeWriter)v4).value(((java.lang.Boolean)v5));
    Object v7 = 2;
    Object v8 = ((com.google.gson.internal.bind.JsonTreeWriter)v6).value(((java.lang.Number)v7));
    Object v9 = ((com.google.gson.internal.bind.JsonTreeWriter)v8).beginArray();
    Object v10 = 29.066703402487395D;
    Object v11 = ((com.google.gson.internal.bind.JsonTreeWriter)v8).value((((java.lang.Double)v10).doubleValue()));
    Object v12 = true;
    Object v13 = ((com.google.gson.internal.bind.JsonTreeWriter)v11).value(((java.lang.Boolean)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new com.google.gson.internal.bind.JsonTreeWriter();
    Object v1 = "+hh:m";
    Object v2 = ((com.google.gson.internal.bind.JsonTreeWriter)v0).value(((java.lang.String)v1));
    Object v3 = 1.0D;
    Object v4 = ((com.google.gson.internal.bind.JsonTreeWriter)v2).value((((java.lang.Double)v3).doubleValue()));
    Object v5 = "nu5l";
    ((com.google.gson.stream.JsonWriter)v4).setIndent(((java.lang.String)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new com.google.gson.internal.bind.JsonTreeWriter();
    Object v1 = "+hh:m";
    Object v2 = ((com.google.gson.internal.bind.JsonTreeWriter)v0).value(((java.lang.String)v1));
    Object v3 = 1.0D;
    Object v4 = ((com.google.gson.internal.bind.JsonTreeWriter)v2).value((((java.lang.Double)v3).doubleValue()));
    Object v5 = ", ";
    Object v6 = ((com.google.gson.internal.bind.JsonTreeWriter)v4).value(((java.lang.String)v5));
    Object v7 = "\\f";
    Object v8 = ((com.google.gson.internal.bind.JsonTreeWriter)v6).value(((java.lang.String)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = new com.google.gson.internal.bind.JsonTreeWriter();
    Object v1 = "+hh:m";
    Object v2 = ((com.google.gson.internal.bind.JsonTreeWriter)v0).value(((java.lang.String)v1));
    Object v3 = 1.0D;
    Object v4 = ((com.google.gson.internal.bind.JsonTreeWriter)v2).value((((java.lang.Double)v3).doubleValue()));
    Object v5 = false;
    Object v6 = ((com.google.gson.internal.bind.JsonTreeWriter)v4).value(((java.lang.Boolean)v5));
    Object v7 = 2;
    Object v8 = ((com.google.gson.internal.bind.JsonTreeWriter)v6).value(((java.lang.Number)v7));
    Object v9 = ((com.google.gson.internal.bind.JsonTreeWriter)v8).beginArray();
    Object v10 = 29.066703402487395D;
    Object v11 = ((com.google.gson.internal.bind.JsonTreeWriter)v8).value((((java.lang.Double)v10).doubleValue()));
    Object v12 = true;
    Object v13 = ((com.google.gson.internal.bind.JsonTreeWriter)v11).value(((java.lang.Boolean)v12));
    Object v14 = false;
    Object v15 = ((com.google.gson.internal.bind.JsonTreeWriter)v13).value((((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((com.google.gson.internal.bind.JsonTreeWriter)v13).endObject();
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = new com.google.gson.internal.bind.JsonTreeWriter();
    Object v1 = "+hh:m";
    Object v2 = ((com.google.gson.internal.bind.JsonTreeWriter)v0).value(((java.lang.String)v1));
    Object v3 = true;
    Object v4 = ((com.google.gson.internal.bind.JsonTreeWriter)v2).value(((java.lang.Boolean)v3));
    Object v5 = "nuUll";
    Object v6 = ((com.google.gson.internal.bind.JsonTreeWriter)v4).name(((java.lang.String)v5));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new com.google.gson.internal.bind.JsonTreeWriter();
    Object v1 = "+hh:m";
    Object v2 = ((com.google.gson.internal.bind.JsonTreeWriter)v0).value(((java.lang.String)v1));
    Object v3 = 1.0D;
    Object v4 = ((com.google.gson.internal.bind.JsonTreeWriter)v2).value((((java.lang.Double)v3).doubleValue()));
    Object v5 = ", ";
    Object v6 = ((com.google.gson.internal.bind.JsonTreeWriter)v4).value(((java.lang.String)v5));
    Object v7 = 18.289317132469623D;
    Object v8 = ((com.google.gson.internal.bind.JsonTreeWriter)v6).value(((java.lang.Number)v7));
    Object v9 = 0;
    Object v10 = ((com.google.gson.internal.bind.JsonTreeWriter)v6).value(((java.lang.Number)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new com.google.gson.internal.bind.JsonTreeWriter();
    Object v1 = "+hh:m";
    Object v2 = ((com.google.gson.internal.bind.JsonTreeWriter)v0).value(((java.lang.String)v1));
    Object v3 = 1.0D;
    Object v4 = ((com.google.gson.internal.bind.JsonTreeWriter)v2).value((((java.lang.Double)v3).doubleValue()));
    Object v5 = ((com.google.gson.internal.bind.JsonTreeWriter)v4).get();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new com.google.gson.internal.bind.JsonTreeWriter();
    Object v1 = "+hh:m";
    Object v2 = ((com.google.gson.internal.bind.JsonTreeWriter)v0).value(((java.lang.String)v1));
    Object v3 = -37.028385603128356D;
    Object v4 = ((com.google.gson.internal.bind.JsonTreeWriter)v2).value(((java.lang.Number)v3));
    Object v5 = true;
    Object v6 = ((com.google.gson.internal.bind.JsonTreeWriter)v4).value(((java.lang.Boolean)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = new com.google.gson.internal.bind.JsonTreeWriter();
    Object v1 = "+hh:m";
    Object v2 = ((com.google.gson.internal.bind.JsonTreeWriter)v0).value(((java.lang.String)v1));
    Object v3 = -37.028385603128356D;
    Object v4 = ((com.google.gson.internal.bind.JsonTreeWriter)v2).value(((java.lang.Number)v3));
    Object v5 = ((com.google.gson.internal.bind.JsonTreeWriter)v4).beginArray();
    Object v6 = false;
    Object v7 = ((com.google.gson.internal.bind.JsonTreeWriter)v4).value(((java.lang.Boolean)v6));
    Object v8 = ((com.google.gson.internal.bind.JsonTreeWriter)v7).get();
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new com.google.gson.internal.bind.JsonTreeWriter();
    Object v1 = "+hh:m";
    Object v2 = ((com.google.gson.internal.bind.JsonTreeWriter)v0).value(((java.lang.String)v1));
    Object v3 = -37.028385603128356D;
    Object v4 = ((com.google.gson.internal.bind.JsonTreeWriter)v2).value(((java.lang.Number)v3));
    Object v5 = ((com.google.gson.internal.bind.JsonTreeWriter)v4).beginArray();
    Object v6 = false;
    Object v7 = ((com.google.gson.internal.bind.JsonTreeWriter)v4).value(((java.lang.Boolean)v6));
    Object v8 = false;
    Object v9 = ((com.google.gson.internal.bind.JsonTreeWriter)v7).value(((java.lang.Boolean)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new com.google.gson.internal.bind.JsonTreeWriter();
    Object v1 = "+hh:m";
    Object v2 = ((com.google.gson.internal.bind.JsonTreeWriter)v0).value(((java.lang.String)v1));
    Object v3 = "GSON cannot;serialize ";
    Object v4 = ((com.google.gson.internal.bind.JsonTreeWriter)v2).value(((java.lang.String)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new com.google.gson.internal.bind.JsonTreeWriter();
    Object v1 = "+hh:m";
    Object v2 = ((com.google.gson.internal.bind.JsonTreeWriter)v0).value(((java.lang.String)v1));
    Object v3 = 1.0D;
    Object v4 = ((com.google.gson.internal.bind.JsonTreeWriter)v2).value((((java.lang.Double)v3).doubleValue()));
    Object v5 = false;
    Object v6 = ((com.google.gson.internal.bind.JsonTreeWriter)v4).value(((java.lang.Boolean)v5));
    Object v7 = 2;
    Object v8 = ((com.google.gson.internal.bind.JsonTreeWriter)v6).value(((java.lang.Number)v7));
    Object v9 = ((com.google.gson.internal.bind.JsonTreeWriter)v8).beginArray();
    Object v10 = 29.066703402487395D;
    Object v11 = ((com.google.gson.internal.bind.JsonTreeWriter)v8).value((((java.lang.Double)v10).doubleValue()));
    Object v12 = 2.0D;
    Object v13 = ((com.google.gson.stream.JsonWriter)v11).value((((java.lang.Double)v12).doubleValue()));
    Object v14 = true;
    ((com.google.gson.stream.JsonWriter)v11).setHtmlSafe((((java.lang.Boolean)v14).booleanValue()));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new com.google.gson.internal.bind.JsonTreeWriter();
    Object v1 = "+hh:m";
    Object v2 = ((com.google.gson.internal.bind.JsonTreeWriter)v0).value(((java.lang.String)v1));
    Object v3 = 1.0D;
    Object v4 = ((com.google.gson.internal.bind.JsonTreeWriter)v2).value((((java.lang.Double)v3).doubleValue()));
    Object v5 = 1L;
    Object v6 = ((com.google.gson.internal.bind.JsonTreeWriter)v4).value((((java.lang.Long)v5).longValue()));
    Object v7 = 7.7709953250062895D;
    Object v8 = ((com.google.gson.internal.bind.JsonTreeWriter)v4).value(((java.lang.Number)v7));
    ((com.google.gson.internal.bind.JsonTreeWriter)v8).close();
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new com.google.gson.internal.bind.JsonTreeWriter();
    Object v1 = "+hh:m";
    Object v2 = ((com.google.gson.internal.bind.JsonTreeWriter)v0).value(((java.lang.String)v1));
    Object v3 = -37.028385603128356D;
    Object v4 = ((com.google.gson.internal.bind.JsonTreeWriter)v2).value(((java.lang.Number)v3));
    Object v5 = ((com.google.gson.internal.bind.JsonTreeWriter)v4).beginArray();
    Object v6 = false;
    Object v7 = ((com.google.gson.internal.bind.JsonTreeWriter)v4).value(((java.lang.Boolean)v6));
    Object v8 = false;
    Object v9 = ((com.google.gson.internal.bind.JsonTreeWriter)v7).value(((java.lang.Boolean)v8));
    Object v10 = ((com.google.gson.internal.bind.JsonTreeWriter)v9).nullValue();
    Object v11 = true;
    Object v12 = ((com.google.gson.internal.bind.JsonTreeWriter)v9).value((((java.lang.Boolean)v11).booleanValue()));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new com.google.gson.internal.bind.JsonTreeWriter();
    Object v1 = "+hh:m";
    Object v2 = ((com.google.gson.internal.bind.JsonTreeWriter)v0).value(((java.lang.String)v1));
    Object v3 = 1.0D;
    Object v4 = ((com.google.gson.internal.bind.JsonTreeWriter)v2).value((((java.lang.Double)v3).doubleValue()));
    Object v5 = ", ";
    Object v6 = ((com.google.gson.internal.bind.JsonTreeWriter)v4).value(((java.lang.String)v5));
    Object v7 = -25.193819536948084D;
    Object v8 = ((com.google.gson.internal.bind.JsonTreeWriter)v6).value(((java.lang.Number)v7));
    Object v9 = false;
    Object v10 = ((com.google.gson.internal.bind.JsonTreeWriter)v8).value((((java.lang.Boolean)v9).booleanValue()));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new com.google.gson.internal.bind.JsonTreeWriter();
    Object v1 = "+hh:m";
    Object v2 = ((com.google.gson.internal.bind.JsonTreeWriter)v0).value(((java.lang.String)v1));
    Object v3 = -37.028385603128356D;
    Object v4 = ((com.google.gson.internal.bind.JsonTreeWriter)v2).value(((java.lang.Number)v3));
    Object v5 = ((com.google.gson.internal.bind.JsonTreeWriter)v4).beginArray();
    Object v6 = false;
    Object v7 = ((com.google.gson.internal.bind.JsonTreeWriter)v4).value(((java.lang.Boolean)v6));
    Object v8 = false;
    Object v9 = ((com.google.gson.internal.bind.JsonTreeWriter)v7).value(((java.lang.Boolean)v8));
    Object v10 = ((com.google.gson.internal.bind.JsonTreeWriter)v9).endArray();
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new com.google.gson.internal.bind.JsonTreeWriter();
    Object v1 = "+hh:m";
    Object v2 = ((com.google.gson.internal.bind.JsonTreeWriter)v0).value(((java.lang.String)v1));
    Object v3 = 1.0D;
    Object v4 = ((com.google.gson.internal.bind.JsonTreeWriter)v2).value((((java.lang.Double)v3).doubleValue()));
    Object v5 = ", ";
    Object v6 = ((com.google.gson.internal.bind.JsonTreeWriter)v4).value(((java.lang.String)v5));
    Object v7 = false;
    Object v8 = ((com.google.gson.internal.bind.JsonTreeWriter)v6).value(((java.lang.Boolean)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new com.google.gson.internal.bind.JsonTreeWriter();
    Object v1 = "+hh:m";
    Object v2 = ((com.google.gson.internal.bind.JsonTreeWriter)v0).value(((java.lang.String)v1));
    Object v3 = -37.028385603128356D;
    Object v4 = ((com.google.gson.internal.bind.JsonTreeWriter)v2).value(((java.lang.Number)v3));
    Object v5 = true;
    ((com.google.gson.stream.JsonWriter)v4).setLenient((((java.lang.Boolean)v5).booleanValue()));
    Object v6 = null;
    Object v7 = -12.224029884762126D;
    Object v8 = ((com.google.gson.internal.bind.JsonTreeWriter)v4).value(((java.lang.Number)v7));
    Object v9 = 37.66615493247935D;
    Object v10 = ((com.google.gson.internal.bind.JsonTreeWriter)v8).value(((java.lang.Number)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new com.google.gson.internal.bind.JsonTreeWriter();
    Object v1 = "+hh:m";
    Object v2 = ((com.google.gson.internal.bind.JsonTreeWriter)v0).value(((java.lang.String)v1));
    Object v3 = 1.0D;
    Object v4 = ((com.google.gson.internal.bind.JsonTreeWriter)v2).value((((java.lang.Double)v3).doubleValue()));
    Object v5 = ", ";
    Object v6 = ((com.google.gson.internal.bind.JsonTreeWriter)v4).value(((java.lang.String)v5));
    Object v7 = 18.289317132469623D;
    Object v8 = ((com.google.gson.internal.bind.JsonTreeWriter)v6).value(((java.lang.Number)v7));
    Object v9 = 0;
    Object v10 = ((com.google.gson.internal.bind.JsonTreeWriter)v6).value(((java.lang.Number)v9));
    Object v11 = 0.0D;
    Object v12 = ((com.google.gson.internal.bind.JsonTreeWriter)v10).value((((java.lang.Double)v11).doubleValue()));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new com.google.gson.internal.bind.JsonTreeWriter();
    Object v1 = "+hh:m";
    Object v2 = ((com.google.gson.internal.bind.JsonTreeWriter)v0).value(((java.lang.String)v1));
    Object v3 = "GSON cannot;serialize ";
    Object v4 = ((com.google.gson.internal.bind.JsonTreeWriter)v2).value(((java.lang.String)v3));
    Object v5 = ((com.google.gson.internal.bind.JsonTreeWriter)v4).get();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new com.google.gson.internal.bind.JsonTreeWriter();
    Object v1 = "+hh:m";
    Object v2 = ((com.google.gson.internal.bind.JsonTreeWriter)v0).value(((java.lang.String)v1));
    Object v3 = 1.0D;
    Object v4 = ((com.google.gson.internal.bind.JsonTreeWriter)v2).value((((java.lang.Double)v3).doubleValue()));
    Object v5 = ", ";
    Object v6 = ((com.google.gson.internal.bind.JsonTreeWriter)v4).value(((java.lang.String)v5));
    Object v7 = 18.289317132469623D;
    Object v8 = ((com.google.gson.internal.bind.JsonTreeWriter)v6).value(((java.lang.Number)v7));
    Object v9 = 0;
    Object v10 = ((com.google.gson.internal.bind.JsonTreeWriter)v6).value(((java.lang.Number)v9));
    Object v11 = ",";
    ((com.google.gson.stream.JsonWriter)v10).setIndent(((java.lang.String)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new com.google.gson.internal.bind.JsonTreeWriter();
    Object v1 = "+hh:m";
    Object v2 = ((com.google.gson.internal.bind.JsonTreeWriter)v0).value(((java.lang.String)v1));
    Object v3 = 1.0D;
    Object v4 = ((com.google.gson.internal.bind.JsonTreeWriter)v2).value((((java.lang.Double)v3).doubleValue()));
    Object v5 = ((com.google.gson.internal.bind.JsonTreeWriter)v4).nullValue();
    Object v6 = "";
    Object v7 = ((com.google.gson.internal.bind.JsonTreeWriter)v5).value(((java.lang.String)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new com.google.gson.internal.bind.JsonTreeWriter();
    Object v1 = "+hh:m";
    Object v2 = ((com.google.gson.internal.bind.JsonTreeWriter)v0).value(((java.lang.String)v1));
    Object v3 = 1.0D;
    Object v4 = ((com.google.gson.internal.bind.JsonTreeWriter)v2).value((((java.lang.Double)v3).doubleValue()));
    Object v5 = ", ";
    Object v6 = ((com.google.gson.internal.bind.JsonTreeWriter)v4).value(((java.lang.String)v5));
    Object v7 = 1L;
    Object v8 = ((com.google.gson.internal.bind.JsonTreeWriter)v6).value((((java.lang.Long)v7).longValue()));
    ((com.google.gson.internal.bind.JsonTreeWriter)v8).close();
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new com.google.gson.internal.bind.JsonTreeWriter();
    Object v1 = "+hh:m";
    Object v2 = ((com.google.gson.internal.bind.JsonTreeWriter)v0).value(((java.lang.String)v1));
    Object v3 = 1.0D;
    Object v4 = ((com.google.gson.internal.bind.JsonTreeWriter)v2).value((((java.lang.Double)v3).doubleValue()));
    Object v5 = ((com.google.gson.internal.bind.JsonTreeWriter)v4).nullValue();
    Object v6 = 0L;
    Object v7 = ((com.google.gson.internal.bind.JsonTreeWriter)v5).value((((java.lang.Long)v6).longValue()));
    Object v8 = 1L;
    Object v9 = ((com.google.gson.internal.bind.JsonTreeWriter)v5).value((((java.lang.Long)v8).longValue()));
    ((com.google.gson.internal.bind.JsonTreeWriter)v9).close();
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new com.google.gson.internal.bind.JsonTreeWriter();
    Object v1 = "+hh:m";
    Object v2 = ((com.google.gson.internal.bind.JsonTreeWriter)v0).value(((java.lang.String)v1));
    Object v3 = 1.0D;
    Object v4 = ((com.google.gson.internal.bind.JsonTreeWriter)v2).value((((java.lang.Double)v3).doubleValue()));
    Object v5 = ", ";
    Object v6 = ((com.google.gson.internal.bind.JsonTreeWriter)v4).value(((java.lang.String)v5));
    Object v7 = "\\f";
    Object v8 = ((com.google.gson.internal.bind.JsonTreeWriter)v6).value(((java.lang.String)v7));
    Object v9 = "null";
    ((com.google.gson.stream.JsonWriter)v8).setIndent(((java.lang.String)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = new com.google.gson.internal.bind.JsonTreeWriter();
    Object v1 = "+hh:m";
    Object v2 = ((com.google.gson.internal.bind.JsonTreeWriter)v0).value(((java.lang.String)v1));
    Object v3 = -37.028385603128356D;
    Object v4 = ((com.google.gson.internal.bind.JsonTreeWriter)v2).value(((java.lang.Number)v3));
    Object v5 = ((com.google.gson.internal.bind.JsonTreeWriter)v4).beginArray();
    Object v6 = false;
    Object v7 = ((com.google.gson.internal.bind.JsonTreeWriter)v4).value(((java.lang.Boolean)v6));
    Object v8 = false;
    Object v9 = ((com.google.gson.internal.bind.JsonTreeWriter)v7).value(((java.lang.Boolean)v8));
    Object v10 = ((com.google.gson.internal.bind.JsonTreeWriter)v9).nullValue();
    Object v11 = true;
    Object v12 = ((com.google.gson.internal.bind.JsonTreeWriter)v9).value((((java.lang.Boolean)v11).booleanValue()));
    Object v13 = ((com.google.gson.internal.bind.JsonTreeWriter)v12).endObject();
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new com.google.gson.internal.bind.JsonTreeWriter();
    Object v1 = "+hh:m";
    Object v2 = ((com.google.gson.internal.bind.JsonTreeWriter)v0).value(((java.lang.String)v1));
    Object v3 = 1.0D;
    Object v4 = ((com.google.gson.internal.bind.JsonTreeWriter)v2).value((((java.lang.Double)v3).doubleValue()));
    Object v5 = " at lne ";
    Object v6 = ((com.google.gson.internal.bind.JsonTreeWriter)v4).value(((java.lang.String)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = new com.google.gson.internal.bind.JsonTreeWriter();
    Object v1 = "+hh:m";
    Object v2 = ((com.google.gson.internal.bind.JsonTreeWriter)v0).value(((java.lang.String)v1));
    Object v3 = 1.0D;
    Object v4 = ((com.google.gson.internal.bind.JsonTreeWriter)v2).value((((java.lang.Double)v3).doubleValue()));
    Object v5 = ", ";
    Object v6 = ((com.google.gson.internal.bind.JsonTreeWriter)v4).value(((java.lang.String)v5));
    Object v7 = 1L;
    Object v8 = ((com.google.gson.internal.bind.JsonTreeWriter)v6).value((((java.lang.Long)v7).longValue()));
    Object v9 = ((com.google.gson.internal.bind.JsonTreeWriter)v8).endArray();
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new com.google.gson.internal.bind.JsonTreeWriter();
    Object v1 = "+hh:m";
    Object v2 = ((com.google.gson.internal.bind.JsonTreeWriter)v0).value(((java.lang.String)v1));
    Object v3 = 1.0D;
    Object v4 = ((com.google.gson.internal.bind.JsonTreeWriter)v2).value((((java.lang.Double)v3).doubleValue()));
    Object v5 = false;
    Object v6 = ((com.google.gson.internal.bind.JsonTreeWriter)v4).value(((java.lang.Boolean)v5));
    Object v7 = -36.8080229568046D;
    Object v8 = ((com.google.gson.internal.bind.JsonTreeWriter)v6).value(((java.lang.Number)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = new com.google.gson.internal.bind.JsonTreeWriter();
    Object v1 = "+hh:m";
    Object v2 = ((com.google.gson.internal.bind.JsonTreeWriter)v0).value(((java.lang.String)v1));
    Object v3 = -37.028385603128356D;
    Object v4 = ((com.google.gson.internal.bind.JsonTreeWriter)v2).value(((java.lang.Number)v3));
    Object v5 = "false";
    Object v6 = ((com.google.gson.internal.bind.JsonTreeWriter)v4).name(((java.lang.String)v5));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new com.google.gson.internal.bind.JsonTreeWriter();
    Object v1 = "+hh:m";
    Object v2 = ((com.google.gson.internal.bind.JsonTreeWriter)v0).value(((java.lang.String)v1));
    Object v3 = 1.0D;
    Object v4 = ((com.google.gson.internal.bind.JsonTreeWriter)v2).value((((java.lang.Double)v3).doubleValue()));
    Object v5 = false;
    Object v6 = ((com.google.gson.internal.bind.JsonTreeWriter)v4).value(((java.lang.Boolean)v5));
    Object v7 = 2;
    Object v8 = ((com.google.gson.internal.bind.JsonTreeWriter)v6).value(((java.lang.Number)v7));
    Object v9 = ((com.google.gson.internal.bind.JsonTreeWriter)v8).beginArray();
    Object v10 = 29.066703402487395D;
    Object v11 = ((com.google.gson.internal.bind.JsonTreeWriter)v8).value((((java.lang.Double)v10).doubleValue()));
    Object v12 = "Danging name: ";
    ((com.google.gson.stream.JsonWriter)v11).setIndent(((java.lang.String)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new com.google.gson.internal.bind.JsonTreeWriter();
    Object v1 = "+hh:m";
    Object v2 = ((com.google.gson.internal.bind.JsonTreeWriter)v0).value(((java.lang.String)v1));
    Object v3 = -37.028385603128356D;
    Object v4 = ((com.google.gson.internal.bind.JsonTreeWriter)v2).value(((java.lang.Number)v3));
    Object v5 = ((com.google.gson.internal.bind.JsonTreeWriter)v4).beginArray();
    Object v6 = false;
    Object v7 = ((com.google.gson.internal.bind.JsonTreeWriter)v4).value(((java.lang.Boolean)v6));
    Object v8 = false;
    Object v9 = ((com.google.gson.internal.bind.JsonTreeWriter)v7).value(((java.lang.Boolean)v8));
    Object v10 = ((com.google.gson.internal.bind.JsonTreeWriter)v9).endArray();
    Object v11 = ((com.google.gson.internal.bind.JsonTreeWriter)v10).beginObject();
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new com.google.gson.internal.bind.JsonTreeWriter();
    Object v1 = "+hh:m";
    Object v2 = ((com.google.gson.internal.bind.JsonTreeWriter)v0).value(((java.lang.String)v1));
    Object v3 = 1.0D;
    Object v4 = ((com.google.gson.internal.bind.JsonTreeWriter)v2).value((((java.lang.Double)v3).doubleValue()));
    Object v5 = false;
    Object v6 = ((com.google.gson.internal.bind.JsonTreeWriter)v4).value(((java.lang.Boolean)v5));
    Object v7 = "null";
    ((com.google.gson.stream.JsonWriter)v6).setIndent(((java.lang.String)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new com.google.gson.internal.bind.JsonTreeWriter();
    Object v1 = "+hh:m";
    Object v2 = ((com.google.gson.internal.bind.JsonTreeWriter)v0).value(((java.lang.String)v1));
    Object v3 = 1.0D;
    Object v4 = ((com.google.gson.internal.bind.JsonTreeWriter)v2).value((((java.lang.Double)v3).doubleValue()));
    Object v5 = ((com.google.gson.internal.bind.JsonTreeWriter)v4).nullValue();
    Object v6 = 0L;
    Object v7 = ((com.google.gson.internal.bind.JsonTreeWriter)v5).value((((java.lang.Long)v6).longValue()));
    Object v8 = 1L;
    Object v9 = ((com.google.gson.internal.bind.JsonTreeWriter)v5).value((((java.lang.Long)v8).longValue()));
    Object v10 = false;
    ((com.google.gson.stream.JsonWriter)v9).setHtmlSafe((((java.lang.Boolean)v10).booleanValue()));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new com.google.gson.internal.bind.JsonTreeWriter();
    Object v1 = "+hh:m";
    Object v2 = ((com.google.gson.internal.bind.JsonTreeWriter)v0).value(((java.lang.String)v1));
    Object v3 = 1.0D;
    Object v4 = ((com.google.gson.internal.bind.JsonTreeWriter)v2).value((((java.lang.Double)v3).doubleValue()));
    Object v5 = false;
    Object v6 = ((com.google.gson.internal.bind.JsonTreeWriter)v4).value(((java.lang.Boolean)v5));
    Object v7 = true;
    Object v8 = ((com.google.gson.internal.bind.JsonTreeWriter)v6).value((((java.lang.Boolean)v7).booleanValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = new com.google.gson.internal.bind.JsonTreeWriter();
    Object v1 = "+hh:m";
    Object v2 = ((com.google.gson.internal.bind.JsonTreeWriter)v0).value(((java.lang.String)v1));
    Object v3 = 1.0D;
    Object v4 = ((com.google.gson.internal.bind.JsonTreeWriter)v2).value((((java.lang.Double)v3).doubleValue()));
    Object v5 = 1L;
    Object v6 = ((com.google.gson.internal.bind.JsonTreeWriter)v4).value((((java.lang.Long)v5).longValue()));
    Object v7 = 7.7709953250062895D;
    Object v8 = ((com.google.gson.internal.bind.JsonTreeWriter)v4).value(((java.lang.Number)v7));
    Object v9 = "JsonReader is cl";
    Object v10 = ((com.google.gson.internal.bind.JsonTreeWriter)v8).value(((java.lang.String)v9));
    Object v11 = false;
    Object v12 = ((com.google.gson.internal.bind.JsonTreeWriter)v8).value(((java.lang.Boolean)v11));
    Object v13 = ((com.google.gson.internal.bind.JsonTreeWriter)v12).endArray();
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new com.google.gson.internal.bind.JsonTreeWriter();
    Object v1 = "+hh:m";
    Object v2 = ((com.google.gson.internal.bind.JsonTreeWriter)v0).value(((java.lang.String)v1));
    Object v3 = "GSON cannot;serialize ";
    Object v4 = ((com.google.gson.internal.bind.JsonTreeWriter)v2).value(((java.lang.String)v3));
    Object v5 = false;
    ((com.google.gson.stream.JsonWriter)v4).setLenient((((java.lang.Boolean)v5).booleanValue()));
    Object v6 = null;
    Object v7 = -19.459226647996203D;
    Object v8 = ((com.google.gson.internal.bind.JsonTreeWriter)v4).value((((java.lang.Double)v7).doubleValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new com.google.gson.internal.bind.JsonTreeWriter();
    Object v1 = "+hh:m";
    Object v2 = ((com.google.gson.internal.bind.JsonTreeWriter)v0).value(((java.lang.String)v1));
    Object v3 = true;
    Object v4 = ((com.google.gson.internal.bind.JsonTreeWriter)v2).value(((java.lang.Boolean)v3));
    Object v5 = "ss<s";
    Object v6 = ((com.google.gson.internal.bind.JsonTreeWriter)v4).value(((java.lang.String)v5));
    Object v7 = ((com.google.gson.stream.JsonWriter)v6).getSerializeNulls();
    org.junit.Assert.assertEquals((Object)(true), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = new com.google.gson.internal.bind.JsonTreeWriter();
    Object v1 = "+hh:m";
    Object v2 = ((com.google.gson.internal.bind.JsonTreeWriter)v0).value(((java.lang.String)v1));
    Object v3 = 1.0D;
    Object v4 = ((com.google.gson.internal.bind.JsonTreeWriter)v2).value((((java.lang.Double)v3).doubleValue()));
    Object v5 = false;
    Object v6 = ((com.google.gson.internal.bind.JsonTreeWriter)v4).value(((java.lang.Boolean)v5));
    Object v7 = -36.8080229568046D;
    Object v8 = ((com.google.gson.internal.bind.JsonTreeWriter)v6).value(((java.lang.Number)v7));
    Object v9 = ((com.google.gson.internal.bind.JsonTreeWriter)v8).endObject();
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new com.google.gson.internal.bind.JsonTreeWriter();
    Object v1 = "+hh:m";
    Object v2 = ((com.google.gson.internal.bind.JsonTreeWriter)v0).value(((java.lang.String)v1));
    Object v3 = true;
    Object v4 = ((com.google.gson.internal.bind.JsonTreeWriter)v2).value(((java.lang.Boolean)v3));
    Object v5 = "";
    Object v6 = ((com.google.gson.internal.bind.JsonTreeWriter)v4).value(((java.lang.String)v5));
    Object v7 = 1.0D;
    Object v8 = ((com.google.gson.internal.bind.JsonTreeWriter)v6).value((((java.lang.Double)v7).doubleValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new com.google.gson.internal.bind.JsonTreeWriter();
    Object v1 = "+hh:m";
    Object v2 = ((com.google.gson.internal.bind.JsonTreeWriter)v0).value(((java.lang.String)v1));
    Object v3 = 1.0D;
    Object v4 = ((com.google.gson.internal.bind.JsonTreeWriter)v2).value((((java.lang.Double)v3).doubleValue()));
    Object v5 = " at lne ";
    Object v6 = ((com.google.gson.internal.bind.JsonTreeWriter)v4).value(((java.lang.String)v5));
    Object v7 = ((com.google.gson.stream.JsonWriter)v6).isLenient();
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new com.google.gson.internal.bind.JsonTreeWriter();
    Object v1 = "+hh:m";
    Object v2 = ((com.google.gson.internal.bind.JsonTreeWriter)v0).value(((java.lang.String)v1));
    Object v3 = 1.0D;
    Object v4 = ((com.google.gson.internal.bind.JsonTreeWriter)v2).value((((java.lang.Double)v3).doubleValue()));
    Object v5 = false;
    Object v6 = ((com.google.gson.stream.JsonWriter)v4).value(((java.lang.Boolean)v5));
    Object v7 = "UTC/";
    ((com.google.gson.stream.JsonWriter)v4).setIndent(((java.lang.String)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new com.google.gson.internal.bind.JsonTreeWriter();
    Object v1 = "+hh:m";
    Object v2 = ((com.google.gson.internal.bind.JsonTreeWriter)v0).value(((java.lang.String)v1));
    Object v3 = 1.0D;
    Object v4 = ((com.google.gson.internal.bind.JsonTreeWriter)v2).value((((java.lang.Double)v3).doubleValue()));
    Object v5 = " at lne ";
    Object v6 = ((com.google.gson.internal.bind.JsonTreeWriter)v4).value(((java.lang.String)v5));
    Object v7 = " path ";
    Object v8 = ((com.google.gson.internal.bind.JsonTreeWriter)v6).value(((java.lang.String)v7));
    org.junit.Assert.assertNotNull(v8);
  }
}
