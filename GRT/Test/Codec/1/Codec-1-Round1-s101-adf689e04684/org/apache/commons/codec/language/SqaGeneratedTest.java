package org.apache.commons.codec.language;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = "P";
    Object v1 = "UTF-8";
    Object v2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = "Z";
    Object v1 = "b";
    Object v2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = "2";
    Object v1 = org.apache.commons.codec.language.SoundexUtils.clean(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(""), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = "";
    Object v1 = org.apache.commons.codec.language.SoundexUtils.clean(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(""), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = "ISL";
    Object v1 = org.apache.commons.codec.language.SoundexUtils.clean(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("ISL"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new org.apache.commons.codec.language.SoundexUtils();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = "c";
    Object v1 = "EN";
    Object v2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = "";
    Object v1 = "E2";
    Object v2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = "GN";
    Object v1 = "";
    Object v2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = "OGGI";
    Object v1 = "CAESAR";
    Object v2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = " at index ";
    Object v1 = new org.apache.commons.codec.net.QCodec(((java.lang.String)v0));
    Object v2 = "UTFW8";
    Object v3 = "US-ASCII";
    Object v4 = org.apache.commons.codec.language.SoundexUtils.difference(((org.apache.commons.codec.StringEncoder)v1),((java.lang.String)v2),((java.lang.String)v3));
      org.junit.Assert.fail("Expected org.apache.commons.codec.EncoderException");
    } catch (org.apache.commons.codec.EncoderException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = "tch";
    Object v1 = "22";
    Object v2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = "US";
    Object v1 = " G";
    Object v2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = "H";
    Object v1 = org.apache.commons.codec.language.SoundexUtils.clean(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("H"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = "CHIA";
    Object v1 = "US-ASCI";
    Object v2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)(1), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = "Y";
    Object v1 = org.apache.commons.codec.language.SoundexUtils.clean(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("Y"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = " at index ";
    Object v1 = new org.apache.commons.codec.net.QCodec(((java.lang.String)v0));
    Object v2 = "UT";
    Object v3 = "WITZ";
    Object v4 = org.apache.commons.codec.language.SoundexUtils.difference(((org.apache.commons.codec.StringEncoder)v1),((java.lang.String)v2),((java.lang.String)v3));
      org.junit.Assert.fail("Expected org.apache.commons.codec.EncoderException");
    } catch (org.apache.commons.codec.EncoderException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = "ED";
    Object v1 = org.apache.commons.codec.language.SoundexUtils.clean(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("ED"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = "|L";
    Object v1 = org.apache.commons.codec.language.SoundexUtils.clean(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("L"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = "T";
    Object v1 = "HOLM";
    Object v2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = "ZO";
    Object v1 = "YUTF-8";
    Object v2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = "US-ASCII";
    Object v1 = org.apache.commons.codec.language.SoundexUtils.clean(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("USASCII"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = "PYS";
    Object v1 = "UTF-8";
    Object v2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = "I";
    Object v1 = org.apache.commons.codec.language.SoundexUtils.clean(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("I"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = "Objects of type2 ";
    Object v1 = org.apache.commons.codec.language.SoundexUtils.clean(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("OBJECTSOFTYPE"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = "CIA";
    Object v1 = "E";
    Object v2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = "Obje6ts of type ";
    Object v1 = org.apache.commons.codec.language.SoundexUtils.clean(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("OBJETSOFTYPE"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = "}L";
    Object v1 = org.apache.commons.codec.language.SoundexUtils.clean(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("L"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = "B";
    Object v1 = "SUGAR";
    Object v2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = "01230120022455012623010202";
    Object v1 = "UTF-8";
    Object v2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = "SHA-t84";
    Object v1 = "CIA";
    Object v2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)(1), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = "DD";
    Object v1 = "HEIM";
    Object v2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = "S";
    Object v1 = " cannot be encoded using Q codec";
    Object v2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = "AEIOU";
    Object v1 = "US-ASCII";
    Object v2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = "^trough";
    Object v1 = "VA ";
    Object v2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = "UTF-8";
    Object v1 = "UT-8";
    Object v2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)(2), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = "UTF-8";
    Object v1 = org.apache.commons.codec.language.SoundexUtils.clean(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("UTF"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = "AEIOU";
    Object v1 = org.apache.commons.codec.language.SoundexUtils.clean(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("AEIOU"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = "W";
    Object v1 = "";
    Object v2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = "TCH";
    Object v1 = "ce";
    Object v2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = "CZ";
    Object v1 = "EWZKI";
    Object v2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = "";
    Object v1 = "I";
    Object v2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = "OWSOI";
    Object v1 = "z";
    Object v2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = "TS";
    Object v1 = org.apache.commons.codec.language.SoundexUtils.clean(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("TS"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = "^";
    Object v1 = org.apache.commons.codec.language.SoundexUtils.clean(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(""), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = "";
    Object v1 = "";
    Object v2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = "k";
    Object v1 = org.apache.commons.codec.language.SoundexUtils.clean(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("K"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = " at index ";
    Object v1 = org.apache.commons.codec.language.SoundexUtils.clean(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("ATINDEX"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = "Objects of type ";
    Object v1 = "CQ";
    Object v2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = "He$";
    Object v1 = "CC";
    Object v2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = "";
    Object v1 = "B";
    Object v2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = "DG";
    Object v1 = "tio";
    Object v2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = "CJH";
    Object v1 = "s";
    Object v2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = "Objects of type ";
    Object v1 = "2ch";
    Object v2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = "YSbL";
    Object v1 = org.apache.commons.codec.language.SoundexUtils.clean(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("YSBL"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = "C";
    Object v1 = org.apache.commons.codec.language.SoundexUtils.clean(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("C"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = "j";
    Object v1 = "B";
    Object v2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = "US-ACII";
    Object v1 = "0123120022455012623010202";
    Object v2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = "T";
    Object v1 = "US-ASCII";
    Object v2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = " at index ";
    Object v1 = new org.apache.commons.codec.net.QCodec(((java.lang.String)v0));
    Object v2 = "v";
    Object v3 = "";
    Object v4 = org.apache.commons.codec.language.SoundexUtils.difference(((org.apache.commons.codec.StringEncoder)v1),((java.lang.String)v2),((java.lang.String)v3));
      org.junit.Assert.fail("Expected org.apache.commons.codec.EncoderException");
    } catch (org.apache.commons.codec.EncoderException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = "HARIS";
    Object v1 = "HIA";
    Object v2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)(1), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = "c";
    Object v1 = org.apache.commons.codec.language.SoundexUtils.clean(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("C"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = "DT";
    Object v1 = org.apache.commons.codec.language.SoundexUtils.clean(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("DT"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = "E";
    Object v1 = org.apache.commons.codec.language.SoundexUtils.clean(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("E"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = "Obj";
    Object v1 = org.apache.commons.codec.language.SoundexUtils.clean(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("OBJ"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = "IE";
    Object v1 = org.apache.commons.codec.language.SoundexUtils.clean(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("IE"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = "TQS";
    Object v1 = "=?";
    Object v2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = "UF-8";
    Object v1 = org.apache.commons.codec.language.SoundexUtils.clean(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("UF"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = "I\"";
    Object v1 = "US-ASCII";
    Object v2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = "m";
    Object v1 = "";
    Object v2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = "";
    Object v1 = "SIA";
    Object v2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = "O";
    Object v1 = org.apache.commons.codec.language.SoundexUtils.clean(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("O"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = " at index ";
    Object v1 = new org.apache.commons.codec.net.QCodec(((java.lang.String)v0));
    Object v2 = "Objects of type ";
    Object v3 = "SAN) ";
    Object v4 = org.apache.commons.codec.language.SoundexUtils.difference(((org.apache.commons.codec.StringEncoder)v1),((java.lang.String)v2),((java.lang.String)v3));
      org.junit.Assert.fail("Expected org.apache.commons.codec.EncoderException");
    } catch (org.apache.commons.codec.EncoderException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = "p5";
    Object v1 = "A";
    Object v2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = "HEIM";
    Object v1 = "MOD5";
    Object v2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = "OGGI";
    Object v1 = "EWSKI";
    Object v2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = "^gn";
    Object v1 = "^tugh";
    Object v2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)(1), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = "SH";
    Object v1 = "TCH";
    Object v2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = "";
    Object v1 = "^trough";
    Object v2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = "?";
    Object v1 = "N";
    Object v2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = "A";
    Object v1 = "TCu";
    Object v2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = " at index ";
    Object v1 = new org.apache.commons.codec.net.QCodec(((java.lang.String)v0));
    Object v2 = "[CH";
    Object v3 = "ObjectsV of type ";
    Object v4 = org.apache.commons.codec.language.SoundexUtils.difference(((org.apache.commons.codec.StringEncoder)v1),((java.lang.String)v2),((java.lang.String)v3));
      org.junit.Assert.fail("Expected org.apache.commons.codec.EncoderException");
    } catch (org.apache.commons.codec.EncoderException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = "Objects of type ";
    Object v1 = "UT";
    Object v2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = "@S";
    Object v1 = "argument not a byte array";
    Object v2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = "rB";
    Object v1 = "?S";
    Object v2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = "L";
    Object v1 = org.apache.commons.codec.language.SoundexUtils.clean(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("L"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = "v";
    Object v1 = "Y3";
    Object v2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = "Parameter suBpplied to Metaphone encode is not of type java.lang.String";
    Object v1 = org.apache.commons.codec.language.SoundexUtils.clean(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("PARAMETERSUBPPLIEDTOMETAPHONEENCODEISNOTOFTYPEJAVALANGSTRING"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = "T";
    Object v1 = "TH";
    Object v2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)(1), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = "~";
    Object v1 = "OIh";
    Object v2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = "D{G";
    Object v1 = org.apache.commons.codec.language.SoundexUtils.clean(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("DG"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = "D";
    Object v1 = "M";
    Object v2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = "ci";
    Object v1 = org.apache.commons.codec.language.SoundexUtils.clean(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("CI"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = "ph";
    Object v1 = org.apache.commons.codec.language.SoundexUtils.clean(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("PH"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = "TH";
    Object v1 = " cannot be quoted-printable decoded";
    Object v2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = "HOLM";
    Object v1 = org.apache.commons.codec.language.SoundexUtils.clean(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("HOLM"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = "M";
    Object v1 = org.apache.commons.codec.language.SoundexUtils.clean(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("M"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = "D";
    Object v1 = org.apache.commons.codec.language.SoundexUtils.clean(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("D"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = "";
    Object v1 = "AE/OUY";
    Object v2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = " at index ";
    Object v1 = new org.apache.commons.codec.net.QCodec(((java.lang.String)v0));
    Object v2 = "CIO";
    Object v3 = "\"n";
    Object v4 = org.apache.commons.codec.language.SoundexUtils.difference(((org.apache.commons.codec.StringEncoder)v1),((java.lang.String)v2),((java.lang.String)v3));
      org.junit.Assert.fail("Expected org.apache.commons.codec.EncoderException");
    } catch (org.apache.commons.codec.EncoderException expected) { }
  }
}
