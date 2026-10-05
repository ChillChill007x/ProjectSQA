package org.apache.commons.compress.archivers.zip;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = "archive contains more than 65535 entries.";
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v0));
    Object v2 = ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v1).isUnixSymlink();
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = "archive contains more than 65535 entries.";
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v0));
    Object v2 = ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v1).getLocalFileDataExtra();
    Object v3 = ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v1).getVersionRequired();
    org.junit.Assert.assertEquals((Object)(0), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = "archive contains more than 65535 entries.";
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v0));
    Object v2 = ((java.util.zip.ZipEntry)v1).getTimeLocal();
      org.junit.Assert.fail("Expected java.time.DateTimeException");
    } catch (java.time.DateTimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = "archive contains more than 65535 entries.";
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v0));
    Object v2 = ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v1).getLocalFileDataExtra();
    Object v3 = 2L;
    ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v1).setSize((((java.lang.Long)v3).longValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = "archive contains more than 65535 entries.";
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v0));
    Object v2 = true;
    Object v3 = ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v1).getExtraFields((((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = "archive contains more than 65535 entries.";
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v0));
    Object v2 = -3L;
    ((java.util.zip.ZipEntry)v1).setTime((((java.lang.Long)v2).longValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = "archive contains more than 65535 entries.";
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v0));
    Object v2 = ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v1).getName();
    org.junit.Assert.assertEquals((Object)("archive contains more than 65535 entries."), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = "archive contains more than 65535 entries.";
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v0));
    Object v2 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = "archive contains more than 65535 entries.";
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v0));
    Object v2 = "";
    Object v3 = new byte[]{};
    ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v1).setName(((java.lang.String)v2),((byte[])v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = "archive contains more than 65535 entries.";
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v0));
    Object v2 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField();
    ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v1).addAsFirstExtraField(((org.apache.commons.compress.archivers.zip.ZipExtraField)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = "archive contains more than 65535 entries.";
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v0));
    Object v2 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField();
    ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v1).addExtraField(((org.apache.commons.compress.archivers.zip.ZipExtraField)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = "archive contains more than 65535 entries.";
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v0));
    Object v2 = new org.apache.commons.compress.archivers.zip.ZipExtraField[]{};
    ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v1).setExtraFields(((org.apache.commons.compress.archivers.zip.ZipExtraField[])v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = "archive contains more than 65535 entries.";
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v0));
    Object v2 = 15;
    ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v1).setRawFlag((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    Object v4 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField();
    ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v1).addAsFirstExtraField(((org.apache.commons.compress.archivers.zip.ZipExtraField)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = "archive contains more than 65535 entries.";
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v0));
    Object v2 = ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v1).getMethod();
    org.junit.Assert.assertEquals((Object)(-1), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = "archive contains more than 65535 entries.";
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v0));
    Object v2 = new byte[]{Byte.valueOf((byte)-24),Byte.valueOf((byte)0)};
    ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v1).setExtra(((byte[])v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = "archive contains more than 65535 entries.";
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v0));
    Object v2 = java.time.Instant.now();
    Object v3 = java.nio.file.attribute.FileTime.from(((java.time.Instant)v2));
    Object v4 = ((java.util.zip.ZipEntry)v1).setLastModifiedTime(((java.nio.file.attribute.FileTime)v3));
    Object v5 = -48L;
    ((java.util.zip.ZipEntry)v1).setCompressedSize((((java.lang.Long)v5).longValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = "archive contains more than 65535 entries.";
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v0));
    Object v2 = false;
    Object v3 = ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v1).getExtraFields((((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = "archive contains more than 65535 entries.";
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v0));
    Object v2 = java.time.Instant.now();
    Object v3 = java.nio.file.attribute.FileTime.from(((java.time.Instant)v2));
    Object v4 = ((java.util.zip.ZipEntry)v1).setLastAccessTime(((java.nio.file.attribute.FileTime)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = "archive contains more than 65535 entries.";
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v0));
    Object v2 = ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v1).getLocalFileDataExtra();
    Object v3 = ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v1).getUnparseableExtraFieldData();
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = "archive contains more than 65535 entries.";
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v0));
    Object v2 = ((java.util.zip.ZipEntry)v1).getCreationTime();
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = "archive contains more than 65535 entries.";
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v0));
    Object v2 = 2L;
    ((java.util.zip.ZipEntry)v1).setCompressedSize((((java.lang.Long)v2).longValue()));
    Object v3 = null;
    Object v4 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(((java.util.zip.ZipEntry)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = "archive contains more than 65535 entries.";
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v0));
    Object v2 = "Archiver: ";
    ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v1).setName(((java.lang.String)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = "archive contains more than 65535 entries.";
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v0));
    Object v2 = java.time.Instant.now();
    Object v3 = java.nio.file.attribute.FileTime.from(((java.time.Instant)v2));
    Object v4 = ((java.util.zip.ZipEntry)v1).setLastAccessTime(((java.nio.file.attribute.FileTime)v3));
    Object v5 = 20L;
    ((java.util.zip.ZipEntry)v4).setTime((((java.lang.Long)v5).longValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = "archive contains more than 65535 entries.";
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v0));
    Object v2 = ((java.util.zip.ZipEntry)v1).hashCode();
    Object v3 = 1L;
    ((java.util.zip.ZipEntry)v1).setCrc((((java.lang.Long)v3).longValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = "archive contains more than 65535 entries.";
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v0));
    Object v2 = java.time.Instant.now();
    Object v3 = java.nio.file.attribute.FileTime.from(((java.time.Instant)v2));
    Object v4 = ((java.util.zip.ZipEntry)v1).setLastAccessTime(((java.nio.file.attribute.FileTime)v3));
    Object v5 = ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v4).getUnixMode();
    org.junit.Assert.assertEquals((Object)(0), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = "archive contains more than 65535 entries.";
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v0));
    Object v2 = java.time.Instant.now();
    Object v3 = java.nio.file.attribute.FileTime.from(((java.time.Instant)v2));
    Object v4 = ((java.util.zip.ZipEntry)v1).setLastAccessTime(((java.nio.file.attribute.FileTime)v3));
    Object v5 = ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v4).getLocalFileDataExtra();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = "archive contains more than 65535 entries.";
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v0));
    Object v2 = java.time.Instant.now();
    Object v3 = java.nio.file.attribute.FileTime.from(((java.time.Instant)v2));
    Object v4 = ((java.util.zip.ZipEntry)v1).setLastAccessTime(((java.nio.file.attribute.FileTime)v3));
    Object v5 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField();
    ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v4).addAsFirstExtraField(((org.apache.commons.compress.archivers.zip.ZipExtraField)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = "archive contains more than 65535 entries.";
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v0));
    Object v2 = java.time.Instant.now();
    Object v3 = java.nio.file.attribute.FileTime.from(((java.time.Instant)v2));
    Object v4 = ((java.util.zip.ZipEntry)v1).setLastAccessTime(((java.nio.file.attribute.FileTime)v3));
    Object v5 = ((java.util.zip.ZipEntry)v4).getLastAccessTime();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = "archive contains more than 65535 entries.";
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v0));
    Object v2 = -46;
    ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v1).setVersionRequired((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = "archive contains more than 65535 entries.";
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v0));
    Object v2 = java.time.Instant.now();
    Object v3 = java.nio.file.attribute.FileTime.from(((java.time.Instant)v2));
    Object v4 = ((java.util.zip.ZipEntry)v1).setLastAccessTime(((java.nio.file.attribute.FileTime)v3));
    Object v5 = new byte[]{Byte.valueOf((byte)1),Byte.valueOf((byte)1),Byte.valueOf((byte)10)};
    ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v4).setExtra(((byte[])v5));
    Object v6 = null;
    Object v7 = ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v4).getRawName();
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = "archive contains more than 65535 entries.";
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v0));
    Object v2 = ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v1).getRawFlag();
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = "archive contains more than 65535 entries.";
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v0));
    Object v2 = java.time.Instant.now();
    Object v3 = java.nio.file.attribute.FileTime.from(((java.time.Instant)v2));
    Object v4 = ((java.util.zip.ZipEntry)v1).setLastAccessTime(((java.nio.file.attribute.FileTime)v3));
    Object v5 = java.time.Instant.now();
    Object v6 = java.nio.file.attribute.FileTime.from(((java.time.Instant)v5));
    Object v7 = ((java.util.zip.ZipEntry)v4).setLastModifiedTime(((java.nio.file.attribute.FileTime)v6));
    Object v8 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(((java.util.zip.ZipEntry)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = "archive contains more than 65535 entries.";
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v0));
    Object v2 = java.time.Instant.now();
    Object v3 = java.nio.file.attribute.FileTime.from(((java.time.Instant)v2));
    Object v4 = ((java.util.zip.ZipEntry)v1).setLastAccessTime(((java.nio.file.attribute.FileTime)v3));
    Object v5 = ((java.util.zip.ZipEntry)v4).getTime();
    Object v6 = new org.apache.commons.compress.archivers.zip.GeneralPurposeBit();
    Object v7 = ((org.apache.commons.compress.archivers.zip.GeneralPurposeBit)v6).clone();
    ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v4).setGeneralPurposeBit(((org.apache.commons.compress.archivers.zip.GeneralPurposeBit)v6));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = "archive contains more than 65535 entries.";
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v0));
    Object v2 = 1L;
    ((java.util.zip.ZipEntry)v1).setTime((((java.lang.Long)v2).longValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = "archive contains more than 65535 entries.";
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v0));
    Object v2 = java.time.Instant.now();
    Object v3 = java.nio.file.attribute.FileTime.from(((java.time.Instant)v2));
    Object v4 = ((java.util.zip.ZipEntry)v1).setLastAccessTime(((java.nio.file.attribute.FileTime)v3));
    Object v5 = 49;
    ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v4).setInternalAttributes((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    Object v7 = -15;
    Object v8 = new org.apache.commons.compress.archivers.zip.ZipShort((((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v4).getExtraField(((org.apache.commons.compress.archivers.zip.ZipShort)v8));
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = "archive contains more than 65535 entries.";
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v0));
    Object v2 = java.time.Instant.now();
    Object v3 = java.nio.file.attribute.FileTime.from(((java.time.Instant)v2));
    Object v4 = ((java.util.zip.ZipEntry)v1).setLastAccessTime(((java.nio.file.attribute.FileTime)v3));
    Object v5 = java.time.Instant.now();
    Object v6 = ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v4).equals(((java.lang.Object)v5));
    Object v7 = 5;
    ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v4).setMethod((((java.lang.Integer)v7).intValue()));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = "archive contains more than 65535 entries.";
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v0));
    Object v2 = java.time.Instant.now();
    Object v3 = java.nio.file.attribute.FileTime.from(((java.time.Instant)v2));
    Object v4 = ((java.util.zip.ZipEntry)v1).setLastAccessTime(((java.nio.file.attribute.FileTime)v3));
    Object v5 = 1;
    ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v4).setMethod((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = "archive contains more than 65535 entries.";
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v0));
    Object v2 = java.time.Instant.now();
    Object v3 = java.nio.file.attribute.FileTime.from(((java.time.Instant)v2));
    Object v4 = ((java.util.zip.ZipEntry)v1).setLastAccessTime(((java.nio.file.attribute.FileTime)v3));
    Object v5 = ((java.util.zip.ZipEntry)v4).getLastModifiedTime();
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = "archive contains more than 65535 entries.";
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v0));
    Object v2 = ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v1).isDirectory();
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = "archive contains more than 65535 entries.";
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v0));
    Object v2 = ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v1).getUnixMode();
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = "archive contains more than 65535 entries.";
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v0));
    Object v2 = 37;
    ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v1).setUnixMode((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = "archive contains more than 65535 entries.";
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v0));
    ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v1).removeUnparseableExtraFieldData();
    Object v2 = null;
      org.junit.Assert.fail("Expected java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = "archive contains more than 65535 entries.";
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v0));
    Object v2 = -15;
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipShort((((java.lang.Integer)v2).intValue()));
    ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v1).removeExtraField(((org.apache.commons.compress.archivers.zip.ZipShort)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = "archive contains more than 65535 entries.";
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v0));
    Object v2 = java.time.Instant.now();
    Object v3 = java.nio.file.attribute.FileTime.from(((java.time.Instant)v2));
    Object v4 = ((java.util.zip.ZipEntry)v1).setLastAccessTime(((java.nio.file.attribute.FileTime)v3));
    Object v5 = 4L;
    ((java.util.zip.ZipEntry)v4).setTime((((java.lang.Long)v5).longValue()));
    Object v6 = null;
    Object v7 = ((java.util.zip.ZipEntry)v4).getTimeLocal();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = "archive contains more than 65535 entries.";
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v0));
    Object v2 = java.time.Instant.now();
    Object v3 = java.nio.file.attribute.FileTime.from(((java.time.Instant)v2));
    Object v4 = ((java.util.zip.ZipEntry)v1).setLastAccessTime(((java.nio.file.attribute.FileTime)v3));
    Object v5 = 0;
    ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v4).setUnixMode((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = "archive contains more than 65535 entries.";
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v0));
    Object v2 = "!";
    ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v1).setName(((java.lang.String)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = "archive contains more than 65535 entries.";
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v0));
    Object v2 = java.time.Instant.now();
    Object v3 = java.nio.file.attribute.FileTime.from(((java.time.Instant)v2));
    Object v4 = ((java.util.zip.ZipEntry)v1).setLastAccessTime(((java.nio.file.attribute.FileTime)v3));
    Object v5 = -15;
    Object v6 = new org.apache.commons.compress.archivers.zip.ZipShort((((java.lang.Integer)v5).intValue()));
    Object v7 = ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v4).getExtraField(((org.apache.commons.compress.archivers.zip.ZipShort)v6));
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = "archive contains more than 65535 entries.";
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v0));
    Object v2 = 2L;
    ((java.util.zip.ZipEntry)v1).setCompressedSize((((java.lang.Long)v2).longValue()));
    Object v3 = null;
    Object v4 = 0;
    ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v1).setInternalAttributes((((java.lang.Integer)v4).intValue()));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = "archive contains more than 65535 entries.";
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v0));
    Object v2 = java.time.Instant.now();
    Object v3 = java.nio.file.attribute.FileTime.from(((java.time.Instant)v2));
    Object v4 = ((java.util.zip.ZipEntry)v1).setLastAccessTime(((java.nio.file.attribute.FileTime)v3));
    Object v5 = new org.apache.commons.compress.archivers.zip.GeneralPurposeBit();
    Object v6 = ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v4).equals(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = null;
    Object v1 = "";
    Object v2 = new java.io.File(((java.io.File)v0),((java.lang.String)v1));
    Object v3 = "SEUID";
    Object v4 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(((java.io.File)v2),((java.lang.String)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = "archive contains more than 65535 entries.";
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v0));
    Object v2 = java.time.Instant.now();
    Object v3 = java.nio.file.attribute.FileTime.from(((java.time.Instant)v2));
    Object v4 = ((java.util.zip.ZipEntry)v1).setLastAccessTime(((java.nio.file.attribute.FileTime)v3));
    Object v5 = 1L;
    ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v4).setSize((((java.lang.Long)v5).longValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = "archive contains more than 65535 entries.";
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v0));
    Object v2 = "s";
    ((java.util.zip.ZipEntry)v1).setComment(((java.lang.String)v2));
    Object v3 = null;
    Object v4 = ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v1).getLocalFileDataExtra();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = "archive contains more than 65535 entries.";
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v0));
    Object v2 = java.time.Instant.now();
    Object v3 = java.nio.file.attribute.FileTime.from(((java.time.Instant)v2));
    Object v4 = ((java.util.zip.ZipEntry)v1).setLastAccessTime(((java.nio.file.attribute.FileTime)v3));
    Object v5 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField();
    Object v6 = ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v4).equals(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = null;
    Object v1 = "";
    Object v2 = new java.io.File(((java.io.File)v0),((java.lang.String)v1));
    Object v3 = "SEUID";
    Object v4 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(((java.io.File)v2),((java.lang.String)v3));
    Object v5 = ((java.util.zip.ZipEntry)v4).getLastModifiedTime();
    Object v6 = "archive contains more than 65535 entries.";
    Object v7 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v6));
    Object v8 = java.time.Instant.now();
    Object v9 = java.nio.file.attribute.FileTime.from(((java.time.Instant)v8));
    Object v10 = ((java.util.zip.ZipEntry)v7).setLastAccessTime(((java.nio.file.attribute.FileTime)v9));
    Object v11 = 4L;
    ((java.util.zip.ZipEntry)v10).setTime((((java.lang.Long)v11).longValue()));
    Object v12 = null;
    Object v13 = ((java.util.zip.ZipEntry)v10).getTimeLocal();
    ((java.util.zip.ZipEntry)v4).setTimeLocal(((java.time.LocalDateTime)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = "archive contains more than 65535 entries.";
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v0));
    Object v2 = 1L;
    ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v1).setSize((((java.lang.Long)v2).longValue()));
    Object v3 = null;
    Object v4 = ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v1).getLocalFileDataExtra();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = "archive contains more than 65535 entries.";
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v0));
    Object v2 = ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v1).hashCode();
    Object v3 = -15;
    Object v4 = new org.apache.commons.compress.archivers.zip.ZipShort((((java.lang.Integer)v3).intValue()));
    ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v1).removeExtraField(((org.apache.commons.compress.archivers.zip.ZipShort)v4));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = "archive contains more than 65535 entries.";
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v0));
    Object v2 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField();
    ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v1).addAsFirstExtraField(((org.apache.commons.compress.archivers.zip.ZipExtraField)v2));
    Object v3 = null;
    Object v4 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField();
    Object v5 = ((org.apache.commons.compress.archivers.zip.ZipExtraField)v4).getLocalFileDataLength();
    ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v1).addExtraField(((org.apache.commons.compress.archivers.zip.ZipExtraField)v4));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = "archive contains more than 65535 entries.";
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v0));
    Object v2 = java.time.Instant.now();
    Object v3 = java.nio.file.attribute.FileTime.from(((java.time.Instant)v2));
    Object v4 = ((java.util.zip.ZipEntry)v1).setLastAccessTime(((java.nio.file.attribute.FileTime)v3));
    Object v5 = 1;
    ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v4).setUnixMode((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = null;
    Object v1 = "";
    Object v2 = new java.io.File(((java.io.File)v0),((java.lang.String)v1));
    Object v3 = "SEUID";
    Object v4 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(((java.io.File)v2),((java.lang.String)v3));
    Object v5 = ((java.util.zip.ZipEntry)v4).getTime();
    org.junit.Assert.assertEquals((Object)(0L), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = "archive contains more than 65535 entries.";
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v0));
    Object v2 = java.time.Instant.now();
    Object v3 = java.nio.file.attribute.FileTime.from(((java.time.Instant)v2));
    Object v4 = ((java.util.zip.ZipEntry)v1).setLastAccessTime(((java.nio.file.attribute.FileTime)v3));
    Object v5 = new org.apache.commons.compress.archivers.zip.GeneralPurposeBit();
    ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v4).setGeneralPurposeBit(((org.apache.commons.compress.archivers.zip.GeneralPurposeBit)v5));
    Object v6 = null;
    Object v7 = new org.apache.commons.compress.archivers.zip.GeneralPurposeBit();
    Object v8 = ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v4).equals(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = null;
    Object v1 = "";
    Object v2 = new java.io.File(((java.io.File)v0),((java.lang.String)v1));
    Object v3 = "SEUID";
    Object v4 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(((java.io.File)v2),((java.lang.String)v3));
    Object v5 = ((java.util.zip.ZipEntry)v4).getLastModifiedTime();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = null;
    Object v1 = "";
    Object v2 = new java.io.File(((java.io.File)v0),((java.lang.String)v1));
    Object v3 = "SEUID";
    Object v4 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(((java.io.File)v2),((java.lang.String)v3));
    Object v5 = 1L;
    ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v4).setSize((((java.lang.Long)v5).longValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = null;
    Object v1 = "";
    Object v2 = new java.io.File(((java.io.File)v0),((java.lang.String)v1));
    Object v3 = "SEUID";
    Object v4 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(((java.io.File)v2),((java.lang.String)v3));
    Object v5 = "archive contains more than 65535 entries.";
    Object v6 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v5));
    Object v7 = java.time.Instant.now();
    Object v8 = java.nio.file.attribute.FileTime.from(((java.time.Instant)v7));
    Object v9 = ((java.util.zip.ZipEntry)v6).setLastAccessTime(((java.nio.file.attribute.FileTime)v8));
    Object v10 = 4L;
    ((java.util.zip.ZipEntry)v9).setTime((((java.lang.Long)v10).longValue()));
    Object v11 = null;
    Object v12 = ((java.util.zip.ZipEntry)v9).getTimeLocal();
    Object v13 = 11;
    Object v14 = 0;
    Object v15 = java.time.ZoneOffset.ofHoursMinutes((((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = ((java.time.chrono.ChronoLocalDateTime)v12).toInstant(((java.time.ZoneOffset)v15));
    ((java.util.zip.ZipEntry)v4).setTimeLocal(((java.time.LocalDateTime)v12));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = null;
    Object v1 = "";
    Object v2 = new java.io.File(((java.io.File)v0),((java.lang.String)v1));
    Object v3 = "SEUID";
    Object v4 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(((java.io.File)v2),((java.lang.String)v3));
    Object v5 = false;
    Object v6 = ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v4).getExtraFields((((java.lang.Boolean)v5).booleanValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = "archive contains more than 65535 entries.";
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v0));
    Object v2 = 1L;
    ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v1).setSize((((java.lang.Long)v2).longValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = "archive contains more than 65535 entries.";
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v0));
    Object v2 = java.time.Instant.now();
    Object v3 = java.nio.file.attribute.FileTime.from(((java.time.Instant)v2));
    Object v4 = ((java.util.zip.ZipEntry)v1).setLastAccessTime(((java.nio.file.attribute.FileTime)v3));
    Object v5 = ((java.util.zip.ZipEntry)v4).getTime();
    org.junit.Assert.assertEquals((Object)(-1L), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = "archive contains more than 65535 entries.";
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v0));
    Object v2 = java.time.Instant.now();
    Object v3 = java.nio.file.attribute.FileTime.from(((java.time.Instant)v2));
    Object v4 = ((java.util.zip.ZipEntry)v1).setLastAccessTime(((java.nio.file.attribute.FileTime)v3));
    Object v5 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField();
    ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v4).addExtraField(((org.apache.commons.compress.archivers.zip.ZipExtraField)v5));
    Object v6 = null;
    ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v4).removeUnparseableExtraFieldData();
    Object v7 = null;
      org.junit.Assert.fail("Expected java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = "archive contains more than 65535 entries.";
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v0));
    Object v2 = java.time.Instant.now();
    Object v3 = java.nio.file.attribute.FileTime.from(((java.time.Instant)v2));
    Object v4 = ((java.util.zip.ZipEntry)v1).setLastAccessTime(((java.nio.file.attribute.FileTime)v3));
    Object v5 = new org.apache.commons.compress.archivers.zip.ZipExtraField[]{null};
    ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v4).setExtraFields(((org.apache.commons.compress.archivers.zip.ZipExtraField[])v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = "archive contains more than 65535 entries.";
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v0));
    Object v2 = "";
    ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v1).setName(((java.lang.String)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "";
    Object v2 = new java.io.File(((java.io.File)v0),((java.lang.String)v1));
    Object v3 = "SEUID";
    Object v4 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(((java.io.File)v2),((java.lang.String)v3));
    Object v5 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = "archive contains more than 65535 entries.";
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v0));
    Object v2 = java.time.Instant.now();
    Object v3 = java.nio.file.attribute.FileTime.from(((java.time.Instant)v2));
    Object v4 = ((java.util.zip.ZipEntry)v1).setLastAccessTime(((java.nio.file.attribute.FileTime)v3));
    Object v5 = 8;
    ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v4).setUnixMode((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = null;
    Object v1 = "";
    Object v2 = new java.io.File(((java.io.File)v0),((java.lang.String)v1));
    Object v3 = "SEUID";
    Object v4 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(((java.io.File)v2),((java.lang.String)v3));
    Object v5 = ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v4).getLocalFileDataExtra();
    Object v6 = new org.apache.commons.compress.archivers.zip.GeneralPurposeBit();
    Object v7 = ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v4).equals(((java.lang.Object)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = null;
    Object v1 = "";
    Object v2 = new java.io.File(((java.io.File)v0),((java.lang.String)v1));
    Object v3 = "SEUID";
    Object v4 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(((java.io.File)v2),((java.lang.String)v3));
    Object v5 = "archive contains more than 65535 entries.";
    Object v6 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v5));
    Object v7 = java.time.Instant.now();
    Object v8 = java.nio.file.attribute.FileTime.from(((java.time.Instant)v7));
    Object v9 = ((java.util.zip.ZipEntry)v6).setLastAccessTime(((java.nio.file.attribute.FileTime)v8));
    Object v10 = 4L;
    ((java.util.zip.ZipEntry)v9).setTime((((java.lang.Long)v10).longValue()));
    Object v11 = null;
    Object v12 = ((java.util.zip.ZipEntry)v9).getTimeLocal();
    ((java.util.zip.ZipEntry)v4).setTimeLocal(((java.time.LocalDateTime)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = "archive contains more than 65535 entries.";
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v0));
    Object v2 = java.time.Instant.now();
    Object v3 = java.nio.file.attribute.FileTime.from(((java.time.Instant)v2));
    Object v4 = ((java.util.zip.ZipEntry)v1).setLastAccessTime(((java.nio.file.attribute.FileTime)v3));
    Object v5 = ((java.util.zip.ZipEntry)v4).getTime();
    Object v6 = 13L;
    ((java.util.zip.ZipEntry)v4).setCrc((((java.lang.Long)v6).longValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = null;
    Object v1 = "";
    Object v2 = new java.io.File(((java.io.File)v0),((java.lang.String)v1));
    Object v3 = "SEUID";
    Object v4 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(((java.io.File)v2),((java.lang.String)v3));
    Object v5 = true;
    Object v6 = ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v4).getExtraFields((((java.lang.Boolean)v5).booleanValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = null;
    Object v1 = "";
    Object v2 = new java.io.File(((java.io.File)v0),((java.lang.String)v1));
    Object v3 = "SEUID";
    Object v4 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(((java.io.File)v2),((java.lang.String)v3));
    Object v5 = 0L;
    ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v4).setSize((((java.lang.Long)v5).longValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "";
    Object v2 = new java.io.File(((java.io.File)v0),((java.lang.String)v1));
    Object v3 = "SEUID";
    Object v4 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(((java.io.File)v2),((java.lang.String)v3));
    Object v5 = -15;
    Object v6 = new org.apache.commons.compress.archivers.zip.ZipShort((((java.lang.Integer)v5).intValue()));
    ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v4).removeExtraField(((org.apache.commons.compress.archivers.zip.ZipShort)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = null;
    Object v1 = "";
    Object v2 = new java.io.File(((java.io.File)v0),((java.lang.String)v1));
    Object v3 = "SEUID";
    Object v4 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(((java.io.File)v2),((java.lang.String)v3));
    Object v5 = 0L;
    ((java.util.zip.ZipEntry)v4).setCrc((((java.lang.Long)v5).longValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = null;
    Object v1 = "";
    Object v2 = new java.io.File(((java.io.File)v0),((java.lang.String)v1));
    Object v3 = " packed streams, first files of ";
    Object v4 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(((java.io.File)v2),((java.lang.String)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = "archive contains more than 65535 entries.";
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v0));
    Object v2 = java.time.Instant.now();
    Object v3 = java.nio.file.attribute.FileTime.from(((java.time.Instant)v2));
    Object v4 = ((java.util.zip.ZipEntry)v1).setLastAccessTime(((java.nio.file.attribute.FileTime)v3));
    Object v5 = ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v4).isDirectory();
    Object v6 = ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v4).getLocalFileDataExtra();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = null;
    Object v1 = "";
    Object v2 = new java.io.File(((java.io.File)v0),((java.lang.String)v1));
    Object v3 = " packed streams, first files of ";
    Object v4 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(((java.io.File)v2),((java.lang.String)v3));
    Object v5 = 4L;
    ((java.util.zip.ZipEntry)v4).setCrc((((java.lang.Long)v5).longValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = null;
    Object v1 = "";
    Object v2 = new java.io.File(((java.io.File)v0),((java.lang.String)v1));
    Object v3 = ((java.io.File)v2).toURI();
    Object v4 = "(";
    Object v5 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(((java.io.File)v2),((java.lang.String)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = null;
    Object v1 = "";
    Object v2 = new java.io.File(((java.io.File)v0),((java.lang.String)v1));
    Object v3 = "SEUID";
    Object v4 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(((java.io.File)v2),((java.lang.String)v3));
    Object v5 = 54L;
    ((java.util.zip.ZipEntry)v4).setCrc((((java.lang.Long)v5).longValue()));
    Object v6 = null;
    Object v7 = ((java.util.zip.ZipEntry)v4).getLastModifiedTime();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = null;
    Object v1 = "";
    Object v2 = new java.io.File(((java.io.File)v0),((java.lang.String)v1));
    Object v3 = " packed streams, first files of ";
    Object v4 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(((java.io.File)v2),((java.lang.String)v3));
    Object v5 = ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v4).getRawName();
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = "archive contains more than 65535 entries.";
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v0));
    Object v2 = ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v1).getRawName();
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = null;
    Object v1 = "";
    Object v2 = new java.io.File(((java.io.File)v0),((java.lang.String)v1));
    Object v3 = " packed streams, first files of ";
    Object v4 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(((java.io.File)v2),((java.lang.String)v3));
    Object v5 = ((java.util.zip.ZipEntry)v4).getTimeLocal();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = "00";
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = null;
    Object v1 = "";
    Object v2 = new java.io.File(((java.io.File)v0),((java.lang.String)v1));
    Object v3 = " packed streams, first files of ";
    Object v4 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(((java.io.File)v2),((java.lang.String)v3));
    Object v5 = 2;
    ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v4).setRawFlag((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = null;
    Object v1 = "";
    Object v2 = new java.io.File(((java.io.File)v0),((java.lang.String)v1));
    Object v3 = " packed streams, first files of ";
    Object v4 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(((java.io.File)v2),((java.lang.String)v3));
    Object v5 = "SCHILY.recalsize";
    ((java.util.zip.ZipEntry)v4).setComment(((java.lang.String)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = null;
    Object v1 = "";
    Object v2 = new java.io.File(((java.io.File)v0),((java.lang.String)v1));
    Object v3 = " packed streams, first files of ";
    Object v4 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(((java.io.File)v2),((java.lang.String)v3));
    Object v5 = -15;
    Object v6 = new org.apache.commons.compress.archivers.zip.ZipShort((((java.lang.Integer)v5).intValue()));
    Object v7 = ((org.apache.commons.compress.archivers.zip.ZipShort)v6).clone();
    Object v8 = ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v4).getExtraField(((org.apache.commons.compress.archivers.zip.ZipShort)v6));
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = null;
    Object v1 = "";
    Object v2 = new java.io.File(((java.io.File)v0),((java.lang.String)v1));
    Object v3 = ((java.io.File)v2).toURI();
    Object v4 = "(";
    Object v5 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(((java.io.File)v2),((java.lang.String)v4));
    Object v6 = ((java.util.zip.ZipEntry)v5).toString();
    org.junit.Assert.assertEquals((Object)("("), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = null;
    Object v1 = "";
    Object v2 = new java.io.File(((java.io.File)v0),((java.lang.String)v1));
    Object v3 = " packed streams, first files of ";
    Object v4 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(((java.io.File)v2),((java.lang.String)v3));
    Object v5 = "archive contains more than 65535 entries.";
    Object v6 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v5));
    Object v7 = ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v6).getLocalFileDataExtra();
    Object v8 = ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v6).getVersionRequired();
    Object v9 = ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v4).equals(((java.lang.Object)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = null;
    Object v1 = "";
    Object v2 = new java.io.File(((java.io.File)v0),((java.lang.String)v1));
    Object v3 = " packed streams, first files of ";
    Object v4 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(((java.io.File)v2),((java.lang.String)v3));
    Object v5 = ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v4).getName();
    org.junit.Assert.assertEquals((Object)(" packed streams, first files of "), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = null;
    Object v1 = "";
    Object v2 = new java.io.File(((java.io.File)v0),((java.lang.String)v1));
    Object v3 = " packed streams, first files of ";
    Object v4 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(((java.io.File)v2),((java.lang.String)v3));
    Object v5 = false;
    Object v6 = ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v4).getExtraFields((((java.lang.Boolean)v5).booleanValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = null;
    Object v1 = "";
    Object v2 = new java.io.File(((java.io.File)v0),((java.lang.String)v1));
    Object v3 = " packed streams, first files of ";
    Object v4 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(((java.io.File)v2),((java.lang.String)v3));
    Object v5 = 30;
    ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v4).setMethod((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "";
    Object v2 = new java.io.File(((java.io.File)v0),((java.lang.String)v1));
    Object v3 = " packed streams, first files of ";
    Object v4 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(((java.io.File)v2),((java.lang.String)v3));
    Object v5 = 1L;
    ((java.util.zip.ZipEntry)v4).setCrc((((java.lang.Long)v5).longValue()));
    Object v6 = null;
    Object v7 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(((java.util.zip.ZipEntry)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = "00";
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(((java.lang.String)v0));
    Object v2 = "archive contains more than 65535 entries.";
    Object v3 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v2));
    Object v4 = java.time.Instant.now();
    Object v5 = java.nio.file.attribute.FileTime.from(((java.time.Instant)v4));
    Object v6 = ((java.util.zip.ZipEntry)v3).setLastAccessTime(((java.nio.file.attribute.FileTime)v5));
    Object v7 = 4L;
    ((java.util.zip.ZipEntry)v6).setTime((((java.lang.Long)v7).longValue()));
    Object v8 = null;
    Object v9 = ((java.util.zip.ZipEntry)v6).getTimeLocal();
    ((java.util.zip.ZipEntry)v1).setTimeLocal(((java.time.LocalDateTime)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = null;
    Object v1 = "";
    Object v2 = new java.io.File(((java.io.File)v0),((java.lang.String)v1));
    Object v3 = "SEUID";
    Object v4 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(((java.io.File)v2),((java.lang.String)v3));
    Object v5 = 1L;
    ((java.util.zip.ZipEntry)v4).setCrc((((java.lang.Long)v5).longValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = null;
    Object v1 = "";
    Object v2 = new java.io.File(((java.io.File)v0),((java.lang.String)v1));
    Object v3 = " packed streams, first files of ";
    Object v4 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(((java.io.File)v2),((java.lang.String)v3));
    Object v5 = ((java.util.zip.ZipEntry)v4).getTimeLocal();
    Object v6 = ((java.util.zip.ZipEntry)v4).getComment();
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = "00";
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(((java.lang.String)v0));
    Object v2 = ((java.util.zip.ZipEntry)v1).isDirectory();
    Object v3 = null;
    Object v4 = "";
    Object v5 = new java.io.File(((java.io.File)v3),((java.lang.String)v4));
    Object v6 = " packed streams, first files of ";
    Object v7 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(((java.io.File)v5),((java.lang.String)v6));
    Object v8 = ((java.util.zip.ZipEntry)v7).getTimeLocal();
    ((java.util.zip.ZipEntry)v1).setTimeLocal(((java.time.LocalDateTime)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }
}
