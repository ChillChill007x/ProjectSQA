package org.apache.commons.codec.language;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = "SUAR";
    Object v2 = ((org.apache.commons.codec.language.Metaphone)v0).metaphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("SR"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = "SK";
    Object v2 = ((org.apache.commons.codec.language.Metaphone)v0).metaphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("SK"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = "Parameter supplied to Caverphone encode is not of tuype java.lang.String";
    Object v2 = ((org.apache.commons.codec.language.Metaphone)v0).metaphone(((java.lang.String)v1));
    Object v3 = new org.apache.commons.codec.language.Metaphone();
    Object v4 = "SK";
    Object v5 = ((org.apache.commons.codec.language.Metaphone)v3).metaphone(((java.lang.String)v4));
    Object v6 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)("SK"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = 0;
    ((org.apache.commons.codec.language.Metaphone)v0).setMaxCodeLen((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = "HARAC";
    Object v2 = "S";
    Object v3 = ((org.apache.commons.codec.language.Metaphone)v0).isMetaphoneEqual(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "";
    Object v5 = ((org.apache.commons.codec.language.Metaphone)v0).metaphone(((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)(""), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = "/";
    Object v2 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("/"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = new org.apache.commons.codec.language.Metaphone();
    Object v2 = "SK";
    Object v3 = ((org.apache.commons.codec.language.Metaphone)v1).metaphone(((java.lang.String)v2));
    Object v4 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)("SK"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = -17;
    ((org.apache.commons.codec.language.Metaphone)v0).setMaxCodeLen((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = new org.apache.commons.codec.language.Metaphone();
    Object v2 = "HARAC";
    Object v3 = "S";
    Object v4 = ((org.apache.commons.codec.language.Metaphone)v1).isMetaphoneEqual(((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = "";
    Object v6 = ((org.apache.commons.codec.language.Metaphone)v1).metaphone(((java.lang.String)v5));
    Object v7 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.Object)v6));
    org.junit.Assert.assertEquals((Object)(""), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = 0;
    ((org.apache.commons.codec.language.Metaphone)v0).setMaxCodeLen((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = "S_";
    Object v4 = "O";
    Object v5 = ((org.apache.commons.codec.language.Metaphone)v0).isMetaphoneEqual(((java.lang.String)v3),((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = "^[aeitu]";
    Object v2 = "Q=";
    Object v3 = ((org.apache.commons.codec.language.Metaphone)v0).isMetaphoneEqual(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new org.apache.commons.codec.language.Metaphone();
    Object v5 = 0;
    ((org.apache.commons.codec.language.Metaphone)v4).setMaxCodeLen((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    Object v7 = "S_";
    Object v8 = "O";
    Object v9 = ((org.apache.commons.codec.language.Metaphone)v4).isMetaphoneEqual(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.Object)v9));
      org.junit.Assert.fail("Expected org.apache.commons.codec.EncoderException");
    } catch (org.apache.commons.codec.EncoderException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = "A";
    Object v2 = ((org.apache.commons.codec.language.Metaphone)v0).metaphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("A"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = "(UTF-8";
    Object v2 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.String)v1));
    Object v3 = new org.apache.commons.codec.language.Metaphone();
    Object v4 = "A";
    Object v5 = ((org.apache.commons.codec.language.Metaphone)v3).metaphone(((java.lang.String)v4));
    Object v6 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)("A"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = "CORE";
    Object v2 = "UTF--";
    Object v3 = ((org.apache.commons.codec.language.Metaphone)v0).isMetaphoneEqual(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = " encoded content";
    Object v5 = ((org.apache.commons.codec.language.Metaphone)v0).metaphone(((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)("NKTT"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = "Z";
    Object v2 = ((org.apache.commons.codec.language.Metaphone)v0).metaphone(((java.lang.String)v1));
    Object v3 = new org.apache.commons.codec.language.Metaphone();
    Object v4 = "SK";
    Object v5 = ((org.apache.commons.codec.language.Metaphone)v3).metaphone(((java.lang.String)v4));
    Object v6 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)("SK"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = new org.apache.commons.codec.language.Metaphone();
    Object v2 = "A";
    Object v3 = ((org.apache.commons.codec.language.Metaphone)v1).metaphone(((java.lang.String)v2));
    Object v4 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)("A"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = new org.apache.commons.codec.language.Metaphone();
    Object v2 = "A";
    Object v3 = ((org.apache.commons.codec.language.Metaphone)v1).metaphone(((java.lang.String)v2));
    Object v4 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.Object)v3));
    Object v5 = "Z";
    Object v6 = "";
    Object v7 = ((org.apache.commons.codec.language.Metaphone)v0).isMetaphoneEqual(((java.lang.String)v5),((java.lang.String)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = "S";
    Object v2 = " cannot be encoded using Q codec";
    Object v3 = ((org.apache.commons.codec.language.Metaphone)v0).isMetaphoneEqual(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "=~?";
    Object v5 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)(""), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = "^trough";
    Object v2 = ((org.apache.commons.codec.language.Metaphone)v0).metaphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("TR"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = new org.apache.commons.codec.language.Metaphone();
    Object v2 = 0;
    ((org.apache.commons.codec.language.Metaphone)v1).setMaxCodeLen((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    Object v4 = "S_";
    Object v5 = "O";
    Object v6 = ((org.apache.commons.codec.language.Metaphone)v1).isMetaphoneEqual(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.Object)v6));
      org.junit.Assert.fail("Expected org.apache.commons.codec.EncoderException");
    } catch (org.apache.commons.codec.EncoderException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = "aS";
    Object v2 = ((org.apache.commons.codec.language.Metaphone)v0).metaphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("AS"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = "2";
    Object v2 = ((org.apache.commons.codec.language.Metaphone)v0).metaphone(((java.lang.String)v1));
    Object v3 = "SCH";
    Object v4 = ((org.apache.commons.codec.language.Metaphone)v0).metaphone(((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)("SK"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = new org.apache.commons.codec.language.Metaphone();
    Object v2 = "aS";
    Object v3 = ((org.apache.commons.codec.language.Metaphone)v1).metaphone(((java.lang.String)v2));
    Object v4 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)("AS"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = new org.apache.commons.codec.language.Metaphone();
    Object v2 = new org.apache.commons.codec.language.Metaphone();
    Object v3 = "A";
    Object v4 = ((org.apache.commons.codec.language.Metaphone)v2).metaphone(((java.lang.String)v3));
    Object v5 = ((org.apache.commons.codec.language.Metaphone)v1).encode(((java.lang.Object)v4));
    Object v6 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)("A"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = "SI<O";
    Object v2 = ((org.apache.commons.codec.language.Metaphone)v0).metaphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("S"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = "A";
    Object v2 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.String)v1));
    Object v3 = new org.apache.commons.codec.language.Metaphone();
    Object v4 = "aS";
    Object v5 = ((org.apache.commons.codec.language.Metaphone)v3).metaphone(((java.lang.String)v4));
    Object v6 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)("AS"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = new org.apache.commons.codec.language.Metaphone();
    Object v2 = "2";
    Object v3 = ((org.apache.commons.codec.language.Metaphone)v1).metaphone(((java.lang.String)v2));
    Object v4 = "SCH";
    Object v5 = ((org.apache.commons.codec.language.Metaphone)v1).metaphone(((java.lang.String)v4));
    Object v6 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)("SK"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = new org.apache.commons.codec.language.Metaphone();
    Object v2 = new org.apache.commons.codec.language.Metaphone();
    Object v3 = new org.apache.commons.codec.language.Metaphone();
    Object v4 = "A";
    Object v5 = ((org.apache.commons.codec.language.Metaphone)v3).metaphone(((java.lang.String)v4));
    Object v6 = ((org.apache.commons.codec.language.Metaphone)v2).encode(((java.lang.Object)v5));
    Object v7 = ((org.apache.commons.codec.language.Metaphone)v1).encode(((java.lang.Object)v6));
    Object v8 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)("A"), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = "He$";
    Object v2 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("H"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = "";
    Object v2 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.String)v1));
    Object v3 = "B";
    Object v4 = ((org.apache.commons.codec.language.Metaphone)v0).metaphone(((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)("B"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = "=PS";
    Object v2 = ((org.apache.commons.codec.language.Metaphone)v0).metaphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("PS"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = "Adg";
    Object v2 = ((org.apache.commons.codec.language.Metaphone)v0).metaphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("ATK"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = "Objects of type ";
    Object v2 = ((org.apache.commons.codec.language.Metaphone)v0).metaphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("OBJK"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = new org.apache.commons.codec.language.Metaphone();
    Object v2 = "aS";
    Object v3 = ((org.apache.commons.codec.language.Metaphone)v1).metaphone(((java.lang.String)v2));
    Object v4 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.Object)v3));
    Object v5 = "DANGER";
    Object v6 = ((org.apache.commons.codec.language.Metaphone)v0).metaphone(((java.lang.String)v5));
    org.junit.Assert.assertEquals((Object)("TNJR"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = new org.apache.commons.codec.language.Metaphone();
    Object v2 = "^trough";
    Object v3 = ((org.apache.commons.codec.language.Metaphone)v1).metaphone(((java.lang.String)v2));
    Object v4 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)("TR"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = "r";
    Object v2 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("R"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = new org.apache.commons.codec.language.Metaphone();
    Object v2 = "Adg";
    Object v3 = ((org.apache.commons.codec.language.Metaphone)v1).metaphone(((java.lang.String)v2));
    Object v4 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)("ATK"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = "?";
    Object v2 = ((org.apache.commons.codec.language.Metaphone)v0).metaphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("?"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = "I";
    Object v2 = ((org.apache.commons.codec.language.Metaphone)v0).metaphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("I"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = 30;
    ((org.apache.commons.codec.language.Metaphone)v0).setMaxCodeLen((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = "U";
    Object v4 = ((org.apache.commons.codec.language.Metaphone)v0).metaphone(((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)("U"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = new org.apache.commons.codec.language.Metaphone();
    Object v2 = "A";
    Object v3 = ((org.apache.commons.codec.language.Metaphone)v1).metaphone(((java.lang.String)v2));
    Object v4 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.Object)v3));
    Object v5 = "Parameter supplied to Caverphone encode is not o";
    Object v6 = ((org.apache.commons.codec.language.Metaphone)v0).metaphone(((java.lang.String)v5));
    org.junit.Assert.assertEquals((Object)("PRMT"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = new org.apache.commons.codec.language.Metaphone();
    Object v2 = new org.apache.commons.codec.language.Metaphone();
    Object v3 = "A";
    Object v4 = ((org.apache.commons.codec.language.Metaphone)v2).metaphone(((java.lang.String)v3));
    Object v5 = ((org.apache.commons.codec.language.Metaphone)v1).encode(((java.lang.Object)v4));
    Object v6 = "Parameter supplied to Caverphone encode is not o";
    Object v7 = ((org.apache.commons.codec.language.Metaphone)v1).metaphone(((java.lang.String)v6));
    Object v8 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)("PRMT"), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = "";
    Object v2 = ((org.apache.commons.codec.language.Metaphone)v0).metaphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)(""), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = ((org.apache.commons.codec.language.Metaphone)v0).getMaxCodeLen();
    org.junit.Assert.assertEquals((Object)(4), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = "Illegal exadecimal charcter ";
    Object v2 = ((org.apache.commons.codec.language.Metaphone)v0).metaphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("ILKL"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = new org.apache.commons.codec.language.Metaphone();
    Object v2 = "";
    Object v3 = ((org.apache.commons.codec.language.Metaphone)v1).metaphone(((java.lang.String)v2));
    Object v4 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.Object)v3));
    Object v5 = "DANGER";
    Object v6 = ((org.apache.commons.codec.language.Metaphone)v0).metaphone(((java.lang.String)v5));
    org.junit.Assert.assertEquals((Object)("TNJR"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = "t'";
    Object v2 = ((org.apache.commons.codec.language.Metaphone)v0).metaphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("T"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = 6;
    ((org.apache.commons.codec.language.Metaphone)v0).setMaxCodeLen((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = "AEIO";
    Object v2 = ((org.apache.commons.codec.language.Metaphone)v0).metaphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("E"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = "R";
    Object v2 = "SIA";
    Object v3 = ((org.apache.commons.codec.language.Metaphone)v0).isMetaphoneEqual(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "A";
    Object v5 = ((org.apache.commons.codec.language.Metaphone)v0).metaphone(((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)("A"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = "UTF-8";
    Object v2 = "SIO";
    Object v3 = ((org.apache.commons.codec.language.Metaphone)v0).isMetaphoneEqual(((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = 10;
    ((org.apache.commons.codec.language.Metaphone)v0).setMaxCodeLen((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = new org.apache.commons.codec.language.Metaphone();
    Object v4 = "UTF-8";
    Object v5 = "SIO";
    Object v6 = ((org.apache.commons.codec.language.Metaphone)v3).isMetaphoneEqual(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.Object)v6));
      org.junit.Assert.fail("Expected org.apache.commons.codec.EncoderException");
    } catch (org.apache.commons.codec.EncoderException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = "ER";
    Object v2 = ((org.apache.commons.codec.language.Metaphone)v0).metaphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("ER"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = "KS";
    Object v2 = ((org.apache.commons.codec.language.Metaphone)v0).metaphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("KS"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = new org.apache.commons.codec.language.Metaphone();
    Object v2 = "Illegal exadecimal charcter ";
    Object v3 = ((org.apache.commons.codec.language.Metaphone)v1).metaphone(((java.lang.String)v2));
    Object v4 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)("ILKL"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = new org.apache.commons.codec.language.Metaphone();
    Object v2 = "ER";
    Object v3 = ((org.apache.commons.codec.language.Metaphone)v1).metaphone(((java.lang.String)v2));
    Object v4 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)("ER"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = "ZOH";
    Object v2 = "WR";
    Object v3 = ((org.apache.commons.codec.language.Metaphone)v0).isMetaphoneEqual(((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = "";
    Object v2 = "SIO";
    Object v3 = ((org.apache.commons.codec.language.Metaphone)v0).isMetaphoneEqual(((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = "7";
    Object v2 = "P";
    Object v3 = ((org.apache.commons.codec.language.Metaphone)v0).isMetaphoneEqual(((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = "Fm";
    Object v2 = ((org.apache.commons.codec.language.Metaphone)v0).metaphone(((java.lang.String)v1));
    Object v3 = ((org.apache.commons.codec.language.Metaphone)v0).getMaxCodeLen();
    org.junit.Assert.assertEquals((Object)(4), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = "SH";
    Object v2 = ((org.apache.commons.codec.language.Metaphone)v0).metaphone(((java.lang.String)v1));
    Object v3 = ((org.apache.commons.codec.language.Metaphone)v0).getMaxCodeLen();
    org.junit.Assert.assertEquals((Object)(4), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = new org.apache.commons.codec.language.Metaphone();
    Object v2 = "UTF-8";
    Object v3 = "SIO";
    Object v4 = ((org.apache.commons.codec.language.Metaphone)v1).isMetaphoneEqual(((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.Object)v4));
      org.junit.Assert.fail("Expected org.apache.commons.codec.EncoderException");
    } catch (org.apache.commons.codec.EncoderException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = "HOR";
    Object v2 = ((org.apache.commons.codec.language.Metaphone)v0).metaphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("HR"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = new org.apache.commons.codec.language.Metaphone();
    Object v2 = "7";
    Object v3 = "P";
    Object v4 = ((org.apache.commons.codec.language.Metaphone)v1).isMetaphoneEqual(((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.Object)v4));
      org.junit.Assert.fail("Expected org.apache.commons.codec.EncoderException");
    } catch (org.apache.commons.codec.EncoderException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = "v";
    Object v2 = ((org.apache.commons.codec.language.Metaphone)v0).metaphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("V"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = "fuh";
    Object v2 = ((org.apache.commons.codec.language.Metaphone)v0).metaphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("F"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = "P\"S";
    Object v2 = ((org.apache.commons.codec.language.Metaphone)v0).metaphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("PS"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = "EIY";
    Object v2 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.String)v1));
    Object v3 = new org.apache.commons.codec.language.Metaphone();
    Object v4 = "";
    Object v5 = ((org.apache.commons.codec.language.Metaphone)v3).metaphone(((java.lang.String)v4));
    Object v6 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)(""), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = 2;
    ((org.apache.commons.codec.language.Metaphone)v0).setMaxCodeLen((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = "Q";
    Object v4 = ((org.apache.commons.codec.language.Metaphone)v0).metaphone(((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)("Q"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = " cannot be quoted-printabl encoded";
    Object v2 = ((org.apache.commons.codec.language.Metaphone)v0).metaphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("KNTB"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = " cannot be quoted-printable decoded";
    Object v2 = ((org.apache.commons.codec.language.Metaphone)v0).metaphone(((java.lang.String)v1));
    Object v3 = "IgL";
    Object v4 = ((org.apache.commons.codec.language.Metaphone)v0).metaphone(((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)("IKL"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = new org.apache.commons.codec.language.Metaphone();
    Object v2 = 30;
    ((org.apache.commons.codec.language.Metaphone)v1).setMaxCodeLen((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    Object v4 = "U";
    Object v5 = ((org.apache.commons.codec.language.Metaphone)v1).metaphone(((java.lang.String)v4));
    Object v6 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)("U"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = -28;
    ((org.apache.commons.codec.language.Metaphone)v0).setMaxCodeLen((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = "AE/OUY";
    Object v4 = ((org.apache.commons.codec.language.Metaphone)v0).metaphone(((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)(""), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = "CIO";
    Object v2 = "\"n";
    Object v3 = ((org.apache.commons.codec.language.Metaphone)v0).isMetaphoneEqual(((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = "DANGER";
    Object v2 = ((org.apache.commons.codec.language.Metaphone)v0).metaphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("TNJR"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = "1N";
    Object v2 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("N"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = " iannot be quoted-printable decoded";
    Object v2 = ((org.apache.commons.codec.language.Metaphone)v0).metaphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("NTBK"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = "TS";
    Object v2 = "m+";
    Object v3 = ((org.apache.commons.codec.language.Metaphone)v0).isMetaphoneEqual(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new org.apache.commons.codec.language.Metaphone();
    Object v5 = "A";
    Object v6 = ((org.apache.commons.codec.language.Metaphone)v4).metaphone(((java.lang.String)v5));
    Object v7 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.Object)v6));
    org.junit.Assert.assertEquals((Object)("A"), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = new org.apache.commons.codec.language.Metaphone();
    Object v2 = new org.apache.commons.codec.language.Metaphone();
    Object v3 = "Adg";
    Object v4 = ((org.apache.commons.codec.language.Metaphone)v2).metaphone(((java.lang.String)v3));
    Object v5 = ((org.apache.commons.codec.language.Metaphone)v1).encode(((java.lang.Object)v4));
    Object v6 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)("ATK"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = "N";
    Object v2 = "OWSKY";
    Object v3 = ((org.apache.commons.codec.language.Metaphone)v0).isMetaphoneEqual(((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = "Gh";
    Object v2 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.String)v1));
    Object v3 = new org.apache.commons.codec.language.Metaphone();
    Object v4 = new org.apache.commons.codec.language.Metaphone();
    Object v5 = "A";
    Object v6 = ((org.apache.commons.codec.language.Metaphone)v4).metaphone(((java.lang.String)v5));
    Object v7 = ((org.apache.commons.codec.language.Metaphone)v3).encode(((java.lang.Object)v6));
    Object v8 = "Parameter supplied to Caverphone encode is not o";
    Object v9 = ((org.apache.commons.codec.language.Metaphone)v3).metaphone(((java.lang.String)v8));
    Object v10 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.Object)v9));
    org.junit.Assert.assertEquals((Object)("PRMT"), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = " cannot be URL decoded";
    Object v2 = ((org.apache.commons.codec.language.Metaphone)v0).metaphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("KNTB"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = new org.apache.commons.codec.language.Metaphone();
    Object v2 = "SH";
    Object v3 = ((org.apache.commons.codec.language.Metaphone)v1).metaphone(((java.lang.String)v2));
    Object v4 = ((org.apache.commons.codec.language.Metaphone)v1).getMaxCodeLen();
    Object v5 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.Object)v4));
      org.junit.Assert.fail("Expected org.apache.commons.codec.EncoderException");
    } catch (org.apache.commons.codec.EncoderException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = new org.apache.commons.codec.language.Metaphone();
    Object v2 = "v";
    Object v3 = ((org.apache.commons.codec.language.Metaphone)v1).metaphone(((java.lang.String)v2));
    Object v4 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)("V"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = new org.apache.commons.codec.language.Metaphone();
    Object v2 = "t'";
    Object v3 = ((org.apache.commons.codec.language.Metaphone)v1).metaphone(((java.lang.String)v2));
    Object v4 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)("T"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = "US-QASCII";
    Object v2 = ((org.apache.commons.codec.language.Metaphone)v0).metaphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("USKS"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = "2A";
    Object v2 = "XH";
    Object v3 = ((org.apache.commons.codec.language.Metaphone)v0).isMetaphoneEqual(((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = new org.apache.commons.codec.language.Metaphone();
    Object v2 = new org.apache.commons.codec.language.Metaphone();
    Object v3 = 30;
    ((org.apache.commons.codec.language.Metaphone)v2).setMaxCodeLen((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    Object v5 = "U";
    Object v6 = ((org.apache.commons.codec.language.Metaphone)v2).metaphone(((java.lang.String)v5));
    Object v7 = ((org.apache.commons.codec.language.Metaphone)v1).encode(((java.lang.Object)v6));
    Object v8 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)("U"), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = "VAN ";
    Object v2 = ((org.apache.commons.codec.language.Metaphone)v0).metaphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("FN"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = "US-ASCII";
    Object v2 = ((org.apache.commons.codec.language.Metaphone)v0).metaphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("USS"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = "UTF-8";
    Object v2 = ((org.apache.commons.codec.language.Metaphone)v0).metaphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("UTF"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = new org.apache.commons.codec.language.Metaphone();
    Object v2 = ((org.apache.commons.codec.language.Metaphone)v1).getMaxCodeLen();
    Object v3 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.Object)v2));
      org.junit.Assert.fail("Expected org.apache.commons.codec.EncoderException");
    } catch (org.apache.commons.codec.EncoderException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = new org.apache.commons.codec.language.Metaphone();
    Object v2 = "TS";
    Object v3 = "m+";
    Object v4 = ((org.apache.commons.codec.language.Metaphone)v1).isMetaphoneEqual(((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = new org.apache.commons.codec.language.Metaphone();
    Object v6 = "A";
    Object v7 = ((org.apache.commons.codec.language.Metaphone)v5).metaphone(((java.lang.String)v6));
    Object v8 = ((org.apache.commons.codec.language.Metaphone)v1).encode(((java.lang.Object)v7));
    Object v9 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.Object)v8));
    org.junit.Assert.assertEquals((Object)("A"), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = new org.apache.commons.codec.language.Metaphone();
    Object v2 = "";
    Object v3 = ((org.apache.commons.codec.language.Metaphone)v1).metaphone(((java.lang.String)v2));
    Object v4 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.Object)v3));
    Object v5 = new org.apache.commons.codec.language.Metaphone();
    Object v6 = "Fm";
    Object v7 = ((org.apache.commons.codec.language.Metaphone)v5).metaphone(((java.lang.String)v6));
    Object v8 = ((org.apache.commons.codec.language.Metaphone)v5).getMaxCodeLen();
    Object v9 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.Object)v8));
      org.junit.Assert.fail("Expected org.apache.commons.codec.EncoderException");
    } catch (org.apache.commons.codec.EncoderException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = "US-ASCIF";
    Object v2 = ((org.apache.commons.codec.language.Metaphone)v0).metaphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("USSF"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = new org.apache.commons.codec.language.Metaphone();
    Object v2 = "P\"S";
    Object v3 = ((org.apache.commons.codec.language.Metaphone)v1).metaphone(((java.lang.String)v2));
    Object v4 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)("PS"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = "sTh";
    Object v2 = ((org.apache.commons.codec.language.Metaphone)v0).metaphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("S0"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = "rJ";
    Object v2 = ((org.apache.commons.codec.language.Metaphone)v0).metaphone(((java.lang.String)v1));
    Object v3 = ((org.apache.commons.codec.language.Metaphone)v0).getMaxCodeLen();
    org.junit.Assert.assertEquals((Object)(4), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = "WR";
    Object v2 = "f+";
    Object v3 = ((org.apache.commons.codec.language.Metaphone)v0).isMetaphoneEqual(((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }
}
