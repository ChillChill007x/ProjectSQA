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
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 3;
    ((java.io.InputStream)v0).mark((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = ((java.io.InputStream)v0).markSupported();
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 3L;
    Object v2 = ((java.io.InputStream)v0).skip((((java.lang.Long)v1).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = java.io.OutputStream.nullOutputStream();
    Object v2 = ((java.io.InputStream)v0).transferTo(((java.io.OutputStream)v1));
    org.junit.Assert.assertEquals((Object)(0L), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = new byte[]{};
    Object v1 = 8;
    Object v2 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 0L;
    Object v2 = ((java.io.InputStream)v0).skip((((java.lang.Long)v1).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 23;
    Object v2 = ((java.io.InputStream)v0).readNBytes((((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = ((java.io.InputStream)v0).readAllBytes();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new byte[]{Byte.valueOf((byte)24)};
    Object v2 = ((java.io.InputStream)v0).read(((byte[])v1));
    Object v3 = new org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream(((java.io.InputStream)v0));
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream(((java.io.InputStream)v0));
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)1),Byte.valueOf((byte)-31)};
    Object v2 = 0;
    Object v3 = 0;
    Object v4 = ((org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream)v0).read(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new byte[]{Byte.valueOf((byte)1)};
    Object v2 = 0;
    Object v3 = 1;
    Object v4 = ((java.io.InputStream)v0).readNBytes(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertEquals((Object)(0), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.compressors.deflate.DeflateParameters();
    Object v2 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream(((java.io.InputStream)v0),((org.apache.commons.compress.compressors.deflate.DeflateParameters)v1));
    Object v3 = ((org.apache.commons.compress.compressors.CompressorInputStream)v2).getCount();
    org.junit.Assert.assertEquals((Object)(0), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
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
  public void test15() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -11L;
    Object v2 = ((java.io.InputStream)v0).skip((((java.lang.Long)v1).longValue()));
    Object v3 = 13;
    Object v4 = ((java.io.InputStream)v0).readNBytes((((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = 0;
    Object v2 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.compressors.deflate.DeflateParameters();
    Object v2 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream(((java.io.InputStream)v0),((org.apache.commons.compress.compressors.deflate.DeflateParameters)v1));
    Object v3 = new byte[]{};
    Object v4 = 1;
    Object v5 = 1;
    Object v6 = ((java.io.InputStream)v2).readNBytes(((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.compressors.deflate.DeflateParameters();
    Object v2 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream(((java.io.InputStream)v0),((org.apache.commons.compress.compressors.deflate.DeflateParameters)v1));
    Object v3 = 2L;
    Object v4 = ((java.io.InputStream)v2).skip((((java.lang.Long)v3).longValue()));
      org.junit.Assert.fail("Expected java.io.EOFException");
    } catch (java.io.EOFException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.compressors.deflate.DeflateParameters();
    Object v2 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream(((java.io.InputStream)v0),((org.apache.commons.compress.compressors.deflate.DeflateParameters)v1));
    Object v3 = new byte[]{};
    Object v4 = ((java.io.InputStream)v2).read(((byte[])v3));
    org.junit.Assert.assertEquals((Object)(0), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)5),Byte.valueOf((byte)0)};
    Object v1 = 27;
    Object v2 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.compressors.deflate.DeflateParameters();
    Object v2 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream(((java.io.InputStream)v0),((org.apache.commons.compress.compressors.deflate.DeflateParameters)v1));
    Object v3 = ((java.io.InputStream)v2).available();
    org.junit.Assert.assertEquals((Object)(1), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.compressors.deflate.DeflateParameters();
    Object v2 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream(((java.io.InputStream)v0),((org.apache.commons.compress.compressors.deflate.DeflateParameters)v1));
    Object v3 = new byte[]{};
    Object v4 = ((java.io.InputStream)v2).read(((byte[])v3));
    Object v5 = 0L;
    Object v6 = ((java.io.InputStream)v2).skip((((java.lang.Long)v5).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.compressors.deflate.DeflateParameters();
    Object v2 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream(((java.io.InputStream)v0),((org.apache.commons.compress.compressors.deflate.DeflateParameters)v1));
    Object v3 = 20;
    Object v4 = ((java.io.InputStream)v2).readNBytes((((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.io.EOFException");
    } catch (java.io.EOFException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.compressors.deflate.DeflateParameters();
    Object v2 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream(((java.io.InputStream)v0),((org.apache.commons.compress.compressors.deflate.DeflateParameters)v1));
    Object v3 = java.io.OutputStream.nullOutputStream();
    Object v4 = 0;
    ((java.io.OutputStream)v3).write((((java.lang.Integer)v4).intValue()));
    Object v5 = null;
    Object v6 = ((java.io.InputStream)v2).transferTo(((java.io.OutputStream)v3));
      org.junit.Assert.fail("Expected java.io.EOFException");
    } catch (java.io.EOFException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.compressors.deflate.DeflateParameters();
    Object v2 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream(((java.io.InputStream)v0),((org.apache.commons.compress.compressors.deflate.DeflateParameters)v1));
    Object v3 = ((org.apache.commons.compress.compressors.CompressorInputStream)v2).getBytesRead();
    org.junit.Assert.assertEquals((Object)(0L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new byte[]{Byte.valueOf((byte)-11),Byte.valueOf((byte)12),Byte.valueOf((byte)0)};
    Object v2 = 16;
    Object v3 = 1;
    Object v4 = ((java.io.InputStream)v0).readNBytes(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.compressors.deflate.DeflateParameters();
    Object v2 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream(((java.io.InputStream)v0),((org.apache.commons.compress.compressors.deflate.DeflateParameters)v1));
    Object v3 = 17L;
    Object v4 = ((java.io.InputStream)v2).skip((((java.lang.Long)v3).longValue()));
      org.junit.Assert.fail("Expected java.io.EOFException");
    } catch (java.io.EOFException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)-35),Byte.valueOf((byte)-35),Byte.valueOf((byte)4)};
    Object v1 = 11;
    Object v2 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.compressors.deflate.DeflateParameters();
    Object v2 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream(((java.io.InputStream)v0),((org.apache.commons.compress.compressors.deflate.DeflateParameters)v1));
    Object v3 = 0;
    Object v4 = ((java.io.InputStream)v2).readNBytes((((java.lang.Integer)v3).intValue()));
    Object v5 = new byte[]{Byte.valueOf((byte)-55),Byte.valueOf((byte)-5)};
    Object v6 = 30;
    Object v7 = 7;
    Object v8 = ((java.io.InputStream)v2).readNBytes(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.compressors.deflate.DeflateParameters();
    Object v2 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream(((java.io.InputStream)v0),((org.apache.commons.compress.compressors.deflate.DeflateParameters)v1));
    Object v3 = 5;
    ((java.io.InputStream)v2).mark((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = true;
    Object v2 = new org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream(((java.io.InputStream)v0),(((java.lang.Boolean)v1).booleanValue()));
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.compressors.deflate.DeflateParameters();
    Object v2 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream(((java.io.InputStream)v0),((org.apache.commons.compress.compressors.deflate.DeflateParameters)v1));
    Object v3 = 3;
    Object v4 = ((java.io.InputStream)v2).readNBytes((((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.io.EOFException");
    } catch (java.io.EOFException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.compressors.deflate.DeflateParameters();
    Object v2 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream(((java.io.InputStream)v0),((org.apache.commons.compress.compressors.deflate.DeflateParameters)v1));
    Object v3 = new byte[]{Byte.valueOf((byte)-52)};
    Object v4 = 1;
    Object v5 = -39;
    Object v6 = ((java.io.InputStream)v2).readNBytes(((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)0)};
    Object v1 = -22;
    Object v2 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -42;
    Object v2 = ((java.io.InputStream)v0).readNBytes((((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.compressors.deflate.DeflateParameters();
    Object v2 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream(((java.io.InputStream)v0),((org.apache.commons.compress.compressors.deflate.DeflateParameters)v1));
    Object v3 = -1L;
    Object v4 = ((java.io.InputStream)v2).skip((((java.lang.Long)v3).longValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new byte[]{Byte.valueOf((byte)51),Byte.valueOf((byte)-1)};
    Object v2 = 16;
    Object v3 = 49;
    Object v4 = ((java.io.InputStream)v0).readNBytes(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.compressors.deflate.DeflateParameters();
    Object v2 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream(((java.io.InputStream)v0),((org.apache.commons.compress.compressors.deflate.DeflateParameters)v1));
    Object v3 = new byte[]{};
    Object v4 = 0;
    Object v5 = 0;
    Object v6 = ((java.io.InputStream)v2).read(((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = false;
    Object v8 = new org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream(((java.io.InputStream)v2),(((java.lang.Boolean)v7).booleanValue()));
      org.junit.Assert.fail("Expected java.io.EOFException");
    } catch (java.io.EOFException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.compressors.deflate.DeflateParameters();
    Object v2 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream(((java.io.InputStream)v0),((org.apache.commons.compress.compressors.deflate.DeflateParameters)v1));
    Object v3 = java.io.OutputStream.nullOutputStream();
    Object v4 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)36),Byte.valueOf((byte)-8)};
    ((java.io.OutputStream)v3).write(((byte[])v4));
    Object v5 = null;
    Object v6 = ((java.io.InputStream)v2).transferTo(((java.io.OutputStream)v3));
      org.junit.Assert.fail("Expected java.io.EOFException");
    } catch (java.io.EOFException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.compressors.deflate.DeflateParameters();
    Object v2 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream(((java.io.InputStream)v0),((org.apache.commons.compress.compressors.deflate.DeflateParameters)v1));
    Object v3 = -25;
    Object v4 = ((java.io.InputStream)v2).readNBytes((((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
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
  public void test42() throws Throwable {
    try {
    Object v0 = new byte[]{};
    Object v1 = 1684;
    Object v2 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 1L;
    Object v2 = ((java.io.InputStream)v0).skip((((java.lang.Long)v1).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)8)};
    Object v1 = 0;
    Object v2 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 0;
    ((java.io.InputStream)v0).mark((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
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
  public void test47() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 22;
    Object v2 = ((java.io.InputStream)v0).readNBytes((((java.lang.Integer)v1).intValue()));
    Object v3 = -22;
    Object v4 = ((java.io.InputStream)v0).readNBytes((((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.compressors.deflate.DeflateParameters();
    Object v2 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream(((java.io.InputStream)v0),((org.apache.commons.compress.compressors.deflate.DeflateParameters)v1));
    Object v3 = true;
    Object v4 = new org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream(((java.io.InputStream)v2),(((java.lang.Boolean)v3).booleanValue()));
      org.junit.Assert.fail("Expected java.io.EOFException");
    } catch (java.io.EOFException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)0)};
    Object v1 = 21;
    Object v2 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.compressors.deflate.DeflateParameters();
    Object v2 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream(((java.io.InputStream)v0),((org.apache.commons.compress.compressors.deflate.DeflateParameters)v1));
    Object v3 = new byte[]{};
    Object v4 = ((java.io.InputStream)v2).read(((byte[])v3));
    Object v5 = -29L;
    Object v6 = ((java.io.InputStream)v2).skip((((java.lang.Long)v5).longValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)-40),Byte.valueOf((byte)1)};
    Object v2 = 2;
    Object v3 = 0;
    Object v4 = ((java.io.InputStream)v0).readNBytes(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertEquals((Object)(0), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 38L;
    Object v2 = ((java.io.InputStream)v0).skip((((java.lang.Long)v1).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.compressors.deflate.DeflateParameters();
    Object v2 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream(((java.io.InputStream)v0),((org.apache.commons.compress.compressors.deflate.DeflateParameters)v1));
    Object v3 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)-5)};
    Object v4 = -7;
    Object v5 = 0;
    Object v6 = ((java.io.InputStream)v2).readNBytes(((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.compressors.deflate.DeflateParameters();
    Object v2 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream(((java.io.InputStream)v0),((org.apache.commons.compress.compressors.deflate.DeflateParameters)v1));
    ((java.io.InputStream)v2).reset();
    Object v3 = null;
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.compressors.deflate.DeflateParameters();
    Object v2 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream(((java.io.InputStream)v0),((org.apache.commons.compress.compressors.deflate.DeflateParameters)v1));
    Object v3 = -15L;
    Object v4 = ((java.io.InputStream)v2).skip((((java.lang.Long)v3).longValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 8;
    Object v2 = ((java.io.InputStream)v0).readNBytes((((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.compressors.deflate.DeflateParameters();
    Object v2 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream(((java.io.InputStream)v0),((org.apache.commons.compress.compressors.deflate.DeflateParameters)v1));
    Object v3 = new byte[]{Byte.valueOf((byte)12),Byte.valueOf((byte)-70),Byte.valueOf((byte)0)};
    Object v4 = 43;
    Object v5 = 1;
    Object v6 = ((java.io.InputStream)v2).readNBytes(((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = ((java.io.InputStream)v0).read();
    Object v2 = java.io.OutputStream.nullOutputStream();
    Object v3 = ((java.io.InputStream)v0).transferTo(((java.io.OutputStream)v2));
    org.junit.Assert.assertEquals((Object)(0L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 2L;
    Object v2 = ((java.io.InputStream)v0).skip((((java.lang.Long)v1).longValue()));
    Object v3 = new byte[]{};
    Object v4 = ((java.io.InputStream)v0).read(((byte[])v3));
    org.junit.Assert.assertEquals((Object)(0), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.compressors.deflate.DeflateParameters();
    Object v2 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream(((java.io.InputStream)v0),((org.apache.commons.compress.compressors.deflate.DeflateParameters)v1));
    Object v3 = new byte[]{};
    Object v4 = -16;
    Object v5 = 1;
    Object v6 = ((java.io.InputStream)v2).readNBytes(((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new byte[]{Byte.valueOf((byte)-41)};
    Object v2 = 13;
    Object v3 = 1;
    Object v4 = ((java.io.InputStream)v0).readNBytes(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = java.io.OutputStream.nullOutputStream();
    Object v2 = 68;
    ((java.io.OutputStream)v1).write((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    Object v4 = ((java.io.InputStream)v0).transferTo(((java.io.OutputStream)v1));
    org.junit.Assert.assertEquals((Object)(0L), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.compressors.deflate.DeflateParameters();
    Object v2 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream(((java.io.InputStream)v0),((org.apache.commons.compress.compressors.deflate.DeflateParameters)v1));
    Object v3 = 0L;
    Object v4 = ((java.io.InputStream)v2).skip((((java.lang.Long)v3).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new byte[]{Byte.valueOf((byte)24),Byte.valueOf((byte)-20)};
    Object v2 = ((java.io.InputStream)v0).read(((byte[])v1));
    Object v3 = -1L;
    Object v4 = ((java.io.InputStream)v0).skip((((java.lang.Long)v3).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
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
  public void test67() throws Throwable {
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
  public void test68() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new byte[]{};
    Object v2 = -13;
    Object v3 = 1;
    Object v4 = ((java.io.InputStream)v0).readNBytes(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.compressors.deflate.DeflateParameters();
    Object v2 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream(((java.io.InputStream)v0),((org.apache.commons.compress.compressors.deflate.DeflateParameters)v1));
    Object v3 = 85;
    Object v4 = ((java.io.InputStream)v2).readNBytes((((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.io.EOFException");
    } catch (java.io.EOFException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)9),Byte.valueOf((byte)9)};
    Object v2 = ((java.io.InputStream)v0).read(((byte[])v1));
    Object v3 = 1;
    Object v4 = ((java.io.InputStream)v0).readNBytes((((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.compressors.deflate.DeflateParameters();
    Object v2 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream(((java.io.InputStream)v0),((org.apache.commons.compress.compressors.deflate.DeflateParameters)v1));
    Object v3 = new org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream(((java.io.InputStream)v2));
      org.junit.Assert.fail("Expected java.io.EOFException");
    } catch (java.io.EOFException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.compressors.deflate.DeflateParameters();
    Object v2 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream(((java.io.InputStream)v0),((org.apache.commons.compress.compressors.deflate.DeflateParameters)v1));
    Object v3 = 1;
    ((java.io.InputStream)v2).mark((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.compressors.deflate.DeflateParameters();
    Object v2 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream(((java.io.InputStream)v0),((org.apache.commons.compress.compressors.deflate.DeflateParameters)v1));
    Object v3 = 0L;
    Object v4 = ((java.io.InputStream)v2).skip((((java.lang.Long)v3).longValue()));
    Object v5 = ((org.apache.commons.compress.compressors.CompressorInputStream)v2).getCount();
    org.junit.Assert.assertEquals((Object)(0), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = java.io.OutputStream.nullOutputStream();
    Object v2 = 1;
    ((java.io.OutputStream)v1).write((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    Object v4 = ((java.io.InputStream)v0).transferTo(((java.io.OutputStream)v1));
    org.junit.Assert.assertEquals((Object)(0L), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)40),Byte.valueOf((byte)-33)};
    Object v1 = 8;
    Object v2 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new byte[]{Byte.valueOf((byte)0)};
    Object v2 = 4;
    Object v3 = 4;
    Object v4 = ((java.io.InputStream)v0).readNBytes(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.compressors.deflate.DeflateParameters();
    Object v2 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream(((java.io.InputStream)v0),((org.apache.commons.compress.compressors.deflate.DeflateParameters)v1));
    Object v3 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)1)};
    Object v4 = 1;
    Object v5 = 0;
    Object v6 = ((java.io.InputStream)v2).readNBytes(((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = 0;
    Object v8 = ((java.io.InputStream)v2).readNBytes((((java.lang.Integer)v7).intValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new byte[]{Byte.valueOf((byte)23),Byte.valueOf((byte)25),Byte.valueOf((byte)-4)};
    Object v2 = 0;
    Object v3 = 0;
    Object v4 = ((java.io.InputStream)v0).read(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)-84),Byte.valueOf((byte)13)};
    Object v6 = ((java.io.InputStream)v0).read(((byte[])v5));
    org.junit.Assert.assertEquals((Object)(-1), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)0),Byte.valueOf((byte)0)};
    Object v2 = 0;
    Object v3 = 16;
    Object v4 = ((java.io.InputStream)v0).readNBytes(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)15),Byte.valueOf((byte)36),Byte.valueOf((byte)0)};
    Object v1 = 1;
    Object v2 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.compressors.deflate.DeflateParameters();
    Object v2 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream(((java.io.InputStream)v0),((org.apache.commons.compress.compressors.deflate.DeflateParameters)v1));
    Object v3 = 1L;
    Object v4 = ((java.io.InputStream)v2).skip((((java.lang.Long)v3).longValue()));
      org.junit.Assert.fail("Expected java.io.EOFException");
    } catch (java.io.EOFException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 32;
    Object v2 = ((java.io.InputStream)v0).readNBytes((((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.compressors.deflate.DeflateParameters();
    Object v2 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream(((java.io.InputStream)v0),((org.apache.commons.compress.compressors.deflate.DeflateParameters)v1));
    Object v3 = new byte[]{};
    Object v4 = 1;
    Object v5 = 0;
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
    Object v3 = 0;
    Object v4 = ((java.io.InputStream)v2).readNBytes((((java.lang.Integer)v3).intValue()));
    Object v5 = new byte[]{Byte.valueOf((byte)46),Byte.valueOf((byte)12),Byte.valueOf((byte)-6)};
    Object v6 = 0;
    Object v7 = -26;
    Object v8 = ((java.io.InputStream)v2).readNBytes(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)-11),Byte.valueOf((byte)7),Byte.valueOf((byte)0)};
    Object v1 = 1;
    Object v2 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = java.io.OutputStream.nullOutputStream();
    Object v2 = ((java.io.InputStream)v0).transferTo(((java.io.OutputStream)v1));
    Object v3 = new byte[]{Byte.valueOf((byte)27)};
    Object v4 = 4;
    Object v5 = 20;
    Object v6 = ((java.io.InputStream)v0).readNBytes(((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 1;
    Object v2 = ((java.io.InputStream)v0).readNBytes((((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.compressors.deflate.DeflateParameters();
    Object v2 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream(((java.io.InputStream)v0),((org.apache.commons.compress.compressors.deflate.DeflateParameters)v1));
    Object v3 = 4L;
    Object v4 = ((java.io.InputStream)v2).skip((((java.lang.Long)v3).longValue()));
      org.junit.Assert.fail("Expected java.io.EOFException");
    } catch (java.io.EOFException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 7;
    Object v2 = ((java.io.InputStream)v0).readNBytes((((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = ((java.io.InputStream)v0).readAllBytes();
    Object v2 = java.io.OutputStream.nullOutputStream();
    Object v3 = ((java.io.InputStream)v0).transferTo(((java.io.OutputStream)v2));
    org.junit.Assert.assertEquals((Object)(0L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = false;
    Object v2 = new org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream(((java.io.InputStream)v0),(((java.lang.Boolean)v1).booleanValue()));
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    ((java.io.InputStream)v0).reset();
    Object v1 = null;
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.compressors.deflate.DeflateParameters();
    Object v2 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream(((java.io.InputStream)v0),((org.apache.commons.compress.compressors.deflate.DeflateParameters)v1));
    Object v3 = 0;
    Object v4 = ((java.io.InputStream)v2).readNBytes((((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.compressors.deflate.DeflateParameters();
    Object v2 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream(((java.io.InputStream)v0),((org.apache.commons.compress.compressors.deflate.DeflateParameters)v1));
    Object v3 = -12L;
    Object v4 = ((java.io.InputStream)v2).skip((((java.lang.Long)v3).longValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)14),Byte.valueOf((byte)0)};
    Object v2 = ((java.io.InputStream)v0).read(((byte[])v1));
    org.junit.Assert.assertEquals((Object)(-1), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.compressors.deflate.DeflateParameters();
    Object v2 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream(((java.io.InputStream)v0),((org.apache.commons.compress.compressors.deflate.DeflateParameters)v1));
    Object v3 = new byte[]{Byte.valueOf((byte)0)};
    Object v4 = 25;
    Object v5 = 0;
    Object v6 = ((java.io.InputStream)v2).readNBytes(((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new byte[]{Byte.valueOf((byte)25),Byte.valueOf((byte)0)};
    Object v2 = ((java.io.InputStream)v0).read(((byte[])v1));
    org.junit.Assert.assertEquals((Object)(-1), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.compressors.deflate.DeflateParameters();
    Object v2 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream(((java.io.InputStream)v0),((org.apache.commons.compress.compressors.deflate.DeflateParameters)v1));
    Object v3 = 0;
    Object v4 = ((java.io.InputStream)v2).readNBytes((((java.lang.Integer)v3).intValue()));
    Object v5 = -12L;
    Object v6 = ((java.io.InputStream)v2).skip((((java.lang.Long)v5).longValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = null;
    ((org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream)v0).close();
    Object v1 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }
}
