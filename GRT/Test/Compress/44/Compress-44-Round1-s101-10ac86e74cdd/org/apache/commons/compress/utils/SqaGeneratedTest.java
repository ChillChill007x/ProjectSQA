package org.apache.commons.compress.utils;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = 39;
    Object v1 = new org.apache.commons.compress.compressors.lz4.XXHash32((((java.lang.Integer)v0).intValue()));
    Object v2 = java.io.InputStream.nullInputStream();
    Object v3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(((java.util.zip.Checksum)v1),((java.io.InputStream)v2));
    Object v4 = ((org.apache.commons.compress.utils.ChecksumCalculatingInputStream)v3).read();
    org.junit.Assert.assertEquals((Object)(-1), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 1;
    Object v2 = ((java.io.InputStream)v0).readNBytes((((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = 39;
    Object v1 = new org.apache.commons.compress.compressors.lz4.XXHash32((((java.lang.Integer)v0).intValue()));
    Object v2 = java.io.InputStream.nullInputStream();
    Object v3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(((java.util.zip.Checksum)v1),((java.io.InputStream)v2));
    Object v4 = -7L;
    Object v5 = ((org.apache.commons.compress.utils.ChecksumCalculatingInputStream)v3).skip((((java.lang.Long)v4).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = 39;
    Object v1 = new org.apache.commons.compress.compressors.lz4.XXHash32((((java.lang.Integer)v0).intValue()));
    Object v2 = java.io.InputStream.nullInputStream();
    Object v3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(((java.util.zip.Checksum)v1),((java.io.InputStream)v2));
    Object v4 = 1L;
    Object v5 = ((org.apache.commons.compress.utils.ChecksumCalculatingInputStream)v3).skip((((java.lang.Long)v4).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = 39;
    Object v1 = new org.apache.commons.compress.compressors.lz4.XXHash32((((java.lang.Integer)v0).intValue()));
    Object v2 = java.io.InputStream.nullInputStream();
    Object v3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(((java.util.zip.Checksum)v1),((java.io.InputStream)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = 39;
    Object v1 = new org.apache.commons.compress.compressors.lz4.XXHash32((((java.lang.Integer)v0).intValue()));
    Object v2 = java.io.InputStream.nullInputStream();
    Object v3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(((java.util.zip.Checksum)v1),((java.io.InputStream)v2));
    Object v4 = 0L;
    Object v5 = ((org.apache.commons.compress.utils.ChecksumCalculatingInputStream)v3).skip((((java.lang.Long)v4).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new byte[]{Byte.valueOf((byte)1)};
    Object v2 = 16;
    Object v3 = 1;
    Object v4 = ((java.io.InputStream)v0).readNBytes(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 0;
    ((java.io.InputStream)v0).mark((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new byte[]{Byte.valueOf((byte)17),Byte.valueOf((byte)0)};
    Object v2 = 0;
    Object v3 = 0;
    Object v4 = ((java.io.InputStream)v0).readNBytes(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertEquals((Object)(0), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = 39;
    Object v1 = new org.apache.commons.compress.compressors.lz4.XXHash32((((java.lang.Integer)v0).intValue()));
    Object v2 = java.io.InputStream.nullInputStream();
    Object v3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(((java.util.zip.Checksum)v1),((java.io.InputStream)v2));
    Object v4 = new byte[]{Byte.valueOf((byte)47),Byte.valueOf((byte)31),Byte.valueOf((byte)-16)};
    Object v5 = -7;
    Object v6 = 43;
    Object v7 = ((org.apache.commons.compress.utils.ChecksumCalculatingInputStream)v3).read(((byte[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 23;
    Object v2 = ((java.io.InputStream)v0).readNBytes((((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = java.io.OutputStream.nullOutputStream();
    Object v2 = ((java.io.InputStream)v0).transferTo(((java.io.OutputStream)v1));
    org.junit.Assert.assertEquals((Object)(0L), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = 39;
    Object v1 = new org.apache.commons.compress.compressors.lz4.XXHash32((((java.lang.Integer)v0).intValue()));
    Object v2 = java.io.InputStream.nullInputStream();
    Object v3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(((java.util.zip.Checksum)v1),((java.io.InputStream)v2));
    Object v4 = 0L;
    Object v5 = ((org.apache.commons.compress.utils.ChecksumCalculatingInputStream)v3).skip((((java.lang.Long)v4).longValue()));
    Object v6 = new byte[]{Byte.valueOf((byte)1)};
    Object v7 = 3;
    Object v8 = 0;
    Object v9 = ((org.apache.commons.compress.utils.ChecksumCalculatingInputStream)v3).read(((byte[])v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new byte[]{Byte.valueOf((byte)3)};
    Object v2 = 0;
    Object v3 = 0;
    Object v4 = ((java.io.InputStream)v0).readNBytes(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    ((java.io.InputStream)v0).reset();
    Object v5 = null;
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = 39;
    Object v1 = new org.apache.commons.compress.compressors.lz4.XXHash32((((java.lang.Integer)v0).intValue()));
    Object v2 = java.io.InputStream.nullInputStream();
    Object v3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(((java.util.zip.Checksum)v1),((java.io.InputStream)v2));
    Object v4 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)28)};
    Object v5 = ((org.apache.commons.compress.utils.ChecksumCalculatingInputStream)v3).read(((byte[])v4));
    Object v6 = ((org.apache.commons.compress.utils.ChecksumCalculatingInputStream)v3).read();
    org.junit.Assert.assertEquals((Object)(-1), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = ((java.io.InputStream)v0).readAllBytes();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = ((java.io.InputStream)v0).available();
    org.junit.Assert.assertEquals((Object)(0), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = 39;
    Object v1 = new org.apache.commons.compress.compressors.lz4.XXHash32((((java.lang.Integer)v0).intValue()));
    Object v2 = java.io.InputStream.nullInputStream();
    Object v3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(((java.util.zip.Checksum)v1),((java.io.InputStream)v2));
    Object v4 = 72L;
    Object v5 = ((org.apache.commons.compress.utils.ChecksumCalculatingInputStream)v3).skip((((java.lang.Long)v4).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -2;
    Object v2 = ((java.io.InputStream)v0).readNBytes((((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = 39;
    Object v1 = new org.apache.commons.compress.compressors.lz4.XXHash32((((java.lang.Integer)v0).intValue()));
    Object v2 = java.io.InputStream.nullInputStream();
    Object v3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(((java.util.zip.Checksum)v1),((java.io.InputStream)v2));
    Object v4 = 27L;
    Object v5 = ((org.apache.commons.compress.utils.ChecksumCalculatingInputStream)v3).skip((((java.lang.Long)v4).longValue()));
    Object v6 = ((org.apache.commons.compress.utils.ChecksumCalculatingInputStream)v3).read();
    org.junit.Assert.assertEquals((Object)(-1), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = 39;
    Object v1 = new org.apache.commons.compress.compressors.lz4.XXHash32((((java.lang.Integer)v0).intValue()));
    Object v2 = java.io.InputStream.nullInputStream();
    Object v3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(((java.util.zip.Checksum)v1),((java.io.InputStream)v2));
    Object v4 = ((org.apache.commons.compress.utils.ChecksumCalculatingInputStream)v3).getValue();
    Object v5 = ((org.apache.commons.compress.utils.ChecksumCalculatingInputStream)v3).read();
    org.junit.Assert.assertEquals((Object)(-1), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new byte[]{Byte.valueOf((byte)0)};
    Object v2 = 3;
    Object v3 = 7;
    Object v4 = ((java.io.InputStream)v0).readNBytes(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new byte[]{};
    Object v2 = 1;
    Object v3 = 0;
    Object v4 = ((java.io.InputStream)v0).readNBytes(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = 39;
    Object v1 = new org.apache.commons.compress.compressors.lz4.XXHash32((((java.lang.Integer)v0).intValue()));
    Object v2 = java.io.InputStream.nullInputStream();
    Object v3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(((java.util.zip.Checksum)v1),((java.io.InputStream)v2));
    Object v4 = 4L;
    Object v5 = ((org.apache.commons.compress.utils.ChecksumCalculatingInputStream)v3).skip((((java.lang.Long)v4).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = 39;
    Object v1 = new org.apache.commons.compress.compressors.lz4.XXHash32((((java.lang.Integer)v0).intValue()));
    Object v2 = java.io.InputStream.nullInputStream();
    Object v3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(((java.util.zip.Checksum)v1),((java.io.InputStream)v2));
    Object v4 = new byte[]{Byte.valueOf((byte)24)};
    Object v5 = -50;
    Object v6 = 1;
    Object v7 = ((java.io.InputStream)v3).readNBytes(((byte[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 0;
    Object v2 = ((java.io.InputStream)v0).readNBytes((((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = 39;
    Object v1 = new org.apache.commons.compress.compressors.lz4.XXHash32((((java.lang.Integer)v0).intValue()));
    Object v2 = java.io.InputStream.nullInputStream();
    Object v3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(((java.util.zip.Checksum)v1),((java.io.InputStream)v2));
    Object v4 = 81L;
    Object v5 = ((org.apache.commons.compress.utils.ChecksumCalculatingInputStream)v3).skip((((java.lang.Long)v4).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new byte[]{Byte.valueOf((byte)9),Byte.valueOf((byte)45)};
    Object v2 = 16;
    Object v3 = 0;
    Object v4 = ((java.io.InputStream)v0).readNBytes(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = 39;
    Object v1 = new org.apache.commons.compress.compressors.lz4.XXHash32((((java.lang.Integer)v0).intValue()));
    Object v2 = java.io.InputStream.nullInputStream();
    Object v3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(((java.util.zip.Checksum)v1),((java.io.InputStream)v2));
    Object v4 = java.io.OutputStream.nullOutputStream();
    Object v5 = ((java.io.InputStream)v3).transferTo(((java.io.OutputStream)v4));
    Object v6 = 58L;
    Object v7 = ((org.apache.commons.compress.utils.ChecksumCalculatingInputStream)v3).skip((((java.lang.Long)v6).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = 39;
    Object v1 = new org.apache.commons.compress.compressors.lz4.XXHash32((((java.lang.Integer)v0).intValue()));
    Object v2 = java.io.InputStream.nullInputStream();
    Object v3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(((java.util.zip.Checksum)v1),((java.io.InputStream)v2));
    Object v4 = 0L;
    Object v5 = ((org.apache.commons.compress.utils.ChecksumCalculatingInputStream)v3).skip((((java.lang.Long)v4).longValue()));
    Object v6 = ((org.apache.commons.compress.utils.ChecksumCalculatingInputStream)v3).read();
    org.junit.Assert.assertEquals((Object)(-1), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = 39;
    Object v1 = new org.apache.commons.compress.compressors.lz4.XXHash32((((java.lang.Integer)v0).intValue()));
    Object v2 = java.io.InputStream.nullInputStream();
    Object v3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(((java.util.zip.Checksum)v1),((java.io.InputStream)v2));
    Object v4 = new byte[]{};
    Object v5 = 72;
    Object v6 = 1;
    Object v7 = ((org.apache.commons.compress.utils.ChecksumCalculatingInputStream)v3).read(((byte[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = 39;
    Object v1 = new org.apache.commons.compress.compressors.lz4.XXHash32((((java.lang.Integer)v0).intValue()));
    Object v2 = java.io.InputStream.nullInputStream();
    Object v3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(((java.util.zip.Checksum)v1),((java.io.InputStream)v2));
    Object v4 = new byte[]{Byte.valueOf((byte)11),Byte.valueOf((byte)4),Byte.valueOf((byte)-32)};
    Object v5 = ((org.apache.commons.compress.utils.ChecksumCalculatingInputStream)v3).read(((byte[])v4));
    Object v6 = 13L;
    Object v7 = ((org.apache.commons.compress.utils.ChecksumCalculatingInputStream)v3).skip((((java.lang.Long)v6).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = 39;
    Object v1 = new org.apache.commons.compress.compressors.lz4.XXHash32((((java.lang.Integer)v0).intValue()));
    Object v2 = java.io.InputStream.nullInputStream();
    Object v3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(((java.util.zip.Checksum)v1),((java.io.InputStream)v2));
    Object v4 = ((org.apache.commons.compress.utils.ChecksumCalculatingInputStream)v3).getValue();
    Object v5 = 0L;
    Object v6 = ((org.apache.commons.compress.utils.ChecksumCalculatingInputStream)v3).skip((((java.lang.Long)v5).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = 39;
    Object v1 = new org.apache.commons.compress.compressors.lz4.XXHash32((((java.lang.Integer)v0).intValue()));
    Object v2 = java.io.InputStream.nullInputStream();
    Object v3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(((java.util.zip.Checksum)v1),((java.io.InputStream)v2));
    Object v4 = 0L;
    Object v5 = ((org.apache.commons.compress.utils.ChecksumCalculatingInputStream)v3).skip((((java.lang.Long)v4).longValue()));
    Object v6 = new byte[]{};
    Object v7 = 14;
    Object v8 = 255;
    Object v9 = ((org.apache.commons.compress.utils.ChecksumCalculatingInputStream)v3).read(((byte[])v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -3;
    Object v2 = ((java.io.InputStream)v0).readNBytes((((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = java.io.OutputStream.nullOutputStream();
    Object v2 = 0;
    ((java.io.OutputStream)v1).write((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    Object v4 = ((java.io.InputStream)v0).transferTo(((java.io.OutputStream)v1));
    org.junit.Assert.assertEquals((Object)(0L), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    ((java.io.InputStream)v0).reset();
    Object v1 = null;
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = ((java.io.InputStream)v0).markSupported();
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = 39;
    Object v1 = new org.apache.commons.compress.compressors.lz4.XXHash32((((java.lang.Integer)v0).intValue()));
    Object v2 = java.io.InputStream.nullInputStream();
    Object v3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(((java.util.zip.Checksum)v1),((java.io.InputStream)v2));
    Object v4 = 21L;
    Object v5 = ((org.apache.commons.compress.utils.ChecksumCalculatingInputStream)v3).skip((((java.lang.Long)v4).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new byte[]{Byte.valueOf((byte)0)};
    Object v2 = 0;
    Object v3 = 1;
    Object v4 = ((java.io.InputStream)v0).readNBytes(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertEquals((Object)(0), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    ((java.io.InputStream)v0).close();
    Object v1 = null;
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = 39;
    Object v1 = new org.apache.commons.compress.compressors.lz4.XXHash32((((java.lang.Integer)v0).intValue()));
    Object v2 = java.io.InputStream.nullInputStream();
    Object v3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(((java.util.zip.Checksum)v1),((java.io.InputStream)v2));
    Object v4 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)1),Byte.valueOf((byte)1)};
    Object v5 = -71;
    Object v6 = -12;
    Object v7 = ((org.apache.commons.compress.utils.ChecksumCalculatingInputStream)v3).read(((byte[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = 39;
    Object v1 = new org.apache.commons.compress.compressors.lz4.XXHash32((((java.lang.Integer)v0).intValue()));
    Object v2 = java.io.InputStream.nullInputStream();
    Object v3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(((java.util.zip.Checksum)v1),((java.io.InputStream)v2));
    Object v4 = java.io.OutputStream.nullOutputStream();
    Object v5 = ((java.io.InputStream)v3).transferTo(((java.io.OutputStream)v4));
    org.junit.Assert.assertEquals((Object)(0L), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = ((java.io.InputStream)v0).read();
    Object v2 = new byte[]{};
    Object v3 = -21;
    Object v4 = 0;
    Object v5 = ((java.io.InputStream)v0).readNBytes(((byte[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -41;
    Object v2 = ((java.io.InputStream)v0).readNBytes((((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = 39;
    Object v1 = new org.apache.commons.compress.compressors.lz4.XXHash32((((java.lang.Integer)v0).intValue()));
    Object v2 = java.io.InputStream.nullInputStream();
    Object v3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(((java.util.zip.Checksum)v1),((java.io.InputStream)v2));
    Object v4 = -24;
    Object v5 = ((java.io.InputStream)v3).readNBytes((((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -11;
    Object v2 = ((java.io.InputStream)v0).readNBytes((((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = 39;
    Object v1 = new org.apache.commons.compress.compressors.lz4.XXHash32((((java.lang.Integer)v0).intValue()));
    Object v2 = java.io.InputStream.nullInputStream();
    Object v3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(((java.util.zip.Checksum)v1),((java.io.InputStream)v2));
    Object v4 = new byte[]{Byte.valueOf((byte)-7)};
    Object v5 = ((org.apache.commons.compress.utils.ChecksumCalculatingInputStream)v3).read(((byte[])v4));
    org.junit.Assert.assertEquals((Object)(-1), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = 39;
    Object v1 = new org.apache.commons.compress.compressors.lz4.XXHash32((((java.lang.Integer)v0).intValue()));
    Object v2 = java.io.InputStream.nullInputStream();
    Object v3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(((java.util.zip.Checksum)v1),((java.io.InputStream)v2));
    Object v4 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)-18),Byte.valueOf((byte)-10)};
    Object v5 = -1;
    Object v6 = -8;
    Object v7 = ((java.io.InputStream)v3).readNBytes(((byte[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = 39;
    Object v1 = new org.apache.commons.compress.compressors.lz4.XXHash32((((java.lang.Integer)v0).intValue()));
    Object v2 = java.io.InputStream.nullInputStream();
    Object v3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(((java.util.zip.Checksum)v1),((java.io.InputStream)v2));
    Object v4 = 2L;
    Object v5 = ((org.apache.commons.compress.utils.ChecksumCalculatingInputStream)v3).skip((((java.lang.Long)v4).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = 39;
    Object v1 = new org.apache.commons.compress.compressors.lz4.XXHash32((((java.lang.Integer)v0).intValue()));
    Object v2 = 0;
    ((java.util.zip.Checksum)v1).update((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    Object v4 = java.io.InputStream.nullInputStream();
    Object v5 = 0L;
    Object v6 = ((java.io.InputStream)v4).skip((((java.lang.Long)v5).longValue()));
    Object v7 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(((java.util.zip.Checksum)v1),((java.io.InputStream)v4));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = 39;
    Object v1 = new org.apache.commons.compress.compressors.lz4.XXHash32((((java.lang.Integer)v0).intValue()));
    Object v2 = 0;
    ((java.util.zip.Checksum)v1).update((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    Object v4 = java.io.InputStream.nullInputStream();
    Object v5 = 0L;
    Object v6 = ((java.io.InputStream)v4).skip((((java.lang.Long)v5).longValue()));
    Object v7 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(((java.util.zip.Checksum)v1),((java.io.InputStream)v4));
    Object v8 = new byte[]{Byte.valueOf((byte)60),Byte.valueOf((byte)1),Byte.valueOf((byte)-1)};
    Object v9 = ((org.apache.commons.compress.utils.ChecksumCalculatingInputStream)v7).read(((byte[])v8));
    Object v10 = new byte[]{};
    Object v11 = ((org.apache.commons.compress.utils.ChecksumCalculatingInputStream)v7).read(((byte[])v10));
    org.junit.Assert.assertEquals((Object)(0), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = 39;
    Object v1 = new org.apache.commons.compress.compressors.lz4.XXHash32((((java.lang.Integer)v0).intValue()));
    Object v2 = 0;
    ((java.util.zip.Checksum)v1).update((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    Object v4 = java.io.InputStream.nullInputStream();
    Object v5 = 0L;
    Object v6 = ((java.io.InputStream)v4).skip((((java.lang.Long)v5).longValue()));
    Object v7 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(((java.util.zip.Checksum)v1),((java.io.InputStream)v4));
    Object v8 = 1L;
    Object v9 = ((org.apache.commons.compress.utils.ChecksumCalculatingInputStream)v7).skip((((java.lang.Long)v8).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = 39;
    Object v1 = new org.apache.commons.compress.compressors.lz4.XXHash32((((java.lang.Integer)v0).intValue()));
    Object v2 = 0;
    ((java.util.zip.Checksum)v1).update((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    Object v4 = java.io.InputStream.nullInputStream();
    Object v5 = 0L;
    Object v6 = ((java.io.InputStream)v4).skip((((java.lang.Long)v5).longValue()));
    Object v7 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(((java.util.zip.Checksum)v1),((java.io.InputStream)v4));
    Object v8 = -17L;
    Object v9 = ((org.apache.commons.compress.utils.ChecksumCalculatingInputStream)v7).skip((((java.lang.Long)v8).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = 39;
    Object v1 = new org.apache.commons.compress.compressors.lz4.XXHash32((((java.lang.Integer)v0).intValue()));
    Object v2 = 0;
    ((java.util.zip.Checksum)v1).update((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    Object v4 = java.io.InputStream.nullInputStream();
    Object v5 = 0L;
    Object v6 = ((java.io.InputStream)v4).skip((((java.lang.Long)v5).longValue()));
    Object v7 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(((java.util.zip.Checksum)v1),((java.io.InputStream)v4));
    Object v8 = 0;
    Object v9 = ((java.io.InputStream)v7).readNBytes((((java.lang.Integer)v8).intValue()));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = 39;
    Object v1 = new org.apache.commons.compress.compressors.lz4.XXHash32((((java.lang.Integer)v0).intValue()));
    Object v2 = 0;
    ((java.util.zip.Checksum)v1).update((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    Object v4 = java.io.InputStream.nullInputStream();
    Object v5 = 0L;
    Object v6 = ((java.io.InputStream)v4).skip((((java.lang.Long)v5).longValue()));
    Object v7 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(((java.util.zip.Checksum)v1),((java.io.InputStream)v4));
    Object v8 = ((org.apache.commons.compress.utils.ChecksumCalculatingInputStream)v7).getValue();
    org.junit.Assert.assertEquals((Object)(3923725897L), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = 39;
    Object v1 = new org.apache.commons.compress.compressors.lz4.XXHash32((((java.lang.Integer)v0).intValue()));
    Object v2 = java.io.InputStream.nullInputStream();
    Object v3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(((java.util.zip.Checksum)v1),((java.io.InputStream)v2));
    Object v4 = ((java.io.InputStream)v3).markSupported();
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 30;
    Object v2 = ((java.io.InputStream)v0).readNBytes((((java.lang.Integer)v1).intValue()));
    Object v3 = java.io.OutputStream.nullOutputStream();
    Object v4 = ((java.io.InputStream)v0).transferTo(((java.io.OutputStream)v3));
    org.junit.Assert.assertEquals((Object)(0L), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = 39;
    Object v1 = new org.apache.commons.compress.compressors.lz4.XXHash32((((java.lang.Integer)v0).intValue()));
    Object v2 = 0;
    ((java.util.zip.Checksum)v1).update((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    Object v4 = java.io.InputStream.nullInputStream();
    Object v5 = 0L;
    Object v6 = ((java.io.InputStream)v4).skip((((java.lang.Long)v5).longValue()));
    Object v7 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(((java.util.zip.Checksum)v1),((java.io.InputStream)v4));
    Object v8 = ((java.io.InputStream)v7).readAllBytes();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = 39;
    Object v1 = new org.apache.commons.compress.compressors.lz4.XXHash32((((java.lang.Integer)v0).intValue()));
    Object v2 = 0;
    ((java.util.zip.Checksum)v1).update((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    Object v4 = java.io.InputStream.nullInputStream();
    Object v5 = 0L;
    Object v6 = ((java.io.InputStream)v4).skip((((java.lang.Long)v5).longValue()));
    Object v7 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(((java.util.zip.Checksum)v1),((java.io.InputStream)v4));
    Object v8 = ((java.io.InputStream)v7).read();
    Object v9 = -29;
    Object v10 = ((java.io.InputStream)v7).readNBytes((((java.lang.Integer)v9).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)68),Byte.valueOf((byte)0)};
    Object v2 = ((java.io.InputStream)v0).read(((byte[])v1));
    Object v3 = ((java.io.InputStream)v0).readAllBytes();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = 39;
    Object v1 = new org.apache.commons.compress.compressors.lz4.XXHash32((((java.lang.Integer)v0).intValue()));
    Object v2 = 0;
    ((java.util.zip.Checksum)v1).update((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    Object v4 = java.io.InputStream.nullInputStream();
    Object v5 = 0L;
    Object v6 = ((java.io.InputStream)v4).skip((((java.lang.Long)v5).longValue()));
    Object v7 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(((java.util.zip.Checksum)v1),((java.io.InputStream)v4));
    Object v8 = ((org.apache.commons.compress.utils.ChecksumCalculatingInputStream)v7).read();
    org.junit.Assert.assertEquals((Object)(-1), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new byte[]{};
    Object v2 = 76;
    Object v3 = 0;
    Object v4 = ((java.io.InputStream)v0).readNBytes(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = 39;
    Object v1 = new org.apache.commons.compress.compressors.lz4.XXHash32((((java.lang.Integer)v0).intValue()));
    Object v2 = 39;
    Object v3 = new org.apache.commons.compress.compressors.lz4.XXHash32((((java.lang.Integer)v2).intValue()));
    Object v4 = 0;
    ((java.util.zip.Checksum)v3).update((((java.lang.Integer)v4).intValue()));
    Object v5 = null;
    Object v6 = java.io.InputStream.nullInputStream();
    Object v7 = 0L;
    Object v8 = ((java.io.InputStream)v6).skip((((java.lang.Long)v7).longValue()));
    Object v9 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(((java.util.zip.Checksum)v3),((java.io.InputStream)v6));
    Object v10 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(((java.util.zip.Checksum)v1),((java.io.InputStream)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = 39;
    Object v1 = new org.apache.commons.compress.compressors.lz4.XXHash32((((java.lang.Integer)v0).intValue()));
    Object v2 = 0;
    ((java.util.zip.Checksum)v1).update((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    Object v4 = java.io.InputStream.nullInputStream();
    Object v5 = 0L;
    Object v6 = ((java.io.InputStream)v4).skip((((java.lang.Long)v5).longValue()));
    Object v7 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(((java.util.zip.Checksum)v1),((java.io.InputStream)v4));
    Object v8 = new byte[]{};
    Object v9 = 0;
    Object v10 = -71;
    Object v11 = ((java.io.InputStream)v7).readNBytes(((byte[])v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = 39;
    Object v1 = new org.apache.commons.compress.compressors.lz4.XXHash32((((java.lang.Integer)v0).intValue()));
    Object v2 = 39;
    Object v3 = new org.apache.commons.compress.compressors.lz4.XXHash32((((java.lang.Integer)v2).intValue()));
    Object v4 = 0;
    ((java.util.zip.Checksum)v3).update((((java.lang.Integer)v4).intValue()));
    Object v5 = null;
    Object v6 = java.io.InputStream.nullInputStream();
    Object v7 = 0L;
    Object v8 = ((java.io.InputStream)v6).skip((((java.lang.Long)v7).longValue()));
    Object v9 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(((java.util.zip.Checksum)v3),((java.io.InputStream)v6));
    Object v10 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(((java.util.zip.Checksum)v1),((java.io.InputStream)v9));
    Object v11 = 1;
    Object v12 = ((java.io.InputStream)v10).readNBytes((((java.lang.Integer)v11).intValue()));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = 39;
    Object v1 = new org.apache.commons.compress.compressors.lz4.XXHash32((((java.lang.Integer)v0).intValue()));
    Object v2 = 39;
    Object v3 = new org.apache.commons.compress.compressors.lz4.XXHash32((((java.lang.Integer)v2).intValue()));
    Object v4 = 0;
    ((java.util.zip.Checksum)v3).update((((java.lang.Integer)v4).intValue()));
    Object v5 = null;
    Object v6 = java.io.InputStream.nullInputStream();
    Object v7 = 0L;
    Object v8 = ((java.io.InputStream)v6).skip((((java.lang.Long)v7).longValue()));
    Object v9 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(((java.util.zip.Checksum)v3),((java.io.InputStream)v6));
    Object v10 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(((java.util.zip.Checksum)v1),((java.io.InputStream)v9));
    Object v11 = java.io.OutputStream.nullOutputStream();
    Object v12 = ((java.io.InputStream)v10).transferTo(((java.io.OutputStream)v11));
    org.junit.Assert.assertEquals((Object)(0L), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = 39;
    Object v1 = new org.apache.commons.compress.compressors.lz4.XXHash32((((java.lang.Integer)v0).intValue()));
    Object v2 = 39;
    Object v3 = new org.apache.commons.compress.compressors.lz4.XXHash32((((java.lang.Integer)v2).intValue()));
    Object v4 = 0;
    ((java.util.zip.Checksum)v3).update((((java.lang.Integer)v4).intValue()));
    Object v5 = null;
    Object v6 = java.io.InputStream.nullInputStream();
    Object v7 = 0L;
    Object v8 = ((java.io.InputStream)v6).skip((((java.lang.Long)v7).longValue()));
    Object v9 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(((java.util.zip.Checksum)v3),((java.io.InputStream)v6));
    Object v10 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(((java.util.zip.Checksum)v1),((java.io.InputStream)v9));
    Object v11 = ((org.apache.commons.compress.utils.ChecksumCalculatingInputStream)v10).read();
    org.junit.Assert.assertEquals((Object)(-1), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = java.io.OutputStream.nullOutputStream();
    Object v2 = ((java.io.InputStream)v0).transferTo(((java.io.OutputStream)v1));
    Object v3 = new byte[]{};
    Object v4 = 0;
    Object v5 = -1;
    Object v6 = ((java.io.InputStream)v0).readNBytes(((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 1766730176;
    Object v2 = ((java.io.InputStream)v0).readNBytes((((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -31;
    Object v2 = ((java.io.InputStream)v0).readNBytes((((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = 39;
    Object v1 = new org.apache.commons.compress.compressors.lz4.XXHash32((((java.lang.Integer)v0).intValue()));
    Object v2 = 39;
    Object v3 = new org.apache.commons.compress.compressors.lz4.XXHash32((((java.lang.Integer)v2).intValue()));
    Object v4 = 0;
    ((java.util.zip.Checksum)v3).update((((java.lang.Integer)v4).intValue()));
    Object v5 = null;
    Object v6 = java.io.InputStream.nullInputStream();
    Object v7 = 0L;
    Object v8 = ((java.io.InputStream)v6).skip((((java.lang.Long)v7).longValue()));
    Object v9 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(((java.util.zip.Checksum)v3),((java.io.InputStream)v6));
    Object v10 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(((java.util.zip.Checksum)v1),((java.io.InputStream)v9));
    Object v11 = -8L;
    Object v12 = ((org.apache.commons.compress.utils.ChecksumCalculatingInputStream)v10).skip((((java.lang.Long)v11).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = 39;
    Object v1 = new org.apache.commons.compress.compressors.lz4.XXHash32((((java.lang.Integer)v0).intValue()));
    ((java.util.zip.Checksum)v1).reset();
    Object v2 = null;
    Object v3 = 39;
    Object v4 = new org.apache.commons.compress.compressors.lz4.XXHash32((((java.lang.Integer)v3).intValue()));
    Object v5 = 39;
    Object v6 = new org.apache.commons.compress.compressors.lz4.XXHash32((((java.lang.Integer)v5).intValue()));
    Object v7 = 0;
    ((java.util.zip.Checksum)v6).update((((java.lang.Integer)v7).intValue()));
    Object v8 = null;
    Object v9 = java.io.InputStream.nullInputStream();
    Object v10 = 0L;
    Object v11 = ((java.io.InputStream)v9).skip((((java.lang.Long)v10).longValue()));
    Object v12 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(((java.util.zip.Checksum)v6),((java.io.InputStream)v9));
    Object v13 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(((java.util.zip.Checksum)v4),((java.io.InputStream)v12));
    Object v14 = ((java.io.InputStream)v13).read();
    Object v15 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(((java.util.zip.Checksum)v1),((java.io.InputStream)v13));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = 39;
    Object v1 = new org.apache.commons.compress.compressors.lz4.XXHash32((((java.lang.Integer)v0).intValue()));
    Object v2 = 0;
    ((java.util.zip.Checksum)v1).update((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    Object v4 = java.io.InputStream.nullInputStream();
    Object v5 = 0L;
    Object v6 = ((java.io.InputStream)v4).skip((((java.lang.Long)v5).longValue()));
    Object v7 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(((java.util.zip.Checksum)v1),((java.io.InputStream)v4));
    Object v8 = java.io.OutputStream.nullOutputStream();
    Object v9 = ((java.io.InputStream)v7).transferTo(((java.io.OutputStream)v8));
    org.junit.Assert.assertEquals((Object)(0L), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = 39;
    Object v1 = new org.apache.commons.compress.compressors.lz4.XXHash32((((java.lang.Integer)v0).intValue()));
    Object v2 = 39;
    Object v3 = new org.apache.commons.compress.compressors.lz4.XXHash32((((java.lang.Integer)v2).intValue()));
    Object v4 = 0;
    ((java.util.zip.Checksum)v3).update((((java.lang.Integer)v4).intValue()));
    Object v5 = null;
    Object v6 = java.io.InputStream.nullInputStream();
    Object v7 = 0L;
    Object v8 = ((java.io.InputStream)v6).skip((((java.lang.Long)v7).longValue()));
    Object v9 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(((java.util.zip.Checksum)v3),((java.io.InputStream)v6));
    Object v10 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(((java.util.zip.Checksum)v1),((java.io.InputStream)v9));
    Object v11 = 0;
    Object v12 = ((java.io.InputStream)v10).readNBytes((((java.lang.Integer)v11).intValue()));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = 39;
    Object v1 = new org.apache.commons.compress.compressors.lz4.XXHash32((((java.lang.Integer)v0).intValue()));
    Object v2 = java.io.InputStream.nullInputStream();
    Object v3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(((java.util.zip.Checksum)v1),((java.io.InputStream)v2));
    Object v4 = 1;
    ((java.io.InputStream)v3).mark((((java.lang.Integer)v4).intValue()));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = 39;
    Object v1 = new org.apache.commons.compress.compressors.lz4.XXHash32((((java.lang.Integer)v0).intValue()));
    Object v2 = 0;
    ((java.util.zip.Checksum)v1).update((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    Object v4 = java.io.InputStream.nullInputStream();
    Object v5 = 0L;
    Object v6 = ((java.io.InputStream)v4).skip((((java.lang.Long)v5).longValue()));
    Object v7 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(((java.util.zip.Checksum)v1),((java.io.InputStream)v4));
    Object v8 = new byte[]{Byte.valueOf((byte)1)};
    Object v9 = ((java.io.InputStream)v7).read(((byte[])v8));
    Object v10 = java.io.OutputStream.nullOutputStream();
    Object v11 = new byte[]{Byte.valueOf((byte)-2),Byte.valueOf((byte)-1),Byte.valueOf((byte)3)};
    ((java.io.OutputStream)v10).write(((byte[])v11));
    Object v12 = null;
    Object v13 = ((java.io.InputStream)v7).transferTo(((java.io.OutputStream)v10));
    org.junit.Assert.assertEquals((Object)(0L), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = 39;
    Object v1 = new org.apache.commons.compress.compressors.lz4.XXHash32((((java.lang.Integer)v0).intValue()));
    ((java.util.zip.Checksum)v1).reset();
    Object v2 = null;
    Object v3 = 39;
    Object v4 = new org.apache.commons.compress.compressors.lz4.XXHash32((((java.lang.Integer)v3).intValue()));
    Object v5 = 39;
    Object v6 = new org.apache.commons.compress.compressors.lz4.XXHash32((((java.lang.Integer)v5).intValue()));
    Object v7 = 0;
    ((java.util.zip.Checksum)v6).update((((java.lang.Integer)v7).intValue()));
    Object v8 = null;
    Object v9 = java.io.InputStream.nullInputStream();
    Object v10 = 0L;
    Object v11 = ((java.io.InputStream)v9).skip((((java.lang.Long)v10).longValue()));
    Object v12 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(((java.util.zip.Checksum)v6),((java.io.InputStream)v9));
    Object v13 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(((java.util.zip.Checksum)v4),((java.io.InputStream)v12));
    Object v14 = ((java.io.InputStream)v13).read();
    Object v15 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(((java.util.zip.Checksum)v1),((java.io.InputStream)v13));
    Object v16 = ((java.io.InputStream)v15).readAllBytes();
    Object v17 = -1;
    Object v18 = ((java.io.InputStream)v15).readNBytes((((java.lang.Integer)v17).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = 39;
    Object v1 = new org.apache.commons.compress.compressors.lz4.XXHash32((((java.lang.Integer)v0).intValue()));
    Object v2 = 0;
    ((java.util.zip.Checksum)v1).update((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    Object v4 = java.io.InputStream.nullInputStream();
    Object v5 = 0L;
    Object v6 = ((java.io.InputStream)v4).skip((((java.lang.Long)v5).longValue()));
    Object v7 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(((java.util.zip.Checksum)v1),((java.io.InputStream)v4));
    Object v8 = 1;
    Object v9 = ((java.io.InputStream)v7).readNBytes((((java.lang.Integer)v8).intValue()));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = 39;
    Object v1 = new org.apache.commons.compress.compressors.lz4.XXHash32((((java.lang.Integer)v0).intValue()));
    Object v2 = 0;
    ((java.util.zip.Checksum)v1).update((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    Object v4 = java.io.InputStream.nullInputStream();
    Object v5 = 0L;
    Object v6 = ((java.io.InputStream)v4).skip((((java.lang.Long)v5).longValue()));
    Object v7 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(((java.util.zip.Checksum)v1),((java.io.InputStream)v4));
    Object v8 = java.io.OutputStream.nullOutputStream();
    Object v9 = ((java.io.InputStream)v7).transferTo(((java.io.OutputStream)v8));
    Object v10 = ((java.io.InputStream)v7).available();
    org.junit.Assert.assertEquals((Object)(0), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = 39;
    Object v1 = new org.apache.commons.compress.compressors.lz4.XXHash32((((java.lang.Integer)v0).intValue()));
    ((java.util.zip.Checksum)v1).reset();
    Object v2 = null;
    Object v3 = 39;
    Object v4 = new org.apache.commons.compress.compressors.lz4.XXHash32((((java.lang.Integer)v3).intValue()));
    Object v5 = 39;
    Object v6 = new org.apache.commons.compress.compressors.lz4.XXHash32((((java.lang.Integer)v5).intValue()));
    Object v7 = 0;
    ((java.util.zip.Checksum)v6).update((((java.lang.Integer)v7).intValue()));
    Object v8 = null;
    Object v9 = java.io.InputStream.nullInputStream();
    Object v10 = 0L;
    Object v11 = ((java.io.InputStream)v9).skip((((java.lang.Long)v10).longValue()));
    Object v12 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(((java.util.zip.Checksum)v6),((java.io.InputStream)v9));
    Object v13 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(((java.util.zip.Checksum)v4),((java.io.InputStream)v12));
    Object v14 = ((java.io.InputStream)v13).read();
    Object v15 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(((java.util.zip.Checksum)v1),((java.io.InputStream)v13));
    Object v16 = new byte[]{Byte.valueOf((byte)-1),Byte.valueOf((byte)1)};
    Object v17 = 0;
    Object v18 = 1;
    Object v19 = ((org.apache.commons.compress.utils.ChecksumCalculatingInputStream)v15).read(((byte[])v16),(((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()));
    org.junit.Assert.assertEquals((Object)(-1), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = 39;
    Object v1 = new org.apache.commons.compress.compressors.lz4.XXHash32((((java.lang.Integer)v0).intValue()));
    Object v2 = 39;
    Object v3 = new org.apache.commons.compress.compressors.lz4.XXHash32((((java.lang.Integer)v2).intValue()));
    Object v4 = java.io.InputStream.nullInputStream();
    Object v5 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(((java.util.zip.Checksum)v3),((java.io.InputStream)v4));
    Object v6 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(((java.util.zip.Checksum)v1),((java.io.InputStream)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = 39;
    Object v1 = new org.apache.commons.compress.compressors.lz4.XXHash32((((java.lang.Integer)v0).intValue()));
    Object v2 = 13;
    ((java.util.zip.Checksum)v1).update((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    Object v4 = 39;
    Object v5 = new org.apache.commons.compress.compressors.lz4.XXHash32((((java.lang.Integer)v4).intValue()));
    Object v6 = java.io.InputStream.nullInputStream();
    Object v7 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(((java.util.zip.Checksum)v5),((java.io.InputStream)v6));
    Object v8 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(((java.util.zip.Checksum)v1),((java.io.InputStream)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = 39;
    Object v1 = new org.apache.commons.compress.compressors.lz4.XXHash32((((java.lang.Integer)v0).intValue()));
    ((java.util.zip.Checksum)v1).reset();
    Object v2 = null;
    Object v3 = 39;
    Object v4 = new org.apache.commons.compress.compressors.lz4.XXHash32((((java.lang.Integer)v3).intValue()));
    Object v5 = 39;
    Object v6 = new org.apache.commons.compress.compressors.lz4.XXHash32((((java.lang.Integer)v5).intValue()));
    Object v7 = 0;
    ((java.util.zip.Checksum)v6).update((((java.lang.Integer)v7).intValue()));
    Object v8 = null;
    Object v9 = java.io.InputStream.nullInputStream();
    Object v10 = 0L;
    Object v11 = ((java.io.InputStream)v9).skip((((java.lang.Long)v10).longValue()));
    Object v12 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(((java.util.zip.Checksum)v6),((java.io.InputStream)v9));
    Object v13 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(((java.util.zip.Checksum)v4),((java.io.InputStream)v12));
    Object v14 = ((java.io.InputStream)v13).read();
    Object v15 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(((java.util.zip.Checksum)v1),((java.io.InputStream)v13));
    Object v16 = ((org.apache.commons.compress.utils.ChecksumCalculatingInputStream)v15).read();
    org.junit.Assert.assertEquals((Object)(-1), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = 39;
    Object v1 = new org.apache.commons.compress.compressors.lz4.XXHash32((((java.lang.Integer)v0).intValue()));
    Object v2 = 39;
    Object v3 = new org.apache.commons.compress.compressors.lz4.XXHash32((((java.lang.Integer)v2).intValue()));
    Object v4 = java.io.InputStream.nullInputStream();
    Object v5 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(((java.util.zip.Checksum)v3),((java.io.InputStream)v4));
    Object v6 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(((java.util.zip.Checksum)v1),((java.io.InputStream)v5));
    ((java.io.InputStream)v6).reset();
    Object v7 = null;
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = 39;
    Object v1 = new org.apache.commons.compress.compressors.lz4.XXHash32((((java.lang.Integer)v0).intValue()));
    Object v2 = 39;
    Object v3 = new org.apache.commons.compress.compressors.lz4.XXHash32((((java.lang.Integer)v2).intValue()));
    Object v4 = java.io.InputStream.nullInputStream();
    Object v5 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(((java.util.zip.Checksum)v3),((java.io.InputStream)v4));
    Object v6 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(((java.util.zip.Checksum)v1),((java.io.InputStream)v5));
    Object v7 = 49L;
    Object v8 = ((org.apache.commons.compress.utils.ChecksumCalculatingInputStream)v6).skip((((java.lang.Long)v7).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = 39;
    Object v1 = new org.apache.commons.compress.compressors.lz4.XXHash32((((java.lang.Integer)v0).intValue()));
    Object v2 = 13;
    ((java.util.zip.Checksum)v1).update((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    Object v4 = 39;
    Object v5 = new org.apache.commons.compress.compressors.lz4.XXHash32((((java.lang.Integer)v4).intValue()));
    Object v6 = java.io.InputStream.nullInputStream();
    Object v7 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(((java.util.zip.Checksum)v5),((java.io.InputStream)v6));
    Object v8 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(((java.util.zip.Checksum)v1),((java.io.InputStream)v7));
    Object v9 = 1;
    Object v10 = ((java.io.InputStream)v8).readNBytes((((java.lang.Integer)v9).intValue()));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = 39;
    Object v1 = new org.apache.commons.compress.compressors.lz4.XXHash32((((java.lang.Integer)v0).intValue()));
    ((java.util.zip.Checksum)v1).reset();
    Object v2 = null;
    Object v3 = 39;
    Object v4 = new org.apache.commons.compress.compressors.lz4.XXHash32((((java.lang.Integer)v3).intValue()));
    Object v5 = 39;
    Object v6 = new org.apache.commons.compress.compressors.lz4.XXHash32((((java.lang.Integer)v5).intValue()));
    Object v7 = 0;
    ((java.util.zip.Checksum)v6).update((((java.lang.Integer)v7).intValue()));
    Object v8 = null;
    Object v9 = java.io.InputStream.nullInputStream();
    Object v10 = 0L;
    Object v11 = ((java.io.InputStream)v9).skip((((java.lang.Long)v10).longValue()));
    Object v12 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(((java.util.zip.Checksum)v6),((java.io.InputStream)v9));
    Object v13 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(((java.util.zip.Checksum)v4),((java.io.InputStream)v12));
    Object v14 = ((java.io.InputStream)v13).read();
    Object v15 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(((java.util.zip.Checksum)v1),((java.io.InputStream)v13));
    Object v16 = java.io.OutputStream.nullOutputStream();
    Object v17 = ((java.io.InputStream)v15).transferTo(((java.io.OutputStream)v16));
    org.junit.Assert.assertEquals((Object)(0L), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = 39;
    Object v1 = new org.apache.commons.compress.compressors.lz4.XXHash32((((java.lang.Integer)v0).intValue()));
    Object v2 = 39;
    Object v3 = new org.apache.commons.compress.compressors.lz4.XXHash32((((java.lang.Integer)v2).intValue()));
    Object v4 = java.io.InputStream.nullInputStream();
    Object v5 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(((java.util.zip.Checksum)v3),((java.io.InputStream)v4));
    Object v6 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(((java.util.zip.Checksum)v1),((java.io.InputStream)v5));
    Object v7 = java.io.OutputStream.nullOutputStream();
    Object v8 = new byte[]{};
    ((java.io.OutputStream)v7).write(((byte[])v8));
    Object v9 = null;
    Object v10 = ((java.io.InputStream)v6).transferTo(((java.io.OutputStream)v7));
    org.junit.Assert.assertEquals((Object)(0L), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = 39;
    Object v1 = new org.apache.commons.compress.compressors.lz4.XXHash32((((java.lang.Integer)v0).intValue()));
    Object v2 = 39;
    Object v3 = new org.apache.commons.compress.compressors.lz4.XXHash32((((java.lang.Integer)v2).intValue()));
    Object v4 = java.io.InputStream.nullInputStream();
    Object v5 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(((java.util.zip.Checksum)v3),((java.io.InputStream)v4));
    Object v6 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(((java.util.zip.Checksum)v1),((java.io.InputStream)v5));
    Object v7 = new byte[]{};
    Object v8 = ((org.apache.commons.compress.utils.ChecksumCalculatingInputStream)v6).read(((byte[])v7));
    Object v9 = 0L;
    Object v10 = ((org.apache.commons.compress.utils.ChecksumCalculatingInputStream)v6).skip((((java.lang.Long)v9).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = 39;
    Object v1 = new org.apache.commons.compress.compressors.lz4.XXHash32((((java.lang.Integer)v0).intValue()));
    Object v2 = 13;
    ((java.util.zip.Checksum)v1).update((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    Object v4 = 39;
    Object v5 = new org.apache.commons.compress.compressors.lz4.XXHash32((((java.lang.Integer)v4).intValue()));
    Object v6 = java.io.InputStream.nullInputStream();
    Object v7 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(((java.util.zip.Checksum)v5),((java.io.InputStream)v6));
    Object v8 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(((java.util.zip.Checksum)v1),((java.io.InputStream)v7));
    Object v9 = 0L;
    Object v10 = ((org.apache.commons.compress.utils.ChecksumCalculatingInputStream)v8).skip((((java.lang.Long)v9).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = 39;
    Object v1 = new org.apache.commons.compress.compressors.lz4.XXHash32((((java.lang.Integer)v0).intValue()));
    Object v2 = 39;
    Object v3 = new org.apache.commons.compress.compressors.lz4.XXHash32((((java.lang.Integer)v2).intValue()));
    Object v4 = java.io.InputStream.nullInputStream();
    Object v5 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(((java.util.zip.Checksum)v3),((java.io.InputStream)v4));
    Object v6 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(((java.util.zip.Checksum)v1),((java.io.InputStream)v5));
    Object v7 = new byte[]{Byte.valueOf((byte)60),Byte.valueOf((byte)25),Byte.valueOf((byte)28)};
    Object v8 = -17;
    Object v9 = 33;
    Object v10 = ((java.io.InputStream)v6).readNBytes(((byte[])v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = 39;
    Object v1 = new org.apache.commons.compress.compressors.lz4.XXHash32((((java.lang.Integer)v0).intValue()));
    Object v2 = 0;
    ((java.util.zip.Checksum)v1).update((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    Object v4 = java.io.InputStream.nullInputStream();
    Object v5 = 0L;
    Object v6 = ((java.io.InputStream)v4).skip((((java.lang.Long)v5).longValue()));
    Object v7 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(((java.util.zip.Checksum)v1),((java.io.InputStream)v4));
    Object v8 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)0),Byte.valueOf((byte)0)};
    Object v9 = 27;
    Object v10 = -6;
    Object v11 = ((java.io.InputStream)v7).readNBytes(((byte[])v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new byte[]{Byte.valueOf((byte)0)};
    Object v2 = 49;
    Object v3 = 0;
    Object v4 = ((java.io.InputStream)v0).readNBytes(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = 39;
    Object v1 = new org.apache.commons.compress.compressors.lz4.XXHash32((((java.lang.Integer)v0).intValue()));
    ((java.util.zip.Checksum)v1).reset();
    Object v2 = null;
    Object v3 = 39;
    Object v4 = new org.apache.commons.compress.compressors.lz4.XXHash32((((java.lang.Integer)v3).intValue()));
    Object v5 = 39;
    Object v6 = new org.apache.commons.compress.compressors.lz4.XXHash32((((java.lang.Integer)v5).intValue()));
    Object v7 = 0;
    ((java.util.zip.Checksum)v6).update((((java.lang.Integer)v7).intValue()));
    Object v8 = null;
    Object v9 = java.io.InputStream.nullInputStream();
    Object v10 = 0L;
    Object v11 = ((java.io.InputStream)v9).skip((((java.lang.Long)v10).longValue()));
    Object v12 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(((java.util.zip.Checksum)v6),((java.io.InputStream)v9));
    Object v13 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(((java.util.zip.Checksum)v4),((java.io.InputStream)v12));
    Object v14 = ((java.io.InputStream)v13).read();
    Object v15 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(((java.util.zip.Checksum)v1),((java.io.InputStream)v13));
    Object v16 = java.io.OutputStream.nullOutputStream();
    Object v17 = ((java.io.InputStream)v15).transferTo(((java.io.OutputStream)v16));
    Object v18 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)1)};
    Object v19 = 0;
    Object v20 = 1;
    Object v21 = ((java.io.InputStream)v15).readNBytes(((byte[])v18),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()));
    org.junit.Assert.assertEquals((Object)(0), v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = 39;
    Object v1 = new org.apache.commons.compress.compressors.lz4.XXHash32((((java.lang.Integer)v0).intValue()));
    Object v2 = 0;
    ((java.util.zip.Checksum)v1).update((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    Object v4 = java.io.InputStream.nullInputStream();
    Object v5 = 0L;
    Object v6 = ((java.io.InputStream)v4).skip((((java.lang.Long)v5).longValue()));
    Object v7 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(((java.util.zip.Checksum)v1),((java.io.InputStream)v4));
    Object v8 = new byte[]{Byte.valueOf((byte)47),Byte.valueOf((byte)1),Byte.valueOf((byte)0)};
    Object v9 = 0;
    Object v10 = 0;
    Object v11 = ((org.apache.commons.compress.utils.ChecksumCalculatingInputStream)v7).read(((byte[])v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    org.junit.Assert.assertEquals((Object)(0), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = 39;
    Object v1 = new org.apache.commons.compress.compressors.lz4.XXHash32((((java.lang.Integer)v0).intValue()));
    Object v2 = 0;
    ((java.util.zip.Checksum)v1).update((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    Object v4 = java.io.InputStream.nullInputStream();
    Object v5 = 0L;
    Object v6 = ((java.io.InputStream)v4).skip((((java.lang.Long)v5).longValue()));
    Object v7 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(((java.util.zip.Checksum)v1),((java.io.InputStream)v4));
    Object v8 = 22;
    Object v9 = ((java.io.InputStream)v7).readNBytes((((java.lang.Integer)v8).intValue()));
    ((java.io.InputStream)v7).reset();
    Object v10 = null;
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = 39;
    Object v1 = new org.apache.commons.compress.compressors.lz4.XXHash32((((java.lang.Integer)v0).intValue()));
    Object v2 = 13;
    ((java.util.zip.Checksum)v1).update((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    Object v4 = 39;
    Object v5 = new org.apache.commons.compress.compressors.lz4.XXHash32((((java.lang.Integer)v4).intValue()));
    Object v6 = java.io.InputStream.nullInputStream();
    Object v7 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(((java.util.zip.Checksum)v5),((java.io.InputStream)v6));
    Object v8 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(((java.util.zip.Checksum)v1),((java.io.InputStream)v7));
    Object v9 = 255;
    Object v10 = ((java.io.InputStream)v8).readNBytes((((java.lang.Integer)v9).intValue()));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = 39;
    Object v1 = new org.apache.commons.compress.compressors.lz4.XXHash32((((java.lang.Integer)v0).intValue()));
    Object v2 = 39;
    Object v3 = new org.apache.commons.compress.compressors.lz4.XXHash32((((java.lang.Integer)v2).intValue()));
    Object v4 = 39;
    Object v5 = new org.apache.commons.compress.compressors.lz4.XXHash32((((java.lang.Integer)v4).intValue()));
    Object v6 = 0;
    ((java.util.zip.Checksum)v5).update((((java.lang.Integer)v6).intValue()));
    Object v7 = null;
    Object v8 = java.io.InputStream.nullInputStream();
    Object v9 = 0L;
    Object v10 = ((java.io.InputStream)v8).skip((((java.lang.Long)v9).longValue()));
    Object v11 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(((java.util.zip.Checksum)v5),((java.io.InputStream)v8));
    Object v12 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(((java.util.zip.Checksum)v3),((java.io.InputStream)v11));
    Object v13 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(((java.util.zip.Checksum)v1),((java.io.InputStream)v12));
    org.junit.Assert.assertNotNull(v13);
  }
}
