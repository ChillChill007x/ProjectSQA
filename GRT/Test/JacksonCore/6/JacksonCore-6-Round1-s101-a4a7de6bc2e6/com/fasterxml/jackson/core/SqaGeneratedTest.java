package com.fasterxml.jackson.core;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = "Malformed numeric value '";
    Object v1 = com.fasterxml.jackson.core.JsonPointer._parseTail(((java.lang.String)v0));
    Object v2 = ((com.fasterxml.jackson.core.JsonPointer)v1).matches();
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = "Malformed numeric value '";
    Object v1 = com.fasterxml.jackson.core.JsonPointer._parseTail(((java.lang.String)v0));
    Object v2 = "Malformed numeric value '";
    Object v3 = com.fasterxml.jackson.core.JsonPointer._parseTail(((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.core.JsonPointer)v3).matches();
    Object v5 = ((com.fasterxml.jackson.core.JsonPointer)v1).equals(((java.lang.Object)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = ")";
    Object v1 = 57;
    Object v2 = com.fasterxml.jackson.core.JsonPointer._parseQuotedTail(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = ")";
    Object v1 = com.fasterxml.jackson.core.JsonPointer._parseTail(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = ")";
    Object v1 = com.fasterxml.jackson.core.JsonPointer._parseTail(((java.lang.String)v0));
    Object v2 = 0;
    Object v3 = ((com.fasterxml.jackson.core.JsonPointer)v1).matchElement((((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = ")";
    Object v1 = com.fasterxml.jackson.core.JsonPointer._parseTail(((java.lang.String)v0));
    Object v2 = "'";
    Object v3 = ((com.fasterxml.jackson.core.JsonPointer)v1).matchProperty(((java.lang.String)v2));
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = "Malformed numeric value '";
    Object v1 = com.fasterxml.jackson.core.JsonPointer._parseTail(((java.lang.String)v0));
    Object v2 = ((com.fasterxml.jackson.core.JsonPointer)v1).tail();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = ")";
    Object v1 = com.fasterxml.jackson.core.JsonPointer._parseTail(((java.lang.String)v0));
    Object v2 = ((com.fasterxml.jackson.core.JsonPointer)v1).toString();
    org.junit.Assert.assertEquals((Object)(")"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = 1;
    Object v2 = com.fasterxml.jackson.core.JsonPointer._parseQuotedTail(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = "' (code 0x";
    Object v1 = com.fasterxml.jackson.core.JsonPointer.compile(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = ")";
    Object v1 = com.fasterxml.jackson.core.JsonPointer._parseTail(((java.lang.String)v0));
    Object v2 = "null";
    Object v3 = ((com.fasterxml.jackson.core.JsonPointer)v1).matchProperty(((java.lang.String)v2));
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = ")";
    Object v1 = com.fasterxml.jackson.core.JsonPointer._parseTail(((java.lang.String)v0));
    Object v2 = ((com.fasterxml.jackson.core.JsonPointer)v1).mayMatchElement();
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = ")";
    Object v1 = com.fasterxml.jackson.core.JsonPointer._parseTail(((java.lang.String)v0));
    Object v2 = ((com.fasterxml.jackson.core.JsonPointer)v1).mayMatchProperty();
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = "Malformed numeric value '";
    Object v1 = com.fasterxml.jackson.core.JsonPointer._parseTail(((java.lang.String)v0));
    Object v2 = ((com.fasterxml.jackson.core.JsonPointer)v1).tail();
    Object v3 = ((com.fasterxml.jackson.core.JsonPointer)v2).mayMatchElement();
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = "Malformed numeric value '";
    Object v1 = com.fasterxml.jackson.core.JsonPointer._parseTail(((java.lang.String)v0));
    Object v2 = ((com.fasterxml.jackson.core.JsonPointer)v1).tail();
    Object v3 = ":k";
    Object v4 = ((com.fasterxml.jackson.core.JsonPointer)v2).matchProperty(((java.lang.String)v3));
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = ")";
    Object v1 = com.fasterxml.jackson.core.JsonPointer._parseTail(((java.lang.String)v0));
    Object v2 = " in a -comment";
    Object v3 = ((com.fasterxml.jackson.core.JsonPointer)v1).matchProperty(((java.lang.String)v2));
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = "true";
    Object v1 = com.fasterxml.jackson.core.JsonPointer.compile(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = ")";
    Object v1 = com.fasterxml.jackson.core.JsonPointer._parseTail(((java.lang.String)v0));
    Object v2 = ")";
    Object v3 = com.fasterxml.jackson.core.JsonPointer._parseTail(((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.core.JsonPointer)v1).equals(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = ")";
    Object v1 = com.fasterxml.jackson.core.JsonPointer._parseTail(((java.lang.String)v0));
    Object v2 = "O";
    Object v3 = ((com.fasterxml.jackson.core.JsonPointer)v1).matchProperty(((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.core.JsonPointer)v1).mayMatchProperty();
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = ")";
    Object v1 = com.fasterxml.jackson.core.JsonPointer._parseTail(((java.lang.String)v0));
    Object v2 = -11;
    Object v3 = ((com.fasterxml.jackson.core.JsonPointer)v1).matchElement((((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = ")";
    Object v1 = com.fasterxml.jackson.core.JsonPointer._parseTail(((java.lang.String)v0));
    Object v2 = 1;
    Object v3 = ((com.fasterxml.jackson.core.JsonPointer)v1).matchElement((((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = "'";
    Object v1 = com.fasterxml.jackson.core.JsonPointer._parseTail(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = ")";
    Object v1 = com.fasterxml.jackson.core.JsonPointer._parseTail(((java.lang.String)v0));
    Object v2 = -20;
    Object v3 = ((com.fasterxml.jackson.core.JsonPointer)v1).matchElement((((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = "'";
    Object v1 = com.fasterxml.jackson.core.JsonPointer._parseTail(((java.lang.String)v0));
    Object v2 = ((com.fasterxml.jackson.core.JsonPointer)v1).matches();
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = ": ";
    Object v1 = com.fasterxml.jackson.core.JsonPointer.compile(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = ")";
    Object v1 = com.fasterxml.jackson.core.JsonPointer._parseTail(((java.lang.String)v0));
    Object v2 = ((com.fasterxml.jackson.core.JsonPointer)v1).getMatchingIndex();
    org.junit.Assert.assertEquals((Object)(-1), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = "tru";
    Object v1 = com.fasterxml.jackson.core.JsonPointer._parseTail(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = "'";
    Object v1 = com.fasterxml.jackson.core.JsonPointer._parseTail(((java.lang.String)v0));
    Object v2 = "') s character #";
    Object v3 = ((com.fasterxml.jackson.core.JsonPointer)v1).matchProperty(((java.lang.String)v2));
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = ")";
    Object v1 = com.fasterxml.jackson.core.JsonPointer._parseTail(((java.lang.String)v0));
    Object v2 = "tru";
    Object v3 = com.fasterxml.jackson.core.JsonPointer._parseTail(((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.core.JsonPointer)v1).equals(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = 0;
    Object v2 = com.fasterxml.jackson.core.JsonPointer._parseQuotedTail(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = "tru";
    Object v1 = com.fasterxml.jackson.core.JsonPointer._parseTail(((java.lang.String)v0));
    Object v2 = ((com.fasterxml.jackson.core.JsonPointer)v1).matches();
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = "'";
    Object v1 = com.fasterxml.jackson.core.JsonPointer._parseTail(((java.lang.String)v0));
    Object v2 = ((com.fasterxml.jackson.core.JsonPointer)v1).mayMatchElement();
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = "y)";
    Object v1 = com.fasterxml.jackson.core.JsonPointer._parseTail(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = "tru";
    Object v1 = com.fasterxml.jackson.core.JsonPointer._parseTail(((java.lang.String)v0));
    Object v2 = -19;
    Object v3 = ((com.fasterxml.jackson.core.JsonPointer)v1).matchElement((((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = ")";
    Object v1 = com.fasterxml.jackson.core.JsonPointer._parseTail(((java.lang.String)v0));
    Object v2 = ((com.fasterxml.jackson.core.JsonPointer)v1).hashCode();
    Object v3 = ((com.fasterxml.jackson.core.JsonPointer)v1).mayMatchProperty();
    org.junit.Assert.assertEquals((Object)(true), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = "'";
    Object v1 = com.fasterxml.jackson.core.JsonPointer._parseTail(((java.lang.String)v0));
    Object v2 = ")";
    Object v3 = com.fasterxml.jackson.core.JsonPointer._parseTail(((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.core.JsonPointer)v1).equals(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = "'";
    Object v1 = com.fasterxml.jackson.core.JsonPointer._parseTail(((java.lang.String)v0));
    Object v2 = ": ";
    Object v3 = ((com.fasterxml.jackson.core.JsonPointer)v1).matchProperty(((java.lang.String)v2));
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = "tru";
    Object v1 = com.fasterxml.jackson.core.JsonPointer._parseTail(((java.lang.String)v0));
    Object v2 = "Leading zeroes not allowed";
    Object v3 = ((com.fasterxml.jackson.core.JsonPointer)v1).matchProperty(((java.lang.String)v2));
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = ")=";
    Object v1 = com.fasterxml.jackson.core.JsonPointer.compile(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = ")";
    Object v1 = com.fasterxml.jackson.core.JsonPointer._parseTail(((java.lang.String)v0));
    Object v2 = ")";
    Object v3 = com.fasterxml.jackson.core.JsonPointer._parseTail(((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.core.JsonPointer)v3).getMatchingIndex();
    Object v5 = ((com.fasterxml.jackson.core.JsonPointer)v1).equals(((java.lang.Object)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = "'";
    Object v1 = com.fasterxml.jackson.core.JsonPointer._parseTail(((java.lang.String)v0));
    Object v2 = "";
    Object v3 = ((com.fasterxml.jackson.core.JsonPointer)v1).matchProperty(((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = "tru";
    Object v1 = com.fasterxml.jackson.core.JsonPointer._parseTail(((java.lang.String)v0));
    Object v2 = "tru";
    Object v3 = com.fasterxml.jackson.core.JsonPointer._parseTail(((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.core.JsonPointer)v1).equals(((java.lang.Object)v3));
    Object v5 = ((com.fasterxml.jackson.core.JsonPointer)v1).matches();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = "-INF";
    Object v1 = com.fasterxml.jackson.core.JsonPointer._parseTail(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = "was expecting either '*' or '/' for a comment";
    Object v1 = com.fasterxml.jackson.core.JsonPointer.compile(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = "tru";
    Object v1 = com.fasterxml.jackson.core.JsonPointer._parseTail(((java.lang.String)v0));
    Object v2 = 2;
    Object v3 = ((com.fasterxml.jackson.core.JsonPointer)v1).matchElement((((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = "'";
    Object v1 = com.fasterxml.jackson.core.JsonPointer._parseTail(((java.lang.String)v0));
    Object v2 = 0;
    Object v3 = ((com.fasterxml.jackson.core.JsonPointer)v1).matchElement((((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = "tru";
    Object v1 = com.fasterxml.jackson.core.JsonPointer._parseTail(((java.lang.String)v0));
    Object v2 = "): has to be escaped using backslash to be inclded in ";
    Object v3 = ((com.fasterxml.jackson.core.JsonPointer)v1).matchProperty(((java.lang.String)v2));
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = "y)";
    Object v1 = com.fasterxml.jackson.core.JsonPointer._parseTail(((java.lang.String)v0));
    Object v2 = "Malformed numeric value '";
    Object v3 = com.fasterxml.jackson.core.JsonPointer._parseTail(((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.core.JsonPointer)v3).matches();
    Object v5 = ((com.fasterxml.jackson.core.JsonPointer)v1).equals(((java.lang.Object)v4));
    Object v6 = "'";
    Object v7 = com.fasterxml.jackson.core.JsonPointer._parseTail(((java.lang.String)v6));
    Object v8 = ((com.fasterxml.jackson.core.JsonPointer)v1).equals(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = "write number";
    Object v1 = com.fasterxml.jackson.core.JsonPointer.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = "'";
    Object v1 = com.fasterxml.jackson.core.JsonPointer._parseTail(((java.lang.String)v0));
    Object v2 = "tru";
    Object v3 = com.fasterxml.jackson.core.JsonPointer._parseTail(((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.core.JsonPointer)v1).equals(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = ")";
    Object v1 = com.fasterxml.jackson.core.JsonPointer.compile(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = "'";
    Object v1 = com.fasterxml.jackson.core.JsonPointer._parseTail(((java.lang.String)v0));
    Object v2 = "";
    Object v3 = ((com.fasterxml.jackson.core.JsonPointer)v1).matchProperty(((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.core.JsonPointer)v3).matches();
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = "expected padding character '";
    Object v1 = com.fasterxml.jackson.core.JsonPointer.compile(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = "-INF";
    Object v1 = com.fasterxml.jackson.core.JsonPointer._parseTail(((java.lang.String)v0));
    Object v2 = "'";
    Object v3 = com.fasterxml.jackson.core.JsonPointer._parseTail(((java.lang.String)v2));
    Object v4 = "";
    Object v5 = ((com.fasterxml.jackson.core.JsonPointer)v3).matchProperty(((java.lang.String)v4));
    Object v6 = ((com.fasterxml.jackson.core.JsonPointer)v1).equals(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = "Illegal character (code 0x";
    Object v1 = com.fasterxml.jackson.core.JsonPointer._parseTail(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = "write text value";
    Object v1 = com.fasterxml.jackson.core.JsonPointer._parseTail(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = "Malformed numeric value '";
    Object v1 = com.fasterxml.jackson.core.JsonPointer._parseTail(((java.lang.String)v0));
    Object v2 = ((com.fasterxml.jackson.core.JsonPointer)v1).tail();
    Object v3 = ((com.fasterxml.jackson.core.JsonPointer)v2).getMatchingIndex();
    org.junit.Assert.assertEquals((Object)(-1), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = "-Infinity";
    Object v1 = com.fasterxml.jackson.core.JsonPointer._parseTail(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = "'";
    Object v1 = com.fasterxml.jackson.core.JsonPointer._parseTail(((java.lang.String)v0));
    Object v2 = "";
    Object v3 = ((com.fasterxml.jackson.core.JsonPointer)v1).matchProperty(((java.lang.String)v2));
    Object v4 = 1;
    Object v5 = ((com.fasterxml.jackson.core.JsonPointer)v3).matchElement((((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = "'";
    Object v1 = com.fasterxml.jackson.core.JsonPointer.compile(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = "Illegal character (code 0x";
    Object v1 = com.fasterxml.jackson.core.JsonPointer._parseTail(((java.lang.String)v0));
    Object v2 = ((com.fasterxml.jackson.core.JsonPointer)v1).hashCode();
    org.junit.Assert.assertEquals((Object)(1263649876), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.JsonPointer();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.JsonPointer();
    Object v1 = ((com.fasterxml.jackson.core.JsonPointer)v0).matches();
    org.junit.Assert.assertEquals((Object)(true), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = "'";
    Object v1 = -28;
    Object v2 = com.fasterxml.jackson.core.JsonPointer._parseQuotedTail(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = "6'";
    Object v1 = com.fasterxml.jackson.core.JsonPointer.valueOf(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = "-INF";
    Object v1 = com.fasterxml.jackson.core.JsonPointer._parseTail(((java.lang.String)v0));
    Object v2 = 1;
    Object v3 = ((com.fasterxml.jackson.core.JsonPointer)v1).matchElement((((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = " of 4-char base64 unit: padding only legal as 3rd or 4th character";
    Object v1 = com.fasterxml.jackson.core.JsonPointer._parseTail(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = "'";
    Object v1 = com.fasterxml.jackson.core.JsonPointer._parseTail(((java.lang.String)v0));
    Object v2 = 1;
    Object v3 = ((com.fasterxml.jackson.core.JsonPointer)v1).matchElement((((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = "y)";
    Object v1 = com.fasterxml.jackson.core.JsonPointer._parseTail(((java.lang.String)v0));
    Object v2 = ((com.fasterxml.jackson.core.JsonPointer)v1).mayMatchProperty();
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = "tru";
    Object v1 = com.fasterxml.jackson.core.JsonPointer._parseTail(((java.lang.String)v0));
    Object v2 = ((com.fasterxml.jackson.core.JsonPointer)v1).mayMatchProperty();
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = "-Infinity";
    Object v1 = com.fasterxml.jackson.core.JsonPointer._parseTail(((java.lang.String)v0));
    Object v2 = ((com.fasterxml.jackson.core.JsonPointer)v1).mayMatchElement();
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = "y)";
    Object v1 = com.fasterxml.jackson.core.JsonPointer._parseTail(((java.lang.String)v0));
    Object v2 = " -- suspect a DoS attack based on hash collisio";
    Object v3 = ((com.fasterxml.jackson.core.JsonPointer)v1).matchProperty(((java.lang.String)v2));
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = " of 4-char base64 unit: padding only legal as 3rd or 4th character";
    Object v1 = com.fasterxml.jackson.core.JsonPointer._parseTail(((java.lang.String)v0));
    Object v2 = "'";
    Object v3 = com.fasterxml.jackson.core.JsonPointer._parseTail(((java.lang.String)v2));
    Object v4 = "";
    Object v5 = ((com.fasterxml.jackson.core.JsonPointer)v3).matchProperty(((java.lang.String)v4));
    Object v6 = ((com.fasterxml.jackson.core.JsonPointer)v1).equals(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = "";
    Object v1 = com.fasterxml.jackson.core.JsonPointer.valueOf(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = "";
    Object v1 = com.fasterxml.jackson.core.JsonPointer.valueOf(((java.lang.String)v0));
    Object v2 = ((com.fasterxml.jackson.core.JsonPointer)v1).mayMatchElement();
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = "'";
    Object v1 = com.fasterxml.jackson.core.JsonPointer._parseTail(((java.lang.String)v0));
    Object v2 = "";
    Object v3 = ((com.fasterxml.jackson.core.JsonPointer)v1).matchProperty(((java.lang.String)v2));
    Object v4 = ((com.fasterxml.jackson.core.JsonPointer)v3).hashCode();
    Object v5 = ((com.fasterxml.jackson.core.JsonPointer)v3).matches();
    org.junit.Assert.assertEquals((Object)(true), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = "tru";
    Object v1 = com.fasterxml.jackson.core.JsonPointer._parseTail(((java.lang.String)v0));
    Object v2 = ((com.fasterxml.jackson.core.JsonPointer)v1).mayMatchElement();
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = "Non-standard token '";
    Object v1 = 1;
    Object v2 = com.fasterxml.jackson.core.JsonPointer._parseQuotedTail(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = "was expecting either '*' or '/' for a comment";
    Object v1 = 3;
    Object v2 = com.fasterxml.jackson.core.JsonPointer._parseQuotedTail(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = 1114111;
    Object v2 = com.fasterxml.jackson.core.JsonPointer._parseQuotedTail(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = "write text value";
    Object v1 = com.fasterxml.jackson.core.JsonPointer._parseTail(((java.lang.String)v0));
    Object v2 = ((com.fasterxml.jackson.core.JsonPointer)v1).hashCode();
    Object v3 = 16;
    Object v4 = ((com.fasterxml.jackson.core.JsonPointer)v1).matchElement((((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = "Malformed numeric value '";
    Object v1 = com.fasterxml.jackson.core.JsonPointer._parseTail(((java.lang.String)v0));
    Object v2 = ((com.fasterxml.jackson.core.JsonPointer)v1).hashCode();
    org.junit.Assert.assertEquals((Object)(-481437536), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = " in a comme";
    Object v1 = " of 4-char base64 unit: can";
    Object v2 = "write text value";
    Object v3 = com.fasterxml.jackson.core.JsonPointer._parseTail(((java.lang.String)v2));
    Object v4 = new com.fasterxml.jackson.core.JsonPointer(((java.lang.String)v0),((java.lang.String)v1),((com.fasterxml.jackson.core.JsonPointer)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = com.fasterxml.jackson.core.JsonPointer._parseTail(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = "Illegal character (code 0x";
    Object v1 = com.fasterxml.jackson.core.JsonPointer._parseTail(((java.lang.String)v0));
    Object v2 = ((com.fasterxml.jackson.core.JsonPointer)v1).mayMatchElement();
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = "'";
    Object v1 = com.fasterxml.jackson.core.JsonPointer._parseTail(((java.lang.String)v0));
    Object v2 = ((com.fasterxml.jackson.core.JsonPointer)v1).tail();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new com.fasterxml.jackson.core.JsonPointer();
    Object v1 = ((com.fasterxml.jackson.core.JsonPointer)v0).mayMatchElement();
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = " in a comme";
    Object v1 = " of 4-char base64 unit: can";
    Object v2 = "write text value";
    Object v3 = com.fasterxml.jackson.core.JsonPointer._parseTail(((java.lang.String)v2));
    Object v4 = new com.fasterxml.jackson.core.JsonPointer(((java.lang.String)v0),((java.lang.String)v1),((com.fasterxml.jackson.core.JsonPointer)v3));
    Object v5 = new com.fasterxml.jackson.core.JsonPointer();
    Object v6 = ((com.fasterxml.jackson.core.JsonPointer)v4).equals(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = "K";
    Object v1 = -57;
    Object v2 = com.fasterxml.jackson.core.JsonPointer._parseQuotedTail(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = "Non-standard token 'NaN': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow";
    Object v1 = com.fasterxml.jackson.core.JsonPointer._parseTail(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = "'";
    Object v1 = 0;
    Object v2 = com.fasterxml.jackson.core.JsonPointer._parseQuotedTail(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = "'";
    Object v1 = 0;
    Object v2 = com.fasterxml.jackson.core.JsonPointer._parseQuotedTail(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((com.fasterxml.jackson.core.JsonPointer)v2).mayMatchElement();
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = "tru";
    Object v1 = com.fasterxml.jackson.core.JsonPointer._parseTail(((java.lang.String)v0));
    Object v2 = 1;
    Object v3 = ((com.fasterxml.jackson.core.JsonPointer)v1).matchElement((((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = "-Infinity";
    Object v1 = com.fasterxml.jackson.core.JsonPointer._parseTail(((java.lang.String)v0));
    Object v2 = ((com.fasterxml.jackson.core.JsonPointer)v1).matches();
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = "write umber";
    Object v1 = com.fasterxml.jackson.core.JsonPointer._parseTail(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = "was expecting either valid name character (for` unquoted name) or double-quote (for quoted) to start field name";
    Object v1 = -13;
    Object v2 = com.fasterxml.jackson.core.JsonPointer._parseQuotedTail(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = ")";
    Object v1 = com.fasterxml.jackson.core.JsonPointer._parseTail(((java.lang.String)v0));
    Object v2 = ")";
    Object v3 = ((com.fasterxml.jackson.core.JsonPointer)v1).matchProperty(((java.lang.String)v2));
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = " / 0x";
    Object v1 = -38;
    Object v2 = com.fasterxml.jackson.core.JsonPointer._parseQuotedTail(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = "Illegal character (code 0x";
    Object v1 = com.fasterxml.jackson.core.JsonPointer._parseTail(((java.lang.String)v0));
    Object v2 = ((com.fasterxml.jackson.core.JsonPointer)v1).mayMatchProperty();
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = "was expecting either '*' or '/' for a comment";
    Object v1 = 3;
    Object v2 = com.fasterxml.jackson.core.JsonPointer._parseQuotedTail(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = "Illegal character (code 0x";
    Object v4 = com.fasterxml.jackson.core.JsonPointer._parseTail(((java.lang.String)v3));
    Object v5 = ((com.fasterxml.jackson.core.JsonPointer)v2).equals(((java.lang.Object)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }
}
