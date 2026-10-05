package com.google.gson.stream;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v2 = -11.145549761066928D;
    Object v3 = ((com.google.gson.stream.JsonWriter)v1).value((((java.lang.Double)v2).doubleValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v2 = -11.145549761066928D;
    Object v3 = ((com.google.gson.stream.JsonWriter)v1).value((((java.lang.Double)v2).doubleValue()));
    Object v4 = ((com.google.gson.stream.JsonWriter)v3).nullValue();
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = "nul?l";
    ((java.io.Writer)v0).write(((java.lang.String)v1));
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = "nul?l";
    ((java.io.Writer)v0).write(((java.lang.String)v1));
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    ((com.google.gson.stream.JsonWriter)v3).flush();
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = "nul?l";
    ((java.io.Writer)v0).write(((java.lang.String)v1));
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v4 = "key == null";
    Object v5 = ((com.google.gson.stream.JsonWriter)v3).value(((java.lang.String)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = "nul?l";
    ((java.io.Writer)v0).write(((java.lang.String)v1));
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v4 = -11.994003477728732D;
    Object v5 = ((com.google.gson.stream.JsonWriter)v3).value((((java.lang.Double)v4).doubleValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = "nul?l";
    ((java.io.Writer)v0).write(((java.lang.String)v1));
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v4 = "Inc(omplete document";
    Object v5 = ((com.google.gson.stream.JsonWriter)v3).value(((java.lang.String)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = "nul?l";
    ((java.io.Writer)v0).write(((java.lang.String)v1));
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v4 = "Inc(omplete document";
    Object v5 = ((com.google.gson.stream.JsonWriter)v3).value(((java.lang.String)v4));
    Object v6 = 1;
    Object v7 = ((com.google.gson.stream.JsonWriter)v5).value(((java.lang.Number)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v2 = -11.145549761066928D;
    Object v3 = ((com.google.gson.stream.JsonWriter)v1).value((((java.lang.Double)v2).doubleValue()));
    Object v4 = 1.0D;
    Object v5 = ((com.google.gson.stream.JsonWriter)v3).value((((java.lang.Double)v4).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = "nul?l";
    ((java.io.Writer)v0).write(((java.lang.String)v1));
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v4 = "key == null";
    Object v5 = ((com.google.gson.stream.JsonWriter)v3).value(((java.lang.String)v4));
    Object v6 = ((com.google.gson.stream.JsonWriter)v5).nullValue();
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = "nul?l";
    ((java.io.Writer)v0).write(((java.lang.String)v1));
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v4 = true;
    Object v5 = ((com.google.gson.stream.JsonWriter)v3).value((((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = "nul?l";
    ((java.io.Writer)v0).write(((java.lang.String)v1));
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v4 = "Inc(omplete document";
    Object v5 = ((com.google.gson.stream.JsonWriter)v3).value(((java.lang.String)v4));
    ((com.google.gson.stream.JsonWriter)v5).flush();
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = "nul?l";
    ((java.io.Writer)v0).write(((java.lang.String)v1));
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v4 = true;
    Object v5 = ((com.google.gson.stream.JsonWriter)v3).value((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = 1;
    Object v7 = ((com.google.gson.stream.JsonWriter)v5).value(((java.lang.Number)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = "nul?l";
    ((java.io.Writer)v0).write(((java.lang.String)v1));
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v4 = "key == null";
    Object v5 = ((com.google.gson.stream.JsonWriter)v3).value(((java.lang.String)v4));
    Object v6 = false;
    ((com.google.gson.stream.JsonWriter)v5).setHtmlSafe((((java.lang.Boolean)v6).booleanValue()));
    Object v7 = null;
    Object v8 = ((com.google.gson.stream.JsonWriter)v5).nullValue();
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v2 = -11.145549761066928D;
    Object v3 = ((com.google.gson.stream.JsonWriter)v1).value((((java.lang.Double)v2).doubleValue()));
    Object v4 = "Factory[type=";
    Object v5 = ((com.google.gson.stream.JsonWriter)v3).jsonValue(((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = "nul?l";
    ((java.io.Writer)v0).write(((java.lang.String)v1));
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v4 = "key == null";
    Object v5 = ((com.google.gson.stream.JsonWriter)v3).value(((java.lang.String)v4));
    Object v6 = " pat";
    Object v7 = ((com.google.gson.stream.JsonWriter)v5).name(((java.lang.String)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = "nul?l";
    ((java.io.Writer)v0).write(((java.lang.String)v1));
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v4 = "Inc(omplete document";
    Object v5 = ((com.google.gson.stream.JsonWriter)v3).value(((java.lang.String)v4));
    Object v6 = 0L;
    Object v7 = ((com.google.gson.stream.JsonWriter)v5).value((((java.lang.Long)v6).longValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = "nul?l";
    ((java.io.Writer)v0).write(((java.lang.String)v1));
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v4 = "key == null";
    Object v5 = ((com.google.gson.stream.JsonWriter)v3).value(((java.lang.String)v4));
    Object v6 = " pat";
    Object v7 = ((com.google.gson.stream.JsonWriter)v5).name(((java.lang.String)v6));
    ((com.google.gson.stream.JsonWriter)v7).close();
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = "nul?l";
    ((java.io.Writer)v0).write(((java.lang.String)v1));
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v4 = "key == null";
    Object v5 = ((com.google.gson.stream.JsonWriter)v3).value(((java.lang.String)v4));
    ((com.google.gson.stream.JsonWriter)v5).flush();
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = "nul?l";
    ((java.io.Writer)v0).write(((java.lang.String)v1));
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v4 = "Inc(omplete document";
    Object v5 = ((com.google.gson.stream.JsonWriter)v3).value(((java.lang.String)v4));
    Object v6 = 0.0D;
    Object v7 = ((com.google.gson.stream.JsonWriter)v5).value((((java.lang.Double)v6).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = "nul?l";
    ((java.io.Writer)v0).write(((java.lang.String)v1));
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v4 = " path ";
    Object v5 = ((com.google.gson.stream.JsonWriter)v3).name(((java.lang.String)v4));
    Object v6 = ((com.google.gson.stream.JsonWriter)v3).endObject();
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = "nul?l";
    ((java.io.Writer)v0).write(((java.lang.String)v1));
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v4 = "key == null";
    Object v5 = ((com.google.gson.stream.JsonWriter)v3).value(((java.lang.String)v4));
    Object v6 = " pat";
    Object v7 = ((com.google.gson.stream.JsonWriter)v5).name(((java.lang.String)v6));
    Object v8 = true;
    ((com.google.gson.stream.JsonWriter)v7).setSerializeNulls((((java.lang.Boolean)v8).booleanValue()));
    Object v9 = null;
    Object v10 = -1.2640006340451055D;
    Object v11 = ((com.google.gson.stream.JsonWriter)v7).value((((java.lang.Double)v10).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = "nul?l";
    ((java.io.Writer)v0).write(((java.lang.String)v1));
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v4 = ((com.google.gson.stream.JsonWriter)v3).beginObject();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = "nul?l";
    ((java.io.Writer)v0).write(((java.lang.String)v1));
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v4 = ((com.google.gson.stream.JsonWriter)v3).beginObject();
    ((com.google.gson.stream.JsonWriter)v4).flush();
    Object v5 = null;
    Object v6 = " bt was ";
    ((com.google.gson.stream.JsonWriter)v4).setIndent(((java.lang.String)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = "nul?l";
    ((java.io.Writer)v0).write(((java.lang.String)v1));
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v4 = "Inc(omplete document";
    Object v5 = ((com.google.gson.stream.JsonWriter)v3).value(((java.lang.String)v4));
    Object v6 = false;
    ((com.google.gson.stream.JsonWriter)v5).setHtmlSafe((((java.lang.Boolean)v6).booleanValue()));
    Object v7 = null;
    Object v8 = ((com.google.gson.stream.JsonWriter)v5).nullValue();
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = "nul?l";
    ((java.io.Writer)v0).write(((java.lang.String)v1));
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v4 = "Inc(omplete document";
    Object v5 = ((com.google.gson.stream.JsonWriter)v3).value(((java.lang.String)v4));
    Object v6 = true;
    ((com.google.gson.stream.JsonWriter)v5).setSerializeNulls((((java.lang.Boolean)v6).booleanValue()));
    Object v7 = null;
    ((com.google.gson.stream.JsonWriter)v5).close();
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = "nul?l";
    ((java.io.Writer)v0).write(((java.lang.String)v1));
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v4 = "key == null";
    Object v5 = ((com.google.gson.stream.JsonWriter)v3).value(((java.lang.String)v4));
    Object v6 = " pat";
    Object v7 = ((com.google.gson.stream.JsonWriter)v5).name(((java.lang.String)v6));
    Object v8 = "null";
    ((com.google.gson.stream.JsonWriter)v7).setIndent(((java.lang.String)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = "nul?l";
    ((java.io.Writer)v0).write(((java.lang.String)v1));
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v4 = "Expected null but was ";
    Object v5 = ((com.google.gson.stream.JsonWriter)v3).name(((java.lang.String)v4));
    Object v6 = 0;
    Object v7 = ((com.google.gson.stream.JsonWriter)v3).value(((java.lang.Number)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = "nul?l";
    ((java.io.Writer)v0).write(((java.lang.String)v1));
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v4 = "Inc(omplete document";
    Object v5 = ((com.google.gson.stream.JsonWriter)v3).value(((java.lang.String)v4));
    Object v6 = false;
    ((com.google.gson.stream.JsonWriter)v5).setHtmlSafe((((java.lang.Boolean)v6).booleanValue()));
    Object v7 = null;
    Object v8 = true;
    Object v9 = ((com.google.gson.stream.JsonWriter)v5).value((((java.lang.Boolean)v8).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = "nul?l";
    ((java.io.Writer)v0).write(((java.lang.String)v1));
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v4 = "key == null";
    Object v5 = ((com.google.gson.stream.JsonWriter)v3).value(((java.lang.String)v4));
    Object v6 = " pat";
    Object v7 = ((com.google.gson.stream.JsonWriter)v5).name(((java.lang.String)v6));
    Object v8 = false;
    ((com.google.gson.stream.JsonWriter)v7).setLenient((((java.lang.Boolean)v8).booleanValue()));
    Object v9 = null;
    Object v10 = ((com.google.gson.stream.JsonWriter)v7).nullValue();
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = "nul?l";
    ((java.io.Writer)v0).write(((java.lang.String)v1));
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v4 = "JSON forbids NaN and infinities: ";
    Object v5 = ((com.google.gson.stream.JsonWriter)v3).jsonValue(((java.lang.String)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = "nul?l";
    ((java.io.Writer)v0).write(((java.lang.String)v1));
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v4 = "JSON forbids NaN and infinities: ";
    Object v5 = ((com.google.gson.stream.JsonWriter)v3).jsonValue(((java.lang.String)v4));
    Object v6 = 27.546105304647437D;
    Object v7 = ((com.google.gson.stream.JsonWriter)v5).value(((java.lang.Number)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = "nul?l";
    ((java.io.Writer)v0).write(((java.lang.String)v1));
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v4 = "getConstructorI";
    Object v5 = ((com.google.gson.stream.JsonWriter)v3).value(((java.lang.String)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = "nul?l";
    ((java.io.Writer)v0).write(((java.lang.String)v1));
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v4 = "JSON forbids NaN and infinities: ";
    Object v5 = ((com.google.gson.stream.JsonWriter)v3).jsonValue(((java.lang.String)v4));
    ((com.google.gson.stream.JsonWriter)v5).close();
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = "nul?l";
    ((java.io.Writer)v0).write(((java.lang.String)v1));
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v4 = ((com.google.gson.stream.JsonWriter)v3).beginObject();
    Object v5 = ((com.google.gson.stream.JsonWriter)v4).nullValue();
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = "nul?l";
    ((java.io.Writer)v0).write(((java.lang.String)v1));
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v4 = "Inc(omplete document";
    Object v5 = ((com.google.gson.stream.JsonWriter)v3).value(((java.lang.String)v4));
    Object v6 = false;
    ((com.google.gson.stream.JsonWriter)v5).setLenient((((java.lang.Boolean)v6).booleanValue()));
    Object v7 = null;
    Object v8 = ((com.google.gson.stream.JsonWriter)v5).beginArray();
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = "nul?l";
    ((java.io.Writer)v0).write(((java.lang.String)v1));
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v4 = "Inc(omplete document";
    Object v5 = ((com.google.gson.stream.JsonWriter)v3).value(((java.lang.String)v4));
    ((com.google.gson.stream.JsonWriter)v5).close();
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = "nul?l";
    ((java.io.Writer)v0).write(((java.lang.String)v1));
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v4 = "key == null";
    Object v5 = ((com.google.gson.stream.JsonWriter)v3).value(((java.lang.String)v4));
    Object v6 = " pat";
    Object v7 = ((com.google.gson.stream.JsonWriter)v5).name(((java.lang.String)v6));
    Object v8 = 0;
    Object v9 = ((com.google.gson.stream.JsonWriter)v7).value(((java.lang.Number)v8));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = "nul?l";
    ((java.io.Writer)v0).write(((java.lang.String)v1));
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v4 = "null";
    ((com.google.gson.stream.JsonWriter)v3).setIndent(((java.lang.String)v4));
    Object v5 = null;
    Object v6 = 1;
    Object v7 = ((com.google.gson.stream.JsonWriter)v3).value(((java.lang.Number)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = "nul?l";
    ((java.io.Writer)v0).write(((java.lang.String)v1));
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v4 = "key == null";
    Object v5 = ((com.google.gson.stream.JsonWriter)v3).value(((java.lang.String)v4));
    Object v6 = "Unterminted escape sequence";
    Object v7 = ((com.google.gson.stream.JsonWriter)v5).name(((java.lang.String)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = "nul?l";
    ((java.io.Writer)v0).write(((java.lang.String)v1));
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v4 = ((com.google.gson.stream.JsonWriter)v3).beginObject();
    Object v5 = ((com.google.gson.stream.JsonWriter)v4).isHtmlSafe();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = "nul?l";
    ((java.io.Writer)v0).write(((java.lang.String)v1));
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v4 = "key == null";
    Object v5 = ((com.google.gson.stream.JsonWriter)v3).value(((java.lang.String)v4));
    Object v6 = "Unterminted escape sequence";
    Object v7 = ((com.google.gson.stream.JsonWriter)v5).name(((java.lang.String)v6));
    Object v8 = true;
    ((com.google.gson.stream.JsonWriter)v7).setLenient((((java.lang.Boolean)v8).booleanValue()));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = "nul?l";
    ((java.io.Writer)v0).write(((java.lang.String)v1));
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v4 = "key == null";
    Object v5 = ((com.google.gson.stream.JsonWriter)v3).value(((java.lang.String)v4));
    Object v6 = "Unterminted escape sequence";
    Object v7 = ((com.google.gson.stream.JsonWriter)v5).name(((java.lang.String)v6));
    ((com.google.gson.stream.JsonWriter)v7).flush();
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = "nul?l";
    ((java.io.Writer)v0).write(((java.lang.String)v1));
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v4 = "key == null";
    Object v5 = ((com.google.gson.stream.JsonWriter)v3).value(((java.lang.String)v4));
    Object v6 = "Unterminted escape sequence";
    Object v7 = ((com.google.gson.stream.JsonWriter)v5).name(((java.lang.String)v6));
    Object v8 = true;
    Object v9 = ((com.google.gson.stream.JsonWriter)v7).value((((java.lang.Boolean)v8).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = "nul?l";
    ((java.io.Writer)v0).write(((java.lang.String)v1));
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v4 = "getConstructorI";
    Object v5 = ((com.google.gson.stream.JsonWriter)v3).value(((java.lang.String)v4));
    Object v6 = "JSON forbids NaN and infinities: ";
    Object v7 = ((com.google.gson.stream.JsonWriter)v5).name(((java.lang.String)v6));
    Object v8 = "Unterminated commen";
    Object v9 = ((com.google.gson.stream.JsonWriter)v5).name(((java.lang.String)v8));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = "nul?l";
    ((java.io.Writer)v0).write(((java.lang.String)v1));
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v4 = "key == null";
    Object v5 = ((com.google.gson.stream.JsonWriter)v3).value(((java.lang.String)v4));
    ((com.google.gson.stream.JsonWriter)v5).close();
    Object v6 = null;
    Object v7 = "\\ba";
    Object v8 = ((com.google.gson.stream.JsonWriter)v5).value(((java.lang.String)v7));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = "nul?l";
    ((java.io.Writer)v0).write(((java.lang.String)v1));
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v4 = "key == null";
    Object v5 = ((com.google.gson.stream.JsonWriter)v3).value(((java.lang.String)v4));
    Object v6 = false;
    ((com.google.gson.stream.JsonWriter)v5).setLenient((((java.lang.Boolean)v6).booleanValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = "nul?l";
    ((java.io.Writer)v0).write(((java.lang.String)v1));
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v4 = "key == null";
    Object v5 = ((com.google.gson.stream.JsonWriter)v3).value(((java.lang.String)v4));
    Object v6 = " pat";
    Object v7 = ((com.google.gson.stream.JsonWriter)v5).name(((java.lang.String)v6));
    Object v8 = true;
    Object v9 = ((com.google.gson.stream.JsonWriter)v7).value((((java.lang.Boolean)v8).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = "nul?l";
    ((java.io.Writer)v0).write(((java.lang.String)v1));
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v4 = ((com.google.gson.stream.JsonWriter)v3).nullValue();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = "nul?l";
    ((java.io.Writer)v0).write(((java.lang.String)v1));
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v4 = "getConstructorI";
    Object v5 = ((com.google.gson.stream.JsonWriter)v3).value(((java.lang.String)v4));
    Object v6 = "nul";
    Object v7 = ((com.google.gson.stream.JsonWriter)v5).name(((java.lang.String)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = "nul?l";
    ((java.io.Writer)v0).write(((java.lang.String)v1));
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v4 = "JSON forbids NaN and infinities: ";
    Object v5 = ((com.google.gson.stream.JsonWriter)v3).jsonValue(((java.lang.String)v4));
    Object v6 = true;
    ((com.google.gson.stream.JsonWriter)v5).setSerializeNulls((((java.lang.Boolean)v6).booleanValue()));
    Object v7 = null;
    Object v8 = "TRUE";
    Object v9 = ((com.google.gson.stream.JsonWriter)v5).value(((java.lang.String)v8));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = "nul?l";
    ((java.io.Writer)v0).write(((java.lang.String)v1));
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v4 = "getConstructorI";
    Object v5 = ((com.google.gson.stream.JsonWriter)v3).value(((java.lang.String)v4));
    Object v6 = "nul";
    Object v7 = ((com.google.gson.stream.JsonWriter)v5).name(((java.lang.String)v6));
    Object v8 = "\\u003d";
    Object v9 = ((com.google.gson.stream.JsonWriter)v7).jsonValue(((java.lang.String)v8));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = "nul?l";
    ((java.io.Writer)v0).write(((java.lang.String)v1));
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v4 = "getConstructorI";
    Object v5 = ((com.google.gson.stream.JsonWriter)v3).value(((java.lang.String)v4));
    Object v6 = true;
    Object v7 = ((com.google.gson.stream.JsonWriter)v5).value((((java.lang.Boolean)v6).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = "nul?l";
    ((java.io.Writer)v0).write(((java.lang.String)v1));
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v4 = "null";
    ((com.google.gson.stream.JsonWriter)v3).setIndent(((java.lang.String)v4));
    Object v5 = null;
    Object v6 = 1;
    Object v7 = ((com.google.gson.stream.JsonWriter)v3).value(((java.lang.Number)v6));
    Object v8 = -2.684676864310371D;
    Object v9 = ((com.google.gson.stream.JsonWriter)v7).value(((java.lang.Number)v8));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = "nul?l";
    ((java.io.Writer)v0).write(((java.lang.String)v1));
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v4 = "getConstructorI";
    Object v5 = ((com.google.gson.stream.JsonWriter)v3).value(((java.lang.String)v4));
    Object v6 = "nul";
    Object v7 = ((com.google.gson.stream.JsonWriter)v5).name(((java.lang.String)v6));
    Object v8 = true;
    ((com.google.gson.stream.JsonWriter)v7).setHtmlSafe((((java.lang.Boolean)v8).booleanValue()));
    Object v9 = null;
    Object v10 = 10.0D;
    Object v11 = ((com.google.gson.stream.JsonWriter)v7).value((((java.lang.Double)v10).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = "nul?l";
    ((java.io.Writer)v0).write(((java.lang.String)v1));
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v4 = "getConstructorI";
    Object v5 = ((com.google.gson.stream.JsonWriter)v3).value(((java.lang.String)v4));
    Object v6 = -61.911733981749705D;
    Object v7 = ((com.google.gson.stream.JsonWriter)v5).value((((java.lang.Double)v6).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = "nul?l";
    ((java.io.Writer)v0).write(((java.lang.String)v1));
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v4 = "getConstructorI";
    Object v5 = ((com.google.gson.stream.JsonWriter)v3).value(((java.lang.String)v4));
    Object v6 = "nul";
    Object v7 = ((com.google.gson.stream.JsonWriter)v5).name(((java.lang.String)v6));
    Object v8 = "JsonWriter is closed.";
    Object v9 = ((com.google.gson.stream.JsonWriter)v7).jsonValue(((java.lang.String)v8));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = "nul?l";
    ((java.io.Writer)v0).write(((java.lang.String)v1));
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v4 = ((com.google.gson.stream.JsonWriter)v3).beginObject();
    Object v5 = "+hh:mm";
    ((com.google.gson.stream.JsonWriter)v4).setIndent(((java.lang.String)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = -14L;
    Object v2 = new java.util.Date((((java.lang.Long)v1).longValue()));
    Object v3 = com.google.gson.internal.bind.util.ISO8601Utils.format(((java.util.Date)v2));
    Object v4 = ((java.io.Writer)v0).append(((java.lang.CharSequence)v3));
    Object v5 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = "nul?l";
    ((java.io.Writer)v0).write(((java.lang.String)v1));
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v4 = "null";
    ((com.google.gson.stream.JsonWriter)v3).setIndent(((java.lang.String)v4));
    Object v5 = null;
    Object v6 = 1;
    Object v7 = ((com.google.gson.stream.JsonWriter)v3).value(((java.lang.Number)v6));
    Object v8 = true;
    ((com.google.gson.stream.JsonWriter)v7).setHtmlSafe((((java.lang.Boolean)v8).booleanValue()));
    Object v9 = null;
    Object v10 = ((com.google.gson.stream.JsonWriter)v7).nullValue();
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = "nul?l";
    ((java.io.Writer)v0).write(((java.lang.String)v1));
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v4 = "getConstructorI";
    Object v5 = ((com.google.gson.stream.JsonWriter)v3).value(((java.lang.String)v4));
    Object v6 = "nul";
    Object v7 = ((com.google.gson.stream.JsonWriter)v5).name(((java.lang.String)v6));
    Object v8 = "TRE";
    Object v9 = ((com.google.gson.stream.JsonWriter)v7).value(((java.lang.String)v8));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = "nul?l";
    ((java.io.Writer)v0).write(((java.lang.String)v1));
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v4 = "getConstructorI";
    Object v5 = ((com.google.gson.stream.JsonWriter)v3).value(((java.lang.String)v4));
    Object v6 = "[";
    Object v7 = ((com.google.gson.stream.JsonWriter)v5).jsonValue(((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = "nul?l";
    ((java.io.Writer)v0).write(((java.lang.String)v1));
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v4 = "getConstructorI";
    Object v5 = ((com.google.gson.stream.JsonWriter)v3).value(((java.lang.String)v4));
    Object v6 = 2.0D;
    Object v7 = ((com.google.gson.stream.JsonWriter)v5).value((((java.lang.Double)v6).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = "nul?l";
    ((java.io.Writer)v0).write(((java.lang.String)v1));
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v4 = "null";
    ((com.google.gson.stream.JsonWriter)v3).setIndent(((java.lang.String)v4));
    Object v5 = null;
    Object v6 = 1;
    Object v7 = ((com.google.gson.stream.JsonWriter)v3).value(((java.lang.Number)v6));
    Object v8 = false;
    Object v9 = ((com.google.gson.stream.JsonWriter)v7).value((((java.lang.Boolean)v8).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = "nul?l";
    ((java.io.Writer)v0).write(((java.lang.String)v1));
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v4 = "getConstructorI";
    Object v5 = ((com.google.gson.stream.JsonWriter)v3).value(((java.lang.String)v4));
    Object v6 = "nul";
    Object v7 = ((com.google.gson.stream.JsonWriter)v5).name(((java.lang.String)v6));
    Object v8 = "Lrue";
    Object v9 = ((com.google.gson.stream.JsonWriter)v7).value(((java.lang.String)v8));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = "nul?l";
    ((java.io.Writer)v0).write(((java.lang.String)v1));
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    ((com.google.gson.stream.JsonWriter)v3).close();
    Object v4 = null;
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = "nul?l";
    ((java.io.Writer)v0).write(((java.lang.String)v1));
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v4 = "getConstructorI";
    Object v5 = ((com.google.gson.stream.JsonWriter)v3).value(((java.lang.String)v4));
    Object v6 = "nul";
    Object v7 = ((com.google.gson.stream.JsonWriter)v5).name(((java.lang.String)v6));
    ((com.google.gson.stream.JsonWriter)v7).flush();
    Object v8 = null;
    Object v9 = 1.0D;
    Object v10 = ((com.google.gson.stream.JsonWriter)v7).value((((java.lang.Double)v9).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = "nul?l";
    ((java.io.Writer)v0).write(((java.lang.String)v1));
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v4 = "key == null";
    Object v5 = ((com.google.gson.stream.JsonWriter)v3).value(((java.lang.String)v4));
    Object v6 = 0.0D;
    Object v7 = ((com.google.gson.stream.JsonWriter)v5).value((((java.lang.Double)v6).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = "nul?l";
    ((java.io.Writer)v0).write(((java.lang.String)v1));
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v4 = "getConstructorI";
    Object v5 = ((com.google.gson.stream.JsonWriter)v3).value(((java.lang.String)v4));
    Object v6 = "nul";
    Object v7 = ((com.google.gson.stream.JsonWriter)v5).name(((java.lang.String)v6));
    Object v8 = false;
    ((com.google.gson.stream.JsonWriter)v7).setSerializeNulls((((java.lang.Boolean)v8).booleanValue()));
    Object v9 = null;
    Object v10 = ((com.google.gson.stream.JsonWriter)v7).nullValue();
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = "nul?l";
    ((java.io.Writer)v0).write(((java.lang.String)v1));
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v4 = ((com.google.gson.stream.JsonWriter)v3).beginObject();
    Object v5 = 0.0D;
    Object v6 = ((com.google.gson.stream.JsonWriter)v4).value((((java.lang.Double)v5).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = "nul?l";
    ((java.io.Writer)v0).write(((java.lang.String)v1));
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v4 = "getConstructorI";
    Object v5 = ((com.google.gson.stream.JsonWriter)v3).value(((java.lang.String)v4));
    Object v6 = ((com.google.gson.stream.JsonWriter)v5).nullValue();
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = "nul?l";
    ((java.io.Writer)v0).write(((java.lang.String)v1));
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v4 = "getConstructorI";
    Object v5 = ((com.google.gson.stream.JsonWriter)v3).value(((java.lang.String)v4));
    Object v6 = "nul";
    Object v7 = ((com.google.gson.stream.JsonWriter)v5).name(((java.lang.String)v6));
    Object v8 = -34.66985574167622D;
    Object v9 = ((com.google.gson.stream.JsonWriter)v7).value(((java.lang.Number)v8));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = "nul?l";
    ((java.io.Writer)v0).write(((java.lang.String)v1));
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v4 = "JSON forbids NaN and infinities: ";
    Object v5 = ((com.google.gson.stream.JsonWriter)v3).jsonValue(((java.lang.String)v4));
    ((com.google.gson.stream.JsonWriter)v5).flush();
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = "nul?l";
    ((java.io.Writer)v0).write(((java.lang.String)v1));
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v4 = "key == null";
    Object v5 = ((com.google.gson.stream.JsonWriter)v3).value(((java.lang.String)v4));
    Object v6 = " pat";
    Object v7 = ((com.google.gson.stream.JsonWriter)v5).name(((java.lang.String)v6));
    Object v8 = false;
    ((com.google.gson.stream.JsonWriter)v7).setHtmlSafe((((java.lang.Boolean)v8).booleanValue()));
    Object v9 = null;
    Object v10 = "null";
    Object v11 = ((com.google.gson.stream.JsonWriter)v7).jsonValue(((java.lang.String)v10));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = "nul?l";
    ((java.io.Writer)v0).write(((java.lang.String)v1));
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v4 = "key == null";
    Object v5 = ((com.google.gson.stream.JsonWriter)v3).value(((java.lang.String)v4));
    Object v6 = "Unterminted escape sequence";
    Object v7 = ((com.google.gson.stream.JsonWriter)v5).name(((java.lang.String)v6));
    Object v8 = " path ";
    Object v9 = ((com.google.gson.stream.JsonWriter)v7).value(((java.lang.String)v8));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = "nul?l";
    ((java.io.Writer)v0).write(((java.lang.String)v1));
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v4 = "getConstructorI";
    Object v5 = ((com.google.gson.stream.JsonWriter)v3).value(((java.lang.String)v4));
    Object v6 = "nul";
    Object v7 = ((com.google.gson.stream.JsonWriter)v5).name(((java.lang.String)v6));
    Object v8 = ((com.google.gson.stream.JsonWriter)v7).nullValue();
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = -14L;
    Object v2 = new java.util.Date((((java.lang.Long)v1).longValue()));
    Object v3 = com.google.gson.internal.bind.util.ISO8601Utils.format(((java.util.Date)v2));
    Object v4 = ((java.io.Writer)v0).append(((java.lang.CharSequence)v3));
    Object v5 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v6 = ((com.google.gson.stream.JsonWriter)v5).beginArray();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = "nul?l";
    ((java.io.Writer)v0).write(((java.lang.String)v1));
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v4 = "null";
    ((com.google.gson.stream.JsonWriter)v3).setIndent(((java.lang.String)v4));
    Object v5 = null;
    Object v6 = 1;
    Object v7 = ((com.google.gson.stream.JsonWriter)v3).value(((java.lang.Number)v6));
    Object v8 = ",adapter=";
    ((com.google.gson.stream.JsonWriter)v7).setIndent(((java.lang.String)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = "nul?l";
    ((java.io.Writer)v0).write(((java.lang.String)v1));
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v4 = "getConstructorI";
    Object v5 = ((com.google.gson.stream.JsonWriter)v3).value(((java.lang.String)v4));
    Object v6 = "nul";
    Object v7 = ((com.google.gson.stream.JsonWriter)v5).name(((java.lang.String)v6));
    Object v8 = "]";
    Object v9 = ((com.google.gson.stream.JsonWriter)v7).jsonValue(((java.lang.String)v8));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = "nul?l";
    ((java.io.Writer)v0).write(((java.lang.String)v1));
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v4 = "null";
    ((com.google.gson.stream.JsonWriter)v3).setIndent(((java.lang.String)v4));
    Object v5 = null;
    Object v6 = 1;
    Object v7 = ((com.google.gson.stream.JsonWriter)v3).value(((java.lang.Number)v6));
    ((com.google.gson.stream.JsonWriter)v7).close();
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = "nul?l";
    ((java.io.Writer)v0).write(((java.lang.String)v1));
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v4 = "getConstructorI";
    Object v5 = ((com.google.gson.stream.JsonWriter)v3).value(((java.lang.String)v4));
    ((com.google.gson.stream.JsonWriter)v5).close();
    Object v6 = null;
    Object v7 = ((com.google.gson.stream.JsonWriter)v5).isLenient();
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = "nul?l";
    ((java.io.Writer)v0).write(((java.lang.String)v1));
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v4 = "null";
    ((com.google.gson.stream.JsonWriter)v3).setIndent(((java.lang.String)v4));
    Object v5 = null;
    Object v6 = 1;
    Object v7 = ((com.google.gson.stream.JsonWriter)v3).value(((java.lang.Number)v6));
    Object v8 = ((com.google.gson.stream.JsonWriter)v7).isLenient();
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = "nul?l";
    ((java.io.Writer)v0).write(((java.lang.String)v1));
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v4 = "getConstructorI";
    Object v5 = ((com.google.gson.stream.JsonWriter)v3).value(((java.lang.String)v4));
    Object v6 = true;
    ((com.google.gson.stream.JsonWriter)v5).setSerializeNulls((((java.lang.Boolean)v6).booleanValue()));
    Object v7 = null;
    Object v8 = "Expecte";
    Object v9 = ((com.google.gson.stream.JsonWriter)v5).value(((java.lang.String)v8));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = "nul?l";
    ((java.io.Writer)v0).write(((java.lang.String)v1));
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v4 = "JSON forbids NaN and infinities: ";
    Object v5 = ((com.google.gson.stream.JsonWriter)v3).jsonValue(((java.lang.String)v4));
    Object v6 = false;
    ((com.google.gson.stream.JsonWriter)v5).setLenient((((java.lang.Boolean)v6).booleanValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = "nul?l";
    ((java.io.Writer)v0).write(((java.lang.String)v1));
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v4 = "Inc(omplete document";
    Object v5 = ((com.google.gson.stream.JsonWriter)v3).value(((java.lang.String)v4));
    Object v6 = false;
    Object v7 = ((com.google.gson.stream.JsonWriter)v5).value((((java.lang.Boolean)v6).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = -14L;
    Object v2 = new java.util.Date((((java.lang.Long)v1).longValue()));
    Object v3 = com.google.gson.internal.bind.util.ISO8601Utils.format(((java.util.Date)v2));
    Object v4 = ((java.io.Writer)v0).append(((java.lang.CharSequence)v3));
    Object v5 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v6 = ((com.google.gson.stream.JsonWriter)v5).beginArray();
    Object v7 = " column ";
    Object v8 = ((com.google.gson.stream.JsonWriter)v6).name(((java.lang.String)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = -14L;
    Object v2 = new java.util.Date((((java.lang.Long)v1).longValue()));
    Object v3 = com.google.gson.internal.bind.util.ISO8601Utils.format(((java.util.Date)v2));
    Object v4 = ((java.io.Writer)v0).append(((java.lang.CharSequence)v3));
    Object v5 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v6 = ((com.google.gson.stream.JsonWriter)v5).beginArray();
    Object v7 = " column ";
    Object v8 = ((com.google.gson.stream.JsonWriter)v6).name(((java.lang.String)v7));
    Object v9 = true;
    Object v10 = ((com.google.gson.stream.JsonWriter)v8).value((((java.lang.Boolean)v9).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = "nul?l";
    ((java.io.Writer)v0).write(((java.lang.String)v1));
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v4 = "key == null";
    Object v5 = ((com.google.gson.stream.JsonWriter)v3).value(((java.lang.String)v4));
    Object v6 = "Unterminted escape sequence";
    Object v7 = ((com.google.gson.stream.JsonWriter)v5).name(((java.lang.String)v6));
    ((com.google.gson.stream.JsonWriter)v7).flush();
    Object v8 = null;
    Object v9 = " at line ";
    Object v10 = ((com.google.gson.stream.JsonWriter)v7).name(((java.lang.String)v9));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = "nul?l";
    ((java.io.Writer)v0).write(((java.lang.String)v1));
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v4 = "JSON forbids NaN and infinities: ";
    Object v5 = ((com.google.gson.stream.JsonWriter)v3).jsonValue(((java.lang.String)v4));
    Object v6 = " path ";
    Object v7 = ((com.google.gson.stream.JsonWriter)v5).name(((java.lang.String)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = -14L;
    Object v2 = new java.util.Date((((java.lang.Long)v1).longValue()));
    Object v3 = com.google.gson.internal.bind.util.ISO8601Utils.format(((java.util.Date)v2));
    Object v4 = ((java.io.Writer)v0).append(((java.lang.CharSequence)v3));
    Object v5 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v6 = true;
    Object v7 = ((com.google.gson.stream.JsonWriter)v5).value((((java.lang.Boolean)v6).booleanValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = "nul?l";
    ((java.io.Writer)v0).write(((java.lang.String)v1));
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v4 = "JSON forbids NaN and infinities: ";
    Object v5 = ((com.google.gson.stream.JsonWriter)v3).jsonValue(((java.lang.String)v4));
    Object v6 = " path ";
    Object v7 = ((com.google.gson.stream.JsonWriter)v5).name(((java.lang.String)v6));
    ((com.google.gson.stream.JsonWriter)v7).close();
    Object v8 = null;
    ((com.google.gson.stream.JsonWriter)v7).close();
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = "nul?l";
    ((java.io.Writer)v0).write(((java.lang.String)v1));
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v4 = true;
    ((com.google.gson.stream.JsonWriter)v3).setLenient((((java.lang.Boolean)v4).booleanValue()));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = "nul?l";
    ((java.io.Writer)v0).write(((java.lang.String)v1));
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v4 = "Inc(omplete document";
    Object v5 = ((com.google.gson.stream.JsonWriter)v3).value(((java.lang.String)v4));
    Object v6 = ((com.google.gson.stream.JsonWriter)v5).nullValue();
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = -14L;
    Object v2 = new java.util.Date((((java.lang.Long)v1).longValue()));
    Object v3 = com.google.gson.internal.bind.util.ISO8601Utils.format(((java.util.Date)v2));
    Object v4 = ((java.io.Writer)v0).append(((java.lang.CharSequence)v3));
    Object v5 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v6 = true;
    Object v7 = ((com.google.gson.stream.JsonWriter)v5).value((((java.lang.Boolean)v6).booleanValue()));
    Object v8 = ((com.google.gson.stream.JsonWriter)v7).nullValue();
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = "nul?l";
    ((java.io.Writer)v0).write(((java.lang.String)v1));
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v4 = "getConstructorI";
    Object v5 = ((com.google.gson.stream.JsonWriter)v3).value(((java.lang.String)v4));
    Object v6 = "nul";
    Object v7 = ((com.google.gson.stream.JsonWriter)v5).name(((java.lang.String)v6));
    Object v8 = false;
    ((com.google.gson.stream.JsonWriter)v7).setLenient((((java.lang.Boolean)v8).booleanValue()));
    Object v9 = null;
    Object v10 = ((com.google.gson.stream.JsonWriter)v7).nullValue();
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = "nul?l";
    ((java.io.Writer)v0).write(((java.lang.String)v1));
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v4 = true;
    ((com.google.gson.stream.JsonWriter)v3).setSerializeNulls((((java.lang.Boolean)v4).booleanValue()));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = "nul?l";
    ((java.io.Writer)v0).write(((java.lang.String)v1));
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v4 = "key == null";
    Object v5 = ((com.google.gson.stream.JsonWriter)v3).value(((java.lang.String)v4));
    Object v6 = "jpath ";
    Object v7 = ((com.google.gson.stream.JsonWriter)v5).name(((java.lang.String)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = "nul?l";
    ((java.io.Writer)v0).write(((java.lang.String)v1));
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v4 = "JSON forbids NaN and infinities: ";
    Object v5 = ((com.google.gson.stream.JsonWriter)v3).jsonValue(((java.lang.String)v4));
    Object v6 = " path ";
    Object v7 = ((com.google.gson.stream.JsonWriter)v5).name(((java.lang.String)v6));
    Object v8 = true;
    Object v9 = ((com.google.gson.stream.JsonWriter)v7).value((((java.lang.Boolean)v8).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = "nul?l";
    ((java.io.Writer)v0).write(((java.lang.String)v1));
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v4 = "JSON forbids NaN and infinities: ";
    Object v5 = ((com.google.gson.stream.JsonWriter)v3).jsonValue(((java.lang.String)v4));
    Object v6 = " path ";
    Object v7 = ((com.google.gson.stream.JsonWriter)v5).name(((java.lang.String)v6));
    Object v8 = "Ujnexpected type. Expected one of: ";
    Object v9 = ((com.google.gson.stream.JsonWriter)v7).value(((java.lang.String)v8));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }
}
