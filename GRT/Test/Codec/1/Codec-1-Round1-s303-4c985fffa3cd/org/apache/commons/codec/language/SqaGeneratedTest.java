package org.apache.commons.codec.language;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "Objectsz of type ";
    Object v2 = "Objects of tye ";
    Object v3 = ((org.apache.commons.codec.language.Caverphone)v0).isCaverphoneEqual(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new org.apache.commons.codec.language.Caverphone();
    Object v5 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.Object)v4));
      org.junit.Assert.fail("Expected org.apache.commons.codec.EncoderException");
    } catch (org.apache.commons.codec.EncoderException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "US-ASCII";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("ASSA111111"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "L";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("A111111111"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = new org.apache.commons.codec.language.Caverphone();
    Object v2 = "L";
    Object v3 = ((org.apache.commons.codec.language.Caverphone)v1).caverphone(((java.lang.String)v2));
    Object v4 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)("A111111111"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "O";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("A111111111"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = new org.apache.commons.codec.language.Caverphone();
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.Object)v1));
      org.junit.Assert.fail("Expected org.apache.commons.codec.EncoderException");
    } catch (org.apache.commons.codec.EncoderException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "?";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("1111111111"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "Objects of type ";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("APKTSFTP11"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "UTF-8";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("ATF1111111"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "[aeiou]";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("AA11111111"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "3";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("1111111111"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "l";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("A111111111"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = new org.apache.commons.codec.language.Caverphone();
    Object v2 = "l";
    Object v3 = ((org.apache.commons.codec.language.Caverphone)v1).caverphone(((java.lang.String)v2));
    Object v4 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)("A111111111"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "RGY";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("KA11111111"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = new org.apache.commons.codec.language.Caverphone();
    Object v2 = "UTF-8";
    Object v3 = ((org.apache.commons.codec.language.Caverphone)v1).caverphone(((java.lang.String)v2));
    Object v4 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)("ATF1111111"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "cou2f";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("KF11111111"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "Parameter supplied to Base64 decode is not a byte[]";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("PRMTSPLTPS"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "#";
    Object v2 = "D";
    Object v3 = ((org.apache.commons.codec.language.Caverphone)v0).isCaverphoneEqual(((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = new org.apache.commons.codec.language.Caverphone();
    Object v2 = "[aeiou]";
    Object v3 = ((org.apache.commons.codec.language.Caverphone)v1).encode(((java.lang.String)v2));
    Object v4 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)("AA11111111"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "EIY";
    Object v2 = "";
    Object v3 = ((org.apache.commons.codec.language.Caverphone)v0).isCaverphoneEqual(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new org.apache.commons.codec.language.Caverphone();
    Object v5 = "UTF-8";
    Object v6 = ((org.apache.commons.codec.language.Caverphone)v4).caverphone(((java.lang.String)v5));
    Object v7 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.Object)v6));
    org.junit.Assert.assertEquals((Object)("ATF1111111"), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "S";
    Object v2 = "ObjecZs of type ";
    Object v3 = ((org.apache.commons.codec.language.Caverphone)v0).isCaverphoneEqual(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "S";
    Object v5 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)("S111111111"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "WR";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("A111111111"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = new org.apache.commons.codec.language.Caverphone();
    Object v2 = "cou2f";
    Object v3 = ((org.apache.commons.codec.language.Caverphone)v1).caverphone(((java.lang.String)v2));
    Object v4 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.Object)v3));
    Object v5 = "AGG;";
    Object v6 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v5));
    org.junit.Assert.assertEquals((Object)("AK11111111"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = new org.apache.commons.codec.language.Caverphone();
    Object v2 = "RGY";
    Object v3 = ((org.apache.commons.codec.language.Caverphone)v1).caverphone(((java.lang.String)v2));
    Object v4 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)("KA11111111"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "UCCES";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("AKSS111111"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = new org.apache.commons.codec.language.Caverphone();
    Object v2 = new org.apache.commons.codec.language.Caverphone();
    Object v3 = "RGY";
    Object v4 = ((org.apache.commons.codec.language.Caverphone)v2).caverphone(((java.lang.String)v3));
    Object v5 = ((org.apache.commons.codec.language.Caverphone)v1).encode(((java.lang.Object)v4));
    Object v6 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)("KA11111111"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "T";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("T111111111"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "WH";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("1111111111"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = new org.apache.commons.codec.language.Caverphone();
    Object v2 = "WH";
    Object v3 = ((org.apache.commons.codec.language.Caverphone)v1).caverphone(((java.lang.String)v2));
    Object v4 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.Object)v3));
    Object v5 = "ED";
    Object v6 = "";
    Object v7 = ((org.apache.commons.codec.language.Caverphone)v0).isCaverphoneEqual(((java.lang.String)v5),((java.lang.String)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("1111111111"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "^cough";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("KF11111111"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = new org.apache.commons.codec.language.Caverphone();
    Object v2 = "";
    Object v3 = ((org.apache.commons.codec.language.Caverphone)v1).caverphone(((java.lang.String)v2));
    Object v4 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)("1111111111"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = new org.apache.commons.codec.language.Caverphone();
    Object v2 = new org.apache.commons.codec.language.Caverphone();
    Object v3 = "";
    Object v4 = ((org.apache.commons.codec.language.Caverphone)v2).caverphone(((java.lang.String)v3));
    Object v5 = ((org.apache.commons.codec.language.Caverphone)v1).encode(((java.lang.Object)v4));
    Object v6 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)("1111111111"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = new org.apache.commons.codec.language.Caverphone();
    Object v2 = "cou2f";
    Object v3 = ((org.apache.commons.codec.language.Caverphone)v1).caverphone(((java.lang.String)v2));
    Object v4 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)("KF11111111"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "tch";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("K111111111"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "_I";
    Object v2 = "";
    Object v3 = ((org.apache.commons.codec.language.Caverphone)v0).isCaverphoneEqual(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new org.apache.commons.codec.language.Caverphone();
    Object v5 = "RGY";
    Object v6 = ((org.apache.commons.codec.language.Caverphone)v4).caverphone(((java.lang.String)v5));
    Object v7 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.Object)v6));
    org.junit.Assert.assertEquals((Object)("KA11111111"), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = new org.apache.commons.codec.language.Caverphone();
    Object v2 = new org.apache.commons.codec.language.Caverphone();
    Object v3 = "l";
    Object v4 = ((org.apache.commons.codec.language.Caverphone)v2).caverphone(((java.lang.String)v3));
    Object v5 = ((org.apache.commons.codec.language.Caverphone)v1).encode(((java.lang.Object)v4));
    Object v6 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.Object)v5));
    Object v7 = "UTF-8";
    Object v8 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v7));
    org.junit.Assert.assertEquals((Object)("ATF1111111"), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "B";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("P111111111"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "MANGER";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("MNKA111111"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "This \\codec cannot decode ";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("TSKTKNTKT1"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = new org.apache.commons.codec.language.Caverphone();
    Object v2 = "#";
    Object v3 = "D";
    Object v4 = ((org.apache.commons.codec.language.Caverphone)v1).isCaverphoneEqual(((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.Object)v4));
      org.junit.Assert.fail("Expected org.apache.commons.codec.EncoderException");
    } catch (org.apache.commons.codec.EncoderException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "TIA";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("SA11111111"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "KS";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    Object v3 = new org.apache.commons.codec.language.Caverphone();
    Object v4 = "";
    Object v5 = ((org.apache.commons.codec.language.Caverphone)v3).caverphone(((java.lang.String)v4));
    Object v6 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)("1111111111"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "US=-ASCII";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("ASSA111111"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = new org.apache.commons.codec.language.Caverphone();
    Object v2 = "WH";
    Object v3 = ((org.apache.commons.codec.language.Caverphone)v1).caverphone(((java.lang.String)v2));
    Object v4 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)("1111111111"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "kK";
    Object v2 = "US-SCII";
    Object v3 = ((org.apache.commons.codec.language.Caverphone)v0).isCaverphoneEqual(((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "ARCHoT";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("AKT1111111"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "CC6";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("K111111111"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = new org.apache.commons.codec.language.Caverphone();
    Object v2 = new org.apache.commons.codec.language.Caverphone();
    Object v3 = new org.apache.commons.codec.language.Caverphone();
    Object v4 = "RGY";
    Object v5 = ((org.apache.commons.codec.language.Caverphone)v3).caverphone(((java.lang.String)v4));
    Object v6 = ((org.apache.commons.codec.language.Caverphone)v2).encode(((java.lang.Object)v5));
    Object v7 = ((org.apache.commons.codec.language.Caverphone)v1).encode(((java.lang.Object)v6));
    Object v8 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)("KA11111111"), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "BACHER";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("PKA1111111"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.String)v1));
    Object v3 = new org.apache.commons.codec.language.Caverphone();
    Object v4 = "UTF-8";
    Object v5 = ((org.apache.commons.codec.language.Caverphone)v3).caverphone(((java.lang.String)v4));
    Object v6 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)("ATF1111111"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "l5";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("A111111111"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "R\\";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("A111111111"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "ET";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("AT11111111"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = new org.apache.commons.codec.language.Caverphone();
    Object v2 = "?";
    Object v3 = ((org.apache.commons.codec.language.Caverphone)v1).caverphone(((java.lang.String)v2));
    Object v4 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)("1111111111"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = new org.apache.commons.codec.language.Caverphone();
    Object v2 = "T";
    Object v3 = ((org.apache.commons.codec.language.Caverphone)v1).caverphone(((java.lang.String)v2));
    Object v4 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)("T111111111"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "n";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("N111111111"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "Parameter supplied to Soundex encode is not of type java.lang.Sting";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("PRMTSPLTSN"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "OWSKI";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("ASKA111111"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "N";
    Object v2 = "^co`ugh";
    Object v3 = ((org.apache.commons.codec.language.Caverphone)v0).isCaverphoneEqual(((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "sia";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("SA11111111"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "Np";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("NP11111111"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.String)v1));
    Object v3 = new org.apache.commons.codec.language.Caverphone();
    Object v4 = new org.apache.commons.codec.language.Caverphone();
    Object v5 = "?";
    Object v6 = ((org.apache.commons.codec.language.Caverphone)v4).caverphone(((java.lang.String)v5));
    Object v7 = ((org.apache.commons.codec.language.Caverphone)v3).encode(((java.lang.Object)v6));
    Object v8 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)("1111111111"), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "OI";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("AA11111111"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "";
    Object v2 = "HIAS";
    Object v3 = ((org.apache.commons.codec.language.Caverphone)v0).isCaverphoneEqual(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new org.apache.commons.codec.language.Caverphone();
    Object v5 = "OI";
    Object v6 = ((org.apache.commons.codec.language.Caverphone)v4).caverphone(((java.lang.String)v5));
    Object v7 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.Object)v6));
    org.junit.Assert.assertEquals((Object)("AA11111111"), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "DBubleMetaphone encode parameter is not of type String";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("TPPLMTFNNK"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "RFC 1522 violation: malformed encoded content";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    Object v3 = new org.apache.commons.codec.language.Caverphone();
    Object v4 = "T";
    Object v5 = ((org.apache.commons.codec.language.Caverphone)v3).caverphone(((java.lang.String)v4));
    Object v6 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)("T111111111"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "Z";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.String)v1));
    Object v3 = "UTF-8";
    Object v4 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)("ATF1111111"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "A";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("A111111111"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "?=";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("1111111111"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "VAN ";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("FN11111111"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "AEIOU";
    Object v2 = "F";
    Object v3 = ((org.apache.commons.codec.language.Caverphone)v0).isCaverphoneEqual(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "2";
    Object v5 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)("1111111111"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "NU";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("NA11111111"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "SIA2";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("SA11111111"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "u";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("A111111111"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "K";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("K111111111"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = new org.apache.commons.codec.language.Caverphone();
    Object v2 = "NU";
    Object v3 = ((org.apache.commons.codec.language.Caverphone)v1).caverphone(((java.lang.String)v2));
    Object v4 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)("NA11111111"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "U";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("A111111111"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "SIA";
    Object v2 = "HU";
    Object v3 = ((org.apache.commons.codec.language.Caverphone)v0).isCaverphoneEqual(((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "GTN";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("KTN1111111"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = new org.apache.commons.codec.language.Caverphone();
    Object v2 = "";
    Object v3 = ((org.apache.commons.codec.language.Caverphone)v1).encode(((java.lang.String)v2));
    Object v4 = new org.apache.commons.codec.language.Caverphone();
    Object v5 = "UTF-8";
    Object v6 = ((org.apache.commons.codec.language.Caverphone)v4).caverphone(((java.lang.String)v5));
    Object v7 = ((org.apache.commons.codec.language.Caverphone)v1).encode(((java.lang.Object)v6));
    Object v8 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)("ATF1111111"), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = new org.apache.commons.codec.language.Caverphone();
    Object v2 = "GTN";
    Object v3 = ((org.apache.commons.codec.language.Caverphone)v1).caverphone(((java.lang.String)v2));
    Object v4 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)("KTN1111111"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "TH";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.String)v1));
    Object v3 = new org.apache.commons.codec.language.Caverphone();
    Object v4 = "";
    Object v5 = ((org.apache.commons.codec.language.Caverphone)v3).caverphone(((java.lang.String)v4));
    Object v6 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)("1111111111"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = new org.apache.commons.codec.language.Caverphone();
    Object v2 = "U";
    Object v3 = ((org.apache.commons.codec.language.Caverphone)v1).caverphone(((java.lang.String)v2));
    Object v4 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)("A111111111"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "US-ASCI";
    Object v2 = "/E";
    Object v3 = ((org.apache.commons.codec.language.Caverphone)v0).isCaverphoneEqual(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "fh";
    Object v5 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)("F111111111"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = new org.apache.commons.codec.language.Caverphone();
    Object v2 = "Parameter supplied to Soundex encode is not of type java.lang.Sting";
    Object v3 = ((org.apache.commons.codec.language.Caverphone)v1).caverphone(((java.lang.String)v2));
    Object v4 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)("PMTSPTSN11"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "k+";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("K111111111"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = new org.apache.commons.codec.language.Caverphone();
    Object v2 = "OWSKI";
    Object v3 = ((org.apache.commons.codec.language.Caverphone)v1).encode(((java.lang.String)v2));
    Object v4 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)("ASKA111111"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "2,";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("1111111111"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "^[a;eiou]";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("AA11111111"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "]SL";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.String)v1));
    Object v3 = "B";
    Object v4 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)("P111111111"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "U>-ASCII";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("ASA1111111"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = new org.apache.commons.codec.language.Caverphone();
    Object v2 = "k+";
    Object v3 = ((org.apache.commons.codec.language.Caverphone)v1).caverphone(((java.lang.String)v2));
    Object v4 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.Object)v3));
    Object v5 = "T";
    Object v6 = "KS";
    Object v7 = ((org.apache.commons.codec.language.Caverphone)v0).isCaverphoneEqual(((java.lang.String)v5),((java.lang.String)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "mX";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("MK11111111"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "}L";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("A111111111"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = new org.apache.commons.codec.language.Caverphone();
    Object v2 = "A";
    Object v3 = ((org.apache.commons.codec.language.Caverphone)v1).caverphone(((java.lang.String)v2));
    Object v4 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)("A111111111"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "3";
    Object v2 = "Objects of type ";
    Object v3 = ((org.apache.commons.codec.language.Caverphone)v0).isCaverphoneEqual(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "^h";
    Object v5 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)("A111111111"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "UhF-8";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("AF11111111"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = new org.apache.commons.codec.language.Caverphone();
    Object v2 = "ET";
    Object v3 = ((org.apache.commons.codec.language.Caverphone)v1).caverphone(((java.lang.String)v2));
    Object v4 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)("AT11111111"), v4);
  }
}
