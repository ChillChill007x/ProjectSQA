package org.apache.commons.codec.binary;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)38)};
    Object v1 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(((byte[])v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = Byte.valueOf((byte)1);
    Object v1 = org.apache.commons.codec.binary.Base64.isBase64((((java.lang.Byte)v0).byteValue()));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = "encodeInteger called with null paramet]r";
    Object v1 = org.apache.commons.codec.binary.Base64.decodeBase64(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = new org.apache.commons.codec.binary.Base64((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = new byte[]{Byte.valueOf((byte)56),Byte.valueOf((byte)65),Byte.valueOf((byte)53)};
    Object v3 = -11;
    Object v4 = 48;
    ((org.apache.commons.codec.binary.Base64)v1).encode(((byte[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = true;
    Object v1 = new org.apache.commons.codec.binary.Base64((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = ((org.apache.commons.codec.binary.Base64)v1).isUrlSafe();
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)1)};
    Object v1 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(((byte[])v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = true;
    Object v1 = new org.apache.commons.codec.binary.Base64((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = ((org.apache.commons.codec.binary.Base64)v1).hasData();
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = Byte.valueOf((byte)-9);
    Object v1 = org.apache.commons.codec.binary.Base64.isBase64((((java.lang.Byte)v0).byteValue()));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)72)};
    Object v1 = org.apache.commons.codec.binary.Base64.discardWhitespace(((byte[])v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = true;
    Object v1 = new org.apache.commons.codec.binary.Base64((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = new byte[]{};
    Object v3 = 1;
    Object v4 = 0;
    ((org.apache.commons.codec.binary.Base64)v1).encode(((byte[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = true;
    Object v1 = new org.apache.commons.codec.binary.Base64((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = new byte[]{Byte.valueOf((byte)18),Byte.valueOf((byte)-3)};
    Object v3 = 1;
    Object v4 = -56;
    Object v5 = ((org.apache.commons.codec.binary.Base64)v1).readResults(((byte[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertEquals((Object)(0), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = new org.apache.commons.codec.binary.Base64((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = new byte[]{Byte.valueOf((byte)0)};
    Object v3 = -37;
    Object v4 = 1;
    ((org.apache.commons.codec.binary.Base64)v1).decode(((byte[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = true;
    Object v1 = new org.apache.commons.codec.binary.Base64((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = new byte[]{Byte.valueOf((byte)23)};
    Object v3 = ((org.apache.commons.codec.binary.Base64)v1).encodeToString(((byte[])v2));
    Object v4 = new byte[]{Byte.valueOf((byte)-9),Byte.valueOf((byte)1)};
    Object v5 = ((org.apache.commons.codec.binary.Base64)v1).encodeToString(((byte[])v4));
    org.junit.Assert.assertEquals((Object)("9wE\r\n"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = true;
    Object v1 = new org.apache.commons.codec.binary.Base64((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = ((org.apache.commons.codec.binary.Base64)v1).avail();
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)9)};
    Object v1 = org.apache.commons.codec.binary.Base64.discardWhitespace(((byte[])v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = true;
    Object v1 = new org.apache.commons.codec.binary.Base64((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)0)};
    Object v3 = ((org.apache.commons.codec.binary.Base64)v1).decode(((byte[])v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)8),Byte.valueOf((byte)32),Byte.valueOf((byte)76)};
    Object v1 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(((byte[])v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)1)};
    Object v1 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafeString(((byte[])v0));
    org.junit.Assert.assertEquals((Object)("AQ"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = true;
    Object v1 = new org.apache.commons.codec.binary.Base64((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = new byte[]{Byte.valueOf((byte)-42)};
    Object v3 = -28;
    Object v4 = -9;
    ((org.apache.commons.codec.binary.Base64)v1).decode(((byte[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)36)};
    Object v1 = true;
    Object v2 = false;
    Object v3 = 3;
    Object v4 = org.apache.commons.codec.binary.Base64.encodeBase64(((byte[])v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = 1;
    Object v1 = new byte[]{Byte.valueOf((byte)5)};
    Object v2 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v0).intValue()),((byte[])v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)2),Byte.valueOf((byte)1)};
    Object v1 = true;
    Object v2 = false;
    Object v3 = 255;
    Object v4 = org.apache.commons.codec.binary.Base64.encodeBase64(((byte[])v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)48)};
    Object v1 = org.apache.commons.codec.binary.Base64.discardWhitespace(((byte[])v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = true;
    Object v1 = new org.apache.commons.codec.binary.Base64((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = new byte[]{};
    Object v3 = 37;
    Object v4 = 3;
    ((org.apache.commons.codec.binary.Base64)v1).setInitialBuffer(((byte[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = true;
    Object v1 = new org.apache.commons.codec.binary.Base64((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = new byte[]{Byte.valueOf((byte)9)};
    Object v3 = org.apache.commons.codec.binary.Base64.discardWhitespace(((byte[])v2));
    Object v4 = ((org.apache.commons.codec.binary.Base64)v1).encode(((java.lang.Object)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = true;
    Object v1 = new org.apache.commons.codec.binary.Base64((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = new byte[]{Byte.valueOf((byte)23),Byte.valueOf((byte)17)};
    Object v3 = ((org.apache.commons.codec.binary.Base64)v1).encode(((byte[])v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = -32;
    Object v1 = new byte[]{};
    Object v2 = false;
    Object v3 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v0).intValue()),((byte[])v1),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = 11;
    Object v1 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = true;
    Object v1 = new org.apache.commons.codec.binary.Base64((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)26),Byte.valueOf((byte)15)};
    Object v3 = 1;
    Object v4 = -2;
    ((org.apache.commons.codec.binary.Base64)v1).decode(((byte[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = 11;
    Object v1 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v0).intValue()));
    Object v2 = new byte[]{Byte.valueOf((byte)87),Byte.valueOf((byte)1),Byte.valueOf((byte)46)};
    Object v3 = ((org.apache.commons.codec.binary.Base64)v1).decode(((byte[])v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = -32;
    Object v1 = new byte[]{};
    Object v2 = false;
    Object v3 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v0).intValue()),((byte[])v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "encodeInteger called with null paramet]r";
    Object v5 = org.apache.commons.codec.binary.Base64.decodeBase64(((java.lang.String)v4));
    Object v6 = ((org.apache.commons.codec.binary.Base64)v3).decode(((java.lang.Object)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = true;
    Object v1 = new org.apache.commons.codec.binary.Base64((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = new byte[]{Byte.valueOf((byte)-8)};
    Object v3 = ((org.apache.commons.codec.binary.Base64)v1).decode(((byte[])v2));
    Object v4 = new byte[]{Byte.valueOf((byte)0)};
    Object v5 = 2;
    Object v6 = 1;
    Object v7 = ((org.apache.commons.codec.binary.Base64)v1).readResults(((byte[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    org.junit.Assert.assertEquals((Object)(-1), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = org.apache.commons.codec.binary.Base64.discardWhitespace(((byte[])v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = true;
    Object v1 = new org.apache.commons.codec.binary.Base64((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = new byte[]{Byte.valueOf((byte)79)};
    Object v3 = 2;
    Object v4 = 3;
    Object v5 = ((org.apache.commons.codec.binary.Base64)v1).readResults(((byte[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertEquals((Object)(0), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = true;
    Object v1 = new org.apache.commons.codec.binary.Base64((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = new byte[]{Byte.valueOf((byte)-3)};
    Object v3 = ((org.apache.commons.codec.binary.Base64)v1).encodeToString(((byte[])v2));
    Object v4 = new byte[]{};
    Object v5 = ((org.apache.commons.codec.binary.Base64)v1).decode(((byte[])v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(((byte[])v0));
    org.junit.Assert.assertEquals((Object)(true), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = 11;
    Object v1 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v0).intValue()));
    Object v2 = ((org.apache.commons.codec.binary.Base64)v1).avail();
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = new org.apache.commons.codec.binary.Base64((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = "";
    Object v3 = ((org.apache.commons.codec.binary.Base64)v1).decode(((java.lang.String)v2));
    Object v4 = new byte[]{Byte.valueOf((byte)0)};
    Object v5 = -29;
    Object v6 = 17;
    ((org.apache.commons.codec.binary.Base64)v1).encode(((byte[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = -32;
    Object v1 = new byte[]{};
    Object v2 = false;
    Object v3 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v0).intValue()),((byte[])v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new byte[]{Byte.valueOf((byte)0)};
    Object v5 = ((org.apache.commons.codec.binary.Base64)v3).encode(((byte[])v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = "?=";
    Object v1 = org.apache.commons.codec.binary.Base64.decodeBase64(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)0)};
    Object v1 = true;
    Object v2 = org.apache.commons.codec.binary.Base64.encodeBase64(((byte[])v0),(((java.lang.Boolean)v1).booleanValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = true;
    Object v1 = new org.apache.commons.codec.binary.Base64((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = new byte[]{Byte.valueOf((byte)6)};
    Object v3 = 16;
    Object v4 = 59;
    ((org.apache.commons.codec.binary.Base64)v1).setInitialBuffer(((byte[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)46),Byte.valueOf((byte)30)};
    Object v1 = false;
    Object v2 = true;
    Object v3 = 81;
    Object v4 = org.apache.commons.codec.binary.Base64.encodeBase64(((byte[])v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = true;
    Object v1 = new org.apache.commons.codec.binary.Base64((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = "?=";
    Object v3 = org.apache.commons.codec.binary.Base64.decodeBase64(((java.lang.String)v2));
    Object v4 = ((org.apache.commons.codec.binary.Base64)v1).encode(((java.lang.Object)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = -32;
    Object v1 = new byte[]{};
    Object v2 = false;
    Object v3 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v0).intValue()),((byte[])v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((org.apache.commons.codec.binary.Base64)v3).hasData();
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = true;
    Object v1 = new org.apache.commons.codec.binary.Base64((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = "UTF-";
    Object v3 = ((org.apache.commons.codec.binary.Base64)v1).decode(((java.lang.String)v2));
    Object v4 = new byte[]{Byte.valueOf((byte)72)};
    Object v5 = org.apache.commons.codec.binary.Base64.discardWhitespace(((byte[])v4));
    Object v6 = ((org.apache.commons.codec.binary.Base64)v1).decode(((java.lang.Object)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = true;
    Object v1 = new org.apache.commons.codec.binary.Base64((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = new byte[]{Byte.valueOf((byte)-14),Byte.valueOf((byte)1),Byte.valueOf((byte)0)};
    Object v3 = ((org.apache.commons.codec.binary.Base64)v1).encode(((byte[])v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = 11;
    Object v1 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v0).intValue()));
    Object v2 = true;
    Object v3 = new org.apache.commons.codec.binary.Base64((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((org.apache.commons.codec.binary.Base64)v3).hasData();
    Object v5 = ((org.apache.commons.codec.binary.Base64)v1).decode(((java.lang.Object)v4));
      org.junit.Assert.fail("Expected org.apache.commons.codec.DecoderException");
    } catch (org.apache.commons.codec.DecoderException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = false;
    Object v2 = true;
    Object v3 = 55;
    Object v4 = org.apache.commons.codec.binary.Base64.encodeBase64(((byte[])v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = -23;
    Object v1 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)30),Byte.valueOf((byte)-44)};
    Object v2 = true;
    Object v3 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v0).intValue()),((byte[])v1),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = true;
    Object v1 = new org.apache.commons.codec.binary.Base64((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = new byte[]{Byte.valueOf((byte)97)};
    Object v3 = ((org.apache.commons.codec.binary.Base64)v1).decode(((byte[])v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = Byte.valueOf((byte)118);
    Object v1 = org.apache.commons.codec.binary.Base64.isBase64((((java.lang.Byte)v0).byteValue()));
    org.junit.Assert.assertEquals((Object)(true), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = -32;
    Object v1 = new byte[]{};
    Object v2 = false;
    Object v3 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v0).intValue()),((byte[])v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)3)};
    Object v5 = ((org.apache.commons.codec.binary.Base64)v3).decode(((byte[])v4));
    Object v6 = new byte[]{};
    Object v7 = org.apache.commons.codec.binary.Base64.discardWhitespace(((byte[])v6));
    Object v8 = ((org.apache.commons.codec.binary.Base64)v3).decode(((java.lang.Object)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = true;
    Object v1 = new org.apache.commons.codec.binary.Base64((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = "UTF-16";
    Object v3 = ((org.apache.commons.codec.binary.Base64)v1).decode(((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = true;
    Object v1 = new org.apache.commons.codec.binary.Base64((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)-3)};
    Object v3 = ((org.apache.commons.codec.binary.Base64)v1).decode(((byte[])v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(((byte[])v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = false;
    Object v2 = false;
    Object v3 = -18;
    Object v4 = org.apache.commons.codec.binary.Base64.encodeBase64(((byte[])v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = -23;
    Object v1 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)30),Byte.valueOf((byte)-44)};
    Object v2 = true;
    Object v3 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v0).intValue()),((byte[])v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new byte[]{Byte.valueOf((byte)-8)};
    Object v5 = 0;
    Object v6 = 1;
    ((org.apache.commons.codec.binary.Base64)v3).encode(((byte[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = Byte.valueOf((byte)-3);
    Object v1 = org.apache.commons.codec.binary.Base64.isBase64((((java.lang.Byte)v0).byteValue()));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)72),Byte.valueOf((byte)1)};
    Object v1 = org.apache.commons.codec.binary.Base64.discardWhitespace(((byte[])v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = 58;
    Object v1 = new byte[]{Byte.valueOf((byte)76)};
    Object v2 = false;
    Object v3 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v0).intValue()),((byte[])v1),(((java.lang.Boolean)v2).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = "Objects of ty]e ";
    Object v1 = org.apache.commons.codec.binary.Base64.decodeBase64(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = -23;
    Object v1 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)30),Byte.valueOf((byte)-44)};
    Object v2 = true;
    Object v3 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v0).intValue()),((byte[])v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new byte[]{};
    Object v5 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(((byte[])v4));
    Object v6 = ((org.apache.commons.codec.binary.Base64)v3).encode(((java.lang.Object)v5));
      org.junit.Assert.fail("Expected org.apache.commons.codec.EncoderException");
    } catch (org.apache.commons.codec.EncoderException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = 1;
    Object v1 = new byte[]{Byte.valueOf((byte)5)};
    Object v2 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v0).intValue()),((byte[])v1));
    Object v3 = new byte[]{Byte.valueOf((byte)9),Byte.valueOf((byte)28)};
    Object v4 = -43;
    Object v5 = -30;
    Object v6 = ((org.apache.commons.codec.binary.Base64)v2).readResults(((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    org.junit.Assert.assertEquals((Object)(0), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = true;
    Object v2 = true;
    Object v3 = -21;
    Object v4 = org.apache.commons.codec.binary.Base64.encodeBase64(((byte[])v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = 1;
    Object v1 = new byte[]{Byte.valueOf((byte)5)};
    Object v2 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v0).intValue()),((byte[])v1));
    Object v3 = ((org.apache.commons.codec.binary.Base64)v2).hasData();
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = 1;
    Object v1 = new byte[]{Byte.valueOf((byte)5)};
    Object v2 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v0).intValue()),((byte[])v1));
    Object v3 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)0),Byte.valueOf((byte)0)};
    Object v4 = 37;
    Object v5 = 9;
    ((org.apache.commons.codec.binary.Base64)v2).setInitialBuffer(((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = 1;
    Object v1 = new byte[]{Byte.valueOf((byte)5)};
    Object v2 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v0).intValue()),((byte[])v1));
    Object v3 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)26),Byte.valueOf((byte)-46)};
    Object v4 = 1;
    Object v5 = 1;
    ((org.apache.commons.codec.binary.Base64)v2).encode(((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = 11;
    Object v1 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v0).intValue()));
    Object v2 = new byte[]{};
    Object v3 = 1;
    Object v4 = 0;
    ((org.apache.commons.codec.binary.Base64)v1).setInitialBuffer(((byte[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)-53)};
    Object v1 = org.apache.commons.codec.binary.Base64.encodeBase64(((byte[])v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = 1;
    Object v1 = new byte[]{Byte.valueOf((byte)5)};
    Object v2 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v0).intValue()),((byte[])v1));
    Object v3 = new byte[]{Byte.valueOf((byte)-38),Byte.valueOf((byte)-1),Byte.valueOf((byte)36)};
    Object v4 = 0;
    Object v5 = -4;
    ((org.apache.commons.codec.binary.Base64)v2).setInitialBuffer(((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = 1;
    Object v1 = new byte[]{Byte.valueOf((byte)5)};
    Object v2 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v0).intValue()),((byte[])v1));
    Object v3 = new byte[]{Byte.valueOf((byte)-15),Byte.valueOf((byte)0),Byte.valueOf((byte)-17)};
    Object v4 = ((org.apache.commons.codec.binary.Base64)v2).encode(((byte[])v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = -23;
    Object v1 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)30),Byte.valueOf((byte)-44)};
    Object v2 = true;
    Object v3 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v0).intValue()),((byte[])v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new byte[]{};
    Object v5 = ((org.apache.commons.codec.binary.Base64)v3).encodeToString(((byte[])v4));
    org.junit.Assert.assertEquals((Object)(""), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = Byte.valueOf((byte)2);
    Object v1 = org.apache.commons.codec.binary.Base64.isBase64((((java.lang.Byte)v0).byteValue()));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = Byte.valueOf((byte)73);
    Object v1 = org.apache.commons.codec.binary.Base64.isBase64((((java.lang.Byte)v0).byteValue()));
    org.junit.Assert.assertEquals((Object)(true), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = 11;
    Object v1 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v0).intValue()));
    Object v2 = new byte[]{};
    Object v3 = 27;
    Object v4 = 1;
    Object v5 = ((org.apache.commons.codec.binary.Base64)v1).readResults(((byte[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertEquals((Object)(0), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = -23;
    Object v1 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)30),Byte.valueOf((byte)-44)};
    Object v2 = true;
    Object v3 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v0).intValue()),((byte[])v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new byte[]{Byte.valueOf((byte)-1)};
    Object v5 = ((org.apache.commons.codec.binary.Base64)v3).encode(((byte[])v4));
    Object v6 = new byte[]{};
    Object v7 = ((org.apache.commons.codec.binary.Base64)v3).decode(((byte[])v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = -32;
    Object v1 = new byte[]{};
    Object v2 = false;
    Object v3 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v0).intValue()),((byte[])v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new byte[]{Byte.valueOf((byte)8),Byte.valueOf((byte)32),Byte.valueOf((byte)76)};
    Object v5 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(((byte[])v4));
    Object v6 = ((org.apache.commons.codec.binary.Base64)v3).encode(((java.lang.Object)v5));
      org.junit.Assert.fail("Expected org.apache.commons.codec.EncoderException");
    } catch (org.apache.commons.codec.EncoderException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(((byte[])v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = -23;
    Object v1 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)30),Byte.valueOf((byte)-44)};
    Object v2 = true;
    Object v3 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v0).intValue()),((byte[])v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "CZ";
    Object v5 = ((org.apache.commons.codec.binary.Base64)v3).decode(((java.lang.String)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = true;
    Object v2 = false;
    Object v3 = org.apache.commons.codec.binary.Base64.encodeBase64(((byte[])v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = -23;
    Object v1 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)30),Byte.valueOf((byte)-44)};
    Object v2 = true;
    Object v3 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v0).intValue()),((byte[])v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new byte[]{Byte.valueOf((byte)4),Byte.valueOf((byte)2),Byte.valueOf((byte)46)};
    Object v5 = 38;
    Object v6 = 0;
    ((org.apache.commons.codec.binary.Base64)v3).encode(((byte[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)-10),Byte.valueOf((byte)10),Byte.valueOf((byte)0)};
    Object v1 = org.apache.commons.codec.binary.Base64.decodeInteger(((byte[])v0));
    org.junit.Assert.assertEquals((Object)(0), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = true;
    Object v1 = new org.apache.commons.codec.binary.Base64((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = new byte[]{Byte.valueOf((byte)6)};
    Object v3 = ((org.apache.commons.codec.binary.Base64)v1).encode(((byte[])v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = 11;
    Object v1 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v0).intValue()));
    Object v2 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)8),Byte.valueOf((byte)-2)};
    Object v3 = ((org.apache.commons.codec.binary.Base64)v1).encodeToString(((byte[])v2));
    Object v4 = new byte[]{Byte.valueOf((byte)-43),Byte.valueOf((byte)1),Byte.valueOf((byte)0)};
    Object v5 = ((org.apache.commons.codec.binary.Base64)v1).encodeToString(((byte[])v4));
    org.junit.Assert.assertEquals((Object)("1QEA\r\n"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = new org.apache.commons.codec.binary.Base64((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = new byte[]{};
    Object v3 = true;
    Object v4 = false;
    Object v5 = org.apache.commons.codec.binary.Base64.encodeBase64(((byte[])v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = ((org.apache.commons.codec.binary.Base64)v1).decode(((java.lang.Object)v5));
    Object v7 = true;
    Object v8 = new org.apache.commons.codec.binary.Base64((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ((org.apache.commons.codec.binary.Base64)v8).isUrlSafe();
    Object v10 = ((org.apache.commons.codec.binary.Base64)v1).decode(((java.lang.Object)v9));
      org.junit.Assert.fail("Expected org.apache.commons.codec.DecoderException");
    } catch (org.apache.commons.codec.DecoderException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = 11;
    Object v1 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v0).intValue()));
    Object v2 = new byte[]{Byte.valueOf((byte)5),Byte.valueOf((byte)0)};
    Object v3 = ((org.apache.commons.codec.binary.Base64)v1).decode(((byte[])v2));
    Object v4 = "EWSKI";
    Object v5 = ((org.apache.commons.codec.binary.Base64)v1).decode(((java.lang.String)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = -23;
    Object v1 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)30),Byte.valueOf((byte)-44)};
    Object v2 = true;
    Object v3 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v0).intValue()),((byte[])v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new byte[]{Byte.valueOf((byte)2),Byte.valueOf((byte)57),Byte.valueOf((byte)0)};
    Object v5 = ((org.apache.commons.codec.binary.Base64)v3).encode(((byte[])v4));
    Object v6 = new byte[]{};
    Object v7 = 0;
    Object v8 = -2;
    ((org.apache.commons.codec.binary.Base64)v3).encode(((byte[])v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = Byte.valueOf((byte)-79);
    Object v1 = org.apache.commons.codec.binary.Base64.isBase64((((java.lang.Byte)v0).byteValue()));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)-11),Byte.valueOf((byte)1)};
    Object v1 = true;
    Object v2 = org.apache.commons.codec.binary.Base64.encodeBase64(((byte[])v0),(((java.lang.Boolean)v1).booleanValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = -32;
    Object v1 = new byte[]{};
    Object v2 = false;
    Object v3 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v0).intValue()),((byte[])v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new byte[]{Byte.valueOf((byte)-1),Byte.valueOf((byte)10),Byte.valueOf((byte)40)};
    Object v5 = -1;
    Object v6 = 1;
    ((org.apache.commons.codec.binary.Base64)v3).setInitialBuffer(((byte[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = 11;
    Object v1 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v0).intValue()));
    Object v2 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)0)};
    Object v3 = ((org.apache.commons.codec.binary.Base64)v1).decode(((byte[])v2));
    Object v4 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)2)};
    Object v5 = ((org.apache.commons.codec.binary.Base64)v1).decode(((byte[])v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)10)};
    Object v1 = false;
    Object v2 = false;
    Object v3 = org.apache.commons.codec.binary.Base64.encodeBase64(((byte[])v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)23),Byte.valueOf((byte)38)};
    Object v1 = false;
    Object v2 = true;
    Object v3 = 57;
    Object v4 = org.apache.commons.codec.binary.Base64.encodeBase64(((byte[])v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = 0;
    Object v1 = new byte[]{Byte.valueOf((byte)3)};
    Object v2 = false;
    Object v3 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v0).intValue()),((byte[])v1),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = Byte.valueOf((byte)80);
    Object v1 = org.apache.commons.codec.binary.Base64.isBase64((((java.lang.Byte)v0).byteValue()));
    org.junit.Assert.assertEquals((Object)(true), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = -23;
    Object v1 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)30),Byte.valueOf((byte)-44)};
    Object v2 = true;
    Object v3 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v0).intValue()),((byte[])v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((org.apache.commons.codec.binary.Base64)v3).hasData();
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = 0;
    Object v1 = new byte[]{Byte.valueOf((byte)3)};
    Object v2 = false;
    Object v3 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v0).intValue()),((byte[])v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new byte[]{};
    Object v5 = ((org.apache.commons.codec.binary.Base64)v3).decode(((byte[])v4));
    Object v6 = new byte[]{Byte.valueOf((byte)6),Byte.valueOf((byte)2),Byte.valueOf((byte)1)};
    Object v7 = 3;
    Object v8 = 53;
    Object v9 = ((org.apache.commons.codec.binary.Base64)v3).readResults(((byte[])v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    org.junit.Assert.assertEquals((Object)(0), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = true;
    Object v1 = new org.apache.commons.codec.binary.Base64((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = new byte[]{Byte.valueOf((byte)0)};
    Object v3 = 22;
    Object v4 = 0;
    ((org.apache.commons.codec.binary.Base64)v1).encode(((byte[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = true;
    Object v1 = new org.apache.commons.codec.binary.Base64((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)-40),Byte.valueOf((byte)0)};
    Object v3 = ((org.apache.commons.codec.binary.Base64)v1).decode(((byte[])v2));
    org.junit.Assert.assertNotNull(v3);
  }
}
