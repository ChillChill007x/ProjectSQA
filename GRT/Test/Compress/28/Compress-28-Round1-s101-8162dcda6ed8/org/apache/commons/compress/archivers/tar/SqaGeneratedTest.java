package org.apache.commons.compress.archivers.tar;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)39)};
    Object v1 = -7;
    Object v2 = org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = ((org.apache.commons.compress.archivers.ArchiveInputStream)v1).read();
    org.junit.Assert.assertEquals((Object)(-1), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = -11;
    Object v3 = 0;
    Object v4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = java.io.InputStream.nullInputStream();
    Object v6 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v5));
    Object v7 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v4).parsePaxHeaders(((java.io.InputStream)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = -11;
    Object v3 = 0;
    Object v4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = null;
    Object v6 = "unexpected end of stream";
    Object v7 = new java.io.File(((java.io.File)v5),((java.lang.String)v6));
    Object v8 = " ";
    Object v9 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(((java.io.File)v7),((java.lang.String)v8));
    Object v10 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v4).canReadEntryData(((org.apache.commons.compress.archivers.ArchiveEntry)v9));
    org.junit.Assert.assertEquals((Object)(true), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = ((java.io.InputStream)v1).readAllBytes();
    Object v3 = new byte[]{};
    Object v4 = ((java.io.InputStream)v1).read(((byte[])v3));
    org.junit.Assert.assertEquals((Object)(-1), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = -11;
    Object v3 = 0;
    Object v4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = java.io.OutputStream.nullOutputStream();
    Object v6 = ((java.io.InputStream)v4).transferTo(((java.io.OutputStream)v5));
    org.junit.Assert.assertEquals((Object)(0L), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = -11;
    Object v3 = 0;
    Object v4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v4).available();
    org.junit.Assert.assertEquals((Object)(0), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = -11;
    Object v3 = 0;
    Object v4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = new byte[]{};
    Object v6 = 0;
    Object v7 = -57;
    Object v8 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v4).read(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    org.junit.Assert.assertEquals((Object)(-1), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = -11;
    Object v3 = 0;
    Object v4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = null;
    Object v6 = "unexpected end of stream";
    Object v7 = new java.io.File(((java.io.File)v5),((java.lang.String)v6));
    Object v8 = " ";
    Object v9 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(((java.io.File)v7),((java.lang.String)v8));
    ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v4).setCurrentEntry(((org.apache.commons.compress.archivers.tar.TarArchiveEntry)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)2)};
    Object v1 = 0;
    Object v2 = org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = -11;
    Object v3 = 0;
    Object v4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = 0L;
    Object v6 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v4).skip((((java.lang.Long)v5).longValue()));
    Object v7 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v4).isAtEOF();
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = -11;
    Object v3 = 0;
    Object v4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = null;
    Object v6 = "unexpected end of stream";
    Object v7 = new java.io.File(((java.io.File)v5),((java.lang.String)v6));
    Object v8 = " ";
    Object v9 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(((java.io.File)v7),((java.lang.String)v8));
    Object v10 = -11;
    ((org.apache.commons.compress.archivers.tar.TarArchiveEntry)v9).setMode((((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v4).setCurrentEntry(((org.apache.commons.compress.archivers.tar.TarArchiveEntry)v9));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = -11;
    Object v3 = 0;
    Object v4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v4).getLongNameData();
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = -11;
    Object v3 = 0;
    Object v4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v4).getNextTarEntry();
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = -11;
    Object v3 = 0;
    Object v4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v4).getNextTarEntry();
    Object v6 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v4).getNextTarEntry();
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = java.io.OutputStream.nullOutputStream();
    Object v2 = ((java.io.InputStream)v0).transferTo(((java.io.OutputStream)v1));
    org.junit.Assert.assertEquals((Object)(0L), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = -11;
    Object v3 = 0;
    Object v4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = new byte[]{};
    Object v6 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v4).isEOFRecord(((byte[])v5));
    org.junit.Assert.assertEquals((Object)(true), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = -11;
    Object v3 = 0;
    Object v4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v4).getNextTarEntry();
    Object v6 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v4).readRecord();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = -11;
    Object v3 = 0;
    Object v4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = java.io.OutputStream.nullOutputStream();
    Object v6 = ((java.io.InputStream)v4).transferTo(((java.io.OutputStream)v5));
    ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v4).reset();
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = -11;
    Object v3 = 0;
    Object v4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v4).readRecord();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)0)};
    Object v1 = 9;
    Object v2 = org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = -11;
    Object v3 = 0;
    Object v4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = new byte[]{Byte.valueOf((byte)12)};
    Object v6 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v4).isEOFRecord(((byte[])v5));
    org.junit.Assert.assertEquals((Object)(true), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = -11;
    Object v3 = 0;
    Object v4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = 1L;
    Object v6 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v4).skip((((java.lang.Long)v5).longValue()));
    Object v7 = java.io.InputStream.nullInputStream();
    Object v8 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v7));
    Object v9 = -11;
    Object v10 = 0;
    Object v11 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v4).parsePaxHeaders(((java.io.InputStream)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -13;
    Object v2 = -15;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = -11;
    Object v3 = 0;
    Object v4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = null;
    Object v6 = "unexpected end of stream";
    Object v7 = new java.io.File(((java.io.File)v5),((java.lang.String)v6));
    Object v8 = " ";
    Object v9 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(((java.io.File)v7),((java.lang.String)v8));
    Object v10 = ((org.apache.commons.compress.archivers.ArchiveEntry)v9).isDirectory();
    Object v11 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v4).canReadEntryData(((org.apache.commons.compress.archivers.ArchiveEntry)v9));
    org.junit.Assert.assertEquals((Object)(true), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new byte[]{};
    Object v2 = -35;
    Object v3 = 13;
    Object v4 = ((java.io.InputStream)v0).readNBytes(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = -11;
    Object v3 = 0;
    Object v4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = -4;
    Object v6 = ((java.io.InputStream)v4).readNBytes((((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -13;
    Object v2 = -15;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = -33;
    Object v5 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v3),(((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -13;
    Object v2 = -15;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = 16;
    Object v5 = ((java.io.InputStream)v3).readNBytes((((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = -11;
    Object v3 = 0;
    Object v4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = null;
    Object v6 = "unexpected end of stream";
    Object v7 = new java.io.File(((java.io.File)v5),((java.lang.String)v6));
    Object v8 = " ";
    Object v9 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(((java.io.File)v7),((java.lang.String)v8));
    Object v10 = ((org.apache.commons.compress.archivers.ArchiveEntry)v9).getSize();
    Object v11 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v4).canReadEntryData(((org.apache.commons.compress.archivers.ArchiveEntry)v9));
    org.junit.Assert.assertEquals((Object)(true), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = " ";
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v1),((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.nio.charset.IllegalCharsetNameException");
    } catch (java.nio.charset.IllegalCharsetNameException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = -11;
    Object v3 = 0;
    Object v4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v4).reset();
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -13;
    Object v2 = -15;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = -33;
    Object v5 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.apache.commons.compress.archivers.ArchiveInputStream)v5).read();
    org.junit.Assert.assertEquals((Object)(-1), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = -11;
    Object v3 = 0;
    Object v4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = "Ma";
    Object v6 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v4),((java.lang.String)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -13;
    Object v2 = -15;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = 93;
    Object v5 = ((java.io.InputStream)v3).readNBytes((((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = -11;
    Object v3 = 0;
    Object v4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -13;
    Object v2 = -15;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v3).isAtEOF();
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = java.io.OutputStream.nullOutputStream();
    Object v2 = ((java.io.InputStream)v0).transferTo(((java.io.OutputStream)v1));
    Object v3 = new byte[]{Byte.valueOf((byte)-14),Byte.valueOf((byte)1),Byte.valueOf((byte)0)};
    Object v4 = 1282693747;
    Object v5 = 0;
    Object v6 = ((java.io.InputStream)v0).readNBytes(((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -13;
    Object v2 = -15;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v3).readRecord();
      org.junit.Assert.fail("Expected java.lang.NegativeArraySizeException");
    } catch (java.lang.NegativeArraySizeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -13;
    Object v2 = -15;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v3).getLongNameData();
      org.junit.Assert.fail("Expected java.lang.NegativeArraySizeException");
    } catch (java.lang.NegativeArraySizeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = -11;
    Object v3 = 0;
    Object v4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    ((java.io.InputStream)v4).reset();
    Object v5 = null;
    Object v6 = 72;
    ((java.io.InputStream)v4).mark((((java.lang.Integer)v6).intValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = java.io.OutputStream.nullOutputStream();
    Object v3 = ((java.io.InputStream)v1).transferTo(((java.io.OutputStream)v2));
    org.junit.Assert.assertEquals((Object)(0L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = -11;
    Object v3 = 0;
    Object v4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v4));
    Object v6 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v5).getNextTarEntry();
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = -11;
    Object v3 = 0;
    Object v4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v4).getNextEntry();
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = -11;
    Object v3 = 0;
    Object v4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = new byte[]{Byte.valueOf((byte)-2)};
    Object v6 = 14;
    Object v7 = -25;
    Object v8 = ((java.io.InputStream)v4).readNBytes(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -13;
    Object v2 = -15;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.compress.archivers.ArchiveInputStream)v3).getCount();
    org.junit.Assert.assertEquals((Object)(0), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -13;
    Object v2 = -15;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v3).getNextTarEntry();
      org.junit.Assert.fail("Expected java.lang.NegativeArraySizeException");
    } catch (java.lang.NegativeArraySizeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -13;
    Object v2 = -15;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = -33;
    Object v5 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = new byte[]{};
    Object v7 = ((java.io.InputStream)v5).read(((byte[])v6));
    org.junit.Assert.assertEquals((Object)(-1), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -13;
    Object v2 = -15;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = -33;
    Object v5 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = -9;
    Object v7 = ((java.io.InputStream)v5).readNBytes((((java.lang.Integer)v6).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -13;
    Object v2 = -15;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = -33;
    Object v5 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.apache.commons.compress.archivers.ArchiveInputStream)v5).getNextEntry();
    Object v7 = ((org.apache.commons.compress.archivers.ArchiveInputStream)v5).getBytesRead();
    org.junit.Assert.assertEquals((Object)(0L), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -13;
    Object v2 = -15;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = java.io.OutputStream.nullOutputStream();
    Object v5 = ((java.io.InputStream)v3).transferTo(((java.io.OutputStream)v4));
    org.junit.Assert.assertEquals((Object)(0L), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = -11;
    Object v3 = 0;
    Object v4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v4));
    Object v6 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v5).getCurrentEntry();
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -13;
    Object v2 = -15;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = null;
    Object v5 = "unexpected end of stream";
    Object v6 = new java.io.File(((java.io.File)v4),((java.lang.String)v5));
    Object v7 = " ";
    Object v8 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(((java.io.File)v6),((java.lang.String)v7));
    Object v9 = ((org.apache.commons.compress.archivers.ArchiveEntry)v8).getSize();
    Object v10 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v3).canReadEntryData(((org.apache.commons.compress.archivers.ArchiveEntry)v8));
    org.junit.Assert.assertEquals((Object)(true), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -13;
    Object v2 = -15;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)-11)};
    Object v5 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v3).isEOFRecord(((byte[])v4));
    org.junit.Assert.assertEquals((Object)(true), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -13;
    Object v2 = -15;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = -33;
    Object v5 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.apache.commons.compress.archivers.ArchiveInputStream)v5).read();
    Object v7 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v5).getNextEntry();
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -13;
    Object v2 = -15;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v3).getCurrentEntry();
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -13;
    Object v2 = -15;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = -33;
    Object v5 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = new byte[]{Byte.valueOf((byte)63),Byte.valueOf((byte)32),Byte.valueOf((byte)14)};
    Object v7 = ((java.io.InputStream)v5).read(((byte[])v6));
    Object v8 = new byte[]{Byte.valueOf((byte)29),Byte.valueOf((byte)3),Byte.valueOf((byte)-22)};
    Object v9 = -23;
    Object v10 = 39;
    Object v11 = ((java.io.InputStream)v5).readNBytes(((byte[])v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = -11;
    Object v3 = 0;
    Object v4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = ((org.apache.commons.compress.archivers.ArchiveInputStream)v4).getCount();
    org.junit.Assert.assertEquals((Object)(0), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = -11;
    Object v3 = 0;
    Object v4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = java.io.InputStream.nullInputStream();
    Object v6 = -13;
    Object v7 = -15;
    Object v8 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v4).parsePaxHeaders(((java.io.InputStream)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = 2;
    Object v3 = "";
    Object v4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v1),(((java.lang.Integer)v2).intValue()),((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.nio.charset.IllegalCharsetNameException");
    } catch (java.nio.charset.IllegalCharsetNameException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -13;
    Object v2 = -15;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = new byte[]{Byte.valueOf((byte)1)};
    Object v5 = 0;
    Object v6 = 1;
    Object v7 = ((java.io.InputStream)v3).readNBytes(((byte[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    org.junit.Assert.assertEquals((Object)(0), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -13;
    Object v2 = -15;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = -33;
    Object v5 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v3),(((java.lang.Integer)v4).intValue()));
    ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v5).reset();
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = -11;
    Object v3 = 0;
    Object v4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = 1;
    Object v6 = ((java.io.InputStream)v4).readNBytes((((java.lang.Integer)v5).intValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -13;
    Object v2 = -15;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = -33;
    Object v5 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = 4L;
    Object v7 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v5).skip((((java.lang.Long)v6).longValue()));
    Object v8 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v5).getLongNameData();
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -13;
    Object v2 = -15;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = -8;
    Object v5 = 24;
    Object v6 = "g'";
    Object v7 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.nio.charset.IllegalCharsetNameException");
    } catch (java.nio.charset.IllegalCharsetNameException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = 1;
    Object v3 = ((java.io.InputStream)v1).readNBytes((((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -13;
    Object v2 = -15;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = new byte[]{Byte.valueOf((byte)12),Byte.valueOf((byte)0)};
    Object v5 = 1;
    Object v6 = 23;
    Object v7 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v3).read(((byte[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    org.junit.Assert.assertEquals((Object)(-1), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = 1;
    Object v2 = org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v1));
    Object v3 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)27)};
    Object v4 = 0;
    Object v5 = 0;
    Object v6 = ((java.io.InputStream)v2).readNBytes(((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = new byte[]{};
    Object v8 = 296;
    Object v9 = -6;
    Object v10 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v2).read(((byte[])v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    org.junit.Assert.assertEquals((Object)(-1), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -13;
    Object v2 = -15;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = -33;
    Object v5 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = new byte[]{Byte.valueOf((byte)0)};
    Object v7 = 0;
    Object v8 = 0;
    Object v9 = ((java.io.InputStream)v5).readNBytes(((byte[])v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    org.junit.Assert.assertEquals((Object)(0), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = -11;
    Object v3 = 0;
    Object v4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = java.io.OutputStream.nullOutputStream();
    Object v6 = new byte[]{Byte.valueOf((byte)5),Byte.valueOf((byte)1)};
    ((java.io.OutputStream)v5).write(((byte[])v6));
    Object v7 = null;
    Object v8 = ((java.io.InputStream)v4).transferTo(((java.io.OutputStream)v5));
    org.junit.Assert.assertEquals((Object)(0L), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = -11;
    Object v3 = 0;
    Object v4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = java.io.InputStream.nullInputStream();
    Object v6 = -13;
    Object v7 = -15;
    Object v8 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    ((java.io.InputStream)v8).reset();
    Object v9 = null;
    Object v10 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v4).parsePaxHeaders(((java.io.InputStream)v8));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = -11;
    Object v3 = 0;
    Object v4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = 0;
    Object v6 = ((java.io.InputStream)v4).readNBytes((((java.lang.Integer)v5).intValue()));
    Object v7 = -11;
    Object v8 = 14;
    Object v9 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v4),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -13;
    Object v2 = -15;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = -33;
    Object v5 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = 1;
    Object v7 = -29;
    Object v8 = "/";
    Object v9 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),((java.lang.String)v8));
      org.junit.Assert.fail("Expected java.nio.charset.IllegalCharsetNameException");
    } catch (java.nio.charset.IllegalCharsetNameException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -13;
    Object v2 = -15;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = 0;
    Object v5 = ((java.io.InputStream)v3).readNBytes((((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -13;
    Object v2 = -15;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = null;
    Object v5 = "unexpected end of stream";
    Object v6 = new java.io.File(((java.io.File)v4),((java.lang.String)v5));
    Object v7 = " ";
    Object v8 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(((java.io.File)v6),((java.lang.String)v7));
    Object v9 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v3).canReadEntryData(((org.apache.commons.compress.archivers.ArchiveEntry)v8));
    org.junit.Assert.assertEquals((Object)(true), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -13;
    Object v2 = -15;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = 0;
    Object v5 = 0;
    Object v6 = "No current entry t2o close";
    Object v7 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.nio.charset.IllegalCharsetNameException");
    } catch (java.nio.charset.IllegalCharsetNameException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -13;
    Object v2 = -15;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = -33;
    Object v5 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = 1;
    Object v7 = ((java.io.InputStream)v5).readNBytes((((java.lang.Integer)v6).intValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -13;
    Object v2 = -15;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = -78L;
    Object v5 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v3).skip((((java.lang.Long)v4).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -13;
    Object v2 = -15;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = -33;
    Object v5 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = true;
    ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v5).setAtEOF((((java.lang.Boolean)v6).booleanValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = -11;
    Object v3 = 0;
    Object v4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = 0;
    Object v6 = ((java.io.InputStream)v4).readNBytes((((java.lang.Integer)v5).intValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -13;
    Object v2 = -15;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = -33;
    Object v5 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = java.io.OutputStream.nullOutputStream();
    Object v7 = ((java.io.InputStream)v5).transferTo(((java.io.OutputStream)v6));
    org.junit.Assert.assertEquals((Object)(0L), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = -11;
    Object v3 = 0;
    Object v4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = 0L;
    Object v6 = ((java.io.InputStream)v4).skip((((java.lang.Long)v5).longValue()));
    Object v7 = new byte[]{Byte.valueOf((byte)34),Byte.valueOf((byte)20),Byte.valueOf((byte)0)};
    Object v8 = 2;
    Object v9 = 0;
    Object v10 = ((java.io.InputStream)v4).readNBytes(((byte[])v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    org.junit.Assert.assertEquals((Object)(0), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = -11;
    Object v3 = 0;
    Object v4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v4).getCurrentEntry();
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v1));
    Object v3 = java.io.OutputStream.nullOutputStream();
    Object v4 = ((java.io.InputStream)v2).transferTo(((java.io.OutputStream)v3));
    org.junit.Assert.assertEquals((Object)(0L), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v1));
    Object v3 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v2).getLongNameData();
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -13;
    Object v2 = -15;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = -33;
    Object v5 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = new byte[]{Byte.valueOf((byte)0)};
    Object v7 = ((java.io.InputStream)v5).read(((byte[])v6));
    Object v8 = null;
    Object v9 = "unexpected end of stream";
    Object v10 = new java.io.File(((java.io.File)v8),((java.lang.String)v9));
    Object v11 = " ";
    Object v12 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(((java.io.File)v10),((java.lang.String)v11));
    Object v13 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v5).canReadEntryData(((org.apache.commons.compress.archivers.ArchiveEntry)v12));
    org.junit.Assert.assertEquals((Object)(true), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = -11;
    Object v3 = 0;
    Object v4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = new byte[]{Byte.valueOf((byte)0)};
    Object v6 = 0;
    Object v7 = 1;
    Object v8 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v4).read(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    org.junit.Assert.assertEquals((Object)(-1), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)10),Byte.valueOf((byte)88),Byte.valueOf((byte)1)};
    Object v1 = 0;
    Object v2 = org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -13;
    Object v2 = -15;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = java.io.InputStream.nullInputStream();
    Object v5 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v4));
    Object v6 = -11;
    Object v7 = 0;
    Object v8 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = "Ma";
    Object v10 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v8),((java.lang.String)v9));
    Object v11 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v3).parsePaxHeaders(((java.io.InputStream)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -13;
    Object v2 = -15;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.compress.archivers.ArchiveInputStream)v3).read();
    Object v5 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)-8),Byte.valueOf((byte)1)};
    Object v6 = 1;
    Object v7 = -8;
    Object v8 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v3).read(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    org.junit.Assert.assertEquals((Object)(-1), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = -11;
    Object v3 = 0;
    Object v4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = 31L;
    Object v6 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v4).skip((((java.lang.Long)v5).longValue()));
    Object v7 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v4).available();
    org.junit.Assert.assertEquals((Object)(0), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -13;
    Object v2 = -15;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = -33;
    Object v5 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = null;
    Object v7 = "unexpected end of stream";
    Object v8 = new java.io.File(((java.io.File)v6),((java.lang.String)v7));
    Object v9 = " ";
    Object v10 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(((java.io.File)v8),((java.lang.String)v9));
    Object v11 = ((org.apache.commons.compress.archivers.ArchiveEntry)v10).getSize();
    Object v12 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v5).canReadEntryData(((org.apache.commons.compress.archivers.ArchiveEntry)v10));
    org.junit.Assert.assertEquals((Object)(true), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -13;
    Object v2 = -15;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = new byte[]{};
    Object v5 = 43;
    Object v6 = -25;
    Object v7 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v3).read(((byte[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    org.junit.Assert.assertEquals((Object)(-1), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -13;
    Object v2 = -15;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = -33;
    Object v5 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v3),(((java.lang.Integer)v4).intValue()));
    ((java.io.InputStream)v5).reset();
    Object v6 = null;
    Object v7 = 0;
    Object v8 = 1;
    Object v9 = "S-ASCII";
    Object v10 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v5),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()),((java.lang.String)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -13;
    Object v2 = -15;
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = -33;
    Object v5 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = -57L;
    Object v7 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v5).skip((((java.lang.Long)v6).longValue()));
    Object v8 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v5).available();
    org.junit.Assert.assertEquals((Object)(0), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v1));
    ((java.io.InputStream)v2).reset();
    Object v3 = null;
    Object v4 = 1;
    Object v5 = ((java.io.InputStream)v2).readNBytes((((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v0));
    Object v2 = -11;
    Object v3 = 0;
    Object v4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)0),Byte.valueOf((byte)-15)};
    Object v6 = 14;
    Object v7 = 30;
    Object v8 = ((java.io.InputStream)v4).readNBytes(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }
}
