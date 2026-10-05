package org.apache.commons.codec.net;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = "OWeKI";
    Object v1 = new org.apache.commons.codec.net.QuotedPrintableCodec(((java.lang.String)v0));
    Object v2 = new byte[]{Byte.valueOf((byte)-7),Byte.valueOf((byte)0)};
    Object v3 = ((org.apache.commons.codec.net.QuotedPrintableCodec)v1).decode(((byte[])v2));
    Object v4 = "A";
    Object v5 = ((org.apache.commons.codec.net.QuotedPrintableCodec)v1).encode(((java.lang.String)v4));
      org.junit.Assert.fail("Expected org.apache.commons.codec.EncoderException");
    } catch (org.apache.commons.codec.EncoderException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(((byte[])v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = "OWeKI";
    Object v1 = new org.apache.commons.codec.net.QuotedPrintableCodec(((java.lang.String)v0));
    Object v2 = new byte[]{};
    Object v3 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(((byte[])v2));
    Object v4 = ((org.apache.commons.codec.net.QuotedPrintableCodec)v1).encode(((java.lang.Object)v3));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)20)};
    Object v1 = java.util.BitSet.valueOf(((byte[])v0));
    Object v2 = new byte[]{};
    Object v3 = org.apache.commons.codec.net.QuotedPrintableCodec.encodeQuotedPrintable(((java.util.BitSet)v1),((byte[])v2));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = "OWeKI";
    Object v1 = new org.apache.commons.codec.net.QuotedPrintableCodec(((java.lang.String)v0));
    Object v2 = "3";
    Object v3 = ((org.apache.commons.codec.net.QuotedPrintableCodec)v1).encode(((java.lang.String)v2));
      org.junit.Assert.fail("Expected org.apache.commons.codec.EncoderException");
    } catch (org.apache.commons.codec.EncoderException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = "OWeKI";
    Object v1 = new org.apache.commons.codec.net.QuotedPrintableCodec(((java.lang.String)v0));
    Object v2 = new byte[]{Byte.valueOf((byte)20)};
    Object v3 = java.util.BitSet.valueOf(((byte[])v2));
    Object v4 = ((org.apache.commons.codec.net.QuotedPrintableCodec)v1).decode(((java.lang.Object)v3));
      org.junit.Assert.fail("Expected org.apache.commons.codec.DecoderException");
    } catch (org.apache.commons.codec.DecoderException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)30),Byte.valueOf((byte)0),Byte.valueOf((byte)35)};
    Object v1 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(((byte[])v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = "OWeKI";
    Object v1 = new org.apache.commons.codec.net.QuotedPrintableCodec(((java.lang.String)v0));
    Object v2 = "3";
    Object v3 = ((org.apache.commons.codec.net.QuotedPrintableCodec)v1).decode(((java.lang.String)v2));
      org.junit.Assert.fail("Expected org.apache.commons.codec.DecoderException");
    } catch (org.apache.commons.codec.DecoderException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)20)};
    Object v1 = java.util.BitSet.valueOf(((byte[])v0));
    Object v2 = new byte[]{Byte.valueOf((byte)-22),Byte.valueOf((byte)1),Byte.valueOf((byte)0)};
    Object v3 = org.apache.commons.codec.net.QuotedPrintableCodec.encodeQuotedPrintable(((java.util.BitSet)v1),((byte[])v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = "OWeKI";
    Object v1 = new org.apache.commons.codec.net.QuotedPrintableCodec(((java.lang.String)v0));
    Object v2 = "UTF-";
    Object v3 = ((org.apache.commons.codec.net.QuotedPrintableCodec)v1).encode(((java.lang.String)v2));
      org.junit.Assert.fail("Expected org.apache.commons.codec.EncoderException");
    } catch (org.apache.commons.codec.EncoderException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = "111111X111";
    Object v1 = new org.apache.commons.codec.net.QuotedPrintableCodec(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = "OWeKI";
    Object v1 = new org.apache.commons.codec.net.QuotedPrintableCodec(((java.lang.String)v0));
    Object v2 = "$/";
    Object v3 = "UTF-8";
    Object v4 = ((org.apache.commons.codec.net.QuotedPrintableCodec)v1).decode(((java.lang.String)v2),((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)("$/"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = "111111X111";
    Object v1 = new org.apache.commons.codec.net.QuotedPrintableCodec(((java.lang.String)v0));
    Object v2 = "tou2f";
    Object v3 = ((org.apache.commons.codec.net.QuotedPrintableCodec)v1).encode(((java.lang.String)v2));
      org.junit.Assert.fail("Expected org.apache.commons.codec.EncoderException");
    } catch (org.apache.commons.codec.EncoderException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = "TIO";
    Object v1 = new org.apache.commons.codec.net.QuotedPrintableCodec(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = "TIO";
    Object v1 = new org.apache.commons.codec.net.QuotedPrintableCodec(((java.lang.String)v0));
    Object v2 = "111111X111";
    Object v3 = new org.apache.commons.codec.net.QuotedPrintableCodec(((java.lang.String)v2));
    Object v4 = ((org.apache.commons.codec.net.QuotedPrintableCodec)v1).encode(((java.lang.Object)v3));
      org.junit.Assert.fail("Expected org.apache.commons.codec.EncoderException");
    } catch (org.apache.commons.codec.EncoderException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = "TIO";
    Object v1 = new org.apache.commons.codec.net.QuotedPrintableCodec(((java.lang.String)v0));
    Object v2 = "HIA";
    Object v3 = ((org.apache.commons.codec.net.QuotedPrintableCodec)v1).decode(((java.lang.String)v2));
      org.junit.Assert.fail("Expected org.apache.commons.codec.DecoderException");
    } catch (org.apache.commons.codec.DecoderException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)48),Byte.valueOf((byte)-3),Byte.valueOf((byte)-16)};
    Object v1 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(((byte[])v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = "111111X111";
    Object v1 = new org.apache.commons.codec.net.QuotedPrintableCodec(((java.lang.String)v0));
    Object v2 = "[aeiou]";
    Object v3 = "K";
    Object v4 = ((org.apache.commons.codec.net.QuotedPrintableCodec)v1).encode(((java.lang.String)v2),((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = "111111X111";
    Object v1 = new org.apache.commons.codec.net.QuotedPrintableCodec(((java.lang.String)v0));
    Object v2 = "ph";
    Object v3 = "3";
    Object v4 = ((org.apache.commons.codec.net.QuotedPrintableCodec)v1).encode(((java.lang.String)v2),((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = "TIO";
    Object v1 = new org.apache.commons.codec.net.QuotedPrintableCodec(((java.lang.String)v0));
    Object v2 = "2";
    Object v3 = ((org.apache.commons.codec.net.QuotedPrintableCodec)v1).decode(((java.lang.String)v2));
      org.junit.Assert.fail("Expected org.apache.commons.codec.DecoderException");
    } catch (org.apache.commons.codec.DecoderException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = "111111X111";
    Object v1 = new org.apache.commons.codec.net.QuotedPrintableCodec(((java.lang.String)v0));
    Object v2 = "UTF-8";
    Object v3 = ((org.apache.commons.codec.net.QuotedPrintableCodec)v1).decode(((java.lang.String)v2));
      org.junit.Assert.fail("Expected org.apache.commons.codec.DecoderException");
    } catch (org.apache.commons.codec.DecoderException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = "TIO";
    Object v1 = new org.apache.commons.codec.net.QuotedPrintableCodec(((java.lang.String)v0));
    Object v2 = new byte[]{Byte.valueOf((byte)12),Byte.valueOf((byte)3)};
    Object v3 = ((org.apache.commons.codec.net.QuotedPrintableCodec)v1).decode(((byte[])v2));
    Object v4 = new byte[]{};
    Object v5 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(((byte[])v4));
    Object v6 = ((org.apache.commons.codec.net.QuotedPrintableCodec)v1).encode(((java.lang.Object)v5));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = "111111X111";
    Object v1 = new org.apache.commons.codec.net.QuotedPrintableCodec(((java.lang.String)v0));
    Object v2 = "111111X111";
    Object v3 = new org.apache.commons.codec.net.QuotedPrintableCodec(((java.lang.String)v2));
    Object v4 = ((org.apache.commons.codec.net.QuotedPrintableCodec)v1).encode(((java.lang.Object)v3));
      org.junit.Assert.fail("Expected org.apache.commons.codec.EncoderException");
    } catch (org.apache.commons.codec.EncoderException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = "TIO";
    Object v1 = new org.apache.commons.codec.net.QuotedPrintableCodec(((java.lang.String)v0));
    Object v2 = "TIO";
    Object v3 = new org.apache.commons.codec.net.QuotedPrintableCodec(((java.lang.String)v2));
    Object v4 = ((org.apache.commons.codec.net.QuotedPrintableCodec)v1).decode(((java.lang.Object)v3));
      org.junit.Assert.fail("Expected org.apache.commons.codec.DecoderException");
    } catch (org.apache.commons.codec.DecoderException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = "111111X111";
    Object v1 = new org.apache.commons.codec.net.QuotedPrintableCodec(((java.lang.String)v0));
    Object v2 = "UTF-1\"6BE";
    Object v3 = "[";
    Object v4 = ((org.apache.commons.codec.net.QuotedPrintableCodec)v1).decode(((java.lang.String)v2),((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = "TIO";
    Object v1 = new org.apache.commons.codec.net.QuotedPrintableCodec(((java.lang.String)v0));
    Object v2 = new byte[]{Byte.valueOf((byte)2)};
    Object v3 = ((org.apache.commons.codec.net.QuotedPrintableCodec)v1).decode(((byte[])v2));
    Object v4 = "sz";
    Object v5 = ((org.apache.commons.codec.net.QuotedPrintableCodec)v1).encode(((java.lang.String)v4));
      org.junit.Assert.fail("Expected org.apache.commons.codec.EncoderException");
    } catch (org.apache.commons.codec.EncoderException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = "TIO";
    Object v1 = new org.apache.commons.codec.net.QuotedPrintableCodec(((java.lang.String)v0));
    Object v2 = "a";
    Object v3 = "TH";
    Object v4 = ((org.apache.commons.codec.net.QuotedPrintableCodec)v1).encode(((java.lang.String)v2),((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = "111111X111";
    Object v1 = new org.apache.commons.codec.net.QuotedPrintableCodec(((java.lang.String)v0));
    Object v2 = "";
    Object v3 = "UT-8";
    Object v4 = ((org.apache.commons.codec.net.QuotedPrintableCodec)v1).decode(((java.lang.String)v2),((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = "TIO";
    Object v1 = new org.apache.commons.codec.net.QuotedPrintableCodec(((java.lang.String)v0));
    Object v2 = "rou2f";
    Object v3 = ((org.apache.commons.codec.net.QuotedPrintableCodec)v1).decode(((java.lang.String)v2));
      org.junit.Assert.fail("Expected org.apache.commons.codec.DecoderException");
    } catch (org.apache.commons.codec.DecoderException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = "TIO";
    Object v1 = new org.apache.commons.codec.net.QuotedPrintableCodec(((java.lang.String)v0));
    Object v2 = new byte[]{Byte.valueOf((byte)20)};
    Object v3 = java.util.BitSet.valueOf(((byte[])v2));
    Object v4 = ((org.apache.commons.codec.net.QuotedPrintableCodec)v1).encode(((java.lang.Object)v3));
      org.junit.Assert.fail("Expected org.apache.commons.codec.EncoderException");
    } catch (org.apache.commons.codec.EncoderException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = "TIO";
    Object v1 = new org.apache.commons.codec.net.QuotedPrintableCodec(((java.lang.String)v0));
    Object v2 = new byte[]{Byte.valueOf((byte)33)};
    Object v3 = ((org.apache.commons.codec.net.QuotedPrintableCodec)v1).decode(((byte[])v2));
    Object v4 = new byte[]{};
    Object v5 = ((org.apache.commons.codec.net.QuotedPrintableCodec)v1).decode(((byte[])v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = "111111X111";
    Object v1 = new org.apache.commons.codec.net.QuotedPrintableCodec(((java.lang.String)v0));
    Object v2 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)20),Byte.valueOf((byte)3)};
    Object v3 = ((org.apache.commons.codec.net.QuotedPrintableCodec)v1).encode(((byte[])v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = "111111X111";
    Object v1 = new org.apache.commons.codec.net.QuotedPrintableCodec(((java.lang.String)v0));
    Object v2 = new byte[]{Byte.valueOf((byte)48),Byte.valueOf((byte)-3),Byte.valueOf((byte)-16)};
    Object v3 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(((byte[])v2));
    Object v4 = ((org.apache.commons.codec.net.QuotedPrintableCodec)v1).encode(((java.lang.Object)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = "111111X111";
    Object v1 = new org.apache.commons.codec.net.QuotedPrintableCodec(((java.lang.String)v0));
    Object v2 = new byte[]{Byte.valueOf((byte)48),Byte.valueOf((byte)-3),Byte.valueOf((byte)-16)};
    Object v3 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(((byte[])v2));
    Object v4 = ((org.apache.commons.codec.net.QuotedPrintableCodec)v1).decode(((java.lang.Object)v3));
    Object v5 = "E";
    Object v6 = "AUTF-8";
    Object v7 = ((org.apache.commons.codec.net.QuotedPrintableCodec)v1).decode(((java.lang.String)v5),((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)20)};
    Object v1 = java.util.BitSet.valueOf(((byte[])v0));
    Object v2 = new byte[]{Byte.valueOf((byte)3),Byte.valueOf((byte)1),Byte.valueOf((byte)11)};
    Object v3 = org.apache.commons.codec.net.QuotedPrintableCodec.encodeQuotedPrintable(((java.util.BitSet)v1),((byte[])v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = "111111X111";
    Object v1 = new org.apache.commons.codec.net.QuotedPrintableCodec(((java.lang.String)v0));
    Object v2 = new byte[]{Byte.valueOf((byte)13),Byte.valueOf((byte)1),Byte.valueOf((byte)0)};
    Object v3 = ((org.apache.commons.codec.net.QuotedPrintableCodec)v1).decode(((byte[])v2));
    Object v4 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)13),Byte.valueOf((byte)19)};
    Object v5 = ((org.apache.commons.codec.net.QuotedPrintableCodec)v1).encode(((byte[])v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = "111111X111";
    Object v1 = new org.apache.commons.codec.net.QuotedPrintableCodec(((java.lang.String)v0));
    Object v2 = new byte[]{Byte.valueOf((byte)20)};
    Object v3 = java.util.BitSet.valueOf(((byte[])v2));
    Object v4 = ((org.apache.commons.codec.net.QuotedPrintableCodec)v1).encode(((java.lang.Object)v3));
      org.junit.Assert.fail("Expected org.apache.commons.codec.EncoderException");
    } catch (org.apache.commons.codec.EncoderException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = "TIO";
    Object v1 = new org.apache.commons.codec.net.QuotedPrintableCodec(((java.lang.String)v0));
    Object v2 = ((org.apache.commons.codec.net.QuotedPrintableCodec)v1).getDefaultCharset();
    org.junit.Assert.assertEquals((Object)("TIO"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new org.apache.commons.codec.net.QuotedPrintableCodec();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = "TIO";
    Object v1 = new org.apache.commons.codec.net.QuotedPrintableCodec(((java.lang.String)v0));
    Object v2 = "A";
    Object v3 = "";
    Object v4 = ((org.apache.commons.codec.net.QuotedPrintableCodec)v1).encode(((java.lang.String)v2),((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = new org.apache.commons.codec.net.QuotedPrintableCodec();
    Object v1 = "EI,";
    Object v2 = "B";
    Object v3 = ((org.apache.commons.codec.net.QuotedPrintableCodec)v0).encode(((java.lang.String)v1),((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = "111111X111";
    Object v1 = new org.apache.commons.codec.net.QuotedPrintableCodec(((java.lang.String)v0));
    Object v2 = new byte[]{Byte.valueOf((byte)30),Byte.valueOf((byte)0),Byte.valueOf((byte)35)};
    Object v3 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(((byte[])v2));
    Object v4 = ((org.apache.commons.codec.net.QuotedPrintableCodec)v1).decode(((java.lang.Object)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = "TIO";
    Object v1 = new org.apache.commons.codec.net.QuotedPrintableCodec(((java.lang.String)v0));
    Object v2 = "";
    Object v3 = "Warning: malformed line '";
    Object v4 = ((org.apache.commons.codec.net.QuotedPrintableCodec)v1).decode(((java.lang.String)v2),((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new org.apache.commons.codec.net.QuotedPrintableCodec();
    Object v1 = "UTF-8";
    Object v2 = ((org.apache.commons.codec.net.QuotedPrintableCodec)v0).decode(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("UTF-8"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = "TIO";
    Object v1 = new org.apache.commons.codec.net.QuotedPrintableCodec(((java.lang.String)v0));
    Object v2 = new byte[]{Byte.valueOf((byte)-10),Byte.valueOf((byte)60)};
    Object v3 = ((org.apache.commons.codec.net.QuotedPrintableCodec)v1).decode(((byte[])v2));
    Object v4 = new byte[]{Byte.valueOf((byte)48),Byte.valueOf((byte)-3),Byte.valueOf((byte)-16)};
    Object v5 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(((byte[])v4));
    Object v6 = ((org.apache.commons.codec.net.QuotedPrintableCodec)v1).encode(((java.lang.Object)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = new org.apache.commons.codec.net.QuotedPrintableCodec();
    Object v1 = new org.apache.commons.codec.net.QuotedPrintableCodec();
    Object v2 = ((org.apache.commons.codec.net.QuotedPrintableCodec)v0).decode(((java.lang.Object)v1));
      org.junit.Assert.fail("Expected org.apache.commons.codec.DecoderException");
    } catch (org.apache.commons.codec.DecoderException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = "TIO";
    Object v1 = new org.apache.commons.codec.net.QuotedPrintableCodec(((java.lang.String)v0));
    Object v2 = "/";
    Object v3 = ((org.apache.commons.codec.net.QuotedPrintableCodec)v1).decode(((java.lang.String)v2));
      org.junit.Assert.fail("Expected org.apache.commons.codec.DecoderException");
    } catch (org.apache.commons.codec.DecoderException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = "TIO";
    Object v1 = new org.apache.commons.codec.net.QuotedPrintableCodec(((java.lang.String)v0));
    Object v2 = "UTF-8";
    Object v3 = "UTF-";
    Object v4 = ((org.apache.commons.codec.net.QuotedPrintableCodec)v1).encode(((java.lang.String)v2),((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)20)};
    Object v1 = java.util.BitSet.valueOf(((byte[])v0));
    Object v2 = new byte[]{Byte.valueOf((byte)-7),Byte.valueOf((byte)26),Byte.valueOf((byte)9)};
    Object v3 = org.apache.commons.codec.net.QuotedPrintableCodec.encodeQuotedPrintable(((java.util.BitSet)v1),((byte[])v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = "TIO";
    Object v1 = new org.apache.commons.codec.net.QuotedPrintableCodec(((java.lang.String)v0));
    Object v2 = new byte[]{Byte.valueOf((byte)20)};
    Object v3 = java.util.BitSet.valueOf(((byte[])v2));
    Object v4 = new byte[]{Byte.valueOf((byte)3),Byte.valueOf((byte)1),Byte.valueOf((byte)11)};
    Object v5 = org.apache.commons.codec.net.QuotedPrintableCodec.encodeQuotedPrintable(((java.util.BitSet)v3),((byte[])v4));
    Object v6 = ((org.apache.commons.codec.net.QuotedPrintableCodec)v1).encode(((java.lang.Object)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = "111111X111";
    Object v1 = new org.apache.commons.codec.net.QuotedPrintableCodec(((java.lang.String)v0));
    Object v2 = new org.apache.commons.codec.net.QuotedPrintableCodec();
    Object v3 = ((org.apache.commons.codec.net.QuotedPrintableCodec)v1).decode(((java.lang.Object)v2));
      org.junit.Assert.fail("Expected org.apache.commons.codec.DecoderException");
    } catch (org.apache.commons.codec.DecoderException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = new org.apache.commons.codec.net.QuotedPrintableCodec();
    Object v1 = "RANGER";
    Object v2 = ((org.apache.commons.codec.net.QuotedPrintableCodec)v0).decode(((java.lang.String)v1));
    Object v3 = new byte[]{Byte.valueOf((byte)20)};
    Object v4 = java.util.BitSet.valueOf(((byte[])v3));
    Object v5 = ((org.apache.commons.codec.net.QuotedPrintableCodec)v0).decode(((java.lang.Object)v4));
      org.junit.Assert.fail("Expected org.apache.commons.codec.DecoderException");
    } catch (org.apache.commons.codec.DecoderException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = "TIO";
    Object v1 = new org.apache.commons.codec.net.QuotedPrintableCodec(((java.lang.String)v0));
    Object v2 = new byte[]{Byte.valueOf((byte)1)};
    Object v3 = ((org.apache.commons.codec.net.QuotedPrintableCodec)v1).decode(((byte[])v2));
    Object v4 = "k";
    Object v5 = "ds";
    Object v6 = ((org.apache.commons.codec.net.QuotedPrintableCodec)v1).decode(((java.lang.String)v4),((java.lang.String)v5));
      org.junit.Assert.fail("Expected java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new org.apache.commons.codec.net.QuotedPrintableCodec();
    Object v1 = "TIO";
    Object v2 = new org.apache.commons.codec.net.QuotedPrintableCodec(((java.lang.String)v1));
    Object v3 = new byte[]{Byte.valueOf((byte)33)};
    Object v4 = ((org.apache.commons.codec.net.QuotedPrintableCodec)v2).decode(((byte[])v3));
    Object v5 = new byte[]{};
    Object v6 = ((org.apache.commons.codec.net.QuotedPrintableCodec)v2).decode(((byte[])v5));
    Object v7 = ((org.apache.commons.codec.net.QuotedPrintableCodec)v0).decode(((java.lang.Object)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = "TIO";
    Object v1 = new org.apache.commons.codec.net.QuotedPrintableCodec(((java.lang.String)v0));
    Object v2 = "^h";
    Object v3 = ((org.apache.commons.codec.net.QuotedPrintableCodec)v1).encode(((java.lang.String)v2));
      org.junit.Assert.fail("Expected org.apache.commons.codec.EncoderException");
    } catch (org.apache.commons.codec.EncoderException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = "TIO";
    Object v1 = new org.apache.commons.codec.net.QuotedPrintableCodec(((java.lang.String)v0));
    Object v2 = new byte[]{};
    Object v3 = ((org.apache.commons.codec.net.QuotedPrintableCodec)v1).decode(((byte[])v2));
    Object v4 = "TIO";
    Object v5 = new org.apache.commons.codec.net.QuotedPrintableCodec(((java.lang.String)v4));
    Object v6 = ((org.apache.commons.codec.net.QuotedPrintableCodec)v5).getDefaultCharset();
    Object v7 = ((org.apache.commons.codec.net.QuotedPrintableCodec)v1).decode(((java.lang.Object)v6));
      org.junit.Assert.fail("Expected org.apache.commons.codec.DecoderException");
    } catch (org.apache.commons.codec.DecoderException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)11)};
    Object v1 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(((byte[])v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = "111111X111";
    Object v1 = new org.apache.commons.codec.net.QuotedPrintableCodec(((java.lang.String)v0));
    Object v2 = "N";
    Object v3 = ((org.apache.commons.codec.net.QuotedPrintableCodec)v1).decode(((java.lang.String)v2));
      org.junit.Assert.fail("Expected org.apache.commons.codec.DecoderException");
    } catch (org.apache.commons.codec.DecoderException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = new org.apache.commons.codec.net.QuotedPrintableCodec();
    Object v1 = "OWeKI";
    Object v2 = new org.apache.commons.codec.net.QuotedPrintableCodec(((java.lang.String)v1));
    Object v3 = "$/";
    Object v4 = "UTF-8";
    Object v5 = ((org.apache.commons.codec.net.QuotedPrintableCodec)v2).decode(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((org.apache.commons.codec.net.QuotedPrintableCodec)v0).encode(((java.lang.Object)v5));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = "TIO";
    Object v1 = new org.apache.commons.codec.net.QuotedPrintableCodec(((java.lang.String)v0));
    Object v2 = new org.apache.commons.codec.net.QuotedPrintableCodec();
    Object v3 = "TIO";
    Object v4 = new org.apache.commons.codec.net.QuotedPrintableCodec(((java.lang.String)v3));
    Object v5 = new byte[]{Byte.valueOf((byte)33)};
    Object v6 = ((org.apache.commons.codec.net.QuotedPrintableCodec)v4).decode(((byte[])v5));
    Object v7 = new byte[]{};
    Object v8 = ((org.apache.commons.codec.net.QuotedPrintableCodec)v4).decode(((byte[])v7));
    Object v9 = ((org.apache.commons.codec.net.QuotedPrintableCodec)v2).decode(((java.lang.Object)v8));
    Object v10 = ((org.apache.commons.codec.net.QuotedPrintableCodec)v1).encode(((java.lang.Object)v9));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = "TIO";
    Object v1 = new org.apache.commons.codec.net.QuotedPrintableCodec(((java.lang.String)v0));
    Object v2 = "v";
    Object v3 = ((org.apache.commons.codec.net.QuotedPrintableCodec)v1).decode(((java.lang.String)v2));
      org.junit.Assert.fail("Expected org.apache.commons.codec.DecoderException");
    } catch (org.apache.commons.codec.DecoderException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = "TIO";
    Object v1 = new org.apache.commons.codec.net.QuotedPrintableCodec(((java.lang.String)v0));
    Object v2 = "cTF-8";
    Object v3 = "UTF-8";
    Object v4 = ((org.apache.commons.codec.net.QuotedPrintableCodec)v1).encode(((java.lang.String)v2),((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)("cTF-8"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)20)};
    Object v1 = java.util.BitSet.valueOf(((byte[])v0));
    Object v2 = new byte[]{Byte.valueOf((byte)1)};
    Object v3 = org.apache.commons.codec.net.QuotedPrintableCodec.encodeQuotedPrintable(((java.util.BitSet)v1),((byte[])v2));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)20)};
    Object v1 = java.util.BitSet.valueOf(((byte[])v0));
    Object v2 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)0),Byte.valueOf((byte)0)};
    Object v3 = org.apache.commons.codec.net.QuotedPrintableCodec.encodeQuotedPrintable(((java.util.BitSet)v1),((byte[])v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = "TIO";
    Object v1 = new org.apache.commons.codec.net.QuotedPrintableCodec(((java.lang.String)v0));
    Object v2 = new byte[]{Byte.valueOf((byte)30),Byte.valueOf((byte)0),Byte.valueOf((byte)35)};
    Object v3 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(((byte[])v2));
    Object v4 = ((org.apache.commons.codec.net.QuotedPrintableCodec)v1).encode(((java.lang.Object)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = "TIO";
    Object v1 = new org.apache.commons.codec.net.QuotedPrintableCodec(((java.lang.String)v0));
    Object v2 = "finalRules can notbe null";
    Object v3 = ((org.apache.commons.codec.net.QuotedPrintableCodec)v1).decode(((java.lang.String)v2));
      org.junit.Assert.fail("Expected org.apache.commons.codec.DecoderException");
    } catch (org.apache.commons.codec.DecoderException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = "111111X111";
    Object v1 = new org.apache.commons.codec.net.QuotedPrintableCodec(((java.lang.String)v0));
    Object v2 = "$";
    Object v3 = ((org.apache.commons.codec.net.QuotedPrintableCodec)v1).encode(((java.lang.String)v2));
      org.junit.Assert.fail("Expected org.apache.commons.codec.EncoderException");
    } catch (org.apache.commons.codec.EncoderException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = "111111X111";
    Object v1 = new org.apache.commons.codec.net.QuotedPrintableCodec(((java.lang.String)v0));
    Object v2 = "UTF-8";
    Object v3 = "objects of type ";
    Object v4 = ((org.apache.commons.codec.net.QuotedPrintableCodec)v1).encode(((java.lang.String)v2),((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)20)};
    Object v1 = java.util.BitSet.valueOf(((byte[])v0));
    Object v2 = new byte[]{Byte.valueOf((byte)2),Byte.valueOf((byte)1)};
    Object v3 = org.apache.commons.codec.net.QuotedPrintableCodec.encodeQuotedPrintable(((java.util.BitSet)v1),((byte[])v2));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = "111111X111";
    Object v1 = new org.apache.commons.codec.net.QuotedPrintableCodec(((java.lang.String)v0));
    Object v2 = new byte[]{};
    Object v3 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(((byte[])v2));
    Object v4 = ((org.apache.commons.codec.net.QuotedPrintableCodec)v1).decode(((java.lang.Object)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = new org.apache.commons.codec.net.QuotedPrintableCodec();
    Object v1 = "UTF-8";
    Object v2 = ((org.apache.commons.codec.net.QuotedPrintableCodec)v0).encode(((java.lang.String)v1));
    Object v3 = "`";
    Object v4 = "gTIA";
    Object v5 = ((org.apache.commons.codec.net.QuotedPrintableCodec)v0).decode(((java.lang.String)v3),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new org.apache.commons.codec.net.QuotedPrintableCodec();
    Object v1 = new byte[]{Byte.valueOf((byte)48),Byte.valueOf((byte)-3),Byte.valueOf((byte)-16)};
    Object v2 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(((byte[])v1));
    Object v3 = ((org.apache.commons.codec.net.QuotedPrintableCodec)v0).decode(((java.lang.Object)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = "TIO";
    Object v1 = new org.apache.commons.codec.net.QuotedPrintableCodec(((java.lang.String)v0));
    Object v2 = "111111X111";
    Object v3 = new org.apache.commons.codec.net.QuotedPrintableCodec(((java.lang.String)v2));
    Object v4 = ((org.apache.commons.codec.net.QuotedPrintableCodec)v1).decode(((java.lang.Object)v3));
      org.junit.Assert.fail("Expected org.apache.commons.codec.DecoderException");
    } catch (org.apache.commons.codec.DecoderException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)20)};
    Object v1 = java.util.BitSet.valueOf(((byte[])v0));
    Object v2 = new byte[]{Byte.valueOf((byte)20)};
    Object v3 = java.util.BitSet.valueOf(((byte[])v2));
    ((java.util.BitSet)v1).or(((java.util.BitSet)v3));
    Object v4 = null;
    Object v5 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)2)};
    Object v6 = org.apache.commons.codec.net.QuotedPrintableCodec.encodeQuotedPrintable(((java.util.BitSet)v1),((byte[])v5));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = "TIO";
    Object v1 = new org.apache.commons.codec.net.QuotedPrintableCodec(((java.lang.String)v0));
    Object v2 = "";
    Object v3 = "s1i";
    Object v4 = ((org.apache.commons.codec.net.QuotedPrintableCodec)v1).encode(((java.lang.String)v2),((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = "111111X111";
    Object v1 = new org.apache.commons.codec.net.QuotedPrintableCodec(((java.lang.String)v0));
    Object v2 = "Oijects of type ";
    Object v3 = ((org.apache.commons.codec.net.QuotedPrintableCodec)v1).encode(((java.lang.String)v2));
      org.junit.Assert.fail("Expected org.apache.commons.codec.EncoderException");
    } catch (org.apache.commons.codec.EncoderException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = "111111X111";
    Object v1 = new org.apache.commons.codec.net.QuotedPrintableCodec(((java.lang.String)v0));
    Object v2 = "";
    Object v3 = "UTF-8";
    Object v4 = ((org.apache.commons.codec.net.QuotedPrintableCodec)v1).decode(((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = "Z";
    Object v6 = ((org.apache.commons.codec.net.QuotedPrintableCodec)v1).decode(((java.lang.String)v5));
      org.junit.Assert.fail("Expected org.apache.commons.codec.DecoderException");
    } catch (org.apache.commons.codec.DecoderException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = new org.apache.commons.codec.net.QuotedPrintableCodec();
    Object v1 = "org/apache/comons/codec/language/bm/%s_languages.txt";
    Object v2 = "d";
    Object v3 = ((org.apache.commons.codec.net.QuotedPrintableCodec)v0).decode(((java.lang.String)v1),((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)-14),Byte.valueOf((byte)1),Byte.valueOf((byte)65)};
    Object v1 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(((byte[])v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)20)};
    Object v1 = java.util.BitSet.valueOf(((byte[])v0));
    Object v2 = new byte[]{Byte.valueOf((byte)-26),Byte.valueOf((byte)1)};
    Object v3 = org.apache.commons.codec.net.QuotedPrintableCodec.encodeQuotedPrintable(((java.util.BitSet)v1),((byte[])v2));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)20)};
    Object v1 = java.util.BitSet.valueOf(((byte[])v0));
    Object v2 = new byte[]{Byte.valueOf((byte)16),Byte.valueOf((byte)-13)};
    Object v3 = org.apache.commons.codec.net.QuotedPrintableCodec.encodeQuotedPrintable(((java.util.BitSet)v1),((byte[])v2));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = new org.apache.commons.codec.net.QuotedPrintableCodec();
    Object v1 = "AEIdU";
    Object v2 = "sio";
    Object v3 = ((org.apache.commons.codec.net.QuotedPrintableCodec)v0).decode(((java.lang.String)v1),((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)-29),Byte.valueOf((byte)19)};
    Object v1 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(((byte[])v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = new org.apache.commons.codec.net.QuotedPrintableCodec();
    Object v1 = "eno2f";
    Object v2 = "0123012002245501262301020";
    Object v3 = ((org.apache.commons.codec.net.QuotedPrintableCodec)v0).encode(((java.lang.String)v1),((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = "111111X111";
    Object v1 = new org.apache.commons.codec.net.QuotedPrintableCodec(((java.lang.String)v0));
    Object v2 = new byte[]{Byte.valueOf((byte)48),Byte.valueOf((byte)-3),Byte.valueOf((byte)-16)};
    Object v3 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(((byte[])v2));
    Object v4 = ((org.apache.commons.codec.net.QuotedPrintableCodec)v1).decode(((java.lang.Object)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = "111111X111";
    Object v1 = new org.apache.commons.codec.net.QuotedPrintableCodec(((java.lang.String)v0));
    Object v2 = "MX";
    Object v3 = ((org.apache.commons.codec.net.QuotedPrintableCodec)v1).encode(((java.lang.String)v2));
      org.junit.Assert.fail("Expected org.apache.commons.codec.EncoderException");
    } catch (org.apache.commons.codec.EncoderException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)-17),Byte.valueOf((byte)27)};
    Object v1 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(((byte[])v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = "TIO";
    Object v1 = new org.apache.commons.codec.net.QuotedPrintableCodec(((java.lang.String)v0));
    Object v2 = new byte[]{Byte.valueOf((byte)-14),Byte.valueOf((byte)1),Byte.valueOf((byte)65)};
    Object v3 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(((byte[])v2));
    Object v4 = ((org.apache.commons.codec.net.QuotedPrintableCodec)v1).encode(((java.lang.Object)v3));
    Object v5 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)-29),Byte.valueOf((byte)19)};
    Object v6 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(((byte[])v5));
    Object v7 = ((org.apache.commons.codec.net.QuotedPrintableCodec)v1).encode(((java.lang.Object)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = "TIO";
    Object v1 = new org.apache.commons.codec.net.QuotedPrintableCodec(((java.lang.String)v0));
    Object v2 = "KN";
    Object v3 = "";
    Object v4 = ((org.apache.commons.codec.net.QuotedPrintableCodec)v1).encode(((java.lang.String)v2),((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new org.apache.commons.codec.net.QuotedPrintableCodec();
    Object v1 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)-29),Byte.valueOf((byte)19)};
    Object v2 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(((byte[])v1));
    Object v3 = ((org.apache.commons.codec.net.QuotedPrintableCodec)v0).decode(((java.lang.Object)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new org.apache.commons.codec.net.QuotedPrintableCodec();
    Object v1 = "tou2";
    Object v2 = ((org.apache.commons.codec.net.QuotedPrintableCodec)v0).encode(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("tou2"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = "TIO";
    Object v1 = new org.apache.commons.codec.net.QuotedPrintableCodec(((java.lang.String)v0));
    Object v2 = new byte[]{Byte.valueOf((byte)88)};
    Object v3 = ((org.apache.commons.codec.net.QuotedPrintableCodec)v1).decode(((byte[])v2));
    Object v4 = "encodeInteger called with null parameter";
    Object v5 = ((org.apache.commons.codec.net.QuotedPrintableCodec)v1).decode(((java.lang.String)v4));
      org.junit.Assert.fail("Expected org.apache.commons.codec.DecoderException");
    } catch (org.apache.commons.codec.DecoderException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = "TIO";
    Object v1 = new org.apache.commons.codec.net.QuotedPrintableCodec(((java.lang.String)v0));
    Object v2 = new byte[]{Byte.valueOf((byte)11)};
    Object v3 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(((byte[])v2));
    Object v4 = ((org.apache.commons.codec.net.QuotedPrintableCodec)v1).encode(((java.lang.Object)v3));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = "111111X111";
    Object v1 = new org.apache.commons.codec.net.QuotedPrintableCodec(((java.lang.String)v0));
    Object v2 = "SH";
    Object v3 = ((org.apache.commons.codec.net.QuotedPrintableCodec)v1).encode(((java.lang.String)v2));
      org.junit.Assert.fail("Expected org.apache.commons.codec.EncoderException");
    } catch (org.apache.commons.codec.EncoderException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = new org.apache.commons.codec.net.QuotedPrintableCodec();
    Object v1 = "r`ou2f";
    Object v2 = "ALE";
    Object v3 = ((org.apache.commons.codec.net.QuotedPrintableCodec)v0).encode(((java.lang.String)v1),((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = "111111X111";
    Object v1 = new org.apache.commons.codec.net.QuotedPrintableCodec(((java.lang.String)v0));
    Object v2 = new byte[]{Byte.valueOf((byte)28),Byte.valueOf((byte)24),Byte.valueOf((byte)0)};
    Object v3 = ((org.apache.commons.codec.net.QuotedPrintableCodec)v1).encode(((byte[])v2));
    Object v4 = "rou2f";
    Object v5 = "UTF-8";
    Object v6 = ((org.apache.commons.codec.net.QuotedPrintableCodec)v1).decode(((java.lang.String)v4),((java.lang.String)v5));
    org.junit.Assert.assertEquals((Object)("rou2f"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = "111111X111";
    Object v1 = new org.apache.commons.codec.net.QuotedPrintableCodec(((java.lang.String)v0));
    Object v2 = "h";
    Object v3 = "ES";
    Object v4 = ((org.apache.commons.codec.net.QuotedPrintableCodec)v1).encode(((java.lang.String)v2),((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)20)};
    Object v1 = java.util.BitSet.valueOf(((byte[])v0));
    Object v2 = new byte[]{Byte.valueOf((byte)54),Byte.valueOf((byte)89)};
    Object v3 = org.apache.commons.codec.net.QuotedPrintableCodec.encodeQuotedPrintable(((java.util.BitSet)v1),((byte[])v2));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)20)};
    Object v1 = java.util.BitSet.valueOf(((byte[])v0));
    Object v2 = 31;
    Object v3 = ((java.util.BitSet)v1).previousSetBit((((java.lang.Integer)v2).intValue()));
    Object v4 = new byte[]{Byte.valueOf((byte)0)};
    Object v5 = org.apache.commons.codec.net.QuotedPrintableCodec.encodeQuotedPrintable(((java.util.BitSet)v1),((byte[])v4));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)1)};
    Object v1 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(((byte[])v0));
    org.junit.Assert.assertNotNull(v1);
  }
}
