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
    Object v1 = "AL";
    Object v2 = "UTF-16LEb";
    Object v3 = ((org.apache.commons.codec.language.Caverphone)v0).isCaverphoneEqual(((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "r";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("A111111111"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "AU";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("AA11111111"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "^2";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("1111111111"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "B";
    Object v2 = "T_H";
    Object v3 = ((org.apache.commons.codec.language.Caverphone)v0).isCaverphoneEqual(((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "CION";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("SN11111111"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = new org.apache.commons.codec.language.Caverphone();
    Object v2 = "r";
    Object v3 = ((org.apache.commons.codec.language.Caverphone)v1).caverphone(((java.lang.String)v2));
    Object v4 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)("A111111111"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "";
    Object v2 = "_";
    Object v3 = ((org.apache.commons.codec.language.Caverphone)v0).isCaverphoneEqual(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new org.apache.commons.codec.language.Caverphone();
    Object v5 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.Object)v4));
      org.junit.Assert.fail("Expected org.apache.commons.codec.EncoderException");
    } catch (org.apache.commons.codec.EncoderException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "Y";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("A111111111"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "X";
    Object v2 = "UTF-8";
    Object v3 = ((org.apache.commons.codec.language.Caverphone)v0).isCaverphoneEqual(((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "T=";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("T111111111"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = new org.apache.commons.codec.language.Caverphone();
    Object v2 = "Y";
    Object v3 = ((org.apache.commons.codec.language.Caverphone)v1).caverphone(((java.lang.String)v2));
    Object v4 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)("A111111111"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = new org.apache.commons.codec.language.Caverphone();
    Object v2 = new org.apache.commons.codec.language.Caverphone();
    Object v3 = "Y";
    Object v4 = ((org.apache.commons.codec.language.Caverphone)v2).caverphone(((java.lang.String)v3));
    Object v5 = ((org.apache.commons.codec.language.Caverphone)v1).encode(((java.lang.Object)v4));
    Object v6 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)("A111111111"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "0y";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("A111111111"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = new org.apache.commons.codec.language.Caverphone();
    Object v2 = "AU";
    Object v3 = ((org.apache.commons.codec.language.Caverphone)v1).caverphone(((java.lang.String)v2));
    Object v4 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)("AA11111111"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "UTF-8";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("ATF1111111"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "S";
    Object v2 = " cannotFbe encoded using Q codec";
    Object v3 = ((org.apache.commons.codec.language.Caverphone)v0).isCaverphoneEqual(((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "Em";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    Object v3 = new org.apache.commons.codec.language.Caverphone();
    Object v4 = "T=";
    Object v5 = ((org.apache.commons.codec.language.Caverphone)v3).caverphone(((java.lang.String)v4));
    Object v6 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)("T111111111"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "TIO";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("SA11111111"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = new org.apache.commons.codec.language.Caverphone();
    Object v2 = "T=";
    Object v3 = ((org.apache.commons.codec.language.Caverphone)v1).caverphone(((java.lang.String)v2));
    Object v4 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)("T111111111"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "Objects of type ";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("APKTSFTP11"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = " ~cannot be quoted-printable decoded";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("KNTPKTTPRN"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = new org.apache.commons.codec.language.Caverphone();
    Object v2 = new org.apache.commons.codec.language.Caverphone();
    Object v3 = "T=";
    Object v4 = ((org.apache.commons.codec.language.Caverphone)v2).caverphone(((java.lang.String)v3));
    Object v5 = ((org.apache.commons.codec.language.Caverphone)v1).encode(((java.lang.Object)v4));
    Object v6 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)("T111111111"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = new org.apache.commons.codec.language.Caverphone();
    Object v2 = "Objects of type ";
    Object v3 = ((org.apache.commons.codec.language.Caverphone)v1).caverphone(((java.lang.String)v2));
    Object v4 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)("APKTSFTP11"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "DANGER";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("TNKA111111"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "]";
    Object v2 = "Zk+";
    Object v3 = ((org.apache.commons.codec.language.Caverphone)v0).isCaverphoneEqual(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new org.apache.commons.codec.language.Caverphone();
    Object v5 = "X";
    Object v6 = "UTF-8";
    Object v7 = ((org.apache.commons.codec.language.Caverphone)v4).isCaverphoneEqual(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.Object)v7));
      org.junit.Assert.fail("Expected org.apache.commons.codec.EncoderException");
    } catch (org.apache.commons.codec.EncoderException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "A";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("A111111111"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "se";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("S111111111"), v2);
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
    Object v1 = new org.apache.commons.codec.language.Caverphone();
    Object v2 = "";
    Object v3 = ((org.apache.commons.codec.language.Caverphone)v1).caverphone(((java.lang.String)v2));
    Object v4 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)("1111111111"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "Wt";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("T111111111"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "B";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("P111111111"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "U";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("A111111111"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = new org.apache.commons.codec.language.Caverphone();
    Object v2 = "B";
    Object v3 = ((org.apache.commons.codec.language.Caverphone)v1).encode(((java.lang.String)v2));
    Object v4 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)("P111111111"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "US-ASCII";
    Object v2 = "ORCID";
    Object v3 = ((org.apache.commons.codec.language.Caverphone)v0).isCaverphoneEqual(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new org.apache.commons.codec.language.Caverphone();
    Object v5 = "se";
    Object v6 = ((org.apache.commons.codec.language.Caverphone)v4).caverphone(((java.lang.String)v5));
    Object v7 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.Object)v6));
    org.junit.Assert.assertEquals((Object)("S111111111"), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = new org.apache.commons.codec.language.Caverphone();
    Object v2 = "";
    Object v3 = ((org.apache.commons.codec.language.Caverphone)v1).caverphone(((java.lang.String)v2));
    Object v4 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.Object)v3));
    Object v5 = new org.apache.commons.codec.language.Caverphone();
    Object v6 = "";
    Object v7 = ((org.apache.commons.codec.language.Caverphone)v5).caverphone(((java.lang.String)v6));
    Object v8 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)("1111111111"), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "S6H";
    Object v2 = "M";
    Object v3 = ((org.apache.commons.codec.language.Caverphone)v0).isCaverphoneEqual(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new org.apache.commons.codec.language.Caverphone();
    Object v5 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.Object)v4));
      org.junit.Assert.fail("Expected org.apache.commons.codec.EncoderException");
    } catch (org.apache.commons.codec.EncoderException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "uCIA";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("ASA1111111"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "WITZ";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("WTS1111111"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "UTF8";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("ATF1111111"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = new org.apache.commons.codec.language.Caverphone();
    Object v2 = "Em";
    Object v3 = ((org.apache.commons.codec.language.Caverphone)v1).caverphone(((java.lang.String)v2));
    Object v4 = new org.apache.commons.codec.language.Caverphone();
    Object v5 = "T=";
    Object v6 = ((org.apache.commons.codec.language.Caverphone)v4).caverphone(((java.lang.String)v5));
    Object v7 = ((org.apache.commons.codec.language.Caverphone)v1).encode(((java.lang.Object)v6));
    Object v8 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)("T111111111"), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "0123012002245502623010202";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("1111111111"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = new org.apache.commons.codec.language.Caverphone();
    Object v2 = "0123012002245502623010202";
    Object v3 = ((org.apache.commons.codec.language.Caverphone)v1).caverphone(((java.lang.String)v2));
    Object v4 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)("1111111111"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "TI";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("TA11111111"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = new org.apache.commons.codec.language.Caverphone();
    Object v2 = "TI";
    Object v3 = ((org.apache.commons.codec.language.Caverphone)v1).encode(((java.lang.String)v2));
    Object v4 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)("TA11111111"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "ObjecZts of type ";
    Object v2 = "";
    Object v3 = ((org.apache.commons.codec.language.Caverphone)v0).isCaverphoneEqual(((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "IA";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("AA11111111"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "KN";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("KN11111111"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "E`Y";
    Object v2 = "C";
    Object v3 = ((org.apache.commons.codec.language.Caverphone)v0).isCaverphoneEqual(((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "Objects of type ";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    Object v3 = "Q";
    Object v4 = "SK";
    Object v5 = ((org.apache.commons.codec.language.Caverphone)v0).isCaverphoneEqual(((java.lang.String)v3),((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = new org.apache.commons.codec.language.Caverphone();
    Object v2 = "ObjecZts of type ";
    Object v3 = "";
    Object v4 = ((org.apache.commons.codec.language.Caverphone)v1).isCaverphoneEqual(((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.Object)v4));
      org.junit.Assert.fail("Expected org.apache.commons.codec.EncoderException");
    } catch (org.apache.commons.codec.EncoderException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = new org.apache.commons.codec.language.Caverphone();
    Object v2 = "UTF-8";
    Object v3 = ((org.apache.commons.codec.language.Caverphone)v1).caverphone(((java.lang.String)v2));
    Object v4 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)("ATF1111111"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "AEIOU";
    Object v2 = "^[aeiou]";
    Object v3 = ((org.apache.commons.codec.language.Caverphone)v0).isCaverphoneEqual(((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(true), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "HEM8";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("AM11111111"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "HU";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("AA11111111"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "R3";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("A111111111"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = new org.apache.commons.codec.language.Caverphone();
    Object v2 = "0y";
    Object v3 = ((org.apache.commons.codec.language.Caverphone)v1).caverphone(((java.lang.String)v2));
    Object v4 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)("A111111111"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "B";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("P111111111"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "ISO-8859-1";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("ASA1111111"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "A^";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("A111111111"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "W3";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("A111111111"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "UTF-";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("ATF1111111"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "Objects of type ";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("APKTSFTP11"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "E";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("1111111111"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = new org.apache.commons.codec.language.Caverphone();
    Object v2 = "UTF8";
    Object v3 = ((org.apache.commons.codec.language.Caverphone)v1).caverphone(((java.lang.String)v2));
    Object v4 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)("ATF1111111"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "C7A";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.String)v1));
    Object v3 = new org.apache.commons.codec.language.Caverphone();
    Object v4 = "W3";
    Object v5 = ((org.apache.commons.codec.language.Caverphone)v3).caverphone(((java.lang.String)v4));
    Object v6 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)("A111111111"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = new org.apache.commons.codec.language.Caverphone();
    Object v2 = new org.apache.commons.codec.language.Caverphone();
    Object v3 = "TI";
    Object v4 = ((org.apache.commons.codec.language.Caverphone)v2).encode(((java.lang.String)v3));
    Object v5 = ((org.apache.commons.codec.language.Caverphone)v1).encode(((java.lang.Object)v4));
    Object v6 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)("TA11111111"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "MA";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("MA11111111"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "M";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("M111111111"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = new org.apache.commons.codec.language.Caverphone();
    Object v2 = new org.apache.commons.codec.language.Caverphone();
    Object v3 = "0123012002245502623010202";
    Object v4 = ((org.apache.commons.codec.language.Caverphone)v2).caverphone(((java.lang.String)v3));
    Object v5 = ((org.apache.commons.codec.language.Caverphone)v1).encode(((java.lang.Object)v4));
    Object v6 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)("1111111111"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "Q";
    Object v2 = "x";
    Object v3 = ((org.apache.commons.codec.language.Caverphone)v0).isCaverphoneEqual(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "C";
    Object v5 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)("K111111111"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "WH";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("1111111111"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "Objects of type ";
    Object v2 = "ISO-8859-1";
    Object v3 = ((org.apache.commons.codec.language.Caverphone)v0).isCaverphoneEqual(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new org.apache.commons.codec.language.Caverphone();
    Object v5 = "UTF8";
    Object v6 = ((org.apache.commons.codec.language.Caverphone)v4).caverphone(((java.lang.String)v5));
    Object v7 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.Object)v6));
    org.junit.Assert.assertEquals((Object)("ATF1111111"), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "MA";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.String)v1));
    Object v3 = new org.apache.commons.codec.language.Caverphone();
    Object v4 = new org.apache.commons.codec.language.Caverphone();
    Object v5 = "";
    Object v6 = ((org.apache.commons.codec.language.Caverphone)v4).caverphone(((java.lang.String)v5));
    Object v7 = ((org.apache.commons.codec.language.Caverphone)v3).encode(((java.lang.Object)v6));
    Object v8 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)("1111111111"), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = new org.apache.commons.codec.language.Caverphone();
    Object v2 = "HEM8";
    Object v3 = ((org.apache.commons.codec.language.Caverphone)v1).caverphone(((java.lang.String)v2));
    Object v4 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)("AM11111111"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "k";
    Object v2 = "UTF-8";
    Object v3 = ((org.apache.commons.codec.language.Caverphone)v0).isCaverphoneEqual(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new org.apache.commons.codec.language.Caverphone();
    Object v5 = "";
    Object v6 = ((org.apache.commons.codec.language.Caverphone)v4).caverphone(((java.lang.String)v5));
    Object v7 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.Object)v6));
    org.junit.Assert.assertEquals((Object)("1111111111"), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = new org.apache.commons.codec.language.Caverphone();
    Object v2 = "HU";
    Object v3 = ((org.apache.commons.codec.language.Caverphone)v1).caverphone(((java.lang.String)v2));
    Object v4 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)("AA11111111"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "JOSE";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("YS11111111"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "ISO-8859-9";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("ASA1111111"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "4R";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.String)v1));
    Object v3 = new org.apache.commons.codec.language.Caverphone();
    Object v4 = "";
    Object v5 = ((org.apache.commons.codec.language.Caverphone)v3).caverphone(((java.lang.String)v4));
    Object v6 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)("1111111111"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = ". But actually it was of the type ";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("PTKTLTWSFT"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "M";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.String)v1));
    Object v3 = "^cough";
    Object v4 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)("KF11111111"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "111111111o";
    Object v2 = "UTF-16LE";
    Object v3 = ((org.apache.commons.codec.language.Caverphone)v0).isCaverphoneEqual(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "Objects oftype ";
    Object v5 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)("APKTSFTP11"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "CQ";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.String)v1));
    Object v3 = "Objecs of type ";
    Object v4 = "I";
    Object v5 = ((org.apache.commons.codec.language.Caverphone)v0).isCaverphoneEqual(((java.lang.String)v3),((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = new org.apache.commons.codec.language.Caverphone();
    Object v2 = new org.apache.commons.codec.language.Caverphone();
    Object v3 = "B";
    Object v4 = ((org.apache.commons.codec.language.Caverphone)v2).encode(((java.lang.String)v3));
    Object v5 = ((org.apache.commons.codec.language.Caverphone)v1).encode(((java.lang.Object)v4));
    Object v6 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.Object)v5));
    Object v7 = new org.apache.commons.codec.language.Caverphone();
    Object v8 = "ISO-8859-9";
    Object v9 = ((org.apache.commons.codec.language.Caverphone)v7).caverphone(((java.lang.String)v8));
    Object v10 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.Object)v9));
    org.junit.Assert.assertEquals((Object)("ASA1111111"), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "H";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("A111111111"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "a";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("A111111111"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = new org.apache.commons.codec.language.Caverphone();
    Object v2 = new org.apache.commons.codec.language.Caverphone();
    Object v3 = "0y";
    Object v4 = ((org.apache.commons.codec.language.Caverphone)v2).caverphone(((java.lang.String)v3));
    Object v5 = ((org.apache.commons.codec.language.Caverphone)v1).encode(((java.lang.Object)v4));
    Object v6 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)("A111111111"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "j";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("A111111111"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = new org.apache.commons.codec.language.Caverphone();
    Object v2 = "WH";
    Object v3 = ((org.apache.commons.codec.language.Caverphone)v1).caverphone(((java.lang.String)v2));
    Object v4 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)("1111111111"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = new org.apache.commons.codec.language.Caverphone();
    Object v2 = "k";
    Object v3 = "UTF-8";
    Object v4 = ((org.apache.commons.codec.language.Caverphone)v1).isCaverphoneEqual(((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = new org.apache.commons.codec.language.Caverphone();
    Object v6 = "";
    Object v7 = ((org.apache.commons.codec.language.Caverphone)v5).caverphone(((java.lang.String)v6));
    Object v8 = ((org.apache.commons.codec.language.Caverphone)v1).encode(((java.lang.Object)v7));
    Object v9 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.Object)v8));
    org.junit.Assert.assertEquals((Object)("1111111111"), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = new org.apache.commons.codec.language.Caverphone();
    Object v2 = "Q";
    Object v3 = "x";
    Object v4 = ((org.apache.commons.codec.language.Caverphone)v1).isCaverphoneEqual(((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = "C";
    Object v6 = ((org.apache.commons.codec.language.Caverphone)v1).caverphone(((java.lang.String)v5));
    Object v7 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.Object)v6));
    Object v8 = "KS";
    Object v9 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.String)v8));
    org.junit.Assert.assertEquals((Object)("KS11111111"), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = new org.apache.commons.codec.language.Caverphone();
    Object v2 = "UTF-";
    Object v3 = ((org.apache.commons.codec.language.Caverphone)v1).caverphone(((java.lang.String)v2));
    Object v4 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)("ATF1111111"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "(ZI";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.String)v1));
    Object v3 = "UTFR-8";
    Object v4 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)("ATFA111111"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "WITZ";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.String)v1));
    Object v3 = "]";
    Object v4 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)("1111111111"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "TC(H";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("K111111111"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = new org.apache.commons.codec.language.Caverphone();
    Object v2 = "S";
    Object v3 = " cannotFbe encoded using Q codec";
    Object v4 = ((org.apache.commons.codec.language.Caverphone)v1).isCaverphoneEqual(((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = ((org.apache.commons.codec.language.Caverphone)v0).encode(((java.lang.Object)v4));
      org.junit.Assert.fail("Expected org.apache.commons.codec.EncoderException");
    } catch (org.apache.commons.codec.EncoderException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.Caverphone();
    Object v1 = "6";
    Object v2 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v1));
    Object v3 = "A";
    Object v4 = ((org.apache.commons.codec.language.Caverphone)v0).caverphone(((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)("A111111111"), v4);
  }
}
