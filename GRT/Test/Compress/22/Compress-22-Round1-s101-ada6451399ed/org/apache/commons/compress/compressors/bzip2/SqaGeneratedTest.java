package org.apache.commons.compress.compressors.bzip2;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)39)};
    Object v1 = -7;
    Object v2 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)54),Byte.valueOf((byte)0)};
    Object v1 = 2;
    Object v2 = 1021;
    Object v3 = new java.io.ByteArrayInputStream(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = 0;
    ((java.io.InputStream)v3).mark((((java.lang.Integer)v4).intValue()));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = new byte[]{};
    Object v1 = 30;
    Object v2 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)54),Byte.valueOf((byte)0)};
    Object v1 = 2;
    Object v2 = 1021;
    Object v3 = new java.io.ByteArrayInputStream(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = java.io.OutputStream.nullOutputStream();
    Object v5 = ((java.io.InputStream)v3).transferTo(((java.io.OutputStream)v4));
    org.junit.Assert.assertEquals((Object)(0L), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)54),Byte.valueOf((byte)0)};
    Object v1 = 2;
    Object v2 = 1021;
    Object v3 = new java.io.ByteArrayInputStream(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = new byte[]{Byte.valueOf((byte)0)};
    Object v5 = 8;
    Object v6 = 1;
    Object v7 = ((java.io.InputStream)v3).readNBytes(((byte[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)54),Byte.valueOf((byte)0)};
    Object v1 = 2;
    Object v2 = 1021;
    Object v3 = new java.io.ByteArrayInputStream(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = new byte[]{Byte.valueOf((byte)-64),Byte.valueOf((byte)1)};
    Object v5 = -23;
    Object v6 = -3;
    Object v7 = ((java.io.InputStream)v3).readNBytes(((byte[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)54),Byte.valueOf((byte)0)};
    Object v1 = 2;
    Object v2 = 1021;
    Object v3 = new java.io.ByteArrayInputStream(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = 4L;
    Object v5 = ((java.io.InputStream)v3).skip((((java.lang.Long)v4).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)54),Byte.valueOf((byte)0)};
    Object v1 = 2;
    Object v2 = 1021;
    Object v3 = new java.io.ByteArrayInputStream(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((java.io.InputStream)v3).available();
    org.junit.Assert.assertEquals((Object)(0), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)54),Byte.valueOf((byte)0)};
    Object v1 = 2;
    Object v2 = 1021;
    Object v3 = new java.io.ByteArrayInputStream(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    ((java.io.InputStream)v3).reset();
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)54),Byte.valueOf((byte)0)};
    Object v1 = 2;
    Object v2 = 1021;
    Object v3 = new java.io.ByteArrayInputStream(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((java.io.InputStream)v3).readAllBytes();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)54),Byte.valueOf((byte)0)};
    Object v1 = 2;
    Object v2 = 1021;
    Object v3 = new java.io.ByteArrayInputStream(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = 0;
    Object v5 = ((java.io.InputStream)v3).readNBytes((((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)54),Byte.valueOf((byte)0)};
    Object v1 = 2;
    Object v2 = 1021;
    Object v3 = new java.io.ByteArrayInputStream(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = new byte[]{};
    Object v5 = ((java.io.InputStream)v3).read(((byte[])v4));
    org.junit.Assert.assertEquals((Object)(-1), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)54),Byte.valueOf((byte)0)};
    Object v1 = 2;
    Object v2 = 1021;
    Object v3 = new java.io.ByteArrayInputStream(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = 32L;
    Object v5 = ((java.io.InputStream)v3).skip((((java.lang.Long)v4).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = ((java.io.InputStream)v0).markSupported();
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)54),Byte.valueOf((byte)0)};
    Object v1 = 2;
    Object v2 = 1021;
    Object v3 = new java.io.ByteArrayInputStream(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = new byte[]{Byte.valueOf((byte)-26)};
    Object v5 = 12;
    Object v6 = 0;
    Object v7 = ((java.io.InputStream)v3).readNBytes(((byte[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)54),Byte.valueOf((byte)0)};
    Object v1 = 2;
    Object v2 = 1021;
    Object v3 = new java.io.ByteArrayInputStream(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = new org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream(((java.io.InputStream)v3));
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)54),Byte.valueOf((byte)0)};
    Object v1 = 2;
    Object v2 = 1021;
    Object v3 = new java.io.ByteArrayInputStream(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = new byte[]{Byte.valueOf((byte)-2)};
    Object v5 = 0;
    Object v6 = 28;
    Object v7 = ((java.io.InputStream)v3).readNBytes(((byte[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)1)};
    Object v1 = 0;
    Object v2 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)54),Byte.valueOf((byte)0)};
    Object v1 = 2;
    Object v2 = 1021;
    Object v3 = new java.io.ByteArrayInputStream(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((java.io.InputStream)v3).read();
    Object v5 = 8L;
    Object v6 = ((java.io.InputStream)v3).skip((((java.lang.Long)v5).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)54),Byte.valueOf((byte)0)};
    Object v1 = 2;
    Object v2 = 1021;
    Object v3 = new java.io.ByteArrayInputStream(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = 1L;
    Object v5 = ((java.io.InputStream)v3).skip((((java.lang.Long)v4).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)-35),Byte.valueOf((byte)2),Byte.valueOf((byte)1)};
    Object v1 = 25;
    Object v2 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)54),Byte.valueOf((byte)0)};
    Object v1 = 2;
    Object v2 = 1021;
    Object v3 = new java.io.ByteArrayInputStream(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = new byte[]{Byte.valueOf((byte)-29),Byte.valueOf((byte)1)};
    Object v5 = ((java.io.InputStream)v3).read(((byte[])v4));
    Object v6 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)76),Byte.valueOf((byte)-31)};
    Object v7 = 2;
    Object v8 = -35;
    Object v9 = ((java.io.InputStream)v3).readNBytes(((byte[])v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)54),Byte.valueOf((byte)0)};
    Object v1 = 2;
    Object v2 = 1021;
    Object v3 = new java.io.ByteArrayInputStream(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)-5),Byte.valueOf((byte)-25)};
    Object v5 = 12;
    Object v6 = 29;
    Object v7 = ((java.io.InputStream)v3).readNBytes(((byte[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)54),Byte.valueOf((byte)0)};
    Object v1 = 2;
    Object v2 = 1021;
    Object v3 = new java.io.ByteArrayInputStream(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = 26;
    Object v5 = ((java.io.InputStream)v3).readNBytes((((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)54),Byte.valueOf((byte)0)};
    Object v1 = 2;
    Object v2 = 1021;
    Object v3 = new java.io.ByteArrayInputStream(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = java.io.OutputStream.nullOutputStream();
    Object v5 = 0;
    ((java.io.OutputStream)v4).write((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    Object v7 = ((java.io.InputStream)v3).transferTo(((java.io.OutputStream)v4));
    org.junit.Assert.assertEquals((Object)(0L), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)54),Byte.valueOf((byte)0)};
    Object v1 = 2;
    Object v2 = 1021;
    Object v3 = new java.io.ByteArrayInputStream(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = java.io.OutputStream.nullOutputStream();
    Object v5 = 3;
    ((java.io.OutputStream)v4).write((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    Object v7 = ((java.io.InputStream)v3).transferTo(((java.io.OutputStream)v4));
    org.junit.Assert.assertEquals((Object)(0L), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)23),Byte.valueOf((byte)110)};
    Object v1 = 2;
    Object v2 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)54),Byte.valueOf((byte)0)};
    Object v1 = 2;
    Object v2 = 1021;
    Object v3 = new java.io.ByteArrayInputStream(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = 0L;
    Object v5 = ((java.io.InputStream)v3).skip((((java.lang.Long)v4).longValue()));
    Object v6 = 2;
    Object v7 = ((java.io.InputStream)v3).readNBytes((((java.lang.Integer)v6).intValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)54),Byte.valueOf((byte)0)};
    Object v1 = 2;
    Object v2 = 1021;
    Object v3 = new java.io.ByteArrayInputStream(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = false;
    Object v5 = new org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream(((java.io.InputStream)v3),(((java.lang.Boolean)v4).booleanValue()));
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)54),Byte.valueOf((byte)0)};
    Object v1 = 2;
    Object v2 = 1021;
    Object v3 = new java.io.ByteArrayInputStream(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = java.io.OutputStream.nullOutputStream();
    Object v5 = ((java.io.InputStream)v3).transferTo(((java.io.OutputStream)v4));
    Object v6 = -13;
    ((java.io.InputStream)v3).mark((((java.lang.Integer)v6).intValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new byte[]{Byte.valueOf((byte)0)};
    Object v2 = 5;
    Object v3 = 0;
    Object v4 = ((org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream)v0).read(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)54),Byte.valueOf((byte)0)};
    Object v1 = 2;
    Object v2 = 1021;
    Object v3 = new java.io.ByteArrayInputStream(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = 17L;
    Object v5 = ((java.io.InputStream)v3).skip((((java.lang.Long)v4).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = 0;
    Object v2 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)54),Byte.valueOf((byte)0)};
    Object v1 = 2;
    Object v2 = 1021;
    Object v3 = new java.io.ByteArrayInputStream(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = -22;
    Object v5 = ((java.io.InputStream)v3).readNBytes((((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)54),Byte.valueOf((byte)0)};
    Object v1 = 2;
    Object v2 = 1021;
    Object v3 = new java.io.ByteArrayInputStream(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = -42;
    Object v5 = ((java.io.InputStream)v3).readNBytes((((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)54),Byte.valueOf((byte)0)};
    Object v1 = 2;
    Object v2 = 1021;
    Object v3 = new java.io.ByteArrayInputStream(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = 16L;
    Object v5 = ((java.io.InputStream)v3).skip((((java.lang.Long)v4).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)54),Byte.valueOf((byte)0)};
    Object v1 = 2;
    Object v2 = 1021;
    Object v3 = new java.io.ByteArrayInputStream(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = new byte[]{Byte.valueOf((byte)51),Byte.valueOf((byte)16)};
    Object v5 = 16;
    Object v6 = 49;
    Object v7 = ((java.io.InputStream)v3).readNBytes(((byte[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)54),Byte.valueOf((byte)0)};
    Object v1 = 2;
    Object v2 = 1021;
    Object v3 = new java.io.ByteArrayInputStream(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = java.io.OutputStream.nullOutputStream();
    Object v5 = ((java.io.InputStream)v3).transferTo(((java.io.OutputStream)v4));
    Object v6 = new org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream(((java.io.InputStream)v3));
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)54),Byte.valueOf((byte)0)};
    Object v1 = 2;
    Object v2 = 1021;
    Object v3 = new java.io.ByteArrayInputStream(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = 41;
    Object v5 = ((java.io.InputStream)v3).readNBytes((((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)-1),Byte.valueOf((byte)1)};
    Object v1 = 1;
    Object v2 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)54),Byte.valueOf((byte)0)};
    Object v1 = 2;
    Object v2 = 1021;
    Object v3 = new java.io.ByteArrayInputStream(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = new byte[]{Byte.valueOf((byte)7),Byte.valueOf((byte)1),Byte.valueOf((byte)-8)};
    Object v5 = -92;
    Object v6 = 14;
    Object v7 = ((java.io.InputStream)v3).readNBytes(((byte[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new byte[]{Byte.valueOf((byte)1)};
    Object v2 = -30;
    Object v3 = 3;
    Object v4 = ((java.io.InputStream)v0).readNBytes(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)1)};
    Object v1 = -1;
    Object v2 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)54),Byte.valueOf((byte)0)};
    Object v1 = 2;
    Object v2 = 1021;
    Object v3 = new java.io.ByteArrayInputStream(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = new byte[]{Byte.valueOf((byte)41),Byte.valueOf((byte)-9)};
    Object v5 = 4;
    Object v6 = -34;
    Object v7 = ((java.io.InputStream)v3).readNBytes(((byte[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)54),Byte.valueOf((byte)0)};
    Object v1 = 2;
    Object v2 = 1021;
    Object v3 = new java.io.ByteArrayInputStream(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = new byte[]{Byte.valueOf((byte)-9),Byte.valueOf((byte)-12)};
    Object v5 = ((java.io.InputStream)v3).read(((byte[])v4));
    Object v6 = ((java.io.InputStream)v3).markSupported();
    org.junit.Assert.assertEquals((Object)(true), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)-24),Byte.valueOf((byte)0)};
    Object v1 = -1;
    Object v2 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)54),Byte.valueOf((byte)0)};
    Object v1 = 2;
    Object v2 = 1021;
    Object v3 = new java.io.ByteArrayInputStream(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = -15L;
    Object v5 = ((java.io.InputStream)v3).skip((((java.lang.Long)v4).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)54),Byte.valueOf((byte)0)};
    Object v1 = 2;
    Object v2 = 1021;
    Object v3 = new java.io.ByteArrayInputStream(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    ((java.io.InputStream)v3).reset();
    Object v4 = null;
    Object v5 = java.io.OutputStream.nullOutputStream();
    Object v6 = ((java.io.InputStream)v3).transferTo(((java.io.OutputStream)v5));
    org.junit.Assert.assertEquals((Object)(0L), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)54),Byte.valueOf((byte)0)};
    Object v1 = 2;
    Object v2 = 1021;
    Object v3 = new java.io.ByteArrayInputStream(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((java.io.InputStream)v3).read();
    Object v5 = -16L;
    Object v6 = ((java.io.InputStream)v3).skip((((java.lang.Long)v5).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)17),Byte.valueOf((byte)-10)};
    Object v1 = 17;
    Object v2 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)54),Byte.valueOf((byte)0)};
    Object v1 = 2;
    Object v2 = 1021;
    Object v3 = new java.io.ByteArrayInputStream(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = 1;
    Object v5 = ((java.io.InputStream)v3).readNBytes((((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)54),Byte.valueOf((byte)0)};
    Object v1 = 2;
    Object v2 = 1021;
    Object v3 = new java.io.ByteArrayInputStream(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = new byte[]{};
    Object v5 = -41;
    Object v6 = 1;
    Object v7 = ((java.io.InputStream)v3).readNBytes(((byte[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)54),Byte.valueOf((byte)0)};
    Object v1 = 2;
    Object v2 = 1021;
    Object v3 = new java.io.ByteArrayInputStream(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = java.io.OutputStream.nullOutputStream();
    Object v5 = ((java.io.InputStream)v3).transferTo(((java.io.OutputStream)v4));
    Object v6 = ((java.io.InputStream)v3).available();
    org.junit.Assert.assertEquals((Object)(0), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)25)};
    Object v1 = -12;
    Object v2 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 66;
    Object v2 = ((java.io.InputStream)v0).readNBytes((((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)54),Byte.valueOf((byte)0)};
    Object v1 = 2;
    Object v2 = 1021;
    Object v3 = new java.io.ByteArrayInputStream(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = -3L;
    Object v5 = ((java.io.InputStream)v3).skip((((java.lang.Long)v4).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)54),Byte.valueOf((byte)0)};
    Object v1 = 2;
    Object v2 = 1021;
    Object v3 = new java.io.ByteArrayInputStream(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = 0;
    Object v5 = ((java.io.InputStream)v3).readNBytes((((java.lang.Integer)v4).intValue()));
    Object v6 = java.io.OutputStream.nullOutputStream();
    Object v7 = ((java.io.InputStream)v3).transferTo(((java.io.OutputStream)v6));
    org.junit.Assert.assertEquals((Object)(0L), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)53),Byte.valueOf((byte)1),Byte.valueOf((byte)49)};
    Object v1 = 24;
    Object v2 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)-33),Byte.valueOf((byte)-2)};
    Object v1 = 20;
    Object v2 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)54),Byte.valueOf((byte)0)};
    Object v1 = 2;
    Object v2 = 1021;
    Object v3 = new java.io.ByteArrayInputStream(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = 0;
    Object v5 = ((java.io.InputStream)v3).readNBytes((((java.lang.Integer)v4).intValue()));
    Object v6 = 14;
    Object v7 = ((java.io.InputStream)v3).readNBytes((((java.lang.Integer)v6).intValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)54),Byte.valueOf((byte)0)};
    Object v1 = 2;
    Object v2 = 1021;
    Object v3 = new java.io.ByteArrayInputStream(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = new byte[]{Byte.valueOf((byte)4)};
    Object v5 = 1;
    Object v6 = 1855180412;
    Object v7 = ((java.io.InputStream)v3).readNBytes(((byte[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)54),Byte.valueOf((byte)0)};
    Object v1 = 2;
    Object v2 = 1021;
    Object v3 = new java.io.ByteArrayInputStream(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = java.io.OutputStream.nullOutputStream();
    Object v5 = ((java.io.InputStream)v3).transferTo(((java.io.OutputStream)v4));
    Object v6 = new byte[]{Byte.valueOf((byte)1)};
    Object v7 = -67;
    Object v8 = 37;
    Object v9 = ((java.io.InputStream)v3).readNBytes(((byte[])v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)54),Byte.valueOf((byte)0)};
    Object v1 = 2;
    Object v2 = 1021;
    Object v3 = new java.io.ByteArrayInputStream(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)21)};
    Object v5 = ((java.io.InputStream)v3).read(((byte[])v4));
    Object v6 = false;
    Object v7 = new org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream(((java.io.InputStream)v3),(((java.lang.Boolean)v6).booleanValue()));
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)54),Byte.valueOf((byte)0)};
    Object v1 = 2;
    Object v2 = 1021;
    Object v3 = new java.io.ByteArrayInputStream(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = 8L;
    Object v5 = ((java.io.InputStream)v3).skip((((java.lang.Long)v4).longValue()));
    Object v6 = java.io.OutputStream.nullOutputStream();
    Object v7 = ((java.io.InputStream)v3).transferTo(((java.io.OutputStream)v6));
    org.junit.Assert.assertEquals((Object)(0L), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)0),Byte.valueOf((byte)39)};
    Object v2 = ((java.io.InputStream)v0).read(((byte[])v1));
    org.junit.Assert.assertEquals((Object)(-1), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)-18),Byte.valueOf((byte)1),Byte.valueOf((byte)1)};
    Object v1 = 90;
    Object v2 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)-74),Byte.valueOf((byte)-95)};
    Object v1 = 40;
    Object v2 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new byte[]{Byte.valueOf((byte)0)};
    Object v2 = 0;
    Object v3 = 1;
    Object v4 = ((java.io.InputStream)v0).readNBytes(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertEquals((Object)(0), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = java.io.OutputStream.nullOutputStream();
    Object v2 = ((java.io.InputStream)v0).transferTo(((java.io.OutputStream)v1));
    org.junit.Assert.assertEquals((Object)(0L), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)15),Byte.valueOf((byte)-33)};
    Object v1 = 8;
    Object v2 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new byte[]{Byte.valueOf((byte)0)};
    Object v2 = 5;
    Object v3 = 4;
    Object v4 = ((java.io.InputStream)v0).readNBytes(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)54),Byte.valueOf((byte)0)};
    Object v1 = 2;
    Object v2 = 1021;
    Object v3 = new java.io.ByteArrayInputStream(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    ((java.io.InputStream)v3).reset();
    Object v4 = null;
    Object v5 = 0;
    Object v6 = ((java.io.InputStream)v3).readNBytes((((java.lang.Integer)v5).intValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)54),Byte.valueOf((byte)0)};
    Object v1 = 2;
    Object v2 = 1021;
    Object v3 = new java.io.ByteArrayInputStream(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((java.io.InputStream)v3).markSupported();
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)54),Byte.valueOf((byte)0)};
    Object v1 = 2;
    Object v2 = 1021;
    Object v3 = new java.io.ByteArrayInputStream(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = -41L;
    Object v5 = ((java.io.InputStream)v3).skip((((java.lang.Long)v4).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)54),Byte.valueOf((byte)0)};
    Object v1 = 2;
    Object v2 = 1021;
    Object v3 = new java.io.ByteArrayInputStream(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((java.io.InputStream)v3).read();
    Object v5 = new byte[]{Byte.valueOf((byte)-27),Byte.valueOf((byte)39)};
    Object v6 = ((java.io.InputStream)v3).read(((byte[])v5));
    org.junit.Assert.assertEquals((Object)(-1), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)54),Byte.valueOf((byte)0)};
    Object v1 = 2;
    Object v2 = 1021;
    Object v3 = new java.io.ByteArrayInputStream(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = new byte[]{Byte.valueOf((byte)-65),Byte.valueOf((byte)16),Byte.valueOf((byte)0)};
    Object v5 = ((java.io.InputStream)v3).read(((byte[])v4));
    Object v6 = 0;
    Object v7 = ((java.io.InputStream)v3).readNBytes((((java.lang.Integer)v6).intValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new byte[]{Byte.valueOf((byte)79),Byte.valueOf((byte)1)};
    Object v2 = 1;
    Object v3 = 1;
    Object v4 = ((java.io.InputStream)v0).read(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = new byte[]{};
    Object v6 = ((java.io.InputStream)v0).read(((byte[])v5));
    org.junit.Assert.assertEquals((Object)(0), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)54),Byte.valueOf((byte)0)};
    Object v1 = 2;
    Object v2 = 1021;
    Object v3 = new java.io.ByteArrayInputStream(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)8),Byte.valueOf((byte)5)};
    Object v5 = ((java.io.InputStream)v3).read(((byte[])v4));
    Object v6 = new byte[]{Byte.valueOf((byte)51),Byte.valueOf((byte)0),Byte.valueOf((byte)5)};
    Object v7 = 33;
    Object v8 = 0;
    Object v9 = ((java.io.InputStream)v3).readNBytes(((byte[])v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)54),Byte.valueOf((byte)0)};
    Object v1 = 2;
    Object v2 = 1021;
    Object v3 = new java.io.ByteArrayInputStream(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)25),Byte.valueOf((byte)4)};
    Object v5 = 1;
    Object v6 = 1;
    Object v7 = ((java.io.InputStream)v3).readNBytes(((byte[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    org.junit.Assert.assertEquals((Object)(0), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = ((java.io.InputStream)v0).available();
    org.junit.Assert.assertEquals((Object)(0), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)54),Byte.valueOf((byte)0)};
    Object v1 = 2;
    Object v2 = 1021;
    Object v3 = new java.io.ByteArrayInputStream(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = 85L;
    Object v5 = ((java.io.InputStream)v3).skip((((java.lang.Long)v4).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 0;
    Object v2 = ((java.io.InputStream)v0).readNBytes((((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = null;
    ((org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream)v0).close();
    Object v1 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)54),Byte.valueOf((byte)0)};
    Object v1 = 2;
    Object v2 = 1021;
    Object v3 = new java.io.ByteArrayInputStream(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((java.io.InputStream)v3).readAllBytes();
    Object v5 = 2L;
    Object v6 = ((java.io.InputStream)v3).skip((((java.lang.Long)v5).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)54),Byte.valueOf((byte)0)};
    Object v1 = 2;
    Object v2 = 1021;
    Object v3 = new java.io.ByteArrayInputStream(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)86)};
    Object v5 = 0;
    Object v6 = 0;
    Object v7 = ((java.io.InputStream)v3).readNBytes(((byte[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = java.io.OutputStream.nullOutputStream();
    Object v9 = ((java.io.InputStream)v3).transferTo(((java.io.OutputStream)v8));
    org.junit.Assert.assertEquals((Object)(0L), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)54),Byte.valueOf((byte)0)};
    Object v1 = 2;
    Object v2 = 1021;
    Object v3 = new java.io.ByteArrayInputStream(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)31),Byte.valueOf((byte)1)};
    Object v5 = ((java.io.InputStream)v3).read(((byte[])v4));
    org.junit.Assert.assertEquals((Object)(-1), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)35),Byte.valueOf((byte)37),Byte.valueOf((byte)-38)};
    Object v1 = 12;
    Object v2 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)4)};
    Object v1 = 1;
    Object v2 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new byte[]{Byte.valueOf((byte)59)};
    Object v2 = -23;
    Object v3 = -30;
    Object v4 = ((java.io.InputStream)v0).readNBytes(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)25)};
    Object v1 = 0;
    Object v2 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)54),Byte.valueOf((byte)0)};
    Object v1 = 2;
    Object v2 = 1021;
    Object v3 = new java.io.ByteArrayInputStream(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = new byte[]{Byte.valueOf((byte)25),Byte.valueOf((byte)0)};
    Object v5 = ((java.io.InputStream)v3).read(((byte[])v4));
    org.junit.Assert.assertEquals((Object)(-1), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)54),Byte.valueOf((byte)0)};
    Object v1 = 2;
    Object v2 = 1021;
    Object v3 = new java.io.ByteArrayInputStream(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = 0L;
    Object v5 = ((java.io.InputStream)v3).skip((((java.lang.Long)v4).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)54),Byte.valueOf((byte)0)};
    Object v1 = 2;
    Object v2 = 1021;
    Object v3 = new java.io.ByteArrayInputStream(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = 9;
    Object v5 = ((java.io.InputStream)v3).readNBytes((((java.lang.Integer)v4).intValue()));
    Object v6 = java.io.OutputStream.nullOutputStream();
    Object v7 = ((java.io.InputStream)v3).transferTo(((java.io.OutputStream)v6));
    org.junit.Assert.assertEquals((Object)(0L), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)54),Byte.valueOf((byte)0)};
    Object v1 = 2;
    Object v2 = 1021;
    Object v3 = new java.io.ByteArrayInputStream(((byte[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = new byte[]{Byte.valueOf((byte)8),Byte.valueOf((byte)9),Byte.valueOf((byte)62)};
    Object v5 = 0;
    Object v6 = 3;
    Object v7 = ((java.io.InputStream)v3).readNBytes(((byte[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    org.junit.Assert.assertEquals((Object)(0), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -15L;
    Object v2 = ((java.io.InputStream)v0).skip((((java.lang.Long)v1).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 464L;
    Object v2 = ((java.io.InputStream)v0).skip((((java.lang.Long)v1).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 1L;
    Object v2 = ((java.io.InputStream)v0).skip((((java.lang.Long)v1).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)16),Byte.valueOf((byte)14),Byte.valueOf((byte)0)};
    Object v1 = 1;
    Object v2 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)-10)};
    Object v1 = 0;
    Object v2 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }
}
