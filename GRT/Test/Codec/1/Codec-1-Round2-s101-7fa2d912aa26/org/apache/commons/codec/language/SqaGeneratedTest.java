package org.apache.commons.codec.language;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = new org.apache.commons.codec.language.Caverphone();
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.Object)v1));
      org.junit.Assert.fail("Expected org.apache.commons.codec.EncoderException");
    } catch (org.apache.commons.codec.EncoderException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "AELOU";
    Object v2 = "b";
    Object v3 = ((org.apache.commons.codec.language.Caverphone)v0).isCaverphoneEqual(((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "RGY";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("KA11111111"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = new org.apache.commons.codec.language.Caverphone();
    Object v2 = "RGY";
    Object v3 = ((org.apache.commons.codec.language.Caverphone)v1).caverphone(((java.lang.String)v2));
    Object v4 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)("KA11111111"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
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
  public void test5() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "UTF-8";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("ATF1111111"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "E2";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("1111111111"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "EAU";
    Object v2 = "UTF-_8";
    Object v3 = ((org.apache.commons.codec.language.Caverphone)v0).isCaverphoneEqual(((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = new org.apache.commons.codec.language.Caverphone();
    Object v2 = "EAU";
    Object v3 = "UTF-_8";
    Object v4 = ((org.apache.commons.codec.language.Caverphone)v1).isCaverphoneEqual(((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.Object)v4));
      org.junit.Assert.fail("Expected org.apache.commons.codec.EncoderException");
    } catch (org.apache.commons.codec.EncoderException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = new org.apache.commons.codec.language.Caverphone();
    Object v2 = "E2";
    Object v3 = ((org.apache.commons.codec.language.Caverphone)v1).caverphone(((java.lang.String)v2));
    Object v4 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)("1111111111"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "C1360240043788015936020505";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("K111111111"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = new org.apache.commons.codec.language.Caverphone();
    Object v2 = "UTF-8";
    Object v3 = ((org.apache.commons.codec.language.Caverphone)v1).caverphone(((java.lang.String)v2));
    Object v4 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)("ATF1111111"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "AEI";
    Object v2 = "S_";
    Object v3 = ((org.apache.commons.codec.language.Caverphone)v0).isCaverphoneEqual(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new org.apache.commons.codec.language.Caverphone();
    Object v5 = "AELOU";
    Object v6 = "b";
    Object v7 = ((org.apache.commons.codec.language.Caverphone)v4).isCaverphoneEqual(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.Object)v7));
      org.junit.Assert.fail("Expected org.apache.commons.codec.EncoderException");
    } catch (org.apache.commons.codec.EncoderException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("1111111111"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "UTF8";
    Object v2 = "b";
    Object v3 = ((org.apache.commons.codec.language.Caverphone)v0).isCaverphoneEqual(((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "Q=";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("K111111111"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = new org.apache.commons.codec.language.Caverphone();
    Object v2 = "";
    Object v3 = ((org.apache.commons.codec.language.Caverphone)v1).caverphone(((java.lang.String)v2));
    Object v4 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)("1111111111"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = new org.apache.commons.codec.language.Caverphone();
    Object v2 = "UTF8";
    Object v3 = "b";
    Object v4 = ((org.apache.commons.codec.language.Caverphone)v1).isCaverphoneEqual(((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.Object)v4));
      org.junit.Assert.fail("Expected org.apache.commons.codec.EncoderException");
    } catch (org.apache.commons.codec.EncoderException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = new org.apache.commons.codec.language.Caverphone();
    Object v2 = new org.apache.commons.codec.language.Caverphone();
    Object v3 = "UTF-8";
    Object v4 = ((org.apache.commons.codec.language.Caverphone)v2).caverphone(((java.lang.String)v3));
    Object v5 = ((org.apache.commons.codec.language.Caverphone)v1).encode(((java.lang.Object)v4));
    Object v6 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)("ATF1111111"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "CH0";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("K111111111"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "cou2f";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("KF11111111"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "CY";
    Object v2 = "InvalidFquoted-printable encoding";
    Object v3 = ((org.apache.commons.codec.language.Caverphone)v0).isCaverphoneEqual(((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "OmSKY";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    Object v3 = new org.apache.commons.codec.language.Caverphone();
    Object v4 = "";
    Object v5 = ((org.apache.commons.codec.language.Caverphone)v3).caverphone(((java.lang.String)v4));
    Object v6 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)("1111111111"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "Objects of type ";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("APKTSFTP11"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "US-ASCII";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("ASSA111111"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "=~?";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("1111111111"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = new org.apache.commons.codec.language.Caverphone();
    Object v2 = "CH0";
    Object v3 = ((org.apache.commons.codec.language.Caverphone)v1).caverphone(((java.lang.String)v2));
    Object v4 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)("K111111111"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = new org.apache.commons.codec.language.Caverphone();
    Object v2 = "OmSKY";
    Object v3 = ((org.apache.commons.codec.language.Caverphone)v1).caverphone(((java.lang.String)v2));
    Object v4 = new org.apache.commons.codec.language.Caverphone();
    Object v5 = "";
    Object v6 = ((org.apache.commons.codec.language.Caverphone)v4).caverphone(((java.lang.String)v5));
    Object v7 = ((org.apache.commons.codec.language.Caverphone)v1).encode(((java.lang.Object)v6));
    Object v8 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)("1111111111"), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "TCH";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("K111111111"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "3";
    Object v2 = "ZI";
    Object v3 = ((org.apache.commons.codec.language.Caverphone)v0).isCaverphoneEqual(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new org.apache.commons.codec.language.Caverphone();
    Object v5 = "";
    Object v6 = ((org.apache.commons.codec.language.Caverphone)v4).caverphone(((java.lang.String)v5));
    Object v7 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.Object)v6));
    org.junit.Assert.assertEquals((Object)("1111111111"), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "2";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("1111111111"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "F";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("F111111111"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "T";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("T111111111"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = new org.apache.commons.codec.language.Caverphone();
    Object v2 = "2";
    Object v3 = ((org.apache.commons.codec.language.Caverphone)v1).caverphone(((java.lang.String)v2));
    Object v4 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)("1111111111"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "WN";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("N111111111"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "OU";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("AA11111111"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "A";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("A111111111"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = new org.apache.commons.codec.language.Caverphone();
    Object v2 = "A";
    Object v3 = ((org.apache.commons.codec.language.Caverphone)v1).caverphone(((java.lang.String)v2));
    Object v4 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)("A111111111"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = new org.apache.commons.codec.language.Caverphone();
    Object v2 = "";
    Object v3 = ((org.apache.commons.codec.language.Caverphone)v1).caverphone(((java.lang.String)v2));
    Object v4 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.Object)v3));
    Object v5 = new org.apache.commons.codec.language.Caverphone();
    Object v6 = "OU";
    Object v7 = ((org.apache.commons.codec.language.Caverphone)v5).encode(((java.lang.String)v6));
    Object v8 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)("AA11111111"), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "";
    Object v2 = "UTF-8";
    Object v3 = ((org.apache.commons.codec.language.Caverphone)v0).isCaverphoneEqual(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "";
    Object v5 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)("1111111111"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "CJH";
    Object v2 = "s";
    Object v3 = ((org.apache.commons.codec.language.Caverphone)v0).isCaverphoneEqual(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "US-ACII";
    Object v5 = "AI";
    Object v6 = ((org.apache.commons.codec.language.Caverphone)v0).isCaverphoneEqual(((java.lang.String)v4),((java.lang.String)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "ES";
    Object v2 = "EY";
    Object v3 = ((org.apache.commons.codec.language.Caverphone)v0).isCaverphoneEqual(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "&";
    Object v5 = "";
    Object v6 = ((org.apache.commons.codec.language.Caverphone)v0).isCaverphoneEqual(((java.lang.String)v4),((java.lang.String)v5));
    org.junit.Assert.assertEquals((Object)(true), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = new org.apache.commons.codec.language.Caverphone();
    Object v2 = "C1360240043788015936020505";
    Object v3 = ((org.apache.commons.codec.language.Caverphone)v1).caverphone(((java.lang.String)v2));
    Object v4 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)("K111111111"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "S";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("S111111111"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = new org.apache.commons.codec.language.Caverphone();
    Object v2 = "US-ASCII";
    Object v3 = ((org.apache.commons.codec.language.Caverphone)v1).caverphone(((java.lang.String)v2));
    Object v4 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)("ASA1111111"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = new org.apache.commons.codec.language.Caverphone();
    Object v2 = "TCH";
    Object v3 = ((org.apache.commons.codec.language.Caverphone)v1).caverphone(((java.lang.String)v2));
    Object v4 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)("K111111111"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "This codec cannot decode ";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    Object v3 = "UTF-8";
    Object v4 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)("ATF1111111"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
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
  public void test49() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = new org.apache.commons.codec.language.Caverphone();
    Object v2 = new org.apache.commons.codec.language.Caverphone();
    Object v3 = "OmSKY";
    Object v4 = ((org.apache.commons.codec.language.Caverphone)v2).caverphone(((java.lang.String)v3));
    Object v5 = new org.apache.commons.codec.language.Caverphone();
    Object v6 = "";
    Object v7 = ((org.apache.commons.codec.language.Caverphone)v5).caverphone(((java.lang.String)v6));
    Object v8 = ((org.apache.commons.codec.language.Caverphone)v2).encode(((java.lang.Object)v7));
    Object v9 = ((org.apache.commons.codec.language.Caverphone)v1).encode(((java.lang.Object)v8));
    Object v10 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.Object)v9));
    org.junit.Assert.assertEquals((Object)("1111111111"), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "iN";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("AN11111111"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = new org.apache.commons.codec.language.Caverphone();
    Object v2 = "iN";
    Object v3 = ((org.apache.commons.codec.language.Caverphone)v1).caverphone(((java.lang.String)v2));
    Object v4 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.Object)v3));
    Object v5 = "UTF-8";
    Object v6 = "a?";
    Object v7 = ((org.apache.commons.codec.language.Caverphone)v0).isCaverphoneEqual(((java.lang.String)v5),((java.lang.String)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = new org.apache.commons.codec.language.Caverphone();
    Object v2 = new org.apache.commons.codec.language.Caverphone();
    Object v3 = new org.apache.commons.codec.language.Caverphone();
    Object v4 = "OmSKY";
    Object v5 = ((org.apache.commons.codec.language.Caverphone)v3).caverphone(((java.lang.String)v4));
    Object v6 = new org.apache.commons.codec.language.Caverphone();
    Object v7 = "";
    Object v8 = ((org.apache.commons.codec.language.Caverphone)v6).caverphone(((java.lang.String)v7));
    Object v9 = ((org.apache.commons.codec.language.Caverphone)v3).encode(((java.lang.Object)v8));
    Object v10 = ((org.apache.commons.codec.language.Caverphone)v2).encode(((java.lang.Object)v9));
    Object v11 = ((org.apache.commons.codec.language.Caverphone)v1).encode(((java.lang.Object)v10));
    Object v12 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.Object)v11));
    org.junit.Assert.assertEquals((Object)("1111111111"), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = new org.apache.commons.codec.language.Caverphone();
    Object v2 = new org.apache.commons.codec.language.Caverphone();
    Object v3 = "US-ASCII";
    Object v4 = ((org.apache.commons.codec.language.Caverphone)v2).caverphone(((java.lang.String)v3));
    Object v5 = ((org.apache.commons.codec.language.Caverphone)v1).encode(((java.lang.Object)v4));
    Object v6 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.Object)v5));
    Object v7 = "\"";
    Object v8 = "";
    Object v9 = ((org.apache.commons.codec.language.Caverphone)v0).isCaverphoneEqual(((java.lang.String)v7),((java.lang.String)v8));
    org.junit.Assert.assertEquals((Object)(true), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = new org.apache.commons.codec.language.Caverphone();
    Object v2 = "ES";
    Object v3 = "EY";
    Object v4 = ((org.apache.commons.codec.language.Caverphone)v1).isCaverphoneEqual(((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = "&";
    Object v6 = "";
    Object v7 = ((org.apache.commons.codec.language.Caverphone)v1).isCaverphoneEqual(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.Object)v7));
      org.junit.Assert.fail("Expected org.apache.commons.codec.EncoderException");
    } catch (org.apache.commons.codec.EncoderException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "SIO";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.String)v1));
    Object v3 = "AEIO";
    Object v4 = "U";
    Object v5 = ((org.apache.commons.codec.language.Caverphone)v0).isCaverphoneEqual(((java.lang.String)v3),((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "KFC 1522 violation: charset not specified";
    Object v2 = "";
    Object v3 = ((org.apache.commons.codec.language.Caverphone)v0).isCaverphoneEqual(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "7";
    Object v5 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)("1111111111"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "ZI";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("SA11111111"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "encodeInteger called with null parameter";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("ANKTNTKKLT"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "^r3";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("A111111111"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "L";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("A111111111"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "^tugh";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("TA11111111"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "US-ASCII";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("ASSA111111"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "HEIM";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("AM11111111"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "OG";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("AK11111111"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = new org.apache.commons.codec.language.Caverphone();
    Object v2 = "WN";
    Object v3 = ((org.apache.commons.codec.language.Caverphone)v1).caverphone(((java.lang.String)v2));
    Object v4 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)("N111111111"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "7";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.String)v1));
    Object v3 = new org.apache.commons.codec.language.Caverphone();
    Object v4 = "L";
    Object v5 = ((org.apache.commons.codec.language.Caverphone)v3).caverphone(((java.lang.String)v4));
    Object v6 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)("A111111111"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "r$";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("A111111111"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = new org.apache.commons.codec.language.Caverphone();
    Object v2 = new org.apache.commons.codec.language.Caverphone();
    Object v3 = "A";
    Object v4 = ((org.apache.commons.codec.language.Caverphone)v2).caverphone(((java.lang.String)v3));
    Object v5 = ((org.apache.commons.codec.language.Caverphone)v1).encode(((java.lang.Object)v4));
    Object v6 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)("A111111111"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "O";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("A111111111"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "UCCEE";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("AKSA111111"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "ME";
    Object v2 = "n+";
    Object v3 = ((org.apache.commons.codec.language.Caverphone)v0).isCaverphoneEqual(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "";
    Object v5 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)("1111111111"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "US-ASCII";
    Object v2 = "Input array too big, output array would be bigger than Integer.MAX_VALUE=2147483647";
    Object v3 = ((org.apache.commons.codec.language.Caverphone)v0).isCaverphoneEqual(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new org.apache.commons.codec.language.Caverphone();
    Object v5 = "WN";
    Object v6 = ((org.apache.commons.codec.language.Caverphone)v4).caverphone(((java.lang.String)v5));
    Object v7 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.Object)v6));
    org.junit.Assert.assertEquals((Object)("N111111111"), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "O";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.String)v1));
    Object v3 = new org.apache.commons.codec.language.Caverphone();
    Object v4 = "US-ASCII";
    Object v5 = ((org.apache.commons.codec.language.Caverphone)v3).caverphone(((java.lang.String)v4));
    Object v6 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)("ASA1111111"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "HA";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("AA11111111"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = new org.apache.commons.codec.language.Caverphone();
    Object v2 = new org.apache.commons.codec.language.Caverphone();
    Object v3 = "TCH";
    Object v4 = ((org.apache.commons.codec.language.Caverphone)v2).caverphone(((java.lang.String)v3));
    Object v5 = ((org.apache.commons.codec.language.Caverphone)v1).encode(((java.lang.Object)v4));
    Object v6 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)("K111111111"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "M";
    Object v2 = "q";
    Object v3 = ((org.apache.commons.codec.language.Caverphone)v0).isCaverphoneEqual(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new org.apache.commons.codec.language.Caverphone();
    Object v5 = "US-ASCII";
    Object v6 = ((org.apache.commons.codec.language.Caverphone)v4).caverphone(((java.lang.String)v5));
    Object v7 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.Object)v6));
    org.junit.Assert.assertEquals((Object)("ASA1111111"), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = new org.apache.commons.codec.language.Caverphone();
    Object v2 = "iN";
    Object v3 = ((org.apache.commons.codec.language.Caverphone)v1).caverphone(((java.lang.String)v2));
    Object v4 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)("AN11111111"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "HIA";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("AA11111111"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "Parameter supplied to Base64 encode is9not a byte[]";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("PRMTSPLTPS"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "TI4";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.String)v1));
    Object v3 = new org.apache.commons.codec.language.Caverphone();
    Object v4 = "Q=";
    Object v5 = ((org.apache.commons.codec.language.Caverphone)v3).caverphone(((java.lang.String)v4));
    Object v6 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)("K111111111"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "VON ";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("FN11111111"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "SIA";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("SA11111111"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "Y";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.String)v1));
    Object v3 = "P";
    Object v4 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)("P111111111"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "o";
    Object v2 = "";
    Object v3 = ((org.apache.commons.codec.language.Caverphone)v0).isCaverphoneEqual(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "US-ASCI";
    Object v5 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)("ASSA111111"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "B";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.String)v1));
    Object v3 = "USASCII";
    Object v4 = "Objects f type ";
    Object v5 = ((org.apache.commons.codec.language.Caverphone)v0).isCaverphoneEqual(((java.lang.String)v3),((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = new org.apache.commons.codec.language.Caverphone();
    Object v2 = "2";
    Object v3 = ((org.apache.commons.codec.language.Caverphone)v1).caverphone(((java.lang.String)v2));
    Object v4 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.Object)v3));
    Object v5 = new org.apache.commons.codec.language.Caverphone();
    Object v6 = "Parameter supplied to Base64 encode is9not a byte[]";
    Object v7 = ((org.apache.commons.codec.language.Caverphone)v5).caverphone(((java.lang.String)v6));
    Object v8 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)("PMTSPTPS11"), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "SI";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("SA11111111"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "wa";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("WA11111111"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "k";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("K111111111"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "AEIOUY";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("AA11111111"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = new org.apache.commons.codec.language.Caverphone();
    Object v2 = "O";
    Object v3 = ((org.apache.commons.codec.language.Caverphone)v1).caverphone(((java.lang.String)v2));
    Object v4 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)("A111111111"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = new org.apache.commons.codec.language.Caverphone();
    Object v2 = "HA";
    Object v3 = ((org.apache.commons.codec.language.Caverphone)v1).caverphone(((java.lang.String)v2));
    Object v4 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)("AA11111111"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = new org.apache.commons.codec.language.Caverphone();
    Object v2 = new org.apache.commons.codec.language.Caverphone();
    Object v3 = new org.apache.commons.codec.language.Caverphone();
    Object v4 = "A";
    Object v5 = ((org.apache.commons.codec.language.Caverphone)v3).caverphone(((java.lang.String)v4));
    Object v6 = ((org.apache.commons.codec.language.Caverphone)v2).encode(((java.lang.Object)v5));
    Object v7 = ((org.apache.commons.codec.language.Caverphone)v1).encode(((java.lang.Object)v6));
    Object v8 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.Object)v7));
    Object v9 = "SIA";
    Object v10 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.String)v9));
    org.junit.Assert.assertEquals((Object)("SA11111111"), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = new org.apache.commons.codec.language.Caverphone();
    Object v2 = "^tugh";
    Object v3 = ((org.apache.commons.codec.language.Caverphone)v1).caverphone(((java.lang.String)v2));
    Object v4 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)("TA11111111"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "UTF(-8";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.String)v1));
    Object v3 = "R";
    Object v4 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)("A111111111"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "UTF-8";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.String)v1));
    Object v3 = "3";
    Object v4 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)("1111111111"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "SUGAY";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("SKA1111111"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "UTF-(8";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("ATF1111111"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = new org.apache.commons.codec.language.Caverphone();
    Object v2 = "";
    Object v3 = "UTF-8";
    Object v4 = ((org.apache.commons.codec.language.Caverphone)v1).isCaverphoneEqual(((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = "";
    Object v6 = ((org.apache.commons.codec.language.Caverphone)v1).caverphone(((java.lang.String)v5));
    Object v7 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.Object)v6));
    org.junit.Assert.assertEquals((Object)("1111111111"), v7);
  }
}
