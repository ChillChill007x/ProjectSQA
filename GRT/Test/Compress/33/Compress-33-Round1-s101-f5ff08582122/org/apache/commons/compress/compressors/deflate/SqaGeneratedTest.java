package org.apache.commons.compress.compressors.deflate;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)39)};
    Object v1 = -7;
    Object v2 = org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = ((java.io.InputStream)v0).markSupported();
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 1370;
    Object v2 = ((java.io.InputStream)v0).readNBytes((((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.compressors.deflate.DeflateParameters();
    Object v2 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream(((java.io.InputStream)v0),((org.apache.commons.compress.compressors.deflate.DeflateParameters)v1));
    Object v3 = ((org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream)v2).read();
      org.junit.Assert.fail("Expected java.io.EOFException");
    } catch (java.io.EOFException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = ((java.io.InputStream)v0).read();
    Object v2 = java.io.OutputStream.nullOutputStream();
    Object v3 = ((java.io.InputStream)v0).transferTo(((java.io.OutputStream)v2));
    org.junit.Assert.assertEquals((Object)(0L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = new byte[]{};
    Object v1 = 28;
    Object v2 = org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.compressors.deflate.DeflateParameters();
    Object v2 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream(((java.io.InputStream)v0),((org.apache.commons.compress.compressors.deflate.DeflateParameters)v1));
    Object v3 = new org.apache.commons.compress.compressors.deflate.DeflateParameters();
    Object v4 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream(((java.io.InputStream)v2),((org.apache.commons.compress.compressors.deflate.DeflateParameters)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)0)};
    Object v1 = 6;
    Object v2 = org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new byte[]{Byte.valueOf((byte)82)};
    Object v2 = 48;
    Object v3 = 1;
    Object v4 = ((java.io.InputStream)v0).readNBytes(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.compressors.deflate.DeflateParameters();
    Object v2 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream(((java.io.InputStream)v0),((org.apache.commons.compress.compressors.deflate.DeflateParameters)v1));
    Object v3 = new byte[]{Byte.valueOf((byte)21),Byte.valueOf((byte)48),Byte.valueOf((byte)2)};
    Object v4 = 1;
    Object v5 = 0;
    Object v6 = ((java.io.InputStream)v2).read(((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = ((org.apache.commons.compress.compressors.CompressorInputStream)v2).getCount();
    org.junit.Assert.assertEquals((Object)(0), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new byte[]{};
    Object v2 = 49;
    Object v3 = -32;
    Object v4 = ((java.io.InputStream)v0).readNBytes(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.compressors.deflate.DeflateParameters();
    Object v2 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream(((java.io.InputStream)v0),((org.apache.commons.compress.compressors.deflate.DeflateParameters)v1));
    Object v3 = -50;
    Object v4 = ((java.io.InputStream)v2).readNBytes((((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.compressors.deflate.DeflateParameters();
    Object v2 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream(((java.io.InputStream)v0),((org.apache.commons.compress.compressors.deflate.DeflateParameters)v1));
    Object v3 = new byte[]{};
    Object v4 = 1;
    Object v5 = 1;
    Object v6 = ((org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream)v2).read(((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.compressors.deflate.DeflateParameters();
    Object v2 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream(((java.io.InputStream)v0),((org.apache.commons.compress.compressors.deflate.DeflateParameters)v1));
    Object v3 = java.io.OutputStream.nullOutputStream();
    Object v4 = ((java.io.InputStream)v2).transferTo(((java.io.OutputStream)v3));
      org.junit.Assert.fail("Expected java.io.EOFException");
    } catch (java.io.EOFException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 25;
    ((java.io.InputStream)v0).mark((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 0;
    Object v2 = ((java.io.InputStream)v0).readNBytes((((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.compressors.deflate.DeflateParameters();
    Object v2 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream(((java.io.InputStream)v0),((org.apache.commons.compress.compressors.deflate.DeflateParameters)v1));
    Object v3 = ((java.io.InputStream)v2).markSupported();
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.compressors.deflate.DeflateParameters();
    Object v2 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream(((java.io.InputStream)v0),((org.apache.commons.compress.compressors.deflate.DeflateParameters)v1));
    Object v3 = ((org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream)v2).available();
    org.junit.Assert.assertEquals((Object)(1), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)-12),Byte.valueOf((byte)78),Byte.valueOf((byte)1)};
    Object v1 = -7;
    Object v2 = org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new byte[]{Byte.valueOf((byte)4),Byte.valueOf((byte)18),Byte.valueOf((byte)0)};
    Object v2 = ((java.io.InputStream)v0).read(((byte[])v1));
    org.junit.Assert.assertEquals((Object)(-1), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.compressors.deflate.DeflateParameters();
    Object v2 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream(((java.io.InputStream)v0),((org.apache.commons.compress.compressors.deflate.DeflateParameters)v1));
    Object v3 = new byte[]{};
    Object v4 = ((java.io.InputStream)v2).read(((byte[])v3));
    Object v5 = ((org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream)v2).read();
      org.junit.Assert.fail("Expected java.io.EOFException");
    } catch (java.io.EOFException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.compressors.deflate.DeflateParameters();
    Object v2 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream(((java.io.InputStream)v0),((org.apache.commons.compress.compressors.deflate.DeflateParameters)v1));
    Object v3 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream(((java.io.InputStream)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = ((java.io.InputStream)v0).readAllBytes();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = java.io.OutputStream.nullOutputStream();
    Object v2 = ((java.io.InputStream)v0).transferTo(((java.io.OutputStream)v1));
    Object v3 = ((java.io.InputStream)v0).markSupported();
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.compressors.deflate.DeflateParameters();
    Object v2 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream(((java.io.InputStream)v0),((org.apache.commons.compress.compressors.deflate.DeflateParameters)v1));
    Object v3 = new byte[]{};
    Object v4 = 1;
    Object v5 = 2;
    Object v6 = ((org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream)v2).read(((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.compressors.deflate.DeflateParameters();
    Object v2 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream(((java.io.InputStream)v0),((org.apache.commons.compress.compressors.deflate.DeflateParameters)v1));
    Object v3 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream(((java.io.InputStream)v2));
    Object v4 = 0;
    Object v5 = ((java.io.InputStream)v3).readNBytes((((java.lang.Integer)v4).intValue()));
    ((java.io.InputStream)v3).reset();
    Object v6 = null;
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.compressors.deflate.DeflateParameters();
    Object v2 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream(((java.io.InputStream)v0),((org.apache.commons.compress.compressors.deflate.DeflateParameters)v1));
    Object v3 = 8;
    Object v4 = ((java.io.InputStream)v2).readNBytes((((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.io.EOFException");
    } catch (java.io.EOFException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.compressors.deflate.DeflateParameters();
    Object v2 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream(((java.io.InputStream)v0),((org.apache.commons.compress.compressors.deflate.DeflateParameters)v1));
    Object v3 = ((org.apache.commons.compress.compressors.CompressorInputStream)v2).getBytesRead();
    org.junit.Assert.assertEquals((Object)(0L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = 1;
    Object v2 = org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.compressors.deflate.DeflateParameters();
    Object v2 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream(((java.io.InputStream)v0),((org.apache.commons.compress.compressors.deflate.DeflateParameters)v1));
    Object v3 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream(((java.io.InputStream)v2));
    Object v4 = -38;
    ((java.io.InputStream)v3).mark((((java.lang.Integer)v4).intValue()));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = java.io.OutputStream.nullOutputStream();
    Object v2 = ((java.io.InputStream)v0).transferTo(((java.io.OutputStream)v1));
    org.junit.Assert.assertEquals((Object)(0L), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.compressors.deflate.DeflateParameters();
    Object v2 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream(((java.io.InputStream)v0),((org.apache.commons.compress.compressors.deflate.DeflateParameters)v1));
    ((org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream)v2).close();
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.compressors.deflate.DeflateParameters();
    Object v2 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream(((java.io.InputStream)v0),((org.apache.commons.compress.compressors.deflate.DeflateParameters)v1));
    Object v3 = new byte[]{Byte.valueOf((byte)3),Byte.valueOf((byte)0),Byte.valueOf((byte)0)};
    Object v4 = 2;
    Object v5 = 41;
    Object v6 = ((java.io.InputStream)v2).readNBytes(((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.compressors.deflate.DeflateParameters();
    Object v2 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream(((java.io.InputStream)v0),((org.apache.commons.compress.compressors.deflate.DeflateParameters)v1));
    Object v3 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream(((java.io.InputStream)v2));
    Object v4 = 0;
    Object v5 = ((java.io.InputStream)v3).readNBytes((((java.lang.Integer)v4).intValue()));
    Object v6 = 1;
    Object v7 = ((java.io.InputStream)v3).readNBytes((((java.lang.Integer)v6).intValue()));
      org.junit.Assert.fail("Expected java.io.EOFException");
    } catch (java.io.EOFException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.compressors.deflate.DeflateParameters();
    Object v2 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream(((java.io.InputStream)v0),((org.apache.commons.compress.compressors.deflate.DeflateParameters)v1));
    Object v3 = ((org.apache.commons.compress.compressors.CompressorInputStream)v2).getCount();
    org.junit.Assert.assertEquals((Object)(0), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)-19),Byte.valueOf((byte)-3)};
    Object v1 = 16;
    Object v2 = org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.compressors.deflate.DeflateParameters();
    Object v2 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream(((java.io.InputStream)v0),((org.apache.commons.compress.compressors.deflate.DeflateParameters)v1));
    Object v3 = 1;
    Object v4 = ((java.io.InputStream)v2).readNBytes((((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.io.EOFException");
    } catch (java.io.EOFException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)8)};
    Object v1 = 0;
    Object v2 = org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.compressors.deflate.DeflateParameters();
    Object v2 = false;
    ((org.apache.commons.compress.compressors.deflate.DeflateParameters)v1).setWithZlibHeader((((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    Object v4 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream(((java.io.InputStream)v0),((org.apache.commons.compress.compressors.deflate.DeflateParameters)v1));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.compressors.deflate.DeflateParameters();
    Object v2 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream(((java.io.InputStream)v0),((org.apache.commons.compress.compressors.deflate.DeflateParameters)v1));
    Object v3 = 0;
    Object v4 = ((java.io.InputStream)v2).readNBytes((((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.compressors.deflate.DeflateParameters();
    Object v2 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream(((java.io.InputStream)v0),((org.apache.commons.compress.compressors.deflate.DeflateParameters)v1));
    Object v3 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)1),Byte.valueOf((byte)0)};
    Object v4 = 8;
    Object v5 = 39;
    Object v6 = ((java.io.InputStream)v2).readNBytes(((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.compressors.deflate.DeflateParameters();
    Object v2 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream(((java.io.InputStream)v0),((org.apache.commons.compress.compressors.deflate.DeflateParameters)v1));
    Object v3 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)2)};
    Object v4 = 0;
    Object v5 = 18;
    Object v6 = ((org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream)v2).read(((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.compressors.deflate.DeflateParameters();
    Object v2 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream(((java.io.InputStream)v0),((org.apache.commons.compress.compressors.deflate.DeflateParameters)v1));
    Object v3 = 2L;
    Object v4 = ((org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream)v2).skip((((java.lang.Long)v3).longValue()));
      org.junit.Assert.fail("Expected java.io.EOFException");
    } catch (java.io.EOFException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.compressors.deflate.DeflateParameters();
    Object v2 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream(((java.io.InputStream)v0),((org.apache.commons.compress.compressors.deflate.DeflateParameters)v1));
    Object v3 = 58;
    Object v4 = ((java.io.InputStream)v2).readNBytes((((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.io.EOFException");
    } catch (java.io.EOFException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.compressors.deflate.DeflateParameters();
    Object v2 = false;
    ((org.apache.commons.compress.compressors.deflate.DeflateParameters)v1).setWithZlibHeader((((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    Object v4 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream(((java.io.InputStream)v0),((org.apache.commons.compress.compressors.deflate.DeflateParameters)v1));
    Object v5 = ((org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream)v4).read();
      org.junit.Assert.fail("Expected java.io.EOFException");
    } catch (java.io.EOFException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    ((java.io.InputStream)v0).reset();
    Object v1 = null;
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.compressors.deflate.DeflateParameters();
    Object v2 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream(((java.io.InputStream)v0),((org.apache.commons.compress.compressors.deflate.DeflateParameters)v1));
    Object v3 = 38;
    Object v4 = ((java.io.InputStream)v2).readNBytes((((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.io.EOFException");
    } catch (java.io.EOFException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.compressors.deflate.DeflateParameters();
    Object v2 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream(((java.io.InputStream)v0),((org.apache.commons.compress.compressors.deflate.DeflateParameters)v1));
    Object v3 = 0;
    Object v4 = ((java.io.InputStream)v2).readNBytes((((java.lang.Integer)v3).intValue()));
    Object v5 = -47;
    ((java.io.InputStream)v2).mark((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.compressors.deflate.DeflateParameters();
    Object v2 = false;
    ((org.apache.commons.compress.compressors.deflate.DeflateParameters)v1).setWithZlibHeader((((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    Object v4 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream(((java.io.InputStream)v0),((org.apache.commons.compress.compressors.deflate.DeflateParameters)v1));
    Object v5 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream(((java.io.InputStream)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 3;
    Object v2 = ((java.io.InputStream)v0).readNBytes((((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)89),Byte.valueOf((byte)1),Byte.valueOf((byte)0)};
    Object v1 = -13;
    Object v2 = org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.compressors.deflate.DeflateParameters();
    Object v2 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream(((java.io.InputStream)v0),((org.apache.commons.compress.compressors.deflate.DeflateParameters)v1));
    Object v3 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream(((java.io.InputStream)v2));
    Object v4 = new byte[]{};
    Object v5 = 0;
    Object v6 = 17;
    Object v7 = ((java.io.InputStream)v3).readNBytes(((byte[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)-13)};
    Object v1 = 0;
    Object v2 = org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.compressors.deflate.DeflateParameters();
    Object v2 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream(((java.io.InputStream)v0),((org.apache.commons.compress.compressors.deflate.DeflateParameters)v1));
    Object v3 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream(((java.io.InputStream)v2));
    Object v4 = ((org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream)v3).available();
    org.junit.Assert.assertEquals((Object)(1), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.compressors.deflate.DeflateParameters();
    Object v2 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream(((java.io.InputStream)v0),((org.apache.commons.compress.compressors.deflate.DeflateParameters)v1));
    Object v3 = new byte[]{Byte.valueOf((byte)1)};
    Object v4 = ((java.io.InputStream)v2).read(((byte[])v3));
      org.junit.Assert.fail("Expected java.io.EOFException");
    } catch (java.io.EOFException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.compressors.deflate.DeflateParameters();
    Object v2 = false;
    ((org.apache.commons.compress.compressors.deflate.DeflateParameters)v1).setWithZlibHeader((((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    Object v4 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream(((java.io.InputStream)v0),((org.apache.commons.compress.compressors.deflate.DeflateParameters)v1));
    Object v5 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream(((java.io.InputStream)v4));
    Object v6 = new org.apache.commons.compress.compressors.deflate.DeflateParameters();
    Object v7 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream(((java.io.InputStream)v5),((org.apache.commons.compress.compressors.deflate.DeflateParameters)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.compressors.deflate.DeflateParameters();
    Object v2 = false;
    ((org.apache.commons.compress.compressors.deflate.DeflateParameters)v1).setWithZlibHeader((((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    Object v4 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream(((java.io.InputStream)v0),((org.apache.commons.compress.compressors.deflate.DeflateParameters)v1));
    Object v5 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream(((java.io.InputStream)v4));
    Object v6 = new org.apache.commons.compress.compressors.deflate.DeflateParameters();
    Object v7 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream(((java.io.InputStream)v5),((org.apache.commons.compress.compressors.deflate.DeflateParameters)v6));
    Object v8 = new byte[]{};
    Object v9 = ((java.io.InputStream)v7).read(((byte[])v8));
    Object v10 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream(((java.io.InputStream)v7));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new byte[]{};
    Object v2 = 0;
    Object v3 = 0;
    Object v4 = ((java.io.InputStream)v0).readNBytes(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertEquals((Object)(0), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = ((java.io.InputStream)v0).readAllBytes();
    ((java.io.InputStream)v0).reset();
    Object v2 = null;
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)32)};
    Object v1 = 12;
    Object v2 = org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.compressors.deflate.DeflateParameters();
    Object v2 = false;
    ((org.apache.commons.compress.compressors.deflate.DeflateParameters)v1).setWithZlibHeader((((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    Object v4 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream(((java.io.InputStream)v0),((org.apache.commons.compress.compressors.deflate.DeflateParameters)v1));
    Object v5 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream(((java.io.InputStream)v4));
    Object v6 = new org.apache.commons.compress.compressors.deflate.DeflateParameters();
    Object v7 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream(((java.io.InputStream)v5),((org.apache.commons.compress.compressors.deflate.DeflateParameters)v6));
    Object v8 = new byte[]{};
    Object v9 = ((java.io.InputStream)v7).read(((byte[])v8));
    Object v10 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream(((java.io.InputStream)v7));
    Object v11 = new byte[]{};
    Object v12 = 1;
    Object v13 = 4;
    Object v14 = ((java.io.InputStream)v10).readNBytes(((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.compressors.deflate.DeflateParameters();
    Object v2 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream(((java.io.InputStream)v0),((org.apache.commons.compress.compressors.deflate.DeflateParameters)v1));
    Object v3 = 0;
    Object v4 = ((java.io.InputStream)v2).readNBytes((((java.lang.Integer)v3).intValue()));
    Object v5 = ((org.apache.commons.compress.compressors.CompressorInputStream)v2).getCount();
    org.junit.Assert.assertEquals((Object)(0), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = ((java.io.InputStream)v0).readAllBytes();
    Object v2 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)-41)};
    Object v3 = -3;
    Object v4 = -8;
    Object v5 = ((java.io.InputStream)v0).readNBytes(((byte[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.compressors.deflate.DeflateParameters();
    Object v2 = false;
    ((org.apache.commons.compress.compressors.deflate.DeflateParameters)v1).setWithZlibHeader((((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    Object v4 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream(((java.io.InputStream)v0),((org.apache.commons.compress.compressors.deflate.DeflateParameters)v1));
    Object v5 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream(((java.io.InputStream)v4));
    Object v6 = 0;
    Object v7 = ((java.io.InputStream)v5).readNBytes((((java.lang.Integer)v6).intValue()));
    Object v8 = new org.apache.commons.compress.compressors.deflate.DeflateParameters();
    Object v9 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream(((java.io.InputStream)v5),((org.apache.commons.compress.compressors.deflate.DeflateParameters)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -14L;
    Object v2 = ((java.io.InputStream)v0).skip((((java.lang.Long)v1).longValue()));
    Object v3 = new byte[]{Byte.valueOf((byte)1)};
    Object v4 = -24;
    Object v5 = 0;
    Object v6 = ((java.io.InputStream)v0).readNBytes(((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.compressors.deflate.DeflateParameters();
    Object v2 = false;
    ((org.apache.commons.compress.compressors.deflate.DeflateParameters)v1).setWithZlibHeader((((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    Object v4 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream(((java.io.InputStream)v0),((org.apache.commons.compress.compressors.deflate.DeflateParameters)v1));
    Object v5 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream(((java.io.InputStream)v4));
    Object v6 = 0;
    Object v7 = ((java.io.InputStream)v5).readNBytes((((java.lang.Integer)v6).intValue()));
    Object v8 = new org.apache.commons.compress.compressors.deflate.DeflateParameters();
    Object v9 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream(((java.io.InputStream)v5),((org.apache.commons.compress.compressors.deflate.DeflateParameters)v8));
    Object v10 = java.io.OutputStream.nullOutputStream();
    Object v11 = ((java.io.InputStream)v9).transferTo(((java.io.OutputStream)v10));
      org.junit.Assert.fail("Expected java.io.EOFException");
    } catch (java.io.EOFException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.compressors.deflate.DeflateParameters();
    Object v2 = false;
    ((org.apache.commons.compress.compressors.deflate.DeflateParameters)v1).setWithZlibHeader((((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    Object v4 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream(((java.io.InputStream)v0),((org.apache.commons.compress.compressors.deflate.DeflateParameters)v1));
    Object v5 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream(((java.io.InputStream)v4));
    Object v6 = ((org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream)v5).read();
      org.junit.Assert.fail("Expected java.io.EOFException");
    } catch (java.io.EOFException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.compressors.deflate.DeflateParameters();
    Object v2 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream(((java.io.InputStream)v0),((org.apache.commons.compress.compressors.deflate.DeflateParameters)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.compressors.deflate.DeflateParameters();
    Object v2 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream(((java.io.InputStream)v0),((org.apache.commons.compress.compressors.deflate.DeflateParameters)v1));
    Object v3 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream(((java.io.InputStream)v2));
    Object v4 = java.io.OutputStream.nullOutputStream();
    Object v5 = ((java.io.InputStream)v3).transferTo(((java.io.OutputStream)v4));
      org.junit.Assert.fail("Expected java.io.EOFException");
    } catch (java.io.EOFException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.compressors.deflate.DeflateParameters();
    Object v2 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream(((java.io.InputStream)v0),((org.apache.commons.compress.compressors.deflate.DeflateParameters)v1));
    Object v3 = 0L;
    Object v4 = ((java.io.InputStream)v2).skip((((java.lang.Long)v3).longValue()));
    Object v5 = ((org.apache.commons.compress.compressors.CompressorInputStream)v2).getBytesRead();
    org.junit.Assert.assertEquals((Object)(0L), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)6)};
    Object v1 = 1;
    Object v2 = org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.compressors.deflate.DeflateParameters();
    Object v2 = false;
    ((org.apache.commons.compress.compressors.deflate.DeflateParameters)v1).setWithZlibHeader((((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    Object v4 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream(((java.io.InputStream)v0),((org.apache.commons.compress.compressors.deflate.DeflateParameters)v1));
    Object v5 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream(((java.io.InputStream)v4));
    Object v6 = 0;
    Object v7 = ((java.io.InputStream)v5).readNBytes((((java.lang.Integer)v6).intValue()));
    Object v8 = new org.apache.commons.compress.compressors.deflate.DeflateParameters();
    Object v9 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream(((java.io.InputStream)v5),((org.apache.commons.compress.compressors.deflate.DeflateParameters)v8));
    Object v10 = ((org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream)v9).read();
      org.junit.Assert.fail("Expected java.io.EOFException");
    } catch (java.io.EOFException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.compressors.deflate.DeflateParameters();
    Object v2 = false;
    ((org.apache.commons.compress.compressors.deflate.DeflateParameters)v1).setWithZlibHeader((((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    Object v4 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream(((java.io.InputStream)v0),((org.apache.commons.compress.compressors.deflate.DeflateParameters)v1));
    Object v5 = 0L;
    Object v6 = ((java.io.InputStream)v4).skip((((java.lang.Long)v5).longValue()));
    Object v7 = new org.apache.commons.compress.compressors.deflate.DeflateParameters();
    Object v8 = false;
    ((org.apache.commons.compress.compressors.deflate.DeflateParameters)v7).setWithZlibHeader((((java.lang.Boolean)v8).booleanValue()));
    Object v9 = null;
    Object v10 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream(((java.io.InputStream)v4),((org.apache.commons.compress.compressors.deflate.DeflateParameters)v7));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.compressors.deflate.DeflateParameters();
    Object v2 = false;
    ((org.apache.commons.compress.compressors.deflate.DeflateParameters)v1).setWithZlibHeader((((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    Object v4 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream(((java.io.InputStream)v0),((org.apache.commons.compress.compressors.deflate.DeflateParameters)v1));
    Object v5 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream(((java.io.InputStream)v4));
    Object v6 = -23;
    Object v7 = ((java.io.InputStream)v5).readNBytes((((java.lang.Integer)v6).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.compressors.deflate.DeflateParameters();
    Object v2 = false;
    ((org.apache.commons.compress.compressors.deflate.DeflateParameters)v1).setWithZlibHeader((((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    Object v4 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream(((java.io.InputStream)v0),((org.apache.commons.compress.compressors.deflate.DeflateParameters)v1));
    Object v5 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream(((java.io.InputStream)v4));
    Object v6 = new org.apache.commons.compress.compressors.deflate.DeflateParameters();
    Object v7 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream(((java.io.InputStream)v5),((org.apache.commons.compress.compressors.deflate.DeflateParameters)v6));
    Object v8 = new byte[]{};
    Object v9 = ((java.io.InputStream)v7).read(((byte[])v8));
    Object v10 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream(((java.io.InputStream)v7));
    Object v11 = new byte[]{Byte.valueOf((byte)0)};
    Object v12 = 46;
    Object v13 = 0;
    Object v14 = ((java.io.InputStream)v10).readNBytes(((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 3;
    ((java.io.InputStream)v0).mark((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)5),Byte.valueOf((byte)32)};
    Object v1 = 22;
    Object v2 = org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = 0;
    Object v2 = org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.compressors.deflate.DeflateParameters();
    Object v2 = false;
    ((org.apache.commons.compress.compressors.deflate.DeflateParameters)v1).setWithZlibHeader((((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    Object v4 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream(((java.io.InputStream)v0),((org.apache.commons.compress.compressors.deflate.DeflateParameters)v1));
    Object v5 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream(((java.io.InputStream)v4));
    Object v6 = 0;
    Object v7 = ((java.io.InputStream)v5).readNBytes((((java.lang.Integer)v6).intValue()));
    Object v8 = new org.apache.commons.compress.compressors.deflate.DeflateParameters();
    Object v9 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream(((java.io.InputStream)v5),((org.apache.commons.compress.compressors.deflate.DeflateParameters)v8));
    Object v10 = new byte[]{};
    Object v11 = 37;
    Object v12 = -31;
    Object v13 = ((java.io.InputStream)v9).readNBytes(((byte[])v10),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.compressors.deflate.DeflateParameters();
    Object v2 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream(((java.io.InputStream)v0),((org.apache.commons.compress.compressors.deflate.DeflateParameters)v1));
    Object v3 = 40;
    Object v4 = ((java.io.InputStream)v2).readNBytes((((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.io.EOFException");
    } catch (java.io.EOFException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -50L;
    Object v2 = ((java.io.InputStream)v0).skip((((java.lang.Long)v1).longValue()));
    Object v3 = java.io.OutputStream.nullOutputStream();
    Object v4 = ((java.io.InputStream)v0).transferTo(((java.io.OutputStream)v3));
    org.junit.Assert.assertEquals((Object)(0L), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.compressors.deflate.DeflateParameters();
    Object v2 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream(((java.io.InputStream)v0),((org.apache.commons.compress.compressors.deflate.DeflateParameters)v1));
    Object v3 = 0L;
    Object v4 = ((java.io.InputStream)v2).skip((((java.lang.Long)v3).longValue()));
    Object v5 = new org.apache.commons.compress.compressors.deflate.DeflateParameters();
    Object v6 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream(((java.io.InputStream)v2),((org.apache.commons.compress.compressors.deflate.DeflateParameters)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.compressors.deflate.DeflateParameters();
    Object v2 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream(((java.io.InputStream)v0),((org.apache.commons.compress.compressors.deflate.DeflateParameters)v1));
    Object v3 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)0)};
    Object v4 = 0;
    Object v5 = 41;
    Object v6 = ((java.io.InputStream)v2).readNBytes(((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.compressors.deflate.DeflateParameters();
    Object v2 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream(((java.io.InputStream)v0),((org.apache.commons.compress.compressors.deflate.DeflateParameters)v1));
    Object v3 = 0L;
    Object v4 = ((java.io.InputStream)v2).skip((((java.lang.Long)v3).longValue()));
    Object v5 = new org.apache.commons.compress.compressors.deflate.DeflateParameters();
    Object v6 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream(((java.io.InputStream)v2),((org.apache.commons.compress.compressors.deflate.DeflateParameters)v5));
    Object v7 = ((java.io.InputStream)v6).readAllBytes();
      org.junit.Assert.fail("Expected java.io.EOFException");
    } catch (java.io.EOFException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.compressors.deflate.DeflateParameters();
    Object v2 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream(((java.io.InputStream)v0),((org.apache.commons.compress.compressors.deflate.DeflateParameters)v1));
    Object v3 = new byte[]{Byte.valueOf((byte)55),Byte.valueOf((byte)17)};
    Object v4 = 15;
    Object v5 = -27;
    Object v6 = ((java.io.InputStream)v2).readNBytes(((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.compressors.deflate.DeflateParameters();
    Object v2 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream(((java.io.InputStream)v0),((org.apache.commons.compress.compressors.deflate.DeflateParameters)v1));
    Object v3 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream(((java.io.InputStream)v2));
    Object v4 = -15;
    Object v5 = ((java.io.InputStream)v3).readNBytes((((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.compressors.deflate.DeflateParameters();
    Object v2 = false;
    ((org.apache.commons.compress.compressors.deflate.DeflateParameters)v1).setWithZlibHeader((((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    Object v4 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream(((java.io.InputStream)v0),((org.apache.commons.compress.compressors.deflate.DeflateParameters)v1));
    Object v5 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream(((java.io.InputStream)v4));
    Object v6 = 0;
    Object v7 = ((java.io.InputStream)v5).readNBytes((((java.lang.Integer)v6).intValue()));
    Object v8 = new org.apache.commons.compress.compressors.deflate.DeflateParameters();
    Object v9 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream(((java.io.InputStream)v5),((org.apache.commons.compress.compressors.deflate.DeflateParameters)v8));
    Object v10 = 28L;
    Object v11 = ((org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream)v9).skip((((java.lang.Long)v10).longValue()));
      org.junit.Assert.fail("Expected java.io.EOFException");
    } catch (java.io.EOFException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.compressors.deflate.DeflateParameters();
    Object v2 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream(((java.io.InputStream)v0),((org.apache.commons.compress.compressors.deflate.DeflateParameters)v1));
    Object v3 = 0L;
    Object v4 = ((java.io.InputStream)v2).skip((((java.lang.Long)v3).longValue()));
    Object v5 = new org.apache.commons.compress.compressors.deflate.DeflateParameters();
    Object v6 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream(((java.io.InputStream)v2),((org.apache.commons.compress.compressors.deflate.DeflateParameters)v5));
    Object v7 = ((org.apache.commons.compress.compressors.CompressorInputStream)v6).getBytesRead();
    org.junit.Assert.assertEquals((Object)(0L), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -3;
    Object v2 = ((java.io.InputStream)v0).readNBytes((((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.compressors.deflate.DeflateParameters();
    Object v2 = false;
    ((org.apache.commons.compress.compressors.deflate.DeflateParameters)v1).setWithZlibHeader((((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    Object v4 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream(((java.io.InputStream)v0),((org.apache.commons.compress.compressors.deflate.DeflateParameters)v1));
    Object v5 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream(((java.io.InputStream)v4));
    Object v6 = -29;
    Object v7 = ((java.io.InputStream)v5).readNBytes((((java.lang.Integer)v6).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.compressors.deflate.DeflateParameters();
    Object v2 = false;
    ((org.apache.commons.compress.compressors.deflate.DeflateParameters)v1).setWithZlibHeader((((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    Object v4 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream(((java.io.InputStream)v0),((org.apache.commons.compress.compressors.deflate.DeflateParameters)v1));
    Object v5 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream(((java.io.InputStream)v4));
    Object v6 = 0;
    Object v7 = ((java.io.InputStream)v5).readNBytes((((java.lang.Integer)v6).intValue()));
    Object v8 = new org.apache.commons.compress.compressors.deflate.DeflateParameters();
    Object v9 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream(((java.io.InputStream)v5),((org.apache.commons.compress.compressors.deflate.DeflateParameters)v8));
    Object v10 = ((org.apache.commons.compress.compressors.CompressorInputStream)v9).getCount();
    org.junit.Assert.assertEquals((Object)(0), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.compressors.deflate.DeflateParameters();
    Object v2 = false;
    ((org.apache.commons.compress.compressors.deflate.DeflateParameters)v1).setWithZlibHeader((((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    Object v4 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream(((java.io.InputStream)v0),((org.apache.commons.compress.compressors.deflate.DeflateParameters)v1));
    Object v5 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream(((java.io.InputStream)v4));
    Object v6 = new org.apache.commons.compress.compressors.deflate.DeflateParameters();
    Object v7 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream(((java.io.InputStream)v5),((org.apache.commons.compress.compressors.deflate.DeflateParameters)v6));
    Object v8 = new byte[]{};
    Object v9 = ((java.io.InputStream)v7).read(((byte[])v8));
    Object v10 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream(((java.io.InputStream)v7));
    Object v11 = new byte[]{};
    Object v12 = ((java.io.InputStream)v10).read(((byte[])v11));
    Object v13 = java.io.OutputStream.nullOutputStream();
    Object v14 = ((java.io.InputStream)v10).transferTo(((java.io.OutputStream)v13));
      org.junit.Assert.fail("Expected java.io.EOFException");
    } catch (java.io.EOFException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.compressors.deflate.DeflateParameters();
    Object v2 = false;
    ((org.apache.commons.compress.compressors.deflate.DeflateParameters)v1).setWithZlibHeader((((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    Object v4 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream(((java.io.InputStream)v0),((org.apache.commons.compress.compressors.deflate.DeflateParameters)v1));
    Object v5 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream(((java.io.InputStream)v4));
    Object v6 = new org.apache.commons.compress.compressors.deflate.DeflateParameters();
    Object v7 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream(((java.io.InputStream)v5),((org.apache.commons.compress.compressors.deflate.DeflateParameters)v6));
    Object v8 = java.io.OutputStream.nullOutputStream();
    Object v9 = new byte[]{};
    ((java.io.OutputStream)v8).write(((byte[])v9));
    Object v10 = null;
    Object v11 = ((java.io.InputStream)v7).transferTo(((java.io.OutputStream)v8));
      org.junit.Assert.fail("Expected java.io.EOFException");
    } catch (java.io.EOFException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)2)};
    Object v1 = 31;
    Object v2 = org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.compressors.deflate.DeflateParameters();
    Object v2 = false;
    ((org.apache.commons.compress.compressors.deflate.DeflateParameters)v1).setWithZlibHeader((((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    Object v4 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream(((java.io.InputStream)v0),((org.apache.commons.compress.compressors.deflate.DeflateParameters)v1));
    Object v5 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream(((java.io.InputStream)v4));
    Object v6 = 0;
    Object v7 = ((java.io.InputStream)v5).readNBytes((((java.lang.Integer)v6).intValue()));
    Object v8 = new org.apache.commons.compress.compressors.deflate.DeflateParameters();
    Object v9 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream(((java.io.InputStream)v5),((org.apache.commons.compress.compressors.deflate.DeflateParameters)v8));
    ((java.io.InputStream)v9).reset();
    Object v10 = null;
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.compressors.deflate.DeflateParameters();
    Object v2 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream(((java.io.InputStream)v0),((org.apache.commons.compress.compressors.deflate.DeflateParameters)v1));
    Object v3 = 0L;
    Object v4 = ((java.io.InputStream)v2).skip((((java.lang.Long)v3).longValue()));
    Object v5 = java.io.OutputStream.nullOutputStream();
    Object v6 = ((java.io.InputStream)v2).transferTo(((java.io.OutputStream)v5));
      org.junit.Assert.fail("Expected java.io.EOFException");
    } catch (java.io.EOFException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = java.io.OutputStream.nullOutputStream();
    Object v2 = 0;
    ((java.io.OutputStream)v1).write((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    Object v4 = ((java.io.InputStream)v0).transferTo(((java.io.OutputStream)v1));
    org.junit.Assert.assertEquals((Object)(0L), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.compressors.deflate.DeflateParameters();
    Object v2 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream(((java.io.InputStream)v0),((org.apache.commons.compress.compressors.deflate.DeflateParameters)v1));
    Object v3 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream(((java.io.InputStream)v2));
    Object v4 = -1;
    Object v5 = ((java.io.InputStream)v3).readNBytes((((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = java.io.OutputStream.nullOutputStream();
    Object v2 = 53;
    ((java.io.OutputStream)v1).write((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    Object v4 = ((java.io.InputStream)v0).transferTo(((java.io.OutputStream)v1));
    org.junit.Assert.assertEquals((Object)(0L), v4);
  }
}
