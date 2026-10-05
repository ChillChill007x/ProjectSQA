package org.apache.commons.compress.archivers.zip;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v1));
    Object v3 = new java.io.ByteArrayOutputStream();
    Object v4 = ((java.io.InputStream)v2).transferTo(((java.io.OutputStream)v3));
    Object v5 = ((org.apache.commons.compress.archivers.zip.ZipArchiveInputStream)v2).getNextZipEntry();
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = new java.io.ByteArrayOutputStream();
    Object v3 = ((java.io.InputStream)v1).transferTo(((java.io.OutputStream)v2));
    org.junit.Assert.assertEquals((Object)(0L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v1));
    Object v3 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)0),Byte.valueOf((byte)0)};
    Object v4 = 0;
    Object v5 = 16;
    Object v6 = ((org.apache.commons.compress.archivers.zip.ZipArchiveInputStream)v2).read(((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    org.junit.Assert.assertEquals((Object)(-1), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v1));
    ((org.apache.commons.compress.archivers.zip.ZipArchiveInputStream)v2).close();
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v1));
    Object v3 = new byte[]{Byte.valueOf((byte)36)};
    Object v4 = ((java.io.InputStream)v2).read(((byte[])v3));
    Object v5 = ((org.apache.commons.compress.archivers.zip.ZipArchiveInputStream)v2).getNextEntry();
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)2),Byte.valueOf((byte)-6)};
    Object v1 = -14;
    Object v2 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v1));
    Object v3 = ((java.io.InputStream)v2).read();
    Object v4 = new byte[]{Byte.valueOf((byte)58),Byte.valueOf((byte)0),Byte.valueOf((byte)-19)};
    Object v5 = 1;
    Object v6 = 1;
    Object v7 = ((java.io.InputStream)v2).readNBytes(((byte[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    org.junit.Assert.assertEquals((Object)(0), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v1));
    Object v3 = new byte[]{};
    Object v4 = 23;
    Object v5 = 1;
    Object v6 = ((org.apache.commons.compress.archivers.zip.ZipArchiveInputStream)v2).read(((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    org.junit.Assert.assertEquals((Object)(-1), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v1));
    Object v3 = ((org.apache.commons.compress.archivers.zip.ZipArchiveInputStream)v2).getNextZipEntry();
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)25),Byte.valueOf((byte)-12)};
    Object v1 = 256;
    Object v2 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = "";
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v1),((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.nio.charset.IllegalCharsetNameException");
    } catch (java.nio.charset.IllegalCharsetNameException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v1));
    Object v3 = ((org.apache.commons.compress.archivers.ArchiveInputStream)v2).getBytesRead();
    org.junit.Assert.assertEquals((Object)(0L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = -32;
    Object v3 = ((java.io.InputStream)v1).readNBytes((((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v1));
    Object v3 = 0L;
    Object v4 = ((org.apache.commons.compress.archivers.zip.ZipArchiveInputStream)v2).skip((((java.lang.Long)v3).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v1));
    Object v3 = "";
    Object v4 = Byte.valueOf((byte)-21);
    Object v5 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(((java.lang.String)v3),(((java.lang.Byte)v4).byteValue()));
    Object v6 = ((org.apache.commons.compress.archivers.zip.ZipArchiveInputStream)v2).canReadEntryData(((org.apache.commons.compress.archivers.ArchiveEntry)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v1));
    Object v3 = ((org.apache.commons.compress.archivers.ArchiveInputStream)v2).read();
    org.junit.Assert.assertEquals((Object)(-1), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = -41L;
    Object v3 = ((java.io.InputStream)v1).skip((((java.lang.Long)v2).longValue()));
    Object v4 = new byte[]{Byte.valueOf((byte)23),Byte.valueOf((byte)72),Byte.valueOf((byte)-5)};
    Object v5 = 36;
    Object v6 = 0;
    Object v7 = ((java.io.InputStream)v1).readNBytes(((byte[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v1));
    Object v3 = 1L;
    Object v4 = ((org.apache.commons.compress.archivers.zip.ZipArchiveInputStream)v2).skip((((java.lang.Long)v3).longValue()));
    Object v5 = new byte[]{};
    Object v6 = 0;
    Object v7 = 27;
    Object v8 = ((org.apache.commons.compress.archivers.zip.ZipArchiveInputStream)v2).read(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    org.junit.Assert.assertEquals((Object)(-1), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v1));
    Object v3 = ((java.io.InputStream)v2).available();
    org.junit.Assert.assertEquals((Object)(0), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v1));
    Object v3 = new java.io.ByteArrayOutputStream();
    Object v4 = ((java.io.InputStream)v2).transferTo(((java.io.OutputStream)v3));
    org.junit.Assert.assertEquals((Object)(0L), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v1));
    Object v3 = -15L;
    Object v4 = ((org.apache.commons.compress.archivers.zip.ZipArchiveInputStream)v2).skip((((java.lang.Long)v3).longValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = " ";
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v1),((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.nio.charset.IllegalCharsetNameException");
    } catch (java.nio.charset.IllegalCharsetNameException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = ((java.io.InputStream)v1).available();
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = new java.io.ByteArrayOutputStream();
    Object v3 = ((java.io.InputStream)v1).transferTo(((java.io.OutputStream)v2));
    Object v4 = new java.io.ByteArrayOutputStream();
    Object v5 = 0;
    ((java.io.OutputStream)v4).write((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    Object v7 = ((java.io.InputStream)v1).transferTo(((java.io.OutputStream)v4));
    org.junit.Assert.assertEquals((Object)(0L), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v1));
    Object v3 = 1L;
    Object v4 = ((org.apache.commons.compress.archivers.zip.ZipArchiveInputStream)v2).skip((((java.lang.Long)v3).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)4),Byte.valueOf((byte)30),Byte.valueOf((byte)0)};
    Object v1 = 1;
    Object v2 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)15),Byte.valueOf((byte)-6),Byte.valueOf((byte)1)};
    Object v1 = 8;
    Object v2 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v1));
    Object v3 = ((org.apache.commons.compress.archivers.zip.ZipArchiveInputStream)v2).getNextEntry();
    Object v4 = 4L;
    Object v5 = ((org.apache.commons.compress.archivers.zip.ZipArchiveInputStream)v2).skip((((java.lang.Long)v4).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)30),Byte.valueOf((byte)4),Byte.valueOf((byte)17)};
    Object v1 = -58;
    Object v2 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v1));
    Object v3 = 0;
    Object v4 = ((java.io.InputStream)v2).readNBytes((((java.lang.Integer)v3).intValue()));
    ((org.apache.commons.compress.archivers.zip.ZipArchiveInputStream)v2).close();
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    ((java.io.InputStream)v1).reset();
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v1));
    ((org.apache.commons.compress.archivers.zip.ZipArchiveInputStream)v2).close();
    Object v3 = null;
    Object v4 = 0L;
    Object v5 = ((org.apache.commons.compress.archivers.zip.ZipArchiveInputStream)v2).skip((((java.lang.Long)v4).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v1));
    Object v3 = "Unsupported compression method ";
    Object v4 = false;
    Object v5 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v2),((java.lang.String)v3),(((java.lang.Boolean)v4).booleanValue()));
      org.junit.Assert.fail("Expected java.nio.charset.IllegalCharsetNameException");
    } catch (java.nio.charset.IllegalCharsetNameException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v1));
    Object v3 = ((org.apache.commons.compress.archivers.ArchiveInputStream)v2).read();
    Object v4 = new byte[]{};
    Object v5 = 1;
    Object v6 = 255;
    Object v7 = ((org.apache.commons.compress.archivers.zip.ZipArchiveInputStream)v2).read(((byte[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    org.junit.Assert.assertEquals((Object)(-1), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = "TRAILER!!!";
    Object v3 = true;
    Object v4 = false;
    Object v5 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v1),((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
      org.junit.Assert.fail("Expected java.nio.charset.IllegalCharsetNameException");
    } catch (java.nio.charset.IllegalCharsetNameException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v1));
    Object v3 = 1;
    Object v4 = ((java.io.InputStream)v2).readNBytes((((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v1));
    ((org.apache.commons.compress.archivers.zip.ZipArchiveInputStream)v2).close();
    Object v3 = null;
    Object v4 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)-73)};
    Object v5 = 0;
    Object v6 = 0;
    Object v7 = ((org.apache.commons.compress.archivers.zip.ZipArchiveInputStream)v2).read(((byte[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)-56),Byte.valueOf((byte)0)};
    Object v1 = -9;
    Object v2 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = ((java.io.InputStream)v1).readAllBytes();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v1));
    Object v3 = ((org.apache.commons.compress.archivers.ArchiveInputStream)v2).read();
    Object v4 = ((org.apache.commons.compress.archivers.zip.ZipArchiveInputStream)v2).getNextZipEntry();
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = 0;
    Object v3 = ((java.io.InputStream)v1).readNBytes((((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = 0L;
    Object v3 = ((java.io.InputStream)v1).skip((((java.lang.Long)v2).longValue()));
    Object v4 = -1;
    Object v5 = ((java.io.InputStream)v1).readNBytes((((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)-28),Byte.valueOf((byte)-8)};
    Object v1 = 2;
    Object v2 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v1));
    Object v3 = 48;
    Object v4 = ((java.io.InputStream)v2).readNBytes((((java.lang.Integer)v3).intValue()));
    Object v5 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)-36),Byte.valueOf((byte)1)};
    Object v6 = -13;
    Object v7 = 1;
    Object v8 = ((org.apache.commons.compress.archivers.zip.ZipArchiveInputStream)v2).read(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    org.junit.Assert.assertEquals((Object)(-1), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)61),Byte.valueOf((byte)0),Byte.valueOf((byte)32)};
    Object v1 = 0;
    Object v2 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)1)};
    Object v1 = 0;
    Object v2 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = "streap closed";
    Object v3 = true;
    Object v4 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v1),((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
      org.junit.Assert.fail("Expected java.nio.charset.IllegalCharsetNameException");
    } catch (java.nio.charset.IllegalCharsetNameException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v1));
    Object v3 = 32;
    Object v4 = ((java.io.InputStream)v2).readNBytes((((java.lang.Integer)v3).intValue()));
    ((org.apache.commons.compress.archivers.zip.ZipArchiveInputStream)v2).close();
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v1));
    Object v3 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)1)};
    Object v4 = 0;
    Object v5 = 1;
    Object v6 = ((java.io.InputStream)v2).readNBytes(((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    org.junit.Assert.assertEquals((Object)(0), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = new byte[]{};
    Object v3 = ((java.io.InputStream)v1).read(((byte[])v2));
    org.junit.Assert.assertEquals((Object)(-1), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v1));
    Object v3 = new byte[]{Byte.valueOf((byte)-75),Byte.valueOf((byte)32),Byte.valueOf((byte)-8)};
    Object v4 = 0;
    Object v5 = 7;
    Object v6 = ((org.apache.commons.compress.archivers.zip.ZipArchiveInputStream)v2).read(((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    org.junit.Assert.assertEquals((Object)(-1), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v1));
    Object v3 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)-25),Byte.valueOf((byte)0)};
    Object v4 = -11;
    Object v5 = 24;
    Object v6 = ((org.apache.commons.compress.archivers.zip.ZipArchiveInputStream)v2).read(((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    org.junit.Assert.assertEquals((Object)(-1), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v1));
    Object v3 = ((org.apache.commons.compress.archivers.zip.ZipArchiveInputStream)v2).getNextEntry();
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = -19;
    Object v2 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)53)};
    Object v1 = 0;
    Object v2 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)-3),Byte.valueOf((byte)0)};
    Object v1 = 48;
    Object v2 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = "CLR/I";
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v1),((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.nio.charset.IllegalCharsetNameException");
    } catch (java.nio.charset.IllegalCharsetNameException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = ((java.io.InputStream)v1).readAllBytes();
    Object v3 = ((java.io.InputStream)v1).markSupported();
    org.junit.Assert.assertEquals((Object)(true), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = -9;
    Object v3 = ((java.io.InputStream)v1).readNBytes((((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)-7)};
    Object v1 = 43;
    Object v2 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = new byte[]{};
    Object v3 = 39;
    Object v4 = 1;
    Object v5 = ((java.io.InputStream)v1).readNBytes(((byte[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = new java.io.ByteArrayOutputStream();
    Object v2 = -40;
    ((java.io.OutputStream)v1).write((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    Object v4 = ((java.io.InputStream)v0).transferTo(((java.io.OutputStream)v1));
    org.junit.Assert.assertEquals((Object)(0L), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = ((java.io.InputStream)v1).readAllBytes();
    Object v3 = new byte[]{Byte.valueOf((byte)1)};
    Object v4 = 35;
    Object v5 = -15;
    Object v6 = ((java.io.InputStream)v1).readNBytes(((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v1));
    Object v3 = new byte[]{};
    Object v4 = 2;
    Object v5 = -10;
    Object v6 = ((org.apache.commons.compress.archivers.zip.ZipArchiveInputStream)v2).read(((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    org.junit.Assert.assertEquals((Object)(-1), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v1));
    Object v3 = 1L;
    Object v4 = ((org.apache.commons.compress.archivers.zip.ZipArchiveInputStream)v2).skip((((java.lang.Long)v3).longValue()));
    Object v5 = "";
    Object v6 = Byte.valueOf((byte)-21);
    Object v7 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(((java.lang.String)v5),(((java.lang.Byte)v6).byteValue()));
    Object v8 = ((org.apache.commons.compress.archivers.zip.ZipArchiveInputStream)v2).canReadEntryData(((org.apache.commons.compress.archivers.ArchiveEntry)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v1));
    Object v3 = -9L;
    Object v4 = ((org.apache.commons.compress.archivers.zip.ZipArchiveInputStream)v2).skip((((java.lang.Long)v3).longValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v1));
    Object v3 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)8),Byte.valueOf((byte)0)};
    Object v4 = 2;
    Object v5 = 1;
    Object v6 = ((java.io.InputStream)v2).readNBytes(((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = 0L;
    Object v8 = ((org.apache.commons.compress.archivers.zip.ZipArchiveInputStream)v2).skip((((java.lang.Long)v7).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v1));
    Object v3 = new byte[]{Byte.valueOf((byte)-20)};
    Object v4 = ((java.io.InputStream)v2).read(((byte[])v3));
    ((org.apache.commons.compress.archivers.zip.ZipArchiveInputStream)v2).close();
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v1));
    Object v3 = new byte[]{};
    Object v4 = 39;
    Object v5 = -7;
    Object v6 = ((org.apache.commons.compress.archivers.zip.ZipArchiveInputStream)v2).read(((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    org.junit.Assert.assertEquals((Object)(-1), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)-14)};
    Object v1 = 0;
    Object v2 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v1));
    Object v3 = ((org.apache.commons.compress.archivers.ArchiveInputStream)v2).getCount();
    org.junit.Assert.assertEquals((Object)(0), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = new byte[]{};
    Object v1 = 40;
    Object v2 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v1));
    Object v3 = ((org.apache.commons.compress.archivers.ArchiveInputStream)v2).getNextEntry();
    Object v4 = ((org.apache.commons.compress.archivers.ArchiveInputStream)v2).getBytesRead();
    org.junit.Assert.assertEquals((Object)(0L), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = new byte[]{Byte.valueOf((byte)3),Byte.valueOf((byte)0),Byte.valueOf((byte)-59)};
    Object v3 = -18;
    Object v4 = 1;
    Object v5 = ((java.io.InputStream)v1).readNBytes(((byte[])v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = ((java.io.InputStream)v1).read();
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v1));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)2),Byte.valueOf((byte)1),Byte.valueOf((byte)23)};
    Object v1 = 0;
    Object v2 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v1));
    Object v3 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)39)};
    Object v4 = 1;
    Object v5 = 0;
    Object v6 = ((org.apache.commons.compress.archivers.zip.ZipArchiveInputStream)v2).read(((byte[])v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    org.junit.Assert.assertEquals((Object)(-1), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = "unsupported feature method '";
    Object v3 = true;
    Object v4 = true;
    Object v5 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v1),((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
      org.junit.Assert.fail("Expected java.nio.charset.IllegalCharsetNameException");
    } catch (java.nio.charset.IllegalCharsetNameException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v1));
    Object v3 = "";
    Object v4 = Byte.valueOf((byte)-21);
    Object v5 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(((java.lang.String)v3),(((java.lang.Byte)v4).byteValue()));
    Object v6 = ((org.apache.commons.compress.archivers.ArchiveEntry)v5).getLastModifiedDate();
    Object v7 = ((org.apache.commons.compress.archivers.zip.ZipArchiveInputStream)v2).canReadEntryData(((org.apache.commons.compress.archivers.ArchiveEntry)v5));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v1));
    Object v3 = 1;
    ((java.io.InputStream)v2).mark((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v1));
    Object v3 = ") > dest.length(";
    Object v4 = true;
    Object v5 = false;
    Object v6 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v2),((java.lang.String)v3),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()));
      org.junit.Assert.fail("Expected java.nio.charset.IllegalCharsetNameException");
    } catch (java.nio.charset.IllegalCharsetNameException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = ((java.io.InputStream)v1).read();
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v1));
    Object v4 = "";
    Object v5 = Byte.valueOf((byte)-21);
    Object v6 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(((java.lang.String)v4),(((java.lang.Byte)v5).byteValue()));
    Object v7 = ((org.apache.commons.compress.archivers.zip.ZipArchiveInputStream)v3).canReadEntryData(((org.apache.commons.compress.archivers.ArchiveEntry)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = ((java.io.InputStream)v1).read();
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v1));
    Object v4 = ((org.apache.commons.compress.archivers.zip.ZipArchiveInputStream)v3).getNextZipEntry();
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = ((java.io.InputStream)v1).read();
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v1));
    Object v4 = -33L;
    Object v5 = ((org.apache.commons.compress.archivers.zip.ZipArchiveInputStream)v3).skip((((java.lang.Long)v4).longValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v1));
    Object v3 = ((org.apache.commons.compress.archivers.ArchiveInputStream)v2).read();
    Object v4 = new byte[]{Byte.valueOf((byte)-1),Byte.valueOf((byte)1)};
    Object v5 = 90;
    Object v6 = 4;
    Object v7 = ((org.apache.commons.compress.archivers.zip.ZipArchiveInputStream)v2).read(((byte[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    org.junit.Assert.assertEquals((Object)(-1), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v1));
    Object v3 = "";
    Object v4 = Byte.valueOf((byte)-21);
    Object v5 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(((java.lang.String)v3),(((java.lang.Byte)v4).byteValue()));
    Object v6 = ((org.apache.commons.compress.archivers.ArchiveEntry)v5).getName();
    Object v7 = ((org.apache.commons.compress.archivers.zip.ZipArchiveInputStream)v2).canReadEntryData(((org.apache.commons.compress.archivers.ArchiveEntry)v5));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v1));
    Object v3 = "/";
    Object v4 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v2),((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.nio.charset.IllegalCharsetNameException");
    } catch (java.nio.charset.IllegalCharsetNameException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = ((java.io.InputStream)v1).markSupported();
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v1));
    Object v3 = ((org.apache.commons.compress.archivers.zip.ZipArchiveInputStream)v2).getNextEntry();
    Object v4 = "";
    Object v5 = Byte.valueOf((byte)-21);
    Object v6 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(((java.lang.String)v4),(((java.lang.Byte)v5).byteValue()));
    Object v7 = ((org.apache.commons.compress.archivers.zip.ZipArchiveInputStream)v2).canReadEntryData(((org.apache.commons.compress.archivers.ArchiveEntry)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v1));
    Object v3 = ((java.io.InputStream)v2).readAllBytes();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = ((java.io.InputStream)v1).read();
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v1));
    Object v4 = new byte[]{Byte.valueOf((byte)28),Byte.valueOf((byte)1),Byte.valueOf((byte)2)};
    Object v5 = 1;
    Object v6 = -1635289880;
    Object v7 = ((org.apache.commons.compress.archivers.zip.ZipArchiveInputStream)v3).read(((byte[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    org.junit.Assert.assertEquals((Object)(-1), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)5),Byte.valueOf((byte)0)};
    Object v1 = 22;
    Object v2 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = 0;
    Object v2 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(((byte[])v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = new java.io.ByteArrayOutputStream();
    Object v3 = ((java.io.InputStream)v1).transferTo(((java.io.OutputStream)v2));
    ((java.io.InputStream)v1).reset();
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = ((java.io.InputStream)v1).read();
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v1));
    Object v4 = ((org.apache.commons.compress.archivers.ArchiveInputStream)v3).read();
    org.junit.Assert.assertEquals((Object)(-1), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v1));
    Object v3 = 0;
    Object v4 = ((java.io.InputStream)v2).readNBytes((((java.lang.Integer)v3).intValue()));
    Object v5 = 1;
    Object v6 = ((java.io.InputStream)v2).readNBytes((((java.lang.Integer)v5).intValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = new java.io.ByteArrayOutputStream();
    Object v3 = new byte[]{Byte.valueOf((byte)0)};
    ((java.io.OutputStream)v2).write(((byte[])v3));
    Object v4 = null;
    Object v5 = ((java.io.InputStream)v1).transferTo(((java.io.OutputStream)v2));
    org.junit.Assert.assertEquals((Object)(0L), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new byte[]{};
    Object v1 = new java.io.ByteArrayInputStream(((byte[])v0));
    Object v2 = ((java.io.InputStream)v1).read();
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(((java.io.InputStream)v1));
    Object v4 = new byte[]{Byte.valueOf((byte)71)};
    Object v5 = 1;
    Object v6 = 1;
    Object v7 = ((org.apache.commons.compress.archivers.zip.ZipArchiveInputStream)v3).read(((byte[])v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    org.junit.Assert.assertEquals((Object)(-1), v7);
  }
}
