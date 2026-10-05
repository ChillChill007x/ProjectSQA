package org.apache.commons.compress.archivers.zip;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = 0;
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v1).setMethod((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    Object v4 = true;
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v1).setUseLanguageEncodingFlag((((java.lang.Boolean)v4).booleanValue()));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = "";
    Object v3 = new java.io.File(((java.lang.String)v2));
    Object v4 = "UTF";
    Object v5 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(((java.io.File)v3),((java.lang.String)v4));
    Object v6 = java.io.InputStream.nullInputStream();
    Object v7 = java.io.OutputStream.nullOutputStream();
    Object v8 = ((java.io.InputStream)v6).transferTo(((java.io.OutputStream)v7));
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v1).addRawArchiveEntry(((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v5),((java.io.InputStream)v6));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = new byte[]{Byte.valueOf((byte)55),Byte.valueOf((byte)-24)};
    Object v3 = 0;
    Object v4 = 0;
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v1).write(((byte[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = "";
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v1).setEncoding(((java.lang.String)v2));
    Object v3 = null;
      org.junit.Assert.fail("Expected java.nio.charset.IllegalCharsetNameException");
    } catch (java.nio.charset.IllegalCharsetNameException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = 0;
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v1).setLevel((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry();
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v1).putArchiveEntry(((org.apache.commons.compress.archivers.ArchiveEntry)v2));
    Object v3 = null;
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v1).destroy();
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(((java.io.OutputStream)v0));
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v1).writeCentralDirectoryEnd();
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = "";
    Object v3 = new java.io.File(((java.lang.String)v2));
    Object v4 = "`";
    Object v5 = ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v1).createArchiveEntry(((java.io.File)v3),((java.lang.String)v4));
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v1).writeCentralDirectoryEnd();
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(((java.io.OutputStream)v0));
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v1).close();
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = "";
    Object v3 = new java.io.File(((java.lang.String)v2));
    Object v4 = "'s size exceeds the limit of 4GByte.";
    Object v5 = ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v1).createArchiveEntry(((java.io.File)v3),((java.lang.String)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = org.apache.commons.compress.archivers.zip.Zip64Mode.Never;
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v1).setUseZip64(((org.apache.commons.compress.archivers.zip.Zip64Mode)v2));
    Object v3 = null;
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v1).finish();
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(((java.io.OutputStream)v0));
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v1).destroy();
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry();
    Object v3 = ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v1).canWriteEntryData(((org.apache.commons.compress.archivers.ArchiveEntry)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(((java.io.OutputStream)v0));
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v1).writeZip64CentralDirectory();
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = 8;
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v1).setLevel((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(((java.io.OutputStream)v0));
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v1).flush();
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry();
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v1).putArchiveEntry(((org.apache.commons.compress.archivers.ArchiveEntry)v2));
    Object v3 = null;
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v1).writeCentralDirectoryEnd();
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry();
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v1).writeDataDescriptor(((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v1).isSeekable();
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = new byte[]{Byte.valueOf((byte)-6),Byte.valueOf((byte)-10),Byte.valueOf((byte)0)};
    Object v3 = -23;
    Object v4 = 4;
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v1).write(((byte[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry();
    Object v3 = java.io.InputStream.nullInputStream();
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v1).addRawArchiveEntry(((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v2),((java.io.InputStream)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry();
    Object v3 = new org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData();
    ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v2).addAsFirstExtraField(((org.apache.commons.compress.archivers.zip.ZipExtraField)v3));
    Object v4 = null;
    Object v5 = java.io.InputStream.nullInputStream();
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v1).addRawArchiveEntry(((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v2),((java.io.InputStream)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = true;
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v1).setUseLanguageEncodingFlag((((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry();
    Object v3 = 38;
    ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v2).setMethod((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v1).writeCentralFileHeader(((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v2));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(((java.io.OutputStream)v0));
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v1).finish();
    Object v2 = null;
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry();
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v1).writeDataDescriptor(((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(((java.io.OutputStream)v0));
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v1).closeArchiveEntry();
    Object v2 = null;
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = ((org.apache.commons.compress.archivers.ArchiveOutputStream)v1).getBytesWritten();
    org.junit.Assert.assertEquals((Object)(0L), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = "IN_BACK_REFERENCE";
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v1).setComment(((java.lang.String)v2));
    Object v3 = null;
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v1).flush();
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = "";
    Object v3 = new java.io.File(((java.lang.String)v2));
    Object v4 = "!";
    Object v5 = ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v1).createArchiveEntry(((java.io.File)v3),((java.lang.String)v4));
    Object v6 = java.io.OutputStream.nullOutputStream();
    Object v7 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(((java.io.OutputStream)v6));
    Object v8 = "";
    Object v9 = new java.io.File(((java.lang.String)v8));
    Object v10 = "'s size exceeds the limit of 4GByte.";
    Object v11 = ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v7).createArchiveEntry(((java.io.File)v9),((java.lang.String)v10));
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v1).writeDataDescriptor(((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(((java.io.OutputStream)v0));
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v1).finish();
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = true;
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v1).setUseLanguageEncodingFlag((((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    Object v4 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry();
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v1).writeDataDescriptor(((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(((java.io.OutputStream)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)-61)};
    ((java.io.OutputStream)v0).write(((byte[])v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(((java.io.OutputStream)v0));
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v1).destroy();
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(((java.io.OutputStream)v0));
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v1).closeArchiveEntry();
    Object v2 = null;
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = new byte[]{Byte.valueOf((byte)16),Byte.valueOf((byte)1)};
    Object v3 = -13;
    Object v4 = -3;
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v1).write(((byte[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v1).getEncoding();
    org.junit.Assert.assertEquals((Object)("UTF8"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = org.apache.commons.compress.archivers.zip.Zip64Mode.AsNeeded;
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v1).setUseZip64(((org.apache.commons.compress.archivers.zip.Zip64Mode)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry();
    Object v3 = java.io.InputStream.nullInputStream();
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v1).addRawArchiveEntry(((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v2),((java.io.InputStream)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v1).isSeekable();
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(((java.io.OutputStream)v0));
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v1).close();
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry();
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v1).writeCentralFileHeader(((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v2));
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = "";
    Object v3 = new java.io.File(((java.lang.String)v2));
    Object v4 = "r";
    Object v5 = ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v1).createArchiveEntry(((java.io.File)v3),((java.lang.String)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = true;
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v1).setUseLanguageEncodingFlag((((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = ((org.apache.commons.compress.archivers.ArchiveOutputStream)v1).getCount();
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry();
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v1).writeDataDescriptor(((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = org.apache.commons.compress.archivers.zip.Zip64Mode.Always;
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v1).setUseZip64(((org.apache.commons.compress.archivers.zip.Zip64Mode)v2));
    Object v3 = null;
    Object v4 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)-1),Byte.valueOf((byte)12)};
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v1).writeOut(((byte[])v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(((java.io.File)v1));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry();
    Object v3 = ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v1).canWriteEntryData(((org.apache.commons.compress.archivers.ArchiveEntry)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = 26;
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v1).setMethod((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)20)};
    Object v3 = 11;
    Object v4 = -2;
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v1).writeOut(((byte[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = -13;
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v1).setLevel((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = 1;
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v1).setLevel((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v1).finish();
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = "";
    Object v3 = new java.io.File(((java.lang.String)v2));
    Object v4 = " Cr~eate:[";
    Object v5 = ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v1).createArchiveEntry(((java.io.File)v3),((java.lang.String)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = new byte[]{Byte.valueOf((byte)60),Byte.valueOf((byte)-3),Byte.valueOf((byte)3)};
    Object v3 = -6;
    Object v4 = 0;
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v1).write(((byte[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = "";
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v1).setEncoding(((java.lang.String)v2));
    Object v3 = null;
      org.junit.Assert.fail("Expected java.nio.charset.IllegalCharsetNameException");
    } catch (java.nio.charset.IllegalCharsetNameException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(((java.io.OutputStream)v0));
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v1).writeZip64CentralDirectory();
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = "0";
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v1).setEncoding(((java.lang.String)v2));
    Object v3 = null;
    Object v4 = org.apache.commons.compress.archivers.zip.Zip64Mode.Never;
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v1).setUseZip64(((org.apache.commons.compress.archivers.zip.Zip64Mode)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(((java.io.OutputStream)v0));
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v1).flush();
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = new byte[]{Byte.valueOf((byte)50),Byte.valueOf((byte)-18),Byte.valueOf((byte)-24)};
    Object v3 = -23;
    Object v4 = 1;
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v1).writeOut(((byte[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(((java.io.OutputStream)v0));
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v1).finish();
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = "";
    Object v3 = new java.io.File(((java.lang.String)v2));
    Object v4 = "UTF";
    Object v5 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(((java.io.File)v3),((java.lang.String)v4));
    Object v6 = ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v1).canWriteEntryData(((org.apache.commons.compress.archivers.ArchiveEntry)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(((java.io.OutputStream)v0));
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v1).deflate();
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry();
    Object v3 = 1L;
    Object v4 = java.util.concurrent.TimeUnit.HOURS;
    Object v5 = java.nio.file.attribute.FileTime.from((((java.lang.Long)v3).longValue()),((java.util.concurrent.TimeUnit)v4));
    Object v6 = ((java.util.zip.ZipEntry)v2).setCreationTime(((java.nio.file.attribute.FileTime)v5));
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v1).writeDataDescriptor(((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v2));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = true;
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v1).setFallbackToUTF8((((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    Object v4 = ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v1).isSeekable();
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry();
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v1).writeLocalFileHeader(((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v2));
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = "";
    Object v3 = new java.io.File(((java.lang.String)v2));
    Object v4 = "";
    Object v5 = ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v1).createArchiveEntry(((java.io.File)v3),((java.lang.String)v4));
    Object v6 = ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v1).isSeekable();
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = "";
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v1).setComment(((java.lang.String)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)0),Byte.valueOf((byte)6)};
    Object v3 = 0;
    Object v4 = 0;
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v1).write(((byte[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = -13;
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v1).setMethod((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v1).close();
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = java.io.OutputStream.nullOutputStream();
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(((java.io.OutputStream)v2));
    Object v4 = "";
    Object v5 = new java.io.File(((java.lang.String)v4));
    Object v6 = " Cr~eate:[";
    Object v7 = ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v3).createArchiveEntry(((java.io.File)v5),((java.lang.String)v6));
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v1).putArchiveEntry(((org.apache.commons.compress.archivers.ArchiveEntry)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = 0;
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v1).setLevel((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = "Strea";
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v1).setEncoding(((java.lang.String)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = new byte[]{Byte.valueOf((byte)27)};
    Object v3 = 8;
    Object v4 = -6;
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v1).write(((byte[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = new byte[]{Byte.valueOf((byte)2),Byte.valueOf((byte)1)};
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v1).writeOut(((byte[])v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = ((org.apache.commons.compress.archivers.ArchiveOutputStream)v1).getBytesWritten();
    org.junit.Assert.assertEquals((Object)(0L), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = new byte[]{Byte.valueOf((byte)-1)};
    Object v3 = 54;
    Object v4 = 0;
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v1).write(((byte[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(((java.io.OutputStream)v0));
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v1).close();
    Object v2 = null;
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry();
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v1).writeDataDescriptor(((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = 2;
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v1).setLevel((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = new byte[]{};
    Object v3 = 16;
    Object v4 = 101075783;
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v1).write(((byte[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = org.apache.commons.compress.archivers.zip.Zip64Mode.AsNeeded;
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v1).setUseZip64(((org.apache.commons.compress.archivers.zip.Zip64Mode)v2));
    Object v3 = null;
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v1).writeCentralDirectoryEnd();
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = new byte[]{Byte.valueOf((byte)0)};
    Object v3 = -24;
    Object v4 = 2;
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v1).write(((byte[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(((java.io.OutputStream)v0));
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v1).close();
    Object v2 = null;
    Object v3 = ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v1).getEncoding();
    org.junit.Assert.assertEquals((Object)("UTF8"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = "";
    Object v3 = new java.io.File(((java.lang.String)v2));
    Object v4 = "UTF";
    Object v5 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(((java.io.File)v3),((java.lang.String)v4));
    Object v6 = java.io.InputStream.nullInputStream();
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v1).addRawArchiveEntry(((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v5),((java.io.InputStream)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(((java.io.OutputStream)v0));
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v1).writeCentralDirectoryEnd();
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = false;
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v1).setFallbackToUTF8((((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = "";
    Object v3 = new java.io.File(((java.lang.String)v2));
    Object v4 = "d";
    Object v5 = ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v1).createArchiveEntry(((java.io.File)v3),((java.lang.String)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = new org.apache.commons.compress.utils.SeekableInMemoryByteChannel(((byte[])v0));
    Object v2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(((java.nio.channels.SeekableByteChannel)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = new org.apache.commons.compress.utils.SeekableInMemoryByteChannel(((byte[])v0));
    Object v2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(((java.nio.channels.SeekableByteChannel)v1));
    Object v3 = 1;
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v2).setLevel((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = new org.apache.commons.compress.utils.SeekableInMemoryByteChannel(((byte[])v0));
    Object v2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(((java.nio.channels.SeekableByteChannel)v1));
    Object v3 = true;
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v2).setUseLanguageEncodingFlag((((java.lang.Boolean)v3).booleanValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry();
    Object v3 = java.io.InputStream.nullInputStream();
    Object v4 = ((java.io.InputStream)v3).read();
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v1).addRawArchiveEntry(((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v2),((java.io.InputStream)v3));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry();
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v1).putArchiveEntry(((org.apache.commons.compress.archivers.ArchiveEntry)v2));
    Object v3 = null;
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v1).close();
    Object v4 = null;
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = org.apache.commons.compress.archivers.zip.Zip64Mode.AsNeeded;
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v1).setUseZip64(((org.apache.commons.compress.archivers.zip.Zip64Mode)v2));
    Object v3 = null;
    Object v4 = ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v1).isSeekable();
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = "Stream has already been fiished";
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v1).setEncoding(((java.lang.String)v2));
    Object v3 = null;
      org.junit.Assert.fail("Expected java.nio.charset.IllegalCharsetNameException");
    } catch (java.nio.charset.IllegalCharsetNameException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = -61;
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v1).setLevel((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = true;
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v1).setUseLanguageEncodingFlag((((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v1).destroy();
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry();
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v1).putArchiveEntry(((org.apache.commons.compress.archivers.ArchiveEntry)v2));
    Object v3 = null;
    Object v4 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry();
    Object v5 = ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v1).canWriteEntryData(((org.apache.commons.compress.archivers.ArchiveEntry)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = -10;
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v1).setMethod((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    Object v4 = "";
    Object v5 = new java.io.File(((java.lang.String)v4));
    Object v6 = "jar";
    Object v7 = ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v1).createArchiveEntry(((java.io.File)v5),((java.lang.String)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = java.io.OutputStream.nullOutputStream();
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(((java.io.OutputStream)v0));
    Object v2 = 2;
    ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v1).setMethod((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    Object v4 = "";
    Object v5 = new java.io.File(((java.lang.String)v4));
    Object v6 = "UTF8";
    Object v7 = ((org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)v1).createArchiveEntry(((java.io.File)v5),((java.lang.String)v6));
    org.junit.Assert.assertNotNull(v7);
  }
}
