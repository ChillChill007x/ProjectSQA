package org.apache.commons.codec.binary;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = false;
    Object v2 = 4;
    Object v3 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)1)};
    Object v4 = new org.apache.commons.codec.binary.Base64InputStream(((java.io.InputStream)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Integer)v2).intValue()),((byte[])v3));
    Object v5 = new byte[]{Byte.valueOf((byte)0)};
    Object v6 = ((java.io.FilterInputStream)v4).read(((byte[])v5));
    Object v7 = ((org.apache.commons.codec.binary.BaseNCodecInputStream)v4).read();
    org.junit.Assert.assertEquals((Object)(-1), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = false;
    Object v2 = 4;
    Object v3 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)1)};
    Object v4 = new org.apache.commons.codec.binary.Base64InputStream(((java.io.InputStream)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Integer)v2).intValue()),((byte[])v3));
    Object v5 = ((java.io.InputStream)v4).readAllBytes();
    Object v6 = -22L;
    Object v7 = ((org.apache.commons.codec.binary.BaseNCodecInputStream)v4).skip((((java.lang.Long)v6).longValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = false;
    Object v2 = 4;
    Object v3 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)1)};
    Object v4 = new org.apache.commons.codec.binary.Base64InputStream(((java.io.InputStream)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Integer)v2).intValue()),((byte[])v3));
    Object v5 = new byte[]{Byte.valueOf((byte)23),Byte.valueOf((byte)1)};
    Object v6 = 15;
    Object v7 = 5;
    Object v8 = ((org.apache.commons.codec.binary.BaseNCodecInputStream)v4).read(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = java.io.OutputStream.nullOutputStream();
    Object v2 = ((java.io.InputStream)v0).transferTo(((java.io.OutputStream)v1));
    org.junit.Assert.assertEquals((Object)(0L), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = false;
    Object v2 = 4;
    Object v3 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)1)};
    Object v4 = new org.apache.commons.codec.binary.Base64InputStream(((java.io.InputStream)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Integer)v2).intValue()),((byte[])v3));
    Object v5 = new byte[]{Byte.valueOf((byte)-12),Byte.valueOf((byte)5)};
    Object v6 = 0;
    Object v7 = 0;
    Object v8 = ((org.apache.commons.codec.binary.BaseNCodecInputStream)v4).read(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    org.junit.Assert.assertEquals((Object)(0), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = false;
    Object v2 = 4;
    Object v3 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)1)};
    Object v4 = new org.apache.commons.codec.binary.Base64InputStream(((java.io.InputStream)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Integer)v2).intValue()),((byte[])v3));
    Object v5 = ((org.apache.commons.codec.binary.BaseNCodecInputStream)v4).read();
    org.junit.Assert.assertEquals((Object)(-1), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = false;
    Object v2 = 4;
    Object v3 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)1)};
    Object v4 = new org.apache.commons.codec.binary.Base64InputStream(((java.io.InputStream)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Integer)v2).intValue()),((byte[])v3));
    Object v5 = java.io.OutputStream.nullOutputStream();
    Object v6 = ((java.io.InputStream)v4).transferTo(((java.io.OutputStream)v5));
    Object v7 = ((org.apache.commons.codec.binary.BaseNCodecInputStream)v4).read();
    org.junit.Assert.assertEquals((Object)(-1), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = java.io.OutputStream.nullOutputStream();
    Object v2 = 9;
    ((java.io.OutputStream)v1).write((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    Object v4 = ((java.io.InputStream)v0).transferTo(((java.io.OutputStream)v1));
    org.junit.Assert.assertEquals((Object)(0L), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = false;
    Object v2 = 4;
    Object v3 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)1)};
    Object v4 = new org.apache.commons.codec.binary.Base64InputStream(((java.io.InputStream)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Integer)v2).intValue()),((byte[])v3));
    Object v5 = -56;
    Object v6 = ((java.io.InputStream)v4).readNBytes((((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = false;
    Object v2 = 4;
    Object v3 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)1)};
    Object v4 = new org.apache.commons.codec.binary.Base64InputStream(((java.io.InputStream)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Integer)v2).intValue()),((byte[])v3));
    Object v5 = -44L;
    Object v6 = ((org.apache.commons.codec.binary.BaseNCodecInputStream)v4).skip((((java.lang.Long)v5).longValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = false;
    Object v2 = 4;
    Object v3 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)1)};
    Object v4 = new org.apache.commons.codec.binary.Base64InputStream(((java.io.InputStream)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Integer)v2).intValue()),((byte[])v3));
    Object v5 = 2;
    Object v6 = ((java.io.InputStream)v4).readNBytes((((java.lang.Integer)v5).intValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new byte[]{Byte.valueOf((byte)50),Byte.valueOf((byte)31),Byte.valueOf((byte)0)};
    Object v2 = 13;
    Object v3 = 0;
    Object v4 = ((java.io.InputStream)v0).readNBytes(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = false;
    Object v2 = 4;
    Object v3 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)1)};
    Object v4 = new org.apache.commons.codec.binary.Base64InputStream(((java.io.InputStream)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Integer)v2).intValue()),((byte[])v3));
    Object v5 = ((java.io.InputStream)v4).readAllBytes();
    Object v6 = ((java.io.InputStream)v4).readAllBytes();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = false;
    Object v2 = 4;
    Object v3 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)1)};
    Object v4 = new org.apache.commons.codec.binary.Base64InputStream(((java.io.InputStream)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Integer)v2).intValue()),((byte[])v3));
    Object v5 = ((org.apache.commons.codec.binary.BaseNCodecInputStream)v4).available();
    org.junit.Assert.assertEquals((Object)(1), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = false;
    Object v2 = 4;
    Object v3 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)1)};
    Object v4 = new org.apache.commons.codec.binary.Base64InputStream(((java.io.InputStream)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Integer)v2).intValue()),((byte[])v3));
    Object v5 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)1)};
    Object v6 = 1;
    Object v7 = 1;
    Object v8 = ((org.apache.commons.codec.binary.BaseNCodecInputStream)v4).read(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    org.junit.Assert.assertEquals((Object)(-1), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new byte[]{Byte.valueOf((byte)-4)};
    Object v2 = 1;
    Object v3 = 12;
    Object v4 = ((java.io.InputStream)v0).readNBytes(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = false;
    Object v2 = 4;
    Object v3 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)1)};
    Object v4 = new org.apache.commons.codec.binary.Base64InputStream(((java.io.InputStream)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Integer)v2).intValue()),((byte[])v3));
    Object v5 = ((org.apache.commons.codec.binary.BaseNCodecInputStream)v4).markSupported();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = false;
    Object v2 = 4;
    Object v3 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)1)};
    Object v4 = new org.apache.commons.codec.binary.Base64InputStream(((java.io.InputStream)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Integer)v2).intValue()),((byte[])v3));
    Object v5 = java.io.OutputStream.nullOutputStream();
    Object v6 = ((java.io.InputStream)v4).transferTo(((java.io.OutputStream)v5));
    Object v7 = ((org.apache.commons.codec.binary.BaseNCodecInputStream)v4).available();
    org.junit.Assert.assertEquals((Object)(0), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.codec.binary.Base32();
    Object v2 = new byte[]{Byte.valueOf((byte)-25)};
    Object v3 = ((org.apache.commons.codec.binary.BaseNCodec)v1).decode(((byte[])v2));
    Object v4 = true;
    Object v5 = new org.apache.commons.codec.binary.BaseNCodecInputStream(((java.io.InputStream)v0),((org.apache.commons.codec.binary.BaseNCodec)v1),(((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.codec.binary.Base32();
    Object v2 = new byte[]{Byte.valueOf((byte)-25)};
    Object v3 = ((org.apache.commons.codec.binary.BaseNCodec)v1).decode(((byte[])v2));
    Object v4 = true;
    Object v5 = new org.apache.commons.codec.binary.BaseNCodecInputStream(((java.io.InputStream)v0),((org.apache.commons.codec.binary.BaseNCodec)v1),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new byte[]{};
    Object v7 = -2;
    Object v8 = 51;
    Object v9 = ((java.io.InputStream)v5).readNBytes(((byte[])v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.codec.binary.Base32();
    Object v2 = new byte[]{Byte.valueOf((byte)-25)};
    Object v3 = ((org.apache.commons.codec.binary.BaseNCodec)v1).decode(((byte[])v2));
    Object v4 = true;
    Object v5 = new org.apache.commons.codec.binary.BaseNCodecInputStream(((java.io.InputStream)v0),((org.apache.commons.codec.binary.BaseNCodec)v1),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = 1L;
    Object v7 = ((org.apache.commons.codec.binary.BaseNCodecInputStream)v5).skip((((java.lang.Long)v6).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.codec.binary.Base32();
    Object v2 = new byte[]{Byte.valueOf((byte)-25)};
    Object v3 = ((org.apache.commons.codec.binary.BaseNCodec)v1).decode(((byte[])v2));
    Object v4 = true;
    Object v5 = new org.apache.commons.codec.binary.BaseNCodecInputStream(((java.io.InputStream)v0),((org.apache.commons.codec.binary.BaseNCodec)v1),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = ((org.apache.commons.codec.binary.BaseNCodecInputStream)v5).read();
    org.junit.Assert.assertEquals((Object)(-1), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.codec.binary.Base32();
    Object v2 = new byte[]{Byte.valueOf((byte)-25)};
    Object v3 = ((org.apache.commons.codec.binary.BaseNCodec)v1).decode(((byte[])v2));
    Object v4 = true;
    Object v5 = new org.apache.commons.codec.binary.BaseNCodecInputStream(((java.io.InputStream)v0),((org.apache.commons.codec.binary.BaseNCodec)v1),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = -4;
    Object v7 = ((java.io.InputStream)v5).readNBytes((((java.lang.Integer)v6).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.codec.binary.Base32();
    Object v2 = new byte[]{Byte.valueOf((byte)-25)};
    Object v3 = ((org.apache.commons.codec.binary.BaseNCodec)v1).decode(((byte[])v2));
    Object v4 = true;
    Object v5 = new org.apache.commons.codec.binary.BaseNCodecInputStream(((java.io.InputStream)v0),((org.apache.commons.codec.binary.BaseNCodec)v1),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = 0L;
    Object v7 = ((java.io.InputStream)v5).skip((((java.lang.Long)v6).longValue()));
    Object v8 = new byte[]{Byte.valueOf((byte)2)};
    Object v9 = 0;
    Object v10 = 1;
    Object v11 = ((java.io.InputStream)v5).readNBytes(((byte[])v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    org.junit.Assert.assertEquals((Object)(0), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.codec.binary.Base32();
    Object v2 = new byte[]{Byte.valueOf((byte)-25)};
    Object v3 = ((org.apache.commons.codec.binary.BaseNCodec)v1).decode(((byte[])v2));
    Object v4 = true;
    Object v5 = new org.apache.commons.codec.binary.BaseNCodecInputStream(((java.io.InputStream)v0),((org.apache.commons.codec.binary.BaseNCodec)v1),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = ((java.io.InputStream)v5).read();
    Object v7 = new byte[]{Byte.valueOf((byte)-5)};
    Object v8 = 45;
    Object v9 = 88;
    Object v10 = ((java.io.InputStream)v5).readNBytes(((byte[])v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.codec.binary.Base32();
    Object v2 = new byte[]{Byte.valueOf((byte)-25)};
    Object v3 = ((org.apache.commons.codec.binary.BaseNCodec)v1).decode(((byte[])v2));
    Object v4 = true;
    Object v5 = new org.apache.commons.codec.binary.BaseNCodecInputStream(((java.io.InputStream)v0),((org.apache.commons.codec.binary.BaseNCodec)v1),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = -1L;
    Object v7 = ((org.apache.commons.codec.binary.BaseNCodecInputStream)v5).skip((((java.lang.Long)v6).longValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.codec.binary.Base32();
    Object v2 = new byte[]{Byte.valueOf((byte)-25)};
    Object v3 = ((org.apache.commons.codec.binary.BaseNCodec)v1).decode(((byte[])v2));
    Object v4 = true;
    Object v5 = new org.apache.commons.codec.binary.BaseNCodecInputStream(((java.io.InputStream)v0),((org.apache.commons.codec.binary.BaseNCodec)v1),(((java.lang.Boolean)v4).booleanValue()));
    ((java.io.FilterInputStream)v5).reset();
    Object v6 = null;
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.codec.binary.Base32();
    Object v2 = new byte[]{Byte.valueOf((byte)-25)};
    Object v3 = ((org.apache.commons.codec.binary.BaseNCodec)v1).decode(((byte[])v2));
    Object v4 = true;
    Object v5 = new org.apache.commons.codec.binary.BaseNCodecInputStream(((java.io.InputStream)v0),((org.apache.commons.codec.binary.BaseNCodec)v1),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)3)};
    Object v7 = 0;
    Object v8 = -6;
    Object v9 = ((org.apache.commons.codec.binary.BaseNCodecInputStream)v5).read(((byte[])v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.codec.binary.Base32();
    Object v2 = new byte[]{Byte.valueOf((byte)-25)};
    Object v3 = ((org.apache.commons.codec.binary.BaseNCodec)v1).decode(((byte[])v2));
    Object v4 = true;
    Object v5 = new org.apache.commons.codec.binary.BaseNCodecInputStream(((java.io.InputStream)v0),((org.apache.commons.codec.binary.BaseNCodec)v1),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = ((org.apache.commons.codec.binary.BaseNCodecInputStream)v5).available();
    org.junit.Assert.assertEquals((Object)(0), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 63;
    Object v2 = ((java.io.InputStream)v0).readNBytes((((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.codec.binary.Base32();
    Object v2 = new byte[]{Byte.valueOf((byte)-25)};
    Object v3 = ((org.apache.commons.codec.binary.BaseNCodec)v1).decode(((byte[])v2));
    Object v4 = true;
    Object v5 = new org.apache.commons.codec.binary.BaseNCodecInputStream(((java.io.InputStream)v0),((org.apache.commons.codec.binary.BaseNCodec)v1),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = ((java.io.InputStream)v5).read();
    Object v7 = java.io.OutputStream.nullOutputStream();
    Object v8 = ((java.io.InputStream)v5).transferTo(((java.io.OutputStream)v7));
    org.junit.Assert.assertEquals((Object)(0L), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.codec.binary.Base32();
    Object v2 = new byte[]{Byte.valueOf((byte)-25)};
    Object v3 = ((org.apache.commons.codec.binary.BaseNCodec)v1).decode(((byte[])v2));
    Object v4 = true;
    Object v5 = new org.apache.commons.codec.binary.BaseNCodecInputStream(((java.io.InputStream)v0),((org.apache.commons.codec.binary.BaseNCodec)v1),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = java.io.OutputStream.nullOutputStream();
    Object v7 = ((java.io.InputStream)v5).transferTo(((java.io.OutputStream)v6));
    org.junit.Assert.assertEquals((Object)(0L), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new byte[]{Byte.valueOf((byte)43),Byte.valueOf((byte)-31),Byte.valueOf((byte)-41)};
    Object v2 = ((java.io.InputStream)v0).read(((byte[])v1));
    Object v3 = java.io.OutputStream.nullOutputStream();
    Object v4 = ((java.io.InputStream)v0).transferTo(((java.io.OutputStream)v3));
    org.junit.Assert.assertEquals((Object)(0L), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = java.io.OutputStream.nullOutputStream();
    Object v2 = ((java.io.InputStream)v0).transferTo(((java.io.OutputStream)v1));
    Object v3 = ((java.io.InputStream)v0).readAllBytes();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.codec.binary.Base32();
    Object v2 = new byte[]{Byte.valueOf((byte)-25)};
    Object v3 = ((org.apache.commons.codec.binary.BaseNCodec)v1).decode(((byte[])v2));
    Object v4 = true;
    Object v5 = new org.apache.commons.codec.binary.BaseNCodecInputStream(((java.io.InputStream)v0),((org.apache.commons.codec.binary.BaseNCodec)v1),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new byte[]{Byte.valueOf((byte)68)};
    Object v7 = ((java.io.FilterInputStream)v5).read(((byte[])v6));
    Object v8 = -3L;
    Object v9 = ((org.apache.commons.codec.binary.BaseNCodecInputStream)v5).skip((((java.lang.Long)v8).longValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.codec.binary.Base32();
    Object v2 = new byte[]{Byte.valueOf((byte)-25)};
    Object v3 = ((org.apache.commons.codec.binary.BaseNCodec)v1).decode(((byte[])v2));
    Object v4 = true;
    Object v5 = new org.apache.commons.codec.binary.BaseNCodecInputStream(((java.io.InputStream)v0),((org.apache.commons.codec.binary.BaseNCodec)v1),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = ((org.apache.commons.codec.binary.BaseNCodecInputStream)v5).markSupported();
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.codec.binary.Base32();
    Object v2 = new byte[]{Byte.valueOf((byte)-25)};
    Object v3 = ((org.apache.commons.codec.binary.BaseNCodec)v1).decode(((byte[])v2));
    Object v4 = true;
    Object v5 = new org.apache.commons.codec.binary.BaseNCodecInputStream(((java.io.InputStream)v0),((org.apache.commons.codec.binary.BaseNCodec)v1),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = 36L;
    Object v7 = ((org.apache.commons.codec.binary.BaseNCodecInputStream)v5).skip((((java.lang.Long)v6).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = false;
    Object v2 = 4;
    Object v3 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)1)};
    Object v4 = new org.apache.commons.codec.binary.Base64InputStream(((java.io.InputStream)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Integer)v2).intValue()),((byte[])v3));
    Object v5 = new byte[]{Byte.valueOf((byte)7),Byte.valueOf((byte)0)};
    Object v6 = 17;
    Object v7 = 0;
    Object v8 = ((org.apache.commons.codec.binary.BaseNCodecInputStream)v4).read(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new byte[]{Byte.valueOf((byte)-35),Byte.valueOf((byte)-7)};
    Object v2 = 26;
    Object v3 = 9;
    Object v4 = ((java.io.InputStream)v0).readNBytes(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.codec.binary.Base32();
    Object v2 = new byte[]{Byte.valueOf((byte)-25)};
    Object v3 = ((org.apache.commons.codec.binary.BaseNCodec)v1).decode(((byte[])v2));
    Object v4 = true;
    Object v5 = new org.apache.commons.codec.binary.BaseNCodecInputStream(((java.io.InputStream)v0),((org.apache.commons.codec.binary.BaseNCodec)v1),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = ((org.apache.commons.codec.binary.BaseNCodecInputStream)v5).read();
    Object v7 = ((org.apache.commons.codec.binary.BaseNCodecInputStream)v5).read();
    org.junit.Assert.assertEquals((Object)(-1), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = false;
    Object v2 = 4;
    Object v3 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)1)};
    Object v4 = new org.apache.commons.codec.binary.Base64InputStream(((java.io.InputStream)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Integer)v2).intValue()),((byte[])v3));
    Object v5 = ((java.io.InputStream)v4).readAllBytes();
    ((java.io.FilterInputStream)v4).reset();
    Object v6 = null;
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.codec.binary.Base32();
    Object v2 = new byte[]{Byte.valueOf((byte)-25)};
    Object v3 = ((org.apache.commons.codec.binary.BaseNCodec)v1).decode(((byte[])v2));
    Object v4 = true;
    Object v5 = new org.apache.commons.codec.binary.BaseNCodecInputStream(((java.io.InputStream)v0),((org.apache.commons.codec.binary.BaseNCodec)v1),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = java.io.OutputStream.nullOutputStream();
    Object v7 = ((java.io.InputStream)v5).transferTo(((java.io.OutputStream)v6));
    Object v8 = ((org.apache.commons.codec.binary.BaseNCodecInputStream)v5).available();
    org.junit.Assert.assertEquals((Object)(0), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.codec.binary.Base32();
    Object v2 = new byte[]{Byte.valueOf((byte)-25)};
    Object v3 = ((org.apache.commons.codec.binary.BaseNCodec)v1).decode(((byte[])v2));
    Object v4 = true;
    Object v5 = new org.apache.commons.codec.binary.BaseNCodecInputStream(((java.io.InputStream)v0),((org.apache.commons.codec.binary.BaseNCodec)v1),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = 0;
    Object v7 = ((java.io.InputStream)v5).readNBytes((((java.lang.Integer)v6).intValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = java.io.OutputStream.nullOutputStream();
    Object v2 = 1;
    ((java.io.OutputStream)v1).write((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    Object v4 = ((java.io.InputStream)v0).transferTo(((java.io.OutputStream)v1));
    org.junit.Assert.assertEquals((Object)(0L), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = false;
    Object v2 = 4;
    Object v3 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)1)};
    Object v4 = new org.apache.commons.codec.binary.Base64InputStream(((java.io.InputStream)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Integer)v2).intValue()),((byte[])v3));
    Object v5 = new byte[]{Byte.valueOf((byte)1)};
    Object v6 = 1;
    Object v7 = 1;
    Object v8 = ((java.io.InputStream)v4).readNBytes(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.codec.binary.Base32();
    Object v2 = new byte[]{Byte.valueOf((byte)-25)};
    Object v3 = ((org.apache.commons.codec.binary.BaseNCodec)v1).decode(((byte[])v2));
    Object v4 = true;
    Object v5 = new org.apache.commons.codec.binary.BaseNCodecInputStream(((java.io.InputStream)v0),((org.apache.commons.codec.binary.BaseNCodec)v1),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = ((org.apache.commons.codec.binary.BaseNCodecInputStream)v5).read();
    Object v7 = ((org.apache.commons.codec.binary.BaseNCodecInputStream)v5).available();
    org.junit.Assert.assertEquals((Object)(0), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.codec.binary.Base32();
    Object v2 = new byte[]{Byte.valueOf((byte)-25)};
    Object v3 = ((org.apache.commons.codec.binary.BaseNCodec)v1).decode(((byte[])v2));
    Object v4 = true;
    Object v5 = new org.apache.commons.codec.binary.BaseNCodecInputStream(((java.io.InputStream)v0),((org.apache.commons.codec.binary.BaseNCodec)v1),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = 22L;
    Object v7 = ((org.apache.commons.codec.binary.BaseNCodecInputStream)v5).skip((((java.lang.Long)v6).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.codec.binary.Base32();
    Object v2 = new byte[]{Byte.valueOf((byte)-25)};
    Object v3 = ((org.apache.commons.codec.binary.BaseNCodec)v1).decode(((byte[])v2));
    Object v4 = true;
    Object v5 = new org.apache.commons.codec.binary.BaseNCodecInputStream(((java.io.InputStream)v0),((org.apache.commons.codec.binary.BaseNCodec)v1),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)1),Byte.valueOf((byte)1)};
    Object v7 = 1;
    Object v8 = 0;
    Object v9 = ((org.apache.commons.codec.binary.BaseNCodecInputStream)v5).read(((byte[])v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    org.junit.Assert.assertEquals((Object)(0), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = false;
    Object v2 = 4;
    Object v3 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)1)};
    Object v4 = new org.apache.commons.codec.binary.Base64InputStream(((java.io.InputStream)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Integer)v2).intValue()),((byte[])v3));
    Object v5 = 1L;
    Object v6 = ((org.apache.commons.codec.binary.BaseNCodecInputStream)v4).skip((((java.lang.Long)v5).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.codec.binary.Base32();
    Object v2 = new byte[]{Byte.valueOf((byte)-25)};
    Object v3 = ((org.apache.commons.codec.binary.BaseNCodec)v1).decode(((byte[])v2));
    Object v4 = true;
    Object v5 = new org.apache.commons.codec.binary.BaseNCodecInputStream(((java.io.InputStream)v0),((org.apache.commons.codec.binary.BaseNCodec)v1),(((java.lang.Boolean)v4).booleanValue()));
    ((java.io.FilterInputStream)v5).close();
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = false;
    Object v2 = 4;
    Object v3 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)1)};
    Object v4 = new org.apache.commons.codec.binary.Base64InputStream(((java.io.InputStream)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Integer)v2).intValue()),((byte[])v3));
    Object v5 = new byte[]{Byte.valueOf((byte)5),Byte.valueOf((byte)0),Byte.valueOf((byte)0)};
    Object v6 = -70;
    Object v7 = -13;
    Object v8 = ((org.apache.commons.codec.binary.BaseNCodecInputStream)v4).read(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.codec.binary.Base32();
    Object v2 = new byte[]{Byte.valueOf((byte)-25)};
    Object v3 = ((org.apache.commons.codec.binary.BaseNCodec)v1).decode(((byte[])v2));
    Object v4 = true;
    Object v5 = new org.apache.commons.codec.binary.BaseNCodecInputStream(((java.io.InputStream)v0),((org.apache.commons.codec.binary.BaseNCodec)v1),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = ((java.io.InputStream)v5).read();
    Object v7 = new byte[]{};
    Object v8 = -20;
    Object v9 = 1;
    Object v10 = ((java.io.InputStream)v5).readNBytes(((byte[])v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = ((java.io.InputStream)v0).readAllBytes();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new byte[]{Byte.valueOf((byte)-1),Byte.valueOf((byte)36),Byte.valueOf((byte)0)};
    Object v2 = ((java.io.InputStream)v0).read(((byte[])v1));
    Object v3 = new byte[]{};
    Object v4 = 1;
    Object v5 = 0;
    Object v6 = ((java.io.InputStream)v0).readNBytes(((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.codec.binary.Base32();
    Object v2 = new byte[]{Byte.valueOf((byte)-25)};
    Object v3 = ((org.apache.commons.codec.binary.BaseNCodec)v1).decode(((byte[])v2));
    Object v4 = true;
    Object v5 = new org.apache.commons.codec.binary.BaseNCodecInputStream(((java.io.InputStream)v0),((org.apache.commons.codec.binary.BaseNCodec)v1),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new byte[]{Byte.valueOf((byte)2),Byte.valueOf((byte)1)};
    Object v7 = 0;
    Object v8 = 46;
    Object v9 = ((org.apache.commons.codec.binary.BaseNCodecInputStream)v5).read(((byte[])v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.codec.binary.Base32();
    Object v2 = new byte[]{Byte.valueOf((byte)-25)};
    Object v3 = ((org.apache.commons.codec.binary.BaseNCodec)v1).decode(((byte[])v2));
    Object v4 = true;
    Object v5 = new org.apache.commons.codec.binary.BaseNCodecInputStream(((java.io.InputStream)v0),((org.apache.commons.codec.binary.BaseNCodec)v1),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = ((org.apache.commons.codec.binary.BaseNCodecInputStream)v5).read();
    Object v7 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)3),Byte.valueOf((byte)0)};
    Object v8 = -5;
    Object v9 = 3;
    Object v10 = ((org.apache.commons.codec.binary.BaseNCodecInputStream)v5).read(((byte[])v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = false;
    Object v2 = 4;
    Object v3 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)1)};
    Object v4 = new org.apache.commons.codec.binary.Base64InputStream(((java.io.InputStream)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Integer)v2).intValue()),((byte[])v3));
    Object v5 = 46L;
    Object v6 = ((org.apache.commons.codec.binary.BaseNCodecInputStream)v4).skip((((java.lang.Long)v5).longValue()));
    Object v7 = new byte[]{Byte.valueOf((byte)30)};
    Object v8 = 35;
    Object v9 = 65;
    Object v10 = ((org.apache.commons.codec.binary.BaseNCodecInputStream)v4).read(((byte[])v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.codec.binary.Base32();
    Object v2 = new byte[]{Byte.valueOf((byte)-25)};
    Object v3 = ((org.apache.commons.codec.binary.BaseNCodec)v1).decode(((byte[])v2));
    Object v4 = true;
    Object v5 = new org.apache.commons.codec.binary.BaseNCodecInputStream(((java.io.InputStream)v0),((org.apache.commons.codec.binary.BaseNCodec)v1),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new byte[]{Byte.valueOf((byte)-1),Byte.valueOf((byte)0),Byte.valueOf((byte)48)};
    Object v7 = 0;
    Object v8 = 68;
    Object v9 = ((org.apache.commons.codec.binary.BaseNCodecInputStream)v5).read(((byte[])v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = false;
    Object v2 = 4;
    Object v3 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)1)};
    Object v4 = new org.apache.commons.codec.binary.Base64InputStream(((java.io.InputStream)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Integer)v2).intValue()),((byte[])v3));
    Object v5 = java.io.OutputStream.nullOutputStream();
    Object v6 = ((java.io.InputStream)v4).transferTo(((java.io.OutputStream)v5));
    org.junit.Assert.assertEquals((Object)(0L), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.codec.binary.Base32();
    Object v2 = new byte[]{Byte.valueOf((byte)-25)};
    Object v3 = ((org.apache.commons.codec.binary.BaseNCodec)v1).decode(((byte[])v2));
    Object v4 = true;
    Object v5 = new org.apache.commons.codec.binary.BaseNCodecInputStream(((java.io.InputStream)v0),((org.apache.commons.codec.binary.BaseNCodec)v1),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new byte[]{Byte.valueOf((byte)-24),Byte.valueOf((byte)-37)};
    Object v7 = ((java.io.FilterInputStream)v5).read(((byte[])v6));
    org.junit.Assert.assertEquals((Object)(-1), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.codec.binary.Base32();
    Object v2 = new byte[]{Byte.valueOf((byte)-25)};
    Object v3 = ((org.apache.commons.codec.binary.BaseNCodec)v1).decode(((byte[])v2));
    Object v4 = true;
    Object v5 = new org.apache.commons.codec.binary.BaseNCodecInputStream(((java.io.InputStream)v0),((org.apache.commons.codec.binary.BaseNCodec)v1),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = 85L;
    Object v7 = ((org.apache.commons.codec.binary.BaseNCodecInputStream)v5).skip((((java.lang.Long)v6).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.codec.binary.Base32();
    Object v2 = new byte[]{Byte.valueOf((byte)-25)};
    Object v3 = ((org.apache.commons.codec.binary.BaseNCodec)v1).decode(((byte[])v2));
    Object v4 = true;
    Object v5 = new org.apache.commons.codec.binary.BaseNCodecInputStream(((java.io.InputStream)v0),((org.apache.commons.codec.binary.BaseNCodec)v1),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = 75;
    ((java.io.FilterInputStream)v5).mark((((java.lang.Integer)v6).intValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.codec.binary.Base32();
    Object v2 = new byte[]{Byte.valueOf((byte)-25)};
    Object v3 = ((org.apache.commons.codec.binary.BaseNCodec)v1).decode(((byte[])v2));
    Object v4 = true;
    Object v5 = new org.apache.commons.codec.binary.BaseNCodecInputStream(((java.io.InputStream)v0),((org.apache.commons.codec.binary.BaseNCodec)v1),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new byte[]{};
    Object v7 = 0;
    Object v8 = -38;
    Object v9 = ((org.apache.commons.codec.binary.BaseNCodecInputStream)v5).read(((byte[])v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.codec.binary.Base32();
    Object v2 = new byte[]{Byte.valueOf((byte)-25)};
    Object v3 = ((org.apache.commons.codec.binary.BaseNCodec)v1).decode(((byte[])v2));
    Object v4 = true;
    Object v5 = new org.apache.commons.codec.binary.BaseNCodecInputStream(((java.io.InputStream)v0),((org.apache.commons.codec.binary.BaseNCodec)v1),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = java.io.OutputStream.nullOutputStream();
    Object v7 = ((java.io.InputStream)v5).transferTo(((java.io.OutputStream)v6));
    Object v8 = new byte[]{Byte.valueOf((byte)96),Byte.valueOf((byte)-13)};
    Object v9 = 0;
    Object v10 = 0;
    Object v11 = ((java.io.InputStream)v5).readNBytes(((byte[])v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    org.junit.Assert.assertEquals((Object)(0), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.codec.binary.Base32();
    Object v2 = new byte[]{Byte.valueOf((byte)-25)};
    Object v3 = ((org.apache.commons.codec.binary.BaseNCodec)v1).decode(((byte[])v2));
    Object v4 = true;
    Object v5 = new org.apache.commons.codec.binary.BaseNCodecInputStream(((java.io.InputStream)v0),((org.apache.commons.codec.binary.BaseNCodec)v1),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = 1;
    Object v7 = ((java.io.InputStream)v5).readNBytes((((java.lang.Integer)v6).intValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.codec.binary.Base32();
    Object v2 = new byte[]{Byte.valueOf((byte)-25)};
    Object v3 = ((org.apache.commons.codec.binary.BaseNCodec)v1).decode(((byte[])v2));
    Object v4 = true;
    Object v5 = new org.apache.commons.codec.binary.BaseNCodecInputStream(((java.io.InputStream)v0),((org.apache.commons.codec.binary.BaseNCodec)v1),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = 2L;
    Object v7 = ((org.apache.commons.codec.binary.BaseNCodecInputStream)v5).skip((((java.lang.Long)v6).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -9;
    Object v2 = ((java.io.InputStream)v0).readNBytes((((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -14;
    Object v2 = ((java.io.InputStream)v0).readNBytes((((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.codec.binary.Base32();
    Object v2 = new byte[]{Byte.valueOf((byte)-25)};
    Object v3 = ((org.apache.commons.codec.binary.BaseNCodec)v1).decode(((byte[])v2));
    Object v4 = true;
    Object v5 = new org.apache.commons.codec.binary.BaseNCodecInputStream(((java.io.InputStream)v0),((org.apache.commons.codec.binary.BaseNCodec)v1),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new byte[]{Byte.valueOf((byte)28),Byte.valueOf((byte)1)};
    Object v7 = -10;
    Object v8 = 0;
    Object v9 = ((java.io.InputStream)v5).readNBytes(((byte[])v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.codec.binary.Base32();
    Object v2 = new byte[]{Byte.valueOf((byte)-25)};
    Object v3 = ((org.apache.commons.codec.binary.BaseNCodec)v1).decode(((byte[])v2));
    Object v4 = true;
    Object v5 = new org.apache.commons.codec.binary.BaseNCodecInputStream(((java.io.InputStream)v0),((org.apache.commons.codec.binary.BaseNCodec)v1),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = 8;
    Object v7 = ((java.io.InputStream)v5).readNBytes((((java.lang.Integer)v6).intValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.codec.binary.Base32();
    Object v2 = new byte[]{Byte.valueOf((byte)-25)};
    Object v3 = ((org.apache.commons.codec.binary.BaseNCodec)v1).decode(((byte[])v2));
    Object v4 = true;
    Object v5 = new org.apache.commons.codec.binary.BaseNCodecInputStream(((java.io.InputStream)v0),((org.apache.commons.codec.binary.BaseNCodec)v1),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new byte[]{Byte.valueOf((byte)-12),Byte.valueOf((byte)19)};
    Object v7 = 256;
    Object v8 = 1;
    Object v9 = ((org.apache.commons.codec.binary.BaseNCodecInputStream)v5).read(((byte[])v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.codec.binary.Base32();
    Object v2 = new byte[]{Byte.valueOf((byte)-25)};
    Object v3 = ((org.apache.commons.codec.binary.BaseNCodec)v1).decode(((byte[])v2));
    Object v4 = true;
    Object v5 = new org.apache.commons.codec.binary.BaseNCodecInputStream(((java.io.InputStream)v0),((org.apache.commons.codec.binary.BaseNCodec)v1),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = 1;
    ((java.io.FilterInputStream)v5).mark((((java.lang.Integer)v6).intValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.codec.binary.Base32();
    Object v2 = new byte[]{Byte.valueOf((byte)-25)};
    Object v3 = ((org.apache.commons.codec.binary.BaseNCodec)v1).decode(((byte[])v2));
    Object v4 = true;
    Object v5 = new org.apache.commons.codec.binary.BaseNCodecInputStream(((java.io.InputStream)v0),((org.apache.commons.codec.binary.BaseNCodec)v1),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = 28;
    ((java.io.FilterInputStream)v5).mark((((java.lang.Integer)v6).intValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.codec.binary.Base32();
    Object v2 = new byte[]{Byte.valueOf((byte)-25)};
    Object v3 = ((org.apache.commons.codec.binary.BaseNCodec)v1).decode(((byte[])v2));
    Object v4 = true;
    Object v5 = new org.apache.commons.codec.binary.BaseNCodecInputStream(((java.io.InputStream)v0),((org.apache.commons.codec.binary.BaseNCodec)v1),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = -18;
    Object v7 = ((java.io.InputStream)v5).readNBytes((((java.lang.Integer)v6).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = false;
    Object v2 = 4;
    Object v3 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)1)};
    Object v4 = new org.apache.commons.codec.binary.Base64InputStream(((java.io.InputStream)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Integer)v2).intValue()),((byte[])v3));
    Object v5 = -7;
    Object v6 = ((java.io.InputStream)v4).readNBytes((((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new byte[]{};
    Object v2 = 1;
    Object v3 = 1;
    Object v4 = ((java.io.InputStream)v0).readNBytes(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = ((java.io.InputStream)v0).readAllBytes();
    Object v2 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)1),Byte.valueOf((byte)61)};
    Object v3 = 0;
    Object v4 = 0;
    Object v5 = ((java.io.InputStream)v0).readNBytes(((byte[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertEquals((Object)(0), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.codec.binary.Base32();
    Object v2 = new byte[]{Byte.valueOf((byte)-25)};
    Object v3 = ((org.apache.commons.codec.binary.BaseNCodec)v1).decode(((byte[])v2));
    Object v4 = true;
    Object v5 = new org.apache.commons.codec.binary.BaseNCodecInputStream(((java.io.InputStream)v0),((org.apache.commons.codec.binary.BaseNCodec)v1),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = -59;
    Object v7 = ((java.io.InputStream)v5).readNBytes((((java.lang.Integer)v6).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 1L;
    Object v2 = ((java.io.InputStream)v0).skip((((java.lang.Long)v1).longValue()));
    Object v3 = 33;
    Object v4 = ((java.io.InputStream)v0).readNBytes((((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 0;
    Object v2 = ((java.io.InputStream)v0).readNBytes((((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new byte[]{};
    Object v2 = -42;
    Object v3 = 0;
    Object v4 = ((java.io.InputStream)v0).readNBytes(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.codec.binary.Base32();
    Object v2 = new byte[]{Byte.valueOf((byte)-25)};
    Object v3 = ((org.apache.commons.codec.binary.BaseNCodec)v1).decode(((byte[])v2));
    Object v4 = true;
    Object v5 = new org.apache.commons.codec.binary.BaseNCodecInputStream(((java.io.InputStream)v0),((org.apache.commons.codec.binary.BaseNCodec)v1),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = ((java.io.InputStream)v5).readAllBytes();
    ((java.io.FilterInputStream)v5).close();
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.codec.binary.Base32();
    Object v2 = new byte[]{Byte.valueOf((byte)-25)};
    Object v3 = ((org.apache.commons.codec.binary.BaseNCodec)v1).decode(((byte[])v2));
    Object v4 = true;
    Object v5 = new org.apache.commons.codec.binary.BaseNCodecInputStream(((java.io.InputStream)v0),((org.apache.commons.codec.binary.BaseNCodec)v1),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new byte[]{Byte.valueOf((byte)11),Byte.valueOf((byte)-69),Byte.valueOf((byte)1)};
    Object v7 = ((java.io.FilterInputStream)v5).read(((byte[])v6));
    ((java.io.FilterInputStream)v5).close();
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.codec.binary.Base32();
    Object v2 = new byte[]{Byte.valueOf((byte)-25)};
    Object v3 = ((org.apache.commons.codec.binary.BaseNCodec)v1).decode(((byte[])v2));
    Object v4 = true;
    Object v5 = new org.apache.commons.codec.binary.BaseNCodecInputStream(((java.io.InputStream)v0),((org.apache.commons.codec.binary.BaseNCodec)v1),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new byte[]{Byte.valueOf((byte)4)};
    Object v7 = -5;
    Object v8 = 1;
    Object v9 = ((java.io.InputStream)v5).readNBytes(((byte[])v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = ((java.io.InputStream)v0).readAllBytes();
    Object v2 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)-40)};
    Object v3 = -4;
    Object v4 = -7;
    Object v5 = ((java.io.InputStream)v0).readNBytes(((byte[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.codec.binary.Base32();
    Object v2 = new byte[]{Byte.valueOf((byte)-25)};
    Object v3 = ((org.apache.commons.codec.binary.BaseNCodec)v1).decode(((byte[])v2));
    Object v4 = true;
    Object v5 = new org.apache.commons.codec.binary.BaseNCodecInputStream(((java.io.InputStream)v0),((org.apache.commons.codec.binary.BaseNCodec)v1),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = 11;
    Object v7 = ((java.io.InputStream)v5).readNBytes((((java.lang.Integer)v6).intValue()));
    Object v8 = ((org.apache.commons.codec.binary.BaseNCodecInputStream)v5).available();
    org.junit.Assert.assertEquals((Object)(0), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new byte[]{Byte.valueOf((byte)0)};
    Object v2 = 8;
    Object v3 = 1;
    Object v4 = ((java.io.InputStream)v0).readNBytes(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new byte[]{Byte.valueOf((byte)-26),Byte.valueOf((byte)22),Byte.valueOf((byte)10)};
    Object v2 = 1;
    Object v3 = 0;
    Object v4 = ((java.io.InputStream)v0).readNBytes(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertEquals((Object)(0), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = false;
    Object v2 = 4;
    Object v3 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)1)};
    Object v4 = new org.apache.commons.codec.binary.Base64InputStream(((java.io.InputStream)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Integer)v2).intValue()),((byte[])v3));
    ((java.io.FilterInputStream)v4).reset();
    Object v5 = null;
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)28)};
    Object v2 = 28;
    Object v3 = -5;
    Object v4 = ((java.io.InputStream)v0).readNBytes(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 22;
    Object v2 = ((java.io.InputStream)v0).readNBytes((((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = false;
    Object v2 = 4;
    Object v3 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)1)};
    Object v4 = new org.apache.commons.codec.binary.Base64InputStream(((java.io.InputStream)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Integer)v2).intValue()),((byte[])v3));
    Object v5 = new org.apache.commons.codec.binary.Base32();
    Object v6 = false;
    Object v7 = new org.apache.commons.codec.binary.BaseNCodecInputStream(((java.io.InputStream)v4),((org.apache.commons.codec.binary.BaseNCodec)v5),(((java.lang.Boolean)v6).booleanValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.codec.binary.Base32();
    Object v2 = new byte[]{Byte.valueOf((byte)-25)};
    Object v3 = ((org.apache.commons.codec.binary.BaseNCodec)v1).decode(((byte[])v2));
    Object v4 = true;
    Object v5 = new org.apache.commons.codec.binary.BaseNCodecInputStream(((java.io.InputStream)v0),((org.apache.commons.codec.binary.BaseNCodec)v1),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new org.apache.commons.codec.binary.Base32();
    Object v7 = "UTF-8";
    Object v8 = ((org.apache.commons.codec.binary.BaseNCodec)v6).decode(((java.lang.String)v7));
    Object v9 = true;
    Object v10 = new org.apache.commons.codec.binary.BaseNCodecInputStream(((java.io.InputStream)v5),((org.apache.commons.codec.binary.BaseNCodec)v6),(((java.lang.Boolean)v9).booleanValue()));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.codec.binary.Base32();
    Object v2 = new byte[]{Byte.valueOf((byte)-25)};
    Object v3 = ((org.apache.commons.codec.binary.BaseNCodec)v1).decode(((byte[])v2));
    Object v4 = true;
    Object v5 = new org.apache.commons.codec.binary.BaseNCodecInputStream(((java.io.InputStream)v0),((org.apache.commons.codec.binary.BaseNCodec)v1),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new org.apache.commons.codec.binary.Base32();
    Object v7 = "UTF-8";
    Object v8 = ((org.apache.commons.codec.binary.BaseNCodec)v6).decode(((java.lang.String)v7));
    Object v9 = true;
    Object v10 = new org.apache.commons.codec.binary.BaseNCodecInputStream(((java.io.InputStream)v5),((org.apache.commons.codec.binary.BaseNCodec)v6),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = -37L;
    Object v12 = ((org.apache.commons.codec.binary.BaseNCodecInputStream)v10).skip((((java.lang.Long)v11).longValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.codec.binary.Base32();
    Object v2 = new byte[]{Byte.valueOf((byte)-25)};
    Object v3 = ((org.apache.commons.codec.binary.BaseNCodec)v1).decode(((byte[])v2));
    Object v4 = true;
    Object v5 = new org.apache.commons.codec.binary.BaseNCodecInputStream(((java.io.InputStream)v0),((org.apache.commons.codec.binary.BaseNCodec)v1),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new org.apache.commons.codec.binary.Base32();
    Object v7 = "UTF-8";
    Object v8 = ((org.apache.commons.codec.binary.BaseNCodec)v6).decode(((java.lang.String)v7));
    Object v9 = true;
    Object v10 = new org.apache.commons.codec.binary.BaseNCodecInputStream(((java.io.InputStream)v5),((org.apache.commons.codec.binary.BaseNCodec)v6),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = 0;
    Object v12 = ((java.io.InputStream)v10).readNBytes((((java.lang.Integer)v11).intValue()));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = false;
    Object v2 = 4;
    Object v3 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)1)};
    Object v4 = new org.apache.commons.codec.binary.Base64InputStream(((java.io.InputStream)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Integer)v2).intValue()),((byte[])v3));
    Object v5 = new org.apache.commons.codec.binary.Base32();
    Object v6 = false;
    Object v7 = new org.apache.commons.codec.binary.BaseNCodecInputStream(((java.io.InputStream)v4),((org.apache.commons.codec.binary.BaseNCodec)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = 1;
    Object v9 = ((java.io.InputStream)v7).readNBytes((((java.lang.Integer)v8).intValue()));
    Object v10 = ((org.apache.commons.codec.binary.BaseNCodecInputStream)v7).read();
    org.junit.Assert.assertEquals((Object)(-1), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = false;
    Object v2 = 4;
    Object v3 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)1)};
    Object v4 = new org.apache.commons.codec.binary.Base64InputStream(((java.io.InputStream)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Integer)v2).intValue()),((byte[])v3));
    Object v5 = new org.apache.commons.codec.binary.Base32();
    Object v6 = false;
    Object v7 = new org.apache.commons.codec.binary.BaseNCodecInputStream(((java.io.InputStream)v4),((org.apache.commons.codec.binary.BaseNCodec)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new byte[]{Byte.valueOf((byte)1)};
    Object v9 = -22;
    Object v10 = 1;
    Object v11 = ((java.io.InputStream)v7).readNBytes(((byte[])v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.codec.binary.Base32();
    Object v2 = new byte[]{Byte.valueOf((byte)-25)};
    Object v3 = ((org.apache.commons.codec.binary.BaseNCodec)v1).decode(((byte[])v2));
    Object v4 = true;
    Object v5 = new org.apache.commons.codec.binary.BaseNCodecInputStream(((java.io.InputStream)v0),((org.apache.commons.codec.binary.BaseNCodec)v1),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = 47;
    ((java.io.FilterInputStream)v5).mark((((java.lang.Integer)v6).intValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.codec.binary.Base32();
    Object v2 = new byte[]{Byte.valueOf((byte)-25)};
    Object v3 = ((org.apache.commons.codec.binary.BaseNCodec)v1).decode(((byte[])v2));
    Object v4 = true;
    Object v5 = new org.apache.commons.codec.binary.BaseNCodecInputStream(((java.io.InputStream)v0),((org.apache.commons.codec.binary.BaseNCodec)v1),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new org.apache.commons.codec.binary.Base32();
    Object v7 = "UTF-8";
    Object v8 = ((org.apache.commons.codec.binary.BaseNCodec)v6).decode(((java.lang.String)v7));
    Object v9 = true;
    Object v10 = new org.apache.commons.codec.binary.BaseNCodecInputStream(((java.io.InputStream)v5),((org.apache.commons.codec.binary.BaseNCodec)v6),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = 0L;
    Object v12 = ((org.apache.commons.codec.binary.BaseNCodecInputStream)v10).skip((((java.lang.Long)v11).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v12);
  }
}
