package org.apache.commons.compress.archivers.zip;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(((java.io.OutputStream)v1));
    Object v3 = new byte[]{Byte.valueOf((byte)0)};
    Object v4 = 17;
    Object v5 = 180;
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v2).write(((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(((java.io.OutputStream)v1));
    Object v3 = "UTF";
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v2).setComment(((java.lang.String)v3));
    Object v4 = null;
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v2).closeArchiveEntry();
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(((java.io.OutputStream)v1));
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v2).deflate();
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = ".wm";
    Object v1 = "00";
    Object v2 = java.io.File.createTempFile(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(((java.io.File)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = ".wm";
    Object v1 = "00";
    Object v2 = java.io.File.createTempFile(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(((java.io.File)v2));
    Object v4 = false;
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v3).setUseLanguageEncodingFlag((((java.lang.Boolean)v4).booleanValue()));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(((java.io.OutputStream)v1));
    Object v3 = "invalid entry size Uexpected ";
    Object v4 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v3));
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v2).writeDataDescriptor(((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = ".wm";
    Object v1 = "00";
    Object v2 = java.io.File.createTempFile(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(((java.io.File)v2));
    Object v4 = ".wm";
    Object v5 = "00";
    Object v6 = java.io.File.createTempFile(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = "`\n";
    Object v8 = ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v3).createArchiveEntry(((java.io.File)v6),((java.lang.String)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(((java.io.OutputStream)v1));
    Object v3 = new byte[]{};
    Object v4 = 0;
    Object v5 = 23;
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v2).writeOut(((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(((java.io.OutputStream)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(((java.io.OutputStream)v1));
    Object v3 = " byte";
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v2).setComment(((java.lang.String)v3));
    Object v4 = null;
    Object v5 = 31;
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v2).setLevel((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(((java.io.OutputStream)v1));
    Object v3 = -18;
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v2).setMethod((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    Object v5 = "invalid entry size Uexpected ";
    Object v6 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v5));
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v2).writeLocalFileHeader(((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(((java.io.OutputStream)v1));
    Object v3 = "invalid entry size Uexpected ";
    Object v4 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v3));
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v2).writeLocalFileHeader(((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(((java.io.OutputStream)v1));
    Object v3 = ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v2).isSeekable();
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(((java.io.OutputStream)v1));
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v2).close();
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = ".wm";
    Object v1 = "00";
    Object v2 = java.io.File.createTempFile(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(((java.io.File)v2));
    Object v4 = "invalid entry size Uexpected ";
    Object v5 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v4));
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v3).writeCentralFileHeader(((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = ".wm";
    Object v1 = "00";
    Object v2 = java.io.File.createTempFile(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(((java.io.File)v2));
    Object v4 = "K";
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v3).setComment(((java.lang.String)v4));
    Object v5 = null;
    Object v6 = -27;
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v3).setLevel((((java.lang.Integer)v6).intValue()));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(((java.io.OutputStream)v1));
    Object v3 = 30;
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v2).setLevel((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = ".wm";
    Object v1 = "00";
    Object v2 = java.io.File.createTempFile(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(((java.io.File)v2));
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v3).finish();
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(((java.io.OutputStream)v1));
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v2).writeCentralDirectoryEnd();
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(((java.io.OutputStream)v1));
    Object v3 = false;
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v2).setUseLanguageEncodingFlag((((java.lang.Boolean)v3).booleanValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(((java.io.OutputStream)v1));
    Object v3 = -22;
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v2).setLevel((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(((java.io.OutputStream)v1));
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v2).flush();
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = ".wm";
    Object v1 = "00";
    Object v2 = java.io.File.createTempFile(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(((java.io.File)v2));
    Object v4 = ".wm";
    Object v5 = "00";
    Object v6 = java.io.File.createTempFile(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = "UT\\8";
    Object v8 = ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v3).createArchiveEntry(((java.io.File)v6),((java.lang.String)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(((java.io.OutputStream)v1));
    Object v3 = false;
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v2).setFallbackToUTF8((((java.lang.Boolean)v3).booleanValue()));
    Object v4 = null;
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v2).finish();
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(((java.io.OutputStream)v1));
    Object v3 = "invalid entry size Uexpected ";
    Object v4 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v3));
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v2).putArchiveEntry(((org.apache.commons.compress.archivers.ArchiveEntry)v4));
    Object v5 = null;
    Object v6 = "invalid entry size Uexpected ";
    Object v7 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v6));
    Object v8 = ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v7).hashCode();
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v2).writeCentralFileHeader(((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v7));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(((java.io.OutputStream)v1));
    Object v3 = 0;
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v2).setMethod((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    Object v5 = false;
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v2).setUseLanguageEncodingFlag((((java.lang.Boolean)v5).booleanValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = ".wm";
    Object v1 = "00";
    Object v2 = java.io.File.createTempFile(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(((java.io.File)v2));
    Object v4 = 128;
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v3).setMethod((((java.lang.Integer)v4).intValue()));
    Object v5 = null;
    Object v6 = "invalid entry size Uexpected ";
    Object v7 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v6));
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v3).writeCentralFileHeader(((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(((java.io.OutputStream)v1));
    Object v3 = true;
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v2).setUseLanguageEncodingFlag((((java.lang.Boolean)v3).booleanValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(((java.io.OutputStream)v1));
    Object v3 = new byte[]{Byte.valueOf((byte)30),Byte.valueOf((byte)0),Byte.valueOf((byte)1)};
    Object v4 = 204;
    Object v5 = 16;
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v2).writeOut(((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = ".wm";
    Object v1 = "00";
    Object v2 = java.io.File.createTempFile(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(((java.io.File)v2));
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v3).close();
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(((java.io.OutputStream)v1));
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v2).closeArchiveEntry();
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(((java.io.OutputStream)v1));
    Object v3 = ") _+ len(";
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v2).setEncoding(((java.lang.String)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.nio.charset.IllegalCharsetNameException");
    } catch (java.nio.charset.IllegalCharsetNameException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(((java.io.OutputStream)v1));
    Object v3 = "invalid entry size Uexpected ";
    Object v4 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v3));
    Object v5 = -26L;
    Object v6 = java.util.concurrent.TimeUnit.MICROSECONDS;
    Object v7 = java.nio.file.attribute.FileTime.from((((java.lang.Long)v5).longValue()),((java.util.concurrent.TimeUnit)v6));
    Object v8 = ((java.util.zip.ZipEntry)v4).setCreationTime(((java.nio.file.attribute.FileTime)v7));
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v2).writeDataDescriptor(((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v4));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(((java.io.OutputStream)v1));
    Object v3 = "invalid entry size Uexpected ";
    Object v4 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v3));
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v2).writeCentralFileHeader(((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v4));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(((java.io.OutputStream)v1));
    Object v3 = new byte[]{Byte.valueOf((byte)31),Byte.valueOf((byte)0),Byte.valueOf((byte)-2)};
    Object v4 = 14;
    Object v5 = 8162;
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v2).write(((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(((java.io.OutputStream)v1));
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v2).deflate();
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = ".wm";
    Object v1 = "00";
    Object v2 = java.io.File.createTempFile(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(((java.io.File)v2));
    Object v4 = "invalid entry size Uexpected ";
    Object v5 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v4));
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v3).putArchiveEntry(((org.apache.commons.compress.archivers.ArchiveEntry)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = ".wm";
    Object v1 = "00";
    Object v2 = java.io.File.createTempFile(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(((java.io.File)v2));
    Object v4 = true;
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v3).setFallbackToUTF8((((java.lang.Boolean)v4).booleanValue()));
    Object v5 = null;
    Object v6 = "invalid entry size Uexpected ";
    Object v7 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v6));
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v3).writeCentralFileHeader(((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(((java.io.OutputStream)v1));
    Object v3 = 48;
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v2).setMethod((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v2).deflate();
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(((java.io.OutputStream)v1));
    Object v3 = ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v2).isSeekable();
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(((java.io.OutputStream)v1));
    Object v3 = "invalid entry size Uexpected ";
    Object v4 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v3));
    Object v5 = new byte[]{Byte.valueOf((byte)1)};
    ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v4).setExtra(((byte[])v5));
    Object v6 = null;
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v2).writeCentralFileHeader(((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v4));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(((java.io.OutputStream)v1));
    Object v3 = -7;
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v2).setMethod((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v2).close();
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(((java.io.OutputStream)v1));
    Object v3 = -27;
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v2).setLevel((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new byte[]{};
    ((java.io.OutputStream)v0).write(((byte[])v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(((java.io.OutputStream)v1));
    Object v3 = ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v2).getEncoding();
    org.junit.Assert.assertEquals((Object)("UTF8"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(((java.io.OutputStream)v1));
    Object v3 = 26;
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v2).setLevel((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(((java.io.OutputStream)v1));
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v2).close();
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(((java.io.OutputStream)v1));
    Object v3 = true;
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v2).setUseLanguageEncodingFlag((((java.lang.Boolean)v3).booleanValue()));
    Object v4 = null;
    Object v5 = new byte[]{Byte.valueOf((byte)0)};
    Object v6 = 4;
    Object v7 = -31;
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v2).write(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(((java.io.OutputStream)v1));
    Object v3 = 4;
    ((org.apache.commons.compress.archivers.ArchiveOutputStream)v2).write((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(((java.io.OutputStream)v1));
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v2).finish();
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(((java.io.OutputStream)v1));
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v2).closeArchiveEntry();
    Object v3 = null;
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v2).finish();
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(((java.io.OutputStream)v1));
    Object v3 = false;
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v2).setUseLanguageEncodingFlag((((java.lang.Boolean)v3).booleanValue()));
    Object v4 = null;
    Object v5 = -17;
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v2).setMethod((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(((java.io.OutputStream)v1));
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v2).closeArchiveEntry();
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(((java.io.OutputStream)v1));
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v2).finish();
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(((java.io.OutputStream)v1));
    Object v3 = true;
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v2).setUseLanguageEncodingFlag((((java.lang.Boolean)v3).booleanValue()));
    Object v4 = null;
    Object v5 = "invalid entry size Uexpected ";
    Object v6 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v5));
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v2).writeDataDescriptor(((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(((java.io.OutputStream)v1));
    Object v3 = 42;
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v2).setMethod((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v2).close();
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(((java.io.OutputStream)v1));
    Object v3 = ".wm";
    Object v4 = "00";
    Object v5 = java.io.File.createTempFile(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = "TRAILER!!!";
    Object v7 = ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v2).createArchiveEntry(((java.io.File)v5),((java.lang.String)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(((java.io.OutputStream)v1));
    Object v3 = true;
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v2).setFallbackToUTF8((((java.lang.Boolean)v3).booleanValue()));
    Object v4 = null;
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v2).finish();
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(((java.io.OutputStream)v1));
    Object v3 = ".wm";
    Object v4 = "00";
    Object v5 = java.io.File.createTempFile(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = "/";
    Object v7 = ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v2).createArchiveEntry(((java.io.File)v5),((java.lang.String)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(((java.io.OutputStream)v1));
    Object v3 = ".wm";
    Object v4 = "00";
    Object v5 = java.io.File.createTempFile(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = "t";
    Object v7 = ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v2).createArchiveEntry(((java.io.File)v5),((java.lang.String)v6));
    Object v8 = new byte[]{Byte.valueOf((byte)58)};
    Object v9 = -3;
    Object v10 = 0;
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v2).write(((byte[])v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = ".wm";
    Object v1 = "00";
    Object v2 = java.io.File.createTempFile(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(((java.io.File)v2));
    Object v4 = new byte[]{};
    Object v5 = -38;
    Object v6 = 255;
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v3).writeOut(((byte[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(((java.io.OutputStream)v1));
    Object v3 = 0;
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v2).setMethod((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    Object v5 = ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v2).isSeekable();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(((java.io.OutputStream)v1));
    Object v3 = "1";
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v2).setComment(((java.lang.String)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(((java.io.OutputStream)v1));
    Object v3 = "JarMarker doesn't expect any data";
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v2).setComment(((java.lang.String)v3));
    Object v4 = null;
    Object v5 = null;
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v2).setCreateUnicodeExtraFields(((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(((java.io.OutputStream)v1));
    Object v3 = " in '";
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v2).setComment(((java.lang.String)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(((java.io.OutputStream)v1));
    Object v3 = "bbip2";
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v2).setComment(((java.lang.String)v3));
    Object v4 = null;
    Object v5 = new byte[]{};
    Object v6 = 88;
    Object v7 = 0;
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v2).write(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(((java.io.OutputStream)v1));
    Object v3 = false;
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v2).setFallbackToUTF8((((java.lang.Boolean)v3).booleanValue()));
    Object v4 = null;
    Object v5 = new byte[]{Byte.valueOf((byte)12)};
    Object v6 = 1;
    Object v7 = 0;
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v2).write(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = ".wm";
    Object v1 = "00";
    Object v2 = java.io.File.createTempFile(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(((java.io.File)v2));
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v3).writeCentralDirectoryEnd();
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = ".wm";
    Object v1 = "00";
    Object v2 = java.io.File.createTempFile(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(((java.io.File)v2));
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v3).close();
    Object v4 = null;
    Object v5 = "invalid entry size Uexpected ";
    Object v6 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v5));
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v3).writeLocalFileHeader(((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(((java.io.OutputStream)v1));
    Object v3 = new byte[]{};
    Object v4 = 32;
    Object v5 = 7;
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v2).writeOut(((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(((java.io.OutputStream)v1));
    Object v3 = "invalid entry size Uexpected ";
    Object v4 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v3));
    Object v5 = ((org.apache.commons.compress.archivers.ArchiveEntry)v4).isDirectory();
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v2).putArchiveEntry(((org.apache.commons.compress.archivers.ArchiveEntry)v4));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = ".wm";
    Object v1 = "00";
    Object v2 = java.io.File.createTempFile(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(((java.io.File)v2));
    Object v4 = 36;
    ((org.apache.commons.compress.archivers.ArchiveOutputStream)v3).write((((java.lang.Integer)v4).intValue()));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(((java.io.OutputStream)v1));
    Object v3 = false;
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v2).setUseLanguageEncodingFlag((((java.lang.Boolean)v3).booleanValue()));
    Object v4 = null;
    Object v5 = new byte[]{Byte.valueOf((byte)83),Byte.valueOf((byte)18)};
    Object v6 = 1;
    Object v7 = -12;
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v2).write(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(((java.io.OutputStream)v1));
    Object v3 = -40;
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v2).setMethod((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(((java.io.OutputStream)v1));
    Object v3 = new byte[]{Byte.valueOf((byte)1)};
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v2).writeOut(((byte[])v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(((java.io.OutputStream)v1));
    Object v3 = "invalid entry size Uexpected ";
    Object v4 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v3));
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v2).writeLocalFileHeader(((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = ".wm";
    Object v1 = "00";
    Object v2 = java.io.File.createTempFile(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(((java.io.File)v2));
    Object v4 = "invalid entry size Uexpected ";
    Object v5 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v4));
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v3).writeLocalFileHeader(((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(((java.io.OutputStream)v1));
    Object v3 = 17;
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v2).setLevel((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = ".wm";
    Object v1 = "00";
    Object v2 = java.io.File.createTempFile(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(((java.io.File)v2));
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v3).flush();
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(((java.io.OutputStream)v1));
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v2).close();
    Object v3 = null;
    Object v4 = true;
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v2).setUseLanguageEncodingFlag((((java.lang.Boolean)v4).booleanValue()));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(((java.io.OutputStream)v1));
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v2).close();
    Object v3 = null;
    Object v4 = "invalid entry size Uexpected ";
    Object v5 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v4));
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v2).writeDataDescriptor(((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(((java.io.OutputStream)v1));
    Object v3 = new byte[]{Byte.valueOf((byte)12),Byte.valueOf((byte)1),Byte.valueOf((byte)-29)};
    Object v4 = -21;
    Object v5 = 0;
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v2).writeOut(((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(((java.io.OutputStream)v1));
    Object v3 = "invalid entry size Uexpected ";
    Object v4 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v3));
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v2).writeCentralFileHeader(((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v4));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(((java.io.OutputStream)v1));
    Object v3 = "writing to an input buffer";
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v2).setEncoding(((java.lang.String)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.nio.charset.IllegalCharsetNameException");
    } catch (java.nio.charset.IllegalCharsetNameException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = ".wm";
    Object v1 = "00";
    Object v2 = java.io.File.createTempFile(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(((java.io.File)v2));
    Object v4 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)-12)};
    Object v5 = -2;
    Object v6 = 12;
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v3).write(((byte[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(((java.io.OutputStream)v1));
    Object v3 = 3;
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v2).setLevel((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(((java.io.OutputStream)v1));
    Object v3 = "invalid entry size Uexpected ";
    Object v4 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v3));
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v2).putArchiveEntry(((org.apache.commons.compress.archivers.ArchiveEntry)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(((java.io.OutputStream)v1));
    Object v3 = new byte[]{Byte.valueOf((byte)9),Byte.valueOf((byte)1),Byte.valueOf((byte)1)};
    Object v4 = 5;
    Object v5 = 0;
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v2).write(((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = ".wm";
    Object v1 = "00";
    Object v2 = java.io.File.createTempFile(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(((java.io.File)v2));
    Object v4 = "invalid entry size Uexpected ";
    Object v5 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v4));
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v3).putArchiveEntry(((org.apache.commons.compress.archivers.ArchiveEntry)v5));
    Object v6 = null;
    Object v7 = ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v3).isSeekable();
    org.junit.Assert.assertEquals((Object)(true), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(((java.io.OutputStream)v1));
    Object v3 = false;
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v2).setUseLanguageEncodingFlag((((java.lang.Boolean)v3).booleanValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = ".wm";
    Object v1 = "00";
    Object v2 = java.io.File.createTempFile(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(((java.io.File)v2));
    Object v4 = 2;
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v3).setLevel((((java.lang.Integer)v4).intValue()));
    Object v5 = null;
    Object v6 = "invalid entry size Uexpected ";
    Object v7 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v6));
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v3).writeDataDescriptor(((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(((java.io.OutputStream)v1));
    Object v3 = new byte[]{Byte.valueOf((byte)0)};
    Object v4 = 0;
    Object v5 = 0;
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v2).write(((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = ".wm";
    Object v1 = "00";
    Object v2 = java.io.File.createTempFile(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(((java.io.File)v2));
    Object v4 = ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v3).isSeekable();
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(((java.io.OutputStream)v1));
    Object v3 = ".wm";
    Object v4 = "00";
    Object v5 = java.io.File.createTempFile(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = "";
    Object v7 = ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v2).createArchiveEntry(((java.io.File)v5),((java.lang.String)v6));
    Object v8 = 0;
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v2).setLevel((((java.lang.Integer)v8).intValue()));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = ".wm";
    Object v1 = "00";
    Object v2 = java.io.File.createTempFile(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(((java.io.File)v2));
    Object v4 = 21;
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v3).setLevel((((java.lang.Integer)v4).intValue()));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(((java.io.OutputStream)v1));
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v2).finish();
    Object v3 = null;
    Object v4 = true;
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v2).setUseLanguageEncodingFlag((((java.lang.Boolean)v4).booleanValue()));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(((java.io.OutputStream)v1));
    Object v3 = 17;
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v2).setMethod((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(((java.io.OutputStream)v1));
    Object v3 = 17;
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v2).setLevel((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = 0;
    Object v1 = new java.io.ByteArrayOutputStream((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(((java.io.OutputStream)v1));
    Object v3 = true;
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v2).setFallbackToUTF8((((java.lang.Boolean)v3).booleanValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }
}
