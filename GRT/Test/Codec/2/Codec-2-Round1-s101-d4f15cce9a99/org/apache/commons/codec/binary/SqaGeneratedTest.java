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
    Object v0 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)55),Byte.valueOf((byte)1)};
    Object v1 = org.apache.commons.codec.binary.Base64.decodeBase64(((byte[])v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = false;
    Object v1 = new org.apache.commons.codec.binary.Base64((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)1),Byte.valueOf((byte)0)};
    Object v3 = -7;
    Object v4 = -37;
    ((org.apache.commons.codec.binary.Base64)v1).encode(((byte[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = org.apache.commons.codec.binary.Base64.decodeBase64(((byte[])v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(((byte[])v0));
    org.junit.Assert.assertEquals((Object)(true), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)65),Byte.valueOf((byte)0)};
    Object v1 = org.apache.commons.codec.binary.Base64.decodeBase64(((byte[])v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)16),Byte.valueOf((byte)30),Byte.valueOf((byte)0)};
    Object v1 = org.apache.commons.codec.binary.Base64.discardWhitespace(((byte[])v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = false;
    Object v1 = new org.apache.commons.codec.binary.Base64((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = new byte[]{Byte.valueOf((byte)33),Byte.valueOf((byte)0)};
    Object v3 = 0;
    Object v4 = 0;
    Object v5 = ((org.apache.commons.codec.binary.Base64)v1).readResults(((byte[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertEquals((Object)(0), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = false;
    Object v1 = new org.apache.commons.codec.binary.Base64((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = new byte[]{Byte.valueOf((byte)-57),Byte.valueOf((byte)-35),Byte.valueOf((byte)0)};
    Object v3 = 2;
    Object v4 = 28;
    Object v5 = ((org.apache.commons.codec.binary.Base64)v1).readResults(((byte[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertEquals((Object)(0), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = org.apache.commons.codec.binary.Base64.discardWhitespace(((byte[])v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = 0;
    Object v1 = new byte[]{Byte.valueOf((byte)3),Byte.valueOf((byte)-55)};
    Object v2 = false;
    Object v3 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v0).intValue()),((byte[])v1),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = false;
    Object v1 = new org.apache.commons.codec.binary.Base64((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = ((org.apache.commons.codec.binary.Base64)v1).avail();
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = false;
    Object v1 = new org.apache.commons.codec.binary.Base64((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)0),Byte.valueOf((byte)1)};
    Object v3 = 2;
    Object v4 = -13;
    ((org.apache.commons.codec.binary.Base64)v1).decode(((byte[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = false;
    Object v1 = new org.apache.commons.codec.binary.Base64((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = false;
    Object v3 = new org.apache.commons.codec.binary.Base64((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((org.apache.commons.codec.binary.Base64)v3).avail();
    Object v5 = ((org.apache.commons.codec.binary.Base64)v1).encode(((java.lang.Object)v4));
      org.junit.Assert.fail("Expected org.apache.commons.codec.EncoderException");
    } catch (org.apache.commons.codec.EncoderException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)-7),Byte.valueOf((byte)1),Byte.valueOf((byte)1)};
    Object v1 = org.apache.commons.codec.binary.Base64.discardNonBase64(((byte[])v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = Byte.valueOf((byte)0);
    Object v1 = org.apache.commons.codec.binary.Base64.isBase64((((java.lang.Byte)v0).byteValue()));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = false;
    Object v1 = new org.apache.commons.codec.binary.Base64((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = new byte[]{};
    Object v3 = ((org.apache.commons.codec.binary.Base64)v1).encode(((byte[])v2));
    Object v4 = ((org.apache.commons.codec.binary.Base64)v1).avail();
    org.junit.Assert.assertEquals((Object)(0), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = new byte[]{Byte.valueOf((byte)3),Byte.valueOf((byte)-55)};
    Object v2 = false;
    Object v3 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v0).intValue()),((byte[])v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)19),Byte.valueOf((byte)1)};
    Object v5 = ((org.apache.commons.codec.binary.Base64)v3).encode(((byte[])v4));
    Object v6 = 0;
    Object v7 = new byte[]{Byte.valueOf((byte)3),Byte.valueOf((byte)-55)};
    Object v8 = false;
    Object v9 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v6).intValue()),((byte[])v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = ((org.apache.commons.codec.binary.Base64)v3).encode(((java.lang.Object)v9));
      org.junit.Assert.fail("Expected org.apache.commons.codec.EncoderException");
    } catch (org.apache.commons.codec.EncoderException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = 1;
    Object v1 = new byte[]{Byte.valueOf((byte)5)};
    Object v2 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v0).intValue()),((byte[])v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = false;
    Object v1 = new org.apache.commons.codec.binary.Base64((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = new byte[]{};
    Object v3 = ((org.apache.commons.codec.binary.Base64)v1).decode(((byte[])v2));
    Object v4 = ((org.apache.commons.codec.binary.Base64)v1).hasData();
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = new byte[]{Byte.valueOf((byte)3),Byte.valueOf((byte)-55)};
    Object v2 = false;
    Object v3 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v0).intValue()),((byte[])v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)34),Byte.valueOf((byte)32)};
    Object v5 = -3;
    Object v6 = 1;
    ((org.apache.commons.codec.binary.Base64)v3).decode(((byte[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = 36;
    Object v1 = new byte[]{Byte.valueOf((byte)83),Byte.valueOf((byte)7)};
    Object v2 = true;
    Object v3 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v0).intValue()),((byte[])v1),(((java.lang.Boolean)v2).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = 17;
    Object v1 = new byte[]{};
    Object v2 = true;
    Object v3 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v0).intValue()),((byte[])v1),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = 1;
    Object v1 = new byte[]{Byte.valueOf((byte)5)};
    Object v2 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v0).intValue()),((byte[])v1));
    Object v3 = new byte[]{Byte.valueOf((byte)-32),Byte.valueOf((byte)1)};
    Object v4 = ((org.apache.commons.codec.binary.Base64)v2).encode(((byte[])v3));
    Object v5 = new byte[]{Byte.valueOf((byte)-1),Byte.valueOf((byte)1),Byte.valueOf((byte)0)};
    Object v6 = 46;
    Object v7 = -30;
    ((org.apache.commons.codec.binary.Base64)v2).encode(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = 17;
    Object v1 = new byte[]{};
    Object v2 = true;
    Object v3 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v0).intValue()),((byte[])v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((org.apache.commons.codec.binary.Base64)v3).isUrlSafe();
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)4),Byte.valueOf((byte)2)};
    Object v1 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(((byte[])v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)13),Byte.valueOf((byte)-1),Byte.valueOf((byte)3)};
    Object v1 = false;
    Object v2 = true;
    Object v3 = org.apache.commons.codec.binary.Base64.encodeBase64(((byte[])v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = 0;
    Object v1 = new byte[]{Byte.valueOf((byte)3),Byte.valueOf((byte)-55)};
    Object v2 = false;
    Object v3 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v0).intValue()),((byte[])v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new byte[]{Byte.valueOf((byte)-7),Byte.valueOf((byte)1),Byte.valueOf((byte)1)};
    Object v5 = org.apache.commons.codec.binary.Base64.discardNonBase64(((byte[])v4));
    Object v6 = ((org.apache.commons.codec.binary.Base64)v3).decode(((java.lang.Object)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = 1;
    Object v1 = new byte[]{Byte.valueOf((byte)5)};
    Object v2 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v0).intValue()),((byte[])v1));
    Object v3 = new byte[]{Byte.valueOf((byte)0)};
    Object v4 = 46;
    Object v5 = 4;
    ((org.apache.commons.codec.binary.Base64)v2).setInitialBuffer(((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = 17;
    Object v1 = new byte[]{};
    Object v2 = true;
    Object v3 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v0).intValue()),((byte[])v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new byte[]{};
    Object v5 = ((org.apache.commons.codec.binary.Base64)v3).encode(((byte[])v4));
    Object v6 = ((org.apache.commons.codec.binary.Base64)v3).isUrlSafe();
    org.junit.Assert.assertEquals((Object)(true), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)2),Byte.valueOf((byte)26)};
    Object v1 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(((byte[])v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = 42;
    Object v1 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)88),Byte.valueOf((byte)0),Byte.valueOf((byte)69)};
    Object v1 = true;
    Object v2 = true;
    Object v3 = org.apache.commons.codec.binary.Base64.encodeBase64(((byte[])v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = false;
    Object v1 = new org.apache.commons.codec.binary.Base64((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = new byte[]{};
    Object v3 = 0;
    Object v4 = 22;
    ((org.apache.commons.codec.binary.Base64)v1).encode(((byte[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = new byte[]{Byte.valueOf((byte)3),Byte.valueOf((byte)-55)};
    Object v2 = false;
    Object v3 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v0).intValue()),((byte[])v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new byte[]{Byte.valueOf((byte)1)};
    Object v5 = 17;
    Object v6 = 1;
    ((org.apache.commons.codec.binary.Base64)v3).encode(((byte[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = false;
    Object v1 = new org.apache.commons.codec.binary.Base64((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = new byte[]{Byte.valueOf((byte)0)};
    Object v3 = 6;
    Object v4 = 16;
    ((org.apache.commons.codec.binary.Base64)v1).setInitialBuffer(((byte[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = false;
    Object v1 = new org.apache.commons.codec.binary.Base64((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = new byte[]{Byte.valueOf((byte)2),Byte.valueOf((byte)2),Byte.valueOf((byte)-24)};
    Object v3 = 12;
    Object v4 = 29;
    ((org.apache.commons.codec.binary.Base64)v1).decode(((byte[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = 17;
    Object v1 = new byte[]{};
    Object v2 = true;
    Object v3 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v0).intValue()),((byte[])v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((org.apache.commons.codec.binary.Base64)v3).hasData();
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = false;
    Object v1 = new org.apache.commons.codec.binary.Base64((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = new byte[]{Byte.valueOf((byte)2),Byte.valueOf((byte)26)};
    Object v3 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(((byte[])v2));
    Object v4 = ((org.apache.commons.codec.binary.Base64)v1).encode(((java.lang.Object)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(((byte[])v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)18),Byte.valueOf((byte)56),Byte.valueOf((byte)5)};
    Object v1 = true;
    Object v2 = false;
    Object v3 = org.apache.commons.codec.binary.Base64.encodeBase64(((byte[])v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)-38),Byte.valueOf((byte)63),Byte.valueOf((byte)39)};
    Object v1 = org.apache.commons.codec.binary.Base64.discardWhitespace(((byte[])v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)37)};
    Object v1 = org.apache.commons.codec.binary.Base64.decodeInteger(((byte[])v0));
    org.junit.Assert.assertEquals((Object)(0), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = 42;
    Object v1 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v0).intValue()));
    Object v2 = new byte[]{};
    Object v3 = org.apache.commons.codec.binary.Base64.discardWhitespace(((byte[])v2));
    Object v4 = ((org.apache.commons.codec.binary.Base64)v1).decode(((java.lang.Object)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)97)};
    Object v1 = org.apache.commons.codec.binary.Base64.discardNonBase64(((byte[])v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = Byte.valueOf((byte)-15);
    Object v1 = org.apache.commons.codec.binary.Base64.isBase64((((java.lang.Byte)v0).byteValue()));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = 1;
    Object v1 = new byte[]{Byte.valueOf((byte)5)};
    Object v2 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v0).intValue()),((byte[])v1));
    Object v3 = ((org.apache.commons.codec.binary.Base64)v2).avail();
    org.junit.Assert.assertEquals((Object)(0), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = 42;
    Object v1 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v0).intValue()));
    Object v2 = ((org.apache.commons.codec.binary.Base64)v1).isUrlSafe();
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = new byte[]{Byte.valueOf((byte)5)};
    Object v2 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v0).intValue()),((byte[])v1));
    Object v3 = new byte[]{};
    Object v4 = 0;
    Object v5 = 8;
    ((org.apache.commons.codec.binary.Base64)v2).encode(((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = false;
    Object v1 = new org.apache.commons.codec.binary.Base64((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = new byte[]{};
    Object v3 = 0;
    Object v4 = -9;
    ((org.apache.commons.codec.binary.Base64)v1).encode(((byte[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = 17;
    Object v1 = new byte[]{};
    Object v2 = true;
    Object v3 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v0).intValue()),((byte[])v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)10),Byte.valueOf((byte)1)};
    Object v5 = ((org.apache.commons.codec.binary.Base64)v3).decode(((byte[])v4));
    Object v6 = new byte[]{Byte.valueOf((byte)-7)};
    Object v7 = 1;
    Object v8 = 9;
    ((org.apache.commons.codec.binary.Base64)v3).decode(((byte[])v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = Byte.valueOf((byte)-44);
    Object v1 = org.apache.commons.codec.binary.Base64.isBase64((((java.lang.Byte)v0).byteValue()));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)0),Byte.valueOf((byte)0)};
    Object v1 = org.apache.commons.codec.binary.Base64.discardNonBase64(((byte[])v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = new byte[]{Byte.valueOf((byte)5)};
    Object v2 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v0).intValue()),((byte[])v1));
    Object v3 = new byte[]{Byte.valueOf((byte)4),Byte.valueOf((byte)2)};
    Object v4 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(((byte[])v3));
    Object v5 = ((org.apache.commons.codec.binary.Base64)v2).decode(((java.lang.Object)v4));
      org.junit.Assert.fail("Expected org.apache.commons.codec.DecoderException");
    } catch (org.apache.commons.codec.DecoderException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)-1),Byte.valueOf((byte)16),Byte.valueOf((byte)6)};
    Object v1 = org.apache.commons.codec.binary.Base64.discardNonBase64(((byte[])v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)120),Byte.valueOf((byte)33),Byte.valueOf((byte)13)};
    Object v1 = org.apache.commons.codec.binary.Base64.encodeBase64(((byte[])v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = 1;
    Object v1 = new byte[]{Byte.valueOf((byte)5)};
    Object v2 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v0).intValue()),((byte[])v1));
    Object v3 = new byte[]{Byte.valueOf((byte)39),Byte.valueOf((byte)59)};
    Object v4 = 0;
    Object v5 = 2;
    Object v6 = ((org.apache.commons.codec.binary.Base64)v2).readResults(((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    org.junit.Assert.assertEquals((Object)(0), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = 0;
    Object v1 = new byte[]{Byte.valueOf((byte)-126),Byte.valueOf((byte)1),Byte.valueOf((byte)-35)};
    Object v2 = false;
    Object v3 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v0).intValue()),((byte[])v1),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = true;
    Object v1 = new org.apache.commons.codec.binary.Base64((((java.lang.Boolean)v0).booleanValue()));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = 42;
    Object v1 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v0).intValue()));
    Object v2 = new byte[]{Byte.valueOf((byte)65),Byte.valueOf((byte)0)};
    Object v3 = org.apache.commons.codec.binary.Base64.decodeBase64(((byte[])v2));
    Object v4 = ((org.apache.commons.codec.binary.Base64)v1).encode(((java.lang.Object)v3));
    Object v5 = ((org.apache.commons.codec.binary.Base64)v1).avail();
    org.junit.Assert.assertEquals((Object)(0), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = 17;
    Object v1 = new byte[]{};
    Object v2 = true;
    Object v3 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v0).intValue()),((byte[])v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new byte[]{Byte.valueOf((byte)-1),Byte.valueOf((byte)16),Byte.valueOf((byte)6)};
    Object v5 = org.apache.commons.codec.binary.Base64.discardNonBase64(((byte[])v4));
    Object v6 = ((org.apache.commons.codec.binary.Base64)v3).encode(((java.lang.Object)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)3),Byte.valueOf((byte)43)};
    Object v1 = org.apache.commons.codec.binary.Base64.decodeBase64(((byte[])v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = 17;
    Object v1 = new byte[]{};
    Object v2 = true;
    Object v3 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v0).intValue()),((byte[])v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new byte[]{Byte.valueOf((byte)2),Byte.valueOf((byte)-49)};
    Object v5 = 85;
    Object v6 = 12;
    ((org.apache.commons.codec.binary.Base64)v3).encode(((byte[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = false;
    Object v1 = new org.apache.commons.codec.binary.Base64((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = 17;
    Object v3 = new byte[]{};
    Object v4 = true;
    Object v5 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v2).intValue()),((byte[])v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = ((org.apache.commons.codec.binary.Base64)v1).decode(((java.lang.Object)v5));
      org.junit.Assert.fail("Expected org.apache.commons.codec.DecoderException");
    } catch (org.apache.commons.codec.DecoderException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = 1;
    Object v1 = new byte[]{Byte.valueOf((byte)5)};
    Object v2 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v0).intValue()),((byte[])v1));
    Object v3 = new byte[]{Byte.valueOf((byte)-9),Byte.valueOf((byte)-5),Byte.valueOf((byte)21)};
    Object v4 = 1;
    Object v5 = 1;
    ((org.apache.commons.codec.binary.Base64)v2).setInitialBuffer(((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = 0;
    Object v1 = new byte[]{Byte.valueOf((byte)3),Byte.valueOf((byte)-55)};
    Object v2 = false;
    Object v3 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v0).intValue()),((byte[])v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new byte[]{Byte.valueOf((byte)120),Byte.valueOf((byte)33),Byte.valueOf((byte)13)};
    Object v5 = org.apache.commons.codec.binary.Base64.encodeBase64(((byte[])v4));
    Object v6 = ((org.apache.commons.codec.binary.Base64)v3).encode(((java.lang.Object)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = true;
    Object v1 = new org.apache.commons.codec.binary.Base64((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = new byte[]{Byte.valueOf((byte)-32)};
    Object v3 = ((org.apache.commons.codec.binary.Base64)v1).encode(((byte[])v2));
    Object v4 = ((org.apache.commons.codec.binary.Base64)v1).avail();
    org.junit.Assert.assertEquals((Object)(0), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)-17),Byte.valueOf((byte)-26)};
    Object v1 = true;
    Object v2 = org.apache.commons.codec.binary.Base64.encodeBase64(((byte[])v0),(((java.lang.Boolean)v1).booleanValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = 17;
    Object v1 = new byte[]{};
    Object v2 = true;
    Object v3 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v0).intValue()),((byte[])v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new byte[]{Byte.valueOf((byte)3),Byte.valueOf((byte)32),Byte.valueOf((byte)-51)};
    Object v5 = 1;
    Object v6 = 95;
    ((org.apache.commons.codec.binary.Base64)v3).encode(((byte[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = 17;
    Object v1 = new byte[]{};
    Object v2 = true;
    Object v3 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v0).intValue()),((byte[])v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)0)};
    Object v5 = 2;
    Object v6 = 0;
    ((org.apache.commons.codec.binary.Base64)v3).decode(((byte[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = false;
    Object v1 = new org.apache.commons.codec.binary.Base64((((java.lang.Boolean)v0).booleanValue()));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)18),Byte.valueOf((byte)59),Byte.valueOf((byte)18)};
    Object v1 = org.apache.commons.codec.binary.Base64.discardWhitespace(((byte[])v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = false;
    Object v1 = new org.apache.commons.codec.binary.Base64((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)55),Byte.valueOf((byte)1)};
    Object v3 = org.apache.commons.codec.binary.Base64.decodeBase64(((byte[])v2));
    Object v4 = ((org.apache.commons.codec.binary.Base64)v1).decode(((java.lang.Object)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)0),Byte.valueOf((byte)1)};
    Object v1 = org.apache.commons.codec.binary.Base64.discardNonBase64(((byte[])v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = new org.apache.commons.codec.binary.Base64((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = new byte[]{};
    Object v3 = 256;
    Object v4 = 1;
    ((org.apache.commons.codec.binary.Base64)v1).encode(((byte[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = 1;
    Object v1 = new byte[]{Byte.valueOf((byte)5)};
    Object v2 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v0).intValue()),((byte[])v1));
    Object v3 = ((org.apache.commons.codec.binary.Base64)v2).isUrlSafe();
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)2),Byte.valueOf((byte)0),Byte.valueOf((byte)-8)};
    Object v1 = false;
    Object v2 = org.apache.commons.codec.binary.Base64.encodeBase64(((byte[])v0),(((java.lang.Boolean)v1).booleanValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = 17;
    Object v1 = new byte[]{};
    Object v2 = true;
    Object v3 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v0).intValue()),((byte[])v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new byte[]{Byte.valueOf((byte)-1),Byte.valueOf((byte)1)};
    Object v5 = 23;
    Object v6 = -30;
    ((org.apache.commons.codec.binary.Base64)v3).encode(((byte[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = true;
    Object v1 = new org.apache.commons.codec.binary.Base64((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = new byte[]{Byte.valueOf((byte)-1),Byte.valueOf((byte)16),Byte.valueOf((byte)6)};
    Object v3 = org.apache.commons.codec.binary.Base64.discardNonBase64(((byte[])v2));
    Object v4 = ((org.apache.commons.codec.binary.Base64)v1).encode(((java.lang.Object)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = 54;
    Object v1 = new byte[]{Byte.valueOf((byte)2),Byte.valueOf((byte)0),Byte.valueOf((byte)29)};
    Object v2 = true;
    Object v3 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v0).intValue()),((byte[])v1),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = Byte.valueOf((byte)100);
    Object v1 = org.apache.commons.codec.binary.Base64.isBase64((((java.lang.Byte)v0).byteValue()));
    org.junit.Assert.assertEquals((Object)(true), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)-19),Byte.valueOf((byte)0)};
    Object v1 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(((byte[])v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = new byte[]{Byte.valueOf((byte)-126),Byte.valueOf((byte)1),Byte.valueOf((byte)-35)};
    Object v2 = false;
    Object v3 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v0).intValue()),((byte[])v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new byte[]{Byte.valueOf((byte)0)};
    Object v5 = 20;
    Object v6 = 3;
    ((org.apache.commons.codec.binary.Base64)v3).decode(((byte[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = false;
    Object v1 = new org.apache.commons.codec.binary.Base64((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = new byte[]{Byte.valueOf((byte)11)};
    Object v3 = ((org.apache.commons.codec.binary.Base64)v1).encode(((byte[])v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)-1),Byte.valueOf((byte)-22)};
    Object v1 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(((byte[])v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = false;
    Object v1 = new org.apache.commons.codec.binary.Base64((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = new byte[]{};
    Object v3 = -1;
    Object v4 = 40;
    ((org.apache.commons.codec.binary.Base64)v1).setInitialBuffer(((byte[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = 54;
    Object v1 = new byte[]{Byte.valueOf((byte)2),Byte.valueOf((byte)0),Byte.valueOf((byte)29)};
    Object v2 = true;
    Object v3 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v0).intValue()),((byte[])v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((org.apache.commons.codec.binary.Base64)v3).avail();
    org.junit.Assert.assertEquals((Object)(0), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = false;
    Object v1 = new org.apache.commons.codec.binary.Base64((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = Byte.valueOf((byte)-15);
    Object v3 = org.apache.commons.codec.binary.Base64.isBase64((((java.lang.Byte)v2).byteValue()));
    Object v4 = ((org.apache.commons.codec.binary.Base64)v1).encode(((java.lang.Object)v3));
      org.junit.Assert.fail("Expected org.apache.commons.codec.EncoderException");
    } catch (org.apache.commons.codec.EncoderException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)-1),Byte.valueOf((byte)10),Byte.valueOf((byte)-11)};
    Object v1 = org.apache.commons.codec.binary.Base64.decodeBase64(((byte[])v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = 42;
    Object v1 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v0).intValue()));
    Object v2 = false;
    Object v3 = new org.apache.commons.codec.binary.Base64((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new byte[]{Byte.valueOf((byte)-57),Byte.valueOf((byte)-35),Byte.valueOf((byte)0)};
    Object v5 = 2;
    Object v6 = 28;
    Object v7 = ((org.apache.commons.codec.binary.Base64)v3).readResults(((byte[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = ((org.apache.commons.codec.binary.Base64)v1).decode(((java.lang.Object)v7));
      org.junit.Assert.fail("Expected org.apache.commons.codec.DecoderException");
    } catch (org.apache.commons.codec.DecoderException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)1),Byte.valueOf((byte)7)};
    Object v1 = org.apache.commons.codec.binary.Base64.decodeBase64(((byte[])v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = 0;
    Object v1 = new byte[]{Byte.valueOf((byte)3),Byte.valueOf((byte)-55)};
    Object v2 = false;
    Object v3 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v0).intValue()),((byte[])v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new byte[]{};
    Object v5 = ((org.apache.commons.codec.binary.Base64)v3).decode(((byte[])v4));
    Object v6 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)19),Byte.valueOf((byte)27)};
    Object v7 = -8;
    Object v8 = -13;
    ((org.apache.commons.codec.binary.Base64)v3).decode(((byte[])v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new org.apache.commons.codec.binary.Base64();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)63),Byte.valueOf((byte)0)};
    Object v1 = org.apache.commons.codec.binary.Base64.decodeBase64(((byte[])v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = -9;
    Object v1 = new byte[]{Byte.valueOf((byte)1)};
    Object v2 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v0).intValue()),((byte[])v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)50),Byte.valueOf((byte)59),Byte.valueOf((byte)57)};
    Object v1 = org.apache.commons.codec.binary.Base64.discardNonBase64(((byte[])v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = false;
    Object v1 = new org.apache.commons.codec.binary.Base64((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = new byte[]{Byte.valueOf((byte)2),Byte.valueOf((byte)1),Byte.valueOf((byte)1)};
    Object v3 = ((org.apache.commons.codec.binary.Base64)v1).encode(((byte[])v2));
    Object v4 = new byte[]{};
    Object v5 = 1;
    Object v6 = 83;
    ((org.apache.commons.codec.binary.Base64)v1).setInitialBuffer(((byte[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = 1;
    Object v1 = new byte[]{Byte.valueOf((byte)5)};
    Object v2 = new org.apache.commons.codec.binary.Base64((((java.lang.Integer)v0).intValue()),((byte[])v1));
    Object v3 = ((org.apache.commons.codec.binary.Base64)v2).hasData();
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)-1)};
    Object v1 = org.apache.commons.codec.binary.Base64.discardNonBase64(((byte[])v0));
    org.junit.Assert.assertNotNull(v1);
  }
}
