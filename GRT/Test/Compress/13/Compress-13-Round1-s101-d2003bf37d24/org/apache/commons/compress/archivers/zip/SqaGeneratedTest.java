package org.apache.commons.compress.archivers.zip;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = "UTF8";
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v0));
    Object v2 = -36;
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipShort((((java.lang.Integer)v2).intValue()));
    ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v1).removeExtraField(((org.apache.commons.compress.archivers.zip.ZipShort)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = "UTF8";
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v0));
    Object v2 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
    Object v3 = ((org.apache.commons.compress.archivers.zip.ZipExtraField)v2).getHeaderId();
    ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v1).addAsFirstExtraField(((org.apache.commons.compress.archivers.zip.ZipExtraField)v2));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = "UTF8";
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v0));
    Object v2 = ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v1).getRawName();
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = "UTF8";
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v0));
    Object v2 = 1;
    Object v3 = java.time.ZoneOffset.ofTotalSeconds((((java.lang.Integer)v2).intValue()));
    Object v4 = java.time.ZoneId.from(((java.time.temporal.TemporalAccessor)v3));
    Object v5 = java.time.LocalDateTime.now(((java.time.ZoneId)v4));
    ((java.util.zip.ZipEntry)v1).setTimeLocal(((java.time.LocalDateTime)v5));
    Object v6 = null;
    Object v7 = ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v1).isDirectory();
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = "UTF8";
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v0));
    ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v1).removeUnparseableExtraFieldData();
    Object v2 = null;
      org.junit.Assert.fail("Expected java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = "UTF8";
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v0));
    Object v2 = 49L;
    ((java.util.zip.ZipEntry)v1).setCrc((((java.lang.Long)v2).longValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = "UTF8";
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v0));
    Object v2 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
    ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v1).addExtraField(((org.apache.commons.compress.archivers.zip.ZipExtraField)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = "UTF8";
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v0));
    Object v2 = ((java.util.zip.ZipEntry)v1).getTime();
    org.junit.Assert.assertEquals((Object)(-1L), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = "UTF8";
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v0));
    Object v2 = 38L;
    ((java.util.zip.ZipEntry)v1).setTime((((java.lang.Long)v2).longValue()));
    Object v3 = null;
    Object v4 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = "UTF8";
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v0));
    Object v2 = ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v1).getLocalFileDataExtra();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = "UTF8";
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v0));
    Object v2 = "";
    ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v1).setName(((java.lang.String)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = "UTF8";
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v0));
    Object v2 = ((java.util.zip.ZipEntry)v1).getTimeLocal();
      org.junit.Assert.fail("Expected java.time.DateTimeException");
    } catch (java.time.DateTimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = "UTF8";
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v0));
    Object v2 = ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v1).isDirectory();
    Object v3 = 1;
    Object v4 = java.time.ZoneOffset.ofTotalSeconds((((java.lang.Integer)v3).intValue()));
    Object v5 = ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v1).equals(((java.lang.Object)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = "UTF8";
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v0));
    Object v2 = -36;
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipShort((((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v1).getExtraField(((org.apache.commons.compress.archivers.zip.ZipShort)v3));
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = "UTF8";
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v0));
    Object v2 = -20;
    ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v1).setInternalAttributes((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = "UTF8";
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v0));
    Object v2 = ((java.util.zip.ZipEntry)v1).getLastModifiedTime();
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = "UTF8";
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v0));
    Object v2 = 32L;
    Object v3 = java.time.Instant.ofEpochMilli((((java.lang.Long)v2).longValue()));
    Object v4 = java.nio.file.attribute.FileTime.from(((java.time.Instant)v3));
    Object v5 = ((java.util.zip.ZipEntry)v1).setLastModifiedTime(((java.nio.file.attribute.FileTime)v4));
    Object v6 = new org.apache.commons.compress.archivers.zip.ZipExtraField[]{null};
    ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v1).setExtraFields(((org.apache.commons.compress.archivers.zip.ZipExtraField[])v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = null;
    Object v1 = "u";
    Object v2 = new java.io.File(((java.io.File)v0),((java.lang.String)v1));
    Object v3 = "VOCKET";
    Object v4 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(((java.io.File)v2),((java.lang.String)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = null;
    Object v1 = "u";
    Object v2 = new java.io.File(((java.io.File)v0),((java.lang.String)v1));
    Object v3 = "VOCKET";
    Object v4 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(((java.io.File)v2),((java.lang.String)v3));
    Object v5 = ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v4).getUnixMode();
    org.junit.Assert.assertEquals((Object)(0), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = "UTF8";
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v0));
    Object v2 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
    Object v3 = ((org.apache.commons.compress.archivers.zip.ZipExtraField)v2).getLocalFileDataData();
    ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v1).addExtraField(((org.apache.commons.compress.archivers.zip.ZipExtraField)v2));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = "UTF8";
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v0));
    Object v2 = true;
    Object v3 = ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v1).getExtraFields((((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "u";
    Object v2 = new java.io.File(((java.io.File)v0),((java.lang.String)v1));
    Object v3 = "VOCKET";
    Object v4 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(((java.io.File)v2),((java.lang.String)v3));
    Object v5 = 1;
    Object v6 = java.time.ZoneOffset.ofTotalSeconds((((java.lang.Integer)v5).intValue()));
    Object v7 = java.time.ZoneId.from(((java.time.temporal.TemporalAccessor)v6));
    Object v8 = java.time.LocalDateTime.now(((java.time.ZoneId)v7));
    ((java.util.zip.ZipEntry)v4).setTimeLocal(((java.time.LocalDateTime)v8));
    Object v9 = null;
    ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v4).removeUnparseableExtraFieldData();
    Object v10 = null;
      org.junit.Assert.fail("Expected java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = null;
    Object v1 = "u";
    Object v2 = new java.io.File(((java.io.File)v0),((java.lang.String)v1));
    Object v3 = "VOCKET";
    Object v4 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(((java.io.File)v2),((java.lang.String)v3));
    Object v5 = -15;
    ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v4).setPlatform((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = "UTF8";
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v0));
    Object v2 = false;
    Object v3 = ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v1).getExtraFields((((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = null;
    Object v1 = "u";
    Object v2 = new java.io.File(((java.io.File)v0),((java.lang.String)v1));
    Object v3 = "VOCKET";
    Object v4 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(((java.io.File)v2),((java.lang.String)v3));
    Object v5 = ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v4).getName();
    org.junit.Assert.assertEquals((Object)("VOCKET"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = null;
    Object v1 = "u";
    Object v2 = new java.io.File(((java.io.File)v0),((java.lang.String)v1));
    Object v3 = "VOCKET";
    Object v4 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(((java.io.File)v2),((java.lang.String)v3));
    Object v5 = ((java.util.zip.ZipEntry)v4).hashCode();
    Object v6 = ((java.util.zip.ZipEntry)v4).getTime();
    org.junit.Assert.assertEquals((Object)(0L), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = "UTF8";
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v0));
    Object v2 = 2L;
    ((java.util.zip.ZipEntry)v1).setSize((((java.lang.Long)v2).longValue()));
    Object v3 = null;
    Object v4 = 32L;
    Object v5 = java.time.Instant.ofEpochMilli((((java.lang.Long)v4).longValue()));
    Object v6 = java.nio.file.attribute.FileTime.from(((java.time.Instant)v5));
    Object v7 = "UTF8";
    Object v8 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v7));
    Object v9 = true;
    Object v10 = ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v8).getExtraFields((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = ((java.nio.file.attribute.FileTime)v6).equals(((java.lang.Object)v10));
    Object v12 = ((java.util.zip.ZipEntry)v1).setLastModifiedTime(((java.nio.file.attribute.FileTime)v6));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = "UTF8";
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v0));
    Object v2 = 2L;
    ((java.util.zip.ZipEntry)v1).setSize((((java.lang.Long)v2).longValue()));
    Object v3 = null;
    Object v4 = 32L;
    Object v5 = java.time.Instant.ofEpochMilli((((java.lang.Long)v4).longValue()));
    Object v6 = java.nio.file.attribute.FileTime.from(((java.time.Instant)v5));
    Object v7 = "UTF8";
    Object v8 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v7));
    Object v9 = true;
    Object v10 = ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v8).getExtraFields((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = ((java.nio.file.attribute.FileTime)v6).equals(((java.lang.Object)v10));
    Object v12 = ((java.util.zip.ZipEntry)v1).setLastModifiedTime(((java.nio.file.attribute.FileTime)v6));
    Object v13 = -35L;
    ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v12).setExternalAttributes((((java.lang.Long)v13).longValue()));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = "UTF8";
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v0));
    Object v2 = ((java.util.zip.ZipEntry)v1).getLastAccessTime();
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = "UTF8";
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v0));
    Object v2 = 2L;
    ((java.util.zip.ZipEntry)v1).setSize((((java.lang.Long)v2).longValue()));
    Object v3 = null;
    Object v4 = 32L;
    Object v5 = java.time.Instant.ofEpochMilli((((java.lang.Long)v4).longValue()));
    Object v6 = java.nio.file.attribute.FileTime.from(((java.time.Instant)v5));
    Object v7 = "UTF8";
    Object v8 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v7));
    Object v9 = true;
    Object v10 = ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v8).getExtraFields((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = ((java.nio.file.attribute.FileTime)v6).equals(((java.lang.Object)v10));
    Object v12 = ((java.util.zip.ZipEntry)v1).setLastModifiedTime(((java.nio.file.attribute.FileTime)v6));
    Object v13 = 13L;
    ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v12).setSize((((java.lang.Long)v13).longValue()));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = null;
    Object v1 = "u";
    Object v2 = new java.io.File(((java.io.File)v0),((java.lang.String)v1));
    Object v3 = "unexpected endSof stream";
    Object v4 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(((java.io.File)v2),((java.lang.String)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = "UTF8";
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v0));
    Object v2 = 2L;
    ((java.util.zip.ZipEntry)v1).setSize((((java.lang.Long)v2).longValue()));
    Object v3 = null;
    Object v4 = 32L;
    Object v5 = java.time.Instant.ofEpochMilli((((java.lang.Long)v4).longValue()));
    Object v6 = java.nio.file.attribute.FileTime.from(((java.time.Instant)v5));
    Object v7 = "UTF8";
    Object v8 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v7));
    Object v9 = true;
    Object v10 = ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v8).getExtraFields((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = ((java.nio.file.attribute.FileTime)v6).equals(((java.lang.Object)v10));
    Object v12 = ((java.util.zip.ZipEntry)v1).setLastModifiedTime(((java.nio.file.attribute.FileTime)v6));
    Object v13 = new byte[]{Byte.valueOf((byte)49),Byte.valueOf((byte)0),Byte.valueOf((byte)-2)};
    ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v12).setExtra(((byte[])v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = "UTF8";
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v0));
    Object v2 = 2L;
    ((java.util.zip.ZipEntry)v1).setSize((((java.lang.Long)v2).longValue()));
    Object v3 = null;
    Object v4 = 32L;
    Object v5 = java.time.Instant.ofEpochMilli((((java.lang.Long)v4).longValue()));
    Object v6 = java.nio.file.attribute.FileTime.from(((java.time.Instant)v5));
    Object v7 = "UTF8";
    Object v8 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v7));
    Object v9 = true;
    Object v10 = ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v8).getExtraFields((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = ((java.nio.file.attribute.FileTime)v6).equals(((java.lang.Object)v10));
    Object v12 = ((java.util.zip.ZipEntry)v1).setLastModifiedTime(((java.nio.file.attribute.FileTime)v6));
    Object v13 = 1;
    Object v14 = java.time.ZoneOffset.ofTotalSeconds((((java.lang.Integer)v13).intValue()));
    Object v15 = java.time.ZoneId.from(((java.time.temporal.TemporalAccessor)v14));
    Object v16 = java.time.LocalDateTime.now(((java.time.ZoneId)v15));
    ((java.util.zip.ZipEntry)v12).setTimeLocal(((java.time.LocalDateTime)v16));
    Object v17 = null;
    Object v18 = -36;
    Object v19 = new org.apache.commons.compress.archivers.zip.ZipShort((((java.lang.Integer)v18).intValue()));
    ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v12).removeExtraField(((org.apache.commons.compress.archivers.zip.ZipShort)v19));
    Object v20 = null;
      org.junit.Assert.fail("Expected java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = "UTF8";
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v0));
    Object v2 = ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v1).getName();
    org.junit.Assert.assertEquals((Object)("UTF8"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = "UTF8";
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v0));
    Object v2 = 10L;
    ((java.util.zip.ZipEntry)v1).setCrc((((java.lang.Long)v2).longValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = "UTF8";
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v0));
    Object v2 = 1L;
    ((java.util.zip.ZipEntry)v1).setTime((((java.lang.Long)v2).longValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = null;
    Object v1 = "u";
    Object v2 = new java.io.File(((java.io.File)v0),((java.lang.String)v1));
    Object v3 = "unexpected endSof stream";
    Object v4 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(((java.io.File)v2),((java.lang.String)v3));
    Object v5 = "Stream has already been finished";
    ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v4).setName(((java.lang.String)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = "UTF8";
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v0));
    Object v2 = 2L;
    ((java.util.zip.ZipEntry)v1).setSize((((java.lang.Long)v2).longValue()));
    Object v3 = null;
    Object v4 = 32L;
    Object v5 = java.time.Instant.ofEpochMilli((((java.lang.Long)v4).longValue()));
    Object v6 = java.nio.file.attribute.FileTime.from(((java.time.Instant)v5));
    Object v7 = "UTF8";
    Object v8 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v7));
    Object v9 = true;
    Object v10 = ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v8).getExtraFields((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = ((java.nio.file.attribute.FileTime)v6).equals(((java.lang.Object)v10));
    Object v12 = ((java.util.zip.ZipEntry)v1).setLastModifiedTime(((java.nio.file.attribute.FileTime)v6));
    Object v13 = 53L;
    ((java.util.zip.ZipEntry)v12).setTime((((java.lang.Long)v13).longValue()));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = "UTF8";
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v0));
    Object v2 = 32L;
    Object v3 = java.time.Instant.ofEpochMilli((((java.lang.Long)v2).longValue()));
    Object v4 = java.nio.file.attribute.FileTime.from(((java.time.Instant)v3));
    Object v5 = ((java.util.zip.ZipEntry)v1).setCreationTime(((java.nio.file.attribute.FileTime)v4));
    Object v6 = ((java.util.zip.ZipEntry)v1).getComment();
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = null;
    Object v1 = "u";
    Object v2 = new java.io.File(((java.io.File)v0),((java.lang.String)v1));
    Object v3 = "VOCKET";
    Object v4 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(((java.io.File)v2),((java.lang.String)v3));
    Object v5 = ((java.util.zip.ZipEntry)v4).getLastModifiedTime();
    Object v6 = -36;
    Object v7 = new org.apache.commons.compress.archivers.zip.ZipShort((((java.lang.Integer)v6).intValue()));
    Object v8 = ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v4).getExtraField(((org.apache.commons.compress.archivers.zip.ZipShort)v7));
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = "UTF8";
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v0));
    Object v2 = 2L;
    ((java.util.zip.ZipEntry)v1).setSize((((java.lang.Long)v2).longValue()));
    Object v3 = null;
    Object v4 = 32L;
    Object v5 = java.time.Instant.ofEpochMilli((((java.lang.Long)v4).longValue()));
    Object v6 = java.nio.file.attribute.FileTime.from(((java.time.Instant)v5));
    Object v7 = "UTF8";
    Object v8 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v7));
    Object v9 = true;
    Object v10 = ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v8).getExtraFields((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = ((java.nio.file.attribute.FileTime)v6).equals(((java.lang.Object)v10));
    Object v12 = ((java.util.zip.ZipEntry)v1).setLastModifiedTime(((java.nio.file.attribute.FileTime)v6));
    Object v13 = -9L;
    ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v12).setSize((((java.lang.Long)v13).longValue()));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = null;
    Object v1 = "u";
    Object v2 = new java.io.File(((java.io.File)v0),((java.lang.String)v1));
    Object v3 = "VOCKET";
    Object v4 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(((java.io.File)v2),((java.lang.String)v3));
    Object v5 = ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v4).getUnparseableExtraFieldData();
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = "UTF8";
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v0));
    Object v2 = 2L;
    ((java.util.zip.ZipEntry)v1).setSize((((java.lang.Long)v2).longValue()));
    Object v3 = null;
    Object v4 = 32L;
    Object v5 = java.time.Instant.ofEpochMilli((((java.lang.Long)v4).longValue()));
    Object v6 = java.nio.file.attribute.FileTime.from(((java.time.Instant)v5));
    Object v7 = "UTF8";
    Object v8 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v7));
    Object v9 = true;
    Object v10 = ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v8).getExtraFields((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = ((java.nio.file.attribute.FileTime)v6).equals(((java.lang.Object)v10));
    Object v12 = ((java.util.zip.ZipEntry)v1).setLastModifiedTime(((java.nio.file.attribute.FileTime)v6));
    Object v13 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(((java.util.zip.ZipEntry)v12));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = "UTF8";
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v0));
    Object v2 = ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v1).getPlatform();
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "u";
    Object v2 = new java.io.File(((java.io.File)v0),((java.lang.String)v1));
    Object v3 = "VOCKET";
    Object v4 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(((java.io.File)v2),((java.lang.String)v3));
    Object v5 = new org.apache.commons.compress.archivers.zip.GeneralPurposeBit();
    ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v4).setGeneralPurposeBit(((org.apache.commons.compress.archivers.zip.GeneralPurposeBit)v5));
    Object v6 = null;
    Object v7 = new org.apache.commons.compress.archivers.zip.ZipExtraField[]{null};
    ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v4).setExtraFields(((org.apache.commons.compress.archivers.zip.ZipExtraField[])v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = "UTF8";
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v0));
    Object v2 = 2L;
    ((java.util.zip.ZipEntry)v1).setSize((((java.lang.Long)v2).longValue()));
    Object v3 = null;
    Object v4 = 32L;
    Object v5 = java.time.Instant.ofEpochMilli((((java.lang.Long)v4).longValue()));
    Object v6 = java.nio.file.attribute.FileTime.from(((java.time.Instant)v5));
    Object v7 = "UTF8";
    Object v8 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v7));
    Object v9 = true;
    Object v10 = ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v8).getExtraFields((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = ((java.nio.file.attribute.FileTime)v6).equals(((java.lang.Object)v10));
    Object v12 = ((java.util.zip.ZipEntry)v1).setLastModifiedTime(((java.nio.file.attribute.FileTime)v6));
    Object v13 = 1;
    Object v14 = java.time.ZoneOffset.ofTotalSeconds((((java.lang.Integer)v13).intValue()));
    Object v15 = java.time.ZoneId.from(((java.time.temporal.TemporalAccessor)v14));
    Object v16 = java.time.LocalDateTime.now(((java.time.ZoneId)v15));
    ((java.util.zip.ZipEntry)v12).setTimeLocal(((java.time.LocalDateTime)v16));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = "UTF8";
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v0));
    Object v2 = 32L;
    Object v3 = java.time.Instant.ofEpochMilli((((java.lang.Long)v2).longValue()));
    Object v4 = java.nio.file.attribute.FileTime.from(((java.time.Instant)v3));
    Object v5 = ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v1).equals(((java.lang.Object)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = null;
    Object v1 = "u";
    Object v2 = new java.io.File(((java.io.File)v0),((java.lang.String)v1));
    Object v3 = "unexpected endSof stream";
    Object v4 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(((java.io.File)v2),((java.lang.String)v3));
    Object v5 = 0;
    ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v4).setUnixMode((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "u";
    Object v2 = new java.io.File(((java.io.File)v0),((java.lang.String)v1));
    Object v3 = "VOCKET";
    Object v4 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(((java.io.File)v2),((java.lang.String)v3));
    Object v5 = new org.apache.commons.compress.archivers.zip.ZipExtraField[]{null,null};
    ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v4).setExtraFields(((org.apache.commons.compress.archivers.zip.ZipExtraField[])v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = "UTF8";
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v0));
    Object v2 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(((java.util.zip.ZipEntry)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = "UTF8";
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v0));
    Object v2 = 2L;
    ((java.util.zip.ZipEntry)v1).setSize((((java.lang.Long)v2).longValue()));
    Object v3 = null;
    Object v4 = 32L;
    Object v5 = java.time.Instant.ofEpochMilli((((java.lang.Long)v4).longValue()));
    Object v6 = java.nio.file.attribute.FileTime.from(((java.time.Instant)v5));
    Object v7 = "UTF8";
    Object v8 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v7));
    Object v9 = true;
    Object v10 = ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v8).getExtraFields((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = ((java.nio.file.attribute.FileTime)v6).equals(((java.lang.Object)v10));
    Object v12 = ((java.util.zip.ZipEntry)v1).setLastModifiedTime(((java.nio.file.attribute.FileTime)v6));
    Object v13 = ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v12).getLocalFileDataExtra();
    Object v14 = ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v12).getUnixMode();
    org.junit.Assert.assertEquals((Object)(0), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = null;
    Object v1 = "u";
    Object v2 = new java.io.File(((java.io.File)v0),((java.lang.String)v1));
    Object v3 = "VOCKET";
    Object v4 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(((java.io.File)v2),((java.lang.String)v3));
    Object v5 = ">";
    Object v6 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)-9)};
    ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v4).setName(((java.lang.String)v5),((byte[])v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = "UTF8";
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v0));
    Object v2 = 2L;
    ((java.util.zip.ZipEntry)v1).setSize((((java.lang.Long)v2).longValue()));
    Object v3 = null;
    Object v4 = 32L;
    Object v5 = java.time.Instant.ofEpochMilli((((java.lang.Long)v4).longValue()));
    Object v6 = java.nio.file.attribute.FileTime.from(((java.time.Instant)v5));
    Object v7 = "UTF8";
    Object v8 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v7));
    Object v9 = true;
    Object v10 = ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v8).getExtraFields((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = ((java.nio.file.attribute.FileTime)v6).equals(((java.lang.Object)v10));
    Object v12 = ((java.util.zip.ZipEntry)v1).setLastModifiedTime(((java.nio.file.attribute.FileTime)v6));
    Object v13 = ((java.util.zip.ZipEntry)v12).getLastModifiedTime();
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = "UTF8";
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v0));
    Object v2 = 1;
    ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v1).setInternalAttributes((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    Object v4 = ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v1).getLocalFileDataExtra();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry();
    Object v1 = ((java.util.zip.ZipEntry)v0).isDirectory();
    Object v2 = ((java.util.zip.ZipEntry)v0).getTimeLocal();
      org.junit.Assert.fail("Expected java.time.DateTimeException");
    } catch (java.time.DateTimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = null;
    Object v1 = "u";
    Object v2 = new java.io.File(((java.io.File)v0),((java.lang.String)v1));
    Object v3 = "VOCKET";
    Object v4 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(((java.io.File)v2),((java.lang.String)v3));
    Object v5 = false;
    Object v6 = ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v4).getExtraFields((((java.lang.Boolean)v5).booleanValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = null;
    Object v1 = "u";
    Object v2 = new java.io.File(((java.io.File)v0),((java.lang.String)v1));
    Object v3 = "VOCKET";
    Object v4 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(((java.io.File)v2),((java.lang.String)v3));
    Object v5 = 0;
    ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v4).setUnixMode((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry();
    Object v1 = ((java.util.zip.ZipEntry)v0).getTimeLocal();
      org.junit.Assert.fail("Expected java.time.DateTimeException");
    } catch (java.time.DateTimeException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry();
    Object v1 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
    ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v0).addAsFirstExtraField(((org.apache.commons.compress.archivers.zip.ZipExtraField)v1));
    Object v2 = null;
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry();
    Object v4 = ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v0).equals(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry();
    Object v1 = new org.apache.commons.compress.archivers.zip.GeneralPurposeBit();
    ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v0).setGeneralPurposeBit(((org.apache.commons.compress.archivers.zip.GeneralPurposeBit)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = "UTF8";
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v0));
    Object v2 = 2L;
    ((java.util.zip.ZipEntry)v1).setSize((((java.lang.Long)v2).longValue()));
    Object v3 = null;
    Object v4 = 32L;
    Object v5 = java.time.Instant.ofEpochMilli((((java.lang.Long)v4).longValue()));
    Object v6 = java.nio.file.attribute.FileTime.from(((java.time.Instant)v5));
    Object v7 = "UTF8";
    Object v8 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v7));
    Object v9 = true;
    Object v10 = ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v8).getExtraFields((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = ((java.nio.file.attribute.FileTime)v6).equals(((java.lang.Object)v10));
    Object v12 = ((java.util.zip.ZipEntry)v1).setLastModifiedTime(((java.nio.file.attribute.FileTime)v6));
    Object v13 = ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v12).getSize();
    org.junit.Assert.assertEquals((Object)(2L), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = null;
    Object v1 = "u";
    Object v2 = new java.io.File(((java.io.File)v0),((java.lang.String)v1));
    Object v3 = "VOCKET";
    Object v4 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(((java.io.File)v2),((java.lang.String)v3));
    Object v5 = 51L;
    ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v4).setExternalAttributes((((java.lang.Long)v5).longValue()));
    Object v6 = null;
    Object v7 = ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v4).getLocalFileDataExtra();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry();
    Object v1 = ((java.util.zip.ZipEntry)v0).getTime();
    Object v2 = ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v0).getLocalFileDataExtra();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry();
    ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v0).removeUnparseableExtraFieldData();
    Object v1 = null;
      org.junit.Assert.fail("Expected java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = null;
    Object v1 = "u";
    Object v2 = new java.io.File(((java.io.File)v0),((java.lang.String)v1));
    Object v3 = "^#";
    Object v4 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(((java.io.File)v2),((java.lang.String)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry();
    Object v1 = 1;
    ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v0).setUnixMode((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "u";
    Object v2 = new java.io.File(((java.io.File)v0),((java.lang.String)v1));
    Object v3 = "VOCKET";
    Object v4 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(((java.io.File)v2),((java.lang.String)v3));
    Object v5 = 8L;
    ((java.util.zip.ZipEntry)v4).setTime((((java.lang.Long)v5).longValue()));
    Object v6 = null;
    Object v7 = new org.apache.commons.compress.archivers.zip.ZipExtraField[]{null,null,null};
    ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v4).setExtraFields(((org.apache.commons.compress.archivers.zip.ZipExtraField[])v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry();
    Object v1 = 2L;
    ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v0).setSize((((java.lang.Long)v1).longValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry();
    Object v1 = 32L;
    Object v2 = java.time.Instant.ofEpochMilli((((java.lang.Long)v1).longValue()));
    Object v3 = ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v0).equals(((java.lang.Object)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = null;
    Object v1 = "u";
    Object v2 = new java.io.File(((java.io.File)v0),((java.lang.String)v1));
    Object v3 = "VOCKET";
    Object v4 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(((java.io.File)v2),((java.lang.String)v3));
    Object v5 = 1;
    ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v4).setPlatform((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry();
    Object v1 = ((java.util.zip.ZipEntry)v0).getTime();
    org.junit.Assert.assertEquals((Object)(-1L), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry();
    Object v1 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
    ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v0).addExtraField(((org.apache.commons.compress.archivers.zip.ZipExtraField)v1));
    Object v2 = null;
    ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v0).removeUnparseableExtraFieldData();
    Object v3 = null;
      org.junit.Assert.fail("Expected java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry();
    Object v1 = "UTF8";
    Object v2 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v1));
    Object v3 = 2L;
    ((java.util.zip.ZipEntry)v2).setSize((((java.lang.Long)v3).longValue()));
    Object v4 = null;
    Object v5 = 32L;
    Object v6 = java.time.Instant.ofEpochMilli((((java.lang.Long)v5).longValue()));
    Object v7 = java.nio.file.attribute.FileTime.from(((java.time.Instant)v6));
    Object v8 = "UTF8";
    Object v9 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v8));
    Object v10 = true;
    Object v11 = ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v9).getExtraFields((((java.lang.Boolean)v10).booleanValue()));
    Object v12 = ((java.nio.file.attribute.FileTime)v7).equals(((java.lang.Object)v11));
    Object v13 = ((java.util.zip.ZipEntry)v2).setLastModifiedTime(((java.nio.file.attribute.FileTime)v7));
    Object v14 = ((java.util.zip.ZipEntry)v13).getLastModifiedTime();
    Object v15 = ((java.util.zip.ZipEntry)v0).setCreationTime(((java.nio.file.attribute.FileTime)v14));
    Object v16 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
    ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v0).addAsFirstExtraField(((org.apache.commons.compress.archivers.zip.ZipExtraField)v16));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = "u";
    Object v2 = new java.io.File(((java.io.File)v0),((java.lang.String)v1));
    Object v3 = "^#";
    Object v4 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(((java.io.File)v2),((java.lang.String)v3));
    Object v5 = 32L;
    Object v6 = java.time.Instant.ofEpochMilli((((java.lang.Long)v5).longValue()));
    Object v7 = java.nio.file.attribute.FileTime.from(((java.time.Instant)v6));
    Object v8 = ((java.util.zip.ZipEntry)v4).setCreationTime(((java.nio.file.attribute.FileTime)v7));
    ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v4).removeUnparseableExtraFieldData();
    Object v9 = null;
      org.junit.Assert.fail("Expected java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry();
    Object v1 = false;
    Object v2 = ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v0).getExtraFields((((java.lang.Boolean)v1).booleanValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry();
    Object v1 = ((java.util.zip.ZipEntry)v0).getExtra();
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry();
    Object v1 = 32L;
    Object v2 = java.time.Instant.ofEpochMilli((((java.lang.Long)v1).longValue()));
    Object v3 = java.nio.file.attribute.FileTime.from(((java.time.Instant)v2));
    Object v4 = ((java.util.zip.ZipEntry)v0).setCreationTime(((java.nio.file.attribute.FileTime)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry();
    Object v1 = 3;
    ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v0).setUnixMode((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = 3;
    ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v0).setUnixMode((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry();
    Object v1 = 32L;
    Object v2 = java.time.Instant.ofEpochMilli((((java.lang.Long)v1).longValue()));
    Object v3 = java.nio.file.attribute.FileTime.from(((java.time.Instant)v2));
    Object v4 = ((java.util.zip.ZipEntry)v0).setCreationTime(((java.nio.file.attribute.FileTime)v3));
    Object v5 = ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v4).getRawName();
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry();
    ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v0).setExtra();
    Object v1 = null;
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry();
    Object v1 = -36;
    Object v2 = new org.apache.commons.compress.archivers.zip.ZipShort((((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v0).getExtraField(((org.apache.commons.compress.archivers.zip.ZipShort)v2));
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry();
    Object v1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(((java.util.zip.ZipEntry)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry();
    Object v1 = 1;
    Object v2 = java.time.ZoneOffset.ofTotalSeconds((((java.lang.Integer)v1).intValue()));
    Object v3 = java.time.ZoneId.from(((java.time.temporal.TemporalAccessor)v2));
    Object v4 = java.time.LocalDateTime.now(((java.time.ZoneId)v3));
    ((java.util.zip.ZipEntry)v0).setTimeLocal(((java.time.LocalDateTime)v4));
    Object v5 = null;
    Object v6 = 27L;
    ((java.util.zip.ZipEntry)v0).setTime((((java.lang.Long)v6).longValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = null;
    Object v1 = "u";
    Object v2 = new java.io.File(((java.io.File)v0),((java.lang.String)v1));
    Object v3 = "VOCKET";
    Object v4 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(((java.io.File)v2),((java.lang.String)v3));
    Object v5 = 0;
    ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v4).setMethod((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = null;
    Object v1 = "u";
    Object v2 = new java.io.File(((java.io.File)v0),((java.lang.String)v1));
    Object v3 = ((java.io.File)v2).isHidden();
    Object v4 = "00";
    Object v5 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(((java.io.File)v2),((java.lang.String)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = null;
    Object v1 = "u";
    Object v2 = new java.io.File(((java.io.File)v0),((java.lang.String)v1));
    Object v3 = ((java.io.File)v2).isHidden();
    Object v4 = "00";
    Object v5 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(((java.io.File)v2),((java.lang.String)v4));
    Object v6 = ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v5).isDirectory();
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry();
    Object v1 = ((java.util.zip.ZipEntry)v0).getLastAccessTime();
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry();
    Object v1 = 32L;
    Object v2 = java.time.Instant.ofEpochMilli((((java.lang.Long)v1).longValue()));
    Object v3 = java.nio.file.attribute.FileTime.from(((java.time.Instant)v2));
    Object v4 = ((java.util.zip.ZipEntry)v0).setCreationTime(((java.nio.file.attribute.FileTime)v3));
    Object v5 = 4095;
    ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v4).setInternalAttributes((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    Object v7 = ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v4).hashCode();
    org.junit.Assert.assertEquals((Object)(0), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = null;
    Object v1 = "u";
    Object v2 = new java.io.File(((java.io.File)v0),((java.lang.String)v1));
    Object v3 = "VOCKET";
    Object v4 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(((java.io.File)v2),((java.lang.String)v3));
    Object v5 = ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v4).getRawName();
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry();
    Object v1 = new byte[]{};
    ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v0).setCentralDirectoryExtra(((byte[])v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry();
    Object v1 = ((java.util.zip.ZipEntry)v0).getTime();
    Object v2 = 1;
    Object v3 = java.time.ZoneOffset.ofTotalSeconds((((java.lang.Integer)v2).intValue()));
    Object v4 = java.time.ZoneId.from(((java.time.temporal.TemporalAccessor)v3));
    Object v5 = java.time.LocalDateTime.now(((java.time.ZoneId)v4));
    Object v6 = ((java.time.LocalDateTime)v5).toString();
    ((java.util.zip.ZipEntry)v0).setTimeLocal(((java.time.LocalDateTime)v5));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry();
    Object v1 = -8;
    ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v0).setMethod((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry();
    Object v1 = ((java.util.zip.ZipEntry)v0).getTime();
    Object v2 = new byte[]{};
    ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v0).setCentralDirectoryExtra(((byte[])v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry();
    Object v1 = -15L;
    ((java.util.zip.ZipEntry)v0).setTime((((java.lang.Long)v1).longValue()));
    Object v2 = null;
    Object v3 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(((java.util.zip.ZipEntry)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = "UTF8";
    Object v1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v0));
    Object v2 = 2L;
    ((java.util.zip.ZipEntry)v1).setSize((((java.lang.Long)v2).longValue()));
    Object v3 = null;
    Object v4 = 32L;
    Object v5 = java.time.Instant.ofEpochMilli((((java.lang.Long)v4).longValue()));
    Object v6 = java.nio.file.attribute.FileTime.from(((java.time.Instant)v5));
    Object v7 = "UTF8";
    Object v8 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v7));
    Object v9 = true;
    Object v10 = ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v8).getExtraFields((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = ((java.nio.file.attribute.FileTime)v6).equals(((java.lang.Object)v10));
    Object v12 = ((java.util.zip.ZipEntry)v1).setLastModifiedTime(((java.nio.file.attribute.FileTime)v6));
    Object v13 = ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v12).getCentralDirectoryExtra();
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = null;
    Object v1 = "u";
    Object v2 = new java.io.File(((java.io.File)v0),((java.lang.String)v1));
    Object v3 = "^#";
    Object v4 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(((java.io.File)v2),((java.lang.String)v3));
    Object v5 = "UTF8";
    Object v6 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(((java.lang.String)v5));
    Object v7 = false;
    Object v8 = ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v6).getExtraFields((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v4).equals(((java.lang.Object)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry();
    Object v1 = -36;
    Object v2 = new org.apache.commons.compress.archivers.zip.ZipShort((((java.lang.Integer)v1).intValue()));
    ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v0).removeExtraField(((org.apache.commons.compress.archivers.zip.ZipShort)v2));
    Object v3 = null;
      org.junit.Assert.fail("Expected java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry();
    Object v1 = 32L;
    Object v2 = java.time.Instant.ofEpochMilli((((java.lang.Long)v1).longValue()));
    Object v3 = java.nio.file.attribute.FileTime.from(((java.time.Instant)v2));
    Object v4 = ((java.util.zip.ZipEntry)v0).setCreationTime(((java.nio.file.attribute.FileTime)v3));
    Object v5 = 50L;
    ((java.util.zip.ZipEntry)v4).setTime((((java.lang.Long)v5).longValue()));
    Object v6 = null;
    Object v7 = ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v4).getExtraFields();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry();
    Object v1 = ((org.apache.commons.compress.archivers.zip.ZipArchiveEntry)v0).getLastModifiedDate();
    org.junit.Assert.assertNotNull(v1);
  }
}
