package com.google.gson.stream;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = "Expected a namQe but was ";
    Object v1 = new java.io.StringReader(((java.lang.String)v0));
    Object v2 = new com.google.gson.stream.JsonReader(((java.io.Reader)v1));
    Object v3 = ((com.google.gson.stream.JsonReader)v2).nextName();
      org.junit.Assert.fail("Expected com.google.gson.stream.MalformedJsonException");
    } catch (com.google.gson.stream.MalformedJsonException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = "Expected a namQe but was ";
    Object v1 = new java.io.StringReader(((java.lang.String)v0));
    Object v2 = new com.google.gson.stream.JsonReader(((java.io.Reader)v1));
    Object v3 = ((com.google.gson.stream.JsonReader)v2).nextLong();
      org.junit.Assert.fail("Expected com.google.gson.stream.MalformedJsonException");
    } catch (com.google.gson.stream.MalformedJsonException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = "Expected a namQe but was ";
    Object v1 = new java.io.StringReader(((java.lang.String)v0));
    Object v2 = new com.google.gson.stream.JsonReader(((java.io.Reader)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = "Expected a namQe but was ";
    Object v1 = new java.io.StringReader(((java.lang.String)v0));
    Object v2 = new com.google.gson.stream.JsonReader(((java.io.Reader)v1));
    Object v3 = ((com.google.gson.stream.JsonReader)v2).doPeek();
      org.junit.Assert.fail("Expected com.google.gson.stream.MalformedJsonException");
    } catch (com.google.gson.stream.MalformedJsonException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = "Expected a namQe but was ";
    Object v1 = new java.io.StringReader(((java.lang.String)v0));
    Object v2 = new com.google.gson.stream.JsonReader(((java.io.Reader)v1));
    ((com.google.gson.stream.JsonReader)v2).skipValue();
    Object v3 = null;
      org.junit.Assert.fail("Expected com.google.gson.stream.MalformedJsonException");
    } catch (com.google.gson.stream.MalformedJsonException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = "Expected a namQe but was ";
    Object v1 = new java.io.StringReader(((java.lang.String)v0));
    Object v2 = new com.google.gson.stream.JsonReader(((java.io.Reader)v1));
    ((com.google.gson.stream.JsonReader)v2).beginObject();
    Object v3 = null;
      org.junit.Assert.fail("Expected com.google.gson.stream.MalformedJsonException");
    } catch (com.google.gson.stream.MalformedJsonException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = "Expected a namQe but was ";
    Object v1 = new java.io.StringReader(((java.lang.String)v0));
    Object v2 = new com.google.gson.stream.JsonReader(((java.io.Reader)v1));
    Object v3 = ((com.google.gson.stream.JsonReader)v2).nextDouble();
      org.junit.Assert.fail("Expected com.google.gson.stream.MalformedJsonException");
    } catch (com.google.gson.stream.MalformedJsonException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = "Expected a namQe but was ";
    Object v1 = new java.io.StringReader(((java.lang.String)v0));
    Object v2 = new com.google.gson.stream.JsonReader(((java.io.Reader)v1));
    Object v3 = ((com.google.gson.stream.JsonReader)v2).nextString();
      org.junit.Assert.fail("Expected com.google.gson.stream.MalformedJsonException");
    } catch (com.google.gson.stream.MalformedJsonException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = "Expected a namQe but was ";
    Object v1 = new java.io.StringReader(((java.lang.String)v0));
    ((java.io.Reader)v1).close();
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonReader(((java.io.Reader)v1));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = "Expected a namQe but was ";
    Object v1 = new java.io.StringReader(((java.lang.String)v0));
    ((java.io.Reader)v1).close();
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonReader(((java.io.Reader)v1));
    Object v4 = ((com.google.gson.stream.JsonReader)v3).nextName();
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = "Expected a namQe but was ";
    Object v1 = new java.io.StringReader(((java.lang.String)v0));
    ((java.io.Reader)v1).close();
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonReader(((java.io.Reader)v1));
    ((com.google.gson.stream.JsonReader)v3).endArray();
    Object v4 = null;
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = "Expected a namQe but was ";
    Object v1 = new java.io.StringReader(((java.lang.String)v0));
    ((java.io.Reader)v1).close();
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonReader(((java.io.Reader)v1));
    ((com.google.gson.stream.JsonReader)v3).beginArray();
    Object v4 = null;
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = "Expected a namQe but was ";
    Object v1 = new java.io.StringReader(((java.lang.String)v0));
    ((java.io.Reader)v1).close();
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonReader(((java.io.Reader)v1));
    Object v4 = ((com.google.gson.stream.JsonReader)v3).nextString();
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = "Expected a namQe but was ";
    Object v1 = new java.io.StringReader(((java.lang.String)v0));
    ((java.io.Reader)v1).close();
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonReader(((java.io.Reader)v1));
    Object v4 = ((com.google.gson.stream.JsonReader)v3).getPath();
    org.junit.Assert.assertEquals((Object)("$"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = "Expected a namQe but was ";
    Object v1 = new java.io.StringReader(((java.lang.String)v0));
    ((java.io.Reader)v1).close();
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonReader(((java.io.Reader)v1));
    ((com.google.gson.stream.JsonReader)v3).beginObject();
    Object v4 = null;
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = "Expected a namQe but was ";
    Object v1 = new java.io.StringReader(((java.lang.String)v0));
    ((java.io.Reader)v1).close();
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonReader(((java.io.Reader)v1));
    Object v4 = ((com.google.gson.stream.JsonReader)v3).hasNext();
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = "Expected a namQe but was ";
    Object v1 = new java.io.StringReader(((java.lang.String)v0));
    ((java.io.Reader)v1).close();
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonReader(((java.io.Reader)v1));
    ((com.google.gson.stream.JsonReader)v3).endObject();
    Object v4 = null;
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = "Expected a namQe but was ";
    Object v1 = new java.io.StringReader(((java.lang.String)v0));
    ((java.io.Reader)v1).close();
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonReader(((java.io.Reader)v1));
    Object v4 = ((com.google.gson.stream.JsonReader)v3).peek();
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = "Expected a namQe but was ";
    Object v1 = new java.io.StringReader(((java.lang.String)v0));
    ((java.io.Reader)v1).close();
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonReader(((java.io.Reader)v1));
    Object v4 = ((com.google.gson.stream.JsonReader)v3).nextInt();
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = "Expected a namQe but was ";
    Object v1 = new java.io.StringReader(((java.lang.String)v0));
    ((java.io.Reader)v1).close();
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonReader(((java.io.Reader)v1));
    ((com.google.gson.stream.JsonReader)v3).nextNull();
    Object v4 = null;
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = "Expected a namQe but was ";
    Object v1 = new java.io.StringReader(((java.lang.String)v0));
    Object v2 = new com.google.gson.stream.JsonReader(((java.io.Reader)v1));
    Object v3 = ((com.google.gson.stream.JsonReader)v2).toString();
    ((com.google.gson.stream.JsonReader)v2).nextNull();
    Object v4 = null;
      org.junit.Assert.fail("Expected com.google.gson.stream.MalformedJsonException");
    } catch (com.google.gson.stream.MalformedJsonException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = "Expected a namQe but was ";
    Object v1 = new java.io.StringReader(((java.lang.String)v0));
    ((java.io.Reader)v1).close();
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonReader(((java.io.Reader)v1));
    Object v4 = false;
    ((com.google.gson.stream.JsonReader)v3).setLenient((((java.lang.Boolean)v4).booleanValue()));
    Object v5 = null;
    Object v6 = ((com.google.gson.stream.JsonReader)v3).nextString();
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = "Expected a namQe but was ";
    Object v1 = new java.io.StringReader(((java.lang.String)v0));
    ((java.io.Reader)v1).close();
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonReader(((java.io.Reader)v1));
    Object v4 = ((com.google.gson.stream.JsonReader)v3).getPath();
    Object v5 = ((com.google.gson.stream.JsonReader)v3).nextDouble();
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = "Expected a namQe but was ";
    Object v1 = new java.io.StringReader(((java.lang.String)v0));
    ((java.io.Reader)v1).close();
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonReader(((java.io.Reader)v1));
    Object v4 = ((com.google.gson.stream.JsonReader)v3).nextBoolean();
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = "Expected a namQe but was ";
    Object v1 = new java.io.StringReader(((java.lang.String)v0));
    ((java.io.Reader)v1).close();
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonReader(((java.io.Reader)v1));
    Object v4 = ((com.google.gson.stream.JsonReader)v3).doPeek();
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = "Expected a namQe but was ";
    Object v1 = new java.io.StringReader(((java.lang.String)v0));
    Object v2 = new com.google.gson.stream.JsonReader(((java.io.Reader)v1));
    Object v3 = ((com.google.gson.stream.JsonReader)v2).getPath();
    org.junit.Assert.assertEquals((Object)("$"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = "Expected a namQe but was ";
    Object v1 = new java.io.StringReader(((java.lang.String)v0));
    ((java.io.Reader)v1).close();
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonReader(((java.io.Reader)v1));
    Object v4 = ((com.google.gson.stream.JsonReader)v3).toString();
    ((com.google.gson.stream.JsonReader)v3).beginObject();
    Object v5 = null;
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = "Expected a namQe but was ";
    Object v1 = new java.io.StringReader(((java.lang.String)v0));
    ((java.io.Reader)v1).close();
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonReader(((java.io.Reader)v1));
    Object v4 = ((com.google.gson.stream.JsonReader)v3).nextLong();
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = "Expected a namQe but was ";
    Object v1 = new java.io.StringReader(((java.lang.String)v0));
    Object v2 = new com.google.gson.stream.JsonReader(((java.io.Reader)v1));
    Object v3 = false;
    ((com.google.gson.stream.JsonReader)v2).setLenient((((java.lang.Boolean)v3).booleanValue()));
    Object v4 = null;
    ((com.google.gson.stream.JsonReader)v2).beginObject();
    Object v5 = null;
      org.junit.Assert.fail("Expected com.google.gson.stream.MalformedJsonException");
    } catch (com.google.gson.stream.MalformedJsonException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = "Expected a namQe but was ";
    Object v1 = new java.io.StringReader(((java.lang.String)v0));
    Object v2 = new com.google.gson.stream.JsonReader(((java.io.Reader)v1));
    ((com.google.gson.stream.JsonReader)v2).endObject();
    Object v3 = null;
      org.junit.Assert.fail("Expected com.google.gson.stream.MalformedJsonException");
    } catch (com.google.gson.stream.MalformedJsonException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = "Expected a namQe but was ";
    Object v1 = new java.io.StringReader(((java.lang.String)v0));
    ((java.io.Reader)v1).close();
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonReader(((java.io.Reader)v1));
    Object v4 = ((com.google.gson.stream.JsonReader)v3).toString();
    Object v5 = ((com.google.gson.stream.JsonReader)v3).nextDouble();
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = "Expected a namQe but was ";
    Object v1 = new java.io.StringReader(((java.lang.String)v0));
    ((java.io.Reader)v1).close();
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonReader(((java.io.Reader)v1));
    Object v4 = true;
    ((com.google.gson.stream.JsonReader)v3).setLenient((((java.lang.Boolean)v4).booleanValue()));
    Object v5 = null;
    ((com.google.gson.stream.JsonReader)v3).beginArray();
    Object v6 = null;
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = "Expected a namQe but was ";
    Object v1 = new java.io.StringReader(((java.lang.String)v0));
    ((java.io.Reader)v1).close();
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonReader(((java.io.Reader)v1));
    ((com.google.gson.stream.JsonReader)v3).close();
    Object v4 = null;
    Object v5 = ((com.google.gson.stream.JsonReader)v3).nextInt();
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = "Expected a namQe but was ";
    Object v1 = new java.io.StringReader(((java.lang.String)v0));
    Object v2 = new com.google.gson.stream.JsonReader(((java.io.Reader)v1));
    ((com.google.gson.stream.JsonReader)v2).endArray();
    Object v3 = null;
      org.junit.Assert.fail("Expected com.google.gson.stream.MalformedJsonException");
    } catch (com.google.gson.stream.MalformedJsonException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = "Expected a namQe but was ";
    Object v1 = new java.io.StringReader(((java.lang.String)v0));
    ((java.io.Reader)v1).close();
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonReader(((java.io.Reader)v1));
    Object v4 = ((com.google.gson.stream.JsonReader)v3).toString();
    ((com.google.gson.stream.JsonReader)v3).skipValue();
    Object v5 = null;
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = "Expected a namQe but was ";
    Object v1 = new java.io.StringReader(((java.lang.String)v0));
    ((java.io.Reader)v1).close();
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonReader(((java.io.Reader)v1));
    ((com.google.gson.stream.JsonReader)v3).skipValue();
    Object v4 = null;
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = "Expected a namQe but was ";
    Object v1 = new java.io.StringReader(((java.lang.String)v0));
    Object v2 = new com.google.gson.stream.JsonReader(((java.io.Reader)v1));
    ((com.google.gson.stream.JsonReader)v2).close();
    Object v3 = null;
    Object v4 = ((com.google.gson.stream.JsonReader)v2).nextString();
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = "Expected a namQe but was ";
    Object v1 = new java.io.StringReader(((java.lang.String)v0));
    ((java.io.Reader)v1).close();
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonReader(((java.io.Reader)v1));
    Object v4 = ((com.google.gson.stream.JsonReader)v3).toString();
    ((com.google.gson.stream.JsonReader)v3).beginArray();
    Object v5 = null;
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = "Expected a namQe but was ";
    Object v1 = new java.io.StringReader(((java.lang.String)v0));
    Object v2 = new com.google.gson.stream.JsonReader(((java.io.Reader)v1));
    Object v3 = true;
    ((com.google.gson.stream.JsonReader)v2).setLenient((((java.lang.Boolean)v3).booleanValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = "Expected a namQe but was ";
    Object v1 = new java.io.StringReader(((java.lang.String)v0));
    ((java.io.Reader)v1).close();
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonReader(((java.io.Reader)v1));
    Object v4 = false;
    ((com.google.gson.stream.JsonReader)v3).setLenient((((java.lang.Boolean)v4).booleanValue()));
    Object v5 = null;
    Object v6 = ((com.google.gson.stream.JsonReader)v3).toString();
    org.junit.Assert.assertEquals((Object)("JsonReader at line 1 column 1 path $"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = "Expected a namQe but was ";
    Object v1 = new java.io.StringReader(((java.lang.String)v0));
    ((java.io.Reader)v1).close();
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonReader(((java.io.Reader)v1));
    ((com.google.gson.stream.JsonReader)v3).close();
    Object v4 = null;
    Object v5 = ((com.google.gson.stream.JsonReader)v3).nextDouble();
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = "Expected a namQe but was ";
    Object v1 = new java.io.StringReader(((java.lang.String)v0));
    Object v2 = new com.google.gson.stream.JsonReader(((java.io.Reader)v1));
    Object v3 = ((com.google.gson.stream.JsonReader)v2).toString();
    org.junit.Assert.assertEquals((Object)("JsonReader at line 1 column 1 path $"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = "Expected a namQe but was ";
    Object v1 = new java.io.StringReader(((java.lang.String)v0));
    Object v2 = new com.google.gson.stream.JsonReader(((java.io.Reader)v1));
    ((com.google.gson.stream.JsonReader)v2).nextNull();
    Object v3 = null;
      org.junit.Assert.fail("Expected com.google.gson.stream.MalformedJsonException");
    } catch (com.google.gson.stream.MalformedJsonException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = "Expected a namQe but was ";
    Object v1 = new java.io.StringReader(((java.lang.String)v0));
    Object v2 = new com.google.gson.stream.JsonReader(((java.io.Reader)v1));
    ((com.google.gson.stream.JsonReader)v2).beginArray();
    Object v3 = null;
      org.junit.Assert.fail("Expected com.google.gson.stream.MalformedJsonException");
    } catch (com.google.gson.stream.MalformedJsonException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = "Expected a namQe but was ";
    Object v1 = new java.io.StringReader(((java.lang.String)v0));
    ((java.io.Reader)v1).close();
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonReader(((java.io.Reader)v1));
    ((com.google.gson.stream.JsonReader)v3).close();
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = "Expected a namQe but was ";
    Object v1 = new java.io.StringReader(((java.lang.String)v0));
    ((java.io.Reader)v1).close();
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonReader(((java.io.Reader)v1));
    Object v4 = false;
    ((com.google.gson.stream.JsonReader)v3).setLenient((((java.lang.Boolean)v4).booleanValue()));
    Object v5 = null;
    Object v6 = ((com.google.gson.stream.JsonReader)v3).isLenient();
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = "Expected a namQe but was ";
    Object v1 = new java.io.StringReader(((java.lang.String)v0));
    Object v2 = new com.google.gson.stream.JsonReader(((java.io.Reader)v1));
    Object v3 = ((com.google.gson.stream.JsonReader)v2).toString();
    Object v4 = ((com.google.gson.stream.JsonReader)v2).toString();
    org.junit.Assert.assertEquals((Object)("JsonReader at line 1 column 1 path $"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = "Expected a namQe but was ";
    Object v1 = new java.io.StringReader(((java.lang.String)v0));
    Object v2 = new com.google.gson.stream.JsonReader(((java.io.Reader)v1));
    Object v3 = ((com.google.gson.stream.JsonReader)v2).peek();
      org.junit.Assert.fail("Expected com.google.gson.stream.MalformedJsonException");
    } catch (com.google.gson.stream.MalformedJsonException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = "Expected a namQe but was ";
    Object v1 = new java.io.StringReader(((java.lang.String)v0));
    ((java.io.Reader)v1).close();
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonReader(((java.io.Reader)v1));
    Object v4 = ((com.google.gson.stream.JsonReader)v3).getPath();
    Object v5 = ((com.google.gson.stream.JsonReader)v3).peek();
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = "Expected a namQe but was ";
    Object v1 = new java.io.StringReader(((java.lang.String)v0));
    ((java.io.Reader)v1).close();
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonReader(((java.io.Reader)v1));
    Object v4 = ((com.google.gson.stream.JsonReader)v3).getPath();
    Object v5 = ((com.google.gson.stream.JsonReader)v3).getPath();
    org.junit.Assert.assertEquals((Object)("$"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = "Expected a namQe but was ";
    Object v1 = new java.io.StringReader(((java.lang.String)v0));
    ((java.io.Reader)v1).close();
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonReader(((java.io.Reader)v1));
    Object v4 = ((com.google.gson.stream.JsonReader)v3).isLenient();
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = "Expected a namQe but was ";
    Object v1 = new java.io.StringReader(((java.lang.String)v0));
    ((java.io.Reader)v1).reset();
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonReader(((java.io.Reader)v1));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = "Expected a namQe but was ";
    Object v1 = new java.io.StringReader(((java.lang.String)v0));
    ((java.io.Reader)v1).reset();
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonReader(((java.io.Reader)v1));
    Object v4 = ((com.google.gson.stream.JsonReader)v3).nextString();
      org.junit.Assert.fail("Expected com.google.gson.stream.MalformedJsonException");
    } catch (com.google.gson.stream.MalformedJsonException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = "Expected a namQe but was ";
    Object v1 = new java.io.StringReader(((java.lang.String)v0));
    ((java.io.Reader)v1).close();
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonReader(((java.io.Reader)v1));
    Object v4 = ((com.google.gson.stream.JsonReader)v3).nextDouble();
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = "Expected a namQe but was ";
    Object v1 = new java.io.StringReader(((java.lang.String)v0));
    ((java.io.Reader)v1).reset();
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonReader(((java.io.Reader)v1));
    Object v4 = ((com.google.gson.stream.JsonReader)v3).nextBoolean();
      org.junit.Assert.fail("Expected com.google.gson.stream.MalformedJsonException");
    } catch (com.google.gson.stream.MalformedJsonException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = "Expected a namQe but was ";
    Object v1 = new java.io.StringReader(((java.lang.String)v0));
    ((java.io.Reader)v1).reset();
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonReader(((java.io.Reader)v1));
    Object v4 = ((com.google.gson.stream.JsonReader)v3).nextInt();
      org.junit.Assert.fail("Expected com.google.gson.stream.MalformedJsonException");
    } catch (com.google.gson.stream.MalformedJsonException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = "Expected a namQe but was ";
    Object v1 = new java.io.StringReader(((java.lang.String)v0));
    ((java.io.Reader)v1).reset();
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonReader(((java.io.Reader)v1));
    ((com.google.gson.stream.JsonReader)v3).endArray();
    Object v4 = null;
      org.junit.Assert.fail("Expected com.google.gson.stream.MalformedJsonException");
    } catch (com.google.gson.stream.MalformedJsonException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = "Expected a namQe but was ";
    Object v1 = new java.io.StringReader(((java.lang.String)v0));
    ((java.io.Reader)v1).close();
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonReader(((java.io.Reader)v1));
    Object v4 = true;
    ((com.google.gson.stream.JsonReader)v3).setLenient((((java.lang.Boolean)v4).booleanValue()));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = "Expected a namQe but was ";
    Object v1 = new java.io.StringReader(((java.lang.String)v0));
    ((java.io.Reader)v1).close();
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonReader(((java.io.Reader)v1));
    Object v4 = false;
    ((com.google.gson.stream.JsonReader)v3).setLenient((((java.lang.Boolean)v4).booleanValue()));
    Object v5 = null;
    Object v6 = ((com.google.gson.stream.JsonReader)v3).nextName();
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = "Expected a namQe but was ";
    Object v1 = new java.io.StringReader(((java.lang.String)v0));
    ((java.io.Reader)v1).close();
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonReader(((java.io.Reader)v1));
    ((com.google.gson.stream.JsonReader)v3).close();
    Object v4 = null;
    Object v5 = ((com.google.gson.stream.JsonReader)v3).nextBoolean();
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = "Expected a namQe but was ";
    Object v1 = new java.io.StringReader(((java.lang.String)v0));
    ((java.io.Reader)v1).reset();
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonReader(((java.io.Reader)v1));
    Object v4 = ((com.google.gson.stream.JsonReader)v3).nextLong();
      org.junit.Assert.fail("Expected com.google.gson.stream.MalformedJsonException");
    } catch (com.google.gson.stream.MalformedJsonException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = "Expected a namQe but was ";
    Object v1 = new java.io.StringReader(((java.lang.String)v0));
    ((java.io.Reader)v1).reset();
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonReader(((java.io.Reader)v1));
    ((com.google.gson.stream.JsonReader)v3).beginObject();
    Object v4 = null;
      org.junit.Assert.fail("Expected com.google.gson.stream.MalformedJsonException");
    } catch (com.google.gson.stream.MalformedJsonException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = "Expected a namQe but was ";
    Object v1 = new java.io.StringReader(((java.lang.String)v0));
    ((java.io.Reader)v1).reset();
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonReader(((java.io.Reader)v1));
    Object v4 = ((com.google.gson.stream.JsonReader)v3).getPath();
    org.junit.Assert.assertEquals((Object)("$"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = "Expected a namQe but was ";
    Object v1 = new java.io.StringReader(((java.lang.String)v0));
    ((java.io.Reader)v1).reset();
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonReader(((java.io.Reader)v1));
    ((com.google.gson.stream.JsonReader)v3).nextNull();
    Object v4 = null;
      org.junit.Assert.fail("Expected com.google.gson.stream.MalformedJsonException");
    } catch (com.google.gson.stream.MalformedJsonException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = "Expected a namQe but was ";
    Object v1 = new java.io.StringReader(((java.lang.String)v0));
    ((java.io.Reader)v1).reset();
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonReader(((java.io.Reader)v1));
    ((com.google.gson.stream.JsonReader)v3).beginArray();
    Object v4 = null;
      org.junit.Assert.fail("Expected com.google.gson.stream.MalformedJsonException");
    } catch (com.google.gson.stream.MalformedJsonException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = "Expected a namQe but was ";
    Object v1 = new java.io.StringReader(((java.lang.String)v0));
    ((java.io.Reader)v1).reset();
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonReader(((java.io.Reader)v1));
    Object v4 = ((com.google.gson.stream.JsonReader)v3).getPath();
    Object v5 = ((com.google.gson.stream.JsonReader)v3).nextString();
      org.junit.Assert.fail("Expected com.google.gson.stream.MalformedJsonException");
    } catch (com.google.gson.stream.MalformedJsonException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = "Expected a namQe but was ";
    Object v1 = new java.io.StringReader(((java.lang.String)v0));
    ((java.io.Reader)v1).reset();
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonReader(((java.io.Reader)v1));
    Object v4 = ((com.google.gson.stream.JsonReader)v3).isLenient();
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = "Expected a namQe but was ";
    Object v1 = new java.io.StringReader(((java.lang.String)v0));
    ((java.io.Reader)v1).reset();
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonReader(((java.io.Reader)v1));
    ((com.google.gson.stream.JsonReader)v3).skipValue();
    Object v4 = null;
      org.junit.Assert.fail("Expected com.google.gson.stream.MalformedJsonException");
    } catch (com.google.gson.stream.MalformedJsonException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = "Expected a namQe but was ";
    Object v1 = new java.io.StringReader(((java.lang.String)v0));
    ((java.io.Reader)v1).close();
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonReader(((java.io.Reader)v1));
    Object v4 = ((com.google.gson.stream.JsonReader)v3).getPath();
    Object v5 = ((com.google.gson.stream.JsonReader)v3).doPeek();
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = "Expected a namQe but was ";
    Object v1 = new java.io.StringReader(((java.lang.String)v0));
    ((java.io.Reader)v1).reset();
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonReader(((java.io.Reader)v1));
    Object v4 = ((com.google.gson.stream.JsonReader)v3).nextName();
      org.junit.Assert.fail("Expected com.google.gson.stream.MalformedJsonException");
    } catch (com.google.gson.stream.MalformedJsonException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = "Expected a namQe but was ";
    Object v1 = new java.io.StringReader(((java.lang.String)v0));
    ((java.io.Reader)v1).close();
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonReader(((java.io.Reader)v1));
    Object v4 = ((com.google.gson.stream.JsonReader)v3).toString();
    Object v5 = ((com.google.gson.stream.JsonReader)v3).peek();
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = "Expected a namQe but was ";
    Object v1 = new java.io.StringReader(((java.lang.String)v0));
    ((java.io.Reader)v1).reset();
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonReader(((java.io.Reader)v1));
    Object v4 = true;
    ((com.google.gson.stream.JsonReader)v3).setLenient((((java.lang.Boolean)v4).booleanValue()));
    Object v5 = null;
    ((com.google.gson.stream.JsonReader)v3).beginArray();
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = "Expected a namQe but was ";
    Object v1 = new java.io.StringReader(((java.lang.String)v0));
    ((java.io.Reader)v1).reset();
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonReader(((java.io.Reader)v1));
    Object v4 = ((com.google.gson.stream.JsonReader)v3).hasNext();
      org.junit.Assert.fail("Expected com.google.gson.stream.MalformedJsonException");
    } catch (com.google.gson.stream.MalformedJsonException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = "Expected a namQe but was ";
    Object v1 = new java.io.StringReader(((java.lang.String)v0));
    Object v2 = new com.google.gson.stream.JsonReader(((java.io.Reader)v1));
    Object v3 = ((com.google.gson.stream.JsonReader)v2).toString();
    Object v4 = ((com.google.gson.stream.JsonReader)v2).nextName();
      org.junit.Assert.fail("Expected com.google.gson.stream.MalformedJsonException");
    } catch (com.google.gson.stream.MalformedJsonException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = "Expected a namQe but was ";
    Object v1 = new java.io.StringReader(((java.lang.String)v0));
    Object v2 = 10L;
    Object v3 = ((java.io.Reader)v1).skip((((java.lang.Long)v2).longValue()));
    Object v4 = new com.google.gson.stream.JsonReader(((java.io.Reader)v1));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = "Expected a namQe but was ";
    Object v1 = new java.io.StringReader(((java.lang.String)v0));
    ((java.io.Reader)v1).close();
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonReader(((java.io.Reader)v1));
    Object v4 = false;
    ((com.google.gson.stream.JsonReader)v3).setLenient((((java.lang.Boolean)v4).booleanValue()));
    Object v5 = null;
    ((com.google.gson.stream.JsonReader)v3).beginArray();
    Object v6 = null;
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = "Expected a namQe but was ";
    Object v1 = new java.io.StringReader(((java.lang.String)v0));
    Object v2 = 10L;
    Object v3 = ((java.io.Reader)v1).skip((((java.lang.Long)v2).longValue()));
    Object v4 = new com.google.gson.stream.JsonReader(((java.io.Reader)v1));
    Object v5 = true;
    ((com.google.gson.stream.JsonReader)v4).setLenient((((java.lang.Boolean)v5).booleanValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = "Expected a namQe but was ";
    Object v1 = new java.io.StringReader(((java.lang.String)v0));
    Object v2 = 10L;
    Object v3 = ((java.io.Reader)v1).skip((((java.lang.Long)v2).longValue()));
    Object v4 = new com.google.gson.stream.JsonReader(((java.io.Reader)v1));
    ((com.google.gson.stream.JsonReader)v4).beginObject();
    Object v5 = null;
      org.junit.Assert.fail("Expected com.google.gson.stream.MalformedJsonException");
    } catch (com.google.gson.stream.MalformedJsonException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = "Expected a namQe but was ";
    Object v1 = new java.io.StringReader(((java.lang.String)v0));
    Object v2 = 10L;
    Object v3 = ((java.io.Reader)v1).skip((((java.lang.Long)v2).longValue()));
    Object v4 = new com.google.gson.stream.JsonReader(((java.io.Reader)v1));
    ((com.google.gson.stream.JsonReader)v4).beginArray();
    Object v5 = null;
      org.junit.Assert.fail("Expected com.google.gson.stream.MalformedJsonException");
    } catch (com.google.gson.stream.MalformedJsonException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = "Expected a namQe but was ";
    Object v1 = new java.io.StringReader(((java.lang.String)v0));
    Object v2 = 10L;
    Object v3 = ((java.io.Reader)v1).skip((((java.lang.Long)v2).longValue()));
    Object v4 = new com.google.gson.stream.JsonReader(((java.io.Reader)v1));
    ((com.google.gson.stream.JsonReader)v4).nextNull();
    Object v5 = null;
      org.junit.Assert.fail("Expected com.google.gson.stream.MalformedJsonException");
    } catch (com.google.gson.stream.MalformedJsonException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = "Expected a namQe but was ";
    Object v1 = new java.io.StringReader(((java.lang.String)v0));
    Object v2 = 10L;
    Object v3 = ((java.io.Reader)v1).skip((((java.lang.Long)v2).longValue()));
    Object v4 = new com.google.gson.stream.JsonReader(((java.io.Reader)v1));
    ((com.google.gson.stream.JsonReader)v4).skipValue();
    Object v5 = null;
      org.junit.Assert.fail("Expected com.google.gson.stream.MalformedJsonException");
    } catch (com.google.gson.stream.MalformedJsonException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = "Expected a namQe but was ";
    Object v1 = new java.io.StringReader(((java.lang.String)v0));
    Object v2 = 10L;
    Object v3 = ((java.io.Reader)v1).skip((((java.lang.Long)v2).longValue()));
    Object v4 = new com.google.gson.stream.JsonReader(((java.io.Reader)v1));
    ((com.google.gson.stream.JsonReader)v4).endArray();
    Object v5 = null;
      org.junit.Assert.fail("Expected com.google.gson.stream.MalformedJsonException");
    } catch (com.google.gson.stream.MalformedJsonException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = "Expected a namQe but was ";
    Object v1 = new java.io.StringReader(((java.lang.String)v0));
    Object v2 = 10L;
    Object v3 = ((java.io.Reader)v1).skip((((java.lang.Long)v2).longValue()));
    Object v4 = new com.google.gson.stream.JsonReader(((java.io.Reader)v1));
    ((com.google.gson.stream.JsonReader)v4).close();
    Object v5 = null;
    Object v6 = ((com.google.gson.stream.JsonReader)v4).doPeek();
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = "Expected a namQe but was ";
    Object v1 = new java.io.StringReader(((java.lang.String)v0));
    Object v2 = 10L;
    Object v3 = ((java.io.Reader)v1).skip((((java.lang.Long)v2).longValue()));
    Object v4 = new com.google.gson.stream.JsonReader(((java.io.Reader)v1));
    Object v5 = ((com.google.gson.stream.JsonReader)v4).nextBoolean();
      org.junit.Assert.fail("Expected com.google.gson.stream.MalformedJsonException");
    } catch (com.google.gson.stream.MalformedJsonException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = "Expected a namQe but was ";
    Object v1 = new java.io.StringReader(((java.lang.String)v0));
    ((java.io.Reader)v1).reset();
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonReader(((java.io.Reader)v1));
    ((com.google.gson.stream.JsonReader)v3).close();
    Object v4 = null;
    Object v5 = ((com.google.gson.stream.JsonReader)v3).nextBoolean();
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = "Expected a namQe but was ";
    Object v1 = new java.io.StringReader(((java.lang.String)v0));
    Object v2 = 10L;
    Object v3 = ((java.io.Reader)v1).skip((((java.lang.Long)v2).longValue()));
    Object v4 = new com.google.gson.stream.JsonReader(((java.io.Reader)v1));
    ((com.google.gson.stream.JsonReader)v4).close();
    Object v5 = null;
    ((com.google.gson.stream.JsonReader)v4).endArray();
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = "Expected a namQe but was ";
    Object v1 = new java.io.StringReader(((java.lang.String)v0));
    Object v2 = 10L;
    Object v3 = ((java.io.Reader)v1).skip((((java.lang.Long)v2).longValue()));
    Object v4 = new com.google.gson.stream.JsonReader(((java.io.Reader)v1));
    Object v5 = false;
    ((com.google.gson.stream.JsonReader)v4).setLenient((((java.lang.Boolean)v5).booleanValue()));
    Object v6 = null;
    ((com.google.gson.stream.JsonReader)v4).endArray();
    Object v7 = null;
      org.junit.Assert.fail("Expected com.google.gson.stream.MalformedJsonException");
    } catch (com.google.gson.stream.MalformedJsonException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = "Expected a namQe but was ";
    Object v1 = new java.io.StringReader(((java.lang.String)v0));
    Object v2 = 10L;
    Object v3 = ((java.io.Reader)v1).skip((((java.lang.Long)v2).longValue()));
    Object v4 = new com.google.gson.stream.JsonReader(((java.io.Reader)v1));
    Object v5 = ((com.google.gson.stream.JsonReader)v4).getPath();
    org.junit.Assert.assertEquals((Object)("$"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = "Expected a namQe but was ";
    Object v1 = new java.io.StringReader(((java.lang.String)v0));
    Object v2 = 10L;
    Object v3 = ((java.io.Reader)v1).skip((((java.lang.Long)v2).longValue()));
    Object v4 = new com.google.gson.stream.JsonReader(((java.io.Reader)v1));
    Object v5 = ((com.google.gson.stream.JsonReader)v4).peek();
      org.junit.Assert.fail("Expected com.google.gson.stream.MalformedJsonException");
    } catch (com.google.gson.stream.MalformedJsonException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = "Expected a namQe but was ";
    Object v1 = new java.io.StringReader(((java.lang.String)v0));
    Object v2 = 10L;
    Object v3 = ((java.io.Reader)v1).skip((((java.lang.Long)v2).longValue()));
    Object v4 = new com.google.gson.stream.JsonReader(((java.io.Reader)v1));
    Object v5 = true;
    ((com.google.gson.stream.JsonReader)v4).setLenient((((java.lang.Boolean)v5).booleanValue()));
    Object v6 = null;
    Object v7 = ((com.google.gson.stream.JsonReader)v4).peek();
    org.junit.Assert.assertEquals((Object)(com.google.gson.stream.JsonToken.STRING), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = "Expected a namQe but was ";
    Object v1 = new java.io.StringReader(((java.lang.String)v0));
    ((java.io.Reader)v1).reset();
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonReader(((java.io.Reader)v1));
    Object v4 = ((com.google.gson.stream.JsonReader)v3).nextDouble();
      org.junit.Assert.fail("Expected com.google.gson.stream.MalformedJsonException");
    } catch (com.google.gson.stream.MalformedJsonException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = "Expected a namQe but was ";
    Object v1 = new java.io.StringReader(((java.lang.String)v0));
    Object v2 = new com.google.gson.stream.JsonReader(((java.io.Reader)v1));
    Object v3 = ((com.google.gson.stream.JsonReader)v2).toString();
    Object v4 = ((com.google.gson.stream.JsonReader)v2).hasNext();
      org.junit.Assert.fail("Expected com.google.gson.stream.MalformedJsonException");
    } catch (com.google.gson.stream.MalformedJsonException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = "Expected a namQe but was ";
    Object v1 = new java.io.StringReader(((java.lang.String)v0));
    Object v2 = new com.google.gson.stream.JsonReader(((java.io.Reader)v1));
    Object v3 = ((com.google.gson.stream.JsonReader)v2).toString();
    Object v4 = ((com.google.gson.stream.JsonReader)v2).nextLong();
      org.junit.Assert.fail("Expected com.google.gson.stream.MalformedJsonException");
    } catch (com.google.gson.stream.MalformedJsonException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = "Expected a namQe but was ";
    Object v1 = new java.io.StringReader(((java.lang.String)v0));
    Object v2 = 10L;
    Object v3 = ((java.io.Reader)v1).skip((((java.lang.Long)v2).longValue()));
    Object v4 = new com.google.gson.stream.JsonReader(((java.io.Reader)v1));
    Object v5 = false;
    ((com.google.gson.stream.JsonReader)v4).setLenient((((java.lang.Boolean)v5).booleanValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = "Expected a namQe but was ";
    Object v1 = new java.io.StringReader(((java.lang.String)v0));
    ((java.io.Reader)v1).close();
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonReader(((java.io.Reader)v1));
    Object v4 = true;
    ((com.google.gson.stream.JsonReader)v3).setLenient((((java.lang.Boolean)v4).booleanValue()));
    Object v5 = null;
    Object v6 = ((com.google.gson.stream.JsonReader)v3).nextDouble();
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = "Expected a namQe but was ";
    Object v1 = new java.io.StringReader(((java.lang.String)v0));
    ((java.io.Reader)v1).reset();
    Object v2 = null;
    Object v3 = new com.google.gson.stream.JsonReader(((java.io.Reader)v1));
    Object v4 = false;
    ((com.google.gson.stream.JsonReader)v3).setLenient((((java.lang.Boolean)v4).booleanValue()));
    Object v5 = null;
    ((com.google.gson.stream.JsonReader)v3).skipValue();
    Object v6 = null;
      org.junit.Assert.fail("Expected com.google.gson.stream.MalformedJsonException");
    } catch (com.google.gson.stream.MalformedJsonException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = "Expected a namQe but was ";
    Object v1 = new java.io.StringReader(((java.lang.String)v0));
    Object v2 = ((java.io.Reader)v1).read();
    Object v3 = new com.google.gson.stream.JsonReader(((java.io.Reader)v1));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = "Expected a namQe but was ";
    Object v1 = new java.io.StringReader(((java.lang.String)v0));
    Object v2 = ((java.io.Reader)v1).read();
    Object v3 = new com.google.gson.stream.JsonReader(((java.io.Reader)v1));
    Object v4 = ((com.google.gson.stream.JsonReader)v3).nextLong();
      org.junit.Assert.fail("Expected com.google.gson.stream.MalformedJsonException");
    } catch (com.google.gson.stream.MalformedJsonException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = "Expected a namQe but was ";
    Object v1 = new java.io.StringReader(((java.lang.String)v0));
    Object v2 = ((java.io.Reader)v1).read();
    Object v3 = new com.google.gson.stream.JsonReader(((java.io.Reader)v1));
    Object v4 = false;
    ((com.google.gson.stream.JsonReader)v3).setLenient((((java.lang.Boolean)v4).booleanValue()));
    Object v5 = null;
    Object v6 = ((com.google.gson.stream.JsonReader)v3).getPath();
    org.junit.Assert.assertEquals((Object)("$"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = "Expected a namQe but was ";
    Object v1 = new java.io.StringReader(((java.lang.String)v0));
    Object v2 = ((java.io.Reader)v1).read();
    Object v3 = new com.google.gson.stream.JsonReader(((java.io.Reader)v1));
    ((com.google.gson.stream.JsonReader)v3).nextNull();
    Object v4 = null;
      org.junit.Assert.fail("Expected com.google.gson.stream.MalformedJsonException");
    } catch (com.google.gson.stream.MalformedJsonException expected) { }
  }
}
