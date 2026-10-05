package org.apache.commons.codec.binary;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = 3;
    Object v1 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v0).intValue()));
    Object v2 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)85),Byte.valueOf((byte)1)};
    Object v3 = ((org.apache.commons.codec.binary.BaseNCodec)v1).encode(((byte[])v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = 3;
    Object v1 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v0).intValue()));
    Object v2 = 3;
    Object v3 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.codec.binary.BaseNCodec)v1).encode(((java.lang.Object)v3));
      org.junit.Assert.fail("Expected org.apache.commons.codec.EncoderException");
    } catch (org.apache.commons.codec.EncoderException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = 3;
    Object v1 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v0).intValue()));
    Object v2 = "Imp4ossible modulus ";
    Object v3 = ((org.apache.commons.codec.binary.BaseNCodec)v1).decode(((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = 3;
    Object v1 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v0).intValue()));
    Object v2 = new byte[]{};
    Object v3 = ((org.apache.commons.codec.binary.BaseNCodec)v1).decode(((byte[])v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = -6;
    Object v1 = new byte[]{Byte.valueOf((byte)-25),Byte.valueOf((byte)12),Byte.valueOf((byte)-64)};
    Object v2 = false;
    Object v3 = new org.apache.commons.codec.binary.Base32((((java.lang.Integer)v0).intValue()),((byte[])v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new byte[]{Byte.valueOf((byte)2),Byte.valueOf((byte)15)};
    Object v5 = ((org.apache.commons.codec.binary.BaseNCodec)v3).encode(((byte[])v4));
    Object v6 = new byte[]{Byte.valueOf((byte)-2),Byte.valueOf((byte)1),Byte.valueOf((byte)8)};
    Object v7 = 12;
    Object v8 = 0;
    Object v9 = new org.apache.commons.codec.binary.BaseNCodec.Context();
    Object v10 = ((org.apache.commons.codec.binary.BaseNCodec.Context)v9).toString();
    ((org.apache.commons.codec.binary.Base32)v3).decode(((byte[])v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()),((org.apache.commons.codec.binary.BaseNCodec.Context)v9));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = -6;
    Object v1 = new byte[]{Byte.valueOf((byte)-25),Byte.valueOf((byte)12),Byte.valueOf((byte)-64)};
    Object v2 = false;
    Object v3 = new org.apache.commons.codec.binary.Base32((((java.lang.Integer)v0).intValue()),((byte[])v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = Byte.valueOf((byte)1);
    Object v5 = ((org.apache.commons.codec.binary.Base32)v3).isInAlphabet((((java.lang.Byte)v4).byteValue()));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = -6;
    Object v1 = new byte[]{Byte.valueOf((byte)-25),Byte.valueOf((byte)12),Byte.valueOf((byte)-64)};
    Object v2 = false;
    Object v3 = new org.apache.commons.codec.binary.Base32((((java.lang.Integer)v0).intValue()),((byte[])v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new byte[]{};
    Object v5 = 25;
    Object v6 = 0;
    Object v7 = new org.apache.commons.codec.binary.BaseNCodec.Context();
    Object v8 = ((org.apache.commons.codec.binary.BaseNCodec.Context)v7).toString();
    ((org.apache.commons.codec.binary.Base32)v3).decode(((byte[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),((org.apache.commons.codec.binary.BaseNCodec.Context)v7));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = 3;
    Object v1 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v0).intValue()));
    Object v2 = -6;
    Object v3 = new byte[]{Byte.valueOf((byte)-25),Byte.valueOf((byte)12),Byte.valueOf((byte)-64)};
    Object v4 = false;
    Object v5 = new org.apache.commons.codec.binary.Base32((((java.lang.Integer)v2).intValue()),((byte[])v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = Byte.valueOf((byte)1);
    Object v7 = ((org.apache.commons.codec.binary.Base32)v5).isInAlphabet((((java.lang.Byte)v6).byteValue()));
    Object v8 = ((org.apache.commons.codec.binary.BaseNCodec)v1).decode(((java.lang.Object)v7));
      org.junit.Assert.fail("Expected org.apache.commons.codec.DecoderException");
    } catch (org.apache.commons.codec.DecoderException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = 3;
    Object v1 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v0).intValue()));
    Object v2 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)0),Byte.valueOf((byte)29)};
    Object v3 = false;
    Object v4 = ((org.apache.commons.codec.binary.BaseNCodec)v1).isInAlphabet(((byte[])v2),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = -6;
    Object v1 = new byte[]{Byte.valueOf((byte)-25),Byte.valueOf((byte)12),Byte.valueOf((byte)-64)};
    Object v2 = false;
    Object v3 = new org.apache.commons.codec.binary.Base32((((java.lang.Integer)v0).intValue()),((byte[])v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new byte[]{};
    Object v5 = 0;
    Object v6 = 1;
    Object v7 = new org.apache.commons.codec.binary.BaseNCodec.Context();
    ((org.apache.commons.codec.binary.Base32)v3).encode(((byte[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),((org.apache.commons.codec.binary.BaseNCodec.Context)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = 3;
    Object v1 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v0).intValue()));
    Object v2 = new byte[]{};
    Object v3 = ((org.apache.commons.codec.binary.BaseNCodec)v1).encode(((byte[])v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = 3;
    Object v1 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v0).intValue()));
    Object v2 = new byte[]{};
    Object v3 = ((org.apache.commons.codec.binary.BaseNCodec)v1).getEncodedLength(((byte[])v2));
    org.junit.Assert.assertEquals((Object)(0L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = 3;
    Object v1 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v0).intValue()));
    Object v2 = 3;
    Object v3 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v2).intValue()));
    Object v4 = new byte[]{};
    Object v5 = ((org.apache.commons.codec.binary.BaseNCodec)v3).decode(((byte[])v4));
    Object v6 = ((org.apache.commons.codec.binary.BaseNCodec)v1).decode(((java.lang.Object)v5));
    Object v7 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)1),Byte.valueOf((byte)2)};
    Object v8 = ((org.apache.commons.codec.binary.BaseNCodec)v1).getEncodedLength(((byte[])v7));
    org.junit.Assert.assertEquals((Object)(4L), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = 3;
    Object v1 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v0).intValue()));
    Object v2 = new byte[]{Byte.valueOf((byte)7)};
    Object v3 = ((org.apache.commons.codec.binary.BaseNCodec)v1).decode(((byte[])v2));
    Object v4 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)28),Byte.valueOf((byte)0)};
    Object v5 = ((org.apache.commons.codec.binary.BaseNCodec)v1).getEncodedLength(((byte[])v4));
    org.junit.Assert.assertEquals((Object)(4L), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = 3;
    Object v1 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v0).intValue()));
    Object v2 = new byte[]{Byte.valueOf((byte)9),Byte.valueOf((byte)60),Byte.valueOf((byte)19)};
    Object v3 = ((org.apache.commons.codec.binary.BaseNCodec)v1).decode(((byte[])v2));
    Object v4 = "";
    Object v5 = ((org.apache.commons.codec.binary.BaseNCodec)v1).decode(((java.lang.String)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = -6;
    Object v1 = new byte[]{Byte.valueOf((byte)-25),Byte.valueOf((byte)12),Byte.valueOf((byte)-64)};
    Object v2 = false;
    Object v3 = new org.apache.commons.codec.binary.Base32((((java.lang.Integer)v0).intValue()),((byte[])v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = Byte.valueOf((byte)-30);
    Object v5 = ((org.apache.commons.codec.binary.Base32)v3).isInAlphabet((((java.lang.Byte)v4).byteValue()));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = 16;
    Object v1 = new byte[]{Byte.valueOf((byte)-6),Byte.valueOf((byte)1),Byte.valueOf((byte)12)};
    Object v2 = true;
    Object v3 = Byte.valueOf((byte)-11);
    Object v4 = new org.apache.commons.codec.binary.Base32((((java.lang.Integer)v0).intValue()),((byte[])v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Byte)v3).byteValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = 16;
    Object v1 = new byte[]{Byte.valueOf((byte)-6),Byte.valueOf((byte)1),Byte.valueOf((byte)12)};
    Object v2 = true;
    Object v3 = Byte.valueOf((byte)-11);
    Object v4 = new org.apache.commons.codec.binary.Base32((((java.lang.Integer)v0).intValue()),((byte[])v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Byte)v3).byteValue()));
    Object v5 = 3;
    Object v6 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v5).intValue()));
    Object v7 = ((org.apache.commons.codec.binary.BaseNCodec)v4).decode(((java.lang.Object)v6));
      org.junit.Assert.fail("Expected org.apache.commons.codec.DecoderException");
    } catch (org.apache.commons.codec.DecoderException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = 3;
    Object v1 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v0).intValue()));
    Object v2 = new byte[]{Byte.valueOf((byte)28)};
    Object v3 = ((org.apache.commons.codec.binary.BaseNCodec)v1).encodeAsString(((byte[])v2));
    Object v4 = new byte[]{Byte.valueOf((byte)-36)};
    Object v5 = ((org.apache.commons.codec.binary.BaseNCodec)v1).decode(((byte[])v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = 3;
    Object v1 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v0).intValue()));
    Object v2 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)32)};
    Object v3 = ((org.apache.commons.codec.binary.BaseNCodec)v1).decode(((byte[])v2));
    Object v4 = "HmacSHA512";
    Object v5 = ((org.apache.commons.codec.binary.BaseNCodec)v1).isInAlphabet(((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)(true), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = -6;
    Object v1 = new byte[]{Byte.valueOf((byte)-25),Byte.valueOf((byte)12),Byte.valueOf((byte)-64)};
    Object v2 = false;
    Object v3 = new org.apache.commons.codec.binary.Base32((((java.lang.Integer)v0).intValue()),((byte[])v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new byte[]{Byte.valueOf((byte)61),Byte.valueOf((byte)-26),Byte.valueOf((byte)-17)};
    Object v5 = ((org.apache.commons.codec.binary.BaseNCodec)v3).decode(((byte[])v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = 3;
    Object v1 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v0).intValue()));
    Object v2 = new byte[]{Byte.valueOf((byte)13),Byte.valueOf((byte)1),Byte.valueOf((byte)2)};
    Object v3 = false;
    Object v4 = ((org.apache.commons.codec.binary.BaseNCodec)v1).isInAlphabet(((byte[])v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new byte[]{};
    Object v6 = ((org.apache.commons.codec.binary.BaseNCodec)v1).decode(((byte[])v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = 0;
    Object v1 = new byte[]{Byte.valueOf((byte)46),Byte.valueOf((byte)-54),Byte.valueOf((byte)1)};
    Object v2 = true;
    Object v3 = Byte.valueOf((byte)-19);
    Object v4 = new org.apache.commons.codec.binary.Base32((((java.lang.Integer)v0).intValue()),((byte[])v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Byte)v3).byteValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = 16;
    Object v1 = new byte[]{Byte.valueOf((byte)-6),Byte.valueOf((byte)1),Byte.valueOf((byte)12)};
    Object v2 = true;
    Object v3 = Byte.valueOf((byte)-11);
    Object v4 = new org.apache.commons.codec.binary.Base32((((java.lang.Integer)v0).intValue()),((byte[])v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Byte)v3).byteValue()));
    Object v5 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)6),Byte.valueOf((byte)1)};
    Object v6 = ((org.apache.commons.codec.binary.BaseNCodec)v4).decode(((byte[])v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = 3;
    Object v1 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v0).intValue()));
    Object v2 = new byte[]{};
    Object v3 = ((org.apache.commons.codec.binary.BaseNCodec)v1).encode(((byte[])v2));
    Object v4 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)3),Byte.valueOf((byte)62)};
    Object v5 = false;
    Object v6 = ((org.apache.commons.codec.binary.BaseNCodec)v1).isInAlphabet(((byte[])v4),(((java.lang.Boolean)v5).booleanValue()));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = 26;
    Object v1 = new org.apache.commons.codec.binary.Base32((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = 26;
    Object v1 = new org.apache.commons.codec.binary.Base32((((java.lang.Integer)v0).intValue()));
    Object v2 = new byte[]{Byte.valueOf((byte)0)};
    Object v3 = ((org.apache.commons.codec.binary.BaseNCodec)v1).encode(((byte[])v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = 3;
    Object v1 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v0).intValue()));
    Object v2 = 26;
    Object v3 = new org.apache.commons.codec.binary.Base32((((java.lang.Integer)v2).intValue()));
    Object v4 = new byte[]{Byte.valueOf((byte)0)};
    Object v5 = ((org.apache.commons.codec.binary.BaseNCodec)v3).encode(((byte[])v4));
    Object v6 = ((org.apache.commons.codec.binary.BaseNCodec)v1).decode(((java.lang.Object)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = 16;
    Object v1 = new byte[]{Byte.valueOf((byte)-6),Byte.valueOf((byte)1),Byte.valueOf((byte)12)};
    Object v2 = true;
    Object v3 = Byte.valueOf((byte)-11);
    Object v4 = new org.apache.commons.codec.binary.Base32((((java.lang.Integer)v0).intValue()),((byte[])v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Byte)v3).byteValue()));
    Object v5 = Byte.valueOf((byte)-35);
    Object v6 = ((org.apache.commons.codec.binary.Base32)v4).isInAlphabet((((java.lang.Byte)v5).byteValue()));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = 3;
    Object v1 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v0).intValue()));
    Object v2 = new byte[]{Byte.valueOf((byte)2),Byte.valueOf((byte)42)};
    Object v3 = ((org.apache.commons.codec.binary.BaseNCodec)v1).encode(((byte[])v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = 26;
    Object v1 = new org.apache.commons.codec.binary.Base32((((java.lang.Integer)v0).intValue()));
    Object v2 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)-4)};
    Object v3 = ((org.apache.commons.codec.binary.BaseNCodec)v1).encode(((byte[])v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = 3;
    Object v1 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.codec.binary.BaseNCodec.Context();
    Object v3 = ((org.apache.commons.codec.binary.BaseNCodec)v1).decode(((java.lang.Object)v2));
      org.junit.Assert.fail("Expected org.apache.commons.codec.DecoderException");
    } catch (org.apache.commons.codec.DecoderException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = 26;
    Object v1 = new org.apache.commons.codec.binary.Base32((((java.lang.Integer)v0).intValue()));
    Object v2 = new byte[]{Byte.valueOf((byte)27),Byte.valueOf((byte)-23)};
    Object v3 = 0;
    Object v4 = 14;
    Object v5 = new org.apache.commons.codec.binary.BaseNCodec.Context();
    ((org.apache.commons.codec.binary.Base32)v1).encode(((byte[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),((org.apache.commons.codec.binary.BaseNCodec.Context)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = 3;
    Object v1 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v0).intValue()));
    Object v2 = new byte[]{Byte.valueOf((byte)79)};
    Object v3 = false;
    Object v4 = ((org.apache.commons.codec.binary.BaseNCodec)v1).isInAlphabet(((byte[])v2),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = Byte.valueOf((byte)-38);
    Object v1 = new org.apache.commons.codec.binary.Base32((((java.lang.Byte)v0).byteValue()));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = 0;
    Object v1 = new byte[]{Byte.valueOf((byte)46),Byte.valueOf((byte)-54),Byte.valueOf((byte)1)};
    Object v2 = true;
    Object v3 = Byte.valueOf((byte)-19);
    Object v4 = new org.apache.commons.codec.binary.Base32((((java.lang.Integer)v0).intValue()),((byte[])v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Byte)v3).byteValue()));
    Object v5 = new byte[]{};
    Object v6 = true;
    Object v7 = ((org.apache.commons.codec.binary.BaseNCodec)v4).isInAlphabet(((byte[])v5),(((java.lang.Boolean)v6).booleanValue()));
    org.junit.Assert.assertEquals((Object)(true), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = 26;
    Object v1 = new org.apache.commons.codec.binary.Base32((((java.lang.Integer)v0).intValue()));
    Object v2 = new byte[]{Byte.valueOf((byte)-4),Byte.valueOf((byte)61)};
    Object v3 = true;
    Object v4 = ((org.apache.commons.codec.binary.BaseNCodec)v1).isInAlphabet(((byte[])v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new byte[]{};
    Object v6 = 32;
    Object v7 = -25;
    Object v8 = new org.apache.commons.codec.binary.BaseNCodec.Context();
    ((org.apache.commons.codec.binary.Base32)v1).encode(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),((org.apache.commons.codec.binary.BaseNCodec.Context)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = 0;
    Object v1 = new byte[]{Byte.valueOf((byte)46),Byte.valueOf((byte)-54),Byte.valueOf((byte)1)};
    Object v2 = true;
    Object v3 = Byte.valueOf((byte)-19);
    Object v4 = new org.apache.commons.codec.binary.Base32((((java.lang.Integer)v0).intValue()),((byte[])v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Byte)v3).byteValue()));
    Object v5 = new byte[]{Byte.valueOf((byte)-32),Byte.valueOf((byte)1),Byte.valueOf((byte)23)};
    Object v6 = false;
    Object v7 = ((org.apache.commons.codec.binary.BaseNCodec)v4).isInAlphabet(((byte[])v5),(((java.lang.Boolean)v6).booleanValue()));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = 0;
    Object v1 = new byte[]{Byte.valueOf((byte)46),Byte.valueOf((byte)-54),Byte.valueOf((byte)1)};
    Object v2 = true;
    Object v3 = Byte.valueOf((byte)-19);
    Object v4 = new org.apache.commons.codec.binary.Base32((((java.lang.Integer)v0).intValue()),((byte[])v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Byte)v3).byteValue()));
    Object v5 = Byte.valueOf((byte)0);
    Object v6 = ((org.apache.commons.codec.binary.Base32)v4).isInAlphabet((((java.lang.Byte)v5).byteValue()));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = Byte.valueOf((byte)-38);
    Object v1 = new org.apache.commons.codec.binary.Base32((((java.lang.Byte)v0).byteValue()));
    Object v2 = "TIA";
    Object v3 = ((org.apache.commons.codec.binary.BaseNCodec)v1).decode(((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = 0;
    Object v1 = new byte[]{Byte.valueOf((byte)14),Byte.valueOf((byte)-36)};
    Object v2 = false;
    Object v3 = new org.apache.commons.codec.binary.Base32((((java.lang.Integer)v0).intValue()),((byte[])v1),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new org.apache.commons.codec.binary.Base32();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = 0;
    Object v1 = new byte[]{Byte.valueOf((byte)46),Byte.valueOf((byte)-54),Byte.valueOf((byte)1)};
    Object v2 = true;
    Object v3 = Byte.valueOf((byte)-19);
    Object v4 = new org.apache.commons.codec.binary.Base32((((java.lang.Integer)v0).intValue()),((byte[])v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Byte)v3).byteValue()));
    Object v5 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)111)};
    Object v6 = ((org.apache.commons.codec.binary.BaseNCodec)v4).getEncodedLength(((byte[])v5));
    org.junit.Assert.assertEquals((Object)(8L), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = 26;
    Object v1 = new org.apache.commons.codec.binary.Base32((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.codec.binary.Base32();
    Object v3 = ((org.apache.commons.codec.binary.BaseNCodec)v1).decode(((java.lang.Object)v2));
      org.junit.Assert.fail("Expected org.apache.commons.codec.DecoderException");
    } catch (org.apache.commons.codec.DecoderException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = 26;
    Object v1 = new org.apache.commons.codec.binary.Base32((((java.lang.Integer)v0).intValue()));
    Object v2 = new byte[]{Byte.valueOf((byte)4),Byte.valueOf((byte)0),Byte.valueOf((byte)0)};
    Object v3 = 0;
    Object v4 = -16;
    Object v5 = new org.apache.commons.codec.binary.BaseNCodec.Context();
    ((org.apache.commons.codec.binary.Base32)v1).decode(((byte[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),((org.apache.commons.codec.binary.BaseNCodec.Context)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = 16;
    Object v1 = new byte[]{Byte.valueOf((byte)-6),Byte.valueOf((byte)1),Byte.valueOf((byte)12)};
    Object v2 = true;
    Object v3 = Byte.valueOf((byte)-11);
    Object v4 = new org.apache.commons.codec.binary.Base32((((java.lang.Integer)v0).intValue()),((byte[])v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Byte)v3).byteValue()));
    Object v5 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)42)};
    Object v6 = ((org.apache.commons.codec.binary.BaseNCodec)v4).decode(((byte[])v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = 3;
    Object v1 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v0).intValue()));
    Object v2 = new byte[]{Byte.valueOf((byte)-1)};
    Object v3 = ((org.apache.commons.codec.binary.BaseNCodec)v1).encode(((byte[])v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = Byte.valueOf((byte)-38);
    Object v1 = new org.apache.commons.codec.binary.Base32((((java.lang.Byte)v0).byteValue()));
    Object v2 = new byte[]{};
    Object v3 = ((org.apache.commons.codec.binary.BaseNCodec)v1).getEncodedLength(((byte[])v2));
    org.junit.Assert.assertEquals((Object)(0L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = 0;
    Object v1 = new byte[]{Byte.valueOf((byte)14),Byte.valueOf((byte)-36)};
    Object v2 = false;
    Object v3 = new org.apache.commons.codec.binary.Base32((((java.lang.Integer)v0).intValue()),((byte[])v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)-1),Byte.valueOf((byte)-10)};
    Object v5 = ((org.apache.commons.codec.binary.BaseNCodec)v3).decode(((byte[])v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = new byte[]{Byte.valueOf((byte)14),Byte.valueOf((byte)-36)};
    Object v2 = false;
    Object v3 = new org.apache.commons.codec.binary.Base32((((java.lang.Integer)v0).intValue()),((byte[])v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new byte[]{};
    Object v5 = 45;
    Object v6 = 54;
    Object v7 = new org.apache.commons.codec.binary.BaseNCodec.Context();
    Object v8 = ((org.apache.commons.codec.binary.BaseNCodec.Context)v7).toString();
    ((org.apache.commons.codec.binary.Base32)v3).encode(((byte[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),((org.apache.commons.codec.binary.BaseNCodec.Context)v7));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = 3;
    Object v1 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v0).intValue()));
    Object v2 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)-7)};
    Object v3 = ((org.apache.commons.codec.binary.BaseNCodec)v1).encode(((byte[])v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = 26;
    Object v1 = new org.apache.commons.codec.binary.Base32((((java.lang.Integer)v0).intValue()));
    Object v2 = Byte.valueOf((byte)0);
    Object v3 = ((org.apache.commons.codec.binary.Base32)v1).isInAlphabet((((java.lang.Byte)v2).byteValue()));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new org.apache.commons.codec.binary.Base32();
    Object v1 = new byte[]{};
    Object v2 = ((org.apache.commons.codec.binary.BaseNCodec)v0).decode(((byte[])v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new org.apache.commons.codec.binary.Base32();
    Object v1 = new byte[]{Byte.valueOf((byte)-27),Byte.valueOf((byte)2)};
    Object v2 = true;
    Object v3 = ((org.apache.commons.codec.binary.BaseNCodec)v0).isInAlphabet(((byte[])v1),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = 2;
    Object v1 = new byte[]{Byte.valueOf((byte)55),Byte.valueOf((byte)0)};
    Object v2 = new org.apache.commons.codec.binary.Base32((((java.lang.Integer)v0).intValue()),((byte[])v1));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new org.apache.commons.codec.binary.Base32();
    Object v1 = new byte[]{Byte.valueOf((byte)-8),Byte.valueOf((byte)0),Byte.valueOf((byte)104)};
    Object v2 = ((org.apache.commons.codec.binary.BaseNCodec)v0).encodeAsString(((byte[])v1));
    Object v3 = Byte.valueOf((byte)0);
    Object v4 = ((org.apache.commons.codec.binary.Base32)v0).isInAlphabet((((java.lang.Byte)v3).byteValue()));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = new org.apache.commons.codec.binary.Base32();
    Object v1 = new org.apache.commons.codec.binary.BaseNCodec.Context();
    Object v2 = ((org.apache.commons.codec.binary.BaseNCodec)v0).decode(((java.lang.Object)v1));
      org.junit.Assert.fail("Expected org.apache.commons.codec.DecoderException");
    } catch (org.apache.commons.codec.DecoderException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = 0;
    Object v1 = new byte[]{Byte.valueOf((byte)14),Byte.valueOf((byte)-36)};
    Object v2 = false;
    Object v3 = new org.apache.commons.codec.binary.Base32((((java.lang.Integer)v0).intValue()),((byte[])v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new byte[]{Byte.valueOf((byte)-36),Byte.valueOf((byte)0),Byte.valueOf((byte)-6)};
    Object v5 = 1;
    Object v6 = 0;
    Object v7 = new org.apache.commons.codec.binary.BaseNCodec.Context();
    ((org.apache.commons.codec.binary.Base32)v3).decode(((byte[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),((org.apache.commons.codec.binary.BaseNCodec.Context)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = new org.apache.commons.codec.binary.Base32();
    Object v1 = 3;
    Object v2 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v1).intValue()));
    Object v3 = new byte[]{Byte.valueOf((byte)7)};
    Object v4 = ((org.apache.commons.codec.binary.BaseNCodec)v2).decode(((byte[])v3));
    Object v5 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)28),Byte.valueOf((byte)0)};
    Object v6 = ((org.apache.commons.codec.binary.BaseNCodec)v2).getEncodedLength(((byte[])v5));
    Object v7 = ((org.apache.commons.codec.binary.BaseNCodec)v0).encode(((java.lang.Object)v6));
      org.junit.Assert.fail("Expected org.apache.commons.codec.EncoderException");
    } catch (org.apache.commons.codec.EncoderException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = new byte[]{Byte.valueOf((byte)14),Byte.valueOf((byte)-36)};
    Object v2 = false;
    Object v3 = new org.apache.commons.codec.binary.Base32((((java.lang.Integer)v0).intValue()),((byte[])v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new org.apache.commons.codec.binary.Base32();
    Object v5 = new byte[]{Byte.valueOf((byte)-8),Byte.valueOf((byte)0),Byte.valueOf((byte)104)};
    Object v6 = ((org.apache.commons.codec.binary.BaseNCodec)v4).encodeAsString(((byte[])v5));
    Object v7 = Byte.valueOf((byte)0);
    Object v8 = ((org.apache.commons.codec.binary.Base32)v4).isInAlphabet((((java.lang.Byte)v7).byteValue()));
    Object v9 = ((org.apache.commons.codec.binary.BaseNCodec)v3).decode(((java.lang.Object)v8));
      org.junit.Assert.fail("Expected org.apache.commons.codec.DecoderException");
    } catch (org.apache.commons.codec.DecoderException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = Byte.valueOf((byte)-38);
    Object v1 = new org.apache.commons.codec.binary.Base32((((java.lang.Byte)v0).byteValue()));
    Object v2 = new byte[]{};
    Object v3 = ((org.apache.commons.codec.binary.BaseNCodec)v1).decode(((byte[])v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = 0;
    Object v1 = new byte[]{Byte.valueOf((byte)14),Byte.valueOf((byte)-36)};
    Object v2 = false;
    Object v3 = new org.apache.commons.codec.binary.Base32((((java.lang.Integer)v0).intValue()),((byte[])v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = Byte.valueOf((byte)-38);
    Object v5 = new org.apache.commons.codec.binary.Base32((((java.lang.Byte)v4).byteValue()));
    Object v6 = new byte[]{};
    Object v7 = ((org.apache.commons.codec.binary.BaseNCodec)v5).decode(((byte[])v6));
    Object v8 = ((org.apache.commons.codec.binary.BaseNCodec)v3).encode(((java.lang.Object)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = 0;
    Object v1 = new byte[]{Byte.valueOf((byte)46),Byte.valueOf((byte)-54),Byte.valueOf((byte)1)};
    Object v2 = true;
    Object v3 = Byte.valueOf((byte)-19);
    Object v4 = new org.apache.commons.codec.binary.Base32((((java.lang.Integer)v0).intValue()),((byte[])v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Byte)v3).byteValue()));
    Object v5 = Byte.valueOf((byte)-38);
    Object v6 = new org.apache.commons.codec.binary.Base32((((java.lang.Byte)v5).byteValue()));
    Object v7 = "TIA";
    Object v8 = ((org.apache.commons.codec.binary.BaseNCodec)v6).decode(((java.lang.String)v7));
    Object v9 = ((org.apache.commons.codec.binary.BaseNCodec)v4).decode(((java.lang.Object)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = -16;
    Object v1 = new byte[]{Byte.valueOf((byte)13)};
    Object v2 = new org.apache.commons.codec.binary.Base32((((java.lang.Integer)v0).intValue()),((byte[])v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = 3;
    Object v1 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.codec.binary.BaseNCodec.Context();
    Object v3 = ((org.apache.commons.codec.binary.BaseNCodec)v1).encode(((java.lang.Object)v2));
      org.junit.Assert.fail("Expected org.apache.commons.codec.EncoderException");
    } catch (org.apache.commons.codec.EncoderException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = -16;
    Object v1 = new byte[]{Byte.valueOf((byte)13)};
    Object v2 = new org.apache.commons.codec.binary.Base32((((java.lang.Integer)v0).intValue()),((byte[])v1));
    Object v3 = new org.apache.commons.codec.binary.BaseNCodec.Context();
    Object v4 = ((org.apache.commons.codec.binary.BaseNCodec)v2).encode(((java.lang.Object)v3));
      org.junit.Assert.fail("Expected org.apache.commons.codec.EncoderException");
    } catch (org.apache.commons.codec.EncoderException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = Byte.valueOf((byte)-38);
    Object v1 = new org.apache.commons.codec.binary.Base32((((java.lang.Byte)v0).byteValue()));
    Object v2 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)0)};
    Object v3 = ((org.apache.commons.codec.binary.BaseNCodec)v1).decode(((byte[])v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = Byte.valueOf((byte)-38);
    Object v1 = new org.apache.commons.codec.binary.Base32((((java.lang.Byte)v0).byteValue()));
    Object v2 = new byte[]{Byte.valueOf((byte)3),Byte.valueOf((byte)-10)};
    Object v3 = ((org.apache.commons.codec.binary.BaseNCodec)v1).encode(((byte[])v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = Byte.valueOf((byte)-38);
    Object v1 = new org.apache.commons.codec.binary.Base32((((java.lang.Byte)v0).byteValue()));
    Object v2 = new byte[]{};
    Object v3 = 34;
    Object v4 = 26;
    Object v5 = new org.apache.commons.codec.binary.BaseNCodec.Context();
    Object v6 = ((org.apache.commons.codec.binary.BaseNCodec.Context)v5).toString();
    ((org.apache.commons.codec.binary.Base32)v1).encode(((byte[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),((org.apache.commons.codec.binary.BaseNCodec.Context)v5));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = Byte.valueOf((byte)-38);
    Object v1 = new org.apache.commons.codec.binary.Base32((((java.lang.Byte)v0).byteValue()));
    Object v2 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)1)};
    Object v3 = true;
    Object v4 = ((org.apache.commons.codec.binary.BaseNCodec)v1).isInAlphabet(((byte[])v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = "de l";
    Object v6 = ((org.apache.commons.codec.binary.BaseNCodec)v1).isInAlphabet(((java.lang.String)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = -16;
    Object v1 = new byte[]{Byte.valueOf((byte)13)};
    Object v2 = new org.apache.commons.codec.binary.Base32((((java.lang.Integer)v0).intValue()),((byte[])v1));
    Object v3 = Byte.valueOf((byte)50);
    Object v4 = ((org.apache.commons.codec.binary.Base32)v2).isInAlphabet((((java.lang.Byte)v3).byteValue()));
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = 16;
    Object v1 = new byte[]{Byte.valueOf((byte)-6),Byte.valueOf((byte)1),Byte.valueOf((byte)12)};
    Object v2 = true;
    Object v3 = Byte.valueOf((byte)-11);
    Object v4 = new org.apache.commons.codec.binary.Base32((((java.lang.Integer)v0).intValue()),((byte[])v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Byte)v3).byteValue()));
    Object v5 = 0;
    Object v6 = new byte[]{Byte.valueOf((byte)46),Byte.valueOf((byte)-54),Byte.valueOf((byte)1)};
    Object v7 = true;
    Object v8 = Byte.valueOf((byte)-19);
    Object v9 = new org.apache.commons.codec.binary.Base32((((java.lang.Integer)v5).intValue()),((byte[])v6),(((java.lang.Boolean)v7).booleanValue()),(((java.lang.Byte)v8).byteValue()));
    Object v10 = ((org.apache.commons.codec.binary.BaseNCodec)v4).encode(((java.lang.Object)v9));
      org.junit.Assert.fail("Expected org.apache.commons.codec.EncoderException");
    } catch (org.apache.commons.codec.EncoderException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = -16;
    Object v1 = new byte[]{Byte.valueOf((byte)13)};
    Object v2 = new org.apache.commons.codec.binary.Base32((((java.lang.Integer)v0).intValue()),((byte[])v1));
    Object v3 = 0;
    Object v4 = new byte[]{Byte.valueOf((byte)46),Byte.valueOf((byte)-54),Byte.valueOf((byte)1)};
    Object v5 = true;
    Object v6 = Byte.valueOf((byte)-19);
    Object v7 = new org.apache.commons.codec.binary.Base32((((java.lang.Integer)v3).intValue()),((byte[])v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Byte)v6).byteValue()));
    Object v8 = new byte[]{};
    Object v9 = true;
    Object v10 = ((org.apache.commons.codec.binary.BaseNCodec)v7).isInAlphabet(((byte[])v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = ((org.apache.commons.codec.binary.BaseNCodec)v2).decode(((java.lang.Object)v10));
      org.junit.Assert.fail("Expected org.apache.commons.codec.DecoderException");
    } catch (org.apache.commons.codec.DecoderException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new org.apache.commons.codec.binary.Base32();
    Object v1 = Byte.valueOf((byte)1);
    Object v2 = ((org.apache.commons.codec.binary.Base32)v0).isInAlphabet((((java.lang.Byte)v1).byteValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = 26;
    Object v1 = new org.apache.commons.codec.binary.Base32((((java.lang.Integer)v0).intValue()));
    Object v2 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)0)};
    Object v3 = ((org.apache.commons.codec.binary.BaseNCodec)v1).encode(((byte[])v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = false;
    Object v1 = new org.apache.commons.codec.binary.Base32((((java.lang.Boolean)v0).booleanValue()));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = false;
    Object v1 = new org.apache.commons.codec.binary.Base32((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = new byte[]{Byte.valueOf((byte)64),Byte.valueOf((byte)31),Byte.valueOf((byte)1)};
    Object v3 = ((org.apache.commons.codec.binary.BaseNCodec)v1).encodeAsString(((byte[])v2));
    org.junit.Assert.assertEquals((Object)("IAPQC==="), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = -16;
    Object v1 = new byte[]{Byte.valueOf((byte)13)};
    Object v2 = new org.apache.commons.codec.binary.Base32((((java.lang.Integer)v0).intValue()),((byte[])v1));
    Object v3 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)-11)};
    Object v4 = ((org.apache.commons.codec.binary.BaseNCodec)v2).getEncodedLength(((byte[])v3));
    org.junit.Assert.assertEquals((Object)(8L), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = false;
    Object v1 = new org.apache.commons.codec.binary.Base32((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = new byte[]{Byte.valueOf((byte)5),Byte.valueOf((byte)97),Byte.valueOf((byte)0)};
    Object v3 = ((org.apache.commons.codec.binary.BaseNCodec)v1).encode(((byte[])v2));
    Object v4 = new byte[]{};
    Object v5 = ((org.apache.commons.codec.binary.BaseNCodec)v1).encodeToString(((byte[])v4));
    org.junit.Assert.assertEquals((Object)(""), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = false;
    Object v1 = Byte.valueOf((byte)6);
    Object v2 = new org.apache.commons.codec.binary.Base32((((java.lang.Boolean)v0).booleanValue()),(((java.lang.Byte)v1).byteValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = -16;
    Object v1 = new byte[]{Byte.valueOf((byte)13)};
    Object v2 = new org.apache.commons.codec.binary.Base32((((java.lang.Integer)v0).intValue()),((byte[])v1));
    Object v3 = "UTF-v";
    Object v4 = ((org.apache.commons.codec.binary.BaseNCodec)v2).isInAlphabet(((java.lang.String)v3));
    Object v5 = new byte[]{Byte.valueOf((byte)-4),Byte.valueOf((byte)53)};
    Object v6 = ((org.apache.commons.codec.binary.BaseNCodec)v2).encodeToString(((byte[])v5));
    org.junit.Assert.assertEquals((Object)("7Q2Q===="), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = false;
    Object v1 = new org.apache.commons.codec.binary.Base32((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = new byte[]{Byte.valueOf((byte)-43)};
    Object v3 = true;
    Object v4 = ((org.apache.commons.codec.binary.BaseNCodec)v1).isInAlphabet(((byte[])v2),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = 0;
    Object v1 = new byte[]{Byte.valueOf((byte)46),Byte.valueOf((byte)-54),Byte.valueOf((byte)1)};
    Object v2 = true;
    Object v3 = Byte.valueOf((byte)-19);
    Object v4 = new org.apache.commons.codec.binary.Base32((((java.lang.Integer)v0).intValue()),((byte[])v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Byte)v3).byteValue()));
    Object v5 = 3;
    Object v6 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v5).intValue()));
    Object v7 = new byte[]{Byte.valueOf((byte)13),Byte.valueOf((byte)1),Byte.valueOf((byte)2)};
    Object v8 = false;
    Object v9 = ((org.apache.commons.codec.binary.BaseNCodec)v6).isInAlphabet(((byte[])v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new byte[]{};
    Object v11 = ((org.apache.commons.codec.binary.BaseNCodec)v6).decode(((byte[])v10));
    Object v12 = ((org.apache.commons.codec.binary.BaseNCodec)v4).decode(((java.lang.Object)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = Byte.valueOf((byte)-38);
    Object v1 = new org.apache.commons.codec.binary.Base32((((java.lang.Byte)v0).byteValue()));
    Object v2 = new byte[]{Byte.valueOf((byte)26),Byte.valueOf((byte)1)};
    Object v3 = ((org.apache.commons.codec.binary.BaseNCodec)v1).decode(((byte[])v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = -16;
    Object v1 = new byte[]{Byte.valueOf((byte)13)};
    Object v2 = new org.apache.commons.codec.binary.Base32((((java.lang.Integer)v0).intValue()),((byte[])v1));
    Object v3 = new byte[]{Byte.valueOf((byte)-30),Byte.valueOf((byte)0)};
    Object v4 = ((org.apache.commons.codec.binary.BaseNCodec)v2).encodeToString(((byte[])v3));
    Object v5 = Byte.valueOf((byte)2);
    Object v6 = ((org.apache.commons.codec.binary.Base32)v2).isInAlphabet((((java.lang.Byte)v5).byteValue()));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = 36;
    Object v1 = new byte[]{};
    Object v2 = false;
    Object v3 = Byte.valueOf((byte)0);
    Object v4 = new org.apache.commons.codec.binary.Base32((((java.lang.Integer)v0).intValue()),((byte[])v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Byte)v3).byteValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = false;
    Object v1 = Byte.valueOf((byte)6);
    Object v2 = new org.apache.commons.codec.binary.Base32((((java.lang.Boolean)v0).booleanValue()),(((java.lang.Byte)v1).byteValue()));
    Object v3 = "tch";
    Object v4 = ((org.apache.commons.codec.binary.BaseNCodec)v2).decode(((java.lang.String)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = false;
    Object v1 = new org.apache.commons.codec.binary.Base32((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = Byte.valueOf((byte)-1);
    Object v3 = ((org.apache.commons.codec.binary.Base32)v1).isInAlphabet((((java.lang.Byte)v2).byteValue()));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = 36;
    Object v1 = new byte[]{};
    Object v2 = false;
    Object v3 = Byte.valueOf((byte)0);
    Object v4 = new org.apache.commons.codec.binary.Base32((((java.lang.Integer)v0).intValue()),((byte[])v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Byte)v3).byteValue()));
    Object v5 = Byte.valueOf((byte)0);
    Object v6 = ((org.apache.commons.codec.binary.Base32)v4).isInAlphabet((((java.lang.Byte)v5).byteValue()));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = Byte.valueOf((byte)-38);
    Object v1 = new org.apache.commons.codec.binary.Base32((((java.lang.Byte)v0).byteValue()));
    Object v2 = new byte[]{Byte.valueOf((byte)-1)};
    Object v3 = ((org.apache.commons.codec.binary.BaseNCodec)v1).getEncodedLength(((byte[])v2));
    org.junit.Assert.assertEquals((Object)(8L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = 26;
    Object v1 = new org.apache.commons.codec.binary.Base32((((java.lang.Integer)v0).intValue()));
    Object v2 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)-8)};
    Object v3 = ((org.apache.commons.codec.binary.BaseNCodec)v1).encode(((byte[])v2));
    Object v4 = 16;
    Object v5 = new byte[]{Byte.valueOf((byte)-6),Byte.valueOf((byte)1),Byte.valueOf((byte)12)};
    Object v6 = true;
    Object v7 = Byte.valueOf((byte)-11);
    Object v8 = new org.apache.commons.codec.binary.Base32((((java.lang.Integer)v4).intValue()),((byte[])v5),(((java.lang.Boolean)v6).booleanValue()),(((java.lang.Byte)v7).byteValue()));
    Object v9 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)6),Byte.valueOf((byte)1)};
    Object v10 = ((org.apache.commons.codec.binary.BaseNCodec)v8).decode(((byte[])v9));
    Object v11 = ((org.apache.commons.codec.binary.BaseNCodec)v1).decode(((java.lang.Object)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = -16;
    Object v1 = new byte[]{Byte.valueOf((byte)13)};
    Object v2 = new org.apache.commons.codec.binary.Base32((((java.lang.Integer)v0).intValue()),((byte[])v1));
    Object v3 = 26;
    Object v4 = new org.apache.commons.codec.binary.Base32((((java.lang.Integer)v3).intValue()));
    Object v5 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)0)};
    Object v6 = ((org.apache.commons.codec.binary.BaseNCodec)v4).encode(((byte[])v5));
    Object v7 = ((org.apache.commons.codec.binary.BaseNCodec)v2).encode(((java.lang.Object)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = 3;
    Object v1 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v0).intValue()));
    Object v2 = 3;
    Object v3 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v2).intValue()));
    Object v4 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)0),Byte.valueOf((byte)29)};
    Object v5 = false;
    Object v6 = ((org.apache.commons.codec.binary.BaseNCodec)v3).isInAlphabet(((byte[])v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((org.apache.commons.codec.binary.BaseNCodec)v1).encode(((java.lang.Object)v6));
      org.junit.Assert.fail("Expected org.apache.commons.codec.EncoderException");
    } catch (org.apache.commons.codec.EncoderException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = Byte.valueOf((byte)-38);
    Object v1 = new org.apache.commons.codec.binary.Base32((((java.lang.Byte)v0).byteValue()));
    Object v2 = -16;
    Object v3 = new byte[]{Byte.valueOf((byte)13)};
    Object v4 = new org.apache.commons.codec.binary.Base32((((java.lang.Integer)v2).intValue()),((byte[])v3));
    Object v5 = Byte.valueOf((byte)50);
    Object v6 = ((org.apache.commons.codec.binary.Base32)v4).isInAlphabet((((java.lang.Byte)v5).byteValue()));
    Object v7 = ((org.apache.commons.codec.binary.BaseNCodec)v1).encode(((java.lang.Object)v6));
      org.junit.Assert.fail("Expected org.apache.commons.codec.EncoderException");
    } catch (org.apache.commons.codec.EncoderException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = false;
    Object v1 = Byte.valueOf((byte)6);
    Object v2 = new org.apache.commons.codec.binary.Base32((((java.lang.Boolean)v0).booleanValue()),(((java.lang.Byte)v1).byteValue()));
    Object v3 = Byte.valueOf((byte)0);
    Object v4 = ((org.apache.commons.codec.binary.Base32)v2).isInAlphabet((((java.lang.Byte)v3).byteValue()));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = new byte[]{Byte.valueOf((byte)46),Byte.valueOf((byte)-54),Byte.valueOf((byte)1)};
    Object v2 = true;
    Object v3 = Byte.valueOf((byte)-19);
    Object v4 = new org.apache.commons.codec.binary.Base32((((java.lang.Integer)v0).intValue()),((byte[])v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Byte)v3).byteValue()));
    Object v5 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)-40),Byte.valueOf((byte)0)};
    Object v6 = 9;
    Object v7 = 1;
    Object v8 = new org.apache.commons.codec.binary.BaseNCodec.Context();
    Object v9 = ((org.apache.commons.codec.binary.BaseNCodec.Context)v8).toString();
    ((org.apache.commons.codec.binary.Base32)v4).decode(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),((org.apache.commons.codec.binary.BaseNCodec.Context)v8));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = 36;
    Object v1 = new byte[]{};
    Object v2 = false;
    Object v3 = Byte.valueOf((byte)0);
    Object v4 = new org.apache.commons.codec.binary.Base32((((java.lang.Integer)v0).intValue()),((byte[])v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Byte)v3).byteValue()));
    Object v5 = Byte.valueOf((byte)1);
    Object v6 = ((org.apache.commons.codec.binary.Base32)v4).isInAlphabet((((java.lang.Byte)v5).byteValue()));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = 0;
    Object v1 = new byte[]{Byte.valueOf((byte)46),Byte.valueOf((byte)-54),Byte.valueOf((byte)1)};
    Object v2 = true;
    Object v3 = Byte.valueOf((byte)-19);
    Object v4 = new org.apache.commons.codec.binary.Base32((((java.lang.Integer)v0).intValue()),((byte[])v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Byte)v3).byteValue()));
    Object v5 = 3;
    Object v6 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v5).intValue()));
    Object v7 = new byte[]{};
    Object v8 = ((org.apache.commons.codec.binary.BaseNCodec)v6).decode(((byte[])v7));
    Object v9 = ((org.apache.commons.codec.binary.BaseNCodec)v4).decode(((java.lang.Object)v8));
    Object v10 = new byte[]{Byte.valueOf((byte)1)};
    Object v11 = ((org.apache.commons.codec.binary.BaseNCodec)v4).decode(((byte[])v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = false;
    Object v1 = new org.apache.commons.codec.binary.Base32((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = new byte[]{};
    Object v3 = true;
    Object v4 = ((org.apache.commons.codec.binary.BaseNCodec)v1).isInAlphabet(((byte[])v2),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = true;
    Object v1 = new org.apache.commons.codec.binary.Base32((((java.lang.Boolean)v0).booleanValue()));
    org.junit.Assert.assertNotNull(v1);
  }
}
