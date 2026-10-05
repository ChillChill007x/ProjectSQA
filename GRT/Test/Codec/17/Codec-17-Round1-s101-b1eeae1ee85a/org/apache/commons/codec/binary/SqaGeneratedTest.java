package org.apache.commons.codec.binary;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)45)};
    Object v1 = "VT";
    Object v2 = org.apache.commons.codec.binary.StringUtils.newString(((byte[])v0),((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = "$5}";
    Object v1 = org.apache.commons.codec.digest.DigestUtils.sha384Hex(((java.lang.String)v0));
    Object v2 = "$5}";
    Object v3 = org.apache.commons.codec.digest.DigestUtils.sha384Hex(((java.lang.String)v2));
    Object v4 = org.apache.commons.codec.binary.StringUtils.equals(((java.lang.CharSequence)v1),((java.lang.CharSequence)v3));
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = "]";
    Object v1 = "b";
    Object v2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked(((java.lang.String)v0),((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = new byte[]{};
    Object v1 = "";
    Object v2 = org.apache.commons.codec.binary.StringUtils.newString(((byte[])v0),((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = "TI";
    Object v1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = "\"V";
    Object v1 = "*";
    Object v2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked(((java.lang.String)v0),((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = "$5}";
    Object v1 = org.apache.commons.codec.digest.DigestUtils.sha384Hex(((java.lang.String)v0));
    Object v2 = "$5}";
    Object v3 = org.apache.commons.codec.digest.DigestUtils.sha384Hex(((java.lang.String)v2));
    Object v4 = 3;
    Object v5 = ((java.lang.CharSequence)v3).charAt((((java.lang.Integer)v4).intValue()));
    Object v6 = org.apache.commons.codec.binary.StringUtils.equals(((java.lang.CharSequence)v1),((java.lang.CharSequence)v3));
    org.junit.Assert.assertEquals((Object)(true), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = "^[aeiou]";
    Object v1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = "D";
    Object v1 = "/*";
    Object v2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked(((java.lang.String)v0),((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = "j";
    Object v1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = "|A";
    Object v1 = org.apache.commons.codec.binary.StringUtils.getByteBufferUtf8(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)48),Byte.valueOf((byte)35),Byte.valueOf((byte)19)};
    Object v1 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(((byte[])v0));
    org.junit.Assert.assertEquals((Object)("\u3023\ufffd"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = "(Z";
    Object v1 = "OaY";
    Object v2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked(((java.lang.String)v0),((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)48),Byte.valueOf((byte)35),Byte.valueOf((byte)19)};
    Object v1 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(((byte[])v0));
    Object v2 = new byte[]{Byte.valueOf((byte)48),Byte.valueOf((byte)35),Byte.valueOf((byte)19)};
    Object v3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(((byte[])v2));
    Object v4 = org.apache.commons.codec.binary.StringUtils.equals(((java.lang.CharSequence)v1),((java.lang.CharSequence)v3));
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)6)};
    Object v1 = "Problem parsing line '";
    Object v2 = org.apache.commons.codec.binary.StringUtils.newString(((byte[])v0),((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = "SHA3~-512";
    Object v1 = org.apache.commons.codec.binary.StringUtils.getByteBufferUtf8(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = ", pat=F";
    Object v1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(((byte[])v0));
    org.junit.Assert.assertEquals((Object)(""), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = "}";
    Object v1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)-5),Byte.valueOf((byte)-13)};
    Object v1 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(((byte[])v0));
    org.junit.Assert.assertEquals((Object)("\ufffd\ufffd"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = "f+I";
    Object v1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)-5),Byte.valueOf((byte)-13)};
    Object v1 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(((byte[])v0));
    Object v2 = new byte[]{};
    Object v3 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(((byte[])v2));
    Object v4 = org.apache.commons.codec.binary.StringUtils.equals(((java.lang.CharSequence)v1),((java.lang.CharSequence)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)48),Byte.valueOf((byte)35),Byte.valueOf((byte)19)};
    Object v1 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(((byte[])v0));
    Object v2 = new byte[]{};
    Object v3 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(((byte[])v2));
    Object v4 = org.apache.commons.codec.binary.StringUtils.equals(((java.lang.CharSequence)v1),((java.lang.CharSequence)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)33)};
    Object v1 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(((byte[])v0));
    org.junit.Assert.assertEquals((Object)("\ufffd"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(((byte[])v0));
    org.junit.Assert.assertEquals((Object)(""), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)-39),Byte.valueOf((byte)-1)};
    Object v1 = "";
    Object v2 = org.apache.commons.codec.binary.StringUtils.newString(((byte[])v0),((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new org.apache.commons.codec.binary.StringUtils();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(((byte[])v0));
    Object v2 = new byte[]{};
    Object v3 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(((byte[])v2));
    Object v4 = ((java.lang.CharSequence)v3).chars();
    Object v5 = org.apache.commons.codec.binary.StringUtils.equals(((java.lang.CharSequence)v1),((java.lang.CharSequence)v3));
    org.junit.Assert.assertEquals((Object)(true), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = "";
    Object v1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = "RR";
    Object v1 = " ";
    Object v2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked(((java.lang.String)v0),((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)35)};
    Object v1 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(((byte[])v0));
    org.junit.Assert.assertEquals((Object)("#"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = "SCH";
    Object v1 = "org/apache/commons/codec/language/dmrules.txt";
    Object v2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked(((java.lang.String)v0),((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = "al";
    Object v1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)-29),Byte.valueOf((byte)6),Byte.valueOf((byte)-17)};
    Object v1 = "\\s+";
    Object v2 = org.apache.commons.codec.binary.StringUtils.newString(((byte[])v0),((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)-41),Byte.valueOf((byte)-33)};
    Object v1 = "";
    Object v2 = org.apache.commons.codec.binary.StringUtils.newString(((byte[])v0),((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)0)};
    Object v1 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(((byte[])v0));
    org.junit.Assert.assertEquals((Object)("\u0000"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = "UTF-8";
    Object v1 = org.apache.commons.codec.binary.StringUtils.getByteBufferUtf8(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = "EIY";
    Object v1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = "";
    Object v1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(((byte[])v0));
    org.junit.Assert.assertEquals((Object)(""), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)0)};
    Object v1 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(((byte[])v0));
    Object v2 = new byte[]{};
    Object v3 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(((byte[])v2));
    Object v4 = org.apache.commons.codec.binary.StringUtils.equals(((java.lang.CharSequence)v1),((java.lang.CharSequence)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)69)};
    Object v1 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(((byte[])v0));
    org.junit.Assert.assertEquals((Object)("E"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)-24),Byte.valueOf((byte)15)};
    Object v1 = ")";
    Object v2 = org.apache.commons.codec.binary.StringUtils.newString(((byte[])v0),((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)33)};
    Object v1 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(((byte[])v0));
    Object v2 = new byte[]{Byte.valueOf((byte)69)};
    Object v3 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(((byte[])v2));
    Object v4 = org.apache.commons.codec.binary.StringUtils.equals(((java.lang.CharSequence)v1),((java.lang.CharSequence)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)48)};
    Object v1 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(((byte[])v0));
    org.junit.Assert.assertEquals((Object)("\u0130"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)0)};
    Object v1 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(((byte[])v0));
    Object v2 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)0)};
    Object v3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(((byte[])v2));
    Object v4 = org.apache.commons.codec.binary.StringUtils.equals(((java.lang.CharSequence)v1),((java.lang.CharSequence)v3));
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)-1)};
    Object v1 = "N";
    Object v2 = org.apache.commons.codec.binary.StringUtils.newString(((byte[])v0),((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = "P";
    Object v1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = "fh";
    Object v1 = "s";
    Object v2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked(((java.lang.String)v0),((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = "dg";
    Object v2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked(((java.lang.String)v0),((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = "MN";
    Object v1 = "\\|";
    Object v2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked(((java.lang.String)v0),((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = ";";
    Object v1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)33)};
    Object v1 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(((byte[])v0));
    org.junit.Assert.assertEquals((Object)("!"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)106),Byte.valueOf((byte)64),Byte.valueOf((byte)0)};
    Object v1 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(((byte[])v0));
    org.junit.Assert.assertEquals((Object)("j@\u0000"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)48)};
    Object v1 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(((byte[])v0));
    Object v2 = new byte[]{};
    Object v3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(((byte[])v2));
    Object v4 = org.apache.commons.codec.binary.StringUtils.equals(((java.lang.CharSequence)v1),((java.lang.CharSequence)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)106),Byte.valueOf((byte)64),Byte.valueOf((byte)0)};
    Object v1 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(((byte[])v0));
    Object v2 = new byte[]{Byte.valueOf((byte)-5),Byte.valueOf((byte)-13)};
    Object v3 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(((byte[])v2));
    Object v4 = org.apache.commons.codec.binary.StringUtils.equals(((java.lang.CharSequence)v1),((java.lang.CharSequence)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = "UEN";
    Object v1 = "di";
    Object v2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked(((java.lang.String)v0),((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = "Parameter supplied to Nysiis encode i";
    Object v1 = "";
    Object v2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked(((java.lang.String)v0),((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)48)};
    Object v1 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(((byte[])v0));
    Object v2 = new byte[]{Byte.valueOf((byte)-5),Byte.valueOf((byte)-13)};
    Object v3 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(((byte[])v2));
    Object v4 = org.apache.commons.codec.binary.StringUtils.equals(((java.lang.CharSequence)v1),((java.lang.CharSequence)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = "EY";
    Object v1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(((byte[])v0));
    org.junit.Assert.assertEquals((Object)(""), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = new byte[]{};
    Object v1 = "S-";
    Object v2 = org.apache.commons.codec.binary.StringUtils.newString(((byte[])v0),((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = "K";
    Object v1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = "#";
    Object v1 = "wh3";
    Object v2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked(((java.lang.String)v0),((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)-20),Byte.valueOf((byte)77)};
    Object v1 = "*6/";
    Object v2 = org.apache.commons.codec.binary.StringUtils.newString(((byte[])v0),((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)106),Byte.valueOf((byte)64),Byte.valueOf((byte)0)};
    Object v1 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(((byte[])v0));
    Object v2 = new byte[]{Byte.valueOf((byte)-5),Byte.valueOf((byte)-13)};
    Object v3 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(((byte[])v2));
    Object v4 = ((java.lang.CharSequence)v3).toString();
    Object v5 = org.apache.commons.codec.binary.StringUtils.equals(((java.lang.CharSequence)v1),((java.lang.CharSequence)v3));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)106),Byte.valueOf((byte)64),Byte.valueOf((byte)0)};
    Object v1 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(((byte[])v0));
    Object v2 = new byte[]{};
    Object v3 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(((byte[])v2));
    Object v4 = ((java.lang.CharSequence)v3).toString();
    Object v5 = org.apache.commons.codec.binary.StringUtils.equals(((java.lang.CharSequence)v1),((java.lang.CharSequence)v3));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = "9";
    Object v1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)26)};
    Object v1 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(((byte[])v0));
    org.junit.Assert.assertEquals((Object)("\u001a"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = "A";
    Object v1 = "\"";
    Object v2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked(((java.lang.String)v0),((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = "*/";
    Object v1 = "SHA-1";
    Object v2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked(((java.lang.String)v0),((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)18),Byte.valueOf((byte)6)};
    Object v1 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(((byte[])v0));
    org.junit.Assert.assertEquals((Object)("\u0112\ufffd"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = "UTF-8";
    Object v1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)0)};
    Object v1 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(((byte[])v0));
    Object v2 = new byte[]{Byte.valueOf((byte)-5),Byte.valueOf((byte)-13)};
    Object v3 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(((byte[])v2));
    Object v4 = ((java.lang.CharSequence)v3).chars();
    Object v5 = org.apache.commons.codec.binary.StringUtils.equals(((java.lang.CharSequence)v1),((java.lang.CharSequence)v3));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = "?";
    Object v1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = "]";
    Object v1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = "7";
    Object v1 = "";
    Object v2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked(((java.lang.String)v0),((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = "I";
    Object v1 = " m";
    Object v2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked(((java.lang.String)v0),((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = "U;F-8";
    Object v1 = "N";
    Object v2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked(((java.lang.String)v0),((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)106),Byte.valueOf((byte)64),Byte.valueOf((byte)0)};
    Object v1 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(((byte[])v0));
    Object v2 = new byte[]{};
    Object v3 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(((byte[])v2));
    Object v4 = org.apache.commons.codec.binary.StringUtils.equals(((java.lang.CharSequence)v1),((java.lang.CharSequence)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)8),Byte.valueOf((byte)-34),Byte.valueOf((byte)88)};
    Object v1 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(((byte[])v0));
    org.junit.Assert.assertEquals((Object)("\u08de\ufffd"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = "SHA3-384";
    Object v1 = "";
    Object v2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked(((java.lang.String)v0),((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)-5),Byte.valueOf((byte)-13)};
    Object v1 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(((byte[])v0));
    Object v2 = new byte[]{};
    Object v3 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(((byte[])v2));
    Object v4 = org.apache.commons.codec.binary.StringUtils.equals(((java.lang.CharSequence)v1),((java.lang.CharSequence)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)0)};
    Object v1 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(((byte[])v0));
    Object v2 = ((java.lang.CharSequence)v1).length();
    Object v3 = new byte[]{};
    Object v4 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(((byte[])v3));
    Object v5 = org.apache.commons.codec.binary.StringUtils.equals(((java.lang.CharSequence)v1),((java.lang.CharSequence)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)33)};
    Object v1 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(((byte[])v0));
    Object v2 = ((java.lang.CharSequence)v1).length();
    Object v3 = new byte[]{Byte.valueOf((byte)8),Byte.valueOf((byte)-34),Byte.valueOf((byte)88)};
    Object v4 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(((byte[])v3));
    Object v5 = ((java.lang.CharSequence)v4).toString();
    Object v6 = org.apache.commons.codec.binary.StringUtils.equals(((java.lang.CharSequence)v1),((java.lang.CharSequence)v4));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = ":o";
    Object v1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)-30),Byte.valueOf((byte)47)};
    Object v1 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(((byte[])v0));
    org.junit.Assert.assertEquals((Object)("\ufffd/"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = "G";
    Object v1 = "";
    Object v2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked(((java.lang.String)v0),((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = "O";
    Object v1 = "\\,]";
    Object v2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked(((java.lang.String)v0),((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)4),Byte.valueOf((byte)14)};
    Object v1 = "P";
    Object v2 = org.apache.commons.codec.binary.StringUtils.newString(((byte[])v0),((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = "SH";
    Object v1 = "*/";
    Object v2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked(((java.lang.String)v0),((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)0)};
    Object v1 = "\\s+";
    Object v2 = org.apache.commons.codec.binary.StringUtils.newString(((byte[])v0),((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = "L~";
    Object v1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)87)};
    Object v1 = "//";
    Object v2 = org.apache.commons.codec.binary.StringUtils.newString(((byte[])v0),((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = "HIS";
    Object v1 = "Unreachable case: ";
    Object v2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked(((java.lang.String)v0),((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)3)};
    Object v1 = "!";
    Object v2 = org.apache.commons.codec.binary.StringUtils.newString(((byte[])v0),((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)0),Byte.valueOf((byte)3)};
    Object v1 = "$aYpr1$";
    Object v2 = org.apache.commons.codec.binary.StringUtils.newString(((byte[])v0),((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)-19),Byte.valueOf((byte)-36)};
    Object v1 = "$6$";
    Object v2 = org.apache.commons.codec.binary.StringUtils.newString(((byte[])v0),((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)-36)};
    Object v1 = "$1$";
    Object v2 = org.apache.commons.codec.binary.StringUtils.newString(((byte[])v0),((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)-11),Byte.valueOf((byte)0)};
    Object v1 = "$F";
    Object v2 = org.apache.commons.codec.binary.StringUtils.newString(((byte[])v0),((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }
}
