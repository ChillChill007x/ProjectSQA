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
    Object v1 = "US-ASCII";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("ASSA111111"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "CHORE";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("KA11111111"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = new org.apache.commons.codec.language.Caverphone();
    Object v2 = "US-ASCII";
    Object v3 = ((org.apache.commons.codec.language.Caverphone)v1).caverphone(((java.lang.String)v2));
    Object v4 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)("ASA1111111"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "trou2f";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("TRF1111111"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "^trough";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    Object v3 = "2n";
    Object v4 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)("N111111111"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "SK";
    Object v2 = "p";
    Object v3 = ((org.apache.commons.codec.language.Caverphone)v0).isCaverphoneEqual(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new org.apache.commons.codec.language.Caverphone();
    Object v5 = "^trough";
    Object v6 = ((org.apache.commons.codec.language.Caverphone)v4).caverphone(((java.lang.String)v5));
    Object v7 = "2n";
    Object v8 = ((org.apache.commons.codec.language.Caverphone)v4).encode(((java.lang.String)v7));
    Object v9 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.Object)v8));
    org.junit.Assert.assertEquals((Object)("N111111111"), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "<bjects of type ";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    Object v3 = "ACH";
    Object v4 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)("AK11111111"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = new org.apache.commons.codec.language.Caverphone();
    Object v2 = "trou2f";
    Object v3 = ((org.apache.commons.codec.language.Caverphone)v1).caverphone(((java.lang.String)v2));
    Object v4 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)("TF11111111"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("1111111111"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "R";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    Object v3 = new org.apache.commons.codec.language.Caverphone();
    Object v4 = "";
    Object v5 = ((org.apache.commons.codec.language.Caverphone)v3).caverphone(((java.lang.String)v4));
    Object v6 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)("1111111111"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = new org.apache.commons.codec.language.Caverphone();
    Object v2 = "";
    Object v3 = ((org.apache.commons.codec.language.Caverphone)v1).caverphone(((java.lang.String)v2));
    Object v4 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)("1111111111"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "39";
    Object v2 = "O";
    Object v3 = ((org.apache.commons.codec.language.Caverphone)v0).isCaverphoneEqual(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "MANGER";
    Object v5 = "S";
    Object v6 = ((org.apache.commons.codec.language.Caverphone)v0).isCaverphoneEqual(((java.lang.String)v4),((java.lang.String)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "d{";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.String)v1));
    Object v3 = new org.apache.commons.codec.language.Caverphone();
    Object v4 = "^trough";
    Object v5 = ((org.apache.commons.codec.language.Caverphone)v3).caverphone(((java.lang.String)v4));
    Object v6 = "2n";
    Object v7 = ((org.apache.commons.codec.language.Caverphone)v3).encode(((java.lang.String)v6));
    Object v8 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)("N111111111"), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "UT";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.String)v1));
    Object v3 = "HARI3S";
    Object v4 = "W";
    Object v5 = ((org.apache.commons.codec.language.Caverphone)v0).isCaverphoneEqual(((java.lang.String)v3),((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = new org.apache.commons.codec.language.Caverphone();
    Object v2 = "UT";
    Object v3 = ((org.apache.commons.codec.language.Caverphone)v1).encode(((java.lang.String)v2));
    Object v4 = "HARI3S";
    Object v5 = "W";
    Object v6 = ((org.apache.commons.codec.language.Caverphone)v1).isCaverphoneEqual(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.Object)v6));
      org.junit.Assert.fail("Expected org.apache.commons.codec.EncoderException");
    } catch (org.apache.commons.codec.EncoderException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "ph\"";
    Object v2 = "T7";
    Object v3 = ((org.apache.commons.codec.language.Caverphone)v0).isCaverphoneEqual(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "SHP-256";
    Object v5 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)("SP11111111"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = new org.apache.commons.codec.language.Caverphone();
    Object v2 = "";
    Object v3 = ((org.apache.commons.codec.language.Caverphone)v1).caverphone(((java.lang.String)v2));
    Object v4 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.Object)v3));
    Object v5 = "";
    Object v6 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v5));
    org.junit.Assert.assertEquals((Object)("1111111111"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = new org.apache.commons.codec.language.Caverphone();
    Object v2 = "39";
    Object v3 = "O";
    Object v4 = ((org.apache.commons.codec.language.Caverphone)v1).isCaverphoneEqual(((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = "MANGER";
    Object v6 = "S";
    Object v7 = ((org.apache.commons.codec.language.Caverphone)v1).isCaverphoneEqual(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.Object)v7));
      org.junit.Assert.fail("Expected org.apache.commons.codec.EncoderException");
    } catch (org.apache.commons.codec.EncoderException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "EAU";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("AA11111111"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = " cannot be quoted-prinCtable decoded";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("KNTPKTTPRN"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "TL";
    Object v2 = "<G";
    Object v3 = ((org.apache.commons.codec.language.Caverphone)v0).isCaverphoneEqual(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new org.apache.commons.codec.language.Caverphone();
    Object v5 = "";
    Object v6 = ((org.apache.commons.codec.language.Caverphone)v4).caverphone(((java.lang.String)v5));
    Object v7 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.Object)v6));
    org.junit.Assert.assertEquals((Object)("1111111111"), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "SIA";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("SA11111111"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "UTF-8";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("ATF1111111"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "Objects of type ";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("APKTSFTP11"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = new org.apache.commons.codec.language.Caverphone();
    Object v2 = "UTF-8";
    Object v3 = ((org.apache.commons.codec.language.Caverphone)v1).caverphone(((java.lang.String)v2));
    Object v4 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)("ATF1111111"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "?";
    Object v2 = " ";
    Object v3 = ((org.apache.commons.codec.language.Caverphone)v0).isCaverphoneEqual(((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(true), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "R";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("A111111111"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "2";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("1111111111"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = " enco";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("ANKA111111"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "s";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("S111111111"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = new org.apache.commons.codec.language.Caverphone();
    Object v2 = "";
    Object v3 = ((org.apache.commons.codec.language.Caverphone)v1).caverphone(((java.lang.String)v2));
    Object v4 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.Object)v3));
    Object v5 = "T";
    Object v6 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v5));
    org.junit.Assert.assertEquals((Object)("T111111111"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = new org.apache.commons.codec.language.Caverphone();
    Object v2 = "2";
    Object v3 = ((org.apache.commons.codec.language.Caverphone)v1).caverphone(((java.lang.String)v2));
    Object v4 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)("1111111111"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "FX";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("FK11111111"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "SIO";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("SA11111111"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = new org.apache.commons.codec.language.Caverphone();
    Object v2 = "Objects of type ";
    Object v3 = ((org.apache.commons.codec.language.Caverphone)v1).caverphone(((java.lang.String)v2));
    Object v4 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)("APKTSFTP11"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "US-ASCII";
    Object v2 = "^h";
    Object v3 = ((org.apache.commons.codec.language.Caverphone)v0).isCaverphoneEqual(((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "";
    Object v2 = "y";
    Object v3 = ((org.apache.commons.codec.language.Caverphone)v0).isCaverphoneEqual(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "LIV";
    Object v5 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)("LF11111111"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "sh";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("S111111111"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "N";
    Object v2 = "US-ASCI";
    Object v3 = ((org.apache.commons.codec.language.Caverphone)v0).isCaverphoneEqual(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new org.apache.commons.codec.language.Caverphone();
    Object v5 = "Objects of type ";
    Object v6 = ((org.apache.commons.codec.language.Caverphone)v4).caverphone(((java.lang.String)v5));
    Object v7 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.Object)v6));
    org.junit.Assert.assertEquals((Object)("APKTSFTP11"), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = new org.apache.commons.codec.language.Caverphone();
    Object v2 = "US-ASCII";
    Object v3 = "^h";
    Object v4 = ((org.apache.commons.codec.language.Caverphone)v1).isCaverphoneEqual(((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.Object)v4));
      org.junit.Assert.fail("Expected org.apache.commons.codec.EncoderException");
    } catch (org.apache.commons.codec.EncoderException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = new org.apache.commons.codec.language.Caverphone();
    Object v2 = "d{";
    Object v3 = ((org.apache.commons.codec.language.Caverphone)v1).encode(((java.lang.String)v2));
    Object v4 = new org.apache.commons.codec.language.Caverphone();
    Object v5 = "^trough";
    Object v6 = ((org.apache.commons.codec.language.Caverphone)v4).caverphone(((java.lang.String)v5));
    Object v7 = "2n";
    Object v8 = ((org.apache.commons.codec.language.Caverphone)v4).encode(((java.lang.String)v7));
    Object v9 = ((org.apache.commons.codec.language.Caverphone)v1).encode(((java.lang.Object)v8));
    Object v10 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.Object)v9));
    org.junit.Assert.assertEquals((Object)("N111111111"), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "N";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("N111111111"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "EWSK";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("ASK1111111"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = new org.apache.commons.codec.language.Caverphone();
    Object v2 = new org.apache.commons.codec.language.Caverphone();
    Object v3 = "UTF-8";
    Object v4 = ((org.apache.commons.codec.language.Caverphone)v2).caverphone(((java.lang.String)v3));
    Object v5 = ((org.apache.commons.codec.language.Caverphone)v1).encode(((java.lang.Object)v4));
    Object v6 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.Object)v5));
    Object v7 = "C";
    Object v8 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v7));
    org.junit.Assert.assertEquals((Object)("K111111111"), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "E";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("1111111111"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "n";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("N111111111"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "22";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("1111111111"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "w3";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    Object v3 = new org.apache.commons.codec.language.Caverphone();
    Object v4 = "";
    Object v5 = ((org.apache.commons.codec.language.Caverphone)v3).caverphone(((java.lang.String)v4));
    Object v6 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)("1111111111"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = new org.apache.commons.codec.language.Caverphone();
    Object v2 = new org.apache.commons.codec.language.Caverphone();
    Object v3 = "UTF-8";
    Object v4 = ((org.apache.commons.codec.language.Caverphone)v2).caverphone(((java.lang.String)v3));
    Object v5 = ((org.apache.commons.codec.language.Caverphone)v1).encode(((java.lang.Object)v4));
    Object v6 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.Object)v5));
    Object v7 = "E";
    Object v8 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.String)v7));
    org.junit.Assert.assertEquals((Object)("1111111111"), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = new org.apache.commons.codec.language.Caverphone();
    Object v2 = new org.apache.commons.codec.language.Caverphone();
    Object v3 = "2";
    Object v4 = ((org.apache.commons.codec.language.Caverphone)v2).caverphone(((java.lang.String)v3));
    Object v5 = ((org.apache.commons.codec.language.Caverphone)v1).encode(((java.lang.Object)v4));
    Object v6 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.Object)v5));
    Object v7 = new org.apache.commons.codec.language.Caverphone();
    Object v8 = new org.apache.commons.codec.language.Caverphone();
    Object v9 = new org.apache.commons.codec.language.Caverphone();
    Object v10 = "UTF-8";
    Object v11 = ((org.apache.commons.codec.language.Caverphone)v9).caverphone(((java.lang.String)v10));
    Object v12 = ((org.apache.commons.codec.language.Caverphone)v8).encode(((java.lang.Object)v11));
    Object v13 = ((org.apache.commons.codec.language.Caverphone)v7).encode(((java.lang.Object)v12));
    Object v14 = "C";
    Object v15 = ((org.apache.commons.codec.language.Caverphone)v7).caverphone(((java.lang.String)v14));
    Object v16 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.Object)v15));
    org.junit.Assert.assertEquals((Object)("K111111111"), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "VANd ";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("FNT1111111"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "f";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.String)v1));
    Object v3 = new org.apache.commons.codec.language.Caverphone();
    Object v4 = "ph\"";
    Object v5 = "T7";
    Object v6 = ((org.apache.commons.codec.language.Caverphone)v3).isCaverphoneEqual(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = "SHP-256";
    Object v8 = ((org.apache.commons.codec.language.Caverphone)v3).caverphone(((java.lang.String)v7));
    Object v9 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.Object)v8));
    org.junit.Assert.assertEquals((Object)("SP11111111"), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "";
    Object v2 = "Objects of tye ";
    Object v3 = ((org.apache.commons.codec.language.Caverphone)v0).isCaverphoneEqual(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new org.apache.commons.codec.language.Caverphone();
    Object v5 = "R";
    Object v6 = ((org.apache.commons.codec.language.Caverphone)v4).encode(((java.lang.String)v5));
    Object v7 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.Object)v6));
    org.junit.Assert.assertEquals((Object)("A111111111"), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = new org.apache.commons.codec.language.Caverphone();
    Object v2 = "sh";
    Object v3 = ((org.apache.commons.codec.language.Caverphone)v1).caverphone(((java.lang.String)v2));
    Object v4 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.Object)v3));
    Object v5 = new org.apache.commons.codec.language.Caverphone();
    Object v6 = "UTF-8";
    Object v7 = ((org.apache.commons.codec.language.Caverphone)v5).caverphone(((java.lang.String)v6));
    Object v8 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)("ATF1111111"), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "RFC 1522 violation: encoding tokyn not found";
    Object v2 = "3TF-8";
    Object v3 = ((org.apache.commons.codec.language.Caverphone)v0).isCaverphoneEqual(((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "R";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("A111111111"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "US-ASCII";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    Object v3 = "[^az]";
    Object v4 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)("AS11111111"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "=";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("1111111111"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "OGGI";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("AKA1111111"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = new org.apache.commons.codec.language.Caverphone();
    Object v2 = "US-ASCII";
    Object v3 = ((org.apache.commons.codec.language.Caverphone)v1).caverphone(((java.lang.String)v2));
    Object v4 = "[^az]";
    Object v5 = ((org.apache.commons.codec.language.Caverphone)v1).caverphone(((java.lang.String)v4));
    Object v6 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)("AS11111111"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "TIA";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("SA11111111"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = new org.apache.commons.codec.language.Caverphone();
    Object v2 = "n";
    Object v3 = ((org.apache.commons.codec.language.Caverphone)v1).caverphone(((java.lang.String)v2));
    Object v4 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)("N111111111"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "OGGI";
    Object v2 = "C";
    Object v3 = ((org.apache.commons.codec.language.Caverphone)v0).isCaverphoneEqual(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "CQ";
    Object v5 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)("K111111111"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = new org.apache.commons.codec.language.Caverphone();
    Object v2 = "R";
    Object v3 = ((org.apache.commons.codec.language.Caverphone)v1).caverphone(((java.lang.String)v2));
    Object v4 = new org.apache.commons.codec.language.Caverphone();
    Object v5 = "";
    Object v6 = ((org.apache.commons.codec.language.Caverphone)v4).caverphone(((java.lang.String)v5));
    Object v7 = ((org.apache.commons.codec.language.Caverphone)v1).encode(((java.lang.Object)v6));
    Object v8 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)("1111111111"), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = new org.apache.commons.codec.language.Caverphone();
    Object v2 = "R";
    Object v3 = ((org.apache.commons.codec.language.Caverphone)v1).caverphone(((java.lang.String)v2));
    Object v4 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)("A111111111"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "~";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("1111111111"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = " C";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.String)v1));
    Object v3 = new org.apache.commons.codec.language.Caverphone();
    Object v4 = "FX";
    Object v5 = ((org.apache.commons.codec.language.Caverphone)v3).caverphone(((java.lang.String)v4));
    Object v6 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)("FK11111111"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = new org.apache.commons.codec.language.Caverphone();
    Object v2 = "R";
    Object v3 = ((org.apache.commons.codec.language.Caverphone)v1).caverphone(((java.lang.String)v2));
    Object v4 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.Object)v3));
    Object v5 = "Parameter supplid to Base64 encode is not a byte[]";
    Object v6 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v5));
    org.junit.Assert.assertEquals((Object)("PRMTSPLTPS"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "2";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.String)v1));
    Object v3 = new org.apache.commons.codec.language.Caverphone();
    Object v4 = "";
    Object v5 = "y";
    Object v6 = ((org.apache.commons.codec.language.Caverphone)v3).isCaverphoneEqual(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = "LIV";
    Object v8 = ((org.apache.commons.codec.language.Caverphone)v3).caverphone(((java.lang.String)v7));
    Object v9 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.Object)v8));
    org.junit.Assert.assertEquals((Object)("F111111111"), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = new org.apache.commons.codec.language.Caverphone();
    Object v2 = "RFC 1522 violation: encoding tokyn not found";
    Object v3 = "3TF-8";
    Object v4 = ((org.apache.commons.codec.language.Caverphone)v1).isCaverphoneEqual(((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.Object)v4));
      org.junit.Assert.fail("Expected org.apache.commons.codec.EncoderException");
    } catch (org.apache.commons.codec.EncoderException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "AEIOUY";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.String)v1));
    Object v3 = "X";
    Object v4 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)("K111111111"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = new org.apache.commons.codec.language.Caverphone();
    Object v2 = "f";
    Object v3 = ((org.apache.commons.codec.language.Caverphone)v1).encode(((java.lang.String)v2));
    Object v4 = new org.apache.commons.codec.language.Caverphone();
    Object v5 = "ph\"";
    Object v6 = "T7";
    Object v7 = ((org.apache.commons.codec.language.Caverphone)v4).isCaverphoneEqual(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = "SHP-256";
    Object v9 = ((org.apache.commons.codec.language.Caverphone)v4).caverphone(((java.lang.String)v8));
    Object v10 = ((org.apache.commons.codec.language.Caverphone)v1).encode(((java.lang.Object)v9));
    Object v11 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.Object)v10));
    org.junit.Assert.assertEquals((Object)("SP11111111"), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "Invalid URL encoding";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("ANFLTLNKTN"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = new org.apache.commons.codec.language.Caverphone();
    Object v2 = "EWSK";
    Object v3 = ((org.apache.commons.codec.language.Caverphone)v1).caverphone(((java.lang.String)v2));
    Object v4 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)("ASK1111111"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "This codec cannot decode Y";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    Object v3 = "BACHER";
    Object v4 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)("PKA1111111"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = new org.apache.commons.codec.language.Caverphone();
    Object v2 = "E";
    Object v3 = ((org.apache.commons.codec.language.Caverphone)v1).caverphone(((java.lang.String)v2));
    Object v4 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.Object)v3));
    Object v5 = "AU";
    Object v6 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v5));
    org.junit.Assert.assertEquals((Object)("AA11111111"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.String)v1));
    Object v3 = new org.apache.commons.codec.language.Caverphone();
    Object v4 = "This codec cannot decode Y";
    Object v5 = ((org.apache.commons.codec.language.Caverphone)v3).caverphone(((java.lang.String)v4));
    Object v6 = "BACHER";
    Object v7 = ((org.apache.commons.codec.language.Caverphone)v3).caverphone(((java.lang.String)v6));
    Object v8 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)("PKA1111111"), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "[^a-]";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("A111111111"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "$";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    Object v3 = "ET";
    Object v4 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)("AT11111111"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "KS";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("KS11111111"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = new org.apache.commons.codec.language.Caverphone();
    Object v2 = "AEIOUY";
    Object v3 = ((org.apache.commons.codec.language.Caverphone)v1).encode(((java.lang.String)v2));
    Object v4 = "X";
    Object v5 = ((org.apache.commons.codec.language.Caverphone)v1).caverphone(((java.lang.String)v4));
    Object v6 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)("K111111111"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "SIA";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.String)v1));
    Object v3 = "SU";
    Object v4 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)("SA11111111"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "T";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("T111111111"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "OAU";
    Object v2 = "US-ASCII";
    Object v3 = ((org.apache.commons.codec.language.Caverphone)v0).isCaverphoneEqual(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "M";
    Object v5 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)("M111111111"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "EIY";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("AA11111111"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "KhS";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("KS11111111"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "VA";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("FA11111111"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = new org.apache.commons.codec.language.Caverphone();
    Object v2 = "VA";
    Object v3 = ((org.apache.commons.codec.language.Caverphone)v1).caverphone(((java.lang.String)v2));
    Object v4 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)("FA11111111"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "T";
    Object v2 = "?";
    Object v3 = ((org.apache.commons.codec.language.Caverphone)v0).isCaverphoneEqual(((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "Parameter supplied to Base64 encode is not a byte[]";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("PRMTSPLTPS"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "RFC 1522 violation: charset token not found";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("FKFLSNKSTK"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "US-ASCII";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    Object v3 = new org.apache.commons.codec.language.Caverphone();
    Object v4 = "EIY";
    Object v5 = ((org.apache.commons.codec.language.Caverphone)v3).caverphone(((java.lang.String)v4));
    Object v6 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)("AA11111111"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = new org.apache.commons.codec.language.Caverphone();
    Object v2 = "T";
    Object v3 = ((org.apache.commons.codec.language.Caverphone)v1).caverphone(((java.lang.String)v2));
    Object v4 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)("T111111111"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "01230120022455012D23010202";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("T111111111"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "^tough";
    Object v2 = "O\"bjects of type ";
    Object v3 = ((org.apache.commons.codec.language.Caverphone)v0).isCaverphoneEqual(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "UTF2-8";
    Object v5 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)("ATF1111111"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "GN";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("N111111111"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = new org.apache.commons.codec.language.Caverphone();
    Object v2 = "sh";
    Object v3 = ((org.apache.commons.codec.language.Caverphone)v1).caverphone(((java.lang.String)v2));
    Object v4 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.Object)v3));
    Object v5 = new org.apache.commons.codec.language.Caverphone();
    Object v6 = " cannot be quoted-prinCtable decoded";
    Object v7 = ((org.apache.commons.codec.language.Caverphone)v5).encode(((java.lang.String)v6));
    Object v8 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)("KNTPKTPN11"), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = new org.apache.commons.codec.language.Caverphone();
    Object v2 = "SIA";
    Object v3 = ((org.apache.commons.codec.language.Caverphone)v1).caverphone(((java.lang.String)v2));
    Object v4 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)("SA11111111"), v4);
  }
}
