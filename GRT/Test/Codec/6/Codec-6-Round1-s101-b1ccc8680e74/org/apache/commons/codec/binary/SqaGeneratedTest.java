package org.apache.commons.codec.binary;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.codec.binary.Base64InputStream(((java.io.InputStream)v0));
    Object v2 = ((org.apache.commons.codec.binary.Base64InputStream)v1).read();
    org.junit.Assert.assertEquals((Object)(-1), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)7)};
    Object v2 = 2;
    Object v3 = 0;
    Object v4 = ((java.io.InputStream)v0).read(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = false;
    Object v6 = 1;
    Object v7 = new byte[]{Byte.valueOf((byte)27),Byte.valueOf((byte)-22)};
    Object v8 = new org.apache.commons.codec.binary.Base64InputStream(((java.io.InputStream)v0),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Integer)v6).intValue()),((byte[])v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)7)};
    Object v2 = 2;
    Object v3 = 0;
    Object v4 = ((java.io.InputStream)v0).read(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = false;
    Object v6 = 1;
    Object v7 = new byte[]{Byte.valueOf((byte)27),Byte.valueOf((byte)-22)};
    Object v8 = new org.apache.commons.codec.binary.Base64InputStream(((java.io.InputStream)v0),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Integer)v6).intValue()),((byte[])v7));
    Object v9 = ((org.apache.commons.codec.binary.Base64InputStream)v8).read();
    org.junit.Assert.assertEquals((Object)(-1), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = ((java.io.InputStream)v0).read();
    Object v2 = java.io.OutputStream.nullOutputStream();
    Object v3 = ((java.io.InputStream)v0).transferTo(((java.io.OutputStream)v2));
    org.junit.Assert.assertEquals((Object)(0L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)7)};
    Object v2 = 2;
    Object v3 = 0;
    Object v4 = ((java.io.InputStream)v0).read(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = false;
    Object v6 = 1;
    Object v7 = new byte[]{Byte.valueOf((byte)27),Byte.valueOf((byte)-22)};
    Object v8 = new org.apache.commons.codec.binary.Base64InputStream(((java.io.InputStream)v0),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Integer)v6).intValue()),((byte[])v7));
    Object v9 = 24;
    Object v10 = ((java.io.InputStream)v8).readNBytes((((java.lang.Integer)v9).intValue()));
    Object v11 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)31),Byte.valueOf((byte)-20)};
    Object v12 = -25;
    Object v13 = 90;
    Object v14 = ((java.io.InputStream)v8).readNBytes(((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.codec.binary.Base64InputStream(((java.io.InputStream)v0));
    Object v2 = java.io.OutputStream.nullOutputStream();
    Object v3 = ((java.io.InputStream)v1).transferTo(((java.io.OutputStream)v2));
    Object v4 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)1)};
    Object v5 = 0;
    Object v6 = 6;
    Object v7 = ((org.apache.commons.codec.binary.Base64InputStream)v1).read(((byte[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)7)};
    Object v2 = 2;
    Object v3 = 0;
    Object v4 = ((java.io.InputStream)v0).read(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = false;
    Object v6 = 1;
    Object v7 = new byte[]{Byte.valueOf((byte)27),Byte.valueOf((byte)-22)};
    Object v8 = new org.apache.commons.codec.binary.Base64InputStream(((java.io.InputStream)v0),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Integer)v6).intValue()),((byte[])v7));
    Object v9 = new byte[]{};
    Object v10 = 1;
    Object v11 = -2;
    Object v12 = ((org.apache.commons.codec.binary.Base64InputStream)v8).read(((byte[])v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = false;
    Object v2 = new org.apache.commons.codec.binary.Base64InputStream(((java.io.InputStream)v0),(((java.lang.Boolean)v1).booleanValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = false;
    Object v2 = new org.apache.commons.codec.binary.Base64InputStream(((java.io.InputStream)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new byte[]{};
    Object v4 = ((java.io.FilterInputStream)v2).read(((byte[])v3));
    Object v5 = ((org.apache.commons.codec.binary.Base64InputStream)v2).markSupported();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = false;
    Object v2 = new org.apache.commons.codec.binary.Base64InputStream(((java.io.InputStream)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new byte[]{Byte.valueOf((byte)1)};
    Object v4 = ((java.io.FilterInputStream)v2).read(((byte[])v3));
    org.junit.Assert.assertEquals((Object)(-1), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 0;
    Object v2 = ((java.io.InputStream)v0).readNBytes((((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)7)};
    Object v2 = 2;
    Object v3 = 0;
    Object v4 = ((java.io.InputStream)v0).read(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = false;
    Object v6 = 1;
    Object v7 = new byte[]{Byte.valueOf((byte)27),Byte.valueOf((byte)-22)};
    Object v8 = new org.apache.commons.codec.binary.Base64InputStream(((java.io.InputStream)v0),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Integer)v6).intValue()),((byte[])v7));
    Object v9 = new byte[]{};
    Object v10 = 2;
    Object v11 = 36;
    Object v12 = ((org.apache.commons.codec.binary.Base64InputStream)v8).read(((byte[])v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 4;
    Object v2 = ((java.io.InputStream)v0).readNBytes((((java.lang.Integer)v1).intValue()));
    Object v3 = new org.apache.commons.codec.binary.Base64InputStream(((java.io.InputStream)v0));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new byte[]{};
    Object v2 = 37;
    Object v3 = -18;
    Object v4 = ((java.io.InputStream)v0).readNBytes(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = false;
    Object v2 = new org.apache.commons.codec.binary.Base64InputStream(((java.io.InputStream)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = java.io.OutputStream.nullOutputStream();
    Object v4 = ((java.io.InputStream)v2).transferTo(((java.io.OutputStream)v3));
    org.junit.Assert.assertEquals((Object)(0L), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)7)};
    Object v2 = 2;
    Object v3 = 0;
    Object v4 = ((java.io.InputStream)v0).read(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = false;
    Object v6 = 1;
    Object v7 = new byte[]{Byte.valueOf((byte)27),Byte.valueOf((byte)-22)};
    Object v8 = new org.apache.commons.codec.binary.Base64InputStream(((java.io.InputStream)v0),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Integer)v6).intValue()),((byte[])v7));
    Object v9 = ((java.io.FilterInputStream)v8).available();
    org.junit.Assert.assertEquals((Object)(0), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = false;
    Object v2 = new org.apache.commons.codec.binary.Base64InputStream(((java.io.InputStream)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = -30;
    Object v4 = ((java.io.InputStream)v2).readNBytes((((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)7)};
    Object v2 = 2;
    Object v3 = 0;
    Object v4 = ((java.io.InputStream)v0).read(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = false;
    Object v6 = 1;
    Object v7 = new byte[]{Byte.valueOf((byte)27),Byte.valueOf((byte)-22)};
    Object v8 = new org.apache.commons.codec.binary.Base64InputStream(((java.io.InputStream)v0),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Integer)v6).intValue()),((byte[])v7));
    Object v9 = 98;
    Object v10 = ((java.io.InputStream)v8).readNBytes((((java.lang.Integer)v9).intValue()));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)7)};
    Object v2 = 2;
    Object v3 = 0;
    Object v4 = ((java.io.InputStream)v0).read(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = false;
    Object v6 = 1;
    Object v7 = new byte[]{Byte.valueOf((byte)27),Byte.valueOf((byte)-22)};
    Object v8 = new org.apache.commons.codec.binary.Base64InputStream(((java.io.InputStream)v0),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Integer)v6).intValue()),((byte[])v7));
    Object v9 = new byte[]{Byte.valueOf((byte)-27),Byte.valueOf((byte)-7),Byte.valueOf((byte)55)};
    Object v10 = 29;
    Object v11 = 0;
    Object v12 = ((org.apache.commons.codec.binary.Base64InputStream)v8).read(((byte[])v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)7)};
    Object v2 = 2;
    Object v3 = 0;
    Object v4 = ((java.io.InputStream)v0).read(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = false;
    Object v6 = 1;
    Object v7 = new byte[]{Byte.valueOf((byte)27),Byte.valueOf((byte)-22)};
    Object v8 = new org.apache.commons.codec.binary.Base64InputStream(((java.io.InputStream)v0),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Integer)v6).intValue()),((byte[])v7));
    Object v9 = 1;
    Object v10 = ((java.io.InputStream)v8).readNBytes((((java.lang.Integer)v9).intValue()));
    Object v11 = java.io.OutputStream.nullOutputStream();
    Object v12 = ((java.io.InputStream)v8).transferTo(((java.io.OutputStream)v11));
    org.junit.Assert.assertEquals((Object)(0L), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = false;
    Object v2 = new org.apache.commons.codec.binary.Base64InputStream(((java.io.InputStream)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = 0;
    ((java.io.FilterInputStream)v2).mark((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 4;
    Object v2 = ((java.io.InputStream)v0).readNBytes((((java.lang.Integer)v1).intValue()));
    Object v3 = new org.apache.commons.codec.binary.Base64InputStream(((java.io.InputStream)v0));
    Object v4 = 19;
    Object v5 = ((java.io.InputStream)v3).readNBytes((((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 4;
    Object v2 = ((java.io.InputStream)v0).readNBytes((((java.lang.Integer)v1).intValue()));
    Object v3 = new org.apache.commons.codec.binary.Base64InputStream(((java.io.InputStream)v0));
    Object v4 = java.io.OutputStream.nullOutputStream();
    Object v5 = ((java.io.InputStream)v3).transferTo(((java.io.OutputStream)v4));
    org.junit.Assert.assertEquals((Object)(0L), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)7)};
    Object v2 = 2;
    Object v3 = 0;
    Object v4 = ((java.io.InputStream)v0).read(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = false;
    Object v6 = 1;
    Object v7 = new byte[]{Byte.valueOf((byte)27),Byte.valueOf((byte)-22)};
    Object v8 = new org.apache.commons.codec.binary.Base64InputStream(((java.io.InputStream)v0),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Integer)v6).intValue()),((byte[])v7));
    ((java.io.FilterInputStream)v8).close();
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = false;
    Object v2 = new org.apache.commons.codec.binary.Base64InputStream(((java.io.InputStream)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = 10;
    ((java.io.FilterInputStream)v2).mark((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 4;
    Object v2 = ((java.io.InputStream)v0).readNBytes((((java.lang.Integer)v1).intValue()));
    Object v3 = new org.apache.commons.codec.binary.Base64InputStream(((java.io.InputStream)v0));
    Object v4 = 1;
    Object v5 = ((java.io.InputStream)v3).readNBytes((((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.apache.commons.codec.binary.Base64InputStream)v3).read();
    org.junit.Assert.assertEquals((Object)(-1), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = false;
    Object v2 = new org.apache.commons.codec.binary.Base64InputStream(((java.io.InputStream)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = ((java.io.InputStream)v2).readAllBytes();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = ((java.io.InputStream)v0).readAllBytes();
    Object v2 = 32;
    Object v3 = ((java.io.InputStream)v0).readNBytes((((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = false;
    Object v2 = new org.apache.commons.codec.binary.Base64InputStream(((java.io.InputStream)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = 120;
    Object v4 = ((java.io.InputStream)v2).readNBytes((((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = false;
    Object v2 = new org.apache.commons.codec.binary.Base64InputStream(((java.io.InputStream)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = 0L;
    Object v4 = ((java.io.FilterInputStream)v2).skip((((java.lang.Long)v3).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)7)};
    Object v2 = 2;
    Object v3 = 0;
    Object v4 = ((java.io.InputStream)v0).read(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = false;
    Object v6 = 1;
    Object v7 = new byte[]{Byte.valueOf((byte)27),Byte.valueOf((byte)-22)};
    Object v8 = new org.apache.commons.codec.binary.Base64InputStream(((java.io.InputStream)v0),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Integer)v6).intValue()),((byte[])v7));
    Object v9 = new byte[]{Byte.valueOf((byte)76),Byte.valueOf((byte)-1)};
    Object v10 = -2;
    Object v11 = 43;
    Object v12 = ((java.io.InputStream)v8).readNBytes(((byte[])v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = false;
    Object v2 = new org.apache.commons.codec.binary.Base64InputStream(((java.io.InputStream)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new byte[]{Byte.valueOf((byte)67),Byte.valueOf((byte)2),Byte.valueOf((byte)0)};
    Object v4 = 1;
    Object v5 = 5;
    Object v6 = ((org.apache.commons.codec.binary.Base64InputStream)v2).read(((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.codec.binary.Base64InputStream(((java.io.InputStream)v0));
    Object v2 = true;
    Object v3 = new org.apache.commons.codec.binary.Base64InputStream(((java.io.InputStream)v1),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = ((java.io.InputStream)v0).readAllBytes();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = false;
    Object v2 = new org.apache.commons.codec.binary.Base64InputStream(((java.io.InputStream)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)0),Byte.valueOf((byte)-39)};
    Object v4 = -1;
    Object v5 = -15;
    Object v6 = ((org.apache.commons.codec.binary.Base64InputStream)v2).read(((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)7)};
    Object v2 = 2;
    Object v3 = 0;
    Object v4 = ((java.io.InputStream)v0).read(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = false;
    Object v6 = 1;
    Object v7 = new byte[]{Byte.valueOf((byte)27),Byte.valueOf((byte)-22)};
    Object v8 = new org.apache.commons.codec.binary.Base64InputStream(((java.io.InputStream)v0),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Integer)v6).intValue()),((byte[])v7));
    Object v9 = new byte[]{Byte.valueOf((byte)75),Byte.valueOf((byte)0),Byte.valueOf((byte)-27)};
    Object v10 = 1;
    Object v11 = -1;
    Object v12 = ((org.apache.commons.codec.binary.Base64InputStream)v8).read(((byte[])v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.codec.binary.Base64InputStream(((java.io.InputStream)v0));
    Object v2 = new byte[]{Byte.valueOf((byte)8),Byte.valueOf((byte)-12),Byte.valueOf((byte)12)};
    Object v3 = 1;
    Object v4 = 17;
    Object v5 = ((org.apache.commons.codec.binary.Base64InputStream)v1).read(((byte[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = false;
    Object v2 = new org.apache.commons.codec.binary.Base64InputStream(((java.io.InputStream)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = java.io.OutputStream.nullOutputStream();
    Object v4 = ((java.io.InputStream)v2).transferTo(((java.io.OutputStream)v3));
    Object v5 = new byte[]{Byte.valueOf((byte)-39)};
    Object v6 = 15;
    Object v7 = 1;
    Object v8 = ((org.apache.commons.codec.binary.Base64InputStream)v2).read(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = false;
    Object v2 = new org.apache.commons.codec.binary.Base64InputStream(((java.io.InputStream)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new byte[]{};
    Object v4 = ((java.io.FilterInputStream)v2).read(((byte[])v3));
    Object v5 = ((org.apache.commons.codec.binary.Base64InputStream)v2).read();
    org.junit.Assert.assertEquals((Object)(-1), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.codec.binary.Base64InputStream(((java.io.InputStream)v0));
    Object v2 = true;
    Object v3 = 0;
    Object v4 = new byte[]{};
    Object v5 = new org.apache.commons.codec.binary.Base64InputStream(((java.io.InputStream)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Integer)v3).intValue()),((byte[])v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.codec.binary.Base64InputStream(((java.io.InputStream)v0));
    Object v2 = new byte[]{};
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = ((org.apache.commons.codec.binary.Base64InputStream)v1).read(((byte[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = false;
    Object v2 = new org.apache.commons.codec.binary.Base64InputStream(((java.io.InputStream)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new org.apache.commons.codec.binary.Base64InputStream(((java.io.InputStream)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new byte[]{};
    Object v2 = -16;
    Object v3 = 32;
    Object v4 = ((java.io.InputStream)v0).readNBytes(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 1;
    Object v2 = ((java.io.InputStream)v0).readNBytes((((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.codec.binary.Base64InputStream(((java.io.InputStream)v0));
    Object v2 = true;
    Object v3 = new org.apache.commons.codec.binary.Base64InputStream(((java.io.InputStream)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((java.io.InputStream)v3).read();
    Object v5 = java.io.OutputStream.nullOutputStream();
    Object v6 = ((java.io.InputStream)v3).transferTo(((java.io.OutputStream)v5));
    org.junit.Assert.assertEquals((Object)(0L), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.codec.binary.Base64InputStream(((java.io.InputStream)v0));
    Object v2 = true;
    Object v3 = new org.apache.commons.codec.binary.Base64InputStream(((java.io.InputStream)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 0L;
    Object v5 = ((java.io.FilterInputStream)v3).skip((((java.lang.Long)v4).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new byte[]{Byte.valueOf((byte)79)};
    Object v2 = ((java.io.InputStream)v0).read(((byte[])v1));
    Object v3 = java.io.OutputStream.nullOutputStream();
    Object v4 = ((java.io.InputStream)v0).transferTo(((java.io.OutputStream)v3));
    org.junit.Assert.assertEquals((Object)(0L), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)7)};
    Object v2 = 2;
    Object v3 = 0;
    Object v4 = ((java.io.InputStream)v0).read(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = false;
    Object v6 = 1;
    Object v7 = new byte[]{Byte.valueOf((byte)27),Byte.valueOf((byte)-22)};
    Object v8 = new org.apache.commons.codec.binary.Base64InputStream(((java.io.InputStream)v0),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Integer)v6).intValue()),((byte[])v7));
    Object v9 = new byte[]{Byte.valueOf((byte)5),Byte.valueOf((byte)0),Byte.valueOf((byte)0)};
    Object v10 = 6;
    Object v11 = 1;
    Object v12 = ((java.io.InputStream)v8).readNBytes(((byte[])v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.codec.binary.Base64InputStream(((java.io.InputStream)v0));
    Object v2 = ((java.io.InputStream)v1).read();
    Object v3 = java.io.OutputStream.nullOutputStream();
    Object v4 = 92;
    ((java.io.OutputStream)v3).write((((java.lang.Integer)v4).intValue()));
    Object v5 = null;
    Object v6 = ((java.io.InputStream)v1).transferTo(((java.io.OutputStream)v3));
    org.junit.Assert.assertEquals((Object)(0L), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 4;
    Object v2 = ((java.io.InputStream)v0).readNBytes((((java.lang.Integer)v1).intValue()));
    Object v3 = new org.apache.commons.codec.binary.Base64InputStream(((java.io.InputStream)v0));
    Object v4 = new byte[]{Byte.valueOf((byte)1)};
    Object v5 = 82;
    Object v6 = -32;
    Object v7 = ((java.io.InputStream)v3).readNBytes(((byte[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = false;
    Object v2 = new org.apache.commons.codec.binary.Base64InputStream(((java.io.InputStream)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new org.apache.commons.codec.binary.Base64InputStream(((java.io.InputStream)v2));
    Object v4 = ((java.io.FilterInputStream)v3).available();
    org.junit.Assert.assertEquals((Object)(0), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.codec.binary.Base64InputStream(((java.io.InputStream)v0));
    Object v2 = true;
    Object v3 = new org.apache.commons.codec.binary.Base64InputStream(((java.io.InputStream)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new byte[]{Byte.valueOf((byte)-1),Byte.valueOf((byte)4),Byte.valueOf((byte)65)};
    Object v5 = 50;
    Object v6 = 1;
    Object v7 = ((org.apache.commons.codec.binary.Base64InputStream)v3).read(((byte[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 4;
    Object v2 = ((java.io.InputStream)v0).readNBytes((((java.lang.Integer)v1).intValue()));
    Object v3 = new org.apache.commons.codec.binary.Base64InputStream(((java.io.InputStream)v0));
    Object v4 = ((org.apache.commons.codec.binary.Base64InputStream)v3).markSupported();
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = false;
    Object v2 = new org.apache.commons.codec.binary.Base64InputStream(((java.io.InputStream)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new org.apache.commons.codec.binary.Base64InputStream(((java.io.InputStream)v2));
    Object v4 = -42L;
    Object v5 = ((java.io.FilterInputStream)v3).skip((((java.lang.Long)v4).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = false;
    Object v2 = new org.apache.commons.codec.binary.Base64InputStream(((java.io.InputStream)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = 1;
    Object v5 = new byte[]{Byte.valueOf((byte)0)};
    Object v6 = new org.apache.commons.codec.binary.Base64InputStream(((java.io.InputStream)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Integer)v4).intValue()),((byte[])v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = false;
    Object v2 = new org.apache.commons.codec.binary.Base64InputStream(((java.io.InputStream)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = 1;
    Object v5 = new byte[]{Byte.valueOf((byte)0)};
    Object v6 = new org.apache.commons.codec.binary.Base64InputStream(((java.io.InputStream)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Integer)v4).intValue()),((byte[])v5));
    Object v7 = new byte[]{};
    Object v8 = 47;
    Object v9 = 14;
    Object v10 = ((java.io.InputStream)v6).readNBytes(((byte[])v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.codec.binary.Base64InputStream(((java.io.InputStream)v0));
    Object v2 = true;
    Object v3 = 0;
    Object v4 = new byte[]{};
    Object v5 = new org.apache.commons.codec.binary.Base64InputStream(((java.io.InputStream)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Integer)v3).intValue()),((byte[])v4));
    Object v6 = 3;
    Object v7 = ((java.io.InputStream)v5).readNBytes((((java.lang.Integer)v6).intValue()));
    Object v8 = ((org.apache.commons.codec.binary.Base64InputStream)v5).read();
    org.junit.Assert.assertEquals((Object)(-1), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = false;
    Object v2 = new org.apache.commons.codec.binary.Base64InputStream(((java.io.InputStream)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new org.apache.commons.codec.binary.Base64InputStream(((java.io.InputStream)v2));
    Object v4 = 22;
    Object v5 = ((java.io.InputStream)v3).readNBytes((((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = false;
    Object v2 = new org.apache.commons.codec.binary.Base64InputStream(((java.io.InputStream)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = 1;
    Object v5 = new byte[]{Byte.valueOf((byte)0)};
    Object v6 = new org.apache.commons.codec.binary.Base64InputStream(((java.io.InputStream)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Integer)v4).intValue()),((byte[])v5));
    Object v7 = java.io.OutputStream.nullOutputStream();
    Object v8 = ((java.io.InputStream)v6).transferTo(((java.io.OutputStream)v7));
    org.junit.Assert.assertEquals((Object)(0L), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.codec.binary.Base64InputStream(((java.io.InputStream)v0));
    Object v2 = true;
    Object v3 = 0;
    Object v4 = new byte[]{};
    Object v5 = new org.apache.commons.codec.binary.Base64InputStream(((java.io.InputStream)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Integer)v3).intValue()),((byte[])v4));
    Object v6 = java.io.OutputStream.nullOutputStream();
    Object v7 = ((java.io.InputStream)v5).transferTo(((java.io.OutputStream)v6));
    org.junit.Assert.assertEquals((Object)(0L), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = false;
    Object v2 = new org.apache.commons.codec.binary.Base64InputStream(((java.io.InputStream)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)32)};
    Object v4 = -1;
    Object v5 = 0;
    Object v6 = ((java.io.InputStream)v2).readNBytes(((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)7)};
    Object v2 = 2;
    Object v3 = 0;
    Object v4 = ((java.io.InputStream)v0).read(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = false;
    Object v6 = 1;
    Object v7 = new byte[]{Byte.valueOf((byte)27),Byte.valueOf((byte)-22)};
    Object v8 = new org.apache.commons.codec.binary.Base64InputStream(((java.io.InputStream)v0),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Integer)v6).intValue()),((byte[])v7));
    Object v9 = ((org.apache.commons.codec.binary.Base64InputStream)v8).markSupported();
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = false;
    Object v2 = new org.apache.commons.codec.binary.Base64InputStream(((java.io.InputStream)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = 1;
    Object v5 = new byte[]{Byte.valueOf((byte)0)};
    Object v6 = new org.apache.commons.codec.binary.Base64InputStream(((java.io.InputStream)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Integer)v4).intValue()),((byte[])v5));
    Object v7 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)1)};
    Object v8 = -8;
    Object v9 = 0;
    Object v10 = ((org.apache.commons.codec.binary.Base64InputStream)v6).read(((byte[])v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 4;
    Object v2 = ((java.io.InputStream)v0).readNBytes((((java.lang.Integer)v1).intValue()));
    Object v3 = new org.apache.commons.codec.binary.Base64InputStream(((java.io.InputStream)v0));
    Object v4 = ((org.apache.commons.codec.binary.Base64InputStream)v3).read();
    org.junit.Assert.assertEquals((Object)(-1), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 4;
    Object v2 = ((java.io.InputStream)v0).readNBytes((((java.lang.Integer)v1).intValue()));
    Object v3 = new org.apache.commons.codec.binary.Base64InputStream(((java.io.InputStream)v0));
    Object v4 = java.io.OutputStream.nullOutputStream();
    Object v5 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)117),Byte.valueOf((byte)-9)};
    ((java.io.OutputStream)v4).write(((byte[])v5));
    Object v6 = null;
    Object v7 = ((java.io.InputStream)v3).transferTo(((java.io.OutputStream)v4));
    org.junit.Assert.assertEquals((Object)(0L), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 4;
    Object v2 = ((java.io.InputStream)v0).readNBytes((((java.lang.Integer)v1).intValue()));
    Object v3 = new org.apache.commons.codec.binary.Base64InputStream(((java.io.InputStream)v0));
    Object v4 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)5),Byte.valueOf((byte)56)};
    Object v5 = ((java.io.FilterInputStream)v3).read(((byte[])v4));
    Object v6 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)0),Byte.valueOf((byte)1)};
    Object v7 = -13;
    Object v8 = 1;
    Object v9 = ((org.apache.commons.codec.binary.Base64InputStream)v3).read(((byte[])v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = java.io.OutputStream.nullOutputStream();
    Object v2 = ((java.io.InputStream)v0).transferTo(((java.io.OutputStream)v1));
    org.junit.Assert.assertEquals((Object)(0L), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.codec.binary.Base64InputStream(((java.io.InputStream)v0));
    Object v2 = false;
    Object v3 = new org.apache.commons.codec.binary.Base64InputStream(((java.io.InputStream)v1),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = false;
    Object v2 = new org.apache.commons.codec.binary.Base64InputStream(((java.io.InputStream)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = 1;
    Object v5 = new byte[]{Byte.valueOf((byte)0)};
    Object v6 = new org.apache.commons.codec.binary.Base64InputStream(((java.io.InputStream)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Integer)v4).intValue()),((byte[])v5));
    Object v7 = ((org.apache.commons.codec.binary.Base64InputStream)v6).markSupported();
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = false;
    Object v2 = new org.apache.commons.codec.binary.Base64InputStream(((java.io.InputStream)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new byte[]{Byte.valueOf((byte)18),Byte.valueOf((byte)1)};
    Object v4 = -21;
    Object v5 = 0;
    Object v6 = ((java.io.InputStream)v2).readNBytes(((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.codec.binary.Base64InputStream(((java.io.InputStream)v0));
    Object v2 = false;
    Object v3 = new org.apache.commons.codec.binary.Base64InputStream(((java.io.InputStream)v1),(((java.lang.Boolean)v2).booleanValue()));
    ((java.io.FilterInputStream)v3).close();
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = false;
    Object v2 = new org.apache.commons.codec.binary.Base64InputStream(((java.io.InputStream)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new org.apache.commons.codec.binary.Base64InputStream(((java.io.InputStream)v2));
    Object v4 = ((java.io.InputStream)v3).read();
    Object v5 = new byte[]{Byte.valueOf((byte)54),Byte.valueOf((byte)89)};
    Object v6 = 72;
    Object v7 = 0;
    Object v8 = ((java.io.InputStream)v3).readNBytes(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 4;
    Object v2 = ((java.io.InputStream)v0).readNBytes((((java.lang.Integer)v1).intValue()));
    Object v3 = new org.apache.commons.codec.binary.Base64InputStream(((java.io.InputStream)v0));
    Object v4 = -82;
    ((java.io.FilterInputStream)v3).mark((((java.lang.Integer)v4).intValue()));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.codec.binary.Base64InputStream(((java.io.InputStream)v0));
    Object v2 = false;
    Object v3 = new org.apache.commons.codec.binary.Base64InputStream(((java.io.InputStream)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((java.io.InputStream)v3).readAllBytes();
    Object v5 = java.io.OutputStream.nullOutputStream();
    Object v6 = ((java.io.InputStream)v3).transferTo(((java.io.OutputStream)v5));
    org.junit.Assert.assertEquals((Object)(0L), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.codec.binary.Base64InputStream(((java.io.InputStream)v0));
    Object v2 = false;
    Object v3 = new org.apache.commons.codec.binary.Base64InputStream(((java.io.InputStream)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = java.io.OutputStream.nullOutputStream();
    Object v5 = ((java.io.InputStream)v3).transferTo(((java.io.OutputStream)v4));
    org.junit.Assert.assertEquals((Object)(0L), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.codec.binary.Base64InputStream(((java.io.InputStream)v0));
    Object v2 = false;
    Object v3 = new org.apache.commons.codec.binary.Base64InputStream(((java.io.InputStream)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((org.apache.commons.codec.binary.Base64InputStream)v3).markSupported();
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = true;
    Object v2 = -4;
    Object v3 = new byte[]{Byte.valueOf((byte)54),Byte.valueOf((byte)0),Byte.valueOf((byte)1)};
    Object v4 = new org.apache.commons.codec.binary.Base64InputStream(((java.io.InputStream)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Integer)v2).intValue()),((byte[])v3));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = false;
    Object v2 = new org.apache.commons.codec.binary.Base64InputStream(((java.io.InputStream)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new org.apache.commons.codec.binary.Base64InputStream(((java.io.InputStream)v2));
    Object v4 = ((org.apache.commons.codec.binary.Base64InputStream)v3).read();
    org.junit.Assert.assertEquals((Object)(-1), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.codec.binary.Base64InputStream(((java.io.InputStream)v0));
    Object v2 = true;
    Object v3 = 0;
    Object v4 = new byte[]{};
    Object v5 = new org.apache.commons.codec.binary.Base64InputStream(((java.io.InputStream)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Integer)v3).intValue()),((byte[])v4));
    Object v6 = 32;
    Object v7 = ((java.io.InputStream)v5).readNBytes((((java.lang.Integer)v6).intValue()));
    Object v8 = java.io.OutputStream.nullOutputStream();
    Object v9 = new byte[]{Byte.valueOf((byte)59)};
    ((java.io.OutputStream)v8).write(((byte[])v9));
    Object v10 = null;
    Object v11 = ((java.io.InputStream)v5).transferTo(((java.io.OutputStream)v8));
    org.junit.Assert.assertEquals((Object)(0L), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = false;
    Object v2 = new org.apache.commons.codec.binary.Base64InputStream(((java.io.InputStream)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = ((org.apache.commons.codec.binary.Base64InputStream)v2).read();
    org.junit.Assert.assertEquals((Object)(-1), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)7)};
    Object v2 = 2;
    Object v3 = 0;
    Object v4 = ((java.io.InputStream)v0).read(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = false;
    Object v6 = 1;
    Object v7 = new byte[]{Byte.valueOf((byte)27),Byte.valueOf((byte)-22)};
    Object v8 = new org.apache.commons.codec.binary.Base64InputStream(((java.io.InputStream)v0),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Integer)v6).intValue()),((byte[])v7));
    Object v9 = new byte[]{Byte.valueOf((byte)1)};
    Object v10 = 0;
    Object v11 = 0;
    Object v12 = ((java.io.InputStream)v8).readNBytes(((byte[])v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    org.junit.Assert.assertEquals((Object)(0), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = false;
    Object v2 = new org.apache.commons.codec.binary.Base64InputStream(((java.io.InputStream)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)39),Byte.valueOf((byte)-10)};
    Object v4 = ((java.io.InputStream)v2).read(((byte[])v3));
    Object v5 = java.io.OutputStream.nullOutputStream();
    Object v6 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)0),Byte.valueOf((byte)0)};
    ((java.io.OutputStream)v5).write(((byte[])v6));
    Object v7 = null;
    Object v8 = ((java.io.InputStream)v2).transferTo(((java.io.OutputStream)v5));
    org.junit.Assert.assertEquals((Object)(0L), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)7)};
    Object v2 = 2;
    Object v3 = 0;
    Object v4 = ((java.io.InputStream)v0).read(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = false;
    Object v6 = 1;
    Object v7 = new byte[]{Byte.valueOf((byte)27),Byte.valueOf((byte)-22)};
    Object v8 = new org.apache.commons.codec.binary.Base64InputStream(((java.io.InputStream)v0),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Integer)v6).intValue()),((byte[])v7));
    Object v9 = new byte[]{Byte.valueOf((byte)54),Byte.valueOf((byte)59)};
    Object v10 = 1;
    Object v11 = 1;
    Object v12 = ((org.apache.commons.codec.binary.Base64InputStream)v8).read(((byte[])v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    org.junit.Assert.assertEquals((Object)(-1), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = false;
    Object v2 = new org.apache.commons.codec.binary.Base64InputStream(((java.io.InputStream)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new org.apache.commons.codec.binary.Base64InputStream(((java.io.InputStream)v2));
    Object v4 = java.io.OutputStream.nullOutputStream();
    Object v5 = ((java.io.InputStream)v3).transferTo(((java.io.OutputStream)v4));
    Object v6 = 0;
    Object v7 = ((java.io.InputStream)v3).readNBytes((((java.lang.Integer)v6).intValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = false;
    Object v2 = new org.apache.commons.codec.binary.Base64InputStream(((java.io.InputStream)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = 1;
    Object v5 = new byte[]{Byte.valueOf((byte)0)};
    Object v6 = new org.apache.commons.codec.binary.Base64InputStream(((java.io.InputStream)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Integer)v4).intValue()),((byte[])v5));
    Object v7 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)73)};
    Object v8 = 4;
    Object v9 = 0;
    Object v10 = ((java.io.InputStream)v6).readNBytes(((byte[])v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.codec.binary.Base64InputStream(((java.io.InputStream)v0));
    Object v2 = true;
    Object v3 = new org.apache.commons.codec.binary.Base64InputStream(((java.io.InputStream)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = java.io.OutputStream.nullOutputStream();
    Object v5 = ((java.io.InputStream)v3).transferTo(((java.io.OutputStream)v4));
    org.junit.Assert.assertEquals((Object)(0L), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)7)};
    Object v2 = 2;
    Object v3 = 0;
    Object v4 = ((java.io.InputStream)v0).read(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = false;
    Object v6 = 1;
    Object v7 = new byte[]{Byte.valueOf((byte)27),Byte.valueOf((byte)-22)};
    Object v8 = new org.apache.commons.codec.binary.Base64InputStream(((java.io.InputStream)v0),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Integer)v6).intValue()),((byte[])v7));
    Object v9 = ((java.io.InputStream)v8).read();
    Object v10 = java.io.OutputStream.nullOutputStream();
    Object v11 = ((java.io.InputStream)v8).transferTo(((java.io.OutputStream)v10));
    org.junit.Assert.assertEquals((Object)(0L), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)65)};
    Object v2 = 4;
    Object v3 = 2;
    Object v4 = ((java.io.InputStream)v0).readNBytes(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.codec.binary.Base64InputStream(((java.io.InputStream)v0));
    Object v2 = false;
    Object v3 = new org.apache.commons.codec.binary.Base64InputStream(((java.io.InputStream)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = java.io.OutputStream.nullOutputStream();
    Object v5 = ((java.io.InputStream)v3).transferTo(((java.io.OutputStream)v4));
    Object v6 = new byte[]{Byte.valueOf((byte)8),Byte.valueOf((byte)41)};
    Object v7 = ((java.io.FilterInputStream)v3).read(((byte[])v6));
    org.junit.Assert.assertEquals((Object)(-1), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.codec.binary.Base64InputStream(((java.io.InputStream)v0));
    Object v2 = false;
    Object v3 = new org.apache.commons.codec.binary.Base64InputStream(((java.io.InputStream)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = java.io.OutputStream.nullOutputStream();
    Object v5 = 4;
    ((java.io.OutputStream)v4).write((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    Object v7 = ((java.io.InputStream)v3).transferTo(((java.io.OutputStream)v4));
    org.junit.Assert.assertEquals((Object)(0L), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.codec.binary.Base64InputStream(((java.io.InputStream)v0));
    Object v2 = true;
    Object v3 = new org.apache.commons.codec.binary.Base64InputStream(((java.io.InputStream)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new byte[]{Byte.valueOf((byte)2),Byte.valueOf((byte)4),Byte.valueOf((byte)1)};
    Object v5 = 2;
    Object v6 = -46;
    Object v7 = ((java.io.InputStream)v3).readNBytes(((byte[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = false;
    Object v2 = new org.apache.commons.codec.binary.Base64InputStream(((java.io.InputStream)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = 1;
    Object v5 = new byte[]{Byte.valueOf((byte)0)};
    Object v6 = new org.apache.commons.codec.binary.Base64InputStream(((java.io.InputStream)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Integer)v4).intValue()),((byte[])v5));
    Object v7 = ((org.apache.commons.codec.binary.Base64InputStream)v6).read();
    org.junit.Assert.assertEquals((Object)(-1), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = false;
    Object v2 = new org.apache.commons.codec.binary.Base64InputStream(((java.io.InputStream)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = ((java.io.InputStream)v2).read();
    Object v4 = java.io.OutputStream.nullOutputStream();
    Object v5 = ((java.io.InputStream)v2).transferTo(((java.io.OutputStream)v4));
    org.junit.Assert.assertEquals((Object)(0L), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = false;
    Object v2 = new org.apache.commons.codec.binary.Base64InputStream(((java.io.InputStream)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new byte[]{Byte.valueOf((byte)-26),Byte.valueOf((byte)0),Byte.valueOf((byte)21)};
    Object v4 = 1;
    Object v5 = 2;
    Object v6 = ((org.apache.commons.codec.binary.Base64InputStream)v2).read(((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    org.junit.Assert.assertEquals((Object)(-1), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.codec.binary.Base64InputStream(((java.io.InputStream)v0));
    Object v2 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)12)};
    Object v3 = 92;
    Object v4 = 90;
    Object v5 = ((java.io.InputStream)v1).readNBytes(((byte[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = false;
    Object v2 = new org.apache.commons.codec.binary.Base64InputStream(((java.io.InputStream)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new org.apache.commons.codec.binary.Base64InputStream(((java.io.InputStream)v2));
    ((java.io.FilterInputStream)v3).reset();
    Object v4 = null;
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = false;
    Object v2 = new org.apache.commons.codec.binary.Base64InputStream(((java.io.InputStream)v0),(((java.lang.Boolean)v1).booleanValue()));
    Object v3 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)2),Byte.valueOf((byte)4)};
    Object v4 = 0;
    Object v5 = 61;
    Object v6 = ((org.apache.commons.codec.binary.Base64InputStream)v2).read(((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.codec.binary.Base64InputStream(((java.io.InputStream)v0));
    Object v2 = true;
    Object v3 = 0;
    Object v4 = new byte[]{};
    Object v5 = new org.apache.commons.codec.binary.Base64InputStream(((java.io.InputStream)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Integer)v3).intValue()),((byte[])v4));
    Object v6 = 0;
    Object v7 = ((java.io.InputStream)v5).readNBytes((((java.lang.Integer)v6).intValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.codec.binary.Base64InputStream(((java.io.InputStream)v0));
    Object v2 = false;
    Object v3 = new org.apache.commons.codec.binary.Base64InputStream(((java.io.InputStream)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((org.apache.commons.codec.binary.Base64InputStream)v3).read();
    org.junit.Assert.assertEquals((Object)(-1), v4);
  }
}
