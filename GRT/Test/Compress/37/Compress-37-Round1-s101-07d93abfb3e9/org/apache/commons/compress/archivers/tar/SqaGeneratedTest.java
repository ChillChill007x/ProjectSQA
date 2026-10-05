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
    Object v1 = ((java.io.InputStream)v0).readAllBytes();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = java.io.OutputStream.nullOutputStream();
    Object v2 = ((java.io.InputStream)v0).transferTo(((java.io.OutputStream)v1));
    org.junit.Assert.assertEquals((Object)(0L), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = "t";
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),((java.lang.String)v1));
    Object v3 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v2).getNextTarEntry();
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = "t";
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),((java.lang.String)v1));
    Object v3 = 26L;
    Object v4 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v2).skip((((java.lang.Long)v3).longValue()));
    Object v5 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v2).available();
    org.junit.Assert.assertEquals((Object)(0), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = "t";
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),((java.lang.String)v1));
    Object v3 = new byte[]{Byte.valueOf((byte)28),Byte.valueOf((byte)0)};
    Object v4 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v2).isEOFRecord(((byte[])v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = "t";
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),((java.lang.String)v1));
    Object v3 = ".wqmz";
    Object v4 = new java.io.File(((java.lang.String)v3));
    Object v5 = ";";
    Object v6 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(((java.io.File)v4),((java.lang.String)v5));
    Object v7 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v2).canReadEntryData(((org.apache.commons.compress.archivers.ArchiveEntry)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = "t";
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),((java.lang.String)v1));
    Object v3 = new byte[]{};
    Object v4 = 0;
    Object v5 = 51;
    Object v6 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v2).read(((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    org.junit.Assert.assertEquals((Object)(-1), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = "t";
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),((java.lang.String)v1));
    Object v3 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v2).isAtEOF();
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new byte[]{Byte.valueOf((byte)-105)};
    Object v2 = ((java.io.InputStream)v0).read(((byte[])v1));
    org.junit.Assert.assertEquals((Object)(-1), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 24;
    Object v2 = ((java.io.InputStream)v0).readNBytes((((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -3;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -3;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((java.io.InputStream)v2).readAllBytes();
    Object v4 = new byte[]{Byte.valueOf((byte)6)};
    Object v5 = 12;
    Object v6 = 0;
    Object v7 = ((java.io.InputStream)v2).readNBytes(((byte[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -3;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.apache.commons.compress.archivers.ArchiveInputStream)v2).read();
    Object v4 = java.io.InputStream.nullInputStream();
    Object v5 = -3;
    Object v6 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v2).parsePaxHeaders(((java.io.InputStream)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -3;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.apache.commons.compress.archivers.ArchiveInputStream)v2).getCount();
    org.junit.Assert.assertEquals((Object)(0), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -3;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v2).getLongNameData();
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -3;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.apache.commons.compress.archivers.ArchiveInputStream)v2).read();
    Object v4 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v2).readRecord();
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -3;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = ".wqmz";
    Object v4 = new java.io.File(((java.lang.String)v3));
    Object v5 = ";";
    Object v6 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(((java.io.File)v4),((java.lang.String)v5));
    Object v7 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v2).canReadEntryData(((org.apache.commons.compress.archivers.ArchiveEntry)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -3;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v2).available();
    org.junit.Assert.assertEquals((Object)(0), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = ((java.io.InputStream)v0).readAllBytes();
    Object v2 = -45;
    Object v3 = ((java.io.InputStream)v0).readNBytes((((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -3;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v2).getNextTarEntry();
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -3;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = 30L;
    Object v4 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v2).skip((((java.lang.Long)v3).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -3;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    ((java.io.InputStream)v2).reset();
    Object v3 = null;
    Object v4 = java.io.OutputStream.nullOutputStream();
    Object v5 = ((java.io.InputStream)v2).transferTo(((java.io.OutputStream)v4));
    org.junit.Assert.assertEquals((Object)(0L), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -3;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = java.io.InputStream.nullInputStream();
    Object v4 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v2).parsePaxHeaders(((java.io.InputStream)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -3;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v2).getNextTarEntry();
    Object v4 = new byte[]{Byte.valueOf((byte)-53),Byte.valueOf((byte)0)};
    Object v5 = 2;
    Object v6 = 5;
    Object v7 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v2).read(((byte[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    org.junit.Assert.assertEquals((Object)(-1), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -3;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.apache.commons.compress.archivers.ArchiveInputStream)v2).read();
    org.junit.Assert.assertEquals((Object)(-1), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -3;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new byte[]{Byte.valueOf((byte)-15),Byte.valueOf((byte)0)};
    Object v4 = 26;
    Object v5 = 8;
    Object v6 = ((java.io.InputStream)v2).readNBytes(((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -3;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = ".wqmz";
    Object v4 = new java.io.File(((java.lang.String)v3));
    Object v5 = "& securityEnvelopeFilePosition=";
    Object v6 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(((java.io.File)v4),((java.lang.String)v5));
    Object v7 = -12;
    ((org.apache.commons.compress.archivers.tar.TarArchiveEntry)v6).setUserId((((java.lang.Integer)v7).intValue()));
    Object v8 = null;
    ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v2).setCurrentEntry(((org.apache.commons.compress.archivers.tar.TarArchiveEntry)v6));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -3;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = -43L;
    Object v4 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v2).skip((((java.lang.Long)v3).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)54)};
    Object v1 = 9;
    Object v2 = org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -3;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new byte[]{Byte.valueOf((byte)5),Byte.valueOf((byte)68),Byte.valueOf((byte)1)};
    Object v4 = -22;
    Object v5 = 0;
    Object v6 = ((java.io.InputStream)v2).readNBytes(((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new byte[]{};
    Object v2 = 12;
    Object v3 = 4;
    Object v4 = ((java.io.InputStream)v0).readNBytes(((byte[])v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -3;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = ".wqmz";
    Object v4 = new java.io.File(((java.lang.String)v3));
    Object v5 = "& securityEnvelopeFilePosition=";
    Object v6 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(((java.io.File)v4),((java.lang.String)v5));
    Object v7 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v2).canReadEntryData(((org.apache.commons.compress.archivers.ArchiveEntry)v6));
    org.junit.Assert.assertEquals((Object)(true), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -3;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = true;
    ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v2).setAtEOF((((java.lang.Boolean)v3).booleanValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -3;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v2).readRecord();
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -3;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)-8)};
    Object v4 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v2).isEOFRecord(((byte[])v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -3;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = -2;
    Object v4 = ((java.io.InputStream)v2).readNBytes((((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -3;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v2).reset();
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -3;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = 0;
    Object v4 = ((java.io.InputStream)v2).readNBytes((((java.lang.Integer)v3).intValue()));
    Object v5 = ((org.apache.commons.compress.archivers.ArchiveInputStream)v2).getBytesRead();
    org.junit.Assert.assertEquals((Object)(0L), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -3;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((java.io.InputStream)v2).readAllBytes();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = java.io.OutputStream.nullOutputStream();
    Object v2 = ((java.io.InputStream)v0).transferTo(((java.io.OutputStream)v1));
    Object v3 = 4;
    Object v4 = ", securDityEnvelopeFilePosition=";
    Object v5 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v3).intValue()),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.nio.charset.IllegalCharsetNameException");
    } catch (java.nio.charset.IllegalCharsetNameException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -3;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((java.io.InputStream)v2).read();
    Object v4 = ">";
    Object v5 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v2),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.nio.charset.IllegalCharsetNameException");
    } catch (java.nio.charset.IllegalCharsetNameException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -3;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -3;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new byte[]{Byte.valueOf((byte)9),Byte.valueOf((byte)1)};
    Object v4 = 15;
    Object v5 = -3;
    Object v6 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v2).read(((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    org.junit.Assert.assertEquals((Object)(-1), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -3;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v2));
    Object v4 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v3).getLongNameData();
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -3;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = java.io.InputStream.nullInputStream();
    Object v4 = -3;
    Object v5 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v3),(((java.lang.Integer)v4).intValue()));
    ((java.io.InputStream)v5).reset();
    Object v6 = null;
    Object v7 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v2).parsePaxHeaders(((java.io.InputStream)v5));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)11),Byte.valueOf((byte)-42),Byte.valueOf((byte)33)};
    Object v1 = 1;
    Object v2 = org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -3;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v2));
    Object v4 = ((org.apache.commons.compress.archivers.ArchiveInputStream)v3).read();
    org.junit.Assert.assertEquals((Object)(-1), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -3;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v2).getRecordSize();
    org.junit.Assert.assertEquals((Object)(512), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -3;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = ".wqmz";
    Object v4 = new java.io.File(((java.lang.String)v3));
    Object v5 = "& securityEnvelopeFilePosition=";
    Object v6 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(((java.io.File)v4),((java.lang.String)v5));
    ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v2).setCurrentEntry(((org.apache.commons.compress.archivers.tar.TarArchiveEntry)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -3;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v2));
    Object v4 = ".wqmz";
    Object v5 = new java.io.File(((java.lang.String)v4));
    Object v6 = "& securityEnvelopeFilePosition=";
    Object v7 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(((java.io.File)v5),((java.lang.String)v6));
    Object v8 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v3).canReadEntryData(((org.apache.commons.compress.archivers.ArchiveEntry)v7));
    org.junit.Assert.assertEquals((Object)(true), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -3;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = 0;
    ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v2).mark((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -3;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v2));
    Object v4 = new byte[]{};
    Object v5 = 2;
    Object v6 = -31;
    Object v7 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v3).read(((byte[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    org.junit.Assert.assertEquals((Object)(-1), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -3;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)5),Byte.valueOf((byte)8)};
    Object v4 = 49;
    Object v5 = 0;
    Object v6 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v2).read(((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    org.junit.Assert.assertEquals((Object)(-1), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -3;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = 26;
    ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v2).mark((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -3;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v2).markSupported();
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -3;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v2));
    Object v4 = new byte[]{Byte.valueOf((byte)9),Byte.valueOf((byte)22)};
    Object v5 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v3).isEOFRecord(((byte[])v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -3;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = -33;
    Object v4 = ((java.io.InputStream)v2).readNBytes((((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -3;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new byte[]{};
    Object v4 = 10;
    Object v5 = 1;
    Object v6 = ((java.io.InputStream)v2).readNBytes(((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)1)};
    Object v1 = -24;
    Object v2 = org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -3;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = java.io.InputStream.nullInputStream();
    Object v4 = -3;
    Object v5 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v2).parsePaxHeaders(((java.io.InputStream)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -3;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = java.io.InputStream.nullInputStream();
    Object v4 = -3;
    Object v5 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v5));
    Object v7 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v2).parsePaxHeaders(((java.io.InputStream)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -3;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v2));
    Object v4 = new byte[]{Byte.valueOf((byte)13)};
    Object v5 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v3).isEOFRecord(((byte[])v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = ((java.io.InputStream)v0).read();
    Object v2 = 47;
    Object v3 = ((java.io.InputStream)v0).readNBytes((((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -3;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new byte[]{};
    Object v4 = 0;
    Object v5 = 0;
    Object v6 = ((java.io.InputStream)v2).readNBytes(((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = java.io.InputStream.nullInputStream();
    Object v8 = java.io.OutputStream.nullOutputStream();
    Object v9 = ((java.io.InputStream)v7).transferTo(((java.io.OutputStream)v8));
    Object v10 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v2).parsePaxHeaders(((java.io.InputStream)v7));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -3;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = java.io.OutputStream.nullOutputStream();
    Object v4 = ((java.io.InputStream)v2).transferTo(((java.io.OutputStream)v3));
    org.junit.Assert.assertEquals((Object)(0L), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -3;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v2));
    Object v4 = 0L;
    Object v5 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v3).skip((((java.lang.Long)v4).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 0;
    Object v2 = ((java.io.InputStream)v0).readNBytes((((java.lang.Integer)v1).intValue()));
    Object v3 = -36;
    Object v4 = "UTF-16BE";
    Object v5 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v3).intValue()),((java.lang.String)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -3;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v2));
    Object v4 = "/";
    Object v5 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v3),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.nio.charset.IllegalCharsetNameException");
    } catch (java.nio.charset.IllegalCharsetNameException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -3;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v2));
    Object v4 = new byte[]{Byte.valueOf((byte)8)};
    Object v5 = -3;
    Object v6 = 0;
    Object v7 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v3).read(((byte[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)1)};
    Object v9 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v3).isEOFRecord(((byte[])v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = java.io.OutputStream.nullOutputStream();
    Object v2 = ((java.io.InputStream)v0).transferTo(((java.io.OutputStream)v1));
    Object v3 = java.io.OutputStream.nullOutputStream();
    Object v4 = ((java.io.InputStream)v0).transferTo(((java.io.OutputStream)v3));
    org.junit.Assert.assertEquals((Object)(0L), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = -45;
    Object v2 = org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -3;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v2));
    Object v4 = new byte[]{Byte.valueOf((byte)4),Byte.valueOf((byte)74)};
    Object v5 = 1;
    Object v6 = -81;
    Object v7 = ((java.io.InputStream)v3).readNBytes(((byte[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -3;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v2));
    Object v4 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v3).getNextTarEntry();
    Object v5 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v3).getLongNameData();
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -3;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v2));
    Object v4 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v3).available();
    org.junit.Assert.assertEquals((Object)(0), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = 0;
    Object v2 = org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -3;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v2));
    Object v4 = true;
    ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v3).setAtEOF((((java.lang.Boolean)v4).booleanValue()));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -3;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v2));
    Object v4 = java.io.OutputStream.nullOutputStream();
    Object v5 = ((java.io.InputStream)v3).transferTo(((java.io.OutputStream)v4));
    org.junit.Assert.assertEquals((Object)(0L), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 0;
    Object v2 = ((java.io.InputStream)v0).readNBytes((((java.lang.Integer)v1).intValue()));
    Object v3 = -36;
    Object v4 = "UTF-16BE";
    Object v5 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v3).intValue()),((java.lang.String)v4));
    Object v6 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v5).isAtEOF();
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -3;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = 0;
    Object v4 = 40;
    Object v5 = "{";
    Object v6 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),((java.lang.String)v5));
      org.junit.Assert.fail("Expected java.nio.charset.IllegalCharsetNameException");
    } catch (java.nio.charset.IllegalCharsetNameException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -3;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new byte[]{};
    Object v4 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v2).isEOFRecord(((byte[])v3));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -3;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new byte[]{Byte.valueOf((byte)39)};
    Object v4 = 1;
    Object v5 = 0;
    Object v6 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v2).read(((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    org.junit.Assert.assertEquals((Object)(-1), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = java.io.OutputStream.nullOutputStream();
    Object v2 = ((java.io.InputStream)v0).transferTo(((java.io.OutputStream)v1));
    Object v3 = 1;
    Object v4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -3;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v2).getNextEntry();
    Object v4 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v2).available();
    org.junit.Assert.assertEquals((Object)(0), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = java.io.OutputStream.nullOutputStream();
    Object v2 = ((java.io.InputStream)v0).transferTo(((java.io.OutputStream)v1));
    Object v3 = 1;
    Object v4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v3).intValue()));
    Object v5 = ".wqmz";
    Object v6 = new java.io.File(((java.lang.String)v5));
    Object v7 = ";";
    Object v8 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(((java.io.File)v6),((java.lang.String)v7));
    Object v9 = ((org.apache.commons.compress.archivers.ArchiveEntry)v8).getLastModifiedDate();
    Object v10 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v4).canReadEntryData(((org.apache.commons.compress.archivers.ArchiveEntry)v8));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = java.io.OutputStream.nullOutputStream();
    Object v2 = ((java.io.InputStream)v0).transferTo(((java.io.OutputStream)v1));
    Object v3 = 1;
    Object v4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v3).intValue()));
    Object v5 = 2;
    Object v6 = 1;
    Object v7 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = java.io.OutputStream.nullOutputStream();
    Object v2 = ((java.io.InputStream)v0).transferTo(((java.io.OutputStream)v1));
    Object v3 = 1;
    Object v4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v3).intValue()));
    Object v5 = 2;
    Object v6 = 1;
    Object v7 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = ((java.io.InputStream)v7).readAllBytes();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = java.io.OutputStream.nullOutputStream();
    Object v2 = ((java.io.InputStream)v0).transferTo(((java.io.OutputStream)v1));
    Object v3 = 1;
    Object v4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v3).intValue()));
    Object v5 = java.io.InputStream.nullInputStream();
    Object v6 = -3;
    Object v7 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v4).parsePaxHeaders(((java.io.InputStream)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = java.io.OutputStream.nullOutputStream();
    Object v2 = ((java.io.InputStream)v0).transferTo(((java.io.OutputStream)v1));
    Object v3 = 1;
    Object v4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v3).intValue()));
    Object v5 = 2;
    Object v6 = 1;
    Object v7 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v7).available();
    Object v9 = ".wqmz";
    Object v10 = new java.io.File(((java.lang.String)v9));
    Object v11 = "& securityEnvelopeFilePosition=";
    Object v12 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(((java.io.File)v10),((java.lang.String)v11));
    Object v13 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v7).canReadEntryData(((org.apache.commons.compress.archivers.ArchiveEntry)v12));
    org.junit.Assert.assertEquals((Object)(true), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = java.io.OutputStream.nullOutputStream();
    Object v2 = ((java.io.InputStream)v0).transferTo(((java.io.OutputStream)v1));
    Object v3 = 1;
    Object v4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v3).intValue()));
    Object v5 = 265;
    Object v6 = 8;
    Object v7 = "l]en(";
    Object v8 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),((java.lang.String)v7));
      org.junit.Assert.fail("Expected java.nio.charset.IllegalCharsetNameException");
    } catch (java.nio.charset.IllegalCharsetNameException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -3;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v2));
    Object v4 = java.io.InputStream.nullInputStream();
    Object v5 = -3;
    Object v6 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v6));
    Object v8 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v3).parsePaxHeaders(((java.io.InputStream)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)0),Byte.valueOf((byte)0)};
    Object v2 = ((java.io.InputStream)v0).read(((byte[])v1));
    org.junit.Assert.assertEquals((Object)(-1), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -3;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v2));
    Object v4 = false;
    ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v3).setAtEOF((((java.lang.Boolean)v4).booleanValue()));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 0L;
    Object v2 = ((java.io.InputStream)v0).skip((((java.lang.Long)v1).longValue()));
    Object v3 = new byte[]{};
    Object v4 = -18;
    Object v5 = -14;
    Object v6 = ((java.io.InputStream)v0).readNBytes(((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = java.io.OutputStream.nullOutputStream();
    Object v2 = ((java.io.InputStream)v0).transferTo(((java.io.OutputStream)v1));
    Object v3 = 1;
    Object v4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v3).intValue()));
    Object v5 = 2;
    Object v6 = 1;
    Object v7 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v7).readRecord();
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = java.io.OutputStream.nullOutputStream();
    Object v2 = ((java.io.InputStream)v0).transferTo(((java.io.OutputStream)v1));
    Object v3 = 1;
    Object v4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v3).intValue()));
    Object v5 = 2;
    Object v6 = 1;
    Object v7 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new byte[]{};
    Object v9 = 8;
    Object v10 = -53;
    Object v11 = ((java.io.InputStream)v7).readNBytes(((byte[])v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -3;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v2));
    Object v4 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v3).getRecordSize();
    org.junit.Assert.assertEquals((Object)(512), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = -3;
    Object v2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v2));
    Object v4 = new byte[]{};
    Object v5 = 8;
    Object v6 = 255;
    Object v7 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v3).read(((byte[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    org.junit.Assert.assertEquals((Object)(-1), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = 0;
    Object v2 = ((java.io.InputStream)v0).readNBytes((((java.lang.Integer)v1).intValue()));
    Object v3 = -36;
    Object v4 = "UTF-16BE";
    Object v5 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(((java.io.InputStream)v0),(((java.lang.Integer)v3).intValue()),((java.lang.String)v4));
    Object v6 = ".wqmz";
    Object v7 = new java.io.File(((java.lang.String)v6));
    Object v8 = "& securityEnvelopeFilePosition=";
    Object v9 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(((java.io.File)v7),((java.lang.String)v8));
    Object v10 = ((org.apache.commons.compress.archivers.tar.TarArchiveInputStream)v5).canReadEntryData(((org.apache.commons.compress.archivers.ArchiveEntry)v9));
    org.junit.Assert.assertEquals((Object)(true), v10);
  }
}
