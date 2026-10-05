package org.apache.commons.compress.archivers.zip;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = "Truncated ZIP entry: ";
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v0));
    Object v2 = ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v1).getName();
    org.junit.Assert.assertEquals((Object)("Truncated ZIP entry: "), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = "Truncated ZIP entry: ";
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v0));
    Object v2 = ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v1).getExtraFields();
    Object v3 = ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v1).getLocalFileDataExtra();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = "Truncated ZIP entry: ";
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v0));
    Object v2 = ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v1).getLocalFileDataExtra();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = "Truncated ZIP entry: ";
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v0));
    Object v2 = ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v1).getLastModifiedDate();
    Object v3 = ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v1).getName();
    org.junit.Assert.assertEquals((Object)("Truncated ZIP entry: "), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = "Truncated ZIP entry: ";
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v0));
    Object v2 = -17L;
    ((java.util.zip.ZipEntry)v1).setCrc((((java.lang.Long)v2).longValue()));
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = "Truncated ZIP entry: ";
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v0));
    Object v2 = 2082L;
    ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v1).setExternalAttributes((((java.lang.Long)v2).longValue()));
    Object v3 = null;
    Object v4 = ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v1).getExtraFields();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = "Truncated ZIP entry: ";
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v0));
    Object v2 = ((java.util.zip.ZipEntry)v1).getLastModifiedTime();
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = "Truncated ZIP entry: ";
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v0));
    Object v2 = ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v1).clone();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = "Truncated ZIP entry: ";
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v0));
    Object v2 = ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v1).clone();
    Object v3 = -20;
    ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v2).setUnixMode((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = "Stream has already been finis1ed";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = "/";
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(((java.io.File)v1),((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = "Truncated ZIP entry: ";
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v0));
    Object v2 = ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v1).clone();
    Object v3 = 6L;
    ((java.util.zip.ZipEntry)v2).setTime((((java.lang.Long)v3).longValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = "Truncated ZIP entry: ";
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v0));
    Object v2 = ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v1).clone();
    Object v3 = 255L;
    ((java.util.zip.ZipEntry)v2).setCrc((((java.lang.Long)v3).longValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = "Truncated ZIP entry: ";
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v0));
    Object v2 = ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v1).clone();
    Object v3 = 48L;
    Object v4 = java.util.concurrent.TimeUnit.MINUTES;
    Object v5 = java.nio.file.attribute.FileTime.from((((java.lang.Long)v3).longValue()),((java.util.concurrent.TimeUnit)v4));
    Object v6 = ((java.util.zip.ZipEntry)v2).setLastAccessTime(((java.nio.file.attribute.FileTime)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = "Truncated ZIP entry: ";
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v0));
    Object v2 = ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v1).clone();
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(((java.util.zip.ZipEntry)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = "Truncated ZIP entry: ";
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v0));
    Object v2 = ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v1).clone();
    Object v3 = new byte[]{Byte.valueOf((byte)-9),Byte.valueOf((byte)110),Byte.valueOf((byte)-40)};
    Object v4 = new org.apache.commons.compress.archivers.zip.ZipShort(((byte[])v3));
    Object v5 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.createExtraField(((org.apache.commons.compress.archivers.zip.ZipShort)v4));
    ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v2).addAsFirstExtraField(((org.apache.commons.compress.archivers.zip.ZipExtraField)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = "Truncated ZIP entry: ";
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v0));
    Object v2 = ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v1).clone();
    Object v3 = new byte[]{Byte.valueOf((byte)-9),Byte.valueOf((byte)110),Byte.valueOf((byte)-40)};
    Object v4 = new org.apache.commons.compress.archivers.zip.ZipShort(((byte[])v3));
    Object v5 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.createExtraField(((org.apache.commons.compress.archivers.zip.ZipShort)v4));
    ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v2).addExtraField(((org.apache.commons.compress.archivers.zip.ZipExtraField)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = "Truncated ZIP entry: ";
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v0));
    Object v2 = ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v1).clone();
    Object v3 = 48L;
    Object v4 = java.util.concurrent.TimeUnit.MINUTES;
    Object v5 = java.nio.file.attribute.FileTime.from((((java.lang.Long)v3).longValue()),((java.util.concurrent.TimeUnit)v4));
    Object v6 = ((java.util.zip.ZipEntry)v2).setLastAccessTime(((java.nio.file.attribute.FileTime)v5));
    Object v7 = 137L;
    ((java.util.zip.ZipEntry)v6).setSize((((java.lang.Long)v7).longValue()));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = "Truncated ZIP entry: ";
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v0));
    Object v2 = ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v1).clone();
    Object v3 = 0L;
    ((java.util.zip.ZipEntry)v2).setTime((((java.lang.Long)v3).longValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = "Truncated ZIP entry: ";
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v0));
    Object v2 = ((java.util.zip.ZipEntry)v1).getTime();
    org.junit.Assert.assertEquals((Object)(-1L), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = "Truncated ZIP entry: ";
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v0));
    Object v2 = ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v1).clone();
    Object v3 = 48L;
    Object v4 = java.util.concurrent.TimeUnit.MINUTES;
    Object v5 = java.nio.file.attribute.FileTime.from((((java.lang.Long)v3).longValue()),((java.util.concurrent.TimeUnit)v4));
    Object v6 = ((java.util.zip.ZipEntry)v2).setLastAccessTime(((java.nio.file.attribute.FileTime)v5));
    Object v7 = ((java.util.zip.ZipEntry)v6).getTime();
    org.junit.Assert.assertEquals((Object)(-1L), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = "Truncated ZIP entry: ";
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v0));
    Object v2 = ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v1).clone();
    Object v3 = new byte[]{Byte.valueOf((byte)-9),Byte.valueOf((byte)110),Byte.valueOf((byte)-40)};
    Object v4 = new org.apache.commons.compress.archivers.zip.ZipShort(((byte[])v3));
    ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v2).removeExtraField(((org.apache.commons.compress.archivers.zip.ZipShort)v4));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = "Truncated ZIP entry: ";
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v0));
    Object v2 = ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v1).clone();
    Object v3 = ((java.util.zip.ZipEntry)v2).getLastModifiedTime();
    Object v4 = ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v2).getLocalFileDataExtra();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = "Truncated ZIP entry: ";
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v0));
    Object v2 = ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v1).clone();
    Object v3 = 48L;
    Object v4 = java.util.concurrent.TimeUnit.MINUTES;
    Object v5 = java.nio.file.attribute.FileTime.from((((java.lang.Long)v3).longValue()),((java.util.concurrent.TimeUnit)v4));
    Object v6 = ((java.util.zip.ZipEntry)v2).setLastAccessTime(((java.nio.file.attribute.FileTime)v5));
    Object v7 = ((java.util.zip.ZipEntry)v6).getLastModifiedTime();
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = "Truncated ZIP entry: ";
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v0));
    Object v2 = ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v1).clone();
    Object v3 = 48L;
    Object v4 = java.util.concurrent.TimeUnit.MINUTES;
    Object v5 = java.nio.file.attribute.FileTime.from((((java.lang.Long)v3).longValue()),((java.util.concurrent.TimeUnit)v4));
    Object v6 = ((java.util.zip.ZipEntry)v2).setLastAccessTime(((java.nio.file.attribute.FileTime)v5));
    Object v7 = 1L;
    ((java.util.zip.ZipEntry)v6).setTime((((java.lang.Long)v7).longValue()));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = "Truncated ZIP entry: ";
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v0));
    Object v2 = ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v1).clone();
    Object v3 = 48L;
    Object v4 = java.util.concurrent.TimeUnit.MINUTES;
    Object v5 = java.nio.file.attribute.FileTime.from((((java.lang.Long)v3).longValue()),((java.util.concurrent.TimeUnit)v4));
    Object v6 = ((java.util.zip.ZipEntry)v2).setLastAccessTime(((java.nio.file.attribute.FileTime)v5));
    Object v7 = ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v6).getExtraFields();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = "Truncated ZIP entry: ";
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v0));
    Object v2 = ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v1).clone();
    Object v3 = "/x";
    ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v2).setName(((java.lang.String)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = "Truncated ZIP entry: ";
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v0));
    Object v2 = ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v1).clone();
    Object v3 = 48L;
    Object v4 = java.util.concurrent.TimeUnit.MINUTES;
    Object v5 = java.nio.file.attribute.FileTime.from((((java.lang.Long)v3).longValue()),((java.util.concurrent.TimeUnit)v4));
    Object v6 = ((java.util.zip.ZipEntry)v2).setLastAccessTime(((java.nio.file.attribute.FileTime)v5));
    Object v7 = 0;
    Object v8 = java.time.Month.JUNE;
    Object v9 = 28;
    Object v10 = 1;
    Object v11 = 28;
    Object v12 = java.time.LocalDateTime.of((((java.lang.Integer)v7).intValue()),((java.time.Month)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    ((java.util.zip.ZipEntry)v6).setTimeLocal(((java.time.LocalDateTime)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = "Truncated ZIP entry: ";
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v0));
    Object v2 = ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v1).clone();
    Object v3 = 48L;
    Object v4 = java.util.concurrent.TimeUnit.MINUTES;
    Object v5 = java.nio.file.attribute.FileTime.from((((java.lang.Long)v3).longValue()),((java.util.concurrent.TimeUnit)v4));
    Object v6 = ((java.util.zip.ZipEntry)v2).setLastAccessTime(((java.nio.file.attribute.FileTime)v5));
    Object v7 = 13;
    ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v6).setMethod((((java.lang.Integer)v7).intValue()));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = "Truncated ZIP entry: ";
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v0));
    Object v2 = 48L;
    Object v3 = java.util.concurrent.TimeUnit.MINUTES;
    Object v4 = java.nio.file.attribute.FileTime.from((((java.lang.Long)v2).longValue()),((java.util.concurrent.TimeUnit)v3));
    Object v5 = ((java.util.zip.ZipEntry)v1).setCreationTime(((java.nio.file.attribute.FileTime)v4));
    Object v6 = new byte[]{Byte.valueOf((byte)-9),Byte.valueOf((byte)110),Byte.valueOf((byte)-40)};
    Object v7 = new org.apache.commons.compress.archivers.zip.ZipShort(((byte[])v6));
    ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v1).removeExtraField(((org.apache.commons.compress.archivers.zip.ZipShort)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = "Truncated ZIP entry: ";
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v0));
    Object v2 = ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v1).clone();
    Object v3 = 48L;
    Object v4 = java.util.concurrent.TimeUnit.MINUTES;
    Object v5 = java.nio.file.attribute.FileTime.from((((java.lang.Long)v3).longValue()),((java.util.concurrent.TimeUnit)v4));
    Object v6 = ((java.util.zip.ZipEntry)v2).setLastAccessTime(((java.nio.file.attribute.FileTime)v5));
    Object v7 = 1L;
    ((java.util.zip.ZipEntry)v6).setSize((((java.lang.Long)v7).longValue()));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = "Truncated ZIP entry: ";
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v0));
    Object v2 = ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v1).clone();
    Object v3 = 48L;
    Object v4 = java.util.concurrent.TimeUnit.MINUTES;
    Object v5 = java.nio.file.attribute.FileTime.from((((java.lang.Long)v3).longValue()),((java.util.concurrent.TimeUnit)v4));
    Object v6 = ((java.util.zip.ZipEntry)v2).setLastAccessTime(((java.nio.file.attribute.FileTime)v5));
    Object v7 = new byte[]{Byte.valueOf((byte)-9),Byte.valueOf((byte)110),Byte.valueOf((byte)-40)};
    Object v8 = new org.apache.commons.compress.archivers.zip.ZipShort(((byte[])v7));
    Object v9 = ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v6).getExtraField(((org.apache.commons.compress.archivers.zip.ZipShort)v8));
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = "Truncated ZIP entry: ";
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v0));
    Object v2 = 1;
    ((java.util.zip.ZipEntry)v1).setMethod((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    Object v4 = ((java.util.zip.ZipEntry)v1).getExtra();
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = "Truncated ZIP entry: ";
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v0));
    Object v2 = ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v1).getUnixMode();
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = "Truncated ZIP entry: ";
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v0));
    Object v2 = ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v1).clone();
    Object v3 = 48L;
    Object v4 = java.util.concurrent.TimeUnit.MINUTES;
    Object v5 = java.nio.file.attribute.FileTime.from((((java.lang.Long)v3).longValue()),((java.util.concurrent.TimeUnit)v4));
    Object v6 = ((java.util.zip.ZipEntry)v2).setLastAccessTime(((java.nio.file.attribute.FileTime)v5));
    Object v7 = new byte[]{Byte.valueOf((byte)-9),Byte.valueOf((byte)110),Byte.valueOf((byte)-40)};
    Object v8 = new org.apache.commons.compress.archivers.zip.ZipShort(((byte[])v7));
    Object v9 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.createExtraField(((org.apache.commons.compress.archivers.zip.ZipShort)v8));
    ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v6).addAsFirstExtraField(((org.apache.commons.compress.archivers.zip.ZipExtraField)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = "Truncated ZIP entry: ";
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v0));
    Object v2 = ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v1).clone();
    Object v3 = 48L;
    Object v4 = java.util.concurrent.TimeUnit.MINUTES;
    Object v5 = java.nio.file.attribute.FileTime.from((((java.lang.Long)v3).longValue()),((java.util.concurrent.TimeUnit)v4));
    Object v6 = ((java.util.zip.ZipEntry)v2).setLastAccessTime(((java.nio.file.attribute.FileTime)v5));
    Object v7 = ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v6).clone();
    Object v8 = new byte[]{Byte.valueOf((byte)-9),Byte.valueOf((byte)110),Byte.valueOf((byte)-40)};
    Object v9 = new org.apache.commons.compress.archivers.zip.ZipShort(((byte[])v8));
    Object v10 = ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v6).getExtraField(((org.apache.commons.compress.archivers.zip.ZipShort)v9));
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = "Truncated ZIP entry: ";
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v0));
    Object v2 = " byte but got '";
    ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v1).setName(((java.lang.String)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = "Truncated ZIP entry: ";
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v0));
    Object v2 = ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v1).clone();
    Object v3 = 48L;
    Object v4 = java.util.concurrent.TimeUnit.MINUTES;
    Object v5 = java.nio.file.attribute.FileTime.from((((java.lang.Long)v3).longValue()),((java.util.concurrent.TimeUnit)v4));
    Object v6 = ((java.util.zip.ZipEntry)v2).setLastAccessTime(((java.nio.file.attribute.FileTime)v5));
    Object v7 = 48L;
    Object v8 = java.util.concurrent.TimeUnit.MINUTES;
    Object v9 = java.nio.file.attribute.FileTime.from((((java.lang.Long)v7).longValue()),((java.util.concurrent.TimeUnit)v8));
    Object v10 = ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v6).equals(((java.lang.Object)v9));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = "Truncated ZIP entry: ";
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v0));
    Object v2 = ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v1).clone();
    Object v3 = 48L;
    Object v4 = java.util.concurrent.TimeUnit.MINUTES;
    Object v5 = java.nio.file.attribute.FileTime.from((((java.lang.Long)v3).longValue()),((java.util.concurrent.TimeUnit)v4));
    Object v6 = ((java.util.zip.ZipEntry)v2).setLastAccessTime(((java.nio.file.attribute.FileTime)v5));
    Object v7 = ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v6).getCentralDirectoryExtra();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = "Truncated ZIP entry: ";
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v0));
    Object v2 = ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v1).clone();
    Object v3 = 48L;
    Object v4 = java.util.concurrent.TimeUnit.MINUTES;
    Object v5 = java.nio.file.attribute.FileTime.from((((java.lang.Long)v3).longValue()),((java.util.concurrent.TimeUnit)v4));
    Object v6 = ((java.util.zip.ZipEntry)v2).setLastAccessTime(((java.nio.file.attribute.FileTime)v5));
    Object v7 = ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v6).getName();
    org.junit.Assert.assertEquals((Object)("Truncated ZIP entry: "), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = "Truncated ZIP entry: ";
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v0));
    Object v2 = ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v1).clone();
    Object v3 = 48L;
    Object v4 = java.util.concurrent.TimeUnit.MINUTES;
    Object v5 = java.nio.file.attribute.FileTime.from((((java.lang.Long)v3).longValue()),((java.util.concurrent.TimeUnit)v4));
    Object v6 = ((java.util.zip.ZipEntry)v2).setLastAccessTime(((java.nio.file.attribute.FileTime)v5));
    Object v7 = ((java.util.zip.ZipEntry)v6).getLastModifiedTime();
    Object v8 = new byte[]{Byte.valueOf((byte)-9),Byte.valueOf((byte)110),Byte.valueOf((byte)-40)};
    Object v9 = new org.apache.commons.compress.archivers.zip.ZipShort(((byte[])v8));
    Object v10 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.createExtraField(((org.apache.commons.compress.archivers.zip.ZipShort)v9));
    Object v11 = new byte[]{Byte.valueOf((byte)6)};
    Object v12 = 0;
    Object v13 = 0;
    ((org.apache.commons.compress.archivers.zip.ZipExtraField)v10).parseFromLocalFileData(((byte[])v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v14 = null;
    ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v6).addExtraField(((org.apache.commons.compress.archivers.zip.ZipExtraField)v10));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = "Truncated ZIP entry: ";
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v0));
    Object v2 = ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v1).clone();
    Object v3 = 48L;
    Object v4 = java.util.concurrent.TimeUnit.MINUTES;
    Object v5 = java.nio.file.attribute.FileTime.from((((java.lang.Long)v3).longValue()),((java.util.concurrent.TimeUnit)v4));
    Object v6 = ((java.util.zip.ZipEntry)v2).setLastAccessTime(((java.nio.file.attribute.FileTime)v5));
    Object v7 = ((java.util.zip.ZipEntry)v6).getTimeLocal();
      org.junit.Assert.fail("Expected java.time.DateTimeException");
    } catch (java.time.DateTimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = "Truncated ZIP entry: ";
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v0));
    Object v2 = ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v1).clone();
    Object v3 = 48L;
    Object v4 = java.util.concurrent.TimeUnit.MINUTES;
    Object v5 = java.nio.file.attribute.FileTime.from((((java.lang.Long)v3).longValue()),((java.util.concurrent.TimeUnit)v4));
    Object v6 = ((java.util.zip.ZipEntry)v2).setLastAccessTime(((java.nio.file.attribute.FileTime)v5));
    Object v7 = 2L;
    ((java.util.zip.ZipEntry)v6).setSize((((java.lang.Long)v7).longValue()));
    Object v8 = null;
    Object v9 = ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v6).getMethod();
    org.junit.Assert.assertEquals((Object)(-1), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = "Truncated ZIP entry: ";
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v0));
    Object v2 = ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v1).clone();
    Object v3 = ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v2).clone();
    Object v4 = ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v2).getUnixMode();
    org.junit.Assert.assertEquals((Object)(0), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = "Truncated ZIP entry: ";
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v0));
    Object v2 = ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v1).clone();
    Object v3 = ((java.util.zip.ZipEntry)v2).getTimeLocal();
      org.junit.Assert.fail("Expected java.time.DateTimeException");
    } catch (java.time.DateTimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = "Stream has already been finis1ed";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = ".svgz";
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(((java.io.File)v1),((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = "Stream has already been finis1ed";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = ".svgz";
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(((java.io.File)v1),((java.lang.String)v2));
    Object v4 = 30;
    ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v3).setInternalAttributes((((java.lang.Integer)v4).intValue()));
    Object v5 = null;
    Object v6 = new org.apache.commons.compress.archivers.zip.ZipExtraField[]{};
    ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v3).setExtraFields(((org.apache.commons.compress.archivers.zip.ZipExtraField[])v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = "Truncated ZIP entry: ";
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v0));
    Object v2 = ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v1).clone();
    Object v3 = ((java.util.zip.ZipEntry)v2).getTime();
    Object v4 = ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v2).getExtraFields();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = "This archives contains unclosed entries.";
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = "Stream has already been finis1ed";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = ".svgz";
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(((java.io.File)v1),((java.lang.String)v2));
    Object v4 = ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v3).getLastModifiedDate();
    Object v5 = 0;
    ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v3).setMethod((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = "This archives contains unclosed entries.";
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(((java.lang.String)v0));
    Object v2 = ((java.util.zip.ZipEntry)v1).getSize();
    org.junit.Assert.assertEquals((Object)(-1L), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = "This archives contains unclosed entries.";
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(((java.lang.String)v0));
    Object v2 = ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v1).getLocalFileDataExtra();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = "This archives contains unclosed entries.";
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(((java.lang.String)v0));
    Object v2 = 1L;
    ((java.util.zip.ZipEntry)v1).setCrc((((java.lang.Long)v2).longValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = "Truncated ZIP entry: ";
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v0));
    Object v2 = ((java.util.zip.ZipEntry)v1).getLastModifiedTime();
    Object v3 = new byte[]{Byte.valueOf((byte)-9),Byte.valueOf((byte)110),Byte.valueOf((byte)-40)};
    Object v4 = new org.apache.commons.compress.archivers.zip.ZipShort(((byte[])v3));
    Object v5 = ((org.apache.commons.compress.archivers.zip.ZipShort)v4).getBytes();
    Object v6 = ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v1).getExtraField(((org.apache.commons.compress.archivers.zip.ZipShort)v4));
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = "Stream has already been finis1ed";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = ".svgz";
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(((java.io.File)v1),((java.lang.String)v2));
    Object v4 = new org.apache.commons.compress.archivers.zip.ZipExtraField[]{null,null};
    ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v3).setExtraFields(((org.apache.commons.compress.archivers.zip.ZipExtraField[])v4));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = "Truncated ZIP entry: ";
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v0));
    Object v2 = ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v1).clone();
    Object v3 = 1L;
    ((java.util.zip.ZipEntry)v2).setCrc((((java.lang.Long)v3).longValue()));
    Object v4 = null;
    Object v5 = "Truncated ZIP entry: ";
    Object v6 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v5));
    Object v7 = 2082L;
    ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v6).setExternalAttributes((((java.lang.Long)v7).longValue()));
    Object v8 = null;
    Object v9 = ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v6).getExtraFields();
    Object v10 = ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v2).equals(((java.lang.Object)v9));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = "Stream has already been finis1ed";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = "/";
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(((java.io.File)v1),((java.lang.String)v2));
    Object v4 = 0;
    Object v5 = java.time.Month.JUNE;
    Object v6 = 28;
    Object v7 = 1;
    Object v8 = 28;
    Object v9 = java.time.LocalDateTime.of((((java.lang.Integer)v4).intValue()),((java.time.Month)v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    ((java.util.zip.ZipEntry)v3).setTimeLocal(((java.time.LocalDateTime)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = "This archives contains unclosed entries.";
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(((java.lang.String)v0));
    Object v2 = ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v1).isSupportedCompressionMethod();
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = "This archives contains unclosed entries.";
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(((java.lang.String)v0));
    Object v2 = ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v1).isDirectory();
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = "This archives contains unclosed entries.";
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(((java.lang.String)v0));
    Object v2 = new byte[]{};
    ((java.util.zip.ZipEntry)v1).setExtra(((byte[])v2));
    Object v3 = null;
    Object v4 = 255L;
    ((java.util.zip.ZipEntry)v1).setSize((((java.lang.Long)v4).longValue()));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = "This archives contains unclosed entries.";
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(((java.lang.String)v0));
    Object v2 = 2L;
    ((java.util.zip.ZipEntry)v1).setCompressedSize((((java.lang.Long)v2).longValue()));
    Object v3 = null;
    Object v4 = new byte[]{Byte.valueOf((byte)-9),Byte.valueOf((byte)110),Byte.valueOf((byte)-40)};
    Object v5 = new org.apache.commons.compress.archivers.zip.ZipShort(((byte[])v4));
    Object v6 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.createExtraField(((org.apache.commons.compress.archivers.zip.ZipShort)v5));
    ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v1).addExtraField(((org.apache.commons.compress.archivers.zip.ZipExtraField)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = "Truncated ZIP entry: ";
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v0));
    Object v2 = ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v1).clone();
    Object v3 = 48L;
    Object v4 = java.util.concurrent.TimeUnit.MINUTES;
    Object v5 = java.nio.file.attribute.FileTime.from((((java.lang.Long)v3).longValue()),((java.util.concurrent.TimeUnit)v4));
    Object v6 = ((java.util.zip.ZipEntry)v2).setLastAccessTime(((java.nio.file.attribute.FileTime)v5));
    Object v7 = ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v6).getLocalFileDataExtra();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = "Truncated ZIP entry: ";
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v0));
    Object v2 = ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v1).clone();
    Object v3 = 16;
    ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v2).setUnixMode((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    Object v5 = new byte[]{Byte.valueOf((byte)-9),Byte.valueOf((byte)110),Byte.valueOf((byte)-40)};
    Object v6 = new org.apache.commons.compress.archivers.zip.ZipShort(((byte[])v5));
    Object v7 = ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v2).getExtraField(((org.apache.commons.compress.archivers.zip.ZipShort)v6));
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = "Truncated ZIP entry: ";
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v0));
    Object v2 = ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v1).clone();
    Object v3 = new byte[]{Byte.valueOf((byte)-9),Byte.valueOf((byte)110),Byte.valueOf((byte)-40)};
    Object v4 = new org.apache.commons.compress.archivers.zip.ZipShort(((byte[])v3));
    Object v5 = ((org.apache.commons.compress.archivers.zip.ZipShort)v4).clone();
    ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v2).removeExtraField(((org.apache.commons.compress.archivers.zip.ZipShort)v4));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = "This archives contains unclosed entries.";
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(((java.lang.String)v0));
    Object v2 = -1;
    ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v1).setMethod((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = "This archives contains unclosed entries.";
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(((java.lang.String)v0));
    Object v2 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(((java.util.zip.ZipEntry)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = "This archives contains unclosed entries.";
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(((java.lang.String)v0));
    Object v2 = 0;
    Object v3 = java.time.Month.JUNE;
    Object v4 = 28;
    Object v5 = 1;
    Object v6 = 28;
    Object v7 = java.time.LocalDateTime.of((((java.lang.Integer)v2).intValue()),((java.time.Month)v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    ((java.util.zip.ZipEntry)v1).setTimeLocal(((java.time.LocalDateTime)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = "Stream has already been finis1ed";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = ".svgz";
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(((java.io.File)v1),((java.lang.String)v2));
    Object v4 = ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v3).isSupportedCompressionMethod();
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = "This archives contains unclosed entries.";
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(((java.lang.String)v0));
    Object v2 = ((java.util.zip.ZipEntry)v1).clone();
    Object v3 = 48L;
    Object v4 = java.util.concurrent.TimeUnit.MINUTES;
    Object v5 = java.nio.file.attribute.FileTime.from((((java.lang.Long)v3).longValue()),((java.util.concurrent.TimeUnit)v4));
    Object v6 = ((java.util.zip.ZipEntry)v1).setLastAccessTime(((java.nio.file.attribute.FileTime)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = "Stream has already been finis1ed";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = "ustar\u0000";
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(((java.io.File)v1),((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = "This archives contains unclosed entries.";
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(((java.lang.String)v0));
    Object v2 = 0L;
    ((java.util.zip.ZipEntry)v1).setCrc((((java.lang.Long)v2).longValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = "Truncated ZIP entry: ";
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v0));
    Object v2 = ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v1).clone();
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipExtraField[]{null,null};
    ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v2).setExtraFields(((org.apache.commons.compress.archivers.zip.ZipExtraField[])v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = "Stream has already been finis1ed";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = "ustar\u0000";
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(((java.io.File)v1),((java.lang.String)v2));
    Object v4 = new org.apache.commons.compress.archivers.zip.ZipExtraField[]{null,null};
    ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v3).setExtraFields(((org.apache.commons.compress.archivers.zip.ZipExtraField[])v4));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = "This archives contains unclosed entries.";
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(((java.lang.String)v0));
    Object v2 = -2L;
    ((java.util.zip.ZipEntry)v1).setCrc((((java.lang.Long)v2).longValue()));
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = "Stream has already been finis1ed";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = "ustar\u0000";
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(((java.io.File)v1),((java.lang.String)v2));
    Object v4 = new org.apache.commons.compress.archivers.zip.ZipExtraField[]{};
    ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v3).setExtraFields(((org.apache.commons.compress.archivers.zip.ZipExtraField[])v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = "Stream has already been finis1ed";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = ".tar";
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(((java.io.File)v1),((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = "Stream has already been finis1ed";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = ".svgz";
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(((java.io.File)v1),((java.lang.String)v2));
    Object v4 = 1;
    ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v3).setUnixMode((((java.lang.Integer)v4).intValue()));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = "This archives contains unclosed entries.";
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(((java.lang.String)v0));
    Object v2 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)0),Byte.valueOf((byte)11)};
    ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v1).setExtra(((byte[])v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = "Stream has already been finis1ed";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = ".tar";
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(((java.io.File)v1),((java.lang.String)v2));
    Object v4 = 48L;
    Object v5 = java.util.concurrent.TimeUnit.MINUTES;
    Object v6 = java.nio.file.attribute.FileTime.from((((java.lang.Long)v4).longValue()),((java.util.concurrent.TimeUnit)v5));
    Object v7 = java.util.concurrent.TimeUnit.MINUTES;
    Object v8 = ((java.nio.file.attribute.FileTime)v6).to(((java.util.concurrent.TimeUnit)v7));
    Object v9 = ((java.util.zip.ZipEntry)v3).setLastModifiedTime(((java.nio.file.attribute.FileTime)v6));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = "Stream has already been finis1ed";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = ".tar";
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(((java.io.File)v1),((java.lang.String)v2));
    Object v4 = new byte[]{Byte.valueOf((byte)-9),Byte.valueOf((byte)110),Byte.valueOf((byte)-40)};
    Object v5 = new org.apache.commons.compress.archivers.zip.ZipShort(((byte[])v4));
    Object v6 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.createExtraField(((org.apache.commons.compress.archivers.zip.ZipShort)v5));
    ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v3).addExtraField(((org.apache.commons.compress.archivers.zip.ZipExtraField)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = "This archives contains unclosed entries.";
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(((java.lang.String)v0));
    Object v2 = ((java.util.zip.ZipEntry)v1).clone();
    Object v3 = 48L;
    Object v4 = java.util.concurrent.TimeUnit.MINUTES;
    Object v5 = java.nio.file.attribute.FileTime.from((((java.lang.Long)v3).longValue()),((java.util.concurrent.TimeUnit)v4));
    Object v6 = ((java.util.zip.ZipEntry)v1).setLastAccessTime(((java.nio.file.attribute.FileTime)v5));
    Object v7 = new byte[]{Byte.valueOf((byte)-9),Byte.valueOf((byte)110),Byte.valueOf((byte)-40)};
    Object v8 = new org.apache.commons.compress.archivers.zip.ZipShort(((byte[])v7));
    Object v9 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.createExtraField(((org.apache.commons.compress.archivers.zip.ZipShort)v8));
    ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v6).addAsFirstExtraField(((org.apache.commons.compress.archivers.zip.ZipExtraField)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = "Stream has already been finis1ed";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = ".tar";
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(((java.io.File)v1),((java.lang.String)v2));
    Object v4 = 48L;
    Object v5 = java.util.concurrent.TimeUnit.MINUTES;
    Object v6 = java.nio.file.attribute.FileTime.from((((java.lang.Long)v4).longValue()),((java.util.concurrent.TimeUnit)v5));
    Object v7 = ((java.nio.file.attribute.FileTime)v6).toString();
    Object v8 = ((java.util.zip.ZipEntry)v3).setLastModifiedTime(((java.nio.file.attribute.FileTime)v6));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = "This archives contains unclosed entries.";
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(((java.lang.String)v0));
    Object v2 = 47L;
    ((java.util.zip.ZipEntry)v1).setCrc((((java.lang.Long)v2).longValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = "Stream has already been finis1ed";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = ".svgz";
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(((java.io.File)v1),((java.lang.String)v2));
    Object v4 = ((java.util.zip.ZipEntry)v3).getTimeLocal();
    Object v5 = ((java.util.zip.ZipEntry)v3).getComment();
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = "This archives contains unclosed entries.";
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(((java.lang.String)v0));
    Object v2 = ((java.util.zip.ZipEntry)v1).getTimeLocal();
      org.junit.Assert.fail("Expected java.time.DateTimeException");
    } catch (java.time.DateTimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = "This archives contains unclosed entries.";
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(((java.lang.String)v0));
    Object v2 = ((java.util.zip.ZipEntry)v1).clone();
    Object v3 = 48L;
    Object v4 = java.util.concurrent.TimeUnit.MINUTES;
    Object v5 = java.nio.file.attribute.FileTime.from((((java.lang.Long)v3).longValue()),((java.util.concurrent.TimeUnit)v4));
    Object v6 = ((java.util.zip.ZipEntry)v1).setLastAccessTime(((java.nio.file.attribute.FileTime)v5));
    Object v7 = 1L;
    ((java.util.zip.ZipEntry)v6).setCrc((((java.lang.Long)v7).longValue()));
    Object v8 = null;
    Object v9 = "filemo";
    Object v10 = "Stream has/ already been finished";
    Object v11 = "Stream has already been finished";
    Object v12 = new java.net.URI(((java.lang.String)v9),((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v6).equals(((java.lang.Object)v12));
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = "This archives contains unclosed entries.";
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(((java.lang.String)v0));
    Object v2 = new byte[]{Byte.valueOf((byte)-9),Byte.valueOf((byte)110),Byte.valueOf((byte)-40)};
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipShort(((byte[])v2));
    ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v1).removeExtraField(((org.apache.commons.compress.archivers.zip.ZipShort)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = "This archives contains unclosed entries.";
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(((java.lang.String)v0));
    Object v2 = ((java.util.zip.ZipEntry)v1).getCrc();
    org.junit.Assert.assertEquals((Object)(-1L), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = "This archives contains unclosed entries.";
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(((java.lang.String)v0));
    Object v2 = ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v1).clone();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = "Stream has already been finis1ed";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = ".svgz";
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(((java.io.File)v1),((java.lang.String)v2));
    Object v4 = ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v3).getCentralDirectoryExtra();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = "Truncated ZIP entry: ";
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v0));
    Object v2 = ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v1).clone();
    Object v3 = 48L;
    Object v4 = java.util.concurrent.TimeUnit.MINUTES;
    Object v5 = java.nio.file.attribute.FileTime.from((((java.lang.Long)v3).longValue()),((java.util.concurrent.TimeUnit)v4));
    Object v6 = ((java.util.zip.ZipEntry)v2).setLastAccessTime(((java.nio.file.attribute.FileTime)v5));
    Object v7 = new byte[]{Byte.valueOf((byte)-9),Byte.valueOf((byte)110),Byte.valueOf((byte)-40)};
    Object v8 = new org.apache.commons.compress.archivers.zip.ZipShort(((byte[])v7));
    Object v9 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.createExtraField(((org.apache.commons.compress.archivers.zip.ZipShort)v8));
    ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v6).addExtraField(((org.apache.commons.compress.archivers.zip.ZipExtraField)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = "Truncated ZIP entry: ";
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v0));
    Object v2 = ((java.util.zip.ZipEntry)v1).getTimeLocal();
      org.junit.Assert.fail("Expected java.time.DateTimeException");
    } catch (java.time.DateTimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = "Stream has already been finis1ed";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = ".tar";
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(((java.io.File)v1),((java.lang.String)v2));
    Object v4 = 48L;
    Object v5 = java.util.concurrent.TimeUnit.MINUTES;
    Object v6 = java.nio.file.attribute.FileTime.from((((java.lang.Long)v4).longValue()),((java.util.concurrent.TimeUnit)v5));
    Object v7 = ((java.nio.file.attribute.FileTime)v6).toString();
    Object v8 = ((java.util.zip.ZipEntry)v3).setLastModifiedTime(((java.nio.file.attribute.FileTime)v6));
    Object v9 = new org.apache.commons.compress.archivers.zip.ZipExtraField[]{null,null,null};
    ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v8).setExtraFields(((org.apache.commons.compress.archivers.zip.ZipExtraField[])v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = "Stream has already been finis1ed";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = ".tar";
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(((java.io.File)v1),((java.lang.String)v2));
    Object v4 = 48L;
    Object v5 = java.util.concurrent.TimeUnit.MINUTES;
    Object v6 = java.nio.file.attribute.FileTime.from((((java.lang.Long)v4).longValue()),((java.util.concurrent.TimeUnit)v5));
    Object v7 = java.util.concurrent.TimeUnit.MINUTES;
    Object v8 = ((java.nio.file.attribute.FileTime)v6).to(((java.util.concurrent.TimeUnit)v7));
    Object v9 = ((java.util.zip.ZipEntry)v3).setLastModifiedTime(((java.nio.file.attribute.FileTime)v6));
    Object v10 = ((java.util.zip.ZipEntry)v9).getTime();
    org.junit.Assert.assertEquals((Object)(2880000L), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = "This archives contains unclosed entries.";
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(((java.lang.String)v0));
    Object v2 = ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v1).clone();
    Object v3 = new byte[]{Byte.valueOf((byte)-9),Byte.valueOf((byte)110),Byte.valueOf((byte)-40)};
    Object v4 = new org.apache.commons.compress.archivers.zip.ZipShort(((byte[])v3));
    Object v5 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.createExtraField(((org.apache.commons.compress.archivers.zip.ZipShort)v4));
    Object v6 = ((org.apache.commons.compress.archivers.zip.ZipExtraField)v5).getCentralDirectoryData();
    ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v2).addExtraField(((org.apache.commons.compress.archivers.zip.ZipExtraField)v5));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = "Stream has already been finis1ed";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = "ustar\u0000";
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(((java.io.File)v1),((java.lang.String)v2));
    Object v4 = 46;
    ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v3).setInternalAttributes((((java.lang.Integer)v4).intValue()));
    Object v5 = null;
    Object v6 = ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v3).getUnixMode();
    org.junit.Assert.assertEquals((Object)(0), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = "Stream has already been finis1ed";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = "ustar\u0000";
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(((java.io.File)v1),((java.lang.String)v2));
    Object v4 = new byte[]{Byte.valueOf((byte)-9),Byte.valueOf((byte)110),Byte.valueOf((byte)-40)};
    Object v5 = new org.apache.commons.compress.archivers.zip.ZipShort(((byte[])v4));
    Object v6 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.createExtraField(((org.apache.commons.compress.archivers.zip.ZipShort)v5));
    ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v3).addExtraField(((org.apache.commons.compress.archivers.zip.ZipExtraField)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = "This archives contains unclosed entries.";
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(((java.lang.String)v0));
    Object v2 = 0;
    Object v3 = java.time.Month.JUNE;
    Object v4 = 28;
    Object v5 = 1;
    Object v6 = 28;
    Object v7 = java.time.LocalDateTime.of((((java.lang.Integer)v2).intValue()),((java.time.Month)v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    ((java.util.zip.ZipEntry)v1).setTimeLocal(((java.time.LocalDateTime)v7));
    Object v8 = null;
    Object v9 = 0;
    ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v1).setMethod((((java.lang.Integer)v9).intValue()));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = "This archives contains unclosed entries.";
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(((java.lang.String)v0));
    Object v2 = ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v1).getPlatform();
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = "This archives contains unclosed entries.";
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(((java.lang.String)v0));
    Object v2 = ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v1).clone();
    Object v3 = 6;
    ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v2).setInternalAttributes((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    Object v5 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)87)};
    ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v2).setExtra(((byte[])v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = "Truncated ZIP entry: ";
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v0));
    Object v2 = ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v1).clone();
    Object v3 = 48L;
    Object v4 = java.util.concurrent.TimeUnit.MINUTES;
    Object v5 = java.nio.file.attribute.FileTime.from((((java.lang.Long)v3).longValue()),((java.util.concurrent.TimeUnit)v4));
    Object v6 = ((java.util.zip.ZipEntry)v2).setLastAccessTime(((java.nio.file.attribute.FileTime)v5));
    Object v7 = 0;
    ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v6).setUnixMode((((java.lang.Integer)v7).intValue()));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }
}
