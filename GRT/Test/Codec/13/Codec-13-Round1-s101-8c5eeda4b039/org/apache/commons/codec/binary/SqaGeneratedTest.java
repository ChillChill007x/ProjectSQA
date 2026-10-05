package org.apache.commons.codec.binary;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)41)};
    Object v1 = "VM";
    Object v2 = org.apache.commons.codec.binary.StringUtils.newString(((byte[])v0),((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = "se";
    Object v1 = org.apache.commons.codec.digest.DigestUtils.shaHex(((java.lang.String)v0));
    Object v2 = "se";
    Object v3 = org.apache.commons.codec.digest.DigestUtils.shaHex(((java.lang.String)v2));
    Object v4 = ((java.lang.CharSequence)v3).codePoints();
    Object v5 = org.apache.commons.codec.binary.StringUtils.equals(((java.lang.CharSequence)v1),((java.lang.CharSequence)v3));
    org.junit.Assert.assertEquals((Object)(true), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = "se";
    Object v1 = org.apache.commons.codec.digest.DigestUtils.shaHex(((java.lang.String)v0));
    Object v2 = "se";
    Object v3 = org.apache.commons.codec.digest.DigestUtils.shaHex(((java.lang.String)v2));
    Object v4 = 12;
    Object v5 = 14;
    Object v6 = ((java.lang.CharSequence)v3).subSequence((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = org.apache.commons.codec.binary.StringUtils.equals(((java.lang.CharSequence)v1),((java.lang.CharSequence)v3));
    org.junit.Assert.assertEquals((Object)(true), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)16),Byte.valueOf((byte)-37)};
    Object v1 = "O ";
    Object v2 = org.apache.commons.codec.binary.StringUtils.newString(((byte[])v0),((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = "c\"";
    Object v1 = "~";
    Object v2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked(((java.lang.String)v0),((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = "";
    Object v1 = "UTF-8";
    Object v2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new org.apache.commons.codec.binary.StringUtils();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = "";
    Object v1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Le(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)1),Byte.valueOf((byte)-4)};
    Object v1 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(((byte[])v0));
    org.junit.Assert.assertEquals((Object)("\u0001\u0001\ufffd"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = "AEIOU";
    Object v1 = "BTF-8";
    Object v2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked(((java.lang.String)v0),((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)-43),Byte.valueOf((byte)-5)};
    Object v1 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(((byte[])v0));
    org.junit.Assert.assertEquals((Object)("\u00d5\u00fb"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = " ";
    Object v1 = "E";
    Object v2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked(((java.lang.String)v0),((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = new byte[]{};
    Object v1 = "X";
    Object v2 = org.apache.commons.codec.binary.StringUtils.newString(((byte[])v0),((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = "couf";
    Object v1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = "%";
    Object v1 = "Invalid salt value: ";
    Object v2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked(((java.lang.String)v0),((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = "r";
    Object v1 = "g";
    Object v2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked(((java.lang.String)v0),((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = ")";
    Object v1 = "jR3";
    Object v2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked(((java.lang.String)v0),((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(((byte[])v0));
    org.junit.Assert.assertEquals((Object)(""), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(((byte[])v0));
    Object v2 = ((java.lang.CharSequence)v1).chars();
    Object v3 = new byte[]{};
    Object v4 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(((byte[])v3));
    Object v5 = org.apache.commons.codec.binary.StringUtils.equals(((java.lang.CharSequence)v1),((java.lang.CharSequence)v4));
    org.junit.Assert.assertEquals((Object)(true), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(((byte[])v0));
    Object v2 = new byte[]{Byte.valueOf((byte)-43),Byte.valueOf((byte)-5)};
    Object v3 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(((byte[])v2));
    Object v4 = org.apache.commons.codec.binary.StringUtils.equals(((java.lang.CharSequence)v1),((java.lang.CharSequence)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = "q";
    Object v1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = "k";
    Object v1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = "EWSKY";
    Object v2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked(((java.lang.String)v0),((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = "SHA-=1";
    Object v1 = "Invalid salt value: ";
    Object v2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked(((java.lang.String)v0),((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(((byte[])v0));
    Object v2 = new byte[]{};
    Object v3 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(((byte[])v2));
    Object v4 = org.apache.commons.codec.binary.StringUtils.equals(((java.lang.CharSequence)v1),((java.lang.CharSequence)v3));
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = "SS";
    Object v1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)1),Byte.valueOf((byte)-4)};
    Object v1 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(((byte[])v0));
    Object v2 = new byte[]{};
    Object v3 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(((byte[])v2));
    Object v4 = ((java.lang.CharSequence)v3).toString();
    Object v5 = org.apache.commons.codec.binary.StringUtils.equals(((java.lang.CharSequence)v1),((java.lang.CharSequence)v3));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = "";
    Object v1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)-13),Byte.valueOf((byte)1)};
    Object v1 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(((byte[])v0));
    org.junit.Assert.assertEquals((Object)("\u00f3\u0001"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)34),Byte.valueOf((byte)7)};
    Object v1 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(((byte[])v0));
    org.junit.Assert.assertEquals((Object)("\u0000\"\u0007"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = "]x";
    Object v1 = "C";
    Object v2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked(((java.lang.String)v0),((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(((byte[])v0));
    org.junit.Assert.assertEquals((Object)(""), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = "WICZ";
    Object v1 = "";
    Object v2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked(((java.lang.String)v0),((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = "IER";
    Object v1 = "L";
    Object v2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked(((java.lang.String)v0),((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)-13),Byte.valueOf((byte)1)};
    Object v1 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(((byte[])v0));
    Object v2 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)34),Byte.valueOf((byte)7)};
    Object v3 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(((byte[])v2));
    Object v4 = ((java.lang.CharSequence)v3).codePoints();
    Object v5 = org.apache.commons.codec.binary.StringUtils.equals(((java.lang.CharSequence)v1),((java.lang.CharSequence)v3));
    org.junit.Assert.assertEquals((Object)(false), v5);
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
    Object v1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = "'";
    Object v1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = "";
    Object v1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16(((java.lang.String)v0));
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
    Object v0 = new byte[]{};
    Object v1 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(((byte[])v0));
    Object v2 = new byte[]{};
    Object v3 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(((byte[])v2));
    Object v4 = org.apache.commons.codec.binary.StringUtils.equals(((java.lang.CharSequence)v1),((java.lang.CharSequence)v3));
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)3)};
    Object v1 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(((byte[])v0));
    org.junit.Assert.assertEquals((Object)("\u0003"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)12)};
    Object v1 = "TCH";
    Object v2 = org.apache.commons.codec.binary.StringUtils.newString(((byte[])v0),((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)0)};
    Object v1 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(((byte[])v0));
    Object v2 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)34),Byte.valueOf((byte)7)};
    Object v3 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(((byte[])v2));
    Object v4 = org.apache.commons.codec.binary.StringUtils.equals(((java.lang.CharSequence)v1),((java.lang.CharSequence)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(((byte[])v0));
    Object v2 = ((java.lang.CharSequence)v1).toString();
    Object v3 = new byte[]{Byte.valueOf((byte)3)};
    Object v4 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(((byte[])v3));
    Object v5 = org.apache.commons.codec.binary.StringUtils.equals(((java.lang.CharSequence)v1),((java.lang.CharSequence)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = "1111111111";
    Object v1 = "*/";
    Object v2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked(((java.lang.String)v0),((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)34),Byte.valueOf((byte)7)};
    Object v1 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(((byte[])v0));
    Object v2 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)34),Byte.valueOf((byte)7)};
    Object v3 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(((byte[])v2));
    Object v4 = org.apache.commons.codec.binary.StringUtils.equals(((java.lang.CharSequence)v1),((java.lang.CharSequence)v3));
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)3)};
    Object v1 = "2";
    Object v2 = org.apache.commons.codec.binary.StringUtils.newString(((byte[])v0),((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = "M";
    Object v1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = "[aeiou]";
    Object v1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)0)};
    Object v1 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(((byte[])v0));
    org.junit.Assert.assertEquals((Object)("\ufffd"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = "A";
    Object v2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked(((java.lang.String)v0),((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = "M/";
    Object v1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = "\\A";
    Object v1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)11)};
    Object v1 = "\\s";
    Object v2 = org.apache.commons.codec.binary.StringUtils.newString(((byte[])v0),((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = "22";
    Object v2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked(((java.lang.String)v0),((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)-13),Byte.valueOf((byte)1)};
    Object v1 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(((byte[])v0));
    Object v2 = ((java.lang.CharSequence)v1).length();
    Object v3 = new byte[]{Byte.valueOf((byte)-13),Byte.valueOf((byte)1)};
    Object v4 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(((byte[])v3));
    Object v5 = org.apache.commons.codec.binary.StringUtils.equals(((java.lang.CharSequence)v1),((java.lang.CharSequence)v4));
    org.junit.Assert.assertEquals((Object)(true), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)-9),Byte.valueOf((byte)1),Byte.valueOf((byte)-8)};
    Object v1 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(((byte[])v0));
    org.junit.Assert.assertEquals((Object)("\uf701\ufffd"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)-9),Byte.valueOf((byte)1),Byte.valueOf((byte)-8)};
    Object v1 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(((byte[])v0));
    Object v2 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)34),Byte.valueOf((byte)7)};
    Object v3 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(((byte[])v2));
    Object v4 = org.apache.commons.codec.binary.StringUtils.equals(((java.lang.CharSequence)v1),((java.lang.CharSequence)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)-13),Byte.valueOf((byte)1)};
    Object v1 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(((byte[])v0));
    Object v2 = new byte[]{Byte.valueOf((byte)3)};
    Object v3 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(((byte[])v2));
    Object v4 = org.apache.commons.codec.binary.StringUtils.equals(((java.lang.CharSequence)v1),((java.lang.CharSequence)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = "$'";
    Object v1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)65)};
    Object v1 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(((byte[])v0));
    org.junit.Assert.assertEquals((Object)("A"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)0)};
    Object v1 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(((byte[])v0));
    org.junit.Assert.assertEquals((Object)("\ufffd"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = "";
    Object v1 = "ISO-8859-1";
    Object v2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(((byte[])v0));
    org.junit.Assert.assertEquals((Object)(""), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)8),Byte.valueOf((byte)49)};
    Object v1 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(((byte[])v0));
    org.junit.Assert.assertEquals((Object)("\u0831"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = "p";
    Object v1 = "\\-";
    Object v2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked(((java.lang.String)v0),((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = "Unable to load resource: ";
    Object v1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)-43),Byte.valueOf((byte)-5)};
    Object v1 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(((byte[])v0));
    Object v2 = ((java.lang.CharSequence)v1).chars();
    Object v3 = new byte[]{Byte.valueOf((byte)0)};
    Object v4 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(((byte[])v3));
    Object v5 = 0;
    Object v6 = ((java.lang.CharSequence)v4).charAt((((java.lang.Integer)v5).intValue()));
    Object v7 = org.apache.commons.codec.binary.StringUtils.equals(((java.lang.CharSequence)v1),((java.lang.CharSequence)v4));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)34),Byte.valueOf((byte)7)};
    Object v1 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(((byte[])v0));
    Object v2 = new byte[]{};
    Object v3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(((byte[])v2));
    Object v4 = org.apache.commons.codec.binary.StringUtils.equals(((java.lang.CharSequence)v1),((java.lang.CharSequence)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = "enou2f";
    Object v1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = "dela";
    Object v1 = "ben+";
    Object v2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked(((java.lang.String)v0),((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = "c";
    Object v1 = org.apache.commons.codec.binary.StringUtils.getBytesIso8859_1(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)3)};
    Object v1 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(((byte[])v0));
    Object v2 = ((java.lang.CharSequence)v1).codePoints();
    Object v3 = new byte[]{Byte.valueOf((byte)3)};
    Object v4 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(((byte[])v3));
    Object v5 = ((java.lang.CharSequence)v4).chars();
    Object v6 = org.apache.commons.codec.binary.StringUtils.equals(((java.lang.CharSequence)v1),((java.lang.CharSequence)v4));
    org.junit.Assert.assertEquals((Object)(true), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(((byte[])v0));
    Object v2 = new byte[]{Byte.valueOf((byte)3)};
    Object v3 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(((byte[])v2));
    Object v4 = org.apache.commons.codec.binary.StringUtils.equals(((java.lang.CharSequence)v1),((java.lang.CharSequence)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = "9F";
    Object v1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = "' i] ";
    Object v1 = "u";
    Object v2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked(((java.lang.String)v0),((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = "I";
    Object v1 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)0)};
    Object v1 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(((byte[])v0));
    org.junit.Assert.assertEquals((Object)("\u0000"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = "de la";
    Object v1 = "2\\";
    Object v2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked(((java.lang.String)v0),((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = "k";
    Object v1 = "0";
    Object v2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked(((java.lang.String)v0),((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = new byte[]{};
    Object v1 = "O";
    Object v2 = org.apache.commons.codec.binary.StringUtils.newString(((byte[])v0),((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)-5),Byte.valueOf((byte)-9)};
    Object v1 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(((byte[])v0));
    org.junit.Assert.assertEquals((Object)("\ufbf7"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = "#";
    Object v1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = " ";
    Object v1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)-47)};
    Object v1 = "SH";
    Object v2 = org.apache.commons.codec.binary.StringUtils.newString(((byte[])v0),((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = "w]";
    Object v1 = "IS";
    Object v2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked(((java.lang.String)v0),((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = "cy";
    Object v1 = "ME";
    Object v2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked(((java.lang.String)v0),((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)10)};
    Object v1 = "3kh";
    Object v2 = org.apache.commons.codec.binary.StringUtils.newString(((byte[])v0),((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(((byte[])v0));
    Object v2 = new byte[]{};
    Object v3 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(((byte[])v2));
    Object v4 = org.apache.commons.codec.binary.StringUtils.equals(((java.lang.CharSequence)v1),((java.lang.CharSequence)v3));
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)2)};
    Object v1 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(((byte[])v0));
    org.junit.Assert.assertEquals((Object)("\ufffd"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)-43),Byte.valueOf((byte)-5)};
    Object v1 = org.apache.commons.codec.binary.StringUtils.newStringIso8859_1(((byte[])v0));
    Object v2 = new byte[]{};
    Object v3 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Be(((byte[])v2));
    Object v4 = org.apache.commons.codec.binary.StringUtils.equals(((java.lang.CharSequence)v1),((java.lang.CharSequence)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)65)};
    Object v1 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(((byte[])v0));
    Object v2 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)34),Byte.valueOf((byte)7)};
    Object v3 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(((byte[])v2));
    Object v4 = org.apache.commons.codec.binary.StringUtils.equals(((java.lang.CharSequence)v1),((java.lang.CharSequence)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)1)};
    Object v1 = "^cough";
    Object v2 = org.apache.commons.codec.binary.StringUtils.newString(((byte[])v0),((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = "U";
    Object v1 = "/|";
    Object v2 = org.apache.commons.codec.binary.StringUtils.getBytesUnchecked(((java.lang.String)v0),((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = "]";
    Object v1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf16Be(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)50),Byte.valueOf((byte)50),Byte.valueOf((byte)0)};
    Object v1 = "~2";
    Object v2 = org.apache.commons.codec.binary.StringUtils.newString(((byte[])v0),((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = org.apache.commons.codec.binary.StringUtils.newStringUtf16(((byte[])v0));
    org.junit.Assert.assertEquals((Object)(""), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)13)};
    Object v1 = "";
    Object v2 = org.apache.commons.codec.binary.StringUtils.newString(((byte[])v0),((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)-10)};
    Object v1 = org.apache.commons.codec.binary.StringUtils.newStringUtf16Le(((byte[])v0));
    org.junit.Assert.assertEquals((Object)("\uf601"), v1);
  }
}
