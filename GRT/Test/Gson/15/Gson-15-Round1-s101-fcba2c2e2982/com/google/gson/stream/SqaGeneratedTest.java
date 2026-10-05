package com.google.gson.stream;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v2 = false;
    Object v3 = ((com.google.gson.stream.JsonWriter)v1).value(((java.lang.Boolean)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v2 = false;
    Object v3 = ((com.google.gson.stream.JsonWriter)v1).value(((java.lang.Boolean)v2));
    Object v4 = 1;
    Object v5 = ((com.google.gson.stream.JsonWriter)v3).value(((java.lang.Number)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v2 = false;
    Object v3 = ((com.google.gson.stream.JsonWriter)v1).value(((java.lang.Boolean)v2));
    Object v4 = "V: ";
    Object v5 = ((com.google.gson.stream.JsonWriter)v3).name(((java.lang.String)v4));
    Object v6 = ((com.google.gson.stream.JsonWriter)v3).isLenient();
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v2 = false;
    Object v3 = ((com.google.gson.stream.JsonWriter)v1).value(((java.lang.Boolean)v2));
    Object v4 = true;
    ((com.google.gson.stream.JsonWriter)v3).setSerializeNulls((((java.lang.Boolean)v4).booleanValue()));
    Object v5 = null;
    ((com.google.gson.stream.JsonWriter)v3).flush();
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v2 = false;
    Object v3 = ((com.google.gson.stream.JsonWriter)v1).value(((java.lang.Boolean)v2));
    Object v4 = ((com.google.gson.stream.JsonWriter)v3).isHtmlSafe();
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v2 = false;
    Object v3 = ((com.google.gson.stream.JsonWriter)v1).value(((java.lang.Boolean)v2));
    Object v4 = 1.0D;
    Object v5 = ((com.google.gson.stream.JsonWriter)v3).value((((java.lang.Double)v4).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v2 = false;
    Object v3 = ((com.google.gson.stream.JsonWriter)v1).value(((java.lang.Boolean)v2));
    ((com.google.gson.stream.JsonWriter)v3).close();
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v2 = false;
    Object v3 = ((com.google.gson.stream.JsonWriter)v1).value(((java.lang.Boolean)v2));
    Object v4 = ((com.google.gson.stream.JsonWriter)v3).nullValue();
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v2 = false;
    Object v3 = ((com.google.gson.stream.JsonWriter)v1).value(((java.lang.Boolean)v2));
    Object v4 = "JsonWriter is closed'";
    ((com.google.gson.stream.JsonWriter)v3).setIndent(((java.lang.String)v4));
    Object v5 = null;
    Object v6 = false;
    Object v7 = ((com.google.gson.stream.JsonWriter)v3).value((((java.lang.Boolean)v6).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v2 = false;
    Object v3 = ((com.google.gson.stream.JsonWriter)v1).value(((java.lang.Boolean)v2));
    ((com.google.gson.stream.JsonWriter)v3).flush();
    Object v4 = null;
    Object v5 = true;
    ((com.google.gson.stream.JsonWriter)v3).setLenient((((java.lang.Boolean)v5).booleanValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v2 = false;
    Object v3 = ((com.google.gson.stream.JsonWriter)v1).value(((java.lang.Boolean)v2));
    Object v4 = "]";
    ((com.google.gson.stream.JsonWriter)v3).setIndent(((java.lang.String)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v2 = false;
    Object v3 = ((com.google.gson.stream.JsonWriter)v1).value(((java.lang.Boolean)v2));
    Object v4 = "Invalid attempt to bind an instance of ";
    Object v5 = ((com.google.gson.stream.JsonWriter)v3).jsonValue(((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v2 = false;
    Object v3 = ((com.google.gson.stream.JsonWriter)v1).value(((java.lang.Boolean)v2));
    Object v4 = "Expected BEGIN";
    ((com.google.gson.stream.JsonWriter)v3).setIndent(((java.lang.String)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v2 = false;
    Object v3 = ((com.google.gson.stream.JsonWriter)v1).value(((java.lang.Boolean)v2));
    Object v4 = 0;
    Object v5 = ((com.google.gson.stream.JsonWriter)v3).value(((java.lang.Number)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v2 = false;
    Object v3 = ((com.google.gson.stream.JsonWriter)v1).value(((java.lang.Boolean)v2));
    ((com.google.gson.stream.JsonWriter)v3).flush();
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v2 = false;
    Object v3 = ((com.google.gson.stream.JsonWriter)v1).value(((java.lang.Boolean)v2));
    ((com.google.gson.stream.JsonWriter)v3).flush();
    Object v4 = null;
    ((com.google.gson.stream.JsonWriter)v3).flush();
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v2 = false;
    Object v3 = ((com.google.gson.stream.JsonWriter)v1).value(((java.lang.Boolean)v2));
    Object v4 = -37.028385603128356D;
    Object v5 = ((com.google.gson.stream.JsonWriter)v3).value((((java.lang.Double)v4).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v2 = false;
    Object v3 = ((com.google.gson.stream.JsonWriter)v1).value(((java.lang.Boolean)v2));
    Object v4 = " but was ";
    Object v5 = ((com.google.gson.stream.JsonWriter)v3).jsonValue(((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v2 = false;
    Object v3 = ((com.google.gson.stream.JsonWriter)v1).value(((java.lang.Boolean)v2));
    Object v4 = false;
    Object v5 = ((com.google.gson.stream.JsonWriter)v3).value((((java.lang.Boolean)v4).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v2 = false;
    Object v3 = ((com.google.gson.stream.JsonWriter)v1).value(((java.lang.Boolean)v2));
    Object v4 = ":;";
    Object v5 = ((com.google.gson.stream.JsonWriter)v3).name(((java.lang.String)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v2 = false;
    Object v3 = ((com.google.gson.stream.JsonWriter)v1).value(((java.lang.Boolean)v2));
    Object v4 = "JSON forbids NaN and infini ies: ";
    Object v5 = ((com.google.gson.stream.JsonWriter)v3).value(((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v2 = false;
    Object v3 = ((com.google.gson.stream.JsonWriter)v1).value(((java.lang.Boolean)v2));
    Object v4 = ((com.google.gson.stream.JsonWriter)v3).endObject();
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v2 = false;
    Object v3 = ((com.google.gson.stream.JsonWriter)v1).value(((java.lang.Boolean)v2));
    Object v4 = ":;";
    Object v5 = ((com.google.gson.stream.JsonWriter)v3).name(((java.lang.String)v4));
    Object v6 = ((com.google.gson.stream.JsonWriter)v5).beginObject();
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v2 = false;
    Object v3 = ((com.google.gson.stream.JsonWriter)v1).value(((java.lang.Boolean)v2));
    Object v4 = ":;";
    Object v5 = ((com.google.gson.stream.JsonWriter)v3).name(((java.lang.String)v4));
    Object v6 = -13.224029884762126D;
    Object v7 = ((com.google.gson.stream.JsonWriter)v5).value((((java.lang.Double)v6).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v2 = false;
    Object v3 = ((com.google.gson.stream.JsonWriter)v1).value(((java.lang.Boolean)v2));
    Object v4 = "second";
    Object v5 = ((com.google.gson.stream.JsonWriter)v3).name(((java.lang.String)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v2 = false;
    Object v3 = ((com.google.gson.stream.JsonWriter)v1).value(((java.lang.Boolean)v2));
    Object v4 = ":;";
    Object v5 = ((com.google.gson.stream.JsonWriter)v3).name(((java.lang.String)v4));
    Object v6 = 0.0D;
    Object v7 = ((com.google.gson.stream.JsonWriter)v5).value((((java.lang.Double)v6).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v2 = false;
    Object v3 = ((com.google.gson.stream.JsonWriter)v1).value(((java.lang.Boolean)v2));
    Object v4 = "second";
    Object v5 = ((com.google.gson.stream.JsonWriter)v3).name(((java.lang.String)v4));
    Object v6 = true;
    Object v7 = ((com.google.gson.stream.JsonWriter)v5).value(((java.lang.Boolean)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v2 = false;
    Object v3 = ((com.google.gson.stream.JsonWriter)v1).value(((java.lang.Boolean)v2));
    Object v4 = ":;";
    Object v5 = ((com.google.gson.stream.JsonWriter)v3).name(((java.lang.String)v4));
    ((com.google.gson.stream.JsonWriter)v5).flush();
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v2 = false;
    Object v3 = ((com.google.gson.stream.JsonWriter)v1).value(((java.lang.Boolean)v2));
    Object v4 = ":;";
    Object v5 = ((com.google.gson.stream.JsonWriter)v3).name(((java.lang.String)v4));
    ((com.google.gson.stream.JsonWriter)v5).close();
    Object v6 = null;
    ((com.google.gson.stream.JsonWriter)v5).close();
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v2 = false;
    Object v3 = ((com.google.gson.stream.JsonWriter)v1).value(((java.lang.Boolean)v2));
    ((com.google.gson.stream.JsonWriter)v3).flush();
    Object v4 = null;
    Object v5 = 5.842533562818952D;
    Object v6 = ((com.google.gson.stream.JsonWriter)v3).value(((java.lang.Number)v5));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v2 = false;
    Object v3 = ((com.google.gson.stream.JsonWriter)v1).value(((java.lang.Boolean)v2));
    Object v4 = "second";
    Object v5 = ((com.google.gson.stream.JsonWriter)v3).name(((java.lang.String)v4));
    ((com.google.gson.stream.JsonWriter)v5).close();
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v2 = false;
    Object v3 = ((com.google.gson.stream.JsonWriter)v1).value(((java.lang.Boolean)v2));
    Object v4 = true;
    ((com.google.gson.stream.JsonWriter)v3).setLenient((((java.lang.Boolean)v4).booleanValue()));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v2 = false;
    Object v3 = ((com.google.gson.stream.JsonWriter)v1).value(((java.lang.Boolean)v2));
    Object v4 = -29.09078019977397D;
    Object v5 = ((com.google.gson.stream.JsonWriter)v3).value(((java.lang.Number)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v2 = false;
    Object v3 = ((com.google.gson.stream.JsonWriter)v1).value(((java.lang.Boolean)v2));
    Object v4 = "second";
    Object v5 = ((com.google.gson.stream.JsonWriter)v3).name(((java.lang.String)v4));
    Object v6 = 1;
    Object v7 = ((com.google.gson.stream.JsonWriter)v5).value(((java.lang.Number)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v2 = false;
    Object v3 = ((com.google.gson.stream.JsonWriter)v1).value(((java.lang.Boolean)v2));
    Object v4 = "second";
    Object v5 = ((com.google.gson.stream.JsonWriter)v3).name(((java.lang.String)v4));
    Object v6 = false;
    Object v7 = ((com.google.gson.stream.JsonWriter)v5).value(((java.lang.Boolean)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v2 = false;
    Object v3 = ((com.google.gson.stream.JsonWriter)v1).value(((java.lang.Boolean)v2));
    Object v4 = "second";
    Object v5 = ((com.google.gson.stream.JsonWriter)v3).name(((java.lang.String)v4));
    Object v6 = "seco";
    ((com.google.gson.stream.JsonWriter)v5).setIndent(((java.lang.String)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v2 = false;
    Object v3 = ((com.google.gson.stream.JsonWriter)v1).value(((java.lang.Boolean)v2));
    Object v4 = ":;";
    Object v5 = ((com.google.gson.stream.JsonWriter)v3).name(((java.lang.String)v4));
    Object v6 = true;
    Object v7 = ((com.google.gson.stream.JsonWriter)v5).value(((java.lang.Boolean)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v2 = false;
    Object v3 = ((com.google.gson.stream.JsonWriter)v1).value(((java.lang.Boolean)v2));
    Object v4 = "Expected a Class, ParameterizedType, or GenericArrayType, but <";
    Object v5 = ((com.google.gson.stream.JsonWriter)v3).name(((java.lang.String)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v2 = false;
    Object v3 = ((com.google.gson.stream.JsonWriter)v1).value(((java.lang.Boolean)v2));
    Object v4 = "Expected a Class, ParameterizedType, or GenericArrayType, but <";
    Object v5 = ((com.google.gson.stream.JsonWriter)v3).name(((java.lang.String)v4));
    Object v6 = " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValueEs() method.";
    Object v7 = ((com.google.gson.stream.JsonWriter)v5).value(((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = new char[]{};
    ((java.io.Writer)v0).write(((char[])v1));
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v2 = false;
    Object v3 = ((com.google.gson.stream.JsonWriter)v1).value(((java.lang.Boolean)v2));
    Object v4 = "Numeric values must be finite, but was ";
    ((com.google.gson.stream.JsonWriter)v3).setIndent(((java.lang.String)v4));
    Object v5 = null;
    Object v6 = ((com.google.gson.stream.JsonWriter)v3).isHtmlSafe();
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = new char[]{};
    ((java.io.Writer)v0).write(((char[])v1));
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v4 = 12.986485427952594D;
    Object v5 = ((com.google.gson.stream.JsonWriter)v3).value((((java.lang.Double)v4).doubleValue()));
    Object v6 = ((com.google.gson.stream.JsonWriter)v3).nullValue();
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = new char[]{};
    ((java.io.Writer)v0).write(((char[])v1));
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v4 = "\\\\";
    Object v5 = ((com.google.gson.stream.JsonWriter)v3).jsonValue(((java.lang.String)v4));
    Object v6 = "n";
    ((com.google.gson.stream.JsonWriter)v3).setIndent(((java.lang.String)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = new char[]{};
    ((java.io.Writer)v0).write(((char[])v1));
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v4 = true;
    Object v5 = ((com.google.gson.stream.JsonWriter)v3).value((((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v2 = false;
    Object v3 = ((com.google.gson.stream.JsonWriter)v1).value(((java.lang.Boolean)v2));
    Object v4 = "Expected a Class, ParameterizedType, or GenericArrayType, but <";
    Object v5 = ((com.google.gson.stream.JsonWriter)v3).name(((java.lang.String)v4));
    Object v6 = ((com.google.gson.stream.JsonWriter)v5).isLenient();
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = new char[]{};
    ((java.io.Writer)v0).write(((char[])v1));
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v4 = 1.0D;
    Object v5 = ((com.google.gson.stream.JsonWriter)v3).value((((java.lang.Double)v4).doubleValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = new char[]{};
    ((java.io.Writer)v0).write(((char[])v1));
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v4 = 1.0D;
    Object v5 = ((com.google.gson.stream.JsonWriter)v3).value((((java.lang.Double)v4).doubleValue()));
    Object v6 = false;
    Object v7 = ((com.google.gson.stream.JsonWriter)v5).value((((java.lang.Boolean)v6).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = new char[]{};
    ((java.io.Writer)v0).write(((char[])v1));
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v4 = ((com.google.gson.stream.JsonWriter)v3).nullValue();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v2 = false;
    Object v3 = ((com.google.gson.stream.JsonWriter)v1).value(((java.lang.Boolean)v2));
    Object v4 = ":;";
    Object v5 = ((com.google.gson.stream.JsonWriter)v3).name(((java.lang.String)v4));
    Object v6 = -5L;
    Object v7 = ((com.google.gson.stream.JsonWriter)v5).value((((java.lang.Long)v6).longValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = new char[]{};
    ((java.io.Writer)v0).write(((char[])v1));
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v4 = 1.0D;
    Object v5 = ((com.google.gson.stream.JsonWriter)v3).value((((java.lang.Double)v4).doubleValue()));
    Object v6 = "> is of type ";
    ((com.google.gson.stream.JsonWriter)v5).setIndent(((java.lang.String)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = new char[]{};
    ((java.io.Writer)v0).write(((char[])v1));
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v4 = 1.0D;
    Object v5 = ((com.google.gson.stream.JsonWriter)v3).value((((java.lang.Double)v4).doubleValue()));
    Object v6 = "Unterminated string";
    Object v7 = ((com.google.gson.stream.JsonWriter)v5).value(((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v2 = false;
    Object v3 = ((com.google.gson.stream.JsonWriter)v1).value(((java.lang.Boolean)v2));
    Object v4 = ":;";
    Object v5 = ((com.google.gson.stream.JsonWriter)v3).name(((java.lang.String)v4));
    Object v6 = ((com.google.gson.stream.JsonWriter)v5).nullValue();
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v2 = false;
    Object v3 = ((com.google.gson.stream.JsonWriter)v1).value(((java.lang.Boolean)v2));
    Object v4 = "second";
    Object v5 = ((com.google.gson.stream.JsonWriter)v3).name(((java.lang.String)v4));
    Object v6 = -7.938109820623371D;
    Object v7 = ((com.google.gson.stream.JsonWriter)v5).value(((java.lang.Number)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v2 = false;
    Object v3 = ((com.google.gson.stream.JsonWriter)v1).value(((java.lang.Boolean)v2));
    Object v4 = ":;";
    Object v5 = ((com.google.gson.stream.JsonWriter)v3).name(((java.lang.String)v4));
    Object v6 = "GSO cannot handle ";
    Object v7 = ((com.google.gson.stream.JsonWriter)v5).jsonValue(((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = new char[]{};
    ((java.io.Writer)v0).write(((char[])v1));
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v4 = 1.0D;
    Object v5 = ((com.google.gson.stream.JsonWriter)v3).value((((java.lang.Double)v4).doubleValue()));
    Object v6 = false;
    ((com.google.gson.stream.JsonWriter)v5).setLenient((((java.lang.Boolean)v6).booleanValue()));
    Object v7 = null;
    Object v8 = true;
    ((com.google.gson.stream.JsonWriter)v5).setLenient((((java.lang.Boolean)v8).booleanValue()));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v2 = false;
    Object v3 = ((com.google.gson.stream.JsonWriter)v1).value(((java.lang.Boolean)v2));
    Object v4 = "second";
    Object v5 = ((com.google.gson.stream.JsonWriter)v3).name(((java.lang.String)v4));
    Object v6 = "\\u003c";
    ((com.google.gson.stream.JsonWriter)v5).setIndent(((java.lang.String)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v2 = false;
    Object v3 = ((com.google.gson.stream.JsonWriter)v1).value(((java.lang.Boolean)v2));
    Object v4 = "second";
    Object v5 = ((com.google.gson.stream.JsonWriter)v3).name(((java.lang.String)v4));
    Object v6 = "\"";
    ((com.google.gson.stream.JsonWriter)v5).setIndent(((java.lang.String)v6));
    Object v7 = null;
    Object v8 = 1.0D;
    Object v9 = ((com.google.gson.stream.JsonWriter)v5).value((((java.lang.Double)v8).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v2 = false;
    Object v3 = ((com.google.gson.stream.JsonWriter)v1).value(((java.lang.Boolean)v2));
    Object v4 = "second";
    Object v5 = ((com.google.gson.stream.JsonWriter)v3).name(((java.lang.String)v4));
    Object v6 = true;
    ((com.google.gson.stream.JsonWriter)v5).setHtmlSafe((((java.lang.Boolean)v6).booleanValue()));
    Object v7 = null;
    Object v8 = ".sss";
    Object v9 = ((com.google.gson.stream.JsonWriter)v5).value(((java.lang.String)v8));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v2 = false;
    Object v3 = ((com.google.gson.stream.JsonWriter)v1).value(((java.lang.Boolean)v2));
    Object v4 = "Expected a Class, ParameterizedType, or GenericArrayType, but <";
    Object v5 = ((com.google.gson.stream.JsonWriter)v3).name(((java.lang.String)v4));
    Object v6 = "*/";
    ((com.google.gson.stream.JsonWriter)v5).setIndent(((java.lang.String)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v2 = false;
    Object v3 = ((com.google.gson.stream.JsonWriter)v1).value(((java.lang.Boolean)v2));
    Object v4 = ":;";
    Object v5 = ((com.google.gson.stream.JsonWriter)v3).name(((java.lang.String)v4));
    Object v6 = ((com.google.gson.stream.JsonWriter)v5).endObject();
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v2 = false;
    Object v3 = ((com.google.gson.stream.JsonWriter)v1).value(((java.lang.Boolean)v2));
    Object v4 = false;
    ((com.google.gson.stream.JsonWriter)v3).setHtmlSafe((((java.lang.Boolean)v4).booleanValue()));
    Object v5 = null;
    Object v6 = "Expected an int but was ";
    Object v7 = ((com.google.gson.stream.JsonWriter)v3).jsonValue(((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v2 = false;
    Object v3 = ((com.google.gson.stream.JsonWriter)v1).value(((java.lang.Boolean)v2));
    Object v4 = "Expected a Class, ParameterizedType, or GenericArrayType, but <";
    Object v5 = ((com.google.gson.stream.JsonWriter)v3).name(((java.lang.String)v4));
    Object v6 = "nuUll";
    ((com.google.gson.stream.JsonWriter)v5).setIndent(((java.lang.String)v6));
    Object v7 = null;
    Object v8 = "Failed parsing JSON source: ";
    Object v9 = ((com.google.gson.stream.JsonWriter)v5).jsonValue(((java.lang.String)v8));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v2 = false;
    Object v3 = ((com.google.gson.stream.JsonWriter)v1).value(((java.lang.Boolean)v2));
    Object v4 = "_";
    ((com.google.gson.stream.JsonWriter)v3).setIndent(((java.lang.String)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = new char[]{};
    ((java.io.Writer)v0).write(((char[])v1));
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v4 = 1.0D;
    Object v5 = ((com.google.gson.stream.JsonWriter)v3).value((((java.lang.Double)v4).doubleValue()));
    Object v6 = true;
    ((com.google.gson.stream.JsonWriter)v5).setHtmlSafe((((java.lang.Boolean)v6).booleanValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = new char[]{};
    ((java.io.Writer)v0).write(((char[])v1));
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v4 = true;
    Object v5 = ((com.google.gson.stream.JsonWriter)v3).value((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = "JSON forbids NaN and infinities: ";
    Object v7 = ((com.google.gson.stream.JsonWriter)v5).jsonValue(((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = new char[]{};
    ((java.io.Writer)v0).write(((char[])v1));
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v4 = ((com.google.gson.stream.JsonWriter)v3).nullValue();
    Object v5 = ((com.google.gson.stream.JsonWriter)v4).beginObject();
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v2 = false;
    Object v3 = ((com.google.gson.stream.JsonWriter)v1).value(((java.lang.Boolean)v2));
    Object v4 = "Expected a Class, ParameterizedType, or GenericArrayType, but <";
    Object v5 = ((com.google.gson.stream.JsonWriter)v3).name(((java.lang.String)v4));
    Object v6 = 22.56300951831926D;
    Object v7 = ((com.google.gson.stream.JsonWriter)v5).value((((java.lang.Double)v6).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v2 = false;
    Object v3 = ((com.google.gson.stream.JsonWriter)v1).value(((java.lang.Boolean)v2));
    Object v4 = "Expected a Class, ParameterizedType, or GenericArrayType, but <";
    Object v5 = ((com.google.gson.stream.JsonWriter)v3).name(((java.lang.String)v4));
    Object v6 = -4.590906364056657D;
    Object v7 = ((com.google.gson.stream.JsonWriter)v5).value(((java.lang.Number)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = new char[]{};
    ((java.io.Writer)v0).write(((char[])v1));
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v4 = 1.0D;
    Object v5 = ((com.google.gson.stream.JsonWriter)v3).value((((java.lang.Double)v4).doubleValue()));
    Object v6 = "NUL";
    Object v7 = ((com.google.gson.stream.JsonWriter)v5).value(((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = new char[]{};
    ((java.io.Writer)v0).write(((char[])v1));
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v4 = "Nesting problem.";
    Object v5 = ((com.google.gson.stream.JsonWriter)v3).jsonValue(((java.lang.String)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = new char[]{};
    ((java.io.Writer)v0).write(((char[])v1));
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v4 = 2L;
    Object v5 = ((com.google.gson.stream.JsonWriter)v3).value((((java.lang.Long)v4).longValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = new char[]{};
    ((java.io.Writer)v0).write(((char[])v1));
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v4 = ((com.google.gson.stream.JsonWriter)v3).nullValue();
    Object v5 = false;
    Object v6 = ((com.google.gson.stream.JsonWriter)v4).value((((java.lang.Boolean)v5).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = new char[]{};
    ((java.io.Writer)v0).write(((char[])v1));
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v4 = "Nesting problem.";
    Object v5 = ((com.google.gson.stream.JsonWriter)v3).jsonValue(((java.lang.String)v4));
    Object v6 = "LULL";
    Object v7 = ((com.google.gson.stream.JsonWriter)v5).value(((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v2 = false;
    Object v3 = ((com.google.gson.stream.JsonWriter)v1).value(((java.lang.Boolean)v2));
    Object v4 = ":;";
    Object v5 = ((com.google.gson.stream.JsonWriter)v3).name(((java.lang.String)v4));
    ((com.google.gson.stream.JsonWriter)v5).close();
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = new char[]{};
    ((java.io.Writer)v0).write(((char[])v1));
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v4 = "Nesting problem.";
    Object v5 = ((com.google.gson.stream.JsonWriter)v3).jsonValue(((java.lang.String)v4));
    Object v6 = "";
    Object v7 = ((com.google.gson.stream.JsonWriter)v5).name(((java.lang.String)v6));
    Object v8 = false;
    Object v9 = ((com.google.gson.stream.JsonWriter)v5).value(((java.lang.Boolean)v8));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = new char[]{};
    ((java.io.Writer)v0).write(((char[])v1));
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v4 = 1.0D;
    Object v5 = ((com.google.gson.stream.JsonWriter)v3).value((((java.lang.Double)v4).doubleValue()));
    ((com.google.gson.stream.JsonWriter)v5).close();
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v2 = false;
    Object v3 = ((com.google.gson.stream.JsonWriter)v1).value(((java.lang.Boolean)v2));
    Object v4 = "Expected a Class, ParameterizedType, or GenericArrayType, but <";
    Object v5 = ((com.google.gson.stream.JsonWriter)v3).name(((java.lang.String)v4));
    ((com.google.gson.stream.JsonWriter)v5).close();
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = new char[]{};
    ((java.io.Writer)v0).write(((char[])v1));
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v4 = "Nesting problem.";
    Object v5 = ((com.google.gson.stream.JsonWriter)v3).jsonValue(((java.lang.String)v4));
    Object v6 = false;
    ((com.google.gson.stream.JsonWriter)v5).setSerializeNulls((((java.lang.Boolean)v6).booleanValue()));
    Object v7 = null;
    Object v8 = "Expected an int but was ";
    Object v9 = ((com.google.gson.stream.JsonWriter)v5).name(((java.lang.String)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = new char[]{};
    ((java.io.Writer)v0).write(((char[])v1));
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v4 = ((com.google.gson.stream.JsonWriter)v3).getSerializeNulls();
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v2 = false;
    Object v3 = ((com.google.gson.stream.JsonWriter)v1).value(((java.lang.Boolean)v2));
    Object v4 = ":;";
    Object v5 = ((com.google.gson.stream.JsonWriter)v3).name(((java.lang.String)v4));
    Object v6 = false;
    ((com.google.gson.stream.JsonWriter)v5).setLenient((((java.lang.Boolean)v6).booleanValue()));
    Object v7 = null;
    Object v8 = 1;
    Object v9 = ((com.google.gson.stream.JsonWriter)v5).value(((java.lang.Number)v8));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v2 = false;
    Object v3 = ((com.google.gson.stream.JsonWriter)v1).value(((java.lang.Boolean)v2));
    Object v4 = "second";
    Object v5 = ((com.google.gson.stream.JsonWriter)v3).name(((java.lang.String)v4));
    Object v6 = "]";
    Object v7 = ((com.google.gson.stream.JsonWriter)v5).name(((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v2 = false;
    Object v3 = ((com.google.gson.stream.JsonWriter)v1).value(((java.lang.Boolean)v2));
    Object v4 = "Expected a Class, ParameterizedType, or GenericArrayType, but <";
    Object v5 = ((com.google.gson.stream.JsonWriter)v3).name(((java.lang.String)v4));
    Object v6 = -17.098204302328156D;
    Object v7 = ((com.google.gson.stream.JsonWriter)v5).value(((java.lang.Number)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = new char[]{};
    ((java.io.Writer)v0).write(((char[])v1));
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v4 = "Nesting problem.";
    Object v5 = ((com.google.gson.stream.JsonWriter)v3).jsonValue(((java.lang.String)v4));
    Object v6 = 1.6217533261707011D;
    Object v7 = ((com.google.gson.stream.JsonWriter)v5).value((((java.lang.Double)v6).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = new char[]{};
    ((java.io.Writer)v0).write(((char[])v1));
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v4 = "Expected BEGIN_ARRAY but was ";
    Object v5 = ((com.google.gson.stream.JsonWriter)v3).jsonValue(((java.lang.String)v4));
    Object v6 = "{";
    Object v7 = ((com.google.gson.stream.JsonWriter)v3).name(((java.lang.String)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = new char[]{};
    ((java.io.Writer)v0).write(((char[])v1));
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v4 = true;
    Object v5 = ((com.google.gson.stream.JsonWriter)v3).value((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = true;
    Object v7 = ((com.google.gson.stream.JsonWriter)v5).value(((java.lang.Boolean)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v2 = false;
    Object v3 = ((com.google.gson.stream.JsonWriter)v1).value(((java.lang.Boolean)v2));
    Object v4 = "Expected a Class, ParameterizedType, or GenericArrayType, but <";
    Object v5 = ((com.google.gson.stream.JsonWriter)v3).name(((java.lang.String)v4));
    ((com.google.gson.stream.JsonWriter)v5).flush();
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v2 = false;
    Object v3 = ((com.google.gson.stream.JsonWriter)v1).value(((java.lang.Boolean)v2));
    Object v4 = "Expected a Class, ParameterizedType, or GenericArrayType, but <";
    Object v5 = ((com.google.gson.stream.JsonWriter)v3).name(((java.lang.String)v4));
    Object v6 = "nlull";
    Object v7 = ((com.google.gson.stream.JsonWriter)v5).name(((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = new char[]{};
    ((java.io.Writer)v0).write(((char[])v1));
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v4 = "Nesting problem.";
    Object v5 = ((com.google.gson.stream.JsonWriter)v3).jsonValue(((java.lang.String)v4));
    ((com.google.gson.stream.JsonWriter)v5).close();
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v2 = false;
    Object v3 = ((com.google.gson.stream.JsonWriter)v1).value(((java.lang.Boolean)v2));
    Object v4 = "Expected a Class, ParameterizedType, or GenericArrayType, but <";
    Object v5 = ((com.google.gson.stream.JsonWriter)v3).name(((java.lang.String)v4));
    Object v6 = ((com.google.gson.stream.JsonWriter)v5).endArray();
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = new char[]{};
    ((java.io.Writer)v0).write(((char[])v1));
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v4 = "Nesting problem.";
    Object v5 = ((com.google.gson.stream.JsonWriter)v3).jsonValue(((java.lang.String)v4));
    ((com.google.gson.stream.JsonWriter)v5).flush();
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = new char[]{};
    ((java.io.Writer)v0).write(((char[])v1));
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v4 = 1.0D;
    Object v5 = ((com.google.gson.stream.JsonWriter)v3).value((((java.lang.Double)v4).doubleValue()));
    Object v6 = "null";
    Object v7 = ((com.google.gson.stream.JsonWriter)v5).value(((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v2 = false;
    Object v3 = ((com.google.gson.stream.JsonWriter)v1).value(((java.lang.Boolean)v2));
    Object v4 = "Expected a Class, ParameterizedType, or GenericArrayType, but <";
    Object v5 = ((com.google.gson.stream.JsonWriter)v3).name(((java.lang.String)v4));
    Object v6 = false;
    Object v7 = ((com.google.gson.stream.JsonWriter)v5).value(((java.lang.Boolean)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = new char[]{};
    ((java.io.Writer)v0).write(((char[])v1));
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v4 = "Expected BEGIN_ARRAY but was ";
    Object v5 = ((com.google.gson.stream.JsonWriter)v3).jsonValue(((java.lang.String)v4));
    Object v6 = "{";
    Object v7 = ((com.google.gson.stream.JsonWriter)v3).name(((java.lang.String)v6));
    Object v8 = "false";
    Object v9 = ((com.google.gson.stream.JsonWriter)v7).jsonValue(((java.lang.String)v8));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v2 = false;
    Object v3 = ((com.google.gson.stream.JsonWriter)v1).value(((java.lang.Boolean)v2));
    Object v4 = "second";
    Object v5 = ((com.google.gson.stream.JsonWriter)v3).name(((java.lang.String)v4));
    Object v6 = ((com.google.gson.stream.JsonWriter)v5).isLenient();
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v2 = false;
    Object v3 = ((com.google.gson.stream.JsonWriter)v1).value(((java.lang.Boolean)v2));
    Object v4 = "name == null";
    Object v5 = ((com.google.gson.stream.JsonWriter)v3).name(((java.lang.String)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v2 = false;
    Object v3 = ((com.google.gson.stream.JsonWriter)v1).value(((java.lang.Boolean)v2));
    Object v4 = ":;";
    Object v5 = ((com.google.gson.stream.JsonWriter)v3).name(((java.lang.String)v4));
    Object v6 = false;
    ((com.google.gson.stream.JsonWriter)v5).setLenient((((java.lang.Boolean)v6).booleanValue()));
    Object v7 = null;
    Object v8 = "newInsta";
    ((com.google.gson.stream.JsonWriter)v5).setIndent(((java.lang.String)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v2 = false;
    Object v3 = ((com.google.gson.stream.JsonWriter)v1).value(((java.lang.Boolean)v2));
    Object v4 = "name == null";
    Object v5 = ((com.google.gson.stream.JsonWriter)v3).name(((java.lang.String)v4));
    Object v6 = "Expecded name";
    Object v7 = ((com.google.gson.stream.JsonWriter)v5).jsonValue(((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = new char[]{};
    ((java.io.Writer)v0).write(((char[])v1));
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v4 = ((com.google.gson.stream.JsonWriter)v3).beginArray();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = new char[]{};
    ((java.io.Writer)v0).write(((char[])v1));
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonWriter(((java.io.Writer)v0));
    Object v4 = 2L;
    Object v5 = ((com.google.gson.stream.JsonWriter)v3).value((((java.lang.Long)v4).longValue()));
    Object v6 = true;
    ((com.google.gson.stream.JsonWriter)v5).setSerializeNulls((((java.lang.Boolean)v6).booleanValue()));
    Object v7 = null;
    Object v8 = "null";
    Object v9 = ((com.google.gson.stream.JsonWriter)v5).name(((java.lang.String)v8));
    org.junit.Assert.assertNotNull(v9);
  }
}
