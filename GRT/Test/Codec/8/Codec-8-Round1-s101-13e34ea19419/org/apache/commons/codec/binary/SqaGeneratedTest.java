package org.apache.commons.codec.binary;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new org.apache.commons.codec.binary.Base64();
    Object v1 = ((org.apache.commons.codec.binary.Base64)v0).hasData();
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = Byte.valueOf((byte)16);
    Object v1 = org.apache.commons.codec.binary.Base64.isBase64((((java.lang.Byte)v0).byteValue()));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = 0;
    Object v1 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)-37)};
    Object v2 = true;
    Object v3 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v0).intValue()),((byte[])v1),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new org.apache.commons.codec.binary.Base64();
    Object v1 = new byte[]{Byte.valueOf((byte)-14),Byte.valueOf((byte)0)};
    Object v2 = ((org.apache.commons.codec.binary.Base64)v0).encode(((byte[])v1));
    Object v3 = new byte[]{Byte.valueOf((byte)16),Byte.valueOf((byte)16),Byte.valueOf((byte)-25)};
    Object v4 = ((org.apache.commons.codec.binary.Base64)v0).encode(((byte[])v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)-37)};
    Object v2 = true;
    Object v3 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v0).intValue()),((byte[])v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new byte[]{Byte.valueOf((byte)1)};
    Object v5 = 1;
    Object v6 = 14;
    ((org.apache.commons.codec.binary.Base64)v3).decode(((byte[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = true;
    Object v2 = true;
    Object v3 = -17;
    Object v4 = org.apache.commons.codec.binary.Base64.encodeBase64(((byte[])v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new org.apache.commons.codec.binary.Base64();
    Object v1 = new byte[]{Byte.valueOf((byte)18),Byte.valueOf((byte)1)};
    Object v2 = -56;
    Object v3 = -36;
    ((org.apache.commons.codec.binary.Base64)v0).decode(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)-37)};
    Object v2 = true;
    Object v3 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v0).intValue()),((byte[])v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)2),Byte.valueOf((byte)4)};
    Object v5 = ((org.apache.commons.codec.binary.Base64)v3).encode(((byte[])v4));
    Object v6 = 0;
    Object v7 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)-37)};
    Object v8 = true;
    Object v9 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v6).intValue()),((byte[])v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = ((org.apache.commons.codec.binary.Base64)v3).encode(((java.lang.Object)v9));
      org.junit.Assert.fail("Expected org.apache.commons.codec.EncoderException");
    } catch (org.apache.commons.codec.EncoderException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)12),Byte.valueOf((byte)0),Byte.valueOf((byte)1)};
    Object v1 = org.apache.commons.codec.binary.Base64.discardWhitespace(((byte[])v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = 0;
    Object v1 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)-37)};
    Object v2 = true;
    Object v3 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v0).intValue()),((byte[])v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)0),Byte.valueOf((byte)1)};
    Object v5 = ((org.apache.commons.codec.binary.Base64)v3).decode(((byte[])v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)15),Byte.valueOf((byte)0)};
    Object v1 = org.apache.commons.codec.binary.Base64.encodeBase64String(((byte[])v0));
    org.junit.Assert.assertEquals((Object)("DwA="), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = 0;
    Object v1 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)-37)};
    Object v2 = true;
    Object v3 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v0).intValue()),((byte[])v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)30),Byte.valueOf((byte)0)};
    Object v5 = ((org.apache.commons.codec.binary.Base64)v3).encode(((byte[])v4));
    Object v6 = new byte[]{Byte.valueOf((byte)-1)};
    Object v7 = ((org.apache.commons.codec.binary.Base64)v3).decode(((byte[])v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = 0;
    Object v1 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)-37)};
    Object v2 = true;
    Object v3 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v0).intValue()),((byte[])v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "UTF-8";
    Object v5 = ((org.apache.commons.codec.binary.Base64)v3).decode(((java.lang.String)v4));
    Object v6 = ((org.apache.commons.codec.binary.Base64)v3).isUrlSafe();
    org.junit.Assert.assertEquals((Object)(true), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)-37)};
    Object v2 = true;
    Object v3 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v0).intValue()),((byte[])v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new byte[]{Byte.valueOf((byte)15),Byte.valueOf((byte)0)};
    Object v5 = org.apache.commons.codec.binary.Base64.encodeBase64String(((byte[])v4));
    Object v6 = ((org.apache.commons.codec.binary.Base64)v3).encode(((java.lang.Object)v5));
      org.junit.Assert.fail("Expected org.apache.commons.codec.EncoderException");
    } catch (org.apache.commons.codec.EncoderException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)12)};
    Object v1 = true;
    Object v2 = false;
    Object v3 = 1;
    Object v4 = org.apache.commons.codec.binary.Base64.encodeBase64(((byte[])v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = 0;
    Object v1 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)-37)};
    Object v2 = true;
    Object v3 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v0).intValue()),((byte[])v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ")";
    Object v5 = ((org.apache.commons.codec.binary.Base64)v3).decode(((java.lang.String)v4));
    Object v6 = ((org.apache.commons.codec.binary.Base64)v3).hasData();
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new org.apache.commons.codec.binary.Base64();
    Object v1 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)2)};
    Object v2 = 4;
    Object v3 = 64;
    Object v4 = ((org.apache.commons.codec.binary.Base64)v0).readResults(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertEquals((Object)(0), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)48)};
    Object v1 = org.apache.commons.codec.binary.Base64.discardWhitespace(((byte[])v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new org.apache.commons.codec.binary.Base64();
    Object v1 = ((org.apache.commons.codec.binary.Base64)v0).isUrlSafe();
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = 0;
    Object v1 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)-37)};
    Object v2 = true;
    Object v3 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v0).intValue()),((byte[])v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)48)};
    Object v5 = org.apache.commons.codec.binary.Base64.discardWhitespace(((byte[])v4));
    Object v6 = ((org.apache.commons.codec.binary.Base64)v3).decode(((java.lang.Object)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = 107;
    Object v1 = new byte[]{Byte.valueOf((byte)55),Byte.valueOf((byte)29)};
    Object v2 = false;
    Object v3 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v0).intValue()),((byte[])v1),(((java.lang.Boolean)v2).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = 0;
    Object v1 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)-37)};
    Object v2 = true;
    Object v3 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v0).intValue()),((byte[])v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new byte[]{};
    Object v5 = ((org.apache.commons.codec.binary.Base64)v3).encodeToString(((byte[])v4));
    Object v6 = ((org.apache.commons.codec.binary.Base64)v3).hasData();
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = -6;
    Object v1 = new byte[]{};
    Object v2 = false;
    Object v3 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v0).intValue()),((byte[])v1),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = Byte.valueOf((byte)8);
    Object v1 = org.apache.commons.codec.binary.Base64.isBase64((((java.lang.Byte)v0).byteValue()));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = -6;
    Object v1 = new byte[]{};
    Object v2 = false;
    Object v3 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v0).intValue()),((byte[])v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new byte[]{};
    Object v5 = true;
    Object v6 = true;
    Object v7 = -17;
    Object v8 = org.apache.commons.codec.binary.Base64.encodeBase64(((byte[])v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.apache.commons.codec.binary.Base64)v3).decode(((java.lang.Object)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = 0;
    Object v1 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)-37)};
    Object v2 = true;
    Object v3 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v0).intValue()),((byte[])v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "TH";
    Object v5 = ((org.apache.commons.codec.binary.Base64)v3).decode(((java.lang.String)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = -6;
    Object v1 = new byte[]{};
    Object v2 = false;
    Object v3 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v0).intValue()),((byte[])v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "SHA-512";
    Object v5 = ((org.apache.commons.codec.binary.Base64)v3).decode(((java.lang.String)v4));
    Object v6 = new byte[]{Byte.valueOf((byte)21),Byte.valueOf((byte)52)};
    Object v7 = ((org.apache.commons.codec.binary.Base64)v3).encode(((byte[])v6));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)76)};
    Object v1 = org.apache.commons.codec.binary.Base64.decodeBase64(((byte[])v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)3)};
    Object v1 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(((byte[])v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(((byte[])v0));
    org.junit.Assert.assertEquals((Object)(true), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = -6;
    Object v1 = new byte[]{};
    Object v2 = false;
    Object v3 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v0).intValue()),((byte[])v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((org.apache.commons.codec.binary.Base64)v3).avail();
    org.junit.Assert.assertEquals((Object)(0), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = -6;
    Object v1 = new byte[]{};
    Object v2 = false;
    Object v3 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v0).intValue()),((byte[])v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new byte[]{};
    Object v5 = ((org.apache.commons.codec.binary.Base64)v3).encode(((byte[])v4));
    Object v6 = new byte[]{Byte.valueOf((byte)2),Byte.valueOf((byte)3)};
    Object v7 = ((org.apache.commons.codec.binary.Base64)v3).decode(((byte[])v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = org.apache.commons.codec.binary.Base64.decodeBase64(((byte[])v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = -6;
    Object v1 = new byte[]{};
    Object v2 = false;
    Object v3 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v0).intValue()),((byte[])v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new byte[]{Byte.valueOf((byte)0)};
    Object v5 = 59;
    Object v6 = 25;
    Object v7 = ((org.apache.commons.codec.binary.Base64)v3).readResults(((byte[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    org.junit.Assert.assertEquals((Object)(0), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = 0;
    Object v1 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)-37)};
    Object v2 = true;
    Object v3 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v0).intValue()),((byte[])v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((org.apache.commons.codec.binary.Base64)v3).avail();
    org.junit.Assert.assertEquals((Object)(0), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = -6;
    Object v1 = new byte[]{};
    Object v2 = false;
    Object v3 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v0).intValue()),((byte[])v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)10),Byte.valueOf((byte)66)};
    Object v5 = 1;
    Object v6 = 7;
    ((org.apache.commons.codec.binary.Base64)v3).encode(((byte[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)5),Byte.valueOf((byte)4)};
    Object v1 = true;
    Object v2 = false;
    Object v3 = org.apache.commons.codec.binary.Base64.encodeBase64(((byte[])v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = -6;
    Object v1 = new byte[]{};
    Object v2 = false;
    Object v3 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v0).intValue()),((byte[])v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new byte[]{Byte.valueOf((byte)9),Byte.valueOf((byte)1),Byte.valueOf((byte)13)};
    Object v5 = 173;
    Object v6 = 81;
    Object v7 = ((org.apache.commons.codec.binary.Base64)v3).readResults(((byte[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    org.junit.Assert.assertEquals((Object)(0), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = -7;
    Object v1 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = Byte.valueOf((byte)53);
    Object v1 = org.apache.commons.codec.binary.Base64.isBase64((((java.lang.Byte)v0).byteValue()));
    org.junit.Assert.assertEquals((Object)(true), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)5),Byte.valueOf((byte)74),Byte.valueOf((byte)-9)};
    Object v1 = org.apache.commons.codec.binary.Base64.discardWhitespace(((byte[])v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = -6;
    Object v1 = new byte[]{};
    Object v2 = false;
    Object v3 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v0).intValue()),((byte[])v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new byte[]{Byte.valueOf((byte)-37),Byte.valueOf((byte)54),Byte.valueOf((byte)69)};
    Object v5 = 75;
    Object v6 = 0;
    ((org.apache.commons.codec.binary.Base64)v3).encode(((byte[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = -7;
    Object v1 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v0).intValue()));
    Object v2 = ((org.apache.commons.codec.binary.Base64)v1).isUrlSafe();
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = 0;
    Object v1 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)-37)};
    Object v2 = true;
    Object v3 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v0).intValue()),((byte[])v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new byte[]{Byte.valueOf((byte)35),Byte.valueOf((byte)1),Byte.valueOf((byte)-1)};
    Object v5 = ((org.apache.commons.codec.binary.Base64)v3).decode(((byte[])v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = Byte.valueOf((byte)51);
    Object v1 = org.apache.commons.codec.binary.Base64.isBase64((((java.lang.Byte)v0).byteValue()));
    org.junit.Assert.assertEquals((Object)(true), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)-37)};
    Object v1 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(((byte[])v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = 0;
    Object v1 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)-37)};
    Object v2 = true;
    Object v3 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v0).intValue()),((byte[])v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new byte[]{Byte.valueOf((byte)14)};
    Object v5 = 1;
    Object v6 = 0;
    ((org.apache.commons.codec.binary.Base64)v3).decode(((byte[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)24),Byte.valueOf((byte)-6)};
    Object v1 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(((byte[])v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = false;
    Object v2 = true;
    Object v3 = -56;
    Object v4 = org.apache.commons.codec.binary.Base64.encodeBase64(((byte[])v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = new byte[]{Byte.valueOf((byte)65),Byte.valueOf((byte)18)};
    Object v2 = false;
    Object v3 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v0).intValue()),((byte[])v1),(((java.lang.Boolean)v2).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = -7;
    Object v1 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v0).intValue()));
    Object v2 = "A";
    Object v3 = ((org.apache.commons.codec.binary.Base64)v1).decode(((java.lang.String)v2));
    Object v4 = new byte[]{Byte.valueOf((byte)0)};
    Object v5 = ((org.apache.commons.codec.binary.Base64)v1).decode(((byte[])v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = 0;
    Object v1 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)-37)};
    Object v2 = true;
    Object v3 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v0).intValue()),((byte[])v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new byte[]{Byte.valueOf((byte)9),Byte.valueOf((byte)-11),Byte.valueOf((byte)-39)};
    Object v5 = -61;
    Object v6 = 0;
    ((org.apache.commons.codec.binary.Base64)v3).decode(((byte[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = -6;
    Object v1 = new byte[]{};
    Object v2 = false;
    Object v3 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v0).intValue()),((byte[])v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new byte[]{};
    Object v5 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(((byte[])v4));
    Object v6 = ((org.apache.commons.codec.binary.Base64)v3).decode(((java.lang.Object)v5));
      org.junit.Assert.fail("Expected org.apache.commons.codec.DecoderException");
    } catch (org.apache.commons.codec.DecoderException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)44),Byte.valueOf((byte)-27)};
    Object v1 = org.apache.commons.codec.binary.Base64.discardWhitespace(((byte[])v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = -7;
    Object v1 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v0).intValue()));
    Object v2 = new byte[]{Byte.valueOf((byte)1)};
    Object v3 = 26;
    Object v4 = 13;
    ((org.apache.commons.codec.binary.Base64)v1).encode(((byte[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = -6;
    Object v1 = new byte[]{};
    Object v2 = false;
    Object v3 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v0).intValue()),((byte[])v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((org.apache.commons.codec.binary.Base64)v3).isUrlSafe();
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)1)};
    Object v1 = true;
    Object v2 = true;
    Object v3 = 30;
    Object v4 = org.apache.commons.codec.binary.Base64.encodeBase64(((byte[])v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)-34),Byte.valueOf((byte)88)};
    Object v1 = org.apache.commons.codec.binary.Base64.discardWhitespace(((byte[])v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = -6;
    Object v1 = new byte[]{};
    Object v2 = false;
    Object v3 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v0).intValue()),((byte[])v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new byte[]{};
    Object v5 = ((org.apache.commons.codec.binary.Base64)v3).encode(((byte[])v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = 0;
    Object v1 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)-37)};
    Object v2 = true;
    Object v3 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v0).intValue()),((byte[])v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new byte[]{Byte.valueOf((byte)45)};
    Object v5 = ((org.apache.commons.codec.binary.Base64)v3).decode(((byte[])v4));
    Object v6 = new byte[]{};
    Object v7 = 0;
    Object v8 = -9;
    ((org.apache.commons.codec.binary.Base64)v3).encode(((byte[])v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = -6;
    Object v1 = new byte[]{};
    Object v2 = false;
    Object v3 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v0).intValue()),((byte[])v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((org.apache.commons.codec.binary.Base64)v3).hasData();
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = 84;
    Object v1 = new byte[]{Byte.valueOf((byte)3),Byte.valueOf((byte)18)};
    Object v2 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v0).intValue()),((byte[])v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = 84;
    Object v1 = new byte[]{Byte.valueOf((byte)3),Byte.valueOf((byte)18)};
    Object v2 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v0).intValue()),((byte[])v1));
    Object v3 = new byte[]{Byte.valueOf((byte)19),Byte.valueOf((byte)10),Byte.valueOf((byte)0)};
    Object v4 = ((org.apache.commons.codec.binary.Base64)v2).encode(((byte[])v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = 84;
    Object v1 = new byte[]{Byte.valueOf((byte)3),Byte.valueOf((byte)18)};
    Object v2 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v0).intValue()),((byte[])v1));
    Object v3 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)3)};
    Object v4 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(((byte[])v3));
    Object v5 = ((org.apache.commons.codec.binary.Base64)v2).decode(((java.lang.Object)v4));
      org.junit.Assert.fail("Expected org.apache.commons.codec.DecoderException");
    } catch (org.apache.commons.codec.DecoderException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = -6;
    Object v1 = new byte[]{};
    Object v2 = false;
    Object v3 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v0).intValue()),((byte[])v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new byte[]{Byte.valueOf((byte)-10),Byte.valueOf((byte)-6),Byte.valueOf((byte)21)};
    Object v5 = 4;
    Object v6 = 4;
    Object v7 = ((org.apache.commons.codec.binary.Base64)v3).readResults(((byte[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    org.junit.Assert.assertEquals((Object)(0), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)4),Byte.valueOf((byte)-34)};
    Object v1 = org.apache.commons.codec.binary.Base64.encodeBase64String(((byte[])v0));
    org.junit.Assert.assertEquals((Object)("BN4="), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(((byte[])v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = Byte.valueOf((byte)-1);
    Object v1 = org.apache.commons.codec.binary.Base64.isBase64((((java.lang.Byte)v0).byteValue()));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)3),Byte.valueOf((byte)54),Byte.valueOf((byte)50)};
    Object v1 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(((byte[])v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)105),Byte.valueOf((byte)0)};
    Object v1 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(((byte[])v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = 0;
    Object v1 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)-37)};
    Object v2 = true;
    Object v3 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v0).intValue()),((byte[])v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new byte[]{Byte.valueOf((byte)-20),Byte.valueOf((byte)0),Byte.valueOf((byte)46)};
    Object v5 = 1;
    Object v6 = 37;
    Object v7 = ((org.apache.commons.codec.binary.Base64)v3).readResults(((byte[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    org.junit.Assert.assertEquals((Object)(0), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = -6;
    Object v1 = new byte[]{};
    Object v2 = false;
    Object v3 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v0).intValue()),((byte[])v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "ISL";
    Object v5 = ((org.apache.commons.codec.binary.Base64)v3).decode(((java.lang.String)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = -6;
    Object v1 = new byte[]{};
    Object v2 = false;
    Object v3 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v0).intValue()),((byte[])v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)0),Byte.valueOf((byte)1)};
    Object v5 = ((org.apache.commons.codec.binary.Base64)v3).decode(((byte[])v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = 84;
    Object v1 = new byte[]{Byte.valueOf((byte)3),Byte.valueOf((byte)18)};
    Object v2 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v0).intValue()),((byte[])v1));
    Object v3 = 84;
    Object v4 = new byte[]{Byte.valueOf((byte)3),Byte.valueOf((byte)18)};
    Object v5 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v3).intValue()),((byte[])v4));
    Object v6 = ((org.apache.commons.codec.binary.Base64)v2).encode(((java.lang.Object)v5));
      org.junit.Assert.fail("Expected org.apache.commons.codec.EncoderException");
    } catch (org.apache.commons.codec.EncoderException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)32),Byte.valueOf((byte)0)};
    Object v1 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(((byte[])v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)42)};
    Object v1 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(((byte[])v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = -6;
    Object v1 = new byte[]{};
    Object v2 = false;
    Object v3 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v0).intValue()),((byte[])v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new byte[]{};
    Object v5 = ((org.apache.commons.codec.binary.Base64)v3).encode(((byte[])v4));
    Object v6 = ((org.apache.commons.codec.binary.Base64)v3).hasData();
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new org.apache.commons.codec.binary.Base64();
    Object v1 = new byte[]{Byte.valueOf((byte)22)};
    Object v2 = 109;
    Object v3 = 0;
    Object v4 = ((org.apache.commons.codec.binary.Base64)v0).readResults(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertEquals((Object)(0), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = 0;
    Object v1 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)63),Byte.valueOf((byte)-2)};
    Object v2 = true;
    Object v3 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v0).intValue()),((byte[])v1),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)0)};
    Object v1 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(((byte[])v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)63),Byte.valueOf((byte)-2)};
    Object v2 = true;
    Object v3 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v0).intValue()),((byte[])v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new org.apache.commons.codec.binary.Base64();
    Object v5 = new byte[]{Byte.valueOf((byte)-14),Byte.valueOf((byte)0)};
    Object v6 = ((org.apache.commons.codec.binary.Base64)v4).encode(((byte[])v5));
    Object v7 = new byte[]{Byte.valueOf((byte)16),Byte.valueOf((byte)16),Byte.valueOf((byte)-25)};
    Object v8 = ((org.apache.commons.codec.binary.Base64)v4).encode(((byte[])v7));
    Object v9 = ((org.apache.commons.codec.binary.Base64)v3).encode(((java.lang.Object)v8));
    Object v10 = 0;
    Object v11 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)-37)};
    Object v12 = true;
    Object v13 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v10).intValue()),((byte[])v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((org.apache.commons.codec.binary.Base64)v3).decode(((java.lang.Object)v13));
      org.junit.Assert.fail("Expected org.apache.commons.codec.DecoderException");
    } catch (org.apache.commons.codec.DecoderException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = -6;
    Object v1 = new byte[]{};
    Object v2 = false;
    Object v3 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v0).intValue()),((byte[])v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new byte[]{};
    Object v5 = true;
    Object v6 = true;
    Object v7 = -17;
    Object v8 = org.apache.commons.codec.binary.Base64.encodeBase64(((byte[])v4),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Boolean)v6).booleanValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.apache.commons.codec.binary.Base64)v3).encode(((java.lang.Object)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = 84;
    Object v1 = new byte[]{Byte.valueOf((byte)3),Byte.valueOf((byte)18)};
    Object v2 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v0).intValue()),((byte[])v1));
    Object v3 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)89)};
    Object v4 = ((org.apache.commons.codec.binary.Base64)v2).encodeToString(((byte[])v3));
    org.junit.Assert.assertEquals((Object)("AVk=\u0003\u0012"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = 0;
    Object v1 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)63),Byte.valueOf((byte)-2)};
    Object v2 = true;
    Object v3 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v0).intValue()),((byte[])v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((org.apache.commons.codec.binary.Base64)v3).hasData();
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = -19;
    Object v1 = new byte[]{Byte.valueOf((byte)0)};
    Object v2 = true;
    Object v3 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v0).intValue()),((byte[])v1),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = 0;
    Object v1 = new byte[]{Byte.valueOf((byte)20),Byte.valueOf((byte)1)};
    Object v2 = true;
    Object v3 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v0).intValue()),((byte[])v1),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = 84;
    Object v1 = new byte[]{Byte.valueOf((byte)3),Byte.valueOf((byte)18)};
    Object v2 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v0).intValue()),((byte[])v1));
    Object v3 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)-37)};
    Object v4 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(((byte[])v3));
    Object v5 = ((org.apache.commons.codec.binary.Base64)v2).encode(((java.lang.Object)v4));
      org.junit.Assert.fail("Expected org.apache.commons.codec.EncoderException");
    } catch (org.apache.commons.codec.EncoderException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = true;
    Object v2 = org.apache.commons.codec.binary.Base64.encodeBase64(((byte[])v0),(((java.lang.Boolean)v1).booleanValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = -6;
    Object v1 = new byte[]{};
    Object v2 = false;
    Object v3 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v0).intValue()),((byte[])v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new byte[]{Byte.valueOf((byte)88)};
    Object v5 = ((org.apache.commons.codec.binary.Base64)v3).encode(((byte[])v4));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)1),Byte.valueOf((byte)-12)};
    Object v1 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(((byte[])v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)9)};
    Object v1 = org.apache.commons.codec.binary.Base64.decodeInteger(((byte[])v0));
    org.junit.Assert.assertEquals((Object)(0), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = Byte.valueOf((byte)-28);
    Object v1 = org.apache.commons.codec.binary.Base64.isBase64((((java.lang.Byte)v0).byteValue()));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = -6;
    Object v1 = new byte[]{};
    Object v2 = false;
    Object v3 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v0).intValue()),((byte[])v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = -6;
    Object v5 = new byte[]{};
    Object v6 = false;
    Object v7 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v4).intValue()),((byte[])v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new byte[]{Byte.valueOf((byte)0)};
    Object v9 = 59;
    Object v10 = 25;
    Object v11 = ((org.apache.commons.codec.binary.Base64)v7).readResults(((byte[])v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = ((org.apache.commons.codec.binary.Base64)v3).decode(((java.lang.Object)v11));
      org.junit.Assert.fail("Expected org.apache.commons.codec.DecoderException");
    } catch (org.apache.commons.codec.DecoderException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = Byte.valueOf((byte)1);
    Object v1 = org.apache.commons.codec.binary.Base64.isBase64((((java.lang.Byte)v0).byteValue()));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)0)};
    Object v1 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafeString(((byte[])v0));
    org.junit.Assert.assertEquals((Object)("AA"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)98),Byte.valueOf((byte)0)};
    Object v1 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafeString(((byte[])v0));
    org.junit.Assert.assertEquals((Object)("YgA"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = 0;
    Object v1 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)63),Byte.valueOf((byte)-2)};
    Object v2 = true;
    Object v3 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v0).intValue()),((byte[])v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((org.apache.commons.codec.binary.Base64)v3).avail();
    org.junit.Assert.assertEquals((Object)(0), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)3)};
    Object v1 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(((byte[])v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = -6;
    Object v1 = new byte[]{};
    Object v2 = false;
    Object v3 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v0).intValue()),((byte[])v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new byte[]{};
    Object v5 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(((byte[])v4));
    Object v6 = ((org.apache.commons.codec.binary.Base64)v3).decode(((java.lang.Object)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = 0;
    Object v1 = new byte[]{Byte.valueOf((byte)20),Byte.valueOf((byte)1)};
    Object v2 = true;
    Object v3 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v0).intValue()),((byte[])v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)44),Byte.valueOf((byte)-27)};
    Object v5 = org.apache.commons.codec.binary.Base64.discardWhitespace(((byte[])v4));
    Object v6 = ((org.apache.commons.codec.binary.Base64)v3).encode(((java.lang.Object)v5));
    org.junit.Assert.assertNotNull(v6);
  }
}
