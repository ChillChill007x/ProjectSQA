package org.apache.commons.codec.language;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = 0;
    ((org.apache.commons.codec.language.Metaphone)v0).setMaxCodeLen((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = "wh3";
    Object v4 = ((org.apache.commons.codec.language.Metaphone)v0).metaphone(((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)(""), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = new org.apache.commons.codec.language.Metaphone();
    Object v2 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.Object)v1));
      org.junit.Assert.fail("Expected org.apache.commons.codec.EncoderException");
    } catch (org.apache.commons.codec.EncoderException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = new org.apache.commons.codec.language.Metaphone();
    Object v2 = 0;
    ((org.apache.commons.codec.language.Metaphone)v1).setMaxCodeLen((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    Object v4 = "wh3";
    Object v5 = ((org.apache.commons.codec.language.Metaphone)v1).metaphone(((java.lang.String)v4));
    Object v6 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)(""), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = "HOL";
    Object v2 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("HL"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = "l$";
    Object v2 = ((org.apache.commons.codec.language.Metaphone)v0).metaphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("L"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = new org.apache.commons.codec.language.Metaphone();
    Object v2 = "HOL";
    Object v3 = ((org.apache.commons.codec.language.Metaphone)v1).encode(((java.lang.String)v2));
    Object v4 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)("L"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = ((org.apache.commons.codec.language.Metaphone)v0).getMaxCodeLen();
    org.junit.Assert.assertEquals((Object)(4), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = "I";
    Object v2 = ((org.apache.commons.codec.language.Metaphone)v0).metaphone(((java.lang.String)v1));
    Object v3 = "argument not a byte array";
    Object v4 = ((org.apache.commons.codec.language.Metaphone)v0).metaphone(((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)("ARKM"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = new org.apache.commons.codec.language.Metaphone();
    Object v2 = "I";
    Object v3 = ((org.apache.commons.codec.language.Metaphone)v1).metaphone(((java.lang.String)v2));
    Object v4 = "argument not a byte array";
    Object v5 = ((org.apache.commons.codec.language.Metaphone)v1).metaphone(((java.lang.String)v4));
    Object v6 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)("ARKM"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = "CE";
    Object v2 = ((org.apache.commons.codec.language.Metaphone)v0).metaphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("S"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = 60;
    ((org.apache.commons.codec.language.Metaphone)v0).setMaxCodeLen((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = new org.apache.commons.codec.language.Metaphone();
    Object v4 = new org.apache.commons.codec.language.Metaphone();
    Object v5 = 0;
    ((org.apache.commons.codec.language.Metaphone)v4).setMaxCodeLen((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    Object v7 = "wh3";
    Object v8 = ((org.apache.commons.codec.language.Metaphone)v4).metaphone(((java.lang.String)v7));
    Object v9 = ((org.apache.commons.codec.language.Metaphone)v3).encode(((java.lang.Object)v8));
    Object v10 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.Object)v9));
    org.junit.Assert.assertEquals((Object)(""), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = "YS";
    Object v2 = "UTF-8Y";
    Object v3 = ((org.apache.commons.codec.language.Metaphone)v0).isMetaphoneEqual(((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = "S";
    Object v2 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.String)v1));
    Object v3 = new org.apache.commons.codec.language.Metaphone();
    Object v4 = new org.apache.commons.codec.language.Metaphone();
    Object v5 = "HOL";
    Object v6 = ((org.apache.commons.codec.language.Metaphone)v4).encode(((java.lang.String)v5));
    Object v7 = ((org.apache.commons.codec.language.Metaphone)v3).encode(((java.lang.Object)v6));
    Object v8 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)("L"), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = "USASCII";
    Object v2 = ((org.apache.commons.codec.language.Metaphone)v0).metaphone(((java.lang.String)v1));
    Object v3 = "#";
    Object v4 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)("#"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = 1;
    ((org.apache.commons.codec.language.Metaphone)v0).setMaxCodeLen((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = new org.apache.commons.codec.language.Metaphone();
    Object v2 = ((org.apache.commons.codec.language.Metaphone)v1).getMaxCodeLen();
    Object v3 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.Object)v2));
      org.junit.Assert.fail("Expected org.apache.commons.codec.EncoderException");
    } catch (org.apache.commons.codec.EncoderException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = new org.apache.commons.codec.language.Metaphone();
    Object v2 = 60;
    ((org.apache.commons.codec.language.Metaphone)v1).setMaxCodeLen((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    Object v4 = new org.apache.commons.codec.language.Metaphone();
    Object v5 = new org.apache.commons.codec.language.Metaphone();
    Object v6 = 0;
    ((org.apache.commons.codec.language.Metaphone)v5).setMaxCodeLen((((java.lang.Integer)v6).intValue()));
    Object v7 = null;
    Object v8 = "wh3";
    Object v9 = ((org.apache.commons.codec.language.Metaphone)v5).metaphone(((java.lang.String)v8));
    Object v10 = ((org.apache.commons.codec.language.Metaphone)v4).encode(((java.lang.Object)v9));
    Object v11 = ((org.apache.commons.codec.language.Metaphone)v1).encode(((java.lang.Object)v10));
    Object v12 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.Object)v11));
    org.junit.Assert.assertEquals((Object)(""), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = new org.apache.commons.codec.language.Metaphone();
    Object v2 = new org.apache.commons.codec.language.Metaphone();
    Object v3 = "I";
    Object v4 = ((org.apache.commons.codec.language.Metaphone)v2).metaphone(((java.lang.String)v3));
    Object v5 = "argument not a byte array";
    Object v6 = ((org.apache.commons.codec.language.Metaphone)v2).metaphone(((java.lang.String)v5));
    Object v7 = ((org.apache.commons.codec.language.Metaphone)v1).encode(((java.lang.Object)v6));
    Object v8 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)("ARKM"), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = new org.apache.commons.codec.language.Metaphone();
    Object v2 = "USASCII";
    Object v3 = ((org.apache.commons.codec.language.Metaphone)v1).metaphone(((java.lang.String)v2));
    Object v4 = "#";
    Object v5 = ((org.apache.commons.codec.language.Metaphone)v1).encode(((java.lang.String)v4));
    Object v6 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)("#"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = ">H";
    Object v2 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)(""), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = "?X";
    Object v2 = ((org.apache.commons.codec.language.Metaphone)v0).metaphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("KS"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = "";
    Object v2 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.String)v1));
    Object v3 = new org.apache.commons.codec.language.Metaphone();
    Object v4 = 60;
    ((org.apache.commons.codec.language.Metaphone)v3).setMaxCodeLen((((java.lang.Integer)v4).intValue()));
    Object v5 = null;
    Object v6 = new org.apache.commons.codec.language.Metaphone();
    Object v7 = new org.apache.commons.codec.language.Metaphone();
    Object v8 = 0;
    ((org.apache.commons.codec.language.Metaphone)v7).setMaxCodeLen((((java.lang.Integer)v8).intValue()));
    Object v9 = null;
    Object v10 = "wh3";
    Object v11 = ((org.apache.commons.codec.language.Metaphone)v7).metaphone(((java.lang.String)v10));
    Object v12 = ((org.apache.commons.codec.language.Metaphone)v6).encode(((java.lang.Object)v11));
    Object v13 = ((org.apache.commons.codec.language.Metaphone)v3).encode(((java.lang.Object)v12));
    Object v14 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.Object)v13));
    org.junit.Assert.assertEquals((Object)(""), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = "Objects of ";
    Object v2 = ((org.apache.commons.codec.language.Metaphone)v0).metaphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("OBJK"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = "5N";
    Object v2 = ((org.apache.commons.codec.language.Metaphone)v0).metaphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("N"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = 10;
    ((org.apache.commons.codec.language.Metaphone)v0).setMaxCodeLen((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = new org.apache.commons.codec.language.Metaphone();
    Object v2 = "YS";
    Object v3 = "UTF-8Y";
    Object v4 = ((org.apache.commons.codec.language.Metaphone)v1).isMetaphoneEqual(((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.Object)v4));
      org.junit.Assert.fail("Expected org.apache.commons.codec.EncoderException");
    } catch (org.apache.commons.codec.EncoderException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = "SHA-256";
    Object v2 = ((org.apache.commons.codec.language.Metaphone)v0).metaphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("X"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = "tl3";
    Object v2 = ((org.apache.commons.codec.language.Metaphone)v0).metaphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("TL"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = new org.apache.commons.codec.language.Metaphone();
    Object v2 = ">H";
    Object v3 = ((org.apache.commons.codec.language.Metaphone)v1).encode(((java.lang.String)v2));
    Object v4 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)(""), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = new org.apache.commons.codec.language.Metaphone();
    Object v2 = new org.apache.commons.codec.language.Metaphone();
    Object v3 = 60;
    ((org.apache.commons.codec.language.Metaphone)v2).setMaxCodeLen((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    Object v5 = new org.apache.commons.codec.language.Metaphone();
    Object v6 = new org.apache.commons.codec.language.Metaphone();
    Object v7 = 0;
    ((org.apache.commons.codec.language.Metaphone)v6).setMaxCodeLen((((java.lang.Integer)v7).intValue()));
    Object v8 = null;
    Object v9 = "wh3";
    Object v10 = ((org.apache.commons.codec.language.Metaphone)v6).metaphone(((java.lang.String)v9));
    Object v11 = ((org.apache.commons.codec.language.Metaphone)v5).encode(((java.lang.Object)v10));
    Object v12 = ((org.apache.commons.codec.language.Metaphone)v2).encode(((java.lang.Object)v11));
    Object v13 = ((org.apache.commons.codec.language.Metaphone)v1).encode(((java.lang.Object)v12));
    Object v14 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.Object)v13));
    org.junit.Assert.assertEquals((Object)(""), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = "UTCF-8";
    Object v2 = ((org.apache.commons.codec.language.Metaphone)v0).metaphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("UTKF"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = "";
    Object v2 = ((org.apache.commons.codec.language.Metaphone)v0).metaphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)(""), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = "3";
    Object v2 = ((org.apache.commons.codec.language.Metaphone)v0).metaphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("3"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = "E";
    Object v2 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("E"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = "O";
    Object v2 = ((org.apache.commons.codec.language.Metaphone)v0).metaphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("O"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = new org.apache.commons.codec.language.Metaphone();
    Object v2 = new org.apache.commons.codec.language.Metaphone();
    Object v3 = ">H";
    Object v4 = ((org.apache.commons.codec.language.Metaphone)v2).encode(((java.lang.String)v3));
    Object v5 = ((org.apache.commons.codec.language.Metaphone)v1).encode(((java.lang.Object)v4));
    Object v6 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)(""), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = "UTF-8";
    Object v2 = ((org.apache.commons.codec.language.Metaphone)v0).metaphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("UTF"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = "SIA";
    Object v2 = ((org.apache.commons.codec.language.Metaphone)v0).metaphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("X"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = "WR";
    Object v2 = ((org.apache.commons.codec.language.Metaphone)v0).metaphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("R"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = -41;
    ((org.apache.commons.codec.language.Metaphone)v0).setMaxCodeLen((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = new org.apache.commons.codec.language.Metaphone();
    Object v4 = new org.apache.commons.codec.language.Metaphone();
    Object v5 = 0;
    ((org.apache.commons.codec.language.Metaphone)v4).setMaxCodeLen((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    Object v7 = "wh3";
    Object v8 = ((org.apache.commons.codec.language.Metaphone)v4).metaphone(((java.lang.String)v7));
    Object v9 = ((org.apache.commons.codec.language.Metaphone)v3).encode(((java.lang.Object)v8));
    Object v10 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.Object)v9));
    org.junit.Assert.assertEquals((Object)(""), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = "B";
    Object v2 = ((org.apache.commons.codec.language.Metaphone)v0).metaphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("B"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = new org.apache.commons.codec.language.Metaphone();
    Object v2 = "E";
    Object v3 = ((org.apache.commons.codec.language.Metaphone)v1).encode(((java.lang.String)v2));
    Object v4 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)("E"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = new org.apache.commons.codec.language.Metaphone();
    Object v2 = new org.apache.commons.codec.language.Metaphone();
    Object v3 = "E";
    Object v4 = ((org.apache.commons.codec.language.Metaphone)v2).encode(((java.lang.String)v3));
    Object v5 = ((org.apache.commons.codec.language.Metaphone)v1).encode(((java.lang.Object)v4));
    Object v6 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)("E"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = new org.apache.commons.codec.language.Metaphone();
    Object v2 = "UTCF-8";
    Object v3 = ((org.apache.commons.codec.language.Metaphone)v1).metaphone(((java.lang.String)v2));
    Object v4 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)("UTKF"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = -34;
    ((org.apache.commons.codec.language.Metaphone)v0).setMaxCodeLen((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = "#^rough";
    Object v4 = ((org.apache.commons.codec.language.Metaphone)v0).metaphone(((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)(""), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = new org.apache.commons.codec.language.Metaphone();
    Object v2 = "5N";
    Object v3 = ((org.apache.commons.codec.language.Metaphone)v1).metaphone(((java.lang.String)v2));
    Object v4 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)("N"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = new org.apache.commons.codec.language.Metaphone();
    Object v2 = "B";
    Object v3 = ((org.apache.commons.codec.language.Metaphone)v1).metaphone(((java.lang.String)v2));
    Object v4 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)("B"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = "N";
    Object v2 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.String)v1));
    Object v3 = new org.apache.commons.codec.language.Metaphone();
    Object v4 = "";
    Object v5 = ((org.apache.commons.codec.language.Metaphone)v3).metaphone(((java.lang.String)v4));
    Object v6 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)(""), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = "s+0";
    Object v2 = ((org.apache.commons.codec.language.Metaphone)v0).metaphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("S"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = "CCH";
    Object v2 = ((org.apache.commons.codec.language.Metaphone)v0).metaphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("KX"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = "MA";
    Object v2 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.String)v1));
    Object v3 = new org.apache.commons.codec.language.Metaphone();
    Object v4 = "YS";
    Object v5 = "UTF-8Y";
    Object v6 = ((org.apache.commons.codec.language.Metaphone)v3).isMetaphoneEqual(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.Object)v6));
      org.junit.Assert.fail("Expected org.apache.commons.codec.EncoderException");
    } catch (org.apache.commons.codec.EncoderException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = "Objects f type ";
    Object v2 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("OBJK"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = new org.apache.commons.codec.language.Metaphone();
    Object v2 = "WR";
    Object v3 = ((org.apache.commons.codec.language.Metaphone)v1).metaphone(((java.lang.String)v2));
    Object v4 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)("R"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = new org.apache.commons.codec.language.Metaphone();
    Object v2 = "SIA";
    Object v3 = ((org.apache.commons.codec.language.Metaphone)v1).metaphone(((java.lang.String)v2));
    Object v4 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)("X"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = " cannot be quoted-prQntable encoded";
    Object v2 = ((org.apache.commons.codec.language.Metaphone)v0).metaphone(((java.lang.String)v1));
    Object v3 = "E";
    Object v4 = ((org.apache.commons.codec.language.Metaphone)v0).metaphone(((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)("E"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = new org.apache.commons.codec.language.Metaphone();
    Object v2 = new org.apache.commons.codec.language.Metaphone();
    Object v3 = new org.apache.commons.codec.language.Metaphone();
    Object v4 = "E";
    Object v5 = ((org.apache.commons.codec.language.Metaphone)v3).encode(((java.lang.String)v4));
    Object v6 = ((org.apache.commons.codec.language.Metaphone)v2).encode(((java.lang.Object)v5));
    Object v7 = ((org.apache.commons.codec.language.Metaphone)v1).encode(((java.lang.Object)v6));
    Object v8 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)("E"), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = "trou2f";
    Object v2 = ((org.apache.commons.codec.language.Metaphone)v0).metaphone(((java.lang.String)v1));
    Object v3 = "O";
    Object v4 = ((org.apache.commons.codec.language.Metaphone)v0).metaphone(((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)("O"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = new org.apache.commons.codec.language.Metaphone();
    Object v2 = "O";
    Object v3 = ((org.apache.commons.codec.language.Metaphone)v1).metaphone(((java.lang.String)v2));
    Object v4 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)("O"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = "US-ASCII";
    Object v2 = ((org.apache.commons.codec.language.Metaphone)v0).metaphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("USS"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = new org.apache.commons.codec.language.Metaphone();
    Object v2 = " cannot be quoted-prQntable encoded";
    Object v3 = ((org.apache.commons.codec.language.Metaphone)v1).metaphone(((java.lang.String)v2));
    Object v4 = "E";
    Object v5 = ((org.apache.commons.codec.language.Metaphone)v1).metaphone(((java.lang.String)v4));
    Object v6 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.Object)v5));
    Object v7 = "^co`ugh";
    Object v8 = ((org.apache.commons.codec.language.Metaphone)v0).metaphone(((java.lang.String)v7));
    org.junit.Assert.assertEquals((Object)("K"), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = new org.apache.commons.codec.language.Metaphone();
    Object v2 = "Objects of ";
    Object v3 = ((org.apache.commons.codec.language.Metaphone)v1).metaphone(((java.lang.String)v2));
    Object v4 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)("OBJK"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = "";
    Object v2 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.String)v1));
    Object v3 = new org.apache.commons.codec.language.Metaphone();
    Object v4 = new org.apache.commons.codec.language.Metaphone();
    Object v5 = "Objects of ";
    Object v6 = ((org.apache.commons.codec.language.Metaphone)v4).metaphone(((java.lang.String)v5));
    Object v7 = ((org.apache.commons.codec.language.Metaphone)v3).encode(((java.lang.Object)v6));
    Object v8 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)("OBJK"), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = "UCC[EE";
    Object v2 = ((org.apache.commons.codec.language.Metaphone)v0).metaphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("UKK"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = "S";
    Object v2 = ((org.apache.commons.codec.language.Metaphone)v0).metaphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("S"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = "QN";
    Object v2 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("KN"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = "I";
    Object v2 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("I"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = "C";
    Object v2 = ((org.apache.commons.codec.language.Metaphone)v0).metaphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("C"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = new org.apache.commons.codec.language.Metaphone();
    Object v2 = "QN";
    Object v3 = ((org.apache.commons.codec.language.Metaphone)v1).encode(((java.lang.String)v2));
    Object v4 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)("N"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = new org.apache.commons.codec.language.Metaphone();
    Object v2 = "";
    Object v3 = ((org.apache.commons.codec.language.Metaphone)v1).encode(((java.lang.String)v2));
    Object v4 = new org.apache.commons.codec.language.Metaphone();
    Object v5 = new org.apache.commons.codec.language.Metaphone();
    Object v6 = "Objects of ";
    Object v7 = ((org.apache.commons.codec.language.Metaphone)v5).metaphone(((java.lang.String)v6));
    Object v8 = ((org.apache.commons.codec.language.Metaphone)v4).encode(((java.lang.Object)v7));
    Object v9 = ((org.apache.commons.codec.language.Metaphone)v1).encode(((java.lang.Object)v8));
    Object v10 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.Object)v9));
    org.junit.Assert.assertEquals((Object)("OBJK"), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = new org.apache.commons.codec.language.Metaphone();
    Object v2 = new org.apache.commons.codec.language.Metaphone();
    Object v3 = "WR";
    Object v4 = ((org.apache.commons.codec.language.Metaphone)v2).metaphone(((java.lang.String)v3));
    Object v5 = ((org.apache.commons.codec.language.Metaphone)v1).encode(((java.lang.Object)v4));
    Object v6 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)("R"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = new org.apache.commons.codec.language.Metaphone();
    Object v2 = "trou2f";
    Object v3 = ((org.apache.commons.codec.language.Metaphone)v1).metaphone(((java.lang.String)v2));
    Object v4 = "O";
    Object v5 = ((org.apache.commons.codec.language.Metaphone)v1).metaphone(((java.lang.String)v4));
    Object v6 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)("O"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = new org.apache.commons.codec.language.Metaphone();
    Object v2 = new org.apache.commons.codec.language.Metaphone();
    Object v3 = "SIA";
    Object v4 = ((org.apache.commons.codec.language.Metaphone)v2).metaphone(((java.lang.String)v3));
    Object v5 = ((org.apache.commons.codec.language.Metaphone)v1).encode(((java.lang.Object)v4));
    Object v6 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)("X"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = "Hp";
    Object v2 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("P"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = new org.apache.commons.codec.language.Metaphone();
    Object v2 = new org.apache.commons.codec.language.Metaphone();
    Object v3 = "B";
    Object v4 = ((org.apache.commons.codec.language.Metaphone)v2).metaphone(((java.lang.String)v3));
    Object v5 = ((org.apache.commons.codec.language.Metaphone)v1).encode(((java.lang.Object)v4));
    Object v6 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)("B"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = new org.apache.commons.codec.language.Metaphone();
    Object v2 = "B";
    Object v3 = ((org.apache.commons.codec.language.Metaphone)v1).metaphone(((java.lang.String)v2));
    Object v4 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.Object)v3));
    Object v5 = ((org.apache.commons.codec.language.Metaphone)v0).getMaxCodeLen();
    org.junit.Assert.assertEquals((Object)(4), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = new org.apache.commons.codec.language.Metaphone();
    Object v2 = "";
    Object v3 = ((org.apache.commons.codec.language.Metaphone)v1).metaphone(((java.lang.String)v2));
    Object v4 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)(""), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = "VAN ";
    Object v2 = ((org.apache.commons.codec.language.Metaphone)v0).metaphone(((java.lang.String)v1));
    Object v3 = "Invalid quoted-printable encoding";
    Object v4 = ((org.apache.commons.codec.language.Metaphone)v0).metaphone(((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)("INFL"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = new org.apache.commons.codec.language.Metaphone();
    Object v2 = "S";
    Object v3 = ((org.apache.commons.codec.language.Metaphone)v1).metaphone(((java.lang.String)v2));
    Object v4 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)("S"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = new org.apache.commons.codec.language.Metaphone();
    Object v2 = "SHA-256";
    Object v3 = ((org.apache.commons.codec.language.Metaphone)v1).metaphone(((java.lang.String)v2));
    Object v4 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)("X"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = new org.apache.commons.codec.language.Metaphone();
    Object v2 = new org.apache.commons.codec.language.Metaphone();
    Object v3 = "SHA-256";
    Object v4 = ((org.apache.commons.codec.language.Metaphone)v2).metaphone(((java.lang.String)v3));
    Object v5 = ((org.apache.commons.codec.language.Metaphone)v1).encode(((java.lang.Object)v4));
    Object v6 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)("X"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = "";
    Object v2 = "UTF-8";
    Object v3 = ((org.apache.commons.codec.language.Metaphone)v0).isMetaphoneEqual(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new org.apache.commons.codec.language.Metaphone();
    Object v5 = "USASCII";
    Object v6 = ((org.apache.commons.codec.language.Metaphone)v4).metaphone(((java.lang.String)v5));
    Object v7 = "#";
    Object v8 = ((org.apache.commons.codec.language.Metaphone)v4).encode(((java.lang.String)v7));
    Object v9 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.Object)v8));
    org.junit.Assert.assertEquals((Object)("#"), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = "DG";
    Object v2 = ((org.apache.commons.codec.language.Metaphone)v0).metaphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("TK"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = " CHIA";
    Object v2 = ((org.apache.commons.codec.language.Metaphone)v0).metaphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("X"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = "TK";
    Object v2 = ((org.apache.commons.codec.language.Metaphone)v0).metaphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("TK"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = new org.apache.commons.codec.language.Metaphone();
    Object v2 = "Objects of ";
    Object v3 = ((org.apache.commons.codec.language.Metaphone)v1).metaphone(((java.lang.String)v2));
    Object v4 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.Object)v3));
    Object v5 = " cannot be URL decoded";
    Object v6 = ((org.apache.commons.codec.language.Metaphone)v0).metaphone(((java.lang.String)v5));
    org.junit.Assert.assertEquals((Object)("KNTB"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = "Objects o, type ";
    Object v2 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.String)v1));
    Object v3 = "3$";
    Object v4 = ((org.apache.commons.codec.language.Metaphone)v0).metaphone(((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)(""), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = new org.apache.commons.codec.language.Metaphone();
    Object v2 = new org.apache.commons.codec.language.Metaphone();
    Object v3 = "5N";
    Object v4 = ((org.apache.commons.codec.language.Metaphone)v2).metaphone(((java.lang.String)v3));
    Object v5 = ((org.apache.commons.codec.language.Metaphone)v1).encode(((java.lang.Object)v4));
    Object v6 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)("N"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = "j";
    Object v2 = ((org.apache.commons.codec.language.Metaphone)v0).metaphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("J"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = " cannot be quoted-priOntable encoded";
    Object v2 = ((org.apache.commons.codec.language.Metaphone)v0).metaphone(((java.lang.String)v1));
    Object v3 = new org.apache.commons.codec.language.Metaphone();
    Object v4 = "DG";
    Object v5 = ((org.apache.commons.codec.language.Metaphone)v3).metaphone(((java.lang.String)v4));
    Object v6 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)("TK"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = "CSPTG";
    Object v2 = ((org.apache.commons.codec.language.Metaphone)v0).metaphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("KSPT"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = new org.apache.commons.codec.language.Metaphone();
    Object v2 = new org.apache.commons.codec.language.Metaphone();
    Object v3 = new org.apache.commons.codec.language.Metaphone();
    Object v4 = "B";
    Object v5 = ((org.apache.commons.codec.language.Metaphone)v3).metaphone(((java.lang.String)v4));
    Object v6 = ((org.apache.commons.codec.language.Metaphone)v2).encode(((java.lang.Object)v5));
    Object v7 = ((org.apache.commons.codec.language.Metaphone)v1).encode(((java.lang.Object)v6));
    Object v8 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)("B"), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = "ACH";
    Object v2 = ((org.apache.commons.codec.language.Metaphone)v0).metaphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("AX"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = "UTF-8";
    Object v2 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.String)v1));
    Object v3 = "&Wh3";
    Object v4 = ((org.apache.commons.codec.language.Metaphone)v0).metaphone(((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)(""), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = new org.apache.commons.codec.language.Metaphone();
    Object v2 = new org.apache.commons.codec.language.Metaphone();
    Object v3 = "HOL";
    Object v4 = ((org.apache.commons.codec.language.Metaphone)v2).encode(((java.lang.String)v3));
    Object v5 = ((org.apache.commons.codec.language.Metaphone)v1).encode(((java.lang.Object)v4));
    Object v6 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)("L"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = new org.apache.commons.codec.language.Metaphone();
    Object v2 = "CCH";
    Object v3 = ((org.apache.commons.codec.language.Metaphone)v1).metaphone(((java.lang.String)v2));
    Object v4 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)("KKS"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = "";
    Object v2 = "A";
    Object v3 = ((org.apache.commons.codec.language.Metaphone)v0).isMetaphoneEqual(((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = -52;
    ((org.apache.commons.codec.language.Metaphone)v0).setMaxCodeLen((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = new org.apache.commons.codec.language.Metaphone();
    Object v4 = new org.apache.commons.codec.language.Metaphone();
    Object v5 = ">H";
    Object v6 = ((org.apache.commons.codec.language.Metaphone)v4).encode(((java.lang.String)v5));
    Object v7 = ((org.apache.commons.codec.language.Metaphone)v3).encode(((java.lang.Object)v6));
    Object v8 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)(""), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = "f";
    Object v2 = ((org.apache.commons.codec.language.Metaphone)v0).metaphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("F"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Metaphone();
    Object v1 = 5;
    ((org.apache.commons.codec.language.Metaphone)v0).setMaxCodeLen((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = new org.apache.commons.codec.language.Metaphone();
    Object v4 = "C";
    Object v5 = ((org.apache.commons.codec.language.Metaphone)v3).metaphone(((java.lang.String)v4));
    Object v6 = ((org.apache.commons.codec.language.Metaphone)v0).encode(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)("C"), v6);
  }
}
